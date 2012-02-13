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

package com.Post.RPStuff.Generators;

import com.Post.RPStuff.Blocks.Leaves.RPLeave;
import com.Post.RPStuff.Blocks.Logs.RPLog;
import com.Post.RPStuff.Blocks.Saplings.RPSapling;
import com.Post.RPStuff.RPStuff;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.MaterialManager;

public class TreeGen {
    private MaterialManager mm = SpoutManager.getMaterialManager();
    final RPStuff p;
    final Location loc;
    final RPLog log;
    final RPLeave leav;
    final RPSapling sap;

    public TreeGen(RPStuff p, Location loc, RPLog log, RPLeave leav, RPSapling sap) {
        this.p = p;
        this.loc = loc;
        this.log = log;
        this.leav = leav;
        this.sap = sap;
    }

    public void GenTree() {
        Block b = loc.getBlock();
        int x = loc.getBlockX();
        int y = loc.getBlockY();
        int z = loc.getBlockZ();
        World w = loc.getWorld();
        if (!(b.getTypeId() == sap.getBlockId())) {
            return;
        }
        mm.removeBlockOverride(loc.getBlock());
        loc.getBlock().setTypeId(0);
        for (int yi = y; yi < y + 7; yi++) {
            if (yi == y) {
                mm.overrideBlock(w.getBlockAt(x, yi, z), log);
                //mm.overrideBlock(w.getBlockAt(loc), log);
            } else if (yi == y + 3) {
                mm.overrideBlock(w.getBlockAt(x, yi, z), log);
                mm.overrideBlock(w.getBlockAt(x + 1, yi, z), leav);
                mm.overrideBlock(w.getBlockAt(x + 1, yi, z + 1), leav);
                mm.overrideBlock(w.getBlockAt(x + 1, yi, z - 1), leav);
                mm.overrideBlock(w.getBlockAt(x + 2, yi, z), leav);
                mm.overrideBlock(w.getBlockAt(x + 2, yi, z + 1), leav);
                mm.overrideBlock(w.getBlockAt(x + 2, yi, z - 1), leav);
                mm.overrideBlock(w.getBlockAt(x - 1, yi, z), leav);
                mm.overrideBlock(w.getBlockAt(x - 1, yi, z + 1), leav);
                mm.overrideBlock(w.getBlockAt(x - 1, yi, z - 1), leav);
                mm.overrideBlock(w.getBlockAt(x - 2, yi, z), leav);
                mm.overrideBlock(w.getBlockAt(x - 2, yi, z + 1), leav);
                mm.overrideBlock(w.getBlockAt(x - 2, yi, z - 1), leav);
                mm.overrideBlock(w.getBlockAt(x, yi, z + 1), leav);
                mm.overrideBlock(w.getBlockAt(x, yi, z - 1), leav);
                mm.overrideBlock(w.getBlockAt(x, yi, z + 2), leav);
                mm.overrideBlock(w.getBlockAt(x + 1, yi, z + 2), leav);
                mm.overrideBlock(w.getBlockAt(x - 1, yi, z + 2), leav);
                mm.overrideBlock(w.getBlockAt(x, yi, z - 2), leav);
                mm.overrideBlock(w.getBlockAt(x + 1, yi, z - 2), leav);
                mm.overrideBlock(w.getBlockAt(x - 1, yi, z - 2), leav);
                mm.overrideBlock(w.getBlockAt(x - 2, yi, z - 2), leav);
            } else if (yi == y + 4) {
                mm.overrideBlock(w.getBlockAt(x, yi, z), log);
                mm.overrideBlock(w.getBlockAt(x + 1, yi, z), leav);
                mm.overrideBlock(w.getBlockAt(x + 1, yi, z + 1), leav);
                mm.overrideBlock(w.getBlockAt(x + 1, yi, z - 1), leav);
                mm.overrideBlock(w.getBlockAt(x + 2, yi, z), leav);
                mm.overrideBlock(w.getBlockAt(x + 2, yi, z + 1), leav);
                mm.overrideBlock(w.getBlockAt(x + 2, yi, z - 1), leav);
                mm.overrideBlock(w.getBlockAt(x - 1, yi, z), leav);
                mm.overrideBlock(w.getBlockAt(x - 1, yi, z + 1), leav);
                mm.overrideBlock(w.getBlockAt(x - 1, yi, z - 1), leav);
                mm.overrideBlock(w.getBlockAt(x - 2, yi, z), leav);
                mm.overrideBlock(w.getBlockAt(x - 2, yi, z + 1), leav);
                mm.overrideBlock(w.getBlockAt(x - 2, yi, z - 1), leav);
                mm.overrideBlock(w.getBlockAt(x, yi, z + 1), leav);
                mm.overrideBlock(w.getBlockAt(x, yi, z - 1), leav);
                mm.overrideBlock(w.getBlockAt(x, yi, z + 2), leav);
                mm.overrideBlock(w.getBlockAt(x + 1, yi, z + 2), leav);
                mm.overrideBlock(w.getBlockAt(x - 1, yi, z + 2), leav);
                mm.overrideBlock(w.getBlockAt(x, yi, z - 2), leav);
                mm.overrideBlock(w.getBlockAt(x + 1, yi, z - 2), leav);
                mm.overrideBlock(w.getBlockAt(x - 1, yi, z - 2), leav);
                mm.overrideBlock(w.getBlockAt(x + 2, yi, z - 2), leav);
            } else if (yi == y + 5) {
                mm.overrideBlock(w.getBlockAt(x, yi, z), log);
                mm.overrideBlock(w.getBlockAt(x + 1, yi, z), leav);
                mm.overrideBlock(w.getBlockAt(x - 1, yi, z), leav);
                mm.overrideBlock(w.getBlockAt(x, yi, z + 1), leav);
                mm.overrideBlock(w.getBlockAt(x, yi, z - 1), leav);
            } else if (yi == y + 6) {
                mm.overrideBlock(w.getBlockAt(x, yi, z), leav);
                mm.overrideBlock(w.getBlockAt(x + 1, yi, z), leav);
                mm.overrideBlock(w.getBlockAt(x - 1, yi, z), leav);
                mm.overrideBlock(w.getBlockAt(x, yi, z + 1), leav);
                mm.overrideBlock(w.getBlockAt(x, yi, z - 1), leav);
            } else {
                mm.overrideBlock(w.getBlockAt(x, yi, z), log);
            }
        }
    }

