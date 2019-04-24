.class public final Lcom/shopkick/sdk/sensor/GeoFence;
.super Ljava/lang/Object;
.source "GeoFence.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/shopkick/sdk/sensor/GeoFence;",
        ">;"
    }
.end annotation


# instance fields
.field private final id:Ljava/lang/String;

.field public final latitude:D

.field public final longitude:D

.field public final radius:I


# direct methods
.method public constructor <init>(DDI)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-wide p1, p0, Lcom/shopkick/sdk/sensor/GeoFence;->latitude:D

    .line 39
    iput-wide p3, p0, Lcom/shopkick/sdk/sensor/GeoFence;->longitude:D

    .line 40
    iput p5, p0, Lcom/shopkick/sdk/sensor/GeoFence;->radius:I

    .line 41
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string p2, "GeoFence{lat/lon=%1$f,%2$f, radius=%3$d}"

    const/4 p3, 0x3

    new-array p3, p3, [Ljava/lang/Object;

    iget-wide p4, p0, Lcom/shopkick/sdk/sensor/GeoFence;->latitude:D

    .line 43
    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p4

    const/4 p5, 0x0

    aput-object p4, p3, p5

    iget-wide p4, p0, Lcom/shopkick/sdk/sensor/GeoFence;->longitude:D

    .line 44
    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p4

    const/4 p5, 0x1

    aput-object p4, p3, p5

    iget p4, p0, Lcom/shopkick/sdk/sensor/GeoFence;->radius:I

    .line 45
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    const/4 p5, 0x2

    aput-object p4, p3, p5

    .line 41
    invoke-static {p1, p2, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFence;->id:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    const-string v0, "latitude"

    .line 53
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/sdk/sensor/GeoFence;->latitude:D

    const-string v0, "longitude"

    .line 54
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/sdk/sensor/GeoFence;->longitude:D

    const-string v0, "radius"

    .line 55
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/shopkick/sdk/sensor/GeoFence;->radius:I

    const-string v0, "id"

    .line 56
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFence;->id:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 57
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public compareTo(Lcom/shopkick/sdk/sensor/GeoFence;)I
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFence;->id:Ljava/lang/String;

    iget-object p1, p1, Lcom/shopkick/sdk/sensor/GeoFence;->id:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 12
    check-cast p1, Lcom/shopkick/sdk/sensor/GeoFence;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFence;->compareTo(Lcom/shopkick/sdk/sensor/GeoFence;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_1

    .line 92
    instance-of v0, p1, Lcom/shopkick/sdk/sensor/GeoFence;

    if-nez v0, :cond_0

    goto :goto_0

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFence;->id:Ljava/lang/String;

    check-cast p1, Lcom/shopkick/sdk/sensor/GeoFence;

    iget-object p1, p1, Lcom/shopkick/sdk/sensor/GeoFence;->id:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method getJson()Lorg/json/JSONObject;
    .locals 4

    .line 64
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "latitude"

    .line 66
    iget-wide v2, p0, Lcom/shopkick/sdk/sensor/GeoFence;->latitude:D

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v1, "longitude"

    .line 67
    iget-wide v2, p0, Lcom/shopkick/sdk/sensor/GeoFence;->longitude:D

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v1, "radius"

    .line 68
    iget v2, p0, Lcom/shopkick/sdk/sensor/GeoFence;->radius:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "id"

    .line 69
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/GeoFence;->id:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 70
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public hashCode()I
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFence;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFence;->id:Ljava/lang/String;

    return-object v0
.end method
