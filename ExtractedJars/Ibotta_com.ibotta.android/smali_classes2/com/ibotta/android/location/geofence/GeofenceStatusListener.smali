.class public interface abstract Lcom/ibotta/android/location/geofence/GeofenceStatusListener;
.super Ljava/lang/Object;
.source "GeofenceStatusListener.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/ibotta/android/location/geofence/GeofenceStatusListener;",
        "",
        "onGeofenceStatusInvalidated",
        "",
        "newGeofenceStatus",
        "Lcom/ibotta/android/state/GeofenceStatus;",
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
.method public abstract onGeofenceStatusInvalidated(Lcom/ibotta/android/state/GeofenceStatus;)V
    .param p1    # Lcom/ibotta/android/state/GeofenceStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
