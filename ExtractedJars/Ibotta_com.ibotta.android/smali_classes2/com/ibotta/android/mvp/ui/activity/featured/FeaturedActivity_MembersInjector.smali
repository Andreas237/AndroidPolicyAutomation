.class public final Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;
.super Ljava/lang/Object;
.source "FeaturedActivity_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;",
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

.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final appProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;"
        }
    .end annotation
.end field

.field private final appRaterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/AppRater;",
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

.field private final currentBalanceActionProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;",
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

.field private final deferredDeepLinkManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/DeferredDeepLinkManager;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceRegistrationAsyncProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/DeviceRegistrationAsync;",
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

.field private final notificationActionProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/home/NotificationActionProvider;",
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

.field private final pixelTrackingManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
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

.field private final scrollingBottomSpaceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;",
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

.field private final trackingQueueProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
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
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/AppRater;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/DeviceRegistrationAsync;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/DeferredDeepLinkManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/home/NotificationActionProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 108
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    move-object v1, p2

    .line 109
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    move-object v1, p3

    .line 110
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    move-object v1, p4

    .line 111
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    move-object v1, p5

    .line 112
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->upgradeStateProvider:Ljavax/inject/Provider;

    move-object v1, p6

    .line 113
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->appCacheStateProvider:Ljavax/inject/Provider;

    move-object v1, p7

    .line 114
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    move-object v1, p8

    .line 115
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p9

    .line 116
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->globalEventManagerProvider:Ljavax/inject/Provider;

    move-object v1, p10

    .line 117
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    move-object v1, p11

    .line 118
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    move-object v1, p12

    .line 119
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    move-object v1, p13

    .line 120
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->notificationTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p14

    .line 121
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p15

    .line 122
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p16

    .line 123
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->appProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p17

    .line 124
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->appRaterProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p18

    .line 125
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->deviceRegistrationAsyncProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p19

    .line 126
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->pixelTrackingManagerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p20

    .line 127
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->scrollingBottomSpaceProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p21

    .line 128
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->deferredDeepLinkManagerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p22

    .line 129
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->notificationActionProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p23

    .line 130
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->currentBalanceActionProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 25
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
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/AppRater;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/DeviceRegistrationAsync;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/DeferredDeepLinkManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/home/NotificationActionProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;",
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

    move-object/from16 v23, p22

    .line 157
    new-instance v24, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;

    move-object/from16 v0, v24

    invoke-direct/range {v0 .. v23}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v24
.end method

.method public static injectApp(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/App;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->app:Lcom/ibotta/android/App;

    return-void
.end method

.method public static injectAppRater(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/AppRater;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->appRater:Lcom/ibotta/android/AppRater;

    return-void
.end method

.method public static injectCurrentBalanceActionProvider(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->currentBalanceActionProvider:Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;

    return-void
.end method

.method public static injectDebugState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V
    .locals 0

    .line 220
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    return-void
.end method

.method public static injectDeferredDeepLinkManager(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/routing/DeferredDeepLinkManager;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->deferredDeepLinkManager:Lcom/ibotta/android/routing/DeferredDeepLinkManager;

    return-void
.end method

.method public static injectDeviceRegistrationAsync(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/async/device/DeviceRegistrationAsync;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->deviceRegistrationAsync:Lcom/ibotta/android/async/device/DeviceRegistrationAsync;

    return-void
.end method

.method public static injectHandler(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Landroid/os/Handler;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->handler:Landroid/os/Handler;

    return-void
.end method

.method public static injectNotificationActionProvider(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/fragment/home/NotificationActionProvider;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->notificationActionProvider:Lcom/ibotta/android/fragment/home/NotificationActionProvider;

    return-void
.end method

.method public static injectNotificationTracking(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    return-void
.end method

.method public static injectPixelTrackingManager(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V
    .locals 0

    .line 246
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    return-void
.end method

.method public static injectScrollingBottomSpace(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V
    .locals 0

    .line 251
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    return-void
.end method

.method public static injectTracker(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/tracking/Tracker;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->tracker:Lcom/ibotta/android/tracking/Tracker;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;)V
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->upgradeStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->appCacheStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->globalEventManagerProvider:Ljavax/inject/Provider;

    .line 194
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 193
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    .line 198
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 197
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->notificationTrackingProvider:Ljavax/inject/Provider;

    .line 200
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 199
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    .line 202
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 201
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Landroid/os/Handler;)V

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->appProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/App;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->injectApp(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/App;)V

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->appRaterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/AppRater;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->injectAppRater(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/AppRater;)V

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->deviceRegistrationAsyncProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/async/device/DeviceRegistrationAsync;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->injectDeviceRegistrationAsync(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/async/device/DeviceRegistrationAsync;)V

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->pixelTrackingManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->injectPixelTrackingManager(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->scrollingBottomSpaceProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->injectScrollingBottomSpace(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->notificationTrackingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->deferredDeepLinkManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->injectDeferredDeepLinkManager(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/routing/DeferredDeepLinkManager;)V

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->notificationActionProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/home/NotificationActionProvider;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->injectNotificationActionProvider(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/fragment/home/NotificationActionProvider;)V

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->currentBalanceActionProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->injectCurrentBalanceActionProvider(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 33
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;)V

    return-void
.end method
