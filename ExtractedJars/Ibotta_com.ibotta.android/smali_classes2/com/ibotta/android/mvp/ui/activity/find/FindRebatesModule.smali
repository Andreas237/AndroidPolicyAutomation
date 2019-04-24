.class public Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "FindRebatesModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method

.method public static provideFindRebatesReducer(Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)Lcom/ibotta/android/find/FindRebatesReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 52
    new-instance v0, Lcom/ibotta/android/find/FindRebatesReducer;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/find/FindRebatesReducer;-><init>(Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)V

    return-object v0
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/find/FindRebatesReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/categories/RetailerCategoriesReducer;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;
    .locals 25
    .param p8    # Lcom/ibotta/android/search/AsyncSuggestedSearchService;
        .annotation runtime Ljavax/inject/Named;
            value = "AsyncUnifiedService"
        .end annotation
    .end param
    .param p12    # Lcom/ibotta/android/tracking/EventContextProvider;
        .annotation runtime Ljavax/inject/Named;
            value = "FindRebatesEventContextProvider"
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v5, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move-object/from16 v23, p23

    .line 81
    new-instance v24, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;

    move-object/from16 v0, v24

    invoke-direct/range {v0 .. v23}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/find/FindRebatesReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/categories/RetailerCategoriesReducer;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;Lcom/ibotta/android/state/user/UserState;)V

    return-object v24
.end method

.method public provideScrollingBottomSpace()Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 109
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
            value = "FindRebatesEventContextProvider"
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 117
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object v0
.end method
