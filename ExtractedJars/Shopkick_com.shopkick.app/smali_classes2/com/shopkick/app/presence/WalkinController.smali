.class public Lcom/shopkick/app/presence/WalkinController;
.super Ljava/lang/Object;
.source "WalkinController.java"

# interfaces
.implements Lcom/shopkick/app/awards/IAwardsManagerCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final ACTIVE_WALKIN_GEOFENCE_EXPIRE_TIME:J = 0x5265c00L

.field private static final CHECKIN_LOCATION_CHAIN_ID_KEY:Ljava/lang/String; = "checkinLocationChainId"

.field private static final CHECKIN_LOCATION_LATITUDE_KEY:Ljava/lang/String; = "checkinLocationLatitude"

.field private static final CHECKIN_LOCATION_LOCATION_ID_KEY:Ljava/lang/String; = "checkinLocationLocationId"

.field private static final CHECKIN_LOCATION_LONGITUDE_KEY:Ljava/lang/String; = "checkinLocationLongitude"

.field private static final CHECKIN_LOCATION_RADIUS_KEY:Ljava/lang/String; = "checkinLocationRadius"

.field public static final ENTRANCE_DEPARTMENT_ID:Ljava/lang/String; = "1"

.field private static final GEOFENCE_KEY:Ljava/lang/String; = "geofence "

.field private static final GEOFENCE_LATITUDE_KEY:Ljava/lang/String; = "geofenceLatitude"

.field private static final GEOFENCE_LONGITUDE_KEY:Ljava/lang/String; = "geofenceLongitude"

.field private static final GEOFENCE_RADIUS_KEY:Ljava/lang/String; = "geofenceRadius"

.field private static final SHARED_PREFS_GEOFENCES_KEY:Ljava/lang/String; = "WalkinControllerGeofencesKey"

.field private static final SHARED_PREFS_NAME:Ljava/lang/String; = "WalkinControllerPrefs"

.field private static final SIZE_KEY:Ljava/lang/String; = "size"

.field private static final TIMESTAMP_KEY:Ljava/lang/String; = "timestamp"

.field public static final WALKIN_SUCCEEDED_EVENT:Ljava/lang/String; = "WalkinControllerWalkinSucceededEvent"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private final awardsManager:Lcom/shopkick/app/awards/AwardsManager;

.field private final chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

.field private final clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private final clock:Lcom/shopkick/app/util/Clock;

.field private final geoFenceReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

.field private geoFenceSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensor;

.field private final geoFenceStatusListener:Lcom/shopkick/sdk/sensor/StatusListener;

.field private final geofenceExecutor:Ljava/util/concurrent/Executor;

.field private final lastWalkins:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/io/Serializable;",
            ">;"
        }
    .end annotation
.end field

.field private final logger:Lcom/shopkick/app/application/SKLogger;

.field private monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            "Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;",
            ">;"
        }
    .end annotation
.end field

.field private final monitoredGeoFencesToCheckinLocationsLock:Ljava/lang/Object;

.field private final notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private sharedPreferences:Landroid/content/SharedPreferences;

.field private final userAccount:Lcom/shopkick/app/account/UserAccount;

.field private final userAcquisitionReporter:Lcom/shopkick/app/logging/UserAcquisitionReporter;

.field private walkinCallbackWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/controllers/IWalkinCallback;",
            ">;"
        }
    .end annotation
.end field

