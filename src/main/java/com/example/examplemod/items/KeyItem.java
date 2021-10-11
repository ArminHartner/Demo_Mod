package com.example.examplemod.items;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class KeyItem extends Item {

    public KeyItem() {
        super(new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS).addToolType(ToolType.PICKAXE,100).addToolType(ToolType.AXE,100));

    }

}
