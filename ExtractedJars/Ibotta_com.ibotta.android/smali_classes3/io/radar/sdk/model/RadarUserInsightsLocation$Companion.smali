.class public final Lio/radar/sdk/model/RadarUserInsightsLocation$Companion;
.super Ljava/lang/Object;
.source "RadarUserInsightsLocation.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/model/RadarUserInsightsLocation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRadarUserInsightsLocation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadarUserInsightsLocation.kt\nio/radar/sdk/model/RadarUserInsightsLocation$Companion\n*L\n1#1,109:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarUserInsightsLocation$Companion;",
        "",
        "()V",
        "FIELD_CONFIDENCE",
        "",
        "FIELD_COORDINATES",
        "FIELD_LOCATION",
        "FIELD_TYPE",
        "FIELD_UPDATED_AT",
        "fromJson",
        "Lio/radar/sdk/model/RadarUserInsightsLocation;",
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

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lio/radar/sdk/model/RadarUserInsightsLocation$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarUserInsightsLocation;
    .locals 7
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/text/ParseException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string v1, "type"

    .line 79
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x3cc8c144

    if-eq v2, v3, :cond_3

    const v3, 0x30f4df

    if-eq v2, v3, :cond_2

    goto :goto_0

    :cond_2
    const-string v2, "home"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 80
    sget-object v1, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->HOME:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    goto :goto_1

    :cond_3
    const-string v2, "office"

    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 81
    sget-object v1, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->OFFICE:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    goto :goto_1

    .line 82
    :cond_4
    :goto_0
    sget-object v1, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->UNKNOWN:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    :goto_1
    const-string v2, "location"

    .line 85
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_5

    const-string v0, "coordinates"

    .line 86
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 87
    :cond_5
    new-instance v2, Landroid/location/Location;

    const-string v3, "radar"

    invoke-direct {v2, v3}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    const-wide/16 v3, 0x0

    if-eqz v0, :cond_6

    const/4 v5, 0x0

    .line 88
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v5

    goto :goto_2

    :cond_6
    move-wide v5, v3

    :goto_2
    invoke-virtual {v2, v5, v6}, Landroid/location/Location;->setLongitude(D)V

    if-eqz v0, :cond_7

    const/4 v3, 0x1

    .line 89
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v3

    :cond_7
    invoke-virtual {v2, v3, v4}, Landroid/location/Location;->setLatitude(D)V

    const-string v0, "confidence"

    .line 92
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 96
    sget-object v0, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;->NONE:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;

    goto :goto_3

    .line 93
    :pswitch_0
    sget-object v0, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;->HIGH:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;

    goto :goto_3

    .line 94
    :pswitch_1
    sget-object v0, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;->MEDIUM:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;

    goto :goto_3

    .line 95
    :pswitch_2
    sget-object v0, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;->LOW:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;

    .line 99
    :goto_3
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-direct {v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    const-string v4, "UTC"

    .line 100
    invoke-static {v4}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    const-string v4, "updatedAt"

    .line 101
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 102
    invoke-virtual {v3, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    if-eqz p1, :cond_8

    goto :goto_4

    .line 103
    :cond_8
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 105
    :goto_4
    new-instance v3, Lio/radar/sdk/model/RadarUserInsightsLocation;

    invoke-direct {v3, v1, v2, v0, p1}, Lio/radar/sdk/model/RadarUserInsightsLocation;-><init>(Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;Landroid/location/Location;Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence;Ljava/util/Date;)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
