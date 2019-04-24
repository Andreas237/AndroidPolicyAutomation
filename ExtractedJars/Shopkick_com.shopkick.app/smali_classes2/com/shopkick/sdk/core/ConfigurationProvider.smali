.class public interface abstract Lcom/shopkick/sdk/core/ConfigurationProvider;
.super Ljava/lang/Object;
.source "ConfigurationProvider.java"


# virtual methods
.method public abstract getForcedLocation()Lcom/google/android/gms/maps/model/LatLng;
.end method

.method public abstract getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;
.end method

.method public abstract isExperimentalBatteryImprovementEnabled()Z
.end method

.method public abstract isWiFiEnabledInBackground()Z
.end method

.method public abstract isWiFiEnabledInForeground()Z
.end method

.method public abstract isWiFiScanningEnabledWithoutGeofencing()Z
.end method
