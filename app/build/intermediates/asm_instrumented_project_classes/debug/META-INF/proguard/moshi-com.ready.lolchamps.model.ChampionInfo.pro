-if class com.ready.lolchamps.model.ChampionInfo
-keepnames class com.ready.lolchamps.model.ChampionInfo
-if class com.ready.lolchamps.model.ChampionInfo
-keep class com.ready.lolchamps.model.ChampionInfoJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.ready.lolchamps.model.ChampionInfo
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.ready.lolchamps.model.ChampionInfo
-keepclassmembers class com.ready.lolchamps.model.ChampionInfo {
    public synthetic <init>(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.ready.lolchamps.model.Image,java.util.List,java.util.List,java.util.List,com.ready.lolchamps.model.ChampionInfo$Passive,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
