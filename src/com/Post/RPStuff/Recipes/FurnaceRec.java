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

import com.Post.RPStuff.Items.Ingots.ObsidianIngot;
import com.Post.RPStuff.RPStuff;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.inventory.SpoutItemStack;

public class FurnaceRec {
    RPStuff p;

    public FurnaceRec(RPStuff plugin) {
        this.p = plugin;
        this.registerFurnaceRecipes();
    }

    private void registerFurnaceRecipes() {
        //Vars
        ItemStack result;
        FurnaceRecipe rcp;

        //Item: ObsidianIngot
        result = new SpoutItemStack(new ObsidianIngot(p), 1);
        rcp = new FurnaceRecipe(result, Material.OBSIDIAN);
        Bukkit.getServer().addRecipe(rcp);

//		//Item: CopperIngot
//		final MaterialData ci =  new SpoutItemStack(new CopperOre(p)).getData();
//		result = new SpoutItemStack(new CopperIngot(p), 1);
//		rcp = new FurnaceRecipe(result, ci);
//		Bukkit.getServer().addRecipe(rcp);
//		
//		//Item: GroomIngot
//		final MaterialData gi = new SpoutItemStack(new GroomOre(p)).getData();
//		result = new SpoutItemStack(new GroomIngot(p), 1);
//		rcp = new FurnaceRecipe(result, gi);
//		Bukkit.getServer().addRecipe(rcp);
//		
//		//Item: MithrilIngot
//		final MaterialData mi = new SpoutItemStack(new MithrilOre(p)).getData();
//		result = new SpoutItemStack(new MithrilIngot(p), 1);
//		rcp = new FurnaceRecipe(result, mi);
//		Bukkit.getServer().addRecipe(rcp);
//		
//		//Item: PyriteIngot
//		final MaterialData pi = new SpoutItemStack(new PyriteOre(p)).getData();
//		result = new SpoutItemStack(new PyriteIngot(p), 1);
//		rcp = new FurnaceRecipe(result, pi);
//		Bukkit.getServer().addRecipe(rcp);
//		
//		//Item: SilverIngot
//		final Material si = new SpoutItemStack(new SilverOre(p)).getType();
//		result = new SpoutItemStack(new SilverIngot(p), 1);
//		rcp = new FurnaceRecipe(result, si);
//		Bukkit.getServer().addRecipe(rcp);
//		
//		//Item: ZanIngot
//		final MaterialData zi = new SpoutItemStack(new ZanOre(p)).getData();
//		result = new SpoutItemStack(new ZanIngot(p), 1);
//		rcp = new FurnaceRecipe(result, zi);
//		Bukkit.getServer().addRecipe(rcp);
    }

}
