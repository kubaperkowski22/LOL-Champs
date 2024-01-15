-if class com.ready.lolchamps.model.ChampionInfo$Spell
-keepnames class com.ready.lolchamps.model.ChampionInfo$Spell
-if class com.ready.lolchamps.model.ChampionInfo$Spell
-keep class com.ready.lolchamps.model.ChampionInfo_SpellJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
