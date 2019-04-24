.class public Lcom/shopkick/app/location/StoreNearbyNotifier;
.super Ljava/lang/Object;
.source "StoreNearbyNotifier.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;
    }
.end annotation


# static fields
.field private static final HIGH_ACCURACY_CUTOFF:Ljava/lang/Double;

.field private static volatile LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor; = null

.field private static final LocationSensorLock:Ljava/lang/Object;

.field private static final MAX_LOCATION_TIMESTAMP_TIME:Ljava/lang/Double;

.field private static final MAX_NEARBY_CHECKIN_LOCATIONS_VALID_TIME:J = 0x493e0L

.field private static final MIN_CONFIDENCE_VALUE_FOR_WALKIN:Ljava/lang/Double;

.field private static final NEARBY_CHECKIN_LOCATIONS_TIMEOUT:J = 0xbb8L


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private checkinLocationsRequestsList:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;",
            ">;"
        }
    .end annotation
.end field

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private fabRequestingHighAccuracyLocationReadings:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private gpsRequestingHighAccuracyLocationReadings:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private handler:Landroid/os/Handler;

.field public final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private mainHandler:Landroid/os/Handler;

.field private nearbyCheckinLocations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;",
            ">;"
        }
    .end annotation
.end field

.field private nearbyCheckinLocationsWaitObject:Ljava/lang/Object;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private timeLastUpdatedNearbyCheckinLocations:Ljava/lang/Long;

.field private walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;",
            "Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;",
            ">;"
        }
    .end annotation
.end field

.field private walkinAreaMapLock:Ljava/lang/Object;

.field private walkinController:Lcom/shopkick/app/presence/WalkinController;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x41224f8000000000L    # 600000.0

    .line 295
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/location/StoreNearbyNotifier;->MAX_LOCATION_TIMESTAMP_TIME:Ljava/lang/Double;

    const-wide/high16 v0, 0x4020000000000000L    # 8.0

    .line 300
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/location/StoreNearbyNotifier;->MIN_CONFIDENCE_VALUE_FOR_WALKIN:Ljava/lang/Double;

    const-wide/high16 v0, 0x4014000000000000L    # 5.0

    .line 306
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/location/StoreNearbyNotifier;->HIGH_ACCURACY_CUTOFF:Ljava/lang/Double;

    .line 338
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/app/location/StoreNearbyNotifier;->LocationSensorLock:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 343
    sput-object v0, Lcom/shopkick/app/location/StoreNearbyNotifier;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/presence/WalkinController;)V
    .locals 2

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->nearbyCheckinLocationsWaitObject:Ljava/lang/Object;

    .line 64
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->checkinLocationsRequestsList:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 67
    new-instance v0, Lcom/shopkick/app/location/StoreNearbyNotifier$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/location/StoreNearbyNotifier$1;-><init>(Lcom/shopkick/app/location/StoreNearbyNotifier;)V

    iput-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 312
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 317
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMapLock:Ljava/lang/Object;

    .line 322
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->gpsRequestingHighAccuracyLocationReadings:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 327
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->fabRequestingHighAccuracyLocationReadings:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 333
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->mainHandler:Landroid/os/Handler;

    .line 79
    iput-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 80
    iput-object p2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 81
    iput-object p3, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 82
    iput-object p4, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 83
    iput-object p5, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    .line 85
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/presence/LocationManager;->addLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "AppActivityManagerSessionStartEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 87
    iget-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "AppActivityManagerSessionEndEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 89
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/location/StoreNearbyNotifier;)Lcom/shopkick/fetchers/api/APIManager;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/location/StoreNearbyNotifier;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->fetchNearbyCheckinLocations()V

    return-void
.end method

