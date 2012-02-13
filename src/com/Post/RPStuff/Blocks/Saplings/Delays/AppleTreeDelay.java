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

package com.Post.RPStuff.Blocks.Saplings.Delays;

import com.Post.RPStuff.Blocks.Leaves.AppleLeave;
import com.Post.RPStuff.Blocks.Logs.AppleLog;
import com.Post.RPStuff.Blocks.Saplings.AppleSapling;
import com.Post.RPStuff.Generators.TreeGen;
import com.Post.RPStuff.RPStuff;
import org.bukkit.Location;
import org.getspout.spoutapi.SpoutManager;

public class AppleTreeDelay {
    final RPStuff p;
    final Location loc;
    TreeGen tg;

    public AppleTreeDelay(RPStuff p, Location loc) {
        this.p = p;
        this.loc = loc;

    }

    public void run() {
        p.getServer().getScheduler().scheduleSyncDelayedTask(p, new Runnable() {
            public void run() {
                tg = new TreeGen(p, loc, new AppleLog(p), new AppleLeave(p), new AppleSapling(p));
                if (tg.CheckSpace()) {
                    tg.GenTree();
                } else {
                    SpoutManager.getMaterialManager().removeBlockOverride(loc.getBlock());
                    loc.getBlock().setTypeId(0);
                }
            }
        }, 3000L);
    }


}
