.class public Ljava9/util/concurrent/ForkJoinPool;
.super Ljava/util/concurrent/AbstractExecutorService;
.source "ForkJoinPool.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljava9/util/concurrent/ForkJoinPool$MemBar;,
        Ljava9/util/concurrent/ForkJoinPool$InnocuousForkJoinWorkerThreadFactory;,
        Ljava9/util/concurrent/ForkJoinPool$ManagedBlocker;,
        Ljava9/util/concurrent/ForkJoinPool$WorkQueue;,
        Ljava9/util/concurrent/ForkJoinPool$DefaultForkJoinWorkerThreadFactory;,
        Ljava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;
    }
.end annotation


# static fields
.field private static final ABASE:I

.field private static final ACTCLASS:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static final ASHIFT:I

.field private static final COMMON_MAX_SPARES:I

.field static final COMMON_PARALLELISM:I

.field private static final CTL:J

.field private static final MODE:J

.field private static final U:Lsun/misc/Unsafe;

.field static final common:Ljava9/util/concurrent/ForkJoinPool;

.field public static final defaultForkJoinWorkerThreadFactory:Ljava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;

.field static final modifyThreadPermission:Ljava/lang/RuntimePermission;

.field private static poolNumberSequence:I


# instance fields
.field final bounds:I

.field volatile ctl:J

.field final factory:Ljava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;

.field indexSeed:I

.field final keepAlive:J

.field volatile mode:I

.field final saturate:Ljava9/util/function/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Predicate<",
            "-",
            "Ljava9/util/concurrent/ForkJoinPool;",
            ">;"
        }
    .end annotation
.end field

.field volatile stealCount:J

.field final ueh:Ljava/lang/Thread$UncaughtExceptionHandler;

.field workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

