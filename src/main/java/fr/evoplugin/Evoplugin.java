package fr.evoplugin;

import fr.evoplugin.commands.CommandDiscord;
import fr.evoplugin.commands.CommandBroadcast;
import fr.evoplugin.commands.CommandRules;
import fr.evoplugin.commands.CommandSite;
import org.bukkit.plugin.java.JavaPlugin;

public final class Evoplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        setCommands();
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
    }
}
