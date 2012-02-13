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

package com.Post.RPStuff.Blocks.CustomBlocks;

import com.Post.RPStuff.RPStuff;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.player.SpoutPlayer;

public class PortUp extends RPCustomBlock {

    @SuppressWarnings("unused")
    private RPStuff p;
    private static int[] ids = {8, 8, 8, 8, 8, 8};

    public PortUp(RPStuff plugin) {
        super(plugin, "PortUp", ids);
        this.p = plugin;
        this.setItemDrop(new SpoutItemStack(this.getBlockItem(), 1));
    }

    @Override
    public boolean onBlockInteract(World arg0, int arg1, int arg2, int arg3,
                                   SpoutPlayer arg4) {
        // TODO Auto-generated method stub
        for (int i = arg2 + 1; i < 127; i++) {
            Block b = arg0.getBlockAt(arg1, i, arg3);
            Block b2 = arg0.getBlockAt(arg1, i + 1, arg3);
            Block b3 = arg0.getBlockAt(arg1, i + 2, arg3);
            if (b.getTypeId() != 0 && b2.getTypeId() == 0 && b3.getTypeId() == 0) {
                arg4.teleport(new Location(arg0, arg1, i + 1, arg3));
                return true;
            }
        }
        return true;
    }

}
