.class public Lcom/shopkick/sdk/geo/NativeGeoManager;
.super Ljava/lang/Object;
.source "NativeGeoManager.java"


# instance fields
.field private final context:Landroid/content/Context;

.field private final googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private final locationProviderApi:Lcom/google/android/gms/location/FusedLocationProviderApi;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/FusedLocationProviderApi;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/shopkick/sdk/geo/NativeGeoManager;->context:Landroid/content/Context;

    .line 31
    iput-object p2, p0, Lcom/shopkick/sdk/geo/NativeGeoManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 32
    iput-object p3, p0, Lcom/shopkick/sdk/geo/NativeGeoManager;->locationProviderApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/sdk/geo/NativeGeoManager;Lcom/shopkick/app/util/Consumer;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/geo/NativeGeoManager;->getLocation(Lcom/shopkick/app/util/Consumer;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/geo/NativeGeoManager;)Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/shopkick/sdk/geo/NativeGeoManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/sdk/geo/NativeGeoManager;)Lcom/google/android/gms/location/FusedLocationProviderApi;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/shopkick/sdk/geo/NativeGeoManager;->locationProviderApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    return-object p0
.end method

.method private getLocation(Lcom/shopkick/app/util/Consumer;)V
    .locals 4
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    .annotation build Lcom/shopkick/app/annotations/GoogleApiClientConnected;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/util/Consumer<",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/shopkick/sdk/geo/NativeGeoManager;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/sdk/core/PermissionsUtility;->hasLocationPermission(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/geo/NativeGeoManager;->locationProviderApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    iget-object v1, p0, Lcom/shopkick/sdk/geo/NativeGeoManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1}, Lcom/google/android/gms/location/FusedLocationProviderApi;->getLastLocation(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 78
    invoke-interface {p1, v0}, Lcom/shopkick/app/util/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    .line 82
    :cond_1
    new-instance v0, Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {v0}, Lcom/google/android/gms/location/LocationRequest;-><init>()V

    const-wide/16 v1, 0x0

    .line 83
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setInterval(J)Lcom/google/android/gms/location/LocationRequest;

    .line 84
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setFastestInterval(J)Lcom/google/android/gms/location/LocationRequest;

    const/16 v1, 0x66

    .line 85
    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    .line 86
    iget-object v1, p0, Lcom/shopkick/sdk/geo/NativeGeoManager;->locationProviderApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    iget-object v2, p0, Lcom/shopkick/sdk/geo/NativeGeoManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    new-instance v3, Lcom/shopkick/sdk/geo/NativeGeoManager$2;

    invoke-direct {v3, p0, p1}, Lcom/shopkick/sdk/geo/NativeGeoManager$2;-><init>(Lcom/shopkick/sdk/geo/NativeGeoManager;Lcom/shopkick/app/util/Consumer;)V

    invoke-interface {v1, v2, v0, v3}, Lcom/google/android/gms/location/FusedLocationProviderApi;->requestLocationUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;)Lcom/google/android/gms/common/api/PendingResult;

    return-void
.end method


# virtual methods
.method public getCurrentLocation(Lcom/shopkick/app/util/Consumer;)Z
    .locals 3
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/util/Consumer<",
            "Landroid/location/Location;",
            ">;)Z"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/shopkick/sdk/geo/NativeGeoManager;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/sdk/core/PermissionsUtility;->hasFineLocation(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/geo/NativeGeoManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    new-instance v1, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;

    new-instance v2, Lcom/shopkick/sdk/geo/NativeGeoManager$1;

    invoke-direct {v2, p0, p1}, Lcom/shopkick/sdk/geo/NativeGeoManager$1;-><init>(Lcom/shopkick/sdk/geo/NativeGeoManager;Lcom/shopkick/app/util/Consumer;)V

    invoke-direct {v1, v0, v2}, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 63
    iget-object p1, p0, Lcom/shopkick/sdk/geo/NativeGeoManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    const/4 p1, 0x1

    return p1
.end method
