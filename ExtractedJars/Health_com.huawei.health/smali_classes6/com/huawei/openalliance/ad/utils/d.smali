.class public abstract Lcom/huawei/openalliance/ad/utils/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/utils/d$a;
    }
.end annotation


# static fields
.field private static a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lcom/huawei/openalliance/ad/utils/d$a;Ljava/util/concurrent/ExecutorService;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/d;->a()V

    return-void
.end method

.method static a(Ljava/util/concurrent/Callable;Lcom/huawei/openalliance/ad/utils/d$a;)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:Ljava/lang/Object;>(Ljava/util/concurrent/Callable<TV;>;Lcom/huawei/openalliance/ad/utils/d$a;)Ljava/util/concurrent/Future<TV;>;"
        }
    .end annotation

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized a()V
    .locals 19

    const-class v18, Lcom/huawei/openalliance/ad/utils/d;

    monitor-enter v18

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/utils/d;->a:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Lcom/huawei/openalliance/ad/utils/e;

    const-string v1, "IO"

    invoke-direct {v7, v1}, Lcom/huawei/openalliance/ad/utils/e;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x3

    const/4 v2, 0x5

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    move-object v10, v0

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Lcom/huawei/openalliance/ad/utils/e;

    const-string v1, "Net"

    invoke-direct {v7, v1}, Lcom/huawei/openalliance/ad/utils/e;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x3

    const/4 v2, 0x5

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    move-object v11, v0

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0xa

    invoke-direct {v6, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    new-instance v7, Lcom/huawei/openalliance/ad/utils/e;

    const-string v1, "Download"

    invoke-direct {v7, v1}, Lcom/huawei/openalliance/ad/utils/e;-><init>(Ljava/lang/String;)V

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;

    invoke-direct {v8}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    move-object v12, v0

    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Lcom/huawei/openalliance/ad/utils/e;

    const-string v1, "Cal"

    invoke-direct {v7, v1}, Lcom/huawei/openalliance/ad/utils/e;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x3

    const/4 v2, 0x5

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    move-object v13, v0

    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Lcom/huawei/openalliance/ad/utils/e;

    const-string v1, "Seq"

    invoke-direct {v7, v1}, Lcom/huawei/openalliance/ad/utils/e;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    move-object v14, v0

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Lcom/huawei/openalliance/ad/utils/e;

    const-string v1, "Event"

    invoke-direct {v7, v1}, Lcom/huawei/openalliance/ad/utils/e;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    move-object v15, v0

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Lcom/huawei/openalliance/ad/utils/e;

    const-string v1, "SyncCall"

    const/16 v2, 0xa

    invoke-direct {v7, v1, v2}, Lcom/huawei/openalliance/ad/utils/e;-><init>(Ljava/lang/String;I)V

    const/4 v1, 0x3

    const/4 v2, 0x5

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    move-object/from16 v16, v0

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Lcom/huawei/openalliance/ad/utils/e;

    const-string v1, "SplashNet"

    invoke-direct {v7, v1}, Lcom/huawei/openalliance/ad/utils/e;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x3

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    move-object/from16 v17, v0

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->a:Lcom/huawei/openalliance/ad/utils/d$a;

    invoke-interface {v9, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->b:Lcom/huawei/openalliance/ad/utils/d$a;

    invoke-interface {v9, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->e:Lcom/huawei/openalliance/ad/utils/d$a;

    invoke-interface {v9, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->c:Lcom/huawei/openalliance/ad/utils/d$a;

    invoke-interface {v9, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->d:Lcom/huawei/openalliance/ad/utils/d$a;

    invoke-interface {v9, v0, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->f:Lcom/huawei/openalliance/ad/utils/d$a;

    invoke-interface {v9, v0, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->g:Lcom/huawei/openalliance/ad/utils/d$a;

    move-object/from16 v1, v16

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->h:Lcom/huawei/openalliance/ad/utils/d$a;

    move-object/from16 v1, v17

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sput-object v9, Lcom/huawei/openalliance/ad/utils/d;->a:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v18

    return-void

    :catchall_0
    move-exception v9

    monitor-exit v18

    throw v9
.end method

.method public static a(Ljava/lang/Runnable;)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->a:Lcom/huawei/openalliance/ad/utils/d$a;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;Lcom/huawei/openalliance/ad/utils/d$a;Z)V

    return-void
.end method

.method public static a(Ljava/lang/Runnable;Lcom/huawei/openalliance/ad/utils/d$a;Z)V
    .locals 5

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/d;->b()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v4, Lcom/huawei/openalliance/ad/utils/ah;

    invoke-direct {v4, p0}, Lcom/huawei/openalliance/ad/utils/ah;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/utils/ah;->run()V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/huawei/openalliance/ad/utils/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/concurrent/ExecutorService;

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    new-instance v0, Lcom/huawei/openalliance/ad/utils/ah;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/utils/ah;-><init>(Ljava/lang/Runnable;)V

    invoke-interface {v4, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_2
    const-string v0, "AsyncExec"

    const-string v1, "no executor for type: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static b(Ljava/lang/Runnable;)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->b:Lcom/huawei/openalliance/ad/utils/d$a;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;Lcom/huawei/openalliance/ad/utils/d$a;Z)V

    return-void
.end method

.method private static b()Z
    .locals 3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c(Ljava/lang/Runnable;)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->e:Lcom/huawei/openalliance/ad/utils/d$a;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;Lcom/huawei/openalliance/ad/utils/d$a;Z)V

    return-void
.end method

.method public static d(Ljava/lang/Runnable;)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->c:Lcom/huawei/openalliance/ad/utils/d$a;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;Lcom/huawei/openalliance/ad/utils/d$a;Z)V

    return-void
.end method

.method public static e(Ljava/lang/Runnable;)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->d:Lcom/huawei/openalliance/ad/utils/d$a;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;Lcom/huawei/openalliance/ad/utils/d$a;Z)V

    return-void
.end method

.method public static f(Ljava/lang/Runnable;)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->f:Lcom/huawei/openalliance/ad/utils/d$a;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;Lcom/huawei/openalliance/ad/utils/d$a;Z)V

    return-void
.end method
