.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "MyOffersModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;
    .locals 12
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 48
    new-instance v11, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;

    move-object v0, v11

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v11
.end method

.method public provideScrollingBottomSpace()Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 63
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;->build()Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    move-result-object v0

    return-object v0
.end method

.method public providesAccountTracking(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;
    .locals 1
    .param p2    # Lcom/ibotta/android/tracking/EventContextProvider;
        .annotation runtime Ljavax/inject/Named;
            value = "MyRebatesEventContextProvider"
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 71
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object v0
.end method
