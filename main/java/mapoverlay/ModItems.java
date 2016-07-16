package mapoverlay;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

    public static Item tutorialItem;

    public static final void createItems() {
    	Item tutorialItem = new BasicItem("tutorial_item");
    	tutorialItem.setRegistryName("tutorial_item");
    	GameRegistry.register(tutorialItem);
    }

}
