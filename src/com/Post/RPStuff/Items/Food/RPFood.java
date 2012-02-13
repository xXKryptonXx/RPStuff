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

package com.Post.RPStuff.Items.Food;

import com.Post.RPStuff.RPStuff;
import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.item.GenericCustomItem;
import org.getspout.spoutapi.player.SpoutPlayer;

public class RPFood extends GenericCustomItem {
    RPStuff plugin;
    protected int foodAmount;
    protected int healingAmount;

    public RPFood(RPStuff plugin, String name, String image) {
        super(plugin, name, image);
        this.plugin = plugin;
    }

    public void consume(SpoutPlayer player) {
        if (player.getItemInHand().getAmount() == 1) {
            player.setItemInHand(null);
        } else {
            player.getItemInHand().setAmount(player.getItemInHand().getAmount() - 1);
        }
    }

    @Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {

        if (player.getFoodLevel() != 20 || player.getHealth() != 20) {
            if (player.getFoodLevel() != 20 && foodAmount != 0) {
                player.setFoodLevel(player.getFoodLevel() + foodAmount);

                if (player.getFoodLevel() > 20) {
                    player.setFoodLevel(20);
                }
            } else if (player.getHealth() != 20 && healingAmount != 0) {
                player.setHealth(player.getHealth() + healingAmount);

                if (player.getHealth() > 20) {
                    player.setHealth(20);
                }
            }
            consume(player);
            return true;
        } else {
            return false;
        }
    }
}
