.class public Lo/fku;
.super Ljava/util/concurrent/AbstractExecutorService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fku$4;,
        Lo/fku$e;,
        Lo/fku$d;
    }
.end annotation


# static fields
.field static final synthetic b:Z

.field private static f:Z

.field private static final i:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<Ljava/lang/Object;>;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/util/concurrent/ExecutorService;

.field private final c:Ljava/util/concurrent/locks/ReentrantLock;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Object;Lo/fku$e;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/locks/Condition;

.field private k:Lo/fku$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    const-class v0, Lo/fku;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lo/fku;->b:Z

    .line 78
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lo/fku;->i:Ljava/lang/ThreadLocal;

    .line 400
    const/4 v0, 0x0

    sput-boolean v0, Lo/fku;->f:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 108
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fku;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 109
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .line 99
    invoke-direct {p0}, Ljava/util/concurrent/AbstractExecutorService;-><init>()V

    .line 53
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 59
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Lo/fku;->e:Ljava/util/concurrent/locks/Condition;

    .line 67
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/fku;->d:Ljava/util/Map;

    .line 85
    sget-object v0, Lo/fku$d;->b:Lo/fku$d;

    iput-object v0, p0, Lo/fku;->k:Lo/fku$d;

    .line 100
    iput-object p1, p0, Lo/fku;->a:Ljava/util/concurrent/ExecutorService;

    .line 101
    return-void
.end method

.method private a(Ljava/lang/Runnable;)Ljava/lang/Object;
    .locals 2

    .line 256
    instance-of v0, p1, Lo/fkt;

    if-eqz v0, :cond_0

    .line 257
    move-object v0, p1

    check-cast v0, Lo/fkt;

    invoke-interface {v0}, Lo/fkt;->e()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    .line 259
    :cond_0
    sget-object v0, Lo/fku;->i:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    .line 261
    :goto_0
    sget-object v0, Lo/fku;->i:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 262
    return-object v1
.end method

