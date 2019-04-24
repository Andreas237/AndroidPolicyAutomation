.class final Lcom/nytimes/android/external/cache/LocalCache$EntrySet;
.super Lcom/nytimes/android/external/cache/LocalCache$AbstractCacheSet;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "EntrySet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/nytimes/android/external/cache/LocalCache<",
        "TK;TV;>.AbstractCacheSet<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nytimes/android/external/cache/LocalCache;


# direct methods
.method constructor <init>(Lcom/nytimes/android/external/cache/LocalCache;Ljava/util/concurrent/ConcurrentMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentMap<",
            "**>;)V"
        }
    .end annotation

    .line 4610
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$EntrySet;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    .line 4611
    invoke-direct {p0, p1, p2}, Lcom/nytimes/android/external/cache/LocalCache$AbstractCacheSet;-><init>(Lcom/nytimes/android/external/cache/LocalCache;Ljava/util/concurrent/ConcurrentMap;)V

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 3

    .line 4622
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 4625
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 4626
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    .line 4630
    :cond_1
    iget-object v2, p0, Lcom/nytimes/android/external/cache/LocalCache$EntrySet;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v2, v0}, Lcom/nytimes/android/external/cache/LocalCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4632
    iget-object v2, p0, Lcom/nytimes/android/external/cache/LocalCache$EntrySet;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v2, v2, Lcom/nytimes/android/external/cache/LocalCache;->valueEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1, v0}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 4617
    new-instance v0, Lcom/nytimes/android/external/cache/LocalCache$EntryIterator;

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$EntrySet;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-direct {v0, v1}, Lcom/nytimes/android/external/cache/LocalCache$EntryIterator;-><init>(Lcom/nytimes/android/external/cache/LocalCache;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 3

    .line 4637
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 4640
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 4641
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4642
    iget-object v2, p0, Lcom/nytimes/android/external/cache/LocalCache$EntrySet;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, Lcom/nytimes/android/external/cache/LocalCache;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method
