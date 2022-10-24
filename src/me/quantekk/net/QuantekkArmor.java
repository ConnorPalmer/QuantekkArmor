package me.quantekk.net;

import ArmorContent.ArmorContent;
import Events.ChestClickEvent;
import Events.ItemMoveEvent;
import Events.JoinPlayerEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class QuantekkArmor extends JavaPlugin
{
  @EventHandler
  public void onEnable()
  {
    PluginManager pm = getServer().getPluginManager();

    pm.registerEvents(new ArmorContent(), this);
    pm.registerEvents(new ChestClickEvent(), this);
    pm.registerEvents(new ItemMoveEvent(), this);
    pm.registerEvents(new JoinPlayerEvent(), this);

    System.out.println("[" + getDescription().getName() + "]" + " =================================================");
    System.out.println("[" + getDescription().getName() + "]" + " ");
    System.out.println("[" + getDescription().getName() + "]" + " Has started successfully.");
    System.out.println("[" + getDescription().getName() + "]" + " ");
    System.out.println("[" + getDescription().getName() + "]" + " =================================================");
    System.out.println("[" + getDescription().getName() + "]" + " ");
    System.out.println("[" + getDescription().getName() + "]" + " Programmer: " + getDescription().getAuthors());
    System.out.println("[" + getDescription().getName() + "]" + " Version: " + getDescription().getVersion());
    System.out.println("[" + getDescription().getName() + "]" + " Website: " + getDescription().getWebsite());
    System.out.println("[" + getDescription().getName() + "]" + " ");
    System.out.println("[" + getDescription().getName() + "]" + " =================================================");
  }

  @EventHandler
  public void onDisable() {
    System.out.println("[" + getDescription().getName() + "]" + " =================================================");
    System.out.println("[" + getDescription().getName() + "]" + " ");
    System.out.println("[" + getDescription().getName() + "]" + " Was stopped successfully.");
    System.out.println("[" + getDescription().getName() + "]" + " ");
    System.out.println("[" + getDescription().getName() + "]" + " =================================================");
    System.out.println("[" + getDescription().getName() + "]" + " ");
    System.out.println("[" + getDescription().getName() + "]" + " Programmer: " + getDescription().getAuthors());
    System.out.println("[" + getDescription().getName() + "]" + " Version: " + getDescription().getVersion());
    System.out.println("[" + getDescription().getName() + "]" + " Website: " + getDescription().getWebsite());
    System.out.println("[" + getDescription().getName() + "]" + " ");
    System.out.println("[" + getDescription().getName() + "]" + " =================================================");
  }
}