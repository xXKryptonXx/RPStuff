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

import com.Post.RPStuff.Items.RPItemManager;
import com.Post.RPStuff.Listener.BlockListener;
import com.Post.RPStuff.Listener.EntityListener;
import com.Post.RPStuff.Listener.PlayerListener;
import com.Post.RPStuff.Recipes.CraftingRec;
import com.Post.RPStuff.Recipes.FurnaceRec;
import com.Post.RPStuff.Recipes.ItemRec;
import com.Post.RPWeapons.RPCustomWeapon;
import com.Post.RPWeapons.RPWeaponManager;
import com.Post.RPWeapons.RPWeaponType;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.player.FileManager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RPStuff extends JavaPlugin {

    public static Logger log = Logger.getLogger("Minecraft");
    public Texture BlockTex, ItemTex, TreeTex;
    public static String TexURL;
    RPConfig conf = new RPConfig(this);
    public RPWeaponManager rpWeaponManager;
    public RPItemManager rpItemManager;

    @Override
    public void onDisable() {
        // TODO Auto-generated method stub
        log.log(Level.INFO, "[RPStuff] v0.4.1 by Danny Post is now disabled");

    }

    @Override
    public void onEnable() {
        // TODO Auto-generated method stub
        PluginManager pm = getServer().getPluginManager();

        conf.configCheck();
        this.rpWeaponManager = new RPWeaponManager();
        this.rpItemManager = new RPItemManager();
        PreLoadTextures(this, TexURL);
        LoadWeapons(this, TexURL);
        loadTextures();
        RPMaps.loadRPStuff(this);
        new CraftingRec(this);
        new FurnaceRec(this);
        new ItemRec(this);
        pm.registerEvent(Type.ENTITY_DAMAGE, new EntityListener(this), Priority.Normal, this);
        pm.registerEvent(Type.PLAYER_INTERACT, new PlayerListener(this), Priority.Normal, this);
        pm.registerEvent(Type.BLOCK_PLACE, new BlockListener(this), Priority.Normal, this);


        log.log(Level.INFO, "[RPStuff] v0.4.1 by Danny Post is now enabled");

    }

    public static void PreLoadTextures(RPStuff plugin, String URL) {
        FileManager fm = SpoutManager.getFileManager();
        fm.addToPreLoginCache(plugin, URL + "/Blocks/Blocks.png");
        fm.addToPreLoginCache(plugin, URL + "/Blocks/Trees.png");
        //fm.addToPreLoginCache(plugin, URL + "/Items.png");
        fm.addToPreLoginCache(plugin, URL + "/Weapons/Obsidiansword.png");
        fm.addToPreLoginCache(plugin, URL + "/Weapons/ObsidianHammer.png");
        fm.addToPreLoginCache(plugin, URL + "/Items/ObsidianIngot.png");
        fm.addToPreLoginCache(plugin, URL + "/Items/CopperIngot.png");
        fm.addToPreLoginCache(plugin, URL + "/Items/GroomIngot.png");
        fm.addToPreLoginCache(plugin, URL + "/Items/SilverIngot.png");
        fm.addToPreLoginCache(plugin, URL + "/Items/ZanIngot.png");
        fm.addToPreLoginCache(plugin, URL + "/Items/MithrilIngot.png");
        fm.addToPreLoginCache(plugin, URL + "/Items/PyriteIngot.png");
        fm.addToPreLoginCache(plugin, URL + "/Items/Jade.png");
        fm.addToPreLoginCache(plugin, URL + "/Items/Malachit.png");
    }

    public static void LoadWeapons(RPStuff plugin, String URL) {
        String directory = (URL + "/Weapons");
        RPCustomWeapon ucw;
        try {
            ucw = new RPCustomWeapon(RPWeaponType.GENERIC_WEAPON, "Obsidiansword", "Obsidiansword", directory + "/Obsidiansword.png", 20, plugin);
            plugin.rpWeaponManager.addItem(ucw);
            ucw = new RPCustomWeapon(RPWeaponType.GENERIC_WEAPON, "ObsidianHammer", "ObsidianHammer", directory + "/ObsidianHammer.png", 20, plugin);
            plugin.rpWeaponManager.addItem(ucw);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void loadTextures() {
        BlockTex = new Texture(this, TexURL + "/Blocks/Blocks.png", 512, 512, 32);
        TreeTex = new Texture(this, TexURL + "/Blocks/Trees.png", 512, 512, 32);
        //ItemTex = new Texture(this, TexURL + "/Items.png", 512, 512, 32);
    }

}
