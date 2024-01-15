-if class com.ready.lolchamps.model.ChampionInfo$Passive
-keepnames class com.ready.lolchamps.model.ChampionInfo$Passive
-if class com.ready.lolchamps.model.ChampionInfo$Passive
-keep class com.ready.lolchamps.model.ChampionInfo_PassiveJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