.method static synthetic a(Lo/fku;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/fku;->a:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private a(Ljava/lang/Object;)V
    .locals 2

    .line 146
    invoke-static {p1}, Lo/fku;->b(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    sget-object v0, Lo/fku;->i:Ljava/lang/ThreadLocal;

    move-object v1, p1

    check-cast v1, Lo/fkt;

    invoke-interface {v1}, Lo/fkt;->e()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 149
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/fku;Ljava/lang/Object;Lo/fku$e;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2}, Lo/fku;->d(Ljava/lang/Object;Lo/fku$e;)V

    return-void
.end method

.method private static b(Ljava/lang/Object;)Z
    .locals 1

    .line 156
    instance-of v0, p0, Lo/fkt;

    return v0
.end method

.method static synthetic c(Lo/fku;)Ljava/util/concurrent/locks/Condition;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/fku;->e:Ljava/util/concurrent/locks/Condition;

    return-object v0
.end method

.method static synthetic c()Z
    .locals 1

    .line 42
    sget-boolean v0, Lo/fku;->f:Z

    return v0
.end method

.method private d()V
    .locals 2

    .line 211
    sget-boolean v0, Lo/fku;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 212
    :cond_0
    iget-object v0, p0, Lo/fku;->k:Lo/fku$d;

    sget-object v1, Lo/fku$d;->b:Lo/fku$d;

    if-eq v0, v1, :cond_1

    .line 213
    new-instance v0, Ljava/util/concurrent/RejectedExecutionException;

    const-string v1, "executor not running"

    invoke-direct {v0, v1}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 216
    :cond_1
    return-void
.end method

.method private d(Ljava/lang/Object;Lo/fku$e;)V
    .locals 2

    .line 367
    sget-boolean v0, Lo/fku;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fku;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq p2, v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 368
    :cond_0
    sget-boolean v0, Lo/fku;->b:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 369
    :cond_1
    sget-boolean v0, Lo/fku;->b:Z

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lo/fku$e;->d()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 371
    :cond_2
    iget-object v0, p0, Lo/fku;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    iget-object v0, p0, Lo/fku;->e:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V

    .line 373
    iget-object v0, p0, Lo/fku;->k:Lo/fku$d;

    sget-object v1, Lo/fku$d;->c:Lo/fku$d;

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lo/fku;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 374
    iget-object v0, p0, Lo/fku;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 376
    :cond_3
    return-void
.end method

.method static synthetic e(Lo/fku;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method


# virtual methods
.method public awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 340
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 342
    :try_start_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    add-long v4, v0, v2

    .line 344
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sub-long v0, v4, v0

    move-wide v6, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lo/fku;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 346
    iget-object v0, p0, Lo/fku;->e:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0, v6, v7}, Ljava/util/concurrent/locks/Condition;->awaitNanos(J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 348
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-gtz v0, :cond_1

    const/4 v8, 0x0

    .line 355
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return v8

    .line 349
    :cond_1
    :try_start_1
    iget-object v0, p0, Lo/fku;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 350
    iget-object v0, p0, Lo/fku;->a:Ljava/util/concurrent/ExecutorService;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v6, v7, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v8

    .line 355
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return v8

    .line 353
    :cond_2
    const/4 v8, 0x0

    .line 355
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return v8

    :catchall_0
    move-exception v9

    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v9
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 5

    .line 230
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 232
    :try_start_0
    invoke-direct {p0}, Lo/fku;->d()V

    .line 233
    invoke-direct {p0, p1}, Lo/fku;->a(Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v2

    .line 234
    if-eqz v2, :cond_1

    .line 235
    iget-object v0, p0, Lo/fku;->d:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fku$e;

    .line 236
    if-nez v3, :cond_0

    .line 237
    iget-object v0, p0, Lo/fku;->d:Ljava/util/Map;

    new-instance v3, Lo/fku$e;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v2, v1}, Lo/fku$e;-><init>(Lo/fku;Ljava/lang/Object;Lo/fku$4;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    :cond_0
    invoke-virtual {v3, p1}, Lo/fku$e;->execute(Ljava/lang/Runnable;)V

    .line 241
    goto :goto_0

    .line 242
    :cond_1
    iget-object v0, p0, Lo/fku;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    :goto_0
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 246
    goto :goto_1

    .line 245
    :catchall_0
    move-exception v4

    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v4

    .line 247
    :goto_1
    return-void
.end method

.method public isShutdown()Z
    .locals 4

    .line 308
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 310
    :try_start_0
    iget-object v0, p0, Lo/fku;->k:Lo/fku$d;

    sget-object v1, Lo/fku$d;->c:Lo/fku$d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 312
    :goto_0
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return v2

    :catchall_0
    move-exception v3

    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v3
.end method

.method public isTerminated()Z
    .locals 6

    .line 322
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 324
    :try_start_0
    iget-object v0, p0, Lo/fku;->k:Lo/fku$d;

    sget-object v1, Lo/fku$d;->b:Lo/fku$d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    const/4 v2, 0x0

    .line 330
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return v2

    .line 325
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/fku;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fku$e;

    .line 326
    invoke-virtual {v3}, Lo/fku$e;->d()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    const/4 v4, 0x0

    .line 330
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return v4

    .line 327
    :cond_1
    goto :goto_0

    .line 328
    :cond_2
    :try_start_2
    iget-object v0, p0, Lo/fku;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v2

    .line 330
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return v2

    :catchall_0
    move-exception v5

    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v5
.end method

.method protected newTaskFor(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/RunnableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/Runnable;TT;)Ljava/util/concurrent/RunnableFuture<TT;>;"
        }
    .end annotation

    .line 126
    invoke-direct {p0, p1}, Lo/fku;->a(Ljava/lang/Object;)V

    .line 127
    invoke-super {p0, p1, p2}, Ljava/util/concurrent/AbstractExecutorService;->newTaskFor(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/RunnableFuture;

    move-result-object v0

    return-object v0
.end method

.method protected newTaskFor(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/RunnableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/util/concurrent/Callable<TT;>;)Ljava/util/concurrent/RunnableFuture<TT;>;"
        }
    .end annotation

    .line 137
    invoke-direct {p0, p1}, Lo/fku;->a(Ljava/lang/Object;)V

    .line 138
    invoke-super {p0, p1}, Ljava/util/concurrent/AbstractExecutorService;->newTaskFor(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/RunnableFuture;

    move-result-object v0

    return-object v0
.end method

.method public shutdown()V
    .locals 2

    .line 271
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 273
    :try_start_0
    sget-object v0, Lo/fku$d;->c:Lo/fku$d;

    iput-object v0, p0, Lo/fku;->k:Lo/fku$d;

    .line 274
    iget-object v0, p0, Lo/fku;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Lo/fku;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 278
    :cond_0
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 279
    goto :goto_0

    .line 278
    :catchall_0
    move-exception v1

    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v1

    .line 280
    :goto_0
    return-void
.end method

.method public shutdownNow()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Runnable;>;"
        }
    .end annotation

    .line 289
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 291
    :try_start_0
    invoke-virtual {p0}, Lo/fku;->shutdown()V

    .line 292
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 293
    iget-object v0, p0, Lo/fku;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fku$e;

    .line 294
    invoke-static {v3}, Lo/fku$e;->a(Lo/fku$e;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->drainTo(Ljava/util/Collection;)I

    .line 295
    goto :goto_0

    .line 296
    :cond_0
    iget-object v0, p0, Lo/fku;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 297
    move-object v2, v1

    .line 299
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v2

    :catchall_0
    move-exception v4

    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v4
.end method

.method public submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future<*>;"
        }
    .end annotation

    .line 163
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/fku;->submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method

.method public submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/Runnable;TT;)Ljava/util/concurrent/Future<TT;>;"
        }
    .end annotation

    .line 173
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 175
    :try_start_0
    invoke-direct {p0}, Lo/fku;->d()V

    .line 176
    invoke-static {p1}, Lo/fku;->b(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 177
    invoke-super {p0, p1, p2}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 182
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v1

    .line 179
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/fku;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    .line 182
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v1

    :catchall_0
    move-exception v2

    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v2
.end method

.method public submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/util/concurrent/Callable<TT;>;)Ljava/util/concurrent/Future<TT;>;"
        }
    .end annotation

    .line 193
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 195
    :try_start_0
    invoke-direct {p0}, Lo/fku;->d()V

    .line 196
    invoke-static {p1}, Lo/fku;->b(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    invoke-super {p0, p1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 202
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v1

    .line 199
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/fku;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    .line 202
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v1

    :catchall_0
    move-exception v2

    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v2
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 383
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 385
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StripedExecutorService: state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fku;->k:Lo/fku$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "executor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fku;->a:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "serialExecutors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fku;->d:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 389
    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v2

    :catchall_0
    move-exception v3

    iget-object v0, p0, Lo/fku;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v3
.end method
