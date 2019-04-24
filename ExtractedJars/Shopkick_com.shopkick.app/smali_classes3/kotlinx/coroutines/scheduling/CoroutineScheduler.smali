.class public final Lkotlinx/coroutines/scheduling/CoroutineScheduler;
.super Ljava/lang/Object;
.source "CoroutineScheduler.kt"

# interfaces
.implements Ljava/util/concurrent/Executor;
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;,
        Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;,
        Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1003:1\n237#1:1010\n237#1:1011\n234#1:1013\n237#1:1014\n238#1:1015\n237#1,5:1017\n237#1:1022\n237#1:1023\n238#1:1024\n391#2,2:1004\n391#2,2:1006\n391#2,2:1008\n12#3:1012\n12#3:1016\n*E\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n241#1:1010\n242#1:1011\n304#1:1013\n386#1:1014\n387#1:1015\n453#1,5:1017\n453#1:1022\n579#1:1023\n580#1:1024\n115#1,2:1004\n145#1,2:1006\n167#1,2:1008\n304#1:1012\n453#1:1016\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u0000\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0003EFGB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007H\u0082\u0008J\u0008\u0010#\u001a\u00020$H\u0016J\u0008\u0010%\u001a\u00020\u0004H\u0002J!\u0010&\u001a\u00020\'2\n\u0010(\u001a\u00060)j\u0002`*2\u0006\u0010+\u001a\u00020,H\u0000\u00a2\u0006\u0002\u0008-J\u0011\u0010\u0014\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007H\u0082\u0008J\t\u0010.\u001a\u00020$H\u0082\u0008J\t\u0010/\u001a\u00020\u0004H\u0082\u0008J&\u00100\u001a\u00020$2\n\u0010(\u001a\u00060)j\u0002`*2\u0008\u0008\u0002\u0010+\u001a\u00020,2\u0008\u0008\u0002\u00101\u001a\u00020\u0019J\u0014\u00102\u001a\u00020$2\n\u00103\u001a\u00060)j\u0002`*H\u0016J\t\u00104\u001a\u00020$H\u0082\u0008J\t\u00105\u001a\u00020\u0004H\u0082\u0008J\u0014\u00106\u001a\u00020\u00042\n\u00107\u001a\u00060 R\u00020\u0000H\u0002J\u000e\u00108\u001a\u0008\u0018\u00010 R\u00020\u0000H\u0002J\u0014\u00109\u001a\u00020$2\n\u00107\u001a\u00060 R\u00020\u0000H\u0002J$\u0010:\u001a\u00020$2\n\u00107\u001a\u00060 R\u00020\u00002\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0004H\u0002J\u0008\u0010=\u001a\u00020$H\u0002J\u0010\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020\'H\u0002J\u000e\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020\u0007J\u0018\u0010B\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\'2\u0006\u00101\u001a\u00020\u0019H\u0002J\u0008\u0010C\u001a\u00020\tH\u0016J\u0008\u0010D\u001a\u00020\u0019H\u0002R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\r\u001a\u00020\u00048\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0014\u001a\u00020\u00048\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u000fR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u001aR\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\u0008\u0018\u00010 R\u00020\u00000\u001fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010!\u00a8\u0006H"
    }
    d2 = {
        "Lkotlinx/coroutines/scheduling/CoroutineScheduler;",
        "Ljava/util/concurrent/Executor;",
        "Ljava/io/Closeable;",
        "corePoolSize",
        "",
        "maxPoolSize",
        "idleWorkerKeepAliveNs",
        "",
        "schedulerName",
        "",
        "(IIJLjava/lang/String;)V",
        "_isTerminated",
        "Lkotlinx/atomicfu/AtomicInt;",
        "blockingWorkers",
        "getBlockingWorkers",
        "()I",
        "controlState",
        "Lkotlinx/atomicfu/AtomicLong;",
        "cpuPermits",
        "Ljava/util/concurrent/Semaphore;",
        "createdWorkers",
        "getCreatedWorkers",
        "globalQueue",
        "Lkotlinx/coroutines/scheduling/GlobalQueue;",
        "isTerminated",
        "",
        "()Z",
        "parkedWorkersStack",
        "random",
        "Ljava/util/Random;",
        "workers",
        "",
        "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;",
        "[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;",
        "state",
        "close",
        "",
        "createNewWorker",
        "createTask",
        "Lkotlinx/coroutines/scheduling/Task;",
        "block",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "taskContext",
        "Lkotlinx/coroutines/scheduling/TaskContext;",
        "createTask$kotlinx_coroutines_core",
        "decrementBlockingWorkers",
        "decrementCreatedWorkers",
        "dispatch",
        "fair",
        "execute",
        "command",
        "incrementBlockingWorkers",
        "incrementCreatedWorkers",
        "parkedWorkersStackNextIndex",
        "worker",
        "parkedWorkersStackPop",
        "parkedWorkersStackPush",
        "parkedWorkersStackTopUpdate",
        "oldIndex",
        "newIndex",
        "requestCpuWorker",
        "runSafely",
        "task",
        "shutdown",
        "timeout",
        "submitToLocalQueue",
        "toString",
        "tryUnpark",
        "Companion",
        "Worker",
        "WorkerState",
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
.field private static final ADDED:I = -0x1

.field private static final ADDED_REQUIRES_HELP:I = 0x0

.field private static final ALLOWED:I = 0x0

.field private static final BLOCKING_MASK:J = 0x3ffffe00000L

.field private static final BLOCKING_SHIFT:I = 0x15

.field private static final CREATED_MASK:J = 0x1fffffL

.field public static final Companion:Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;

.field private static final FORBIDDEN:I = -0x1

.field private static final MAX_PARK_TIME_NS:I

.field private static final MAX_SPINS:I = 0x3e8

.field public static final MAX_SUPPORTED_POOL_SIZE:I = 0x1ffffe

.field private static final MAX_YIELDS:I = 0x5dc

.field private static final MIN_PARK_TIME_NS:I

.field public static final MIN_SUPPORTED_POOL_SIZE:I = 0x1

.field private static final NOT_ADDED:I = 0x1

.field private static final NOT_IN_STACK:Lkotlinx/coroutines/internal/Symbol;

.field private static final PARKED_INDEX_MASK:J = 0x1fffffL

.field private static final PARKED_VERSION_INC:J = 0x200000L

.field private static final PARKED_VERSION_MASK:J = -0x200000L

.field private static final TERMINATED:I = 0x1

.field private static final _isTerminated$FU:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field static final controlState$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final parkedWorkersStack$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;


# instance fields
.field private volatile _isTerminated:I

.field volatile controlState:J

.field private final corePoolSize:I

.field private final cpuPermits:Ljava/util/concurrent/Semaphore;

.field private final globalQueue:Lkotlinx/coroutines/scheduling/GlobalQueue;

.field private final idleWorkerKeepAliveNs:J

.field private final maxPoolSize:I

.field private volatile parkedWorkersStack:J

.field private final random:Ljava/util/Random;

.field private final schedulerName:Ljava/lang/String;

.field private final workers:[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->Companion:Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;

    .line 258
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->MAX_PARK_TIME_NS:I

    .line 261
    sget-wide v0, Lkotlinx/coroutines/scheduling/TasksKt;->WORK_STEALING_TIME_RESOLUTION_NS:J

    const/4 v2, 0x4

    int-to-long v2, v2

    div-long/2addr v0, v2

    const-wide/16 v2, 0xa

    .line 262
    invoke-static {v0, v1, v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    move-result-wide v0

    .line 263
    sget v2, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->MAX_PARK_TIME_NS:I

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtMost(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->MIN_PARK_TIME_NS:I

    .line 266
    new-instance v0, Lkotlinx/coroutines/internal/Symbol;

    const-string v1, "NOT_IN_STACK"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/Symbol;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->NOT_IN_STACK:Lkotlinx/coroutines/internal/Symbol;

    const-class v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    const-string v1, "parkedWorkersStack"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStack$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-class v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    const-string v1, "controlState"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-class v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    const-string v1, "_isTerminated"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->_isTerminated$FU:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 2
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "schedulerName"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->corePoolSize:I

    iput p2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->maxPoolSize:I

    iput-wide p3, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->idleWorkerKeepAliveNs:J

    iput-object p5, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->schedulerName:Ljava/lang/String;

    .line 67
    iget p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->corePoolSize:I

    const/4 p2, 0x0

    const/4 p3, 0x1

    if-lt p1, p3, :cond_0

    move p1, p3

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    if-eqz p1, :cond_7

    .line 70
    iget p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->maxPoolSize:I

    iget p4, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->corePoolSize:I

    if-lt p1, p4, :cond_1

    move p1, p3

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    if-eqz p1, :cond_6

    .line 73
    iget p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->maxPoolSize:I

    const p4, 0x1ffffe

    if-gt p1, p4, :cond_2

    move p1, p3

    goto :goto_2

    :cond_2
    move p1, p2

    :goto_2
    if-eqz p1, :cond_5

    .line 76
    iget-wide p4, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->idleWorkerKeepAliveNs:J

    const-wide/16 v0, 0x0

    cmp-long p1, p4, v0

    if-lez p1, :cond_3

    move p1, p3

    goto :goto_3

    :cond_3
    move p1, p2

    :goto_3
    if-eqz p1, :cond_4

    .line 81
    new-instance p1, Lkotlinx/coroutines/scheduling/GlobalQueue;

    invoke-direct {p1}, Lkotlinx/coroutines/scheduling/GlobalQueue;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->globalQueue:Lkotlinx/coroutines/scheduling/GlobalQueue;

    .line 89
    new-instance p1, Ljava/util/concurrent/Semaphore;

    iget p4, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->corePoolSize:I

    invoke-direct {p1, p4, p2}, Ljava/util/concurrent/Semaphore;-><init>(IZ)V

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->cpuPermits:Ljava/util/concurrent/Semaphore;

    .line 105
    iput-wide v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStack:J

    .line 226
    iget p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->maxPoolSize:I

    add-int/2addr p1, p3

    new-array p1, p1, [Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->workers:[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    .line 232
    iput-wide v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState:J

    .line 247
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->random:Ljava/util/Random;

    .line 250
    iput p2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->_isTerminated:I

    return-void

    .line 77
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Idle worker keep alive time "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide p2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->idleWorkerKeepAliveNs:J

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, " must be positive"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 76
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2

    .line 74
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Max pool size "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->maxPoolSize:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " should not exceed maximal supported number of threads 2097150"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 73
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2

    .line 71
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Max pool size "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->maxPoolSize:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " should be greater than or equals to core pool size "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->corePoolSize:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 70
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2

    .line 68
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Core pool size "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->corePoolSize:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " should be at least 1"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 67
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2
.end method

.method public synthetic constructor <init>(IIJLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 63
    sget-wide p3, Lkotlinx/coroutines/scheduling/TasksKt;->IDLE_WORKER_KEEP_ALIVE_NS:J

    move-wide v3, p3

    goto :goto_0

    :cond_0
    move-wide v3, p3

    :goto_0
    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const-string p5, "DefaultDispatcher"

    move-object v5, p5

    goto :goto_1

    :cond_1
    move-object v5, p5

    :goto_1
    move-object v0, p0

    move v1, p1

    move v2, p2

    .line 64
    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;-><init>(IIJLjava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$createdWorkers(Lkotlinx/coroutines/scheduling/CoroutineScheduler;J)I
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->createdWorkers(J)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$decrementBlockingWorkers(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->decrementBlockingWorkers()V

    return-void
.end method

.method public static final synthetic access$decrementCreatedWorkers(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)I
    .locals 0

    .line 60
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->decrementCreatedWorkers()I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getCorePoolSize$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)I
    .locals 0

    .line 60
    iget p0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->corePoolSize:I

    return p0
.end method

.method public static final synthetic access$getCpuPermits$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Ljava/util/concurrent/Semaphore;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 60
    iget-object p0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->cpuPermits:Ljava/util/concurrent/Semaphore;

    return-object p0
.end method

.method public static final synthetic access$getCreatedWorkers$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)I
    .locals 0

    .line 60
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->getCreatedWorkers()I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getGlobalQueue$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Lkotlinx/coroutines/scheduling/GlobalQueue;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 60
    iget-object p0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->globalQueue:Lkotlinx/coroutines/scheduling/GlobalQueue;

    return-object p0
.end method

.method public static final synthetic access$getIdleWorkerKeepAliveNs$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)J
    .locals 2

    .line 60
    iget-wide v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->idleWorkerKeepAliveNs:J

    return-wide v0
.end method

.method public static final synthetic access$getMAX_PARK_TIME_NS$cp()I
    .locals 1

    .line 60
    sget v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->MAX_PARK_TIME_NS:I

    return v0
.end method

.method public static final synthetic access$getMIN_PARK_TIME_NS$cp()I
    .locals 1

    .line 60
    sget v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->MIN_PARK_TIME_NS:I

    return v0
.end method

.method public static final synthetic access$getNOT_IN_STACK$cp()Lkotlinx/coroutines/internal/Symbol;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 60
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->NOT_IN_STACK:Lkotlinx/coroutines/internal/Symbol;

    return-object v0
.end method

.method public static final synthetic access$getRandom$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Ljava/util/Random;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 60
    iget-object p0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->random:Ljava/util/Random;

    return-object p0
.end method

.method public static final synthetic access$getSchedulerName$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Ljava/lang/String;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 60
    iget-object p0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->schedulerName:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getWorkers$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 60
    iget-object p0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->workers:[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    return-object p0
.end method

.method public static final synthetic access$incrementBlockingWorkers(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->incrementBlockingWorkers()V

    return-void
.end method

.method public static final synthetic access$isTerminated$p(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)Z
    .locals 0

    .line 60
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->isTerminated()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$parkedWorkersStackPush(Lkotlinx/coroutines/scheduling/CoroutineScheduler;Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 60
    invoke-direct {p0, p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStackPush(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)V

    return-void
.end method

.method public static final synthetic access$parkedWorkersStackTopUpdate(Lkotlinx/coroutines/scheduling/CoroutineScheduler;Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 60
    invoke-direct {p0, p1, p2, p3}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStackTopUpdate(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V

    return-void
.end method

.method public static final synthetic access$requestCpuWorker(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->requestCpuWorker()V

    return-void
.end method

.method public static final synthetic access$runSafely(Lkotlinx/coroutines/scheduling/CoroutineScheduler;Lkotlinx/coroutines/scheduling/Task;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/scheduling/Task;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 60
    invoke-direct {p0, p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->runSafely(Lkotlinx/coroutines/scheduling/Task;)V

    return-void
.end method

.method private final blockingWorkers(J)I
    .locals 2

    const-wide v0, 0x3ffffe00000L

    and-long/2addr p1, v0

    const/16 v0, 0x15

    shr-long/2addr p1, v0

    long-to-int p1, p1

    return p1
.end method

.method private final createNewWorker()I
    .locals 9

    .line 453
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->workers:[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    .line 1016
    monitor-enter v0

    .line 455
    :try_start_0
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->isTerminated()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    monitor-exit v0

    return v1

    .line 456
    :cond_0
    :try_start_1
    iget-wide v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState:J

    const-wide/32 v3, 0x1fffff

    and-long v5, v1, v3

    long-to-int v5, v5

    const-wide v6, 0x3ffffe00000L

    and-long/2addr v1, v6

    const/16 v6, 0x15

    shr-long/2addr v1, v6

    long-to-int v1, v1

    sub-int v1, v5, v1

    .line 461
    iget v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->corePoolSize:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v6, 0x0

    if-lt v1, v2, :cond_1

    monitor-exit v0

    return v6

    .line 462
    :cond_1
    :try_start_2
    iget v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->maxPoolSize:I

    if-ge v5, v2, :cond_5

    iget-object v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->cpuPermits:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 1021
    :cond_2
    sget-object v2, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    move-result-wide v7

    and-long v2, v7, v3

    long-to-int v2, v2

    const/4 v3, 0x1

    if-lez v2, :cond_3

    .line 465
    iget-object v4, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->workers:[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    aget-object v4, v4, v2

    if-nez v4, :cond_3

    move v6, v3

    :cond_3
    if-eqz v6, :cond_4

    .line 466
    new-instance v4, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    invoke-direct {v4, p0, v2}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;-><init>(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V

    invoke-virtual {v4}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->start()V

    .line 467
    iget-object v5, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->workers:[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    aput-object v4, v5, v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/2addr v1, v3

    .line 468
    monitor-exit v0

    return v1

    :cond_4
    :try_start_3
    const-string v1, "Failed requirement."

    .line 465
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 462
    :cond_5
    :goto_0
    monitor-exit v0

    return v6

    :catchall_0
    move-exception v1

    .line 468
    monitor-exit v0

    throw v1
.end method

.method private final createdWorkers(J)I
    .locals 2

    const-wide/32 v0, 0x1fffff

    and-long/2addr p1, v0

    long-to-int p1, p1

    return p1
.end method

.method private final decrementBlockingWorkers()V
    .locals 3

    .line 245
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/32 v1, -0x200000

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    return-void
.end method

.method private final decrementCreatedWorkers()I
    .locals 4

    .line 242
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/32 v2, 0x1fffff

    and-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public static synthetic dispatch$default(Lkotlinx/coroutines/scheduling/CoroutineScheduler;Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 341
    sget-object p2, Lkotlinx/coroutines/scheduling/NonBlockingContext;->INSTANCE:Lkotlinx/coroutines/scheduling/NonBlockingContext;

    check-cast p2, Lkotlinx/coroutines/scheduling/TaskContext;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->dispatch(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V

    return-void
.end method

.method private final getBlockingWorkers()I
    .locals 4

    .line 235
    iget-wide v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState:J

    const-wide v2, 0x3ffffe00000L

    and-long/2addr v0, v2

    const/16 v2, 0x15

    shr-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private final getCreatedWorkers()I
    .locals 4

    .line 234
    iget-wide v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState:J

    const-wide/32 v2, 0x1fffff

    and-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private final incrementBlockingWorkers()V
    .locals 3

    .line 244
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/32 v1, 0x200000

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    return-void
.end method

.method private final incrementCreatedWorkers()I
    .locals 4

    .line 241
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/32 v2, 0x1fffff

    and-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private final isTerminated()Z
    .locals 1

    .line 251
    iget v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->_isTerminated:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final parkedWorkersStackNextIndex(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)I
    .locals 1

    .line 199
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getNextParkedWorker()Ljava/lang/Object;

    move-result-object p1

    .line 202
    :goto_0
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->NOT_IN_STACK:Lkotlinx/coroutines/internal/Symbol;

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 205
    :cond_1
    check-cast p1, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    .line 206
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getIndexInArray()I

    move-result v0

    if-eqz v0, :cond_2

    return v0

    .line 209
    :cond_2
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getNextParkedWorker()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0
.end method

.method private final parkedWorkersStackPop()Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;
    .locals 9

    .line 1009
    :cond_0
    :goto_0
    iget-wide v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStack:J

    const-wide/32 v0, 0x1fffff

    and-long/2addr v0, v2

    long-to-int v0, v0

    .line 169
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->workers:[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    aget-object v6, v1, v0

    if-eqz v6, :cond_2

    const-wide/32 v0, 0x200000

    add-long/2addr v0, v2

    const-wide/32 v4, -0x200000

    and-long/2addr v0, v4

    .line 171
    invoke-direct {p0, v6}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStackNextIndex(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)I

    move-result v4

    if-gez v4, :cond_1

    goto :goto_0

    .line 178
    :cond_1
    sget-object v5, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStack$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    int-to-long v7, v4

    or-long/2addr v7, v0

    move-object v0, v5

    move-object v1, p0

    move-wide v4, v7

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 185
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->NOT_IN_STACK:Lkotlinx/coroutines/internal/Symbol;

    invoke-virtual {v6, v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->setNextParkedWorker(Ljava/lang/Object;)V

    return-object v6

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private final parkedWorkersStackPush(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)V
    .locals 8

    .line 140
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getNextParkedWorker()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->NOT_IN_STACK:Lkotlinx/coroutines/internal/Symbol;

    if-eq v0, v1, :cond_0

    return-void

    .line 1007
    :cond_0
    iget-wide v4, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStack:J

    const-wide/32 v0, 0x1fffff

    and-long/2addr v0, v4

    long-to-int v0, v0

    const-wide/32 v1, 0x200000

    add-long/2addr v1, v4

    const-wide/32 v6, -0x200000

    and-long/2addr v1, v6

    .line 148
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getIndexInArray()I

    move-result v3

    if-eqz v3, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 149
    :goto_0
    sget-boolean v7, Lkotlin/_Assertions;->ENABLED:Z

    if-eqz v7, :cond_3

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Assertion failed"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 150
    :cond_3
    :goto_1
    iget-object v6, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->workers:[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    aget-object v0, v6, v0

    invoke-virtual {p1, v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->setNextParkedWorker(Ljava/lang/Object;)V

    .line 156
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStack$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    int-to-long v6, v3

    or-long/2addr v6, v1

    move-object v2, v0

    move-object v3, p0

    invoke-virtual/range {v2 .. v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method private final parkedWorkersStackTopUpdate(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V
    .locals 8

    .line 1005
    :cond_0
    :goto_0
    iget-wide v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStack:J

    const-wide/32 v0, 0x1fffff

    and-long/2addr v0, v2

    long-to-int v0, v0

    const-wide/32 v4, 0x200000

    add-long/2addr v4, v2

    const-wide/32 v6, -0x200000

    and-long/2addr v4, v6

    if-ne v0, p2, :cond_2

    if-nez p3, :cond_1

    .line 120
    invoke-direct {p0, p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStackNextIndex(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)I

    move-result v0

    goto :goto_1

    :cond_1
    move v0, p3

    :cond_2
    :goto_1
    if-gez v0, :cond_3

    goto :goto_0

    .line 128
    :cond_3
    sget-object v1, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStack$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    int-to-long v6, v0

    or-long/2addr v4, v6

    move-object v0, v1

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method private final requestCpuWorker()V
    .locals 5

    .line 367
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->cpuPermits:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v0

    if-nez v0, :cond_0

    .line 368
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->tryUnpark()Z

    return-void

    .line 377
    :cond_0
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->tryUnpark()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 385
    :cond_1
    iget-wide v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState:J

    const-wide/32 v2, 0x1fffff

    and-long/2addr v2, v0

    long-to-int v2, v2

    const-wide v3, 0x3ffffe00000L

    and-long/2addr v0, v3

    const/16 v3, 0x15

    shr-long/2addr v0, v3

    long-to-int v0, v0

    sub-int/2addr v2, v0

    .line 393
    iget v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->corePoolSize:I

    if-ge v2, v0, :cond_3

    .line 394
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->createNewWorker()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 397
    iget v2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->corePoolSize:I

    if-le v2, v1, :cond_2

    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->createNewWorker()I

    :cond_2
    if-lez v0, :cond_3

    return-void

    .line 401
    :cond_3
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->tryUnpark()Z

    return-void
.end method

.method private final runSafely(Lkotlinx/coroutines/scheduling/Task;)V
    .locals 2

    .line 586
    :try_start_0
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/Task;->run()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 591
    :goto_0
    invoke-static {}, Lkotlinx/coroutines/TimeSourceKt;->getTimeSource()Lkotlinx/coroutines/TimeSource;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/TimeSource;->unTrackTask()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 588
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const-string v1, "thread"

    .line 589
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    invoke-interface {v1, v0, p1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    .line 591
    :goto_2
    invoke-static {}, Lkotlinx/coroutines/TimeSourceKt;->getTimeSource()Lkotlinx/coroutines/TimeSource;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/TimeSource;->unTrackTask()V

    throw p1
.end method

.method private final submitToLocalQueue(Lkotlinx/coroutines/scheduling/Task;Z)I
    .locals 6

    .line 476
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v1, v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    const/4 v1, 0x1

    if-eqz v0, :cond_8

    .line 478
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getScheduler()Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Lkotlinx/coroutines/scheduling/CoroutineScheduler;

    if-eq v2, v3, :cond_1

    return v1

    .line 484
    :cond_1
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getState()Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    move-result-object v2

    sget-object v3, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->TERMINATED:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    if-ne v2, v3, :cond_2

    return v1

    :cond_2
    const/4 v2, -0x1

    .line 487
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/Task;->getMode()Lkotlinx/coroutines/scheduling/TaskMode;

    move-result-object v3

    sget-object v4, Lkotlinx/coroutines/scheduling/TaskMode;->NON_BLOCKING:Lkotlinx/coroutines/scheduling/TaskMode;

    const/4 v5, 0x0

    if-ne v3, v4, :cond_4

    .line 496
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->isBlocking()Z

    move-result v3

    if-eqz v3, :cond_3

    move v2, v5

    goto :goto_0

    .line 504
    :cond_3
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->tryAcquireCpuPermit()Z

    move-result v3

    if-nez v3, :cond_4

    return v1

    :cond_4
    :goto_0
    if-eqz p2, :cond_5

    .line 512
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getLocalQueue()Lkotlinx/coroutines/scheduling/WorkQueue;

    move-result-object p2

    iget-object v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->globalQueue:Lkotlinx/coroutines/scheduling/GlobalQueue;

    invoke-virtual {p2, p1, v1}, Lkotlinx/coroutines/scheduling/WorkQueue;->addLast(Lkotlinx/coroutines/scheduling/Task;Lkotlinx/coroutines/scheduling/GlobalQueue;)Z

    move-result p1

    goto :goto_1

    .line 514
    :cond_5
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getLocalQueue()Lkotlinx/coroutines/scheduling/WorkQueue;

    move-result-object p2

    iget-object v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->globalQueue:Lkotlinx/coroutines/scheduling/GlobalQueue;

    invoke-virtual {p2, p1, v1}, Lkotlinx/coroutines/scheduling/WorkQueue;->add(Lkotlinx/coroutines/scheduling/Task;Lkotlinx/coroutines/scheduling/GlobalQueue;)Z

    move-result p1

    :goto_1
    if-eqz p1, :cond_7

    .line 520
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getLocalQueue()Lkotlinx/coroutines/scheduling/WorkQueue;

    move-result-object p1

    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/WorkQueue;->getBufferSize$kotlinx_coroutines_core()I

    move-result p1

    sget p2, Lkotlinx/coroutines/scheduling/TasksKt;->QUEUE_SIZE_OFFLOAD_THRESHOLD:I

    if-le p1, p2, :cond_6

    return v5

    :cond_6
    return v2

    :cond_7
    return v5

    :cond_8
    return v1
.end method

.method private final tryUnpark()Z
    .locals 3

    .line 406
    :goto_0
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStackPop()Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 419
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->idleResetBeforeUnpark()V

    .line 424
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->isParking()Z

    move-result v1

    .line 429
    move-object v2, v0

    check-cast v2, Ljava/lang/Thread;

    invoke-static {v2}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    if-nez v1, :cond_0

    goto :goto_0

    .line 439
    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->tryForbidTermination()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public close()V
    .locals 2

    const-wide/16 v0, 0x2710

    .line 295
    invoke-virtual {p0, v0, v1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->shutdown(J)V

    return-void
.end method

.method public final createTask$kotlinx_coroutines_core(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;)Lkotlinx/coroutines/scheduling/Task;
    .locals 3
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/scheduling/TaskContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    new-instance v0, Lkotlinx/coroutines/scheduling/Task;

    sget-object v1, Lkotlinx/coroutines/scheduling/TasksKt;->schedulerTimeSource:Lkotlinx/coroutines/scheduling/TimeSource;

    invoke-virtual {v1}, Lkotlinx/coroutines/scheduling/TimeSource;->nanoTime()J

    move-result-wide v1

    invoke-direct {v0, p1, v1, v2, p2}, Lkotlinx/coroutines/scheduling/Task;-><init>(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/TaskContext;)V

    return-object v0
.end method

.method public final dispatch(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/scheduling/TaskContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    invoke-static {}, Lkotlinx/coroutines/TimeSourceKt;->getTimeSource()Lkotlinx/coroutines/TimeSource;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/TimeSource;->trackTask()V

    .line 344
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->createTask$kotlinx_coroutines_core(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;)Lkotlinx/coroutines/scheduling/Task;

    move-result-object p1

    .line 346
    invoke-direct {p0, p1, p3}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->submitToLocalQueue(Lkotlinx/coroutines/scheduling/Task;Z)I

    move-result p2

    const/4 p3, -0x1

    if-eq p2, p3, :cond_2

    const/4 p3, 0x1

    if-eq p2, p3, :cond_0

    .line 356
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->requestCpuWorker()V

    goto :goto_0

    .line 350
    :cond_0
    iget-object p2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->globalQueue:Lkotlinx/coroutines/scheduling/GlobalQueue;

    invoke-virtual {p2, p1}, Lkotlinx/coroutines/scheduling/GlobalQueue;->add(Lkotlinx/coroutines/scheduling/Task;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 354
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->requestCpuWorker()V

    :goto_0
    return-void

    .line 352
    :cond_1
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->schedulerName:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " was terminated"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :cond_2
    return-void
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 7
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 293
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->dispatch$default(Lkotlinx/coroutines/scheduling/CoroutineScheduler;Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;ZILjava/lang/Object;)V

    return-void
.end method

.method public final shutdown(J)V
    .locals 8

    .line 300
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->_isTerminated$FU:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 302
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v3, v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    if-nez v3, :cond_1

    const/4 v0, 0x0

    :cond_1
    check-cast v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    .line 304
    iget-object v3, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->workers:[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    .line 1012
    monitor-enter v3

    .line 1013
    :try_start_0
    iget-wide v4, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/32 v6, 0x1fffff

    and-long/2addr v4, v6

    long-to-int v4, v4

    .line 304
    monitor-exit v3

    if-gt v2, v4, :cond_7

    move v3, v2

    .line 307
    :goto_0
    iget-object v5, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->workers:[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    aget-object v5, v5, v3

    if-nez v5, :cond_2

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_2
    if-eq v5, v0, :cond_6

    .line 309
    :goto_1
    invoke-virtual {v5}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->isAlive()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 310
    move-object v6, v5

    check-cast v6, Ljava/lang/Thread;

    invoke-static {v6}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 311
    invoke-virtual {v5, p1, p2}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->join(J)V

    goto :goto_1

    .line 313
    :cond_3
    invoke-virtual {v5}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getState()Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    move-result-object v6

    .line 314
    sget-object v7, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->TERMINATED:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    if-ne v6, v7, :cond_4

    move v7, v2

    goto :goto_2

    :cond_4
    move v7, v1

    :goto_2
    if-eqz v7, :cond_5

    .line 315
    invoke-virtual {v5}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getLocalQueue()Lkotlinx/coroutines/scheduling/WorkQueue;

    move-result-object v5

    iget-object v6, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->globalQueue:Lkotlinx/coroutines/scheduling/GlobalQueue;

    invoke-virtual {v5, v6}, Lkotlinx/coroutines/scheduling/WorkQueue;->offloadAllWork$kotlinx_coroutines_core(Lkotlinx/coroutines/scheduling/GlobalQueue;)V

    goto :goto_3

    .line 314
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Expected TERMINATED state, but found "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2

    :cond_6
    :goto_3
    if-eq v3, v4, :cond_7

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 319
    :cond_7
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->globalQueue:Lkotlinx/coroutines/scheduling/GlobalQueue;

    invoke-static {}, Lkotlinx/coroutines/scheduling/TasksKt;->getCLOSED_TASK()Lkotlinx/coroutines/scheduling/Task;

    move-result-object p2

    invoke-virtual {p1, p2}, Lkotlinx/coroutines/scheduling/GlobalQueue;->add(Lkotlinx/coroutines/scheduling/Task;)Z

    move-result p1

    if-eqz p1, :cond_e

    :goto_4
    if-eqz v0, :cond_8

    .line 322
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->findTask$kotlinx_coroutines_core()Lkotlinx/coroutines/scheduling/Task;

    move-result-object p1

    if-eqz p1, :cond_8

    goto :goto_5

    :cond_8
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->globalQueue:Lkotlinx/coroutines/scheduling/GlobalQueue;

    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/GlobalQueue;->removeFirstIfNotClosed()Lkotlinx/coroutines/scheduling/Task;

    move-result-object p1

    :goto_5
    if-eqz p1, :cond_9

    .line 323
    invoke-direct {p0, p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->runSafely(Lkotlinx/coroutines/scheduling/Task;)V

    goto :goto_4

    :cond_9
    if-eqz v0, :cond_a

    .line 326
    sget-object p1, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->TERMINATED:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->tryReleaseCpu$kotlinx_coroutines_core(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z

    .line 328
    :cond_a
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->cpuPermits:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result p1

    iget p2, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->corePoolSize:I

    if-ne p1, p2, :cond_b

    move v1, v2

    :cond_b
    sget-boolean p1, Lkotlin/_Assertions;->ENABLED:Z

    if-eqz p1, :cond_d

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Assertion failed"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :cond_d
    :goto_6
    const-wide/16 p1, 0x0

    .line 329
    iput-wide p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->parkedWorkersStack:J

    .line 330
    iput-wide p1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState:J

    return-void

    .line 319
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "GlobalQueue could not be closed yet"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :catchall_0
    move-exception p1

    .line 304
    monitor-exit v3

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 12
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 544
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 545
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->workers:[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    move v6, v5

    move v7, v6

    move v8, v7

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v9, v1, v3

    if-nez v9, :cond_0

    goto/16 :goto_1

    .line 547
    :cond_0
    invoke-virtual {v9}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getLocalQueue()Lkotlinx/coroutines/scheduling/WorkQueue;

    move-result-object v10

    invoke-virtual {v10}, Lkotlinx/coroutines/scheduling/WorkQueue;->size$kotlinx_coroutines_core()I

    move-result v10

    .line 548
    invoke-virtual {v9}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;->getState()Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    move-result-object v9

    sget-object v11, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v9}, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->ordinal()I

    move-result v9

    aget v9, v11, v9

    packed-switch v9, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :pswitch_1
    add-int/lit8 v7, v7, 0x1

    if-lez v10, :cond_1

    .line 560
    move-object v9, v0

    check-cast v9, Ljava/util/Collection;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "r"

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :pswitch_2
    add-int/lit8 v4, v4, 0x1

    .line 556
    move-object v9, v0

    check-cast v9, Ljava/util/Collection;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "c"

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :pswitch_3
    add-int/lit8 v5, v5, 0x1

    .line 552
    move-object v9, v0

    check-cast v9, Ljava/util/Collection;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "b"

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :pswitch_4
    add-int/lit8 v6, v6, 0x1

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 565
    :cond_2
    iget-wide v1, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->controlState:J

    .line 566
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->schedulerName:Ljava/lang/String;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v9, 0x40

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lkotlinx/coroutines/DebugKt;->getHexAddress(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v9, 0x5b

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v9, "Pool Size {"

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "core = "

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 568
    iget v9, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->corePoolSize:I

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", "

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "max = "

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    iget v9, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->maxPoolSize:I

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, "}, "

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "Worker States {"

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "CPU = "

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "blocking = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "parked = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "retired = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "terminated = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "}, "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "running workers queues = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "global queue size = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/CoroutineScheduler;->globalQueue:Lkotlinx/coroutines/scheduling/GlobalQueue;

    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/GlobalQueue;->getSize()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "Control State Workers {"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "created = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/32 v4, 0x1fffff

    and-long/2addr v4, v1

    long-to-int v0, v4

    .line 1023
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "blocking = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v4, 0x3ffffe00000L

    and-long v0, v1, v4

    const/16 v2, 0x15

    shr-long/2addr v0, v2

    long-to-int v0, v0

    .line 1024
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
