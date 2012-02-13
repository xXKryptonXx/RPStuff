package com.Post.RPWeapons;

import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class RPWeaponManager {
    public HashMap<String, RPCustomWeapon> items = new HashMap<String, RPCustomWeapon>();
    public HashMap<Integer, HashMap<Integer, String>> itemIdCache = new HashMap<Integer, HashMap<Integer, String>>();

    public RPWeaponManager addItem(RPCustomWeapon item)
            throws Exception {
        this.items.put(item.getName(), item);
        if (!this.itemIdCache.containsKey(Integer.valueOf(item.getCustomWeapon().getRawId()))) {
            this.itemIdCache.put(Integer.valueOf(item.getCustomWeapon().getRawId()), new HashMap<Integer, String>());
        }
        ((HashMap<Integer, String>) this.itemIdCache.get(Integer.valueOf(item.getCustomWeapon().getRawId()))).put(Integer.valueOf(item.getCustomWeapon().getRawData()), item.getName());
        return this;
    }

    public void removeItem(String name) {
    }

    public RPCustomWeapon getItem(String name) {
        return (RPCustomWeapon) this.items.get(name);
    }

    public RPCustomWeapon getItem(Integer id, Integer data) {
        try {
            return (RPCustomWeapon) this.items.get(((HashMap<?, ?>) this.itemIdCache.get(id)).get(data));
        } catch (Exception e) {
        }
        return null;
    }

    public RPCustomWeapon getItem(ItemStack item) {
        try {
            return (RPCustomWeapon) this.items.get(((HashMap<?, ?>) this.itemIdCache.get(Integer.valueOf(item.getTypeId()))).get(Integer.valueOf(Short.valueOf(item.getDurability()).intValue())));
        } catch (Exception e) {
        }
        return null;
    }

}
