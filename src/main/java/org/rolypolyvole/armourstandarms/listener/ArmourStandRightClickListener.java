package org.rolypolyvole.armourstandarms.listener;

import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.jetbrains.annotations.NotNull;

public class ArmourStandRightClickListener implements Listener {
    @EventHandler
    public void onArmourStandClicked(@NotNull PlayerInteractAtEntityEvent event) {
        Player player = event.getPlayer();

        if (!(event.getRightClicked() instanceof ArmorStand stand)) return;
        if (!player.isSneaking()) return;

        if (player.getInventory().getItemInMainHand().getType().equals(Material.SMOOTH_STONE_SLAB)) {
            stand.setBasePlate(true);
            player.getInventory().setItemInMainHand(null);

            event.setCancelled(true);
            return;
        }

        event.setCancelled(true);
    }
}
