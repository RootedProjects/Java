package com.rootedinc.HagozCraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Hans Goor on 24-4-2014.
 * CopyRight Rooted Inc.
 * DO NOT EDIT THIS CODE WITHOUT PERMISSION OF ROOTED INC.
 */

@Mod(modid = basis.modid, version = basis.version)
public class HagozCraft {

    //Initialization of blocks
    public static final Block glassStairs = new BlockGlassStairs(Material.glass).setHardness(0.3F)
            .setStepSound(Block.soundTypeGlass).setBlockName("glassStairs").setCreativeTab(CreativeTabs.tabBlock);

    //Initialization of items
    public static final Item patat = new ItemPatat(6, 3F, false).setAlwaysEdible().setUnlocalizedName("patat").setCreativeTab(CreativeTabs.tabFood);
    public static final Item rawpatat = new ItemRawPatat(3, 1.5F, false).setAlwaysEdible().setUnlocalizedName("rawpatat").setCreativeTab(CreativeTabs.tabFood);
    public static final Item frituurvet = new ItemFrituur(2, 1F, false).setUnlocalizedName("frituurvet").setCreativeTab(CreativeTabs.tabFood);
    public static final Item LightningSword = new ItemLightningSword(Item.ToolMaterial.EMERALD).setUnlocalizedName("emeraldsword").setCreativeTab(CreativeTabs.tabCombat).setMaxDamage(18);

    //ItemStacks
    public static ItemStack frituurveti = new ItemStack(frituurvet, 5);
    public static ItemStack patati = new ItemStack(patat, 1);
    public static ItemStack rawpatati = new ItemStack(rawpatat, 1);
    public static ItemStack glassStairsi = new ItemStack(glassStairs, 3);
    public static ItemStack LightningSwordi = new ItemStack(LightningSword, 1);

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        //Adding items/blocks to game
        GameRegistry.registerBlock(glassStairs, "glassStairs");
        GameRegistry.registerItem(patat, "patat");
        GameRegistry.registerItem(rawpatat, "rawpatat");
        GameRegistry.registerItem(frituurvet, "frituurvet");
        GameRegistry.registerItem(LightningSword, "emeraldsword");
    }
    @EventHandler
    public void init(FMLInitializationEvent e) {
        //Crafting recipe's
        GameRegistry.addRecipe(glassStairsi,
                "g  ",
                "gg ",
                "ggg",

                'g', Blocks.glass);
        GameRegistry.addRecipe(rawpatati,
                "   ",
                " p ",
                "fff",

                'f', frituurvet,
                'p', Items.potato);
        GameRegistry.addRecipe(LightningSwordi,
                " e ",
                " e ",
                " s ",
                'e', Items.emerald,
                's', Items.stick);
        //Smelting recipe's
        GameRegistry.addSmelting(Items.water_bucket, frituurveti, 1F);
        GameRegistry.addSmelting(rawpatat, patati, 1F);
    }
}
