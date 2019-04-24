.class Lcom/launchdarkly/android/EventProcessor;
.super Ljava/lang/Object;
.source "EventProcessor.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/launchdarkly/android/EventProcessor$Consumer;
    }
.end annotation


# instance fields
.field private final client:Lokhttp3/OkHttpClient;

.field private final config:Lcom/launchdarkly/android/LDConfig;

.field private final consumer:Lcom/launchdarkly/android/EventProcessor$Consumer;

.field private final context:Landroid/content/Context;

.field private currentTimeMs:J

.field private final environmentName:Ljava/lang/String;

.field private final queue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lcom/launchdarkly/android/Event;",
            ">;"
        }
    .end annotation
.end field

.field private scheduler:Ljava/util/concurrent/ScheduledExecutorService;

.field private summaryEvent:Lcom/launchdarkly/android/SummaryEvent;

.field private final summaryEventSharedPreferences:Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/launchdarkly/android/LDConfig;Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;Ljava/lang/String;)V
    .locals 3

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Lcom/launchdarkly/android/EventProcessor;->summaryEvent:Lcom/launchdarkly/android/SummaryEvent;

    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/launchdarkly/android/EventProcessor;->currentTimeMs:J

    .line 51
    iput-object p1, p0, Lcom/launchdarkly/android/EventProcessor;->context:Landroid/content/Context;

    .line 52
    iput-object p2, p0, Lcom/launchdarkly/android/EventProcessor;->config:Lcom/launchdarkly/android/LDConfig;

    .line 53
    iput-object p4, p0, Lcom/launchdarkly/android/EventProcessor;->environmentName:Ljava/lang/String;

    .line 54
    new-instance p1, Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {p2}, Lcom/launchdarkly/android/LDConfig;->getEventsCapacity()I

    move-result p4

    invoke-direct {p1, p4}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object p1, p0, Lcom/launchdarkly/android/EventProcessor;->queue:Ljava/util/concurrent/BlockingQueue;

    .line 55
    new-instance p1, Lcom/launchdarkly/android/EventProcessor$Consumer;

    invoke-direct {p1, p0, p2}, Lcom/launchdarkly/android/EventProcessor$Consumer;-><init>(Lcom/launchdarkly/android/EventProcessor;Lcom/launchdarkly/android/LDConfig;)V

    iput-object p1, p0, Lcom/launchdarkly/android/EventProcessor;->consumer:Lcom/launchdarkly/android/EventProcessor$Consumer;

    .line 56
    iput-object p3, p0, Lcom/launchdarkly/android/EventProcessor;->summaryEventSharedPreferences:Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;

    .line 58
    new-instance p1, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {p1}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    new-instance p3, Lokhttp3/ConnectionPool;

    .line 59
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDConfig;->getEventsFlushIntervalMillis()I

    move-result p4

    mul-int/lit8 p4, p4, 0x2

    int-to-long v0, p4

    sget-object p4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v2, 0x1

    invoke-direct {p3, v2, v0, v1, p4}, Lokhttp3/ConnectionPool;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {p1, p3}, Lokhttp3/OkHttpClient$Builder;->connectionPool(Lokhttp3/ConnectionPool;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    .line 60
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDConfig;->getConnectionTimeoutMillis()I

    move-result p2

    int-to-long p2, p2

    sget-object p4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p2, p3, p4}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    .line 61
    invoke-virtual {p1, v2}, Lokhttp3/OkHttpClient$Builder;->retryOnConnectionFailure(Z)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    new-instance p2, Lcom/launchdarkly/android/tls/SSLHandshakeInterceptor;

    invoke-direct {p2}, Lcom/launchdarkly/android/tls/SSLHandshakeInterceptor;-><init>()V

    .line 62
    invoke-virtual {p1, p2}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    .line 64
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x10

    if-lt p2, p3, :cond_0

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x16

    if-ge p2, p3, :cond_0

    .line 66
    :try_start_0
    new-instance p2, Lcom/launchdarkly/android/tls/ModernTLSSocketFactory;

    invoke-direct {p2}, Lcom/launchdarkly/android/tls/ModernTLSSocketFactory;-><init>()V

    invoke-static {}, Lcom/launchdarkly/android/tls/TLSUtils;->defaultTrustManager()Ljavax/net/ssl/X509TrustManager;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lokhttp3/OkHttpClient$Builder;->sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :catch_0
    :cond_0
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/EventProcessor;->client:Lokhttp3/OkHttpClient;

    return-void
.end method

