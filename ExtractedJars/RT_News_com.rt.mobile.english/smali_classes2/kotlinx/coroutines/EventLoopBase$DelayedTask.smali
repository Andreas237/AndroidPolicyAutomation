.class public abstract Lkotlinx/coroutines/EventLoopBase$DelayedTask;
.super Ljava/lang/Object;
.source "EventLoop.kt"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Lkotlinx/coroutines/DisposableHandle;
.implements Lkotlinx/coroutines/internal/ThreadSafeHeapNode;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/EventLoopBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "DelayedTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;",
        "Ljava/lang/Comparable<",
        "Lkotlinx/coroutines/EventLoopBase$DelayedTask;",
        ">;",
        "Lkotlinx/coroutines/DisposableHandle;",
        "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEventLoop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.kt\nkotlinx/coroutines/EventLoopBase$DelayedTask\n+ 2 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,345:1\n56#2:346\n57#2,7:348\n12#3:347\n*E\n*S KotlinDebug\n*F\n+ 1 EventLoop.kt\nkotlinx/coroutines/EventLoopBase$DelayedTask\n*L\n279#1:346\n279#1,7:348\n279#1:347\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008 \u0018\u00002\u00060\u0001j\u0002`\u00022\u0008\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0011\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u001c\u0010\u001e\u001a\u00020\u00132\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u000c2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0007J\u0008\u0010%\u001a\u00020&H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R0\u0010\r\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u000c2\u000c\u0010\u000b\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u000c8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lkotlinx/coroutines/EventLoopBase$DelayedTask;",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "",
        "Lkotlinx/coroutines/DisposableHandle;",
        "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;",
        "timeMillis",
        "",
        "(J)V",
        "_heap",
        "",
        "value",
        "Lkotlinx/coroutines/internal/ThreadSafeHeap;",
        "heap",
        "getHeap",
        "()Lkotlinx/coroutines/internal/ThreadSafeHeap;",
        "setHeap",
        "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V",
        "index",
        "",
        "getIndex",
        "()I",
        "setIndex",
        "(I)V",
        "nanoTime",
        "compareTo",
        "other",
        "dispose",
        "",
        "rescheduleOnShutdown",
        "schedule",
        "delayed",
        "eventLoop",
        "Lkotlinx/coroutines/EventLoopBase;",
        "timeToExecute",
        "",
        "now",
        "toString",
        "",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private _heap:Ljava/lang/Object;

.field private index:I

