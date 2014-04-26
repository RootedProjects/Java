package com.rootedinc.HagozCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.util.IIcon;

/**
 * Created by Hans Goor on 25-4-2014.
 * CopyRight Rooted Inc.
 * DO NOT EDIT THIS CODE WITHOUT PERMISSION OF ROOTED INC.
 */

public class ItemPatat extends ItemFood{
	@SideOnly(Side.CLIENT)
	public IIcon textureIcon;
	
    public ItemPatat(int i, float v, boolean b) {
        super(i, v, b);
    }
    
    public void registerIcons(IIconRegister reg) {
    	this.itemIcon = reg.registerIcon(basis.modid + ":patat");
    }
}
