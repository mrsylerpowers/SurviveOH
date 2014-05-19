package net.lang.so;

import net.lang.so.proxy.ClientProxy;

import net.lang.so.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid="Survivalcore", name="Survival Overhaul", version="1.0 Alpha")

public class Survivalcore {

        // The instance of mod
        @Instance(value = "Survivalcore")
        public static Survivalcore instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="net.lang.so.proxy.ClientProxy", serverSide="net.lang.so.proxy.CommonProxy")
        public static CommonProxy proxy;

	
        
        //Main loader for FML
        @EventHandler 
        public void load(FMLInitializationEvent event) {
        	NetworkRegistry.INSTANCE.registerGuiHandler(this, new ClientProxy());
                proxy.registerRenderers();
                Block tier1= new Tier1(Material.sponge).setBlockTextureName("");
				GameRegistry.registerBlock(tier1, "Tier one Crafting");
        }
        
      
}
