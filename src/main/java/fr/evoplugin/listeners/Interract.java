package fr.evoplugin.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Interract implements Listener {
    @EventHandler
    public void onInterract(PlayerInteractEvent event){
        Player p = event.getPlayer();
        Action action = event.getAction();
        ItemStack it = event.getItem();
        if(it.getType() == Material.COMPASS){
            p.teleport(spawn);
        }

    }
}
