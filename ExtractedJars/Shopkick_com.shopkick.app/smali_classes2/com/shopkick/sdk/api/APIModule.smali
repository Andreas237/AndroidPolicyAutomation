.class public Lcom/shopkick/sdk/api/APIModule;
.super Ljava/lang/Object;
.source "APIModule.java"


# static fields
.field private static final DEFAULT_IMAGE_CACHE_SIZE:I = 0x200000

.field private static final DISK_CACHE_SIZE:I = 0x200000

.field private static instance:Lcom/shopkick/sdk/api/APIModule;


# instance fields
.field private final geoLocationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

.field private final instanceLock:Ljava/lang/Object;

.field private networkManager:Lcom/shopkick/app/fetchers/network/NetworkManager;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/api/APIModule;->instanceLock:Ljava/lang/Object;

    .line 158
    new-instance v0, Lcom/shopkick/sdk/api/APIModule$2;

    invoke-direct {v0, p0}, Lcom/shopkick/sdk/api/APIModule$2;-><init>(Lcom/shopkick/sdk/api/APIModule;)V

    iput-object v0, p0, Lcom/shopkick/sdk/api/APIModule;->geoLocationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

    return-void
.end method

.method public static getInstance()Lcom/shopkick/sdk/api/APIModule;
    .locals 1

    .line 45
    sget-object v0, Lcom/shopkick/sdk/api/APIModule;->instance:Lcom/shopkick/sdk/api/APIModule;

    if-eqz v0, :cond_0

    return-object v0

    .line 48
    :cond_0
    new-instance v0, Lcom/shopkick/sdk/api/APIModule;

    invoke-direct {v0}, Lcom/shopkick/sdk/api/APIModule;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/api/APIModule;->instance:Lcom/shopkick/sdk/api/APIModule;

    .line 49
    sget-object v0, Lcom/shopkick/sdk/api/APIModule;->instance:Lcom/shopkick/sdk/api/APIModule;

    return-object v0
.end method


