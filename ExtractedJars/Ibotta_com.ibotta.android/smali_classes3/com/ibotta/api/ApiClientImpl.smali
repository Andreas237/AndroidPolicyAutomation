.class public Lcom/ibotta/api/ApiClientImpl;
.super Ljava/lang/Object;
.source "ApiClientImpl.java"

# interfaces
.implements Lcom/ibotta/api/ApiClient;


# instance fields
.field private apiCache:Lcom/ibotta/api/ApiCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/api/ApiCache<",
            "Lcom/ibotta/api/CacheableApiCall;",
            "Lcom/ibotta/api/CacheableApiResponse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private pullFromCache(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .locals 6

    .line 46
    iget-object v0, p0, Lcom/ibotta/api/ApiClientImpl;->apiCache:Lcom/ibotta/api/ApiCache;

    if-eqz v0, :cond_1

    instance-of v0, p1, Lcom/ibotta/api/CacheableApiCall;

    if-eqz v0, :cond_1

    .line 47
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v1, "Attempting to load ApiResponse from cache: %1$s"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getApiFunction()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-interface {v0, v1, v3}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/ApiClientImpl;->apiCache:Lcom/ibotta/api/ApiCache;

    move-object v1, p1

    check-cast v1, Lcom/ibotta/api/CacheableApiCall;

    invoke-interface {v0, v1}, Lcom/ibotta/api/ApiCache;->getIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v0

    if-nez v0, :cond_0

    .line 51
    sget-object v1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v3, "ApiResponse not found in cache: %1$s"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getApiFunction()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v5

    invoke-interface {v1, v3, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 53
    :cond_0
    sget-object v1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v3, "ApiResponse cache hit: %1$s"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getApiFunction()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v5

    invoke-interface {v1, v3, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private saveToCache(Lcom/ibotta/api/ApiCall;Lcom/ibotta/api/ApiResponse;)V
    .locals 5

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/ApiClientImpl;->apiCache:Lcom/ibotta/api/ApiCache;

    if-eqz v0, :cond_1

    instance-of v0, p1, Lcom/ibotta/api/CacheableApiCall;

    if-eqz v0, :cond_1

    instance-of v0, p2, Lcom/ibotta/api/CacheableApiResponse;

    if-eqz v0, :cond_1

    .line 62
    move-object v0, p1

    check-cast v0, Lcom/ibotta/api/CacheableApiCall;

    .line 63
    check-cast p2, Lcom/ibotta/api/CacheableApiResponse;

    .line 64
    invoke-virtual {p2}, Lcom/ibotta/api/CacheableApiResponse;->isFromCache()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    invoke-interface {v0}, Lcom/ibotta/api/CacheableApiCall;->isSkipCacheSave()Z

    move-result v1

    if-nez v1, :cond_0

    .line 66
    sget-object v1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v4, "Caching ApiResponse: %1$s"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getApiFunction()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v2

    invoke-interface {v1, v4, v3}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    iget-object p1, p0, Lcom/ibotta/api/ApiClientImpl;->apiCache:Lcom/ibotta/api/ApiCache;

    invoke-interface {p1, v0, p2}, Lcom/ibotta/api/ApiCache;->put(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)V

    goto :goto_0

    .line 68
    :cond_0
    invoke-interface {v0}, Lcom/ibotta/api/CacheableApiCall;->isSkipCacheSave()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 69
    sget-object p2, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v0, "API call configured to skip cache write: %1$s"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getApiFunction()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-interface {p2, v0, v1}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public execute(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/api/ApiResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/ibotta/api/ApiClientImpl;->apiCache:Lcom/ibotta/api/ApiCache;

    if-nez v0, :cond_0

    .line 15
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiCache()Lcom/ibotta/api/ApiCache;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/ApiClientImpl;->apiCache:Lcom/ibotta/api/ApiCache;

    .line 18
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/api/ApiClientImpl;->pullFromCache(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v0

    if-nez v0, :cond_2

    .line 21
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->buildApiExecution()V

    .line 22
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getApiExecution()Lcom/ibotta/api/execution/ApiExecution;

    move-result-object v0

    if-nez v0, :cond_1

    .line 24
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiExecutionFactory()Lcom/ibotta/api/execution/ApiExecutionFactory;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/execution/ApiExecutionFactory;->newIbottaApiInstance()Lcom/ibotta/api/execution/ApiExecution;

    move-result-object v0

    .line 28
    :cond_1
    :try_start_0
    invoke-interface {v0, p1}, Lcom/ibotta/api/execution/ApiExecution;->executeApiCall(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/api/ApiResponse;

    move-result-object v0
    :try_end_0
    .catch Lcom/ibotta/api/ApiException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    instance-of v1, p1, Lcom/ibotta/api/CacheableApiCall;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/api/ApiClientImpl;->apiCache:Lcom/ibotta/api/ApiCache;

    if-eqz v1, :cond_2

    .line 35
    invoke-direct {p0, p1, v0}, Lcom/ibotta/api/ApiClientImpl;->saveToCache(Lcom/ibotta/api/ApiCall;Lcom/ibotta/api/ApiResponse;)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 30
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getExceptionTracker()Lcom/ibotta/api/ExceptionTracker;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ibotta/api/ExceptionTracker;->trackException(Ljava/lang/Throwable;)V

    .line 31
    throw p1

    :cond_2
    :goto_0
    return-object v0
.end method
