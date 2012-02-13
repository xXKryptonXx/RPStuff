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

package com.Post.RPStuff.Listener;

import com.Post.RPStuff.RPStuff;
import com.Post.RPWeapons.RPCustomWeapon;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityListener extends org.bukkit.event.entity.EntityListener {

    RPStuff plugin;

    public EntityListener(RPStuff instance) {
        this.plugin = instance;
    }

    public void onEntityDamage(EntityDamageEvent event) {
        if ((event instanceof EntityDamageByEntityEvent)) {
            EntityDamageByEntityEvent eevent = (EntityDamageByEntityEvent) event;
            Entity damager = eevent.getDamager();
            if ((damager instanceof Player)) {
                Player player = (Player) damager;
                if (player.getItemInHand() != null) {
                    RPCustomWeapon cw = this.plugin.rpWeaponManager.getItem(player.getItemInHand());
                    if (cw != null) {
                        if (cw.getName().equalsIgnoreCase("Obsidiansword")) {
                            if (event.getEntity() instanceof Player) {
                                eevent.setDamage(1);
                            } else if (event.getEntity() instanceof Animals) {
                                Integer entitydamage = cw.getEntityDamage();
                                eevent.setDamage(entitydamage.intValue());
                            } else {
                                eevent.setDamage(1);
                            }
                        } else if (cw.getName().equalsIgnoreCase("ObsidianHammer")) {
                            if (event.getEntity() instanceof Player) {
                                eevent.setDamage(1);
                            } else if (event.getEntity() instanceof Animals) {
                                eevent.setDamage(1);
                            } else {
                                Integer entitydamage = cw.getEntityDamage();
                                eevent.setDamage(entitydamage.intValue());
                            }
                        } else {

                        }
                    }
                }
            }
        }
    }

}
