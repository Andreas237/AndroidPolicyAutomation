.class public Lcom/shopkick/app/fetchers/network/NetworkManager;
.super Ljava/lang/Object;
.source "NetworkManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;
    }
.end annotation


# static fields
.field private static final CORE_POOL_SIZE:I

.field private static final CPU_COUNT:I

.field private static final DISABLE_SSL_VALIDATION:Z = false

.field public static final HTTP_STATUS_CLIENT_ERROR:I = 0x190

.field public static final HTTP_STATUS_FORBIDDEN:I = 0x193

.field public static final HTTP_STATUS_NOT_MODIFIED:I = 0x130

.field public static final HTTP_STATUS_SERVER_ERROR:I = 0x1f4

.field public static final HTTP_STATUS_SUCCESSFUL:I = 0xc8

.field public static final IS_FETCHING:Ljava/lang/String; = "isFetching"

.field private static final KEEP_ALIVE:I = 0x1

.field private static final MAXIMUM_POOL_SIZE:I

.field private static final MILLIS_CONNECTION_TIMEOUT:I = 0x1388

.field private static final MILLIS_SOCKET_TIMEOUT:I = 0x7530


# instance fields
.field private appInfo:Lcom/shopkick/app/application/AppInfo;

.field private final context:Landroid/content/Context;

.field private devInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private enableForcedExperimentId:Z

.field private isFetching:Z

.field private final locationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

.field private networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

.field private networkTaskByRequestMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/network/NetworkRequest;",
            "Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;",
            ">;"
        }
    .end annotation
.end field

.field private pcs:Ljava/beans/PropertyChangeSupport;

.field private requestCallbackMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/network/NetworkRequest;",
            "Lcom/shopkick/app/fetchers/network/INetworkCallback;",
            ">;"
        }
    .end annotation
.end field

.field private showUrls:Z

.field private skConnMgr:Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

.field private final threadpool:Ljava/util/concurrent/ExecutorService;

.field private userAcct:Lcom/shopkick/app/application/Account;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 68
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->CPU_COUNT:I

    .line 70
    sget v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->CPU_COUNT:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/shopkick/app/fetchers/network/NetworkManager;->CORE_POOL_SIZE:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    .line 72
    sput v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->MAXIMUM_POOL_SIZE:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/fetchers/network/SKConnectivityManager;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/controllers/NetworkStatsCounter;Lcom/shopkick/comm/GeoLocation$LocationProvider;ZZ)V
    .locals 9

    move-object v0, p0

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p2

    .line 115
    iput-object v1, v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->skConnMgr:Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    move-object v1, p3

    .line 116
    iput-object v1, v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->userAcct:Lcom/shopkick/app/application/Account;

    move-object v1, p4

    .line 117
    iput-object v1, v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    move-object v1, p5

    .line 118
    iput-object v1, v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    move-object v1, p6

    .line 119
    iput-object v1, v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

    .line 120
    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v2, Lcom/shopkick/app/fetchers/network/NetworkManager;->CORE_POOL_SIZE:I

    sget v3, Lcom/shopkick/app/fetchers/network/NetworkManager;->MAXIMUM_POOL_SIZE:I

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const-wide/16 v4, 0x1

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v8, v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->threadpool:Ljava/util/concurrent/ExecutorService;

    move/from16 v1, p8

    .line 125
    iput-boolean v1, v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->showUrls:Z

    move/from16 v1, p9

    .line 126
    iput-boolean v1, v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->enableForcedExperimentId:Z

    .line 127
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    .line 128
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->requestCallbackMap:Ljava/util/HashMap;

    .line 129
    new-instance v1, Ljava/beans/PropertyChangeSupport;

    invoke-direct {v1, p0}, Ljava/beans/PropertyChangeSupport;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->pcs:Ljava/beans/PropertyChangeSupport;

    move-object v1, p1

    .line 130
    iput-object v1, v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->context:Landroid/content/Context;

    move-object/from16 v1, p7

    .line 131
    iput-object v1, v0, Lcom/shopkick/app/fetchers/network/NetworkManager;->locationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/fetchers/network/NetworkManager;)Lcom/shopkick/app/fetchers/network/SKConnectivityManager;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->skConnMgr:Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/fetchers/network/NetworkManager;)Lcom/shopkick/app/controllers/NetworkStatsCounter;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/fetchers/network/NetworkManager;)Ljava/util/HashMap;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->requestCallbackMap:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/fetchers/network/NetworkManager;)Ljava/util/HashMap;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/fetchers/network/NetworkManager;Z)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/shopkick/app/fetchers/network/NetworkManager;->setIsFetching(Z)V

    return-void
