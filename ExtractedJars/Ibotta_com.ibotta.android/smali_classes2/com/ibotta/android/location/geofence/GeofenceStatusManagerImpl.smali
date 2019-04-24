.class public final Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;
.super Ljava/lang/Object;
.source "GeofenceStatusManagerImpl.kt"

# interfaces
.implements Lcom/ibotta/android/location/geofence/GeofenceStatusManager;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0008\u0010$\u001a\u00020%H\u0016R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001eR$\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0019@RX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\u001b\"\u0004\u0008\"\u0010#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;",
        "Lcom/ibotta/android/location/geofence/GeofenceStatusManager;",
        "appContext",
        "Landroid/content/Context;",
        "locale",
        "Ljava/util/Locale;",
        "userState",
        "Lcom/ibotta/android/state/user/UserState;",
        "authManager",
        "Lcom/ibotta/android/state/user/auth/AuthManager;",
        "geofenceConfig",
        "Lcom/ibotta/android/location/geofence/GeofenceConfig;",
        "globalEventManager",
        "Lcom/ibotta/android/state/GlobalEventManager;",
        "appHelper",
        "Lcom/ibotta/android/util/AppHelper;",
        "geofenceStatusListener",
        "Lcom/ibotta/android/location/geofence/GeofenceStatusListener;",
        "(Landroid/content/Context;Ljava/util/Locale;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/location/geofence/GeofenceConfig;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/location/geofence/GeofenceStatusListener;)V",
        "MIN_BATTERY_PERCENTAGE",
        "",
        "MURICA",
        "",
        "kotlin.jvm.PlatformType",
        "geofenceStatus",
        "Lcom/ibotta/android/state/GeofenceStatus;",
        "getGeofenceStatus",
        "()Lcom/ibotta/android/state/GeofenceStatus;",
        "isBatteryOk",
        "",
        "()Z",
        "value",
        "lastGeofenceStatus",
        "getLastGeofenceStatus",
        "setLastGeofenceStatus",
        "(Lcom/ibotta/android/state/GeofenceStatus;)V",
        "invalidateGeofenceStatus",
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
.field private final MIN_BATTERY_PERCENTAGE:F

.field private final MURICA:Ljava/lang/String;

.field private final appContext:Landroid/content/Context;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private final geofenceConfig:Lcom/ibotta/android/location/geofence/GeofenceConfig;

.field private final geofenceStatusListener:Lcom/ibotta/android/location/geofence/GeofenceStatusListener;

.field private final globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

.field private lastGeofenceStatus:Lcom/ibotta/android/state/GeofenceStatus;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final locale:Ljava/util/Locale;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Locale;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/location/geofence/GeofenceConfig;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/location/geofence/GeofenceStatusListener;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Locale;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/state/user/UserState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/state/user/auth/AuthManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/location/geofence/GeofenceConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/ibotta/android/state/GlobalEventManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/ibotta/android/util/AppHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/ibotta/android/location/geofence/GeofenceStatusListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "geofenceConfig"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalEventManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appHelper"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "geofenceStatusListener"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->appContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->locale:Ljava/util/Locale;

    iput-object p3, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    iput-object p4, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    iput-object p5, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->geofenceConfig:Lcom/ibotta/android/location/geofence/GeofenceConfig;

    iput-object p6, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    iput-object p7, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iput-object p8, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->geofenceStatusListener:Lcom/ibotta/android/location/geofence/GeofenceStatusListener;

    const/high16 p1, 0x41200000    # 10.0f

    .line 31
    iput p1, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->MIN_BATTERY_PERCENTAGE:F

    .line 32
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string p2, "Locale.US"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->MURICA:Ljava/lang/String;

    .line 34
    sget-object p1, Lcom/ibotta/android/state/GeofenceStatus;->UNKNOWN:Lcom/ibotta/android/state/GeofenceStatus;

    iput-object p1, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->lastGeofenceStatus:Lcom/ibotta/android/state/GeofenceStatus;

    return-void
.end method

