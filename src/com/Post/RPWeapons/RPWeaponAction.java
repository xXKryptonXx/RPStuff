package com.Post.RPWeapons;

public class RPWeaponAction {
    private RPWeaponActionType type;
    private String action = null;
    private Boolean consume = Boolean.valueOf(false);
    private Integer health = Integer.valueOf(0);
    private Integer hunger = Integer.valueOf(0);
    private String sound = null;

    public RPWeaponAction(RPWeaponActionType type) {
        setType(type);
    }

    public RPWeaponAction setType(RPWeaponActionType type) {
        this.type = type;
        return this;
    }

    public RPWeaponActionType getType() {
        return this.type;
    }

    public RPWeaponAction setAction(String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return this.action;
    }

    public RPWeaponAction setConsume(Boolean consume) {
        this.consume = consume;
        return this;
    }

    public Boolean getConsume() {
        return this.consume;
    }

    public RPWeaponAction setHealth(Integer health) {
        this.health = health;
        return this;
    }

    public Integer getHealth() {
        return this.health;
    }

    public RPWeaponAction setHunger(Integer hunger) {
        this.hunger = hunger;
        return this;
    }

    public Integer getHunger() {
        return this.hunger;
    }

    public RPWeaponAction setSound(String sound) {
        this.sound = sound;
        return this;
    }

    public String getSound() {
        return this.sound;
    }

}