.method private calculateConfidenceValueForWalkinAreaFromLocation(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;Landroid/location/Location;)D
    .locals 6

    .line 588
    invoke-virtual {p2}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v0, v0

    sget-object v2, Lcom/shopkick/app/location/StoreNearbyNotifier;->HIGH_ACCURACY_CUTOFF:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    goto :goto_0

    .line 590
    :cond_0
    invoke-virtual {p2}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v0, v0

    sget-object v2, Lcom/shopkick/app/location/StoreNearbyNotifier;->HIGH_ACCURACY_CUTOFF:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    invoke-virtual {p2}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->loiterRadius:Ljava/lang/Integer;

    .line 591
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-float p1, p1

    cmpg-float p1, v0, p1

    if-gtz p1, :cond_1

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    goto :goto_0

    :cond_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 596
    :goto_0
    invoke-virtual {p2}, Landroid/location/Location;->getTime()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    .line 597
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 598
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-double v2, v2

    sget-object v4, Lcom/shopkick/app/location/StoreNearbyNotifier;->MAX_LOCATION_TIMESTAMP_TIME:Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    cmpg-double v2, v2, v4

    if-gtz v2, :cond_2

    .line 599
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    long-to-double p1, p1

    sget-object v4, Lcom/shopkick/app/location/StoreNearbyNotifier;->MAX_LOCATION_TIMESTAMP_TIME:Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    sub-double/2addr p1, v4

    sub-double/2addr v2, p1

    sget-object p1, Lcom/shopkick/app/location/StoreNearbyNotifier;->MAX_LOCATION_TIMESTAMP_TIME:Ljava/lang/Double;

    .line 600
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    div-double/2addr v2, p1

    add-double/2addr v0, v2

    :cond_2
    return-wide v0
.end method

