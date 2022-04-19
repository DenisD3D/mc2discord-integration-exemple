package ml.denisd3d.mc2discordintegrationexemple;

import ml.denisd3d.mc2discord.core.Mc2Discord;

public class Mc2DiscordCompat {
    public static void send(String s) {
            Mc2Discord.INSTANCE.messageManager.sendMessageOfType("mc2discordintegrationexemple" /* TODO: put your mod id here */,
                    s,
                    "",
                    Mc2Discord.INSTANCE.botDisplayName,
                    Mc2Discord.INSTANCE.botAvatar,
                    null,
                    Mc2Discord.INSTANCE.config.style.bot_name.isEmpty() && Mc2Discord.INSTANCE.config.style.bot_avatar.isEmpty());
    }
}
