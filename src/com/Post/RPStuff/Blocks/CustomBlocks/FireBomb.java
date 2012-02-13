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
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Entity;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.player.SpoutPlayer;

import java.util.List;

public class FireBomb extends RPCustomBlock {
    RPStuff p;
    static int[] id = {35, 36, 36, 36, 36, 37};

    public FireBomb(RPStuff plugin) {
        super(plugin, "ChickenPWNER", id);
        // TODO Auto-generated constructor stub
        this.p = plugin;
        this.setItemDrop(new SpoutItemStack(this.getBlockItem(), 1));
    }

    @Override
    public boolean onBlockInteract(final World arg0, int arg1, int arg2, int arg3,
                                   SpoutPlayer arg4) {
        final Location loc = new Location(arg0, arg1, arg2, arg3);
        p.getServer().getScheduler().scheduleSyncDelayedTask(p, new Runnable() {
            public void run() {
                Entity c = arg0.spawnCreature(loc, CreatureType.CHICKEN);
                List<Entity> es = c.getNearbyEntities(7, 7, 7);
                SpoutManager.getMaterialManager().removeBlockOverride(loc.getBlock());
                arg0.getBlockAt(loc).setTypeId(0);
                for (int i = 0; i < es.size(); i++) {
                    es.get(i).setFireTicks(6000);
                }
            }
        }, 60L);
        return true;
    }

}