.field public final nanoTime:J
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>(J)V
    .locals 4

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 261
    iput v0, p0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->index:I

    .line 263
    invoke-static {}, Lkotlinx/coroutines/TimeSourceKt;->getTimeSource()Lkotlinx/coroutines/TimeSource;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/TimeSource;->nanoTime()J

    move-result-wide v0

    invoke-static {p1, p2}, Lkotlinx/coroutines/EventLoopKt;->delayToNanos(J)J

    move-result-wide p1

    add-long v2, v0, p1

    iput-wide v2, p0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->nanoTime:J

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 249
    check-cast p1, Lkotlinx/coroutines/EventLoopBase$DelayedTask;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->compareTo(Lkotlinx/coroutines/EventLoopBase$DelayedTask;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lkotlinx/coroutines/EventLoopBase$DelayedTask;)I
    .locals 6
    .param p1    # Lkotlinx/coroutines/EventLoopBase$DelayedTask;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    iget-wide v0, p0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->nanoTime:J

    iget-wide v2, p1, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->nanoTime:J

    sub-long v4, v0, v2

    const-wide/16 v0, 0x0

    cmp-long p1, v4, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    cmp-long p1, v4, v0

    if-gez p1, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final declared-synchronized dispose()V
    .locals 2

    monitor-enter p0

    .line 287
    :try_start_0
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->_heap:Ljava/lang/Object;

    .line 288
    invoke-static {}, Lkotlinx/coroutines/EventLoopKt;->access$getDISPOSED_TASK$p()Lkotlinx/coroutines/internal/Symbol;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    monitor-exit p0

    return-void

    .line 290
    :cond_0
    :try_start_1
    instance-of v1, v0, Lkotlinx/coroutines/internal/ThreadSafeHeap;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    :cond_1
    check-cast v0, Lkotlinx/coroutines/internal/ThreadSafeHeap;

    if-eqz v0, :cond_2

    move-object v1, p0

    check-cast v1, Lkotlinx/coroutines/internal/ThreadSafeHeapNode;

    invoke-virtual {v0, v1}, Lkotlinx/coroutines/internal/ThreadSafeHeap;->remove(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z

    .line 291
    :cond_2
    invoke-static {}, Lkotlinx/coroutines/EventLoopKt;->access$getDISPOSED_TASK$p()Lkotlinx/coroutines/internal/Symbol;

    move-result-object v0

    iput-object v0, p0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->_heap:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 292
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 286
    monitor-exit p0

    throw v0
.end method

.method public getHeap()Lkotlinx/coroutines/internal/ThreadSafeHeap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/internal/ThreadSafeHeap<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 255
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->_heap:Ljava/lang/Object;

    instance-of v1, v0, Lkotlinx/coroutines/internal/ThreadSafeHeap;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Lkotlinx/coroutines/internal/ThreadSafeHeap;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    .line 261
    iget v0, p0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->index:I

    return v0
.end method

.method public final rescheduleOnShutdown()V
    .locals 1

    .line 283
    sget-object v0, Lkotlinx/coroutines/DefaultExecutor;->INSTANCE:Lkotlinx/coroutines/DefaultExecutor;

    invoke-virtual {v0, p0}, Lkotlinx/coroutines/DefaultExecutor;->schedule$kotlinx_coroutines_core(Lkotlinx/coroutines/EventLoopBase$DelayedTask;)V

    return-void
.end method

.method public final declared-synchronized schedule(Lkotlinx/coroutines/internal/ThreadSafeHeap;Lkotlinx/coroutines/EventLoopBase;)I
    .locals 2
    .param p1    # Lkotlinx/coroutines/internal/ThreadSafeHeap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/EventLoopBase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/internal/ThreadSafeHeap<",
            "Lkotlinx/coroutines/EventLoopBase$DelayedTask;",
            ">;",
            "Lkotlinx/coroutines/EventLoopBase;",
            ")I"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "delayed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventLoop"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->_heap:Ljava/lang/Object;

    invoke-static {}, Lkotlinx/coroutines/EventLoopKt;->access$getDISPOSED_TASK$p()Lkotlinx/coroutines/internal/Symbol;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x2

    monitor-exit p0

    return p1

    .line 279
    :cond_0
    :try_start_1
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/internal/ThreadSafeHeapNode;

    .line 347
    monitor-enter p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 279
    :try_start_2
    invoke-virtual {p2}, Lkotlinx/coroutines/EventLoopBase;->isCompleted()Z

    move-result p2

    const/4 v1, 0x1

    xor-int/2addr p2, v1

    if-eqz p2, :cond_1

    .line 349
    invoke-virtual {p1, v0}, Lkotlinx/coroutines/internal/ThreadSafeHeap;->addImpl(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move p2, v1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 353
    :goto_0
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    xor-int/lit8 p1, p2, 0x1

    .line 279
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p2

    .line 353
    :try_start_4
    monitor-exit p1

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    .line 277
    monitor-exit p0

    throw p1
.end method

.method public setHeap(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V
    .locals 2
    .param p1    # Lkotlinx/coroutines/internal/ThreadSafeHeap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/internal/ThreadSafeHeap<",
            "*>;)V"
        }
    .end annotation

    .line 257
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->_heap:Ljava/lang/Object;

    invoke-static {}, Lkotlinx/coroutines/EventLoopKt;->access$getDISPOSED_TASK$p()Lkotlinx/coroutines/internal/Symbol;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string p1, "Failed requirement."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 258
    :cond_1
    iput-object p1, p0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->_heap:Ljava/lang/Object;

    return-void
.end method

.method public setIndex(I)V
    .locals 0

    .line 261
    iput p1, p0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->index:I

    return-void
.end method

.method public final timeToExecute(J)Z
    .locals 4

    .line 274
    iget-wide v0, p0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->nanoTime:J

    sub-long v2, p1, v0

    const-wide/16 p1, 0x0

    cmp-long v0, v2, p1

    if-ltz v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 294
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Delayed[nanos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->nanoTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
