.class Lcom/launchdarkly/android/Throttler;
.super Ljava/lang/Object;
.source "Throttler.java"


# instance fields
.field private final attempts:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final attemptsResetRunnable:Ljava/lang/Runnable;

.field private final handler:Landroid/os/Handler;

.field private final jitter:Ljava/util/Random;

.field private final maxAttemptsReached:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final maxRetryTimeMs:J

.field private final retryTimeMs:J

.field private final runnable:Ljava/lang/Runnable;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Runnable;JJ)V
    .locals 0
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/launchdarkly/android/Throttler;->runnable:Ljava/lang/Runnable;

    .line 34
    iput-wide p2, p0, Lcom/launchdarkly/android/Throttler;->retryTimeMs:J

    .line 35
    iput-wide p4, p0, Lcom/launchdarkly/android/Throttler;->maxRetryTimeMs:J

    .line 37
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lcom/launchdarkly/android/Throttler;->jitter:Ljava/util/Random;

    .line 38
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lcom/launchdarkly/android/Throttler;->attempts:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 39
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/launchdarkly/android/Throttler;->maxAttemptsReached:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/launchdarkly/android/Throttler;->handler:Landroid/os/Handler;

    .line 42
    new-instance p1, Lcom/launchdarkly/android/Throttler$1;

    invoke-direct {p1, p0}, Lcom/launchdarkly/android/Throttler$1;-><init>(Lcom/launchdarkly/android/Throttler;)V

    iput-object p1, p0, Lcom/launchdarkly/android/Throttler;->attemptsResetRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic access$000(Lcom/launchdarkly/android/Throttler;)Ljava/lang/Runnable;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/launchdarkly/android/Throttler;->runnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic access$100(Lcom/launchdarkly/android/Throttler;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/launchdarkly/android/Throttler;->attempts:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method static synthetic access$200(Lcom/launchdarkly/android/Throttler;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/launchdarkly/android/Throttler;->maxAttemptsReached:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method private nextLong(Ljava/util/Random;J)J
    .locals 11

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_2

    .line 97
    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    move-result-wide v2

    const-wide v4, 0x7fffffffffffffffL

    and-long/2addr v2, v4

    const-wide/16 v6, 0x1

    sub-long v6, p2, v6

    and-long v8, p2, v6

    cmp-long v10, v8, v0

    if-nez v10, :cond_0

    mul-long p2, p2, v2

    const/16 p1, 0x3f

    shr-long p1, p2, p1

    goto :goto_1

    .line 102
    :cond_0
    :goto_0
    rem-long v8, v2, p2

    sub-long/2addr v2, v8

    add-long/2addr v2, v6

    cmp-long v10, v2, v0

    if-gez v10, :cond_1

    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    move-result-wide v2

    and-long/2addr v2, v4

    goto :goto_0

    :cond_1
    move-wide p1, v8

    :goto_1
    return-wide p1

    .line 94
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bound must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private pow2(I)I
    .locals 1

    const/16 v0, 0x1f

    if-ge p1, v0, :cond_0

    const/4 v0, 0x1

    shl-int p1, v0, p1

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    :goto_0
    return p1
.end method


# virtual methods
.method attemptRun()V
    .locals 5

    .line 54
    iget-object v0, p0, Lcom/launchdarkly/android/Throttler;->attempts:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/launchdarkly/android/Throttler;->runnable:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 56
    iget-object v0, p0, Lcom/launchdarkly/android/Throttler;->attempts:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    return-void

    .line 60
    :cond_0
    iget-object v0, p0, Lcom/launchdarkly/android/Throttler;->attempts:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/launchdarkly/android/Throttler;->calculateJitterVal(I)J

    move-result-wide v0

    .line 63
    iget-object v2, p0, Lcom/launchdarkly/android/Throttler;->maxAttemptsReached:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_2

    .line 64
    iget-wide v2, p0, Lcom/launchdarkly/android/Throttler;->maxRetryTimeMs:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 65
    iget-object v2, p0, Lcom/launchdarkly/android/Throttler;->maxAttemptsReached:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 67
    :cond_1
    invoke-virtual {p0, v0, v1}, Lcom/launchdarkly/android/Throttler;->backoffWithJitter(J)J

    move-result-wide v0

    .line 68
    iget-object v2, p0, Lcom/launchdarkly/android/Throttler;->handler:Landroid/os/Handler;

    iget-object v3, p0, Lcom/launchdarkly/android/Throttler;->attemptsResetRunnable:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 69
    iget-object v2, p0, Lcom/launchdarkly/android/Throttler;->handler:Landroid/os/Handler;

    iget-object v3, p0, Lcom/launchdarkly/android/Throttler;->attemptsResetRunnable:Ljava/lang/Runnable;

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    return-void
.end method

.method backoffWithJitter(J)J
    .locals 5

    const-wide/16 v0, 0x2

    .line 82
    div-long v2, p1, v0

    iget-object v4, p0, Lcom/launchdarkly/android/Throttler;->jitter:Ljava/util/Random;

    invoke-direct {p0, v4, p1, p2}, Lcom/launchdarkly/android/Throttler;->nextLong(Ljava/util/Random;J)J

    move-result-wide p1

    div-long/2addr p1, v0

    add-long/2addr v2, p1

    return-wide v2
.end method

.method calculateJitterVal(I)J
    .locals 6

    .line 78
    iget-wide v0, p0, Lcom/launchdarkly/android/Throttler;->maxRetryTimeMs:J

    iget-wide v2, p0, Lcom/launchdarkly/android/Throttler;->retryTimeMs:J

    invoke-direct {p0, p1}, Lcom/launchdarkly/android/Throttler;->pow2(I)I

    move-result p1

    int-to-long v4, p1

    mul-long v2, v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method cancel()V
    .locals 2

    .line 74
    iget-object v0, p0, Lcom/launchdarkly/android/Throttler;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/launchdarkly/android/Throttler;->attemptsResetRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method
