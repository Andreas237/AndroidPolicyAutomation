.class public final Lrx/internal/util/BlockingUtils;
.super Ljava/lang/Object;
.source "BlockingUtils.java"


# annotations
.annotation build Lrx/annotations/Experimental;
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static awaitForComplete(Ljava/util/concurrent/CountDownLatch;Lrx/Subscription;)V
    .locals 6
    .param p0, "latch"    # Ljava/util/concurrent/CountDownLatch;
    .param p1, "subscription"    # Lrx/Subscription;
    .annotation build Lrx/annotations/Experimental;
    .end annotation

    .prologue
    .line 42
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    .line 58
    :goto_0
    return-void

    .line 49
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 50
    :catch_0
    move-exception v0

    .line 51
    .local v0, "e":Ljava/lang/InterruptedException;
    invoke-interface {p1}, Lrx/Subscription;->unsubscribe()V

    .line 54
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 56
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Interrupted while waiting for subscription to complete."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
