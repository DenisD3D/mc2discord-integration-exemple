# mc2discord-integration-exempleHi,
How to integrate your mod with Mc2Discord
add mc2discord as a dev dependency
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
    implementation(fg.deobf('curse.maven:mc2discord-325235:3757287'))
}
```
Then add this file to your mod https://github.com/DenisD3D/mc2discord-integration-exemple/blob/master/src/main/java/ml/denisd3d/mc2discordintegrationexemple/Mc2DiscordCompat.java
and replace `mc2discordintegrationexemple` by your mod id.
Last use this bit of code to send a message on discord
```java
if (ModList.get().isLoaded("mc2discord")) {
  Mc2DiscordCompat.send("The message to send");
}
```
User will then only need to add your modid in their channels config if they want you mod integration
eg channel confiugration:
```toml
[Channels]
  [[Channels.Channel]]
    id = 773571975343243265
    subscriptions = ["info", "chat", "command", "mc2discordintegrationexemple"]
    mode = "WEBHOOK"
```
