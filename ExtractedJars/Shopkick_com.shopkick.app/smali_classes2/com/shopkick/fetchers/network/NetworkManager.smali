.class public Lcom/shopkick/fetchers/network/NetworkManager;
.super Ljava/lang/Object;
.source "NetworkManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;,
        Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;,
        Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;
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

.field private static final MAX_AUTH_RETRIES:I = 0x1

.field private static final MILLIS_CONNECTION_TIMEOUT:I = 0x1388

.field private static final MILLIS_SOCKET_TIMEOUT:I = 0x7530

.field private static final requestIdToAuthType:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private appInfo:Lcom/shopkick/app/application/AppInfo;

.field private final context:Landroid/content/Context;

.field private defaultNetworkResponseParseCallback:Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;

.field private devInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private enableForcedExperimentId:Z

.field private isFetching:Z

.field private final locationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

.field private networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

.field private networkTaskByRequestMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/fetchers/network/NetworkRequest;",
            "Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;",
            ">;"
        }
    .end annotation
.end field

.field private pcs:Ljava/beans/PropertyChangeSupport;

.field private requestCallbackMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/fetchers/network/NetworkRequest;",
            "Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;",
            ">;"
        }
    .end annotation
.end field

.field private final retryPolicyProvider:Lnet/toddm/comm/RetryPolicyProvider;

.field private serverTokenListener:Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;

.field private skConnMgr:Lcom/shopkick/fetchers/network/SKConnectivityManager;

.field private final threadpool:Ljava/util/concurrent/ExecutorService;

.field private final userAcct:Lcom/shopkick/app/application/Account;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 78
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Lcom/shopkick/fetchers/network/NetworkManager;->CPU_COUNT:I

    .line 80
    sget v0, Lcom/shopkick/fetchers/network/NetworkManager;->CPU_COUNT:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/shopkick/fetchers/network/NetworkManager;->CORE_POOL_SIZE:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    .line 82
    sput v0, Lcom/shopkick/fetchers/network/NetworkManager;->MAXIMUM_POOL_SIZE:I

    .line 99
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/shopkick/fetchers/network/NetworkManager;->requestIdToAuthType:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/fetchers/network/SKConnectivityManager;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/controllers/NetworkStatsCounter;Lcom/shopkick/comm/GeoLocation$LocationProvider;Z)V
    .locals 10

    move-object v0, p0

    move-object v1, p1

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    .line 120
    iput-object v2, v0, Lcom/shopkick/fetchers/network/NetworkManager;->serverTokenListener:Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;

    .line 180
    new-instance v2, Lcom/shopkick/fetchers/network/NetworkManager$1;

    .line 181
    invoke-static {}, Lcom/shopkick/utilities/DefaultCacheLoggingProvider;->getInstance()Lcom/shopkick/utilities/DefaultCacheLoggingProvider;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lcom/shopkick/fetchers/network/NetworkManager$1;-><init>(Lcom/shopkick/fetchers/network/NetworkManager;Lnet/toddm/cache/LoggingProvider;)V

    iput-object v2, v0, Lcom/shopkick/fetchers/network/NetworkManager;->retryPolicyProvider:Lnet/toddm/comm/RetryPolicyProvider;

    move-object v2, p2

    .line 131
    iput-object v2, v0, Lcom/shopkick/fetchers/network/NetworkManager;->skConnMgr:Lcom/shopkick/fetchers/network/SKConnectivityManager;

    move-object v2, p3

    .line 132
    iput-object v2, v0, Lcom/shopkick/fetchers/network/NetworkManager;->userAcct:Lcom/shopkick/app/application/Account;

    move-object v2, p4

    .line 133
    iput-object v2, v0, Lcom/shopkick/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    move-object v2, p5

    .line 134
    iput-object v2, v0, Lcom/shopkick/fetchers/network/NetworkManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    move-object/from16 v2, p6

    .line 135
    iput-object v2, v0, Lcom/shopkick/fetchers/network/NetworkManager;->networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

    .line 136
    new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v3, Lcom/shopkick/fetchers/network/NetworkManager;->CORE_POOL_SIZE:I

    sget v4, Lcom/shopkick/fetchers/network/NetworkManager;->MAXIMUM_POOL_SIZE:I

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const-wide/16 v5, 0x1

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v9, v0, Lcom/shopkick/fetchers/network/NetworkManager;->threadpool:Ljava/util/concurrent/ExecutorService;

    move/from16 v2, p8

    .line 141
    iput-boolean v2, v0, Lcom/shopkick/fetchers/network/NetworkManager;->enableForcedExperimentId:Z

    .line 142
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v0, Lcom/shopkick/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    .line 143
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v0, Lcom/shopkick/fetchers/network/NetworkManager;->requestCallbackMap:Ljava/util/HashMap;

    .line 144
    new-instance v2, Ljava/beans/PropertyChangeSupport;

    invoke-direct {v2, p0}, Ljava/beans/PropertyChangeSupport;-><init>(Ljava/lang/Object;)V

    iput-object v2, v0, Lcom/shopkick/fetchers/network/NetworkManager;->pcs:Ljava/beans/PropertyChangeSupport;

    .line 145
    iput-object v1, v0, Lcom/shopkick/fetchers/network/NetworkManager;->context:Landroid/content/Context;

    move-object/from16 v2, p7

    .line 146
    iput-object v2, v0, Lcom/shopkick/fetchers/network/NetworkManager;->locationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

    .line 147
    iget-object v2, v0, Lcom/shopkick/fetchers/network/NetworkManager;->retryPolicyProvider:Lnet/toddm/comm/RetryPolicyProvider;

    invoke-static {p1, v2}, Lcom/shopkick/comm/FetchersCommManagerAccessor;->initialize(Landroid/content/Context;Lnet/toddm/comm/RetryPolicyProvider;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/fetchers/network/NetworkManager;)Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->serverTokenListener:Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;

    return-object p0
