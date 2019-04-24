.class public Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;
.super Ljava/lang/Object;
.source "GeoFenceRegistrationManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$DistanceComparator;,
        Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;,
        Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;
    }
.end annotation


# static fields
.field private static volatile Instance:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field private static final LOITERING_DELAY_IN_MILLISECONDS:I = 0x1d4c0

.field private static final MAX_REGISTERED_GEOFENCES_ALLOWED:I = 0xa

.field private static final REGISTERED_GEOFENCES_CACHE_LRU_CAP:I = 0x14

.field private static final REGISTERED_GEOFENCES_CACHE_NAMESPACE:Ljava/lang/String; = "registered_geofence_cache"

.field private static final REGISTERED_GEOFENCES_CACHE_VERSION:I = 0x1


# instance fields
.field private final appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

.field private final context:Landroid/content/Context;

.field private final geofencingApi:Lcom/google/android/gms/location/GeofencingApi;

.field private final googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private final monitoredGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation
.end field

.field private final monitoredGeoFencesLock:Ljava/lang/Object;

.field private final registeredGeoFences:Lnet/toddm/cache/CacheProvider;

.field private final settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

.field private statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

.field private final workExecutor:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 76
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 5

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 172
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 173
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFencesLock:Ljava/lang/Object;

    .line 177
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->workExecutor:Ljava/util/concurrent/Executor;

    .line 664
    new-instance v0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$2;

    invoke-direct {v0, p0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$2;-><init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 138
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->context:Landroid/content/Context;

    .line 139
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    .line 140
    iput-object p3, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    .line 141
    sget-object p2, Lcom/google/android/gms/location/LocationServices;->API:Lcom/google/android/gms/common/api/Api;

    invoke-static {p1, p2}, Lcom/shopkick/sdk/sensor/GoogleApiClientProvider;->createGoogleApiClient(Landroid/content/Context;Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 142
    sget-object p2, Lcom/google/android/gms/location/LocationServices;->GeofencingApi:Lcom/google/android/gms/location/GeofencingApi;

    iput-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->geofencingApi:Lcom/google/android/gms/location/GeofencingApi;

    .line 145
    invoke-static {p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->getCacheProvider(Landroid/content/Context;)Lnet/toddm/cache/CacheProvider;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->registeredGeoFences:Lnet/toddm/cache/CacheProvider;

    .line 150
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->getRegisteredGeoFencesInternal()Ljava/util/List;

    move-result-object p1

    .line 151
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    if-lez p2, :cond_0

    .line 152
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object p3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 153
    invoke-virtual {p3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string p3, "GeoFenceRegistrationManager: registering %1$d persisted geofences"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 155
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    .line 152
    invoke-virtual {p2, v0, v1, p3, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 156
    iget-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->addAll(Ljava/util/Collection;)Z

    .line 157
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->registerGeoFences(Ljava/util/List;)V

    .line 161
    :cond_0
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->context:Landroid/content/Context;

    iget-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    iget-object p3, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-static {p1, p2, p3}, Lcom/shopkick/sdk/presence/LocationManager;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 162
    invoke-static {}, Lcom/shopkick/sdk/presence/LocationManager;->getInstance()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/presence/LocationManager;->addLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Landroid/location/Location;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->updateRegisteredGeoFences(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Ljava/util/List;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->registerGeoFences(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Ljava/lang/Exception;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->handleGenericFailure(Ljava/lang/Exception;)V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Lcom/google/android/gms/common/api/Status;Ljava/util/List;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->handleRemoveGeofencesResultCallback(Lcom/google/android/gms/common/api/Status;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)Lcom/google/android/gms/location/GeofencingApi;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->geofencingApi:Lcom/google/android/gms/location/GeofencingApi;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Lcom/google/android/gms/common/api/Status;Ljava/util/List;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->handleAddGeofencesResultCallback(Lcom/google/android/gms/common/api/Status;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$800(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->workExecutor:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static synthetic access$900(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)Ljava/lang/Object;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFencesLock:Ljava/lang/Object;

    return-object p0
.end method

.method private createOsGeofence(Lcom/shopkick/sdk/sensor/GeoFence;)Lcom/google/android/gms/location/Geofence;
    .locals 8

    .line 618
    new-instance v0, Lcom/google/android/gms/location/Geofence$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/location/Geofence$Builder;-><init>()V

    .line 619
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/GeoFence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/Geofence$Builder;->setRequestId(Ljava/lang/String;)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object v2

    iget-wide v3, p1, Lcom/shopkick/sdk/sensor/GeoFence;->latitude:D

    iget-wide v5, p1, Lcom/shopkick/sdk/sensor/GeoFence;->longitude:D

    iget p1, p1, Lcom/shopkick/sdk/sensor/GeoFence;->radius:I

    int-to-float v7, p1

    .line 620
    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/location/Geofence$Builder;->setCircularRegion(DDF)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    const/4 v0, 0x7

    .line 621
    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/Geofence$Builder;->setTransitionTypes(I)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    const v0, 0x1d4c0

    .line 625
    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/Geofence$Builder;->setLoiteringDelay(I)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    const-wide/16 v0, -0x1

    .line 626
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/location/Geofence$Builder;->setExpirationDuration(J)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    .line 627
    invoke-virtual {p1}, Lcom/google/android/gms/location/Geofence$Builder;->build()Lcom/google/android/gms/location/Geofence;

    move-result-object p1

    return-object p1
.end method

.method private static getCacheProvider(Landroid/content/Context;)Lnet/toddm/cache/CacheProvider;
    .locals 4

    .line 126
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "registered_geofence_cache"

    .line 130
    invoke-static {}, Lcom/shopkick/utilities/DefaultCacheLoggingProvider;->getInstance()Lcom/shopkick/utilities/DefaultCacheLoggingProvider;

    move-result-object v1

    const/4 v2, 0x1

    const/16 v3, 0x14

    .line 125
    invoke-static {p0, v0, v2, v3, v1}, Lnet/toddm/cache/android/DBCacheProvider;->getInstance(Landroid/content/Context;Ljava/lang/String;IILnet/toddm/cache/LoggingProvider;)Lnet/toddm/cache/android/DBCacheProvider;

    move-result-object p0

    return-object p0
.end method

.method public static getInstance()Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;
    .locals 2

    .line 84
    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->Instance:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    if-eqz v0, :cond_0

    .line 87
    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->Instance:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    return-object v0

    .line 85
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "initialize() must be called before getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getRegisteredGeoFencesInternal()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation

    .line 596
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 598
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->registeredGeoFences:Lnet/toddm/cache/CacheProvider;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lnet/toddm/cache/CacheProvider;->getAll(Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnet/toddm/cache/CacheEntry;

    .line 599
    new-instance v4, Lorg/json/JSONObject;

    invoke-virtual {v3}, Lnet/toddm/cache/CacheEntry;->getStringValue()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 600
    new-instance v3, Lcom/shopkick/sdk/sensor/GeoFence;

    invoke-direct {v3, v4}, Lcom/shopkick/sdk/sensor/GeoFence;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 602
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 603
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "GeoFenceRegistrationManager.getRegisteredGeoFencesInternal() %1$d GeoFences loaded"

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v6, 0x0

    .line 605
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v2, v6

    .line 602
    invoke-virtual {v1, v3, v4, v5, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 611
    :catch_0
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->registeredGeoFences:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v1}, Lnet/toddm/cache/CacheProvider;->removeAll()Z

    :goto_1
    return-object v0

    :catch_1
    move-exception v0

    .line 606
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private handleAddGeofencesResultCallback(Lcom/google/android/gms/common/api/Status;Ljava/util/List;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 545
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 546
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "GeoFenceRegistrationManager.handleAddGeofencesResultCallback() statusCode:%1$d geoFenceCount:%2$d"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    .line 548
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    .line 549
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v8, 0x1

    aput-object v6, v5, v8

    .line 545
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 550
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 553
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 554
    iget-object v9, v0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->registeredGeoFences:Lnet/toddm/cache/CacheProvider;

    .line 555
    invoke-virtual {v2}, Lcom/shopkick/sdk/sensor/GeoFence;->toString()Ljava/lang/String;

    move-result-object v10

    .line 556
    invoke-virtual {v2}, Lcom/shopkick/sdk/sensor/GeoFence;->getJson()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v11

    const-wide v12, 0x7fffffffffffffffL

    const-wide v14, 0x7fffffffffffffffL

    const/16 v16, 0x0

    const/16 v17, 0x0

    sget-object v18, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    .line 554
    invoke-interface/range {v9 .. v18}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 562
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 563
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "GeoFenceRegistrationManager.handleAddGeofencesResultCallback() now registered for \'%1$s\'"

    new-array v9, v8, [Ljava/lang/Object;

    aput-object v2, v9, v7

    .line 562
    invoke-virtual {v3, v4, v5, v6, v9}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 567
    :cond_0
    iget-object v1, v0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->registeredGeoFences:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v1}, Lnet/toddm/cache/CacheProvider;->trimLru()Z

    goto :goto_1

    .line 571
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 572
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "GeoFenceRegistrationManager.handleAddGeofencesResultCallback() failed [statusCode:%1$d]"

    new-array v5, v8, [Ljava/lang/Object;

    .line 574
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    .line 571
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 575
    iget-object v1, v0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    .line 578
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v3

    invoke-static {v3}, Lcom/shopkick/sdk/sensor/SensorStatusError;->geoSensorError(I)Lcom/shopkick/sdk/sensor/SensorStatusError;

    move-result-object v3

    .line 576
    invoke-interface {v1, v2, v3}, Lcom/shopkick/sdk/sensor/StatusListener;->onErrorReceived(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private handleGenericFailure(Ljava/lang/Exception;)V
    .locals 7

    .line 585
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 586
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v5, "GeoFenceRegistrationManager.registerGeoFences() failed"

    const/4 v0, 0x0

    new-array v6, v0, [Ljava/lang/Object;

    move-object v4, p1

    .line 585
    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 590
    sget-object v1, Lcom/shopkick/sdk/sensor/SensorStatusError;->UNKNOWN_FAILURE:Lcom/shopkick/sdk/sensor/SensorStatusError;

    invoke-interface {p1, v0, v1}, Lcom/shopkick/sdk/sensor/StatusListener;->onErrorReceived(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    :cond_0
    return-void
.end method

.method private handleRemoveGeofencesResultCallback(Lcom/google/android/gms/common/api/Status;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 486
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 489
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 490
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->registeredGeoFences:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v0, p2}, Lnet/toddm/cache/CacheProvider;->remove(Ljava/lang/String;)Z

    goto :goto_0

    .line 495
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 496
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "GeoFenceRegistrationManager.unregisterGeoFences() failed [statusCode:%1$d]"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    .line 498
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    .line 495
    invoke-virtual {p2, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 499
    iget-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    if-eqz p2, :cond_1

    const/4 v0, 0x0

    .line 502
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result p1

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/SensorStatusError;->geoSensorError(I)Lcom/shopkick/sdk/sensor/SensorStatusError;

    move-result-object p1

    .line 500
    invoke-interface {p2, v0, p1}, Lcom/shopkick/sdk/sensor/StatusListener;->onErrorReceived(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    :cond_1
    return-void
.end method

.method public static initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 2

    if-eqz p0, :cond_4

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    .line 111
    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->Instance:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    if-nez v0, :cond_1

    .line 112
    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 113
    :try_start_0
    sget-object v1, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->Instance:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    if-nez v1, :cond_0

    .line 114
    new-instance v1, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    sput-object v1, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->Instance:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    .line 116
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void

    .line 108
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'settings\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 105
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'appStateProvider\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 102
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'context\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private registerGeoFences(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/GeofencingRequest;",
            "Landroid/app/PendingIntent;",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;)V"
        }
    .end annotation

    .line 515
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 516
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "GeoFenceRegistrationManager.registerGeoFences() calling geofencingApi.addGeofences()"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 515
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 518
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/sdk/core/PermissionsUtility;->hasLocationPermission(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 522
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->geofencingApi:Lcom/google/android/gms/location/GeofencingApi;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/location/GeofencingApi;->addGeofences(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object p1

    new-instance p2, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;

    invoke-direct {p2, p0, p3}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;-><init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Ljava/util/List;)V

    .line 523
    invoke-virtual {p1, p2}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    return-void
.end method

.method private registerGeoFences(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;)V"
        }
    .end annotation

    .line 352
    new-instance v0, Lcom/google/android/gms/location/GeofencingRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/location/GeofencingRequest$Builder;-><init>()V

    const/4 v1, 0x7

    .line 353
    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/GeofencingRequest$Builder;->setInitialTrigger(I)Lcom/google/android/gms/location/GeofencingRequest$Builder;

    move-result-object v0

    .line 357
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 358
    invoke-direct {p0, v2}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->createOsGeofence(Lcom/shopkick/sdk/sensor/GeoFence;)Lcom/google/android/gms/location/Geofence;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/location/GeofencingRequest$Builder;->addGeofence(Lcom/google/android/gms/location/Geofence;)Lcom/google/android/gms/location/GeofencingRequest$Builder;

    goto :goto_0

    .line 360
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/location/GeofencingRequest$Builder;->build()Lcom/google/android/gms/location/GeofencingRequest;

    move-result-object v5

    .line 363
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->context:Landroid/content/Context;

    const-class v2, Lcom/shopkick/sdk/sensor/GeoFencingBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 364
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->context:Landroid/content/Context;

    const/4 v2, 0x1

    const/high16 v3, 0x8000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v6

    .line 372
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    new-instance v1, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;

    const/4 v8, 0x0

    move-object v3, v1

    move-object v4, p0

    move-object v7, p1

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;-><init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Ljava/util/List;Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 376
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method private unregisterGeoFences(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 339
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    new-instance v1, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;-><init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Ljava/util/List;Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 341
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method private updateRegisteredGeoFences(Landroid/location/Location;)V
    .locals 9

    .line 287
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 288
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-le v1, v2, :cond_0

    .line 289
    new-instance v1, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$DistanceComparator;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$DistanceComparator;-><init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Landroid/location/Location;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 290
    invoke-interface {v0, v3, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    .line 294
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->getRegisteredGeoFencesInternal()Ljava/util/List;

    move-result-object p1

    .line 295
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 296
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v2, "GeoFenceRegistrationManager.updateRegisteredGeoFences() currentlyRegisteredGeoFences: %1$d"

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Object;

    .line 298
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v3

    .line 295
    invoke-virtual {v1, v4, v5, v2, v7}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 301
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 302
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 303
    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 304
    invoke-virtual {v4}, Lcom/shopkick/sdk/sensor/GeoFence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 307
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_3

    .line 308
    invoke-direct {p0, v1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->unregisterGeoFences(Ljava/util/List;)V

    .line 310
    :cond_3
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 311
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v7, "GeoFenceRegistrationManager.updateRegisteredGeoFences() osUnregistrations: %1$d"

    new-array v8, v6, [Ljava/lang/Object;

    .line 313
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v8, v3

    .line 310
    invoke-virtual {v2, v4, v5, v7, v8}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 316
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 317
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 318
    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 319
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 322
    :cond_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_6

    .line 323
    invoke-direct {p0, v1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->registerGeoFences(Ljava/util/List;)V

    .line 325
    :cond_6
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 326
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v0, "GeoFenceRegistrationManager.updateRegisteredGeoFences() osRegistrations: %1$d"

    new-array v2, v6, [Ljava/lang/Object;

    .line 328
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v2, v3

    .line 325
    invoke-virtual {p1, v4, v5, v0, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getMonitoredGeoFences()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation

    .line 266
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getRegisteredGeoFences()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation

    .line 274
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->getRegisteredGeoFencesInternal()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public registerGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V
    .locals 7

    .line 190
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 191
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFencesLock:Ljava/lang/Object;

    monitor-enter v0

    .line 192
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 193
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    .line 194
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 195
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "GeoFenceRegistrationManager.registerGeoFence() now monitoring for \'%1$s\'"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    .line 194
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 198
    invoke-static {}, Lcom/shopkick/sdk/presence/LocationManager;->getInstance()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 200
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 201
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "GeoFenceRegistrationManager.registerGeoFence() updating registered GeoFences"

    new-array v5, v6, [Ljava/lang/Object;

    .line 200
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 203
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->updateRegisteredGeoFences(Landroid/location/Location;)V

    .line 206
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    return-void
.end method

.method public unregisterGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V
    .locals 2

    .line 226
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 227
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFencesLock:Ljava/lang/Object;

    monitor-enter v0

    .line 228
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 229
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->remove(Ljava/lang/Object;)Z

    .line 230
    invoke-static {}, Lcom/shopkick/sdk/presence/LocationManager;->getInstance()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 232
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->updateRegisteredGeoFences(Landroid/location/Location;)V

    .line 235
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public unregisterGeoFence(Ljava/lang/String;)V
    .locals 3

    .line 214
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 215
    invoke-virtual {v1}, Lcom/shopkick/sdk/sensor/GeoFence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 216
    invoke-virtual {p0, v1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->unregisterGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    return-void

    :cond_1
    return-void
.end method

.method public unregisterGeoFences()V
    .locals 4

    .line 244
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFencesLock:Ljava/lang/Object;

    monitor-enter v0

    .line 247
    :try_start_0
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->getRegisteredGeoFencesInternal()Ljava/util/List;

    move-result-object v1

    .line 248
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 249
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 250
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 251
    invoke-virtual {v3}, Lcom/shopkick/sdk/sensor/GeoFence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 253
    :cond_0
    invoke-direct {p0, v2}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->unregisterGeoFences(Ljava/util/List;)V

    .line 257
    :cond_1
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->monitoredGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->clear()V

    .line 258
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
