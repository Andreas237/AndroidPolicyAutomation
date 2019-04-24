.class public final Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "EngagementModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;",
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

.field private final cacheClearFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
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

.field private final loadRetailersVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final offerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
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

.field private final retailerParcelHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final taskHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/TaskHelper;",
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
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/TaskHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/braze/BrazeTrackingDataFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 82
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;

    move-object v1, p2

    .line 83
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    move-object v1, p3

    .line 84
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    move-object v1, p4

    .line 85
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    move-object v1, p5

    .line 86
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    move-object v1, p6

    .line 87
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    move-object v1, p7

    .line 88
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->offerHelperProvider:Ljavax/inject/Provider;

    move-object v1, p8

    .line 89
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->taskHelperProvider:Ljavax/inject/Provider;

    move-object v1, p9

    .line 90
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->brazeTrackingProvider:Ljavax/inject/Provider;

    move-object v1, p10

    .line 91
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->brazeTrackingDataFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p11

    .line 92
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->apiJobFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p12

    .line 93
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p13

    .line 94
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p14

    .line 95
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->appTimingTrackerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p15

    .line 96
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->favoriteRetailersManagerFactoryProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p16

    .line 97
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p17

    .line 98
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/TaskHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/braze/BrazeTrackingDataFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;"
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

    .line 179
    new-instance v18, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;

    move-object/from16 v0, v18

    invoke-direct/range {v0 .. v17}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v18
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/TaskHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/braze/BrazeTrackingDataFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 143
    invoke-interface/range {p1 .. p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 144
    invoke-interface/range {p2 .. p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/state/user/UserState;

    .line 145
    invoke-interface/range {p3 .. p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/util/AppHelper;

    .line 146
    invoke-interface/range {p4 .. p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 147
    invoke-interface/range {p5 .. p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 148
    invoke-interface/range {p6 .. p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 149
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/api/helper/offer/TaskHelper;

    .line 150
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    .line 151
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    .line 152
    invoke-interface/range {p10 .. p10}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 153
    invoke-interface/range {p11 .. p11}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 154
    invoke-interface/range {p12 .. p12}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 155
    invoke-interface/range {p13 .. p13}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    .line 156
    invoke-interface/range {p14 .. p14}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 157
    invoke-interface/range {p15 .. p15}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 158
    invoke-interface/range {p16 .. p16}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 141
    invoke-static/range {v0 .. v16}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/offer/TaskHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/braze/BrazeTrackingDataFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/offer/TaskHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/braze/BrazeTrackingDataFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;
    .locals 2

    .line 218
    invoke-virtual/range {p0 .. p16}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/offer/TaskHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/braze/BrazeTrackingDataFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 217
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;
    .locals 19

    move-object/from16 v0, p0

    .line 103
    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;

    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->offerHelperProvider:Ljavax/inject/Provider;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->taskHelperProvider:Ljavax/inject/Provider;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->brazeTrackingProvider:Ljavax/inject/Provider;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->brazeTrackingDataFactoryProvider:Ljavax/inject/Provider;

    iget-object v11, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->apiJobFactoryProvider:Ljavax/inject/Provider;

    iget-object v12, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v13, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    iget-object v14, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->appTimingTrackerProvider:Ljavax/inject/Provider;

    iget-object v15, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->favoriteRetailersManagerFactoryProvider:Ljavax/inject/Provider;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    move-object/from16 v17, v1

    move-object/from16 v1, v18

    invoke-static/range {v1 .. v17}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    move-result-object v0

    return-object v0
.end method
