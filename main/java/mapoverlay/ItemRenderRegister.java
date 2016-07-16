package mapoverlay;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public final class ItemRenderRegister {

	public static String modid = "mapoverlay";
	
	public static void registerItemRenderer() {		
	    register(ModItems.tutorialItem);
	}

	public static void register(Item item) {
		ModelLoader.setCustomModelResourceLocation ( item, 0, new ModelResourceLocation("mapoverlay:item/tutorial_item", "inventory") );
	}
}