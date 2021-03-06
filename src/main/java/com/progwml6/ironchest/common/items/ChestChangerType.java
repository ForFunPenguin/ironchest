/*******************************************************************************
 * Copyright (c) 2012 cpw.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * <p>
 * Contributors:
 * cpw - initial API and implementation
 ******************************************************************************/
package com.progwml6.ironchest.common.items;

import com.progwml6.ironchest.common.blocks.ChestType;
import com.progwml6.ironchest.common.util.ItemNames;
import net.minecraft.util.ResourceLocation;

import static com.progwml6.ironchest.common.blocks.ChestType.COPPER;
import static com.progwml6.ironchest.common.blocks.ChestType.CRYSTAL;
import static com.progwml6.ironchest.common.blocks.ChestType.DIAMOND;
import static com.progwml6.ironchest.common.blocks.ChestType.GOLD;
import static com.progwml6.ironchest.common.blocks.ChestType.IRON;
import static com.progwml6.ironchest.common.blocks.ChestType.OBSIDIAN;
import static com.progwml6.ironchest.common.blocks.ChestType.SILVER;
import static com.progwml6.ironchest.common.blocks.ChestType.WOOD;

public enum ChestChangerType
{
    //@formatter:off
    IRON_GOLD(IRON, GOLD, ItemNames.IRON_GOLD_UPGRADE),
    GOLD_DIAMOND(GOLD, DIAMOND, ItemNames.GOLD_DIAMOND_UPGRADE),
    COPPER_SILVER(COPPER, SILVER, ItemNames.COPPER_SILVER_UPGRADE),
    SILVER_GOLD(SILVER, GOLD, ItemNames.SILVER_GOLD_UPGRADE),
    COPPER_IRON(COPPER, IRON, ItemNames.COPPER_IRON_UPGRADE),
    DIAMOND_CRYSTAL(DIAMOND, CRYSTAL, ItemNames.DIAMOND_CRYSTAL_UPGRADE),
    WOOD_IRON(WOOD, IRON, ItemNames.WOOD_IRON_UPGRADE),
    WOOD_COPPER(WOOD, COPPER, ItemNames.WOOD_COPPER_UPGRADE),
    DIAMOND_OBSIDIAN(DIAMOND, OBSIDIAN, ItemNames.DIAMOND_OBSIDIAN_UPGRADE);
    //@formatter:on

    public final ChestType source;

    public final ChestType target;

    public final ResourceLocation itemName;

    ChestChangerType(ChestType source, ChestType target, String itemName)
    {
        this.source = source;
        this.target = target;
        this.itemName = new ResourceLocation(itemName);
    }

    public boolean canUpgrade(ChestType from)
    {
        return from == this.source;
    }
}
