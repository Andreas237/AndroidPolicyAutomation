.class public final Lio/radar/sdk/model/RadarPlace$Companion;
.super Ljava/lang/Object;
.source "RadarPlace.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/model/RadarPlace;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRadarPlace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadarPlace.kt\nio/radar/sdk/model/RadarPlace$Companion\n+ 2 IntrinsicArrayConstructors.kt\norg/jetbrains/kotlin/codegen/intrinsics/IntrinsicArrayConstructorsKt\n*L\n1#1,127:1\n42#2,5:128\n*E\n*S KotlinDebug\n*F\n+ 1 RadarPlace.kt\nio/radar/sdk/model/RadarPlace$Companion\n*L\n81#1,5:128\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarPlace$Companion;",
        "",
        "()V",
        "FIELD_CATEGORIES",
        "",
        "FIELD_CHAIN",
        "FIELD_COORDINATES",
        "FIELD_FACEBOOK_ID",
        "FIELD_FACEBOOK_PLACE_ID",
        "FIELD_GROUP",
        "FIELD_ID",
        "FIELD_LOCATION",
        "FIELD_METADATA",
        "FIELD_NAME",
        "fromJson",
        "Lio/radar/sdk/model/RadarPlace;",
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

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lio/radar/sdk/model/RadarPlace$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarPlace;
    .locals 14
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string v1, "_id"

    .line 76
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "facebookId"

    .line 77
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "facebookPlaceId"

    .line 78
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "name"

    .line 79
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "categories"

    .line 81
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 82
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v7

    .line 128
    new-array v7, v7, [Ljava/lang/String;

    .line 129
    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_2

    .line 83
    invoke-virtual {v1, v9}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "array.optString(it)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v10, v7, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 85
    :cond_1
    new-array v1, v2, [Ljava/lang/String;

    move-object v7, v1

    :cond_2
    const-string v1, "chain"

    .line 87
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v8, Lio/radar/sdk/model/RadarChain;->Companion:Lio/radar/sdk/model/RadarChain$Companion;

    invoke-virtual {v8, v1}, Lio/radar/sdk/model/RadarChain$Companion;->fromJson(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarChain;

    move-result-object v1

    move-object v8, v1

    goto :goto_1

    :cond_3
    move-object v8, v0

    :goto_1
    const-string v1, "location"

    .line 89
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v9, "coordinates"

    .line 90
    invoke-virtual {v1, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    goto :goto_2

    :cond_4
    move-object v1, v0

    .line 91
    :goto_2
    new-instance v9, Lio/radar/sdk/model/Coordinate;

    const-wide/16 v10, 0x0

    if-eqz v1, :cond_5

    const/4 v12, 0x1

    invoke-virtual {v1, v12}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v12

    goto :goto_3

    :cond_5
    move-wide v12, v10

    :goto_3
    if-eqz v1, :cond_6

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v10

    :cond_6
    invoke-direct {v9, v12, v13, v10, v11}, Lio/radar/sdk/model/Coordinate;-><init>(DD)V

    const-string v1, "group"

    .line 93
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v0, "metadata"

    .line 94
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    .line 96
    new-instance p1, Lio/radar/sdk/model/RadarPlace;

    const-string v0, "id"

    .line 97
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    .line 100
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p1

    .line 96
    invoke-direct/range {v2 .. v11}, Lio/radar/sdk/model/RadarPlace;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lio/radar/sdk/model/RadarChain;Lio/radar/sdk/model/Coordinate;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-object p1
.end method