.end method

.method public static createDefaultNetworkManager(Landroid/content/Context;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/controllers/NetworkStatsCounter;Lcom/shopkick/comm/GeoLocation$LocationProvider;ZZ)Lcom/shopkick/app/fetchers/network/NetworkManager;
    .locals 11

    const-string v0, "connectivity"

    move-object v2, p0

    .line 494
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 495
    new-instance v3, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    invoke-direct {v3, v0}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;-><init>(Landroid/net/ConnectivityManager;)V

    .line 498
    invoke-static {p0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 500
    new-instance v0, Lcom/shopkick/app/fetchers/network/NetworkManager;

    move-object v1, v0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    invoke-direct/range {v1 .. v10}, Lcom/shopkick/app/fetchers/network/NetworkManager;-><init>(Landroid/content/Context;Lcom/shopkick/app/fetchers/network/SKConnectivityManager;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/controllers/NetworkStatsCounter;Lcom/shopkick/comm/GeoLocation$LocationProvider;ZZ)V

    return-object v0
.end method

.method private getClientCapabilities()Ljava/lang/String;
    .locals 3

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/DeviceInfo;->btEnabled()Z

    move-result v0

    const/4 v1, 0x0

    or-int/2addr v0, v1

    .line 201
    iget-object v2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->isRooted()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    or-int/2addr v0, v2

    .line 203
    iget-object v2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->isLocationFaked()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v1, 0x4

    :cond_1
    or-int/2addr v0, v1

    .line 204
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getDomainName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 458
    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 459
    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p0

    const-string/jumbo v0, "www."

    .line 460
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 462
    invoke-virtual {p0}, Ljava/net/URISyntaxException;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method

.method private getHeaders()Ljava/util/HashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 211
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 216
    iget-object v1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->userAcct:Lcom/shopkick/app/application/Account;

    invoke-virtual {v1}, Lcom/shopkick/app/application/Account;->getUserId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, ""

    .line 217
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "X-User-Id"

    .line 218
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v1, "X-Device"

    .line 224
    iget-object v2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "X-Sys"

    .line 225
    iget-object v2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->getOsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "X-Screen"

    .line 226
    iget-object v2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->getScreenString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "X-Heap"

    .line 227
    iget-object v2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->getHeapSize()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "X-Device-Id"

    .line 228
    iget-object v2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "X-App"

    .line 233
    iget-object v2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppInfo;->getAppString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "X-Sts"

    .line 237
    iget-object v2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppInfo;->getAppLaunchedTimestamp()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    iget-object v1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppInfo;->getApiKey()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "X-API-Key"

    .line 240
    iget-object v2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppInfo;->getApiKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->userAcct:Lcom/shopkick/app/application/Account;

    iget-object v2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/application/Account;->getAdvertisingId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 244
    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "X-Adv-Id"

    .line 245
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    :cond_2
    iget-boolean v1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->enableForcedExperimentId:Z

    if-eqz v1, :cond_3

    .line 249
    iget-object v1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->userAcct:Lcom/shopkick/app/application/Account;

    invoke-virtual {v1}, Lcom/shopkick/app/application/Account;->getExperimentId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 250
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_3

    const-string v2, "X-GroupConfig-Ids"

    .line 251
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/network/NetworkManager;->getClientCapabilities()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 256
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "X-Client-Capabilities"

    .line 257
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    :cond_4
    iget-object v1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->locationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

    if-eqz v1, :cond_5

    const/4 v2, 0x0

    .line 266
    :try_start_0
    invoke-interface {v1}, Lcom/shopkick/comm/GeoLocation$LocationProvider;->getCurrentLocation()Landroid/location/Location;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 268
    const-class v3, Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "GeoLocation.LocationProvider.getCurrentLocation() failed"

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    if-eqz v2, :cond_5

    .line 272
    sget-object v1, Lcom/shopkick/comm/GeoLocation;->HeaderName:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/comm/GeoLocation;->getHeaderValue(Landroid/location/Location;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    :cond_5
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {v1}, Lcom/shopkick/comm/DateHeader;->getHeaderValue(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 278
    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 279
    sget-object v2, Lcom/shopkick/comm/DateHeader;->HeaderName:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-object v0
.end method

.method private setIsFetching(Z)V
    .locals 3

    .line 186
    iget-boolean v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->isFetching:Z

    if-eq p1, v0, :cond_0

    .line 188
    iput-boolean p1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->isFetching:Z

    .line 189
    iget-object v1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->pcs:Ljava/beans/PropertyChangeSupport;

    const-string v2, "isFetching"

    invoke-virtual {v1, v2, v0, p1}, Ljava/beans/PropertyChangeSupport;->firePropertyChange(Ljava/lang/String;ZZ)V

    :cond_0
    return-void
.end method


# virtual methods
.method public addPropertyChangeListener(Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V
    .locals 1

    .line 476
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->pcs:Ljava/beans/PropertyChangeSupport;

    invoke-virtual {v0, p1, p2}, Ljava/beans/PropertyChangeSupport;->addPropertyChangeListener(Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V

    return-void
.end method

.method public cancel(Lcom/shopkick/app/fetchers/network/NetworkRequest;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x1

    .line 172
    invoke-static {v0, v1}, Lcom/shopkick/app/util/AsyncTaskUtils;->cancelTask(Landroid/os/AsyncTask;Z)Ljava/lang/Void;

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->requestCallbackMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    iget-object p1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    .line 178
    invoke-direct {p0, p1}, Lcom/shopkick/app/fetchers/network/NetworkManager;->setIsFetching(Z)V

    :cond_2
    return-void
.end method

.method public fetch(Lcom/shopkick/app/fetchers/network/NetworkRequest;Lcom/shopkick/app/fetchers/network/INetworkCallback;)V
    .locals 2

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    return-void

    .line 146
    :cond_1
    iget-boolean v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->showUrls:Z

    if-eqz v0, :cond_2

    .line 147
    const-class v0, Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/shopkick/app/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->requestCallbackMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    new-instance v0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;

    invoke-direct {p0}, Lcom/shopkick/app/fetchers/network/NetworkManager;->getHeaders()Ljava/util/HashMap;

    move-result-object v1

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;-><init>(Lcom/shopkick/app/fetchers/network/NetworkManager;Lcom/shopkick/app/fetchers/network/NetworkRequest;Lcom/shopkick/app/fetchers/network/INetworkCallback;Ljava/util/HashMap;)V

    .line 154
    iget-object p2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    iget-object p1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->threadpool:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, p1}, Lcom/shopkick/app/util/AsyncTaskUtils;->executeTask(Landroid/os/AsyncTask;Ljava/util/concurrent/Executor;)Ljava/lang/Void;

    const/4 p1, 0x1

    .line 157
    invoke-direct {p0, p1}, Lcom/shopkick/app/fetchers/network/NetworkManager;->setIsFetching(Z)V

    return-void

    :cond_3
    :goto_0
    return-void
.end method

.method public fetchInBackground(Lcom/shopkick/app/fetchers/network/NetworkRequest;Lcom/shopkick/app/fetchers/network/INetworkCallback;)Lcom/shopkick/app/fetchers/DataResponse;
    .locals 2

    .line 289
    new-instance v0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;

    invoke-direct {p0}, Lcom/shopkick/app/fetchers/network/NetworkManager;->getHeaders()Ljava/util/HashMap;

    move-result-object v1

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;-><init>(Lcom/shopkick/app/fetchers/network/NetworkManager;Lcom/shopkick/app/fetchers/network/NetworkRequest;Lcom/shopkick/app/fetchers/network/INetworkCallback;Ljava/util/HashMap;)V

    const/4 p1, 0x0

    .line 290
    new-array p1, p1, [Ljava/lang/Object;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->doInBackground([Ljava/lang/Object;)Lcom/shopkick/app/fetchers/DataResponse;

    move-result-object p1

    return-object p1
.end method

.method public isBackgroundEnabled()Z
    .locals 1

    .line 468
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->skConnMgr:Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;->isBackgroundEnabled()Z

    move-result v0

    return v0
.end method

.method public isFetching()Z
    .locals 1

    .line 472
    iget-boolean v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->isFetching:Z

    return v0
.end method

.method public removePropertyChangeListener(Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V
    .locals 1

    .line 480
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager;->pcs:Ljava/beans/PropertyChangeSupport;

    invoke-virtual {v0, p1, p2}, Ljava/beans/PropertyChangeSupport;->removePropertyChangeListener(Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V

    return-void
.end method
