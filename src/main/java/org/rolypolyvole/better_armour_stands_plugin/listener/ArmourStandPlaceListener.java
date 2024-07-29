package org.rolypolyvole.better_armour_stands_plugin.listener;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.jetbrains.annotations.NotNull;
import org.rolypolyvole.better_armour_stands_plugin.BetterArmourStandsPlugin;

public class ArmourStandPlaceListener implements Listener {

    private final BetterArmourStandsPlugin plugin;

    public ArmourStandPlaceListener(BetterArmourStandsPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onArmourStandSpawn(@NotNull CreatureSpawnEvent event) {
        if (event.getEntity() instanceof ArmorStand stand) {
            YamlConfiguration configuration = (YamlConfiguration) plugin.getConfig();

            if (configuration.getBoolean("arms")) {
                stand.setArms(true);
            }

            if (configuration.getBoolean("baseplate.baseplate-less-recipe")) {
                stand.setBasePlate(false);
            }
        }
    }
}
