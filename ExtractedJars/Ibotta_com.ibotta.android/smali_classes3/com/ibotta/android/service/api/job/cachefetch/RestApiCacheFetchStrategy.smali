.class public Lcom/ibotta/android/service/api/job/cachefetch/RestApiCacheFetchStrategy;
.super Ljava/lang/Object;
.source "RestApiCacheFetchStrategy.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy<",
        "Lcom/ibotta/api/CacheableApiResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiCall:Lcom/ibotta/api/CacheableApiCall;

.field private final appCache:Lcom/ibotta/android/appcache/AppCache;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/cachefetch/RestApiCacheFetchStrategy;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/service/api/job/cachefetch/RestApiCacheFetchStrategy;->apiCall:Lcom/ibotta/api/CacheableApiCall;

    return-void
.end method


# virtual methods
.method public isOutOfDate(J)Z
    .locals 2

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/cachefetch/RestApiCacheFetchStrategy;->appCache:Lcom/ibotta/android/appcache/AppCache;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/cachefetch/RestApiCacheFetchStrategy;->apiCall:Lcom/ibotta/api/CacheableApiCall;

    invoke-interface {v0, v1, p1, p2}, Lcom/ibotta/android/appcache/AppCache;->isExpiredOrHasNewer(Lcom/ibotta/api/CacheableApiCall;J)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic loadFromDiskCache()Lcom/ibotta/api/ApiResponse;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/cachefetch/RestApiCacheFetchStrategy;->loadFromDiskCache()Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v0

    return-object v0
.end method

.method public loadFromDiskCache()Lcom/ibotta/api/CacheableApiResponse;
    .locals 2

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/cachefetch/RestApiCacheFetchStrategy;->appCache:Lcom/ibotta/android/appcache/AppCache;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/cachefetch/RestApiCacheFetchStrategy;->apiCall:Lcom/ibotta/api/CacheableApiCall;

    invoke-interface {v0, v1}, Lcom/ibotta/android/appcache/AppCache;->getDiskIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic loadFromMemCache()Lcom/ibotta/api/ApiResponse;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/cachefetch/RestApiCacheFetchStrategy;->loadFromMemCache()Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v0

    return-object v0
.end method

.method public loadFromMemCache()Lcom/ibotta/api/CacheableApiResponse;
    .locals 2

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/cachefetch/RestApiCacheFetchStrategy;->appCache:Lcom/ibotta/android/appcache/AppCache;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/cachefetch/RestApiCacheFetchStrategy;->apiCall:Lcom/ibotta/api/CacheableApiCall;

    invoke-interface {v0, v1}, Lcom/ibotta/android/appcache/AppCache;->getMemIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v0

    return-object v0
.end method
