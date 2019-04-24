.class public Lcom/shopkick/app/location/LocationNotifier;
.super Ljava/lang/Object;
.source "LocationNotifier.java"


# instance fields
.field private context:Landroid/content/Context;

.field private final flags:Lcom/shopkick/app/flags/SKFlags;

.field private lastLocation:Landroid/location/Location;

.field private final locationManager:Lcom/shopkick/app/location/SKLocationManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/location/SKLocationManager;Landroid/content/Context;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/shopkick/app/location/LocationNotifier;->locationManager:Lcom/shopkick/app/location/SKLocationManager;

    .line 23
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/location/LocationNotifier;->context:Landroid/content/Context;

    .line 24
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/location/LocationNotifier;->flags:Lcom/shopkick/app/flags/SKFlags;

    return-void
.end method

.method private getDistanceInMetersFrom(Landroid/location/Location;)F
    .locals 2

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    if-nez p1, :cond_0

    return v0

    .line 107
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/location/LocationNotifier;->getLastLocation()Landroid/location/Location;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    .line 111
    :cond_1
    invoke-virtual {v1, p1}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result p1

    return p1
.end method

.method private getLastLocation()Landroid/location/Location;
    .locals 4

    .line 78
    iget-object v0, p0, Lcom/shopkick/app/location/LocationNotifier;->flags:Lcom/shopkick/app/flags/SKFlags;

    if-eqz v0, :cond_0

    const-string v1, "DEBUG_FLAG_SIMULATE_NO_LOCATION"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 83
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/location/LocationNotifier;->flags:Lcom/shopkick/app/flags/SKFlags;

    if-eqz v0, :cond_2

    const-string v1, "DEBUG_FLAG_USE_PROVIDED_GPS"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 87
    :cond_1
    new-instance v0, Landroid/location/Location;

    const-string v1, "network"

    invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 88
    iget-object v1, p0, Lcom/shopkick/app/location/LocationNotifier;->flags:Lcom/shopkick/app/flags/SKFlags;

    sget-object v2, Lcom/shopkick/app/application/AppDebugFlags;->DEBUG_LAT:Ljava/lang/String;

    const v3, 0x4215c955

    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/flags/SKFlags;->getFloat(Ljava/lang/String;F)F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLatitude(D)V

    .line 89
    iget-object v1, p0, Lcom/shopkick/app/location/LocationNotifier;->flags:Lcom/shopkick/app/flags/SKFlags;

    sget-object v2, Lcom/shopkick/app/application/AppDebugFlags;->DEBUG_LNG:Ljava/lang/String;

    const v3, -0x3d0bae39

    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/flags/SKFlags;->getFloat(Ljava/lang/String;F)F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLongitude(D)V

    .line 90
    iget-object v1, p0, Lcom/shopkick/app/location/LocationNotifier;->flags:Lcom/shopkick/app/flags/SKFlags;

    sget-object v2, Lcom/shopkick/app/application/AppDebugFlags;->DEBUG_ACCURACY:Ljava/lang/String;

    const/high16 v3, 0x41200000    # 10.0f

    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/flags/SKFlags;->getFloat(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/location/Location;->setAccuracy(F)V

    .line 91
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setTime(J)V

    return-object v0

    .line 84
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/location/LocationNotifier;->locationManager:Lcom/shopkick/app/location/SKLocationManager;

    invoke-virtual {v0}, Lcom/shopkick/app/location/SKLocationManager;->getLastKnownLocation()Landroid/location/Location;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/location/LocationNotifier;->lastLocation:Landroid/location/Location;

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/location/LocationNotifier;->lastLocation:Landroid/location/Location;

    return-object v0
.end method

.method public static locationFromCoordinates(DD)Landroid/location/Location;
    .locals 2

    .line 57
    new-instance v0, Landroid/location/Location;

    const-string v1, "network"

    invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v0, p0, p1}, Landroid/location/Location;->setLatitude(D)V

    .line 59
    invoke-virtual {v0, p2, p3}, Landroid/location/Location;->setLongitude(D)V

    return-object v0
.end method


# virtual methods
.method public getDistanceInMetersFrom(DD)F
    .locals 0

    .line 64
    invoke-static {p1, p2, p3, p4}, Lcom/shopkick/app/location/LocationNotifier;->locationFromCoordinates(DD)Landroid/location/Location;

    move-result-object p1

    .line 65
    invoke-direct {p0, p1}, Lcom/shopkick/app/location/LocationNotifier;->getDistanceInMetersFrom(Landroid/location/Location;)F

    move-result p1

    return p1
.end method

.method public getDistanceInMetersFrom(Landroid/location/Location;DD)F
    .locals 0

    .line 69
    invoke-static {p2, p3, p4, p5}, Lcom/shopkick/app/location/LocationNotifier;->locationFromCoordinates(DD)Landroid/location/Location;

    move-result-object p2

    .line 70
    invoke-virtual {p1, p2}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result p1

    return p1
.end method

.method public getLocationConnectionState()I
    .locals 4

    .line 28
    iget-object v0, p0, Lcom/shopkick/app/location/LocationNotifier;->flags:Lcom/shopkick/app/flags/SKFlags;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/shopkick/app/location/LocationNotifier;->locationManager:Lcom/shopkick/app/location/SKLocationManager;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "DEBUG_FLAG_USE_PROVIDED_GPS"

    .line 32
    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return v1

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/location/LocationNotifier;->locationManager:Lcom/shopkick/app/location/SKLocationManager;

    const-string v2, "gps"

    invoke-virtual {v0, v2}, Lcom/shopkick/app/location/SKLocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    .line 41
    iget-object v2, p0, Lcom/shopkick/app/location/LocationNotifier;->locationManager:Lcom/shopkick/app/location/SKLocationManager;

    const-string v3, "network"

    invoke-virtual {v2, v3}, Lcom/shopkick/app/location/SKLocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v2

    if-nez v0, :cond_2

    if-nez v2, :cond_2

    const/4 v0, 0x3

    return v0

    .line 49
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/location/LocationNotifier;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/utilities/GooglePlayServicesUtility;->isGooglePlayServicesAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x2

    return v0

    :cond_3
    return v1

    :cond_4
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
