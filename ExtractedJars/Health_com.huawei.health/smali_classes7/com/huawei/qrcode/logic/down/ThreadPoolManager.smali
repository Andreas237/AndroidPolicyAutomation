.class public final Lcom/huawei/qrcode/logic/down/ThreadPoolManager;
.super Ljava/lang/Object;


# static fields
.field private static final SYNC_LOCK:[B

.field private static final TAG:Ljava/lang/String; = "ThreadPoolManager"

.field private static instance:Lcom/huawei/qrcode/logic/down/ThreadPoolManager; = null


# instance fields
.field private threadPoolExecutor:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->instance:Lcom/huawei/qrcode/logic/down/ThreadPoolManager;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->threadPoolExecutor:Ljava/util/concurrent/ExecutorService;

    const-string v0, "ThreadPoolManager"

    const-string v1, "ThreadPool init!"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->threadPoolExecutor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static getInstance()Lcom/huawei/qrcode/logic/down/ThreadPoolManager;
    .locals 4

    sget-object v2, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->SYNC_LOCK:[B

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->instance:Lcom/huawei/qrcode/logic/down/ThreadPoolManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;

    invoke-direct {v0}, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->instance:Lcom/huawei/qrcode/logic/down/ThreadPoolManager;

    :cond_0
    sget-object v0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->instance:Lcom/huawei/qrcode/logic/down/ThreadPoolManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->threadPoolExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getThreadPoolExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->threadPoolExecutor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public release()V
    .locals 3

    const-string v0, "ThreadPoolManager"

    const-string v1, "ThreadPool release!"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->threadPoolExecutor:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->threadPoolExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->threadPoolExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :cond_0
    return-void
.end method

.method public submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future<*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->threadPoolExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method
