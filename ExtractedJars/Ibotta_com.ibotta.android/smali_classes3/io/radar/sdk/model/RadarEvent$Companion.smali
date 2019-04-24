.class public final Lio/radar/sdk/model/RadarEvent$Companion;
.super Ljava/lang/Object;
.source "RadarEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/model/RadarEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRadarEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadarEvent.kt\nio/radar/sdk/model/RadarEvent$Companion\n+ 2 IntrinsicArrayConstructors.kt\norg/jetbrains/kotlin/codegen/intrinsics/IntrinsicArrayConstructorsKt\n*L\n1#1,236:1\n42#2,5:237\n42#2,5:242\n*E\n*S KotlinDebug\n*F\n+ 1 RadarEvent.kt\nio/radar/sdk/model/RadarEvent$Companion\n*L\n157#1,5:237\n197#1,5:242\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarEvent$Companion;",
        "",
        "()V",
        "FIELD_ACTUAL_CREATED",
        "",
        "FIELD_ALTERNATE_PLACES",
        "FIELD_CONFIDENCE",
        "FIELD_COORDINATES",
        "FIELD_CREATED",
        "FIELD_DURATION",
        "FIELD_GEOFENCE",
        "FIELD_ID",
        "FIELD_LIVE",
        "FIELD_LOCATION",
        "FIELD_LOCATION_ACCURACY",
        "FIELD_PLACE",
        "FIELD_TYPE",
        "FIELD_VERIFICATION",
        "FIELD_VERIFIED_PLACE",
        "eventsFromJSONArray",
        "",
        "Lio/radar/sdk/model/RadarEvent;",
        "array",
        "Lorg/json/JSONArray;",
        "eventsFromJSONArray$sdk_release",
        "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarEvent;",
        "fromJson",
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

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 139
    invoke-direct {p0}, Lio/radar/sdk/model/RadarEvent$Companion;-><init>()V

    return-void
.end method

