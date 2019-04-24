.class public Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactoryImpl;
.super Ljava/lang/Object;
.source "CacheKeyMatcherFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final CACHE_KEY_ALSO_BOUGHT:Ljava/lang/String; = "alsoBought("

.field private static final CACHE_KEY_ALSO_VIEWED:Ljava/lang/String; = "alsoViewed("

.field private static final CACHE_KEY_ANY_BONUSES:Ljava/lang/String; = ".*(b|B)onus.*"

.field private static final CACHE_KEY_ANY_OFFERS:Ljava/lang/String; = ".*(o|O)ffer.*"

.field private static final CACHE_KEY_BUYABLE_GIFT_CARDS:Ljava/lang/String; = "buyableGiftCards("

.field private static final CACHE_KEY_MODULES:Ljava/lang/String; = "modules("

.field private static final CACHE_KEY_OFFER_CATEGORIES_CONTAINER:Ljava/lang/String; = "offerCategoriesContainer("

.field private static final CACHE_KEY_OFFER_TAG_OFFERS:Ljava/lang/String; = "offerTag("

.field private static final CACHE_KEY_RECENTLY_VIEWED:Ljava/lang/String; = "views.retailers("

.field private static final CACHE_KEY_RELATED_OFFERS:Ljava/lang/String; = "relatedOffers("

.field private static final CACHE_KEY_UNLOCKED_OFFER_CATEGORIES:Ljava/lang/String; = "unlockedOfferCategories("

.field private static final CACHE_KEY_UNLOCKED_OFFER_PAGES:Ljava/lang/String; = "unlockedOfferPages("


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public forAlsoBought()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 2

    .line 63
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;

    const-string v1, "alsoBought("

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public forAlsoViewed()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 2

    .line 68
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;

    const-string v1, "alsoViewed("

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public forAnyBonuses()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 2

    .line 48
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/RegexCacheKeyMatcher;

    const-string v1, ".*(b|B)onus.*"

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/cache/matchers/RegexCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public forAnyOffers()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 2

    .line 43
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/RegexCacheKeyMatcher;

    const-string v1, ".*(o|O)ffer.*"

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/cache/matchers/RegexCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public forBuyableGiftCards()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 2

    .line 88
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;

    const-string v1, "buyableGiftCards("

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public forModule(I)Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 1

    .line 38
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/ModuleCacheKeyMatcher;

    invoke-direct {v0, p1}, Lcom/ibotta/android/graphql/cache/matchers/ModuleCacheKeyMatcher;-><init>(I)V

    return-object v0
.end method

.method public forModules()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 2

    .line 33
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;

    const-string v1, "modules("

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public forOffer(I)Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 1

    .line 28
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;

    invoke-direct {v0, p1}, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;-><init>(I)V

    return-object v0
.end method

.method public forOfferCategoriesContainer()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 2

    .line 93
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;

    const-string v1, "offerCategoriesContainer("

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public forOfferTagSearch()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 2

    .line 78
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;

    const-string v1, "offerTag("

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public forRecentlyViewedRetailers()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 2

    .line 83
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;

    const-string v1, "views.retailers("

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public forRelatedOffers()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 2

    .line 73
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;

    const-string v1, "relatedOffers("

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public forUnlockedOfferCategories()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 2

    .line 58
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;

    const-string v1, "unlockedOfferCategories("

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public forUnlockedOfferPages()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;
    .locals 2

    .line 53
    new-instance v0, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;

    const-string v1, "unlockedOfferPages("

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