.field final workerNamePrefix:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 3304
    sget-object v0, Ljava9/util/concurrent/UnsafeAccess;->unsafe:Lsun/misc/Unsafe;

    sput-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    .line 3313
    :try_start_0
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    const-class v1, Ljava9/util/concurrent/ForkJoinPool;

    const-string v2, "ctl"

    .line 3314
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ljava9/util/concurrent/ForkJoinPool;->CTL:J

    .line 3315
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    const-class v1, Ljava9/util/concurrent/ForkJoinPool;

    const-string v2, "mode"

    .line 3316
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ljava9/util/concurrent/ForkJoinPool;->MODE:J

    .line 3317
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    const-class v1, [Ljava9/util/concurrent/ForkJoinTask;

    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    move-result v0

    sput v0, Ljava9/util/concurrent/ForkJoinPool;->ABASE:I

    .line 3318
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    const-class v1, [Ljava9/util/concurrent/ForkJoinTask;

    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    and-int/2addr v1, v0

    if-nez v1, :cond_1

    .line 3321
    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x1f

    sput v0, Ljava9/util/concurrent/ForkJoinPool;->ASHIFT:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 3329
    const-class v0, Ljava/util/concurrent/locks/LockSupport;

    const/16 v0, 0x100

    :try_start_1
    const-string v1, "java.util.concurrent.ForkJoinPool.common.maximumSpares"

    .line 3334
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3336
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 3338
    :catch_0
    :cond_0
    sput v0, Ljava9/util/concurrent/ForkJoinPool;->COMMON_MAX_SPARES:I

    .line 3340
    new-instance v0, Ljava9/util/concurrent/ForkJoinPool$DefaultForkJoinWorkerThreadFactory;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava9/util/concurrent/ForkJoinPool$DefaultForkJoinWorkerThreadFactory;-><init>(Ljava9/util/concurrent/ForkJoinPool$1;)V

    sput-object v0, Ljava9/util/concurrent/ForkJoinPool;->defaultForkJoinWorkerThreadFactory:Ljava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;

    .line 3342
    new-instance v0, Ljava/lang/RuntimePermission;

    const-string v2, "modifyThread"

    invoke-direct {v0, v2}, Ljava/lang/RuntimePermission;-><init>(Ljava/lang/String;)V

    sput-object v0, Ljava9/util/concurrent/ForkJoinPool;->modifyThreadPermission:Ljava/lang/RuntimePermission;

    .line 3344
    new-instance v0, Ljava9/util/concurrent/ForkJoinPool$1;

    invoke-direct {v0}, Ljava9/util/concurrent/ForkJoinPool$1;-><init>()V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava9/util/concurrent/ForkJoinPool;

    sput-object v0, Ljava9/util/concurrent/ForkJoinPool;->common:Ljava9/util/concurrent/ForkJoinPool;

    .line 3348
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->common:Ljava9/util/concurrent/ForkJoinPool;

    iget v0, v0, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    const v2, 0xffff

    and-int/2addr v0, v2

    const/4 v2, 0x1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    sput v0, Ljava9/util/concurrent/ForkJoinPool;->COMMON_PARALLELISM:I

    :try_start_2
    const-string v0, "java9.util.concurrent.CompletableFuture$AsynchronousCompletionTask"

    .line 3354
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 3358
    sput-object v0, Ljava9/util/concurrent/ForkJoinPool;->ACTCLASS:Ljava/lang/Class;

    goto :goto_0

    :catchall_0
    move-exception v0

    sput-object v1, Ljava9/util/concurrent/ForkJoinPool;->ACTCLASS:Ljava/lang/Class;

    throw v0

    :catch_1
    sput-object v1, Ljava9/util/concurrent/ForkJoinPool;->ACTCLASS:Ljava/lang/Class;

    :goto_0
    return-void

    .line 3320
    :cond_1
    :try_start_3
    new-instance v0, Ljava/lang/Error;

    const-string v1, "array index scale not a power of two"

    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    move-exception v0

    .line 3323
    new-instance v1, Ljava/lang/Error;

    invoke-direct {v1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>()V
    .locals 14

    .line 2254
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    const/16 v1, 0x7fff

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    sget-object v4, Ljava9/util/concurrent/ForkJoinPool;->defaultForkJoinWorkerThreadFactory:Ljava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;

    sget-object v13, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x7fff

    const/4 v9, 0x1

    const/4 v10, 0x0

    const-wide/32 v11, 0xea60

    move-object v2, p0

    invoke-direct/range {v2 .. v13}, Ljava9/util/concurrent/ForkJoinPool;-><init>(ILjava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;Ljava/lang/Thread$UncaughtExceptionHandler;ZIIILjava9/util/function/Predicate;JLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method private constructor <init>(B)V
    .locals 10

    .line 2445
    invoke-direct {p0}, Ljava/util/concurrent/AbstractExecutorService;-><init>()V

    const/4 p1, 0x0

    const/4 v0, -0x1

    :try_start_0
    const-string v1, "java.util.concurrent.ForkJoinPool.common.parallelism"

    .line 2451
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2453
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    :cond_0
    const-string v1, "java.util.concurrent.ForkJoinPool.common.threadFactory"

    .line 2454
    invoke-static {v1}, Ljava9/util/concurrent/ForkJoinPool;->newInstanceFromSystemProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string v2, "java.util.concurrent.ForkJoinPool.common.exceptionHandler"

    .line 2456
    invoke-static {v2}, Ljava9/util/concurrent/ForkJoinPool;->newInstanceFromSystemProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Thread$UncaughtExceptionHandler;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-object v1, p1

    :catch_1
    move-object v2, p1

    :goto_0
    if-nez v1, :cond_2

    .line 2462
    invoke-static {}, Ljava/lang/System;->getSecurityManager()Ljava/lang/SecurityManager;

    move-result-object v1

    if-nez v1, :cond_1

    .line 2463
    sget-object v1, Ljava9/util/concurrent/ForkJoinPool;->defaultForkJoinWorkerThreadFactory:Ljava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;

    goto :goto_1

    .line 2466
    :cond_1
    new-instance v1, Ljava9/util/concurrent/ForkJoinPool$InnocuousForkJoinWorkerThreadFactory;

    invoke-direct {v1, p1}, Ljava9/util/concurrent/ForkJoinPool$InnocuousForkJoinWorkerThreadFactory;-><init>(Ljava9/util/concurrent/ForkJoinPool$1;)V

    :cond_2
    :goto_1
    const/4 v3, 0x1

    if-gez v0, :cond_3

    .line 2470
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sub-int/2addr v0, v3

    if-gtz v0, :cond_3

    const/4 v0, 0x1

    :cond_3
    const/16 v4, 0x7fff

    if-le v0, v4, :cond_4

    const/16 v0, 0x7fff

    :cond_4
    neg-int v4, v0

    int-to-long v4, v4

    const/16 v6, 0x20

    shl-long v6, v4, v6

    const-wide v8, 0xffff00000000L

    and-long/2addr v6, v8

    const/16 v8, 0x30

    shl-long/2addr v4, v8

    const-wide/high16 v8, -0x1000000000000L

    and-long/2addr v4, v8

    or-long/2addr v4, v6

    rsub-int/lit8 v6, v0, 0x1

    const v7, 0xffff

    and-int/2addr v6, v7

    .line 2477
    sget v7, Ljava9/util/concurrent/ForkJoinPool;->COMMON_MAX_SPARES:I

    shl-int/lit8 v7, v7, 0x10

    or-int/2addr v6, v7

    if-le v0, v3, :cond_5

    add-int/lit8 v7, v0, -0x1

    goto :goto_2

    :cond_5
    const/4 v7, 0x1

    :goto_2
    ushr-int/lit8 v8, v7, 0x1

    or-int/2addr v7, v8

    ushr-int/lit8 v8, v7, 0x2

    or-int/2addr v7, v8

    ushr-int/lit8 v8, v7, 0x4

    or-int/2addr v7, v8

    ushr-int/lit8 v8, v7, 0x8

    or-int/2addr v7, v8

    ushr-int/lit8 v8, v7, 0x10

    or-int/2addr v7, v8

    add-int/2addr v7, v3

    shl-int/lit8 v3, v7, 0x1

    const-string v7, "ForkJoinPool.commonPool-worker-"

    .line 2482
    iput-object v7, p0, Ljava9/util/concurrent/ForkJoinPool;->workerNamePrefix:Ljava/lang/String;

    .line 2483
    new-array v3, v3, [Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    iput-object v3, p0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    .line 2484
    iput-object v1, p0, Ljava9/util/concurrent/ForkJoinPool;->factory:Ljava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;

    .line 2485
    iput-object v2, p0, Ljava9/util/concurrent/ForkJoinPool;->ueh:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 2486
    iput-object p1, p0, Ljava9/util/concurrent/ForkJoinPool;->saturate:Ljava9/util/function/Predicate;

    const-wide/32 v1, 0xea60

    .line 2487
    iput-wide v1, p0, Ljava9/util/concurrent/ForkJoinPool;->keepAlive:J

    .line 2488
    iput v6, p0, Ljava9/util/concurrent/ForkJoinPool;->bounds:I

    .line 2489
    iput v0, p0, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    .line 2490
    iput-wide v4, p0, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    return-void
.end method

.method synthetic constructor <init>(BLjava9/util/concurrent/ForkJoinPool$1;)V
    .locals 0

    .line 158
    invoke-direct {p0, p1}, Ljava9/util/concurrent/ForkJoinPool;-><init>(B)V

    return-void
.end method

.method public constructor <init>(ILjava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;Ljava/lang/Thread$UncaughtExceptionHandler;ZIIILjava9/util/function/Predicate;JLjava/util/concurrent/TimeUnit;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;",
            "Ljava/lang/Thread$UncaughtExceptionHandler;",
            "ZIII",
            "Ljava9/util/function/Predicate<",
            "-",
            "Ljava9/util/concurrent/ForkJoinPool;",
            ">;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move v1, p1

    move/from16 v2, p6

    move-wide/from16 v3, p9

    .line 2401
    invoke-direct {p0}, Ljava/util/concurrent/AbstractExecutorService;-><init>()V

    if-lez v1, :cond_2

    const/16 v5, 0x7fff

    if-gt v1, v5, :cond_2

    if-lt v2, v1, :cond_2

    const-wide/16 v6, 0x0

    cmp-long v8, v3, v6

    if-lez v8, :cond_2

    .line 2406
    invoke-static {p2}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v6, p11

    .line 2407
    invoke-virtual {v6, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    const-wide/16 v6, 0x14

    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    move/from16 v6, p5

    .line 2409
    invoke-static {v6, p1}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v6

    neg-int v6, v6

    int-to-long v6, v6

    const/16 v8, 0x20

    shl-long/2addr v6, v8

    const-wide v8, 0xffff00000000L

    and-long/2addr v6, v8

    neg-int v8, v1

    int-to-long v8, v8

    const/16 v10, 0x30

    shl-long/2addr v8, v10

    const-wide/high16 v10, -0x1000000000000L

    and-long/2addr v8, v10

    or-long/2addr v6, v8

    const/4 v8, 0x0

    if-eqz p4, :cond_0

    const/high16 v9, 0x10000

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    or-int/2addr v9, v1

    .line 2413
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    sub-int/2addr v2, v1

    move/from16 v10, p7

    .line 2414
    invoke-static {v10, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-static {v8, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int/2addr v5, v1

    const v8, 0xffff

    and-int/2addr v5, v8

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v2, v5

    const/4 v5, 0x1

    if-le v1, v5, :cond_1

    sub-int/2addr v1, v5

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    :goto_1
    ushr-int/lit8 v8, v1, 0x1

    or-int/2addr v1, v8

    ushr-int/lit8 v8, v1, 0x2

    or-int/2addr v1, v8

    ushr-int/lit8 v8, v1, 0x4

    or-int/2addr v1, v8

    ushr-int/lit8 v8, v1, 0x8

    or-int/2addr v1, v8

    ushr-int/lit8 v8, v1, 0x10

    or-int/2addr v1, v8

    add-int/2addr v1, v5

    shl-int/2addr v1, v5

    .line 2420
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "ForkJoinPool-"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava9/util/concurrent/ForkJoinPool;->nextPoolId()I

    move-result v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "-worker-"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v0, Ljava9/util/concurrent/ForkJoinPool;->workerNamePrefix:Ljava/lang/String;

    .line 2421
    new-array v1, v1, [Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    iput-object v1, v0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    move-object v1, p2

    .line 2422
    iput-object v1, v0, Ljava9/util/concurrent/ForkJoinPool;->factory:Ljava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;

    move-object v1, p3

    .line 2423
    iput-object v1, v0, Ljava9/util/concurrent/ForkJoinPool;->ueh:Ljava/lang/Thread$UncaughtExceptionHandler;

    move-object/from16 v1, p8

    .line 2424
    iput-object v1, v0, Ljava9/util/concurrent/ForkJoinPool;->saturate:Ljava9/util/function/Predicate;

    .line 2425
    iput-wide v3, v0, Ljava9/util/concurrent/ForkJoinPool;->keepAlive:J

    .line 2426
    iput v2, v0, Ljava9/util/concurrent/ForkJoinPool;->bounds:I

    .line 2427
    iput v9, v0, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    .line 2428
    iput-wide v6, v0, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    .line 2429
    invoke-static {}, Ljava9/util/concurrent/ForkJoinPool;->checkPermission()V

    return-void

    .line 2405
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1
.end method

.method private static checkPermission()V
    .locals 2

    .line 604
    invoke-static {}, Ljava/lang/System;->getSecurityManager()Ljava/lang/SecurityManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 606
    sget-object v1, Ljava9/util/concurrent/ForkJoinPool;->modifyThreadPermission:Ljava/lang/RuntimePermission;

    invoke-virtual {v0, v1}, Ljava/lang/SecurityManager;->checkPermission(Ljava/security/Permission;)V

    :cond_0
    return-void
.end method

.method static varargs contextWithPermissions([Ljava/security/Permission;)Ljava/security/AccessControlContext;
    .locals 5

    .line 637
    new-instance v0, Ljava/security/Permissions;

    invoke-direct {v0}, Ljava/security/Permissions;-><init>()V

    .line 638
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p0, v3

    .line 639
    invoke-virtual {v0, v4}, Ljava/security/Permissions;->add(Ljava/security/Permission;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 640
    :cond_0
    new-instance p0, Ljava/security/AccessControlContext;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/security/ProtectionDomain;

    new-instance v3, Ljava/security/ProtectionDomain;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0}, Ljava/security/ProtectionDomain;-><init>(Ljava/security/CodeSource;Ljava/security/PermissionCollection;)V

    aput-object v3, v1, v2

    invoke-direct {p0, v1}, Ljava/security/AccessControlContext;-><init>([Ljava/security/ProtectionDomain;)V

    return-object p0
.end method

.method private createWorker()Z
    .locals 3

    .line 1386
    iget-object v0, p0, Ljava9/util/concurrent/ForkJoinPool;->factory:Ljava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1390
    :try_start_0
    invoke-interface {v0, p0}, Ljava9/util/concurrent/ForkJoinPool$ForkJoinWorkerThreadFactory;->newThread(Ljava9/util/concurrent/ForkJoinPool;)Ljava9/util/concurrent/ForkJoinWorkerThread;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v0, :cond_1

    .line 1391
    :try_start_1
    invoke-virtual {v0}, Ljava9/util/concurrent/ForkJoinWorkerThread;->start()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v2, v1

    move-object v1, v0

    move-object v0, v2

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 1397
    :cond_1
    :goto_0
    invoke-virtual {p0, v0, v1}, Ljava9/util/concurrent/ForkJoinPool;->deregisterWorker(Ljava9/util/concurrent/ForkJoinWorkerThread;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return v0
.end method

.method private externalSubmit(Ljava9/util/concurrent/ForkJoinTask;)Ljava9/util/concurrent/ForkJoinTask;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/concurrent/ForkJoinTask<",
            "TT;>;)",
            "Ljava9/util/concurrent/ForkJoinTask<",
            "TT;>;"
        }
    .end annotation

    .line 2028
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2029
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v1, v0, Ljava9/util/concurrent/ForkJoinWorkerThread;

    if-eqz v1, :cond_0

    check-cast v0, Ljava9/util/concurrent/ForkJoinWorkerThread;

    iget-object v1, v0, Ljava9/util/concurrent/ForkJoinWorkerThread;->pool:Ljava9/util/concurrent/ForkJoinPool;

    if-ne v1, p0, :cond_0

    iget-object v0, v0, Ljava9/util/concurrent/ForkJoinWorkerThread;->workQueue:Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    if-eqz v0, :cond_0

    .line 2032
    invoke-virtual {v0, p1}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->push(Ljava9/util/concurrent/ForkJoinTask;)V

    goto :goto_0

    .line 2034
    :cond_0
    invoke-virtual {p0, p1}, Ljava9/util/concurrent/ForkJoinPool;->externalPush(Ljava9/util/concurrent/ForkJoinTask;)V

    :goto_0
    return-object p1
.end method

.method static getAndAddLong(Ljava/lang/Object;JJ)J
    .locals 11

    .line 1331
    :cond_0
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0, p1, p2}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    move-result-wide v9

    .line 1332
    sget-object v1, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    add-long v7, v9, p3

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, v9

    invoke-virtual/range {v1 .. v8}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-wide v9
.end method

.method static getAndSetObject(Ljava/lang/Object;JLjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1350
    :cond_0
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0, p1, p2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    .line 1351
    sget-object v1, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    move-object v2, p0

    move-wide v3, p1

    move-object v5, v0

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0
.end method

.method public static getCommonPoolParallelism()I
    .locals 1

    .line 2671
    sget v0, Ljava9/util/concurrent/ForkJoinPool;->COMMON_PARALLELISM:I

    return v0
.end method

.method private static newInstanceFromSystemProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2434
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 2437
    :cond_0
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Class;

    .line 2438
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final declared-synchronized nextPoolId()I
    .locals 2

    const-class v0, Ljava9/util/concurrent/ForkJoinPool;

    monitor-enter v0

    .line 1223
    :try_start_0
    sget v1, Ljava9/util/concurrent/ForkJoinPool;->poolNumberSequence:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Ljava9/util/concurrent/ForkJoinPool;->poolNumberSequence:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private pollScan(Z)Ljava9/util/concurrent/ForkJoinTask;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava9/util/concurrent/ForkJoinTask<",
            "*>;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1889
    :cond_0
    iget v1, v0, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-nez v1, :cond_5

    iget-object v1, v0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    if-eqz v1, :cond_5

    array-length v2, v1

    if-lez v2, :cond_5

    add-int/lit8 v2, v2, -0x1

    .line 1892
    invoke-static {}, Ljava9/util/concurrent/TLRandom;->nextSecondarySeed()I

    move-result v3

    ushr-int/lit8 v4, v3, 0x10

    if-eqz p1, :cond_1

    and-int/lit8 v3, v3, -0x2

    and-int/2addr v3, v2

    and-int/lit8 v4, v4, -0x2

    or-int/lit8 v4, v4, 0x2

    goto :goto_0

    :cond_1
    and-int/2addr v3, v2

    or-int/lit8 v4, v4, 0x1

    :goto_0
    const/4 v5, 0x0

    move v6, v3

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 1905
    :cond_2
    :goto_1
    aget-object v9, v1, v6

    if-eqz v9, :cond_3

    .line 1906
    iget v10, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    add-int/2addr v7, v10

    .line 1907
    iget v11, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->top:I

    sub-int v11, v10, v11

    if-gez v11, :cond_3

    iget-object v13, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->array:[Ljava9/util/concurrent/ForkJoinTask;

    if-eqz v13, :cond_3

    array-length v11, v13

    if-lez v11, :cond_3

    add-int/lit8 v11, v11, -0x1

    and-int v1, v11, v10

    int-to-long v1, v1

    .line 1910
    sget v3, Ljava9/util/concurrent/ForkJoinPool;->ASHIFT:I

    shl-long/2addr v1, v3

    sget v3, Ljava9/util/concurrent/ForkJoinPool;->ABASE:I

    int-to-long v3, v3

    add-long v14, v1, v3

    .line 1911
    sget-object v1, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    .line 1912
    invoke-virtual {v1, v13, v14, v15}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava9/util/concurrent/ForkJoinTask;

    if-eqz v1, :cond_0

    add-int/lit8 v2, v10, 0x1

    .line 1913
    iget v3, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    if-ne v10, v3, :cond_0

    sget-object v12, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    const/16 v17, 0x0

    move-object/from16 v16, v1

    .line 1914
    invoke-virtual/range {v12 .. v17}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1915
    iput v2, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    return-object v1

    :cond_3
    add-int/2addr v6, v4

    and-int/2addr v6, v2

    if-ne v6, v3, :cond_2

    if-ne v8, v7, :cond_4

    goto :goto_2

    :cond_4
    move v8, v7

    const/4 v7, 0x0

    goto :goto_1

    :cond_5
    :goto_2
    const/4 v1, 0x0

    return-object v1
.end method

.method private tryAddWorker(J)V
    .locals 8

    move-wide v4, p1

    :cond_0
    const-wide/high16 p1, -0x1000000000000L

    const-wide/high16 v0, 0x1000000000000L

    add-long/2addr v0, v4

    and-long/2addr p1, v0

    const-wide v0, 0xffff00000000L

    const-wide v2, 0x100000000L

    add-long/2addr v2, v4

    and-long/2addr v0, v2

    or-long v6, p1, v0

    .line 1413
    iget-wide p1, p0, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    cmp-long v0, p1, v4

    if-nez v0, :cond_1

    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    sget-wide v2, Ljava9/util/concurrent/ForkJoinPool;->CTL:J

    move-object v1, p0

    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 1414
    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinPool;->createWorker()Z

    goto :goto_0

    .line 1417
    :cond_1
    iget-wide v4, p0, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    const-wide p1, 0x800000000000L

    and-long/2addr p1, v4

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-eqz v2, :cond_2

    long-to-int p1, v4

    if-eqz p1, :cond_0

    :cond_2
    :goto_0
    return-void
.end method

.method private tryCompensate(Ljava9/util/concurrent/ForkJoinPool$WorkQueue;)I
    .locals 19

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    .line 1581
    iget-wide v4, v8, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    .line 1582
    iget-object v1, v8, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    const/16 v2, 0x20

    ushr-long v2, v4, v2

    long-to-int v3, v2

    int-to-short v2, v3

    const/4 v9, 0x1

    if-ltz v2, :cond_13

    if-eqz v1, :cond_12

    .line 1584
    array-length v3, v1

    if-lez v3, :cond_12

    if-nez v0, :cond_0

    goto/16 :goto_7

    :cond_0
    long-to-int v6, v4

    const-wide/high16 v11, 0x1000000000000L

    const/4 v13, -0x1

    if-eqz v6, :cond_6

    sub-int/2addr v3, v9

    and-int v2, v6, v3

    .line 1587
    aget-object v14, v1, v2

    .line 1588
    iget v15, v0, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    const-wide v0, -0x100000000L

    if-gez v15, :cond_1

    add-long v2, v4, v11

    goto :goto_0

    :cond_1
    move-wide v2, v4

    :goto_0
    and-long/2addr v0, v2

    const v2, 0x7fffffff

    and-int v11, v6, v2

    if-eqz v14, :cond_5

    .line 1592
    iget v2, v14, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    .line 1593
    iget-object v12, v14, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->owner:Ljava9/util/concurrent/ForkJoinWorkerThread;

    .line 1594
    iget v3, v14, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->stackPred:I

    int-to-long v9, v3

    const-wide v17, 0xffffffffL

    and-long v9, v9, v17

    or-long/2addr v9, v0

    if-ne v2, v6, :cond_4

    .line 1595
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    sget-wide v2, Ljava9/util/concurrent/ForkJoinPool;->CTL:J

    move-object/from16 v1, p0

    move-wide v6, v9

    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1596
    iput v11, v14, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    .line 1597
    iget v0, v14, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    if-gez v0, :cond_2

    .line 1598
    invoke-static {v12}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_2
    if-gez v15, :cond_3

    const/16 v16, -0x1

    goto :goto_1

    :cond_3
    const/16 v16, 0x1

    :goto_1
    return v16

    :cond_4
    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_6
    const/16 v0, 0x30

    shr-long v6, v4, v0

    long-to-int v0, v6

    .line 1604
    iget v6, v8, Ljava9/util/concurrent/ForkJoinPool;->bounds:I

    const v7, 0xffff

    and-int/2addr v6, v7

    int-to-short v6, v6

    sub-int/2addr v0, v6

    if-lez v0, :cond_7

    const-wide/high16 v0, -0x1000000000000L

    sub-long v2, v4, v11

    and-long/2addr v0, v2

    const-wide v2, 0xffffffffffffL

    and-long/2addr v2, v4

    or-long v6, v0, v2

    .line 1607
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    sget-wide v2, Ljava9/util/concurrent/ForkJoinPool;->CTL:J

    move-object/from16 v1, p0

    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v0

    return v0

    .line 1610
    :cond_7
    iget v0, v8, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    and-int/2addr v0, v7

    add-int v6, v0, v2

    move v9, v6

    const/4 v7, 0x1

    const/4 v10, 0x0

    :goto_3
    if-ge v7, v3, :cond_b

    .line 1614
    aget-object v11, v1, v7

    if-eqz v11, :cond_a

    .line 1615
    iget v12, v11, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    if-nez v12, :cond_8

    const/4 v1, 0x1

    goto :goto_4

    :cond_8
    add-int/lit8 v9, v9, -0x1

    .line 1621
    iget-object v11, v11, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->owner:Ljava9/util/concurrent/ForkJoinWorkerThread;

    if-eqz v11, :cond_a

    .line 1622
    invoke-virtual {v11}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v11

    sget-object v12, Ljava/lang/Thread$State;->BLOCKED:Ljava/lang/Thread$State;

    if-eq v11, v12, :cond_9

    sget-object v12, Ljava/lang/Thread$State;->WAITING:Ljava/lang/Thread$State;

    if-ne v11, v12, :cond_a

    :cond_9
    add-int/lit8 v10, v10, 0x1

    :cond_a
    add-int/lit8 v7, v7, 0x2

    goto :goto_3

    :cond_b
    const/4 v1, 0x0

    :goto_4
    if-nez v1, :cond_11

    if-nez v9, :cond_11

    .line 1628
    iget-wide v11, v8, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    cmp-long v1, v11, v4

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    const/16 v1, 0x7fff

    if-ge v6, v1, :cond_e

    .line 1630
    iget v1, v8, Ljava9/util/concurrent/ForkJoinPool;->bounds:I

    ushr-int/lit8 v1, v1, 0x10

    if-lt v2, v1, :cond_d

    goto :goto_5

    :cond_d
    const/4 v9, 0x0

    goto :goto_8

    .line 1632
    :cond_e
    :goto_5
    iget-object v1, v8, Ljava9/util/concurrent/ForkJoinPool;->saturate:Ljava9/util/function/Predicate;

    if-eqz v1, :cond_f

    invoke-interface {v1, v8}, Ljava9/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    return v13

    :cond_f
    if-ge v10, v0, :cond_10

    .line 1635
    invoke-static {}, Ljava/lang/Thread;->yield()V

    const/4 v9, 0x0

    return v9

    .line 1639
    :cond_10
    new-instance v0, Ljava/util/concurrent/RejectedExecutionException;

    const-string v1, "Thread limit exceeded replacing blocked worker"

    invoke-direct {v0, v1}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    :goto_6
    const/4 v9, 0x0

    return v9

    :cond_12
    :goto_7
    const/4 v9, 0x0

    return v9

    :cond_13
    const/4 v9, 0x0

    :goto_8
    const-wide v0, 0x100000000L

    add-long/2addr v0, v4

    const-wide v2, 0xffff00000000L

    and-long/2addr v0, v2

    const-wide v2, -0xffff00000001L

    and-long/2addr v2, v4

    or-long v6, v0, v2

    .line 1646
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    sget-wide v2, Ljava9/util/concurrent/ForkJoinPool;->CTL:J

    move-object/from16 v1, p0

    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-direct/range {p0 .. p0}, Ljava9/util/concurrent/ForkJoinPool;->createWorker()Z

    move-result v0

    if-eqz v0, :cond_14

    const/16 v16, 0x1

    goto :goto_9

    :cond_14
    const/16 v16, 0x0

    :goto_9
    return v16
.end method

.method private tryTerminate(ZZ)Z
    .locals 15

    move-object v7, p0

    .line 2160
    :goto_0
    iget v5, v7, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    const/high16 v0, 0x40000

    and-int v1, v5, v0

    const/4 v8, 0x0

    if-nez v1, :cond_2

    if-eqz p2, :cond_1

    .line 2161
    sget-object v1, Ljava9/util/concurrent/ForkJoinPool;->common:Ljava9/util/concurrent/ForkJoinPool;

    if-ne v7, v1, :cond_0

    goto :goto_1

    .line 2164
    :cond_0
    sget-object v1, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    sget-wide v3, Ljava9/util/concurrent/ForkJoinPool;->MODE:J

    or-int v6, v5, v0

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    goto :goto_0

    :cond_1
    :goto_1
    return v8

    .line 2167
    :cond_2
    :goto_2
    iget v0, v7, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    const v9, 0xffff

    const-wide/16 v10, 0x0

    const/4 v12, 0x1

    if-nez v2, :cond_d

    if-nez p1, :cond_c

    .line 2171
    :goto_3
    iget-wide v2, v7, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    .line 2172
    iget-object v4, v7, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    and-int/2addr v0, v9

    const/16 v5, 0x30

    shr-long v5, v2, v5

    long-to-int v6, v5

    add-int/2addr v0, v6

    if-lez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_5

    :cond_3
    if-eqz v4, :cond_7

    const/4 v0, 0x0

    .line 2177
    :goto_4
    array-length v5, v4

    if-ge v0, v5, :cond_6

    .line 2178
    aget-object v5, v4, v0

    if-eqz v5, :cond_5

    .line 2179
    iget v6, v5, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    iget v13, v5, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    add-int/2addr v13, v6

    int-to-long v13, v13

    add-long/2addr v2, v13

    .line 2180
    iget v13, v5, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->top:I

    if-ne v6, v13, :cond_4

    and-int/lit8 v6, v0, 0x1

    if-ne v6, v12, :cond_5

    iget v5, v5, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    if-ltz v5, :cond_5

    :cond_4
    const/4 v0, 0x1

    goto :goto_5

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    .line 2188
    :goto_5
    iget v5, v7, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    and-int v6, v5, v1

    if-eqz v6, :cond_8

    goto :goto_6

    :cond_8
    if-eqz v0, :cond_9

    return v8

    .line 2192
    :cond_9
    iget-object v0, v7, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    if-ne v0, v4, :cond_b

    cmp-long v0, v10, v2

    if-nez v0, :cond_a

    goto :goto_6

    :cond_a
    move-wide v10, v2

    :cond_b
    move v0, v5

    goto :goto_3

    :cond_c
    move v5, v0

    :goto_6
    and-int v0, v5, v1

    if-nez v0, :cond_2

    .line 2197
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    sget-wide v3, Ljava9/util/concurrent/ForkJoinPool;->MODE:J

    or-int v6, v5, v1

    move-object v1, v0

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    goto :goto_2

    .line 2200
    :cond_d
    iget v0, v7, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-nez v0, :cond_17

    move-wide v2, v10

    .line 2203
    :cond_e
    :goto_7
    iget-wide v4, v7, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    .line 2204
    iget-object v0, v7, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    if-eqz v0, :cond_12

    move-wide v5, v4

    const/4 v4, 0x0

    .line 2205
    :goto_8
    array-length v13, v0

    if-ge v4, v13, :cond_11

    .line 2206
    aget-object v13, v0, v4

    if-eqz v13, :cond_10

    .line 2207
    iget-object v14, v13, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->owner:Ljava9/util/concurrent/ForkJoinWorkerThread;

    .line 2208
    invoke-virtual {v13}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->cancelAll()V

    if-eqz v14, :cond_f

    .line 2211
    :try_start_0
    invoke-virtual {v14}, Ljava9/util/concurrent/ForkJoinWorkerThread;->interrupt()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 2215
    :catch_0
    :cond_f
    iget v14, v13, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    iget v13, v13, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    add-int/2addr v14, v13

    int-to-long v13, v14

    add-long/2addr v5, v13

    :cond_10
    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_11
    move-wide v4, v5

    .line 2219
    :cond_12
    iget v6, v7, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    and-int v13, v6, v1

    if-nez v13, :cond_14

    iget-object v14, v7, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    if-ne v14, v0, :cond_e

    cmp-long v0, v2, v4

    if-nez v0, :cond_13

    goto :goto_9

    :cond_13
    move-wide v2, v4

    goto :goto_7

    :cond_14
    :goto_9
    if-eqz v13, :cond_15

    goto :goto_a

    :cond_15
    and-int v0, v6, v9

    .line 2225
    iget-wide v2, v7, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    const/16 v4, 0x20

    ushr-long/2addr v2, v4

    long-to-int v3, v2

    int-to-short v2, v3

    add-int/2addr v0, v2

    if-lez v0, :cond_16

    goto :goto_a

    .line 2227
    :cond_16
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    sget-wide v3, Ljava9/util/concurrent/ForkJoinPool;->MODE:J

    or-int v13, v6, v1

    move-object v1, v0

    move-object v2, p0

    move v5, v6

    move v6, v13

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 2228
    monitor-enter p0

    .line 2229
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 2230
    monitor-exit p0

    goto :goto_a

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_17
    :goto_a
    return v12
.end method


# virtual methods
.method final awaitJoin(Ljava9/util/concurrent/ForkJoinPool$WorkQueue;Ljava9/util/concurrent/ForkJoinTask;J)I
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/concurrent/ForkJoinPool$WorkQueue;",
            "Ljava9/util/concurrent/ForkJoinTask<",
            "*>;J)I"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    if-eqz v1, :cond_c

    if-eqz v2, :cond_c

    .line 1762
    instance-of v4, v2, Ljava9/util/concurrent/CountedCompleter;

    if-eqz v4, :cond_1

    move-object v4, v2

    check-cast v4, Ljava9/util/concurrent/CountedCompleter;

    .line 1764
    invoke-virtual {v1, v4, v3}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->localHelpCC(Ljava9/util/concurrent/CountedCompleter;I)I

    move-result v4

    if-ltz v4, :cond_0

    goto :goto_0

    :cond_0
    move v6, v4

    goto/16 :goto_5

    .line 1765
    :cond_1
    :goto_0
    invoke-virtual/range {p1 .. p2}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->tryRemoveAndExec(Ljava9/util/concurrent/ForkJoinTask;)V

    .line 1766
    iget v4, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    iget v5, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    .line 1767
    iget v6, v2, Ljava9/util/concurrent/ForkJoinTask;->status:I

    :cond_2
    :goto_1
    if-ltz v6, :cond_d

    .line 1771
    invoke-static {}, Ljava9/util/concurrent/TLRandom;->nextSecondarySeed()I

    move-result v6

    const/4 v7, 0x1

    or-int/2addr v6, v7

    .line 1772
    iget-object v8, v0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    if-eqz v8, :cond_4

    .line 1773
    array-length v9, v8

    add-int/lit8 v10, v9, -0x1

    neg-int v11, v9

    :goto_2
    if-ge v11, v9, :cond_4

    add-int v12, v6, v11

    and-int/2addr v12, v10

    if-ltz v12, :cond_3

    if-ge v12, v9, :cond_3

    .line 1775
    aget-object v12, v8, v12

    if-eqz v12, :cond_3

    iget v13, v12, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    if-ne v13, v5, :cond_3

    iget v13, v12, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    iget v14, v12, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->top:I

    sub-int v14, v13, v14

    if-gez v14, :cond_3

    iget-object v14, v12, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->array:[Ljava9/util/concurrent/ForkJoinTask;

    if-eqz v14, :cond_3

    array-length v15, v14

    if-lez v15, :cond_3

    .line 1779
    iget v6, v12, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    add-int/lit8 v15, v15, -0x1

    and-int v8, v15, v13

    int-to-long v8, v8

    .line 1781
    sget v10, Ljava9/util/concurrent/ForkJoinPool;->ASHIFT:I

    shl-long/2addr v8, v10

    sget v10, Ljava9/util/concurrent/ForkJoinPool;->ABASE:I

    int-to-long v10, v10

    add-long/2addr v8, v10

    .line 1782
    sget-object v10, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    .line 1783
    invoke-virtual {v10, v14, v8, v9}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava9/util/concurrent/ForkJoinTask;

    if-eqz v10, :cond_5

    add-int/lit8 v11, v13, 0x1

    .line 1784
    iget v15, v12, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    if-ne v13, v15, :cond_5

    iget v13, v12, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    if-ne v5, v13, :cond_5

    sget-object v15, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    const/16 v20, 0x0

    move-object/from16 v16, v14

    move-wide/from16 v17, v8

    move-object/from16 v19, v10

    .line 1785
    invoke-virtual/range {v15 .. v20}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 1786
    iput v11, v12, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    .line 1787
    iput v6, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    .line 1788
    invoke-virtual {v10}, Ljava9/util/concurrent/ForkJoinTask;->doExec()I

    .line 1789
    iput v4, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    goto :goto_3

    :cond_3
    add-int/lit8 v11, v11, 0x2

    goto :goto_2

    :cond_4
    const/4 v7, 0x0

    .line 1796
    :cond_5
    :goto_3
    iget v6, v2, Ljava9/util/concurrent/ForkJoinTask;->status:I

    if-gez v6, :cond_6

    goto :goto_5

    :cond_6
    if-nez v7, :cond_2

    const-wide/16 v7, 0x0

    cmp-long v9, p3, v7

    if-nez v9, :cond_7

    move-wide v9, v7

    goto :goto_4

    .line 1802
    :cond_7
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v9

    sub-long v9, p3, v9

    cmp-long v11, v9, v7

    if-gtz v11, :cond_8

    goto :goto_5

    .line 1804
    :cond_8
    sget-object v6, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v9

    cmp-long v6, v9, v7

    if-gtz v6, :cond_9

    const-wide/16 v9, 0x1

    .line 1806
    :cond_9
    :goto_4
    invoke-direct/range {p0 .. p1}, Ljava9/util/concurrent/ForkJoinPool;->tryCompensate(Ljava9/util/concurrent/ForkJoinPool$WorkQueue;)I

    move-result v6

    if-eqz v6, :cond_b

    .line 1807
    invoke-virtual {v2, v9, v10}, Ljava9/util/concurrent/ForkJoinTask;->internalWait(J)V

    .line 1808
    sget-wide v9, Ljava9/util/concurrent/ForkJoinPool;->CTL:J

    if-lez v6, :cond_a

    const-wide/high16 v7, 0x1000000000000L

    :cond_a
    invoke-static {v0, v9, v10, v7, v8}, Ljava9/util/concurrent/ForkJoinPool;->getAndAddLong(Ljava/lang/Object;JJ)J

    .line 1810
    :cond_b
    iget v6, v2, Ljava9/util/concurrent/ForkJoinTask;->status:I

    goto/16 :goto_1

    :cond_c
    const/4 v6, 0x0

    :cond_d
    :goto_5
    return v6
.end method

.method public awaitQuiescence(JLjava/util/concurrent/TimeUnit;)Z
    .locals 6

    .line 3074
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    .line 3076
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    .line 3077
    instance-of v0, p3, Ljava9/util/concurrent/ForkJoinWorkerThread;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    check-cast p3, Ljava9/util/concurrent/ForkJoinWorkerThread;

    iget-object v0, p3, Ljava9/util/concurrent/ForkJoinWorkerThread;->pool:Ljava9/util/concurrent/ForkJoinPool;

    if-ne v0, p0, :cond_0

    .line 3079
    iget-object p1, p3, Ljava9/util/concurrent/ForkJoinWorkerThread;->workQueue:Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    invoke-virtual {p0, p1}, Ljava9/util/concurrent/ForkJoinPool;->helpQuiescePool(Ljava9/util/concurrent/ForkJoinPool$WorkQueue;)V

    return v1

    .line 3083
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    :goto_0
    const/4 p3, 0x0

    .line 3085
    invoke-direct {p0, p3}, Ljava9/util/concurrent/ForkJoinPool;->pollScan(Z)Ljava9/util/concurrent/ForkJoinTask;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3086
    invoke-virtual {v0}, Ljava9/util/concurrent/ForkJoinTask;->doExec()I

    goto :goto_0

    .line 3087
    :cond_1
    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinPool;->isQuiescent()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 3089
    :cond_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long/2addr v4, v2

    cmp-long v0, v4, p1

    if-lez v0, :cond_3

    return p3

    .line 3092
    :cond_3
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0
.end method

.method public awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 3037
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_6

    .line 3039
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->common:Ljava9/util/concurrent/ForkJoinPool;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 3040
    invoke-virtual {p0, p1, p2, p3}, Ljava9/util/concurrent/ForkJoinPool;->awaitQuiescence(JLjava/util/concurrent/TimeUnit;)Z

    return v1

    .line 3043
    :cond_0
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    .line 3044
    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinPool;->isTerminated()Z

    move-result p3

    const/4 v0, 0x1

    if-eqz p3, :cond_1

    return v0

    :cond_1
    const-wide/16 v2, 0x0

    cmp-long p3, p1, v2

    if-gtz p3, :cond_2

    return v1

    .line 3048
    :cond_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    add-long/2addr v4, p1

    .line 3049
    monitor-enter p0

    .line 3051
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinPool;->isTerminated()Z

    move-result p3

    if-eqz p3, :cond_3

    .line 3052
    monitor-exit p0

    return v0

    :cond_3
    cmp-long p3, p1, v2

    if-gtz p3, :cond_4

    .line 3054
    monitor-exit p0

    return v1

    .line 3055
    :cond_4
    sget-object p3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    cmp-long p3, p1, v2

    if-lez p3, :cond_5

    goto :goto_1

    :cond_5
    const-wide/16 p1, 0x1

    .line 3056
    :goto_1
    invoke-virtual {p0, p1, p2}, Ljava/lang/Object;->wait(J)V

    .line 3057
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    sub-long p1, v4, p1

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 3059
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 3038
    :cond_6
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1
.end method

.method final deregisterWorker(Ljava9/util/concurrent/ForkJoinWorkerThread;Ljava/lang/Throwable;)V
    .locals 17

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    const-wide v10, 0xffffffffL

    const/4 v1, 0x0

    const/4 v12, 0x0

    if-eqz v0, :cond_2

    .line 1495
    iget-object v0, v0, Ljava9/util/concurrent/ForkJoinWorkerThread;->workQueue:Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    if-eqz v0, :cond_3

    .line 1496
    iget-object v2, v9, Ljava9/util/concurrent/ForkJoinPool;->workerNamePrefix:Ljava/lang/String;

    .line 1497
    iget v3, v0, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->nsteals:I

    int-to-long v3, v3

    and-long/2addr v3, v10

    .line 1498
    iget v5, v0, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    const v6, 0xffff

    and-int/2addr v5, v6

    if-eqz v2, :cond_1

    .line 1501
    monitor-enter v2

    .line 1502
    :try_start_0
    iget-object v6, v9, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    if-eqz v6, :cond_0

    array-length v7, v6

    if-le v7, v5, :cond_0

    aget-object v7, v6, v5

    if-ne v7, v0, :cond_0

    .line 1504
    aput-object v1, v6, v5

    .line 1505
    :cond_0
    iget-wide v5, v9, Ljava9/util/concurrent/ForkJoinPool;->stealCount:J

    add-long/2addr v5, v3

    iput-wide v5, v9, Ljava9/util/concurrent/ForkJoinPool;->stealCount:J

    .line 1506
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1508
    :cond_1
    :goto_0
    iget v1, v0, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    goto :goto_1

    :cond_2
    move-object v0, v1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    const/high16 v2, 0x40000000    # 2.0f

    if-eq v1, v2, :cond_5

    .line 1512
    :cond_4
    sget-object v1, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    sget-wide v3, Ljava9/util/concurrent/ForkJoinPool;->CTL:J

    iget-wide v5, v9, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    const-wide/high16 v7, -0x1000000000000L

    const-wide/high16 v13, 0x1000000000000L

    sub-long v13, v5, v13

    and-long/2addr v7, v13

    const-wide v13, 0xffff00000000L

    const-wide v15, 0x100000000L

    sub-long v15, v5, v15

    and-long/2addr v13, v15

    or-long/2addr v7, v13

    and-long v13, v5, v10

    or-long/2addr v7, v13

    move-object/from16 v2, p0

    .line 1513
    invoke-virtual/range {v1 .. v8}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_5
    if-eqz v0, :cond_6

    .line 1518
    invoke-virtual {v0}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->cancelAll()V

    .line 1520
    :cond_6
    invoke-direct {v9, v12, v12}, Ljava9/util/concurrent/ForkJoinPool;->tryTerminate(ZZ)Z

    move-result v1

    if-nez v1, :cond_7

    if-eqz v0, :cond_7

    iget-object v0, v0, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->array:[Ljava9/util/concurrent/ForkJoinTask;

    if-eqz v0, :cond_7

    .line 1522
    invoke-virtual/range {p0 .. p0}, Ljava9/util/concurrent/ForkJoinPool;->signalWork()V

    :cond_7
    if-nez p2, :cond_8

    .line 1525
    invoke-static {}, Ljava9/util/concurrent/ForkJoinTask;->helpExpungeStaleExceptions()V

    goto :goto_2

    .line 1527
    :cond_8
    invoke-static/range {p2 .. p2}, Ljava9/util/concurrent/ForkJoinTask;->rethrow(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 2555
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2557
    instance-of v0, p1, Ljava9/util/concurrent/ForkJoinTask;

    if-eqz v0, :cond_0

    .line 2558
    check-cast p1, Ljava9/util/concurrent/ForkJoinTask;

    goto :goto_0

    .line 2560
    :cond_0
    new-instance v0, Ljava9/util/concurrent/ForkJoinTask$RunnableExecuteAction;

    invoke-direct {v0, p1}, Ljava9/util/concurrent/ForkJoinTask$RunnableExecuteAction;-><init>(Ljava/lang/Runnable;)V

    move-object p1, v0

    .line 2561
    :goto_0
    invoke-direct {p0, p1}, Ljava9/util/concurrent/ForkJoinPool;->externalSubmit(Ljava9/util/concurrent/ForkJoinTask;)Ljava9/util/concurrent/ForkJoinTask;

    return-void
.end method

.method final externalHelpComplete(Ljava9/util/concurrent/CountedCompleter;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/concurrent/CountedCompleter<",
            "*>;I)I"
        }
    .end annotation

    .line 2066
    invoke-static {}, Ljava9/util/concurrent/TLRandom;->getProbe()I

    move-result v0

    .line 2068
    iget-object v1, p0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    if-eqz v1, :cond_0

    array-length v2, v1

    if-lez v2, :cond_0

    add-int/lit8 v2, v2, -0x1

    and-int/2addr v0, v2

    and-int/lit8 v0, v0, 0x7e

    aget-object v0, v1, v0

    if-eqz v0, :cond_0

    .line 2070
    invoke-virtual {v0, p1, p2}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->sharedHelpCC(Ljava9/util/concurrent/CountedCompleter;I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method final externalPush(Ljava9/util/concurrent/ForkJoinTask;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/concurrent/ForkJoinTask<",
            "*>;)V"
        }
    .end annotation

    .line 1956
    invoke-static {}, Ljava9/util/concurrent/TLRandom;->getProbe()I

    move-result v0

    if-nez v0, :cond_0

    .line 1957
    invoke-static {}, Ljava9/util/concurrent/TLRandom;->localInit()V

    .line 1958
    invoke-static {}, Ljava9/util/concurrent/TLRandom;->getProbe()I

    move-result v0

    .line 1961
    :cond_0
    :goto_0
    iget v1, p0, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    .line 1962
    iget-object v2, p0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    const/high16 v3, 0x40000

    and-int/2addr v1, v3

    if-nez v1, :cond_a

    if-eqz v2, :cond_a

    .line 1963
    array-length v1, v2

    if-lez v1, :cond_a

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v1, v0

    and-int/lit8 v1, v1, 0x7e

    .line 1968
    aget-object v1, v2, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_3

    .line 1969
    iget-object v1, p0, Ljava9/util/concurrent/ForkJoinPool;->workerNamePrefix:Ljava/lang/String;

    const/high16 v4, 0x40000000    # 2.0f

    or-int v5, v0, v4

    const v6, -0x10002

    and-int/2addr v5, v6

    .line 1971
    new-instance v6, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    const/4 v7, 0x0

    invoke-direct {v6, p0, v7}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;-><init>(Ljava9/util/concurrent/ForkJoinPool;Ljava9/util/concurrent/ForkJoinWorkerThread;)V

    .line 1972
    iput v5, v6, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    .line 1973
    iput v4, v6, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    .line 1974
    iput v3, v6, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    if-eqz v1, :cond_2

    .line 1976
    monitor-enter v1

    .line 1978
    :try_start_0
    iget-object v4, p0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    if-eqz v4, :cond_1

    array-length v7, v4

    if-lez v7, :cond_1

    add-int/lit8 v7, v7, -0x1

    and-int/2addr v5, v7

    and-int/lit8 v5, v5, 0x7e

    aget-object v7, v4, v5

    if-nez v7, :cond_1

    .line 1981
    aput-object v6, v4, v5

    const/4 v4, 0x1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 1984
    :goto_1
    monitor-exit v1

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_2
    move-object v1, v6

    goto :goto_4

    .line 1987
    :cond_3
    invoke-virtual {v1}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->tryLockSharedQueue()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 1988
    iget v4, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    iget v5, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->top:I

    .line 1989
    iget-object v6, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->array:[Ljava9/util/concurrent/ForkJoinTask;

    if-eqz v6, :cond_5

    array-length v7, v6

    if-lez v7, :cond_5

    add-int/lit8 v7, v7, -0x1

    sub-int/2addr v4, v5

    add-int v8, v7, v4

    if-lez v8, :cond_5

    and-int/2addr v7, v5

    .line 1991
    aput-object p1, v6, v7

    add-int/lit8 v6, v5, 0x1

    .line 1992
    iput v6, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->top:I

    .line 1993
    iput v2, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    if-gez v4, :cond_4

    .line 1994
    iget v4, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    sub-int/2addr v4, v5

    const/4 v5, -0x1

    if-ge v4, v5, :cond_4

    goto :goto_6

    :cond_4
    const/4 v4, 0x0

    goto :goto_3

    :cond_5
    const/4 v4, 0x1

    :goto_3
    move v5, v4

    const/4 v4, 0x1

    goto :goto_4

    :cond_6
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_4
    if-eqz v4, :cond_9

    if-eqz v5, :cond_8

    .line 2004
    :try_start_1
    invoke-virtual {v1}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->growArray()[Ljava9/util/concurrent/ForkJoinTask;

    .line 2005
    iget v0, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->top:I

    .line 2006
    iget-object v4, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->array:[Ljava9/util/concurrent/ForkJoinTask;

    if-eqz v4, :cond_7

    array-length v5, v4

    if-lez v5, :cond_7

    sub-int/2addr v5, v3

    and-int/2addr v5, v0

    .line 2007
    aput-object p1, v4, v5

    add-int/2addr v0, v3

    .line 2008
    iput v0, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->top:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2011
    :cond_7
    iput v2, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    goto :goto_5

    :catchall_1
    move-exception p1

    iput v2, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    throw p1

    .line 2014
    :cond_8
    :goto_5
    invoke-virtual {p0}, Ljava9/util/concurrent/ForkJoinPool;->signalWork()V

    :goto_6
    return-void

    .line 2018
    :cond_9
    invoke-static {v0}, Ljava9/util/concurrent/TLRandom;->advanceProbe(I)I

    move-result v0

    goto/16 :goto_0

    .line 1964
    :cond_a
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    invoke-direct {p1}, Ljava/util/concurrent/RejectedExecutionException;-><init>()V

    throw p1
.end method

.method public getParallelism()I
    .locals 2

    .line 2660
    iget v0, p0, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    const v1, 0xffff

    and-int/2addr v0, v1

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method final helpQuiescePool(Ljava9/util/concurrent/ForkJoinPool$WorkQueue;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1823
    iget v2, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    iget v3, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    const/high16 v4, 0x10000

    and-int/2addr v3, v4

    const/4 v4, -0x1

    move v6, v2

    const/4 v5, -0x1

    :goto_0
    const/4 v7, 0x0

    if-eqz v3, :cond_0

    .line 1827
    invoke-virtual {v1, v7}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->localPollAndExec(I)V

    goto :goto_1

    .line 1829
    :cond_0
    invoke-virtual {v1, v7}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->localPopAndExec(I)V

    :goto_1
    if-ne v5, v4, :cond_1

    .line 1830
    iget v9, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    if-ltz v9, :cond_1

    const/4 v5, 0x1

    .line 1833
    :cond_1
    invoke-static {}, Ljava9/util/concurrent/TLRandom;->nextSecondarySeed()I

    move-result v9

    .line 1834
    iget-object v10, v0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    const-wide/high16 v11, 0x1000000000000L

    if-eqz v10, :cond_7

    .line 1835
    array-length v14, v10

    add-int/lit8 v15, v14, -0x1

    move/from16 v16, v14

    const/16 v17, 0x1

    :goto_2
    if-lez v16, :cond_6

    sub-int v18, v9, v16

    and-int v4, v18, v15

    if-ltz v4, :cond_5

    if-ge v4, v14, :cond_5

    .line 1837
    aget-object v4, v10, v4

    if-eqz v4, :cond_5

    .line 1838
    iget v7, v4, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    iget v8, v4, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->top:I

    sub-int v8, v7, v8

    if-gez v8, :cond_4

    iget-object v8, v4, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->array:[Ljava9/util/concurrent/ForkJoinTask;

    if-eqz v8, :cond_4

    array-length v13, v8

    if-lez v13, :cond_4

    .line 1840
    iget v9, v4, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    if-nez v5, :cond_2

    .line 1843
    sget-wide v9, Ljava9/util/concurrent/ForkJoinPool;->CTL:J

    invoke-static {v0, v9, v10, v11, v12}, Ljava9/util/concurrent/ForkJoinPool;->getAndAddLong(Ljava/lang/Object;JJ)J

    const/4 v5, 0x1

    :cond_2
    add-int/lit8 v13, v13, -0x1

    and-int v9, v13, v7

    int-to-long v9, v9

    .line 1846
    sget v13, Ljava9/util/concurrent/ForkJoinPool;->ASHIFT:I

    shl-long/2addr v9, v13

    sget v13, Ljava9/util/concurrent/ForkJoinPool;->ABASE:I

    int-to-long v13, v13

    add-long/2addr v9, v13

    .line 1847
    sget-object v13, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    .line 1848
    invoke-virtual {v13, v8, v9, v10}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava9/util/concurrent/ForkJoinTask;

    if-eqz v13, :cond_3

    add-int/lit8 v14, v7, 0x1

    .line 1849
    iget v15, v4, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    if-ne v7, v15, :cond_3

    sget-object v19, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    const/16 v24, 0x0

    move-object/from16 v20, v8

    move-wide/from16 v21, v9

    move-object/from16 v23, v13

    .line 1850
    invoke-virtual/range {v19 .. v24}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 1851
    iput v14, v4, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    .line 1852
    iget v4, v4, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    iput v4, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    .line 1853
    invoke-virtual {v13}, Ljava9/util/concurrent/ForkJoinTask;->doExec()I

    .line 1854
    iput v2, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    move v6, v2

    :cond_3
    move v13, v6

    const/4 v4, 0x0

    const/16 v17, 0x0

    goto :goto_3

    .line 1859
    :cond_4
    iget v4, v4, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    const/high16 v7, 0x40000000    # 2.0f

    and-int/2addr v4, v7

    if-nez v4, :cond_5

    const/16 v17, 0x0

    :cond_5
    add-int/lit8 v16, v16, -0x1

    const/4 v4, -0x1

    const/4 v7, 0x0

    goto :goto_2

    :cond_6
    move v13, v6

    const/4 v4, 0x1

    goto :goto_3

    :cond_7
    move v13, v6

    const/4 v4, 0x1

    const/16 v17, 0x1

    :goto_3
    if-eqz v17, :cond_9

    if-nez v5, :cond_8

    .line 1866
    sget-wide v3, Ljava9/util/concurrent/ForkJoinPool;->CTL:J

    invoke-static {v0, v3, v4, v11, v12}, Ljava9/util/concurrent/ForkJoinPool;->getAndAddLong(Ljava/lang/Object;JJ)J

    .line 1867
    :cond_8
    iput v2, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    return-void

    :cond_9
    if-eqz v4, :cond_c

    const/high16 v7, 0x40000000    # 2.0f

    if-eq v13, v7, :cond_a

    .line 1872
    iput v7, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    const/4 v4, 0x1

    goto :goto_4

    :cond_a
    move v7, v13

    const/4 v4, 0x1

    :goto_4
    if-ne v5, v4, :cond_b

    .line 1875
    sget-wide v4, Ljava9/util/concurrent/ForkJoinPool;->CTL:J

    const-wide/high16 v8, -0x1000000000000L

    invoke-static {v0, v4, v5, v8, v9}, Ljava9/util/concurrent/ForkJoinPool;->getAndAddLong(Ljava/lang/Object;JJ)J

    move v6, v7

    const/4 v5, 0x0

    goto :goto_5

    :cond_b
    move v6, v7

    goto :goto_5

    :cond_c
    move v6, v13

    :goto_5
    const/4 v4, -0x1

    goto/16 :goto_0
.end method

.method public invokeAll(Ljava/util/Collection;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "TT;>;>;)",
            "Ljava/util/List<",
            "Ljava/util/concurrent/Future<",
            "TT;>;>;"
        }
    .end annotation

    .line 2617
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 2620
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Callable;

    .line 2621
    new-instance v3, Ljava9/util/concurrent/ForkJoinTask$AdaptedCallable;

    invoke-direct {v3, v2}, Ljava9/util/concurrent/ForkJoinTask$AdaptedCallable;-><init>(Ljava/util/concurrent/Callable;)V

    .line 2622
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2623
    invoke-direct {p0, v3}, Ljava9/util/concurrent/ForkJoinPool;->externalSubmit(Ljava9/util/concurrent/ForkJoinTask;)Ljava9/util/concurrent/ForkJoinTask;

    goto :goto_0

    .line 2625
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_1

    .line 2626
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava9/util/concurrent/ForkJoinTask;

    invoke-virtual {v3}, Ljava9/util/concurrent/ForkJoinTask;->quietlyJoin()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object v0

    :catch_0
    move-exception p1

    .line 2629
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_2

    .line 2630
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/Future;

    invoke-interface {v4, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 2631
    :cond_2
    throw p1
.end method

.method public isQuiescent()Z
    .locals 9

    .line 2741
    :cond_0
    iget-wide v0, p0, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    .line 2742
    iget v2, p0, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    const v3, 0xffff

    and-int/2addr v3, v2

    const/16 v4, 0x20

    ushr-long v4, v0, v4

    long-to-int v5, v4

    int-to-short v4, v5

    add-int/2addr v4, v3

    const/16 v5, 0x30

    shr-long v5, v0, v5

    long-to-int v6, v5

    add-int/2addr v3, v6

    const/high16 v5, -0x7ff80000

    and-int/2addr v2, v5

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    return v5

    :cond_1
    const/4 v2, 0x0

    if-lez v3, :cond_2

    return v2

    .line 2751
    :cond_2
    iget-object v3, p0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    if-eqz v3, :cond_6

    move v6, v4

    const/4 v4, 0x1

    .line 2752
    :goto_0
    array-length v7, v3

    if-ge v4, v7, :cond_5

    .line 2753
    aget-object v7, v3, v4

    if-eqz v7, :cond_4

    .line 2754
    iget v7, v7, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    const/high16 v8, 0x40000000    # 2.0f

    and-int/2addr v7, v8

    if-nez v7, :cond_3

    return v2

    :cond_3
    add-int/lit8 v6, v6, -0x1

    :cond_4
    add-int/lit8 v4, v4, 0x2

    goto :goto_0

    :cond_5
    move v4, v6

    :cond_6
    if-nez v4, :cond_0

    .line 2760
    iget-wide v2, p0, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    return v5
.end method

.method public isShutdown()Z
    .locals 2

    .line 3018
    iget v0, p0, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isTerminated()Z
    .locals 2

    .line 2991
    iget v0, p0, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected newTaskFor(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/RunnableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Ljava/util/concurrent/RunnableFuture<",
            "TT;>;"
        }
    .end annotation

    .line 3296
    new-instance v0, Ljava9/util/concurrent/ForkJoinTask$AdaptedRunnable;

    invoke-direct {v0, p1, p2}, Ljava9/util/concurrent/ForkJoinTask$AdaptedRunnable;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    return-object v0
.end method

.method protected newTaskFor(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/RunnableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Ljava/util/concurrent/RunnableFuture<",
            "TT;>;"
        }
    .end annotation

    .line 3300
    new-instance v0, Ljava9/util/concurrent/ForkJoinTask$AdaptedCallable;

    invoke-direct {v0, p1}, Ljava9/util/concurrent/ForkJoinTask$AdaptedCallable;-><init>(Ljava/util/concurrent/Callable;)V

    return-object v0
.end method

.method final registerWorker(Ljava9/util/concurrent/ForkJoinWorkerThread;)Ljava9/util/concurrent/ForkJoinPool$WorkQueue;
    .locals 14

    const/4 v0, 0x1

    .line 1429
    invoke-virtual {p1, v0}, Ljava9/util/concurrent/ForkJoinWorkerThread;->setDaemon(Z)V

    .line 1430
    iget-object v1, p0, Ljava9/util/concurrent/ForkJoinPool;->ueh:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v1, :cond_0

    .line 1431
    invoke-virtual {p1, v1}, Ljava9/util/concurrent/ForkJoinWorkerThread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 1432
    :cond_0
    new-instance v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    invoke-direct {v1, p0, p1}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;-><init>(Ljava9/util/concurrent/ForkJoinPool;Ljava9/util/concurrent/ForkJoinWorkerThread;)V

    .line 1434
    iget v2, p0, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    const/high16 v3, 0x10000

    and-int/2addr v2, v3

    .line 1435
    iget-object v3, p0, Ljava9/util/concurrent/ForkJoinPool;->workerNamePrefix:Ljava/lang/String;

    if-eqz v3, :cond_9

    .line 1437
    monitor-enter v3

    .line 1438
    :try_start_0
    iget-object v4, p0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    .line 1439
    iget v5, p0, Ljava9/util/concurrent/ForkJoinPool;->indexSeed:I

    const v6, -0x61c88647

    add-int/2addr v5, v6

    iput v5, p0, Ljava9/util/concurrent/ForkJoinPool;->indexSeed:I

    const/4 v6, 0x0

    if-eqz v4, :cond_8

    .line 1440
    array-length v7, v4

    if-le v7, v0, :cond_8

    add-int/lit8 v8, v7, -0x1

    and-int v9, v5, v8

    shl-int/lit8 v10, v5, 0x1

    or-int/2addr v10, v0

    and-int/2addr v10, v8

    ushr-int/lit8 v11, v7, 0x1

    .line 1446
    :goto_0
    aget-object v12, v4, v10

    if-eqz v12, :cond_3

    iget v12, v12, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    const/high16 v13, 0x40000000    # 2.0f

    if-ne v12, v13, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v11, v11, -0x1

    if-nez v11, :cond_2

    or-int/lit8 v10, v7, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v10, v10, 0x2

    and-int/2addr v10, v8

    goto :goto_0

    :cond_3
    :goto_1
    or-int/2addr v2, v10

    const/high16 v8, 0x3ffe0000    # 1.984375f

    and-int/2addr v5, v8

    or-int/2addr v2, v5

    .line 1457
    iput v2, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    iput v2, v1, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    if-ge v10, v7, :cond_4

    .line 1460
    aput-object v1, v4, v10

    goto :goto_4

    :cond_4
    shl-int/lit8 v2, v7, 0x1

    .line 1463
    new-array v5, v2, [Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    .line 1464
    aput-object v1, v5, v10

    sub-int/2addr v2, v0

    :goto_2
    if-ge v6, v7, :cond_7

    .line 1468
    aget-object v0, v4, v6

    if-eqz v0, :cond_5

    .line 1469
    iget v8, v0, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    and-int/2addr v8, v2

    and-int/lit8 v8, v8, 0x7e

    aput-object v0, v5, v8

    :cond_5
    add-int/lit8 v6, v6, 0x1

    if-lt v6, v7, :cond_6

    goto :goto_3

    .line 1472
    :cond_6
    aget-object v0, v4, v6

    aput-object v0, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 1474
    :cond_7
    :goto_3
    iput-object v5, p0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    :goto_4
    move v6, v9

    .line 1477
    :cond_8
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1478
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava9/util/concurrent/ForkJoinWorkerThread;->setName(Ljava/lang/String;)V

    goto :goto_5

    :catchall_0
    move-exception p1

    .line 1477
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_9
    :goto_5
    return-object v1
.end method

.method final runWorker(Ljava9/util/concurrent/ForkJoinPool$WorkQueue;)V
    .locals 23

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    .line 1655
    invoke-virtual/range {p1 .. p1}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->growArray()[Ljava9/util/concurrent/ForkJoinTask;

    .line 1656
    iget v0, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    invoke-static {}, Ljava9/util/concurrent/TLRandom;->nextSecondarySeed()I

    move-result v1

    xor-int/2addr v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    const/4 v1, 0x0

    .line 1660
    :goto_0
    iget-object v2, v8, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    if-eqz v2, :cond_14

    .line 1662
    array-length v3, v2

    add-int/lit8 v4, v3, -0x1

    move v12, v0

    move v5, v1

    move v0, v3

    const/4 v1, 0x0

    :goto_1
    if-lez v0, :cond_7

    and-int v7, v12, v4

    if-ltz v7, :cond_5

    if-ge v7, v3, :cond_5

    .line 1664
    aget-object v7, v2, v7

    if-eqz v7, :cond_5

    iget v13, v7, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    iget v14, v7, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->top:I

    sub-int v14, v13, v14

    if-gez v14, :cond_5

    iget-object v14, v7, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->array:[Ljava9/util/concurrent/ForkJoinTask;

    if-eqz v14, :cond_5

    array-length v15, v14

    if-lez v15, :cond_5

    .line 1667
    iget v1, v7, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    add-int/lit8 v15, v15, -0x1

    and-int/2addr v15, v13

    move/from16 v21, v12

    int-to-long v11, v15

    .line 1669
    sget v15, Ljava9/util/concurrent/ForkJoinPool;->ASHIFT:I

    shl-long/2addr v11, v15

    sget v15, Ljava9/util/concurrent/ForkJoinPool;->ABASE:I

    move-object/from16 v22, v7

    int-to-long v6, v15

    add-long/2addr v6, v11

    .line 1670
    sget-object v11, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    .line 1671
    invoke-virtual {v11, v14, v6, v7}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava9/util/concurrent/ForkJoinTask;

    if-eqz v11, :cond_3

    add-int/lit8 v12, v13, 0x1

    move-object/from16 v15, v22

    .line 1672
    iget v10, v15, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    if-ne v13, v10, :cond_3

    sget-object v10, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    const/16 v20, 0x0

    move-object v13, v15

    move-object v15, v10

    move-object/from16 v16, v14

    move-wide/from16 v17, v6

    move-object/from16 v19, v11

    .line 1673
    invoke-virtual/range {v15 .. v20}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 1674
    iput v12, v13, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->base:I

    iget v6, v13, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->top:I

    sub-int/2addr v12, v6

    if-gez v12, :cond_1

    if-eq v1, v5, :cond_1

    .line 1675
    invoke-virtual/range {p0 .. p0}, Ljava9/util/concurrent/ForkJoinPool;->signalWork()V

    .line 1676
    :cond_1
    iput v1, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    .line 1677
    invoke-virtual {v11}, Ljava9/util/concurrent/ForkJoinTask;->doExec()I

    .line 1678
    iget v5, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->id:I

    const/high16 v6, 0x10000

    and-int/2addr v5, v6

    const/16 v6, 0x400

    if-eqz v5, :cond_2

    .line 1679
    invoke-virtual {v9, v6}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->localPollAndExec(I)V

    goto :goto_2

    .line 1681
    :cond_2
    invoke-virtual {v9, v6}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->localPopAndExec(I)V

    .line 1682
    :goto_2
    iget-object v5, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->owner:Ljava9/util/concurrent/ForkJoinWorkerThread;

    .line 1683
    iget v6, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->nsteals:I

    const/4 v7, 0x1

    add-int/2addr v6, v7

    iput v6, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->nsteals:I

    const/4 v6, 0x0

    .line 1684
    iput v6, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    if-eqz v5, :cond_4

    .line 1686
    invoke-virtual {v5}, Ljava9/util/concurrent/ForkJoinWorkerThread;->afterTopLevelExec()V

    goto :goto_3

    :cond_3
    move v1, v5

    :cond_4
    :goto_3
    move v5, v1

    move/from16 v12, v21

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    move/from16 v21, v12

    if-eqz v1, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v12, v21, 0x1

    :goto_4
    add-int/lit8 v0, v0, -0x1

    goto/16 :goto_1

    :cond_7
    move/from16 v21, v12

    :goto_5
    if-eqz v1, :cond_8

    shl-int/lit8 v0, v21, 0xd

    xor-int v0, v21, v0

    ushr-int/lit8 v1, v0, 0x11

    xor-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    xor-int/2addr v0, v1

    move v1, v5

    goto/16 :goto_0

    .line 1702
    :cond_8
    iget v10, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    const-wide v11, 0xffffffffL

    const-wide v13, -0x100000000L

    if-ltz v10, :cond_a

    const/high16 v0, 0x10000

    add-int/2addr v10, v0

    const/high16 v0, -0x80000000

    or-int v15, v10, v0

    .line 1703
    iput v15, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    .line 1706
    :cond_9
    iget-wide v4, v8, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    long-to-int v0, v4

    iput v0, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->stackPred:I

    const-wide/high16 v0, 0x1000000000000L

    sub-long v0, v4, v0

    and-long/2addr v0, v13

    int-to-long v2, v15

    and-long/2addr v2, v11

    or-long v6, v0, v2

    .line 1708
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    sget-wide v2, Ljava9/util/concurrent/ForkJoinPool;->CTL:J

    move-object/from16 v1, p0

    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_7

    .line 1711
    :cond_a
    iget v15, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->stackPred:I

    const/high16 v0, -0x40000000    # -2.0f

    .line 1712
    iput v0, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    const/4 v0, 0x0

    .line 1715
    :goto_6
    iget v1, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    if-ltz v1, :cond_b

    const/4 v1, 0x0

    .line 1716
    iput v1, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    :goto_7
    move/from16 v0, v21

    const/4 v1, 0x0

    goto/16 :goto_0

    .line 1719
    :cond_b
    iget v1, v8, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    if-gez v1, :cond_c

    return-void

    :cond_c
    const v2, 0xffff

    and-int/2addr v2, v1

    .line 1721
    iget-wide v4, v8, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    const/16 v3, 0x30

    shr-long v6, v4, v3

    long-to-int v3, v6

    add-int/2addr v2, v3

    if-gtz v2, :cond_e

    const/high16 v3, 0x40000

    and-int/2addr v1, v3

    if-eqz v1, :cond_e

    const/4 v6, 0x0

    .line 1724
    invoke-direct {v8, v6, v6}, Ljava9/util/concurrent/ForkJoinPool;->tryTerminate(ZZ)Z

    move-result v1

    if-eqz v1, :cond_d

    return-void

    :cond_d
    const/16 v16, 0x1

    goto :goto_8

    :cond_e
    const/4 v6, 0x0

    const/16 v16, 0x1

    :goto_8
    add-int/lit8 v17, v0, 0x1

    and-int/lit8 v0, v17, 0x1

    if-nez v0, :cond_f

    .line 1727
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    const/16 v20, 0x0

    goto :goto_9

    :cond_f
    if-gtz v2, :cond_12

    if-eqz v15, :cond_12

    long-to-int v0, v4

    if-ne v10, v0, :cond_12

    .line 1729
    iget-wide v0, v8, Ljava9/util/concurrent/ForkJoinPool;->keepAlive:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v0, v2

    .line 1730
    invoke-static {v8, v0, v1}, Ljava/util/concurrent/locks/LockSupport;->parkUntil(Ljava/lang/Object;J)V

    .line 1731
    iget-wide v2, v8, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    cmp-long v7, v2, v4

    if-nez v7, :cond_11

    .line 1732
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x14

    cmp-long v7, v0, v2

    if-gtz v7, :cond_10

    const-wide v0, 0x100000000L

    sub-long v0, v4, v0

    and-long/2addr v0, v13

    int-to-long v2, v15

    and-long/2addr v2, v11

    or-long v18, v0, v2

    .line 1735
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    sget-wide v2, Ljava9/util/concurrent/ForkJoinPool;->CTL:J

    move-object/from16 v1, p0

    const/16 v20, 0x0

    move-wide/from16 v6, v18

    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v0

    if-eqz v0, :cond_13

    const/high16 v0, 0x40000000    # 2.0f

    .line 1736
    iput v0, v9, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    return-void

    :cond_10
    const/16 v20, 0x0

    goto :goto_9

    :cond_11
    const/16 v20, 0x0

    goto :goto_9

    :cond_12
    const/16 v20, 0x0

    .line 1742
    invoke-static/range {p0 .. p0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    :cond_13
    :goto_9
    move/from16 v0, v17

    goto/16 :goto_6

    :cond_14
    return-void
.end method

.method public shutdown()V
    .locals 2

    .line 2957
    invoke-static {}, Ljava9/util/concurrent/ForkJoinPool;->checkPermission()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 2958
    invoke-direct {p0, v0, v1}, Ljava9/util/concurrent/ForkJoinPool;->tryTerminate(ZZ)Z

    return-void
.end method

.method public shutdownNow()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    .line 2980
    invoke-static {}, Ljava9/util/concurrent/ForkJoinPool;->checkPermission()V

    const/4 v0, 0x1

    .line 2981
    invoke-direct {p0, v0, v0}, Ljava9/util/concurrent/ForkJoinPool;->tryTerminate(ZZ)Z

    .line 2982
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method final signalWork()V
    .locals 14

    .line 1536
    :cond_0
    iget-wide v4, p0, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    const-wide/16 v0, 0x0

    cmp-long v2, v4, v0

    if-ltz v2, :cond_1

    goto :goto_0

    :cond_1
    long-to-int v2, v4

    if-nez v2, :cond_2

    const-wide v2, 0x800000000000L

    and-long/2addr v2, v4

    cmp-long v6, v2, v0

    if-eqz v6, :cond_6

    .line 1540
    invoke-direct {p0, v4, v5}, Ljava9/util/concurrent/ForkJoinPool;->tryAddWorker(J)V

    goto :goto_0

    .line 1543
    :cond_2
    iget-object v0, p0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    if-nez v0, :cond_3

    goto :goto_0

    .line 1545
    :cond_3
    array-length v1, v0

    const v3, 0xffff

    and-int/2addr v3, v2

    if-gt v1, v3, :cond_4

    goto :goto_0

    .line 1547
    :cond_4
    aget-object v8, v0, v3

    if-nez v8, :cond_5

    goto :goto_0

    :cond_5
    const v0, 0x7fffffff

    and-int v9, v2, v0

    .line 1551
    iget v0, v8, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    .line 1552
    iget v1, v8, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->stackPred:I

    int-to-long v6, v1

    const-wide v10, 0xffffffffL

    and-long/2addr v6, v10

    const-wide v10, -0x100000000L

    const-wide/high16 v12, 0x1000000000000L

    add-long/2addr v12, v4

    and-long/2addr v10, v12

    or-long/2addr v6, v10

    .line 1553
    iget-object v10, v8, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->owner:Ljava9/util/concurrent/ForkJoinWorkerThread;

    if-ne v2, v0, :cond_0

    .line 1554
    sget-object v0, Ljava9/util/concurrent/ForkJoinPool;->U:Lsun/misc/Unsafe;

    sget-wide v2, Ljava9/util/concurrent/ForkJoinPool;->CTL:J

    move-object v1, p0

    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1555
    iput v9, v8, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->phase:I

    .line 1556
    iget v0, v8, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->source:I

    if-gez v0, :cond_6

    .line 1557
    invoke-static {v10}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public bridge synthetic submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 0

    .line 158
    invoke-virtual {p0, p1}, Ljava9/util/concurrent/ForkJoinPool;->submit(Ljava/lang/Runnable;)Ljava9/util/concurrent/ForkJoinTask;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    .locals 0

    .line 158
    invoke-virtual {p0, p1, p2}, Ljava9/util/concurrent/ForkJoinPool;->submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava9/util/concurrent/ForkJoinTask;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 0

    .line 158
    invoke-virtual {p0, p1}, Ljava9/util/concurrent/ForkJoinPool;->submit(Ljava/util/concurrent/Callable;)Ljava9/util/concurrent/ForkJoinTask;

    move-result-object p1

    return-object p1
.end method

.method public submit(Ljava/lang/Runnable;)Ljava9/util/concurrent/ForkJoinTask;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Ljava9/util/concurrent/ForkJoinTask<",
            "*>;"
        }
    .end annotation

    .line 2603
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2604
    instance-of v0, p1, Ljava9/util/concurrent/ForkJoinTask;

    if-eqz v0, :cond_0

    check-cast p1, Ljava9/util/concurrent/ForkJoinTask;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava9/util/concurrent/ForkJoinTask$AdaptedRunnableAction;

    invoke-direct {v0, p1}, Ljava9/util/concurrent/ForkJoinTask$AdaptedRunnableAction;-><init>(Ljava/lang/Runnable;)V

    move-object p1, v0

    :goto_0
    invoke-direct {p0, p1}, Ljava9/util/concurrent/ForkJoinPool;->externalSubmit(Ljava9/util/concurrent/ForkJoinTask;)Ljava9/util/concurrent/ForkJoinTask;

    move-result-object p1

    return-object p1
.end method

.method public submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava9/util/concurrent/ForkJoinTask;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Ljava9/util/concurrent/ForkJoinTask<",
            "TT;>;"
        }
    .end annotation

    .line 2593
    new-instance v0, Ljava9/util/concurrent/ForkJoinTask$AdaptedRunnable;

    invoke-direct {v0, p1, p2}, Ljava9/util/concurrent/ForkJoinTask$AdaptedRunnable;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Ljava9/util/concurrent/ForkJoinPool;->externalSubmit(Ljava9/util/concurrent/ForkJoinTask;)Ljava9/util/concurrent/ForkJoinTask;

    move-result-object p1

    return-object p1
.end method

.method public submit(Ljava/util/concurrent/Callable;)Ljava9/util/concurrent/ForkJoinTask;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Ljava9/util/concurrent/ForkJoinTask<",
            "TT;>;"
        }
    .end annotation

    .line 2584
    new-instance v0, Ljava9/util/concurrent/ForkJoinTask$AdaptedCallable;

    invoke-direct {v0, p1}, Ljava9/util/concurrent/ForkJoinTask$AdaptedCallable;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-direct {p0, v0}, Ljava9/util/concurrent/ForkJoinPool;->externalSubmit(Ljava9/util/concurrent/ForkJoinTask;)Ljava9/util/concurrent/ForkJoinTask;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    .line 2901
    iget-wide v0, p0, Ljava9/util/concurrent/ForkJoinPool;->stealCount:J

    .line 2903
    iget-object v2, p0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    move-wide v8, v0

    move-wide v6, v3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2904
    :goto_0
    array-length v10, v2

    if-ge v0, v10, :cond_3

    .line 2905
    aget-object v10, v2, v0

    if-eqz v10, :cond_1

    .line 2906
    invoke-virtual {v10}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->queueSize()I

    move-result v11

    and-int/lit8 v12, v0, 0x1

    if-nez v12, :cond_0

    int-to-long v10, v11

    add-long/2addr v6, v10

    goto :goto_1

    :cond_0
    int-to-long v11, v11

    add-long/2addr v3, v11

    .line 2911
    iget v11, v10, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->nsteals:I

    int-to-long v11, v11

    const-wide v13, 0xffffffffL

    and-long/2addr v11, v13

    add-long/2addr v8, v11

    .line 2912
    invoke-virtual {v10}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->isApparentlyUnblocked()Z

    move-result v10

    if-eqz v10, :cond_1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move-wide v8, v0

    move-wide v6, v3

    const/4 v1, 0x0

    .line 2919
    :cond_3
    iget v0, p0, Ljava9/util/concurrent/ForkJoinPool;->mode:I

    const v2, 0xffff

    and-int/2addr v2, v0

    .line 2921
    iget-wide v10, p0, Ljava9/util/concurrent/ForkJoinPool;->ctl:J

    const/16 v12, 0x20

    ushr-long v12, v10, v12

    long-to-int v13, v12

    int-to-short v12, v13

    add-int/2addr v12, v2

    const/16 v13, 0x30

    shr-long/2addr v10, v13

    long-to-int v11, v10

    add-int v10, v2, v11

    if-gez v10, :cond_4

    goto :goto_2

    :cond_4
    move v5, v10

    :goto_2
    const/high16 v10, 0x80000

    and-int/2addr v10, v0

    if-eqz v10, :cond_5

    const-string v0, "Terminated"

    goto :goto_3

    :cond_5
    const/high16 v10, -0x80000000

    and-int/2addr v10, v0

    if-eqz v10, :cond_6

    const-string v0, "Terminating"

    goto :goto_3

    :cond_6
    const/high16 v10, 0x40000

    and-int/2addr v0, v10

    if-eqz v0, :cond_7

    const-string v0, "Shutting down"

    goto :goto_3

    :cond_7
    const-string v0, "Running"

    .line 2930
    :goto_3
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "["

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", parallelism = "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", size = "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", active = "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", running = "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", steals = "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", tasks = "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", submissions = "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final tryExternalUnpush(Ljava9/util/concurrent/ForkJoinTask;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/concurrent/ForkJoinTask<",
            "*>;)Z"
        }
    .end annotation

    .line 2054
    invoke-static {}, Ljava9/util/concurrent/TLRandom;->getProbe()I

    move-result v0

    .line 2056
    iget-object v1, p0, Ljava9/util/concurrent/ForkJoinPool;->workQueues:[Ljava9/util/concurrent/ForkJoinPool$WorkQueue;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    array-length v3, v1

    if-lez v3, :cond_0

    sub-int/2addr v3, v2

    and-int/2addr v0, v3

    and-int/lit8 v0, v0, 0x7e

    aget-object v0, v1, v0

    if-eqz v0, :cond_0

    .line 2059
    invoke-virtual {v0, p1}, Ljava9/util/concurrent/ForkJoinPool$WorkQueue;->trySharedUnpush(Ljava9/util/concurrent/ForkJoinTask;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method
