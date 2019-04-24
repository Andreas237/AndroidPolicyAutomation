.class public final Lnet/toddm/comm/CommManager;
.super Ljava/lang/Object;
.source "CommManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/toddm/comm/CommManager$Builder;,
        Lnet/toddm/comm/CommManager$ManagedQueue;,
        Lnet/toddm/comm/CommManager$WorkCallable;,
        Lnet/toddm/comm/CommManager$WorkManagementRunnable;
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$net$toddm$comm$CommManager$ManagedQueue:[I = null

.field private static final _AllowAllHostnamesVerifier:Ljavax/net/ssl/HostnameVerifier;

.field private static final _DependentWorkRetryIntervalMilliseconds:I = 0x14d

.field private static final _TrustAllCertsManagers:[Ljavax/net/ssl/TrustManager;


# instance fields
.field private final _activeWork:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lnet/toddm/comm/CommWork;",
            ">;"
        }
    .end annotation
.end field

.field private final _cacheProvider:Lnet/toddm/cache/CacheProvider;

.field private final _configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

.field private final _connectTimeoutMilliseconds:I

.field private final _disableSSLCertChecking:Z

.field private final _logger:Lnet/toddm/cache/LoggingProvider;

.field private final _maxSimultaneousRequests:I

.field private final _priorityManagmentProvider:Lnet/toddm/comm/PriorityManagementProvider;

.field private final _queuedWork:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lnet/toddm/comm/CommWork;",
            ">;"
        }
    .end annotation
.end field

.field private final _readTimeoutMilliseconds:I

.field private final _redirectLimit:I

.field private final _requestWorkExecutorService:Ljava/util/concurrent/ExecutorService;

.field private final _retryPolicyProvider:Lnet/toddm/comm/RetryPolicyProvider;

.field private final _retryWork:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lnet/toddm/comm/CommWork;",
            ">;"
        }
    .end annotation
.end field

.field private final _useBuiltInHttpURLConnectionRedirectionSupport:Z

.field private _workComparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lnet/toddm/comm/CommWork;",
            ">;"
        }
    .end annotation
.end field

.field private _workManagmentLock:Ljava/lang/Object;

.field private _workThread:Ljava/lang/Thread;

.field private _workThreadLock:Ljava/lang/Object;

.field private volatile _workThreadStopping:Z


