package Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ItemMoveEvent
  implements Listener
{
  @EventHandler
  public void MoveI1tem(InventoryClickEvent e)
  {
    if (!e.getWhoClicked().hasPermission("quantekk.ignore"))
    {
      e.setCancelled(true);
    }
  }
}