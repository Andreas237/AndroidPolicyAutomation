.class public Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;
.super Ljava/lang/Object;
.source "CacheClearRunnableFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/appcache/CacheClearRunnableFactory;


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private final cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

.field private final context:Landroid/content/Context;

.field private final handler:Landroid/os/Handler;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->context:Landroid/content/Context;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->handler:Landroid/os/Handler;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 36
    iput-object p5, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 37
    iput-object p6, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    .line 38
    iput-object p7, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-void
.end method

.method public static synthetic lambda$createFor$0(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearHome(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$1(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 2

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearOffers(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$10(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomerGiftCards(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$11(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearNotifications()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$12(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearPendingNotifications()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$13(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearSocialOffers(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$14(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 2

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomer(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$15(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomerFriends()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$16(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomerEarning()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$17(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v1, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forModules()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V

    return-void
.end method

.method public static synthetic lambda$createFor$18(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v1, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forBuyableGiftCards()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v1, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forOfferCategoriesContainer()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V

    return-void
.end method

.method public static synthetic lambda$createFor$2(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 2

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearStores(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$3(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearRetailersPending(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$4(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomerAccounts(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$5(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 2

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomerLoyalties(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$6(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 2

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomerSettings(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public static synthetic lambda$createFor$7(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearBonuses()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method static synthetic lambda$createFor$8()V
    .locals 0

    return-void
.end method

.method public static synthetic lambda$createFor$9(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V
    .locals 2

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearGiftCards(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method


# virtual methods
.method public createFor(Lcom/ibotta/android/appcache/CacheMask;)Ljava/lang/Runnable;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 45
    sget-object v0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl$1;->$SwitchMap$com$ibotta$android$appcache$CacheMask:[I

    invoke-virtual {p1}, Lcom/ibotta/android/appcache/CacheMask;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    goto/16 :goto_0

    .line 101
    :pswitch_0
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$HiGpjVge8ZyoPPQ7kPP37bupPaM;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$HiGpjVge8ZyoPPQ7kPP37bupPaM;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto/16 :goto_0

    .line 98
    :pswitch_1
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$J5pw_t2EDxQej7G9_NafD0ov1y4;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$J5pw_t2EDxQej7G9_NafD0ov1y4;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto/16 :goto_0

    .line 95
    :pswitch_2
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$6TwCTT3ro-2h1CDnET8tV1yN39M;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$6TwCTT3ro-2h1CDnET8tV1yN39M;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 92
    :pswitch_3
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$cbts8LeYyOVtNBR8K-or7cyY2ik;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$cbts8LeYyOVtNBR8K-or7cyY2ik;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 89
    :pswitch_4
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$Xo-dA32i9a8WaVrCcFTq0jIHntg;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$Xo-dA32i9a8WaVrCcFTq0jIHntg;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 86
    :pswitch_5
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$PPaqyhznCoGw8cCf8zF5WSNF0wY;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$PPaqyhznCoGw8cCf8zF5WSNF0wY;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 83
    :pswitch_6
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$556zGL3Fg3pCjjEInQ9Dm5a5BXI;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$556zGL3Fg3pCjjEInQ9Dm5a5BXI;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 80
    :pswitch_7
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$gpDyUugHCXTA5XxYwT0cWxdQV2k;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$gpDyUugHCXTA5XxYwT0cWxdQV2k;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 77
    :pswitch_8
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$e3OGV5_uyUGyGbdmr7pgZ680Jsw;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$e3OGV5_uyUGyGbdmr7pgZ680Jsw;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 74
    :pswitch_9
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$sQK69Lsd4hZ-ko51f3lh4xBMJFM;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$sQK69Lsd4hZ-ko51f3lh4xBMJFM;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 71
    :pswitch_a
    sget-object p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$X6-ABuquTHT7a-AjmGo7fGkrSR8;->INSTANCE:Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$X6-ABuquTHT7a-AjmGo7fGkrSR8;

    goto :goto_0

    .line 68
    :pswitch_b
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$l_OxmBZndC0FVShRHzdinGdN8JE;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$l_OxmBZndC0FVShRHzdinGdN8JE;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 65
    :pswitch_c
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$qA3rrXN95y803GjIyHzepuQpvGI;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$qA3rrXN95y803GjIyHzepuQpvGI;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 62
    :pswitch_d
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$nzNpAu8GVko2aYDdwPLID_4tsc0;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$nzNpAu8GVko2aYDdwPLID_4tsc0;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 59
    :pswitch_e
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$naCXUAxiaczop39lF56YdVDhWDc;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$naCXUAxiaczop39lF56YdVDhWDc;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 56
    :pswitch_f
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$zLDCDE5fooQVzUZn88c92FPFKoM;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$zLDCDE5fooQVzUZn88c92FPFKoM;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 53
    :pswitch_10
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$xlfxYQRi0g17qtt4aXUpO5iKFDA;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$xlfxYQRi0g17qtt4aXUpO5iKFDA;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 50
    :pswitch_11
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$v61R3YJs4plkHana8wP0cWNfDAs;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$v61R3YJs4plkHana8wP0cWNfDAs;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    goto :goto_0

    .line 47
    :pswitch_12
    new-instance p1, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$9GQrfrDOwE1rsR2W5Tq4w1gJE_w;

    invoke-direct {p1, p0}, Lcom/ibotta/android/appcache/-$$Lambda$CacheClearRunnableFactoryImpl$9GQrfrDOwE1rsR2W5Tq4w1gJE_w;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;)V

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public createFor(Ljava/util/List;)Ljava/lang/Runnable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;)",
            "Ljava/lang/Runnable;"
        }
    .end annotation

    .line 116
    new-instance v6, Lcom/ibotta/android/appcache/ClearGroupRunnable;

    iget-object v1, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->handler:Landroid/os/Handler;

    iget-object v3, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    iget-object v4, p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/appcache/ClearGroupRunnable;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/appcache/AppCache;Ljava/util/List;)V

    return-object v6
.end method
