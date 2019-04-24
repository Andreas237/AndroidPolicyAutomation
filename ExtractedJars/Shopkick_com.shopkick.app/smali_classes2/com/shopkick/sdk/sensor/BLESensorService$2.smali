.class final Lcom/shopkick/sdk/sensor/BLESensorService$2;
.super Ljava/lang/Object;
.source "BLESensorService.java"

# interfaces
.implements Lcom/shopkick/sdk/core/ConfigurationProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/BLESensorService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field private final serverFlags:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    new-instance v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    invoke-direct {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/BLESensorService$2;->serverFlags:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    return-void
.end method


# virtual methods
.method public getForcedLocation()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/BLESensorService$2;->serverFlags:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    return-object v0
.end method

.method public isExperimentalBatteryImprovementEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isWiFiEnabledInBackground()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isWiFiEnabledInForeground()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isWiFiScanningEnabledWithoutGeofencing()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
