package com.rootedinc.HagozCraft;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEmeraldShovel extends ItemSpade{
	@SideOnly(Side.CLIENT)
	public IIcon itemTexture;

	public ItemEmeraldShovel(ToolMaterial material) {
		super(material);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(basis.modid + ":emeraldShovel");
	}
	
	@SideOnly(Side.CLIENT)
	public Item setFull3D(){
		return this;
	}

}
