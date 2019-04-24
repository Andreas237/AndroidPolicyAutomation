.class public Lcom/launchdarkly/android/Debounce;
.super Ljava/lang/Object;
.source "Debounce.java"


# instance fields
.field private volatile inFlight:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private volatile pending:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field service:Lcom/google/common/util/concurrent/ListeningExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/util/concurrent/MoreExecutors;->listeningDecorator(Ljava/util/concurrent/ExecutorService;)Lcom/google/common/util/concurrent/ListeningExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/android/Debounce;->service:Lcom/google/common/util/concurrent/ListeningExecutorService;

    return-void
.end method

.method static synthetic access$002(Lcom/launchdarkly/android/Debounce;Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/launchdarkly/android/Debounce;->inFlight:Lcom/google/common/util/concurrent/ListenableFuture;

    return-object p1
.end method

.method static synthetic access$100(Lcom/launchdarkly/android/Debounce;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/launchdarkly/android/Debounce;->schedulePending()V

    return-void
.end method

.method private declared-synchronized schedulePending()V
    .locals 3

    monitor-enter p0

    .line 26
    :try_start_0
    iget-object v0, p0, Lcom/launchdarkly/android/Debounce;->pending:Ljava/util/concurrent/Callable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 27
    monitor-exit p0

    return-void

    .line 30
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/launchdarkly/android/Debounce;->inFlight:Lcom/google/common/util/concurrent/ListenableFuture;

    if-nez v0, :cond_1

    .line 31
    iget-object v0, p0, Lcom/launchdarkly/android/Debounce;->service:Lcom/google/common/util/concurrent/ListeningExecutorService;

    iget-object v1, p0, Lcom/launchdarkly/android/Debounce;->pending:Ljava/util/concurrent/Callable;

    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/ListeningExecutorService;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/android/Debounce;->inFlight:Lcom/google/common/util/concurrent/ListenableFuture;

    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/launchdarkly/android/Debounce;->pending:Ljava/util/concurrent/Callable;

    .line 33
    iget-object v0, p0, Lcom/launchdarkly/android/Debounce;->inFlight:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance v1, Lcom/launchdarkly/android/Debounce$1;

    invoke-direct {v1, p0}, Lcom/launchdarkly/android/Debounce$1;-><init>(Lcom/launchdarkly/android/Debounce;)V

    .line 44
    invoke-static {}, Lcom/google/common/util/concurrent/MoreExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 33
    invoke-static {v0, v1, v2}, Lcom/google/common/util/concurrent/Futures;->addCallback(Lcom/google/common/util/concurrent/ListenableFuture;Lcom/google/common/util/concurrent/FutureCallback;Ljava/util/concurrent/Executor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public declared-synchronized call(Ljava/util/concurrent/Callable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 20
    :try_start_0
    iput-object p1, p0, Lcom/launchdarkly/android/Debounce;->pending:Ljava/util/concurrent/Callable;

    .line 22
    invoke-direct {p0}, Lcom/launchdarkly/android/Debounce;->schedulePending()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
