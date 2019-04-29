.class public abstract Lkotlinx/coroutines/EventLoopBase;
.super Lkotlinx/coroutines/CoroutineDispatcher;
.source "EventLoop.kt"

# interfaces
.implements Lkotlinx/coroutines/Delay;
.implements Lkotlinx/coroutines/EventLoop;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/EventLoopBase$DelayedTask;,
        Lkotlinx/coroutines/EventLoopBase$DelayedResumeTask;,
        Lkotlinx/coroutines/EventLoopBase$DelayedRunnableTask;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEventLoop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.kt\nkotlinx/coroutines/EventLoopBase\n+ 2 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,345:1\n43#2:346\n44#2,7:348\n12#3:347\n96#4,2:355\n96#4,2:357\n96#4,2:359\n*E\n*S KotlinDebug\n*F\n+ 1 EventLoop.kt\nkotlinx/coroutines/EventLoopBase\n*L\n114#1:346\n114#1,7:348\n114#1:347\n138#1,2:355\n165#1,2:357\n183#1,2:359\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008 \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003345B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0015\u001a\u00020\u0016H\u0004J\u0010\u0010\u0017\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019H\u0002J\u001c\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00060\u0018j\u0002`\u0019H\u0016J\u0014\u0010\u001e\u001a\u00020\u000c2\n\u0010\u001f\u001a\u00060\u0018j\u0002`\u0019H\u0002J\u0019\u0010 \u001a\u00020\u00162\n\u0010\u001f\u001a\u00060\u0018j\u0002`\u0019H\u0000\u00a2\u0006\u0002\u0008!J\u0008\u0010\"\u001a\u00020\u000cH$J\u0008\u0010#\u001a\u00020\u0012H\u0016J\u0015\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0008H\u0000\u00a2\u0006\u0002\u0008&J\u0008\u0010\'\u001a\u00020\u0016H\u0004J\u0008\u0010(\u001a\u00020\u0016H\u0004J\u0015\u0010)\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0008H\u0000\u00a2\u0006\u0002\u0008*J\u0010\u0010+\u001a\u00020,2\u0006\u0010%\u001a\u00020\u0008H\u0002J\u001e\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00122\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u001600H\u0016J\u0010\u00101\u001a\u00020\u000c2\u0006\u0010\u001f\u001a\u00020\u0008H\u0002J\u0008\u00102\u001a\u00020\u0016H$R\u001c\u0010\u0005\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u000cX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000c8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u00066"
    }
    d2 = {
        "Lkotlinx/coroutines/EventLoopBase;",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "Lkotlinx/coroutines/Delay;",
        "Lkotlinx/coroutines/EventLoop;",
        "()V",
        "_delayed",
        "Lkotlinx/atomicfu/AtomicRef;",
        "Lkotlinx/coroutines/internal/ThreadSafeHeap;",
        "Lkotlinx/coroutines/EventLoopBase$DelayedTask;",
        "_queue",
        "",
        "isCompleted",
        "",
        "()Z",
        "isDelayedEmpty",
        "isEmpty",
        "isQueueEmpty",
        "nextTime",
        "",
        "getNextTime",
        "()J",
        "closeQueue",
        "",
        "dequeue",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "dispatch",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "block",
        "enqueueImpl",
        "task",
        "execute",
        "execute$kotlinx_coroutines_core",
        "isCorrectThread",
        "processNextEvent",
        "removeDelayedImpl",
        "delayedTask",
        "removeDelayedImpl$kotlinx_coroutines_core",
        "rescheduleAllDelayed",
        "resetAll",
        "schedule",
        "schedule$kotlinx_coroutines_core",
        "scheduleImpl",
        "",
        "scheduleResumeAfterDelay",
        "timeMillis",
        "continuation",
        "Lkotlinx/coroutines/CancellableContinuation;",
        "shouldUnpark",
        "unpark",
        "DelayedResumeTask",
        "DelayedRunnableTask",
        "DelayedTask",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final _delayed$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final _queue$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _delayed:Ljava/lang/Object;

.field private volatile _queue:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lkotlinx/coroutines/EventLoopBase;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_queue"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/EventLoopBase;->_queue$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-class v0, Lkotlinx/coroutines/EventLoopBase;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_delayed"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/EventLoopBase;->_delayed$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Lkotlinx/coroutines/CoroutineDispatcher;-><init>()V

    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_queue:Ljava/lang/Object;

    .line 61
    iput-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_delayed:Ljava/lang/Object;

    return-void
.end method

.method private final dequeue()Ljava/lang/Runnable;
    .locals 4

    .line 358
    :cond_0
    :goto_0
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_queue:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    .line 168
    :cond_1
    instance-of v2, v0, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    if-eqz v2, :cond_4

    if-nez v0, :cond_2

    .line 169
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    invoke-virtual {v1}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->removeFirstOrNull()Ljava/lang/Object;

    move-result-object v2

    .line 170
    sget-object v3, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->REMOVE_FROZEN:Lkotlinx/coroutines/internal/Symbol;

    if-eq v2, v3, :cond_3

    check-cast v2, Ljava/lang/Runnable;

    return-object v2

    .line 171
    :cond_3
    sget-object v2, Lkotlinx/coroutines/EventLoopBase;->_queue$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->next()Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    move-result-object v1

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    .line 174
    :cond_4
    invoke-static {}, Lkotlinx/coroutines/EventLoopKt;->access$getCLOSED_EMPTY$p()Lkotlinx/coroutines/internal/Symbol;

    move-result-object v2

    if-ne v0, v2, :cond_5

    return-object v1

    .line 175
    :cond_5
    sget-object v2, Lkotlinx/coroutines/EventLoopBase;->_queue$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-nez v0, :cond_6

    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    check-cast v0, Ljava/lang/Runnable;

    return-object v0
.end method

.method private final enqueueImpl(Ljava/lang/Runnable;)Z
    .locals 5

    .line 356
    :cond_0
    :goto_0
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_queue:Ljava/lang/Object;

    .line 139
    invoke-virtual {p0}, Lkotlinx/coroutines/EventLoopBase;->isCompleted()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    return v2

    :cond_1
    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 141
    sget-object v0, Lkotlinx/coroutines/EventLoopBase;->_queue$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 142
    :cond_2
    instance-of v3, v0, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    if-eqz v3, :cond_4

    if-nez v0, :cond_3

    .line 143
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    move-object v3, v0

    check-cast v3, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    invoke-virtual {v3, p1}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->addLast(Ljava/lang/Object;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    return v2

    .line 146
    :pswitch_1
    sget-object v1, Lkotlinx/coroutines/EventLoopBase;->_queue$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->next()Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    move-result-object v2

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_2
    return v1

    .line 150
    :cond_4
    invoke-static {}, Lkotlinx/coroutines/EventLoopKt;->access$getCLOSED_EMPTY$p()Lkotlinx/coroutines/internal/Symbol;

    move-result-object v3

    if-ne v0, v3, :cond_5

    return v2

    .line 153
    :cond_5
    new-instance v2, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    const/16 v3, 0x8

    invoke-direct {v2, v3, v1}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;-><init>(IZ)V

    if-nez v0, :cond_6

    .line 154
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    move-object v3, v0

    check-cast v3, Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->addLast(Ljava/lang/Object;)I

    .line 155
    invoke-virtual {v2, p1}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->addLast(Ljava/lang/Object;)I

    .line 156
    sget-object v3, Lkotlinx/coroutines/EventLoopBase;->_queue$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final getNextTime()J
    .locals 9

    .line 86
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_queue:Ljava/lang/Object;

    const-wide v1, 0x7fffffffffffffffL

    const-wide/16 v3, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 89
    :cond_0
    instance-of v5, v0, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    if-eqz v5, :cond_4

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    return-wide v3

    .line 93
    :cond_1
    :goto_0
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_delayed:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/ThreadSafeHeap;

    if-eqz v0, :cond_3

    .line 94
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/ThreadSafeHeap;->peek()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;

    if-eqz v0, :cond_2

    .line 95
    iget-wide v0, v0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->nanoTime:J

    invoke-static {}, Lkotlinx/coroutines/TimeSourceKt;->getTimeSource()Lkotlinx/coroutines/TimeSource;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/TimeSource;->nanoTime()J

    move-result-wide v5

    sub-long v7, v0, v5

    invoke-static {v7, v8, v3, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_2
    return-wide v1

    :cond_3
    return-wide v1

    .line 90
    :cond_4
    invoke-static {}, Lkotlinx/coroutines/EventLoopKt;->access$getCLOSED_EMPTY$p()Lkotlinx/coroutines/internal/Symbol;

    move-result-object v5

    if-ne v0, v5, :cond_5

    return-wide v1

    :cond_5
    return-wide v3
.end method

.method private final isDelayedEmpty()Z
    .locals 1

    .line 80
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_delayed:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/ThreadSafeHeap;

    if-eqz v0, :cond_1

    .line 81
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/ThreadSafeHeap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private final isQueueEmpty()Z
    .locals 3

    .line 71
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_queue:Ljava/lang/Object;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto :goto_0

    .line 74
    :cond_0
    instance-of v2, v0, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    if-eqz v2, :cond_1

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->isEmpty()Z

    move-result v1

    goto :goto_0

    .line 75
    :cond_1
    invoke-static {}, Lkotlinx/coroutines/EventLoopKt;->access$getCLOSED_EMPTY$p()Lkotlinx/coroutines/internal/Symbol;

    move-result-object v2

    if-ne v0, v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private final scheduleImpl(Lkotlinx/coroutines/EventLoopBase$DelayedTask;)I
    .locals 4

    .line 216
    invoke-virtual {p0}, Lkotlinx/coroutines/EventLoopBase;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 217
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_delayed:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/ThreadSafeHeap;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/EventLoopBase;

    .line 218
    sget-object v1, Lkotlinx/coroutines/EventLoopBase;->_delayed$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v2, 0x0

    new-instance v3, Lkotlinx/coroutines/internal/ThreadSafeHeap;

    invoke-direct {v3}, Lkotlinx/coroutines/internal/ThreadSafeHeap;-><init>()V

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    iget-object v0, v0, Lkotlinx/coroutines/EventLoopBase;->_delayed:Ljava/lang/Object;

    if-nez v0, :cond_2

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_2
    check-cast v0, Lkotlinx/coroutines/internal/ThreadSafeHeap;

    .line 221
    :goto_0
    invoke-virtual {p1, v0, p0}, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->schedule(Lkotlinx/coroutines/internal/ThreadSafeHeap;Lkotlinx/coroutines/EventLoopBase;)I

    move-result p1

    return p1
.end method

.method private final shouldUnpark(Lkotlinx/coroutines/EventLoopBase$DelayedTask;)Z
    .locals 1

    .line 213
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_delayed:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/ThreadSafeHeap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/ThreadSafeHeap;->peek()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method


# virtual methods
.method protected final closeQueue()V
    .locals 4

    .line 182
    invoke-virtual {p0}, Lkotlinx/coroutines/EventLoopBase;->isCompleted()Z

    move-result v0

    sget-boolean v1, Lkotlin/_Assertions;->ENABLED:Z

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    const-string v0, "Assertion failed"

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1

    .line 360
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_queue:Ljava/lang/Object;

    if-nez v0, :cond_1

    .line 185
    sget-object v0, Lkotlinx/coroutines/EventLoopBase;->_queue$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-static {}, Lkotlinx/coroutines/EventLoopKt;->access$getCLOSED_EMPTY$p()Lkotlinx/coroutines/internal/Symbol;

    move-result-object v2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 186
    :cond_1
    instance-of v1, v0, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    if-eqz v1, :cond_2

    .line 187
    check-cast v0, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->close()Z

    return-void

    .line 191
    :cond_2
    invoke-static {}, Lkotlinx/coroutines/EventLoopKt;->access$getCLOSED_EMPTY$p()Lkotlinx/coroutines/internal/Symbol;

    move-result-object v1

    if-ne v0, v1, :cond_3

    return-void

    .line 194
    :cond_3
    new-instance v1, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    const/16 v2, 0x8

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;-><init>(IZ)V

    if-nez v0, :cond_4

    .line 195
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object v2, v0

    check-cast v2, Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->addLast(Ljava/lang/Object;)I

    .line 196
    sget-object v2, Lkotlinx/coroutines/EventLoopBase;->_queue$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 56
    invoke-static {p0, p1, p2, p3}, Lkotlinx/coroutines/Delay$DefaultImpls;->delay(Lkotlinx/coroutines/Delay;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public dispatch(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "block"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    invoke-virtual {p0, p2}, Lkotlinx/coroutines/EventLoopBase;->execute$kotlinx_coroutines_core(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final execute$kotlinx_coroutines_core(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    invoke-direct {p0, p1}, Lkotlinx/coroutines/EventLoopBase;->enqueueImpl(Ljava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    invoke-virtual {p0}, Lkotlinx/coroutines/EventLoopBase;->unpark()V

    goto :goto_0

    .line 132
    :cond_0
    sget-object v0, Lkotlinx/coroutines/DefaultExecutor;->INSTANCE:Lkotlinx/coroutines/DefaultExecutor;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/DefaultExecutor;->execute$kotlinx_coroutines_core(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public invokeOnTimeout(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;
    .locals 1
    .param p3    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "block"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-static {p0, p1, p2, p3}, Lkotlinx/coroutines/Delay$DefaultImpls;->invokeOnTimeout(Lkotlinx/coroutines/Delay;JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;

    move-result-object p1

    return-object p1
.end method

.method protected abstract isCompleted()Z
.end method

.method protected abstract isCorrectThread()Z
.end method

.method protected final isEmpty()Z
    .locals 1

    .line 68
    invoke-direct {p0}, Lkotlinx/coroutines/EventLoopBase;->isQueueEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lkotlinx/coroutines/EventLoopBase;->isDelayedEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public processNextEvent()J
    .locals 7

    .line 105
    invoke-virtual {p0}, Lkotlinx/coroutines/EventLoopBase;->isCorrectThread()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    .line 107
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_delayed:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/ThreadSafeHeap;

    if-eqz v0, :cond_4

    .line 108
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/ThreadSafeHeap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    .line 109
    invoke-static {}, Lkotlinx/coroutines/TimeSourceKt;->getTimeSource()Lkotlinx/coroutines/TimeSource;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/TimeSource;->nanoTime()J

    move-result-wide v1

    .line 347
    :goto_0
    monitor-enter v0

    .line 348
    :try_start_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/ThreadSafeHeap;->firstImpl()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    .line 349
    check-cast v3, Lkotlinx/coroutines/EventLoopBase$DelayedTask;

    .line 115
    invoke-virtual {v3, v1, v2}, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->timeToExecute(J)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    .line 116
    check-cast v3, Ljava/lang/Runnable;

    invoke-direct {p0, v3}, Lkotlinx/coroutines/EventLoopBase;->enqueueImpl(Ljava/lang/Runnable;)Z

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v6

    :goto_1
    if-eqz v3, :cond_2

    .line 350
    invoke-virtual {v0, v6}, Lkotlinx/coroutines/internal/ThreadSafeHeap;->removeAtImpl(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 353
    :cond_2
    monitor-exit v0

    goto :goto_2

    .line 348
    :cond_3
    monitor-exit v0

    .line 354
    :goto_2
    check-cast v4, Lkotlinx/coroutines/EventLoopBase$DelayedTask;

    if-eqz v4, :cond_4

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 353
    monitor-exit v0

    throw v1

    .line 123
    :cond_4
    invoke-direct {p0}, Lkotlinx/coroutines/EventLoopBase;->dequeue()Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 124
    :cond_5
    invoke-direct {p0}, Lkotlinx/coroutines/EventLoopBase;->getNextTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final removeDelayedImpl$kotlinx_coroutines_core(Lkotlinx/coroutines/EventLoopBase$DelayedTask;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/EventLoopBase$DelayedTask;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "delayedTask"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 225
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_delayed:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/ThreadSafeHeap;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlinx/coroutines/internal/ThreadSafeHeapNode;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/ThreadSafeHeap;->remove(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z

    :cond_0
    return-void
.end method

.method protected final rescheduleAllDelayed()V
    .locals 1

    .line 244
    :goto_0
    iget-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_delayed:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/ThreadSafeHeap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/ThreadSafeHeap;->removeFirstOrNull()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;

    if-eqz v0, :cond_0

    .line 245
    invoke-virtual {v0}, Lkotlinx/coroutines/EventLoopBase$DelayedTask;->rescheduleOnShutdown()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final resetAll()V
    .locals 1

    const/4 v0, 0x0

    .line 230
    iput-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_queue:Ljava/lang/Object;

    .line 231
    iput-object v0, p0, Lkotlinx/coroutines/EventLoopBase;->_delayed:Ljava/lang/Object;

    return-void
.end method

.method public final schedule$kotlinx_coroutines_core(Lkotlinx/coroutines/EventLoopBase$DelayedTask;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/EventLoopBase$DelayedTask;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "delayedTask"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    invoke-direct {p0, p1}, Lkotlinx/coroutines/EventLoopBase;->scheduleImpl(Lkotlinx/coroutines/EventLoopBase$DelayedTask;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const-string p1, "unexpected result"

    .line 209
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 207
    :pswitch_0
    sget-object v0, Lkotlinx/coroutines/DefaultExecutor;->INSTANCE:Lkotlinx/coroutines/DefaultExecutor;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/DefaultExecutor;->schedule$kotlinx_coroutines_core(Lkotlinx/coroutines/EventLoopBase$DelayedTask;)V

    goto :goto_0

    .line 206
    :pswitch_1
    invoke-direct {p0, p1}, Lkotlinx/coroutines/EventLoopBase;->shouldUnpark(Lkotlinx/coroutines/EventLoopBase$DelayedTask;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lkotlinx/coroutines/EventLoopBase;->unpark()V

    :cond_0
    :goto_0
    :pswitch_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public scheduleResumeAfterDelay(JLkotlinx/coroutines/CancellableContinuation;)V
    .locals 1
    .param p3    # Lkotlinx/coroutines/CancellableContinuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlinx/coroutines/CancellableContinuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "continuation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    new-instance v0, Lkotlinx/coroutines/EventLoopBase$DelayedResumeTask;

    invoke-direct {v0, p0, p1, p2, p3}, Lkotlinx/coroutines/EventLoopBase$DelayedResumeTask;-><init>(Lkotlinx/coroutines/EventLoopBase;JLkotlinx/coroutines/CancellableContinuation;)V

    check-cast v0, Lkotlinx/coroutines/EventLoopBase$DelayedTask;

    invoke-virtual {p0, v0}, Lkotlinx/coroutines/EventLoopBase;->schedule$kotlinx_coroutines_core(Lkotlinx/coroutines/EventLoopBase$DelayedTask;)V

    return-void
.end method

.method protected abstract unpark()V
.end method
