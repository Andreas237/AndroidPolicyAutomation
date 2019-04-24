.class public final Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "PersonalStoresModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiJobFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
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

.field private final loadRetailersVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final personalRetailerFinderFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final personalStoresReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/personalize/PersonalStoresReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final trackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
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
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/personalize/PersonalStoresReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;",
            ">;)V"
        }
    .end annotation

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;

    .line 60
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 61
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->favoriteRetailersManagerFactoryProvider:Ljavax/inject/Provider;

    .line 62
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->favoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;

    .line 63
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 64
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->appCacheProvider:Ljavax/inject/Provider;

    .line 65
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->trackerProvider:Ljavax/inject/Provider;

    .line 66
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    .line 67
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->personalStoresReducerProvider:Ljavax/inject/Provider;

    .line 68
    iput-object p10, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->apiJobFactoryProvider:Ljavax/inject/Provider;

    .line 69
    iput-object p11, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->personalRetailerFinderFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/personalize/PersonalStoresReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 126
    new-instance v12, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;

    move-object v0, v12

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v12
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/personalize/PersonalStoresReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;"
        }
    .end annotation

    .line 102
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 103
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 104
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    .line 105
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/state/user/UserState;

    .line 106
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/appcache/AppCache;

    .line 107
    invoke-interface/range {p6 .. p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/tracking/Tracker;

    .line 108
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 109
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/personalize/PersonalStoresReducer;

    .line 110
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 111
    invoke-interface/range {p10 .. p10}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;

    move-object p1, v0

    move-object p2, v1

    move-object p3, v2

    move-object p4, v3

    move-object p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    .line 100
    invoke-static/range {p0 .. p10}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/personalize/PersonalStoresReducer;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/personalize/PersonalStoresReducer;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;
    .locals 0

    .line 153
    invoke-virtual/range {p0 .. p10}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/personalize/PersonalStoresReducer;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 152
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;
    .locals 11

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->favoriteRetailersManagerFactoryProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->favoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->trackerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->personalStoresReducerProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->apiJobFactoryProvider:Ljavax/inject/Provider;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->personalRetailerFinderFactoryProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v10}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    move-result-object v0

    return-object v0
.end method
