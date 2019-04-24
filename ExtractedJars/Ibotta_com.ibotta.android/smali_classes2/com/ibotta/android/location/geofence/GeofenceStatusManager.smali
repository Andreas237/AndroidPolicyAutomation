.class public interface abstract Lcom/ibotta/android/location/geofence/GeofenceStatusManager;
.super Ljava/lang/Object;
.source "GeofenceStatusManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/ibotta/android/location/geofence/GeofenceStatusManager;",
        "",
        "lastGeofenceStatus",
        "Lcom/ibotta/android/state/GeofenceStatus;",
        "getLastGeofenceStatus",
        "()Lcom/ibotta/android/state/GeofenceStatus;",
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


# virtual methods
.method public abstract getLastGeofenceStatus()Lcom/ibotta/android/state/GeofenceStatus;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract invalidateGeofenceStatus()V
.end method
