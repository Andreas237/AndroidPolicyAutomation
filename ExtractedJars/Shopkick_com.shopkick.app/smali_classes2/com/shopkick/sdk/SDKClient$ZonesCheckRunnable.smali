.class Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;
.super Ljava/lang/Object;
.source "SDKClient.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/SDKClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ZonesCheckRunnable"
.end annotation


# instance fields
.field private final resultsCallback:Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;

.field final synthetic this$0:Lcom/shopkick/sdk/SDKClient;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/SDKClient;Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->this$0:Lcom/shopkick/sdk/SDKClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 223
    iput-object p2, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->resultsCallback:Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;

    return-void

    .line 222
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'resultsCallback\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private doBeaconsMatchZone(Lcom/shopkick/sdk/zone/ZoneParcelable;Ljava/util/Collection;)Lcom/shopkick/sdk/scanner/Beacon;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/sdk/zone/ZoneParcelable;",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;)",
            "Lcom/shopkick/sdk/scanner/Beacon;"
        }
    .end annotation

    .line 312
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getShopkickBeaconBtleData()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 314
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 315
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/scanner/Beacon;

    .line 316
    invoke-virtual {v2}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 318
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x20

    if-lt v4, v5, :cond_1

    const/4 v4, 0x0

    .line 320
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 321
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 229
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    .line 233
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->this$0:Lcom/shopkick/sdk/SDKClient;

    invoke-virtual {v2}, Lcom/shopkick/sdk/SDKClient;->allowNetworkActivity()V

    .line 236
    iget-object v2, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->this$0:Lcom/shopkick/sdk/SDKClient;

    .line 237
    invoke-virtual {v2}, Lcom/shopkick/sdk/SDKClient;->getZoneManager()Lcom/shopkick/sdk/zone/ZoneManager;

    move-result-object v2

    const-wide/32 v3, 0x927c0

    invoke-virtual {v2, v3, v4}, Lcom/shopkick/sdk/zone/ZoneManager;->getRecentlyEnteredZones(J)Ljava/util/Map;

    move-result-object v2

    .line 238
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 241
    iget-object v2, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->this$0:Lcom/shopkick/sdk/SDKClient;

    invoke-virtual {v2}, Lcom/shopkick/sdk/SDKClient;->getSensorManager()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/shopkick/sdk/sensor/SensorManager;->doShopkickBeaconsScan(Z)V

    .line 244
    iget-object v2, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->this$0:Lcom/shopkick/sdk/SDKClient;

    invoke-virtual {v2}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v2

    .line 246
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v6, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 247
    invoke-virtual {v6}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    sget-object v8, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v8}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v8

    or-long/2addr v6, v8

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "CHECKIN: SDKClient ZonesCheckRunnable after location update, best location: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v9, v1, [Ljava/lang/Object;

    invoke-virtual {v5, v6, v7, v8, v9}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz v2, :cond_0

    .line 254
    iget-object v5, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->this$0:Lcom/shopkick/sdk/SDKClient;

    invoke-virtual {v5}, Lcom/shopkick/sdk/SDKClient;->getZoneManager()Lcom/shopkick/sdk/zone/ZoneManager;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/shopkick/sdk/zone/ZoneManager;->doZonesUpdate(Landroid/location/Location;)V

    .line 258
    :cond_0
    iget-object v2, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->this$0:Lcom/shopkick/sdk/SDKClient;

    invoke-virtual {v2}, Lcom/shopkick/sdk/SDKClient;->getSensorManager()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v2

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Lcom/shopkick/sdk/sensor/SensorManager;->doShopkickBeaconsScan(Z)V

    .line 259
    iget-object v2, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->this$0:Lcom/shopkick/sdk/SDKClient;

    .line 260
    invoke-virtual {v2}, Lcom/shopkick/sdk/SDKClient;->getSensorManager()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v2

    invoke-virtual {v2, v3, v4}, Lcom/shopkick/sdk/sensor/SensorManager;->getRecentlyObservedBeacons(J)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 261
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    if-nez v3, :cond_1

    .line 262
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 263
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    sget-object v6, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v6}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    or-long/2addr v4, v6

    const-string v6, "CHECKIN: SDKClient: no beacons detected"

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5, v6, v7}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 269
    :cond_1
    iget-object v3, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->this$0:Lcom/shopkick/sdk/SDKClient;

    invoke-virtual {v3}, Lcom/shopkick/sdk/SDKClient;->getZoneManager()Lcom/shopkick/sdk/zone/ZoneManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneManager;->getNearbyZones()Ljava/util/Set;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->this$0:Lcom/shopkick/sdk/SDKClient;

    invoke-virtual {v3}, Lcom/shopkick/sdk/SDKClient;->getZoneManager()Lcom/shopkick/sdk/zone/ZoneManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneManager;->getNearbyZones()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    if-nez v3, :cond_2

    .line 270
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 271
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    sget-object v6, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v6}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    or-long/2addr v4, v6

    const-string v6, "CHECKIN: SDKClient: no nearby zones"

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5, v6, v7}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 274
    :cond_2
    iget-object v3, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->this$0:Lcom/shopkick/sdk/SDKClient;

    invoke-virtual {v3}, Lcom/shopkick/sdk/SDKClient;->getZoneManager()Lcom/shopkick/sdk/zone/ZoneManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneManager;->getNearbyZones()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/zone/ZoneParcelable;

    .line 275
    invoke-direct {p0, v4, v2}, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->doBeaconsMatchZone(Lcom/shopkick/sdk/zone/ZoneParcelable;Ljava/util/Collection;)Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 277
    invoke-static {v4, v5}, Lcom/shopkick/sdk/SDKClient;->getReadingFromZoneAndBeacon(Lcom/shopkick/sdk/zone/Zone;Lcom/shopkick/sdk/scanner/Beacon;)Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 292
    :cond_4
    :try_start_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 293
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "CHECKIN: SDKClient ZonesCheckRunnable zones entered: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 295
    iget-object v2, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->resultsCallback:Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;

    invoke-interface {v2, v0}, Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;->zonesEntered(Ljava/util/Set;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :catch_0
    move-exception v2

    move-object v6, v2

    .line 284
    :try_start_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 285
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v7

    or-long/2addr v4, v7

    const-string v7, "ZonesCheckResults.run() failed"

    new-array v8, v1, [Ljava/lang/Object;

    .line 284
    invoke-virtual/range {v3 .. v8}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 292
    :try_start_3
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 293
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "CHECKIN: SDKClient ZonesCheckRunnable zones entered: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 295
    iget-object v2, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->resultsCallback:Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;

    invoke-interface {v2, v0}, Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;->zonesEntered(Ljava/util/Set;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v5, v0

    .line 299
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 300
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v0, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    or-long/2addr v3, v6

    const-string v6, "ZonesCheckResults.zonesEntered() callback failed"

    new-array v7, v1, [Ljava/lang/Object;

    .line 299
    invoke-virtual/range {v2 .. v7}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-void

    .line 292
    :goto_2
    :try_start_4
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 293
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    sget-object v6, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v6}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    or-long/2addr v4, v6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "CHECKIN: SDKClient ZonesCheckRunnable zones entered: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5, v6, v7}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 295
    iget-object v3, p0, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;->resultsCallback:Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;

    invoke-interface {v3, v0}, Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;->zonesEntered(Ljava/util/Set;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    move-object v6, v0

    .line 299
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 300
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    sget-object v0, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v7

    or-long/2addr v4, v7

    new-array v8, v1, [Ljava/lang/Object;

    const-string v7, "ZonesCheckResults.zonesEntered() callback failed"

    .line 299
    invoke-virtual/range {v3 .. v8}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    :goto_3
    throw v2
.end method
