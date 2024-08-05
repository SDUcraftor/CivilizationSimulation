package top.sducraft.sducs.EVENTs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class AsyncPlayerChat implements Listener {
    @EventHandler
    public void AsyncPlayerChat(AsyncPlayerChatEvent e){
        Player player = e.getPlayer();
        String message = e.getMessage();
        e.setCancelled(true);

        if (player.getGameMode().equals(GameMode.SPECTATOR)){
            player.sendMessage(ChatColor.RED+"[Server] 嘘！");
            return;
        }

        String msg=ChatColor.GREEN + "[Team:"+player.getScoreboard().getEntryTeam(player.getName()).getName() +"] "+ChatColor.WHITE + player.getName()+"(";

        for (Player p:player.getServer().getOnlinePlayers()){
            if (p.isOnline()) {
                Location loc =p.getLocation();
                if (loc.getWorld().equals(player.getWorld())){
                    double d=loc.distance(player.getLocation());
                    if (d <= 50){
                        p.sendMessage(msg+ String.format("%.1f", d)+") >> " + message);
                    }
                }
            }
        }

    }
}
