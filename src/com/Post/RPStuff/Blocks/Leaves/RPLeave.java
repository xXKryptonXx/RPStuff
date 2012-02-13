/*
 * Copyright (c) <2012> <xXKryptonXx>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.Post.RPStuff.Blocks.Leaves;

import com.Post.RPStuff.RPStuff;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class RPLeave extends GenericCubeCustomBlock {

    public RPLeave(RPStuff plugin, String name, int id) {
        super(plugin, name, false, new GenericCubeBlockDesign(plugin, plugin.TreeTex, id));
        this.getBlockDesign().setMinBrightness(0.1F).setMaxBrightness(1).setBrightness(0);
        this.setHardness(0.2F);
    }

    @Override
    public boolean isIndirectlyProvidingPowerTo(World arg0, int arg1, int arg2,
                                                int arg3, BlockFace arg4) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isProvidingPowerTo(World arg0, int arg1, int arg2, int arg3,
                                      BlockFace arg4) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void onBlockClicked(World arg0, int arg1, int arg2, int arg3,
                               SpoutPlayer arg4) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onBlockDestroyed(World arg0, int arg1, int arg2, int arg3) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean onBlockInteract(World arg0, int arg1, int arg2, int arg3,
                                   SpoutPlayer arg4) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void onBlockPlace(World arg0, int arg1, int arg2, int arg3) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onBlockPlace(World arg0, int arg1, int arg2, int arg3,
                             LivingEntity arg4) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onEntityMoveAt(World arg0, int arg1, int arg2, int arg3,
                               Entity arg4) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onNeighborBlockChange(World arg0, int arg1, int arg2, int arg3,
                                      int arg4) {
        // TODO Auto-generated method stub

    }

}
