package top.sducraft.sducs.CMDs;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NoMsg implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p=((Player) sender).getPlayer();
        p.sendMessage(ChatColor.RED+"[Server] 不许说悄悄话哦~");
        return false;
    }
}
