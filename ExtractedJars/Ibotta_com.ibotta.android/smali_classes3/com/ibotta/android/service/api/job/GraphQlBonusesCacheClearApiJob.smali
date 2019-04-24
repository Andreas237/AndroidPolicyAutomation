.class public Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob;
.super Lcom/ibotta/android/service/api/job/CacheClearApiJob;
.source "GraphQlBonusesCacheClearApiJob.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiResponse;,
        Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiCall;
    }
.end annotation


# instance fields
.field private final cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;)V
    .locals 2

    .line 23
    new-instance v0, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiCall;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiCall;-><init>(Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$1;)V

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 25
    iput-object p3, p0, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    return-void
.end method


# virtual methods
.method protected onDoWork()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forAnyBonuses()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V

    .line 31
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    return-void
.end method
