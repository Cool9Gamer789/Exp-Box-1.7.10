package net.Jack_Black12.expbox.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemExpBox extends Item {
    public ItemExpBox() {
        // Start parrent class
        super();

        // Set the UnlocalizedName
        this.setUnlocalizedName("expbox");

        // Set the texture name
        this.setTextureName("expbox:expbox-green");

        // Set the item inside the creative tab in tools
        this.setCreativeTab(CreativeTabs.tabTools);

        // Make it so you can only hold 1 expbox
        this.setMaxStackSize(1);
    }
    @Override
    public ItemStack onItemRightClick (ItemStack stack, World world, EntityPlayer player) {
        // Check if on server side
        if (!world.isRemote) {
            player.addExperience(89);
        }
        // Return the expbox unchanged
        return stack;
    }
}
