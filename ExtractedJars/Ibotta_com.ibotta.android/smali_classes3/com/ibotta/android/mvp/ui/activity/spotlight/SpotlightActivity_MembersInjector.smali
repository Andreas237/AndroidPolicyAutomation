.class public final Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;
.super Ljava/lang/Object;
.source "SpotlightActivity_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;",
        ">;"
    }
.end annotation


# instance fields
.field private final appCacheStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
            ">;"
        }
    .end annotation
.end field

.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
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

.field private final authManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
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

.field private final buildProfileProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;"
        }
    .end annotation
.end field

.field private final buttonSdkManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkManager;",
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

.field private final debugStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;"
        }
    .end annotation
.end field

.field private final fileProviderHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/share/FileProviderHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;"
        }
    .end annotation
.end field

.field private final globalEventManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;"
        }
    .end annotation
.end field

.field private final handlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationTrackingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;",
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

.field private final pipelineFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/pipeline/PipelineFactory;",
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

.field private final retailerParcelHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
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

.field private final trackingFlushWorkerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;",
            ">;"
        }
    .end annotation
.end field

.field private final upgradeStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/UpgradeState;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/UpgradeState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/share/FileProviderHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/pipeline/PipelineFactory;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 103
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    move-object v1, p2

    .line 104
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    move-object v1, p3

    .line 105
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    move-object v1, p4

    .line 106
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    move-object v1, p5

    .line 107
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->upgradeStateProvider:Ljavax/inject/Provider;

    move-object v1, p6

    .line 108
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->appCacheStateProvider:Ljavax/inject/Provider;

    move-object v1, p7

    .line 109
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    move-object v1, p8

    .line 110
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p9

    .line 111
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->globalEventManagerProvider:Ljavax/inject/Provider;

    move-object v1, p10

    .line 112
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    move-object v1, p11

    .line 113
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    move-object v1, p12

    .line 114
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    move-object v1, p13

    .line 115
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->notificationTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p14

    .line 116
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p15

    .line 117
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p16

    .line 118
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->offerHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p17

    .line 119
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->userStateProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p18

    .line 120
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p19

    .line 121
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->fileProviderHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p20

    .line 122
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->brazeTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p21

    .line 123
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->recentlyViewedOfferHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p22

    .line 124
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->pipelineFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/UpgradeState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/share/FileProviderHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/pipeline/PipelineFactory;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;",
            ">;"
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

    .line 150
    new-instance v23, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;

    move-object/from16 v0, v23

    invoke-direct/range {v0 .. v22}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v23
.end method

.method public static injectAppConfig(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method public static injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method public static injectBrazeTracking(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V
    .locals 0

    .line 234
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    return-void
.end method

.method public static injectBuildProfile(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/profile/BuildProfile;)V
    .locals 0

    .line 238
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    return-void
.end method

.method public static injectDebugState(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    return-void
.end method

.method public static injectFileProviderHelper(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/share/FileProviderHelper;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->fileProviderHelper:Lcom/ibotta/android/share/FileProviderHelper;

    return-void
.end method

.method public static injectFormatting(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method

.method public static injectOfferHelper(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    return-void
.end method

.method public static injectPipelineFactory(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/util/pipeline/PipelineFactory;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->pipelineFactory:Lcom/ibotta/android/util/pipeline/PipelineFactory;

    return-void
.end method

.method public static injectRecentlyViewedOfferHelper(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;)V
    .locals 0

    .line 243
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->recentlyViewedOfferHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    return-void
.end method

.method public static injectUserState(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;)V
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->upgradeStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->appCacheStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->globalEventManagerProvider:Ljavax/inject/Provider;

    .line 186
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 185
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    .line 190
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 189
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->notificationTrackingProvider:Ljavax/inject/Provider;

    .line 192
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 191
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    .line 194
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 193
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/util/Formatting;)V

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->offerHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectOfferHelper(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->userStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectUserState(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/state/user/UserState;)V

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->fileProviderHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/share/FileProviderHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectFileProviderHelper(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/share/FileProviderHelper;)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->brazeTrackingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectBrazeTracking(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->recentlyViewedOfferHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectRecentlyViewedOfferHelper(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;)V

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->pipelineFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/pipeline/PipelineFactory;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectPipelineFactory(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/util/pipeline/PipelineFactory;)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 31
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;)V

    return-void
.end method
