.class public Lcom/shopkick/app/location/LocationMapScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "LocationMapScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/location/LocationMapScreen$LocationMapOnMapReadyCallback;,
        Lcom/shopkick/app/location/LocationMapScreen$ButtonClick;
    }
.end annotation


# static fields
.field private static final DEST_PREFIX:Ljava/lang/String; = "&daddr="

.field private static final GEO_PREFIX:Ljava/lang/String; = "http://maps.google.com/maps?saddr="

.field private static final LOG_TAG:Ljava/lang/String; = "LocationMapScreen"

.field private static final PADDING_FACTOR:Ljava/lang/Integer;


# instance fields
.field private address:Ljava/lang/String;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private chainId:Ljava/lang/String;

.field private container:Landroid/view/ViewGroup;

.field private districtId:Ljava/lang/String;

.field private getMapLocationRequest:Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;

.field private googleMap:Lcom/google/android/gms/maps/GoogleMap;

.field private inflater:Landroid/view/LayoutInflater;

.field private locationId:Ljava/lang/String;

.field private locationName:Ljava/lang/String;

.field private mapFragment:Lcom/google/android/gms/maps/SupportMapFragment;

.field private moreStoresButton:Lcom/shopkick/app/widget/SKButton;

.field private myLocationButton:Landroid/widget/ImageView;

.field private progressBar:Landroid/widget/ProgressBar;

.field private storeLatitude:Ljava/lang/Double;

.field private storeLocation:Lcom/google/android/gms/maps/model/LatLng;

.field private storeLongitude:Ljava/lang/Double;

.field private storeMarker:Lcom/google/android/gms/maps/model/Marker;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    .line 74
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/location/LocationMapScreen;->PADDING_FACTOR:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/SupportMapFragment;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/shopkick/app/location/LocationMapScreen;->mapFragment:Lcom/google/android/gms/maps/SupportMapFragment;

    return-object p0
.end method

