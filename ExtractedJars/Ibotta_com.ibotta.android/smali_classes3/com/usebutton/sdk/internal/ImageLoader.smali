.class public Lcom/usebutton/sdk/internal/ImageLoader;
.super Ljava/lang/Object;
.source "ImageLoader.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final CPU_COUNT:I

.field private static final TAG:Ljava/lang/String; = "ImageLoader"

.field private static final THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;


# instance fields
.field private final mCacheChain:Lcom/usebutton/sdk/internal/util/MemoryLink;

.field private final mHttp:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/usebutton/sdk/internal/api/Http;",
            ">;"
        }
    .end annotation
.end field

.field private final mTargetToTaskMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/widget/ImageView;",
            "Ljava/util/Set<",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/os/AsyncTask;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 34
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Lcom/usebutton/sdk/internal/ImageLoader;->CPU_COUNT:I

    .line 36
    sget v0, Lcom/usebutton/sdk/internal/ImageLoader;->CPU_COUNT:I

    const/4 v1, 0x3

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-instance v1, Lcom/usebutton/sdk/internal/util/ButtonThreadFactory;

    const-string v2, "ImageLoader"

    invoke-direct {v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonThreadFactory;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/usebutton/sdk/internal/ImageLoader;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/functional/Getter;Lcom/usebutton/sdk/internal/api/Http;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/usebutton/sdk/internal/functional/Getter<",
            "Lcom/usebutton/sdk/internal/models/Configuration;",
            ">;",
            "Lcom/usebutton/sdk/internal/api/Http;",
            ")V"
        }
    .end annotation

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/ImageLoader;->mTargetToTaskMap:Ljava/util/Map;

    .line 42
    new-instance v0, Lcom/usebutton/sdk/internal/ImageLoader$1;

    invoke-direct {v0, p0, p3}, Lcom/usebutton/sdk/internal/ImageLoader$1;-><init>(Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/api/Http;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/ImageLoader;->mHttp:Ljava/lang/ThreadLocal;

    .line 48
    new-instance p3, Lcom/usebutton/sdk/internal/util/DiskLink;

    invoke-direct {p3, p1, p2}, Lcom/usebutton/sdk/internal/util/DiskLink;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/functional/Getter;)V

    .line 49
    new-instance p1, Lcom/usebutton/sdk/internal/util/MemoryLink;

    invoke-direct {p1, p2, p3}, Lcom/usebutton/sdk/internal/util/MemoryLink;-><init>(Lcom/usebutton/sdk/internal/functional/Getter;Lcom/usebutton/sdk/internal/util/ResourceLink;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/ImageLoader;->mCacheChain:Lcom/usebutton/sdk/internal/util/MemoryLink;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/ImageLoader;Landroid/widget/ImageView;Landroid/os/AsyncTask;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/ImageLoader;->remove(Landroid/widget/ImageView;Landroid/os/AsyncTask;)V

    return-void
.end method

.method private declared-synchronized put(Landroid/widget/ImageView;Landroid/os/AsyncTask;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            "Landroid/os/AsyncTask<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 110
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ImageLoader;->mTargetToTaskMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    .line 112
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 113
    iget-object v1, p0, Lcom/usebutton/sdk/internal/ImageLoader;->mTargetToTaskMap:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    :cond_0
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized remove(Landroid/widget/ImageView;Landroid/os/AsyncTask;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            "Landroid/os/AsyncTask<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 119
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ImageLoader;->mTargetToTaskMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 120
    monitor-exit p0

    return-void

    .line 121
    :cond_0
    :try_start_1
    invoke-interface {p1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public execute(Landroid/os/AsyncTask;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/AsyncTask<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .line 143
    sget-object v0, Lcom/usebutton/sdk/internal/ImageLoader;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    instance-of v2, p1, Landroid/os/AsyncTask;

    if-nez v2, :cond_0

    invoke-virtual {p1, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/os/AsyncTask;

    invoke-static {p1, v0, v1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->executeOnExecutor(Landroid/os/AsyncTask;Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method public getImageData(Landroid/net/Uri;)[B
    .locals 4
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ImageLoader;->mCacheChain:Lcom/usebutton/sdk/internal/util/MemoryLink;

    monitor-enter v0

    .line 97
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/ImageLoader;->mCacheChain:Lcom/usebutton/sdk/internal/util/MemoryLink;

    invoke-virtual {v1, p1}, Lcom/usebutton/sdk/internal/util/MemoryLink;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/util/Data;

    .line 98
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    .line 100
    iget-object p1, v1, Lcom/usebutton/sdk/internal/util/Data;->mData:[B

    return-object p1

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ImageLoader;->mHttp:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/api/Http;

    new-instance v1, Lcom/usebutton/sdk/internal/api/Request$Get;

    invoke-direct {v1, p1}, Lcom/usebutton/sdk/internal/api/Request$Get;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/api/Http;->requestBitmapData(Lcom/usebutton/sdk/internal/api/Request;)[B

    move-result-object v0

    .line 103
    iget-object v1, p0, Lcom/usebutton/sdk/internal/ImageLoader;->mCacheChain:Lcom/usebutton/sdk/internal/util/MemoryLink;

    monitor-enter v1

    .line 104
    :try_start_1
    iget-object v2, p0, Lcom/usebutton/sdk/internal/ImageLoader;->mCacheChain:Lcom/usebutton/sdk/internal/util/MemoryLink;

    new-instance v3, Lcom/usebutton/sdk/internal/util/Data;

    invoke-direct {v3, v0}, Lcom/usebutton/sdk/internal/util/Data;-><init>([B)V

    invoke-virtual {v2, p1, v3}, Lcom/usebutton/sdk/internal/util/MemoryLink;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 98
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public load(Landroid/net/Uri;Landroid/widget/ImageView;)Landroid/os/AsyncTask;
    .locals 8

    .line 53
    invoke-virtual {p2}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    invoke-virtual {p2}, Landroid/widget/ImageView;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p2}, Landroid/widget/ImageView;->getPaddingRight()I

    move-result v1

    sub-int v5, v0, v1

    .line 54
    invoke-virtual {p2}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    invoke-virtual {p2}, Landroid/widget/ImageView;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p2}, Landroid/widget/ImageView;->getPaddingBottom()I

    move-result v1

    sub-int v6, v0, v1

    .line 55
    new-instance v7, Ljava/lang/ref/WeakReference;

    invoke-direct {v7, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 56
    new-instance v0, Lcom/usebutton/sdk/internal/ImageLoader$2;

    move-object v2, v0

    move-object v3, p0

    move-object v4, p1

    invoke-direct/range {v2 .. v7}, Lcom/usebutton/sdk/internal/ImageLoader$2;-><init>(Lcom/usebutton/sdk/internal/ImageLoader;Landroid/net/Uri;IILjava/lang/ref/WeakReference;)V

    .line 81
    invoke-direct {p0, p2, v0}, Lcom/usebutton/sdk/internal/ImageLoader;->put(Landroid/widget/ImageView;Landroid/os/AsyncTask;)V

    .line 82
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/ImageLoader;->execute(Landroid/os/AsyncTask;)V

    return-object v0
.end method

.method public declared-synchronized stop(Landroid/widget/ImageView;)V
    .locals 4

    monitor-enter p0

    .line 128
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ImageLoader;->mTargetToTaskMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 129
    monitor-exit p0

    return-void

    .line 130
    :cond_0
    :try_start_1
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 131
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 132
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/AsyncTask;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/os/AsyncTask;->cancel(Z)Z

    goto :goto_0

    .line 135
    :cond_2
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 136
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ImageLoader;->mTargetToTaskMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 137
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
