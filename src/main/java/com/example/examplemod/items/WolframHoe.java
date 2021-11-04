package com.example.examplemod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class WolframHoe extends Item {

    public WolframHoe() {
        super(new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS).addToolType(ToolType.HOE,2));
    }
}
