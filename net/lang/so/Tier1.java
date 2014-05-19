package net.lang.so;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Tier1 extends Block {

	@Override
	public boolean isNormalCube() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
	
		return true;
	}

	@Override
	public boolean onBlockActivated(World world, int p_149727_2_,
			int p_149727_3_, int p_149727_4_, EntityPlayer player,
			int p_149727_6_, float x, float y,
			float z) {
	
		player.openGui(Survivalcore.instance, 0, world, (int)player.posX,(int) player.posY, (int)player.posZ);
		return true;
	}

	protected Tier1(Material par1) {
		super(par1);
		 this.setCreativeTab(CreativeTabs.tabTools);

	}
    public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
    {
      
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, .3F, 1.0F);
    }
    public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, .3F, 1.0F);

    }
    public boolean renderAsNormalBlock()
    {
        return false;
    }

}
