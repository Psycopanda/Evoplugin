package fr.evoplugin;

import fr.evoplugin.commands.*;
import fr.evoplugin.listeners.Interract;
import fr.evoplugin.listeners.ItemStyle;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
public final class Evoplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        setCommands();
        setListeners();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public void setCommands(){
        getCommand("broadcast").setExecutor(new CommandBroadcast());
        getCommand("discord").setExecutor(new CommandDiscord());
        getCommand("site").setExecutor(new CommandSite());
        getCommand("rules").setExecutor(new CommandRules());
        getCommand("spawn").setExecutor(new CommandSpawn());
    }
    public void setListeners(){
        getServer().getPluginManager().registerEvents((Listener) new ItemStyle(), this);
        getServer().getPluginManager().registerEvents((Listener) new Interract(), this);
    }
}
