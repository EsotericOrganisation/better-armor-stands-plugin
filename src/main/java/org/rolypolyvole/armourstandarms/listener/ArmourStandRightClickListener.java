package org.rolypolyvole.armourstandarms.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.jetbrains.annotations.NotNull;
import org.rolypolyvole.armourstandarms.BetterArmourStandsPlugin;
import org.rolypolyvole.armourstandarms.manager.PoseManager;

public class ArmourStandRightClickListener implements Listener {

    private final BetterArmourStandsPlugin plugin;

     public ArmourStandRightClickListener(BetterArmourStandsPlugin plugin) {
         this.plugin = plugin;
     }

    @EventHandler
    public void onArmourStandClick(@NotNull PlayerInteractAtEntityEvent event) {
        Player player = event.getPlayer();

        if (!(event.getRightClicked() instanceof ArmorStand stand)) return;
        if (!player.isSneaking()) return;

        PlayerInventory inventory = player.getInventory();
        ItemStack mainHandItem = inventory.getItemInMainHand();
        Material itemMaterial = mainHandItem.getType();

        if (itemMaterial.equals(Material.AIR)) {
            PoseManager poseManager = plugin.getPoseManager();

            int poseIndex = poseManager.getPoseIndex(stand) % poseManager.getPoses().size();

            Bukkit.getLogger().info("poseIndex = " + poseIndex);

            poseManager.setPose(stand, (poseIndex + 1) % poseManager.getPoses().size());
        } else if (itemMaterial.equals(Material.SMOOTH_STONE_SLAB)) {
            stand.setBasePlate(true);
            inventory.setItemInMainHand(null);

            return;
        }

        event.setCancelled(true);
    }
}
