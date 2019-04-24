.class public final Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "FeaturedModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;",
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

.field private final amountBadgeVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final apiJobFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
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

.field private final appCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;"
        }
    .end annotation
.end field

.field private final appCacheStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
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

.field private final appTimingTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final appsFlyerStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pojo/AppsFlyerState;",
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

.field private final brazeTrackingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
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

.field private final currentBalanceReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/featured/CurrentBalanceReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final favoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
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

.field private final featuredEventContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final featuredReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/featured/FeaturedReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final geofenceCoordinatorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
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

.field private final lifecycleTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/LifecycleTracker;",
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

.field private final module:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final permissionPrimersVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final permissionsHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelper;",
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

.field private final retailerIconOnOfferVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
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
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/async/SearchAsync;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/LifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pojo/AppsFlyerState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
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
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/featured/FeaturedReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/featured/CurrentBalanceReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 170
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;

    move-object v1, p2

    .line 171
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    move-object v1, p3

    .line 172
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    move-object v1, p4

    .line 173
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p5

    .line 174
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->apiJobFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p6

    .line 175
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->searchAsyncProvider:Ljavax/inject/Provider;

    move-object v1, p7

    .line 176
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->appCacheProvider:Ljavax/inject/Provider;

    move-object v1, p8

    .line 177
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    move-object v1, p9

    .line 178
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->appCacheStateProvider:Ljavax/inject/Provider;

    move-object v1, p10

    .line 179
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    move-object v1, p11

    .line 180
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    move-object v1, p12

    .line 181
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    move-object v1, p13

    .line 182
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->lifecycleTrackerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p14

    .line 183
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->appTimingTrackerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p15

    .line 184
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->favoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p16

    .line 185
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->favoriteRetailersManagerFactoryProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p17

    .line 186
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->brazeTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p18

    .line 187
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->appsFlyerStateProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p19

    .line 188
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->geofenceCoordinatorProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p20

    .line 189
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->asyncRecentSearchServiceProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p21

    .line 190
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->asyncSuggestedSearchServiceProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p22

    .line 191
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p23

    .line 192
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->trackingQueueProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p24

    .line 193
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->featuredEventContextProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p25

    .line 194
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->accountTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p26

    .line 195
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->searchResultsReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p27

    .line 196
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->contentMapperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p28

    .line 197
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->contentHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p29

    .line 198
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->searchReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p30

    .line 199
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->suggestedSearchItemsReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p31

    .line 200
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->cacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p32

    .line 201
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->featuredReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p33

    .line 202
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->permissionPrimersVariantProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p34

    .line 203
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->amountBadgeVariantProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p35

    .line 204
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->permissionsHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p36

    .line 205
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->currentBalanceReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p37

    .line 206
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->retailerHorizListReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p38

    .line 207
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->retailerIconOnOfferVariantProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p39

    .line 208
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->recentlyViewedRetailersServiceProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/async/SearchAsync;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/LifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pojo/AppsFlyerState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
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
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/featured/FeaturedReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/featured/CurrentBalanceReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;"
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

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v27, p26

    move-object/from16 v28, p27

    move-object/from16 v29, p28

    move-object/from16 v30, p29

    move-object/from16 v31, p30

    move-object/from16 v32, p31

    move-object/from16 v33, p32

    move-object/from16 v34, p33

    move-object/from16 v35, p34

    move-object/from16 v36, p35

    move-object/from16 v37, p36

    move-object/from16 v38, p37

    move-object/from16 v39, p38

    .line 377
    new-instance v40, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;

    move-object/from16 v0, v40

    invoke-direct/range {v0 .. v39}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v40
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/async/SearchAsync;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/LifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pojo/AppsFlyerState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
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
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/featured/FeaturedReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/featured/CurrentBalanceReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 297
    invoke-interface/range {p1 .. p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 298
    invoke-interface/range {p2 .. p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/state/user/UserState;

    .line 299
    invoke-interface/range {p3 .. p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 300
    invoke-interface/range {p4 .. p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 301
    invoke-interface/range {p5 .. p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/search/async/SearchAsync;

    .line 302
    invoke-interface/range {p6 .. p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/appcache/AppCache;

    .line 303
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 304
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 305
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 306
    invoke-interface/range {p10 .. p10}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ibotta/android/util/AppHelper;

    .line 307
    invoke-interface/range {p11 .. p11}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 308
    invoke-interface/range {p12 .. p12}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 309
    invoke-interface/range {p13 .. p13}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    .line 310
    invoke-interface/range {p14 .. p14}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    .line 311
    invoke-interface/range {p15 .. p15}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 312
    invoke-interface/range {p16 .. p16}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    .line 313
    invoke-interface/range {p17 .. p17}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

    .line 314
    invoke-interface/range {p18 .. p18}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    .line 315
    invoke-interface/range {p19 .. p19}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/ibotta/android/search/AsyncRecentSearchService;

    .line 316
    invoke-interface/range {p20 .. p20}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    .line 317
    invoke-interface/range {p21 .. p21}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 318
    invoke-interface/range {p22 .. p22}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 319
    invoke-interface/range {p23 .. p23}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Lcom/ibotta/android/tracking/EventContextProvider;

    .line 320
    invoke-interface/range {p24 .. p24}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    .line 321
    invoke-interface/range {p25 .. p25}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Lcom/ibotta/android/reducers/search/SearchResultsReducer;

    .line 322
    invoke-interface/range {p26 .. p26}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v26

    check-cast v26, Lcom/ibotta/android/mappers/ContentMapper;

    .line 323
    invoke-interface/range {p27 .. p27}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v27

    check-cast v27, Lcom/ibotta/android/util/content/ContentHelper;

    .line 324
    invoke-interface/range {p28 .. p28}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Lcom/ibotta/android/search/SearchReducer;

    .line 325
    invoke-interface/range {p29 .. p29}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v29

    check-cast v29, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;

    .line 326
    invoke-interface/range {p30 .. p30}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v30

    check-cast v30, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    .line 327
    invoke-interface/range {p31 .. p31}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v31

    check-cast v31, Lcom/ibotta/android/featured/FeaturedReducer;

    .line 328
    invoke-interface/range {p32 .. p32}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v32

    check-cast v32, Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;

    .line 329
    invoke-interface/range {p33 .. p33}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v33

    check-cast v33, Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;

    .line 330
    invoke-interface/range {p34 .. p34}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v34

    check-cast v34, Lcom/ibotta/android/permissions/PermissionsHelper;

    .line 331
    invoke-interface/range {p35 .. p35}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v35

    check-cast v35, Lcom/ibotta/android/featured/CurrentBalanceReducer;

    .line 332
    invoke-interface/range {p36 .. p36}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v36

    check-cast v36, Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    .line 333
    invoke-interface/range {p37 .. p37}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v37

    check-cast v37, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    .line 334
    invoke-interface/range {p38 .. p38}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v38

    check-cast v38, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;

    .line 295
    invoke-static/range {v0 .. v38}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/state/app/cache/AppCacheState;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/state/app/pojo/AppsFlyerState;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/featured/FeaturedReducer;Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;Lcom/ibotta/android/permissions/PermissionsHelper;Lcom/ibotta/android/featured/CurrentBalanceReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/state/app/cache/AppCacheState;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/state/app/pojo/AppsFlyerState;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/featured/FeaturedReducer;Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;Lcom/ibotta/android/permissions/PermissionsHelper;Lcom/ibotta/android/featured/CurrentBalanceReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;
    .locals 2

    .line 460
    invoke-virtual/range {p0 .. p38}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/state/app/cache/AppCacheState;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/state/app/pojo/AppsFlyerState;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/featured/FeaturedReducer;Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;Lcom/ibotta/android/permissions/PermissionsHelper;Lcom/ibotta/android/featured/CurrentBalanceReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 459
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;
    .locals 41

    move-object/from16 v0, p0

    .line 213
    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;

    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->apiJobFactoryProvider:Ljavax/inject/Provider;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->searchAsyncProvider:Ljavax/inject/Provider;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->appCacheStateProvider:Ljavax/inject/Provider;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    iget-object v11, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v12, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v13, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->lifecycleTrackerProvider:Ljavax/inject/Provider;

    iget-object v14, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->appTimingTrackerProvider:Ljavax/inject/Provider;

    iget-object v15, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->favoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;

    move-object/from16 v40, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->favoriteRetailersManagerFactoryProvider:Ljavax/inject/Provider;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->brazeTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->appsFlyerStateProvider:Ljavax/inject/Provider;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->geofenceCoordinatorProvider:Ljavax/inject/Provider;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->asyncRecentSearchServiceProvider:Ljavax/inject/Provider;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->asyncSuggestedSearchServiceProvider:Ljavax/inject/Provider;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->trackingQueueProvider:Ljavax/inject/Provider;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->featuredEventContextProvider:Ljavax/inject/Provider;

    move-object/from16 v24, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->accountTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->searchResultsReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v26, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->contentMapperProvider:Ljavax/inject/Provider;

    move-object/from16 v27, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->contentHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v28, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->searchReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v29, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->suggestedSearchItemsReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v30, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->cacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    move-object/from16 v31, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->featuredReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v32, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->permissionPrimersVariantProvider:Ljavax/inject/Provider;

    move-object/from16 v33, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->amountBadgeVariantProvider:Ljavax/inject/Provider;

    move-object/from16 v34, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->permissionsHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v35, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->currentBalanceReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v36, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->retailerHorizListReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v37, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->retailerIconOnOfferVariantProvider:Ljavax/inject/Provider;

    move-object/from16 v38, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->recentlyViewedRetailersServiceProvider:Ljavax/inject/Provider;

    move-object/from16 v39, v1

    move-object/from16 v1, v40

    invoke-static/range {v1 .. v39}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;

    move-result-object v0

    return-object v0
.end method
