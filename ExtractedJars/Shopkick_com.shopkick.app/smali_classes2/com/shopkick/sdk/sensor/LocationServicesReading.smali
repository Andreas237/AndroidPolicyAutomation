.class public Lcom/shopkick/sdk/sensor/LocationServicesReading;
.super Lcom/shopkick/sdk/sensor/ReadingBase;
.source "LocationServicesReading.java"


# instance fields
.field private final confidence:F

.field private final configurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

.field private final location:Landroid/location/Location;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/LocationServicesReading;Landroid/location/Location;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/ReadingBase;-><init>(Lcom/shopkick/sdk/sensor/ReadingBase;)V

    if-eqz p2, :cond_2

    .line 23
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/LocationServicesReading;->location:Landroid/location/Location;

    .line 24
    iput-object p3, p0, Lcom/shopkick/sdk/sensor/LocationServicesReading;->configurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

    .line 32
    invoke-virtual {p2}, Landroid/location/Location;->getAccuracy()F

    move-result p1

    const/4 p2, 0x0

    cmpg-float p3, p1, p2

    if-gez p3, :cond_0

    move p1, p2

    :cond_0
    const/high16 p2, 0x41c80000    # 25.0f

    cmpl-float p3, p1, p2

    if-lez p3, :cond_1

    move p1, p2

    :cond_1
    div-float/2addr p1, p2

    const/high16 p2, 0x3f800000    # 1.0f

    sub-float/2addr p2, p1

    .line 49
    iput p2, p0, Lcom/shopkick/sdk/sensor/LocationServicesReading;->confidence:F

    return-void

    .line 22
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'location\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lcom/shopkick/sdk/sensor/LocationServicesReading;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 54
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getPreviousReading()Lcom/shopkick/sdk/sensor/Reading;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getPreviousReading()Lcom/shopkick/sdk/sensor/Reading;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/sensor/ReadingBase;

    goto :goto_1

    :cond_1
    :goto_0
    move-object v1, v0

    .line 54
    :goto_1
    invoke-direct {p0, v1}, Lcom/shopkick/sdk/sensor/ReadingBase;-><init>(Lcom/shopkick/sdk/sensor/ReadingBase;)V

    if-nez p1, :cond_2

    goto :goto_2

    .line 56
    :cond_2
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getLocation()Landroid/location/Location;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->makeCopyOfLocation(Landroid/location/Location;)Landroid/location/Location;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesReading;->location:Landroid/location/Location;

    .line 57
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getConfidence()F

    move-result p1

    iput p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesReading;->confidence:F

    .line 58
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/LocationServicesReading;->configurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

    return-void
.end method

.method private static makeCopyOfLocation(Landroid/location/Location;)Landroid/location/Location;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 85
    :cond_0
    new-instance v0, Landroid/location/Location;

    invoke-direct {v0, p0}, Landroid/location/Location;-><init>(Landroid/location/Location;)V

    return-object v0
.end method


# virtual methods
.method public getConfidence()F
    .locals 1

    .line 62
    iget v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesReading;->confidence:F

    return v0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 4

    .line 66
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesReading;->location:Landroid/location/Location;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->makeCopyOfLocation(Landroid/location/Location;)Landroid/location/Location;

    move-result-object v0

    .line 67
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesReading;->configurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/shopkick/sdk/core/ConfigurationProvider;->getForcedLocation()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 70
    iget-wide v2, v1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual {v0, v2, v3}, Landroid/location/Location;->setLatitude(D)V

    .line 71
    iget-wide v1, v1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLongitude(D)V

    :cond_1
    return-object v0
.end method

.method public bridge synthetic getPreviousReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 1

    .line 12
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ReadingBase;->getPreviousReading()Lcom/shopkick/sdk/sensor/Reading;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getTimestamp()J
    .locals 2

    .line 12
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ReadingBase;->getTimestamp()J

    move-result-wide v0

    return-wide v0
.end method
