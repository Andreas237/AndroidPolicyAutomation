.class public abstract Lcom/ibotta/api/BaseCacheableApiCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "BaseCacheableApiCall.java"

# interfaces
.implements Lcom/ibotta/api/CacheableApiCall;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/ibotta/api/CacheableApiResponse;",
        ">",
        "Lcom/ibotta/api/BaseApiCall<",
        "TT;>;",
        "Lcom/ibotta/api/CacheableApiCall<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private skipCacheSave:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    return-void
.end method


# virtual methods
.method public cleanUp()V
    .locals 0

    return-void
.end method

.method public isInvalidatesCacheFamilyOnWrite()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isSkipCacheSave()Z
    .locals 1

    .line 11
    iget-boolean v0, p0, Lcom/ibotta/api/BaseCacheableApiCall;->skipCacheSave:Z

    return v0
.end method

.method public restoreFromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/CacheableApiResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Ljava/io/InputStream;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/api/BaseCacheableApiCall;->getResponseType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/BaseCacheableApiCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/CacheableApiResponse;

    return-object p1
.end method

.method public setSkipCacheSave(Z)V
    .locals 0

    .line 15
    iput-boolean p1, p0, Lcom/ibotta/api/BaseCacheableApiCall;->skipCacheSave:Z

    return-void
.end method
