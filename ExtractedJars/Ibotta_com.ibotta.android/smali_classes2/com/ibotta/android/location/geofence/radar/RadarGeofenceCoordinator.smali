.class public final Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;
.super Ljava/lang/Object;
.source "RadarGeofenceCoordinator.kt"

# interfaces
.implements Lcom/ibotta/android/location/geofence/GeofenceCoordinator;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016J\u0008\u0010\u0008\u001a\u00020\u0006H\u0016J\u0008\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0008\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\u0006H\u0016J\u0008\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0008\u0010\u0014\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;",
        "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
        "geofenceStatusManager",
        "Lcom/ibotta/android/location/geofence/GeofenceStatusManager;",
        "(Lcom/ibotta/android/location/geofence/GeofenceStatusManager;)V",
        "coordinate",
        "",
        "onAppStart",
        "onBatteryChange",
        "onBoot",
        "onLocationChanged",
        "location",
        "Landroid/location/Location;",
        "onLocationPermissionAccepted",
        "onLocationStatusChanged",
        "locationEnabled",
        "",
        "onLogIn",
        "onLogOut",
        "serverAuthLost",
        "onSettingChange",
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
.field private final geofenceStatusManager:Lcom/ibotta/android/location/geofence/GeofenceStatusManager;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/location/geofence/GeofenceStatusManager;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/location/geofence/GeofenceStatusManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "geofenceStatusManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;->geofenceStatusManager:Lcom/ibotta/android/location/geofence/GeofenceStatusManager;

    return-void
.end method


# virtual methods
.method public coordinate()V
    .locals 2

    const-string v0, "coordinate()"

    const/4 v1, 0x0

    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;->geofenceStatusManager:Lcom/ibotta/android/location/geofence/GeofenceStatusManager;

    invoke-interface {v0}, Lcom/ibotta/android/location/geofence/GeofenceStatusManager;->invalidateGeofenceStatus()V

    return-void
.end method

.method public onAppStart()V
    .locals 2

    const-string v0, "onAppStart()"

    const/4 v1, 0x0

    .line 25
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;->coordinate()V

    return-void
.end method

.method public onBatteryChange()V
    .locals 2

    const-string v0, "onBatteryChange()"

    const/4 v1, 0x0

    .line 30
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    invoke-virtual {p0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;->coordinate()V

    return-void
.end method

.method public onBoot()V
    .locals 2

    const-string v0, "onAppBoot()"

    const/4 v1, 0x0

    .line 20
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    invoke-virtual {p0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;->coordinate()V

    return-void
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 1
    .param p1    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onLocationChanged()"

    const/4 v0, 0x0

    .line 60
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;->coordinate()V

    return-void
.end method

.method public onLocationPermissionAccepted()V
    .locals 2

    const-string v0, "onLocationPermissionAccepted()"

    const/4 v1, 0x0

    .line 35
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;->coordinate()V

    return-void
.end method

.method public onLocationStatusChanged(Z)V
    .locals 1

    const-string p1, "onLocationStatusChange()"

    const/4 v0, 0x0

    .line 65
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;->coordinate()V

    return-void
.end method

.method public onLogIn()V
    .locals 2

    const-string v0, "onLogIn()"

    const/4 v1, 0x0

    .line 45
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;->coordinate()V

    return-void
.end method

.method public onLogOut()V
    .locals 2

    const-string v0, "onLogOut()"

    const/4 v1, 0x0

    .line 50
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    invoke-virtual {p0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;->coordinate()V

    return-void
.end method

.method public onLogOut(Z)V
    .locals 1

    const-string p1, "onLogOut()"

    const/4 v0, 0x0

    .line 55
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;->onLogOut()V

    return-void
.end method

.method public onSettingChange()V
    .locals 2

    const-string v0, "onSettingChange()"

    const/4 v1, 0x0

    .line 40
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    invoke-virtual {p0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;->coordinate()V

    return-void
.end method
