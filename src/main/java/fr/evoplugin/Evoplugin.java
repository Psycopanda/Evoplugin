package fr.evoplugin;

import fr.evoplugin.commands.CommandDiscord;
import fr.evoplugin.commands.CommandBroadcast;
import fr.evoplugin.commands.CommandRules;
import fr.evoplugin.commands.CommandSite;
import org.bukkit.plugin.java.JavaPlugin;

public final class Evoplugin extends JavaPlugin {
    //Création de l'instance
    private static EvoPlugin INSTANCE;
    
    @Override
    public void onEnable() {
        System.out.println("Salut je démarre");
        setCommands();
    }

    @Override
    public void onDisable() {
        System.out.println("Salut je m'en vais dans les tréfons des plugins éteins");
    }
    public void setCommands(){
        getCommand("broadcast").setExecutor(new CommandBroadcast());
        getCommand("discord").setExecutor(new CommandDiscord());
        getCommand("site").setExecutor(new CommandSite());
        getCommand("rules").setExecutor(new CommandRules());
    }
    //Retour de l'instance
    public static EvoPlugin getInstance(){
        return INSTANCE;
    }
}
