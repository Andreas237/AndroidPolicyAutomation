.class public Lcom/ibotta/android/service/api/DebugLoadingUtil;
.super Ljava/lang/Object;
.source "DebugLoadingUtil.java"


# static fields
.field private static final apiJobs:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation
.end field

.field private static lock:Ljava/util/concurrent/locks/Lock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/ibotta/android/service/api/DebugLoadingUtil;->lock:Ljava/util/concurrent/locks/Lock;

    .line 21
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/ibotta/android/service/api/DebugLoadingUtil;->apiJobs:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 24
    sget-object v0, Lcom/ibotta/android/service/api/DebugLoadingUtil;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 26
    :try_start_0
    sget-object v0, Lcom/ibotta/android/service/api/DebugLoadingUtil;->apiJobs:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 27
    invoke-static {}, Lcom/ibotta/android/service/api/DebugLoadingUtil;->broadcastStatus()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    sget-object p0, Lcom/ibotta/android/service/api/DebugLoadingUtil;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p0

    sget-object v0, Lcom/ibotta/android/service/api/DebugLoadingUtil;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p0
.end method

.method private static broadcastStatus()V
    .locals 4

    .line 44
    sget-object v0, Lcom/ibotta/android/service/api/DebugLoadingUtil;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    const-string v0, "Jobs remaining: %1$d"

    const/4 v1, 0x1

    .line 46
    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lcom/ibotta/android/service/api/DebugLoadingUtil;->apiJobs:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    sget-object v0, Lcom/ibotta/android/service/api/DebugLoadingUtil;->apiJobs:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    .line 50
    sget-object v1, Lcom/ibotta/android/service/api/DebugLoadingUtil;->apiJobs:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 51
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/service/api/job/ApiJob;

    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 57
    :cond_0
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/service/api/DebugLoadingUtil$1;

    invoke-direct {v2, v0}, Lcom/ibotta/android/service/api/DebugLoadingUtil$1;-><init>([Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    sget-object v0, Lcom/ibotta/android/service/api/DebugLoadingUtil;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/ibotta/android/service/api/DebugLoadingUtil;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public static removeApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 34
    sget-object v0, Lcom/ibotta/android/service/api/DebugLoadingUtil;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 36
    :try_start_0
    sget-object v0, Lcom/ibotta/android/service/api/DebugLoadingUtil;->apiJobs:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 37
    invoke-static {}, Lcom/ibotta/android/service/api/DebugLoadingUtil;->broadcastStatus()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    sget-object p0, Lcom/ibotta/android/service/api/DebugLoadingUtil;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p0

    sget-object v0, Lcom/ibotta/android/service/api/DebugLoadingUtil;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p0
.end method
