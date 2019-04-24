.class Lcom/launchdarkly/android/HttpFeatureFlagFetcher;
.super Ljava/lang/Object;
.source "HttpFeatureFlagFetcher.java"

# interfaces
.implements Lcom/launchdarkly/android/FeatureFlagFetcher;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final MAX_CACHE_SIZE_BYTES:I = 0x7a120


# instance fields
.field private final client:Lokhttp3/OkHttpClient;

.field private final config:Lcom/launchdarkly/android/LDConfig;

.field private final context:Landroid/content/Context;

.field private final environmentName:Ljava/lang/String;

.field private volatile isOffline:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/launchdarkly/android/LDConfig;Ljava/lang/String;)V
    .locals 4

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p2, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->config:Lcom/launchdarkly/android/LDConfig;

    .line 51
    iput-object p3, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->environmentName:Ljava/lang/String;

    .line 52
    iput-object p1, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->context:Landroid/content/Context;

    .line 53
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDConfig;->isOffline()Z

    move-result p3

    iput-boolean p3, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->isOffline:Z

    .line 55
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string p3, "Using cache at: %s"

    const/4 v0, 0x1

    .line 56
    new-array v1, v0, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    new-instance p3, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {p3}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    new-instance v1, Lokhttp3/Cache;

    const-wide/32 v2, 0x7a120

    invoke-direct {v1, p1, v2, v3}, Lokhttp3/Cache;-><init>(Ljava/io/File;J)V

    .line 59
    invoke-virtual {p3, v1}, Lokhttp3/OkHttpClient$Builder;->cache(Lokhttp3/Cache;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    new-instance p3, Lokhttp3/ConnectionPool;

    .line 60
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDConfig;->getBackgroundPollingIntervalMillis()I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    int-to-long v1, p2

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {p3, v0, v1, v2, p2}, Lokhttp3/ConnectionPool;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {p1, p3}, Lokhttp3/OkHttpClient$Builder;->connectionPool(Lokhttp3/ConnectionPool;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    .line 61
    invoke-virtual {p1, v0}, Lokhttp3/OkHttpClient$Builder;->retryOnConnectionFailure(Z)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    .line 63
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x10

    if-lt p2, p3, :cond_0

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x16

    if-ge p2, p3, :cond_0

    .line 65
    :try_start_0
    new-instance p2, Lcom/launchdarkly/android/tls/ModernTLSSocketFactory;

    invoke-direct {p2}, Lcom/launchdarkly/android/tls/ModernTLSSocketFactory;-><init>()V

    invoke-static {}, Lcom/launchdarkly/android/tls/TLSUtils;->defaultTrustManager()Ljavax/net/ssl/X509TrustManager;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lokhttp3/OkHttpClient$Builder;->sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    :catch_0
    :cond_0
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->client:Lokhttp3/OkHttpClient;

    return-void
.end method

.method static synthetic access$000(Lcom/launchdarkly/android/HttpFeatureFlagFetcher;)Lokhttp3/OkHttpClient;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->client:Lokhttp3/OkHttpClient;

    return-object p0
.end method

.method private getDefaultRequest(Lcom/launchdarkly/android/LDUser;)Lokhttp3/Request;
    .locals 3

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v1}, Lcom/launchdarkly/android/LDConfig;->getBaseUri()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "/msdk/evalx/users/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getAsUrlSafeBase64()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Attempting to fetch Feature flags using uri: %s"

    const/4 v1, 0x1

    .line 138
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget-object v0, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->config:Lcom/launchdarkly/android/LDConfig;

    iget-object v1, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->environmentName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/launchdarkly/android/LDConfig;->getRequestBuilderFor(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 140
    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    .line 141
    instance-of v0, p1, Lokhttp3/Request$Builder;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Lokhttp3/Request$Builder;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->build(Lokhttp3/Request$Builder;)Lokhttp3/Request;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private getReportRequest(Lcom/launchdarkly/android/LDUser;)Lokhttp3/Request;
    .locals 4

    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v1}, Lcom/launchdarkly/android/LDConfig;->getBaseUri()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "/msdk/evalx/user"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Attempting to report user using uri: %s"

    const/4 v2, 0x1

    .line 147
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    sget-object v1, Lcom/launchdarkly/android/LDConfig;->GSON:Lcom/google/gson/Gson;

    instance-of v2, v1, Lcom/google/gson/Gson;

    if-nez v2, :cond_0

    invoke-virtual {v1, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v1, Lcom/google/gson/Gson;

    invoke-static {v1, p1}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string v1, "application/json;charset=UTF-8"

    .line 149
    invoke-static {v1}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v1

    invoke-static {v1, p1}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p1

    .line 150
    iget-object v1, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->config:Lcom/launchdarkly/android/LDConfig;

    iget-object v2, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->environmentName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/launchdarkly/android/LDConfig;->getRequestBuilderFor(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v1

    const-string v2, "REPORT"

    .line 151
    invoke-virtual {v1, v2, p1}, Lokhttp3/Request$Builder;->method(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p1

    .line 152
    invoke-virtual {p1, v0}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    .line 153
    instance-of v0, p1, Lokhttp3/Request$Builder;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    goto :goto_1

    :cond_1
    check-cast p1, Lokhttp3/Request$Builder;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->build(Lokhttp3/Request$Builder;)Lokhttp3/Request;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method static newInstance(Landroid/content/Context;Lcom/launchdarkly/android/LDConfig;Ljava/lang/String;)Lcom/launchdarkly/android/HttpFeatureFlagFetcher;
    .locals 1

    .line 46
    new-instance v0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;

    invoke-direct {v0, p0, p1, p2}, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;-><init>(Landroid/content/Context;Lcom/launchdarkly/android/LDConfig;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public declared-synchronized fetch(Lcom/launchdarkly/android/LDUser;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/launchdarkly/android/LDUser;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Lcom/google/gson/JsonObject;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 76
    :try_start_0
    invoke-static {}, Lcom/google/common/util/concurrent/SettableFuture;->create()Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object v0

    if-eqz p1, :cond_2

    .line 78
    iget-boolean v1, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->isOffline:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->environmentName:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/launchdarkly/android/Util;->isClientConnected(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 80
    iget-object v1, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v1}, Lcom/launchdarkly/android/LDConfig;->isUseReport()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 81
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->getReportRequest(Lcom/launchdarkly/android/LDUser;)Lokhttp3/Request;

    move-result-object p1

    goto :goto_0

    .line 82
    :cond_0
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->getDefaultRequest(Lcom/launchdarkly/android/LDUser;)Lokhttp3/Request;

    move-result-object p1

    .line 84
    :goto_0
    invoke-virtual {p1}, Lokhttp3/Request;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    iget-object v1, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->client:Lokhttp3/OkHttpClient;

    instance-of v2, v1, Lokhttp3/OkHttpClient;

    if-nez v2, :cond_1

    invoke-virtual {v1, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v1

    goto :goto_1

    :cond_1
    check-cast v1, Lokhttp3/OkHttpClient;

    invoke-static {v1, p1}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->newCall(Lokhttp3/OkHttpClient;Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v1

    .line 86
    :goto_1
    new-instance v2, Lcom/launchdarkly/android/HttpFeatureFlagFetcher$1;

    invoke-direct {v2, p0, v0, p1}, Lcom/launchdarkly/android/HttpFeatureFlagFetcher$1;-><init>(Lcom/launchdarkly/android/HttpFeatureFlagFetcher;Lcom/google/common/util/concurrent/SettableFuture;Lokhttp3/Request;)V

    invoke-interface {v1, v2}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    goto :goto_2

    :cond_2
    if-nez p1, :cond_3

    .line 128
    new-instance p1, Lcom/launchdarkly/android/LaunchDarklyException;

    const-string v1, "Update was attempted without a user"

    invoke-direct {p1, v1}, Lcom/launchdarkly/android/LaunchDarklyException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/common/util/concurrent/SettableFuture;->setException(Ljava/lang/Throwable;)Z

    goto :goto_2

    .line 130
    :cond_3
    new-instance p1, Lcom/launchdarkly/android/LaunchDarklyException;

    const-string v1, "Update was attempted without an internet connection"

    invoke-direct {p1, v1}, Lcom/launchdarkly/android/LaunchDarklyException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/common/util/concurrent/SettableFuture;->setException(Ljava/lang/Throwable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    :goto_2
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setOffline()V
    .locals 1

    const/4 v0, 0x1

    .line 160
    iput-boolean v0, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->isOffline:Z

    return-void
.end method

.method public setOnline()V
    .locals 1

    const/4 v0, 0x0

    .line 165
    iput-boolean v0, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->isOffline:Z

    return-void
.end method
