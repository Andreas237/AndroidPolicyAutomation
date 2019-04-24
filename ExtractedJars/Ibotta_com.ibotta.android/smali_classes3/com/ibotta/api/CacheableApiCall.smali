.class public interface abstract Lcom/ibotta/api/CacheableApiCall;
.super Ljava/lang/Object;
.source "CacheableApiCall.java"

# interfaces
.implements Lcom/ibotta/api/ApiCall;
.implements Lcom/ibotta/api/CacheKeyProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/ibotta/api/CacheableApiResponse;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/ibotta/api/ApiCall<",
        "TT;>;",
        "Lcom/ibotta/api/CacheKeyProvider;"
    }
.end annotation


# virtual methods
.method public abstract getCacheFamily()Ljava/lang/String;
.end method

.method public abstract isInvalidatesCacheFamily()Z
.end method

.method public abstract isInvalidatesCacheFamilyOnWrite()Z
.end method

.method public abstract isSkipCacheSave()Z
.end method

.method public abstract restoreFromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/CacheableApiResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation
.end method
