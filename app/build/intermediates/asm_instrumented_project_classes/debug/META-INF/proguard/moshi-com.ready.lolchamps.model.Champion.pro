-if class com.ready.lolchamps.model.Champion
-keepnames class com.ready.lolchamps.model.Champion
-if class com.ready.lolchamps.model.Champion
-keep class com.ready.lolchamps.model.ChampionJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
