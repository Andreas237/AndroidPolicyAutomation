.class Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;
.super Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;
.source "DefaultBackgroundZoneDetector.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/StatusListener;


# static fields
.field private static final BACKGROUND_SCANNING_TIME:I = 0x927c0

.field private static final DWELL_TIME:I = 0x7530

.field private static final EXIT_TIME:I = 0x7530

.field private static final MIN_GEO_FENCE_RADIUS_IN_METERS:I = 0x64


# instance fields
.field private final dwellRunnable:Ljava/lang/Runnable;

.field private final exitRunnable:Ljava/lang/Runnable;

.field private final explicitGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation
.end field

.field private final geoFenceReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

.field private final isWiFiEnabledInBackground:Z

.field private final locationServicesReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

.field private final relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;",
            ">;"
        }
    .end annotation
.end field

.field private final relevantIdToZone:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/sdk/zone/ZoneParcelable;",
            ">;"
        }
    .end annotation
.end field

.field private final relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final scheduler:Ljava/util/concurrent/ScheduledExecutorService;

.field private final sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Class;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final sensorTypeToReferenceCountLock:Ljava/lang/Object;

.field private final sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Class;",
            "Lcom/shopkick/sdk/sensor/Sensor;",
            ">;"
        }
    .end annotation
.end field

.field private final sensorsUpdateLock:Ljava/lang/Object;

.field private final shopkickBeaconReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

.field private stopScanningFuture:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private final stopScanningFutureLock:Ljava/lang/Object;

