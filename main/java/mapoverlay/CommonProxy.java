package mapoverlay;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.createItems();
    }

    public void init(FMLInitializationEvent e) {  	
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}