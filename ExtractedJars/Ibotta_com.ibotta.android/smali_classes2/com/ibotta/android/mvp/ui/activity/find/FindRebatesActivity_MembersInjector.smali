.class public final Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;
.super Ljava/lang/Object;
.source "FindRebatesActivity_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
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
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 85
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    move-object v1, p2

    .line 86
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    move-object v1, p3

    .line 87
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    move-object v1, p4

    .line 88
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    move-object v1, p5

    .line 89
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->upgradeStateProvider:Ljavax/inject/Provider;

    move-object v1, p6

    .line 90
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->appCacheStateProvider:Ljavax/inject/Provider;

    move-object v1, p7

    .line 91
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    move-object v1, p8

    .line 92
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p9

    .line 93
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->globalEventManagerProvider:Ljavax/inject/Provider;

    move-object v1, p10

    .line 94
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    move-object v1, p11

    .line 95
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    move-object v1, p12

    .line 96
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    move-object v1, p13

    .line 97
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->notificationTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p14

    .line 98
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p15

    .line 99
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p16

    .line 100
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->brazeTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p17

    .line 101
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->scrollingBottomSpaceProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 19
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
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;",
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

    .line 122
    new-instance v18, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;

    move-object/from16 v0, v18

    invoke-direct/range {v0 .. v17}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v18
.end method

.method public static injectBrazeTracking(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    return-void
.end method

.method public static injectHandler(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;Landroid/os/Handler;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->handler:Landroid/os/Handler;

    return-void
.end method

.method public static injectRetailerParcelHelper(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    return-void
.end method

.method public static injectScrollingBottomSpace(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;)V
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->upgradeStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->appCacheStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->globalEventManagerProvider:Ljavax/inject/Provider;

    .line 153
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 152
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    .line 157
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 156
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->notificationTrackingProvider:Ljavax/inject/Provider;

    .line 159
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 158
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    .line 161
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 160
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;Landroid/os/Handler;)V

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->brazeTrackingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->injectBrazeTracking(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->scrollingBottomSpaceProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->injectScrollingBottomSpace(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 27
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;)V

    return-void
.end method