.field private walkinListener:Lcom/shopkick/app/campaigns/WalkinListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/util/Clock;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/awards/AwardsManager;Ljava/util/Map;Lcom/shopkick/app/chains/ChainDataSource;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/logging/UserAcquisitionReporter;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/AppActivityManager;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/util/Clock;",
            "Lcom/shopkick/app/account/UserAccount;",
            "Lcom/shopkick/app/awards/AwardsManager;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/io/Serializable;",
            ">;",
            "Lcom/shopkick/app/chains/ChainDataSource;",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            "Lcom/shopkick/app/util/NotificationCenter;",
            "Lcom/shopkick/app/logging/UserAcquisitionReporter;",
            "Lcom/shopkick/app/application/SKLogger;",
            "Lcom/shopkick/app/application/AppActivityManager;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 111
    iput-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->walkinListener:Lcom/shopkick/app/campaigns/WalkinListener;

    .line 115
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    .line 117
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocationsLock:Ljava/lang/Object;

    .line 119
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->geofenceExecutor:Ljava/util/concurrent/Executor;

    .line 755
    new-instance v0, Lcom/shopkick/app/presence/WalkinController$3;

    invoke-direct {v0, p0}, Lcom/shopkick/app/presence/WalkinController$3;-><init>(Lcom/shopkick/app/presence/WalkinController;)V

    iput-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->geoFenceReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 812
    new-instance v0, Lcom/shopkick/app/presence/WalkinController$4;

    invoke-direct {v0, p0}, Lcom/shopkick/app/presence/WalkinController$4;-><init>(Lcom/shopkick/app/presence/WalkinController;)V

    iput-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->geoFenceStatusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    .line 133
    iput-object p1, p0, Lcom/shopkick/app/presence/WalkinController;->clock:Lcom/shopkick/app/util/Clock;

    .line 134
    iput-object p2, p0, Lcom/shopkick/app/presence/WalkinController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 135
    iput-object p3, p0, Lcom/shopkick/app/presence/WalkinController;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    .line 136
    iput-object p4, p0, Lcom/shopkick/app/presence/WalkinController;->lastWalkins:Ljava/util/Map;

    .line 137
    iput-object p5, p0, Lcom/shopkick/app/presence/WalkinController;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    .line 138
    iput-object p6, p0, Lcom/shopkick/app/presence/WalkinController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 139
    iput-object p7, p0, Lcom/shopkick/app/presence/WalkinController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 140
    iput-object p8, p0, Lcom/shopkick/app/presence/WalkinController;->userAcquisitionReporter:Lcom/shopkick/app/logging/UserAcquisitionReporter;

    .line 141
    iput-object p9, p0, Lcom/shopkick/app/presence/WalkinController;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 142
    iput-object p10, p0, Lcom/shopkick/app/presence/WalkinController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    const-string p1, "WalkinControllerPrefs"

    const/4 p2, 0x0

    .line 143
    invoke-virtual {p11, p1, p2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/presence/WalkinController;->sharedPreferences:Landroid/content/SharedPreferences;

    if-eqz p3, :cond_0

    .line 146
    sget-object p1, Lcom/shopkick/app/awards/AwardsManager$RequestType;->WALKIN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    invoke-virtual {p3, p1, p0}, Lcom/shopkick/app/awards/AwardsManager;->registerCallback(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/awards/IAwardsManagerCallback;)V

    :cond_0
    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/presence/WalkinController;)Landroid/content/SharedPreferences;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/shopkick/app/presence/WalkinController;->sharedPreferences:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/presence/WalkinController;)Ljava/lang/String;
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/shopkick/app/presence/WalkinController;->geoFencesToJson()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/presence/WalkinController;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/presence/WalkinController;Lcom/shopkick/sdk/sensor/GeoFence;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/shopkick/app/presence/WalkinController;->removeGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/app/presence/WalkinController;)Lcom/shopkick/app/application/AppActivityManager;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/shopkick/app/presence/WalkinController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/presence/WalkinController;)Lcom/shopkick/app/application/SKLogger;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/shopkick/app/presence/WalkinController;->logger:Lcom/shopkick/app/application/SKLogger;

    return-object p0
.end method

