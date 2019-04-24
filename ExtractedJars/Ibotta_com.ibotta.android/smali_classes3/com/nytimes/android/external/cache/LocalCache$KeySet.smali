.class final Lcom/nytimes/android/external/cache/LocalCache$KeySet;
.super Lcom/nytimes/android/external/cache/LocalCache$AbstractCacheSet;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "KeySet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/nytimes/android/external/cache/LocalCache<",
        "TK;TV;>.AbstractCacheSet<TK;>;"
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

    .line 4540
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$KeySet;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    .line 4541
    invoke-direct {p0, p1, p2}, Lcom/nytimes/android/external/cache/LocalCache$AbstractCacheSet;-><init>(Lcom/nytimes/android/external/cache/LocalCache;Ljava/util/concurrent/ConcurrentMap;)V

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 4552
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$KeySet;->map:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TK;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 4547
    new-instance v0, Lcom/nytimes/android/external/cache/LocalCache$KeyIterator;

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$KeySet;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-direct {v0, v1}, Lcom/nytimes/android/external/cache/LocalCache$KeyIterator;-><init>(Lcom/nytimes/android/external/cache/LocalCache;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .line 4557
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$KeySet;->map:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
