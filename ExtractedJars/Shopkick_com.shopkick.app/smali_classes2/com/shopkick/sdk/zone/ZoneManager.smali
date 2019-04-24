.class public Lcom/shopkick/sdk/zone/ZoneManager;
.super Ljava/lang/Object;
.source "ZoneManager.java"

# interfaces
.implements Lcom/shopkick/sdk/zone/ZoneEventsListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;
    }
.end annotation


# static fields
.field private static volatile Instance:Lcom/shopkick/sdk/zone/ZoneManager;

.field private static final InstanceLock:Ljava/lang/Object;


# instance fields
.field private volatile allowNetworkActivity:Z

.field private final apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private final appStateListener:Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;

.field private final appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

.field private final context:Landroid/content/Context;

.field private volatile currentZoneDetector:Lcom/shopkick/sdk/zone/DefaultZoneDetector;

.field private volatile epochOfLastZonesUpdate:Ljava/lang/Long;

.field private final epochTimeToEnteredZoneReading:Ljava/util/concurrent/ConcurrentSkipListMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListMap<",
            "Ljava/lang/Long;",
            "Lcom/shopkick/sdk/zone/ZoneReading;",
            ">;"
        }
    .end annotation
.end field

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private final nearbyZones:Ljava/util/concurrent/ConcurrentSkipListSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable;",
            ">;"
        }
    .end annotation
.end field

.field private final nearbyZonesLock:Ljava/lang/Object;

.field private final nearbyZonesResponseHandler:Lcom/shopkick/fetchers/api/IAPICallback;

.field private final queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/sdk/zone/query/ZoneQuery;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/shopkick/sdk/zone/ZoneProximityListener;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final queryToProximityToListenerLock:Ljava/lang/Object;

.field private final settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

.field private final workExecutor:Ljava/util/concurrent/Executor;

.field private final zoneEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/shopkick/sdk/zone/ZoneEventsListener;",
            ">;"
        }
    .end annotation
.end field

.field private final zoneEventsListenersLock:Ljava/lang/Object;

.field private final zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

