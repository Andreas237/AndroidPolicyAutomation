.class public Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "RedeemReqsModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method

.method public static provideRedeemReqsReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 33
    new-instance v0, Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;-><init>(Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v0
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;Lcom/ibotta/android/windfall/helper/WindfallHelper;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;
    .locals 14
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 50
    new-instance v13, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;

    move-object v0, v13

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;Lcom/ibotta/android/windfall/helper/WindfallHelper;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;)V

    return-object v13
.end method

.method public provideWindfallRecognizerCallback()Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 67
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallbackImpl;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallbackImpl;-><init>()V

    return-object v0
.end method
