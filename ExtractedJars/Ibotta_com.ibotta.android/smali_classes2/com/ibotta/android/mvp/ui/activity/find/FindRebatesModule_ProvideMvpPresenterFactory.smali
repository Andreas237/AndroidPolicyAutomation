.class public final Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "FindRebatesModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final accountTrackingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;",
            ">;"
        }
    .end annotation
.end field

.field private final apiWorkSubmitterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;"
        }
    .end annotation
.end field

.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final asyncRecentSearchServiceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncRecentSearchService;",
            ">;"
        }
    .end annotation
.end field

.field private final asyncSuggestedSearchServiceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;",
            ">;"
        }
    .end annotation
.end field

.field private final contentHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/content/ContentHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final contentMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mappers/ContentMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final favoriteRetailersManagerFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final findRebatesEventContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final findRebatesReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/find/FindRebatesReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final loadRetailerCategoriesVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final loadRetailersVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final recentlyViewedRetailersServiceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerCategoriesReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/categories/RetailerCategoriesReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerHorizListReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final searchAsyncProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/async/SearchAsync;",
            ">;"
        }
    .end annotation
.end field

.field private final searchReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/SearchReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final searchResultsReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/reducers/search/SearchResultsReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final suggestedSearchItemsReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/SuggestedSearchItemsReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final trackingQueueProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;"
        }
    .end annotation
.end field

.field private final userStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/async/SearchAsync;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncRecentSearchService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/reducers/search/SearchResultsReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mappers/ContentMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/content/ContentHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/SearchReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/SuggestedSearchItemsReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/find/FindRebatesReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/categories/RetailerCategoriesReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 110
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;

    move-object v1, p2

    .line 111
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    move-object v1, p3

    .line 112
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    move-object v1, p4

    .line 113
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->searchAsyncProvider:Ljavax/inject/Provider;

    move-object v1, p5

    .line 114
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    move-object v1, p6

    .line 115
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    move-object v1, p7

    .line 116
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->favoriteRetailersManagerFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p8

    .line 117
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->asyncRecentSearchServiceProvider:Ljavax/inject/Provider;

    move-object v1, p9

    .line 118
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->asyncSuggestedSearchServiceProvider:Ljavax/inject/Provider;

    move-object v1, p10

    .line 119
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    move-object v1, p11

    .line 120
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->loadRetailerCategoriesVariantProvider:Ljavax/inject/Provider;

    move-object v1, p12

    .line 121
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->trackingQueueProvider:Ljavax/inject/Provider;

    move-object v1, p13

    .line 122
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->findRebatesEventContextProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p14

    .line 123
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->accountTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p15

    .line 124
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->searchResultsReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p16

    .line 125
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->contentMapperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p17

    .line 126
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->contentHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p18

    .line 127
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->searchReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p19

    .line 128
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->suggestedSearchItemsReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p20

    .line 129
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->findRebatesReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p21

    .line 130
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->retailerHorizListReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p22

    .line 131
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->retailerCategoriesReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p23

    .line 132
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->recentlyViewedRetailersServiceProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p24

    .line 133
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/async/SearchAsync;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncRecentSearchService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/reducers/search/SearchResultsReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mappers/ContentMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/content/ContentHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/SearchReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/SuggestedSearchItemsReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/find/FindRebatesReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/categories/RetailerCategoriesReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

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

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    .line 242
    new-instance v25, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;

    move-object/from16 v0, v25

    invoke-direct/range {v0 .. v24}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v25
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/async/SearchAsync;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncRecentSearchService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/AsyncSuggestedSearchService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/reducers/search/SearchResultsReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mappers/ContentMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/content/ContentHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/SearchReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/SuggestedSearchItemsReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/find/FindRebatesReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/categories/RetailerCategoriesReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 192
    invoke-interface/range {p1 .. p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 193
    invoke-interface/range {p2 .. p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/util/AppHelper;

    .line 194
    invoke-interface/range {p3 .. p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/search/async/SearchAsync;

    .line 195
    invoke-interface/range {p4 .. p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 196
    invoke-interface/range {p5 .. p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 197
    invoke-interface/range {p6 .. p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 198
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/search/AsyncRecentSearchService;

    .line 199
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    .line 200
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 201
    invoke-interface/range {p10 .. p10}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    .line 202
    invoke-interface/range {p11 .. p11}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 203
    invoke-interface/range {p12 .. p12}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/ibotta/android/tracking/EventContextProvider;

    .line 204
    invoke-interface/range {p13 .. p13}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    .line 205
    invoke-interface/range {p14 .. p14}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/ibotta/android/reducers/search/SearchResultsReducer;

    .line 206
    invoke-interface/range {p15 .. p15}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/ibotta/android/mappers/ContentMapper;

    .line 207
    invoke-interface/range {p16 .. p16}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/ibotta/android/util/content/ContentHelper;

    .line 208
    invoke-interface/range {p17 .. p17}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/ibotta/android/search/SearchReducer;

    .line 209
    invoke-interface/range {p18 .. p18}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;

    .line 210
    invoke-interface/range {p19 .. p19}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/ibotta/android/find/FindRebatesReducer;

    .line 211
    invoke-interface/range {p20 .. p20}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    .line 212
    invoke-interface/range {p21 .. p21}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Lcom/ibotta/android/categories/RetailerCategoriesReducer;

    .line 213
    invoke-interface/range {p22 .. p22}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;

    .line 214
    invoke-interface/range {p23 .. p23}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Lcom/ibotta/android/state/user/UserState;

    .line 190
    invoke-static/range {v0 .. v23}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/find/FindRebatesReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/categories/RetailerCategoriesReducer;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/find/FindRebatesReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/categories/RetailerCategoriesReducer;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;
    .locals 2

    .line 295
    invoke-virtual/range {p0 .. p23}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/find/FindRebatesReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/categories/RetailerCategoriesReducer;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 294
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;
    .locals 26

    move-object/from16 v0, p0

    .line 138
    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;

    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->searchAsyncProvider:Ljavax/inject/Provider;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->favoriteRetailersManagerFactoryProvider:Ljavax/inject/Provider;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->asyncRecentSearchServiceProvider:Ljavax/inject/Provider;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->asyncSuggestedSearchServiceProvider:Ljavax/inject/Provider;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    iget-object v11, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->loadRetailerCategoriesVariantProvider:Ljavax/inject/Provider;

    iget-object v12, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->trackingQueueProvider:Ljavax/inject/Provider;

    iget-object v13, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->findRebatesEventContextProvider:Ljavax/inject/Provider;

    iget-object v14, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->accountTrackingProvider:Ljavax/inject/Provider;

    iget-object v15, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->searchResultsReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->contentMapperProvider:Ljavax/inject/Provider;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->contentHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->searchReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->suggestedSearchItemsReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->findRebatesReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->retailerHorizListReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->retailerCategoriesReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->recentlyViewedRetailersServiceProvider:Ljavax/inject/Provider;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    move-object/from16 v24, v1

    move-object/from16 v1, v25

    invoke-static/range {v1 .. v24}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 31
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;

    move-result-object v0

    return-object v0
.end method
