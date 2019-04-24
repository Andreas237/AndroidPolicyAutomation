.class Lcom/shopkick/app/application/SKApp$2;
.super Ljava/lang/Object;
.source "SKApp.java"

# interfaces
.implements Lcom/shopkick/sdk/core/ConfigurationProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/application/SKApp;->initializeSDKClientAccessor()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/application/SKApp;


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/SKApp;)V
    .locals 0

    .line 1580
    iput-object p1, p0, Lcom/shopkick/app/application/SKApp$2;->this$0:Lcom/shopkick/app/application/SKApp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getForcedLocation()Lcom/google/android/gms/maps/model/LatLng;
    .locals 6

    .line 1591
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "DEBUG_FLAG_USE_PROVIDED_GPS"

    .line 1592
    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1593
    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    sget-object v2, Lcom/shopkick/app/application/AppDebugFlags;->DEBUG_LAT:Ljava/lang/String;

    const v3, 0x4215c955

    invoke-virtual {v0, v2, v3}, Lcom/shopkick/app/flags/SKFlags;->getFloat(Ljava/lang/String;F)F

    move-result v2

    float-to-double v2, v2

    sget-object v4, Lcom/shopkick/app/application/AppDebugFlags;->DEBUG_LNG:Ljava/lang/String;

    const v5, -0x3d0bae39

    .line 1594
    invoke-virtual {v0, v4, v5}, Lcom/shopkick/app/flags/SKFlags;->getFloat(Ljava/lang/String;F)F

    move-result v0

    float-to-double v4, v0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;
    .locals 1

    .line 1584
    new-instance v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    invoke-direct {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;-><init>()V

    .line 1585
    invoke-virtual {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->postProcess()V

    return-object v0
.end method

.method public isExperimentalBatteryImprovementEnabled()Z
    .locals 1

    .line 1602
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp$2;->this$0:Lcom/shopkick/app/application/SKApp;

    iget-object v0, v0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isUseNewBatteryImplementationAndroid(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    return v0
.end method

.method public isWiFiEnabledInBackground()Z
    .locals 1

    .line 1612
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp$2;->this$0:Lcom/shopkick/app/application/SKApp;

    iget-object v0, v0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWifiScanningEnabledInBackground(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    return v0
.end method

.method public isWiFiEnabledInForeground()Z
    .locals 1

    .line 1607
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp$2;->this$0:Lcom/shopkick/app/application/SKApp;

    iget-object v0, v0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWifiScanningEnabledInForeground(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    return v0
.end method

.method public isWiFiScanningEnabledWithoutGeofencing()Z
    .locals 1

    .line 1617
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp$2;->this$0:Lcom/shopkick/app/application/SKApp;

    iget-object v0, v0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWifiScanningEnabledWithoutGeofencing(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    return v0
.end method
