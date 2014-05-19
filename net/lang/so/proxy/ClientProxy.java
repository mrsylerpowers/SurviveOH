package net.lang.so.proxy;

import net.lang.so.crafting.T1craftGUI;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ClientProxy extends CommonProxy {
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x,
			int y, int z) {
	
			switch (ID) {
			case 0: //GUI
				return new T1craftGUI(player.inventory, world);
			
			default: 
				return null;
				
			}
			
	}

	@Override
	public void registerRenderers() {
		// This is for rendering entities and so forth later on
	}

}