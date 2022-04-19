package ml.denisd3d.mc2discordintegrationexemple;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mc2discordintegrationexemple")
public class Mc2discordIntegrationExemple {

    private static final Logger LOGGER = LogManager.getLogger();

    public Mc2discordIntegrationExemple() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onEntityMountEvent(EntityMountEvent event) {
        if (ModList.get().isLoaded("mc2discord")) {
            Mc2DiscordCompat.send("Entity mounted: " + event.getEntity().getName().getString());
        }
    }
}
