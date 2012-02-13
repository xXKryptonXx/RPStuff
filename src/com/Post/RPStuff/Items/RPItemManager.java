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

import org.bukkit.inventory.ItemStack;

import java.util.HashMap;


public class RPItemManager {
    public HashMap<String, RPCustomItem> items = new HashMap<String, RPCustomItem>();
    public HashMap<Integer, HashMap<Integer, String>> itemIdCache = new HashMap<Integer, HashMap<Integer, String>>();

    public RPItemManager addItem(RPCustomItem item)
            throws Exception {
        this.items.put(item.getName(), item);
        if (!this.itemIdCache.containsKey(Integer.valueOf(item.getCustomItem().getRawId()))) {
            this.itemIdCache.put(Integer.valueOf(item.getCustomItem().getRawId()), new HashMap<Integer, String>());
        }
        ((HashMap<Integer, String>) this.itemIdCache.get(Integer.valueOf(item.getCustomItem().getRawId()))).put(Integer.valueOf(item.getCustomItem().getRawData()), item.getName());
        return this;
    }

    public void removeItem(String name) {
    }

    public RPCustomItem getItem(String name) {
        return (RPCustomItem) this.items.get(name);
    }

    public RPCustomItem getItem(Integer id, Integer data) {
        try {
            return (RPCustomItem) this.items.get(((HashMap<?, ?>) this.itemIdCache.get(id)).get(data));
        } catch (Exception e) {
        }
        return null;
    }

    public RPCustomItem getItem(ItemStack item) {
        try {
            return (RPCustomItem) this.items.get(((HashMap<?, ?>) this.itemIdCache.get(Integer.valueOf(item.getTypeId()))).get(Integer.valueOf(Short.valueOf(item.getDurability()).intValue())));
        } catch (Exception e) {
        }
        return null;
    }
}