.method static synthetic access$100()Ljava/lang/Integer;
    .locals 1

    .line 55
    sget-object v0, Lcom/shopkick/app/location/LocationMapScreen;->PADDING_FACTOR:Ljava/lang/Integer;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/shopkick/app/location/LocationMapScreen;)Ljava/lang/String;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/shopkick/app/location/LocationMapScreen;->chainId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/shopkick/app/location/LocationMapScreen;)Ljava/lang/String;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/shopkick/app/location/LocationMapScreen;->locationId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/GoogleMap;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/location/LocationMapScreen;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/shopkick/app/location/LocationMapScreen;->launchMapsApp()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/location/LocationMapScreen;)Ljava/lang/String;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/shopkick/app/location/LocationMapScreen;->locationName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/location/LocationMapScreen;)Landroid/view/LayoutInflater;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/shopkick/app/location/LocationMapScreen;->inflater:Landroid/view/LayoutInflater;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/location/LocationMapScreen;)Landroid/view/ViewGroup;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/shopkick/app/location/LocationMapScreen;->container:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/location/LocationMapScreen;)Ljava/lang/String;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/shopkick/app/location/LocationMapScreen;->address:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$800(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/model/Marker;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeMarker:Lcom/google/android/gms/maps/model/Marker;

    return-object p0
.end method

.method static synthetic access$900(Lcom/shopkick/app/location/LocationMapScreen;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLocation:Lcom/google/android/gms/maps/model/LatLng;

    return-object p0
.end method

.method private centerAndZoomMap()V
    .locals 6

    .line 379
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLatitude:Ljava/lang/Double;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLongitude:Ljava/lang/Double;

    if-nez v1, :cond_0

    goto/16 :goto_0

    .line 382
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide v2, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    .line 383
    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLongitude:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    mul-double/2addr v4, v2

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    .line 386
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double v0, v2, v4

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    cmpl-double v0, v0, v4

    if-nez v0, :cond_1

    return-void

    .line 391
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setMyLocationEnabled(Z)V

    .line 392
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/UiSettings;->setMyLocationButtonEnabled(Z)V

    .line 393
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/UiSettings;->setZoomControlsEnabled(Z)V

    .line 394
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLatitude:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iget-object v3, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLongitude:Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLocation:Lcom/google/android/gms/maps/model/LatLng;

    .line 395
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLocation:Lcom/google/android/gms/maps/model/LatLng;

    const/high16 v2, 0x41880000    # 17.0f

    invoke-static {v1, v2}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 396
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    iget-object v2, p0, Lcom/shopkick/app/location/LocationMapScreen;->locationName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->title(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLocation:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeMarker:Lcom/google/android/gms/maps/model/Marker;

    .line 397
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeMarker:Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->showInfoWindow()V

    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method private convertAddress(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 415
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v0, "\n"

    const-string v1, ", "

    .line 416
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private customizeMap()V
    .locals 2

    .line 329
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v1, Lcom/shopkick/app/location/LocationMapScreen$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/location/LocationMapScreen$2;-><init>(Lcom/shopkick/app/location/LocationMapScreen;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setOnMarkerClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;)V

    .line 337
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v1, Lcom/shopkick/app/location/LocationMapScreen$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/location/LocationMapScreen$3;-><init>(Lcom/shopkick/app/location/LocationMapScreen;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setOnInfoWindowClickListener(Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;)V

    .line 345
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v1, Lcom/shopkick/app/location/LocationMapScreen$4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/location/LocationMapScreen$4;-><init>(Lcom/shopkick/app/location/LocationMapScreen;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setInfoWindowAdapter(Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;)V

    .line 367
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v1, Lcom/shopkick/app/location/LocationMapScreen$5;

    invoke-direct {v1, p0}, Lcom/shopkick/app/location/LocationMapScreen$5;-><init>(Lcom/shopkick/app/location/LocationMapScreen;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setOnMapClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;)V

    return-void
.end method

.method private handleMapParams()V
    .locals 4

    .line 290
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->getMapLocationRequest:Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;

    if-eqz v0, :cond_0

    return-void

    .line 293
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeMarker:Lcom/google/android/gms/maps/model/Marker;

    if-eqz v0, :cond_1

    .line 294
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    const/4 v0, 0x0

    .line 295
    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeMarker:Lcom/google/android/gms/maps/model/Marker;

    .line 297
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLatitude:Ljava/lang/Double;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLongitude:Ljava/lang/Double;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->locationName:Ljava/lang/String;

    if-nez v0, :cond_4

    .line 299
    :cond_2
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->getMapLocationRequest:Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;

    .line 300
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 302
    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->getMapLocationRequest:Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;->userLatitude:Ljava/lang/Double;

    .line 303
    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->getMapLocationRequest:Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;->userLongitude:Ljava/lang/Double;

    .line 305
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->getMapLocationRequest:Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;

    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->districtId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;->districtId:Ljava/lang/String;

    .line 306
    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->chainId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;->chainId:Ljava/lang/String;

    .line 307
    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->locationId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;->locationId:Ljava/lang/String;

    .line 308
    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 310
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLatitude:Ljava/lang/Double;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLongitude:Ljava/lang/Double;

    if-nez v0, :cond_5

    goto :goto_0

    .line 314
    :cond_5
    invoke-direct {p0}, Lcom/shopkick/app/location/LocationMapScreen;->showContent()V

    goto :goto_1

    .line 312
    :cond_6
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private launchMapsApp()V
    .locals 4

    .line 280
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 282
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "http://maps.google.com/maps?saddr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 283
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&daddr="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLatitude:Ljava/lang/Double;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLongitude:Ljava/lang/Double;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 284
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 285
    invoke-virtual {p0, v1}, Lcom/shopkick/app/location/LocationMapScreen;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method private setMapLocation(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "district_id"

    .line 95
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->districtId:Ljava/lang/String;

    const-string v0, "location_id"

    .line 96
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->locationId:Ljava/lang/String;

    const-string v0, "chain_id"

    .line 97
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->chainId:Ljava/lang/String;

    const/4 v0, 0x0

    .line 98
    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLatitude:Ljava/lang/Double;

    const-string v1, "latitude"

    .line 99
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, "latitude"

    .line 100
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLatitude:Ljava/lang/Double;

    .line 102
    :cond_0
    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLongitude:Ljava/lang/Double;

    const-string v0, "longitude"

    .line 103
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v0, "longitude"

    .line 104
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLongitude:Ljava/lang/Double;

    :cond_1
    const-string v0, "location_name"

    .line 106
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->locationName:Ljava/lang/String;

    const-string v0, "location_address"

    .line 107
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/location/LocationMapScreen;->convertAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen;->address:Ljava/lang/String;

    return-void
.end method

.method private setupMap()V
    .locals 10

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 160
    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setMyLocationEnabled(Z)V

    .line 162
    invoke-direct {p0}, Lcom/shopkick/app/location/LocationMapScreen;->handleMapParams()V

    .line 166
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 167
    iget-object v2, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLatitude:Ljava/lang/Double;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLongitude:Ljava/lang/Double;

    if-eqz v2, :cond_2

    .line 168
    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 169
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v3, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLatitude:Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    iget-object v5, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLongitude:Ljava/lang/Double;

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    invoke-direct {v0, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iput-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLocation:Lcom/google/android/gms/maps/model/LatLng;

    .line 170
    new-instance v0, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    .line 171
    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 172
    iget-object v3, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLocation:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 173
    iget-object v3, p0, Lcom/shopkick/app/location/LocationMapScreen;->mapFragment:Lcom/google/android/gms/maps/SupportMapFragment;

    invoke-virtual {v3}, Lcom/google/android/gms/maps/SupportMapFragment;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    sget-object v4, Lcom/shopkick/app/location/LocationMapScreen;->PADDING_FACTOR:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    div-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 176
    :try_start_0
    iget-object v4, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v5

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v5, v6}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v4

    .line 184
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v5

    const-string v6, "LocationMapScreen"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "IllegalStateException triggered: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    iget-object v5, p0, Lcom/shopkick/app/location/LocationMapScreen;->mapFragment:Lcom/google/android/gms/maps/SupportMapFragment;

    invoke-virtual {v5}, Lcom/google/android/gms/maps/SupportMapFragment;->getView()Landroid/view/View;

    move-result-object v5

    .line 186
    invoke-virtual {v5}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 187
    invoke-virtual {v5}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/location/LocationMapScreen$1;

    invoke-direct {v2, p0, v5, v0}, Lcom/shopkick/app/location/LocationMapScreen$1;-><init>(Lcom/shopkick/app/location/LocationMapScreen;Landroid/view/View;Lcom/google/android/gms/maps/model/LatLngBounds$Builder;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0

    .line 202
    :cond_1
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    .line 204
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    const/4 v7, 0x7

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v3, v7, v8

    .line 209
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v7, v1

    const/4 v1, 0x2

    .line 210
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v7, v1

    const/4 v1, 0x3

    iget-wide v8, v2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    .line 211
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v7, v1

    const/4 v1, 0x4

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    .line 212
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v7, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLatitude:Ljava/lang/Double;

    aput-object v2, v7, v1

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLongitude:Ljava/lang/Double;

    aput-object v2, v7, v1

    const-string v1, "Layout info: Padding %d,  Width %d,Height %d, and (for sanity checking) My lat: %f, My long: %f, Store lat %f, Store long, %f"

    .line 204
    invoke-static {v6, v1, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "LocationMapScreen"

    .line 203
    invoke-virtual {v0, v2, v1}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    throw v4

    :cond_2
    :goto_0
    return-void
.end method

.method private showContent()V
    .locals 2

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->progressBar:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 322
    invoke-direct {p0}, Lcom/shopkick/app/location/LocationMapScreen;->customizeMap()V

    .line 324
    invoke-direct {p0}, Lcom/shopkick/app/location/LocationMapScreen;->centerAndZoomMap()V

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 466
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->getMapLocationRequest:Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 467
    iput-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen;->getMapLocationRequest:Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;

    .line 468
    iget-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen;->progressBar:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 469
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 470
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationResponse;

    .line 471
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationResponse;->statusCode:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 473
    :pswitch_0
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationResponse;->mapLatitude:Ljava/lang/Double;

    iput-object p2, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLatitude:Ljava/lang/Double;

    .line 474
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationResponse;->mapLongitude:Ljava/lang/Double;

    iput-object p2, p0, Lcom/shopkick/app/location/LocationMapScreen;->storeLongitude:Ljava/lang/Double;

    .line 475
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationResponse;->name:Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/location/LocationMapScreen;->locationName:Ljava/lang/String;

    .line 476
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationResponse;->formattedAddress:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/location/LocationMapScreen;->convertAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen;->address:Ljava/lang/String;

    .line 477
    invoke-direct {p0}, Lcom/shopkick/app/location/LocationMapScreen;->showContent()V

    :cond_0
    :goto_0
    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f1103cc

    .line 112
    invoke-virtual {p0, p3}, Lcom/shopkick/app/location/LocationMapScreen;->setAppScreenTitle(I)V

    .line 113
    iput-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen;->inflater:Landroid/view/LayoutInflater;

    .line 114
    iput-object p2, p0, Lcom/shopkick/app/location/LocationMapScreen;->container:Landroid/view/ViewGroup;

    const p3, 0x7f0c0111

    const/4 v0, 0x0

    .line 115
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 117
    invoke-virtual {p0}, Lcom/shopkick/app/location/LocationMapScreen;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p2

    .line 118
    invoke-static {}, Lcom/google/android/gms/maps/SupportMapFragment;->newInstance()Lcom/google/android/gms/maps/SupportMapFragment;

    move-result-object p3

    iput-object p3, p0, Lcom/shopkick/app/location/LocationMapScreen;->mapFragment:Lcom/google/android/gms/maps/SupportMapFragment;

    .line 119
    invoke-virtual {p2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object p3

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->mapFragment:Lcom/google/android/gms/maps/SupportMapFragment;

    const v1, 0x7f090465

    invoke-virtual {p3, v1, v0}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 121
    invoke-virtual {p3}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 122
    invoke-virtual {p2}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    .line 123
    iget-object p2, p0, Lcom/shopkick/app/location/LocationMapScreen;->mapFragment:Lcom/google/android/gms/maps/SupportMapFragment;

    new-instance p3, Lcom/shopkick/app/location/LocationMapScreen$LocationMapOnMapReadyCallback;

    invoke-direct {p3, p0}, Lcom/shopkick/app/location/LocationMapScreen$LocationMapOnMapReadyCallback;-><init>(Lcom/shopkick/app/location/LocationMapScreen;)V

    invoke-virtual {p2, p3}, Lcom/google/android/gms/maps/SupportMapFragment;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    const p2, 0x7f09054a

    .line 125
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/location/LocationMapScreen;->progressBar:Landroid/widget/ProgressBar;

    const p2, 0x7f09049d

    .line 127
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/location/LocationMapScreen;->myLocationButton:Landroid/widget/ImageView;

    .line 128
    iget-object p2, p0, Lcom/shopkick/app/location/LocationMapScreen;->myLocationButton:Landroid/widget/ImageView;

    new-instance p3, Lcom/shopkick/app/location/LocationMapScreen$ButtonClick;

    invoke-direct {p3, p0}, Lcom/shopkick/app/location/LocationMapScreen$ButtonClick;-><init>(Lcom/shopkick/app/location/LocationMapScreen;)V

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090493

    .line 130
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/location/LocationMapScreen;->moreStoresButton:Lcom/shopkick/app/widget/SKButton;

    .line 131
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p3, 0x89

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p2, p3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 132
    new-instance p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p3}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    const/4 v0, 0x1

    .line 133
    iput-boolean v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->moreStoresButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p2, v1, p3}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 135
    iget-object p2, p0, Lcom/shopkick/app/location/LocationMapScreen;->moreStoresButton:Lcom/shopkick/app/widget/SKButton;

    new-instance p3, Lcom/shopkick/app/location/LocationMapScreen$ButtonClick;

    invoke-direct {p3, p0}, Lcom/shopkick/app/location/LocationMapScreen$ButtonClick;-><init>(Lcom/shopkick/app/location/LocationMapScreen;)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 84
    invoke-direct {p0, p2}, Lcom/shopkick/app/location/LocationMapScreen;->setMapLocation(Ljava/util/Map;)V

    .line 85
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-void
.end method

.method public logNavigationTap()V
    .locals 3

    .line 401
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x8a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 402
    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method public logOptionsTap()V
    .locals 3

    .line 406
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x8b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 407
    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    const v0, 0x7f0d0003

    .line 254
    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    if-eqz v0, :cond_0

    .line 242
    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->getMapLocationRequest:Lcom/shopkick/app/fetchers/api/skapi/GetMapLocationRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 244
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 0

    .line 493
    iput-object p1, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    .line 494
    invoke-direct {p0}, Lcom/shopkick/app/location/LocationMapScreen;->setupMap()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 259
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f090216

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 261
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/location/LocationMapScreen;->logOptionsTap()V

    .line 262
    invoke-direct {p0}, Lcom/shopkick/app/location/LocationMapScreen;->launchMapsApp()V

    const/4 p1, 0x1

    return p1
.end method

.method public onPause()V
    .locals 2

    .line 233
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onPause()V

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 235
    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setMyLocationEnabled(Z)V

    :cond_0
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)V
    .locals 1

    .line 271
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_0

    const v0, 0x7f090216

    .line 273
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    const/4 v0, 0x1

    .line 274
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 224
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onResume()V

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->googleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 226
    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setMyLocationEnabled(Z)V

    :cond_0
    return-void
.end method

.method protected onScreenWillShow()V
    .locals 2

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->chainId:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->moreStoresButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/location/LocationMapScreen;->myLocationButton:Landroid/widget/ImageView;

    .line 147
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    .line 148
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 149
    iget-object v1, p0, Lcom/shopkick/app/location/LocationMapScreen;->myLocationButton:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public setParams(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 90
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->setParams(Ljava/util/Map;)V

    .line 91
    invoke-direct {p0, p1}, Lcom/shopkick/app/location/LocationMapScreen;->setMapLocation(Ljava/util/Map;)V

    return-void
.end method
