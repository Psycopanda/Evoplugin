package fr.evoplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CommandBroadcast implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§2[Alerte]: Veuillez écrire un message !");
        }
        else {
            String message = String.join(" ", args);
            message = message.toUpperCase();
            Bukkit.broadcastMessage("§4§l[ANNONCE]: " + message);
        }
        return false;
    }
}
