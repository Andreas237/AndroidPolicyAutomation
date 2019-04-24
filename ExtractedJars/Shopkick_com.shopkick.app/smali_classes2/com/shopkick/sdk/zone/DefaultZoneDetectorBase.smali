.class public abstract Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;
.super Ljava/lang/Object;
.source "DefaultZoneDetectorBase.java"

# interfaces
.implements Lcom/shopkick/sdk/zone/DefaultZoneDetector;


# static fields
.field protected static final BEACON_DATA_HASH_MATCHING_PREFIX_LENGTH:I = 0x20

.field private static final ZONE_ATTRIBUTES_LATITUDE_KEY:Ljava/lang/String; = "latitude"

.field private static final ZONE_ATTRIBUTES_LONGITUDE_KEY:Ljava/lang/String; = "longitude"


# instance fields
.field private final apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field protected volatile zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

.field private final zoneManager:Lcom/shopkick/sdk/zone/ZoneManager;

.field protected final zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

.field protected final zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/sdk/zone/Zone;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field protected final zoneToProximityToCountLock:Ljava/lang/Object;


# direct methods
.method protected constructor <init>(Lcom/shopkick/sdk/zone/ZoneManager;Lcom/shopkick/sdk/zone/ZoneStateManager;Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    .line 49
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneToProximityToCountLock:Ljava/lang/Object;

    .line 50
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    .line 67
    iput-object p1, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneManager:Lcom/shopkick/sdk/zone/ZoneManager;

    .line 68
    iput-object p2, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    .line 69
    iput-object p3, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-void

    .line 65
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'apiManager\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 64
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'zoneStateManager\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 63
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'zoneManager\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private requestZoneForBeaconFromServer(Lcom/shopkick/sdk/sensor/ShopBeaconReading;)Lcom/shopkick/sdk/zone/ZoneParcelable;
    .locals 14

    .line 174
    new-instance v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataRequest;

    invoke-direct {v2}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataRequest;-><init>()V

    .line 175
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataRequest;->beaconDatas:Ljava/util/ArrayList;

    .line 176
    iget-object v0, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataRequest;->beaconDatas:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x0

    .line 181
    :try_start_0
    invoke-static {}, Lcom/shopkick/sdk/presence/LocationManager;->getInstance()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 185
    new-instance v1, Landroid/location/Location;

    invoke-direct {v1, v0}, Landroid/location/Location;-><init>(Landroid/location/Location;)V

    const-wide v3, 0x40bf6eb851eb851fL    # 8046.72

    .line 186
    invoke-static {v1, v3, v4}, Lcom/shopkick/utilities/GeoUtilities;->roundLatLonForBucketedCaching(Landroid/location/Location;D)V

    .line 189
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataRequest;->latitude:Ljava/lang/Double;

    .line 190
    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataRequest;->longitude:Ljava/lang/Double;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v11, v0

    .line 193
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v8

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 194
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long v9, v0, v3

    const-string v12, "CHECKIN: DefaultZoneDetectorBase: requestZoneForBeaconFromServer() failed to get a location"

    new-array v13, v7, [Ljava/lang/Object;

    .line 193
    invoke-virtual/range {v8 .. v13}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v1, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v3, 0x1

    sget-object v4, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v5, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    sget-object v6, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/fetchers/api/APIManager;->fetchSynchronous(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/DataResponse;

    move-result-object v0

    .line 209
    iget-boolean v1, v0, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v1, v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataResponse;

    if-eqz v1, :cond_3

    .line 213
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 214
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "CHECKIN: DefaultZoneDetectorBase: requestZoneForBeaconFromServer() received successful response"

    new-array v5, v7, [Ljava/lang/Object;

    .line 213
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 216
    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataResponse;

    .line 220
    iget-object v1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataResponse;->beaconDataToZoneIdMap:Ljava/util/HashMap;

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataResponse;->zones:Ljava/util/ArrayList;

    if-eqz v1, :cond_3

    .line 221
    iget-object v1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataResponse;->beaconDataToZoneIdMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 222
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 223
    iget-object v0, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataResponse;->zones:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;

    .line 229
    iget-object v2, v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->zoneId:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 230
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 231
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "CHECKIN: DefaultZoneDetectorBase: requestZoneForBeaconFromServer() zone returned with no zone ID!"

    new-array v5, v7, [Ljava/lang/Object;

    .line 230
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 236
    :cond_2
    iget-object v2, v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->zoneId:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 239
    new-instance p1, Lcom/shopkick/sdk/zone/ZoneParcelable;

    invoke-direct {p1, v1}, Lcom/shopkick/sdk/zone/ZoneParcelable;-><init>(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;)V

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method protected getBeaconDataHashMatchingPrefix(Lcom/shopkick/sdk/sensor/ShopBeaconReading;)Ljava/lang/String;
    .locals 4

    .line 426
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object p1

    .line 427
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 428
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 429
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v0, "ShopBeaconReading received with beacon that has no data hash"

    new-array v1, v1, [Ljava/lang/Object;

    .line 428
    invoke-virtual {p1, v2, v3, v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/16 v0, 0x20

    .line 433
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getDistanceFromSignalStrength(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;I)I
    .locals 6

    const-string/jumbo v0, "shopkick_beacon"

    .line 354
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const v0, 0x7fffffff

    .line 363
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getSignalDistanceMap()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 364
    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    if-gtz v2, :cond_0

    goto :goto_1

    .line 372
    :cond_0
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 373
    invoke-virtual {p1}, Ljava/util/TreeMap;->descendingKeySet()Ljava/util/NavigableSet;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 374
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt p2, v0, :cond_1

    move v0, v2

    goto :goto_2

    :cond_1
    move v0, v2

    goto :goto_0

    .line 366
    :cond_2
    :goto_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 367
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "Trigger %1$s of type shopkick_beacon has no signal strength to distance map"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 369
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v5

    .line 366
    invoke-virtual {p2, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_2
    return v0

    .line 355
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'trigger\' must be of \'shopkick_beacon\' type"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected getListenersForZoneAndProximity(Lcom/shopkick/sdk/zone/Zone;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/sdk/zone/Zone;",
            "I)",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;",
            ">;"
        }
    .end annotation

    .line 441
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 442
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 443
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 444
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-gt p2, v3, :cond_0

    .line 445
    iget-object v3, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected getMatchingBeaconDataHash(Ljava/lang/String;Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/lang/String;
    .locals 7

    const-string/jumbo v0, "shopkick_beacon"

    .line 394
    invoke-virtual {p2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 399
    :cond_0
    invoke-virtual {p2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getBtleDatas()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getBtleDatas()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_1

    .line 408
    :cond_1
    invoke-virtual {p2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getBtleDatas()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 409
    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_3
    move-object v0, v1

    .line 414
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v1

    :cond_4
    return-object v0

    .line 400
    :cond_5
    :goto_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Trigger %1$s of type shopkick_beacon has no beacon data hashes"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    .line 402
    invoke-virtual {p2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object p2

    const/4 v6, 0x0

    aput-object p2, v5, v6

    .line 400
    invoke-static {v0, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-array v0, v6, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, p2, v0}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return-object v1
.end method

.method protected handleBeaconMatchedToZone(Lcom/shopkick/sdk/sensor/ShopBeaconReading;Lcom/shopkick/sdk/zone/ZoneParcelable;Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;Ljava/lang/String;ILjava/lang/Integer;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v9, p2

    .line 267
    iget-object v1, v0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    .line 268
    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getLoggedBeaconMatchedToZone()Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 270
    iget-object v1, v0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v9}, Lcom/shopkick/sdk/zone/ZoneEventsListener;->onBeaconMatchedToZone(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;)V

    .line 271
    iget-object v1, v0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getLoggedBeaconMatchedToZone()Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    .line 275
    :cond_0
    iget-object v1, v0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v9}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v1, :cond_8

    .line 277
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_1
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 278
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-gt v2, v1, :cond_7

    .line 282
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "%1$s%2$d"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 284
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v6

    invoke-virtual {v6}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    .line 285
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v11, 0x1

    aput-object v5, v4, v11

    .line 282
    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 286
    iget-object v3, v0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    if-eqz v3, :cond_3

    iget-object v3, v0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    .line 287
    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getLoggedZoneEntered()Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 289
    iget-object v3, v0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    move-object/from16 v12, p1

    invoke-interface {v3, v9, v1, v12}, Lcom/shopkick/sdk/zone/ZoneEventsListener;->onZoneEntered(Lcom/shopkick/sdk/zone/Zone;ILcom/shopkick/sdk/sensor/Reading;)V

    .line 290
    iget-object v1, v0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getLoggedZoneEntered()Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move-object/from16 v12, p1

    goto :goto_1

    :cond_3
    move-object/from16 v12, p1

    .line 296
    :goto_1
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    const-string v1, "ble-data"

    move-object/from16 v13, p4

    .line 297
    invoke-virtual {v8, v1, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    invoke-virtual/range {p3 .. p3}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getBeaconId()Ljava/lang/Long;

    move-result-object v1

    const-string v2, "ble-id"

    if-nez v1, :cond_4

    const-string v1, ""

    goto :goto_2

    .line 299
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {v8, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ble-address"

    if-nez v1, :cond_5

    const-string v1, ""

    .line 301
    :cond_5
    invoke-virtual {v8, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ble-proximity"

    .line 302
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    new-instance v14, Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    .line 307
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const/4 v5, 0x1

    .line 309
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move-object v1, v14

    move-object/from16 v2, p2

    move/from16 v7, p5

    invoke-direct/range {v1 .. v8}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;-><init>(Lcom/shopkick/sdk/zone/Zone;JIIILjava/util/HashMap;)V

    .line 314
    invoke-virtual {v14}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v1

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->getListenersForZoneAndProximity(Lcom/shopkick/sdk/zone/Zone;I)Ljava/util/List;

    move-result-object v1

    .line 315
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;

    .line 316
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->isWithinZone()Z

    move-result v3

    if-nez v3, :cond_6

    .line 317
    invoke-virtual {v2, v11}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setWithinZone(Z)V

    .line 318
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setEnterTime(J)V

    .line 319
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getEnterTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setLastDwelled(J)V

    .line 320
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getEnterTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setLastCalled(J)V

    .line 321
    iget-object v3, v0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    sget-object v4, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->SHOPKICK_BEACON:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    invoke-virtual {v3, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getListener()Lcom/shopkick/sdk/zone/ZoneProximityListener;

    move-result-object v2

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v2, v3, v14}, Lcom/shopkick/sdk/zone/ZoneProximityListener;->onEntered(ILcom/shopkick/sdk/zone/ZoneReading;)V

    goto :goto_3

    .line 327
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setLastCalled(J)V

    goto :goto_3

    :cond_7
    move-object/from16 v12, p1

    move-object/from16 v13, p4

    goto/16 :goto_0

    :cond_8
    return-void
.end method

.method protected handleBeaconNotMatchedToZone(Lcom/shopkick/sdk/sensor/ShopBeaconReading;)V
    .locals 12

    .line 84
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneManager:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneManager;->isNetworkActivityAllowed()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 91
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 92
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "CHECKIN: DefaultZoneDetectorBase: handleBeaconNotMatchedToZone() unmatched beacon found"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    .line 91
    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    .line 97
    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getLoggedBeaconMatchedToZone()Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v0

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    .line 98
    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getLoggedBeaconNotMatchedToZone()Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v0

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getLoggedBeaconNotMatchedToZone()Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v0

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    .line 103
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/shopkick/sdk/zone/ZoneEventsListener;->onBeaconNotMatchedToZone(Ljava/lang/String;)V

    .line 107
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getFallbackWorkCompletedBeacons()Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v0

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 110
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->getBeaconDataHashMatchingPrefix(Lcom/shopkick/sdk/sensor/ShopBeaconReading;)Ljava/lang/String;

    move-result-object v0

    .line 115
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->requestZoneForBeaconFromServer(Lcom/shopkick/sdk/sensor/ShopBeaconReading;)Lcom/shopkick/sdk/zone/ZoneParcelable;

    move-result-object v7

    if-eqz v7, :cond_5

    .line 119
    invoke-virtual {v7}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getTriggers()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    .line 120
    invoke-virtual {p0, v0, v3}, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->getMatchingBeaconDataHash(Ljava/lang/String;Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/lang/String;

    move-result-object v5

    .line 121
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_1

    move-object v8, v3

    move-object v9, v5

    goto :goto_1

    :cond_1
    move-object v3, v5

    goto :goto_0

    :cond_2
    move-object v8, v2

    move-object v9, v3

    :goto_1
    if-nez v8, :cond_3

    .line 127
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 128
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    const-string v2, "CHECKIN: DefaultZoneDetectorBase: handleBeaconNotMatchedToZone() no matching trigger found!"

    new-array v3, v4, [Ljava/lang/Object;

    .line 127
    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 134
    :cond_3
    new-instance v0, Landroid/location/Location;

    const-string v1, "DefaultZoneDetectorBase"

    invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    const-string v1, "latitude"

    .line 136
    invoke-virtual {v7, v1}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    .line 135
    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLatitude(D)V

    const-string v1, "longitude"

    .line 138
    invoke-virtual {v7, v1}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    .line 137
    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLongitude(D)V

    .line 141
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    if-eqz v1, :cond_4

    .line 145
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    invoke-interface {v1, v9, v7, v0}, Lcom/shopkick/sdk/zone/ZoneEventsListener;->onBeaconMatchedToZoneInFallback(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;Landroid/location/Location;)V

    .line 149
    :cond_4
    iget-object v1, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneManager:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-virtual {v1, v0}, Lcom/shopkick/sdk/zone/ZoneManager;->forceUpdateZones(Landroid/location/Location;)V

    .line 152
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v0

    const-wide/high16 v1, 0x4049000000000000L    # 50.0

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/sdk/scanner/Beacon;->getSignalStrength(D)I

    move-result v10

    .line 153
    invoke-virtual {p0, v8, v10}, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->getDistanceFromSignalStrength(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 154
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getFallbackWorkCompletedBeacons()Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v0

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    move-object v5, p0

    move-object v6, p1

    .line 155
    invoke-virtual/range {v5 .. v11}, Lcom/shopkick/sdk/zone/DefaultZoneDetectorBase;->handleBeaconMatchedToZone(Lcom/shopkick/sdk/sensor/ShopBeaconReading;Lcom/shopkick/sdk/zone/ZoneParcelable;Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;Ljava/lang/String;ILjava/lang/Integer;)V

    :cond_5
    return-void
.end method
