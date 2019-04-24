.class public interface abstract Lcom/ibotta/android/location/geofence/GeofenceCoordinator;
.super Ljava/lang/Object;
.source "GeofenceCoordinator.kt"

# interfaces
.implements Lcom/ibotta/android/location/LocationStatusListener;
.implements Lcom/ibotta/android/state/user/LogOutListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0008f\u0018\u00002\u00020\u00012\u00020\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H&J\u0008\u0010\u0005\u001a\u00020\u0004H&J\u0008\u0010\u0006\u001a\u00020\u0004H&J\u0008\u0010\u0007\u001a\u00020\u0004H&J\u0008\u0010\u0008\u001a\u00020\u0004H&J\u0008\u0010\t\u001a\u00020\u0004H&J\u0008\u0010\n\u001a\u00020\u0004H&J\u0008\u0010\u000b\u001a\u00020\u0004H&\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
        "Lcom/ibotta/android/state/user/LogOutListener;",
        "Lcom/ibotta/android/location/LocationStatusListener;",
        "coordinate",
        "",
        "onAppStart",
        "onBatteryChange",
        "onBoot",
        "onLocationPermissionAccepted",
        "onLogIn",
        "onLogOut",
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


# virtual methods
.method public abstract coordinate()V
.end method

.method public abstract onAppStart()V
.end method

.method public abstract onBatteryChange()V
.end method

.method public abstract onBoot()V
.end method

.method public abstract onLocationPermissionAccepted()V
.end method

.method public abstract onLogIn()V
.end method

.method public abstract onLogOut()V
.end method

.method public abstract onSettingChange()V
.end method
