.class Lcom/shopkick/app/location/LocationMapScreen$LocationMapOnMapReadyCallback;
.super Ljava/lang/Object;
.source "LocationMapScreen.java"

# interfaces
.implements Lcom/google/android/gms/maps/OnMapReadyCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/location/LocationMapScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LocationMapOnMapReadyCallback"
.end annotation


# instance fields
.field private screenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/location/LocationMapScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/location/LocationMapScreen;)V
    .locals 1

    .line 501
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 502
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen$LocationMapOnMapReadyCallback;->screenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 1

    .line 507
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen$LocationMapOnMapReadyCallback;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/location/LocationMapScreen;

    if-eqz v0, :cond_0

    .line 509
    invoke-virtual {v0, p1}, Lcom/shopkick/app/location/LocationMapScreen;->onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V

    :cond_0
    return-void
.end method
