package com.rootedinc.HagozCraft;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEmeraldHoe extends ItemHoe{
	@SideOnly(Side.CLIENT)
	public IIcon itemTexture;

	public ItemEmeraldHoe(ToolMaterial material) {
		super(material);
	}
	
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(basis.modid + ":emeraldHoe");
	}
	
	public Item setFull3D() {
		return this;
	}

}
