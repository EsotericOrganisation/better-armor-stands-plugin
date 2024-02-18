package org.rolypolyvole.armourstandarms.listener;

import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.jetbrains.annotations.NotNull;

public class ArmourStandPlaceListener implements Listener {
    @EventHandler
    public void onArmourStandSpawn(@NotNull CreatureSpawnEvent event) {
        if (event.getEntity() instanceof ArmorStand stand) {
            stand.setArms(true);
            stand.setBasePlate(false);
        }
    }
}
