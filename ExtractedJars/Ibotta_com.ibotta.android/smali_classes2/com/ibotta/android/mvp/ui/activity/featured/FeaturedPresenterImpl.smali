.class public Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;
.super Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;
.source "FeaturedPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;
.implements Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;",
        "Lcom/ibotta/android/notification/networking/MvpDataSourceCallback<",
        "Lcom/ibotta/android/notification/networking/model/NotificationsViewState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

.field private final amountBadgeVariant:Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;

.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final appCacheState:Lcom/ibotta/android/state/app/cache/AppCacheState;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

.field private final appsFlyerState:Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

.field private final brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

.field private final cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

.field private configJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private currentBalance:D

.field private final currentBalanceReducer:Lcom/ibotta/android/featured/CurrentBalanceReducer;

.field private customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private disableResetViewStates:Z

.field private favoriteRetailerIds:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

.field private final favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

.field private featuredDataLoadStartTime:J

.field private final featuredReducer:Lcom/ibotta/android/featured/FeaturedReducer;

.field private featuredRows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;"
        }
    .end annotation
.end field

.field private final geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

.field private final lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private modulesJob:Lcom/ibotta/android/service/api/job/ModulesApiJob;

.field private offerTag:Ljava/lang/String;

.field private final permissionPrimersVariant:Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;

.field private final permissionsHelper:Lcom/ibotta/android/permissions/PermissionsHelper;

.field private final retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

.field private final retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

.field private search:Ljava/lang/String;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/state/app/cache/AppCacheState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/state/app/pojo/AppsFlyerState;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/featured/FeaturedReducer;Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;Lcom/ibotta/android/permissions/PermissionsHelper;Lcom/ibotta/android/featured/CurrentBalanceReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)V
    .locals 18

    move-object/from16 v15, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p8

    move-object/from16 v2, p9

    move-object/from16 v4, p10

    move-object/from16 v5, p11

    move-object/from16 v12, p15

    move-object/from16 v6, p19

    move-object/from16 v7, p20

    move-object/from16 v8, p21

    move-object/from16 v9, p22

    move-object/from16 v10, p23

    move-object/from16 v11, p25

    move-object/from16 v13, p26

    move-object/from16 v14, p27

    move-object/from16 v15, p28

    move-object/from16 v16, p29

    move-object/from16 v17, p38

    .line 197
    invoke-direct/range {v0 .. v17}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)V

    .line 152
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->favoriteRetailerIds:Ljava/util/LinkedHashSet;

    .line 153
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredRows:Ljava/util/List;

    const/4 v0, 0x1

    .line 155
    iput-boolean v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->disableResetViewStates:Z

    const-wide/16 v2, 0x0

    .line 156
    iput-wide v2, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->currentBalance:D

    move-object/from16 v0, p2

    .line 216
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    move-object/from16 v0, p3

    .line 217
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    move-object/from16 v0, p4

    .line 218
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-object/from16 v0, p5

    .line 219
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appCacheState:Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-object/from16 v0, p6

    .line 220
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    move-object/from16 v0, p7

    .line 221
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-object/from16 v0, p9

    .line 222
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    move-object/from16 v0, p12

    .line 223
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    move-object/from16 v0, p13

    .line 224
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    move-object/from16 v0, p16

    .line 225
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-object/from16 v0, p14

    .line 226
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    .line 227
    invoke-virtual/range {p15 .. p15}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->newInstance()Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object v0

    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-object/from16 v0, p17

    .line 228
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appsFlyerState:Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

    move-object/from16 v0, p18

    .line 229
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    move-object/from16 v0, p21

    .line 230
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    move-object/from16 v0, p24

    .line 231
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    move-object/from16 v0, p30

    .line 232
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    move-object/from16 v0, p31

    .line 233
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredReducer:Lcom/ibotta/android/featured/FeaturedReducer;

    move-object/from16 v0, p32

    .line 234
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->permissionPrimersVariant:Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;

    move-object/from16 v0, p33

    .line 235
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->amountBadgeVariant:Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;

    move-object/from16 v0, p34

    .line 236
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->permissionsHelper:Lcom/ibotta/android/permissions/PermissionsHelper;

    move-object/from16 v0, p35

    .line 237
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->currentBalanceReducer:Lcom/ibotta/android/featured/CurrentBalanceReducer;

    move-object/from16 v0, p36

    .line 238
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    move-object/from16 v0, p37

    .line 239
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "FeaturedPresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "4"

    const-string v2, "onFetchFinishedSuccessfully"

    const-string v3, "com.ibotta.android.mvp.ui.activity.featured.FeaturedPresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x144

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private attemptPromptForLocationPermission()V
    .locals 1

    .line 273
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->permissionPrimersVariant:Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;

    invoke-interface {v0}, Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;->showLocationPrimer()Z

    move-result v0

    if-nez v0, :cond_0

    .line 276
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->promptForLocationPermissions()V

    :cond_0
    return-void
