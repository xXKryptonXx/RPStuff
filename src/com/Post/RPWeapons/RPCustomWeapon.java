package com.Post.RPWeapons;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.CustomItem;
import org.getspout.spoutapi.material.item.GenericCustomItem;

import java.util.EnumMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;

public class RPCustomWeapon {
    private RPWeaponType type;
    private String name;
    private String title;
    private String textureUrl;
    Logger log = Logger.getLogger("Minecraft");
    private Integer entityDamage;
    private CustomItem cw;
    @SuppressWarnings("unchecked")
    private Map<RPWeaponActionType, RPWeaponAction> actions = new EnumMap(RPWeaponActionType.class);

    public RPCustomWeapon(RPWeaponType type, String name, String title, String textureurl, int dmg, Plugin plugin) throws Exception {
        setName(name);
        setType(type);
        setTitle(title);
        setTexture(textureurl);
        setEntityDamage(dmg);
        switch (type) {
            case GENERIC_WEAPON:
                this.cw = new GenericCustomItem(plugin, title, textureurl);
                break;
            default:
                throw new Exception("Ung�ltiger Typ");
        }
    }

    public RPCustomWeapon setType(RPWeaponType type) {
        this.type = type;
        return this;
    }

    public RPCustomWeapon setName(String name) throws DataFormatException {
        if (name == null) {
            throw new DataFormatException("Es muss ein Itemname gegeben sein!");
        }
        this.name = name;
        return this;
    }

    public RPCustomWeapon setTexture(String textureUrl) throws DataFormatException {
        if (textureUrl == null) {
            throw new DataFormatException("Es muss eine URL angegeben werden");
        }
        this.textureUrl = textureUrl;
        return this;
    }

    public RPCustomWeapon setTitle(String title) throws DataFormatException {
        if (title == null) {
            throw new DataFormatException("Es muss ein Titel gegeben sein");
        }
        this.title = title;
        return this;
    }

    public CustomItem getCustomWeapon() {
        return this.cw;
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

    public RPCustomWeapon addAction(RPWeaponAction action) {
        this.actions.put(action.getType(), action);
        return this;
    }

    public RPWeaponAction getAction(RPWeaponActionType type) {
        return (RPWeaponAction) this.actions.get(type);
    }

    public void setEntityDamage(int dmg) {
        this.entityDamage = dmg;
    }

    public Integer getEntityDamage() {
        return this.entityDamage;
    }
}
