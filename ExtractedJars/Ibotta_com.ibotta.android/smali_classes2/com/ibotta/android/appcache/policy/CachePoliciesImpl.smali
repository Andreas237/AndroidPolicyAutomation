.class public Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;
.super Ljava/lang/Object;
.source "CachePoliciesImpl.java"

# interfaces
.implements Lcom/ibotta/android/appcache/policy/CachePolicies;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final FIVE_MINUTES:J

.field private static final FOUR_HOURS:J

.field private static final ONE_DAY:J

.field private static final ONE_HOUR:J

.field private static final ONE_WEEK:J

.field private static final TEN_MINUTES:J

.field private static final TWELVE_HOURS:J


# instance fields
.field private final cacheInvalidators:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/api/CacheableApiCall;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/appcache/InvalidationCriteria;",
            ">;>;"
        }
    .end annotation
.end field

.field private final cachePolicies:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/api/CacheableApiCall;",
            ">;",
            "Lcom/ibotta/api/CachePolicy;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 59
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->FIVE_MINUTES:J

    .line 60
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->TEN_MINUTES:J

    .line 61
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    sput-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    .line 62
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x4

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    sput-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->FOUR_HOURS:J

    .line 63
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0xc

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    sput-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->TWELVE_HOURS:J

    .line 64
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_DAY:J

    .line 65
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x7

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_WEEK:J

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    .line 69
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cacheInvalidators:Ljava/util/Map;

    return-void
.end method

.method private addCacheInvalidator(Lcom/ibotta/android/appcache/InvalidationCriteria;)V
    .locals 4

    .line 129
    invoke-interface {p1}, Lcom/ibotta/android/appcache/InvalidationCriteria;->getCacheableScopes()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 130
    invoke-interface {p1}, Lcom/ibotta/android/appcache/InvalidationCriteria;->getCacheableScopes()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    .line 131
    iget-object v2, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cacheInvalidators:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_0

    .line 133
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 134
    iget-object v3, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cacheInvalidators:Ljava/util/Map;

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    :cond_0
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public getCacheInvalidators(Lcom/ibotta/api/CacheableApiCall;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/CacheableApiCall;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/appcache/InvalidationCriteria;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cacheInvalidators:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lcom/ibotta/api/CacheableApiCall;",
            ">(TC;)",
            "Lcom/ibotta/api/CachePolicy;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/CachePolicy;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public init()V
    .locals 12

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/home/HomeCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->TWELVE_HOURS:J

    const/4 v5, 0x1

    invoke-direct {v2, v3, v4, v5, v5}, Lcom/ibotta/api/CachePolicyImpl;-><init>(JZZ)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/api/offer/FilteredOfferProductsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->FOUR_HOURS:J

    invoke-direct {v2, v3, v4, v5, v5}, Lcom/ibotta/api/CachePolicyImpl;-><init>(JZZ)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/offer/CombinedOffersCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->TWELVE_HOURS:J

    const/4 v6, 0x0

    invoke-direct {v2, v3, v4, v6, v6}, Lcom/ibotta/api/CachePolicyImpl;-><init>(JZZ)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/store/StoresCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v7, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->TWELVE_HOURS:J

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v11}, Lcom/ibotta/api/CachePolicyImpl;-><init>(JZZLjava/lang/Integer;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/retailer/RetailerByIdCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/retailer/RetailersPendingCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->FIVE_MINUTES:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_DAY:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltyByIdCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/CustomerSettingsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->TEN_MINUTES:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_DAY:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/friends/CustomerFriendsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->TWELVE_HOURS:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/bonuses/BonusesCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_DAY:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/bonuses/BonusByIdCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->TEN_MINUTES:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/config/ConfigCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->TEN_MINUTES:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/config/ConfigVersionCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/card/GiftCardsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_DAY:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/card/GiftCardByIdCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardByIdCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/notification/call/NotificationsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v7, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    const/16 v3, 0x14

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v9, 0x1

    move-object v6, v2

    invoke-direct/range {v6 .. v11}, Lcom/ibotta/api/CachePolicyImpl;-><init>(JZZLjava/lang/Integer;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/notification/call/PendingNotificationsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v7, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    const/4 v4, 0x5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    move-object v6, v2

    invoke-direct/range {v6 .. v11}, Lcom/ibotta/api/CachePolicyImpl;-><init>(JZZLjava/lang/Integer;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v7, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    move-object v6, v2

    invoke-direct/range {v6 .. v11}, Lcom/ibotta/api/CachePolicyImpl;-><init>(JZZLjava/lang/Integer;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/offer/SocialOffersCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->TWELVE_HOURS:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/category/CategoryTermsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_WEEK:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_DAY:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->TEN_MINUTES:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/problem/OfferFeedbackCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_WEEK:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/offer/MyRebatesCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->FOUR_HOURS:J

    invoke-direct {v2, v3, v4, v5, v5}, Lcom/ibotta/api/CachePolicyImpl;-><init>(JZZ)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/sharing/AppMessagesCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_DAY:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/mvt/TestVariantsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->TEN_MINUTES:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_HOUR:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_DAY:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->TEN_MINUTES:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_DAY:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_DAY:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->cachePolicies:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/api/windfall/WindfallResultsCall;

    new-instance v2, Lcom/ibotta/api/CachePolicyImpl;

    sget-wide v3, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->ONE_DAY:J

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/CachePolicyImpl;-><init>(J)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
