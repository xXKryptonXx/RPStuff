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

package com.Post.RPStuff.Blocks.Saplings;

import com.Post.RPStuff.Blocks.Saplings.Delays.AppleTreeDelay;
import com.Post.RPStuff.RPStuff;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Dye;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.player.SpoutPlayer;

public class AppleSapling extends RPSapling {

    static int[] ids = {0, 1, 1, 1, 1, 0};
    RPStuff p;
    AppleTreeDelay adel;

    public AppleSapling(RPStuff plugin) {
        super(plugin, "Appletreesapling", new EmptySaplingDesign(plugin, ids));
        this.p = plugin;
        this.setItemDrop(new SpoutItemStack(this.getBlockItem(), 1));
    }

    @Override
    public boolean onBlockInteract(World arg0, int arg1, int arg2, int arg3,
                                   SpoutPlayer arg4) {
        Location loc = new Location(arg0, arg1, arg2, arg3);
        Dye d = new Dye();
        d.setColor(DyeColor.WHITE);
        // TODO Auto-generated method stub
        Block below = loc.getWorld().getBlockAt(loc.getBlockX(), loc.getBlockY() - 1, loc.getBlockZ());
        if (arg4.getItemInHand().getType() == d.toItemStack().getType()) {
            if (arg4.getItemInHand().getAmount() == 1) {
                arg4.setItemInHand(new ItemStack(0, 0));
            } else {
                arg4.getItemInHand().setAmount(arg4.getItemInHand().getAmount() - 1);
            }
            if (below.getTypeId() == 2 || below.getTypeId() == 3) {
                adel = new AppleTreeDelay(p, loc);
                adel.run();
            } else {
                SpoutManager.getMaterialManager().removeBlockOverride(loc.getBlock());
                loc.getBlock().setTypeId(0);
            }
        }
        return false;
    }
}
