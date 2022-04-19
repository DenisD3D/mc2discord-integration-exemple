# mc2discord-integration-exemple
## Getting Started
How to integrate your mod with Mc2Discord :
 * Add mc2discord as a dev dependency: replace MC2DISCORD_CURSEFORGE_ID by the last version of the mod file id (eg: 3757287 for file https://www.curseforge.com/minecraft/mc-mods/mc2discord/files/3757287)
```gradle
repositories {
    ...
    maven {
        url "https://cursemaven.com"
    }
}

dependencies {
    ... 
    //curse.maven:<descriptor>-<projectid>:<fileid>
    implementation(fg.deobf('curse.maven:mc2discord-325235:MC2DISCORD_CURSEFORGE_ID'))
}
```
 * Then add this class to your mod https://github.com/DenisD3D/mc2discord-integration-exemple/blob/master/src/main/java/ml/denisd3d/mc2discordintegrationexemple/Mc2DiscordCompat.java
and replace `mc2discordintegrationexemple` by your mod id.
 * You can now use this bit of code to send messages on discord
```java
if (ModList.get().isLoaded("mc2discord")) {
  Mc2DiscordCompat.send("The message to send");
}
```

## Config for end user
User need to enable your integration by adding your modid in their channels config. Eg:
```toml
[Channels]
  [[Channels.Channel]]
    id = 0
    subscriptions = ["info", "chat", "command", "mc2discordintegrationexemple"]
    mode = "WEBHOOK"
```

## Sending with a custom username and profile picture
Change the Mc2DiscordCompat send function to the following:
```java
Mc2Discord.INSTANCE.messageManager.sendMessageOfType("mc2discordintegrationexemple" /* TODO: put your mod id here */,
    s,
    "YOUR_PSEUDO: " + s,
    "YOUR_PSEUDO",
    "YOUR_AVATAR_URL",
    null,
    false);
```
