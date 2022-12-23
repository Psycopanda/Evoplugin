package fr.evoplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandDiscord implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player) ) {
            return false;
        }
        Player p = (Player) sender;
        p.sendMessage("§9------------------------------------------------ \n §9§lClique sur le lien pour rejoindre le discord d'Évolium !§r \n\n §n§9https://discord.gg/Cyh3WAr8qj§r \n§9------------------------------------------------");
        return false;
    }
}
