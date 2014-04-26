package com.rootedinc.HagozCraft;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEmeraldBow extends ItemBow {
	@SideOnly(Side.CLIENT)
	public IIcon itemTexture;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(basis.modid + ":emeraldBow");
	}
	
	public Item setFull3D() {
		return this;
	}

}
