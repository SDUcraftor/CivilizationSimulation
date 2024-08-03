package top.sducraft.sducs;

import org.bukkit.plugin.java.JavaPlugin;
import top.sducraft.sducs.CMDs.NoMsg;
import top.sducraft.sducs.EVENTs.AsyncPlayerChat;

public final class SDUCS extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new AsyncPlayerChat(),this);
        getCommand("msg").setExecutor(new NoMsg());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