.field private final zonesUpdateLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 97
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/zone/ZoneManager;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 2

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZonesLock:Ljava/lang/Object;

    .line 71
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZones:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 73
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListenerLock:Ljava/lang/Object;

    .line 74
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    .line 77
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListenersLock:Ljava/lang/Object;

    .line 78
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 80
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;-><init>(Lcom/shopkick/sdk/zone/ZoneManager;Lcom/shopkick/sdk/zone/ZoneManager$1;)V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->appStateListener:Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;

    const/4 v0, 0x0

    .line 82
    iput-boolean v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->allowNetworkActivity:Z

    .line 88
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->workExecutor:Ljava/util/concurrent/Executor;

    .line 102
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-direct {v0}, Lcom/shopkick/sdk/zone/ZoneStateManager;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    .line 784
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneManager$2;

    invoke-direct {v0, p0}, Lcom/shopkick/sdk/zone/ZoneManager$2;-><init>(Lcom/shopkick/sdk/zone/ZoneManager;)V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZonesResponseHandler:Lcom/shopkick/fetchers/api/IAPICallback;

    .line 808
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneManager$3;

    invoke-direct {v0, p0}, Lcom/shopkick/sdk/zone/ZoneManager$3;-><init>(Lcom/shopkick/sdk/zone/ZoneManager;)V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 977
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->epochTimeToEnteredZoneReading:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 981
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zonesUpdateLock:Ljava/lang/Object;

    .line 984
    iput-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->epochOfLastZonesUpdate:Ljava/lang/Long;

    .line 152
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 154
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneManager$1;

    invoke-direct {v0, p0}, Lcom/shopkick/sdk/zone/ZoneManager$1;-><init>(Lcom/shopkick/sdk/zone/ZoneManager;)V

    invoke-static {v0, p1, v1}, Lcom/shopkick/logging/LoggerManager;->initialize(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V

    .line 213
    :cond_0
    invoke-static {p1}, Lcom/shopkick/sdk/api/Environment;->initialize(Landroid/content/Context;)V

    .line 216
    invoke-static {p1, p2, p3}, Lcom/shopkick/sdk/sensor/SensorManager;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 217
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/shopkick/sdk/sensor/SensorManager;->setApiManager(Lcom/shopkick/fetchers/api/APIManager;)V

    .line 219
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->context:Landroid/content/Context;

    .line 220
    iput-object p2, p0, Lcom/shopkick/sdk/zone/ZoneManager;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    .line 221
    iput-object p3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    .line 222
    iput-object p4, p0, Lcom/shopkick/sdk/zone/ZoneManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 226
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneManager;->appStateListener:Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;

    invoke-interface {p1, p2}, Lcom/shopkick/sdk/presence/AppStateProvider;->addStateListener(Lcom/shopkick/sdk/presence/AppStateListener;)V

    .line 227
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    invoke-interface {p1}, Lcom/shopkick/sdk/presence/AppStateProvider;->isAppInForeground()Z

    move-result p1

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/ZoneManager;->updateCurrentZoneDetector(Z)V

    .line 230
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->context:Landroid/content/Context;

    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneManager;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    iget-object p3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-static {p1, p2, p3}, Lcom/shopkick/sdk/presence/LocationManager;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 231
    invoke-static {}, Lcom/shopkick/sdk/presence/LocationManager;->getInstance()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneManager;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/presence/LocationManager;->addLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 232
    invoke-static {}, Lcom/shopkick/sdk/presence/LocationManager;->getInstance()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/ZoneManager;->updateZones(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/zone/ZoneManager;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/ZoneManager;->handleCompletedNearbyZonesResponse(Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/shopkick/sdk/zone/ZoneManager;Ljava/util/List;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/ZoneManager;->updateDetectionStrategy(Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/sdk/zone/ZoneManager;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 63
    iget-object p0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->workExecutor:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/sdk/zone/ZoneManager;Landroid/location/Location;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/ZoneManager;->updateZones(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/sdk/zone/ZoneManager;)Ljava/lang/Object;
    .locals 0

    .line 63
    iget-object p0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZonesLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/sdk/zone/ZoneManager;Z)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/ZoneManager;->updateCurrentZoneDetector(Z)V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/sdk/zone/ZoneManager;)Ljava/util/concurrent/ConcurrentSkipListSet;
    .locals 0

    .line 63
    iget-object p0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZones:Ljava/util/concurrent/ConcurrentSkipListSet;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/sdk/zone/ZoneManager;)Lcom/shopkick/sdk/zone/DefaultZoneDetector;
    .locals 0

    .line 63
    iget-object p0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->currentZoneDetector:Lcom/shopkick/sdk/zone/DefaultZoneDetector;

    return-object p0
.end method

.method static synthetic access$800(Lcom/shopkick/sdk/zone/ZoneManager;)Ljava/lang/Object;
    .locals 0

    .line 63
    iget-object p0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListenerLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$900(Lcom/shopkick/sdk/zone/ZoneManager;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ZoneManager;->updateZoneToProximityToListener()V

    return-void
.end method

.method private addEnteredZoneToHistory(Lcom/shopkick/sdk/zone/Zone;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 6

    .line 1030
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 1031
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CHECKIN: ZoneManager.addEnteredZoneToHistory() zone: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " reading: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    .line 1035
    instance-of v0, p2, Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    if-nez v0, :cond_0

    goto :goto_1

    .line 1036
    :cond_0
    check-cast p2, Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    .line 1037
    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object p2

    if-nez p2, :cond_1

    return-void

    .line 1041
    :cond_1
    invoke-static {p1, p2}, Lcom/shopkick/sdk/SDKClient;->getReadingFromZoneAndBeacon(Lcom/shopkick/sdk/zone/Zone;Lcom/shopkick/sdk/scanner/Beacon;)Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    move-result-object p1

    .line 1042
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneManager;->epochTimeToEnteredZoneReading:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Ljava/util/concurrent/ConcurrentSkipListMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1043
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 1044
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CHECKIN: ZoneManager.addEnteredZoneToHistory() validation passed, zoneReading: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {p2, v0, v1, p1, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 1048
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->epochTimeToEnteredZoneReading:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentSkipListMap;->keySet()Ljava/util/NavigableSet;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    .line 1049
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/32 v4, 0x1b7740

    sub-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 1050
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->epochTimeToEnteredZoneReading:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentSkipListMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method public static getInstance()Lcom/shopkick/sdk/zone/ZoneManager;
    .locals 2

    .line 109
    sget-object v0, Lcom/shopkick/sdk/zone/ZoneManager;->Instance:Lcom/shopkick/sdk/zone/ZoneManager;

    if-eqz v0, :cond_0

    .line 112
    sget-object v0, Lcom/shopkick/sdk/zone/ZoneManager;->Instance:Lcom/shopkick/sdk/zone/ZoneManager;

    return-object v0

    .line 110
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "initialize() must be called before getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getNearbyZonesForAllQueries()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable;",
            ">;"
        }
    .end annotation

    .line 581
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 582
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

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

    check-cast v2, Lcom/shopkick/sdk/zone/query/ZoneQuery;

    .line 583
    invoke-virtual {p0, v2}, Lcom/shopkick/sdk/zone/ZoneManager;->getNearbyZonesForQuery(Lcom/shopkick/sdk/zone/query/ZoneQuery;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private handleCompletedNearbyZonesResponse(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 10

    const/4 v0, 0x0

    .line 707
    :try_start_0
    iget-boolean v1, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_5

    iget-object v1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v1, :cond_5

    iget-object v1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v1, v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesResponseV2;

    if-eqz v1, :cond_5

    .line 710
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesResponseV2;

    .line 711
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 712
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "CHECKIN: ZoneManager: nearby zones response received"

    new-array v5, v0, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 714
    iget-object v1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesResponseV2;->zones:Ljava/util/ArrayList;

    if-eqz v1, :cond_5

    iget-object v1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesResponseV2;->zones:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_5

    .line 718
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 719
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 720
    iget-object v3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZonesLock:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 723
    :try_start_1
    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesResponseV2;->zones:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v4, v0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;

    .line 724
    new-instance v7, Lcom/shopkick/sdk/zone/ZoneParcelable;

    invoke-direct {v7, v5}, Lcom/shopkick/sdk/zone/ZoneParcelable;-><init>(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;)V

    .line 725
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 726
    iget-object v5, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZones:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v5, v7}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    move v4, v6

    goto :goto_0

    .line 732
    :cond_1
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZones:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/sdk/zone/ZoneParcelable;

    .line 733
    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 735
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v4, v6

    goto :goto_1

    :cond_3
    if-eqz v4, :cond_4

    .line 741
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v5, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 742
    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v7

    const-string v5, "ZoneManager.completedResponse() received new nearby zones [count: %1$d]"

    new-array v6, v6, [Ljava/lang/Object;

    .line 744
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v6, v0

    .line 742
    invoke-virtual {p1, v7, v8, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 745
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZones:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->clear()V

    .line 746
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZones:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/ConcurrentSkipListSet;->addAll(Ljava/util/Collection;)Z

    .line 751
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->epochOfLastZonesUpdate:Ljava/lang/Long;

    .line 752
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zonesUpdateLock:Ljava/lang/Object;

    monitor-enter p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 753
    :try_start_2
    iget-object v2, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zonesUpdateLock:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 754
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 760
    :try_start_3
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->currentZoneDetector:Lcom/shopkick/sdk/zone/DefaultZoneDetector;

    iget-object v2, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZones:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-interface {p1, v2}, Lcom/shopkick/sdk/zone/DefaultZoneDetector;->setRelevantZones(Ljava/util/Collection;)V

    .line 761
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v4, :cond_5

    .line 766
    :try_start_4
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListenerLock:Ljava/lang/Object;

    monitor-enter p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 767
    :try_start_5
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ZoneManager;->updateZoneToProximityToListener()V

    .line 768
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 770
    :try_start_6
    invoke-direct {p0, v1}, Lcom/shopkick/sdk/zone/ZoneManager;->updateDetectionStrategy(Ljava/util/List;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_2

    :catchall_0
    move-exception v1

    .line 768
    :try_start_7
    monitor-exit p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    throw v1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    :catchall_1
    move-exception v1

    .line 754
    :try_start_9
    monitor-exit p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    throw v1

    :catchall_2
    move-exception p1

    .line 761
    monitor-exit v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :try_start_b
    throw p1
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    :catch_0
    move-exception p1

    move-object v4, p1

    .line 779
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object p1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v5, "ZoneManager.completedResponse() callback failed"

    new-array v6, v0, [Ljava/lang/Object;

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public static initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 2

    if-eqz p0, :cond_5

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    .line 139
    sget-object v0, Lcom/shopkick/sdk/zone/ZoneManager;->Instance:Lcom/shopkick/sdk/zone/ZoneManager;

    if-nez v0, :cond_1

    .line 140
    sget-object v0, Lcom/shopkick/sdk/zone/ZoneManager;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 141
    :try_start_0
    sget-object v1, Lcom/shopkick/sdk/zone/ZoneManager;->Instance:Lcom/shopkick/sdk/zone/ZoneManager;

    if-nez v1, :cond_0

    .line 142
    new-instance v1, Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/shopkick/sdk/zone/ZoneManager;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;Lcom/shopkick/fetchers/api/APIManager;)V

    sput-object v1, Lcom/shopkick/sdk/zone/ZoneManager;->Instance:Lcom/shopkick/sdk/zone/ZoneManager;

    .line 144
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

    .line 135
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'apiManager\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 132
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'settings\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 129
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'appStateProvider\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 126
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'context\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private updateCurrentZoneDetector(Z)V
    .locals 11

    .line 822
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->currentZoneDetector:Lcom/shopkick/sdk/zone/DefaultZoneDetector;

    if-eqz v0, :cond_0

    .line 823
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->currentZoneDetector:Lcom/shopkick/sdk/zone/DefaultZoneDetector;

    invoke-interface {v0}, Lcom/shopkick/sdk/zone/DefaultZoneDetector;->close()V

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 828
    new-instance p1, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    iget-object v2, p0, Lcom/shopkick/sdk/zone/ZoneManager;->context:Landroid/content/Context;

    iget-object v3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    iget-object v4, p0, Lcom/shopkick/sdk/zone/ZoneManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    iget-object v5, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    iget-object v6, p0, Lcom/shopkick/sdk/zone/ZoneManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    move-object v1, p1

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;Lcom/shopkick/sdk/zone/ZoneStateManager;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/sdk/zone/ZoneManager;)V

    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->currentZoneDetector:Lcom/shopkick/sdk/zone/DefaultZoneDetector;

    .line 834
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "ZoneManager: currentZoneDetector is FOREGROUND"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v2, v3, v0}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 836
    :cond_1
    new-instance p1, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iget-object v5, p0, Lcom/shopkick/sdk/zone/ZoneManager;->context:Landroid/content/Context;

    iget-object v6, p0, Lcom/shopkick/sdk/zone/ZoneManager;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    iget-object v7, p0, Lcom/shopkick/sdk/zone/ZoneManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    iget-object v8, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    iget-object v9, p0, Lcom/shopkick/sdk/zone/ZoneManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    move-object v4, p1

    move-object v10, p0

    invoke-direct/range {v4 .. v10}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;Lcom/shopkick/sdk/zone/ZoneStateManager;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/sdk/zone/ZoneManager;)V

    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->currentZoneDetector:Lcom/shopkick/sdk/zone/DefaultZoneDetector;

    .line 842
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "ZoneManager: currentZoneDetector is BACKGROUND"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v2, v3, v0}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 846
    :goto_0
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->currentZoneDetector:Lcom/shopkick/sdk/zone/DefaultZoneDetector;

    invoke-interface {p1, p0}, Lcom/shopkick/sdk/zone/DefaultZoneDetector;->setZoneEventsListener(Lcom/shopkick/sdk/zone/ZoneEventsListener;)V

    return-void
.end method

.method private updateDetectionStrategy(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable;",
            ">;)V"
        }
    .end annotation

    .line 607
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "ZoneManager.updateDetectionStrategy()"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    .line 613
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 614
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/Zone;

    .line 615
    iget-object v3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->currentZoneDetector:Lcom/shopkick/sdk/zone/DefaultZoneDetector;

    invoke-interface {v3, v2}, Lcom/shopkick/sdk/zone/DefaultZoneDetector;->unregisterZone(Lcom/shopkick/sdk/zone/Zone;)V

    goto :goto_0

    .line 617
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 618
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v5, "ZoneManager.updateDetectionStrategy() unregistered %1$d zones"

    new-array v6, v0, [Ljava/lang/Object;

    .line 620
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v6, v4

    .line 618
    invoke-virtual {v1, v2, v3, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 627
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 628
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/query/ZoneQuery;

    .line 629
    iget-object v3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZones:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentSkipListSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/sdk/zone/Zone;

    .line 630
    invoke-virtual {v2, v5}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->isValid(Lcom/shopkick/sdk/zone/Zone;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 631
    iget-object v6, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    .line 632
    new-instance v8, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v8, v5, v7}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 633
    invoke-interface {p1, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 634
    invoke-interface {p1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 641
    :cond_5
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 642
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->currentZoneDetector:Lcom/shopkick/sdk/zone/DefaultZoneDetector;

    invoke-interface {v1, p1}, Lcom/shopkick/sdk/zone/DefaultZoneDetector;->registerZones(Ljava/util/List;)V

    .line 643
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 644
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v5, "ZoneManager.updateDetectionStrategy() registered %1$d zones"

    new-array v0, v0, [Ljava/lang/Object;

    .line 646
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v4

    .line 644
    invoke-virtual {v1, v2, v3, v5, v0}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_6
    return-void
.end method

.method private updateZoneToProximityToListener()V
    .locals 13

    .line 410
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "ZoneManager.updateZoneToProximityToListener()"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 418
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/query/ZoneQuery;

    .line 419
    iget-object v2, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZones:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentSkipListSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/sdk/zone/ZoneParcelable;

    .line 420
    invoke-virtual {v1, v3}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->isValid(Lcom/shopkick/sdk/zone/Zone;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 421
    iget-object v5, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v5, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    .line 424
    iget-object v7, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v7}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    .line 425
    iget-object v7, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v7}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v7

    new-instance v8, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v8}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 426
    invoke-virtual {v7, v3, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    :cond_3
    iget-object v7, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v7}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v7

    .line 432
    invoke-virtual {v7, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/concurrent/ConcurrentHashMap;

    .line 433
    invoke-virtual {v7, v6}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    .line 434
    new-instance v8, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v8}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-virtual {v7, v6, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    :cond_4
    invoke-virtual {v7, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/concurrent/ConcurrentHashMap;

    .line 441
    iget-object v8, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    .line 440
    invoke-virtual {v8, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/concurrent/ConcurrentHashMap;

    .line 441
    invoke-virtual {v8, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v8}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_5
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/shopkick/sdk/zone/ZoneProximityListener;

    .line 443
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static {v9, v10, v3}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->hashCode(Lcom/shopkick/sdk/zone/ZoneProximityListener;ILcom/shopkick/sdk/zone/ZoneParcelable;)I

    move-result v10

    .line 444
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/util/concurrent/ConcurrentHashMap;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    .line 445
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    new-instance v11, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;

    .line 446
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-direct {v11, v9, v12, v3}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;-><init>(Lcom/shopkick/sdk/zone/ZoneProximityListener;ILcom/shopkick/sdk/zone/ZoneParcelable;)V

    .line 445
    invoke-virtual {v7, v10, v11}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 455
    :cond_6
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ZoneManager;->getNearbyZonesForAllQueries()Ljava/util/List;

    move-result-object v0

    .line 458
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/Zone;

    .line 460
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 467
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 470
    iget-object v5, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/sdk/zone/query/ZoneQuery;

    .line 471
    invoke-virtual {v6, v2}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->isValid(Lcom/shopkick/sdk/zone/Zone;)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 472
    iget-object v7, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    .line 473
    invoke-virtual {v7, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/concurrent/ConcurrentHashMap;

    .line 474
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    .line 475
    invoke-virtual {v3, v8}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 476
    invoke-virtual {v3, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v6, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-virtual {v9, v8}, Ljava/util/concurrent/ConcurrentLinkedQueue;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    .line 478
    :cond_9
    invoke-virtual {v6, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v8, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 485
    :cond_a
    iget-object v5, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v5}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v5

    .line 486
    invoke-virtual {v5, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/concurrent/ConcurrentHashMap;

    .line 487
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_b
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 489
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    .line 491
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 493
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/concurrent/ConcurrentHashMap;

    .line 494
    invoke-virtual {v9}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_c
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;

    .line 496
    invoke-virtual {v11}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getListener()Lcom/shopkick/sdk/zone/ZoneProximityListener;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_c

    .line 497
    invoke-virtual {v9, v11}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    iget-object v12, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v12}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v12

    invoke-virtual {v12, v11}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    invoke-virtual {v9}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v11

    if-gtz v11, :cond_c

    .line 502
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v5, v11}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v11

    if-gtz v11, :cond_c

    .line 506
    iget-object v11, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v11}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v11

    invoke-virtual {v11, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 513
    :cond_d
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 512
    invoke-virtual {v5, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/concurrent/ConcurrentHashMap;

    .line 513
    invoke-virtual {v8}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v8

    .line 512
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_e

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;

    .line 514
    iget-object v10, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v10}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 516
    :cond_e
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v7

    if-gtz v7, :cond_b

    .line 520
    iget-object v7, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v7}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3

    .line 525
    :cond_f
    iget-object v3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 528
    iget-object v6, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    .line 526
    invoke-virtual {v6}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v6

    .line 527
    invoke-virtual {v6, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/concurrent/ConcurrentHashMap;

    .line 528
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/concurrent/ConcurrentHashMap;

    .line 529
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v5

    .line 528
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;

    .line 530
    iget-object v7, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v7}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    .line 533
    :cond_11
    iget-object v3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    .line 537
    :cond_12
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 538
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "ZoneManager.updateZoneToProximityToListener(QueryToProximityToListener.size:%1$d ZoneToProximityToListener.size:%2$d)"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    .line 540
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v4

    const/4 v4, 0x1

    iget-object v6, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    .line 541
    invoke-virtual {v6}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v4

    .line 538
    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private updateZones(Landroid/location/Location;)V
    .locals 11

    if-eqz p1, :cond_0

    .line 654
    iget-boolean v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->allowNetworkActivity:Z

    if-eqz v0, :cond_0

    .line 656
    new-instance v0, Landroid/location/Location;

    invoke-direct {v0, p1}, Landroid/location/Location;-><init>(Landroid/location/Location;)V

    const-wide v1, 0x40bf6eb851eb851fL    # 8046.72

    .line 657
    invoke-static {v0, v1, v2}, Lcom/shopkick/utilities/GeoUtilities;->roundLatLonForBucketedCaching(Landroid/location/Location;D)V

    .line 661
    new-instance v5, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;

    invoke-direct {v5}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;-><init>()V

    .line 662
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v5, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;->latitude:Ljava/lang/Double;

    .line 663
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v5, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;->longitude:Ljava/lang/Double;

    .line 664
    iget-object v3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v4, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v6, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZonesResponseHandler:Lcom/shopkick/fetchers/api/IAPICallback;

    const/4 v7, 0x1

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual/range {v3 .. v10}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_0
    return-void
.end method


# virtual methods
.method public addProximityListener(Lcom/shopkick/sdk/zone/ZoneProximityListener;ILjava/lang/String;)V
    .locals 8

    const-string v0, "\'listener\' can not be null"

    .line 276
    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "\'proximity\' can not be negative"

    .line 277
    invoke-static {v2, v3}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 279
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 280
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "ZoneManager.addProximityListener() [proximity:%1$d zoneQuery:%2$s]"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    .line 282
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v1

    aput-object p3, v6, v0

    .line 280
    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 286
    invoke-static {p3}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->parse(Ljava/lang/String;)Lcom/shopkick/sdk/zone/query/ZoneQuery;

    move-result-object p3

    .line 287
    iget-object v2, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListenerLock:Ljava/lang/Object;

    monitor-enter v2

    .line 290
    :try_start_0
    iget-object v3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, p3}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 291
    iget-object v3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-virtual {v3, p3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    :cond_1
    iget-object v3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    .line 297
    invoke-virtual {v3, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 298
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 299
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    invoke-virtual {p3, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    :cond_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 304
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    .line 305
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    move p1, v0

    goto :goto_1

    :cond_3
    move p1, v1

    .line 311
    :goto_1
    iget-object p3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-interface {p3}, Lcom/shopkick/sdk/core/ConfigurationProvider;->getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    move-result-object p3

    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-interface {p3}, Lcom/shopkick/sdk/core/ConfigurationProvider;->getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    move-result-object p3

    iget-object p3, p3, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->zoneListenerWarningLimit:Ljava/lang/Integer;

    if-eqz p3, :cond_4

    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result p3

    iget-object v3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-interface {v3}, Lcom/shopkick/sdk/core/ConfigurationProvider;->getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    move-result-object v3

    iget-object v3, v3, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->zoneListenerWarningLimit:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-le p3, v3, :cond_4

    .line 312
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p3

    invoke-virtual {p3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p3

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 313
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "ZoneManager.addProximityListener() forgetting to remove listeners? [listenerCount:%1$d]"

    new-array v0, v0, [Ljava/lang/Object;

    .line 315
    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v0, v1

    .line 313
    invoke-virtual {p3, v3, v4, v5, v0}, Lcom/shopkick/logging/DiagnosticLogger;->w(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 318
    :cond_4
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ZoneManager;->updateZoneToProximityToListener()V

    .line 319
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    .line 323
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/ZoneManager;->updateDetectionStrategy(Ljava/util/List;)V

    :cond_5
    return-void

    :catchall_0
    move-exception p1

    .line 319
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public addZoneEventsListener(Lcom/shopkick/sdk/zone/ZoneEventsListener;)V
    .locals 2

    .line 558
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 559
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListenersLock:Ljava/lang/Object;

    monitor-enter v0

    .line 560
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 561
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 563
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

.method public allowNetworkActivity()V
    .locals 1

    const/4 v0, 0x1

    .line 240
    iput-boolean v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->allowNetworkActivity:Z

    .line 241
    invoke-static {}, Lcom/shopkick/sdk/presence/LocationManager;->getInstance()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/shopkick/sdk/zone/ZoneManager;->updateZones(Landroid/location/Location;)V

    return-void
.end method

.method public disallowNetworkActivity()V
    .locals 1

    const/4 v0, 0x0

    .line 248
    iput-boolean v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->allowNetworkActivity:Z

    return-void
.end method

.method public doZonesUpdate(Landroid/location/Location;)V
    .locals 8

    .line 995
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->epochOfLastZonesUpdate:Ljava/lang/Long;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->epochOfLastZonesUpdate:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/32 v6, 0x493e0

    sub-long/2addr v4, v6

    cmp-long v0, v2, v4

    if-ltz v0, :cond_0

    .line 997
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 998
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v0, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v0, "CHECKIN: ZoneManager: nearby zones already updated in past 3 minutes"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 1003
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 1004
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "CHECKIN: ZoneManager.doZonesUpdate() location: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 1008
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 1009
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "CHECKIN: ZoneManager: sending nearby zones request"

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 1011
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/ZoneManager;->updateZones(Landroid/location/Location;)V

    .line 1012
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zonesUpdateLock:Ljava/lang/Object;

    monitor-enter p1

    .line 1014
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zonesUpdateLock:Ljava/lang/Object;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 1016
    :catch_0
    :goto_0
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1017
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 1018
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v0, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v0, "CHECKIN: ZoneManager: nearby zones request received or timed out"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 1016
    :goto_1
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method forceUpdateZones(Landroid/location/Location;)V
    .locals 10

    if-eqz p1, :cond_0

    .line 683
    new-instance v0, Landroid/location/Location;

    invoke-direct {v0, p1}, Landroid/location/Location;-><init>(Landroid/location/Location;)V

    const-wide v1, 0x40bf6eb851eb851fL    # 8046.72

    .line 684
    invoke-static {v0, v1, v2}, Lcom/shopkick/utilities/GeoUtilities;->roundLatLonForBucketedCaching(Landroid/location/Location;D)V

    .line 688
    new-instance v5, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;

    invoke-direct {v5}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;-><init>()V

    .line 689
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v5, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;->latitude:Ljava/lang/Double;

    .line 690
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v5, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;->longitude:Ljava/lang/Double;

    .line 691
    iget-object v3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v4, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v6, 0x1

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual/range {v3 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetchSynchronous(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/DataResponse;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 698
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/ZoneManager;->handleCompletedNearbyZonesResponse(Lcom/shopkick/fetchers/DataResponse;)V

    :cond_0
    return-void
.end method

.method public getNearbyZones()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable;",
            ">;"
        }
    .end annotation

    .line 549
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZones:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getNearbyZonesForQuery(Lcom/shopkick/sdk/zone/query/ZoneQuery;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/sdk/zone/query/ZoneQuery;",
            ")",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable;",
            ">;"
        }
    .end annotation

    .line 590
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 591
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->nearbyZones:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/ZoneParcelable;

    .line 592
    invoke-virtual {p1, v2}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->isValid(Lcom/shopkick/sdk/zone/Zone;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 593
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getRecentlyEnteredZones(J)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/shopkick/sdk/zone/ZoneReading;",
            ">;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 1069
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    .line 1073
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1074
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->epochTimeToEnteredZoneReading:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentSkipListMap;->keySet()Ljava/util/NavigableSet;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    .line 1075
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, p1

    cmp-long v3, v3, v5

    if-ltz v3, :cond_1

    .line 1076
    iget-object v3, p0, Lcom/shopkick/sdk/zone/ZoneManager;->epochTimeToEnteredZoneReading:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentSkipListMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1079
    :cond_2
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method isNetworkActivityAllowed()Z
    .locals 1

    .line 255
    iget-boolean v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->allowNetworkActivity:Z

    return v0
.end method

.method public onBeaconMatchedToZone(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;)V
    .locals 11

    .line 903
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "ZoneEventsListener.onBeaconMatchedToZone()"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 904
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/ZoneEventsListener;

    .line 906
    :try_start_0
    invoke-interface {v1, p1, p2}, Lcom/shopkick/sdk/zone/ZoneEventsListener;->onBeaconMatchedToZone(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v8

    .line 908
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 909
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v9, "ZoneEventsListener.onBeaconMatchedToZone() callback failed"

    new-array v10, v4, [Ljava/lang/Object;

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onBeaconMatchedToZoneInFallback(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;Landroid/location/Location;)V
    .locals 11

    .line 917
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "ZoneEventsListener.onBeaconMatchedToZoneInFallback()"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 918
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/ZoneEventsListener;

    .line 920
    :try_start_0
    invoke-interface {v1, p1, p2, p3}, Lcom/shopkick/sdk/zone/ZoneEventsListener;->onBeaconMatchedToZoneInFallback(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;Landroid/location/Location;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v8

    .line 922
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 923
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v9, "ZoneEventsListener.onBeaconMatchedToZoneInFallback() callback failed"

    new-array v10, v4, [Ljava/lang/Object;

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onBeaconNotMatchedToZone(Ljava/lang/String;)V
    .locals 11

    .line 931
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "ZoneEventsListener.onBeaconNotMatchedToZone()"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 932
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/ZoneEventsListener;

    .line 934
    :try_start_0
    invoke-interface {v1, p1}, Lcom/shopkick/sdk/zone/ZoneEventsListener;->onBeaconNotMatchedToZone(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v8

    .line 936
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 937
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v9, "ZoneEventsListener.onBeaconNotMatchedToZone() callback failed"

    new-array v10, v4, [Ljava/lang/Object;

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onBeaconObservedInZone(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;I)V
    .locals 11

    .line 945
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "ZoneEventsListener.onBeaconObservedInZone()"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 946
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/ZoneEventsListener;

    .line 948
    :try_start_0
    invoke-interface {v1, p1, p2, p3}, Lcom/shopkick/sdk/zone/ZoneEventsListener;->onBeaconObservedInZone(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v8

    .line 950
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 951
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v9, "ZoneEventsListener.onBeaconObservedInZone() callback failed"

    new-array v10, v4, [Ljava/lang/Object;

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onWiFiObservedInZone(Lcom/shopkick/sdk/sensor/WiFiScanResult;)V
    .locals 11

    .line 959
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "ZoneEventsListener.onWiFiObservedInZone()"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 960
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/ZoneEventsListener;

    .line 962
    :try_start_0
    invoke-interface {v1, p1}, Lcom/shopkick/sdk/zone/ZoneEventsListener;->onWiFiObservedInZone(Lcom/shopkick/sdk/sensor/WiFiScanResult;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v8

    .line 964
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 965
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v9, "ZoneEventsListener.onWiFiObservedInZone() callback failed"

    new-array v10, v4, [Ljava/lang/Object;

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onZoneEntered(Lcom/shopkick/sdk/zone/Zone;ILcom/shopkick/sdk/sensor/Reading;)V
    .locals 11

    .line 887
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "ZoneEventsListener.onZoneEntered()"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 888
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/ZoneEventsListener;

    .line 890
    :try_start_0
    invoke-direct {p0, p1, p3}, Lcom/shopkick/sdk/zone/ZoneManager;->addEnteredZoneToHistory(Lcom/shopkick/sdk/zone/Zone;Lcom/shopkick/sdk/sensor/Reading;)V

    .line 891
    invoke-interface {v1, p1, p2, p3}, Lcom/shopkick/sdk/zone/ZoneEventsListener;->onZoneEntered(Lcom/shopkick/sdk/zone/Zone;ILcom/shopkick/sdk/sensor/Reading;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    move-object v8, v1

    .line 893
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 894
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v9, "ZoneEventsListener.onZoneEntered() callback failed"

    new-array v10, v4, [Ljava/lang/Object;

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeProximityListener(Lcom/shopkick/sdk/zone/ZoneProximityListener;ILjava/lang/String;)V
    .locals 8

    if-eqz p1, :cond_6

    if-ltz p2, :cond_5

    .line 348
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 349
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "ZoneManager.removeProximityListener() [listener:%1$s proximity:%2$d zoneQuery:%3$s]"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    .line 352
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x1

    aput-object v6, v4, v7

    const/4 v6, 0x2

    aput-object p3, v4, v6

    .line 349
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 357
    invoke-static {p3}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->parse(Ljava/lang/String;)Lcom/shopkick/sdk/zone/query/ZoneQuery;

    move-result-object p3

    .line 358
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListenerLock:Ljava/lang/Object;

    monitor-enter v0

    .line 359
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p3}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 360
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    .line 361
    invoke-virtual {v1, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 362
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 363
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 364
    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 367
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result p1

    if-gtz p1, :cond_1

    .line 368
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result p1

    if-gtz p1, :cond_0

    .line 373
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->queryToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    move v5, v7

    .line 380
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ZoneManager;->updateZoneToProximityToListener()V

    .line 381
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_4

    .line 387
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ZoneManager;->getNearbyZonesForAllQueries()Ljava/util/List;

    move-result-object p1

    .line 388
    invoke-virtual {p0, p3}, Lcom/shopkick/sdk/zone/ZoneManager;->getNearbyZonesForQuery(Lcom/shopkick/sdk/zone/query/ZoneQuery;)Ljava/util/List;

    move-result-object p2

    .line 389
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 390
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/zone/ZoneParcelable;

    .line 391
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 392
    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 397
    :cond_3
    invoke-direct {p0, p3}, Lcom/shopkick/sdk/zone/ZoneManager;->updateDetectionStrategy(Ljava/util/List;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    .line 381
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 345
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'proximity\' can not be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 342
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'listener\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public removeZoneEventsListener(Lcom/shopkick/sdk/zone/ZoneEventsListener;)V
    .locals 2

    .line 572
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 573
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListenersLock:Ljava/lang/Object;

    monitor-enter v0

    .line 574
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager;->zoneEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 575
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    :goto_0
    return-void
.end method
