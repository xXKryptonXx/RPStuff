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

package com.Post.RPStuff.Recipes;

import com.Post.RPStuff.Blocks.Blocks.*;
import com.Post.RPStuff.Blocks.CustomBlocks.Fass;
import com.Post.RPStuff.Blocks.CustomBlocks.FireBomb;
import com.Post.RPStuff.Blocks.CustomBlocks.PortDown;
import com.Post.RPStuff.Blocks.CustomBlocks.PortUp;
import com.Post.RPStuff.Blocks.Glass.*;
import com.Post.RPStuff.Blocks.Logs.AppleLog;
import com.Post.RPStuff.Blocks.Saplings.AppleSapling;
import com.Post.RPStuff.Blocks.Wood.OldDarkWood;
import com.Post.RPStuff.Blocks.Wood.RedWood;
import com.Post.RPStuff.Blocks.Wood.WhiteWood;
import com.Post.RPStuff.Items.Ingots.Jade;
import com.Post.RPStuff.Items.Ingots.Malachit;
import com.Post.RPStuff.Items.Ingots.ObsidianIngot;
import com.Post.RPStuff.RPStuff;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.MaterialData;

public class CraftingRec {
    RPStuff p;

    public CraftingRec(RPStuff plugin) {
        this.p = plugin;
        this.registerCraftingRecipes();
        this.registerGlassRecipes();
    }

    private void registerCraftingRecipes() {
        //Vars
        ItemStack result;
        SpoutShapedRecipe recipe;
        SpoutShapelessRecipe lessrecipe;

        //Rec: BunterCoblestone
        result = new SpoutItemStack(new BunterCobblestone(p), 4);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("BAB", "ABA", "BAB");
        recipe.setIngredient('A', MaterialData.clayBrick);
        recipe.setIngredient('B', MaterialData.cobblestone);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        //Rec: CoalBlock
        result = new SpoutItemStack(new CoalBlock(p), 1);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("AAA", "AAA", "AAA");
        recipe.setIngredient('A', MaterialData.coal);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        result = new ItemStack(Material.COAL, 9);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, new CoalBlock(p));
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: Kork
        result = new SpoutItemStack(new Kork(p), 3);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("XBX", "AAA", "XBX");
        recipe.setIngredient('A', MaterialData.log);
        recipe.setIngredient('B', MaterialData.pistonBase);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        //Rec: Mamor
        result = new SpoutItemStack(new Marmor(p), 1);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.stone);
        lessrecipe.addIngredient(1, MaterialData.lavaBucket);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: Mosaik
        result = new SpoutItemStack(new Mosaik(p), 1);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("ABA", "DDC", "ABA");
        recipe.setIngredient('A', MaterialData.stone);
        recipe.setIngredient('B', MaterialData.lapisLazuli);
        recipe.setIngredient('C', new Marmor(p));
        recipe.setIngredient('D', MaterialData.obsidian);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        //Rec: OldDarkWood
        result = new SpoutItemStack(new OldDarkWood(p), 1);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("BBB", "BAB", "BBB");
        recipe.setIngredient('A', MaterialData.wood);
        recipe.setIngredient('B', MaterialData.dirt);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        //Rec: RedstoneBlock
        result = new SpoutItemStack(new RedstoneBlock(p), 1);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("AAA", "AAA", "AAA");
        recipe.setIngredient('A', MaterialData.redstone);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        result = new ItemStack(Material.REDSTONE, 9);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, new RedstoneBlock(p));
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: RedWood
        result = new SpoutItemStack(new RedWood(p), 1);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("XBX", "BAB", "XBX");
        recipe.setIngredient('A', MaterialData.wood);
        recipe.setIngredient('B', MaterialData.roseRed);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        //Rec: WhiteWood
        result = new SpoutItemStack(new WhiteWood(p), 1);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("XBX", "BAB", "XBX");
        recipe.setIngredient('A', MaterialData.wood);
        recipe.setIngredient('B', MaterialData.boneMeal);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        //Rec: Kachel
        result = new SpoutItemStack(new Kacheln(p), 2);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("AB", "BA");
        recipe.setIngredient('A', MaterialData.stone);
        recipe.setIngredient('B', MaterialData.obsidian);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        //Rec: ObsidianBarrenBlock
        result = new SpoutItemStack(new HardenObsidian(p), 1);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("AAA", "AAA", "AAA");
        recipe.setIngredient('A', new ObsidianIngot(p));
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        result = new SpoutItemStack(new ObsidianIngot(p), 9);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, new HardenObsidian(p));
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: Fass
        result = new SpoutItemStack(new Fass(p), 1);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("ABA", "CBC", "AAA");
        recipe.setIngredient('A', MaterialData.wood);
        recipe.setIngredient('B', MaterialData.waterBucket);
        recipe.setIngredient('C', MaterialData.ironIngot);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        //Rec: Appletreesapling
        result = new SpoutItemStack(new AppleSapling(p), 1);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.redApple);
        lessrecipe.addIngredient(1, MaterialData.sapling);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: AppleLog to Wood
        result = new ItemStack(Material.WOOD, 4);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, new AppleLog(p));
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: FireBomb
        result = new SpoutItemStack(new FireBomb(p), 1);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("ABA", "BCB", "ABA");
        recipe.setIngredient('A', new ObsidianIngot(p));
        recipe.setIngredient('B', MaterialData.gunpowder);
        recipe.setIngredient('C', MaterialData.egg);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        //Rec: GlowstoneDust
        result = new ItemStack(Material.GLOWSTONE_DUST, 4);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glowstoneBlock);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: Present
