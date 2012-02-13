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

import com.Post.RPStuff.Blocks.Blocks.HardenObsidian;
import com.Post.RPStuff.Items.Ingots.ObsidianIngot;
import com.Post.RPStuff.RPStuff;
import com.Post.RPWeapons.RPCustomWeapon;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;

public class ItemRec {
    RPStuff p;

    public ItemRec(RPStuff plugin) {
        this.p = plugin;
        this.registerItemRecipes();
    }

    private void registerItemRecipes() {
        //Vars
        ItemStack result;
        SpoutShapedRecipe recipe;
        RPCustomWeapon cw;

        //Weapon: ObsidianSword
        cw = p.rpWeaponManager.getItem("Obsidiansword");
        result = new SpoutItemStack(cw.getCustomWeapon(), 1);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("XBX", "XBX", "XAX");
        recipe.setIngredient('A', MaterialData.stick);
        recipe.setIngredient('B', new ObsidianIngot(p));
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        //Weapon: ObsidianHammer
        cw = p.rpWeaponManager.getItem("ObsidianHammer");
        result = new SpoutItemStack(cw.getCustomWeapon(), 1);
        recipe = new SpoutShapedRecipe(result);
        recipe.shape("CBC", "XAX", "XAX");
        recipe.setIngredient('A', MaterialData.stick);
        recipe.setIngredient('B', new ObsidianIngot(p));
        recipe.setIngredient('C', new HardenObsidian(p));
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
    }
}
