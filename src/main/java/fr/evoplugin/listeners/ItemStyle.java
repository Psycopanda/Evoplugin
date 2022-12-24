package fr.evoplugin.listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.Arrays;
import java.util.Collections;

public class ItemStyle implements Listener {
    @EventHandler
    /*public void onJoin(PlayerJoinEvent event){
        Player p = event.getPlayer();
        p.getInventory().clear();
        ItemStack customsword = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta customM = customsword.getItemMeta();
        customM.setDisplayName("§4Mon épée custom");
        customM.setLore(Arrays.asList("Epée pour détruire Avenir en PVP", "Elle est super forte"));
        customM.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
        customsword.setItemMeta(customM);
        p.getInventory().setItemInOffHand(customsword);
        p.updateInventory();
    }*/
    public void onJoin (PlayerJoinEvent event){
        Player p = event.getPlayer();
        p.getInventory().clear();
        ItemStack boule_de_feu = new ItemStack(Material.FIRE_CHARGE, 40);
        ItemMeta boule_M = boule_de_feu.getItemMeta();
        boule_M.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        boule_M.setDisplayName("Boule de Feu de Lancelot");
        boule_M.setLore(Arrays.asList("Elle est forte ....", "Très forte donc attention ;)"));
        boule_de_feu.setItemMeta(boule_M);
        p.getInventory().setItem(4, boule_de_feu);
        ItemStack or = new ItemStack(Material.GOLD_INGOT, 11);
        ItemMeta orM = or.getItemMeta();
        orM.setDisplayName("De l'or....");
        orM.setLore(Arrays.asList("Ce que tu n'auras jamais... Malheureusement ..."));
        or.setItemMeta(orM);
        ItemStack diamant = new ItemStack(Material.DIAMOND, 1);
        ItemMeta diamantM = diamant.getItemMeta();
        diamantM.setDisplayName("§fDiamant");
        diamantM.setLore(Arrays.asList("§f§lCOMMUN"));
        diamantM.addItemFlags(ItemFlag.values());
        diamant.setItemMeta(diamantM);
        p.getInventory().setItem(0, diamant);
        p.getInventory().setHelmet(or);
        p.updateInventory();
    }
}
