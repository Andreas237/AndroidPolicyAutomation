.class public final Lrx/internal/schedulers/GenericScheduledExecutorService;
.super Ljava/lang/Object;
.source "GenericScheduledExecutorService.java"

# interfaces
.implements Lrx/internal/schedulers/SchedulerLifecycle;


# static fields
.field public static final INSTANCE:Lrx/internal/schedulers/GenericScheduledExecutorService;

.field private static final NONE:[Ljava/util/concurrent/ScheduledExecutorService;

.field private static final SHUTDOWN:Ljava/util/concurrent/ScheduledExecutorService;

.field private static final THREAD_FACTORY:Lrx/internal/util/RxThreadFactory;

.field private static final THREAD_NAME_PREFIX:Ljava/lang/String; = "RxScheduledExecutorPool-"

.field private static roundRobin:I


# instance fields
.field private final executor:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<[",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 37
    new-instance v0, Lrx/internal/util/RxThreadFactory;

    const-string v1, "RxScheduledExecutorPool-"

    invoke-direct {v0, v1}, Lrx/internal/util/RxThreadFactory;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrx/internal/schedulers/GenericScheduledExecutorService;->THREAD_FACTORY:Lrx/internal/util/RxThreadFactory;

    .line 39
    new-array v0, v2, [Ljava/util/concurrent/ScheduledExecutorService;

    sput-object v0, Lrx/internal/schedulers/GenericScheduledExecutorService;->NONE:[Ljava/util/concurrent/ScheduledExecutorService;

    .line 43
    invoke-static {v2}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lrx/internal/schedulers/GenericScheduledExecutorService;->SHUTDOWN:Ljava/util/concurrent/ScheduledExecutorService;

    .line 44
    sget-object v0, Lrx/internal/schedulers/GenericScheduledExecutorService;->SHUTDOWN:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 48
    new-instance v0, Lrx/internal/schedulers/GenericScheduledExecutorService;

    invoke-direct {v0}, Lrx/internal/schedulers/GenericScheduledExecutorService;-><init>()V

    sput-object v0, Lrx/internal/schedulers/GenericScheduledExecutorService;->INSTANCE:Lrx/internal/schedulers/GenericScheduledExecutorService;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lrx/internal/schedulers/GenericScheduledExecutorService;->NONE:[Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lrx/internal/schedulers/GenericScheduledExecutorService;->executor:Ljava/util/concurrent/atomic/AtomicReference;

    .line 57
    invoke-virtual {p0}, Lrx/internal/schedulers/GenericScheduledExecutorService;->start()V

    .line 58
    return-void
.end method

.method public static getInstance()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 3

    .prologue
    .line 116
    sget-object v2, Lrx/internal/schedulers/GenericScheduledExecutorService;->INSTANCE:Lrx/internal/schedulers/GenericScheduledExecutorService;

    iget-object v2, v2, Lrx/internal/schedulers/GenericScheduledExecutorService;->executor:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/util/concurrent/ScheduledExecutorService;

    .line 117
    .local v0, "execs":[Ljava/util/concurrent/ScheduledExecutorService;
    sget-object v2, Lrx/internal/schedulers/GenericScheduledExecutorService;->NONE:[Ljava/util/concurrent/ScheduledExecutorService;

    if-ne v0, v2, :cond_0

    .line 118
    sget-object v2, Lrx/internal/schedulers/GenericScheduledExecutorService;->SHUTDOWN:Ljava/util/concurrent/ScheduledExecutorService;

    .line 125
    :goto_0
    return-object v2

    .line 120
    :cond_0
    sget v2, Lrx/internal/schedulers/GenericScheduledExecutorService;->roundRobin:I

    add-int/lit8 v1, v2, 0x1

    .line 121
    .local v1, "r":I
    array-length v2, v0

    if-lt v1, v2, :cond_1

    .line 122
    const/4 v1, 0x0

    .line 124
    :cond_1
    sput v1, Lrx/internal/schedulers/GenericScheduledExecutorService;->roundRobin:I

    .line 125
    aget-object v2, v0, v1

    goto :goto_0
.end method


# virtual methods
.method public shutdown()V
    .locals 7

    .prologue
    .line 96
    :cond_0
    iget-object v5, p0, Lrx/internal/schedulers/GenericScheduledExecutorService;->executor:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/util/concurrent/ScheduledExecutorService;

    .line 97
    .local v2, "execs":[Ljava/util/concurrent/ScheduledExecutorService;
    sget-object v5, Lrx/internal/schedulers/GenericScheduledExecutorService;->NONE:[Ljava/util/concurrent/ScheduledExecutorService;

    if-ne v2, v5, :cond_2

    .line 105
    :cond_1
    return-void

    .line 100
    :cond_2
    iget-object v5, p0, Lrx/internal/schedulers/GenericScheduledExecutorService;->executor:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v6, Lrx/internal/schedulers/GenericScheduledExecutorService;->NONE:[Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {v5, v2, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 101
    move-object v0, v2

    .local v0, "arr$":[Ljava/util/concurrent/ScheduledExecutorService;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_0
    if-ge v3, v4, :cond_1

    aget-object v1, v0, v3

    .line 102
    .local v1, "exec":Ljava/util/concurrent/ScheduledExecutorService;
    invoke-static {v1}, Lrx/internal/schedulers/NewThreadWorker;->deregisterExecutor(Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 103
    invoke-interface {v1}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 101
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method public start()V
    .locals 9

    .prologue
    .line 62
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v1

    .line 63
    .local v1, "count":I
    const/4 v7, 0x4

    if-le v1, v7, :cond_0

    .line 64
    div-int/lit8 v1, v1, 0x2

    .line 67
    :cond_0
    const/16 v7, 0x8

    if-le v1, v7, :cond_1

    .line 68
    const/16 v1, 0x8

    .line 74
    :cond_1
    new-array v3, v1, [Ljava/util/concurrent/ScheduledExecutorService;

    .line 75
    .local v3, "execs":[Ljava/util/concurrent/ScheduledExecutorService;
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    if-ge v4, v1, :cond_2

    .line 76
    const/4 v7, 0x1

    sget-object v8, Lrx/internal/schedulers/GenericScheduledExecutorService;->THREAD_FACTORY:Lrx/internal/util/RxThreadFactory;

    invoke-static {v7, v8}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v7

    aput-object v7, v3, v4

    .line 75
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 78
    :cond_2
    iget-object v7, p0, Lrx/internal/schedulers/GenericScheduledExecutorService;->executor:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v8, Lrx/internal/schedulers/GenericScheduledExecutorService;->NONE:[Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {v7, v8, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 79
    move-object v0, v3

    .local v0, "arr$":[Ljava/util/concurrent/ScheduledExecutorService;
    array-length v6, v0

    .local v6, "len$":I
    const/4 v5, 0x0

    .local v5, "i$":I
    :goto_1
    if-ge v5, v6, :cond_5

    aget-object v2, v0, v5

    .line 80
    .local v2, "exec":Ljava/util/concurrent/ScheduledExecutorService;
    invoke-static {v2}, Lrx/internal/schedulers/NewThreadWorker;->tryEnableCancelPolicy(Ljava/util/concurrent/ScheduledExecutorService;)Z

    move-result v7

    if-nez v7, :cond_3

    .line 81
    instance-of v7, v2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz v7, :cond_3

    .line 82
    check-cast v2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .end local v2    # "exec":Ljava/util/concurrent/ScheduledExecutorService;
    invoke-static {v2}, Lrx/internal/schedulers/NewThreadWorker;->registerExecutor(Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V

    .line 79
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 87
    .end local v0    # "arr$":[Ljava/util/concurrent/ScheduledExecutorService;
    .end local v5    # "i$":I
    .end local v6    # "len$":I
    :cond_4
    move-object v0, v3

    .restart local v0    # "arr$":[Ljava/util/concurrent/ScheduledExecutorService;
    array-length v6, v0

    .restart local v6    # "len$":I
    const/4 v5, 0x0

    .restart local v5    # "i$":I
    :goto_2
    if-ge v5, v6, :cond_5

    aget-object v2, v0, v5

    .line 88
    .restart local v2    # "exec":Ljava/util/concurrent/ScheduledExecutorService;
    invoke-interface {v2}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 87
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 91
    .end local v2    # "exec":Ljava/util/concurrent/ScheduledExecutorService;
    :cond_5
    return-void
.end method
