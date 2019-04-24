.class public final Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;
.super Ljava/lang/Object;
.source "MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;",
        ">;"
    }
.end annotation


# instance fields
.field private final appCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;"
        }
    .end annotation
.end field

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

.field private final eventBodyFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaTrackingQueueProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;"
        }
    .end annotation
.end field

.field private final partnerAppCheckerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;",
            ">;"
        }
    .end annotation
.end field

.field private final permissionStrategyManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
            ">;"
        }
    .end annotation
.end field

.field private final permissionsHelperFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final sessionStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/session/SessionState;",
            ">;"
        }
    .end annotation
.end field

.field private final trackingFlushSchedulerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/session/SessionState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ">;)V"
        }
    .end annotation

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->permissionStrategyManagerProvider:Ljavax/inject/Provider;

    .line 66
    iput-object p2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->appCacheStateProvider:Ljavax/inject/Provider;

    .line 67
    iput-object p3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->appCacheProvider:Ljavax/inject/Provider;

    .line 68
    iput-object p4, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 69
    iput-object p5, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->sessionStateProvider:Ljavax/inject/Provider;

    .line 70
    iput-object p6, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->partnerAppCheckerProvider:Ljavax/inject/Provider;

    .line 71
    iput-object p7, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->trackingQueueProvider:Ljavax/inject/Provider;

    .line 72
    iput-object p8, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 73
    iput-object p9, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->eventBodyFactoryProvider:Ljavax/inject/Provider;

    .line 74
    iput-object p10, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->ibottaTrackingQueueProvider:Ljavax/inject/Provider;

    .line 75
    iput-object p11, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->trackingFlushSchedulerProvider:Ljavax/inject/Provider;

    .line 76
    iput-object p12, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->permissionsHelperFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/session/SessionState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ">;)",
            "Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;"
        }
    .end annotation

    .line 137
    new-instance v13, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;

    move-object v0, v13

    move-object v1, p0

    move-object v2, p1

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

    invoke-direct/range {v0 .. v12}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v13
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/session/SessionState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ">;)",
            "Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;"
        }
    .end annotation

    .line 110
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/permissions/PermissionStrategyManager;

    .line 111
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 112
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/appcache/AppCache;

    .line 113
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/state/user/UserState;

    .line 114
    invoke-interface/range {p4 .. p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/state/session/SessionState;

    .line 115
    invoke-interface/range {p5 .. p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    .line 116
    invoke-interface/range {p6 .. p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 117
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 118
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    .line 119
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    .line 120
    invoke-interface/range {p10 .. p10}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;

    .line 121
    invoke-interface/range {p11 .. p11}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    move-object p0, v0

    move-object p1, v1

    move-object p2, v2

    move-object p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    .line 109
    invoke-static/range {p0 .. p11}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->proxyProvideIbottaLifecycleTracker(Lcom/ibotta/android/permissions/PermissionStrategyManager;Lcom/ibotta/android/state/app/cache/AppCacheState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/session/SessionState;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;Lcom/ibotta/android/permissions/PermissionsHelperFactory;)Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideIbottaLifecycleTracker(Lcom/ibotta/android/permissions/PermissionStrategyManager;Lcom/ibotta/android/state/app/cache/AppCacheState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/session/SessionState;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;Lcom/ibotta/android/permissions/PermissionsHelperFactory;)Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
            "Lcom/ibotta/android/appcache/AppCache;",
            "Lcom/ibotta/android/state/user/UserState;",
            "Lcom/ibotta/android/state/session/SessionState;",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ")",
            "Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;"
        }
    .end annotation

    .line 166
    invoke-static/range {p0 .. p11}, Lcom/ibotta/android/di/MainLifecycleTrackerModule;->provideIbottaLifecycleTracker(Lcom/ibotta/android/permissions/PermissionStrategyManager;Lcom/ibotta/android/state/app/cache/AppCacheState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/session/SessionState;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;Lcom/ibotta/android/permissions/PermissionsHelperFactory;)Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 165
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;
    .locals 12

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->permissionStrategyManagerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->appCacheStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->sessionStateProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->partnerAppCheckerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->trackingQueueProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->eventBodyFactoryProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->ibottaTrackingQueueProvider:Ljavax/inject/Provider;

    iget-object v10, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->trackingFlushSchedulerProvider:Ljavax/inject/Provider;

    iget-object v11, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->permissionsHelperFactoryProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v11}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->get()Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;

    move-result-object v0

    return-object v0
.end method
