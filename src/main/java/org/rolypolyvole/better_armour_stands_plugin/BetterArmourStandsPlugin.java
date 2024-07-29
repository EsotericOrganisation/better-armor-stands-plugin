package org.rolypolyvole.better_armour_stands_plugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.rolypolyvole.better_armour_stands_plugin.listener.ArmourStandBreakListener;
import org.rolypolyvole.better_armour_stands_plugin.listener.ArmourStandPlaceListener;
import org.rolypolyvole.better_armour_stands_plugin.listener.ArmourStandRightClickListener;
import org.rolypolyvole.better_armour_stands_plugin.manager.PoseManager;
import org.rolypolyvole.better_armour_stands_plugin.util.RecipeUtil;

public final class BetterArmourStandsPlugin extends JavaPlugin {

    private PoseManager poseManager;

    private final NamespacedKey baseplateLessArmourStandRecipeKey = new NamespacedKey(this, "baseplate_less_armour_stand");

    public PoseManager getPoseManager() {
        return poseManager;
    }

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        if (!getConfig().getBoolean("plugin-enabled")) {
            onDisable();
            return;
        }

        poseManager = new PoseManager(this);

        PluginManager pluginManager = Bukkit.getPluginManager();

        pluginManager.registerEvents(new ArmourStandPlaceListener(this), this);
        pluginManager.registerEvents(new ArmourStandRightClickListener(this), this);

        if (getConfig().getBoolean("baseplate.baseplate-less-recipe")) {
            pluginManager.registerEvents(new ArmourStandBreakListener(), this);

            RecipeUtil.removeRecipe(Material.ARMOR_STAND);

            ItemStack armourStand = new ItemStack(Material.ARMOR_STAND, 1);

            ShapedRecipe baseplateLessRecipe = new ShapedRecipe(baseplateLessArmourStandRecipeKey, armourStand);
            baseplateLessRecipe.shape("SSS", " S ", "S S");
            baseplateLessRecipe.setIngredient('S', Material.STICK);

            Bukkit.addRecipe(baseplateLessRecipe);
        }
    }
}
