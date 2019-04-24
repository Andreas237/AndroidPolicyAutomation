.class Lcom/shopkick/app/location/LocationMapScreen$ButtonClick;
.super Ljava/lang/Object;
.source "LocationMapScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/location/LocationMapScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ButtonClick"
.end annotation


# instance fields
.field private locationMapScreenRef:Ljava/lang/ref/WeakReference;
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

    .line 424
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 425
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen$ButtonClick;->locationMapScreenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 430
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen$ButtonClick;->locationMapScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/location/LocationMapScreen;

    if-eqz v0, :cond_2

    .line 432
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    const v2, 0x7f09049d

    if-ne v1, v2, :cond_1

    .line 435
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 436
    invoke-static {v0}, Lcom/shopkick/app/location/LocationMapScreen;->access$200(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 437
    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 438
    new-instance p1, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {p1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    .line 439
    invoke-virtual {p1, v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 440
    invoke-static {v0}, Lcom/shopkick/app/location/LocationMapScreen;->access$900(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 441
    invoke-static {v0}, Lcom/shopkick/app/location/LocationMapScreen;->access$900(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 444
    :cond_0
    invoke-static {v0}, Lcom/shopkick/app/location/LocationMapScreen;->access$000(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/SupportMapFragment;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/maps/SupportMapFragment;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-static {}, Lcom/shopkick/app/location/LocationMapScreen;->access$100()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    div-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 445
    invoke-static {v0}, Lcom/shopkick/app/location/LocationMapScreen;->access$200(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object p1

    .line 446
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 445
    invoke-static {p1, v1}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    goto :goto_0

    .line 448
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v1, 0x7f090493

    if-ne p1, v1, :cond_2

    .line 449
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v1, "chain_id"

    .line 450
    invoke-static {v0}, Lcom/shopkick/app/location/LocationMapScreen;->access$1000(Lcom/shopkick/app/location/LocationMapScreen;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_id"

    .line 451
    invoke-static {v0}, Lcom/shopkick/app/location/LocationMapScreen;->access$1100(Lcom/shopkick/app/location/LocationMapScreen;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "chain_name"

    .line 452
    invoke-static {v0}, Lcom/shopkick/app/location/LocationMapScreen;->access$400(Lcom/shopkick/app/location/LocationMapScreen;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "origin_element"

    const/16 v2, 0x89

    .line 453
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    const-class v1, Lcom/shopkick/app/chains/ChainListScreen;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/location/LocationMapScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_2
    :goto_0
    return-void
.end method
