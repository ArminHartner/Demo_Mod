package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blockinit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);
    public static final RegistryObject<Block> METAL_BLOCK = BLOCKS.register("metal_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON, MaterialColor.DIAMOND)
                    .hardnessAndResistance(15.0f, 25.0f)
                    .sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)));
}
