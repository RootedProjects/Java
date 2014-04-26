package com.rootedinc.HagozCraft;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Created by Hans Goor on 25-4-2014.
 * CopyRight Rooted Inc.
 * DO NOT EDIT THIS CODE WITHOUT PERMISSION OF ROOTED INC.
 */

public class ItemFrituur extends Item {
	@SideOnly(Side.CLIENT)
	public IIcon textureIcon;
	
    public void registerIcons(IIconRegister reg) {
    	this.itemIcon = reg.registerIcon(basis.modid + ":frituurvet");
    }
}
