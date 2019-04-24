.class public Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static CORE_POOL_SIZE:I = 0x0

.field public static final EXECUTE_RESULT_GOOD:I = 0x0

.field public static final EXECUTE_RESULT_REJECTED:I = -0x1

.field private static KEEP_ALIVE_TIME:I = 0x0

.field private static MAX_POOL_SIZE:I = 0x0

.field private static final TAG:Ljava/lang/String; = "ThreadPoolUtils"

.field private static threadFactory:Ljava/util/concurrent/ThreadFactory; = null

.field private static threadPool:Ljava/util/concurrent/ThreadPoolExecutor; = null

.field private static workQueue:Ljava/util/concurrent/BlockingQueue; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Ljava/lang/Runnable;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 38
    const/4 v0, 0x5

    sput v0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->CORE_POOL_SIZE:I

    .line 41
    const/16 v0, 0x14

    sput v0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->MAX_POOL_SIZE:I

    .line 44
    const/16 v0, 0x1e

    sput v0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->KEEP_ALIVE_TIME:I

    .line 47
    new-instance v0, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v0}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->workQueue:Ljava/util/concurrent/BlockingQueue;

    .line 50
    new-instance v0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils$1;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils$1;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->threadFactory:Ljava/util/concurrent/ThreadFactory;

    .line 63
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v1, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->CORE_POOL_SIZE:I

    sget v2, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->MAX_POOL_SIZE:I

    sget v3, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->KEEP_ALIVE_TIME:I

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v6, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->workQueue:Ljava/util/concurrent/BlockingQueue;

    sget-object v7, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->threadFactory:Ljava/util/concurrent/ThreadFactory;

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;

    invoke-direct {v8}, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;-><init>()V

    invoke-direct/range {v0 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    sput-object v0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->threadPool:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 67
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static execute(Ljava/lang/Runnable;)I
    .locals 5

    .line 89
    :try_start_0
    sget-object v0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->threadPool:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 91
    const-string v0, "ThreadPoolUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ThreadPool.getActiveCount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->threadPool:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->getActiveCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    const-string v0, "ThreadPoolUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ThreadPool.getPoolSize = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->threadPool:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->getPoolSize()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    const-string v0, "ThreadPoolUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ThreadPool.getTaskCount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->threadPool:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->getTaskCount()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    const/4 v0, 0x0

    return v0

    .line 97
    :catch_0
    move-exception v4

    .line 98
    const-string v0, "ThreadPoolUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ThreadPool is  rejected. e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/concurrent/RejectedExecutionException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const/4 v0, -0x1

    return v0
.end method

.method public static getCORE_POOL_SIZE()I
    .locals 1

    .line 109
    sget v0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->CORE_POOL_SIZE:I

    return v0
.end method

.method public static getKEEP_ALIVE_TIME()I
    .locals 1

    .line 145
    sget v0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->KEEP_ALIVE_TIME:I

    return v0
.end method

.method public static getMAX_POOL_SIZE()I
    .locals 1

    .line 127
    sget v0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->MAX_POOL_SIZE:I

    return v0
.end method

.method public static getThreadPollExInstance()Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 4

    .line 71
    sget-object v0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->threadPool:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v0, :cond_0

    .line 72
    const-string v0, "ThreadPoolUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ThreadPoolExecutor is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 74
    :cond_0
    const-string v0, "ThreadPoolUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ThreadPoolExecutor != null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    :goto_0
    sget-object v0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->threadPool:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method

.method public static setCORE_POOL_SIZE(I)V
    .locals 0

    .line 118
    sput p0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->CORE_POOL_SIZE:I

    .line 119
    return-void
.end method

.method public static setKEEP_ALIVE_TIME(I)V
    .locals 0

    .line 154
    sput p0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->KEEP_ALIVE_TIME:I

    .line 155
    return-void
.end method

.method public static setMAX_POOL_SIZE(I)V
    .locals 0

    .line 136
    sput p0, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->MAX_POOL_SIZE:I

    .line 137
    return-void
.end method


# virtual methods
.method public initThreadPoolUtils1()V
    .locals 0

    .line 158
    return-void
.end method

.method public initThreadPoolUtils2()V
    .locals 0

    .line 159
    return-void
.end method

.method public initThreadPoolUtils3()V
    .locals 0

    .line 160
    return-void
.end method

.method public initThreadPoolUtils4()V
    .locals 0

    .line 161
    return-void
.end method

.method public initThreadPoolUtils5()V
    .locals 0

    .line 162
    return-void
.end method

.method public initThreadPoolUtils6()V
    .locals 0

    .line 163
    return-void
.end method