.method private final getGeofenceStatus()Lcom/ibotta/android/state/GeofenceStatus;
    .locals 4

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->appContext:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/location/LocationManager;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Landroid/location/LocationManager;

    .line 40
    sget-object v1, Lcom/ibotta/android/location/geofence/GeofenceModule;->INSTANCE:Lcom/ibotta/android/location/geofence/GeofenceModule;

    invoke-virtual {v1}, Lcom/ibotta/android/location/geofence/GeofenceModule;->getPermissionsState()Lcom/ibotta/android/state/app/permissions/PermissionsState;

    move-result-object v1

    .line 43
    iget-object v2, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->MURICA:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->locale:Ljava/util/Locale;

    invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    sget-object v0, Lcom/ibotta/android/state/GeofenceStatus;->INVALID_LOCALE:Lcom/ibotta/android/state/GeofenceStatus;

    goto :goto_1

    .line 44
    :cond_1
    iget-object v2, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v0, Lcom/ibotta/android/state/GeofenceStatus;->LOGGED_OUT:Lcom/ibotta/android/state/GeofenceStatus;

    goto :goto_1

    .line 45
    :cond_2
    iget-object v2, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->geofenceConfig:Lcom/ibotta/android/location/geofence/GeofenceConfig;

    invoke-interface {v2}, Lcom/ibotta/android/location/geofence/GeofenceConfig;->isGeofenceMasterSwitchOn()Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v0, Lcom/ibotta/android/state/GeofenceStatus;->MASTER_SWITCH_OFF:Lcom/ibotta/android/state/GeofenceStatus;

    goto :goto_1

    .line 46
    :cond_3
    iget-object v2, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->isGeofencingEnabled()Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v0, Lcom/ibotta/android/state/GeofenceStatus;->GEOFENCE_SETTING_OFF:Lcom/ibotta/android/state/GeofenceStatus;

    goto :goto_1

    .line 47
    :cond_4
    iget-object v2, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v2}, Lcom/ibotta/android/util/AppHelper;->isGooglePlayServicesAvailable()Z

    move-result v2

    if-nez v2, :cond_5

    sget-object v0, Lcom/ibotta/android/state/GeofenceStatus;->NO_GOOGLE_PLAY_SERVICES:Lcom/ibotta/android/state/GeofenceStatus;

    goto :goto_1

    :cond_5
    if-eqz v0, :cond_9

    const-string v2, "network"

    .line 48
    invoke-virtual {v0, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    .line 50
    :cond_6
    invoke-direct {p0}, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->isBatteryOk()Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Lcom/ibotta/android/state/GeofenceStatus;->BATTERY_LOW:Lcom/ibotta/android/state/GeofenceStatus;

    goto :goto_1

    .line 51
    :cond_7
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->appContext:Landroid/content/Context;

    sget-object v2, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-interface {v1, v0, v2}, Lcom/ibotta/android/state/app/permissions/PermissionsState;->isPermissionGranted(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 52
    sget-object v0, Lcom/ibotta/android/state/GeofenceStatus;->PERMISSION_DENIED:Lcom/ibotta/android/state/GeofenceStatus;

    goto :goto_1

    .line 53
    :cond_8
    sget-object v0, Lcom/ibotta/android/state/GeofenceStatus;->OK:Lcom/ibotta/android/state/GeofenceStatus;

    goto :goto_1

    .line 49
    :cond_9
    :goto_0
    sget-object v0, Lcom/ibotta/android/state/GeofenceStatus;->LOCATION_WIFI_OFF:Lcom/ibotta/android/state/GeofenceStatus;

    :goto_1
    return-object v0
.end method

.method private final isBatteryOk()Z
    .locals 6

    .line 59
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 60
    iget-object v1, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->appContext:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "level"

    const/4 v2, -0x1

    .line 63
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    const-string v3, "scale"

    .line 64
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/16 v2, 0x64

    int-to-float v2, v2

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    mul-float v2, v2, v1

    goto :goto_0

    :cond_0
    const/high16 v2, 0x42c80000    # 100.0f

    :goto_0
    const-string v0, "Battery at %1$f%%"

    const/4 v1, 0x1

    .line 70
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    iget v0, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->MIN_BATTERY_PERCENTAGE:F

    cmpl-float v0, v2, v0

    if-ltz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method private setLastGeofenceStatus(Lcom/ibotta/android/state/GeofenceStatus;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->lastGeofenceStatus:Lcom/ibotta/android/state/GeofenceStatus;

    return-void
.end method


# virtual methods
.method public getLastGeofenceStatus()Lcom/ibotta/android/state/GeofenceStatus;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->lastGeofenceStatus:Lcom/ibotta/android/state/GeofenceStatus;

    return-object v0
.end method

.method public invalidateGeofenceStatus()V
    .locals 3

    .line 75
    invoke-direct {p0}, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->getGeofenceStatus()Lcom/ibotta/android/state/GeofenceStatus;

    move-result-object v0

    .line 77
    invoke-virtual {p0}, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->getLastGeofenceStatus()Lcom/ibotta/android/state/GeofenceStatus;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 79
    iget-object v1, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    invoke-virtual {p0}, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->getLastGeofenceStatus()Lcom/ibotta/android/state/GeofenceStatus;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/state/GlobalEventManager;->onGeofenceStatusChanged(Lcom/ibotta/android/state/GeofenceStatus;)V

    .line 82
    :cond_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->setLastGeofenceStatus(Lcom/ibotta/android/state/GeofenceStatus;)V

    .line 84
    iget-object v1, p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;->geofenceStatusListener:Lcom/ibotta/android/location/geofence/GeofenceStatusListener;

    invoke-interface {v1, v0}, Lcom/ibotta/android/location/geofence/GeofenceStatusListener;->onGeofenceStatusInvalidated(Lcom/ibotta/android/state/GeofenceStatus;)V

    return-void
.end method
