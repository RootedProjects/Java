package com.rootedinc.HagozCraft;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEmeraldLegs extends ItemArmor{
	@SideOnly(Side.CLIENT)
	public IIcon textureIcon;

	public ItemEmeraldLegs(ArmorMaterial material, int p_i45325_2_,
			int p_i45325_3_) {
		super(material, p_i45325_2_, p_i45325_3_);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(basis.modid + ":emeraldLeggings");
	}

}
