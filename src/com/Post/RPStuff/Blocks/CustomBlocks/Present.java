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
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.player.SpoutPlayer;

import java.util.Random;

public class Present extends RPCustomBlock {

    @SuppressWarnings("unused")
    private RPStuff p;
    private static int[] ids = {48, 49, 49, 49, 49, 50};

    public Present(RPStuff plugin) {
        super(plugin, "Geschenk", ids);
        this.p = plugin;
        this.setItemDrop(new SpoutItemStack(this.getBlockItem(), 1));
    }

    @Override
    public boolean onBlockInteract(World arg0, int arg1, int arg2, int arg3,
                                   SpoutPlayer arg4) {
        // TODO Auto-generated method stub
        final Location loc = new Location(arg0, arg1, arg2, arg3);
        SpoutManager.getMaterialManager().removeBlockOverride(loc.getBlock());
        arg0.getBlockAt(arg1, arg2, arg3).setTypeId(0);
        Random rnd = new Random();
        int choice = rnd.nextInt(100);

        if (choice == 43) {
            arg0.dropItemNaturally(new Location(arg0, arg1, arg2, arg3), new ItemStack(Material.DIAMOND, 1));
        }
        if (choice <= 12) {
            arg0.dropItemNaturally(new Location(arg0, arg1, arg2, arg3), new ItemStack(Material.IRON_INGOT, 2));
        }
        if (choice <= 32) {
            arg0.dropItemNaturally(new Location(arg0, arg1, arg2, arg3), new ItemStack(Material.COAL, 5));
        }
        if (choice <= 42) {
            arg0.dropItemNaturally(new Location(arg0, arg1, arg2, arg3), new ItemStack(Material.APPLE, 4));
        }
        if (choice <= 50) {
            arg0.dropItemNaturally(new Location(arg0, arg1, arg2, arg3), new ItemStack(Material.LAPIS_BLOCK, 1));
        }
        if (choice <= 60) {
            arg0.dropItemNaturally(new Location(arg0, arg1, arg2, arg3), new ItemStack(Material.BOOKSHELF, 2));
        }
        if (choice <= 70) {
            arg0.dropItemNaturally(new Location(arg0, arg1, arg2, arg3), new ItemStack(Material.COOKED_FISH, 4));
        }
        if (choice <= 80) {
            arg0.dropItemNaturally(new Location(arg0, arg1, arg2, arg3), new ItemStack(Material.FISHING_ROD, 1));
        }
        if (choice <= 90) {
            arg0.dropItemNaturally(new Location(arg0, arg1, arg2, arg3), new ItemStack(Material.SADDLE, 1));
        }
        if (choice <= 99) {
            arg0.dropItemNaturally(new Location(arg0, arg1, arg2, arg3), new ItemStack(Material.CAKE, 1));
        }
        if (choice == 100) {
            arg0.dropItemNaturally(new Location(arg0, arg1, arg2, arg3), new ItemStack(Material.SLIME_BALL, 4));
        }
        return false;
    }

}