.method private addGeoFence(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;J)V
    .locals 12

    .line 578
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocationsLock:Ljava/lang/Object;

    monitor-enter v0

    .line 579
    :try_start_0
    new-instance v7, Lcom/shopkick/sdk/sensor/GeoFence;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->latitude:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->longitude:Ljava/lang/Double;

    .line 580
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->loiterRadius:Ljava/lang/Integer;

    .line 581
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-double v8, v1

    iget-object v1, p0, Lcom/shopkick/app/presence/WalkinController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->loiterRadiusMultiplierForTracking:Ljava/lang/Double;

    .line 582
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    mul-double/2addr v8, v10

    double-to-int v6, v8

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/sdk/sensor/GeoFence;-><init>(DDI)V

    .line 583
    iget-object v1, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v2, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;

    invoke-direct {v2, p1, p2, p3}, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;-><init>(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;J)V

    invoke-virtual {v1, v7, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 585
    iget-object p1, p0, Lcom/shopkick/app/presence/WalkinController;->geoFenceSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    invoke-virtual {p1, v7}, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->addGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    .line 586
    invoke-direct {p0}, Lcom/shopkick/app/presence/WalkinController;->saveGeofencesToDisk()V

    .line 587
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private clearOldWalkins()V
    .locals 6

    .line 297
    new-instance v0, Lcom/shopkick/app/util/ClockWrapper;

    iget-object v1, p0, Lcom/shopkick/app/presence/WalkinController;->clock:Lcom/shopkick/app/util/Clock;

    iget-object v2, p0, Lcom/shopkick/app/presence/WalkinController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/util/ClockWrapper;-><init>(Lcom/shopkick/app/util/Clock;Lcom/shopkick/app/account/UserAccount;)V

    .line 299
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 300
    iget-object v2, p0, Lcom/shopkick/app/presence/WalkinController;->lastWalkins:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    .line 301
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 302
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    .line 303
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/shopkick/app/util/ClockWrapper;->isBeforeMostRecent2AM(J)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 304
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 307
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 308
    iget-object v2, p0, Lcom/shopkick/app/presence/WalkinController;->lastWalkins:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-void
.end method

.method private createIdentifier(Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;)Ljava/lang/String;
    .locals 2

    .line 509
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 510
    :goto_0
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->chainId:Ljava/lang/String;

    const-string v1, "1"

    invoke-direct {p0, v0, p1, v1}, Lcom/shopkick/app/presence/WalkinController;->createIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private createIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 505
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "walkin:v1:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private geoFencesToJson()Ljava/lang/String;
    .locals 11

    .line 668
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 669
    iget-object v1, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocationsLock:Ljava/lang/Object;

    monitor-enter v1

    const/4 v2, 0x0

    :try_start_0
    const-string/jumbo v3, "size"

    .line 671
    iget-object v4, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 673
    iget-object v3, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v2

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 674
    iget-object v6, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;

    .line 675
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    const-string v8, "geofenceLatitude"

    .line 676
    iget-wide v9, v5, Lcom/shopkick/sdk/sensor/GeoFence;->latitude:D

    invoke-virtual {v7, v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v8, "geofenceLongitude"

    .line 677
    iget-wide v9, v5, Lcom/shopkick/sdk/sensor/GeoFence;->longitude:D

    invoke-virtual {v7, v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v8, "geofenceRadius"

    .line 678
    iget v5, v5, Lcom/shopkick/sdk/sensor/GeoFence;->radius:I

    invoke-virtual {v7, v8, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v5, "checkinLocationChainId"

    .line 679
    invoke-static {v6}, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->access$200(Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;)Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    move-result-object v8

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->chainId:Ljava/lang/String;

    invoke-virtual {v7, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "checkinLocationLocationId"

    .line 680
    invoke-static {v6}, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->access$200(Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;)Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    move-result-object v8

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->locationId:Ljava/lang/String;

    invoke-virtual {v7, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "checkinLocationLatitude"

    .line 681
    invoke-static {v6}, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->access$200(Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;)Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    move-result-object v8

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->latitude:Ljava/lang/Double;

    invoke-virtual {v7, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "checkinLocationLongitude"

    .line 682
    invoke-static {v6}, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->access$200(Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;)Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    move-result-object v8

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->longitude:Ljava/lang/Double;

    invoke-virtual {v7, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "checkinLocationRadius"

    .line 683
    invoke-static {v6}, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->access$200(Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;)Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    move-result-object v8

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->loiterRadius:Ljava/lang/Integer;

    invoke-virtual {v7, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo v5, "timestamp"

    .line 684
    invoke-virtual {v6}, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->getWalkinTimestamp()J

    move-result-wide v8

    invoke-virtual {v7, v5, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 685
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "geofence "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 689
    :catch_0
    :try_start_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    .line 690
    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 691
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "WalkinController: Error converting geofence mapping to JSON string."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5, v6, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 694
    :cond_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 695
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 694
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method private getImpliedIdentifiers(Ljava/lang/String;)[Ljava/lang/String;
    .locals 6

    const-string v0, ":"

    .line 514
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 515
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x5

    if-lt v1, v4, :cond_0

    const/4 v1, 0x4

    aget-object v4, v0, v1

    const-string v5, "1"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "1"

    .line 516
    aput-object v4, v0, v1

    const-string v1, ":"

    .line 517
    invoke-static {v1, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    .line 518
    new-array v1, v1, [Ljava/lang/String;

    aput-object p1, v1, v2

    aput-object v0, v1, v3

    return-object v1

    .line 520
    :cond_0
    new-array v0, v3, [Ljava/lang/String;

    aput-object p1, v0, v2

    return-object v0
.end method

.method private isWalkinIdentifier(Ljava/lang/String;)Z
    .locals 1

    const-string/jumbo v0, "walkin:"

    .line 525
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method private jsonToGeoFences(Ljava/lang/String;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            "Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    .line 720
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    .line 723
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "size"

    .line 724
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move v4, v2

    :goto_0
    if-ge v4, v0, :cond_0

    .line 726
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "geofence "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 727
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 728
    new-instance v5, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    invoke-direct {v5}, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;-><init>()V

    const-string v7, "checkinLocationChainId"

    .line 729
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->chainId:Ljava/lang/String;

    const-string v7, "checkinLocationLocationId"

    .line 730
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->locationId:Ljava/lang/String;

    const-string v7, "checkinLocationLatitude"

    .line 731
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    iput-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->latitude:Ljava/lang/Double;

    const-string v7, "checkinLocationLongitude"

    .line 732
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    iput-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->longitude:Ljava/lang/Double;

    const-string v7, "checkinLocationRadius"

    .line 733
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->loiterRadius:Ljava/lang/Integer;

    const-string/jumbo v7, "timestamp"

    .line 734
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    const-string v9, "geofenceLatitude"

    .line 735
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v11

    const-string v9, "geofenceLongitude"

    .line 736
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v13

    const-string v9, "geofenceRadius"

    .line 737
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v15

    .line 738
    new-instance v6, Lcom/shopkick/sdk/sensor/GeoFence;

    move-object v10, v6

    invoke-direct/range {v10 .. v15}, Lcom/shopkick/sdk/sensor/GeoFence;-><init>(DDI)V

    .line 739
    new-instance v9, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;

    invoke-direct {v9, v5, v7, v8}, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;-><init>(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;J)V

    .line 740
    invoke-virtual {v1, v6, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 743
    :catch_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 744
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 745
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "WalkinController: Error converting JSON string to geofence mapping."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4, v5, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public static synthetic lambda$Mswq_dE5Si3whRzkUA_F9ng5uvA(Lcom/shopkick/app/presence/WalkinController;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/presence/WalkinController;->removeExpiredGeoFences()V

    return-void
.end method

.method private loadGeofencesFromDisk()V
    .locals 5

    .line 702
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 703
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 704
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "WalkinController: Loading geofence mapping from disk."

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 705
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "WalkinControllerGeofencesKey"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 706
    invoke-direct {p0, v0}, Lcom/shopkick/app/presence/WalkinController;->jsonToGeoFences(Ljava/lang/String;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    .line 707
    iget-object v1, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocationsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 708
    :try_start_0
    iput-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    .line 709
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private reRegisterGeofences()V
    .locals 15

    .line 629
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocationsLock:Ljava/lang/Object;

    monitor-enter v0

    .line 630
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 631
    iget-object v3, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;

    .line 632
    invoke-virtual {v2}, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->getCheckinLocation()Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    move-result-object v3

    .line 633
    new-instance v10, Lcom/shopkick/sdk/sensor/GeoFence;

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->latitude:Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->longitude:Ljava/lang/Double;

    .line 634
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->loiterRadius:Ljava/lang/Integer;

    .line 635
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-double v11, v4

    iget-object v4, p0, Lcom/shopkick/app/presence/WalkinController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v4, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->loiterRadiusMultiplierForTracking:Ljava/lang/Double;

    .line 636
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    mul-double/2addr v11, v13

    double-to-int v9, v11

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lcom/shopkick/sdk/sensor/GeoFence;-><init>(DDI)V

    .line 637
    iget-object v4, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v5, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;

    .line 638
    invoke-virtual {v2}, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->getWalkinTimestamp()J

    move-result-wide v6

    invoke-direct {v5, v3, v6, v7}, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;-><init>(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;J)V

    .line 637
    invoke-virtual {v4, v10, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 639
    iget-object v2, p0, Lcom/shopkick/app/presence/WalkinController;->geoFenceSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    invoke-virtual {v2, v10}, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->addGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    goto :goto_0

    .line 641
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 642
    invoke-direct {p0}, Lcom/shopkick/app/presence/WalkinController;->saveGeofencesToDisk()V

    return-void

    :catchall_0
    move-exception v1

    .line 641
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private removeExpiredGeoFences()V
    .locals 10

    .line 608
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 609
    iget-object v1, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocationsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 610
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 611
    iget-object v4, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 612
    iget-object v6, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;

    invoke-virtual {v6}, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->getWalkinTimestamp()J

    move-result-wide v6

    sub-long v6, v2, v6

    const-wide/32 v8, 0x5265c00

    cmp-long v6, v6, v8

    if-ltz v6, :cond_0

    .line 614
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 617
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 618
    iget-object v3, p0, Lcom/shopkick/app/presence/WalkinController;->geoFenceSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    invoke-virtual {v3, v2}, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->removeGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    .line 619
    iget-object v3, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 621
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/presence/WalkinController;->saveGeofencesToDisk()V

    .line 622
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private removeGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V
    .locals 2

    .line 596
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocationsLock:Ljava/lang/Object;

    monitor-enter v0

    .line 597
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/presence/WalkinController;->monitoredGeoFencesToCheckinLocations:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 598
    iget-object v1, p0, Lcom/shopkick/app/presence/WalkinController;->geoFenceSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    invoke-virtual {v1, p1}, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->removeGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    .line 599
    invoke-direct {p0}, Lcom/shopkick/app/presence/WalkinController;->saveGeofencesToDisk()V

    .line 600
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private saveGeofencesToDisk()V
    .locals 2

    .line 649
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->geofenceExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/shopkick/app/presence/WalkinController$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/presence/WalkinController$2;-><init>(Lcom/shopkick/app/presence/WalkinController;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 2

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    sget-object v1, Lcom/shopkick/app/awards/AwardsManager$RequestType;->WALKIN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/app/awards/AwardsManager;->unregisterCallback(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/awards/IAwardsManagerCallback;)V

    return-void
.end method

.method public hasWalkedinSameChainRecently(Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;)Z
    .locals 1

    .line 536
    invoke-direct {p0, p1}, Lcom/shopkick/app/presence/WalkinController;->createIdentifier(Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;)Ljava/lang/String;

    move-result-object p1

    .line 537
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->lastWalkins:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isManualWalkin()Z
    .locals 2

    .line 558
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->walkinCallbackWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 559
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/controllers/IWalkinCallback;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 561
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/presence/WalkinController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWalkinButtonEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/presence/WalkinController;->walkinCallbackWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 562
    invoke-interface {v0}, Lcom/shopkick/app/controllers/IWalkinCallback;->isManualWalkinInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public issueWalkinRequest(Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 293
    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/presence/WalkinController;->issueWalkinRequest(Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;Ljava/lang/String;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/CheckinLocation;)V

    return-void
.end method

.method public issueWalkinRequest(Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;Ljava/lang/String;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/CheckinLocation;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v1, p2

    move/from16 v7, p4

    move-object/from16 v2, p5

    .line 190
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    .line 191
    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 192
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    sget-object v8, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v8}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v8

    or-long/2addr v4, v8

    const-string v8, "MessagingManager.issueWalkinRequest() [chainId:%1$s locationId:%2$s]"

    const/4 v9, 0x2

    new-array v10, v9, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v1, v10, v11

    const/4 v12, 0x1

    aput-object p3, v10, v12

    invoke-virtual {v3, v4, v5, v8, v10}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 197
    iget-object v3, v0, Lcom/shopkick/app/presence/WalkinController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v3}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v3

    if-nez v3, :cond_1

    .line 199
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 200
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 201
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "MessagingManager.issueWalkinRequest() No user account, exiting"

    new-array v5, v11, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget-object v1, v6, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->checkinStarter:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v9, :cond_0

    const-string v1, "WalkinController: No user account"

    .line 204
    invoke-virtual {v0, v11, v1, v7}, Lcom/shopkick/app/presence/WalkinController;->makeWalkinCallback(ZLjava/lang/String;I)V

    :cond_0
    return-void

    .line 209
    :cond_1
    iget-object v3, v0, Lcom/shopkick/app/presence/WalkinController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v3}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v3

    .line 212
    iget-object v4, v6, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->departmentId:Ljava/lang/String;

    if-eqz v4, :cond_2

    iget-object v4, v6, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->departmentId:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string v4, "1"

    .line 214
    :goto_0
    invoke-direct {v0, v3, v1, v4}, Lcom/shopkick/app/presence/WalkinController;->createIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 216
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/presence/WalkinController;->clearOldWalkins()V

    .line 217
    iget-object v5, v0, Lcom/shopkick/app/presence/WalkinController;->lastWalkins:Ljava/util/Map;

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 219
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    .line 220
    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 221
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v12

    sget-object v3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v14

    or-long/2addr v12, v14

    const-string v3, "MessagingManager.issueWalkinRequest() Did walk-in already today, exiting"

    new-array v5, v11, [Ljava/lang/Object;

    invoke-virtual {v2, v12, v13, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 223
    invoke-virtual {v0, v1, v4, v7}, Lcom/shopkick/app/presence/WalkinController;->logWalkinAlreadyAttempted(Ljava/lang/String;Ljava/lang/String;I)V

    .line 224
    iget-object v1, v6, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->checkinStarter:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v9, :cond_3

    const-string v1, "WalkinController: Already attempted walk-in after 2am today"

    .line 225
    invoke-virtual {v0, v11, v1, v7}, Lcom/shopkick/app/presence/WalkinController;->makeWalkinCallback(ZLjava/lang/String;I)V

    :cond_3
    return-void

    .line 230
    :cond_4
    iget-object v5, v0, Lcom/shopkick/app/presence/WalkinController;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {v5}, Lcom/shopkick/app/awards/AwardsManager;->clearExpiredRequests()V

    .line 231
    iget-object v5, v0, Lcom/shopkick/app/presence/WalkinController;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {v5, v3}, Lcom/shopkick/app/awards/AwardsManager;->containsRequestWithIdentifier(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 233
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    .line 234
    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 235
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    sget-object v3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v8

    or-long/2addr v5, v8

    const-string v3, "MessagingManager.issueWalkinRequest() Request already made, exiting"

    new-array v8, v11, [Ljava/lang/Object;

    invoke-virtual {v2, v5, v6, v3, v8}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 237
    invoke-virtual {v0, v1, v4, v7}, Lcom/shopkick/app/presence/WalkinController;->logWalkinAlreadyAttempted(Ljava/lang/String;Ljava/lang/String;I)V

    return-void

    .line 242
    :cond_5
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v8, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    sget-object v9, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v9}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v9

    invoke-virtual {v5, v8, v9, v10}, Lcom/shopkick/logging/DiagnosticLogger;->shouldLog(Lcom/shopkick/logging/Level;J)Z

    move-result v5

    const/16 v8, 0x73

    if-eqz v5, :cond_6

    .line 243
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v9, "source"

    .line 244
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v5, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "chainId"

    .line 245
    invoke-interface {v5, v9, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "departmentId"

    .line 246
    invoke-interface {v5, v9, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v9

    .line 248
    invoke-virtual {v9}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v9

    sget-object v10, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 249
    invoke-virtual {v10}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11, v8, v5}, Lcom/shopkick/logging/DiagnosticLogger;->i(JILjava/util/Map;)V

    .line 253
    :cond_6
    iget-object v5, v0, Lcom/shopkick/app/presence/WalkinController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v5, v5, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 254
    new-instance v5, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v5, v8}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 255
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 256
    invoke-virtual {v5, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 257
    invoke-virtual {v5, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDepartmentId(Ljava/lang/String;)V

    .line 258
    iget-object v4, v0, Lcom/shopkick/app/presence/WalkinController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v4, v5}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_7
    if-eqz v2, :cond_8

    .line 262
    iget-object v4, v6, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->currTimestamp:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-direct {v0, v2, v4, v5}, Lcom/shopkick/app/presence/WalkinController;->addGeoFence(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;J)V

    .line 265
    :cond_8
    iget-object v2, v0, Lcom/shopkick/app/presence/WalkinController;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/chains/ChainDataSource;->getChainInfo(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    .line 266
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;->chainWhiteLogoImageUrl:Ljava/lang/String;

    move-object v5, v1

    goto :goto_1

    :cond_9
    move-object v5, v2

    .line 267
    :goto_1
    invoke-virtual {v0, v12, v2, v7}, Lcom/shopkick/app/presence/WalkinController;->makeWalkinCallback(ZLjava/lang/String;I)V

    .line 269
    iget-object v1, v0, Lcom/shopkick/app/presence/WalkinController;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    iget-object v4, v6, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->presenceCode:Ljava/lang/String;

    move-object v2, v3

    move-object v3, v4

    move-object/from16 v4, p3

    move-object/from16 v6, p1

    move/from16 v7, p4

    invoke-virtual/range {v1 .. v7}, Lcom/shopkick/app/awards/AwardsManager;->makePresenceRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;I)V

    .line 276
    iget-object v1, v0, Lcom/shopkick/app/presence/WalkinController;->geofenceExecutor:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/shopkick/app/presence/-$$Lambda$WalkinController$Mswq_dE5Si3whRzkUA_F9ng5uvA;

    invoke-direct {v2, v0}, Lcom/shopkick/app/presence/-$$Lambda$WalkinController$Mswq_dE5Si3whRzkUA_F9ng5uvA;-><init>(Lcom/shopkick/app/presence/WalkinController;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logWalkinAlreadyAttempted(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 480
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->shouldLog(Lcom/shopkick/logging/Level;J)Z

    move-result v0

    const/16 v1, 0x3b8

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 481
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v3, "reason"

    .line 482
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v3, "source"

    .line 483
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "chainId"

    .line 484
    invoke-interface {v0, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "departmentId"

    .line 485
    invoke-interface {v0, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 486
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    .line 487
    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 488
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5, v1, v0}, Lcom/shopkick/logging/DiagnosticLogger;->i(JILjava/util/Map;)V

    .line 492
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 493
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 494
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    .line 495
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {v0, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 496
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 497
    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDepartmentId(Ljava/lang/String;)V

    .line 498
    iget-object p1, p0, Lcom/shopkick/app/presence/WalkinController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public makeWalkinCallback(ZLjava/lang/String;I)V
    .locals 2

    .line 548
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->walkinCallbackWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 549
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/controllers/IWalkinCallback;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 551
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/presence/WalkinController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWalkinButtonEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 552
    invoke-interface {v0, p1, p2, p3}, Lcom/shopkick/app/controllers/IWalkinCallback;->onWalkinDetected(ZLjava/lang/String;I)V

    :cond_1
    return-void
.end method

.method public onAwardsResponseReceived(Ljava/util/HashMap;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 327
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 330
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 331
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 332
    invoke-direct {p0, v4}, Lcom/shopkick/app/presence/WalkinController;->isWalkinIdentifier(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    .line 336
    :cond_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;

    .line 337
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v6, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    sget-object v7, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v7}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v7

    invoke-virtual {v5, v6, v7, v8}, Lcom/shopkick/logging/DiagnosticLogger;->shouldLog(Lcom/shopkick/logging/Level;J)Z

    move-result v5

    const/16 v6, 0x74

    if-eqz v5, :cond_6

    .line 341
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 342
    iget-object v7, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->statusCode:Ljava/lang/Integer;

    if-eqz v7, :cond_3

    const-string/jumbo v7, "statusCode"

    .line 343
    iget-object v8, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->statusCode:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    :cond_3
    iget-object v7, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    if-eqz v7, :cond_5

    .line 346
    iget-object v7, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->chainId:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_4

    const-string v7, "chainId"

    .line 347
    iget-object v8, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->chainId:Ljava/lang/String;

    invoke-interface {v5, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    :cond_4
    iget-object v7, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->departmentId:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_5

    const-string v7, "departmentId"

    .line 350
    iget-object v8, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->departmentId:Ljava/lang/String;

    invoke-interface {v5, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    :cond_5
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v7

    .line 354
    invoke-virtual {v7}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v7

    sget-object v8, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 355
    invoke-virtual {v8}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9, v6, v5}, Lcom/shopkick/logging/DiagnosticLogger;->i(JILjava/util/Map;)V

    .line 359
    :cond_6
    iget-object v5, p0, Lcom/shopkick/app/presence/WalkinController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v5, v5, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_8

    const-string v5, ":"

    .line 362
    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 363
    array-length v7, v5

    const/4 v8, 0x5

    if-lt v7, v8, :cond_7

    const/4 v3, 0x3

    .line 364
    aget-object v3, v5, v3

    const/4 v7, 0x4

    .line 365
    aget-object v5, v5, v7

    goto :goto_1

    :cond_7
    move-object v5, v3

    .line 368
    :goto_1
    new-instance v7, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v7, v6}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 369
    iget-object v6, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->statusCode:Ljava/lang/Integer;

    invoke-virtual {v7, v6}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStatusCode(Ljava/lang/Integer;)V

    .line 370
    invoke-virtual {v7, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 371
    invoke-virtual {v7, v5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDepartmentId(Ljava/lang/String;)V

    .line 372
    iget-object v3, p0, Lcom/shopkick/app/presence/WalkinController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v5, v7, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v3, v5}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 376
    :cond_8
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    if-eqz v3, :cond_9

    .line 377
    iget-object v3, p0, Lcom/shopkick/app/presence/WalkinController;->walkinListener:Lcom/shopkick/app/campaigns/WalkinListener;

    iget-object v5, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->chainId:Ljava/lang/String;

    iget-object v6, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->locationId:Ljava/lang/String;

    iget-object v7, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->departmentId:Ljava/lang/String;

    invoke-interface {v3, v5, v6, v7}, Lcom/shopkick/app/campaigns/WalkinListener;->onResponseReceived(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    :cond_9
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->checkinStamps:Ljava/util/List;

    if-eqz v3, :cond_1

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->checkinStamps:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_a

    goto/16 :goto_0

    .line 387
    :cond_a
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->checkinStamps:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/CheckinStamp;

    .line 389
    invoke-direct {p0, v4}, Lcom/shopkick/app/presence/WalkinController;->getImpliedIdentifiers(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 390
    array-length v4, v3

    :goto_2
    if-ge v2, v4, :cond_1

    aget-object v5, v3, v2

    .line 394
    iget-object v6, p0, Lcom/shopkick/app/presence/WalkinController;->lastWalkins:Ljava/util/Map;

    iget-object v7, v1, Lcom/shopkick/app/fetchers/api/skapi/CheckinStamp;->timestamp:Ljava/lang/Long;

    invoke-interface {v6, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 399
    :cond_b
    new-instance p1, Lcom/shopkick/app/presence/WalkinController$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/presence/WalkinController$1;-><init>(Lcom/shopkick/app/presence/WalkinController;)V

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 429
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_c

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;

    :cond_c
    if-eqz v3, :cond_11

    .line 431
    iget-object p1, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->statusCode:Ljava/lang/Integer;

    if-eqz p1, :cond_11

    iget-object p1, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->statusCode:Ljava/lang/Integer;

    .line 432
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_11

    .line 433
    iget-object p1, p0, Lcom/shopkick/app/presence/WalkinController;->userAcquisitionReporter:Lcom/shopkick/app/logging/UserAcquisitionReporter;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserAcquisitionReporter;->reportEvent(I)V

    .line 434
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 435
    iget-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->isReceiptScanAvailable:Ljava/lang/Boolean;

    if-eqz v0, :cond_f

    iget-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->isReceiptScanAvailable:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_f

    const-string v0, "receiptScanAvailable"

    const/4 v1, 0x1

    .line 436
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    iget-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    if-eqz v0, :cond_d

    const-string v0, "receiptScanAvailableLocationName"

    .line 438
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->chainName:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    :cond_d
    iget-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->isRetailerReceiptKicksAvailable:Ljava/lang/Boolean;

    if-eqz v0, :cond_e

    const-string v0, "retailerReceiptPresent"

    .line 443
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->isRetailerReceiptKicksAvailable:Ljava/lang/Boolean;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 448
    :cond_e
    iget-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->isKickbateReceiptKicksAvailable:Ljava/lang/Boolean;

    if-eqz v0, :cond_f

    const-string v0, "kickbateItemsPresent"

    .line 449
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->isKickbateReceiptKicksAvailable:Ljava/lang/Boolean;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    :cond_f
    :goto_3
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 455
    iget-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    if-eqz v0, :cond_10

    const-string v0, "Store Name"

    .line 456
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->chainName:Ljava/lang/String;

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Chain ID"

    .line 457
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->chainId:Ljava/lang/String;

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Partner Store"

    .line 458
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->isPartner:Ljava/lang/Boolean;

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    const-string v0, "Walk In Kicks"

    .line 460
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDelta:Ljava/lang/Integer;

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 463
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v4

    sget-object v0, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 464
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    const/4 v7, 0x0

    const v0, 0x927c3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual/range {v4 .. v9}, Lcom/shopkick/logging/EventLogger;->log(JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V

    .line 465
    iget-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "WalkinControllerWalkinSucceededEvent"

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_11
    return-void
.end method

.method public onPopupDismissed(Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 0

    return-void
.end method

.method public registerCallback(Lcom/shopkick/app/controllers/IWalkinCallback;)V
    .locals 1

    .line 543
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->walkinCallbackWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public registerWalkinListener(Lcom/shopkick/app/campaigns/WalkinListener;)V
    .locals 0

    .line 317
    iput-object p1, p0, Lcom/shopkick/app/presence/WalkinController;->walkinListener:Lcom/shopkick/app/campaigns/WalkinListener;

    return-void
.end method

.method public setupGeoFenceSensor()V
    .locals 4

    .line 151
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    .line 152
    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getSensorManager()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v0

    const-class v1, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    iget-object v2, p0, Lcom/shopkick/app/presence/WalkinController;->geoFenceReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    iget-object v3, p0, Lcom/shopkick/app/presence/WalkinController;->geoFenceStatusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    .line 153
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/sdk/sensor/SensorManager;->open(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    iput-object v0, p0, Lcom/shopkick/app/presence/WalkinController;->geoFenceSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    .line 157
    invoke-direct {p0}, Lcom/shopkick/app/presence/WalkinController;->loadGeofencesFromDisk()V

    .line 158
    invoke-direct {p0}, Lcom/shopkick/app/presence/WalkinController;->reRegisterGeofences()V

    return-void
.end method
