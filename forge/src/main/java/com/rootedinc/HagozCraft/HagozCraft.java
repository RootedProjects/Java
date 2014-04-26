package com.rootedinc.HagozCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Hans Goor on 24-4-2014.
 * CopyRight Rooted Inc.
 * DO NOT EDIT THIS CODE WITHOUT PERMISSION OF ROOTED INC.
 */

@Mod(modid = basis.modid, version = basis.version)
public class HagozCraft {
	//Initialization of Tools
	public static ToolMaterial emerald = EnumHelper.addToolMaterial("HagozTools", 3, 1600, 12.F, 9.0F, 22);
	
	public static final Item emeraldSword = new ItemEmeraldSword(emerald).setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName("emeraldSword");
	public static final Item emeraldPickaxe = new ItemEmeraldPickaxe(emerald).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("emeraldPickaxe");
	public static final Item emeraldShovel = new ItemEmeraldShovel(emerald).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("emeraldShovel");
	public static final Item emeraldHoe = new ItemEmeraldHoe(emerald).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("emeraldHoe");
	
	//Initialization of Armour
	public static ArmorMaterial aemerald = EnumHelper.addArmorMaterial("HagozArmor", 40, new int[] {4, 10, 7, 4}, 10);
	
	public static final Item emeraldHat = new ItemEmeraldHat(aemerald, 3, 0).setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName("emeraldHat");
	public static final Item emeraldChest = new ItemEmeraldChest(aemerald, 3, 1).setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName("emeraldChestplate");
	public static final Item emeraldLegs = new ItemEmeraldLegs(aemerald, 3, 2).setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName("emeraldLeggings");
	public static final Item emeraldBoots = new ItemEmeraldBoots(aemerald, 3, 3).setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName("emeraldBoots");

	//Weapons
	public static final Item emeraldBow = new ItemEmeraldBow().setUnlocalizedName("emeraldBow");
	//public static final Item emeraldArrow = new ItemEmeraldArrow().setUnlocalizedName("emeraldArrow");
	
    //Initialization of blocks
    public static final Block glassStairs = new BlockGlassStairs(Material.glass).setHardness(0.3F)
            .setStepSound(Block.soundTypeGlass).setBlockName("glassStairs").setCreativeTab(CreativeTabs.tabBlock);

    //Initialization of items
    public static final Item patat = new ItemPatat(6, 3F, false).setAlwaysEdible().setUnlocalizedName("patat").setCreativeTab(CreativeTabs.tabFood);
    public static final Item rawpatat = new ItemRawPatat(3, 1.5F, false).setAlwaysEdible().setUnlocalizedName("rawpatat").setCreativeTab(CreativeTabs.tabFood);
    public static final Item frituurvet = new ItemFrituur().setUnlocalizedName("frituurvet").setCreativeTab(CreativeTabs.tabFood);

    //ItemStacks
    public static ItemStack frituurveti = new ItemStack(frituurvet, 5);
    public static ItemStack patati = new ItemStack(patat, 1);
    public static ItemStack rawpatati = new ItemStack(rawpatat, 1);
    public static ItemStack glassStairsi = new ItemStack(glassStairs, 3);
    public static ItemStack EmeraldSwordi = new ItemStack(emeraldSword, 1);
    public static ItemStack EmeraldPickaxei = new ItemStack(emeraldPickaxe, 1);
    public static ItemStack EmeraldHati = new ItemStack(emeraldHat, 1);
    public static ItemStack EmeraldShoveli = new ItemStack(emeraldShovel, 1);
    public static ItemStack EmeraldHoei = new ItemStack(emeraldHoe, 1);
    public static ItemStack EmeraldChesti = new ItemStack(emeraldChest, 1);
    public static ItemStack EmeraldLegsi = new ItemStack(emeraldLegs, 1);
    public static ItemStack EmeraldBootsi = new ItemStack(emeraldBoots, 1);
    public static ItemStack EmeraldBowi = new ItemStack(emeraldBow, 1);

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        //Adding items/blocks to game
    	
    	//Blocks
        GameRegistry.registerBlock(glassStairs, "glassStairs");
        
        //Food
        GameRegistry.registerItem(patat, "patat");
        GameRegistry.registerItem(rawpatat, "rawpatat");
        GameRegistry.registerItem(frituurvet, "frituurvet");
        
        //Tools
        GameRegistry.registerItem(emeraldSword, "emeraldSword");
        GameRegistry.registerItem(emeraldPickaxe, "emeraldPickaxe");
        GameRegistry.registerItem(emeraldShovel, "emeraldShovel");
        GameRegistry.registerItem(emeraldHoe, "emeraldHoe");
        
        //Armor
        GameRegistry.registerItem(emeraldHat, "emeraldHat");
        GameRegistry.registerItem(emeraldChest, "emeraldChestplate");
        GameRegistry.registerItem(emeraldLegs, "emeraldLeggings");
        GameRegistry.registerItem(emeraldBoots, "emeraldBoots");
        
        //Weapons
        GameRegistry.registerItem(emeraldBow, "emeraldBow");
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
        GameRegistry.addRecipe(EmeraldSwordi,
                " e ",
                " e ",
                " s ",
                'e', Items.emerald,
                's', Items.stick);
        GameRegistry.addRecipe(EmeraldPickaxei,
        		"eee",
        		" s ",
        		" s ",
        		'e', Items.emerald,
        		's', Items.stick);
        GameRegistry.addRecipe(EmeraldShoveli,
        		" e ",
        		" s ",
        		" s ",
        		'e', Items.emerald,
        		's', Items.stick);
        GameRegistry.addRecipe(EmeraldHoei,
        		"ee ",
        		" s ",
        		" s ",
        		'e', Items.emerald,
        		's', Items.stick);
        GameRegistry.addRecipe(EmeraldHati,
        		"eee",
        		"e e",
        		"   ",
        		'e', Items.emerald);
        GameRegistry.addRecipe(EmeraldChesti,
        		"e e",
        		"eee",
        		"eee",
        		'e', Items.emerald);
        GameRegistry.addRecipe(EmeraldLegsi,
        		"eee",
        		"e e",
        		"e e",
        		'e', Items.emerald);
        GameRegistry.addRecipe(EmeraldBootsi,
        		"   ",
        		"e e",
        		"e e",
        		'e', Items.emerald);
        GameRegistry.addRecipe(EmeraldBowi,
        		"st ",
        		"set",
        		"st ",
        		's', Items.string,
        		't', Items.stick);
        //Smelting recipe's
        GameRegistry.addSmelting(Items.water_bucket, frituurveti, 1F);
        GameRegistry.addSmelting(rawpatat, patati, 1F);
    }
}
