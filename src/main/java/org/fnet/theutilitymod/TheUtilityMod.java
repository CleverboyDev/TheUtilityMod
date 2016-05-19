package org.fnet.theutilitymod;

import org.fnet.theutilitymod.blocks.SapphireOre;
import org.fnet.theutilitymod.creativeTabs.UtilityTab;
import org.fnet.theutilitymod.items.Sapphire;
import org.fnet.theutilitymod.items.SapphireSword;
import org.fnet.theutilitymod.proxies.ServerProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = TheUtilityMod.MODID, version = "1.0", name = "The Utility Mod")
public class TheUtilityMod {
	
	public static final String MODID = "theutilitymod";

	@SidedProxy(clientSide = "org.fnet.theutilitymod.proxies.ClientProxy", serverSide = "org.fnet.theutilitymod.proxies.ServerProxy")
	public static ServerProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		UtilityTab tab = null;
		
		SapphireSword sapphireSword = new SapphireSword();
		SapphireOre sapphireOre = new SapphireOre();
		Sapphire sapphire = new Sapphire();
		
		tab = new UtilityTab(sapphireSword);

		sapphireSword.setCreativeTab(tab);
		sapphireOre.setCreativeTab(tab);
		sapphire.setCreativeTab(tab);
		
		GameRegistry.registerItem(sapphireSword, sapphireSword.getUnlocalizedName());
		GameRegistry.registerBlock(sapphireOre, sapphireOre.getUnlocalizedName());
		
		proxy.registerRenderInfo();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

}
