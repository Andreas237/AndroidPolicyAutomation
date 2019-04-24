.class public final Lcom/launchdarkly/eventsource/EventSource$Builder;
.super Ljava/lang/Object;
.source "EventSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/eventsource/EventSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private body:Lokhttp3/RequestBody;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private clientBuilder:Lokhttp3/OkHttpClient$Builder;

.field private connectionErrorHandler:Lcom/launchdarkly/eventsource/ConnectionErrorHandler;

.field private final handler:Lcom/launchdarkly/eventsource/EventHandler;

.field private headers:Lokhttp3/Headers;

.field private maxReconnectTimeMs:J

.field private method:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private proxy:Ljava/net/Proxy;

.field private proxyAuthenticator:Lokhttp3/Authenticator;

.field private reconnectTimeMs:J

.field private final uri:Ljava/net/URI;


# direct methods
.method public constructor <init>(Lcom/launchdarkly/eventsource/EventHandler;Ljava/net/URI;)V
    .locals 6

    .line 377
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 359
    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->name:Ljava/lang/String;

    const-wide/16 v0, 0x3e8

    .line 360
    iput-wide v0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->reconnectTimeMs:J

    const-wide/16 v0, 0x7530

    .line 361
    iput-wide v0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->maxReconnectTimeMs:J

    .line 364
    sget-object v0, Lcom/launchdarkly/eventsource/ConnectionErrorHandler;->DEFAULT:Lcom/launchdarkly/eventsource/ConnectionErrorHandler;

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->connectionErrorHandler:Lcom/launchdarkly/eventsource/ConnectionErrorHandler;

    const/4 v0, 0x0

    .line 365
    new-array v0, v0, [Ljava/lang/String;

    invoke-static {v0}, Lokhttp3/Headers;->of([Ljava/lang/String;)Lokhttp3/Headers;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->headers:Lokhttp3/Headers;

    const/4 v0, 0x0

    .line 367
    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->proxyAuthenticator:Lokhttp3/Authenticator;

    const-string v1, "GET"

    .line 368
    iput-object v1, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->method:Ljava/lang/String;

    .line 369
    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->body:Lokhttp3/RequestBody;

    .line 370
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    new-instance v1, Lokhttp3/ConnectionPool;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v3, 0x1

    const-wide/16 v4, 0x1

    invoke-direct {v1, v3, v4, v5, v2}, Lokhttp3/ConnectionPool;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    .line 371
    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->connectionPool(Lokhttp3/ConnectionPool;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x2710

    .line 372
    invoke-virtual {v0, v4, v5, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/32 v4, 0x493e0

    .line 373
    invoke-virtual {v0, v4, v5, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x1388

    .line 374
    invoke-virtual {v0, v4, v5, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    .line 375
    invoke-virtual {v0, v3}, Lokhttp3/OkHttpClient$Builder;->retryOnConnectionFailure(Z)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->clientBuilder:Lokhttp3/OkHttpClient$Builder;

    .line 378
    iput-object p2, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->uri:Ljava/net/URI;

    .line 379
    iput-object p1, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    return-void
.end method

.method static synthetic access$000(Lcom/launchdarkly/eventsource/EventSource$Builder;)Ljava/lang/String;
    .locals 0

    .line 358
    iget-object p0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/launchdarkly/eventsource/EventSource$Builder;)Ljava/net/URI;
    .locals 0

    .line 358
    iget-object p0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->uri:Ljava/net/URI;

    return-object p0
.end method

.method static synthetic access$200(Lcom/launchdarkly/eventsource/EventSource$Builder;)Lokhttp3/Headers;
    .locals 0

    .line 358
    iget-object p0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->headers:Lokhttp3/Headers;

    return-object p0
.end method

.method static synthetic access$300(Lcom/launchdarkly/eventsource/EventSource$Builder;)Ljava/lang/String;
    .locals 0

    .line 358
    iget-object p0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->method:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Lcom/launchdarkly/eventsource/EventSource$Builder;)Lokhttp3/RequestBody;
    .locals 0

    .line 358
    iget-object p0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->body:Lokhttp3/RequestBody;

    return-object p0
.end method

.method static synthetic access$500(Lcom/launchdarkly/eventsource/EventSource$Builder;)J
    .locals 2

    .line 358
    iget-wide v0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->reconnectTimeMs:J

    return-wide v0
.end method

.method static synthetic access$600(Lcom/launchdarkly/eventsource/EventSource$Builder;)J
    .locals 2

    .line 358
    iget-wide v0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->maxReconnectTimeMs:J

    return-wide v0
.end method

.method static synthetic access$700(Lcom/launchdarkly/eventsource/EventSource$Builder;)Lcom/launchdarkly/eventsource/EventHandler;
    .locals 0

    .line 358
    iget-object p0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    return-object p0
.end method

.method static synthetic access$800(Lcom/launchdarkly/eventsource/EventSource$Builder;)Lcom/launchdarkly/eventsource/ConnectionErrorHandler;
    .locals 0

    .line 358
    iget-object p0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->connectionErrorHandler:Lcom/launchdarkly/eventsource/ConnectionErrorHandler;

    return-object p0
.end method

.method static synthetic access$900(Lcom/launchdarkly/eventsource/EventSource$Builder;)Lokhttp3/OkHttpClient$Builder;
    .locals 0

    .line 358
    iget-object p0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->clientBuilder:Lokhttp3/OkHttpClient$Builder;

    return-object p0
.end method

.method private static defaultTrustManager()Ljavax/net/ssl/X509TrustManager;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 574
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v0

    .line 573
    invoke-static {v0}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v0

    const/4 v1, 0x0

    .line 575
    check-cast v1, Ljava/security/KeyStore;

    invoke-virtual {v0, v1}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 576
    invoke-virtual {v0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v0

    .line 577
    array-length v1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    aget-object v2, v0, v1

    instance-of v2, v2, Ljavax/net/ssl/X509TrustManager;

    if-eqz v2, :cond_0

    .line 581
    aget-object v0, v0, v1

    check-cast v0, Ljavax/net/ssl/X509TrustManager;

    return-object v0

    .line 578
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected default trust managers:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 579
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public body(Lokhttp3/RequestBody;)Lcom/launchdarkly/eventsource/EventSource$Builder;
    .locals 0
    .param p1    # Lokhttp3/RequestBody;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 403
    iput-object p1, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->body:Lokhttp3/RequestBody;

    return-object p0
.end method

.method public build()Lcom/launchdarkly/eventsource/EventSource;
    .locals 3

    .line 551
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->proxy:Ljava/net/Proxy;

    if-eqz v0, :cond_0

    .line 552
    iget-object v1, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->clientBuilder:Lokhttp3/OkHttpClient$Builder;

    invoke-virtual {v1, v0}, Lokhttp3/OkHttpClient$Builder;->proxy(Ljava/net/Proxy;)Lokhttp3/OkHttpClient$Builder;

    .line 556
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->clientBuilder:Lokhttp3/OkHttpClient$Builder;

    new-instance v1, Lcom/launchdarkly/eventsource/ModernTLSSocketFactory;

    invoke-direct {v1}, Lcom/launchdarkly/eventsource/ModernTLSSocketFactory;-><init>()V

    invoke-static {}, Lcom/launchdarkly/eventsource/EventSource$Builder;->defaultTrustManager()Ljavax/net/ssl/X509TrustManager;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 561
    :catch_0
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->proxyAuthenticator:Lokhttp3/Authenticator;

    if-eqz v0, :cond_1

    .line 562
    iget-object v1, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->clientBuilder:Lokhttp3/OkHttpClient$Builder;

    invoke-virtual {v1, v0}, Lokhttp3/OkHttpClient$Builder;->proxyAuthenticator(Lokhttp3/Authenticator;)Lokhttp3/OkHttpClient$Builder;

    .line 565
    :cond_1
    new-instance v0, Lcom/launchdarkly/eventsource/EventSource;

    invoke-direct {v0, p0}, Lcom/launchdarkly/eventsource/EventSource;-><init>(Lcom/launchdarkly/eventsource/EventSource$Builder;)V

    return-object v0
.end method

.method public headers(Lokhttp3/Headers;)Lcom/launchdarkly/eventsource/EventSource$Builder;
    .locals 0

    .line 452
    iput-object p1, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->headers:Lokhttp3/Headers;

    return-object p0
.end method

.method public maxReconnectTimeMs(J)Lcom/launchdarkly/eventsource/EventSource$Builder;
    .locals 0

    .line 441
    iput-wide p1, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->maxReconnectTimeMs:J

    return-object p0
.end method

.method public method(Ljava/lang/String;)Lcom/launchdarkly/eventsource/EventSource$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 391
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 392
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/eventsource/EventSource$Builder;->method:Ljava/lang/String;

    :cond_0
    return-object p0
.end method
