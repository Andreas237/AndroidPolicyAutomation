.class Lcom/launchdarkly/android/BackgroundThreadExecutor;
.super Ljava/lang/Object;
.source "BackgroundThreadExecutor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory;
    }
.end annotation


# instance fields
.field private final threadFactory:Ljava/util/concurrent/ThreadFactory;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory;-><init>(I)V

    iput-object v0, p0, Lcom/launchdarkly/android/BackgroundThreadExecutor;->threadFactory:Ljava/util/concurrent/ThreadFactory;

    return-void
.end method


# virtual methods
.method newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;
    .locals 9

    .line 27
    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iget-object v7, p0, Lcom/launchdarkly/android/BackgroundThreadExecutor;->threadFactory:Ljava/util/concurrent/ThreadFactory;

    const-wide/16 v3, 0x0

    move-object v0, v8

    move v1, p1

    move v2, p1

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    return-object v8
.end method
