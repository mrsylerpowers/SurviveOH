package net.lang.so.proxy;

import cpw.mods.fml.common.network.IGuiHandler;
import net.lang.so.crafting.T1craftContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CommonProxy implements IGuiHandler {
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x,int y, int z) {
		return null;
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x,
			int y, int z) {
	
	
			switch (ID) {
			case 0:
				return new T1craftContainer(player.inventory, world);
				default:
					return null;
			}
		
		
	}

	public void registerRenderers() {
		// TODO:Render Nothing
	}
}