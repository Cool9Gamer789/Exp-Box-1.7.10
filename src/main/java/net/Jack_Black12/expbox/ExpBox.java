package net.Jack_Black12.expbox;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.Jack_Black12.expbox.item.ItemExpBox;

@Mod(modid = ExpBox.MODID, version = ExpBox.VERSION)
public class ExpBox
{
    public static final String MODID = "expbox";
    public static final String VERSION = "1.0";

    // Declare the item field
    public static ItemExpBox expBoxItem;

    @EventHandler
    public void init(FMLPreInitializationEvent event) {
        // Register items in preInit phase
        expBoxItem = new ItemExpBox();
        GameRegistry.registerItem(expBoxItem, expBoxItem.getUnlocalizedName());
    }
}