.end method

.method private createBannerModuleRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;",
            "Lcom/ibotta/api/model/base/BaseModule;",
            ")V"
        }
    .end annotation

    .line 432
    check-cast p2, Lcom/ibotta/api/model/base/Module;

    .line 433
    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 434
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;-><init>()V

    .line 435
    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;->setModule(Lcom/ibotta/api/model/base/Module;)V

    .line 436
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private createBoxedModuleRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;",
            "Lcom/ibotta/api/model/base/BaseModule;",
            ")V"
        }
    .end annotation

    .line 482
    check-cast p2, Lcom/ibotta/api/model/module/RetailerModule;

    .line 483
    invoke-virtual {p2}, Lcom/ibotta/api/model/module/RetailerModule;->getContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/ibotta/api/model/module/RetailerModule;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 484
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->isProductContent(Lcom/ibotta/api/model/base/Module;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 485
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;

    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createTitleBarViewState(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 486
    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;->setModule(Lcom/ibotta/api/model/base/Module;)V

    .line 488
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 489
    :cond_0
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->isOfferContent(Lcom/ibotta/api/model/base/Module;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 490
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;

    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createTitleBarViewState(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 491
    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;->setModule(Lcom/ibotta/api/model/module/RetailerModule;)V

    .line 493
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 495
    invoke-virtual {p2}, Lcom/ibotta/api/model/module/RetailerModule;->getDynamicContentId()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 496
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->favoriteRetailerIds:Ljava/util/LinkedHashSet;

    invoke-virtual {p2}, Lcom/ibotta/api/model/module/RetailerModule;->getDynamicContentId()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 500
    :cond_1
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Erroneous Module Type Detected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    invoke-virtual {p2}, Lcom/ibotta/api/model/module/RetailerModule;->getContent()Ljava/util/List;

    move-result-object p2

    const/4 v2, 0x0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/model/base/BaseContent;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 500
    invoke-virtual {p1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private createCircleBonusRows(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;",
            "Lcom/ibotta/api/model/base/BaseModule;",
            ")V"
        }
    .end annotation

    .line 473
    check-cast p2, Lcom/ibotta/api/model/base/Module;

    .line 474
    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 475
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;

    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createTitleBarViewState(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 476
    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;->setModule(Lcom/ibotta/api/model/base/Module;)V

    .line 477
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private createFeaturedRetailersRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;",
            "Lcom/ibotta/api/model/base/BaseModule;",
            ")V"
        }
    .end annotation

    .line 458
    check-cast p2, Lcom/ibotta/api/model/base/Module;

    .line 459
    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 461
    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/featured/-$$Lambda$FeaturedPresenterImpl$c0hR0ZgJvFFYDVGZBeTgHG8_bKI;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/featured/-$$Lambda$FeaturedPresenterImpl$c0hR0ZgJvFFYDVGZBeTgHG8_bKI;

    .line 462
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/featured/-$$Lambda$FeaturedPresenterImpl$Um_-psG-I5zruPFLiYgNBt6txTI;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/featured/-$$Lambda$FeaturedPresenterImpl$Um_-psG-I5zruPFLiYgNBt6txTI;

    .line 463
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 464
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 465
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    .line 466
    invoke-virtual {v2, v0}, Lcom/ibotta/android/horiz/RetailerHorizListReducer;->create(Ljava/util/List;)Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    move-result-object v0

    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createTitleBarViewState(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;-><init>(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 467
    invoke-virtual {v1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;->setModule(Lcom/ibotta/api/model/base/Module;)V

    .line 468
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private createGridModuleRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;",
            "Lcom/ibotta/api/model/base/BaseModule;",
            ")V"
        }
    .end annotation

    .line 450
    check-cast p2, Lcom/ibotta/api/model/module/GridModule;

    .line 451
    invoke-virtual {p2}, Lcom/ibotta/api/model/module/GridModule;->getCategories()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 452
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;

    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createTitleBarViewState(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;-><init>(Lcom/ibotta/api/model/module/GridModule;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 453
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private createQuestsModuleRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;",
            "Lcom/ibotta/api/model/base/BaseModule;",
            ")V"
        }
    .end annotation

    .line 441
    check-cast p2, Lcom/ibotta/api/model/base/Module;

    .line 442
    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 443
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;

    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createTitleBarViewState(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 444
    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;->setModule(Lcom/ibotta/api/model/base/Module;)V

    .line 445
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private createRowsModuleRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;",
            "Lcom/ibotta/api/model/base/BaseModule;",
            ")V"
        }
    .end annotation

    .line 519
    check-cast p2, Lcom/ibotta/api/model/base/Module;

    .line 520
    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 521
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createTitleBarViewState(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    .line 522
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->isProductContent(Lcom/ibotta/api/model/base/Module;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 523
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 524
    invoke-virtual {v1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;->setModule(Lcom/ibotta/api/model/base/Module;)V

    .line 526
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 527
    :cond_0
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->isRetailerContent(Lcom/ibotta/api/model/base/Module;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 528
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/featured/row/PopularRetailersRow;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/PopularRetailersRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 529
    invoke-virtual {v1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/PopularRetailersRow;->setModule(Lcom/ibotta/api/model/base/Module;)V

    .line 531
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 533
    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getDynamicContentId()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 534
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->favoriteRetailerIds:Ljava/util/LinkedHashSet;

    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getDynamicContentId()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 538
    :cond_1
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Erroneous Module Type Detected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object p2

    const/4 v2, 0x0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/model/base/BaseContent;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 538
    invoke-virtual {p1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private createSmallBannerModuleRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;",
            "Lcom/ibotta/api/model/base/BaseModule;",
            ")V"
        }
    .end annotation

    .line 507
    check-cast p2, Lcom/ibotta/api/model/base/Module;

    .line 508
    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 509
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredReducer:Lcom/ibotta/android/featured/FeaturedReducer;

    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->isSponsored()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/featured/FeaturedReducer;->createFeaturedCategoriesTitle(Z)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    .line 511
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/featured/row/SmallBannersRow;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/SmallBannersRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 512
    invoke-virtual {v1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/SmallBannersRow;->setModule(Lcom/ibotta/api/model/base/Module;)V

    .line 514
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private createTitleBarViewState(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 545
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredReducer:Lcom/ibotta/android/featured/FeaturedReducer;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/featured/FeaturedReducer;->createTitle(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    return-object p1
.end method

.method private fetchNotificationsCount()V
    .locals 4

    .line 746
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getVariantFactory()Lcom/ibotta/android/features/factory/VariantFactory;

    move-result-object v0

    const-string v1, "graphql_notifications"

    const-class v2, Lcom/ibotta/android/notification/NotificationsVariant;

    .line 747
    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/notification/NotificationsVariant;

    .line 749
    invoke-interface {v0}, Lcom/ibotta/android/notification/NotificationsVariant;->useGraphQL()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 750
    new-instance v0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;-><init>(Landroid/content/Context;)V

    .line 751
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    int-to-long v1, v1

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3, p0}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;->fetchNotificationsCount(JLcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V

    :cond_0
    return-void
.end method

.method private isOfferContent(Lcom/ibotta/api/model/base/Module;)Z
    .locals 1

    .line 559
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/base/BaseContent;

    .line 560
    instance-of v0, v0, Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private isProductContent(Lcom/ibotta/api/model/base/Module;)Z
    .locals 1

    .line 549
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/base/BaseContent;

    .line 550
    instance-of v0, v0, Lcom/ibotta/api/model/ProductModel;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private isRetailerContent(Lcom/ibotta/api/model/base/Module;)Z
    .locals 1

    .line 569
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/base/BaseContent;

    .line 570
    instance-of v0, v0, Lcom/ibotta/api/model/content/RetailerContent;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method static synthetic lambda$createFeaturedRetailersRow$0(Lcom/ibotta/api/model/base/BaseContent;)Z
    .locals 0

    .line 462
    instance-of p0, p0, Lcom/ibotta/api/model/RetailerModel;

    return p0
.end method

.method static synthetic lambda$createFeaturedRetailersRow$1(Lcom/ibotta/api/model/base/BaseContent;)Lcom/ibotta/api/model/RetailerModel;
    .locals 0

    .line 463
    check-cast p0, Lcom/ibotta/api/model/RetailerModel;

    return-object p0
.end method

.method private onDataLoadFailed(Lcom/ibotta/android/notification/networking/model/NotificationsViewStateFailure;)V
    .locals 2

    .line 769
    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateFailure;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "GraphQL Notifications load error."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private onDataLoaded(Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;)V
    .locals 1

    .line 765
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->getNotificationsCount()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/user/UserState;->setCustomerNotificationCount(I)V

    return-void
.end method

.method private setFeaturedRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;)V"
        }
    .end annotation

    .line 412
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackHomeScreenLoaded()V

    .line 413
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->setFeaturedRows(Ljava/util/List;)V

    return-void
.end method

.method private shouldTrackPermissionsWithBraze()Z
    .locals 2

    .line 264
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->permissionsHelper:Lcom/ibotta/android/permissions/PermissionsHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/permissions/PermissionsHelper;->hasLocationPermissions(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->permissionsHelper:Lcom/ibotta/android/permissions/PermissionsHelper;

    sget-object v1, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    .line 265
    invoke-interface {v0, v1}, Lcom/ibotta/android/permissions/PermissionsHelper;->isPermanentlyDenied(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->permissionPrimersVariant:Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;

    .line 266
    invoke-interface {v0}, Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;->showLocationPrimer()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public getCurrentBalanceViewState()Lcom/ibotta/android/views/featured/CurrentBalanceViewState;
    .locals 3

    .line 739
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->currentBalanceReducer:Lcom/ibotta/android/featured/CurrentBalanceReducer;

    iget-wide v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->currentBalance:D

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/featured/CurrentBalanceReducer;->create(D)Lcom/ibotta/android/views/featured/CurrentBalanceViewState;

    move-result-object v0

    return-object v0
.end method

.method protected getFetchJobs()Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 282
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 284
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->modulesJob:Lcom/ibotta/android/service/api/job/ModulesApiJob;

    if-nez v1, :cond_0

    .line 285
    new-instance v1, Lcom/ibotta/android/service/api/job/ModulesApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appCacheState:Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 286
    invoke-interface {v2}, Lcom/ibotta/android/state/app/cache/AppCacheState;->getGraphQLSalt()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/ibotta/android/service/api/job/ModulesApiJob;-><init>(Ljava/lang/String;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->modulesJob:Lcom/ibotta/android/service/api/job/ModulesApiJob;

    .line 292
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 293
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 296
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->configJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    .line 297
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    invoke-interface {v1}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createConfigApiJob()Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->configJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 300
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->modulesJob:Lcom/ibotta/android/service/api/job/ModulesApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 301
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 302
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->configJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected getRequestedSearchContent()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/search/async/SearchAsync$SearchContent;",
            ">;"
        }
    .end annotation

    .line 244
    sget-object v0, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->OFFERS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    sget-object v1, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->RETAILERS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    sget-object v2, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->PRODUCTS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    invoke-static {v0, v1, v2}, Ljava9/util/Sets;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getRetailerModel(Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/api/model/RetailerModel;
    .locals 0

    .line 587
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->getRetailerModel(Ljava/lang/Integer;)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    return-object p1
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    .line 309
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onAbandonFetchJobs()V

    const/4 v0, 0x0

    .line 310
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->modulesJob:Lcom/ibotta/android/service/api/job/ModulesApiJob;

    .line 311
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 312
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->configJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onActionClicked(Lcom/ibotta/api/model/base/Actionable;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 668
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Lcom/ibotta/api/model/base/Actionable;->getLink()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 672
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {p1}, Lcom/ibotta/api/model/base/Actionable;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->launchRoute(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onActivityClicked()V
    .locals 1

    .line 648
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->showActivity()V

    return-void
.end method

.method public onBonusClicked(Lcom/ibotta/api/model/base/Routable;)V
    .locals 1

    .line 592
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {p1}, Lcom/ibotta/api/model/base/Routable;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->launchRoute(Ljava/lang/String;)V

    return-void
.end method

.method public onCategoryClicked(Lcom/ibotta/api/model/retailer/Category;)V
    .locals 1

    .line 729
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->showCategoryGallery(I)V

    return-void
.end method

.method public onCustomerNotificationReceived()V
    .locals 2

    .line 663
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerNotificationCount()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->updateNotificationCount(I)V

    return-void
.end method

.method public onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
    .locals 1

    .line 643
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {p1}, Lcom/ibotta/api/model/base/Routable;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->launchRoute(Ljava/lang/String;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 6
    .annotation runtime Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingStop;
        value = .enum Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->FIRST_CONTENT:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 324
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredDataLoadStartTime:J

    sub-long/2addr v1, v3

    .line 325
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    invoke-interface {v3, v1, v2}, Lcom/ibotta/android/tracking/timing/AppTimingTracker;->trackTimeToLoadFeaturedData(J)V

    .line 327
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->modulesJob:Lcom/ibotta/android/service/api/job/ModulesApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/ModulesApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;

    .line 333
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;->getModules()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_1

    .line 334
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpPresenterActions:Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/base/MvpPresenterActions;->isNetworkConnected()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 335
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->showScreenLoadFailed()V

    goto/16 :goto_4

    .line 337
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->showNetworkConnectionError()V

    goto/16 :goto_4

    .line 342
    :cond_1
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    new-instance v3, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v4, Lcom/ibotta/api/call/sharing/AppMessagesCall;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v5}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v5

    invoke-direct {v4, v5}, Lcom/ibotta/api/call/sharing/AppMessagesCall;-><init>(I)V

    invoke-direct {v3, v4}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    invoke-interface {v2, v3}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 344
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 345
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v4

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v5}, Lcom/ibotta/android/state/user/UserState;->isNewUser()Z

    move-result v5

    if-nez v5, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v3, v4, v5}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V

    .line 347
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->favoriteRetailerIds:Ljava/util/LinkedHashSet;

    invoke-virtual {v3}, Ljava/util/LinkedHashSet;->clear()V

    .line 348
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredRows:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 350
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;->getModules()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/base/BaseModule;

    .line 351
    invoke-virtual {v3}, Lcom/ibotta/api/model/base/BaseModule;->getDisplayTypeEnum()Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    move-result-object v4

    if-nez v4, :cond_4

    goto :goto_1

    .line 357
    :cond_4
    sget-object v4, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl$1;->$SwitchMap$com$ibotta$api$model$base$BaseModule$DisplayType:[I

    invoke-virtual {v3}, Lcom/ibotta/api/model/base/BaseModule;->getDisplayTypeEnum()Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    move-result-object v5

    invoke-virtual {v5}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    goto :goto_1

    .line 383
    :pswitch_0
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredRows:Ljava/util/List;

    invoke-direct {p0, v4, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createGridModuleRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V

    goto :goto_1

    .line 380
    :pswitch_1
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredRows:Ljava/util/List;

    invoke-direct {p0, v4, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createQuestsModuleRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V

    goto :goto_1

    .line 377
    :pswitch_2
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredRows:Ljava/util/List;

    invoke-direct {p0, v4, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createRowsModuleRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V

    goto :goto_1

    .line 374
    :pswitch_3
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredRows:Ljava/util/List;

    invoke-direct {p0, v4, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createSmallBannerModuleRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V

    goto :goto_1

    .line 371
    :pswitch_4
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredRows:Ljava/util/List;

    invoke-direct {p0, v4, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createBoxedModuleRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V

    goto :goto_1

    .line 362
    :pswitch_5
    sget-object v4, Lcom/ibotta/api/model/ContentModel$Type;->FEATURED_RETAILER:Lcom/ibotta/api/model/ContentModel$Type;

    invoke-virtual {v3}, Lcom/ibotta/api/model/base/BaseModule;->getContentType()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/ibotta/api/model/ContentModel$Type;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    sget-object v4, Lcom/ibotta/api/model/ContentModel$Type;->RETAILER:Lcom/ibotta/api/model/ContentModel$Type;

    .line 363
    invoke-virtual {v3}, Lcom/ibotta/api/model/base/BaseModule;->getContentType()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/ibotta/api/model/ContentModel$Type;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_2

    .line 366
    :cond_5
    sget-object v4, Lcom/ibotta/api/model/ContentModel$Type;->BONUS:Lcom/ibotta/api/model/ContentModel$Type;

    invoke-virtual {v3}, Lcom/ibotta/api/model/base/BaseModule;->getContentType()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/ibotta/api/model/ContentModel$Type;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 367
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredRows:Ljava/util/List;

    invoke-direct {p0, v4, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createCircleBonusRows(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V

    goto :goto_1

    .line 365
    :cond_6
    :goto_2
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredRows:Ljava/util/List;

    invoke-direct {p0, v4, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createFeaturedRetailersRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V

    goto :goto_1

    .line 359
    :pswitch_6
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredRows:Ljava/util/List;

    invoke-direct {p0, v4, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->createBannerModuleRow(Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V

    goto :goto_1

    .line 387
    :cond_7
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v1

    .line 388
    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getBalance()F

    move-result v2

    float-to-double v2, v2

    iput-wide v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->currentBalance:D

    .line 390
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->onCustomerLoaded(Lcom/ibotta/api/model/customer/Customer;)V

    .line 391
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredRows:Ljava/util/List;

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->setFeaturedRows(Ljava/util/List;)V

    .line 392
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->search:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->search:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    .line 393
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->search:Ljava/lang/String;

    sget-object v3, Lcom/ibotta/api/model/search/SearchType;->MARKETING:Lcom/ibotta/api/model/search/SearchType;

    invoke-virtual {p0, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->search(Ljava/lang/String;Lcom/ibotta/api/model/search/SearchType;)V

    .line 394
    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->search:Ljava/lang/String;

    goto :goto_3

    .line 395
    :cond_8
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->offerTag:Ljava/lang/String;

    invoke-interface {v1, v3}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 396
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->offerTag:Ljava/lang/String;

    sget-object v3, Lcom/ibotta/api/model/search/SearchType;->OFFER_TAG:Lcom/ibotta/api/model/search/SearchType;

    invoke-virtual {p0, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->search(Ljava/lang/String;Lcom/ibotta/api/model/search/SearchType;)V

    .line 397
    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->offerTag:Ljava/lang/String;

    .line 400
    :cond_9
    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appsFlyerState:Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/pojo/AppsFlyerState;->getDeepLink()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    .line 402
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->routeToDeepLink(Ljava/lang/String;)V

    .line 403
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appsFlyerState:Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/pojo/AppsFlyerState;->clearDeepLink()V

    .line 406
    :cond_a
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->fetchNotificationsCount()V

    .line 408
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onFetchFinishedSuccessfully()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 409
    :goto_4
    invoke-static {}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception v1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onFetchStarted()V
    .locals 2

    .line 317
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onFetchStarted()V

    .line 318
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->featuredDataLoadStartTime:J

    return-void
.end method

.method public onLoadFinished(Lcom/ibotta/android/notification/networking/model/NotificationsViewState;)V
    .locals 1

    .line 757
    instance-of v0, p1, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    if-eqz v0, :cond_0

    .line 758
    check-cast p1, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->onDataLoaded(Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;)V

    goto :goto_0

    .line 760
    :cond_0
    check-cast p1, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateFailure;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->onDataLoadFailed(Lcom/ibotta/android/notification/networking/model/NotificationsViewStateFailure;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onLoadFinished(Ljava/lang/Object;)V
    .locals 0

    .line 119
    check-cast p1, Lcom/ibotta/android/notification/networking/model/NotificationsViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->onLoadFinished(Lcom/ibotta/android/notification/networking/model/NotificationsViewState;)V

    return-void
.end method

.method public onLocationPermissionsGranted()V
    .locals 1

    .line 687
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    invoke-interface {v0}, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;->onLocationPermissionAccepted()V

    .line 688
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->reload()V

    return-void
.end method

.method public onNavAccountClicked()V
    .locals 1

    .line 723
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;->trackAccountNavClick()V

    .line 724
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onNavAccountClicked()V

    return-void
.end method

.method public onQuestClicked(Lcom/ibotta/api/model/BonusModel;)V
    .locals 2

    .line 717
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result v0

    .line 718
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->showBonusDetailQuest(Ljava/lang/String;I)V

    return-void
.end method

.method public onRefresh()V
    .locals 1

    .line 418
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appCacheState:Lcom/ibotta/android/state/app/cache/AppCacheState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/cache/AppCacheState;->invalidateGraphQLSalt()V

    .line 419
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->disableResetViewStates:Z

    if-nez v0, :cond_0

    .line 420
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->resetViewStates()V

    :cond_0
    const/4 v0, 0x0

    .line 422
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->disableResetViewStates:Z

    .line 423
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onRefresh()V

    return-void
.end method

.method public onResume()V
    .locals 1

    .line 255
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onResume()V

    .line 257
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackHomeView()V

    .line 258
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->shouldTrackPermissionsWithBraze()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 259
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackPermissionPushLocationViewHome()V

    :cond_0
    return-void
.end method

.method public onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    if-eqz p2, :cond_0

    .line 581
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getLink()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->launchRoute(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onRetailerViewAllClicked(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 638
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/content/Action;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->launchRoute(Ljava/lang/String;)V

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V
    .locals 2

    .line 618
    instance-of v0, p2, Lcom/ibotta/api/ContentEventTrackable;

    if-eqz v0, :cond_0

    .line 619
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    move-object v1, p2

    check-cast v1, Lcom/ibotta/api/ContentEventTrackable;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->onTrackShopClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    :cond_0
    const/4 v0, 0x0

    .line 623
    instance-of v1, p1, Lcom/ibotta/api/model/module/RetailerModule;

    if-eqz v1, :cond_1

    .line 624
    move-object v0, p1

    check-cast v0, Lcom/ibotta/api/model/module/RetailerModule;

    :cond_1
    if-eqz v0, :cond_2

    .line 628
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 629
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->getHomeResponse()Lcom/ibotta/api/call/home/HomeResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v1

    .line 630
    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v0

    .line 628
    invoke-interface {p1, v1, v0}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    .line 633
    :cond_2
    invoke-super {p0, p2, v0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onStart()V
    .locals 0

    .line 249
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onStart()V

    .line 250
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->attemptPromptForLocationPermission()V

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 708
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 710
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;

    if-eqz p1, :cond_0

    .line 711
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->showRetailerUnfavoritedFailed()V

    :cond_0
    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 693
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 695
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;

    if-eqz p1, :cond_0

    .line 696
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->showRetailerUnfavoritedSuccess()V

    .line 698
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v0, Lcom/ibotta/api/call/home/HomeCall;

    invoke-direct {v0}, Lcom/ibotta/api/call/home/HomeCall;-><init>()V

    invoke-interface {p1, v0}, Lcom/ibotta/android/appcache/AppCache;->invalidate(Lcom/ibotta/api/CacheableApiCall;)V

    .line 700
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-interface {v0}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forModules()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V

    .line 702
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->onRefresh()V

    :cond_0
    return-void
.end method

.method public onTrackContentClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V
    .locals 1

    .line 597
    instance-of v0, p2, Lcom/ibotta/api/ContentEventTrackable;

    if-eqz v0, :cond_0

    .line 598
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    check-cast p2, Lcom/ibotta/api/ContentEventTrackable;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->onTrackContentClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    :cond_0
    return-void
.end method

.method public onTrackUnlock(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V
    .locals 1

    .line 604
    instance-of v0, p2, Lcom/ibotta/api/ContentEventTrackable;

    if-eqz v0, :cond_0

    .line 605
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    check-cast p2, Lcom/ibotta/api/ContentEventTrackable;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->onTrackUnlockClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    :cond_0
    return-void
.end method

.method public onTrackUnlocked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V
    .locals 1

    .line 611
    instance-of v0, p2, Lcom/ibotta/api/ContentEventTrackable;

    if-eqz v0, :cond_0

    .line 612
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;

    check-cast p2, Lcom/ibotta/api/ContentEventTrackable;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;->onTrackUnlockedClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    :cond_0
    return-void
.end method

.method public setOfferTag(Ljava/lang/String;)V
    .locals 0

    .line 658
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->offerTag:Ljava/lang/String;

    return-void
.end method

.method public setResetViewStatesOnRefreshDisabled()V
    .locals 1

    const/4 v0, 0x1

    .line 428
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->disableResetViewStates:Z

    return-void
.end method

.method public setSearch(Ljava/lang/String;)V
    .locals 0

    .line 653
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->search:Ljava/lang/String;

    return-void
.end method

.method public showAmountBadge()Z
    .locals 1

    .line 734
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->amountBadgeVariant:Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;

    invoke-interface {v0}, Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public unfavorite(I)V
    .locals 2

    .line 677
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->favoriteRetailerIds:Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashSet;->remove(Ljava/lang/Object;)Z

    .line 678
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-interface {v0, p1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->unfavorite(I)V

    .line 680
    new-instance p1, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 681
    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->favoriteRetailerIds:Ljava/util/LinkedHashSet;

    invoke-direct {p1, v0, v1}, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;-><init>(ILjava/util/LinkedHashSet;)V

    .line 682
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method
