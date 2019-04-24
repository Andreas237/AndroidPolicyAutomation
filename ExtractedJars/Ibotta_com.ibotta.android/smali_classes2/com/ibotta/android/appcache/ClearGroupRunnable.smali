.class public Lcom/ibotta/android/appcache/ClearGroupRunnable;
.super Ljava/lang/Object;
.source "ClearGroupRunnable.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final clearJobs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final handler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/appcache/AppCache;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Handler;",
            "Lcom/ibotta/android/profile/BuildProfile;",
            "Lcom/ibotta/android/appcache/AppCache;",
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->context:Landroid/content/Context;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->handler:Landroid/os/Handler;

    .line 24
    iput-object p3, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 25
    iput-object p4, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 26
    iput-object p5, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->clearJobs:Ljava/util/List;

    return-void
.end method

.method private debugCacheClear(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;)V"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v0}, Lcom/ibotta/android/profile/BuildProfile;->shouldDebugCacheClearing()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 56
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Clearing caches: "

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 63
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/ibotta/android/appcache/-$$Lambda$ClearGroupRunnable$ClkO3uCgFp0yme2TdwiBG7eKaok;

    invoke-direct {v1, p0, v0}, Lcom/ibotta/android/appcache/-$$Lambda$ClearGroupRunnable$ClkO3uCgFp0yme2TdwiBG7eKaok;-><init>(Lcom/ibotta/android/appcache/ClearGroupRunnable;Ljava/lang/StringBuilder;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic lambda$debugCacheClear$0(Lcom/ibotta/android/appcache/ClearGroupRunnable;Ljava/lang/StringBuilder;)V
    .locals 2

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->context:Landroid/content/Context;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    const-string v0, "Acquiring AppCache batch lock..."

    const/4 v1, 0x0

    .line 31
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-interface {v0}, Lcom/ibotta/android/appcache/AppCache;->getBatchLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v0, "Acquired AppCache batch lock."

    .line 33
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    const-string v0, "Starting jobs: jobCount=%1$d"

    const/4 v2, 0x1

    .line 36
    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->clearJobs:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->clearJobs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Runnable;

    const-string v4, "Running cache clear job: class=%1$s"

    .line 39
    new-array v5, v2, [Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->clearJobs:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/ibotta/android/appcache/ClearGroupRunnable;->debugCacheClear(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-interface {v0}, Lcom/ibotta/android/appcache/AppCache;->getBatchLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "Cache clear jobs finished."

    .line 48
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    .line 45
    iget-object v1, p0, Lcom/ibotta/android/appcache/ClearGroupRunnable;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-interface {v1}, Lcom/ibotta/android/appcache/AppCache;->getBatchLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
