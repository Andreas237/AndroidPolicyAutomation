.class public final Lcom/microblink/internal/ServiceHttpGenerator;
.super Ljava/lang/Object;


# static fields
.field private static final LONG_TIMEOUT_IN_SECONDS:I = 0x19

.field private static volatile sInstance:Lcom/microblink/internal/ServiceHttpGenerator;


# instance fields
.field private okHttpClient:Lokhttp3/OkHttpClient;


# direct methods
.method private constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    invoke-static {}, Lcom/microblink/ReceiptSdk;->retryOnConnectionFailure()Z

    move-result v1

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->retryOnConnectionFailure(Z)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x19

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-static {}, Lcom/microblink/ReceiptSdk;->debug()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lokhttp3/logging/HttpLoggingInterceptor;

    invoke-direct {v1}, Lokhttp3/logging/HttpLoggingInterceptor;-><init>()V

    sget-object v2, Lokhttp3/logging/HttpLoggingInterceptor$Level;->BODY:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    invoke-virtual {v1, v2}, Lokhttp3/logging/HttpLoggingInterceptor;->setLevel(Lokhttp3/logging/HttpLoggingInterceptor$Level;)Lokhttp3/logging/HttpLoggingInterceptor;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->interceptors()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v1, Lcom/microblink/internal/services/HeaderInterceptor;

    invoke-direct {v1}, Lcom/microblink/internal/services/HeaderInterceptor;-><init>()V

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    new-instance v1, Lcom/microblink/internal/services/NetworkOfflineInterceptor;

    invoke-direct {v1}, Lcom/microblink/internal/services/NetworkOfflineInterceptor;-><init>()V

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/internal/ServiceHttpGenerator;->okHttpClient:Lokhttp3/OkHttpClient;

    return-void
.end method

.method public static getInstance()Lcom/microblink/internal/ServiceHttpGenerator;
    .locals 2

    sget-object v0, Lcom/microblink/internal/ServiceHttpGenerator;->sInstance:Lcom/microblink/internal/ServiceHttpGenerator;

    if-nez v0, :cond_1

    const-class v0, Lcom/microblink/internal/ServiceHttpGenerator;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/microblink/internal/ServiceHttpGenerator;->sInstance:Lcom/microblink/internal/ServiceHttpGenerator;

    if-nez v1, :cond_0

    new-instance v1, Lcom/microblink/internal/ServiceHttpGenerator;

    invoke-direct {v1}, Lcom/microblink/internal/ServiceHttpGenerator;-><init>()V

    sput-object v1, Lcom/microblink/internal/ServiceHttpGenerator;->sInstance:Lcom/microblink/internal/ServiceHttpGenerator;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/microblink/internal/ServiceHttpGenerator;->sInstance:Lcom/microblink/internal/ServiceHttpGenerator;

    return-object v0
.end method


# virtual methods
.method public final client()Lokhttp3/OkHttpClient;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/ServiceHttpGenerator;->okHttpClient:Lokhttp3/OkHttpClient;

    return-object v0
.end method
