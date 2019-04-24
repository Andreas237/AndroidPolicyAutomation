.class public final Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;
.super Ljava/lang/Object;
.source "RadarGeofenceConfig.kt"

# interfaces
.implements Lcom/ibotta/android/location/geofence/GeofenceConfig;
.implements Lcom/ibotta/android/state/app/config/AppConfigListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0008\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;",
        "Lcom/ibotta/android/location/geofence/GeofenceConfig;",
        "Lcom/ibotta/android/state/app/config/AppConfigListener;",
        "geofenceConfigHelper",
        "Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;",
        "buildProfile",
        "Lcom/ibotta/android/profile/BuildProfile;",
        "debugState",
        "Lcom/ibotta/android/state/app/debug/DebugState;",
        "(Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;)V",
        "apiKey",
        "",
        "getApiKey",
        "()Ljava/lang/String;",
        "isConfiguredForResponsiveness",
        "",
        "()Z",
        "isGeofenceMasterSwitchOn",
        "onAppConfigChanged",
        "",
        "ibotta-location_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final debugState:Lcom/ibotta/android/state/app/debug/DebugState;

.field private final geofenceConfigHelper:Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/profile/BuildProfile;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/state/app/debug/DebugState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "geofenceConfigHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildProfile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;->geofenceConfigHelper:Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;

    iput-object p2, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    iput-object p3, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    return-void
.end method


# virtual methods
.method public final getApiKey()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v0}, Lcom/ibotta/android/profile/BuildProfile;->isDebugRadar()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/debug/DebugState;->useRadarTestApi()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->RADAR_TEST_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v0, v1}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v0}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppKeyProvider(KeyType.RADAR_TEST_KEY).keyString"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->RADAR_LIVE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v0, v1}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v0}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppKeyProvider(KeyType.RADAR_LIVE_KEY).keyString"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public isConfiguredForResponsiveness()Z
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;->geofenceConfigHelper:Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;

    invoke-virtual {v0}, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->getConfig()Lcom/ibotta/android/location/geofence/Config;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/location/geofence/Config;->isConfiguredForResponsiveness()Z

    move-result v0

    return v0
.end method

.method public isGeofenceMasterSwitchOn()Z
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;->geofenceConfigHelper:Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;

    invoke-virtual {v0}, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->getConfig()Lcom/ibotta/android/location/geofence/Config;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/location/geofence/Config;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public onAppConfigChanged()V
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;->geofenceConfigHelper:Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;

    invoke-virtual {v0}, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;->onAppConfigChanged()V

    return-void
.end method
