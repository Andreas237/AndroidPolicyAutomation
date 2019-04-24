.class public final Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "SpotlightModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final alsoBoughtViewedVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;",
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

.field private final barcodeScanHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final brazeTrackingDataFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/braze/BrazeTrackingDataFactory;",
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

.field private final contentCardReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/ContentCardReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final contentListReducerUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
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

.field private final ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
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

.field private final module:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final recentlyViewedOfferHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;",
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

.field private final scanRulesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;"
        }
    .end annotation
.end field

.field private final spotlightPresenterHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final spotlightReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/spotlight/SpotlightReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final storageSiloStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/xprocess/StorageSiloState;",
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

.field private final verificationManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/xprocess/StorageSiloState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/braze/BrazeTrackingDataFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/ContentCardReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/spotlight/SpotlightReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 102
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;

    move-object v1, p2

    .line 103
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    move-object v1, p3

    .line 104
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->scanRulesProvider:Ljavax/inject/Provider;

    move-object v1, p4

    .line 105
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->spotlightPresenterHelperProvider:Ljavax/inject/Provider;

    move-object v1, p5

    .line 106
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->barcodeScanHelperProvider:Ljavax/inject/Provider;

    move-object v1, p6

    .line 107
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    move-object v1, p7

    .line 108
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->appCacheProvider:Ljavax/inject/Provider;

    move-object v1, p8

    .line 109
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->verificationManagerProvider:Ljavax/inject/Provider;

    move-object v1, p9

    .line 110
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->storageSiloStateProvider:Ljavax/inject/Provider;

    move-object v1, p10

    .line 111
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p11

    .line 112
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->brazeTrackingProvider:Ljavax/inject/Provider;

    move-object v1, p12

    .line 113
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->brazeTrackingDataFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p13

    .line 114
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p14

    .line 115
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->alsoBoughtViewedVariantProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p15

    .line 116
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->contentCardReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p16

    .line 117
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->contentListReducerUtilProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p17

    .line 118
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->trackingQueueProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p18

    .line 119
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p19

    .line 120
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->recentlyViewedOfferHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p20

    .line 121
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p21

    .line 122
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->spotlightReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p22

    .line 123
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->retailerIconOnOfferVariantProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/xprocess/StorageSiloState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/braze/BrazeTrackingDataFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/ContentCardReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/spotlight/SpotlightReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;"
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

    .line 224
    new-instance v23, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;

    move-object/from16 v0, v23

    invoke-direct/range {v0 .. v22}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v23
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/xprocess/StorageSiloState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/braze/BrazeTrackingDataFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/ContentCardReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/spotlight/SpotlightReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 178
    invoke-interface/range {p1 .. p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 179
    invoke-interface/range {p2 .. p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/rules/ScanRules;

    .line 180
    invoke-interface/range {p3 .. p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    .line 181
    invoke-interface/range {p4 .. p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;

    .line 182
    invoke-interface/range {p5 .. p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/state/user/UserState;

    .line 183
    invoke-interface/range {p6 .. p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/appcache/AppCache;

    .line 184
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/verification/VerificationManager;

    .line 185
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/state/xprocess/StorageSiloState;

    .line 186
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 187
    invoke-interface/range {p10 .. p10}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    .line 188
    invoke-interface/range {p11 .. p11}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    .line 189
    invoke-interface/range {p12 .. p12}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 190
    invoke-interface/range {p13 .. p13}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;

    .line 191
    invoke-interface/range {p14 .. p14}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/ibotta/android/content/card/ContentCardReducer;

    .line 192
    invoke-interface/range {p15 .. p15}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/ibotta/android/content/ContentListReducerUtil;

    .line 193
    invoke-interface/range {p16 .. p16}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 194
    invoke-interface/range {p17 .. p17}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 195
    invoke-interface/range {p18 .. p18}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    .line 196
    invoke-interface/range {p19 .. p19}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    .line 197
    invoke-interface/range {p20 .. p20}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lcom/ibotta/android/content/spotlight/SpotlightReducer;

    .line 198
    invoke-interface/range {p21 .. p21}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    .line 176
    invoke-static/range {v0 .. v21}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/rules/ScanRules;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/braze/BrazeTrackingDataFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;Lcom/ibotta/android/content/card/ContentCardReducer;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/content/spotlight/SpotlightReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/rules/ScanRules;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/braze/BrazeTrackingDataFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;Lcom/ibotta/android/content/card/ContentCardReducer;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/content/spotlight/SpotlightReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;
    .locals 2

    .line 273
    invoke-virtual/range {p0 .. p21}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/rules/ScanRules;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/braze/BrazeTrackingDataFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;Lcom/ibotta/android/content/card/ContentCardReducer;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/content/spotlight/SpotlightReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 272
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;
    .locals 24

    move-object/from16 v0, p0

    .line 128
    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;

    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->scanRulesProvider:Ljavax/inject/Provider;

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->spotlightPresenterHelperProvider:Ljavax/inject/Provider;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->barcodeScanHelperProvider:Ljavax/inject/Provider;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->verificationManagerProvider:Ljavax/inject/Provider;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->storageSiloStateProvider:Ljavax/inject/Provider;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v11, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->brazeTrackingProvider:Ljavax/inject/Provider;

    iget-object v12, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->brazeTrackingDataFactoryProvider:Ljavax/inject/Provider;

    iget-object v13, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    iget-object v14, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->alsoBoughtViewedVariantProvider:Ljavax/inject/Provider;

    iget-object v15, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->contentCardReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->contentListReducerUtilProvider:Ljavax/inject/Provider;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->trackingQueueProvider:Ljavax/inject/Provider;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->recentlyViewedOfferHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->spotlightReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->retailerIconOnOfferVariantProvider:Ljavax/inject/Provider;

    move-object/from16 v22, v1

    move-object/from16 v1, v23

    invoke-static/range {v1 .. v22}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    move-result-object v0

    return-object v0
.end method
