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

package com.Post.RPStuff;

import com.Post.RPStuff.Blocks.Blocks.*;
import com.Post.RPStuff.Blocks.CustomBlocks.*;
import com.Post.RPStuff.Blocks.Glass.*;
import com.Post.RPStuff.Blocks.Leaves.AppleLeave;
import com.Post.RPStuff.Blocks.Leaves.RPLeave;
import com.Post.RPStuff.Blocks.Logs.AppleLog;
import com.Post.RPStuff.Blocks.Logs.RPLog;
import com.Post.RPStuff.Blocks.Ores.*;
import com.Post.RPStuff.Blocks.Saplings.AppleSapling;
import com.Post.RPStuff.Blocks.Saplings.RPSapling;
import com.Post.RPStuff.Blocks.Wood.OldDarkWood;
import com.Post.RPStuff.Blocks.Wood.RPWood;
import com.Post.RPStuff.Blocks.Wood.RedWood;
import com.Post.RPStuff.Blocks.Wood.WhiteWood;
import com.Post.RPStuff.Items.Ingots.*;

import java.util.HashSet;
import java.util.Set;

public class RPMaps {

    public static Set<RPBlock> blocks = new HashSet<RPBlock>();
    public static Set<RPCustomBlock> cblocks = new HashSet<RPCustomBlock>();
    public static Set<RPGlass> gblocks = new HashSet<RPGlass>();
    public static Set<RPWood> woods = new HashSet<RPWood>();
    public static Set<RPLog> logs = new HashSet<RPLog>();
    public static Set<RPLeave> leaves = new HashSet<RPLeave>();
    public static Set<RPIngot> ingots = new HashSet<RPIngot>();
    public static Set<RPSapling> saplings = new HashSet<RPSapling>();
    public static Set<RPOre> ores = new HashSet<RPOre>();


    public static void loadRPStuff(RPStuff plugin) {
        //Blocks
        BunterCobblestone b1 = new BunterCobblestone(plugin);
        CoalBlock b2 = new CoalBlock(plugin);
        HardenObsidian b3 = new HardenObsidian(plugin);
        Kacheln b4 = new Kacheln(plugin);
        Marmor b5 = new Marmor(plugin);
        Kork b6 = new Kork(plugin);
        Mosaik b7 = new Mosaik(plugin);
        RedstoneBlock b8 = new RedstoneBlock(plugin);

        blocks.add(b1);
        blocks.add(b2);
        blocks.add(b3);
        blocks.add(b4);
        blocks.add(b5);
        blocks.add(b6);
        blocks.add(b7);
        blocks.add(b8);

        //CBlocks
        Fass cb1 = new Fass(plugin);
        FireBomb cb2 = new FireBomb(plugin);
        Present cb3 = new Present(plugin);
        PortUp cb4 = new PortUp(plugin);
        PortDown cb5 = new PortDown(plugin);

        cblocks.add(cb1);
        cblocks.add(cb2);
        cblocks.add(cb3);
        cblocks.add(cb4);
        cblocks.add(cb5);

        //GBlocks
        BlackGlass g1 = new BlackGlass(plugin);
        BlueGlass g2 = new BlueGlass(plugin);
        BrownGlass g3 = new BrownGlass(plugin);
        CyanGlass g4 = new CyanGlass(plugin);
        DarkGrayGlass g5 = new DarkGrayGlass(plugin);
        GrayGlass g6 = new GrayGlass(plugin);
        GreenGlass g7 = new GreenGlass(plugin);
        LightBlueGlass g8 = new LightBlueGlass(plugin);
        LightGreenGlass g9 = new LightGreenGlass(plugin);
        MagentaGlass g10 = new MagentaGlass(plugin);
        OrangeGlass g11 = new OrangeGlass(plugin);
        PinkGlass g12 = new PinkGlass(plugin);
        PurpleGlass g13 = new PurpleGlass(plugin);
        RedGlass g14 = new RedGlass(plugin);
        WhiteGlass g15 = new WhiteGlass(plugin);
        YellowGlass g16 = new YellowGlass(plugin);

        gblocks.add(g1);
        gblocks.add(g2);
        gblocks.add(g3);
        gblocks.add(g4);
        gblocks.add(g5);
        gblocks.add(g6);
        gblocks.add(g7);
        gblocks.add(g8);
        gblocks.add(g9);
        gblocks.add(g10);
        gblocks.add(g11);
        gblocks.add(g12);
        gblocks.add(g13);
        gblocks.add(g14);
        gblocks.add(g15);
        gblocks.add(g16);

        // Ores
        SilverOre o1 = new SilverOre(plugin);
        CopperOre o2 = new CopperOre(plugin);
        MithrilOre o3 = new MithrilOre(plugin);
        JadeOre o4 = new JadeOre(plugin);
        PyriteOre o5 = new PyriteOre(plugin);
        MalachitOre o6 = new MalachitOre(plugin);
        ZanOre o7 = new ZanOre(plugin);
        GroomOre o8 = new GroomOre(plugin);

        ores.add(o1);
        ores.add(o2);
        ores.add(o3);
        ores.add(o4);
        ores.add(o5);
        ores.add(o6);
        ores.add(o7);
        ores.add(o8);

        //Woods
        OldDarkWood w1 = new OldDarkWood(plugin);
        RedWood w2 = new RedWood(plugin);
        WhiteWood w3 = new WhiteWood(plugin);

        woods.add(w1);
        woods.add(w2);
        woods.add(w3);

        //Logs
        AppleLog l1 = new AppleLog(plugin);

        logs.add(l1);

        //Leaves
        AppleLeave le1 = new AppleLeave(plugin);

        leaves.add(le1);

        //Ingots
        ObsidianIngot ig1 = new ObsidianIngot(plugin);
        Jade ig2 = new Jade(plugin);
        Malachit ig3 = new Malachit(plugin);
        CopperIngot ig4 = new CopperIngot(plugin);
        GroomIngot ig5 = new GroomIngot(plugin);
        MithrilIngot ig6 = new MithrilIngot(plugin);
        PyriteIngot ig7 = new PyriteIngot(plugin);
        SilverIngot ig8 = new SilverIngot(plugin);
        ZanIngot ig9 = new ZanIngot(plugin);

        ingots.add(ig1);
        ingots.add(ig2);
        ingots.add(ig3);
        ingots.add(ig4);
        ingots.add(ig5);
        ingots.add(ig6);
        ingots.add(ig7);
        ingots.add(ig8);
        ingots.add(ig9);

        //Saplings
        AppleSapling sap1 = new AppleSapling(plugin);

        saplings.add(sap1);
    }

}
