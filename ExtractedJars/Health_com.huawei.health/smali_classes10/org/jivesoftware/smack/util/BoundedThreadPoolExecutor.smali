.class public Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;
.super Ljava/util/concurrent/ThreadPoolExecutor;
.source "SourceFile"


# instance fields
.field private final semaphore:Ljava/util/concurrent/Semaphore;


# direct methods
.method public constructor <init>(IIJLjava/util/concurrent/TimeUnit;ILjava/util/concurrent/ThreadFactory;)V
    .locals 8

    .line 36
    move-object v0, p0

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p5

    new-instance v6, Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-direct {v6, p6}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 38
    new-instance v0, Ljava/util/concurrent/Semaphore;

    invoke-direct {v0, p6}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;->semaphore:Ljava/util/concurrent/Semaphore;

    .line 39
    return-void
.end method

.method static synthetic access$000(Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;)Ljava/util/concurrent/Semaphore;
    .locals 1

    .line 26
    iget-object v0, p0, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;->semaphore:Ljava/util/concurrent/Semaphore;

    return-object v0
.end method


# virtual methods
.method public executeBlocking(Ljava/lang/Runnable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;->semaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V

    .line 44
    :try_start_0
    new-instance v0, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor$3;

    invoke-direct {v0, p0, p1}, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor$3;-><init>(Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    goto :goto_0

    .line 54
    :catch_0
    move-exception v1

    .line 55
    iget-object v0, p0, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;->semaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 56
    instance-of v0, v1, Ljava/util/concurrent/RejectedExecutionException;

    if-eqz v0, :cond_0

    .line 57
    move-object v0, v1

    check-cast v0, Ljava/util/concurrent/RejectedExecutionException;

    throw v0

    .line 59
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 62
    :goto_0
    return-void
.end method
