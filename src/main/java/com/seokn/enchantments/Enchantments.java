package com.seokn.enchantments;

import org.bukkit.plugin.java.JavaPlugin;

public final class Enchantments extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Hello!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Bye!");
    }
}
