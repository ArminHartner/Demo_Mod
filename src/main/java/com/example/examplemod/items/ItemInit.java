package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.init.Blockinit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    //register items:
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("key_item", () -> new KeyItem());
    public static final RegistryObject<Item> WOLFRAM_HOE = ITEMS.register("wolfram_hoe_item", () -> new WolframHoe());

    //registre blocks;
    public static final RegistryObject<BlockItem> METAL_BLOCK =
            ITEMS.register("metal_block",
                    () -> new BlockItem(Blockinit.METAL_BLOCK.get(),
                            new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