.method static synthetic access$000(Lcom/launchdarkly/android/EventProcessor;)Landroid/content/Context;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/launchdarkly/android/EventProcessor;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$100(Lcom/launchdarkly/android/EventProcessor;)Ljava/lang/String;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/launchdarkly/android/EventProcessor;->environmentName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/launchdarkly/android/EventProcessor;)Ljava/util/concurrent/BlockingQueue;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/launchdarkly/android/EventProcessor;->queue:Ljava/util/concurrent/BlockingQueue;

    return-object p0
.end method

.method static synthetic access$300(Lcom/launchdarkly/android/EventProcessor;)Lcom/launchdarkly/android/SummaryEvent;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/launchdarkly/android/EventProcessor;->summaryEvent:Lcom/launchdarkly/android/SummaryEvent;

    return-object p0
.end method

.method static synthetic access$302(Lcom/launchdarkly/android/EventProcessor;Lcom/launchdarkly/android/SummaryEvent;)Lcom/launchdarkly/android/SummaryEvent;
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/launchdarkly/android/EventProcessor;->summaryEvent:Lcom/launchdarkly/android/SummaryEvent;

    return-object p1
.end method

.method static synthetic access$400(Lcom/launchdarkly/android/EventProcessor;)Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/launchdarkly/android/EventProcessor;->summaryEventSharedPreferences:Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;

    return-object p0
.end method

.method static synthetic access$500(Lcom/launchdarkly/android/EventProcessor;)Lokhttp3/OkHttpClient;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/launchdarkly/android/EventProcessor;->client:Lokhttp3/OkHttpClient;

    return-object p0
.end method

.method static synthetic access$602(Lcom/launchdarkly/android/EventProcessor;J)J
    .locals 0

    .line 38
    iput-wide p1, p0, Lcom/launchdarkly/android/EventProcessor;->currentTimeMs:J

    return-wide p1
.end method


# virtual methods
.method public close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 101
    invoke-virtual {p0}, Lcom/launchdarkly/android/EventProcessor;->stop()V

    .line 102
    invoke-virtual {p0}, Lcom/launchdarkly/android/EventProcessor;->flush()V

    return-void
.end method

.method flush()V
    .locals 2

    .line 106
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iget-object v1, p0, Lcom/launchdarkly/android/EventProcessor;->consumer:Lcom/launchdarkly/android/EventProcessor$Consumer;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method getCurrentTimeMs()J
    .locals 2

    .line 110
    iget-wide v0, p0, Lcom/launchdarkly/android/EventProcessor;->currentTimeMs:J

    return-wide v0
.end method

.method sendEvent(Lcom/launchdarkly/android/Event;)Z
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/launchdarkly/android/EventProcessor;->queue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method setSummaryEvent(Lcom/launchdarkly/android/SummaryEvent;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/launchdarkly/android/EventProcessor;->summaryEvent:Lcom/launchdarkly/android/SummaryEvent;

    return-void
.end method

.method start()V
    .locals 8

    .line 77
    new-instance v0, Lcom/google/common/util/concurrent/ThreadFactoryBuilder;

    invoke-direct {v0}, Lcom/google/common/util/concurrent/ThreadFactoryBuilder;-><init>()V

    const/4 v1, 0x1

    .line 78
    invoke-virtual {v0, v1}, Lcom/google/common/util/concurrent/ThreadFactoryBuilder;->setDaemon(Z)Lcom/google/common/util/concurrent/ThreadFactoryBuilder;

    move-result-object v0

    const-string v1, "LaunchDarkly-EventProcessor-%d"

    .line 79
    invoke-virtual {v0, v1}, Lcom/google/common/util/concurrent/ThreadFactoryBuilder;->setNameFormat(Ljava/lang/String;)Lcom/google/common/util/concurrent/ThreadFactoryBuilder;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lcom/google/common/util/concurrent/ThreadFactoryBuilder;->build()Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    .line 81
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/android/EventProcessor;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    .line 82
    iget-object v1, p0, Lcom/launchdarkly/android/EventProcessor;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Lcom/launchdarkly/android/EventProcessor;->consumer:Lcom/launchdarkly/android/EventProcessor$Consumer;

    iget-object v0, p0, Lcom/launchdarkly/android/EventProcessor;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v0}, Lcom/launchdarkly/android/LDConfig;->getEventsFlushIntervalMillis()I

    move-result v0

    int-to-long v5, v0

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x0

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method stop()V
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/launchdarkly/android/EventProcessor;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    .line 87
    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    :cond_0
    return-void
.end method
