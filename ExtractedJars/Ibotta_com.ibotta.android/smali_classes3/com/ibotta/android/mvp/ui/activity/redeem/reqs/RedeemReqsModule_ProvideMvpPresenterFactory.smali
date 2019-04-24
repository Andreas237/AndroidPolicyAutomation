.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "RedeemReqsModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final appCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;"
        }
    .end annotation
.end field

.field private final cacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final graphQLCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaApolloCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final offerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final redeemReqsReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final storageSiloStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/xprocess/StorageSiloState;",
            ">;"
        }
    .end annotation
.end field

.field private final verificationManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;"
        }
    .end annotation
.end field

.field private final windfallGatekeeperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;",
            ">;"
        }
    .end annotation
.end field

.field private final windfallHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/helper/WindfallHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final windfallRecognizerCallbackProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/xprocess/StorageSiloState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/helper/WindfallHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;",
            ">;)V"
        }
    .end annotation

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;

    .line 66
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 67
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->offerHelperProvider:Ljavax/inject/Provider;

    .line 68
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->verificationManagerProvider:Ljavax/inject/Provider;

    .line 69
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->storageSiloStateProvider:Ljavax/inject/Provider;

    .line 70
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->windfallGatekeeperProvider:Ljavax/inject/Provider;

    .line 71
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->windfallHelperProvider:Ljavax/inject/Provider;

    .line 72
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    .line 73
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 74
    iput-object p10, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->appCacheProvider:Ljavax/inject/Provider;

    .line 75
    iput-object p11, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->windfallRecognizerCallbackProvider:Ljavax/inject/Provider;

    .line 76
    iput-object p12, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->cacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    .line 77
    iput-object p13, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->redeemReqsReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/xprocess/StorageSiloState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/helper/WindfallHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 142
    new-instance v14, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;

    move-object v0, v14

    move-object v1, p0

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

    invoke-direct/range {v0 .. v13}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v14
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/xprocess/StorageSiloState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/helper/WindfallHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;"
        }
    .end annotation

    .line 114
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 115
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 116
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/verification/VerificationManager;

    .line 117
    invoke-interface/range {p4 .. p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/state/xprocess/StorageSiloState;

    .line 118
    invoke-interface/range {p5 .. p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

    .line 119
    invoke-interface/range {p6 .. p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/windfall/helper/WindfallHelper;

    .line 120
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 121
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 122
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/appcache/AppCache;

    .line 123
    invoke-interface/range {p10 .. p10}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;

    .line 124
    invoke-interface/range {p11 .. p11}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    .line 125
    invoke-interface/range {p12 .. p12}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;

    move-object p1, v0

    move-object p2, v1

    move-object p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    .line 112
    invoke-static/range {p0 .. p12}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;Lcom/ibotta/android/windfall/helper/WindfallHelper;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;Lcom/ibotta/android/windfall/helper/WindfallHelper;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;
    .locals 0

    .line 173
    invoke-virtual/range {p0 .. p12}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;Lcom/ibotta/android/windfall/helper/WindfallHelper;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 172
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;
    .locals 13

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->offerHelperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->verificationManagerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->storageSiloStateProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->windfallGatekeeperProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->windfallHelperProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->windfallRecognizerCallbackProvider:Ljavax/inject/Provider;

    iget-object v11, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->cacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    iget-object v12, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->redeemReqsReducerProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v12}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    move-result-object v0

    return-object v0
.end method
