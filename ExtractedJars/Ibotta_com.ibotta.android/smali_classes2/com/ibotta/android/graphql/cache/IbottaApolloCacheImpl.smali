.class public Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;
.super Lcom/ibotta/android/graphql/cache/IbottaApolloCache;
.source "IbottaApolloCacheImpl.java"


# static fields
.field private static final FIELD_OFFER_ACTIVATED:Ljava/lang/String; = "activated"

.field private static final HOMESCREEN_MODULE_LIMIT:I = 0x6

.field private static final MAPPED_RESPONSE_CACHE_SIZE:I = 0x14

.field private static final RECORD_CACHE_SIZE:I = 0xc350

.field private static final ROOT_CACHE_KEY:Lcom/apollographql/apollo/cache/normalized/CacheKey;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final cacheKeys:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final cacheReferences:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final evictionPolicies:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/graphql/cache/evict/EvictionPolicy;",
            ">;"
        }
    .end annotation
.end field

.field private final lruMappedResponseCache:Landroid/support/v4/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LruCache<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/graphql/GraphQLApiResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final lruRecordCache:Landroid/support/v4/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LruCache<",
            "Ljava/lang/String;",
            "Lcom/apollographql/apollo/cache/normalized/Record;",
            ">;"
        }
    .end annotation
.end field

