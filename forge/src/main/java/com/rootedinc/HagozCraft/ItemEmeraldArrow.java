package com.rootedinc.HagozCraft;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEmeraldArrow extends EntityArrow{
	@SideOnly(Side.CLIENT)
	public IIcon iconTexture;

	public ItemEmeraldArrow(World par1World) {
		super(par1World);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.iconTexture = reg.registerIcon(basis.modid + ":emeraldArrow");
	}

}