    public boolean CheckSpace() {
        int x = loc.getBlockX();
        int y = loc.getBlockY();
        int z = loc.getBlockZ();
        World w = loc.getWorld();
        for (int yi = y; yi < y + 7; yi++) {
            if (yi == y) {

            } else if (yi == y + 3) {
                if (w.getBlockAt(x, yi, z).getTypeId() == 0
                        && w.getBlockAt(x + 1, yi, z).getTypeId() == 0
                        && w.getBlockAt(x + 1, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x + 1, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x + 2, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x + 2, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x + 2, yi, z).getTypeId() == 0
                        && w.getBlockAt(x - 1, yi, z).getTypeId() == 0
                        && w.getBlockAt(x - 1, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x - 1, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x - 2, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x - 2, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x - 2, yi, z).getTypeId() == 0
                        && w.getBlockAt(x, yi, z - 1).getTypeId() == 0
                        && w.getBlockAt(x, yi, z - 2).getTypeId() == 0
                        && w.getBlockAt(x, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x, yi, z + 2).getTypeId() == 0
                        && w.getBlockAt(x + 1, yi, z + 2).getTypeId() == 0
                        && w.getBlockAt(x - 1, yi, z + 2).getTypeId() == 0
                        && w.getBlockAt(x + 1, yi, z - 2).getTypeId() == 0
                        && w.getBlockAt(x - 1, yi, z - 2).getTypeId() == 0
                        && w.getBlockAt(x - 2, yi, z - 2).getTypeId() == 0) {

                } else {
                    return false;
                }
            } else if (yi == y + 4) {
                if (w.getBlockAt(x, yi, z).getTypeId() == 0
                        && w.getBlockAt(x + 1, yi, z).getTypeId() == 0
                        && w.getBlockAt(x + 1, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x + 1, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x + 2, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x + 2, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x + 2, yi, z).getTypeId() == 0
                        && w.getBlockAt(x - 1, yi, z).getTypeId() == 0
                        && w.getBlockAt(x - 1, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x - 1, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x - 2, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x - 2, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x - 2, yi, z).getTypeId() == 0
                        && w.getBlockAt(x, yi, z - 1).getTypeId() == 0
                        && w.getBlockAt(x, yi, z - 2).getTypeId() == 0
                        && w.getBlockAt(x, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x, yi, z + 2).getTypeId() == 0
                        && w.getBlockAt(x + 1, yi, z + 2).getTypeId() == 0
                        && w.getBlockAt(x - 1, yi, z + 2).getTypeId() == 0
                        && w.getBlockAt(x + 1, yi, z - 2).getTypeId() == 0
                        && w.getBlockAt(x - 1, yi, z - 2).getTypeId() == 0
                        && w.getBlockAt(x + 2, yi, z - 2).getTypeId() == 0) {

                } else {
                    return false;
                }
            } else if (yi == y + 5) {
                if (w.getBlockAt(x, yi, z).getTypeId() == 0
                        && w.getBlockAt(x + 1, yi, z).getTypeId() == 0
                        && w.getBlockAt(x - 1, yi, z).getTypeId() == 0
                        && w.getBlockAt(x, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x, yi, z - 1).getTypeId() == 0) {

                } else {
                    return false;
                }
            } else if (yi == y + 6) {
                if (w.getBlockAt(x, yi, z).getTypeId() == 0
                        && w.getBlockAt(x + 1, yi, z).getTypeId() == 0
                        && w.getBlockAt(x - 1, yi, z).getTypeId() == 0
                        && w.getBlockAt(x, yi, z + 1).getTypeId() == 0
                        && w.getBlockAt(x, yi, z - 1).getTypeId() == 0) {

                } else {
                    return false;
                }
            } else {
                if (w.getBlockAt(x, yi, z).getTypeId() == 0) {

                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