//		result = new SpoutItemStack(new Present(p), 1);
//		recipe  = new SpoutShapedRecipe(result);
//		recipe.shape("ABA", "BCB", "ABA");
//		recipe.setIngredient('A', MaterialData.magentaWool);
//		recipe.setIngredient('B', MaterialData.greenWool);
//		recipe.setIngredient('C', MaterialData.goldIngot);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        //Rec: PortUp
        result = new SpoutItemStack(new PortUp(p), 1);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("BBB", "BAB", "BBB");
        recipe.setIngredient('A', new Jade(p));
        recipe.setIngredient('B', MaterialData.goldIngot);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        //Rec: PortDown
        result = new SpoutItemStack(new PortDown(p), 1);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("BBB", "BAB", "BBB");
        recipe.setIngredient('A', new Malachit(p));
        recipe.setIngredient('B', MaterialData.ironIngot);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
    }

    private void registerGlassRecipes() {
        //Vars
        ItemStack result;
        SpoutShapelessRecipe lessrecipe;

        //Rec: BlackGlass
        result = new SpoutItemStack(new BlackGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.inkSac);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: BlueGlass
        result = new SpoutItemStack(new BlueGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.lapisLazuli);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: BrownGlass
        result = new SpoutItemStack(new BrownGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.cocoaBeans);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: CyanGlass
        result = new SpoutItemStack(new CyanGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.cyanDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: DarkGrayGlass
        result = new SpoutItemStack(new DarkGrayGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.grayDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: GrayGlass
        result = new SpoutItemStack(new GrayGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.lightGrayDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: GreenGlass
        result = new SpoutItemStack(new GreenGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.cactusGreen);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: LightBlueGlass
        result = new SpoutItemStack(new LightBlueGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.lightBlueDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: LightGreenGlass
        result = new SpoutItemStack(new LightGreenGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.limeDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: MagentaGlass
        result = new SpoutItemStack(new MagentaGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.magentaDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: OrangeGlass
        result = new SpoutItemStack(new OrangeGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.orangeDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: PinkGlass
        result = new SpoutItemStack(new PinkGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.pinkDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: PurpleGlass
        result = new SpoutItemStack(new PurpleGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.purpleDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: RedGlass
        result = new SpoutItemStack(new RedGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.roseRed);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: WhiteGlass
        result = new SpoutItemStack(new WhiteGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.boneMeal);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

        //Rec: YellowGlass
        result = new SpoutItemStack(new YellowGlass(p), 2);
        lessrecipe = new SpoutShapelessRecipe(result);
        lessrecipe.addIngredient(1, MaterialData.glass);
        lessrecipe.addIngredient(1, MaterialData.dandelionYellow);
        SpoutManager.getMaterialManager().registerSpoutRecipe(lessrecipe);

    }

}
