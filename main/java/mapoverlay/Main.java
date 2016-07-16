package mapoverlay;

import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.*;

@Mod
	(
		modid						= "mapoverlay",
		name						= "Map Overlay",
		version						= "0.0",
		dependencies 				= "",
		acceptedMinecraftVersions	= ""
	)

public class Main {
	@Mod.Instance (value = "Map Overlay")
	public static Main instance;
	
	@SidedProxy(clientSide="mapoverlay.ClientProxy", serverSide="mapoverlay.ServerProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInitialize (FMLPreInitializationEvent event) {
	    proxy.preInit(event);
	}
	
	@Mod.EventHandler
	public void initialize (FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@Mod.EventHandler
	public void postInitialization (FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
