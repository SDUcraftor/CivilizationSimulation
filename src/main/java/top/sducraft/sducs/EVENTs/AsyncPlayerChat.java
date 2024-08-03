package top.sducraft.sducs.EVENTs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
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

        String msg=ChatColor.AQUA + "[All] "+ChatColor.WHITE + player.getName() + " >> " + message;

        if (message.startsWith("@")){
            Scoreboard scoreboard = player.getScoreboard();
            Team team = scoreboard.getEntryTeam(player.getName());

            if (team != null) {
                msg=ChatColor.GREEN + "[Team:"+team.getName() +"] "+ChatColor.WHITE + player.getName() + " >> " + message;

                for (String entry:team.getEntries()){
                    Player teamMember = Bukkit.getPlayer(entry);
                    if (teamMember != null && teamMember.isOnline()) {
                        teamMember.sendMessage(msg);
                    }
                }

                return;
            }
        }


        for (Player p:player.getServer().getOnlinePlayers()){
            if (p.isOnline()) {
                p.sendMessage(msg);
            }
        }

    }
}
