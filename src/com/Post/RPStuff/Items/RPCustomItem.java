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

package com.Post.RPStuff.Items;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.CustomItem;
import org.getspout.spoutapi.material.item.GenericCustomItem;

import java.util.EnumMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;


public class RPCustomItem {
    private RPItemType type;
    private String name;
    private String title;
    private String textureUrl;
    Logger log = Logger.getLogger("Minecraft");
    private Integer entityDamage;
    private CustomItem ci;
    @SuppressWarnings("unchecked")
    private Map<RPItemActionType, RPItemAction> actions = new EnumMap(RPItemActionType.class);

    public RPCustomItem(RPItemType type, String name, String title, String textureurl, Plugin plugin) throws Exception {
        setName(name);
        setType(type);
        setTitle(title);
        setTexture(textureurl);
        switch (type) {
            case GENERIC_ITEM:
                this.ci = new GenericCustomItem(plugin, title, textureurl);
                break;
            default:
                throw new Exception("Ung�ltiger Typ");
        }
    }

    public RPCustomItem setType(RPItemType type) {
        this.type = type;
        return this;
    }

    public RPCustomItem setName(String name) throws DataFormatException {
        if (name == null) {
            throw new DataFormatException("Es muss ein Itemname gegeben sein!");
        }
        this.name = name;
        return this;
    }

    public RPCustomItem setTexture(String textureUrl) throws DataFormatException {
        if (textureUrl == null) {
            throw new DataFormatException("Es muss eine URL angegeben werden");
        }
        this.textureUrl = textureUrl;
        return this;
    }

    public RPCustomItem setTitle(String title) throws DataFormatException {
        if (title == null) {
            throw new DataFormatException("Es muss ein Titel gegeben sein");
        }
        this.title = title;
        return this;
    }

    public CustomItem getCustomItem() {
        return this.ci;
    }

    public String getTextureUrl() {
        return this.textureUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public String getName() {
        return this.name;
    }

    public RPCustomItem addAction(RPItemAction action) {
        this.actions.put(action.getType(), action);
        return this;
    }

    public RPItemAction getAction(RPItemActionType type) {
        return (RPItemAction) this.actions.get(type);
    }

    public void setEntityDamage(int dmg) {
        this.entityDamage = dmg;
    }

    public Integer getEntityDamage() {
        return this.entityDamage;
    }
}
