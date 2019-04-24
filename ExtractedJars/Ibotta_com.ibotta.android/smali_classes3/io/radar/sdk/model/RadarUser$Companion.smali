.class public final Lio/radar/sdk/model/RadarUser$Companion;
.super Ljava/lang/Object;
.source "RadarUser.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/model/RadarUser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRadarUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadarUser.kt\nio/radar/sdk/model/RadarUser$Companion\n+ 2 IntrinsicArrayConstructors.kt\norg/jetbrains/kotlin/codegen/intrinsics/IntrinsicArrayConstructorsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n42#2,5:116\n37#3,2:121\n*E\n*S KotlinDebug\n*F\n+ 1 RadarUser.kt\nio/radar/sdk/model/RadarUser$Companion\n*L\n102#1,5:116\n102#1,2:121\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u00a2\u0006\u0002\u0008\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarUser$Companion;",
        "",
        "()V",
        "FIELD_COORDINATES",
        "",
        "FIELD_DESCRIPTION",
        "FIELD_DEVICE_ID",
        "FIELD_FOREGROUND",
        "FIELD_GEOFENCES",
        "FIELD_ID",
        "FIELD_INSIGHTS",
        "FIELD_LOCATION",
        "FIELD_LOCATION_ACCURACY",
        "FIELD_METADATA",
        "FIELD_PLACE",
        "FIELD_STOPPED",
        "FIELD_USER_ID",
        "fromJson",
        "Lio/radar/sdk/model/RadarUser;",
        "obj",
        "Lorg/json/JSONObject;",
        "fromJson$sdk_release",
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

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lio/radar/sdk/model/RadarUser$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson$sdk_release(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarUser;
    .locals 16
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "obj"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "_id"

    .line 84
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "userId"

    const/4 v2, 0x0

    .line 85
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "deviceId"

    .line 86
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "description"

    .line 87
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "metadata"

    .line 88
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    const-string v1, "stopped"

    .line 89
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v12

    const-string v1, "foreground"

    .line 90
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v13

    const-string v1, "location"

    .line 92
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v8, "coordinates"

    .line 93
    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    .line 94
    :goto_0
    new-instance v8, Landroid/location/Location;

    const-string v9, "radar"

    invoke-direct {v8, v9}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    if-eqz v1, :cond_1

    .line 95
    invoke-virtual {v1, v11}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v14

    goto :goto_1

    :cond_1
    move-wide v14, v9

    :goto_1
    invoke-virtual {v8, v14, v15}, Landroid/location/Location;->setLongitude(D)V

    if-eqz v1, :cond_2

    const/4 v9, 0x1

    .line 96
    invoke-virtual {v1, v9}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v9

    :cond_2
    invoke-virtual {v8, v9, v10}, Landroid/location/Location;->setLatitude(D)V

    const-string v1, "locationAccuracy"

    .line 97
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "locationAccuracy"

    .line 98
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v9

    double-to-float v1, v9

    invoke-virtual {v8, v1}, Landroid/location/Location;->setAccuracy(F)V

    :cond_3
    const-string v1, "geofences"

    .line 102
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 103
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v9

    .line 116
    new-array v9, v9, [Lio/radar/sdk/model/RadarGeofence;

    .line 117
    array-length v10, v9

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v10, :cond_5

    .line 104
    invoke-virtual {v1, v14}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v15

    if-eqz v15, :cond_4

    sget-object v2, Lio/radar/sdk/model/RadarGeofence;->Companion:Lio/radar/sdk/model/RadarGeofence$Companion;

    invoke-virtual {v2, v15}, Lio/radar/sdk/model/RadarGeofence$Companion;->fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarGeofence;

    move-result-object v2

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    aput-object v2, v9, v14

    add-int/lit8 v14, v14, 0x1

    const/4 v2, 0x0

    goto :goto_2

    .line 105
    :cond_5
    invoke-static {v9}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    if-eqz v1, :cond_7

    .line 122
    new-array v2, v11, [Lio/radar/sdk/model/RadarGeofence;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_6

    check-cast v1, [Lio/radar/sdk/model/RadarGeofence;

    move-object v9, v1

    goto :goto_4

    :cond_6
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 121
    :cond_7
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type java.util.Collection<T>"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    const/4 v9, 0x0

    :goto_4
    const-string v1, "place"

    .line 108
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_9

    sget-object v2, Lio/radar/sdk/model/RadarPlace;->Companion:Lio/radar/sdk/model/RadarPlace$Companion;

    invoke-virtual {v2, v1}, Lio/radar/sdk/model/RadarPlace$Companion;->fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarPlace;

    move-result-object v1

    move-object v10, v1

    goto :goto_5

    :cond_9
    const/4 v10, 0x0

    :goto_5
    const-string v1, "insights"

    .line 109
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_a

    sget-object v1, Lio/radar/sdk/model/RadarUserInsights;->Companion:Lio/radar/sdk/model/RadarUserInsights$Companion;

    invoke-virtual {v1, v0}, Lio/radar/sdk/model/RadarUserInsights$Companion;->fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarUserInsights;

    move-result-object v0

    move-object v11, v0

    goto :goto_6

    :cond_a
    const/4 v11, 0x0

    .line 111
    :goto_6
    new-instance v0, Lio/radar/sdk/model/RadarUser;

    const-string v1, "id"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    invoke-direct/range {v2 .. v13}, Lio/radar/sdk/model/RadarUser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Landroid/location/Location;[Lio/radar/sdk/model/RadarGeofence;Lio/radar/sdk/model/RadarPlace;Lio/radar/sdk/model/RadarUserInsights;ZZ)V

    return-object v0
.end method
