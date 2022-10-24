package Events;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ChestClickEvent
  implements Listener
{
  private Inventory inv = null;

  @EventHandler
  public void onPlayerInteract(PlayerInteractEvent e)
  {
    ItemStack GreenHelm = new ItemStack(Material.LEATHER_HELMET);
    LeatherArmorMeta GreenHelmM = (LeatherArmorMeta)GreenHelm.getItemMeta();
    GreenHelmM.setColor(Color.GREEN);
    GreenHelmM.setDisplayName("§2§lGreen Helm");
    GreenHelm.setItemMeta(GreenHelmM);

    ItemStack GreenChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
    LeatherArmorMeta GreenChestplateM = (LeatherArmorMeta)GreenChestplate.getItemMeta();
    GreenChestplateM.setColor(Color.GREEN);
    GreenChestplateM.setDisplayName("§2§lGreen Chestplate");
    GreenChestplate.setItemMeta(GreenChestplateM);

    ItemStack GreenLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    LeatherArmorMeta GreenLeggingsM = (LeatherArmorMeta)GreenLeggings.getItemMeta();
    GreenLeggingsM.setColor(Color.GREEN);
    GreenLeggingsM.setDisplayName("§2§lGreen Leggings");
    GreenLeggings.setItemMeta(GreenLeggingsM);

    ItemStack GreenBoots = new ItemStack(Material.LEATHER_BOOTS);
    LeatherArmorMeta GreenBootsM = (LeatherArmorMeta)GreenBoots.getItemMeta();
    GreenBootsM.setColor(Color.GREEN);
    GreenBootsM.setDisplayName("§2§lGreen Boots");
    GreenBoots.setItemMeta(GreenBootsM);

    ItemStack BlueHelm = new ItemStack(Material.LEATHER_HELMET);
    LeatherArmorMeta BlueHelmM = (LeatherArmorMeta)BlueHelm.getItemMeta();
    BlueHelmM.setColor(Color.NAVY);
    BlueHelmM.setDisplayName("§b§lBlue Helm");
    BlueHelm.setItemMeta(BlueHelmM);

    ItemStack BlueChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
    LeatherArmorMeta BlueChestplateM = (LeatherArmorMeta)BlueChestplate.getItemMeta();
    BlueChestplateM.setColor(Color.NAVY);
    BlueChestplateM.setDisplayName("§b§lBlue Chestplate");
    BlueChestplate.setItemMeta(BlueChestplateM);

    ItemStack BlueLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    LeatherArmorMeta BlueLeggingsM = (LeatherArmorMeta)BlueLeggings.getItemMeta();
    BlueLeggingsM.setColor(Color.NAVY);
    BlueLeggingsM.setDisplayName("§b§lBlue Leggings");
    BlueLeggings.setItemMeta(BlueLeggingsM);

    ItemStack BlueBoots = new ItemStack(Material.LEATHER_BOOTS);
    LeatherArmorMeta BlueBootsM = (LeatherArmorMeta)BlueBoots.getItemMeta();
    BlueBootsM.setColor(Color.NAVY);
    BlueBootsM.setDisplayName("§b§lBlue Boots");
    BlueBoots.setItemMeta(BlueBootsM);

    ItemStack RedHelm = new ItemStack(Material.LEATHER_HELMET);
    LeatherArmorMeta RedHelmM = (LeatherArmorMeta)RedHelm.getItemMeta();
    RedHelmM.setColor(Color.RED);
    RedHelmM.setDisplayName("§c§lRed Helm");
    RedHelm.setItemMeta(RedHelmM);

    ItemStack RedChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
    LeatherArmorMeta RedChestplateM = (LeatherArmorMeta)RedChestplate.getItemMeta();
    RedChestplateM.setColor(Color.RED);
    RedChestplateM.setDisplayName("§c§lRed Chestplate");
    RedChestplate.setItemMeta(RedChestplateM);

    ItemStack RedLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    LeatherArmorMeta RedLeggingsM = (LeatherArmorMeta)RedLeggings.getItemMeta();
    RedLeggingsM.setColor(Color.RED);
    RedLeggingsM.setDisplayName("§c§lRed Leggings");
    RedLeggings.setItemMeta(RedLeggingsM);

    ItemStack RedBoots = new ItemStack(Material.LEATHER_BOOTS);
    LeatherArmorMeta RedBootsM = (LeatherArmorMeta)RedBoots.getItemMeta();
    RedBootsM.setColor(Color.RED);
    RedBootsM.setDisplayName("§c§lRed Boots");
    RedBoots.setItemMeta(RedBootsM);

    ItemStack Paper = new ItemStack(Material.PAPER, 1);
    ItemMeta PaperM = Paper.getItemMeta();
    PaperM.setDisplayName("§6§lNo Armor");
    Paper.setItemMeta(PaperM);

    ItemStack EnchantmentTable = new ItemStack(Material.ENCHANTMENT_TABLE, 1);
    ItemMeta EnchantmentTableM = EnchantmentTable.getItemMeta();
    EnchantmentTableM.setDisplayName("§e§lLinks");
    EnchantmentTable.setItemMeta(EnchantmentTableM);

    ItemStack Enderchest = new ItemStack(Material.ENDER_CHEST, 1);
    ItemMeta EnderchestM = Enderchest.getItemMeta();
    EnderchestM.setDisplayName("§a§lServers");
    Enderchest.setItemMeta(EnderchestM);

    ItemStack Bone = new ItemStack(Material.BONE, 1);
    ItemMeta BoneM = Bone.getItemMeta();
    BoneM.setDisplayName("§b§lExit Menu");
    Bone.setItemMeta(BoneM);

    ItemStack Iron = new ItemStack(Material.BONE, 1);
    ItemMeta IronM = Iron.getItemMeta();
    IronM.setDisplayName("§b§lExit Menu");
    Iron.setItemMeta(IronM);

    Player p = e.getPlayer();

    if ((((e.getAction() == Action.RIGHT_CLICK_AIR ? 1 : 0) | (e.getAction() == Action.RIGHT_CLICK_BLOCK ? 1 : 0)) != 0) && 
      (e.getMaterial().equals(Material.CHEST)))
    {
      p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);

      this.inv = p.getPlayer().getServer().createInventory(null, 54, "§1§lWardrobe");

      this.inv.setItem(11, GreenHelm);
      this.inv.setItem(13, BlueHelm);
      this.inv.setItem(15, RedHelm);

      this.inv.setItem(20, GreenChestplate);
      this.inv.setItem(22, BlueChestplate);
      this.inv.setItem(24, RedChestplate);

      this.inv.setItem(29, GreenLeggings);
      this.inv.setItem(31, BlueLeggings);
      this.inv.setItem(33, RedLeggings);

      this.inv.setItem(38, GreenBoots);
      this.inv.setItem(40, BlueBoots);
      this.inv.setItem(42, RedBoots);

      this.inv.setItem(0, Enderchest);
      this.inv.setItem(8, EnchantmentTable);
      this.inv.setItem(49, Bone);
      this.inv.setItem(53, Paper);


      p.getPlayer().openInventory(this.inv);

      e.setCancelled(true);
    }
  }
}