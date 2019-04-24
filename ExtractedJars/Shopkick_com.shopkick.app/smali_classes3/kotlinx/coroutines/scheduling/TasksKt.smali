.class public final Lkotlinx/coroutines/scheduling/TasksKt;
.super Ljava/lang/Object;
.source "Tasks.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,129:1\n17#2:130\n*E\n*S KotlinDebug\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n*L\n104#1:130\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0008X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0012\u0010\t\u001a\u00060\nj\u0002`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u000c\u001a\u00020\r8\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u000e\u001a\u00020\u00018\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u000f\u001a\u00020\u00018\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0010\u001a\u00020\r8\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000\"\u0012\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "BLOCKING_DEFAULT_PARALLELISM",
        "",
        "CLOSED_TASK",
        "Lkotlinx/coroutines/scheduling/Task;",
        "getCLOSED_TASK",
        "()Lkotlinx/coroutines/scheduling/Task;",
        "CORE_POOL_SIZE",
        "DEFAULT_SCHEDULER_NAME",
        "",
        "EMPTY_RUNNABLE",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "IDLE_WORKER_KEEP_ALIVE_NS",
        "",
        "MAX_POOL_SIZE",
        "QUEUE_SIZE_OFFLOAD_THRESHOLD",
        "WORK_STEALING_TIME_RESOLUTION_NS",
        "schedulerTimeSource",
        "Lkotlinx/coroutines/scheduling/TimeSource;",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final BLOCKING_DEFAULT_PARALLELISM:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field private static final CLOSED_TASK:Lkotlinx/coroutines/scheduling/Task;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final CORE_POOL_SIZE:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final DEFAULT_SCHEDULER_NAME:Ljava/lang/String; = "DefaultDispatcher"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final EMPTY_RUNNABLE:Ljava/lang/Runnable;

.field public static final IDLE_WORKER_KEEP_ALIVE_NS:J
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final MAX_POOL_SIZE:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final QUEUE_SIZE_OFFLOAD_THRESHOLD:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final WORK_STEALING_TIME_RESOLUTION_NS:J
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static schedulerTimeSource:Lkotlinx/coroutines/scheduling/TimeSource;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const-string v0, "kotlinx.coroutines.scheduler.resolution.ns"

    const-wide/32 v1, 0x186a0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    .line 18
    invoke-static/range {v0 .. v8}, Lkotlinx/coroutines/internal/SystemPropsKt;->systemProp$default(Ljava/lang/String;JJJILjava/lang/Object;)J

    move-result-wide v0

    sput-wide v0, Lkotlinx/coroutines/scheduling/TasksKt;->WORK_STEALING_TIME_RESOLUTION_NS:J

    const-string v2, "kotlinx.coroutines.scheduler.offload.threshold"

    const/16 v3, 0x60

    const/4 v4, 0x0

    const/16 v5, 0x80

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 23
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/internal/SystemPropsKt;->systemProp$default(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lkotlinx/coroutines/scheduling/TasksKt;->QUEUE_SIZE_OFFLOAD_THRESHOLD:I

    const-string v1, "kotlinx.coroutines.scheduler.blocking.parallelism"

    const/16 v2, 0x10

    const/4 v3, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    .line 28
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/internal/SystemPropsKt;->systemProp$default(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lkotlinx/coroutines/scheduling/TasksKt;->BLOCKING_DEFAULT_PARALLELISM:I

    const-string v1, "kotlinx.coroutines.scheduler.core.pool.size"

    .line 37
    invoke-static {}, Lkotlinx/coroutines/internal/SystemPropsKt;->getAVAILABLE_PROCESSORS()I

    move-result v0

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    const/4 v3, 0x1

    const/16 v5, 0x8

    .line 35
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/internal/SystemPropsKt;->systemProp$default(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lkotlinx/coroutines/scheduling/TasksKt;->CORE_POOL_SIZE:I

    const-string v1, "kotlinx.coroutines.scheduler.max.pool.size"

    .line 44
    invoke-static {}, Lkotlinx/coroutines/internal/SystemPropsKt;->getAVAILABLE_PROCESSORS()I

    move-result v0

    mul-int/lit16 v0, v0, 0x80

    .line 45
    sget v2, Lkotlinx/coroutines/scheduling/TasksKt;->CORE_POOL_SIZE:I

    const v3, 0x1ffffe

    .line 44
    invoke-static {v0, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v2

    const/4 v3, 0x0

    const v4, 0x1ffffe

    const/4 v5, 0x4

    .line 42
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/internal/SystemPropsKt;->systemProp$default(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lkotlinx/coroutines/scheduling/TasksKt;->MAX_POOL_SIZE:I

    .line 52
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v1, "kotlinx.coroutines.scheduler.keep.alive.sec"

    const-wide/16 v2, 0x5

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    .line 53
    invoke-static/range {v1 .. v9}, Lkotlinx/coroutines/internal/SystemPropsKt;->systemProp$default(Ljava/lang/String;JJJILjava/lang/Object;)J

    move-result-wide v1

    .line 52
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lkotlinx/coroutines/scheduling/TasksKt;->IDLE_WORKER_KEEP_ALIVE_NS:J

    .line 57
    sget-object v0, Lkotlinx/coroutines/scheduling/NanoTimeSource;->INSTANCE:Lkotlinx/coroutines/scheduling/NanoTimeSource;

    check-cast v0, Lkotlinx/coroutines/scheduling/TimeSource;

    sput-object v0, Lkotlinx/coroutines/scheduling/TasksKt;->schedulerTimeSource:Lkotlinx/coroutines/scheduling/TimeSource;

    .line 130
    new-instance v0, Lkotlinx/coroutines/scheduling/TasksKt$$special$$inlined$Runnable$1;

    invoke-direct {v0}, Lkotlinx/coroutines/scheduling/TasksKt$$special$$inlined$Runnable$1;-><init>()V

    check-cast v0, Ljava/lang/Runnable;

    sput-object v0, Lkotlinx/coroutines/scheduling/TasksKt;->EMPTY_RUNNABLE:Ljava/lang/Runnable;

    .line 105
    new-instance v0, Lkotlinx/coroutines/scheduling/Task;

    sget-object v1, Lkotlinx/coroutines/scheduling/TasksKt;->EMPTY_RUNNABLE:Ljava/lang/Runnable;

    sget-object v2, Lkotlinx/coroutines/scheduling/NonBlockingContext;->INSTANCE:Lkotlinx/coroutines/scheduling/NonBlockingContext;

    check-cast v2, Lkotlinx/coroutines/scheduling/TaskContext;

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v3, v4, v2}, Lkotlinx/coroutines/scheduling/Task;-><init>(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/TaskContext;)V

    sput-object v0, Lkotlinx/coroutines/scheduling/TasksKt;->CLOSED_TASK:Lkotlinx/coroutines/scheduling/Task;

    return-void
.end method

.method public static final getCLOSED_TASK()Lkotlinx/coroutines/scheduling/Task;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 105
    sget-object v0, Lkotlinx/coroutines/scheduling/TasksKt;->CLOSED_TASK:Lkotlinx/coroutines/scheduling/Task;

    return-object v0
.end method
