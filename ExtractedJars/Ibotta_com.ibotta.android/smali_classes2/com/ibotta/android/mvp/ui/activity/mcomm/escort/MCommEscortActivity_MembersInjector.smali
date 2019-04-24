.class public final Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;
.super Ljava/lang/Object;
.source "MCommEscortActivity_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;",
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

.field private final imageCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
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
            "Lcom/ibotta/android/images/ImageCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 84
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    move-object v1, p2

    .line 85
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    move-object v1, p3

    .line 86
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    move-object v1, p4

    .line 87
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    move-object v1, p5

    .line 88
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->upgradeStateProvider:Ljavax/inject/Provider;

    move-object v1, p6

    .line 89
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->appCacheStateProvider:Ljavax/inject/Provider;

    move-object v1, p7

    .line 90
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    move-object v1, p8

    .line 91
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p9

    .line 92
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->globalEventManagerProvider:Ljavax/inject/Provider;

    move-object v1, p10

    .line 93
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    move-object v1, p11

    .line 94
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    move-object v1, p12

    .line 95
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    move-object v1, p13

    .line 96
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->notificationTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p14

    .line 97
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p15

    .line 98
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p16

    .line 99
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p17

    .line 100
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->userStateProvider:Ljavax/inject/Provider;

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
            "Lcom/ibotta/android/images/ImageCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;",
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

    .line 121
    new-instance v18, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;

    move-object/from16 v0, v18

    invoke-direct/range {v0 .. v17}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v18
.end method

.method public static injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method public static injectFormatting(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method

.method public static injectHandler(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Landroid/os/Handler;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->handler:Landroid/os/Handler;

    return-void
.end method

.method public static injectImageCache(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method

.method public static injectUserState(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;)V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->upgradeStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->appCacheStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->globalEventManagerProvider:Ljavax/inject/Provider;

    .line 152
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 151
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    .line 156
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 155
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->notificationTrackingProvider:Ljavax/inject/Provider;

    .line 158
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 157
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    .line 160
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 159
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Landroid/os/Handler;)V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/images/ImageCache;)V

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/util/Formatting;)V

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->userStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->injectUserState(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;)V

    return-void
.end method
