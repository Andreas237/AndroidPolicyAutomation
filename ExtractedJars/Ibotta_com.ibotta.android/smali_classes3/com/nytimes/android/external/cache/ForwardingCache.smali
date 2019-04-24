.class public abstract Lcom/nytimes/android/external/cache/ForwardingCache;
.super Lcom/nytimes/android/external/cache/ForwardingObject;
.source "ForwardingCache.java"

# interfaces
.implements Lcom/nytimes/android/external/cache/Cache;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/nytimes/android/external/cache/ForwardingObject;",
        "Lcom/nytimes/android/external/cache/Cache<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/ForwardingObject;-><init>()V

    return-void
.end method


# virtual methods
.method public asMap()Ljava/util/concurrent/ConcurrentMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentMap<",
            "TK;TV;>;"
        }
    .end annotation

    .line 86
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/ForwardingCache;->delegate()Lcom/nytimes/android/external/cache/Cache;

    move-result-object v0

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/Cache;->asMap()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    return-object v0
.end method

.method public cleanUp()V
    .locals 1

    .line 91
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/ForwardingCache;->delegate()Lcom/nytimes/android/external/cache/Cache;

    move-result-object v0

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/Cache;->cleanUp()V

    return-void
.end method

.method protected abstract delegate()Lcom/nytimes/android/external/cache/Cache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/Cache<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method protected bridge synthetic delegate()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/ForwardingCache;->delegate()Lcom/nytimes/android/external/cache/Cache;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/Object;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/concurrent/Callable<",
            "+TV;>;)TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 33
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/ForwardingCache;->delegate()Lcom/nytimes/android/external/cache/Cache;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/nytimes/android/external/cache/Cache;->get(Ljava/lang/Object;Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getAllPresent(Ljava/lang/Iterable;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "*>;)",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    .line 41
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/ForwardingCache;->delegate()Lcom/nytimes/android/external/cache/Cache;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/nytimes/android/external/cache/Cache;->getAllPresent(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public getIfPresent(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 24
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/ForwardingCache;->delegate()Lcom/nytimes/android/external/cache/Cache;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/nytimes/android/external/cache/Cache;->getIfPresent(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invalidate(Ljava/lang/Object;)V
    .locals 1

    .line 62
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/ForwardingCache;->delegate()Lcom/nytimes/android/external/cache/Cache;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/nytimes/android/external/cache/Cache;->invalidate(Ljava/lang/Object;)V

    return-void
.end method

.method public invalidateAll()V
    .locals 1

    .line 75
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/ForwardingCache;->delegate()Lcom/nytimes/android/external/cache/Cache;

    move-result-object v0

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/Cache;->invalidateAll()V

    return-void
.end method

.method public invalidateAll(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "*>;)V"
        }
    .end annotation

    .line 70
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/ForwardingCache;->delegate()Lcom/nytimes/android/external/cache/Cache;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/nytimes/android/external/cache/Cache;->invalidateAll(Ljava/lang/Iterable;)V

    return-void
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .line 49
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/ForwardingCache;->delegate()Lcom/nytimes/android/external/cache/Cache;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/nytimes/android/external/cache/Cache;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    .line 57
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/ForwardingCache;->delegate()Lcom/nytimes/android/external/cache/Cache;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/nytimes/android/external/cache/Cache;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public size()J
    .locals 2

    .line 80
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/ForwardingCache;->delegate()Lcom/nytimes/android/external/cache/Cache;

    move-result-object v0

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/Cache;->size()J

    move-result-wide v0

    return-wide v0
.end method
