.class public interface abstract Lcom/ibotta/android/location/LocationStatusDispatcher;
.super Ljava/lang/Object;
.source "LocationStatusDispatcher.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ibotta/android/location/LocationStatusDispatcher;",
        "",
        "addListener",
        "",
        "listener",
        "Lcom/ibotta/android/location/LocationStatusListener;",
        "onLocationChanged",
        "location",
        "Landroid/location/Location;",
        "onLocationStatusChanged",
        "locationEnabled",
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
.method public abstract addListener(Lcom/ibotta/android/location/LocationStatusListener;)V
    .param p1    # Lcom/ibotta/android/location/LocationStatusListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onLocationChanged(Landroid/location/Location;)V
    .param p1    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onLocationStatusChanged(Z)V
.end method
