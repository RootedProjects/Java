package com.rootedinc.HagozCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by Hans Goor on 24-4-2014.
 * CopyRight Rooted Inc.
 * DO NOT EDIT THIS CODE WITHOUT PERMISSION OF ROOTED INC.
 */

public class BlockGlassStairs extends Block{
    @SideOnly(Side.CLIENT)
    protected IIcon blockIcon;

    protected BlockGlassStairs(Material material) {
        super(material);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ireg) {
        blockIcon = ireg.registerIcon(basis.modid + ":" + this.getUnlocalizedName().substring(5));
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int i, int x) {
        return blockIcon;
    }
}
