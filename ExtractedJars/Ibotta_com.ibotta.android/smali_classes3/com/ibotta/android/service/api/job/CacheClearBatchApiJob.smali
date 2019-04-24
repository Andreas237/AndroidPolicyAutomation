.class public Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
.super Lcom/ibotta/android/service/api/job/BatchApiJob;
.source "CacheClearBatchApiJob.java"


# instance fields
.field private final apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 40
    invoke-direct {p0, v0}, Lcom/ibotta/android/service/api/job/BatchApiJob;-><init>(I)V

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 42
    iput-object p2, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 43
    iput-object p3, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 44
    iput-object p4, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    .line 45
    iput-object p5, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    return-void
.end method

.method private getCustomerId()I
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v0

    return v0
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    invoke-interface {v0, p0}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public clearBonuses()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 5

    const/4 v0, 0x1

    .line 95
    new-array v0, v0, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob;

    iget-object v2, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    iget-object v3, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v4, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-direct {v1, v2, v3, v4}, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearCustomer(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 4

    .line 71
    new-instance v0, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    invoke-direct {p0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->getCustomerId()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    const/4 v1, 0x1

    .line 72
    new-array v1, v1, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v3, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-direct {v2, v3, v0, p1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 p1, 0x0

    aput-object v2, v1, p1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearCustomerAccounts(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 4

    .line 77
    new-instance v0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;

    invoke-direct {p0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->getCustomerId()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;-><init>(I)V

    const/4 v1, 0x1

    .line 78
    new-array v1, v1, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v3, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-direct {v2, v3, v0, p1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 p1, 0x0

    aput-object v2, v1, p1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearCustomerEarning()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 5

    .line 141
    new-instance v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;-><init>()V

    const/4 v1, 0x1

    .line 142
    new-array v2, v1, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v3, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v4, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-direct {v3, v4, v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 v0, 0x0

    aput-object v3, v2, v0

    invoke-virtual {p0, v2}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearCustomerFriends()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 5

    const/4 v0, 0x1

    .line 112
    new-array v0, v0, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob;

    iget-object v2, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    iget-object v3, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v4, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-direct {v1, v2, v3, v4}, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearCustomerGiftCards(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 4

    .line 89
    new-instance v0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardsCall;

    invoke-direct {p0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->getCustomerId()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardsCall;-><init>(I)V

    const/4 v1, 0x1

    .line 90
    new-array v1, v1, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v3, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-direct {v2, v3, v0, p1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 p1, 0x0

    aput-object v2, v1, p1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearCustomerLoyalties(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 4

    .line 83
    new-instance v0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesCall;

    invoke-direct {p0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->getCustomerId()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesCall;-><init>(I)V

    const/4 v1, 0x1

    .line 84
    new-array v1, v1, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v3, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-direct {v2, v3, v0, p1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 p1, 0x0

    aput-object v2, v1, p1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearCustomerSettings(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 4

    .line 106
    new-instance v0, Lcom/ibotta/api/call/customer/CustomerSettingsCall;

    invoke-direct {p0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->getCustomerId()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/ibotta/api/call/customer/CustomerSettingsCall;-><init>(I)V

    const/4 v1, 0x1

    .line 107
    new-array v1, v1, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v3, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-direct {v2, v3, v0, p1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 p1, 0x0

    aput-object v2, v1, p1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearGiftCards(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 4

    .line 100
    new-instance v0, Lcom/ibotta/api/call/card/GiftCardsCall;

    invoke-direct {v0}, Lcom/ibotta/api/call/card/GiftCardsCall;-><init>()V

    const/4 v1, 0x1

    .line 101
    new-array v1, v1, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v3, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-direct {v2, v3, v0, p1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 p1, 0x0

    aput-object v2, v1, p1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearHome(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 4

    const/4 v0, 0x1

    .line 49
    new-array v0, v0, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v2, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v3, Lcom/ibotta/api/call/home/HomeCall;

    invoke-direct {v3}, Lcom/ibotta/api/call/home/HomeCall;-><init>()V

    invoke-direct {v1, v2, v3, p1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearMyRebates()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 5

    .line 135
    new-instance v0, Lcom/ibotta/api/call/offer/MyRebatesCall;

    invoke-direct {v0}, Lcom/ibotta/api/call/offer/MyRebatesCall;-><init>()V

    const/4 v1, 0x1

    .line 136
    new-array v2, v1, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v3, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v4, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-direct {v3, v4, v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 v0, 0x0

    aput-object v3, v2, v0

    invoke-virtual {p0, v2}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearNotifications()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 5

    .line 117
    new-instance v0, Lcom/ibotta/android/notification/call/NotificationsCall;

    invoke-direct {v0}, Lcom/ibotta/android/notification/call/NotificationsCall;-><init>()V

    const/4 v1, 0x1

    .line 118
    new-array v2, v1, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v3, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v4, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-direct {v3, v4, v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 v0, 0x0

    aput-object v3, v2, v0

    invoke-virtual {p0, v2}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearOffers(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 5

    const/4 v0, 0x1

    .line 55
    new-array v0, v0, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v2, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v3, Lcom/ibotta/api/call/offer/CombinedOffersCall;

    invoke-direct {p0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->getCustomerId()I

    move-result v4

    invoke-direct {v3, v4}, Lcom/ibotta/api/call/offer/CombinedOffersCall;-><init>(I)V

    invoke-direct {v1, v2, v3, p1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearPendingNotifications()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 5

    .line 123
    new-instance v0, Lcom/ibotta/android/notification/call/PendingNotificationsCall;

    invoke-direct {v0}, Lcom/ibotta/android/notification/call/PendingNotificationsCall;-><init>()V

    const/4 v1, 0x1

    .line 124
    new-array v2, v1, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v3, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v4, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-direct {v3, v4, v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 v0, 0x0

    aput-object v3, v2, v0

    invoke-virtual {p0, v2}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearRetailersPending(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 4

    const/4 v0, 0x1

    .line 66
    new-array v0, v0, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v2, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v3, Lcom/ibotta/api/call/retailer/RetailersPendingCall;

    invoke-direct {v3}, Lcom/ibotta/api/call/retailer/RetailersPendingCall;-><init>()V

    invoke-direct {v1, v2, v3, p1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearSocialOffers(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 4

    .line 60
    new-instance v0, Lcom/ibotta/api/call/offer/SocialOffersCall;

    invoke-direct {v0}, Lcom/ibotta/api/call/offer/SocialOffersCall;-><init>()V

    const/4 v1, 0x1

    .line 61
    new-array v1, v1, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v3, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-direct {v2, v3, v0, p1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 p1, 0x0

    aput-object v2, v1, p1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method

.method public clearStores(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 4

    .line 129
    new-instance v0, Lcom/ibotta/api/call/store/StoresCall;

    invoke-direct {v0}, Lcom/ibotta/api/call/store/StoresCall;-><init>()V

    const/4 v1, 0x1

    .line 130
    new-array v1, v1, [Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    iget-object v3, p0, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-direct {v2, v3, v0, p1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V

    const/4 p1, 0x0

    aput-object v2, v1, p1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object p0
.end method
