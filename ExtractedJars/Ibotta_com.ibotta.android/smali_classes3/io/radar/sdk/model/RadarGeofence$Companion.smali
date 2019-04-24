.class public final Lio/radar/sdk/model/RadarGeofence$Companion;
.super Ljava/lang/Object;
.source "RadarGeofence.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/model/RadarGeofence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRadarGeofence.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadarGeofence.kt\nio/radar/sdk/model/RadarGeofence$Companion\n+ 2 IntrinsicArrayConstructors.kt\norg/jetbrains/kotlin/codegen/intrinsics/IntrinsicArrayConstructorsKt\n*L\n1#1,99:1\n42#2,5:100\n*E\n*S KotlinDebug\n*F\n+ 1 RadarGeofence.kt\nio/radar/sdk/model/RadarGeofence$Companion\n*L\n84#1,5:100\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarGeofence$Companion;",
        "",
        "()V",
        "FIELD_COORDINATES",
        "",
        "FIELD_DESCRIPTION",
        "FIELD_EXTERNAL_ID",
        "FIELD_GEOMETRY_CENTER",
        "FIELD_GEOMETRY_POLYGON",
        "FIELD_GEOMETRY_RADIUS",
        "FIELD_ID",
        "FIELD_METADATA",
        "FIELD_TAG",
        "FIELD_TYPE",
        "TYPE_CIRCLE",
        "TYPE_POLYGON",
        "fromJson",
        "Lio/radar/sdk/model/RadarGeofence;",
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

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lio/radar/sdk/model/RadarGeofence$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarGeofence;
    .locals 17
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v2, "_id"

    .line 63
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v2, "description"

    .line 64
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v2, "tag"

    .line 65
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v2, "externalId"

    .line 66
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "metadata"

    .line 67
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    const-string v2, "type"

    .line 69
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v11, -0x51134330

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eq v3, v11, :cond_8

    const v11, -0x17b1aac6

    if-eq v3, v11, :cond_3

    :cond_2
    :goto_0
    move-object v15, v7

    move-object/from16 v16, v8

    goto/16 :goto_5

    :cond_3
    const-string v3, "polygon"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "geometry"

    .line 82
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v2, "coordinates"

    .line 83
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    goto :goto_1

    :cond_4
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_7

    .line 84
    invoke-virtual {v0, v13}, Lorg/json/JSONArray;->optJSONArray(I)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 85
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    .line 100
    new-array v1, v1, [Lio/radar/sdk/model/Coordinate;

    .line 101
    array-length v2, v1

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_6

    .line 86
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optJSONArray(I)Lorg/json/JSONArray;

    move-result-object v11

    if-eqz v11, :cond_5

    .line 87
    new-instance v14, Lio/radar/sdk/model/Coordinate;

    invoke-virtual {v11, v12}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v9

    move-object v15, v7

    move-object/from16 v16, v8

    invoke-virtual {v11, v13}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v7

    invoke-direct {v14, v9, v10, v7, v8}, Lio/radar/sdk/model/Coordinate;-><init>(DD)V

    goto :goto_3

    :cond_5
    move-object v15, v7

    move-object/from16 v16, v8

    .line 88
    new-instance v14, Lio/radar/sdk/model/Coordinate;

    const-wide/16 v7, 0x0

    invoke-direct {v14, v7, v8, v7, v8}, Lio/radar/sdk/model/Coordinate;-><init>(DD)V

    :goto_3
    aput-object v14, v1, v3

    add-int/lit8 v3, v3, 0x1

    move-object v7, v15

    move-object/from16 v8, v16

    goto :goto_2

    :cond_6
    move-object v15, v7

    move-object/from16 v16, v8

    .line 90
    new-instance v0, Lio/radar/sdk/model/RadarPolygonGeometry;

    invoke-direct {v0, v1}, Lio/radar/sdk/model/RadarPolygonGeometry;-><init>([Lio/radar/sdk/model/Coordinate;)V

    goto :goto_4

    :cond_7
    move-object v15, v7

    move-object/from16 v16, v8

    move-object v0, v1

    .line 84
    :goto_4
    move-object v1, v0

    check-cast v1, Lio/radar/sdk/model/RadarGeofenceGeometry;

    goto :goto_5

    :cond_8
    move-object v15, v7

    move-object/from16 v16, v8

    const-string v3, "circle"

    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v2, "geometryCenter"

    .line 73
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_9

    const-string v3, "coordinates"

    .line 74
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 75
    new-instance v1, Lio/radar/sdk/model/RadarCircleGeometry;

    .line 76
    new-instance v3, Lio/radar/sdk/model/Coordinate;

    invoke-virtual {v2, v12}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v7

    invoke-virtual {v2, v13}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v9

    invoke-direct {v3, v7, v8, v9, v10}, Lio/radar/sdk/model/Coordinate;-><init>(DD)V

    const-string v2, "geometryRadius"

    .line 77
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 75
    invoke-direct {v1, v3, v7, v8}, Lio/radar/sdk/model/RadarCircleGeometry;-><init>(Lio/radar/sdk/model/Coordinate;D)V

    .line 74
    :cond_9
    check-cast v1, Lio/radar/sdk/model/RadarGeofenceGeometry;

    :cond_a
    :goto_5
    if-eqz v1, :cond_b

    move-object v9, v1

    goto :goto_6

    .line 94
    :cond_b
    new-instance v0, Lio/radar/sdk/model/RadarCircleGeometry;

    new-instance v1, Lio/radar/sdk/model/Coordinate;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3, v2, v3}, Lio/radar/sdk/model/Coordinate;-><init>(DD)V

    invoke-direct {v0, v1, v2, v3}, Lio/radar/sdk/model/RadarCircleGeometry;-><init>(Lio/radar/sdk/model/Coordinate;D)V

    check-cast v0, Lio/radar/sdk/model/RadarGeofenceGeometry;

    move-object v9, v0

    .line 96
    :goto_6
    new-instance v0, Lio/radar/sdk/model/RadarGeofence;

    const-string v1, "id"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "description"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v0

    move-object v7, v15

    move-object/from16 v8, v16

    invoke-direct/range {v3 .. v9}, Lio/radar/sdk/model/RadarGeofence;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lio/radar/sdk/model/RadarGeofenceGeometry;)V

    return-object v0
.end method
