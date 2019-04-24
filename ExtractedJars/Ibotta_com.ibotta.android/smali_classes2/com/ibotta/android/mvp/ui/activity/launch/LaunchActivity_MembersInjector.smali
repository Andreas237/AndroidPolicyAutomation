.class public final Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;
.super Ljava/lang/Object;
.source "LaunchActivity_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;",
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

.field private final fbManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/social/facebook/FacebookManager;",
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

.field private final googleSignInManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/social/google/GoogleSignInManager;",
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

.field private final pushMessagingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/push/PushMessaging;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
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
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/push/PushMessaging;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/social/facebook/FacebookManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/social/google/GoogleSignInManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/DeferredDeepLinkManager;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 91
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    move-object v1, p2

    .line 92
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    move-object v1, p3

    .line 93
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    move-object v1, p4

    .line 94
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    move-object v1, p5

    .line 95
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->upgradeStateProvider:Ljavax/inject/Provider;

    move-object v1, p6

    .line 96
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->appCacheStateProvider:Ljavax/inject/Provider;

    move-object v1, p7

    .line 97
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    move-object v1, p8

    .line 98
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p9

    .line 99
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->globalEventManagerProvider:Ljavax/inject/Provider;

    move-object v1, p10

    .line 100
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    move-object v1, p11

    .line 101
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    move-object v1, p12

    .line 102
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    move-object v1, p13

    .line 103
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->notificationTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p14

    .line 104
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p15

    .line 105
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->appProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p16

    .line 106
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->pushMessagingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p17

    .line 107
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->fbManagerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p18

    .line 108
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->googleSignInManagerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p19

    .line 109
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->deferredDeepLinkManagerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 21
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
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/push/PushMessaging;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/social/facebook/FacebookManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/social/google/GoogleSignInManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/DeferredDeepLinkManager;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;",
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

    .line 132
    new-instance v20, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;

    move-object/from16 v0, v20

    invoke-direct/range {v0 .. v19}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v20
.end method

.method public static injectApp(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/App;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->app:Lcom/ibotta/android/App;

    return-void
.end method

.method public static injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method public static injectAuthManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    return-void
.end method

.method public static injectBuildProfile(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/profile/BuildProfile;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    return-void
.end method

.method public static injectDeferredDeepLinkManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/routing/DeferredDeepLinkManager;)V
    .locals 0

    .line 215
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->deferredDeepLinkManager:Lcom/ibotta/android/routing/DeferredDeepLinkManager;

    return-void
.end method

.method public static injectFbManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/social/facebook/FacebookManager;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    return-void
.end method

.method public static injectGoogleSignInManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/social/google/GoogleSignInManager;)V
    .locals 0

    .line 206
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;

    return-void
.end method

.method public static injectPushMessaging(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/service/push/PushMessaging;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->pushMessaging:Lcom/ibotta/android/service/push/PushMessaging;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->upgradeStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->appCacheStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->globalEventManagerProvider:Ljavax/inject/Provider;

    .line 165
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 164
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    .line 169
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 168
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->notificationTrackingProvider:Ljavax/inject/Provider;

    .line 171
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 170
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    .line 173
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 172
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->appProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/App;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectApp(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/App;)V

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->pushMessagingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/push/PushMessaging;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectPushMessaging(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/service/push/PushMessaging;)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->fbManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectFbManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/social/facebook/FacebookManager;)V

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->googleSignInManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/social/google/GoogleSignInManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectGoogleSignInManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/social/google/GoogleSignInManager;)V

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->deferredDeepLinkManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectDeferredDeepLinkManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/routing/DeferredDeepLinkManager;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V

    return-void
.end method
