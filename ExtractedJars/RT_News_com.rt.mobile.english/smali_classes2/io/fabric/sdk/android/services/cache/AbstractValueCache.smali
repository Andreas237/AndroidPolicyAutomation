.class public abstract Lio/fabric/sdk/android/services/cache/AbstractValueCache;
.super Ljava/lang/Object;
.source "AbstractValueCache.java"

# interfaces
.implements Lio/fabric/sdk/android/services/cache/ValueCache;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/fabric/sdk/android/services/cache/ValueCache<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final childCache:Lio/fabric/sdk/android/services/cache/ValueCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/fabric/sdk/android/services/cache/ValueCache<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/cache/AbstractValueCache;-><init>(Lio/fabric/sdk/android/services/cache/ValueCache;)V

    return-void
.end method

.method public constructor <init>(Lio/fabric/sdk/android/services/cache/ValueCache;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fabric/sdk/android/services/cache/ValueCache<",
            "TT;>;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lio/fabric/sdk/android/services/cache/AbstractValueCache;->childCache:Lio/fabric/sdk/android/services/cache/ValueCache;

    return-void
.end method

.method private cache(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 68
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 70
    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/fabric/sdk/android/services/cache/AbstractValueCache;->cacheValue(Landroid/content/Context;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected abstract cacheValue(Landroid/content/Context;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;)V"
        }
    .end annotation
.end method

.method protected abstract doInvalidate(Landroid/content/Context;)V
.end method

.method public final declared-synchronized get(Landroid/content/Context;Lio/fabric/sdk/android/services/cache/ValueLoader;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/fabric/sdk/android/services/cache/ValueLoader<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    monitor-enter p0

    .line 36
    :try_start_0
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/cache/AbstractValueCache;->getCached(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 39
    iget-object v0, p0, Lio/fabric/sdk/android/services/cache/AbstractValueCache;->childCache:Lio/fabric/sdk/android/services/cache/ValueCache;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/fabric/sdk/android/services/cache/AbstractValueCache;->childCache:Lio/fabric/sdk/android/services/cache/ValueCache;

    invoke-interface {v0, p1, p2}, Lio/fabric/sdk/android/services/cache/ValueCache;->get(Landroid/content/Context;Lio/fabric/sdk/android/services/cache/ValueLoader;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-interface {p2, p1}, Lio/fabric/sdk/android/services/cache/ValueLoader;->load(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p2

    :goto_0
    move-object v0, p2

    .line 40
    invoke-direct {p0, p1, v0}, Lio/fabric/sdk/android/services/cache/AbstractValueCache;->cache(Landroid/content/Context;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    :cond_1
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    .line 35
    monitor-exit p0

    throw p1
.end method

.method protected abstract getCached(Landroid/content/Context;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")TT;"
        }
    .end annotation
.end method

.method public final declared-synchronized invalidate(Landroid/content/Context;)V
    .locals 0

    monitor-enter p0

    .line 52
    :try_start_0
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/cache/AbstractValueCache;->doInvalidate(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 51
    monitor-exit p0

    throw p1
.end method
