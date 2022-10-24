package ArmorContent;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ArmorContent
  implements Listener
{
  @EventHandler
  public void Inventory(InventoryClickEvent event)
  {
    Player p = (Player)event.getWhoClicked();

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

    if (event.getInventory().getName().equalsIgnoreCase("§1§lWardrobe"))
    {
      event.setCancelled(true);

      if (event.getSlot() == 11) {
        p.getInventory().setHelmet(new ItemStack(GreenHelm));
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 13) {
        p.getInventory().setHelmet(new ItemStack(BlueHelm));
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 15) {
        p.getInventory().setHelmet(new ItemStack(RedHelm));
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 20) {
        p.getInventory().setChestplate(new ItemStack(GreenChestplate));
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 22) {
        p.getInventory().setChestplate(new ItemStack(BlueChestplate));
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 24) {
        p.getInventory().setChestplate(new ItemStack(RedChestplate));
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 29) {
        p.getInventory().setLeggings(new ItemStack(GreenLeggings));
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 31) {
        p.getInventory().setLeggings(new ItemStack(BlueLeggings));
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 33) {
        p.getInventory().setLeggings(new ItemStack(RedLeggings));
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 38) {
        p.getInventory().setBoots(new ItemStack(GreenBoots));
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 40) {
        p.getInventory().setBoots(new ItemStack(BlueBoots));
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 42) {
        p.getInventory().setBoots(new ItemStack(RedBoots));
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 0) {
        p.closeInventory();
        p.sendMessage(ChatColor.WHITE + "[" + ChatColor.RED + ChatColor.BOLD+ "" + "PokeGaming" + ChatColor.WHITE + "]" + ChatColor.GREEN + ChatColor.BOLD + " RIGHT CLICK ON YOUR COMPASS TO TELEPORT!");
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 8) {
        p.performCommand("menu");
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 49) {
        p.closeInventory();
        p.playSound(p.getEyeLocation(), Sound.FIZZ, 1.0F, 1.0F);
      }
      else if (event.getSlot() == 53) {
        p.playSound(p.getEyeLocation(), Sound.CLICK, 1.0F, 1.0F);
        p.getInventory().setArmorContents(null);
      }
    }
  }
}