package com.rootedinc.HagozCraft;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEmeraldHat extends ItemArmor{
	@SideOnly(Side.CLIENT)
	public IIcon itemTexture;

	public ItemEmeraldHat(ArmorMaterial amaterial, int p_i45325_2_,
			int p_i45325_3_) {
		super(amaterial, p_i45325_2_, p_i45325_3_);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(basis.modid + ":emeraldHat");
	}
	
	@SideOnly(Side.CLIENT)
	public Item setFull3D(){
		return this;
	}

}