# virtual methods
.method public provideAPIManager(Landroid/content/Context;Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/DeveloperInfo;Lcom/shopkick/app/application/LibPreferences;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/SKLogger;)Lcom/shopkick/fetchers/api/APIManager;
    .locals 10

    .line 134
    invoke-static {}, Lcom/shopkick/sdk/api/Environment;->getInstance()Lcom/shopkick/sdk/api/Environment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/api/Environment;->getCurrentHttpsFlag()Z

    move-result v5

    move-object v1, p2

    move-object v2, p4

    move-object v3, p5

    move-object v4, p3

    move-object v6, p1

    move-object/from16 v7, p7

    move-object/from16 v8, p6

    move-object/from16 v9, p8

    .line 130
    invoke-static/range {v1 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->initialize(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/DeveloperInfo;Lcom/shopkick/app/application/Account;ZLandroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/LibPreferences;Lcom/shopkick/app/application/SKLogger;)Z

    .line 140
    sget-object v0, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    .line 141
    invoke-static {}, Lcom/shopkick/sdk/api/Environment;->getInstance()Lcom/shopkick/sdk/api/Environment;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/api/Environment;->getCurrentAuthority()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Integer;

    sget v4, Lcom/shopkick/sdk/R$raw;->shop_beacon_sdk_api:I

    .line 142
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 140
    invoke-static {v0, v1, v3}, Lcom/shopkick/fetchers/api/APIManager;->addApis(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Ljava/util/List;)V

    .line 148
    sget-object v0, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    .line 149
    invoke-static {}, Lcom/shopkick/sdk/api/Environment;->getInstance()Lcom/shopkick/sdk/api/Environment;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/api/Environment;->getCurrentAuthority()Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Integer;

    sget v3, Lcom/shopkick/sdk/R$raw;->skauthapi:I

    .line 150
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 148
    invoke-static {v0, v1, v2}, Lcom/shopkick/fetchers/api/APIManager;->addApis(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Ljava/util/List;)V

    .line 152
    invoke-static {}, Lcom/shopkick/fetchers/api/APIManager;->getInstance()Lcom/shopkick/fetchers/api/APIManager;

    move-result-object v0

    return-object v0
.end method

.method public provideNetworkManager(Landroid/content/Context;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;)Lcom/shopkick/app/fetchers/network/NetworkManager;
    .locals 13

    move-object v1, p0

    .line 59
    iget-object v2, v1, Lcom/shopkick/sdk/api/APIModule;->instanceLock:Ljava/lang/Object;

    monitor-enter v2

    .line 60
    :try_start_0
    iget-object v0, v1, Lcom/shopkick/sdk/api/APIModule;->networkManager:Lcom/shopkick/app/fetchers/network/NetworkManager;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, v1, Lcom/shopkick/sdk/api/APIModule;->networkManager:Lcom/shopkick/app/fetchers/network/NetworkManager;

    monitor-exit v2

    return-object v0

    :cond_0
    const-string v0, "connectivity"

    move-object v4, p1

    .line 65
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 66
    new-instance v9, Lcom/shopkick/app/controllers/NetworkStatsCounter;

    invoke-direct {v9}, Lcom/shopkick/app/controllers/NetworkStatsCounter;-><init>()V

    .line 67
    new-instance v5, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    invoke-direct {v5, v0}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;-><init>(Landroid/net/ConnectivityManager;)V

    .line 69
    new-instance v0, Lcom/shopkick/app/fetchers/network/NetworkManager;

    iget-object v10, v1, Lcom/shopkick/sdk/api/APIModule;->geoLocationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

    const/4 v11, 0x1

    const/4 v12, 0x0

    move-object v3, v0

    move-object v4, p1

    move-object v6, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    invoke-direct/range {v3 .. v12}, Lcom/shopkick/app/fetchers/network/NetworkManager;-><init>(Landroid/content/Context;Lcom/shopkick/app/fetchers/network/SKConnectivityManager;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/controllers/NetworkStatsCounter;Lcom/shopkick/comm/GeoLocation$LocationProvider;ZZ)V

    iput-object v0, v1, Lcom/shopkick/sdk/api/APIModule;->networkManager:Lcom/shopkick/app/fetchers/network/NetworkManager;

    .line 71
    iget-object v0, v1, Lcom/shopkick/sdk/api/APIModule;->networkManager:Lcom/shopkick/app/fetchers/network/NetworkManager;

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v0

    .line 72
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public provideNetworkManagerV2(Landroid/content/Context;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;)Lcom/shopkick/fetchers/network/NetworkManager;
    .locals 10

    const-string v0, "connectivity"

    .line 106
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 107
    new-instance v7, Lcom/shopkick/app/controllers/NetworkStatsCounter;

    invoke-direct {v7}, Lcom/shopkick/app/controllers/NetworkStatsCounter;-><init>()V

    .line 108
    new-instance v3, Lcom/shopkick/fetchers/network/SKConnectivityManager;

    invoke-direct {v3, v0}, Lcom/shopkick/fetchers/network/SKConnectivityManager;-><init>(Landroid/net/ConnectivityManager;)V

    .line 110
    new-instance v0, Lcom/shopkick/fetchers/network/NetworkManager;

    iget-object v8, p0, Lcom/shopkick/sdk/api/APIModule;->geoLocationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

    const/4 v9, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v9}, Lcom/shopkick/fetchers/network/NetworkManager;-><init>(Landroid/content/Context;Lcom/shopkick/fetchers/network/SKConnectivityManager;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/controllers/NetworkStatsCounter;Lcom/shopkick/comm/GeoLocation$LocationProvider;Z)V

    return-object v0
.end method

.method public provideSKLogger(Landroid/content/Context;Lcom/shopkick/app/fetchers/network/NetworkManager;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/LibPreferences;Lcom/shopkick/app/application/Account;)Lcom/shopkick/app/application/SKLogger;
    .locals 12

    .line 77
    new-instance v9, Lcom/shopkick/sdk/api/APIModule$1;

    move-object v10, p0

    invoke-direct {v9, p0}, Lcom/shopkick/sdk/api/APIModule$1;-><init>(Lcom/shopkick/sdk/api/APIModule;)V

    .line 98
    new-instance v11, Lcom/shopkick/app/application/SKLogger;

    .line 99
    invoke-static {}, Lcom/shopkick/sdk/api/Environment;->getInstance()Lcom/shopkick/sdk/api/Environment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/api/Environment;->getCurrentAuthority()Ljava/lang/String;

    move-result-object v6

    const/4 v2, 0x1

    const/4 v8, 0x0

    move-object v0, v11

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v7, p5

    invoke-direct/range {v0 .. v9}, Lcom/shopkick/app/application/SKLogger;-><init>(Landroid/content/Context;ZLcom/shopkick/app/fetchers/network/NetworkManager;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/LibPreferences;Ljava/lang/String;Lcom/shopkick/app/application/Account;ZLcom/shopkick/logging/ConfigurationProvider;)V

    return-object v11
.end method
