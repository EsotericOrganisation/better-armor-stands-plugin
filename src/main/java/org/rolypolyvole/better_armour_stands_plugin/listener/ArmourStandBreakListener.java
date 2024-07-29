package org.rolypolyvole.better_armour_stands_plugin.listener;

import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ArmourStandBreakListener implements Listener {

    @EventHandler
    public void onArmourStandBreak(@NotNull EntityDeathEvent event) {
        if (event.getEntity() instanceof ArmorStand stand && stand.hasBasePlate()) {
            ItemStack smoothStoneSlab = new ItemStack(Material.SMOOTH_STONE_SLAB, 1);

            stand.getWorld().dropItemNaturally(stand.getLocation(), smoothStoneSlab);
        }
    }
}
