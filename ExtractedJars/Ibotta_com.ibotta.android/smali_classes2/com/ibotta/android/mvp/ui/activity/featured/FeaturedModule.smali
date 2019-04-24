.class public Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "FeaturedModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;",
        ">;"
    }
.end annotation


# instance fields
.field private final activity:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;Landroid/app/Activity;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 77
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;->activity:Landroid/app/Activity;

    return-void
.end method

.method public static provideFeaturedReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/featured/FeaturedReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 82
    new-instance v0, Lcom/ibotta/android/featured/FeaturedReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/featured/FeaturedReducer;-><init>(Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v0
.end method


# virtual methods
.method public provideApp()Lcom/ibotta/android/App;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 87
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    return-object v0
.end method

.method public provideAppRater(Lcom/appboy/Appboy;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/AppRater;
    .locals 8
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 200
    new-instance v7, Lcom/ibotta/android/AppRater;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;->activity:Landroid/app/Activity;

    move-object v2, v1

    check-cast v2, Lcom/ibotta/android/activity/CompatSupplier;

    move-object v0, v7

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/AppRater;-><init>(Landroid/content/Context;Lcom/ibotta/android/activity/CompatSupplier;Lcom/appboy/Appboy;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/Tracker;)V

    return-object v7
.end method

.method public provideCurrentBalanceActionProvider()Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;
    .locals 2
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 205
    new-instance v0, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public provideCurrentBalanceReducer(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/featured/CurrentBalanceReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 210
    new-instance v0, Lcom/ibotta/android/featured/CurrentBalanceReducer;

    invoke-direct {v0, p1}, Lcom/ibotta/android/featured/CurrentBalanceReducer;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public provideDeferredDeepLinkManager(Lcom/ibotta/android/state/user/auth/AuthManager;)Lcom/ibotta/android/routing/DeferredDeepLinkManager;
    .locals 2
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 189
    new-instance v0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/routing/DeferredDeepLinkManager;-><init>(Landroid/app/Activity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    return-object v0
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/state/app/cache/AppCacheState;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/state/app/pojo/AppsFlyerState;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/featured/FeaturedReducer;Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;Lcom/ibotta/android/permissions/PermissionsHelper;Lcom/ibotta/android/featured/CurrentBalanceReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;
    .locals 40
    .param p20    # Lcom/ibotta/android/search/AsyncSuggestedSearchService;
        .annotation runtime Ljavax/inject/Named;
            value = "AsyncUnifiedService"
        .end annotation
    .end param
    .param p23    # Lcom/ibotta/android/tracking/EventContextProvider;
        .annotation runtime Ljavax/inject/Named;
            value = "FeaturedEventContextProvider"
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v11, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

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

    move-object/from16 v24, p24

    move-object/from16 v25, p25

    move-object/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p28

    move-object/from16 v29, p29

    move-object/from16 v30, p30

    move-object/from16 v31, p31

    move-object/from16 v32, p32

    move-object/from16 v33, p33

    move-object/from16 v34, p34

    move-object/from16 v35, p35

    move-object/from16 v36, p36

    move-object/from16 v37, p37

    move-object/from16 v38, p38

    .line 131
    new-instance v39, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;

    move-object/from16 v0, v39

    invoke-direct/range {v0 .. v38}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/state/app/cache/AppCacheState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/state/app/pojo/AppsFlyerState;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/featured/FeaturedReducer;Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;Lcom/ibotta/android/permissions/PermissionsHelper;Lcom/ibotta/android/featured/CurrentBalanceReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)V

    return-object v39
.end method

.method public provideNotificationActionProvider(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/fragment/home/NotificationActionProvider;
    .locals 2
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 195
    new-instance v0, Lcom/ibotta/android/fragment/home/NotificationActionProvider;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1, p1, p2}, Lcom/ibotta/android/fragment/home/NotificationActionProvider;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    return-object v0
.end method

.method public providePermissionsHelper(Lcom/ibotta/android/permissions/PermissionsHelperFactory;)Lcom/ibotta/android/permissions/PermissionsHelper;
    .locals 2
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;->activity:Landroid/app/Activity;

    check-cast v0, Lcom/ibotta/android/mvp/base/MvpActivity;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/ibotta/android/permissions/PermissionsHelperFactory;->createLocationPermissionsHelper(Landroid/support/v4/app/FragmentActivity;Lcom/ibotta/android/permissions/PermissionsListener;)Lcom/ibotta/android/permissions/PermissionsHelper;

    move-result-object p1

    return-object p1
.end method

.method public provideScrollingBottomSpace()Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
    .locals 2
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 174
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;-><init>()V

    const/4 v1, 0x1

    .line 175
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;->bottomNavDisappears(Z)Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;

    move-result-object v0

    .line 176
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;->build()Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    move-result-object v0

    return-object v0
.end method

.method public providesAccountTracking(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;
    .locals 1
    .param p2    # Lcom/ibotta/android/tracking/EventContextProvider;
        .annotation runtime Ljavax/inject/Named;
            value = "FeaturedEventContextProvider"
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 184
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object v0
.end method
