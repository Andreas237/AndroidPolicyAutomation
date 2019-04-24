.class public Lo/dbw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:I

.field private static b:Ljava/util/concurrent/ThreadFactory;

.field private static c:I

.field private static d:I

.field private static e:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Ljava/lang/Runnable;>;"
        }
    .end annotation
.end field

.field private static h:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 36
    const/4 v0, 0x5

    sput v0, Lo/dbw;->c:I

    .line 39
    const/16 v0, 0x14

    sput v0, Lo/dbw;->a:I

    .line 42
    const/16 v0, 0x1e

    sput v0, Lo/dbw;->d:I

    .line 45
    new-instance v0, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v0}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    sput-object v0, Lo/dbw;->e:Ljava/util/concurrent/BlockingQueue;

    .line 48
    new-instance v0, Lo/dbw$1;

    invoke-direct {v0}, Lo/dbw$1;-><init>()V

    sput-object v0, Lo/dbw;->b:Ljava/util/concurrent/ThreadFactory;

    .line 61
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v1, Lo/dbw;->c:I

    sget v2, Lo/dbw;->a:I

    sget v3, Lo/dbw;->d:I

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v6, Lo/dbw;->e:Ljava/util/concurrent/BlockingQueue;

    sget-object v7, Lo/dbw;->b:Ljava/util/concurrent/ThreadFactory;

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;

    invoke-direct {v8}, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;-><init>()V

    invoke-direct/range {v0 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    sput-object v0, Lo/dbw;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 65
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 4

    .line 69
    sget-object v0, Lo/dbw;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v0, :cond_0

    .line 70
    const-string v0, "ThreadPoolUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ThreadPoolExecutor is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 72
    :cond_0
    const-string v0, "ThreadPoolUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ThreadPoolExecutor != null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    :goto_0
    sget-object v0, Lo/dbw;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method

.method public static d(I)V
    .locals 0

    .line 134
    sput p0, Lo/dbw;->a:I

    .line 135
    return-void
.end method

.method public static e(Ljava/lang/Runnable;)I
    .locals 5

    .line 87
    :try_start_0
    sget-object v0, Lo/dbw;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 89
    const-string v0, "ThreadPoolUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ThreadPool.getActiveCount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lo/dbw;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->getActiveCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    const-string v0, "ThreadPoolUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ThreadPool.getPoolSize = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lo/dbw;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->getPoolSize()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    const-string v0, "ThreadPoolUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ThreadPool.getTaskCount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lo/dbw;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->getTaskCount()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    const/4 v0, 0x0

    return v0

    .line 95
    :catch_0
    move-exception v4

    .line 96
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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const/4 v0, -0x1

    return v0
.end method
