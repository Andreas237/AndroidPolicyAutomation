.class public Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;
.super Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;
.source "DefaultForegroundZoneDetector.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/StatusListener;


# static fields
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

.field private final isWiFiEnabledInForeground:Z

.field private final isWiFiEnabledWithoutGeofencing:Z

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

.field private final wifiScanReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;Lcom/shopkick/sdk/zone/ZoneStateManager;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/sdk/zone/ZoneManager;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    .line 179
    invoke-direct {v0, v3, v1, v2}, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;-><init>(Lcom/shopkick/sdk/zone/ZoneManager;Lcom/shopkick/sdk/zone/ZoneStateManager;Lcom/shopkick/fetchers/api/APIManager;)V

    const/4 v1, 0x1

    .line 70
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    .line 71
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToReferenceCountLock:Ljava/lang/Object;

    .line 72
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorsUpdateLock:Ljava/lang/Object;

    .line 74
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    .line 77
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantIdToZone:Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;

    .line 87
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

    .line 94
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

    .line 102
    new-instance v1, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->explicitGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 115
    new-instance v1, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$1;

    invoke-direct {v1, v0}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$1;-><init>(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;)V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->dwellRunnable:Ljava/lang/Runnable;

    .line 147
    new-instance v1, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$2;

    invoke-direct {v1, v0}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$2;-><init>(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;)V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->exitRunnable:Ljava/lang/Runnable;

    .line 640
    new-instance v1, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;

    invoke-direct {v1, v0}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;-><init>(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;)V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->geoFenceReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 776
    new-instance v1, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$4;

    invoke-direct {v1, v0}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$4;-><init>(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;)V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->shopkickBeaconReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 833
    new-instance v1, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$5;

    invoke-direct {v1, v0}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$5;-><init>(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;)V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->locationServicesReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 940
    new-instance v1, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$6;

    invoke-direct {v1, v0}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$6;-><init>(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;)V

    iput-object v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->wifiScanReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 181
    invoke-interface/range {p3 .. p3}, Lcom/shopkick/sdk/core/ConfigurationProvider;->isWiFiEnabledInForeground()Z

    move-result v1

    iput-boolean v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->isWiFiEnabledInForeground:Z

    .line 182
    invoke-interface/range {p3 .. p3}, Lcom/shopkick/sdk/core/ConfigurationProvider;->isWiFiScanningEnabledWithoutGeofencing()Z

    move-result v1

    iput-boolean v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->isWiFiEnabledWithoutGeofencing:Z

    .line 184
    invoke-static/range {p1 .. p3}, Lcom/shopkick/sdk/sensor/SensorManager;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 186
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v1

    const-class v2, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    iget-object v3, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->geoFenceReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    invoke-virtual {v1, v2, v3, v0}, Lcom/shopkick/sdk/sensor/SensorManager;->open(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v1

    .line 187
    iget-object v2, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    const-class v3, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v1

    const-class v2, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    iget-object v3, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->shopkickBeaconReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    invoke-virtual {v1, v2, v3, v0}, Lcom/shopkick/sdk/sensor/SensorManager;->open(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v1

    .line 191
    iget-object v2, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    const-class v3, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v1

    const-class v2, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    iget-object v3, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->locationServicesReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    invoke-virtual {v1, v2, v3, v0}, Lcom/shopkick/sdk/sensor/SensorManager;->open(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v1

    .line 195
    iget-object v2, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    const-class v3, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    iget-boolean v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->isWiFiEnabledInForeground:Z

    if-eqz v1, :cond_0

    iget-boolean v1, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->isWiFiEnabledWithoutGeofencing:Z

    if-eqz v1, :cond_0

    .line 199
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v1

    const-class v2, Lcom/shopkick/sdk/sensor/WiFiSensor;

    iget-object v3, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->wifiScanReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    invoke-virtual {v1, v2, v3, v0}, Lcom/shopkick/sdk/sensor/SensorManager;->open(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v1

    .line 201
    iget-object v2, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    const-class v3, Lcom/shopkick/sdk/sensor/WiFiSensor;

    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    :cond_0
    iget-object v4, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v5, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->dwellRunnable:Ljava/lang/Runnable;

    const-wide/16 v6, 0x7530

    const-wide/16 v8, 0x7530

    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v4 .. v10}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 208
    iget-object v11, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v12, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->exitRunnable:Ljava/lang/Runnable;

    const-wide/16 v13, 0x7530

    const-wide/16 v15, 0x7530

    sget-object v17, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v11 .. v17}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->dwellEventHandler(Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;)Ljava/lang/Object;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorsUpdateLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/Map;
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->getActionsForTrigger(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;ZI)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->updateTriggersForAction(Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;ZI)V

    return-void
.end method

.method private dwellEventHandler(Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;)V
    .locals 7

    .line 135
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getLastDwelled()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 136
    new-instance v0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    .line 137
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v2

    .line 138
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const/4 v5, 0x1

    .line 140
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getProximity()I

    move-result v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;-><init>(Lcom/shopkick/sdk/zone/Zone;JII)V

    .line 141
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setLastDwelled(J)V

    .line 142
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

    .line 450
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 453
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 454
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

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

    .line 455
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantIdToZone:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/ZoneParcelable;

    .line 456
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

    .line 457
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 458
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 459
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 468
    :cond_3
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 469
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

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

    .line 470
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    invoke-direct {p0, v1}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->getActionsForTrigger(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method private getGeoFencesForTrigger(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/HashSet;
    .locals 13
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

    if-eqz p1, :cond_6

    const-string v0, "geo_radial"

    .line 413
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 416
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 419
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 421
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->getActionsForTrigger(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 422
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;

    const-string v5, "detect"

    .line 423
    invoke-virtual {v4}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 426
    iget-object v4, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

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
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    .line 427
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int v12, v6, v5

    const/16 v5, 0x64

    if-lt v12, v5, :cond_2

    .line 429
    new-instance v5, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 430
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLatitude()Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    .line 431
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLongitude()Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    move-object v7, v5

    invoke-direct/range {v7 .. v12}, Lcom/shopkick/sdk/sensor/GeoFence;-><init>(DDI)V

    .line 429
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0

    .line 416
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'trigger\' must be geo-fencable"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 414
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'trigger\' must be geo-radial"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 412
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'trigger\' can not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
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

    .line 530
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 531
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/sensor/Sensor;

    return-object p1

    .line 536
    :cond_0
    const-class v0, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 537
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->geoFenceReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    goto :goto_0

    .line 538
    :cond_1
    const-class v0, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 539
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->shopkickBeaconReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    goto :goto_0

    .line 540
    :cond_2
    const-class v0, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 541
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->locationServicesReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    goto :goto_0

    .line 542
    :cond_3
    const-class v0, Lcom/shopkick/sdk/sensor/WiFiSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 543
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->wifiScanReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 548
    :goto_0
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p0}, Lcom/shopkick/sdk/sensor/SensorManager;->open(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v0

    .line 549
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    .line 545
    :cond_4
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

    .line 571
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 572
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "DefaultBackgroundZoneDetector.getSensorReference(%1$s) [%2$s]"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    .line 574
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    .line 575
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v6

    invoke-static {v6}, Lcom/shopkick/logging/DiagnosticLogger;->getStackTrace([Ljava/lang/StackTraceElement;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x1

    aput-object v6, v5, v8

    .line 571
    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 576
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToReferenceCountLock:Ljava/lang/Object;

    monitor-enter v0

    .line 577
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 578
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    :cond_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v1, v8

    .line 581
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 582
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 583
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    const-string v3, "DefaultBackgroundZoneDetector.getSensorReference(%1$s) New count:%2$d"

    new-array v4, v4, [Ljava/lang/Object;

    .line 585
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v4, v7

    .line 586
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v8

    .line 582
    invoke-virtual {v2, v5, v6, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 587
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 590
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->getOrOpenSensor(Ljava/lang/Class;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 587
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private registerZoneInternal(Lcom/shopkick/sdk/zone/Zone;I)Z
    .locals 4

    .line 303
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 304
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

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

    .line 307
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v2, v1

    .line 310
    :cond_1
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

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

    .line 311
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

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

    .line 490
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToReferenceCountLock:Ljava/lang/Object;

    monitor-enter v0

    .line 491
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    .line 492
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lez v4, :cond_0

    .line 493
    iget-object v4, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToReferenceCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    sub-int/2addr v5, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, p1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v5, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 495
    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    const-string v7, "DefaultBackgroundZoneDetector.returnSensorReference(%1$s) New count:%2$d"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    .line 497
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v2

    .line 498
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v9

    sub-int/2addr v9, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v8, v3

    .line 494
    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 500
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v5, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 501
    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    const-string v7, "DefaultBackgroundZoneDetector.returnSensorReference(%1$s): Sensor type reference counting is bad"

    new-array v8, v3, [Ljava/lang/Object;

    .line 503
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v2

    .line 500
    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 505
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    .line 506
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gt v0, v3, :cond_2

    .line 507
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/Sensor;

    if-eqz v0, :cond_1

    .line 509
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/sensor/Sensor;

    invoke-interface {p1}, Lcom/shopkick/sdk/sensor/Sensor;->close()V

    goto :goto_1

    .line 511
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 512
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v1, "DefaultBackgroundZoneDetector.returnSensorReference(%1$s): No sensor for reference count that just reached 0"

    new-array v3, v3, [Ljava/lang/Object;

    .line 514
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v2

    .line 511
    invoke-virtual {v0, v4, v5, v1, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void

    :catchall_0
    move-exception p1

    .line 505
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private updateTriggersForAction(Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;ZI)V
    .locals 2

    const-string v0, "enable"

    .line 600
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x64

    if-le p3, v0, :cond_0

    .line 604
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

    .line 609
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getAppliesToTriggers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    .line 610
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    if-eqz p3, :cond_1

    const-string/jumbo v0, "wifi"

    .line 612
    invoke-virtual {p3}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    if-eqz p2, :cond_2

    .line 615
    iget-boolean p3, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->isWiFiEnabledInForeground:Z

    if-eqz p3, :cond_2

    .line 617
    const-class p3, Lcom/shopkick/sdk/sensor/WiFiSensor;

    invoke-direct {p0, p3}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->getSensorReference(Ljava/lang/Class;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object p3

    check-cast p3, Lcom/shopkick/sdk/sensor/WiFiSensor;

    .line 620
    invoke-virtual {p3}, Lcom/shopkick/sdk/sensor/WiFiSensor;->getLastReading()Lcom/shopkick/sdk/sensor/WiFiScanReading;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 623
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->wifiScanReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    invoke-interface {v1, p3, v0}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V

    goto :goto_0

    .line 626
    :cond_2
    const-class p3, Lcom/shopkick/sdk/sensor/WiFiSensor;

    invoke-direct {p0, p3}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->returnSensorReference(Ljava/lang/Class;)V

    goto :goto_0

    :cond_3
    return-void

    .line 601
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'action\' must be of \'enable\' type"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private updateZoneBasedGeoFences()V
    .locals 7

    .line 357
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorsUpdateLock:Ljava/lang/Object;

    monitor-enter v0

    .line 362
    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 363
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/sdk/zone/Zone;

    .line 364
    invoke-interface {v3}, Lcom/shopkick/sdk/zone/Zone;->getTriggers()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    const-string v5, "geo_radial"

    .line 365
    invoke-virtual {v4}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 368
    invoke-direct {p0, v4}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->getGeoFencesForTrigger(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 374
    :cond_2
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

    const-class v3, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    .line 375
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 376
    iget-object v5, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->explicitGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 377
    invoke-virtual {v2, v4}, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->addGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    goto :goto_1

    .line 382
    :cond_4
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->explicitGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentSkipListSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 383
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 384
    invoke-virtual {v2, v4}, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->removeGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    goto :goto_2

    .line 389
    :cond_6
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->explicitGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentSkipListSet;->clear()V

    .line 390
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->explicitGeoFences:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->addAll(Ljava/util/Collection;)Z

    .line 391
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

    .line 397
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 398
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->sensorTypeToSensor:Ljava/util/concurrent/ConcurrentHashMap;

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

    .line 399
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

    .line 262
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCountLock:Ljava/lang/Object;

    monitor-enter v0

    .line 263
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->registerZoneInternal(Lcom/shopkick/sdk/zone/Zone;I)Z

    move-result p1

    .line 264
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 266
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->updateZoneBasedGeoFences()V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 264
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

    .line 274
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCountLock:Ljava/lang/Object;

    monitor-enter v0

    .line 275
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

    .line 276
    invoke-virtual {v3}, Ljava/util/AbstractMap$SimpleEntry;->getKey()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/util/AbstractMap$SimpleEntry;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 277
    invoke-virtual {v3}, Ljava/util/AbstractMap$SimpleEntry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/zone/Zone;

    invoke-virtual {v3}, Ljava/util/AbstractMap$SimpleEntry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {p0, v4, v3}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->registerZoneInternal(Lcom/shopkick/sdk/zone/Zone;I)Z

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

    .line 280
    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_4

    .line 282
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->updateZoneBasedGeoFences()V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    .line 280
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

    .line 219
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantIdToZone:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 220
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 221
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 222
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 225
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/zone/ZoneParcelable;

    .line 226
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantIdToZone:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getZoneId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
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

    .line 230
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantIdToTrigger:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "composite"

    .line 232
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 233
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

    .line 234
    iget-object v5, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 235
    iget-object v5, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v6, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    invoke-virtual {v5, v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    :cond_2
    iget-object v5, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToCompositeTriggerIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 243
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

    .line 244
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 245
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    :cond_4
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->relevantTriggerIdToActionsZoneIds:Ljava/util/concurrent/ConcurrentHashMap;

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

    .line 255
    iput-object p1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    return-void
.end method

.method public unregisterZone(Lcom/shopkick/sdk/zone/Zone;)V
    .locals 2

    .line 345
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCountLock:Ljava/lang/Object;

    monitor-enter v0

    .line 346
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 347
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 348
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->updateZoneBasedGeoFences()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 347
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public unregisterZone(Lcom/shopkick/sdk/zone/Zone;I)V
    .locals 6

    .line 320
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCountLock:Ljava/lang/Object;

    monitor-enter v0

    .line 322
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    .line 323
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 326
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

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

    .line 327
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-gtz v1, :cond_0

    .line 330
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    iget-object p2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result p2

    if-gtz p2, :cond_1

    .line 333
    iget-object p2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 337
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    .line 338
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->updateZoneBasedGeoFences()V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 337
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
