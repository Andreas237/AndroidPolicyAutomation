.class public interface abstract Lnet/toddm/cache/CacheProvider;
.super Ljava/lang/Object;
.source "CacheProvider.java"


# virtual methods
.method public abstract add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z
.end method

.method public abstract add(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z
.end method

.method public abstract containsKey(Ljava/lang/String;Z)Z
.end method

.method public abstract get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;
.end method

.method public abstract getAll(Z)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lnet/toddm/cache/CacheEntry;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getLruCap()I
.end method

.method public abstract remove(Ljava/lang/String;)Z
.end method

.method public abstract removeAll()Z
.end method

.method public abstract setLruCap(I)V
.end method

.method public abstract size(Z)I
.end method

.method public abstract trimLru()Z
.end method