.method private calculateConfidenceValuesForWalkinAreas()V
    .locals 7

    .line 482
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 483
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    .line 484
    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    .line 485
    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getLocationReadingHistory()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 487
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_1

    .line 488
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    .line 489
    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 490
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "CHECKIN: StoreNearbyNotifier: location reading history empty"

    new-array v6, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 493
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->nearbyCheckinLocations:Ljava/util/List;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_3

    .line 494
    :cond_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    .line 495
    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 496
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "CHECKIN: StoreNearbyNotifier: nearby checkin locations empty"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4, v5, v1}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 500
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/Location;

    .line 501
    invoke-direct {p0, v1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->getWalkinAreasForLocation(Landroid/location/Location;)Ljava/util/ArrayList;

    move-result-object v2

    .line 502
    invoke-direct {p0, v2, v1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->updateConfidenceValuesForLocationInWalkinArea(Ljava/util/ArrayList;Landroid/location/Location;)V

    .line 503
    invoke-direct {p0, v2}, Lcom/shopkick/app/location/StoreNearbyNotifier;->updateConfidenceValuesForLocationNotInWalkinArea(Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method private checkConfidenceValuesForWalkin(Landroid/location/Location;)V
    .locals 11

    .line 625
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 626
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 627
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 628
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "CHECKIN: StoreNearbyNotifier: walkin areas empty"

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x0

    .line 633
    iget-object v2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    .line 634
    iget-object v4, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;

    .line 636
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v5

    .line 637
    invoke-virtual {v5}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v6, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 638
    invoke-virtual {v6}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    sget-object v8, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v8}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v8

    or-long/2addr v6, v8

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "CHECKIN: StoreNearbyNotifier: walkin area with chain id: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v3, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->chainId:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ", location id: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v3, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->locationId:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ", confidence value: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    invoke-static {v4}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->access$300(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;)D

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v9, v1, [Ljava/lang/Object;

    .line 638
    invoke-virtual {v5, v6, v7, v8, v9}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 643
    invoke-static {v4}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->access$300(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;)D

    move-result-wide v5

    sget-object v7, Lcom/shopkick/app/location/StoreNearbyNotifier;->MIN_CONFIDENCE_VALUE_FOR_WALKIN:Ljava/lang/Double;

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    cmpl-double v5, v5, v7

    if-ltz v5, :cond_2

    if-nez v0, :cond_3

    goto :goto_1

    .line 646
    :cond_3
    invoke-static {v4}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->access$300(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;)D

    move-result-wide v5

    iget-object v7, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 647
    invoke-virtual {v7, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;

    invoke-static {v7}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->access$300(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;)D

    move-result-wide v7

    cmpl-double v5, v5, v7

    if-lez v5, :cond_4

    goto :goto_1

    .line 649
    :cond_4
    invoke-static {v4}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->access$300(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;)D

    move-result-wide v4

    iget-object v6, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 650
    invoke-virtual {v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;

    invoke-static {v6}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->access$300(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;)D

    move-result-wide v6

    cmpl-double v4, v4, v6

    if-nez v4, :cond_2

    .line 651
    invoke-direct {p0, v3, p1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->getDistanceBetweenLocationAndWalkinArea(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;Landroid/location/Location;)F

    move-result v4

    .line 652
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->getDistanceBetweenLocationAndWalkinArea(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;Landroid/location/Location;)F

    move-result v5

    cmpl-float v4, v4, v5

    if-lez v4, :cond_2

    :goto_1
    move-object v0, v3

    goto/16 :goto_0

    :cond_5
    if-eqz v0, :cond_6

    .line 658
    iget-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 659
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;

    invoke-static {p1}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->access$200(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;)Landroid/location/Location;

    move-result-object p1

    .line 658
    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->triggerWalkin(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;Landroid/location/Location;)V

    goto :goto_2

    .line 660
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    invoke-virtual {p1}, Lcom/shopkick/app/presence/WalkinController;->isManualWalkin()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 661
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 662
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 663
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v0, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v0, "CHECKIN: StoreNearbyNotifier: No checkin location has high enough confidence value"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    :goto_2
    return-void
.end method

.method private checkRadiiForGPSCheckin(Landroid/location/Location;)V
    .locals 8

    if-nez p1, :cond_0

    return-void

    .line 194
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/WalkinController;->isManualWalkin()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isAutomaticWalkinsDisabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 195
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 196
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 197
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v0, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v0, "CHECKIN: StoreNearbyNotifier: checkRadiiForGPSCheckin() from automatic when manual only enabled"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 202
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 203
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 204
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "CHECKIN: StoreNearbyNotifier: attempting %s walkin"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    .line 207
    invoke-virtual {v7}, Lcom/shopkick/app/presence/WalkinController;->isManualWalkin()Z

    move-result v7

    if-eqz v7, :cond_2

    const-string v7, "manual"

    goto :goto_0

    :cond_2
    const-string v7, "automatic"

    :goto_0
    aput-object v7, v6, v1

    .line 205
    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v1, v1, [Ljava/lang/Object;

    .line 204
    invoke-virtual {v0, v2, v3, v4, v1}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 208
    invoke-direct {p0, p1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->onNewLocationReading(Landroid/location/Location;)V

    return-void
.end method

.method private fabStartRequestingHighAccuracyLocationReadings()V
    .locals 3

    .line 397
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->fabRequestingHighAccuracyLocationReadings:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->gpsRequestingHighAccuracyLocationReadings:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 398
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 399
    invoke-direct {p0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->startRequestingHighAccuracyLocationReadings()V

    :cond_0
    return-void
.end method

.method private fetchNearbyCheckinLocations()V
    .locals 6

    .line 128
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    .line 129
    iget-object v1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableGpsCheckins:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 130
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;-><init>()V

    const/4 v2, 0x2

    .line 131
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;->checkinType:Ljava/lang/Integer;

    .line 132
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;->latitude:Ljava/lang/Double;

    .line 133
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;->longitude:Ljava/lang/Double;

    .line 134
    iget-object v2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->getAdd()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;->add:Ljava/lang/String;

    .line 135
    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;->accuracy:Ljava/lang/Double;

    .line 136
    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;->coordTimestamp:Ljava/lang/Long;

    .line 138
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 139
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 140
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "CHECKIN: StoreNearbyNotifier: fetchNearbyCheckinLocations() make request"

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->checkinLocationsRequestsList:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->mainHandler:Landroid/os/Handler;

    new-instance v2, Lcom/shopkick/app/location/StoreNearbyNotifier$2;

    invoke-direct {v2, p0, v1}, Lcom/shopkick/app/location/StoreNearbyNotifier$2;-><init>(Lcom/shopkick/app/location/StoreNearbyNotifier;Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private getDistanceBetweenLocationAndWalkinArea(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;Landroid/location/Location;)F
    .locals 10

    const/4 v0, 0x1

    .line 536
    new-array v0, v0, [F

    .line 537
    invoke-virtual {p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    .line 538
    invoke-virtual {p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->latitude:Ljava/lang/Double;

    .line 539
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->longitude:Ljava/lang/Double;

    .line 540
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    move-object v9, v0

    .line 537
    invoke-static/range {v1 .. v9}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    const/4 p1, 0x0

    .line 542
    aget p1, v0, p1

    return p1
.end method

.method private getWalkinAreasForLocation(Landroid/location/Location;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;",
            ">;"
        }
    .end annotation

    .line 515
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 516
    iget-object v1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->nearbyCheckinLocations:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    .line 517
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->loiterRadius:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-double v3, v3

    .line 518
    invoke-direct {p0, v2, p1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->getDistanceBetweenLocationAndWalkinArea(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;Landroid/location/Location;)F

    move-result v5

    float-to-double v5, v5

    cmpg-double v3, v5, v3

    if-gtz v3, :cond_0

    .line 520
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private gpsStartRequestingHighAccuracyLocationReadings()V
    .locals 3

    .line 387
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->gpsRequestingHighAccuracyLocationReadings:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->fabRequestingHighAccuracyLocationReadings:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 388
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 389
    invoke-direct {p0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->startRequestingHighAccuracyLocationReadings()V

    :cond_0
    return-void
.end method

.method private gpsStopRequestingHighAccuracyLocationReadings()V
    .locals 3

    .line 443
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->gpsRequestingHighAccuracyLocationReadings:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->fabRequestingHighAccuracyLocationReadings:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 444
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 445
    invoke-direct {p0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->stopRequestingHighAccuracyLocationReadings()V

    :cond_0
    return-void
.end method

.method private isLocationWithinTrackingRadius(Landroid/location/Location;)Z
    .locals 8

    .line 372
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->loiterRadiusMultiplierForTracking:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    .line 373
    iget-object v2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->nearbyCheckinLocations:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    .line 374
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->loiterRadius:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-double v4, v4

    mul-double/2addr v4, v0

    .line 375
    invoke-direct {p0, v3, p1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->getDistanceBetweenLocationAndWalkinArea(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;Landroid/location/Location;)F

    move-result v3

    float-to-double v6, v3

    cmpg-double v3, v6, v4

    if-gtz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic lambda$triggerWalkin$19(Lcom/shopkick/app/location/StoreNearbyNotifier;Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;)V
    .locals 6

    .line 702
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->chainId:Ljava/lang/String;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->locationId:Ljava/lang/String;

    const/4 v4, 0x2

    move-object v1, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/presence/WalkinController;->issueWalkinRequest(Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;Ljava/lang/String;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/CheckinLocation;)V

    return-void
.end method

.method private onNewLocationReading(Landroid/location/Location;)V
    .locals 1

    .line 352
    invoke-direct {p0, p1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->isLocationWithinTrackingRadius(Landroid/location/Location;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 354
    invoke-direct {p0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->gpsStartRequestingHighAccuracyLocationReadings()V

    goto :goto_0

    .line 356
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->gpsStopRequestingHighAccuracyLocationReadings()V

    .line 358
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMapLock:Ljava/lang/Object;

    monitor-enter v0

    .line 359
    :try_start_0
    invoke-direct {p0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->calculateConfidenceValuesForWalkinAreas()V

    .line 360
    invoke-direct {p0, p1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->checkConfidenceValuesForWalkin(Landroid/location/Location;)V

    .line 361
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private startRequestingHighAccuracyLocationReadings()V
    .locals 5

    .line 407
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 408
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 409
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "StoreNearbyNotifier: requesting high accuracy location readings"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 412
    sget-object v0, Lcom/shopkick/app/location/StoreNearbyNotifier;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    if-nez v0, :cond_1

    .line 413
    sget-object v0, Lcom/shopkick/app/location/StoreNearbyNotifier;->LocationSensorLock:Ljava/lang/Object;

    monitor-enter v0

    .line 414
    :try_start_0
    sget-object v1, Lcom/shopkick/app/location/StoreNearbyNotifier;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    if-nez v1, :cond_0

    .line 415
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v1

    .line 416
    invoke-virtual {v1}, Lcom/shopkick/sdk/SDKClient;->getSensorManager()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v1

    const-class v2, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    new-instance v3, Lcom/shopkick/app/location/StoreNearbyNotifier$4;

    invoke-direct {v3, p0}, Lcom/shopkick/app/location/StoreNearbyNotifier$4;-><init>(Lcom/shopkick/app/location/StoreNearbyNotifier;)V

    new-instance v4, Lcom/shopkick/app/location/StoreNearbyNotifier$5;

    invoke-direct {v4, p0}, Lcom/shopkick/app/location/StoreNearbyNotifier$5;-><init>(Lcom/shopkick/app/location/StoreNearbyNotifier;)V

    .line 417
    invoke-virtual {v1, v2, v3, v4}, Lcom/shopkick/sdk/sensor/SensorManager;->open(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    sput-object v1, Lcom/shopkick/app/location/StoreNearbyNotifier;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    .line 433
    sget-object v1, Lcom/shopkick/app/location/StoreNearbyNotifier;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    sget-object v2, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->HIGH:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    invoke-virtual {v1, v2}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->setPowerAndAccuracyProfile(Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;)V

    .line 435
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

.method private stopRequestingHighAccuracyLocationReadings()V
    .locals 5

    .line 463
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 464
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 465
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "CHECKIN: StoreNearbyNotifier: stopped requesting high accuracy location readings"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 468
    sget-object v0, Lcom/shopkick/app/location/StoreNearbyNotifier;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    if-eqz v0, :cond_1

    .line 469
    sget-object v0, Lcom/shopkick/app/location/StoreNearbyNotifier;->LocationSensorLock:Ljava/lang/Object;

    monitor-enter v0

    .line 470
    :try_start_0
    sget-object v1, Lcom/shopkick/app/location/StoreNearbyNotifier;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    if-eqz v1, :cond_0

    .line 471
    sget-object v1, Lcom/shopkick/app/location/StoreNearbyNotifier;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    invoke-virtual {v1}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->close()V

    const/4 v1, 0x0

    .line 472
    sput-object v1, Lcom/shopkick/app/location/StoreNearbyNotifier;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    .line 474
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

.method private updateConfidenceValuesForLocationInWalkinArea(Ljava/util/ArrayList;Landroid/location/Location;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;",
            ">;",
            "Landroid/location/Location;",
            ")V"
        }
    .end annotation

    .line 556
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    .line 557
    iget-object v1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const-wide/16 v2, 0x0

    if-nez v1, :cond_0

    .line 558
    iget-object v1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v4, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;

    invoke-direct {v4, p0, v2, v3, p2}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;-><init>(Lcom/shopkick/app/location/StoreNearbyNotifier;DLandroid/location/Location;)V

    invoke-virtual {v1, v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 560
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 561
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;

    invoke-static {v1}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->access$200(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;)Landroid/location/Location;

    move-result-object v1

    .line 560
    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->getDistanceBetweenLocationAndWalkinArea(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;Landroid/location/Location;)F

    move-result v1

    .line 562
    invoke-direct {p0, v0, p2}, Lcom/shopkick/app/location/StoreNearbyNotifier;->getDistanceBetweenLocationAndWalkinArea(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;Landroid/location/Location;)F

    move-result v4

    cmpg-float v1, v4, v1

    if-gez v1, :cond_1

    .line 564
    iget-object v1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;

    invoke-static {v1, p2}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->access$202(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;Landroid/location/Location;)Landroid/location/Location;

    .line 567
    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;

    .line 568
    invoke-direct {p0, v0, p2}, Lcom/shopkick/app/location/StoreNearbyNotifier;->calculateConfidenceValueForWalkinAreaFromLocation(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;Landroid/location/Location;)D

    move-result-wide v4

    .line 569
    invoke-static {v1}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->access$300(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;)D

    move-result-wide v6

    add-double/2addr v6, v4

    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->access$302(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;D)D

    goto :goto_0

    :cond_2
    return-void
.end method

.method private updateConfidenceValuesForLocationNotInWalkinArea(Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;",
            ">;)V"
        }
    .end annotation

    .line 613
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    .line 614
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 615
    iget-object v2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;

    iget-object v3, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinAreaMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 616
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;

    invoke-static {v1}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->access$300(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;)D

    move-result-wide v3

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v3, v5

    const-wide/16 v5, 0x0

    .line 615
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->access$302(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;D)D

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 6

    .line 161
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;

    if-eqz v0, :cond_2

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->checkinLocationsRequestsList:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 164
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_1

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_1

    .line 165
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 166
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 167
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    const-string v2, "CHECKIN: StoreNearbyNotifier: nearby checkin locations response received"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 170
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsResponse;

    .line 171
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsResponse;->nearbyCheckinLocations:Ljava/util/List;

    iput-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->nearbyCheckinLocations:Ljava/util/List;

    .line 173
    iget-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->nearbyCheckinLocations:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    .line 174
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->timeLastUpdatedNearbyCheckinLocations:Ljava/lang/Long;

    .line 175
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->checkRadiiForGPSCheckin(Landroid/location/Location;)V

    goto :goto_0

    .line 177
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 178
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 179
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object p2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v0, v4

    const-string p2, "CHECKIN: StoreNearbyNotifier: no nearby checkin locations"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 185
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->nearbyCheckinLocationsWaitObject:Ljava/lang/Object;

    monitor-enter p1

    .line 186
    :try_start_0
    iget-object p2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->nearbyCheckinLocationsWaitObject:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 187
    monitor-exit p1

    goto :goto_1

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    :cond_2
    :goto_1
    return-void
.end method

.method public destroy()V
    .locals 3

    .line 112
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->removeLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 116
    iput-object v1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->handler:Landroid/os/Handler;

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->checkinLocationsRequestsList:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;

    .line 118
    iget-object v2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public fabStopRequestingHighAccuracyLocationReadings()V
    .locals 3

    .line 453
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->fabRequestingHighAccuracyLocationReadings:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->gpsRequestingHighAccuracyLocationReadings:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 454
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 455
    invoke-direct {p0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->stopRequestingHighAccuracyLocationReadings()V

    :cond_0
    return-void
.end method

.method public forceGPSWalkin()V
    .locals 7

    .line 233
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 234
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 235
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 236
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "CHECKIN: StoreNearbyNotifier: no current location value"

    new-array v6, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    const-string v3, "Gps: StoreNearbyNotifier: no current location value"

    invoke-virtual {v0, v2, v3, v1}, Lcom/shopkick/app/presence/WalkinController;->makeWalkinCallback(ZLjava/lang/String;I)V

    return-void

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->timeLastUpdatedNearbyCheckinLocations:Ljava/lang/Long;

    if-eqz v0, :cond_2

    .line 245
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->timeLastUpdatedNearbyCheckinLocations:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide/32 v5, 0x493e0

    cmp-long v0, v3, v5

    if-lez v0, :cond_1

    goto :goto_0

    .line 268
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 269
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 270
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "CHECKIN: StoreNearbyNotifier: nearby checkin locations already updated in past 5 minutes"

    new-array v6, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 247
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->handler:Landroid/os/Handler;

    new-instance v3, Lcom/shopkick/app/location/StoreNearbyNotifier$3;

    invoke-direct {v3, p0}, Lcom/shopkick/app/location/StoreNearbyNotifier$3;-><init>(Lcom/shopkick/app/location/StoreNearbyNotifier;)V

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 257
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->nearbyCheckinLocationsWaitObject:Ljava/lang/Object;

    monitor-enter v0

    .line 259
    :try_start_0
    iget-object v3, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->nearbyCheckinLocationsWaitObject:Ljava/lang/Object;

    const-wide/16 v4, 0xbb8

    invoke-virtual {v3, v4, v5}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_3

    .line 262
    :catch_0
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 263
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 264
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 265
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "CHECKIN: StoreNearbyNotifier: nearby checkin locations response received or timed out"

    new-array v6, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 274
    :goto_2
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->timeLastUpdatedNearbyCheckinLocations:Ljava/lang/Long;

    if-nez v0, :cond_3

    .line 275
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 276
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 277
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "CHECKIN: StoreNearbyNotifier: no nearby checkin locations"

    new-array v6, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 279
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    const-string v3, "Gps: StoreNearbyNotifier: no nearby checkin locations"

    invoke-virtual {v0, v2, v3, v1}, Lcom/shopkick/app/presence/WalkinController;->makeWalkinCallback(ZLjava/lang/String;I)V

    return-void

    .line 285
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->fabStartRequestingHighAccuracyLocationReadings()V

    return-void

    .line 262
    :goto_3
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public handleLocationUpdate(Landroid/location/Location;)V
    .locals 4

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/WalkinController;->isManualWalkin()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isAutomaticWalkinsDisabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 95
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 96
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    const-string v2, "CHECKIN: StoreNearbyNotifier: handleLocationUpdate() from automatic when manual only enabled"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    if-eqz p1, :cond_2

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableGpsCheckins:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->nearbyCheckinLocations:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 103
    invoke-direct {p0, p1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->checkRadiiForGPSCheckin(Landroid/location/Location;)V

    goto :goto_0

    .line 104
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->nearbyCheckinLocations:Ljava/util/List;

    if-nez p1, :cond_2

    .line 105
    invoke-direct {p0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->fetchNearbyCheckinLocations()V

    :cond_2
    :goto_0
    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "AppActivityManagerSessionStartEvent"

    .line 215
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 217
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/presence/LocationManager;->addLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 218
    invoke-direct {p0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->fetchNearbyCheckinLocations()V

    goto :goto_0

    :cond_0
    const-string p2, "AppActivityManagerSessionEndEvent"

    .line 219
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 220
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    .line 221
    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 222
    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/presence/LocationManager;->removeLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public triggerWalkin(Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;Landroid/location/Location;)V
    .locals 6

    .line 677
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 678
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 679
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CHECKIN: StoreNearbyNotifier: triggering walkin for chain id: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->chainId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", location id: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->locationId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", from gps location: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    invoke-virtual {p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 679
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 684
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 685
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;-><init>()V

    .line 686
    invoke-virtual {p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->lat:Ljava/lang/Double;

    .line 687
    invoke-virtual {p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->lng:Ljava/lang/Double;

    .line 688
    invoke-virtual {p2}, Landroid/location/Location;->getAccuracy()F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->accuracy:Ljava/lang/Double;

    .line 689
    invoke-virtual {p2}, Landroid/location/Location;->getTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, v2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->coordTimestamp:Ljava/lang/Long;

    .line 690
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, v2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->currTimestamp:Ljava/lang/Long;

    .line 691
    iget-object p2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {p2}, Lcom/shopkick/app/application/DeviceInfo;->getAdd()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->add:Ljava/lang/String;

    const/4 p2, 0x2

    .line 692
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->checkinType:Ljava/lang/Integer;

    .line 693
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->locationId:Ljava/lang/String;

    iput-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->locationId:Ljava/lang/String;

    .line 694
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/DeviceInfo;->getCarrierName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->carrier:Ljava/lang/String;

    .line 695
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    const v1, 0x7f10000a

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/DeviceInfo;->getKcid(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->kcid:Ljava/lang/String;

    .line 696
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/WalkinController;->isManualWalkin()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 697
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, v2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->checkinStarter:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    .line 699
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, v2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->checkinStarter:Ljava/lang/Integer;

    .line 702
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier;->mainHandler:Landroid/os/Handler;

    new-instance v0, Lcom/shopkick/app/location/-$$Lambda$StoreNearbyNotifier$XbZnN3sejZVEK7Iz-EEFqp9wjZk;

    invoke-direct {v0, p0, v2, p1}, Lcom/shopkick/app/location/-$$Lambda$StoreNearbyNotifier$XbZnN3sejZVEK7Iz-EEFqp9wjZk;-><init>(Lcom/shopkick/app/location/StoreNearbyNotifier;Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