.method private final fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarEvent;
    .locals 18
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "_id"

    .line 164
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 166
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    const-string v2, "UTC"

    .line 167
    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    const-string v2, "createdAt"

    const/4 v4, 0x0

    .line 168
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 169
    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object v5, v2

    goto :goto_0

    .line 170
    :cond_0
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    move-object v5, v2

    :goto_0
    const-string v2, "actualCreatedAt"

    .line 172
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 173
    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 174
    :cond_1
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    :goto_1
    const-string v2, "live"

    .line 176
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v6

    const-string v2, "type"

    .line 178
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v7, "user.nearby_place_chain"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 189
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_NEARBY_PLACE_CHAIN:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-object v7, v2

    goto/16 :goto_3

    :sswitch_1
    const-string v7, "user.entered_place"

    .line 178
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 187
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_ENTERED_PLACE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-object v7, v2

    goto/16 :goto_3

    :sswitch_2
    const-string v7, "user.stopped_traveling"

    .line 178
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 186
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_STOPPED_TRAVELING:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-object v7, v2

    goto/16 :goto_3

    :sswitch_3
    const-string v7, "user.entered_home"

    .line 178
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 181
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_ENTERED_HOME:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-object v7, v2

    goto :goto_3

    :sswitch_4
    const-string v7, "user.entered_geofence"

    .line 178
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 179
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_ENTERED_GEOFENCE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-object v7, v2

    goto :goto_3

    :sswitch_5
    const-string v7, "user.exited_home"

    .line 178
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 182
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_EXITED_HOME:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-object v7, v2

    goto :goto_3

    :sswitch_6
    const-string v7, "user.entered_office"

    .line 178
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 183
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_ENTERED_OFFICE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-object v7, v2

    goto :goto_3

    :sswitch_7
    const-string v7, "user.started_traveling"

    .line 178
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 185
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_STARTED_TRAVELING:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-object v7, v2

    goto :goto_3

    :sswitch_8
    const-string v7, "user.exited_office"

    .line 178
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 184
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_EXITED_OFFICE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-object v7, v2

    goto :goto_3

    :sswitch_9
    const-string v7, "user.exited_place"

    .line 178
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 188
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_EXITED_PLACE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-object v7, v2

    goto :goto_3

    :sswitch_a
    const-string v7, "user.exited_geofence"

    .line 178
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 180
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_EXITED_GEOFENCE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-object v7, v2

    goto :goto_3

    .line 190
    :cond_3
    :goto_2
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventType;->UNKNOWN:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-object v7, v2

    .line 193
    :goto_3
    sget-object v2, Lio/radar/sdk/model/RadarGeofence;->Companion:Lio/radar/sdk/model/RadarGeofence$Companion;

    const-string v8, "geofence"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    invoke-virtual {v2, v8}, Lio/radar/sdk/model/RadarGeofence$Companion;->fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarGeofence;

    move-result-object v8

    const-string v2, "place"

    .line 195
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_4

    sget-object v9, Lio/radar/sdk/model/RadarPlace;->Companion:Lio/radar/sdk/model/RadarPlace$Companion;

    invoke-virtual {v9, v2}, Lio/radar/sdk/model/RadarPlace$Companion;->fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarPlace;

    move-result-object v2

    move-object v9, v2

    goto :goto_4

    :cond_4
    move-object v9, v4

    :goto_4
    const-string v2, "alternatePlaces"

    .line 197
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    const/4 v10, 0x0

    if-eqz v2, :cond_6

    .line 198
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v11

    .line 242
    new-array v11, v11, [Lio/radar/sdk/model/RadarPlace;

    .line 243
    array-length v12, v11

    const/4 v13, 0x0

    :goto_5
    if-ge v13, v12, :cond_7

    .line 199
    invoke-virtual {v2, v13}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v14

    if-eqz v14, :cond_5

    sget-object v15, Lio/radar/sdk/model/RadarPlace;->Companion:Lio/radar/sdk/model/RadarPlace$Companion;

    invoke-virtual {v15, v14}, Lio/radar/sdk/model/RadarPlace$Companion;->fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarPlace;

    move-result-object v14

    goto :goto_6

    :cond_5
    move-object v14, v4

    :goto_6
    aput-object v14, v11, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_5

    :cond_6
    move-object v11, v4

    :cond_7
    const-string v2, "verifiedPlace"

    .line 203
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 204
    sget-object v12, Lio/radar/sdk/model/RadarPlace;->Companion:Lio/radar/sdk/model/RadarPlace$Companion;

    invoke-virtual {v12, v2}, Lio/radar/sdk/model/RadarPlace$Companion;->fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarPlace;

    move-result-object v2

    move-object v12, v2

    goto :goto_7

    :cond_8
    move-object v12, v4

    :goto_7
    const-string v2, "verification"

    .line 206
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    const/4 v13, -0x1

    const/4 v14, 0x1

    if-eq v2, v13, :cond_a

    if-eq v2, v14, :cond_9

    .line 209
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventVerification;->UNVERIFY:Lio/radar/sdk/model/RadarEvent$RadarEventVerification;

    move-object v13, v2

    goto :goto_8

    .line 207
    :cond_9
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventVerification;->ACCEPT:Lio/radar/sdk/model/RadarEvent$RadarEventVerification;

    move-object v13, v2

    goto :goto_8

    .line 208
    :cond_a
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventVerification;->REJECT:Lio/radar/sdk/model/RadarEvent$RadarEventVerification;

    move-object v13, v2

    :goto_8
    const-string v2, "confidence"

    .line 212
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 216
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;->NONE:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    move-object v15, v2

    goto :goto_9

    .line 213
    :pswitch_0
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;->HIGH:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    move-object v15, v2

    goto :goto_9

    .line 214
    :pswitch_1
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;->MEDIUM:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    move-object v15, v2

    goto :goto_9

    .line 215
    :pswitch_2
    sget-object v2, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;->LOW:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    move-object v15, v2

    :goto_9
    const-string v2, "duration"

    move-object/from16 v16, v5

    const-wide/16 v4, 0x0

    move-object/from16 v17, v15

    .line 219
    invoke-virtual {v0, v2, v4, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v14

    double-to-float v14, v14

    const-string v2, "location"

    .line 221
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_b

    const-string v15, "coordinates"

    .line 222
    invoke-virtual {v2, v15}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    goto :goto_a

    :cond_b
    const/4 v2, 0x0

    .line 223
    :goto_a
    new-instance v15, Landroid/location/Location;

    const-string v4, "radar"

    invoke-direct {v15, v4}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    if-eqz v2, :cond_c

    .line 224
    invoke-virtual {v2, v10}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v4

    goto :goto_b

    :cond_c
    const-wide/16 v4, 0x0

    :goto_b
    invoke-virtual {v15, v4, v5}, Landroid/location/Location;->setLongitude(D)V

    if-eqz v2, :cond_d

    const/4 v4, 0x1

    .line 225
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v4

    goto :goto_c

    :cond_d
    const-wide/16 v4, 0x0

    :goto_c
    invoke-virtual {v15, v4, v5}, Landroid/location/Location;->setLatitude(D)V

    const-string v2, "locationAccuracy"

    .line 226
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    const-string v2, "locationAccuracy"

    .line 227
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    double-to-float v0, v4

    invoke-virtual {v15, v0}, Landroid/location/Location;->setAccuracy(F)V

    .line 229
    :cond_e
    invoke-virtual/range {v16 .. v16}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-virtual {v15, v4, v5}, Landroid/location/Location;->setTime(J)V

    .line 232
    new-instance v0, Lio/radar/sdk/model/RadarEvent;

    const-string v2, "id"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    move-object/from16 v4, v16

    move-object v5, v1

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object/from16 v13, v17

    invoke-direct/range {v2 .. v15}, Lio/radar/sdk/model/RadarEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLio/radar/sdk/model/RadarEvent$RadarEventType;Lio/radar/sdk/model/RadarGeofence;Lio/radar/sdk/model/RadarPlace;[Lio/radar/sdk/model/RadarPlace;Lio/radar/sdk/model/RadarPlace;Lio/radar/sdk/model/RadarEvent$RadarEventVerification;Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;FLandroid/location/Location;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x7c5cf0e1 -> :sswitch_a
        -0x664c2e38 -> :sswitch_9
        -0x6540a1e5 -> :sswitch_8
        -0x453ed719 -> :sswitch_7
        -0x345a88f9 -> :sswitch_6
        -0x2458a002 -> :sswitch_5
        0x13669d0b -> :sswitch_4
        0x1ad6c3ea -> :sswitch_3
        0x26f94b33 -> :sswitch_2
        0x4070eb5c -> :sswitch_1
        0x50d776cc -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final eventsFromJSONArray$sdk_release(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarEvent;
    .locals 5
    .param p1    # Lorg/json/JSONArray;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    .line 237
    new-array v0, v0, [Lio/radar/sdk/model/RadarEvent;

    .line 238
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 158
    sget-object v3, Lio/radar/sdk/model/RadarEvent;->Companion:Lio/radar/sdk/model/RadarEvent$Companion;

    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    :goto_1
    invoke-direct {v3, v4}, Lio/radar/sdk/model/RadarEvent$Companion;->fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarEvent;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method
