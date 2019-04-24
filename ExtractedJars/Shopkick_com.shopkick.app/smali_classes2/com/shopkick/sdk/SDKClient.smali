.class public Lcom/shopkick/sdk/SDKClient;
.super Ljava/lang/Object;
.source "SDKClient.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;,
        Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;,
        Lcom/shopkick/sdk/SDKClient$Builder;
    }
.end annotation


# static fields
.field private static final BEACON_DATA_HASH_MATCHING_PREFIX_LENGTH:I = 0x20

.field private static final MAX_FAB_HISTORY_MILLISECONDS:I = 0x927c0


# instance fields
.field private final zonesCheckWork:Ljava/util/concurrent/Executor;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/SDKClient;->zonesCheckWork:Ljava/util/concurrent/Executor;

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    if-eqz p3, :cond_1

    if-eqz p4, :cond_0

    .line 53
    invoke-static {p1, p2, p3}, Lcom/shopkick/sdk/presence/LocationManager;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 54
    invoke-static {p1, p2, p3}, Lcom/shopkick/sdk/sensor/SensorManager;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 55
    invoke-static {p1, p2, p3, p4}, Lcom/shopkick/sdk/zone/ZoneManager;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;Lcom/shopkick/fetchers/api/APIManager;)V

    return-void

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'apiManager\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'sdkConfigurationProvider\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 47
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'appStateProvider\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 46
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'context\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/sdk/SDKClient$1;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/shopkick/sdk/SDKClient;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;Lcom/shopkick/fetchers/api/APIManager;)V

    return-void
.end method

.method public static getReadingFromZoneAndBeacon(Lcom/shopkick/sdk/zone/Zone;Lcom/shopkick/sdk/scanner/Beacon;)Lcom/shopkick/sdk/zone/ShopkickZoneReading;
    .locals 9

    .line 341
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v0, "ble-data"

    .line 342
    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ble-id"

    const-string v1, ""

    .line 343
    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ble-address"

    if-nez v0, :cond_0

    const-string v0, ""

    .line 345
    :cond_0
    invoke-virtual {v7, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ble-proximity"

    const-string v1, "1"

    .line 346
    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    new-instance v8, Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    .line 350
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/4 v4, 0x1

    const/4 v5, 0x1

    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 353
    invoke-virtual {p1, v0, v1}, Lcom/shopkick/sdk/scanner/Beacon;->getSignalStrength(D)I

    move-result v6

    move-object v0, v8

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;-><init>(Lcom/shopkick/sdk/zone/Zone;JIIILjava/util/HashMap;)V

    return-object v8
.end method


# virtual methods
.method public allowNetworkActivity()V
    .locals 1

    .line 160
    invoke-static {}, Lcom/shopkick/sdk/presence/LocationManager;->getInstance()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->allowNetworkActivity()V

    .line 161
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/SensorManager;->allowNetworkActivity()V

    .line 162
    invoke-static {}, Lcom/shopkick/sdk/zone/ZoneManager;->getInstance()Lcom/shopkick/sdk/zone/ZoneManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneManager;->allowNetworkActivity()V

    return-void
.end method

.method public disallowNetworkActivity()V
    .locals 1

    .line 169
    invoke-static {}, Lcom/shopkick/sdk/presence/LocationManager;->getInstance()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->disallowNetworkActivity()V

    .line 170
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/SensorManager;->disallowNetworkActivity()V

    .line 171
    invoke-static {}, Lcom/shopkick/sdk/zone/ZoneManager;->getInstance()Lcom/shopkick/sdk/zone/ZoneManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneManager;->disallowNetworkActivity()V

    return-void
.end method

.method public doZonesCheck(Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 213
    iget-object v0, p0, Lcom/shopkick/sdk/SDKClient;->zonesCheckWork:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/sdk/SDKClient$ZonesCheckRunnable;-><init>(Lcom/shopkick/sdk/SDKClient;Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 210
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'resultsCallback\' can not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;
    .locals 1

    .line 139
    invoke-static {}, Lcom/shopkick/sdk/presence/LocationManager;->getInstance()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    return-object v0
.end method

.method public getSensorManager()Lcom/shopkick/sdk/sensor/SensorManager;
    .locals 1

    .line 146
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v0

    return-object v0
.end method

.method public getZoneManager()Lcom/shopkick/sdk/zone/ZoneManager;
    .locals 1

    .line 153
    invoke-static {}, Lcom/shopkick/sdk/zone/ZoneManager;->getInstance()Lcom/shopkick/sdk/zone/ZoneManager;

    move-result-object v0

    return-object v0
.end method
