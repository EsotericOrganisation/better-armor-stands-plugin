package org.rolypolyvole.armourstandarms;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;
import org.rolypolyvole.armourstandarms.classes.PoseManager;

public final class ArmourStandArms extends JavaPlugin implements Listener {
    private final NamespacedKey key = new NamespacedKey(this, "pose");
    private final PersistentDataType<Integer, Integer> intType = PersistentDataType.INTEGER;

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onArmourStandSpawn(CreatureSpawnEvent event) {
        if (event.getEntity() instanceof ArmorStand stand) {
            stand.setArms(true);
            stand.setBasePlate(false);

            PersistentDataContainer pdc = stand.getPersistentDataContainer();
            pdc.set(key, PersistentDataType.INTEGER, 0);
        }
    }

    @EventHandler
    public void onArmourStandClicked(PlayerInteractAtEntityEvent event) {
        Player player = event.getPlayer();

        if (!(event.getRightClicked() instanceof ArmorStand stand)) return;
        if (!player.isSneaking()) return;

        if (player.getInventory().getItemInMainHand().getType().equals(Material.SMOOTH_STONE_SLAB)) {
            stand.setBasePlate(true);
            player.getInventory().setItemInMainHand(null);

            event.setCancelled(true);
            return;
        }

        PersistentDataContainer pdc = stand.getPersistentDataContainer();

        if (pdc.has(key, intType)) {
            Integer pose = pdc.get(key, intType);

            if (pose != null) {
                PoseManager.setPoseByInt(stand, pose);
                pdc.set(key, intType, pose == 12 ? 0 : pose + 1);
            } else {
                PoseManager.setPoseByInt(stand, 0);
                pdc.set(key, intType, 0);
            }

            stand.getWorld().playSound(stand.getLocation(), Sound.ENTITY_ITEM_FRAME_ROTATE_ITEM, 1.0F, 1.0F);
        } else {
            pdc.set(key, intType, 0);
        }

        event.setCancelled(true);
    }
}
