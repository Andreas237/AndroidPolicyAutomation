.class public Lcom/shopkick/app/application/AdvertisingIDCaller;
.super Ljava/lang/Object;
.source "AdvertisingIDCaller.java"


# static fields
.field private static final ADVERTISING_ID:Ljava/lang/String; = "advertising_id"

.field private static final PREFERENCES_NAME:Ljava/lang/String; = "com.shopkick.app.advertising"

.field private static final RETRY_LIMIT:I = 0x5

.field private static final advertisingIdExecutor:Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field private volatile advertisingId:Ljava/lang/String;

.field private advertisingIdFuture:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private retries:I

.field private sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 30
    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/ArrayBlockingQueue;

    const/4 v0, 0x1

    invoke-direct {v6, v0}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    const/4 v1, 0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    sput-object v7, Lcom/shopkick/app/application/AdvertisingIDCaller;->advertisingIdExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput v0, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->retries:I

    const/4 v1, 0x0

    .line 37
    iput-object v1, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->advertisingId:Ljava/lang/String;

    .line 39
    iput-object v1, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->advertisingIdFuture:Ljava/util/concurrent/Future;

    .line 42
    iput-object p1, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->context:Landroid/content/Context;

    const-string v1, "com.shopkick.app.advertising"

    .line 43
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->sharedPreferences:Landroid/content/SharedPreferences;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/application/AdvertisingIDCaller;)Ljava/lang/String;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->advertisingId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/application/AdvertisingIDCaller;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->advertisingId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/application/AdvertisingIDCaller;)Landroid/content/SharedPreferences;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->sharedPreferences:Landroid/content/SharedPreferences;

    return-object p0
.end method


# virtual methods
.method public getAdvertisingIdFuture()Ljava/util/concurrent/Future;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;",
            ">;"
        }
    .end annotation

    .line 103
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->advertisingId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "advertising_id"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->advertisingId:Ljava/lang/String;

    .line 108
    :cond_0
    sget-object v0, Lcom/shopkick/app/application/AdvertisingIDCaller;->advertisingIdExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->getActiveCount()I

    move-result v0

    if-gtz v0, :cond_1

    .line 110
    new-instance v0, Lcom/shopkick/app/application/AdvertisingIDCaller$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/application/AdvertisingIDCaller$1;-><init>(Lcom/shopkick/app/application/AdvertisingIDCaller;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    :try_start_1
    sget-object v1, Lcom/shopkick/app/application/AdvertisingIDCaller;->advertisingIdExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/ExecutorServiceUtils;->submitCallable(Ljava/util/concurrent/Callable;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->advertisingIdFuture:Ljava/util/concurrent/Future;
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 138
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 141
    :catch_1
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->advertisingIdFuture:Ljava/util/concurrent/Future;

    return-object v0
.end method

.method public getAdvertisingInfoFromOS()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    .locals 3

    const/4 v0, 0x0

    .line 57
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/android/gms/common/GooglePlayServicesRepairableException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    invoke-virtual {v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    return-object v1

    :catch_0
    return-object v0

    .line 64
    :catch_1
    iget v1, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->retries:I

    const/4 v2, 0x5

    if-ge v1, v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    .line 65
    iput v1, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->retries:I

    .line 66
    invoke-virtual {p0}, Lcom/shopkick/app/application/AdvertisingIDCaller;->getAdvertisingInfoFromOS()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v0

    :catch_2
    return-object v0
.end method

.method public getCurrentAdvertisingIdValue()Ljava/lang/String;
    .locals 1

    .line 87
    invoke-virtual {p0}, Lcom/shopkick/app/application/AdvertisingIDCaller;->getAdvertisingIdFuture()Ljava/util/concurrent/Future;

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/application/AdvertisingIDCaller;->advertisingId:Ljava/lang/String;

    return-object v0
.end method
