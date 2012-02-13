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

public class RPItemAction {
    private RPItemActionType type;
    private String action = null;
    private Boolean consume = Boolean.valueOf(false);
    private Integer health = Integer.valueOf(0);
    private Integer hunger = Integer.valueOf(0);
    private String sound = null;

    public RPItemAction(RPItemActionType type) {
        setType(type);
    }

    public RPItemAction setType(RPItemActionType type) {
        this.type = type;
        return this;
    }

    public RPItemActionType getType() {
        return this.type;
    }

    public RPItemAction setAction(String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return this.action;
    }

    public RPItemAction setConsume(Boolean consume) {
        this.consume = consume;
        return this;
    }

    public Boolean getConsume() {
        return this.consume;
    }

    public RPItemAction setHealth(Integer health) {
        this.health = health;
        return this;
    }

    public Integer getHealth() {
        return this.health;
    }

    public RPItemAction setHunger(Integer hunger) {
        this.hunger = hunger;
        return this;
    }

    public Integer getHunger() {
        return this.hunger;
    }

    public RPItemAction setSound(String sound) {
        this.sound = sound;
        return this;
    }

    public String getSound() {
        return this.sound;
    }
}
