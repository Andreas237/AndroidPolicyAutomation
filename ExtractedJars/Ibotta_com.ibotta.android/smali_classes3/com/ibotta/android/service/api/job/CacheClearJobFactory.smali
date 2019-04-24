.class public Lcom/ibotta/android/service/api/job/CacheClearJobFactory;
.super Ljava/lang/Object;
.source "CacheClearJobFactory.java"


# instance fields
.field private final apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 24
    iput-object p3, p0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 25
    iput-object p4, p0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    .line 26
    iput-object p5, p0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    return-void
.end method


# virtual methods
.method public create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 7

    .line 30
    new-instance v6, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v2, p0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->appCache:Lcom/ibotta/android/appcache/AppCache;

    iget-object v3, p0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v4, p0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    iget-object v5, p0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V

    return-object v6
.end method
