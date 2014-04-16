package com.rootedinc.HDPlugin;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Hans Goor on 13-4-2014.
 * CopyRight Rooted Inc.
 * DO NOT EDIT THIS CODE WITHOUT PERMISSION OF ROOTED INC.
 */

public class Main extends JavaPlugin implements Listener {

    public void onEnable() {

        //Commands
        Commands cmd = new Commands();
        getCommand("hc").setExecutor(cmd);

        //Initialization of onPlayerChat and onPlayerJoin
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Plugin is now enabled!");

        File conf = new File(getDataFolder() + File.separator + "config.yml");
        if(!conf.exists()) {
            this.getLogger().warning("No config file found!");
            this.getLogger().info("Creating one now!");
            ArrayList<String> list = new ArrayList<String>();
            list.add("fuck");
            list.add("tyfus");
            list.add("fucking");
            list.add("fucker");
            list.add("godverdomme");
            list.add("ass");
            getConfig().set("bannedwords", list);
            getConfig().options().copyDefaults(true);
            saveConfig();
        } else {
            getLogger().info("Config file found!");
            getLogger().info("NOT creating a config file!");
        }
    }

    public void onDisable() {
        getLogger().info("Plugin is now disabled!");
    }


    @EventHandler
    public void onPlayerJoin(final PlayerJoinEvent pje) {
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            public void run() {
                Firework f = pje.getPlayer().getWorld().spawn(pje.getPlayer().getLocation(), Firework.class);

                FireworkMeta fm = f.getFireworkMeta();
                fm.addEffect(FireworkEffect.builder()
                        .flicker(false)
                        .trail(true)
                        .with(FireworkEffect.Type.BALL_LARGE)
                        .withColor(Color.YELLOW)
                        .withColor(Color.ORANGE)
                        .withFade(Color.RED)
                        .with(FireworkEffect.Type.BALL)
                        .with(FireworkEffect.Type.STAR)
                        .withFade(Color.PURPLE)
                        .build());
                fm.setPower(2);
                f.setFireworkMeta(fm);
            }
        }, 20);
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        for(String word : e.getMessage().split(" ")) {
            if(getConfig().getStringList("bannedwords").contains(word)) {
                if(!player.hasPermission("HC.bypassSwearDetection")) {
                    e.setMessage("Oh No You Didn't!!");
                    player.sendMessage("Oh boy, Swearing is not allowed in this server!");
                } else {
                    player.sendMessage("I'm watching you, so you better watch out with your swearin'");
                    player.sendMessage("Luckily for you nothing will happen at this time!");
                }
            }
        }
    }

}
