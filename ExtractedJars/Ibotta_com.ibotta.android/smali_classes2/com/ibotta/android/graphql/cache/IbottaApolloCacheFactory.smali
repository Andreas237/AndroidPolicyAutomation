.class public Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;
.super Lcom/apollographql/apollo/cache/normalized/NormalizedCacheFactory;
.source "IbottaApolloCacheFactory.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/apollographql/apollo/cache/normalized/NormalizedCacheFactory<",
        "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
        ">;"
    }
.end annotation


# static fields
.field private static final lock:Ljava/util/concurrent/locks/Lock;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private cache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

.field private final evictionPolicies:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/graphql/cache/evict/EvictionPolicy;",
            ">;"
        }
    .end annotation
.end field

.field private final matcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->lock:Ljava/util/concurrent/locks/Lock;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/graphql/cache/evict/EvictionPolicy;",
            ">;",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ")V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Lcom/apollographql/apollo/cache/normalized/NormalizedCacheFactory;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->evictionPolicies:Ljava/util/Set;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->matcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method


# virtual methods
.method public bridge synthetic create(Lcom/apollographql/apollo/cache/normalized/RecordFieldJsonAdapter;)Lcom/apollographql/apollo/cache/normalized/NormalizedCache;
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->create(Lcom/apollographql/apollo/cache/normalized/RecordFieldJsonAdapter;)Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-result-object p1

    return-object p1
.end method

.method public create(Lcom/apollographql/apollo/cache/normalized/RecordFieldJsonAdapter;)Lcom/ibotta/android/graphql/cache/IbottaApolloCache;
    .locals 3

    .line 51
    sget-object p1, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 53
    :try_start_0
    iget-object p1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->cache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    if-nez p1, :cond_0

    .line 54
    new-instance p1, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;

    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->evictionPolicies:Ljava/util/Set;

    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->matcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    iget-object v2, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;-><init>(Ljava/util/Set;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/state/app/config/AppConfig;)V

    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->cache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    :cond_0
    sget-object p1, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 60
    iget-object p1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->cache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    return-object p1

    :catchall_0
    move-exception p1

    .line 57
    sget-object v0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public getCache()Lcom/ibotta/android/graphql/cache/IbottaApolloCache;
    .locals 2

    .line 35
    sget-object v0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 37
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->cache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    if-nez v0, :cond_0

    .line 38
    new-instance v0, Lcom/ibotta/android/graphql/cache/IbottaApolloNotReadyCacheImpl;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/cache/IbottaApolloNotReadyCacheImpl;-><init>(Lcom/apollographql/apollo/cache/normalized/RecordFieldJsonAdapter;)V

    goto :goto_0

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->cache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    :goto_0
    sget-object v1, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
