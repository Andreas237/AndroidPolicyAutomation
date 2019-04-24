.class public Lcom/shopkick/sdk/sensor/GeoFenceReading;
.super Lcom/shopkick/sdk/sensor/ReadingBase;
.source "GeoFenceReading.java"


# instance fields
.field private final geoFence:Lcom/shopkick/sdk/sensor/GeoFence;

.field private final location:Landroid/location/Location;

.field private final transitionType:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/GeoFenceReading;Lcom/shopkick/sdk/sensor/GeoFence;Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;Landroid/location/Location;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/ReadingBase;-><init>(Lcom/shopkick/sdk/sensor/ReadingBase;)V

    .line 19
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceReading;->geoFence:Lcom/shopkick/sdk/sensor/GeoFence;

    .line 20
    iput-object p3, p0, Lcom/shopkick/sdk/sensor/GeoFenceReading;->transitionType:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    .line 21
    iput-object p4, p0, Lcom/shopkick/sdk/sensor/GeoFenceReading;->location:Landroid/location/Location;

    return-void
.end method


# virtual methods
.method public getConfidence()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public getGeoFence()Lcom/shopkick/sdk/sensor/GeoFence;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceReading;->geoFence:Lcom/shopkick/sdk/sensor/GeoFence;

    return-object v0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceReading;->location:Landroid/location/Location;

    return-object v0
.end method

.method public bridge synthetic getPreviousReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 1

    .line 8
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ReadingBase;->getPreviousReading()Lcom/shopkick/sdk/sensor/Reading;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getTimestamp()J
    .locals 2

    .line 8
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ReadingBase;->getTimestamp()J

    move-result-wide v0

    return-wide v0
.end method

.method public getTransitionType()Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceReading;->transitionType:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    return-object v0
.end method
