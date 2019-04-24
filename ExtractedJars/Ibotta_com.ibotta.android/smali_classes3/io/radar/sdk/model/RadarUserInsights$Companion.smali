.class public final Lio/radar/sdk/model/RadarUserInsights$Companion;
.super Ljava/lang/Object;
.source "RadarUserInsights.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/model/RadarUserInsights;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRadarUserInsights.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadarUserInsights.kt\nio/radar/sdk/model/RadarUserInsights$Companion\n*L\n1#1,60:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarUserInsights$Companion;",
        "",
        "()V",
        "FIELD_LOCATIONS",
        "",
        "FIELD_STATE",
        "fromJson",
        "Lio/radar/sdk/model/RadarUserInsights;",
        "obj",
        "Lorg/json/JSONObject;",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lio/radar/sdk/model/RadarUserInsights$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarUserInsights;
    .locals 9
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/text/ParseException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 38
    move-object v1, v0

    check-cast v1, Lio/radar/sdk/model/RadarUserInsightsLocation;

    const-string v2, "locations"

    .line 40
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    if-eqz v2, :cond_2

    const/4 v3, 0x0

    .line 41
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v4

    move-object v5, v1

    :goto_0
    if-ge v3, v4, :cond_3

    .line 42
    sget-object v6, Lio/radar/sdk/model/RadarUserInsightsLocation;->Companion:Lio/radar/sdk/model/RadarUserInsightsLocation$Companion;

    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    invoke-virtual {v6, v7}, Lio/radar/sdk/model/RadarUserInsightsLocation$Companion;->fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarUserInsightsLocation;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 43
    invoke-virtual {v6}, Lio/radar/sdk/model/RadarUserInsightsLocation;->getType()Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    move-result-object v7

    goto :goto_1

    :cond_0
    move-object v7, v0

    :goto_1
    if-nez v7, :cond_1

    goto :goto_2

    :cond_1
    sget-object v8, Lio/radar/sdk/model/RadarUserInsights$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v7}, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->ordinal()I

    move-result v7

    aget v7, v8, v7

    packed-switch v7, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    move-object v5, v6

    goto :goto_2

    :pswitch_1
    move-object v1, v6

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    move-object v5, v1

    :cond_3
    const-string v2, "state"

    .line 53
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_4

    sget-object v2, Lio/radar/sdk/model/RadarUserInsightsState;->Companion:Lio/radar/sdk/model/RadarUserInsightsState$Companion;

    invoke-virtual {v2, p1}, Lio/radar/sdk/model/RadarUserInsightsState$Companion;->fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarUserInsightsState;

    move-result-object p1

    goto :goto_3

    :cond_4
    move-object p1, v0

    .line 55
    :goto_3
    new-instance v2, Lio/radar/sdk/model/RadarUserInsights;

    invoke-direct {v2, v1, v5, p1, v0}, Lio/radar/sdk/model/RadarUserInsights;-><init>(Lio/radar/sdk/model/RadarUserInsightsLocation;Lio/radar/sdk/model/RadarUserInsightsLocation;Lio/radar/sdk/model/RadarUserInsightsState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
