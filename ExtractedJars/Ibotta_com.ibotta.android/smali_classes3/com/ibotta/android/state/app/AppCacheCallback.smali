.class public interface abstract Lcom/ibotta/android/state/app/AppCacheCallback;
.super Ljava/lang/Object;
.source "AppCacheCallback.java"


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
.method public abstract addListener(Lcom/ibotta/api/AppCacheListener;)V
.end method

.method public abstract getMemIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)TV;"
        }
    .end annotation
.end method
