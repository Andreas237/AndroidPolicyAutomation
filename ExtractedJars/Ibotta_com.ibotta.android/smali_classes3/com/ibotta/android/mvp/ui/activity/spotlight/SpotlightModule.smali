.class public Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "SpotlightModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method

.method public static provideBarcodeScanHelper()Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 125
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideSpotlightPresenterHelper(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/bonus/BonusHelper;Lcom/ibotta/android/collection/BonusBucketedComparator;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;
    .locals 7
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 119
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/bonus/BonusHelper;Lcom/ibotta/android/collection/BonusBucketedComparator;)V

    return-object v6
.end method

.method public static provideSpotlightReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/content/spotlight/SpotlightReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 54
    new-instance v0, Lcom/ibotta/android/content/spotlight/SpotlightReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/content/spotlight/SpotlightReducer;-><init>(Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v0
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/rules/ScanRules;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/braze/BrazeTrackingDataFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;Lcom/ibotta/android/content/card/ContentCardReducer;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/content/spotlight/SpotlightReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;
    .locals 23
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 83
    :try_start_0
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    move-object/from16 v1, p8

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/xprocess/StorageSiloState;->getImageResizeSilo(Landroid/content/Context;)Lcom/ibotta/android/commons/disk/StorageSilo;

    move-result-object v0
    :try_end_0
    .catch Lcom/ibotta/android/commons/disk/StorageException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v9, v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to prepare file to be written to by camera."

    const/4 v2, 0x0

    .line 85
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    move-object v9, v0

    .line 88
    :goto_0
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;

    move-object v1, v0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

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

    invoke-direct/range {v1 .. v22}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/rules/ScanRules;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/commons/disk/StorageSilo;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/braze/BrazeTrackingDataFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;Lcom/ibotta/android/content/card/ContentCardReducer;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/content/spotlight/SpotlightReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)V

    return-object v0
.end method
