package Events;

import java.util.Arrays;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinPlayerEvent
  implements Listener
{
  @EventHandler
  public void onJoin(PlayerJoinEvent e)
  {
    Player p = e.getPlayer();

    ItemStack Chest = new ItemStack(Material.CHEST, 1);
    ItemMeta ChestM = Chest.getItemMeta();
    ChestM.setDisplayName("§6§lServer Navigator");
    ChestM.setLore(Arrays.asList(new String[] { "§dSelect your Armor and other features" }));
    Chest.setItemMeta(ChestM);

    ItemStack Compass = new ItemStack(Material.COMPASS, 1);
    ItemMeta CompassM = Compass.getItemMeta();
    CompassM.setDisplayName("§6§lServer Selector");
    CompassM.setLore(Arrays.asList(new String[] { "§dSelect What server you wish to join!" }));
    Compass.setItemMeta(CompassM);


    p.getInventory().setItem(8, Chest);
    p.getInventory().setItem(1, Compass);
  }
}