.class public interface abstract Lcom/ibotta/android/appcache/policy/CachePolicies;
.super Ljava/lang/Object;
.source "CachePolicies.java"


# virtual methods
.method public abstract getCacheInvalidators(Lcom/ibotta/api/CacheableApiCall;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/CacheableApiCall;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/appcache/InvalidationCriteria;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lcom/ibotta/api/CacheableApiCall;",
            ">(TC;)",
            "Lcom/ibotta/api/CachePolicy;"
        }
    .end annotation
.end method

.method public abstract init()V
.end method