.field private final mappedCachekeys:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final matcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "QUERY_ROOT"

    .line 53
    invoke-static {v0}, Lcom/apollographql/apollo/cache/normalized/CacheKey;->from(Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/CacheKey;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->ROOT_CACHE_KEY:Lcom/apollographql/apollo/cache/normalized/CacheKey;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 2
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

    .line 69
    invoke-direct {p0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;-><init>()V

    .line 59
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->cacheKeys:Ljava/util/Set;

    .line 60
    new-instance v0, Landroid/support/v4/util/LruCache;

    const v1, 0xc350

    invoke-direct {v0, v1}, Landroid/support/v4/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruRecordCache:Landroid/support/v4/util/LruCache;

    .line 61
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->mappedCachekeys:Ljava/util/Set;

    .line 62
    new-instance v0, Landroid/support/v4/util/LruCache;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Landroid/support/v4/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruMappedResponseCache:Landroid/support/v4/util/LruCache;

    .line 64
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->cacheReferences:Ljava/util/Map;

    if-eqz p1, :cond_0

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->evictionPolicies:Ljava/util/Set;

    goto :goto_0

    .line 74
    :cond_0
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->evictionPolicies:Ljava/util/Set;

    .line 77
    :goto_0
    iput-object p2, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->matcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    .line 78
    iput-object p3, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method private checkEvictionPolicies(Ljava/lang/String;Lcom/apollographql/apollo/cache/normalized/Record;)Z
    .locals 3

    .line 392
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->evictionPolicies:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/cache/evict/EvictionPolicy;

    .line 393
    invoke-interface {v1, p1, p2}, Lcom/ibotta/android/graphql/cache/evict/EvictionPolicy;->shouldEvict(Ljava/lang/String;Lcom/apollographql/apollo/cache/normalized/Record;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 394
    invoke-direct {p0, p1, v2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->removeByKey(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method private evictContentIfNeeded(Lcom/ibotta/android/graphql/GraphQLApiResponse;)V
    .locals 2

    .line 404
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->evictionPolicies:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/cache/evict/EvictionPolicy;

    .line 405
    invoke-interface {v1, p1}, Lcom/ibotta/android/graphql/cache/evict/EvictionPolicy;->evictContentIfNeeded(Lcom/ibotta/android/graphql/GraphQLApiResponse;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private getRecentlyViewedOffers(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferContent;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferContent;",
            ">;"
        }
    .end annotation

    .line 171
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$XeF85vahJxicZIzcKuPd3SYxxMA;->INSTANCE:Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$XeF85vahJxicZIzcKuPd3SYxxMA;

    .line 172
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 175
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method private getRecentlyViewedOffersForHome(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferContent;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferContent;",
            ">;"
        }
    .end annotation

    .line 162
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    const-wide/16 v0, 0x6

    .line 163
    invoke-interface {p1, v0, v1}, Ljava9/util/stream/Stream;->limit(J)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$AdipPRlSD5_CP-86adn8V3Ej1uI;->INSTANCE:Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$AdipPRlSD5_CP-86adn8V3Ej1uI;

    .line 164
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 167
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method private invalidateCachesForOffers()V
    .locals 1

    .line 236
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->matcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-interface {v0}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forRelatedOffers()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V

    .line 237
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->matcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-interface {v0}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forOfferTagSearch()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V

    .line 239
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->matcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-interface {v0}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forUnlockedOfferCategories()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->matcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-interface {v0}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forUnlockedOfferPages()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V

    return-void
.end method

.method private invalidateExact(Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;Z)V
    .locals 4

    .line 266
    sget-object v0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->ROOT_CACHE_KEY:Lcom/apollographql/apollo/cache/normalized/CacheKey;

    invoke-virtual {v0}, Lcom/apollographql/apollo/cache/normalized/CacheKey;->key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string p1, "Explicit invalidation of the QUERY_ROOT is not allowed."

    .line 268
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v0, "Invalidating cache entry: %1$s"

    const/4 v2, 0x1

    .line 272
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;->getKey()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruRecordCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/apollographql/apollo/cache/normalized/Record;

    if-eqz v0, :cond_1

    .line 276
    sget-object v1, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->ROOT_CACHE_KEY:Lcom/apollographql/apollo/cache/normalized/CacheKey;

    invoke-virtual {v1}, Lcom/apollographql/apollo/cache/normalized/CacheKey;->key()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/apollographql/apollo/cache/normalized/Record;->key()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 277
    invoke-virtual {v0}, Lcom/apollographql/apollo/cache/normalized/Record;->fields()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 279
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->removeByKey(Ljava/lang/String;Z)V

    .line 281
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->cacheReferences:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 282
    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->cacheReferences:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 285
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 286
    new-instance v1, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;

    invoke-direct {v1, v0}, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1, p2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;Z)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private invalidateFuzzy(Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;Z)V
    .locals 2

    .line 293
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->find(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)Ljava/util/Set;

    move-result-object p1

    .line 295
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 296
    sget-object v1, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->ROOT_CACHE_KEY:Lcom/apollographql/apollo/cache/normalized/CacheKey;

    invoke-virtual {v1}, Lcom/apollographql/apollo/cache/normalized/CacheKey;->key()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "Explicit invalidation of the QUERY_ROOT is not allowed."

    const/4 v1, 0x0

    .line 298
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 302
    :cond_0
    new-instance v1, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;

    invoke-direct {v1, v0}, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1, p2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic lambda$getRecentlyViewedOffers$6(Lcom/ibotta/api/model/content/OfferContent;)Lcom/ibotta/api/model/content/OfferContent;
    .locals 1

    .line 173
    sget-object v0, Lcom/ibotta/api/model/offer/OfferType;->DEFAULT:Lcom/ibotta/api/model/offer/OfferType;

    invoke-virtual {v0}, Lcom/ibotta/api/model/offer/OfferType;->getApiName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/api/model/content/OfferContent;->setOfferType(Ljava/lang/String;)V

    return-object p0
.end method

.method static synthetic lambda$getRecentlyViewedOffersForHome$5(Lcom/ibotta/api/model/content/OfferContent;)Lcom/ibotta/api/model/content/OfferContent;
    .locals 1

    .line 165
    sget-object v0, Lcom/ibotta/api/model/offer/OfferType;->DEFAULT:Lcom/ibotta/api/model/offer/OfferType;

    invoke-virtual {v0}, Lcom/ibotta/api/model/offer/OfferType;->getApiName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/api/model/content/OfferContent;->setOfferType(Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic lambda$updateRecentlyViewedModuleOffers$0(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;Lcom/ibotta/api/model/base/BaseModule;)Z
    .locals 1

    .line 131
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/BaseModule;->getModuleId()I

    move-result p1

    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getRecentlyViewedModuleId()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic lambda$updateRecentlyViewedModuleOffers$1(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;)Ljava9/util/stream/Stream;
    .locals 1

    .line 130
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;->getModules()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$HXPjZqjOxFzt-_l0QVfINzdnf-0;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$HXPjZqjOxFzt-_l0QVfINzdnf-0;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;)V

    .line 131
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$updateRecentlyViewedModuleOffers$2(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V
    .locals 1

    .line 133
    invoke-virtual {p2}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 134
    invoke-virtual {p2}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->getRecentlyViewedOffersForHome(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public static synthetic lambda$updateRecentlyViewedModuleOffers$3(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;)Z
    .locals 1

    .line 143
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;->getModule()Lcom/ibotta/api/model/base/BaseModule;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/base/BaseModule;->getModuleId()I

    move-result p1

    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getRecentlyViewedModuleId()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic lambda$updateRecentlyViewedModuleOffers$4(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;Ljava/util/List;Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;)V
    .locals 1

    .line 145
    invoke-virtual {p2}, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;->getModule()Lcom/ibotta/api/model/base/BaseModule;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 146
    invoke-virtual {p2}, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;->getModule()Lcom/ibotta/api/model/base/BaseModule;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->getRecentlyViewedOffers(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private removeByKey(Ljava/lang/String;Z)V
    .locals 1

    .line 379
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruRecordCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->cacheKeys:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    if-eqz p2, :cond_0

    .line 384
    iget-object p2, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->mappedCachekeys:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 385
    iget-object p2, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruMappedResponseCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {p2, p1}, Landroid/support/v4/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private saveReference(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 364
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->cacheReferences:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    .line 366
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 367
    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->cacheReferences:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    :cond_0
    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private saveReferences(Lcom/apollographql/apollo/cache/normalized/Record;)V
    .locals 4
    .param p1    # Lcom/apollographql/apollo/cache/normalized/Record;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 347
    invoke-virtual {p1}, Lcom/apollographql/apollo/cache/normalized/Record;->fields()Ljava/util/Map;

    move-result-object v0

    .line 348
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 349
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 351
    instance-of v2, v1, Lcom/apollographql/apollo/cache/normalized/CacheReference;

    if-eqz v2, :cond_1

    .line 352
    check-cast v1, Lcom/apollographql/apollo/cache/normalized/CacheReference;

    invoke-virtual {v1}, Lcom/apollographql/apollo/cache/normalized/CacheReference;->key()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/apollographql/apollo/cache/normalized/Record;->key()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->saveReference(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 353
    :cond_1
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_0

    .line 354
    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 355
    instance-of v3, v2, Lcom/apollographql/apollo/cache/normalized/CacheReference;

    if-eqz v3, :cond_2

    .line 356
    check-cast v2, Lcom/apollographql/apollo/cache/normalized/CacheReference;

    invoke-virtual {v2}, Lcom/apollographql/apollo/cache/normalized/CacheReference;->key()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/apollographql/apollo/cache/normalized/Record;->key()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->saveReference(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method private updateMappedOfferActivated(IZ)V
    .locals 4

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->mappedCachekeys:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 217
    iget-object v2, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruMappedResponseCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v2, v1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/GraphQLApiResponse;

    .line 219
    instance-of v2, v1, Lcom/ibotta/android/api/ResponseOfferContainer;

    if-eqz v2, :cond_0

    .line 220
    check-cast v1, Lcom/ibotta/android/api/ResponseOfferContainer;

    .line 221
    invoke-interface {v1}, Lcom/ibotta/android/api/ResponseOfferContainer;->getContainerOffers()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 224
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OfferModel;

    .line 225
    invoke-interface {v2}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v3

    if-ne v3, p1, :cond_1

    .line 226
    invoke-interface {v2, p2}, Lcom/ibotta/api/model/OfferModel;->setActivated(Z)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private updateOfferRecordsActivated(IZ)V
    .locals 5

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->matcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-interface {v0, p1}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forOffer(I)Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->find(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)Ljava/util/Set;

    move-result-object v0

    .line 199
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 200
    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->get(Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/Record;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const-string v3, "id"

    .line 204
    invoke-virtual {v1, v3}, Lcom/apollographql/apollo/cache/normalized/Record;->hasField(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v2, "id"

    .line 205
    invoke-virtual {v1, v2}, Lcom/apollographql/apollo/cache/normalized/Record;->field(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 208
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 209
    invoke-virtual {v1}, Lcom/apollographql/apollo/cache/normalized/Record;->fields()Ljava/util/Map;

    move-result-object v2

    const-string v3, "activated"

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->put(Lcom/apollographql/apollo/cache/normalized/Record;)V

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public clearAll()V
    .locals 1

    .line 411
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->cacheKeys:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 412
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruRecordCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->evictAll()V

    .line 413
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->cacheReferences:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 414
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->mappedCachekeys:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 415
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruMappedResponseCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->evictAll()V

    return-void
.end method

.method public find(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 107
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->cacheKeys:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->mappedCachekeys:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 111
    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/graphql/cache/-$$Lambda$z-LsU7PIahuyFrU_LEEyZ5pAjdg;

    invoke-direct {v1, p1}, Lcom/ibotta/android/graphql/cache/-$$Lambda$z-LsU7PIahuyFrU_LEEyZ5pAjdg;-><init>(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V

    .line 112
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 113
    invoke-static {}, Ljava9/util/stream/Collectors;->toSet()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public get(Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/Record;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruRecordCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/cache/normalized/Record;

    return-object p1
.end method

.method public getMappedResponse(Ljava/lang/String;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruMappedResponseCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/GraphQLApiResponse;

    if-eqz p1, :cond_0

    .line 259
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->evictContentIfNeeded(Lcom/ibotta/android/graphql/GraphQLApiResponse;)V

    :cond_0
    return-object p1
.end method

.method public invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V
    .locals 1

    const/4 v0, 0x1

    .line 83
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;Z)V

    return-void
.end method

.method public invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;Z)V
    .locals 1

    .line 88
    instance-of v0, p1, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;

    if-eqz v0, :cond_0

    .line 89
    check-cast p1, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidateExact(Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;Z)V

    goto :goto_0

    .line 91
    :cond_0
    check-cast p1, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidateFuzzy(Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;Z)V

    :goto_0
    return-void
.end method

.method public loadRecord(Ljava/lang/String;Lcom/apollographql/apollo/cache/CacheHeaders;)Lcom/apollographql/apollo/cache/normalized/Record;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/apollographql/apollo/cache/CacheHeaders;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 308
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruRecordCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/apollographql/apollo/cache/normalized/Record;

    if-eqz v0, :cond_1

    const-string v1, "evict-after-read"

    .line 311
    invoke-virtual {p2, v1}, Lcom/apollographql/apollo/cache/CacheHeaders;->hasHeader(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    .line 312
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->removeByKey(Ljava/lang/String;Z)V

    goto :goto_0

    .line 313
    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->checkEvictionPolicies(Ljava/lang/String;Lcom/apollographql/apollo/cache/normalized/Record;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public onLogOut(Z)V
    .locals 0

    .line 426
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->clearAll()V

    return-void
.end method

.method protected performMerge(Lcom/apollographql/apollo/cache/normalized/Record;Lcom/apollographql/apollo/cache/CacheHeaders;)Ljava/util/Set;
    .locals 4
    .param p1    # Lcom/apollographql/apollo/cache/normalized/Record;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/apollographql/apollo/cache/CacheHeaders;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/cache/normalized/Record;",
            "Lcom/apollographql/apollo/cache/CacheHeaders;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    const-string v0, "Merge: %1$s"

    const/4 v1, 0x1

    .line 323
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/apollographql/apollo/cache/normalized/Record;->key()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "do-not-store"

    .line 324
    invoke-virtual {p2, v0}, Lcom/apollographql/apollo/cache/CacheHeaders;->hasHeader(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 325
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p1

    return-object p1

    .line 329
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruRecordCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {p1}, Lcom/apollographql/apollo/cache/normalized/Record;->key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/apollographql/apollo/cache/normalized/Record;

    if-nez p2, :cond_1

    .line 332
    iget-object p2, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->cacheKeys:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/apollographql/apollo/cache/normalized/Record;->key()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 333
    iget-object p2, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruRecordCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {p1}, Lcom/apollographql/apollo/cache/normalized/Record;->key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p2

    goto :goto_0

    .line 336
    :cond_1
    invoke-virtual {p2, p1}, Lcom/apollographql/apollo/cache/normalized/Record;->mergeWith(Lcom/apollographql/apollo/cache/normalized/Record;)Ljava/util/Set;

    move-result-object v0

    .line 337
    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->cacheKeys:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/apollographql/apollo/cache/normalized/Record;->key()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 338
    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruRecordCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {p1}, Lcom/apollographql/apollo/cache/normalized/Record;->key()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p2, v0

    .line 341
    :goto_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->saveReferences(Lcom/apollographql/apollo/cache/normalized/Record;)V

    return-object p2
.end method

.method public put(Lcom/apollographql/apollo/cache/normalized/Record;)V
    .locals 2

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->cacheKeys:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/apollographql/apollo/cache/normalized/Record;->key()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruRecordCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {p1}, Lcom/apollographql/apollo/cache/normalized/Record;->key()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public putMappedResponse(Ljava/lang/String;Lcom/ibotta/android/graphql/GraphQLApiResponse;)V
    .locals 1

    .line 245
    instance-of v0, p2, Lcom/ibotta/android/graphql/BaseGraphQLApiMutationResponse;

    if-nez v0, :cond_0

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->mappedCachekeys:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 247
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruMappedResponseCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 249
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->mappedCachekeys:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 250
    iget-object p2, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruMappedResponseCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {p2, p1}, Landroid/support/v4/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public remove(Lcom/apollographql/apollo/cache/normalized/CacheKey;)Z
    .locals 0
    .param p1    # Lcom/apollographql/apollo/cache/normalized/CacheKey;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method public updateOfferAsUnlocked(IZ)V
    .locals 0

    .line 190
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->updateOfferRecordsActivated(IZ)V

    .line 191
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->updateMappedOfferActivated(IZ)V

    .line 193
    invoke-direct {p0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidateCachesForOffers()V

    return-void
.end method

.method public updateOffersAsUnlocked(Ljava/util/Collection;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    .line 180
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 181
    invoke-direct {p0, v0, p2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->updateOfferRecordsActivated(IZ)V

    .line 182
    invoke-direct {p0, v0, p2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->updateMappedOfferActivated(IZ)V

    goto :goto_0

    .line 185
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidateCachesForOffers()V

    return-void
.end method

.method public updateRecentlyViewedModuleOffers(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferContent;",
            ">;)V"
        }
    .end annotation

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->mappedCachekeys:Ljava/util/Set;

    .line 126
    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruMappedResponseCache:Landroid/support/v4/util/LruCache;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/graphql/cache/-$$Lambda$jHJXKtikTpp5M-01j7jWRIuAlws;

    invoke-direct {v2, v1}, Lcom/ibotta/android/graphql/cache/-$$Lambda$jHJXKtikTpp5M-01j7jWRIuAlws;-><init>(Landroid/support/v4/util/LruCache;)V

    .line 127
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/graphql/cache/-$$Lambda$tW8m3qxnONGRLiMZR60i4yC0hPs;

    invoke-direct {v2, v1}, Lcom/ibotta/android/graphql/cache/-$$Lambda$tW8m3qxnONGRLiMZR60i4yC0hPs;-><init>(Ljava/lang/Class;)V

    .line 128
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/graphql/cache/-$$Lambda$5RQCdibCe6DfSh1SAAlRYiasCik;

    invoke-direct {v2, v1}, Lcom/ibotta/android/graphql/cache/-$$Lambda$5RQCdibCe6DfSh1SAAlRYiasCik;-><init>(Ljava/lang/Class;)V

    .line 129
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$Ko8AjGYGtp3w4iA_XnkQ4RbLxRQ;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$Ko8AjGYGtp3w4iA_XnkQ4RbLxRQ;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;)V

    .line 130
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->flatMap(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$oYVWAcI6VFRMbwEwD9RJx_1vLrQ;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$oYVWAcI6VFRMbwEwD9RJx_1vLrQ;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;Ljava/util/List;)V

    .line 132
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->mappedCachekeys:Ljava/util/Set;

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lruMappedResponseCache:Landroid/support/v4/util/LruCache;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/graphql/cache/-$$Lambda$jHJXKtikTpp5M-01j7jWRIuAlws;

    invoke-direct {v2, v1}, Lcom/ibotta/android/graphql/cache/-$$Lambda$jHJXKtikTpp5M-01j7jWRIuAlws;-><init>(Landroid/support/v4/util/LruCache;)V

    .line 139
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/graphql/cache/-$$Lambda$tW8m3qxnONGRLiMZR60i4yC0hPs;

    invoke-direct {v2, v1}, Lcom/ibotta/android/graphql/cache/-$$Lambda$tW8m3qxnONGRLiMZR60i4yC0hPs;-><init>(Ljava/lang/Class;)V

    .line 140
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/graphql/cache/-$$Lambda$627Z_Gvo1GqwyQR-duIIxHgHkdQ;

    invoke-direct {v2, v1}, Lcom/ibotta/android/graphql/cache/-$$Lambda$627Z_Gvo1GqwyQR-duIIxHgHkdQ;-><init>(Ljava/lang/Class;)V

    .line 141
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$mPwHsrLSXmvqz1VG4alMeBOC1Oo;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$mPwHsrLSXmvqz1VG4alMeBOC1Oo;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;)V

    .line 142
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$OkGouD4ccOEE5voWyi9kenulceU;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$OkGouD4ccOEE5voWyi9kenulceU;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;Ljava/util/List;)V

    .line 144
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    .line 152
    iget-object p1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->matcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-interface {p1}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forModules()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;Z)V

    .line 153
    iget-object p1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->matcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getRecentlyViewedModuleId()I

    move-result v1

    invoke-interface {p1, v1}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forModule(I)Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;Z)V

    return-void
.end method

.method public updateRecentlyViewedRetailers()V
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->matcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-interface {v0}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forRecentlyViewedRetailers()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V

    return-void
.end method