# direct methods
.method static synthetic $SWITCH_TABLE$net$toddm$comm$CommManager$ManagedQueue()[I
    .locals 3

    .line 67
    sget-object v0, Lnet/toddm/comm/CommManager;->$SWITCH_TABLE$net$toddm$comm$CommManager$ManagedQueue:[I

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lnet/toddm/comm/CommManager$ManagedQueue;->values()[Lnet/toddm/comm/CommManager$ManagedQueue;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lnet/toddm/comm/CommManager$ManagedQueue;->ACTIVE:Lnet/toddm/comm/CommManager$ManagedQueue;

    invoke-virtual {v1}, Lnet/toddm/comm/CommManager$ManagedQueue;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Lnet/toddm/comm/CommManager$ManagedQueue;->QUEUED:Lnet/toddm/comm/CommManager$ManagedQueue;

    invoke-virtual {v1}, Lnet/toddm/comm/CommManager$ManagedQueue;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v1, Lnet/toddm/comm/CommManager$ManagedQueue;->RETRY:Lnet/toddm/comm/CommManager$ManagedQueue;

    invoke-virtual {v1}, Lnet/toddm/comm/CommManager$ManagedQueue;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    sput-object v0, Lnet/toddm/comm/CommManager;->$SWITCH_TABLE$net$toddm$comm$CommManager$ManagedQueue:[I

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    .line 567
    new-array v0, v0, [Ljavax/net/ssl/TrustManager;

    .line 568
    new-instance v1, Lnet/toddm/comm/CommManager$1;

    invoke-direct {v1}, Lnet/toddm/comm/CommManager$1;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 567
    sput-object v0, Lnet/toddm/comm/CommManager;->_TrustAllCertsManagers:[Ljavax/net/ssl/TrustManager;

    .line 579
    new-instance v0, Lnet/toddm/comm/CommManager$2;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$2;-><init>()V

    sput-object v0, Lnet/toddm/comm/CommManager;->_AllowAllHostnamesVerifier:Ljavax/net/ssl/HostnameVerifier;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lnet/toddm/cache/CacheProvider;Lnet/toddm/comm/PriorityManagementProvider;Lnet/toddm/comm/RetryPolicyProvider;Lnet/toddm/comm/ConfigurationProvider;Lnet/toddm/cache/LoggingProvider;)V
    .locals 2

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lnet/toddm/comm/CommManager;->_queuedWork:Ljava/util/LinkedList;

    .line 142
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnet/toddm/comm/CommManager;->_activeWork:Ljava/util/ArrayList;

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnet/toddm/comm/CommManager;->_retryWork:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 147
    iput-object v0, p0, Lnet/toddm/comm/CommManager;->_workThread:Ljava/lang/Thread;

    .line 148
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lnet/toddm/comm/CommManager;->_workThreadLock:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 149
    iput-boolean v0, p0, Lnet/toddm/comm/CommManager;->_workThreadStopping:Z

    .line 150
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lnet/toddm/comm/CommManager;->_workManagmentLock:Ljava/lang/Object;

    .line 672
    new-instance v1, Lnet/toddm/comm/CommManager$3;

    invoke-direct {v1, p0}, Lnet/toddm/comm/CommManager$3;-><init>(Lnet/toddm/comm/CommManager;)V

    iput-object v1, p0, Lnet/toddm/comm/CommManager;->_workComparator:Ljava/util/Comparator;

    .line 85
    iput-object p2, p0, Lnet/toddm/comm/CommManager;->_cacheProvider:Lnet/toddm/cache/CacheProvider;

    .line 86
    iput-object p3, p0, Lnet/toddm/comm/CommManager;->_priorityManagmentProvider:Lnet/toddm/comm/PriorityManagementProvider;

    .line 87
    iput-object p4, p0, Lnet/toddm/comm/CommManager;->_retryPolicyProvider:Lnet/toddm/comm/RetryPolicyProvider;

    .line 88
    iput-object p5, p0, Lnet/toddm/comm/CommManager;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    .line 89
    iput-object p6, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    .line 93
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    const-string p3, "redirect_limit"

    invoke-interface {p2, p3}, Lnet/toddm/comm/ConfigurationProvider;->contains(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 94
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    const-string p3, "redirect_limit"

    invoke-interface {p2, p3}, Lnet/toddm/comm/ConfigurationProvider;->getInt(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lnet/toddm/comm/CommManager;->_redirectLimit:I

    goto :goto_0

    :cond_0
    const/4 p2, 0x3

    .line 96
    iput p2, p0, Lnet/toddm/comm/CommManager;->_redirectLimit:I

    .line 98
    :goto_0
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    const-string p3, "max_simultaneous_requests"

    invoke-interface {p2, p3}, Lnet/toddm/comm/ConfigurationProvider;->contains(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 99
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    const-string p3, "max_simultaneous_requests"

    invoke-interface {p2, p3}, Lnet/toddm/comm/ConfigurationProvider;->getInt(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lnet/toddm/comm/CommManager;->_maxSimultaneousRequests:I

    goto :goto_1

    :cond_1
    const/4 p2, 0x2

    .line 101
    iput p2, p0, Lnet/toddm/comm/CommManager;->_maxSimultaneousRequests:I

    .line 103
    :goto_1
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    const-string p3, "connect_timeout_milliseconds"

    invoke-interface {p2, p3}, Lnet/toddm/comm/ConfigurationProvider;->contains(Ljava/lang/String;)Z

    move-result p2

    const/16 p3, 0x7530

    if-eqz p2, :cond_2

    .line 104
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    const-string p4, "connect_timeout_milliseconds"

    invoke-interface {p2, p4}, Lnet/toddm/comm/ConfigurationProvider;->getInt(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lnet/toddm/comm/CommManager;->_connectTimeoutMilliseconds:I

    goto :goto_2

    .line 106
    :cond_2
    iput p3, p0, Lnet/toddm/comm/CommManager;->_connectTimeoutMilliseconds:I

    .line 108
    :goto_2
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    const-string p4, "read_timeout_milliseconds"

    invoke-interface {p2, p4}, Lnet/toddm/comm/ConfigurationProvider;->contains(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 109
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    const-string p3, "read_timeout_milliseconds"

    invoke-interface {p2, p3}, Lnet/toddm/comm/ConfigurationProvider;->getInt(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lnet/toddm/comm/CommManager;->_readTimeoutMilliseconds:I

    goto :goto_3

    .line 111
    :cond_3
    iput p3, p0, Lnet/toddm/comm/CommManager;->_readTimeoutMilliseconds:I

    .line 113
    :goto_3
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    const-string p3, "disable_ssl_cert_checking"

    invoke-interface {p2, p3}, Lnet/toddm/comm/ConfigurationProvider;->contains(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 114
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    const-string p3, "disable_ssl_cert_checking"

    invoke-interface {p2, p3}, Lnet/toddm/comm/ConfigurationProvider;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    iput-boolean p2, p0, Lnet/toddm/comm/CommManager;->_disableSSLCertChecking:Z

    goto :goto_4

    .line 116
    :cond_4
    iput-boolean v0, p0, Lnet/toddm/comm/CommManager;->_disableSSLCertChecking:Z

    .line 118
    :goto_4
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    const-string p3, "use_built_in_http_url_connection_redirection_support"

    invoke-interface {p2, p3}, Lnet/toddm/comm/ConfigurationProvider;->contains(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 119
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    const-string p3, "use_built_in_http_url_connection_redirection_support"

    invoke-interface {p2, p3}, Lnet/toddm/comm/ConfigurationProvider;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    iput-boolean p2, p0, Lnet/toddm/comm/CommManager;->_useBuiltInHttpURLConnectionRedirectionSupport:Z

    goto :goto_5

    .line 121
    :cond_5
    iput-boolean v0, p0, Lnet/toddm/comm/CommManager;->_useBuiltInHttpURLConnectionRedirectionSupport:Z

    .line 124
    :goto_5
    iget p2, p0, Lnet/toddm/comm/CommManager;->_maxSimultaneousRequests:I

    invoke-static {p2}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    iput-object p2, p0, Lnet/toddm/comm/CommManager;->_requestWorkExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 126
    invoke-direct {p0, p1}, Lnet/toddm/comm/CommManager;->startWorking(Ljava/lang/String;)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lnet/toddm/cache/CacheProvider;Lnet/toddm/comm/PriorityManagementProvider;Lnet/toddm/comm/RetryPolicyProvider;Lnet/toddm/comm/ConfigurationProvider;Lnet/toddm/cache/LoggingProvider;Lnet/toddm/comm/CommManager;)V
    .locals 0

    .line 77
    invoke-direct/range {p0 .. p6}, Lnet/toddm/comm/CommManager;-><init>(Ljava/lang/String;Lnet/toddm/cache/CacheProvider;Lnet/toddm/comm/PriorityManagementProvider;Lnet/toddm/comm/RetryPolicyProvider;Lnet/toddm/comm/ConfigurationProvider;Lnet/toddm/cache/LoggingProvider;)V

    return-void
.end method

.method static synthetic access$0(Lnet/toddm/comm/CommManager;)Lnet/toddm/comm/PriorityManagementProvider;
    .locals 0

    .line 153
    iget-object p0, p0, Lnet/toddm/comm/CommManager;->_priorityManagmentProvider:Lnet/toddm/comm/PriorityManagementProvider;

    return-object p0
.end method

.method static synthetic access$1(Lnet/toddm/comm/CommManager;)Z
    .locals 0

    .line 149
    iget-boolean p0, p0, Lnet/toddm/comm/CommManager;->_workThreadStopping:Z

    return p0
.end method

.method static synthetic access$10(Lnet/toddm/comm/CommManager;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 140
    iget-object p0, p0, Lnet/toddm/comm/CommManager;->_requestWorkExecutorService:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method static synthetic access$11(Lnet/toddm/comm/CommManager;)J
    .locals 2

    .line 517
    invoke-direct {p0}, Lnet/toddm/comm/CommManager;->getNextRetryInterval()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic access$12(Lnet/toddm/comm/CommManager;)Z
    .locals 0

    .line 137
    iget-boolean p0, p0, Lnet/toddm/comm/CommManager;->_disableSSLCertChecking:Z

    return p0
.end method

.method static synthetic access$13()[Ljavax/net/ssl/TrustManager;
    .locals 1

    .line 567
    sget-object v0, Lnet/toddm/comm/CommManager;->_TrustAllCertsManagers:[Ljavax/net/ssl/TrustManager;

    return-object v0
.end method

.method static synthetic access$14()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 579
    sget-object v0, Lnet/toddm/comm/CommManager;->_AllowAllHostnamesVerifier:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method static synthetic access$15(Lnet/toddm/comm/CommManager;)Z
    .locals 0

    .line 138
    iget-boolean p0, p0, Lnet/toddm/comm/CommManager;->_useBuiltInHttpURLConnectionRedirectionSupport:Z

    return p0
.end method

.method static synthetic access$16(Lnet/toddm/comm/CommManager;)I
    .locals 0

    .line 135
    iget p0, p0, Lnet/toddm/comm/CommManager;->_connectTimeoutMilliseconds:I

    return p0
.end method

.method static synthetic access$17(Lnet/toddm/comm/CommManager;)I
    .locals 0

    .line 136
    iget p0, p0, Lnet/toddm/comm/CommManager;->_readTimeoutMilliseconds:I

    return p0
.end method

.method static synthetic access$18(Lnet/toddm/comm/CommManager;)Lnet/toddm/comm/RetryPolicyProvider;
    .locals 0

    .line 154
    iget-object p0, p0, Lnet/toddm/comm/CommManager;->_retryPolicyProvider:Lnet/toddm/comm/RetryPolicyProvider;

    return-object p0
.end method

.method static synthetic access$19(Lnet/toddm/comm/CommManager;)I
    .locals 0

    .line 133
    iget p0, p0, Lnet/toddm/comm/CommManager;->_redirectLimit:I

    return p0
.end method

.method static synthetic access$2(Lnet/toddm/comm/CommManager;)Ljava/lang/Object;
    .locals 0

    .line 150
    iget-object p0, p0, Lnet/toddm/comm/CommManager;->_workManagmentLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$20(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/CacheProvider;
    .locals 0

    .line 152
    iget-object p0, p0, Lnet/toddm/comm/CommManager;->_cacheProvider:Lnet/toddm/cache/CacheProvider;

    return-object p0
.end method

.method static synthetic access$21(Lnet/toddm/comm/CommManager;Lnet/toddm/cache/CacheEntry;)Lnet/toddm/comm/Response;
    .locals 0

    .line 409
    invoke-direct {p0, p1}, Lnet/toddm/comm/CommManager;->getResponseFromCacheEntry(Lnet/toddm/cache/CacheEntry;)Lnet/toddm/comm/Response;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$22(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/Work;)V
    .locals 0

    .line 546
    invoke-direct {p0, p1}, Lnet/toddm/comm/CommManager;->removeWork(Lnet/toddm/comm/Work;)V

    return-void
.end method

.method static synthetic access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;
    .locals 0

    .line 156
    iget-object p0, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    return-object p0
.end method

.method static synthetic access$4(Lnet/toddm/comm/CommManager;)Ljava/util/LinkedList;
    .locals 0

    .line 141
    iget-object p0, p0, Lnet/toddm/comm/CommManager;->_queuedWork:Ljava/util/LinkedList;

    return-object p0
.end method

.method static synthetic access$5(Lnet/toddm/comm/CommManager;)Ljava/util/ArrayList;
    .locals 0

    .line 142
    iget-object p0, p0, Lnet/toddm/comm/CommManager;->_activeWork:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$6(Lnet/toddm/comm/CommManager;)Ljava/util/ArrayList;
    .locals 0

    .line 143
    iget-object p0, p0, Lnet/toddm/comm/CommManager;->_retryWork:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$7(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommManager$ManagedQueue;)V
    .locals 0

    .line 436
    invoke-direct {p0, p1, p2}, Lnet/toddm/comm/CommManager;->addWorkToQueue(Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommManager$ManagedQueue;)V

    return-void
.end method

.method static synthetic access$8(Lnet/toddm/comm/CommManager;)I
    .locals 0

    .line 134
    iget p0, p0, Lnet/toddm/comm/CommManager;->_maxSimultaneousRequests:I

    return p0
.end method

.method static synthetic access$9(Lnet/toddm/comm/CommManager;)Ljava/util/Comparator;
    .locals 0

    .line 672
    iget-object p0, p0, Lnet/toddm/comm/CommManager;->_workComparator:Ljava/util/Comparator;

    return-object p0
.end method

.method private addNewWork(Lnet/toddm/comm/CommWork;)V
    .locals 6

    .line 396
    new-instance v0, Ljava/util/concurrent/FutureTask;

    new-instance v1, Lnet/toddm/comm/CommManager$WorkCallable;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lnet/toddm/comm/CommManager$WorkCallable;-><init>(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommManager$WorkCallable;)V

    invoke-direct {v0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-virtual {p1, v0}, Lnet/toddm/comm/CommWork;->addFutureTask(Ljava/util/concurrent/FutureTask;)V

    .line 397
    sget-object v0, Lnet/toddm/comm/CommManager$ManagedQueue;->QUEUED:Lnet/toddm/comm/CommManager$ManagedQueue;

    invoke-direct {p0, p1, v0}, Lnet/toddm/comm/CommManager;->addWorkToQueue(Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommManager$ManagedQueue;)V

    .line 398
    sget-object v0, Lnet/toddm/comm/Work$Status;->WAITING:Lnet/toddm/comm/Work$Status;

    invoke-virtual {p1, v0}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    .line 399
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v0, :cond_0

    const-string v1, "[thread:%1$d] enqueueWork() Added new work [id:%2$d]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-virtual {p1}, Lnet/toddm/comm/CommWork;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-interface {v0, v1, v2}, Lnet/toddm/cache/LoggingProvider;->info(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    :cond_0
    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_workManagmentLock:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    return-void
.end method

.method private addWorkToQueue(Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommManager$ManagedQueue;)V
    .locals 3

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 443
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_queuedWork:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 444
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_activeWork:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 445
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_retryWork:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 446
    invoke-static {}, Lnet/toddm/comm/CommManager;->$SWITCH_TABLE$net$toddm$comm$CommManager$ManagedQueue()[I

    move-result-object v0

    invoke-virtual {p2}, Lnet/toddm/comm/CommManager$ManagedQueue;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 451
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p2}, Lnet/toddm/comm/CommManager$ManagedQueue;->name()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v1, v2

    const-string p2, "Unsupported queue type [%1$s]"

    invoke-static {v0, p2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 449
    :pswitch_0
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_retryWork:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 448
    :pswitch_1
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_activeWork:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 447
    :pswitch_2
    iget-object p2, p0, Lnet/toddm/comm/CommManager;->_queuedWork:Ljava/util/LinkedList;

    invoke-virtual {p2, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void

    .line 440
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'queue\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 439
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'work\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private getExistingWork(Lnet/toddm/comm/CommWork;)Lnet/toddm/comm/CommWork;
    .locals 1

    .line 375
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_queuedWork:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 377
    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_queuedWork:Ljava/util/LinkedList;

    invoke-virtual {p1, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/toddm/comm/CommWork;

    return-object p1

    .line 379
    :cond_0
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_activeWork:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_1

    .line 381
    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_activeWork:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/toddm/comm/CommWork;

    return-object p1

    .line 383
    :cond_1
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_retryWork:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_2

    .line 385
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_retryWork:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/toddm/comm/CommWork;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private getNextRetryInterval()J
    .locals 10

    .line 523
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 524
    iget-object v2, p0, Lnet/toddm/comm/CommManager;->_retryWork:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide v3, 0x7fffffffffffffffL

    move-wide v5, v3

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_4

    const-wide/16 v0, 0x14

    cmp-long v2, v5, v0

    if-gez v2, :cond_1

    goto :goto_1

    :cond_1
    move-wide v0, v5

    :goto_1
    cmp-long v2, v0, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_2

    .line 534
    iget-object v2, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v2, :cond_3

    const-string v5, "[thread:%1$d] getNextRetryInterval() returning MAX_VALUE"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v3, v4

    invoke-interface {v2, v5, v3}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 536
    :cond_2
    iget-object v2, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v2, :cond_3

    const-string v5, "[thread:%1$d] getNextRetryInterval() returning {} milliseconds"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->getId()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v6, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v6, v3

    invoke-interface {v2, v5, v6}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_2
    return-wide v0

    .line 524
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lnet/toddm/comm/CommWork;

    .line 525
    invoke-virtual {v7}, Lnet/toddm/comm/CommWork;->getRetryAfterTimestamp()J

    move-result-wide v7

    sub-long/2addr v7, v0

    cmp-long v9, v7, v5

    if-gez v9, :cond_0

    move-wide v5, v7

    goto :goto_0
.end method

.method private getResponseFromCacheEntry(Lnet/toddm/cache/CacheEntry;)Lnet/toddm/comm/Response;
    .locals 7

    .line 412
    invoke-virtual {p1}, Lnet/toddm/cache/CacheEntry;->getBytesValue()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lnet/toddm/cache/CacheEntry;->getBytesValue()[B

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_4

    .line 418
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p1}, Lnet/toddm/cache/CacheEntry;->getBytesValue()[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 419
    :try_start_1
    new-instance p1, Ljava/io/ObjectInputStream;

    invoke-direct {p1, v0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 420
    :try_start_2
    invoke-interface {p1}, Ljava/io/ObjectInput;->readObject()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/toddm/comm/Response;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 425
    :try_start_3
    invoke-interface {p1}, Ljava/io/ObjectInput;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 426
    :catch_0
    :try_start_4
    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    move-object v1, v2

    goto :goto_2

    :catch_2
    move-exception v2

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v6, v1

    move-object v1, p1

    move-object p1, v6

    goto :goto_1

    :catch_3
    move-exception v2

    move-object p1, v1

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object v0, v1

    move-object v1, p1

    move-object p1, v0

    goto :goto_1

    :catch_4
    move-exception v2

    move-object p1, v1

    move-object v0, p1

    .line 423
    :goto_0
    :try_start_5
    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v4, "Response de-serialization from cache failed"

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-interface {v3, v2, v4, v5}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_0
    if-eqz p1, :cond_1

    .line 425
    :try_start_6
    invoke-interface {p1}, Ljava/io/ObjectInput;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    :catch_5
    :cond_1
    if-eqz v0, :cond_4

    .line 426
    :try_start_7
    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_8

    goto :goto_2

    :catchall_2
    move-exception v1

    :goto_1
    if-eqz p1, :cond_2

    .line 425
    :try_start_8
    invoke-interface {p1}, Ljava/io/ObjectInput;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    :catch_6
    :cond_2
    if-eqz v0, :cond_3

    .line 426
    :try_start_9
    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7

    .line 427
    :catch_7
    :cond_3
    throw v1

    :catch_8
    :cond_4
    :goto_2
    return-object v1
.end method

.method private getWorkFromList(ILjava/util/List;)Lnet/toddm/comm/CommWork;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lnet/toddm/comm/CommWork;",
            ">;)",
            "Lnet/toddm/comm/CommWork;"
        }
    .end annotation

    .line 362
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/toddm/comm/CommWork;

    .line 363
    invoke-virtual {v0}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v1

    if-ne v1, p1, :cond_0

    return-object v0
.end method

.method private removeWork(Lnet/toddm/comm/Work;)V
    .locals 8

    .line 549
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_queuedWork:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    .line 550
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v0, :cond_0

    const-string v4, "[thread:%1$d][request:%2$d] Work has been removed from _queuedWork"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-interface {p1}, Lnet/toddm/comm/Work;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-interface {v0, v4, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 552
    :cond_0
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_activeWork:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 553
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v0, :cond_1

    const-string v4, "[thread:%1$d][request:%2$d] Work has been removed from _activeWork"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-interface {p1}, Lnet/toddm/comm/Work;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-interface {v0, v4, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    :cond_1
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_retryWork:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 556
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v0, :cond_2

    const-string v4, "[thread:%1$d][request:%2$d] Work has been removed from _retryWork"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v3, v2

    invoke-interface {p1}, Lnet/toddm/comm/Work;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v1

    invoke-interface {v0, v4, v3}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method private startWorking(Ljava/lang/String;)V
    .locals 8

    .line 464
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const-string v3, "[thread:%1$d] startWorking()"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-interface {v0, v3, v4}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    :cond_0
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_workThreadLock:Ljava/lang/Object;

    monitor-enter v0

    .line 466
    :try_start_0
    iput-boolean v2, p0, Lnet/toddm/comm/CommManager;->_workThreadStopping:Z

    .line 467
    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_workThread:Ljava/lang/Thread;

    if-nez v3, :cond_1

    .line 468
    new-instance v3, Ljava/lang/Thread;

    new-instance v4, Lnet/toddm/comm/CommManager$WorkManagementRunnable;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lnet/toddm/comm/CommManager$WorkManagementRunnable;-><init>(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommManager$WorkManagementRunnable;)V

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "CommManager Work Thread [%1$s]"

    new-array v7, v1, [Ljava/lang/Object;

    aput-object p1, v7, v2

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, v4, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v3, p0, Lnet/toddm/comm/CommManager;->_workThread:Ljava/lang/Thread;

    .line 470
    :cond_1
    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_workThread:Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->isAlive()Z

    move-result p1

    if-nez p1, :cond_2

    .line 471
    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_workThread:Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 472
    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v3, "[thread:%1$d] Thread started"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-interface {p1, v3, v1}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 474
    :cond_2
    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v3, "[thread:%1$d] Thread already running"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-interface {p1, v3, v1}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    :cond_3
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private stopWorking()V
    .locals 10

    .line 482
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const-string v3, "[thread:%1$d] stopWorking()"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-interface {v0, v3, v4}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    :cond_0
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_workThreadLock:Ljava/lang/Object;

    monitor-enter v0

    .line 486
    :try_start_0
    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_workThread:Ljava/lang/Thread;

    if-nez v3, :cond_2

    .line 487
    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v4, "[thread:%1$d] Thread already stopped"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v2, v1

    invoke-interface {v3, v4, v2}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    :cond_1
    monitor-exit v0

    return-void

    .line 492
    :cond_2
    iput-boolean v2, p0, Lnet/toddm/comm/CommManager;->_workThreadStopping:Z

    .line 493
    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v4, "[thread:%1$d] kicking work thread"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-interface {v3, v4, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    :cond_3
    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_workManagmentLock:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v4, p0, Lnet/toddm/comm/CommManager;->_workManagmentLock:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->notify()V

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v3, 0x0

    .line 498
    :try_start_2
    iget-object v4, p0, Lnet/toddm/comm/CommManager;->_workThread:Ljava/lang/Thread;

    const-wide/16 v5, 0x7d0

    invoke-virtual {v4, v5, v6}, Ljava/lang/Thread;->join(J)V

    .line 499
    iget-object v4, p0, Lnet/toddm/comm/CommManager;->_workThread:Ljava/lang/Thread;

    invoke-virtual {v4}, Ljava/lang/Thread;->interrupt()V

    .line 500
    iget-object v4, p0, Lnet/toddm/comm/CommManager;->_workThread:Ljava/lang/Thread;

    invoke-virtual {v4}, Ljava/lang/Thread;->join()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 506
    :try_start_3
    iput-object v3, p0, Lnet/toddm/comm/CommManager;->_workThread:Ljava/lang/Thread;

    .line 507
    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v3, :cond_6

    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v4, "[thread:%1$d] Thread stopped"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v2, v1

    :goto_0
    invoke-interface {v3, v4, v2}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_0
    move-exception v4

    goto :goto_2

    :catch_0
    move-exception v4

    .line 504
    :try_start_4
    iget-object v5, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v5, :cond_4

    iget-object v5, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v6, "[thread:%1$d] failed"

    new-array v7, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Thread;->getId()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v7, v1

    invoke-interface {v5, v4, v6, v7}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 506
    :cond_4
    :try_start_5
    iput-object v3, p0, Lnet/toddm/comm/CommManager;->_workThread:Ljava/lang/Thread;

    .line 507
    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v3, :cond_6

    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v4, "[thread:%1$d] Thread stopped"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v2, v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_0

    .line 502
    :catch_1
    :try_start_6
    iget-object v4, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v4, :cond_5

    iget-object v4, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v5, "[thread:%1$d] Thread received an interrupt"

    new-array v6, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->getId()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-interface {v4, v5, v6}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 506
    :cond_5
    :try_start_7
    iput-object v3, p0, Lnet/toddm/comm/CommManager;->_workThread:Ljava/lang/Thread;

    .line 507
    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v3, :cond_6

    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v4, "[thread:%1$d] Thread stopped"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v2, v1

    goto :goto_0

    .line 483
    :cond_6
    :goto_1
    monitor-exit v0

    return-void

    .line 506
    :goto_2
    iput-object v3, p0, Lnet/toddm/comm/CommManager;->_workThread:Ljava/lang/Thread;

    .line 507
    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v3, :cond_7

    iget-object v3, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v5, "[thread:%1$d] Thread stopped"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v2, v1

    invoke-interface {v3, v5, v2}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    :cond_7
    throw v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_1
    move-exception v1

    .line 494
    :try_start_8
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    throw v1

    :catchall_2
    move-exception v1

    .line 483
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    throw v1
.end method


# virtual methods
.method public cancel(IZ)V
    .locals 5

    .line 309
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_workManagmentLock:Ljava/lang/Object;

    monitor-enter v0

    .line 312
    :try_start_0
    iget-object v1, p0, Lnet/toddm/comm/CommManager;->_queuedWork:Ljava/util/LinkedList;

    invoke-direct {p0, p1, v1}, Lnet/toddm/comm/CommManager;->getWorkFromList(ILjava/util/List;)Lnet/toddm/comm/CommWork;

    move-result-object v1

    if-nez v1, :cond_0

    .line 314
    iget-object v1, p0, Lnet/toddm/comm/CommManager;->_retryWork:Ljava/util/ArrayList;

    invoke-direct {p0, p1, v1}, Lnet/toddm/comm/CommManager;->getWorkFromList(ILjava/util/List;)Lnet/toddm/comm/CommWork;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_1

    .line 317
    iget-object v1, p0, Lnet/toddm/comm/CommManager;->_activeWork:Ljava/util/ArrayList;

    invoke-direct {p0, p1, v1}, Lnet/toddm/comm/CommManager;->getWorkFromList(ILjava/util/List;)Lnet/toddm/comm/CommWork;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_3

    .line 319
    invoke-virtual {v1}, Lnet/toddm/comm/CommWork;->isDone()Z

    move-result p1

    if-nez p1, :cond_3

    .line 322
    invoke-direct {p0, v1}, Lnet/toddm/comm/CommManager;->removeWork(Lnet/toddm/comm/Work;)V

    .line 323
    invoke-virtual {v1, p2}, Lnet/toddm/comm/CommWork;->cancel(Z)V

    .line 324
    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string p2, "[thread:%1$d] Kicking work thread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-interface {p1, p2, v1}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    :cond_2
    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_workManagmentLock:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 309
    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Lnet/toddm/comm/Request$RequestMethod;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lnet/toddm/comm/Priority$StartingPriority;",
            "Lnet/toddm/cache/CachePriority;",
            "Lnet/toddm/comm/CacheBehavior;",
            ")",
            "Lnet/toddm/comm/Work;"
        }
    .end annotation

    .line 209
    invoke-virtual/range {p0 .. p8}, Lnet/toddm/comm/CommManager;->getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/toddm/comm/CommManager;->enqueueWork(Lnet/toddm/comm/SubmittableWork;)Lnet/toddm/comm/Work;

    move-result-object p1

    return-object p1
.end method

.method public enqueueWork(Lnet/toddm/comm/SubmittableWork;)Lnet/toddm/comm/Work;
    .locals 14

    if-eqz p1, :cond_d

    .line 221
    instance-of v0, p1, Lnet/toddm/comm/CommWork;

    if-eqz v0, :cond_c

    .line 223
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const-string v3, "[thread:%1$d] enqueueWork() start"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-interface {v0, v3, v4}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    :cond_0
    check-cast p1, Lnet/toddm/comm/CommWork;

    .line 229
    sget-object v0, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual {p1}, Lnet/toddm/comm/CommWork;->getCachingBehavior()Lnet/toddm/comm/CacheBehavior;

    move-result-object v3

    invoke-virtual {v0, v3}, Lnet/toddm/comm/CacheBehavior;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_3

    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_cacheProvider:Lnet/toddm/cache/CacheProvider;

    if-eqz v0, :cond_3

    .line 232
    invoke-virtual {p1}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v4

    invoke-virtual {v4}, Lnet/toddm/comm/Request;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v2}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 234
    invoke-virtual {p1, v0}, Lnet/toddm/comm/CommWork;->setCachedResponse(Lnet/toddm/cache/CacheEntry;)V

    .line 237
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExceededStaleUse()Z

    move-result v4

    if-nez v4, :cond_2

    .line 238
    :cond_1
    invoke-direct {p0, v0}, Lnet/toddm/comm/CommManager;->getResponseFromCacheEntry(Lnet/toddm/cache/CacheEntry;)Lnet/toddm/comm/Response;

    move-result-object v4

    goto :goto_0

    :cond_2
    move-object v4, v3

    goto :goto_0

    :cond_3
    move-object v0, v3

    move-object v4, v0

    .line 244
    :goto_0
    iget-object v11, p0, Lnet/toddm/comm/CommManager;->_workManagmentLock:Ljava/lang/Object;

    monitor-enter v11

    .line 247
    :try_start_0
    invoke-direct {p0, p1}, Lnet/toddm/comm/CommManager;->getExistingWork(Lnet/toddm/comm/CommWork;)Lnet/toddm/comm/CommWork;

    move-result-object v12

    const/4 v13, 0x2

    if-eqz v4, :cond_7

    .line 252
    new-instance v3, Lnet/toddm/comm/CachedWork;

    invoke-virtual {p1}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v6

    invoke-virtual {p1}, Lnet/toddm/comm/CommWork;->getRequestPriority()Lnet/toddm/comm/Priority;

    move-result-object v8

    invoke-virtual {p1}, Lnet/toddm/comm/CommWork;->getCachingPriority()Lnet/toddm/cache/CachePriority;

    move-result-object v9

    invoke-virtual {p1}, Lnet/toddm/comm/CommWork;->getCachingBehavior()Lnet/toddm/comm/CacheBehavior;

    move-result-object v10

    move-object v5, v3

    move-object v7, v4

    invoke-direct/range {v5 .. v10}, Lnet/toddm/comm/CachedWork;-><init>(Lnet/toddm/comm/Request;Lnet/toddm/comm/Response;Lnet/toddm/comm/Priority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)V

    .line 253
    iget-object v5, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v5, :cond_4

    .line 254
    iget-object v5, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v6, "[thread:%1$d] enqueueWork() Returning cached results [id:%2$d][hasExpired:%3$s]"

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Thread;->getId()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v7, v1

    invoke-virtual {p1}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v7, v2

    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v7, v13

    invoke-interface {v5, v6, v7}, Lnet/toddm/cache/LoggingProvider;->info(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    :cond_4
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v0

    if-eqz v0, :cond_5

    if-nez v12, :cond_6

    .line 261
    invoke-direct {p0, p1}, Lnet/toddm/comm/CommManager;->addNewWork(Lnet/toddm/comm/CommWork;)V

    goto :goto_1

    .line 266
    :cond_5
    invoke-virtual {p1, v4}, Lnet/toddm/comm/CommWork;->setResponse(Lnet/toddm/comm/Response;)V

    .line 267
    sget-object v0, Lnet/toddm/comm/Work$Status;->COMPLETED:Lnet/toddm/comm/Work$Status;

    invoke-virtual {p1, v0}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    .line 268
    new-instance v0, Lnet/toddm/comm/CachedResponseFuture;

    invoke-direct {v0, v4}, Lnet/toddm/comm/CachedResponseFuture;-><init>(Lnet/toddm/comm/Response;)V

    invoke-virtual {p1, v0}, Lnet/toddm/comm/CommWork;->addFutureTask(Ljava/util/concurrent/FutureTask;)V

    :cond_6
    :goto_1
    move-object p1, v3

    goto :goto_2

    :cond_7
    if-eqz v12, :cond_9

    .line 278
    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v0, "[thread:%1$d] enqueueWork() Returning already enqueued work [id:%2$d]"

    new-array v3, v13, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-virtual {v12}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v2

    invoke-interface {p1, v0, v3}, Lnet/toddm/cache/LoggingProvider;->info(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_8
    move-object p1, v12

    goto :goto_2

    .line 280
    :cond_9
    sget-object v0, Lnet/toddm/comm/CacheBehavior;->GET_ONLY_FROM_CACHE:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual {p1}, Lnet/toddm/comm/CommWork;->getCachingBehavior()Lnet/toddm/comm/CacheBehavior;

    move-result-object v4

    invoke-virtual {v0, v4}, Lnet/toddm/comm/CacheBehavior;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 283
    invoke-virtual {p1, v3}, Lnet/toddm/comm/CommWork;->setResponse(Lnet/toddm/comm/Response;)V

    .line 284
    sget-object v0, Lnet/toddm/comm/Work$Status;->COMPLETED:Lnet/toddm/comm/Work$Status;

    invoke-virtual {p1, v0}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    .line 285
    new-instance v0, Lnet/toddm/comm/NoResponseFuture;

    invoke-direct {v0}, Lnet/toddm/comm/NoResponseFuture;-><init>()V

    invoke-virtual {p1, v0}, Lnet/toddm/comm/CommWork;->addFutureTask(Ljava/util/concurrent/FutureTask;)V

    .line 286
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    const-string v3, "[thread:%1$d] enqueueWork() Returning null results [id:%2$d]"

    new-array v4, v13, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-virtual {p1}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v2

    invoke-interface {v0, v3, v4}, Lnet/toddm/cache/LoggingProvider;->info(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 292
    :cond_a
    invoke-direct {p0, p1}, Lnet/toddm/comm/CommManager;->addNewWork(Lnet/toddm/comm/CommWork;)V

    .line 244
    :cond_b
    :goto_2
    monitor-exit v11

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 221
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported \'work\' implmenetation: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'work\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Lnet/toddm/comm/Request$RequestMethod;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lnet/toddm/comm/Priority$StartingPriority;",
            "Lnet/toddm/cache/CachePriority;",
            "Lnet/toddm/comm/CacheBehavior;",
            ")",
            "Lnet/toddm/comm/SubmittableWork;"
        }
    .end annotation

    .line 183
    new-instance v10, Lnet/toddm/comm/CommWork;

    move-object v11, p0

    iget-object v9, v11, Lnet/toddm/comm/CommManager;->_logger:Lnet/toddm/cache/LoggingProvider;

    move-object v0, v10

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lnet/toddm/comm/CommWork;-><init>(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;Lnet/toddm/cache/LoggingProvider;)V

    return-object v10
.end method

.method public invalidateCache(I)V
    .locals 23

    move-object/from16 v0, p0

    .line 334
    iget-object v1, v0, Lnet/toddm/comm/CommManager;->_cacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 336
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getStringValue()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 337
    iget-object v3, v0, Lnet/toddm/comm/CommManager;->_cacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getStringValue()Ljava/lang/String;

    move-result-object v5

    const-wide/16 v6, 0x0

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getMaxStale()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getEtag()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getUri()Ljava/net/URI;

    move-result-object v11

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getPriority()Lnet/toddm/cache/CachePriority;

    move-result-object v12

    invoke-interface/range {v3 .. v12}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    goto :goto_0

    .line 339
    :cond_0
    iget-object v13, v0, Lnet/toddm/comm/CommManager;->_cacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getBytesValue()[B

    move-result-object v15

    const-wide/16 v16, 0x0

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getMaxStale()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v18

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getEtag()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getUri()Ljava/net/URI;

    move-result-object v21

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getPriority()Lnet/toddm/cache/CachePriority;

    move-result-object v22

    invoke-interface/range {v13 .. v22}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public purgeCache()V
    .locals 1

    .line 355
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_cacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v0}, Lnet/toddm/cache/CacheProvider;->removeAll()Z

    return-void
.end method

.method public purgeCache(I)V
    .locals 1

    .line 348
    iget-object v0, p0, Lnet/toddm/comm/CommManager;->_cacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lnet/toddm/cache/CacheProvider;->remove(Ljava/lang/String;)Z

    return-void
.end method
