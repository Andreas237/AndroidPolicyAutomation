.class public Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;
.super Ljava/lang/Object;
.source "GraphQLCacheFetchStrategy.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy<",
        "Lcom/ibotta/android/graphql/GraphQLApiResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiCall:Lcom/ibotta/android/graphql/GraphQLApiCall;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

.field private matcher:Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLApiCall;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->apiCall:Lcom/ibotta/android/graphql/GraphQLApiCall;

    .line 24
    invoke-direct {p0}, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->init()V

    return-void
.end method

.method private init()V
    .locals 4

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->apiCall:Lcom/ibotta/android/graphql/GraphQLApiCall;

    invoke-interface {v0}, Lcom/ibotta/android/graphql/GraphQLApiCall;->createApolloCall()Lcom/apollographql/apollo/ApolloCall;

    move-result-object v0

    .line 29
    new-instance v1, Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;

    iget-object v2, p0, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->apiCall:Lcom/ibotta/android/graphql/GraphQLApiCall;

    .line 30
    invoke-interface {v2}, Lcom/ibotta/android/graphql/GraphQLApiCall;->getQueryName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/apollographql/apollo/ApolloCall;->operation()Lcom/apollographql/apollo/api/Operation;

    move-result-object v0

    invoke-interface {v0}, Lcom/apollographql/apollo/api/Operation;->variables()Lcom/apollographql/apollo/api/Operation$Variables;

    move-result-object v0

    invoke-virtual {v0}, Lcom/apollographql/apollo/api/Operation$Variables;->valueMap()Ljava/util/Map;

    move-result-object v0

    iget-object v3, p0, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->apiCall:Lcom/ibotta/android/graphql/GraphQLApiCall;

    invoke-interface {v3}, Lcom/ibotta/android/graphql/GraphQLApiCall;->getDirectives()Ljava/util/Set;

    move-result-object v3

    invoke-direct {v1, v2, v0, v3}, Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;)V

    iput-object v1, p0, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->matcher:Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;

    return-void
.end method


# virtual methods
.method public isOutOfDate(J)Z
    .locals 0

    .line 35
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object p2, p0, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->matcher:Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->find(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return p2
.end method

.method public loadFromDiskCache()Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic loadFromDiskCache()Lcom/ibotta/api/ApiResponse;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->loadFromDiskCache()Lcom/ibotta/android/graphql/GraphQLApiResponse;

    move-result-object v0

    return-object v0
.end method

.method public loadFromMemCache()Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 3

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->matcher:Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->find(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)Ljava/util/Set;

    move-result-object v0

    .line 46
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 50
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->getMappedResponse(Ljava/lang/String;)Lcom/ibotta/android/graphql/GraphQLApiResponse;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic loadFromMemCache()Lcom/ibotta/api/ApiResponse;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/cachefetch/GraphQLCacheFetchStrategy;->loadFromMemCache()Lcom/ibotta/android/graphql/GraphQLApiResponse;

    move-result-object v0

    return-object v0
.end method
