.class public interface abstract Lcom/ibotta/android/appcache/InvalidationCriteria;
.super Ljava/lang/Object;
.source "InvalidationCriteria.java"


# virtual methods
.method public abstract cleanUp()V
.end method

.method public abstract getCacheableScopes()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/api/CacheableApiCall;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getInvalidateable()Lcom/ibotta/api/CacheableApiCall;
.end method

.method public abstract isInvalidatedBy(Lcom/ibotta/api/CacheableApiCall;)Z
.end method
