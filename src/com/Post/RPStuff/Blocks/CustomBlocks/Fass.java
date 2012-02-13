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
import org.bukkit.World;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.player.SpoutPlayer;

public class Fass extends RPCustomBlock {

    @SuppressWarnings("unused")
    private RPStuff p;
    private static int[] ids = {32, 33, 33, 33, 33, 34};

    public Fass(RPStuff plugin) {
        super(plugin, "Fass", ids);
        this.p = plugin;
        this.setItemDrop(null);
    }

    @Override
    public boolean onBlockInteract(World arg0, int arg1, int arg2, int arg3,
                                   SpoutPlayer arg4) {
        // TODO Auto-generated method stub
        if (arg4.getItemInHand().getTypeId() == 325) {
            arg4.setItemInHand(new ItemStack(326, 1));
        }
        return false;
    }

}
