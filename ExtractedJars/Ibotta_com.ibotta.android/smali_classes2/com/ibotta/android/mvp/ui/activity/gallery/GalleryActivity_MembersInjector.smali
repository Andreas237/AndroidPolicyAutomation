.class public final Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;
.super Ljava/lang/Object;
.source "GalleryActivity_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;",
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

.field private final galleryHeaderReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;",
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

.field private final imUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
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

.field private final routeHandlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RouteHandler;",
            ">;"
        }
    .end annotation
.end field

.field private final routePreviewerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RoutePreviewer;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
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
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RouteHandler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RoutePreviewer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/braze/BrazeTrackingDataFactory;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 115
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    move-object v1, p2

    .line 116
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    move-object v1, p3

    .line 117
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    move-object v1, p4

    .line 118
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    move-object v1, p5

    .line 119
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->upgradeStateProvider:Ljavax/inject/Provider;

    move-object v1, p6

    .line 120
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->appCacheStateProvider:Ljavax/inject/Provider;

    move-object v1, p7

    .line 121
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    move-object v1, p8

    .line 122
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    move-object v1, p9

    .line 123
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->globalEventManagerProvider:Ljavax/inject/Provider;

    move-object v1, p10

    .line 124
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    move-object v1, p11

    .line 125
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    move-object v1, p12

    .line 126
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    move-object v1, p13

    .line 127
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->notificationTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p14

    .line 128
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p15

    .line 129
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p16

    .line 130
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->imUtilProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p17

    .line 131
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p18

    .line 132
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p19

    .line 133
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->brazeTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p20

    .line 134
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p21

    .line 135
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->scrollingBottomSpaceProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p22

    .line 136
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->galleryHeaderReducerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p23

    .line 137
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->routeHandlerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p24

    .line 138
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->routePreviewerProvider:Ljavax/inject/Provider;

    move-object/from16 v1, p25

    .line 139
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->brazeTrackingDataFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 27
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
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RouteHandler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RoutePreviewer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/braze/BrazeTrackingDataFactory;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;",
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

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    .line 168
    new-instance v26, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;

    move-object/from16 v0, v26

    invoke-direct/range {v0 .. v25}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v26
.end method

.method public static injectAppConfig(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method public static injectBrazeTracking(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    return-void
.end method

.method public static injectBrazeTrackingDataFactory(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/braze/BrazeTrackingDataFactory;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->brazeTrackingDataFactory:Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    return-void
.end method

.method public static injectFormatting(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method

.method public static injectGalleryHeaderReducer(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->galleryHeaderReducer:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    return-void
.end method

.method public static injectHandler(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Landroid/os/Handler;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->handler:Landroid/os/Handler;

    return-void
.end method

.method public static injectImUtil(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    return-void
.end method

.method public static injectImageCache(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method

.method public static injectRouteHandler(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/routing/RouteHandler;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->routeHandler:Lcom/ibotta/android/routing/RouteHandler;

    return-void
.end method

.method public static injectRoutePreviewer(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/routing/RoutePreviewer;)V
    .locals 0

    .line 270
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->routePreviewer:Lcom/ibotta/android/routing/RoutePreviewer;

    return-void
.end method

.method public static injectScrollingBottomSpace(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V
    .locals 0

    .line 257
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->scrollingBottomSpace:Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)V
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->upgradeStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->appCacheStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->debugStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->globalEventManagerProvider:Ljavax/inject/Provider;

    .line 207
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 206
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    .line 211
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 210
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->notificationTrackingProvider:Ljavax/inject/Provider;

    .line 213
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 212
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    .line 215
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 214
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->imUtilProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectImUtil(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;)V

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/images/ImageCache;)V

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Landroid/os/Handler;)V

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->brazeTrackingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectBrazeTracking(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/util/Formatting;)V

    .line 224
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->scrollingBottomSpaceProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectScrollingBottomSpace(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->galleryHeaderReducerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectGalleryHeaderReducer(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;)V

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->routeHandlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/RouteHandler;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectRouteHandler(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/routing/RouteHandler;)V

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->routePreviewerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/RoutePreviewer;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectRoutePreviewer(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/routing/RoutePreviewer;)V

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->brazeTrackingDataFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectBrazeTrackingDataFactory(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/braze/BrazeTrackingDataFactory;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 34
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)V

    return-void
.end method