.field private final wifiScanReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;Lcom/shopkick/sdk/zone/ZoneStateManager;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/sdk/zone/ZoneManager;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    .line 189
    invoke-direct {v0, v3, v1, v2}, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;-><init>(Lcom/shopkick/sdk/zone/ZoneManager;Lcom/shopkick/sdk/zone/ZoneStateManager;Lcom/shopkick/fetchers/api/APIManager;)V

    const/4 v1, 0x1

    .line 77
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    .line 79
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorsUpdateLock:Ljava/lang/Object;

    .line 80
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    .line 81
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToReferenceCountLock:Ljava/lang/Object;

    .line 82
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    .line 85
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantIdToZone:Ljava/util/concurrent/ConcurrentHashMap;

    .line 88
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;

    .line 95
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

    .line 102
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

    .line 110
    new-instance v1, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->explicitGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 122
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->stopScanningFutureLock:Ljava/lang/Object;

    .line 125
    new-instance v1, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$1;

    invoke-direct {v1, v0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$1;-><init>(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->dwellRunnable:Ljava/lang/Runnable;

    .line 157
    new-instance v1, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$2;

    invoke-direct {v1, v0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$2;-><init>(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->exitRunnable:Ljava/lang/Runnable;

    .line 766
    new-instance v1, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$4;

    invoke-direct {v1, v0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$4;-><init>(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->geoFenceReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 918
    new-instance v1, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;

    invoke-direct {v1, v0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;-><init>(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->shopkickBeaconReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 978
    new-instance v1, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$6;

    invoke-direct {v1, v0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$6;-><init>(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->locationServicesReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 1090
    new-instance v1, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$7;

    invoke-direct {v1, v0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$7;-><init>(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->wifiScanReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 191
    invoke-interface/range {p3 .. p3}, Lcom/shopkick/sdk/core/ConfigurationProvider;->isWiFiEnabledInBackground()Z

    move-result v1

    iput-boolean v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->isWiFiEnabledInBackground:Z

    .line 193
    invoke-static/range {p1 .. p3}, Lcom/shopkick/sdk/sensor/SensorManager;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 197
    iget-object v2, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v3, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->dwellRunnable:Ljava/lang/Runnable;

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x7530

    const-wide/16 v6, 0x7530

    invoke-interface/range {v2 .. v8}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 199
    iget-object v9, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v10, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->exitRunnable:Ljava/lang/Runnable;

    sget-object v15, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v11, 0x7530

    const-wide/16 v13, 0x7530

    invoke-interface/range {v9 .. v15}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->dwellEventHandler(Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)Ljava/lang/Object;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorsUpdateLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/Map;
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getActionsForTrigger(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->resetStopScanningTimer()V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;ZI)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->updateTriggersForAction(Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;ZI)V

    return-void
.end method

.method private cancelStopScanningTimer()V
    .locals 3

    .line 538
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->stopScanningFuture:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    .line 539
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->stopScanningFutureLock:Ljava/lang/Object;

    monitor-enter v0

    .line 540
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->stopScanningFuture:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_0

    .line 541
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->stopScanningFuture:Ljava/util/concurrent/ScheduledFuture;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    const/4 v1, 0x0

    .line 542
    iput-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->stopScanningFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 544
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    return-void
.end method

.method private dwellEventHandler(Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;)V
    .locals 7

    .line 145
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getLastDwelled()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 146
    new-instance v0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    .line 147
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v2

    .line 148
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const/4 v5, 0x1

    .line 150
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getProximity()I

    move-result v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;-><init>(Lcom/shopkick/sdk/zone/Zone;JII)V

    .line 151
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setLastDwelled(J)V

    .line 152
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getListener()Lcom/shopkick/sdk/zone/ZoneProximityListener;

    move-result-object v1

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getProximity()I

    move-result p1

    invoke-interface {v1, p1, v0}, Lcom/shopkick/sdk/zone/ZoneProximityListener;->onDwelled(ILcom/shopkick/sdk/zone/ZoneReading;)V

    :cond_0
    return-void
.end method

.method private getActionsForTrigger(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;",
            ")",
            "Ljava/util/Map<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable;",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;",
            ">;>;"
        }
    .end annotation

    .line 636
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 639
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 640
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 641
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantIdToZone:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/ZoneParcelable;

    .line 642
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getActions()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;

    .line 643
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 644
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 645
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 654
    :cond_3
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 655
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 656
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    invoke-direct {p0, v1}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getActionsForTrigger(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method private getGeoFencesForTrigger(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/HashSet;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;",
            ")",
            "Ljava/util/HashSet<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_7

    const-string v0, "geo_radial"

    .line 362
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 365
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 368
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 370
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getActionsForTrigger(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 371
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;

    const-string v5, "detect"

    .line 372
    invoke-virtual {v4}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/16 v6, 0x64

    if-eqz v5, :cond_3

    .line 375
    iget-object v4, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    .line 376
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int v13, v7, v5

    if-lt v13, v6, :cond_2

    .line 378
    new-instance v5, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 379
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLatitude()Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    .line 380
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLongitude()Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    move-object v8, v5

    invoke-direct/range {v8 .. v13}, Lcom/shopkick/sdk/sensor/GeoFence;-><init>(DDI)V

    .line 378
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const-string v5, "enable"

    .line 384
    invoke-virtual {v4}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 387
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lt v4, v6, :cond_1

    .line 388
    new-instance v4, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 389
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLatitude()Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    .line 390
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLongitude()Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    .line 391
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v12

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/shopkick/sdk/sensor/GeoFence;-><init>(DDI)V

    .line 388
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_4
    return-object v0

    .line 365
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'trigger\' must be geo-fencable"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 363
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'trigger\' must be geo-radial"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 361
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'trigger\' can not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private getGeoFencesForZone(Lcom/shopkick/sdk/zone/Zone;I)Ljava/util/HashSet;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/sdk/zone/Zone;",
            "I)",
            "Ljava/util/HashSet<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation

    .line 404
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 407
    invoke-interface {p1}, Lcom/shopkick/sdk/zone/Zone;->getTriggers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    const-string v3, "geo_radial"

    .line 408
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 411
    invoke-direct {p0, v2}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getGeoFencesForTrigger(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 416
    :cond_1
    invoke-interface {p1}, Lcom/shopkick/sdk/zone/Zone;->getParentZoneId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const/16 v1, 0x64

    if-ge p2, v1, :cond_2

    .line 417
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantIdToZone:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1}, Lcom/shopkick/sdk/zone/Zone;->getParentZoneId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/zone/Zone;

    if-eqz p1, :cond_2

    add-int/lit8 p2, p2, 0x1

    .line 419
    invoke-direct {p0, p1, p2}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getGeoFencesForZone(Lcom/shopkick/sdk/zone/Zone;I)Ljava/util/HashSet;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    :cond_2
    return-object v0
.end method

.method private getOrOpenSensor(Ljava/lang/Class;)Lcom/shopkick/sdk/sensor/Sensor;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/shopkick/sdk/sensor/Sensor;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 471
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 472
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/sensor/Sensor;

    return-object p1

    .line 477
    :cond_0
    const-class v0, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 478
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->geoFenceReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    goto :goto_0

    .line 479
    :cond_1
    const-class v0, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 480
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->shopkickBeaconReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    goto :goto_0

    .line 481
    :cond_2
    const-class v0, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 482
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->locationServicesReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    goto :goto_0

    .line 483
    :cond_3
    const-class v0, Lcom/shopkick/sdk/sensor/WiFiSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 484
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->wifiScanReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 489
    :goto_0
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p0}, Lcom/shopkick/sdk/sensor/SensorManager;->open(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v0

    .line 490
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    const-class v1, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 494
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->setStopScanningTimer()V

    :cond_4
    return-object v0

    .line 486
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "Unsupported sensor type: %1$s"

    invoke-static {v1, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getSensorReference(Ljava/lang/Class;)Lcom/shopkick/sdk/sensor/Sensor;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/shopkick/sdk/sensor/Sensor;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 563
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 564
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "DefaultBackgroundZoneDetector.getSensorReference(%1$s) [%2$s]"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    .line 566
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    .line 567
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v6

    invoke-static {v6}, Lcom/shopkick/logging/DiagnosticLogger;->getStackTrace([Ljava/lang/StackTraceElement;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x1

    aput-object v6, v5, v8

    .line 563
    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 568
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToReferenceCountLock:Ljava/lang/Object;

    monitor-enter v0

    .line 569
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 570
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    :cond_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v1, v8

    .line 573
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 575
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    const-string v3, "DefaultBackgroundZoneDetector.getSensorReference(%1$s) New count:%2$d"

    new-array v4, v4, [Ljava/lang/Object;

    .line 577
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v4, v7

    .line 578
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v8

    .line 574
    invoke-virtual {v2, v5, v6, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 579
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 582
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getOrOpenSensor(Ljava/lang/Class;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 579
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private registerZoneInternal(Lcom/shopkick/sdk/zone/Zone;I)Z
    .locals 4

    .line 295
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 296
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 299
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v2, v1

    .line 302
    :cond_1
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, v1

    .line 303
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v2
.end method

.method private resetStopScanningTimer()V
    .locals 0

    .line 552
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->cancelStopScanningTimer()V

    .line 553
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->setStopScanningTimer()V

    return-void
.end method

.method private returnSensorReference(Ljava/lang/Class;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/shopkick/sdk/sensor/Sensor;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    .line 598
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToReferenceCountLock:Ljava/lang/Object;

    monitor-enter v0

    .line 599
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    .line 600
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lez v4, :cond_0

    .line 601
    iget-object v4, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    sub-int/2addr v5, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, p1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v5, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 603
    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    const-string v7, "DefaultBackgroundZoneDetector.returnSensorReference(%1$s) New count:%2$d"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    .line 605
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v2

    .line 606
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v9

    sub-int/2addr v9, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v8, v3

    .line 602
    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 608
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v5, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 609
    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    const-string v7, "DefaultBackgroundZoneDetector.returnSensorReference(%1$s): Sensor type reference counting is bad"

    new-array v8, v3, [Ljava/lang/Object;

    .line 611
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v2

    .line 608
    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 613
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    .line 614
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gt v0, v3, :cond_2

    .line 615
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/Sensor;

    if-eqz v0, :cond_1

    .line 617
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/sensor/Sensor;

    invoke-interface {p1}, Lcom/shopkick/sdk/sensor/Sensor;->close()V

    goto :goto_1

    .line 619
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 620
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v1, "DefaultBackgroundZoneDetector.returnSensorReference(%1$s): No sensor for reference count that just reached 0"

    new-array v3, v3, [Ljava/lang/Object;

    .line 622
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v2

    .line 619
    invoke-virtual {v0, v4, v5, v1, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void

    :catchall_0
    move-exception p1

    .line 613
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private setStopScanningTimer()V
    .locals 6

    .line 505
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->stopScanningFuture:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_1

    .line 506
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->stopScanningFutureLock:Ljava/lang/Object;

    monitor-enter v0

    .line 507
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->stopScanningFuture:Ljava/util/concurrent/ScheduledFuture;

    if-nez v1, :cond_0

    .line 509
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    const-class v2, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/sensor/Sensor;

    if-eqz v1, :cond_0

    .line 511
    check-cast v1, Lcom/shopkick/sdk/sensor/SensorBase;

    invoke-virtual {v1}, Lcom/shopkick/sdk/sensor/SensorBase;->getSensorImplementation()Lcom/shopkick/sdk/sensor/SensorImplementation;

    move-result-object v1

    .line 512
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v3, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$3;

    invoke-direct {v3, p0, v1}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$3;-><init>(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;Lcom/shopkick/sdk/sensor/SensorImplementation;)V

    const-wide/32 v4, 0x927c0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v3, v4, v5, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->stopScanningFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 530
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    return-void
.end method

.method private updateTriggersForAction(Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;ZI)V
    .locals 6

    const-string v0, "enable"

    .line 669
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/16 v0, 0x64

    if-le p3, v0, :cond_0

    .line 673
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide p2

    const-string v0, "Server sent cyclical zone-trigger-action hierarchy"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, p2, p3, v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 678
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getAppliesToTriggers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 679
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    const-string/jumbo v2, "shopkick_beacon"

    .line 681
    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz p2, :cond_2

    .line 686
    const-class v2, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    invoke-direct {p0, v2}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getSensorReference(Ljava/lang/Class;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    .line 689
    invoke-virtual {v2}, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;->getLastReading()Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 692
    iget-object v4, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->shopkickBeaconReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    invoke-interface {v4, v2, v3}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V

    goto :goto_1

    .line 696
    :cond_2
    const-class v2, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    invoke-direct {p0, v2}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->returnSensorReference(Ljava/lang/Class;)V

    goto :goto_1

    :cond_3
    const-string/jumbo v2, "ultrasonic"

    .line 699
    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    const-string v2, "geo_radial"

    .line 703
    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 710
    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ge v2, v0, :cond_6

    if-eqz p2, :cond_5

    .line 715
    const-class v2, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    invoke-direct {p0, v2}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getSensorReference(Ljava/lang/Class;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    .line 716
    sget-object v3, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->HIGH:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    invoke-virtual {v2, v3}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->setPowerAndAccuracyProfile(Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;)V

    .line 719
    invoke-virtual {v2}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->getLastReading()Lcom/shopkick/sdk/sensor/LocationServicesReading;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 721
    iget-object v4, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->locationServicesReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    invoke-interface {v4, v2, v3}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V

    goto :goto_1

    .line 725
    :cond_5
    const-class v2, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    invoke-direct {p0, v2}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->returnSensorReference(Ljava/lang/Class;)V

    :cond_6
    :goto_1
    const-string/jumbo v2, "wifi"

    .line 729
    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    if-eqz p2, :cond_7

    .line 732
    iget-boolean v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->isWiFiEnabledInBackground:Z

    if-eqz v1, :cond_7

    .line 734
    const-class v1, Lcom/shopkick/sdk/sensor/WiFiSensor;

    invoke-direct {p0, v1}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getSensorReference(Ljava/lang/Class;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/sensor/WiFiSensor;

    .line 737
    invoke-virtual {v1}, Lcom/shopkick/sdk/sensor/WiFiSensor;->getLastReading()Lcom/shopkick/sdk/sensor/WiFiScanReading;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 740
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->wifiScanReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    invoke-interface {v3, v1, v2}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V

    goto/16 :goto_0

    .line 743
    :cond_7
    const-class v1, Lcom/shopkick/sdk/sensor/WiFiSensor;

    invoke-direct {p0, v1}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->returnSensorReference(Ljava/lang/Class;)V

    goto/16 :goto_0

    :cond_8
    const-string v2, "composite"

    .line 746
    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 749
    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 750
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    .line 751
    invoke-direct {p0, v2}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getActionsForTrigger(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 752
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;

    add-int/lit8 v5, p3, 0x1

    .line 753
    invoke-direct {p0, v4, p2, p3}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->updateTriggersForAction(Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;ZI)V

    move p3, v5

    goto :goto_2

    :cond_b
    return-void

    .line 670
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'action\' must be of \'enable\' type"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private updateZoneBasedGeoFences()V
    .locals 6

    .line 432
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorsUpdateLock:Ljava/lang/Object;

    monitor-enter v0

    .line 437
    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 438
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/sdk/zone/Zone;

    const/4 v4, 0x0

    .line 439
    invoke-direct {p0, v3, v4}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getGeoFencesForZone(Lcom/shopkick/sdk/zone/Zone;I)Ljava/util/HashSet;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 443
    :cond_0
    const-class v2, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    invoke-direct {p0, v2}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getOrOpenSensor(Ljava/lang/Class;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    .line 444
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 445
    iget-object v5, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->explicitGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 446
    invoke-virtual {v2, v4}, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->addGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    goto :goto_1

    .line 451
    :cond_2
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->explicitGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentSkipListSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 452
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 453
    invoke-virtual {v2, v4}, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->removeGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    goto :goto_2

    .line 458
    :cond_4
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->explicitGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentSkipListSet;->clear()V

    .line 459
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->explicitGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->addAll(Ljava/util/Collection;)Z

    .line 460
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 346
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 347
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/sensor/Sensor;

    .line 348
    invoke-interface {v1}, Lcom/shopkick/sdk/sensor/Sensor;->close()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onErrorReceived(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/SensorStatusError;)V
    .locals 0

    return-void
.end method

.method public onStatusChanged(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Status;)V
    .locals 0

    return-void
.end method

.method public registerZone(Lcom/shopkick/sdk/zone/Zone;I)V
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCountLock:Ljava/lang/Object;

    monitor-enter v0

    .line 255
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->registerZoneInternal(Lcom/shopkick/sdk/zone/Zone;I)Z

    move-result p1

    .line 256
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 258
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->updateZoneBasedGeoFences()V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 256
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public registerZones(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/AbstractMap$SimpleEntry<",
            "Lcom/shopkick/sdk/zone/Zone;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    .line 266
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCountLock:Ljava/lang/Object;

    monitor-enter v0

    .line 267
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/AbstractMap$SimpleEntry;

    .line 268
    invoke-virtual {v3}, Ljava/util/AbstractMap$SimpleEntry;->getKey()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/util/AbstractMap$SimpleEntry;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 269
    invoke-virtual {v3}, Ljava/util/AbstractMap$SimpleEntry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/zone/Zone;

    invoke-virtual {v3}, Ljava/util/AbstractMap$SimpleEntry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {p0, v4, v3}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->registerZoneInternal(Lcom/shopkick/sdk/zone/Zone;I)Z

    move-result v3

    if-nez v3, :cond_2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 v2, 0x1

    goto :goto_0

    .line 272
    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_4

    .line 274
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->updateZoneBasedGeoFences()V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    .line 272
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public setRelevantZones(Ljava/util/Collection;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable;",
            ">;)V"
        }
    .end annotation

    .line 211
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantIdToZone:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 212
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 213
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 214
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 217
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/zone/ZoneParcelable;

    .line 218
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantIdToZone:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getZoneId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getTriggers()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    .line 222
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "composite"

    .line 224
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 225
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggers()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 226
    iget-object v5, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 227
    iget-object v5, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v6, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    invoke-virtual {v5, v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    :cond_2
    iget-object v5, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 235
    :cond_3
    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getActions()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;

    .line 236
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 237
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    :cond_4
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getZoneId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    return-void
.end method

.method public setZoneEventsListener(Lcom/shopkick/sdk/zone/ZoneEventsListener;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    return-void
.end method

.method public unregisterZone(Lcom/shopkick/sdk/zone/Zone;)V
    .locals 2

    .line 337
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCountLock:Ljava/lang/Object;

    monitor-enter v0

    .line 338
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 339
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 340
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->updateZoneBasedGeoFences()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 339
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public unregisterZone(Lcom/shopkick/sdk/zone/Zone;I)V
    .locals 6

    .line 312
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCountLock:Ljava/lang/Object;

    monitor-enter v0

    .line 314
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    .line 315
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 318
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sub-int/2addr v1, v2

    .line 319
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-gtz v1, :cond_0

    .line 322
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    iget-object p2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result p2

    if-gtz p2, :cond_1

    .line 325
    iget-object p2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 329
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    .line 330
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->updateZoneBasedGeoFences()V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 329
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
