.class public Lcom/ibotta/android/view/map/RetailerLocationsMapView;
.super Lcom/google/android/gms/maps/MapView;
.source "RetailerLocationsMapView.java"

# interfaces
.implements Landroid/location/LocationListener;
.implements Lcom/ibotta/android/permissions/PermissionsListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/map/RetailerLocationsMapView$CantFindItInfoWindow;,
        Lcom/ibotta/android/view/map/RetailerLocationsMapView$InfoWindow;,
        Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;
    }
.end annotation


# static fields
.field private static final CENTER_OF_USA_LAT:D = 37.09024

.field private static final CENTER_OF_USA_LONG:D = -95.712891

.field private static final KEY_MAP_STATE:Ljava/lang/String; = "map_state"


# instance fields
.field hardware:Lcom/ibotta/android/hardware/Hardware;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private initSavedInstanceState:Landroid/os/Bundle;

.field private isCantFindIt:Z

.field private listener:Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;

.field private location:Landroid/location/Location;

.field private locationSourceListener:Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;

.field private map:Lcom/google/android/gms/maps/GoogleMap;

.field private mapInitError:Z

.field permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field userState:Lcom/ibotta/android/state/user/UserState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 76
    check-cast v0, Landroid/util/AttributeSet;

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 80
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 84
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/maps/MapView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 85
    invoke-direct {p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->injectThis()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V
    .locals 0

    .line 89
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/maps/MapView;-><init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V

    .line 90
    invoke-direct {p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->injectThis()V

    return-void
.end method

.method static synthetic access$202(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;)Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->locationSourceListener:Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;

    return-object p1
.end method

.method private initializeWithMap()V
    .locals 6

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const-string v0, "Failed to instantiate map instance."

    const/4 v2, 0x0

    .line 165
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    iput-boolean v1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->mapInitError:Z

    return-void

    .line 170
    :cond_0
    iget-boolean v2, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->isCantFindIt:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 171
    new-instance v2, Lcom/ibotta/android/view/map/RetailerLocationsMapView$CantFindItInfoWindow;

    invoke-direct {v2, p0, v3}, Lcom/ibotta/android/view/map/RetailerLocationsMapView$CantFindItInfoWindow;-><init>(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMap;->setInfoWindowAdapter(Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;)V

    goto :goto_0

    .line 173
    :cond_1
    new-instance v2, Lcom/ibotta/android/view/map/RetailerLocationsMapView$InfoWindow;

    invoke-direct {v2, p0, v3}, Lcom/ibotta/android/view/map/RetailerLocationsMapView$InfoWindow;-><init>(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMap;->setInfoWindowAdapter(Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;)V

    .line 175
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v2, Lcom/ibotta/android/view/map/-$$Lambda$RetailerLocationsMapView$NpYeX6DkZHxeIKlqN-ZG0-bHiik;

    invoke-direct {v2, p0}, Lcom/ibotta/android/view/map/-$$Lambda$RetailerLocationsMapView$NpYeX6DkZHxeIKlqN-ZG0-bHiik;-><init>(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMap;->setOnInfoWindowClickListener(Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;)V

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v2, Lcom/ibotta/android/view/map/-$$Lambda$RetailerLocationsMapView$CEUIeO_VnV5bCRp8eQS0iPaMQUQ;

    invoke-direct {v2, p0}, Lcom/ibotta/android/view/map/-$$Lambda$RetailerLocationsMapView$CEUIeO_VnV5bCRp8eQS0iPaMQUQ;-><init>(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMap;->setOnMapClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v2, Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView$1;-><init>(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMap;->setLocationSource(Lcom/google/android/gms/maps/LocationSource;)V

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setMyLocationEnabled(Z)V

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 208
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    .line 209
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    goto :goto_1

    :cond_2
    const-wide v1, 0x40428b8cfbfc6541L    # 37.09024

    const-wide v3, -0x3fa8125ffe6d58c9L    # -95.712891

    .line 215
    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v5, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v5, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-static {v5, v1}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    return-void
.end method

.method private injectThis()V
    .locals 1

    .line 94
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)V

    return-void
.end method

.method public static synthetic lambda$initWithPermissionsGranted$0(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    .line 152
    invoke-direct {p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->initializeWithMap()V

    .line 154
    iget-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->listener:Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;

    if-eqz p1, :cond_0

    .line 155
    invoke-interface {p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;->onGetMapAsyncFinish()V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$initializeWithMap$1(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/google/android/gms/maps/model/Marker;)V
    .locals 0

    .line 175
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->onInfoWindowClicked(Lcom/google/android/gms/maps/model/Marker;)V

    return-void
.end method

.method public static synthetic lambda$initializeWithMap$2(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    .line 176
    invoke-direct {p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->onMapClicked()V

    return-void
.end method

.method private onInfoWindowClicked(Lcom/google/android/gms/maps/model/Marker;)V
    .locals 5

    .line 344
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->listener:Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;

    if-eqz v0, :cond_1

    .line 345
    iget-boolean v1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->isCantFindIt:Z

    if-eqz v1, :cond_0

    .line 346
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;->onInfoWindowClicked(I)V

    goto :goto_0

    .line 348
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    iget-wide v1, v1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    iget-wide v3, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;->onInfoWindowClicked(DD)V

    :cond_1
    :goto_0
    return-void
.end method

.method private onMapClicked()V
    .locals 1

    .line 354
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->listener:Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;

    if-eqz v0, :cond_0

    .line 355
    invoke-interface {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;->onMapClicked()V

    :cond_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 2

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 242
    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setInfoWindowAdapter(Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;)V

    .line 243
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setOnInfoWindowClickListener(Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;)V

    .line 245
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->onDestroy()V

    .line 246
    iput-object v1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 397
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->listener:Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;

    if-eqz v0, :cond_0

    .line 398
    invoke-interface {v0, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 401
    invoke-super {p0, p1}, Lcom/google/android/gms/maps/MapView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :cond_1
    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->initSavedInstanceState:Landroid/os/Bundle;

    .line 136
    invoke-virtual {p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->initWithPermissionsGranted()V

    return-void
.end method

.method public init(Landroid/os/Bundle;Lcom/ibotta/android/mvp/base/MvpActivity;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->initSavedInstanceState:Landroid/os/Bundle;

    .line 130
    iget-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    invoke-virtual {p1, p2, p0}, Lcom/ibotta/android/permissions/PermissionsHelperFactory;->createLocationPermissionsHelper(Landroid/support/v4/app/FragmentActivity;Lcom/ibotta/android/permissions/PermissionsListener;)Lcom/ibotta/android/permissions/PermissionsHelper;

    move-result-object p1

    .line 131
    invoke-interface {p1}, Lcom/ibotta/android/permissions/PermissionsHelper;->requestPermissions()V

    return-void
.end method

.method public initWithPermissionsGranted()V
    .locals 2

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->initSavedInstanceState:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const-string v1, "map_state"

    .line 141
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->initSavedInstanceState:Landroid/os/Bundle;

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->initSavedInstanceState:Landroid/os/Bundle;

    invoke-super {p0, v0}, Lcom/google/android/gms/maps/MapView;->onCreate(Landroid/os/Bundle;)V

    const/4 v0, 0x0

    .line 146
    iput-boolean v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->mapInitError:Z

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->listener:Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;

    if-eqz v0, :cond_1

    .line 148
    invoke-interface {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;->onGetMapAsyncStart()V

    .line 150
    :cond_1
    new-instance v0, Lcom/ibotta/android/view/map/-$$Lambda$RetailerLocationsMapView$SbenuOt5eAYNw3u1G9svm-bEpcQ;

    invoke-direct {v0, p0}, Lcom/ibotta/android/view/map/-$$Lambda$RetailerLocationsMapView$SbenuOt5eAYNw3u1G9svm-bEpcQ;-><init>(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    return-void
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 1

    .line 361
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->locationSourceListener:Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 362
    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;->onLocationChanged(Landroid/location/Location;)V

    .line 364
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->location:Landroid/location/Location;

    return-void
.end method

.method public onPermissionsAccepted()V
    .locals 0

    .line 381
    invoke-virtual {p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->initWithPermissionsGranted()V

    return-void
.end method

.method public onPermissionsDenied()V
    .locals 0

    return-void
.end method

.method public onPermissionsPermanentlyDenied()V
    .locals 0

    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public saveMapState(Landroid/os/Bundle;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 234
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 235
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v1, "map_state"

    .line 237
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public setAllGesturesEnabled(Z)V
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_0

    return-void

    .line 109
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/UiSettings;->setAllGesturesEnabled(Z)V

    return-void
.end method

.method public setIsCantFindIt(Z)V
    .locals 0

    .line 125
    iput-boolean p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->isCantFindIt:Z

    return-void
.end method

.method public setListener(Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;)V
    .locals 1

    .line 98
    iput-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->listener:Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;

    if-eqz p1, :cond_0

    .line 100
    iget-boolean v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->mapInitError:Z

    if-eqz v0, :cond_0

    .line 101
    invoke-interface {p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;->onInitializationFailed()V

    :cond_0
    return-void
.end method

.method public setMyLocationEnabled(ZZ)V
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_0

    return-void

    .line 120
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMap;->setMyLocationEnabled(Z)V

    .line 121
    iget-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {p1}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/maps/UiSettings;->setMyLocationButtonEnabled(Z)V

    return-void
.end method

.method public setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 24

    move-object/from16 v0, p0

    .line 250
    iget-object v1, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v1, :cond_0

    return-void

    .line 254
    :cond_0
    invoke-interface/range {p1 .. p1}, Lcom/ibotta/api/model/RetailerModel;->getResolvedCoords()Lcom/ibotta/api/model/retailer/ResolvedCoords;

    move-result-object v1

    .line 261
    new-instance v2, Landroid/location/Location;

    const-string v3, "Center Point"

    invoke-direct {v2, v3}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 262
    invoke-virtual {v1}, Lcom/ibotta/api/model/retailer/ResolvedCoords;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Landroid/location/Location;->setLatitude(D)V

    .line 263
    invoke-virtual {v1}, Lcom/ibotta/api/model/retailer/ResolvedCoords;->getLongitude()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Landroid/location/Location;->setLongitude(D)V

    .line 265
    iget-object v1, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->location:Landroid/location/Location;

    if-eqz v1, :cond_1

    .line 266
    iget-object v3, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    .line 267
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    iget-object v1, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->location:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/high16 v1, 0x41700000    # 15.0f

    .line 266
    invoke-static {v4, v1}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 270
    :cond_1
    iget-object v1, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v1

    .line 271
    new-instance v3, Landroid/graphics/Point;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    .line 273
    new-instance v3, Landroid/location/Location;

    const-string v5, "Top Left"

    invoke-direct {v3, v5}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 274
    iget-wide v5, v1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual {v3, v5, v6}, Landroid/location/Location;->setLatitude(D)V

    .line 275
    iget-wide v5, v1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v3, v5, v6}, Landroid/location/Location;->setLongitude(D)V

    .line 278
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    const-wide v5, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 283
    invoke-interface/range {p1 .. p1}, Lcom/ibotta/api/model/RetailerModel;->getStores()Ljava/util/List;

    move-result-object v7

    .line 284
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const-wide/16 v9, 0x0

    move-object v15, v3

    move-wide/from16 v16, v5

    move-wide v5, v9

    move-wide v11, v5

    move-wide v13, v11

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/ibotta/api/model/retailer/Store;

    .line 285
    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    move-object/from16 v20, v7

    move-object/from16 v21, v8

    invoke-virtual/range {v18 .. v18}, Lcom/ibotta/api/model/retailer/Store;->getLatitude()D

    move-result-wide v7

    move-object/from16 v22, v2

    move/from16 v23, v3

    invoke-virtual/range {v18 .. v18}, Lcom/ibotta/api/model/retailer/Store;->getLongitude()D

    move-result-wide v2

    invoke-direct {v4, v7, v8, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 286
    invoke-virtual/range {v18 .. v18}, Lcom/ibotta/api/model/retailer/Store;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    .line 287
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "%1$s, %2$s %3$s"

    const/4 v3, 0x3

    .line 288
    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual/range {v18 .. v18}, Lcom/ibotta/api/model/retailer/Store;->getCity()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v3, v8

    invoke-virtual/range {v18 .. v18}, Lcom/ibotta/api/model/retailer/Store;->getState()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    aput-object v7, v3, v8

    const/4 v7, 0x2

    invoke-virtual/range {v18 .. v18}, Lcom/ibotta/api/model/retailer/Store;->getZip()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v3, v7

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    iget-object v2, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v3, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v3}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    invoke-interface/range {p1 .. p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Lcom/google/android/gms/maps/model/MarkerOptions;->title(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    .line 290
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    .line 289
    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v2

    .line 291
    invoke-virtual/range {v18 .. v18}, Lcom/ibotta/api/model/retailer/Store;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/Marker;->setTag(Ljava/lang/Object;)V

    .line 294
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 296
    invoke-virtual/range {v18 .. v18}, Lcom/ibotta/api/model/retailer/Store;->getLatitude()D

    move-result-wide v7

    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->min(DD)D

    move-result-wide v9

    .line 297
    invoke-virtual/range {v18 .. v18}, Lcom/ibotta/api/model/retailer/Store;->getLongitude()D

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    .line 298
    invoke-virtual/range {v18 .. v18}, Lcom/ibotta/api/model/retailer/Store;->getLatitude()D

    move-result-wide v7

    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->max(DD)D

    move-result-wide v11

    .line 299
    invoke-virtual/range {v18 .. v18}, Lcom/ibotta/api/model/retailer/Store;->getLongitude()D

    move-result-wide v7

    invoke-static {v13, v14, v7, v8}, Ljava/lang/Math;->max(DD)D

    move-result-wide v13

    .line 301
    new-instance v2, Landroid/location/Location;

    const-string v7, "Store Location"

    invoke-direct {v2, v7}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 302
    invoke-virtual/range {v18 .. v18}, Lcom/ibotta/api/model/retailer/Store;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v2, v7, v8}, Landroid/location/Location;->setLatitude(D)V

    .line 303
    invoke-virtual/range {v18 .. v18}, Lcom/ibotta/api/model/retailer/Store;->getLongitude()D

    move-result-wide v7

    invoke-virtual {v2, v7, v8}, Landroid/location/Location;->setLongitude(D)V

    move-object/from16 v7, v22

    .line 305
    invoke-virtual {v7, v2}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v8

    if-nez v23, :cond_3

    .line 309
    iget-object v3, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v3}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/Projection;->toScreenLocation(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;

    move-result-object v3

    .line 310
    iget v4, v3, Landroid/graphics/Point;->x:I

    if-lez v4, :cond_2

    iget v4, v3, Landroid/graphics/Point;->y:I

    if-lez v4, :cond_2

    iget v4, v3, Landroid/graphics/Point;->x:I

    move-object/from16 v18, v1

    invoke-virtual/range {p0 .. p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->getWidth()I

    move-result v1

    if-ge v4, v1, :cond_4

    iget v1, v3, Landroid/graphics/Point;->y:I

    invoke-virtual/range {p0 .. p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->getHeight()I

    move-result v3

    if-ge v1, v3, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    move-object/from16 v18, v1

    goto :goto_1

    :cond_3
    move-object/from16 v18, v1

    :cond_4
    :goto_1
    move/from16 v3, v23

    :goto_2
    if-eqz v15, :cond_5

    move-object v4, v2

    float-to-double v1, v8

    cmpl-double v19, v16, v1

    if-lez v19, :cond_6

    goto :goto_3

    :cond_5
    move-object v4, v2

    :goto_3
    float-to-double v1, v8

    move-wide/from16 v16, v1

    move-object v15, v4

    :cond_6
    move-object v2, v7

    move-object/from16 v1, v18

    move-object/from16 v7, v20

    move-object/from16 v8, v21

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_7
    move/from16 v23, v3

    move-object/from16 v20, v7

    .line 322
    iget-object v1, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->location:Landroid/location/Location;

    const/16 v2, 0x32

    if-nez v1, :cond_9

    .line 324
    new-instance v1, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    .line 325
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/api/model/retailer/Store;

    .line 326
    new-instance v5, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v4}, Lcom/ibotta/api/model/retailer/Store;->getLatitude()D

    move-result-wide v6

    invoke-virtual {v4}, Lcom/ibotta/api/model/retailer/Store;->getLongitude()D

    move-result-wide v8

    invoke-direct {v5, v6, v7, v8, v9}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v5}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    goto :goto_4

    .line 328
    :cond_8
    iget-object v3, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 330
    iget-object v1, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v1}, Lcom/ibotta/android/hardware/Hardware;->isCoarseLocationAvailable()Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v1}, Lcom/ibotta/android/hardware/Hardware;->isFineLocationAvailable()Z

    move-result v1

    if-nez v1, :cond_a

    .line 332
    invoke-virtual/range {p0 .. p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f1101fb

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto :goto_5

    :cond_9
    if-nez v23, :cond_a

    if-eqz v15, :cond_a

    .line 336
    new-instance v1, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    .line 337
    new-instance v3, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v4, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->location:Landroid/location/Location;

    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    iget-object v6, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->location:Landroid/location/Location;

    invoke-virtual {v6}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 338
    new-instance v3, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v15}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v15}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 339
    iget-object v3, v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    :cond_a
    :goto_5
    return-void
.end method
