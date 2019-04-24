.class public Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;
.super Ljava/lang/Object;
.source "SKClientLoggingConfigurationProvider.java"

# interfaces
.implements Lcom/shopkick/logging/ConfigurationProvider;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$LoadCachedConfigsCallable;
    }
.end annotation


# static fields
.field protected static final CLIENT_FLAGS_MANAGER:Ljava/lang/String; = "CLIENT_FLAGS_MANAGER"

.field protected static final LOGGING_CONFIGURATION_CLIENT_FLAGS_MANAGER_READY:Ljava/lang/String; = "LOGGING_CONFIGURATION_CLIENT_FLAGS_MANAGER_READY"

.field private static final TAG:Ljava/lang/String; = "SKClientLoggingConfigurationProvider"

.field private static final configMapLock:Ljava/lang/Object;

.field private static final loggingConfigurationExecutor:Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field private apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

.field private final appContext:Landroid/content/Context;

.field private appenderConfigs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/shopkick/logging/AppenderConfig;",
            ">;"
        }
    .end annotation
.end field

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private final defaultAppenderConfig:Lcom/shopkick/logging/AppenderConfig;

.field private final defaultLoggerConfig:Lcom/shopkick/logging/LoggerConfig;

.field private loggerConfigs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/shopkick/logging/LoggerConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private final serviceTypeToAppenderTagsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 62
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->configMapLock:Ljava/lang/Object;

    .line 63
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    sput-object v0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->loggingConfigurationExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 7

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->appContext:Landroid/content/Context;

    .line 87
    iput-object p2, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 88
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->serviceTypeToAppenderTagsMap:Ljava/util/Map;

    .line 89
    iget-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->serviceTypeToAppenderTagsMap:Ljava/util/Map;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/logging/AppboyAppender;->APPENDER_TAG:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    iget-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->serviceTypeToAppenderTagsMap:Ljava/util/Map;

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/logging/BranchAppender;->APPENDER_TAG:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->appenderConfigs:Ljava/util/Map;

    .line 92
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->loggerConfigs:Ljava/util/Map;

    const/4 p1, 0x0

    .line 94
    iput-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 97
    new-instance v0, Lcom/shopkick/app/logging/SimpleAppenderConfig;

    invoke-direct {v0}, Lcom/shopkick/app/logging/SimpleAppenderConfig;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->defaultAppenderConfig:Lcom/shopkick/logging/AppenderConfig;

    .line 98
    new-instance v0, Lcom/shopkick/app/logging/SimpleLoggerConfig;

    invoke-direct {v0}, Lcom/shopkick/app/logging/SimpleLoggerConfig;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->defaultLoggerConfig:Lcom/shopkick/logging/LoggerConfig;

    .line 102
    new-instance v0, Lcom/shopkick/app/logging/DiagnosticLoggerConfig;

    sget-object v1, Lcom/shopkick/logging/Area;->ALL:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Level;->VERBOSE:Lcom/shopkick/logging/Level;

    const/4 v2, 0x0

    move-object v1, v0

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/logging/DiagnosticLoggerConfig;-><init>(ZJLcom/shopkick/logging/Level;Lcom/shopkick/app/util/NotificationCenter;)V

    .line 104
    new-instance p2, Lcom/shopkick/app/logging/SimpleLoggerConfig;

    sget-object v1, Lcom/shopkick/logging/Area;->ALL:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Level;->VERBOSE:Lcom/shopkick/logging/Level;

    const/4 v4, 0x1

    invoke-direct {p2, v4, v1, v2, v3}, Lcom/shopkick/app/logging/SimpleLoggerConfig;-><init>(ZJLcom/shopkick/logging/Level;)V

    .line 106
    iget-object v1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->loggerConfigs:Ljava/util/Map;

    sget-object v2, Lcom/shopkick/logging/DiagnosticLogger;->LOGGER_TAG:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->loggerConfigs:Ljava/util/Map;

    sget-object v1, Lcom/shopkick/logging/EventLogger;->LOGGER_TAG:Ljava/lang/String;

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    new-instance p2, Lcom/shopkick/app/logging/SimpleAppenderConfig;

    sget-object v0, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v2, Lcom/shopkick/logging/Level;->VERBOSE:Lcom/shopkick/logging/Level;

    invoke-direct {p2, v4, v0, v1, v2}, Lcom/shopkick/app/logging/SimpleAppenderConfig;-><init>(ZJLcom/shopkick/logging/Level;)V

    .line 112
    new-instance v0, Lcom/shopkick/app/logging/SimpleAppenderConfig;

    sget-object v1, Lcom/shopkick/logging/Area;->ALL:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Level;->VERBOSE:Lcom/shopkick/logging/Level;

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/shopkick/app/logging/SimpleAppenderConfig;-><init>(ZJLcom/shopkick/logging/Level;)V

    .line 113
    new-instance v1, Lcom/shopkick/app/logging/SimpleAppenderConfig;

    sget-object v2, Lcom/shopkick/logging/Area;->ALL:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v5, Lcom/shopkick/logging/Level;->VERBOSE:Lcom/shopkick/logging/Level;

    invoke-direct {v1, v4, v2, v3, v5}, Lcom/shopkick/app/logging/SimpleAppenderConfig;-><init>(ZJLcom/shopkick/logging/Level;)V

    .line 114
    sget-object v2, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->configMapLock:Ljava/lang/Object;

    monitor-enter v2

    .line 115
    :try_start_0
    iget-object v3, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->appenderConfigs:Ljava/util/Map;

    sget-object v4, Lcom/shopkick/app/application/CrashlyticsAppender;->APPENDER_TAG:Ljava/lang/String;

    invoke-interface {v3, v4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    iget-object p2, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->appenderConfigs:Ljava/util/Map;

    sget-object v3, Lcom/shopkick/logging/LogCatAppender;->APPENDER_TAG:Ljava/lang/String;

    invoke-interface {p2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    iget-object p2, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->appenderConfigs:Ljava/util/Map;

    sget-object v1, Lcom/shopkick/logging/RemoteAppender;->APPENDER_TAG:Ljava/lang/String;

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    new-instance p2, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$LoadCachedConfigsCallable;

    invoke-direct {p2, p0, p1}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$LoadCachedConfigsCallable;-><init>(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$1;)V

    .line 122
    sget-object p1, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->loggingConfigurationExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void

    :catchall_0
    move-exception p1

    .line 118
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->handleLoggingConfigResponse(Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;)Landroid/content/Context;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->appContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$300()Ljava/lang/Object;
    .locals 1

    .line 57
    sget-object v0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->configMapLock:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$400(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;)Ljava/util/Map;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->serviceTypeToAppenderTagsMap:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;)Ljava/util/Map;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->appenderConfigs:Ljava/util/Map;

    return-object p0
.end method

.method private handleLoggingConfigResponse(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 5

    if-eqz p1, :cond_0

    .line 234
    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;

    if-eqz v0, :cond_0

    .line 235
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;

    .line 238
    new-instance v0, Lcom/shopkick/app/logging/EventAppenderConfig;

    sget-object v1, Lcom/shopkick/logging/Area;->ALL:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;->appboyLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

    const/4 v4, 0x1

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/shopkick/app/logging/EventAppenderConfig;-><init>(ZJLcom/shopkick/app/fetchers/api/skapi/LogConfig;)V

    .line 240
    new-instance v1, Lcom/shopkick/app/logging/EventAppenderConfig;

    sget-object v2, Lcom/shopkick/logging/Area;->ALL:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;->branchLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

    invoke-direct {v1, v4, v2, v3, p1}, Lcom/shopkick/app/logging/EventAppenderConfig;-><init>(ZJLcom/shopkick/app/fetchers/api/skapi/LogConfig;)V

    .line 242
    sget-object p1, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->configMapLock:Ljava/lang/Object;

    monitor-enter p1

    .line 243
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->appenderConfigs:Ljava/util/Map;

    sget-object v3, Lcom/shopkick/app/logging/AppboyAppender;->APPENDER_TAG:Ljava/lang/String;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    iget-object v0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->appenderConfigs:Ljava/util/Map;

    sget-object v2, Lcom/shopkick/app/logging/BranchAppender;->APPENDER_TAG:Ljava/lang/String;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 219
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    if-eq p1, v0, :cond_0

    .line 221
    invoke-direct {p0, p2}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->handleLoggingConfigResponse(Lcom/shopkick/fetchers/DataResponse;)V

    goto :goto_0

    .line 224
    :cond_0
    sget-object p1, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->loggingConfigurationExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$1;

    invoke-direct {v0, p0, p2}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$1;-><init>(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;Lcom/shopkick/fetchers/DataResponse;)V

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->appenderConfigs:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->appenderConfigs:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/logging/AppenderConfig;

    return-object p1

    .line 158
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->defaultAppenderConfig:Lcom/shopkick/logging/AppenderConfig;

    return-object p1
.end method

.method public getLoggerConfig(Ljava/lang/String;)Lcom/shopkick/logging/LoggerConfig;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->loggerConfigs:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->loggerConfigs:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/logging/LoggerConfig;

    return-object p1

    .line 167
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->defaultLoggerConfig:Lcom/shopkick/logging/LoggerConfig;

    return-object p1
.end method

.method public isSKLoggerDevloggingDisabled()Z
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->skloggerDevloggingDisabled:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public isSKLoggerOnlyDevloggingDisabled()Z
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->skloggerOnlyDevloggingDisabled:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public loadConfigsOnline()V
    .locals 9

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    if-nez v0, :cond_0

    return-void

    .line 199
    :cond_0
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsRequest;

    invoke-direct {v3}, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsRequest;-><init>()V

    .line 200
    iget-object v1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v5, 0x1

    sget-object v6, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v7, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v8, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v4, p0

    invoke-virtual/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public setApiManagerV2(Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 0
    .param p1    # Lcom/shopkick/fetchers/api/APIManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 208
    iput-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    return-void
.end method

.method public setClientFlagsManager(Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 2
    .param p1    # Lcom/shopkick/app/application/ClientFlagsManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 181
    iput-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 182
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "CLIENT_FLAGS_MANAGER"

    .line 183
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    iget-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "LOGGING_CONFIGURATION_CLIENT_FLAGS_MANAGER_READY"

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void

    .line 179
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "\'setClientFlagsManager\' get a null instance"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
