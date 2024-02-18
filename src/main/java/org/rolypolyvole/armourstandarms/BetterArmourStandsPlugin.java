package org.rolypolyvole.armourstandarms;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.rolypolyvole.armourstandarms.listener.ArmourStandPlaceListener;
import org.rolypolyvole.armourstandarms.listener.ArmourStandRightClickListener;
import org.rolypolyvole.armourstandarms.manager.PoseManager;

import java.util.Iterator;

public final class BetterArmourStandsPlugin extends JavaPlugin {

    private PoseManager poseManager;

    public PoseManager getPoseManager() {
        return poseManager;
    }

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        if (!getConfig().getBoolean("enabled")) {
            onDisable();
            return;
        }

        poseManager = new PoseManager(this);

        PluginManager pluginManager = Bukkit.getPluginManager();

        pluginManager.registerEvents(new ArmourStandPlaceListener(), this);

        pluginManager.registerEvents(new ArmourStandRightClickListener(this), this);

        ItemStack armourStand = new ItemStack(Material.ARMOR_STAND, 1);
        NamespacedKey recipeKey = new NamespacedKey(this, "baseplateless_armour_stand");

        ShapedRecipe shapedRecipe = new ShapedRecipe(recipeKey, armourStand);
        shapedRecipe.shape("SSS", " S ", "S S");
        shapedRecipe.setIngredient('S', Material.STICK);

        Bukkit.addRecipe(shapedRecipe);

        Iterator<Recipe> recipeIterator = getServer().recipeIterator();
        while (recipeIterator.hasNext()) {
            Recipe recipe = recipeIterator.next();
        }
    }
}
