.class public abstract Ljava9/util/concurrent/ForkJoinTask;
.super Ljava/lang/Object;
.source "ForkJoinTask.java"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/concurrent/Future;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljava9/util/concurrent/ForkJoinTask$AdaptedCallable;,
        Ljava9/util/concurrent/ForkJoinTask$RunnableExecuteAction;,
        Ljava9/util/concurrent/ForkJoinTask$AdaptedRunnableAction;,
        Ljava9/util/concurrent/ForkJoinTask$AdaptedRunnable;,
        Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/util/concurrent/Future<",
        "TV;>;"
    }
.end annotation


# static fields
.field private static final STATUS:J

.field private static final U:Lsun/misc/Unsafe;

.field private static final exceptionTable:[Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;

.field private static final exceptionTableLock:Ljava/util/concurrent/locks/ReentrantLock;

.field private static final exceptionTableRefQueue:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Ljava9/util/concurrent/ForkJoinTask<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x6b295cc9a986fd4fL


# instance fields
.field volatile status:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x20

    .line 393
    new-array v0, v0, [Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;

    sput-object v0, Ljava9/util/concurrent/ForkJoinTask;->exceptionTable:[Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;

    .line 397
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Ljava9/util/concurrent/ForkJoinTask;->exceptionTableLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 401
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    sput-object v0, Ljava9/util/concurrent/ForkJoinTask;->exceptionTableRefQueue:Ljava/lang/ref/ReferenceQueue;

    .line 1502
    sget-object v0, Ljava9/util/concurrent/UnsafeAccess;->unsafe:Lsun/misc/Unsafe;

    sput-object v0, Ljava9/util/concurrent/ForkJoinTask;->U:Lsun/misc/Unsafe;

    .line 1507
    :try_start_0
    sget-object v0, Ljava9/util/concurrent/ForkJoinTask;->U:Lsun/misc/Unsafe;

    const-class v1, Ljava9/util/concurrent/ForkJoinTask;

    const-string v2, "status"

    .line 1508
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 1507
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ljava9/util/concurrent/ForkJoinTask;->STATUS:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 1510
    new-instance v1, Ljava/lang/Error;

    invoke-direct {v1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>()V
    .locals 0

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static final cancelIgnoringExceptions(Ljava9/util/concurrent/ForkJoinTask;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/concurrent/ForkJoinTask<",
            "*>;)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 488
    iget v0, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-ltz v0, :cond_0

    const/4 v0, 0x0

    .line 490
    :try_start_0
    invoke-virtual {p0, v0}, Ljava9/util/concurrent/ForkJoinTask;->cancel(Z)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private doInvoke()I
    .locals 4

    .line 375
    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinTask;->doExec()I

    move-result v0

    if-gez v0, :cond_0

    goto :goto_0

    .line 376
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v1, v0, Ljava9/util/concurrent/ForkJoinWorkerThread;

    if-eqz v1, :cond_1

    check-cast v0, Ljava9/util/concurrent/ForkJoinWorkerThread;

    iget-object v1, v0, Ljava9/util/concurrent/ForkJoinWorkerThread;->pool:Ljava9/util/concurrent/ForkJoinPool;

    iget-object v0, v0, Ljava9/util/concurrent/ForkJoinWorkerThread;->workQueue:Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    const-wide/16 v2, 0x0

    .line 378
    invoke-virtual {v1, v0, p0, v2, v3}, Ljava9/util/concurrent/ForkJoinPool;->awaitJoin(Ljava9/util/concurrent/ForkJoinPool$WorkQueue;Ljava9/util/concurrent/ForkJoinTask;J)I

    move-result v0

    goto :goto_0

    .line 379
    :cond_1
    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinTask;->externalAwaitDone()I

    move-result v0

    :goto_0
    return v0
.end method

.method private doJoin()I
    .locals 4

    .line 360
    iget v0, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-gez v0, :cond_0

    goto :goto_0

    .line 361
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v1, v0, Ljava9/util/concurrent/ForkJoinWorkerThread;

    if-eqz v1, :cond_2

    check-cast v0, Ljava9/util/concurrent/ForkJoinWorkerThread;

    iget-object v1, v0, Ljava9/util/concurrent/ForkJoinWorkerThread;->workQueue:Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    .line 363
    invoke-virtual {v1, p0}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->tryUnpush(Ljava9/util/concurrent/ForkJoinTask;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinTask;->doExec()I

    move-result v2

    if-gez v2, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    iget-object v0, v0, Ljava9/util/concurrent/ForkJoinWorkerThread;->pool:Ljava9/util/concurrent/ForkJoinPool;

    const-wide/16 v2, 0x0

    .line 364
    invoke-virtual {v0, v1, p0, v2, v3}, Ljava9/util/concurrent/ForkJoinPool;->awaitJoin(Ljava9/util/concurrent/ForkJoinPool$WorkQueue;Ljava9/util/concurrent/ForkJoinTask;J)I

    move-result v0

    goto :goto_0

    .line 365
    :cond_2
    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinTask;->externalAwaitDone()I

    move-result v0

    :goto_0
    return v0
.end method

.method private static expungeStaleExceptions()V
    .locals 7

    .line 584
    :cond_0
    :goto_0
    sget-object v0, Ljava9/util/concurrent/ForkJoinTask;->exceptionTableRefQueue:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 585
    instance-of v1, v0, Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;

    if-eqz v1, :cond_0

    .line 586
    sget-object v1, Ljava9/util/concurrent/ForkJoinTask;->exceptionTable:[Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;

    .line 587
    move-object v2, v0

    check-cast v2, Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;

    iget v2, v2, Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;->hashCode:I

    array-length v3, v1

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v2, v3

    .line 588
    aget-object v3, v1, v2

    const/4 v4, 0x0

    move-object v6, v4

    move-object v4, v3

    move-object v3, v6

    :goto_1
    if-eqz v4, :cond_0

    .line 591
    iget-object v5, v4, Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;->next:Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;

    if-ne v4, v0, :cond_2

    if-nez v3, :cond_1

    .line 594
    aput-object v5, v1, v2

    goto :goto_0

    .line 596
    :cond_1
    iput-object v5, v3, Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;->next:Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;

    goto :goto_0

    :cond_2
    move-object v3, v4

    move-object v4, v5

    goto :goto_1

    :cond_3
    return-void
.end method

.method private externalAwaitDone()I
    .locals 8

    .line 297
    instance-of v0, p0, Ljava9/util/concurrent/CountedCompleter;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->common:Ljava9/util/concurrent/ForkJoinPool;

    move-object v2, p0

    check-cast v2, Ljava9/util/concurrent/CountedCompleter;

    .line 298
    invoke-virtual {v0, v2, v1}, Ljava9/util/concurrent/ForkJoinPool;->externalHelpComplete(Ljava9/util/concurrent/CountedCompleter;I)I

    move-result v0

    goto :goto_0

    :cond_0
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->common:Ljava9/util/concurrent/ForkJoinPool;

    .line 300
    invoke-virtual {v0, p0}, Ljava9/util/concurrent/ForkJoinPool;->tryExternalUnpush(Ljava9/util/concurrent/ForkJoinTask;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinTask;->doExec()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-ltz v0, :cond_6

    .line 301
    iget v0, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-ltz v0, :cond_6

    move v6, v0

    .line 304
    :cond_2
    sget-object v2, Ljava9/util/concurrent/ForkJoinTask;->U:Lsun/misc/Unsafe;

    sget-wide v4, Ljava9/util/concurrent/ForkJoinTask;->STATUS:J

    const/high16 v0, 0x10000

    or-int v7, v6, v0

    move-object v3, p0

    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 305
    monitor-enter p0

    .line 306
    :try_start_0
    iget v0, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ltz v0, :cond_3

    const-wide/16 v2, 0x0

    .line 308
    :try_start_1
    invoke-virtual {p0, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    const/4 v1, 0x1

    goto :goto_1

    .line 314
    :cond_3
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 315
    :goto_1
    monitor-exit p0

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 317
    :cond_4
    :goto_2
    iget v6, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-gez v6, :cond_2

    if-eqz v1, :cond_5

    .line 319
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_5
    move v0, v6

    :cond_6
    return v0
.end method

.method private externalInterruptibleAwaitDone()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 329
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_6

    .line 331
    iget v0, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-ltz v0, :cond_5

    instance-of v0, p0, Ljava9/util/concurrent/CountedCompleter;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->common:Ljava9/util/concurrent/ForkJoinPool;

    move-object v2, p0

    check-cast v2, Ljava9/util/concurrent/CountedCompleter;

    .line 333
    invoke-virtual {v0, v2, v1}, Ljava9/util/concurrent/ForkJoinPool;->externalHelpComplete(Ljava9/util/concurrent/CountedCompleter;I)I

    move-result v0

    goto :goto_0

    :cond_0
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->common:Ljava9/util/concurrent/ForkJoinPool;

    .line 335
    invoke-virtual {v0, p0}, Ljava9/util/concurrent/ForkJoinPool;->tryExternalUnpush(Ljava9/util/concurrent/ForkJoinTask;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinTask;->doExec()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-ltz v0, :cond_5

    .line 337
    :cond_2
    :goto_1
    iget v5, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-ltz v5, :cond_4

    .line 338
    sget-object v1, Ljava9/util/concurrent/ForkJoinTask;->U:Lsun/misc/Unsafe;

    sget-wide v3, Ljava9/util/concurrent/ForkJoinTask;->STATUS:J

    const/high16 v0, 0x10000

    or-int v6, v5, v0

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 339
    monitor-enter p0

    .line 340
    :try_start_0
    iget v0, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-ltz v0, :cond_3

    const-wide/16 v0, 0x0

    .line 341
    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    goto :goto_2

    .line 343
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 344
    :goto_2
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_4
    move v0, v5

    :cond_5
    return v0

    .line 330
    :cond_6
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
.end method

.method private getThrowableException()Ljava/lang/Throwable;
    .locals 10

    .line 542
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    .line 544
    sget-object v1, Ljava9/util/concurrent/ForkJoinTask;->exceptionTableLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 545
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 547
    :try_start_0
    invoke-static {}, Ljava9/util/concurrent/ForkJoinTask;->expungeStaleExceptions()V

    .line 548
    sget-object v2, Ljava9/util/concurrent/ForkJoinTask;->exceptionTable:[Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;

    .line 549
    array-length v3, v2

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    and-int/2addr v0, v3

    aget-object v0, v2, v0

    :goto_0
    if-eqz v0, :cond_0

    .line 550
    invoke-virtual {v0}, Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;->get()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p0, :cond_0

    .line 551
    iget-object v0, v0, Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;->next:Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 553
    :cond_0
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    .line 556
    iget-object v2, v0, Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;->ex:Ljava/lang/Throwable;

    if-nez v2, :cond_1

    goto :goto_3

    .line 558
    :cond_1
    iget-wide v5, v0, Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;->thrower:J

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v7

    cmp-long v0, v5, v7

    if-eqz v0, :cond_5

    .line 562
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    array-length v3, v0

    const/4 v5, 0x0

    move-object v6, v1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v3, :cond_4

    aget-object v7, v0, v1

    .line 563
    invoke-virtual {v7}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    .line 564
    array-length v9, v8

    if-nez v9, :cond_2

    move-object v6, v7

    goto :goto_2

    .line 566
    :cond_2
    array-length v9, v8

    if-ne v9, v4, :cond_3

    aget-object v8, v8, v5

    const-class v9, Ljava/lang/Throwable;

    if-ne v8, v9, :cond_3

    .line 567
    new-array v0, v4, [Ljava/lang/Object;

    aput-object v2, v0, v5

    invoke-virtual {v7, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    return-object v0

    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    if-eqz v6, :cond_5

    .line 570
    new-array v0, v5, [Ljava/lang/Object;

    invoke-virtual {v6, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    .line 571
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    :cond_5
    return-object v2

    :cond_6
    :goto_3
    return-object v1

    :catchall_0
    move-exception v0

    .line 553
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method static final helpExpungeStaleExceptions()V
    .locals 2

    .line 611
    sget-object v0, Ljava9/util/concurrent/ForkJoinTask;->exceptionTableLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 612
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 614
    :try_start_0
    invoke-static {}, Ljava9/util/concurrent/ForkJoinTask;->expungeStaleExceptions()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 616
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v1

    :cond_0
    :goto_0
    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 1495
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1496
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 1498
    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {p0, p1}, Ljava9/util/concurrent/ForkJoinTask;->setExceptionalCompletion(Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method private reportException(I)V
    .locals 1

    const/high16 v0, -0x40000000    # -2.0f

    if-eq p1, v0, :cond_1

    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_0

    .line 648
    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinTask;->getThrowableException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/concurrent/ForkJoinTask;->rethrow(Ljava/lang/Throwable;)V

    :cond_0
    return-void

    .line 646
    :cond_1
    new-instance p1, Ljava/util/concurrent/CancellationException;

    invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw p1
.end method

.method static rethrow(Ljava/lang/Throwable;)V
    .locals 0

    .line 625
    invoke-static {p0}, Ljava9/util/concurrent/ForkJoinTask;->uncheckedThrow(Ljava/lang/Throwable;)V

    return-void
.end method

.method private setCompletion(I)I
    .locals 7

    .line 242
    :cond_0
    iget v6, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-gez v6, :cond_1

    return v6

    .line 244
    :cond_1
    sget-object v0, Ljava9/util/concurrent/ForkJoinTask;->U:Lsun/misc/Unsafe;

    sget-wide v2, Ljava9/util/concurrent/ForkJoinTask;->STATUS:J

    or-int v5, v6, p1

    move-object v1, p0

    move v4, v6

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_0

    ushr-int/lit8 v0, v6, 0x10

    if-eqz v0, :cond_2

    .line 246
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_0
    return p1
.end method

.method private setExceptionalCompletion(Ljava/lang/Throwable;)I
    .locals 3

    .line 469
    invoke-virtual {p0, p1}, Ljava9/util/concurrent/ForkJoinTask;->recordExceptionalCompletion(Ljava/lang/Throwable;)I

    move-result v0

    const/high16 v1, -0x10000000

    and-int/2addr v1, v0

    const/high16 v2, -0x80000000

    if-ne v1, v2, :cond_0

    .line 471
    invoke-virtual {p0, p1}, Ljava9/util/concurrent/ForkJoinTask;->internalPropagateException(Ljava/lang/Throwable;)V

    :cond_0
    return v0
.end method

.method static uncheckedThrow(Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Throwable;",
            ")V^TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 636
    throw p0

    .line 638
    :cond_0
    new-instance p0, Ljava/lang/Error;

    const-string v0, "Unknown Exception"

    invoke-direct {p0, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1482
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 1483
    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinTask;->getException()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public cancel(Z)Z
    .locals 2

    const/high16 p1, -0x40000000    # -2.0f

    .line 859
    invoke-direct {p0, p1}, Ljava9/util/concurrent/ForkJoinTask;->setCompletion(I)I

    move-result v0

    const/high16 v1, -0x10000000

    and-int/2addr v0, v1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method final doExec()I
    .locals 2

    .line 261
    iget v0, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-ltz v0, :cond_0

    .line 263
    :try_start_0
    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinTask;->exec()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    const/high16 v0, -0x10000000

    .line 268
    invoke-direct {p0, v0}, Ljava9/util/concurrent/ForkJoinTask;->setCompletion(I)I

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 265
    invoke-direct {p0, v0}, Ljava9/util/concurrent/ForkJoinTask;->setExceptionalCompletion(Ljava/lang/Throwable;)I

    move-result v0

    return v0

    :cond_0
    :goto_0
    return v0
.end method

.method protected abstract exec()Z
.end method

.method public final fork()Ljava9/util/concurrent/ForkJoinTask;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/concurrent/ForkJoinTask<",
            "TV;>;"
        }
    .end annotation

    .line 670
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v1, v0, Ljava9/util/concurrent/ForkJoinWorkerThread;

    if-eqz v1, :cond_0

    .line 671
    check-cast v0, Ljava9/util/concurrent/ForkJoinWorkerThread;

    iget-object v0, v0, Ljava9/util/concurrent/ForkJoinWorkerThread;->workQueue:Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    invoke-virtual {v0, p0}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->push(Ljava9/util/concurrent/ForkJoinTask;)V

    goto :goto_0

    .line 673
    :cond_0
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->common:Ljava9/util/concurrent/ForkJoinPool;

    invoke-virtual {v0, p0}, Ljava9/util/concurrent/ForkJoinPool;->externalPush(Ljava9/util/concurrent/ForkJoinTask;)V

    :goto_0
    return-object p0
.end method

.method public final get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 971
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v0, v0, Ljava9/util/concurrent/ForkJoinWorkerThread;

    if-eqz v0, :cond_0

    .line 972
    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinTask;->doJoin()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinTask;->externalInterruptibleAwaitDone()I

    move-result v0

    :goto_0
    const/high16 v1, -0x10000000

    and-int/2addr v0, v1

    const/high16 v1, -0x40000000    # -2.0f

    if-eq v0, v1, :cond_2

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    .line 977
    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinTask;->getRawResult()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 976
    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinTask;->getThrowableException()Ljava/lang/Throwable;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 974
    :cond_2
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 997
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    .line 998
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result p3

    if-nez p3, :cond_c

    .line 1000
    iget p3, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-ltz p3, :cond_7

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_7

    .line 1001
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    add-long/2addr v2, p1

    cmp-long p1, v2, v0

    if-nez p1, :cond_0

    const-wide/16 v2, 0x1

    .line 1003
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    .line 1004
    instance-of p2, p1, Ljava9/util/concurrent/ForkJoinWorkerThread;

    if-eqz p2, :cond_1

    .line 1005
    check-cast p1, Ljava9/util/concurrent/ForkJoinWorkerThread;

    .line 1006
    iget-object p2, p1, Ljava9/util/concurrent/ForkJoinWorkerThread;->pool:Ljava9/util/concurrent/ForkJoinPool;

    iget-object p1, p1, Ljava9/util/concurrent/ForkJoinWorkerThread;->workQueue:Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    invoke-virtual {p2, p1, p0, v2, v3}, Ljava9/util/concurrent/ForkJoinPool;->awaitJoin(Ljava9/util/concurrent/ForkJoinPool$WorkQueue;Ljava9/util/concurrent/ForkJoinTask;J)I

    move-result p3

    goto :goto_3

    .line 1008
    :cond_1
    instance-of p1, p0, Ljava9/util/concurrent/CountedCompleter;

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    sget-object p1, Ljava9/util/concurrent/ForkJoinPool;->common:Ljava9/util/concurrent/ForkJoinPool;

    move-object p3, p0

    check-cast p3, Ljava9/util/concurrent/CountedCompleter;

    .line 1009
    invoke-virtual {p1, p3, p2}, Ljava9/util/concurrent/ForkJoinPool;->externalHelpComplete(Ljava9/util/concurrent/CountedCompleter;I)I

    move-result p1

    move p3, p1

    goto :goto_0

    :cond_2
    sget-object p1, Ljava9/util/concurrent/ForkJoinPool;->common:Ljava9/util/concurrent/ForkJoinPool;

    .line 1011
    invoke-virtual {p1, p0}, Ljava9/util/concurrent/ForkJoinPool;->tryExternalUnpush(Ljava9/util/concurrent/ForkJoinTask;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 1012
    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinTask;->doExec()I

    move-result p1

    move p3, p1

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    :goto_0
    if-ltz p3, :cond_7

    .line 1014
    :cond_4
    :goto_1
    iget v8, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-ltz v8, :cond_6

    .line 1015
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    sub-long p1, v2, p1

    cmp-long p3, p1, v0

    if-lez p3, :cond_6

    .line 1016
    sget-object p3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    cmp-long p3, p1, v0

    if-lez p3, :cond_4

    sget-object v4, Ljava9/util/concurrent/ForkJoinTask;->U:Lsun/misc/Unsafe;

    sget-wide v6, Ljava9/util/concurrent/ForkJoinTask;->STATUS:J

    const/high16 p3, 0x10000

    or-int v9, v8, p3

    move-object v5, p0

    .line 1017
    invoke-virtual/range {v4 .. v9}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 1018
    monitor-enter p0

    .line 1019
    :try_start_0
    iget p3, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-ltz p3, :cond_5

    .line 1020
    invoke-virtual {p0, p1, p2}, Ljava/lang/Object;->wait(J)V

    goto :goto_2

    .line 1022
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 1023
    :goto_2
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_6
    move p3, v8

    :cond_7
    :goto_3
    if-ltz p3, :cond_8

    .line 1029
    iget p3, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    :cond_8
    const/high16 p1, -0x10000000

    and-int p2, p3, p1

    if-eq p2, p1, :cond_b

    const/high16 p1, -0x40000000    # -2.0f

    if-eq p2, p1, :cond_a

    const/high16 p1, -0x80000000

    if-eq p2, p1, :cond_9

    .line 1034
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    invoke-direct {p1}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw p1

    .line 1035
    :cond_9
    new-instance p1, Ljava/util/concurrent/ExecutionException;

    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinTask;->getThrowableException()Ljava/lang/Throwable;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 1032
    :cond_a
    new-instance p1, Ljava/util/concurrent/CancellationException;

    invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw p1

    .line 1037
    :cond_b
    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinTask;->getRawResult()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 999
    :cond_c
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1
.end method

.method public final getException()Ljava/lang/Throwable;
    .locals 2

    .line 898
    iget v0, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    const/high16 v1, -0x10000000

    and-int/2addr v0, v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/high16 v1, -0x40000000    # -2.0f

    if-ne v0, v1, :cond_1

    .line 899
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    goto :goto_0

    .line 901
    :cond_1
    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinTask;->getThrowableException()Ljava/lang/Throwable;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public abstract getRawResult()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation
.end method

.method internalPropagateException(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method final internalWait(J)V
    .locals 6

    .line 281
    iget v4, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-ltz v4, :cond_1

    sget-object v0, Ljava9/util/concurrent/ForkJoinTask;->U:Lsun/misc/Unsafe;

    sget-wide v2, Ljava9/util/concurrent/ForkJoinTask;->STATUS:J

    const/high16 v1, 0x10000

    or-int v5, v4, v1

    move-object v1, p0

    .line 282
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 283
    monitor-enter p0

    .line 284
    :try_start_0
    iget v0, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ltz v0, :cond_0

    .line 285
    :try_start_1
    invoke-virtual {p0, p1, p2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 287
    :cond_0
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 288
    :catch_0
    :goto_0
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_1
    :goto_1
    return-void
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 705
    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinTask;->doInvoke()I

    move-result v0

    const/high16 v1, -0x10000000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    .line 706
    invoke-direct {p0, v0}, Ljava9/util/concurrent/ForkJoinTask;->reportException(I)V

    .line 707
    :cond_0
    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinTask;->getRawResult()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final isCancelled()Z
    .locals 2

    .line 867
    iget v0, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    const/high16 v1, -0x10000000

    and-int/2addr v0, v1

    const/high16 v1, -0x40000000    # -2.0f

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isDone()Z
    .locals 1

    .line 863
    iget v0, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final quietlyComplete()V
    .locals 1

    const/high16 v0, -0x10000000

    .line 956
    invoke-direct {p0, v0}, Ljava9/util/concurrent/ForkJoinTask;->setCompletion(I)I

    return-void
.end method

.method public final quietlyJoin()V
    .locals 0

    .line 1047
    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinTask;->doJoin()I

    return-void
.end method

.method final recordExceptionalCompletion(Ljava/lang/Throwable;)I
    .locals 6

    .line 438
    iget v0, p0, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-ltz v0, :cond_2

    .line 439
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    .line 440
    sget-object v1, Ljava9/util/concurrent/ForkJoinTask;->exceptionTableLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 441
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 443
    :try_start_0
    invoke-static {}, Ljava9/util/concurrent/ForkJoinTask;->expungeStaleExceptions()V

    .line 444
    sget-object v2, Ljava9/util/concurrent/ForkJoinTask;->exceptionTable:[Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;

    .line 445
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v0, v3

    .line 446
    aget-object v3, v2, v0

    :goto_0
    if-nez v3, :cond_0

    .line 448
    new-instance v3, Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;

    aget-object v4, v2, v0

    sget-object v5, Ljava9/util/concurrent/ForkJoinTask;->exceptionTableRefQueue:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v3, p0, p1, v4, v5}, Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;-><init>(Ljava9/util/concurrent/ForkJoinTask;Ljava/lang/Throwable;Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;Ljava/lang/ref/ReferenceQueue;)V

    aput-object v3, v2, v0

    goto :goto_1

    .line 452
    :cond_0
    invoke-virtual {v3}, Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;->get()Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v4, p0, :cond_1

    .line 456
    :goto_1
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/high16 p1, -0x80000000

    .line 458
    invoke-direct {p0, p1}, Ljava9/util/concurrent/ForkJoinTask;->setCompletion(I)I

    move-result v0

    goto :goto_2

    .line 446
    :cond_1
    :try_start_1
    iget-object v3, v3, Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;->next:Ljava9/util/concurrent/ForkJoinTask$ExceptionNode;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 456
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :cond_2
    :goto_2
    return v0
.end method
