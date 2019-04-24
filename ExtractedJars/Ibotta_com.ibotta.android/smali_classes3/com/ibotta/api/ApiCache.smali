.class public interface abstract Lcom/ibotta/api/ApiCache;
.super Ljava/lang/Object;
.source "ApiCache.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/ibotta/api/CacheableApiCall;",
        "V:",
        "Lcom/ibotta/api/CacheableApiResponse;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract extendExpiration(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Lcom/ibotta/api/CacheableApiResponse;"
        }
    .end annotation
.end method

.method public abstract getBatchLock()Ljava/util/concurrent/locks/Lock;
.end method

.method public abstract getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Lcom/ibotta/api/CachePolicy;"
        }
    .end annotation
.end method

.method public abstract getIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)TV;"
        }
    .end annotation
.end method

.method public abstract getLastModified(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method public abstract invalidate(Lcom/ibotta/api/CacheableApiCall;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)V"
        }
    .end annotation
.end method

.method public abstract put(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;TV;)V"
        }
    .end annotation
.end method

.method public abstract remove(Lcom/ibotta/api/CacheableApiCall;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)V"
        }
    .end annotation
.end method

.method public abstract removeAll()V
.end method

.method public abstract replace(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;TV;)V"
        }
    .end annotation
.end method
