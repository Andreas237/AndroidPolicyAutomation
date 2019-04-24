.class public Lcom/ibotta/android/appcache/CacheClearHelperImpl;
.super Ljava/lang/Object;
.source "CacheClearHelperImpl.java"

# interfaces
.implements Lcom/ibotta/android/appcache/CacheClearHelper;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

.field private final runnableFactory:Lcom/ibotta/android/appcache/CacheClearRunnableFactory;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactory;Lcom/ibotta/android/state/app/fcm/FcmState;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/appcache/CacheClearHelperImpl;->runnableFactory:Lcom/ibotta/android/appcache/CacheClearRunnableFactory;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/appcache/CacheClearHelperImpl;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    return-void
.end method

.method private varargs clearCache(Z[Lcom/ibotta/android/appcache/CacheMask;)V
    .locals 5

    if-nez p2, :cond_0

    return-void

    .line 34
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p2, v2

    .line 36
    iget-object v4, p0, Lcom/ibotta/android/appcache/CacheClearHelperImpl;->runnableFactory:Lcom/ibotta/android/appcache/CacheClearRunnableFactory;

    invoke-interface {v4, v3}, Lcom/ibotta/android/appcache/CacheClearRunnableFactory;->createFor(Lcom/ibotta/android/appcache/CacheMask;)Ljava/lang/Runnable;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 38
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 42
    :cond_2
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/appcache/CacheClearHelperImpl;->runClearGroup(ZLjava/util/List;)V

    return-void
.end method

.method private runClearGroup(ZLjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;)V"
        }
    .end annotation

    .line 77
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Starting ClearGroup job: jobCount=%1$d"

    const/4 v1, 0x1

    .line 78
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearHelperImpl;->runnableFactory:Lcom/ibotta/android/appcache/CacheClearRunnableFactory;

    invoke-interface {v0, p2}, Lcom/ibotta/android/appcache/CacheClearRunnableFactory;->createFor(Ljava/util/List;)Ljava/lang/Runnable;

    move-result-object p2

    if-eqz p1, :cond_0

    .line 82
    new-instance p1, Ljava/lang/Thread;

    const-string v0, "Cache Mask Group Clear"

    invoke-direct {p1, p2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 84
    :cond_0
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public varargs clearCache([Lcom/ibotta/android/appcache/CacheMask;)V
    .locals 1

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/appcache/CacheClearHelperImpl;->clearCache(Z[Lcom/ibotta/android/appcache/CacheMask;)V

    return-void
.end method

.method public clearCacheForFlags(I)V
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "No cache clearing flags set."

    .line 47
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 51
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 53
    invoke-static {}, Lcom/ibotta/android/appcache/CacheMask;->values()[Lcom/ibotta/android/appcache/CacheMask;

    move-result-object v2

    array-length v3, v2

    :goto_0
    if-ge v0, v3, :cond_2

    aget-object v4, v2, v0

    .line 54
    invoke-virtual {v4, p1}, Lcom/ibotta/android/appcache/CacheMask;->isFlagOn(I)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 55
    iget-object v5, p0, Lcom/ibotta/android/appcache/CacheClearHelperImpl;->runnableFactory:Lcom/ibotta/android/appcache/CacheClearRunnableFactory;

    invoke-interface {v5, v4}, Lcom/ibotta/android/appcache/CacheClearRunnableFactory;->createFor(Lcom/ibotta/android/appcache/CacheMask;)Ljava/lang/Runnable;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 57
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    .line 62
    invoke-direct {p0, p1, v1}, Lcom/ibotta/android/appcache/CacheClearHelperImpl;->runClearGroup(ZLjava/util/List;)V

    return-void
.end method

.method public clearCacheForFlagsFromPushNotification()V
    .locals 5

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearHelperImpl;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/fcm/FcmState;->getPushCacheClearingFlags()I

    move-result v0

    :try_start_0
    const-string v1, "Clearing cache flags from push: %1$d"

    const/4 v2, 0x1

    .line 69
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    invoke-virtual {p0, v0}, Lcom/ibotta/android/appcache/CacheClearHelperImpl;->clearCacheForFlags(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearHelperImpl;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/fcm/FcmState;->clearPushCacheClearingFlags()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/appcache/CacheClearHelperImpl;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/fcm/FcmState;->clearPushCacheClearingFlags()V

    throw v0
.end method
