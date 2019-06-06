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
package cpw.mods.ironchest.common.tileentity.shulker;

import cpw.mods.ironchest.common.blocks.shulker.IronShulkerBoxType;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.datafix.FixTypes;
import net.minecraft.util.datafix.walkers.ItemStackDataLists;

import javax.annotation.Nullable;

public class TileEntityGoldShulkerBox extends TileEntityIronShulkerBox
{
    public TileEntityGoldShulkerBox()
    {
        this(null);
    }

    public TileEntityGoldShulkerBox(@Nullable EnumDyeColor colorIn)
    {
        super(colorIn, IronShulkerBoxType.GOLD);
    }

    public static void registerFixesShulkerBox(DataFixer fixer)
    {
        fixer.registerWalker(FixTypes.BLOCK_ENTITY, new ItemStackDataLists(TileEntityGoldShulkerBox.class, new String[] { "Items" }));
    }
}
