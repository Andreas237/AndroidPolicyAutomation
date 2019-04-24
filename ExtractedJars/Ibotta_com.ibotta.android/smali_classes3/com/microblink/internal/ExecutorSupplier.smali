.class public final Lcom/microblink/internal/ExecutorSupplier;
.super Ljava/lang/Object;


# static fields
.field private static final DEFAULT_MAX_NUM_THREADS:I

.field private static final lock:Ljava/lang/Object;

.field private static volatile sExecutorSupplier:Lcom/microblink/internal/ExecutorSupplier;


# instance fields
.field private final main:Ljava/util/concurrent/Executor;

.field private final network:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/microblink/internal/ExecutorSupplier;->DEFAULT_MAX_NUM_THREADS:I

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/microblink/internal/ExecutorSupplier;->lock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lcom/microblink/internal/PriorityThreadFactory;

    const/16 v0, 0xa

    invoke-direct {v6, v0}, Lcom/microblink/internal/PriorityThreadFactory;-><init>(I)V

    new-instance v7, Lcom/microblink/internal/PriorityThreadPoolExecutor;

    sget v2, Lcom/microblink/internal/ExecutorSupplier;->DEFAULT_MAX_NUM_THREADS:I

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x0

    move-object v0, v7

    move v1, v2

    invoke-direct/range {v0 .. v6}, Lcom/microblink/internal/PriorityThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v7, p0, Lcom/microblink/internal/ExecutorSupplier;->network:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v0, Lcom/microblink/internal/MainThreadExecutor;

    invoke-direct {v0}, Lcom/microblink/internal/MainThreadExecutor;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/ExecutorSupplier;->main:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static getInstance()Lcom/microblink/internal/ExecutorSupplier;
    .locals 2

    sget-object v0, Lcom/microblink/internal/ExecutorSupplier;->sExecutorSupplier:Lcom/microblink/internal/ExecutorSupplier;

    if-nez v0, :cond_1

    sget-object v1, Lcom/microblink/internal/ExecutorSupplier;->lock:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/microblink/internal/ExecutorSupplier;->sExecutorSupplier:Lcom/microblink/internal/ExecutorSupplier;

    if-nez v0, :cond_0

    new-instance v0, Lcom/microblink/internal/ExecutorSupplier;

    invoke-direct {v0}, Lcom/microblink/internal/ExecutorSupplier;-><init>()V

    sput-object v0, Lcom/microblink/internal/ExecutorSupplier;->sExecutorSupplier:Lcom/microblink/internal/ExecutorSupplier;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method


# virtual methods
.method public final main()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/ExecutorSupplier;->main:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final network()Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/ExecutorSupplier;->network:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method
