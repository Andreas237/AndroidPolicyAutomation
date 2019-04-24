.class public Lcom/microblink/camera/util/ProcessingQueue;
.super Ljava/lang/Thread;

# interfaces
.implements Lcom/microblink/camera/util/IProcessingQueue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/camera/util/ProcessingQueue$DetailedHandler;
    }
.end annotation


# instance fields
.field private mHandler:Landroid/os/Handler;

.field private mLooper:Landroid/os/Looper;

.field private mName:Ljava/lang/String;

.field private mQueueExiting:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mQueueFinished:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mShutdownLatch:Ljava/util/concurrent/CountDownLatch;

.field private mStartupLatch:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mQueueFinished:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v0, ""

    iput-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mQueueExiting:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lcom/microblink/camera/util/ProcessingQueue;->mStartupLatch:Ljava/util/concurrent/CountDownLatch;

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lcom/microblink/camera/util/ProcessingQueue;->mShutdownLatch:Ljava/util/concurrent/CountDownLatch;

    iget-object p1, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/microblink/camera/util/ProcessingQueue;->setName(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/camera/util/ProcessingQueue;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/camera/util/ProcessingQueue;)Landroid/os/Looper;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mLooper:Landroid/os/Looper;

    return-object p0
.end method

.method private waitForStartup()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mStartupLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Interrupted while waiting for processing queue {} to start"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-static {p0, v0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getHandler()Landroid/os/Handler;
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/util/ProcessingQueue;->waitForStartup()V

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public postJob(Ljava/lang/Runnable;)V
    .locals 3

    invoke-direct {p0}, Lcom/microblink/camera/util/ProcessingQueue;->waitForStartup()V

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mQueueExiting:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    const-string p1, "Processing queue {} is exiting, unable to post job to it"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public postJobDelayed(Ljava/lang/Runnable;J)V
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/util/ProcessingQueue;->waitForStartup()V

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mQueueExiting:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    const-string p1, "Processing queue {} is exiting, unable to post job to it"

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    aput-object v0, p2, p3

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public postShutdownJob()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mQueueExiting:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/microblink/camera/util/ProcessingQueue$2;

    invoke-direct {v1, p0}, Lcom/microblink/camera/util/ProcessingQueue$2;-><init>(Lcom/microblink/camera/util/ProcessingQueue;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mHandler:Landroid/os/Handler;

    :cond_0
    return-void
.end method

.method public run()V
    .locals 5

    :try_start_0
    invoke-static {}, Landroid/os/Looper;->prepare()V

    const-string v0, "Booting processing queue {}"

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mLooper:Landroid/os/Looper;

    new-instance v0, Lcom/microblink/camera/util/ProcessingQueue$DetailedHandler;

    iget-object v2, p0, Lcom/microblink/camera/util/ProcessingQueue;->mLooper:Landroid/os/Looper;

    invoke-direct {v0, v2}, Lcom/microblink/camera/util/ProcessingQueue$DetailedHandler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mStartupLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    invoke-static {}, Landroid/os/Looper;->loop()V

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mQueueFinished:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mShutdownLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    const-string v0, "Processing queue {} terminated gracefully"

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    aput-object v2, v1, v4

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lcom/microblink/camera/util/ProcessingQueue$1;

    invoke-direct {v2, p0, v0}, Lcom/microblink/camera/util/ProcessingQueue$1;-><init>(Lcom/microblink/camera/util/ProcessingQueue;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public waitForShutdown(J)V
    .locals 6

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mQueueFinished:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    const-wide/16 v3, 0x0

    const/4 v0, 0x2

    cmp-long v5, p1, v3

    if-lez v5, :cond_0

    :try_start_0
    const-string v3, "Waiting max {} miliseconds for processing queue {} to shutdown..."

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    iget-object v5, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    aput-object v5, v4, v2

    invoke-static {p0, v3, v4}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/microblink/camera/util/ProcessingQueue;->mShutdownLatch:Ljava/util/concurrent/CountDownLatch;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, p1, p2, v4}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v3

    goto :goto_0

    :cond_0
    const-string v3, "Waiting for processing queue {} to shutdown..."

    new-array v4, v2, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    aput-object v5, v4, v1

    invoke-static {p0, v3, v4}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/microblink/camera/util/ProcessingQueue;->mShutdownLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->await()V

    const/4 v3, 0x1

    :goto_0
    if-nez v3, :cond_1

    const-string v3, "Processing queue {} still not exited (after {} miliseconds wait). Giving up..."

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    aput-object v4, v0, v1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v0, v2

    invoke-static {p0, v3, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    const-string p1, "Processing queue {} is now terminated..."

    new-array p2, v2, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    aput-object v0, p2, v1

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "Interrupted while waiting for processing queue {} to shutdown"

    new-array v0, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {p0, p1, p2, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    const-string p1, "Processing queue {} is already terminated."

    new-array p2, v2, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue;->mName:Ljava/lang/String;

    aput-object v0, p2, v1

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
