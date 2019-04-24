.class Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;
.super Ljava/lang/Object;
.source "LocalCache.java"

# interfaces
.implements Lcom/nytimes/android/external/cache/Cache;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LocalManualCache"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/nytimes/android/external/cache/Cache<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field final localCache:Lcom/nytimes/android/external/cache/LocalCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/nytimes/android/external/cache/CacheBuilder;)V
    .locals 2
    .param p1    # Lcom/nytimes/android/external/cache/CacheBuilder;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/CacheBuilder<",
            "-TK;-TV;>;)V"
        }
    .end annotation

    .line 4820
    new-instance v0, Lcom/nytimes/android/external/cache/LocalCache;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/nytimes/android/external/cache/LocalCache;-><init>(Lcom/nytimes/android/external/cache/CacheBuilder;Lcom/nytimes/android/external/cache/CacheLoader;)V

    invoke-direct {p0, v0}, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;-><init>(Lcom/nytimes/android/external/cache/LocalCache;)V

    return-void
.end method

.method private constructor <init>(Lcom/nytimes/android/external/cache/LocalCache;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 4823
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4824
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;->localCache:Lcom/nytimes/android/external/cache/LocalCache;

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

    .line 4887
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;->localCache:Lcom/nytimes/android/external/cache/LocalCache;

    return-object v0
.end method

.method public cleanUp()V
    .locals 1

    .line 4893
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;->localCache:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache;->cleanUp()V

    return-void
.end method

.method public get(Ljava/lang/Object;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Callable;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
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

    .line 4839
    invoke-static {p2}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4840
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;->localCache:Lcom/nytimes/android/external/cache/LocalCache;

    new-instance v1, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache$1;

    invoke-direct {v1, p0, p2}, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache$1;-><init>(Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v0, p1, v1}, Lcom/nytimes/android/external/cache/LocalCache;->get(Ljava/lang/Object;Lcom/nytimes/android/external/cache/CacheLoader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getAllPresent(Ljava/lang/Iterable;)Ljava/util/Map;
    .locals 1
    .param p1    # Ljava/lang/Iterable;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "*>;)",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 4851
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;->localCache:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0, p1}, Lcom/nytimes/android/external/cache/LocalCache;->getAllPresent(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public getIfPresent(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 4833
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;->localCache:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0, p1}, Lcom/nytimes/android/external/cache/LocalCache;->getIfPresent(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invalidate(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 4866
    invoke-static {p1}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4867
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;->localCache:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0, p1}, Lcom/nytimes/android/external/cache/LocalCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public invalidateAll()V
    .locals 1

    .line 4877
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;->localCache:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache;->clear()V

    return-void
.end method

.method public invalidateAll(Ljava/lang/Iterable;)V
    .locals 1
    .param p1    # Ljava/lang/Iterable;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "*>;)V"
        }
    .end annotation

    .line 4872
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;->localCache:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0, p1}, Lcom/nytimes/android/external/cache/LocalCache;->invalidateAll(Ljava/lang/Iterable;)V

    return-void
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .line 4856
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;->localCache:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0, p1, p2}, Lcom/nytimes/android/external/cache/LocalCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    .line 4861
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;->localCache:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0, p1}, Lcom/nytimes/android/external/cache/LocalCache;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public size()J
    .locals 2

    .line 4882
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;->localCache:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache;->longSize()J

    move-result-wide v0

    return-wide v0
.end method

.method writeReplace()Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 4902
    new-instance v0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$LocalManualCache;->localCache:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-direct {v0, v1}, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;-><init>(Lcom/nytimes/android/external/cache/LocalCache;)V

    return-object v0
.end method
