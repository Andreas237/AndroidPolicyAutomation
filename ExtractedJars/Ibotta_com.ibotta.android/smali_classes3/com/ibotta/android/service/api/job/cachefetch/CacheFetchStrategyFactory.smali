.class public Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;
.super Ljava/lang/Object;
.source "CacheFetchStrategyFactory.java"


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 19
    iput-object p2, p0, Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    return-void
.end method


# virtual methods
.method public fromApiCall(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;
    .locals 2

    .line 25
    instance-of v0, p1, Lcom/ibotta/api/CacheableApiCall;

    if-eqz v0, :cond_0

    .line 26
    new-instance v0, Lcom/ibotta/android/service/api/job/cachefetch/RestApiCacheFetchStrategy;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;->appCache:Lcom/ibotta/android/appcache/AppCache;

    check-cast p1, Lcom/ibotta/api/CacheableApiCall;

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/service/api/job/cachefetch/RestApiCacheFetchStrategy;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;)V

    goto :goto_0

    .line 27
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/graphql/GraphQLApiCall;

    if-eqz v0, :cond_1

    .line 28
    new-instance v0, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    check-cast p1, Lcom/ibotta/android/graphql/GraphQLApiCall;

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLApiCall;)V

    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, Lcom/ibotta/android/service/api/job/cachefetch/NotCacheableCacheFetchStrategy;

    invoke-direct {v0}, Lcom/ibotta/android/service/api/job/cachefetch/NotCacheableCacheFetchStrategy;-><init>()V

    :goto_0
    return-object v0
.end method
