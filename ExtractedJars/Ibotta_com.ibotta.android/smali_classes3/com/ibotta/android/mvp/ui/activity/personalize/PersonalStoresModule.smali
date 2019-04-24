.class public Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "PersonalStoresModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method

.method public static providePersonalStoresReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/personalize/PersonalStoresReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/personalize/PersonalStoresReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/personalize/PersonalStoresReducer;-><init>(Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v0
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/personalize/PersonalStoresReducer;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;
    .locals 12
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 50
    new-instance v11, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;

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

    invoke-direct/range {v0 .. v10}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/personalize/PersonalStoresReducer;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;)V

    return-object v11
.end method

.method public providePersonalRetailerFinderFactory(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;)Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 66
    new-instance v0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactoryImpl;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactoryImpl;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;)V

    return-object v0
.end method
