.class public Lo/bod;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bol;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bod$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/concurrent/ThreadPoolExecutor;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/concurrent/ThreadPoolExecutor;

.field private final c:Ljava/util/concurrent/ScheduledExecutorService;

.field private final d:Ljava/util/concurrent/ThreadFactory;


# direct methods
.method constructor <init>()V
    .locals 8

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Lo/bod$c;

    invoke-direct {v0}, Lo/bod$c;-><init>()V

    iput-object v0, p0, Lo/bod;->d:Ljava/util/concurrent/ThreadFactory;

    .line 55
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/bod;->a:Ljava/util/Map;

    .line 62
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iget-object v7, p0, Lo/bod;->d:Ljava/util/concurrent/ThreadFactory;

    const/16 v1, 0x8

    const/16 v2, 0x10

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lo/bod;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 64
    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    iget-object v1, p0, Lo/bod;->d:Ljava/util/concurrent/ThreadFactory;

    const/16 v2, 0x8

    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lo/bod;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 65
    return-void
.end method

.method private declared-synchronized b()V
    .locals 4

    monitor-enter p0

    .line 352
    :try_start_0
    iget-object v0, p0, Lo/bod;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 354
    const/4 v3, 0x0

    .line 356
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 358
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map$Entry;

    .line 359
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 361
    invoke-virtual {v3}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 362
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 364
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 298
    iget-object v0, p0, Lo/bod;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 300
    iget-object v0, p0, Lo/bod;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 302
    invoke-direct {p0}, Lo/bod;->b()V

    .line 303
    return-void
.end method

.method public e(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future<*>;"
        }
    .end annotation

    .line 107
    if-nez p1, :cond_0

    .line 109
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 112
    :cond_0
    iget-object v0, p0, Lo/bod;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    .line 114
    return-object v1
.end method

.method protected finalize()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 72
    invoke-virtual {p0}, Lo/bod;->d()V

    .line 73
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 74
    return-void
.end method
