.class public final Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;
.super Ljava/lang/Thread;
.source "CoroutineScheduler.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/scheduling/CoroutineScheduler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Worker"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1003:1\n244#2:1004\n245#2:1005\n242#2:1007\n237#2:1008\n12#3:1006\n*E\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n745#1:1004\n769#1:1005\n842#1:1007\n842#1:1008\n842#1:1006\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0008\u00101\u001a\u00020\u000cH\u0002J\u0008\u00102\u001a\u00020-H\u0002J\u0008\u00103\u001a\u00020-H\u0002J\u0010\u00104\u001a\u00020-2\u0006\u00105\u001a\u00020\u0010H\u0002J\u000f\u00106\u001a\u0004\u0018\u00010/H\u0000\u00a2\u0006\u0002\u00087J\n\u00108\u001a\u0004\u0018\u00010/H\u0002J\u0010\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020;H\u0002J\u0006\u0010<\u001a\u00020-J\u0015\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\u0008?J\u0008\u0010@\u001a\u00020-H\u0016J\u0006\u0010A\u001a\u00020\u000cJ\u0006\u0010B\u001a\u00020\u000cJ\u0015\u0010C\u001a\u00020\u000c2\u0006\u0010D\u001a\u00020$H\u0000\u00a2\u0006\u0002\u0008EJ\n\u0010F\u001a\u0004\u0018\u00010/H\u0002J\u0008\u0010G\u001a\u00020-H\u0002R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u000e\u0010\"\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\u000e\u0010)\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"
    }
    d2 = {
        "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;",
        "Ljava/lang/Thread;",
        "index",
        "",
        "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V",
        "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V",
        "indexInArray",
        "getIndexInArray",
        "()I",
        "setIndexInArray",
        "(I)V",
        "isBlocking",
        "",
        "()Z",
        "isParking",
        "lastExhaustionTime",
        "",
        "lastStealIndex",
        "localQueue",
        "Lkotlinx/coroutines/scheduling/WorkQueue;",
        "getLocalQueue",
        "()Lkotlinx/coroutines/scheduling/WorkQueue;",
        "nextParkedWorker",
        "",
        "getNextParkedWorker",
        "()Ljava/lang/Object;",
        "setNextParkedWorker",
        "(Ljava/lang/Object;)V",
        "parkTimeNs",
        "rngState",
        "scheduler",
        "Lkotlinx/coroutines/scheduling/CoroutineScheduler;",
        "getScheduler",
        "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;",
        "spins",
        "state",
        "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;",
        "getState",
        "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;",
        "setState",
        "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)V",
        "terminationDeadline",
        "terminationState",
        "Lkotlinx/atomicfu/AtomicInt;",
        "afterTask",
        "",
        "task",
        "Lkotlinx/coroutines/scheduling/Task;",
        "beforeTask",
        "blockingQuiescence",
        "blockingWorkerIdle",
        "cpuWorkerIdle",
        "doPark",
        "nanos",
        "findTask",
        "findTask$kotlinx_coroutines_core",
        "findTaskWithCpuPermit",
        "idleReset",
        "mode",
        "Lkotlinx/coroutines/scheduling/TaskMode;",
        "idleResetBeforeUnpark",
        "nextInt",
        "upperBound",
        "nextInt$kotlinx_coroutines_core",
        "run",
        "tryAcquireCpuPermit",
        "tryForbidTermination",
        "tryReleaseCpu",
        "newState",
        "tryReleaseCpu$kotlinx_coroutines_core",
        "trySteal",
        "tryTerminateWorker",
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
.field private static final terminationState$FU:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile indexInArray:I

.field private lastExhaustionTime:J

.field private lastStealIndex:I

.field private final localQueue:Lkotlinx/coroutines/scheduling/WorkQueue;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile nextParkedWorker:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private parkTimeNs:I

.field private rngState:I

.field private volatile spins:I

.field private volatile state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private terminationDeadline:J

.field private volatile terminationState:I

.field final synthetic this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    const-string v1, "terminationState"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->terminationState$FU:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method private constructor <init>(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 595
    iput-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x1

    .line 597
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->setDaemon(Z)V

    .line 614
    new-instance v0, Lkotlinx/coroutines/scheduling/WorkQueue;

    invoke-direct {v0}, Lkotlinx/coroutines/scheduling/WorkQueue;-><init>()V

    iput-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->localQueue:Lkotlinx/coroutines/scheduling/WorkQueue;

    .line 621
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->RETIRING:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    iput-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    const/4 v0, 0x0

    .line 638
    iput v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->terminationState:I

    .line 652
    invoke-static {}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getNOT_IN_STACK$cp()Lkotlinx/coroutines/internal/Symbol;

    move-result-object v0

    iput-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->nextParkedWorker:Ljava/lang/Object;

    .line 709
    invoke-static {}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getMIN_PARK_TIME_NS$cp()I

    move-result v0

    iput v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->parkTimeNs:I

    .line 711
    invoke-static {p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getRandom$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Ljava/util/Random;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Random;->nextInt()I

    move-result p1

    iput p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->rngState:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 608
    invoke-direct {p0, p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;-><init>(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V

    .line 609
    invoke-virtual {p0, p2}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->setIndexInArray(I)V

    return-void
.end method

.method private final afterTask(Lkotlinx/coroutines/scheduling/Task;)V
    .locals 3

    .line 768
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/Task;->getMode()Lkotlinx/coroutines/scheduling/TaskMode;

    move-result-object p1

    sget-object v0, Lkotlinx/coroutines/scheduling/TaskMode;->NON_BLOCKING:Lkotlinx/coroutines/scheduling/TaskMode;

    if-eq p1, v0, :cond_3

    .line 769
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    .line 1005
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/32 v1, -0x200000

    invoke-virtual {v0, p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 770
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    .line 772
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->TERMINATED:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    if-eq p1, v0, :cond_3

    .line 773
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->BLOCKING:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-boolean v1, Lkotlin/_Assertions;->ENABLED:Z

    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected BLOCKING state, but has "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 774
    :cond_2
    :goto_1
    sget-object p1, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->RETIRING:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    :cond_3
    return-void
.end method

.method private final beforeTask(Lkotlinx/coroutines/scheduling/Task;)V
    .locals 8

    .line 740
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/Task;->getMode()Lkotlinx/coroutines/scheduling/TaskMode;

    move-result-object v0

    sget-object v1, Lkotlinx/coroutines/scheduling/TaskMode;->NON_BLOCKING:Lkotlinx/coroutines/scheduling/TaskMode;

    if-eq v0, v1, :cond_1

    .line 745
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    .line 1004
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/32 v1, 0x200000

    invoke-virtual {v0, p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 746
    sget-object p1, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->BLOCKING:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->tryReleaseCpu$kotlinx_coroutines_core(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 747
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$requestCpuWorker(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V

    :cond_0
    return-void

    .line 755
    :cond_1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getCpuPermits$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v0

    if-nez v0, :cond_2

    return-void

    .line 758
    :cond_2
    sget-object v0, Lkotlinx/coroutines/scheduling/TasksKt;->schedulerTimeSource:Lkotlinx/coroutines/scheduling/TimeSource;

    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/TimeSource;->nanoTime()J

    move-result-wide v0

    .line 759
    iget-wide v2, p1, Lkotlinx/coroutines/scheduling/Task;->submissionTime:J

    sub-long v2, v0, v2

    sget-wide v4, Lkotlinx/coroutines/scheduling/TasksKt;->WORK_STEALING_TIME_RESOLUTION_NS:J

    cmp-long p1, v2, v4

    if-ltz p1, :cond_3

    .line 760
    iget-wide v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->lastExhaustionTime:J

    sub-long v2, v0, v2

    sget-wide v4, Lkotlinx/coroutines/scheduling/TasksKt;->WORK_STEALING_TIME_RESOLUTION_NS:J

    const/4 p1, 0x5

    int-to-long v6, p1

    mul-long/2addr v4, v6

    cmp-long p1, v2, v4

    if-ltz p1, :cond_3

    .line 762
    iput-wide v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->lastExhaustionTime:J

    .line 763
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$requestCpuWorker(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V

    :cond_3
    return-void
.end method

.method private final blockingQuiescence()Z
    .locals 3

    .line 902
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getGlobalQueue$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Lkotlinx/coroutines/scheduling/GlobalQueue;

    move-result-object v0

    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/GlobalQueue;->removeFirstBlockingModeOrNull()Lkotlinx/coroutines/scheduling/Task;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 903
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->localQueue:Lkotlinx/coroutines/scheduling/WorkQueue;

    iget-object v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v2}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getGlobalQueue$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Lkotlinx/coroutines/scheduling/GlobalQueue;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lkotlinx/coroutines/scheduling/WorkQueue;->add(Lkotlinx/coroutines/scheduling/Task;Lkotlinx/coroutines/scheduling/GlobalQueue;)Z

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private final blockingWorkerIdle()V
    .locals 6

    .line 818
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->PARKING:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    invoke-virtual {p0, v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->tryReleaseCpu$kotlinx_coroutines_core(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z

    .line 819
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->blockingQuiescence()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 820
    iput v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->terminationState:I

    .line 822
    iget-wide v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->terminationDeadline:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v4, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v4}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getIdleWorkerKeepAliveNs$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)J

    move-result-wide v4

    add-long/2addr v0, v4

    iput-wide v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->terminationDeadline:J

    .line 824
    :cond_1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getIdleWorkerKeepAliveNs$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->doPark(J)V

    .line 827
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v4, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->terminationDeadline:J

    sub-long/2addr v0, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 828
    iput-wide v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->terminationDeadline:J

    .line 829
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->tryTerminateWorker()V

    :cond_2
    return-void
.end method

.method private final cpuWorkerIdle()V
    .locals 2

    .line 804
    iget v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->spins:I

    const/16 v1, 0x5dc

    if-gt v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    .line 806
    iput v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->spins:I

    const/16 v1, 0x3e8

    if-lt v0, v1, :cond_2

    .line 807
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    .line 809
    :cond_0
    iget v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->parkTimeNs:I

    invoke-static {}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getMAX_PARK_TIME_NS$cp()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 810
    iget v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->parkTimeNs:I

    mul-int/lit8 v0, v0, 0x3

    ushr-int/lit8 v0, v0, 0x1

    invoke-static {}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getMAX_PARK_TIME_NS$cp()I

    move-result v1

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v0

    iput v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->parkTimeNs:I

    .line 812
    :cond_1
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->PARKING:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    invoke-virtual {p0, v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->tryReleaseCpu$kotlinx_coroutines_core(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z

    .line 813
    iget v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->parkTimeNs:I

    int-to-long v0, v0

    invoke-direct {p0, v0, v1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->doPark(J)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final doPark(J)V
    .locals 1

    .line 834
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v0, p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$parkedWorkersStackPush(Lkotlinx/coroutines/scheduling/CoroutineScheduler;Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)V

    .line 835
    invoke-static {p1, p2}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    return-void
.end method

.method private final findTaskWithCpuPermit()Lkotlinx/coroutines/scheduling/Task;
    .locals 2

    .line 948
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getCorePoolSize$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->nextInt$kotlinx_coroutines_core(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 949
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getGlobalQueue$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Lkotlinx/coroutines/scheduling/GlobalQueue;

    move-result-object v1

    invoke-virtual {v1}, Lkotlinx/coroutines/scheduling/GlobalQueue;->removeFirstIfNotClosed()Lkotlinx/coroutines/scheduling/Task;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    .line 950
    :cond_1
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->localQueue:Lkotlinx/coroutines/scheduling/WorkQueue;

    invoke-virtual {v1}, Lkotlinx/coroutines/scheduling/WorkQueue;->poll()Lkotlinx/coroutines/scheduling/Task;

    move-result-object v1

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    if-nez v0, :cond_3

    .line 951
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getGlobalQueue$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Lkotlinx/coroutines/scheduling/GlobalQueue;

    move-result-object v0

    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/GlobalQueue;->removeFirstIfNotClosed()Lkotlinx/coroutines/scheduling/Task;

    move-result-object v0

    if-eqz v0, :cond_3

    return-object v0

    .line 952
    :cond_3
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->trySteal()Lkotlinx/coroutines/scheduling/Task;

    move-result-object v0

    return-object v0
.end method

.method private final idleReset(Lkotlinx/coroutines/scheduling/TaskMode;)V
    .locals 3

    const-wide/16 v0, 0x0

    .line 911
    iput-wide v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->terminationDeadline:J

    const/4 v0, 0x0

    .line 912
    iput v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->lastStealIndex:I

    .line 913
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    sget-object v2, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->PARKING:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    if-ne v1, v2, :cond_3

    .line 914
    sget-object v1, Lkotlinx/coroutines/scheduling/TaskMode;->PROBABLY_BLOCKING:Lkotlinx/coroutines/scheduling/TaskMode;

    if-ne p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    sget-boolean v1, Lkotlin/_Assertions;->ENABLED:Z

    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Assertion failed"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 915
    :cond_2
    :goto_1
    sget-object p1, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->BLOCKING:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    .line 916
    invoke-static {}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getMIN_PARK_TIME_NS$cp()I

    move-result p1

    iput p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->parkTimeNs:I

    .line 918
    :cond_3
    iput v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->spins:I

    return-void
.end method

.method private final trySteal()Lkotlinx/coroutines/scheduling/Task;
    .locals 4

    .line 956
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getCreatedWorkers$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-ge v0, v2, :cond_0

    return-object v1

    .line 961
    :cond_0
    iget v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->lastStealIndex:I

    if-nez v2, :cond_1

    .line 962
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->nextInt$kotlinx_coroutines_core(I)I

    move-result v2

    :cond_1
    const/4 v3, 0x1

    add-int/2addr v2, v3

    if-le v2, v0, :cond_2

    move v2, v3

    .line 965
    :cond_2
    iput v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->lastStealIndex:I

    .line 966
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getWorkers$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    move-result-object v0

    aget-object v0, v0, v2

    if-eqz v0, :cond_3

    .line 967
    move-object v2, p0

    check-cast v2, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    if-eq v0, v2, :cond_3

    .line 968
    iget-object v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->localQueue:Lkotlinx/coroutines/scheduling/WorkQueue;

    iget-object v0, v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->localQueue:Lkotlinx/coroutines/scheduling/WorkQueue;

    iget-object v3, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v3}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getGlobalQueue$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Lkotlinx/coroutines/scheduling/GlobalQueue;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lkotlinx/coroutines/scheduling/WorkQueue;->trySteal(Lkotlinx/coroutines/scheduling/WorkQueue;Lkotlinx/coroutines/scheduling/GlobalQueue;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 969
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->localQueue:Lkotlinx/coroutines/scheduling/WorkQueue;

    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/WorkQueue;->poll()Lkotlinx/coroutines/scheduling/Task;

    move-result-object v0

    return-object v0

    :cond_3
    return-object v1
.end method

.method private final tryTerminateWorker()V
    .locals 6

    .line 842
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getWorkers$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    move-result-object v0

    .line 1006
    monitor-enter v0

    .line 844
    :try_start_0
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$isTerminated$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 846
    :cond_0
    :try_start_1
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getCreatedWorkers$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)I

    move-result v1

    iget-object v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v2}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getCorePoolSize$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt v1, v2, :cond_1

    monitor-exit v0

    return-void

    .line 848
    :cond_1
    :try_start_2
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->blockingQuiescence()Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v1, :cond_2

    monitor-exit v0

    return-void

    .line 853
    :cond_2
    :try_start_3
    sget-object v1, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->terminationState$FU:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, p0, v3, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v1, :cond_3

    monitor-exit v0

    return-void

    .line 860
    :cond_3
    :try_start_4
    iget v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->indexInArray:I

    .line 861
    invoke-virtual {p0, v3}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->setIndexInArray(I)V

    .line 869
    iget-object v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v2, p0, v1, v3}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$parkedWorkersStackTopUpdate(Lkotlinx/coroutines/scheduling/CoroutineScheduler;Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V

    .line 874
    iget-object v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    .line 1007
    sget-object v3, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide/32 v4, 0x1fffff

    and-long/2addr v2, v4

    long-to-int v2, v2

    if-eq v2, v1, :cond_5

    .line 876
    iget-object v3, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v3}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getWorkers$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    move-result-object v3

    aget-object v3, v3, v2

    if-nez v3, :cond_4

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 877
    :cond_4
    iget-object v4, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v4}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getWorkers$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    move-result-object v4

    aput-object v3, v4, v1

    .line 878
    invoke-virtual {v3, v1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->setIndexInArray(I)V

    .line 886
    iget-object v4, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v4, v3, v2, v1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$parkedWorkersStackTopUpdate(Lkotlinx/coroutines/scheduling/CoroutineScheduler;Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V

    .line 891
    :cond_5
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getWorkers$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    move-result-object v1

    const/4 v3, 0x0

    check-cast v3, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    aput-object v3, v1, v2

    .line 892
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    .line 893
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->TERMINATED:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    iput-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    return-void

    :catchall_0
    move-exception v1

    .line 892
    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public final findTask$kotlinx_coroutines_core()Lkotlinx/coroutines/scheduling/Task;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 928
    invoke-virtual {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->tryAcquireCpuPermit()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->findTaskWithCpuPermit()Lkotlinx/coroutines/scheduling/Task;

    move-result-object v0

    return-object v0

    .line 937
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->localQueue:Lkotlinx/coroutines/scheduling/WorkQueue;

    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/WorkQueue;->poll()Lkotlinx/coroutines/scheduling/Task;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getGlobalQueue$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Lkotlinx/coroutines/scheduling/GlobalQueue;

    move-result-object v0

    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/GlobalQueue;->removeFirstBlockingModeOrNull()Lkotlinx/coroutines/scheduling/Task;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final getIndexInArray()I
    .locals 1

    .line 602
    iget v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->indexInArray:I

    return v0
.end method

.method public final getLocalQueue()Lkotlinx/coroutines/scheduling/WorkQueue;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 614
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->localQueue:Lkotlinx/coroutines/scheduling/WorkQueue;

    return-object v0
.end method

.method public final getNextParkedWorker()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 652
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->nextParkedWorker:Ljava/lang/Object;

    return-object v0
.end method

.method public final getScheduler()Lkotlinx/coroutines/scheduling/CoroutineScheduler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 612
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    return-object v0
.end method

.method public final getState()Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 621
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    return-object v0
.end method

.method public final idleResetBeforeUnpark()V
    .locals 1

    .line 923
    invoke-static {}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getMIN_PARK_TIME_NS$cp()I

    move-result v0

    iput v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->parkTimeNs:I

    const/4 v0, 0x0

    .line 924
    iput v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->spins:I

    return-void
.end method

.method public final isBlocking()Z
    .locals 2

    .line 624
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    sget-object v1, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->BLOCKING:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isParking()Z
    .locals 2

    .line 623
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    sget-object v1, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->PARKING:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final nextInt$kotlinx_coroutines_core(I)I
    .locals 2

    .line 784
    iget v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->rngState:I

    shl-int/lit8 v1, v0, 0xd

    xor-int/2addr v0, v1

    iput v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->rngState:I

    .line 785
    iget v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->rngState:I

    shr-int/lit8 v1, v0, 0x11

    xor-int/2addr v0, v1

    iput v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->rngState:I

    .line 786
    iget v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->rngState:I

    shl-int/lit8 v1, v0, 0x5

    xor-int/2addr v0, v1

    iput v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->rngState:I

    add-int/lit8 v0, p1, -0x1

    and-int v1, v0, p1

    if-nez v1, :cond_0

    .line 790
    iget p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->rngState:I

    and-int/2addr p1, v0

    return p1

    .line 792
    :cond_0
    iget v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->rngState:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    rem-int/2addr v0, p1

    return v0
.end method

.method public run()V
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    .line 716
    :goto_0
    iget-object v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v2}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$isTerminated$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    sget-object v3, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->TERMINATED:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    if-eq v2, v3, :cond_3

    .line 717
    invoke-virtual {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->findTask$kotlinx_coroutines_core()Lkotlinx/coroutines/scheduling/Task;

    move-result-object v2

    if-nez v2, :cond_1

    .line 720
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    sget-object v2, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->CPU_ACQUIRED:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    if-ne v1, v2, :cond_0

    .line 721
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->cpuWorkerIdle()V

    goto :goto_1

    .line 723
    :cond_0
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->blockingWorkerIdle()V

    :goto_1
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    .line 728
    invoke-virtual {v2}, Lkotlinx/coroutines/scheduling/Task;->getMode()Lkotlinx/coroutines/scheduling/TaskMode;

    move-result-object v1

    invoke-direct {p0, v1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->idleReset(Lkotlinx/coroutines/scheduling/TaskMode;)V

    move v1, v0

    .line 731
    :cond_2
    invoke-direct {p0, v2}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->beforeTask(Lkotlinx/coroutines/scheduling/Task;)V

    .line 732
    iget-object v3, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v3, v2}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$runSafely(Lkotlinx/coroutines/scheduling/CoroutineScheduler;Lkotlinx/coroutines/scheduling/Task;)V

    .line 733
    invoke-direct {p0, v2}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->afterTask(Lkotlinx/coroutines/scheduling/Task;)V

    goto :goto_0

    .line 736
    :cond_3
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->TERMINATED:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    invoke-virtual {p0, v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->tryReleaseCpu$kotlinx_coroutines_core(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z

    return-void
.end method

.method public final setIndexInArray(I)V
    .locals 2

    .line 604
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getSchedulerName$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-worker-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_0

    const-string v1, "TERMINATED"

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->setName(Ljava/lang/String;)V

    .line 605
    iput p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->indexInArray:I

    return-void
.end method

.method public final setNextParkedWorker(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 652
    iput-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->nextParkedWorker:Ljava/lang/Object;

    return-void
.end method

.method public final setState(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 621
    iput-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    return-void
.end method

.method public final tryAcquireCpuPermit()Z
    .locals 3

    .line 678
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    sget-object v1, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->CPU_ACQUIRED:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 679
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getCpuPermits$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->tryAcquire()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 680
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->CPU_ACQUIRED:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    iput-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public final tryForbidTermination()Z
    .locals 3

    .line 660
    iget v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->terminationState:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    .line 668
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid terminationState = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1

    .line 664
    :pswitch_0
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->terminationState$FU:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v2, -0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    :pswitch_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final tryReleaseCpu$kotlinx_coroutines_core(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z
    .locals 3
    .param p1    # Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 692
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    .line 693
    sget-object v1, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->CPU_ACQUIRED:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 694
    iget-object v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->this$0:Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    invoke-static {v2}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->access$getCpuPermits$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Ljava/util/concurrent/Semaphore;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->release()V

    :cond_1
    if-eq v0, p1, :cond_2

    .line 695
    iput-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->state:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    :cond_2
    return v1
.end method
