.class public abstract Lcom/ibotta/android/di/ApolloModule;
.super Ljava/lang/Object;
.source "ApolloModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# static fields
.field private static final APOLLO_CACHE_DIR:Ljava/lang/String; = "/cache/graphql"

.field private static final APOLLO_CACHE_SIZE:I = 0x100000

.field private static final GRAPHQL_API:Ljava/lang/String; = "https://content-server.ibotta.com/graphql"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideApolloClient(Lokhttp3/OkHttpClient;Lcom/apollographql/apollo/cache/http/ApolloHttpCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;Lcom/apollographql/apollo/cache/normalized/CacheKeyResolver;Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;)Lcom/apollographql/apollo/ApolloClient;
    .locals 1
    .param p0    # Lokhttp3/OkHttpClient;
        .annotation runtime Ljavax/inject/Named;
            value = "AppOkHttpClient"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 89
    invoke-static {}, Lcom/apollographql/apollo/ApolloClient;->builder()Lcom/apollographql/apollo/ApolloClient$Builder;

    move-result-object v0

    .line 90
    invoke-virtual {v0, p0}, Lcom/apollographql/apollo/ApolloClient$Builder;->okHttpClient(Lokhttp3/OkHttpClient;)Lcom/apollographql/apollo/ApolloClient$Builder;

    move-result-object p0

    const-string v0, "https://content-server.ibotta.com/graphql"

    .line 91
    invoke-virtual {p0, v0}, Lcom/apollographql/apollo/ApolloClient$Builder;->serverUrl(Ljava/lang/String;)Lcom/apollographql/apollo/ApolloClient$Builder;

    move-result-object p0

    .line 92
    invoke-virtual {p0, p1}, Lcom/apollographql/apollo/ApolloClient$Builder;->httpCache(Lcom/apollographql/apollo/api/cache/http/HttpCache;)Lcom/apollographql/apollo/ApolloClient$Builder;

    move-result-object p0

    .line 93
    invoke-virtual {p0, p2, p3}, Lcom/apollographql/apollo/ApolloClient$Builder;->normalizedCache(Lcom/apollographql/apollo/cache/normalized/NormalizedCacheFactory;Lcom/apollographql/apollo/cache/normalized/CacheKeyResolver;)Lcom/apollographql/apollo/ApolloClient$Builder;

    move-result-object p0

    sget-object p1, Lcom/apollographql/apollo/fetcher/ApolloResponseFetchers;->CACHE_FIRST:Lcom/apollographql/apollo/fetcher/ResponseFetcher;

    .line 94
    invoke-virtual {p0, p1}, Lcom/apollographql/apollo/ApolloClient$Builder;->defaultResponseFetcher(Lcom/apollographql/apollo/fetcher/ResponseFetcher;)Lcom/apollographql/apollo/ApolloClient$Builder;

    move-result-object p0

    .line 95
    invoke-virtual {p0, p4}, Lcom/apollographql/apollo/ApolloClient$Builder;->logger(Lcom/apollographql/apollo/Logger;)Lcom/apollographql/apollo/ApolloClient$Builder;

    move-result-object p0

    .line 96
    invoke-virtual {p0}, Lcom/apollographql/apollo/ApolloClient$Builder;->build()Lcom/apollographql/apollo/ApolloClient;

    move-result-object p0

    return-object p0
.end method

.method public static provideAvailableAtRetailerMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 227
    new-instance v0, Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideBonusMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/QuestMapper;Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/BonusMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 258
    new-instance v0, Lcom/ibotta/android/graphql/mapper/BonusMapper;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/graphql/mapper/BonusMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/QuestMapper;Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)V

    return-object v0
.end method

.method public static provideBonusQualificationMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 278
    new-instance v0, Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideButtonInfoMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 340
    new-instance v0, Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideBuyableGiftCardMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;)Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 263
    new-instance v0, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;)V

    return-object v0
.end method

.method public static provideBuyableGiftCardRetailerMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 268
    new-instance v0, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideCacheKeyMatcherFactory()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 125
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactoryImpl;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactoryImpl;-><init>()V

    return-object v0
.end method

.method public static provideCacheKeyResolver()Lcom/apollographql/apollo/cache/normalized/CacheKeyResolver;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 135
    new-instance v0, Lcom/ibotta/android/graphql/cache/ApolloCacheKeyResolver;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/cache/ApolloCacheKeyResolver;-><init>()V

    return-object v0
.end method

.method public static provideCustomerFavoriteRetailerMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;)Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 365
    new-instance v0, Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;)V

    return-object v0
.end method

.method public static provideCustomerNodeMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;)Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 358
    new-instance v0, Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;)V

    return-object v0
.end method

.method public static provideDealMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/DealMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 345
    new-instance v0, Lcom/ibotta/android/graphql/mapper/DealMapper;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/graphql/mapper/DealMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)V

    return-object v0
.end method

.method public static provideEngagementMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)Lcom/ibotta/android/graphql/mapper/EngagementMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 351
    new-instance v0, Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)V

    return-object v0
.end method

.method public static provideFeatureMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/FeatureMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 309
    new-instance v0, Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/graphql/mapper/FeatureMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)V

    return-object v0
.end method

.method public static provideFeaturedBannerNodeMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 386
    new-instance v0, Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideFeaturedNodeMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;)Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 380
    new-instance v0, Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;)V

    return-object v0
.end method

.method public static provideFeaturedRetailerMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;)Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 304
    new-instance v0, Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;)V

    return-object v0
.end method

.method public static provideGraphQLCallFactory(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;)Lcom/ibotta/android/graphql/GraphQLCallFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 402
    new-instance v0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;)V

    return-object v0
.end method

.method public static provideHttpCache(Lcom/apollographql/apollo/api/cache/http/HttpCacheStore;)Lcom/apollographql/apollo/cache/http/ApolloHttpCache;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 101
    new-instance v0, Lcom/apollographql/apollo/cache/http/ApolloHttpCache;

    invoke-direct {v0, p0}, Lcom/apollographql/apollo/cache/http/ApolloHttpCache;-><init>(Lcom/apollographql/apollo/api/cache/http/HttpCacheStore;)V

    return-object v0
.end method

.method public static provideHttpCacheStore()Lcom/apollographql/apollo/api/cache/http/HttpCacheStore;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 106
    new-instance v0, Lcom/apollographql/apollo/cache/http/DiskLruHttpCacheStore;

    new-instance v1, Ljava/io/File;

    const-string v2, "/cache/graphql"

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-wide/32 v2, 0x100000

    invoke-direct {v0, v1, v2, v3}, Lcom/apollographql/apollo/cache/http/DiskLruHttpCacheStore;-><init>(Ljava/io/File;J)V

    return-object v0
.end method

.method public static provideIbottaApolloLogger(Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 140
    new-instance v0, Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;

    invoke-interface {p0}, Lcom/ibotta/android/profile/BuildProfile;->isDebugApolloLogging()Z

    move-result p0

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;-><init>(Z)V

    return-object v0
.end method

.method public static provideMappers(Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ModuleMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;Lcom/ibotta/android/graphql/mapper/DealMapper;Lcom/ibotta/android/graphql/mapper/EngagementMapper;Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;)Lcom/ibotta/android/graphql/mapper/Mappers;
    .locals 16
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 159
    new-instance v15, Lcom/ibotta/android/graphql/mapper/Mappers;

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v0 .. v14}, Lcom/ibotta/android/graphql/mapper/Mappers;-><init>(Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ModuleMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;Lcom/ibotta/android/graphql/mapper/DealMapper;Lcom/ibotta/android/graphql/mapper/EngagementMapper;Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;)V

    return-object v15
.end method

.method public static provideModuleMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;)Lcom/ibotta/android/graphql/mapper/ModuleMapper;
    .locals 10
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 327
    new-instance v9, Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;)V

    return-object v9
.end method

.method public static provideNormalizedCache(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;)Lcom/ibotta/android/graphql/cache/IbottaApolloCache;
    .locals 0
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 130
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;->getCache()Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-result-object p0

    return-object p0
.end method

.method public static provideNormalizedCacheFactory(Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 112
    invoke-static {p0}, Ljava9/util/Sets;->of(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    .line 114
    new-instance v0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;-><init>(Ljava/util/Set;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-object v0
.end method

.method public static provideOfferCategoryMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferMapper;)Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 288
    new-instance v0, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferMapper;)V

    return-object v0
.end method

.method public static provideOfferCategoryWithReferencesMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 293
    new-instance v0, Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideOfferEvictionPolicy(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 120
    new-instance v0, Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideOfferMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RewardMapper;Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;)Lcom/ibotta/android/graphql/mapper/OfferMapper;
    .locals 7
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 216
    new-instance v6, Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/graphql/mapper/OfferMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RewardMapper;Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;)V

    return-object v6
.end method

.method public static provideOfferRewardQuestionMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OptionMapper;)Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 244
    new-instance v0, Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OptionMapper;)V

    return-object v0
.end method

.method public static provideOptionMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/OptionMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 249
    new-instance v0, Lcom/ibotta/android/graphql/mapper/OptionMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/OptionMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideProductGroupMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 238
    new-instance v0, Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideProductMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/ProductMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 314
    new-instance v0, Lcom/ibotta/android/graphql/mapper/ProductMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/ProductMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideQuestMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/QuestMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 273
    new-instance v0, Lcom/ibotta/android/graphql/mapper/QuestMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/QuestMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideRetailerBarcodeConfigurationMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;)Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 201
    new-instance v0, Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;)V

    return-object v0
.end method

.method public static provideRetailerBarcodeScanTypeMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 195
    new-instance v0, Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideRetailerCategoryMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 298
    new-instance v0, Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideRetailerCategoryNodeMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;)Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 393
    new-instance v0, Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;)V

    return-object v0
.end method

.method public static provideRetailerMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/RetailerMapper;
    .locals 8
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 184
    new-instance v7, Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)V

    return-object v7
.end method

.method public static provideRetailerNodeMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 371
    new-instance v0, Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideRetailerRedemptionMetaMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 206
    new-instance v0, Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideRewardMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)Lcom/ibotta/android/graphql/mapper/RewardMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 233
    new-instance v0, Lcom/ibotta/android/graphql/mapper/RewardMapper;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/graphql/mapper/RewardMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)V

    return-object v0
.end method

.method public static provideSortResultMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/SortResultMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 283
    new-instance v0, Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/SortResultMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method
