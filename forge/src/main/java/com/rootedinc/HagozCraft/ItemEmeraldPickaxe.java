package com.rootedinc.HagozCraft;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEmeraldPickaxe extends ItemPickaxe{
	@SideOnly(Side.CLIENT)
	public IIcon itemTexture;

	protected ItemEmeraldPickaxe(ToolMaterial material) {
		super(material);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(basis.modid + ":emeraldPickaxe");
	}
	
	public Item setFull3D(){
		return this;
	}

}
