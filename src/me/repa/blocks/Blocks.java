package me.repa.blocks;

import java.util.Set;
import java.util.logging.Logger;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.material.Dispenser;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Blocks extends JavaPlugin implements Listener
{
    public Blocks() {}
    public static Logger log = Logger.getLogger("Minecraft");

    public void onEnable() {
        log.info("[BlockBreaker] Plugin Enabled");
        org.bukkit.Bukkit.getPluginManager().registerEvents(this, this);

    }

    public void onReload() {
        log.info("[BlockBreaker] Plugin Reloaded");
    }

    public void onDisable() {
        log.info("[BlockBreaker] Plugin Disabled");
    }

    @EventHandler
    public void onDispense(BlockDispenseEvent bde) {
        if ((bde.getBlock().getType() == Material.DISPENSER) && (contains(bde.getBlock())) && (bde.getItem().getType() == Material.DIAMOND_PICKAXE )) {
            Dispenser dispenser = (Dispenser)bde.getBlock().getState().getData();
            if (bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.BEDROCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.ENDER_PORTAL || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.ENDER_PORTAL_FRAME || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.PORTAL || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.DRAGON_EGG || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.BARRIER) {
                bde.getBlock().getRelative(dispenser.getFacing()).breakNaturally();
                bde.setCancelled(true);
            }
        }
        if ((bde.getBlock().getType() == Material.DISPENSER) && (contains(bde.getBlock())) && (bde.getItem().getType() == Material.IRON_PICKAXE )) {
            Dispenser dispenser = (Dispenser)bde.getBlock().getState().getData();
            if (bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.BEDROCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.ENDER_PORTAL || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.ENDER_PORTAL_FRAME || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.PORTAL || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.DRAGON_EGG || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.BARRIER || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.OBSIDIAN) {
                bde.getBlock().getRelative(dispenser.getFacing()).breakNaturally();
                bde.setCancelled(true);
            }
        }
        if ((bde.getBlock().getType() == Material.DISPENSER) && (contains(bde.getBlock())) && (bde.getItem().getType() == Material.STONE_PICKAXE )) {
            Dispenser dispenser = (Dispenser)bde.getBlock().getState().getData();
            if (bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.BEDROCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.ENDER_PORTAL || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.ENDER_PORTAL_FRAME || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.PORTAL || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.DRAGON_EGG || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.BARRIER || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.OBSIDIAN || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.DIAMOND_BLOCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.EMERALD_BLOCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.GOLD_BLOCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.DIAMOND_ORE || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.EMERALD_ORE || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.GOLD_ORE || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.REDSTONE_ORE) {
                bde.getBlock().getRelative(dispenser.getFacing()).breakNaturally();
                bde.setCancelled(true);
            }
        }
        if ((bde.getBlock().getType() == Material.DISPENSER) && (contains(bde.getBlock())) && (bde.getItem().getType() == Material.WOOD_PICKAXE )) {
            Dispenser dispenser = (Dispenser)bde.getBlock().getState().getData();
            if (bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.BEDROCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.ENDER_PORTAL || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.ENDER_PORTAL_FRAME || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.PORTAL || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.DRAGON_EGG || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.BARRIER || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.OBSIDIAN || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.DIAMOND_BLOCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.EMERALD_BLOCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.GOLD_BLOCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.DIAMOND_ORE || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.EMERALD_ORE || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.GOLD_ORE || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.REDSTONE_ORE || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.IRON_BLOCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.IRON_ORE || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.LAPIS_BLOCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.LAPIS_ORE) {
                bde.getBlock().getRelative(dispenser.getFacing()).breakNaturally();
                bde.setCancelled(true);
            }
        }
        if ((bde.getBlock().getType() == Material.DISPENSER) && (contains(bde.getBlock())) && (bde.getItem().getType() == Material.WOOD_PICKAXE )) {
            Dispenser dispenser = (Dispenser)bde.getBlock().getState().getData();
            if (bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.BEDROCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.ENDER_PORTAL || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.ENDER_PORTAL_FRAME || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.PORTAL || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.DRAGON_EGG || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.BARRIER || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.OBSIDIAN || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.DIAMOND_BLOCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.EMERALD_BLOCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.GOLD_BLOCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.DIAMOND_ORE || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.EMERALD_ORE || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.GOLD_ORE || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.REDSTONE_ORE || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.IRON_BLOCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.IRON_ORE || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.LAPIS_BLOCK || bde.getBlock().getRelative(dispenser.getFacing()).getType() != Material.LAPIS_ORE) {
                bde.getBlock().getRelative(dispenser.getFacing()).breakNaturally();
                bde.setCancelled(true);
            }
        }
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player player = (Player)sender;
        if ((commandLabel.equalsIgnoreCase("blockbreaker")) && (player.hasPermission("blockbreaker.use"))) {
            if ((sender instanceof Player)) {
                Block block = player.getTargetBlock((Set)null, 7);
                if (block.getType() == Material.DISPENSER) {
                    if (contains(block)) {
                        remove(block.getLocation());
                        player.sendMessage("You removed the block breaker!");
                    }
                    else {
                        add(block.getLocation());
                        player.sendMessage("You added a block breaker!");
                    }

                }
                else {
                    player.sendMessage("That block is not a dispenser!");
                }
            }
        }
        else {
            player.sendMessage("You don't have the necessary permissions for that!");
        }
        return false;
    }

    public void add(Location loc) {
        int i = 0;
        while (getConfig().contains(Integer.toString(i)))
            i++;
        getConfig().set(i + ".x", Integer.valueOf(loc.getBlockX()));
        getConfig().set(i + ".y", Integer.valueOf(loc.getBlockY()));
        getConfig().set(i + ".z", Integer.valueOf(loc.getBlockZ()));
        getConfig().set(i + ".w", loc.getWorld().getName());
        saveConfig();
    }

    public void remove(Location loc) {
        if (contains(loc)) {
            for (String string : getConfig().getKeys(false)) {
                if ((loc.getBlockX() == getConfig().getInt(string + ".x")) && (loc.getBlockY() == getConfig().getInt(string + ".y")) && (loc.getBlockZ() == getConfig().getInt(string + ".z")) &&
                        (loc.getWorld().getName().equals(getConfig().getString(string + ".w")))) {
                    getConfig().set(string, null);
                    saveConfig();
                }
            }
        }
    }

    public boolean contains(Block block)
    {
        return contains(block.getLocation());
    }

    public boolean contains(Location loc) {
        for (String string : getConfig().getKeys(false)) {
            if ((loc.getBlockX() == getConfig().getInt(string + ".x")) && (loc.getBlockY() == getConfig().getInt(string + ".y")) && (loc.getBlockZ() == getConfig().getInt(string + ".z")) &&
                    (loc.getWorld().getName().equals(getConfig().getString(string + ".w")))) {
                return true;
            }
        }

        return false;
    }
}