.end method

.method static synthetic access$100()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .line 60
    sget-object v0, Lcom/shopkick/fetchers/network/NetworkManager;->requestIdToAuthType:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method static synthetic access$200(Lcom/shopkick/fetchers/network/NetworkManager;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/shopkick/fetchers/network/NetworkManager;->cancelWork(I)V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/fetchers/network/NetworkManager;)Lcom/shopkick/fetchers/network/SKConnectivityManager;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->skConnMgr:Lcom/shopkick/fetchers/network/SKConnectivityManager;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/fetchers/network/NetworkManager;)Lcom/shopkick/app/controllers/NetworkStatsCounter;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/fetchers/network/NetworkManager;)Ljava/util/HashMap;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->requestCallbackMap:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/fetchers/network/NetworkManager;)Ljava/util/HashMap;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/fetchers/network/NetworkManager;Z)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/shopkick/fetchers/network/NetworkManager;->setIsFetching(Z)V

    return-void
.end method

.method static synthetic access$800(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2}, Lcom/shopkick/fetchers/network/NetworkManager;->updateCookies(Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method

.method private cancelWork(I)V
    .locals 2

    .line 351
    sget-object v0, Lcom/shopkick/fetchers/network/NetworkManager;->requestIdToAuthType:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 352
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 353
    invoke-static {}, Lcom/shopkick/comm/FetchersCommManagerAccessor;->getInstance()Lnet/toddm/comm/CommManager;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Lnet/toddm/comm/CommManager;->cancel(IZ)V

    :cond_0
    return-void
.end method

.method public static createDefaultNetworkManager(Landroid/content/Context;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/controllers/NetworkStatsCounter;Lcom/shopkick/comm/GeoLocation$LocationProvider;Z)Lcom/shopkick/fetchers/network/NetworkManager;
    .locals 10

    const-string v0, "connectivity"

    move-object v2, p0

    .line 732
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 733
    new-instance v3, Lcom/shopkick/fetchers/network/SKConnectivityManager;

    invoke-direct {v3, v0}, Lcom/shopkick/fetchers/network/SKConnectivityManager;-><init>(Landroid/net/ConnectivityManager;)V

    .line 736
    invoke-static {p0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 738
    new-instance v0, Lcom/shopkick/fetchers/network/NetworkManager;

    move-object v1, v0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    move/from16 v9, p6

    invoke-direct/range {v1 .. v9}, Lcom/shopkick/fetchers/network/NetworkManager;-><init>(Landroid/content/Context;Lcom/shopkick/fetchers/network/SKConnectivityManager;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/controllers/NetworkStatsCounter;Lcom/shopkick/comm/GeoLocation$LocationProvider;Z)V

    return-object v0
.end method

.method private getClientCapabilities()Ljava/lang/String;
    .locals 3

    .line 374
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/DeviceInfo;->btEnabled()Z

    move-result v0

    const/4 v1, 0x0

    or-int/2addr v0, v1

    .line 376
    iget-object v2, p0, Lcom/shopkick/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->isRooted()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    or-int/2addr v0, v2

    .line 378
    iget-object v2, p0, Lcom/shopkick/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->isLocationFaked()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v1, 0x4

    :cond_1
    or-int/2addr v0, v1

    .line 379
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getDomainName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 697
    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 698
    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p0

    const-string/jumbo v0, "www."

    .line 699
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

    .line 701
    invoke-virtual {p0}, Ljava/net/URISyntaxException;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method

.method private setIsFetching(Z)V
    .locals 3

    .line 361
    iget-boolean v0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->isFetching:Z

    if-eq p1, v0, :cond_0

    .line 363
    iput-boolean p1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->isFetching:Z

    .line 364
    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->pcs:Ljava/beans/PropertyChangeSupport;

    const-string v2, "isFetching"

    invoke-virtual {v1, v2, v0, p1}, Ljava/beans/PropertyChangeSupport;->firePropertyChange(Ljava/lang/String;ZZ)V

    :cond_0
    return-void
.end method

.method private updateCookies(Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 675
    invoke-virtual {p2}, Lcom/shopkick/fetchers/DataResponse;->getCookies()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 677
    iget-object p1, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/fetchers/network/NetworkManager;->getDomainName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 678
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :catch_0
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 681
    :try_start_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public addPropertyChangeListener(Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V
    .locals 1

    .line 715
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->pcs:Ljava/beans/PropertyChangeSupport;

    invoke-virtual {v0, p1, p2}, Ljava/beans/PropertyChangeSupport;->addPropertyChangeListener(Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V

    return-void
.end method

.method public buildDataResponseFromCommWork(Lnet/toddm/comm/Work;Ljava/lang/Object;I)Lcom/shopkick/fetchers/DataResponse;
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_8

    const/4 v2, 0x0

    .line 623
    :try_start_0
    invoke-interface {p1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 624
    invoke-virtual {v3}, Lnet/toddm/comm/Response;->isSuccessful()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move v5, v1

    goto :goto_1

    .line 630
    :cond_1
    :goto_0
    invoke-interface {p1}, Lnet/toddm/comm/Work;->getException()Ljava/lang/Exception;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Lnet/toddm/comm/Work;->getException()Ljava/lang/Exception;

    move-result-object v4

    instance-of v4, v4, Ljava/net/SocketTimeoutException;

    if-eqz v4, :cond_2

    const/4 p3, 0x7

    move v5, v2

    goto :goto_1

    :cond_2
    if-eqz p3, :cond_3

    if-ne p3, v1, :cond_4

    .line 632
    :cond_3
    iget-object v4, p0, Lcom/shopkick/fetchers/network/NetworkManager;->skConnMgr:Lcom/shopkick/fetchers/network/SKConnectivityManager;

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/shopkick/fetchers/network/NetworkManager;->skConnMgr:Lcom/shopkick/fetchers/network/SKConnectivityManager;

    .line 633
    invoke-virtual {v4}, Lcom/shopkick/fetchers/network/SKConnectivityManager;->isNetworkConnected()Z

    move-result v4

    if-nez v4, :cond_4

    const/4 p3, 0x2

    move v5, v2

    goto :goto_1

    :cond_4
    if-nez p3, :cond_5

    move p3, v1

    move v5, v2

    goto :goto_1

    :cond_5
    move v5, v2

    .line 645
    :goto_1
    new-instance v11, Lcom/shopkick/fetchers/DataResponse;

    if-nez v3, :cond_6

    move v6, v2

    goto :goto_2

    .line 646
    :cond_6
    invoke-virtual {v3}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move v6, v4

    :goto_2
    if-nez v3, :cond_7

    move-object v9, v0

    goto :goto_3

    .line 649
    :cond_7
    invoke-virtual {v3}, Lnet/toddm/comm/Response;->getHeaders()Ljava/util/Map;

    move-result-object v3

    move-object v9, v3

    :goto_3
    move-object v4, v11

    move v7, p3

    move-object v8, p2

    move-object v10, p1

    invoke-direct/range {v4 .. v10}, Lcom/shopkick/fetchers/DataResponse;-><init>(ZIILjava/lang/Object;Ljava/util/Map;Lnet/toddm/comm/SubmittableWork;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v11

    goto :goto_4

    :catch_0
    move-exception v3

    move-object v7, v3

    .line 656
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v3, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    const-string v8, "buildDataResponseFromCommWork() request failed"

    new-array v9, v2, [Ljava/lang/Object;

    invoke-virtual/range {v4 .. v9}, Lcom/shopkick/logging/DiagnosticLogger;->w(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    .line 654
    :catch_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "buildDataResponseFromCommWork() request cancelled"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5, v6, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_8
    :goto_4
    if-nez v0, :cond_a

    .line 661
    new-instance v0, Lcom/shopkick/fetchers/DataResponse;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz p3, :cond_9

    move v5, p3

    goto :goto_5

    :cond_9
    move v5, v1

    :goto_5
    const/4 v7, 0x0

    move-object v2, v0

    move-object v6, p2

    move-object v8, p1

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/fetchers/DataResponse;-><init>(ZIILjava/lang/Object;Ljava/util/Map;Lnet/toddm/comm/SubmittableWork;)V

    :cond_a
    return-object v0
.end method

.method public cancel(Lcom/shopkick/fetchers/network/NetworkRequest;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 307
    :cond_0
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;

    if-nez v0, :cond_1

    return-void

    .line 313
    :cond_1
    invoke-virtual {p1}, Lcom/shopkick/fetchers/network/NetworkRequest;->getRequestWorkId()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 315
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/shopkick/fetchers/network/NetworkManager;->cancelWork(I)V

    goto :goto_0

    .line 320
    :cond_2
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/shopkick/fetchers/network/NetworkManager$2;

    invoke-direct {v2, p0, p1}, Lcom/shopkick/fetchers/network/NetworkManager$2;-><init>(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/fetchers/network/NetworkRequest;)V

    const-string v3, "cancel work thread"

    invoke-direct {v1, v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 333
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    :goto_0
    const/4 v1, 0x1

    .line 337
    invoke-static {v0, v1}, Lcom/shopkick/app/util/AsyncTaskUtils;->cancelTask(Landroid/os/AsyncTask;Z)Ljava/lang/Void;

    .line 338
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->requestCallbackMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    iget-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result p1

    if-nez p1, :cond_3

    const/4 p1, 0x0

    .line 342
    invoke-direct {p0, p1}, Lcom/shopkick/fetchers/network/NetworkManager;->setIsFetching(Z)V

    :cond_3
    return-void
.end method

.method public fetch(Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;Lcom/shopkick/fetchers/network/INetworkRequestFinishedCallback;Lnet/toddm/comm/SubmittableWork;)Lcom/shopkick/fetchers/AsyncRequestDetails;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p3, :cond_0

    goto :goto_0

    .line 260
    :cond_0
    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v0

    .line 266
    :cond_1
    new-instance v0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;

    invoke-direct {v0, p0, p2, p3}, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;-><init>(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;Lcom/shopkick/fetchers/network/INetworkRequestFinishedCallback;)V

    .line 268
    iget-object p2, p0, Lcom/shopkick/fetchers/network/NetworkManager;->requestCallbackMap:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    new-instance p2, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;

    invoke-direct {p2, p0, p1, v0, p4}, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;-><init>(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;Lnet/toddm/comm/SubmittableWork;)V

    .line 272
    iget-object p3, p0, Lcom/shopkick/fetchers/network/NetworkManager;->networkTaskByRequestMap:Ljava/util/HashMap;

    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    iget-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->threadpool:Ljava/util/concurrent/ExecutorService;

    invoke-static {p2, p1}, Lcom/shopkick/app/util/AsyncTaskUtils;->executeTask(Landroid/os/AsyncTask;Ljava/util/concurrent/Executor;)Ljava/lang/Void;

    const/4 p1, 0x1

    .line 274
    invoke-direct {p0, p1}, Lcom/shopkick/fetchers/network/NetworkManager;->setIsFetching(Z)V

    .line 276
    new-instance p1, Lcom/shopkick/fetchers/AsyncRequestDetails;

    invoke-direct {p1, p4}, Lcom/shopkick/fetchers/AsyncRequestDetails;-><init>(Lnet/toddm/comm/SubmittableWork;)V

    return-object p1

    :cond_2
    :goto_0
    return-object v0
.end method

.method public fetch(Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;Lnet/toddm/comm/SubmittableWork;)Lcom/shopkick/fetchers/DataResponse;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 293
    :cond_0
    new-instance v1, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;

    invoke-direct {v1, p0, p2, v0}, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;-><init>(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;Lcom/shopkick/fetchers/network/INetworkRequestFinishedCallback;)V

    .line 294
    new-instance p2, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;

    invoke-direct {p2, p0, p1, v1, p3}, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;-><init>(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;Lnet/toddm/comm/SubmittableWork;)V

    const/4 p3, 0x0

    .line 295
    new-array p3, p3, [Ljava/lang/Object;

    invoke-virtual {p2, p3}, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->doInBackground([Ljava/lang/Object;)Lcom/shopkick/fetchers/DataResponse;

    move-result-object p2

    .line 296
    invoke-direct {p0, p1, p2}, Lcom/shopkick/fetchers/network/NetworkManager;->updateCookies(Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/DataResponse;)V

    return-object p2
.end method

.method public getHeaders(Lcom/shopkick/fetchers/network/NetworkRequest;)Ljava/util/HashMap;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/fetchers/network/NetworkRequest;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 387
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 391
    invoke-virtual {p1}, Lcom/shopkick/fetchers/network/NetworkRequest;->getHeaders()Ljava/util/HashMap;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 392
    invoke-virtual {p1}, Lcom/shopkick/fetchers/network/NetworkRequest;->getHeaders()Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 399
    :cond_0
    iget-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->userAcct:Lcom/shopkick/app/application/Account;

    invoke-virtual {p1}, Lcom/shopkick/app/application/Account;->getUserId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v1, ""

    .line 400
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "X-User-Id"

    .line 401
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string p1, "X-Device"

    .line 407
    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "X-Sys"

    .line 408
    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/DeviceInfo;->getOsString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "X-Screen"

    .line 409
    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/DeviceInfo;->getScreenString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "X-Heap"

    .line 410
    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/DeviceInfo;->getHeapSize()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "X-Device-Id"

    .line 411
    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->devInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "X-App"

    .line 416
    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppInfo;->getAppString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "X-Sts"

    .line 420
    new-instance v1, Ljava/lang/Long;

    iget-object v2, p0, Lcom/shopkick/fetchers/network/NetworkManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppInfo;->getAppLaunchedTimestamp()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    iget-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppInfo;->getApiKey()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "X-API-Key"

    .line 423
    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppInfo;->getApiKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    :cond_2
    iget-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->userAcct:Lcom/shopkick/app/application/Account;

    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->context:Landroid/content/Context;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/application/Account;->getAdvertisingId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 427
    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "X-Adv-Id"

    .line 428
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    :cond_3
    iget-boolean p1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->enableForcedExperimentId:Z

    if-eqz p1, :cond_4

    .line 432
    iget-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->userAcct:Lcom/shopkick/app/application/Account;

    invoke-virtual {p1}, Lcom/shopkick/app/application/Account;->getExperimentId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 433
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_4

    const-string v1, "X-GroupConfig-Ids"

    .line 434
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    :cond_4
    invoke-direct {p0}, Lcom/shopkick/fetchers/network/NetworkManager;->getClientCapabilities()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 439
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    if-eq p1, v2, :cond_5

    const-string v2, "X-Client-Capabilities"

    .line 440
    invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    :cond_5
    iget-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->locationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

    if-eqz p1, :cond_6

    const/4 v2, 0x0

    .line 449
    :try_start_0
    invoke-interface {p1}, Lcom/shopkick/comm/GeoLocation$LocationProvider;->getCurrentLocation()Landroid/location/Location;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    .line 451
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object p1, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    .line 452
    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v7, "GeoLocation.LocationProvider.getCurrentLocation() failed"

    new-array v8, v1, [Ljava/lang/Object;

    .line 451
    invoke-virtual/range {v3 .. v8}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    if-eqz v2, :cond_6

    .line 456
    sget-object p1, Lcom/shopkick/comm/GeoLocation;->HeaderName:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/comm/GeoLocation;->getHeaderValue(Landroid/location/Location;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    :cond_6
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    invoke-static {p1}, Lcom/shopkick/comm/DateHeader;->getHeaderValue(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    .line 462
    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 463
    sget-object v1, Lcom/shopkick/comm/DateHeader;->HeaderName:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    return-object v0
.end method

.method public isBackgroundEnabled()Z
    .locals 1

    .line 707
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->skConnMgr:Lcom/shopkick/fetchers/network/SKConnectivityManager;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/network/SKConnectivityManager;->isBackgroundEnabled()Z

    move-result v0

    return v0
.end method

.method public isFetching()Z
    .locals 1

    .line 711
    iget-boolean v0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->isFetching:Z

    return v0
.end method

.method public removePropertyChangeListener(Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V
    .locals 1

    .line 719
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager;->pcs:Ljava/beans/PropertyChangeSupport;

    invoke-virtual {v0, p1, p2}, Ljava/beans/PropertyChangeSupport;->removePropertyChangeListener(Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V

    return-void
.end method

.method public setDefaultNetworkResponseParseCallback(Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->defaultNetworkResponseParseCallback:Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;

    return-void
.end method

.method public setServerTokenListener(Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager;->serverTokenListener:Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;

    return-void
.end method
