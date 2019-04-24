.class public final Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;
.super Ljava/lang/Object;
.source "StateModule_ProvideLogOutListenersFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/util/List<",
        "Lcom/ibotta/android/state/user/LogOutListener;",
        ">;>;"
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

.field private final authManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
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

.field private final clearCookiesLogOutListenerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/ClearCookiesLogOutListener;",
            ">;"
        }
    .end annotation
.end field

.field private final fcmTokenManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/FcmTokenManager;",
            ">;"
        }
    .end annotation
.end field

.field private final geofenceCoordinatorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
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

.field private final ibottaApolloCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
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

.field private final pwiUserStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/UpgradeState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/FcmTokenManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/ClearCookiesLogOutListener;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;)V"
        }
    .end annotation

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 70
    iput-object p2, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->authManagerProvider:Ljavax/inject/Provider;

    .line 71
    iput-object p3, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->geofenceCoordinatorProvider:Ljavax/inject/Provider;

    .line 72
    iput-object p4, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->upgradeStateProvider:Ljavax/inject/Provider;

    .line 73
    iput-object p5, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->appCacheProvider:Ljavax/inject/Provider;

    .line 74
    iput-object p6, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    .line 75
    iput-object p7, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->verificationManagerProvider:Ljavax/inject/Provider;

    .line 76
    iput-object p8, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->permissionStrategyManagerProvider:Ljavax/inject/Provider;

    .line 77
    iput-object p9, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    .line 78
    iput-object p10, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->globalEventManagerProvider:Ljavax/inject/Provider;

    .line 79
    iput-object p11, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->fcmTokenManagerProvider:Ljavax/inject/Provider;

    .line 80
    iput-object p12, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->clearCookiesLogOutListenerProvider:Ljavax/inject/Provider;

    .line 81
    iput-object p13, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->pwiUserStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/UpgradeState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/FcmTokenManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/ClearCookiesLogOutListener;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;)",
            "Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;"
        }
    .end annotation

    .line 146
    new-instance v14, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;

    move-object v0, v14

    move-object v1, p0

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

    invoke-direct/range {v0 .. v13}, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v14
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/UpgradeState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/FcmTokenManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/ClearCookiesLogOutListener;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/user/LogOutListener;",
            ">;"
        }
    .end annotation

    .line 117
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    .line 118
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 119
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    .line 120
    invoke-interface/range {p3 .. p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 121
    invoke-interface/range {p4 .. p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/appcache/AppCache;

    .line 122
    invoke-interface/range {p5 .. p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 123
    invoke-interface/range {p6 .. p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/verification/VerificationManager;

    .line 124
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/permissions/PermissionStrategyManager;

    .line 125
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 126
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ibotta/android/state/GlobalEventManager;

    .line 127
    invoke-interface/range {p10 .. p10}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ibotta/android/async/device/FcmTokenManager;

    .line 128
    invoke-interface/range {p11 .. p11}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/ibotta/android/api/ClearCookiesLogOutListener;

    .line 129
    invoke-interface/range {p12 .. p12}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/ibotta/android/state/pwi/PwiUserState;

    move-object p0, v0

    move-object p1, v1

    move-object p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    .line 116
    invoke-static/range {p0 .. p12}, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->proxyProvideLogOutListeners(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/state/app/upgrade/UpgradeState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/permissions/PermissionStrategyManager;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/async/device/FcmTokenManager;Lcom/ibotta/android/api/ClearCookiesLogOutListener;Lcom/ibotta/android/state/pwi/PwiUserState;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideLogOutListeners(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/state/app/upgrade/UpgradeState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/permissions/PermissionStrategyManager;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/async/device/FcmTokenManager;Lcom/ibotta/android/api/ClearCookiesLogOutListener;Lcom/ibotta/android/state/pwi/PwiUserState;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/state/user/UserState;",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            "Lcom/ibotta/android/state/app/upgrade/UpgradeState;",
            "Lcom/ibotta/android/appcache/AppCache;",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            "Lcom/ibotta/android/verification/VerificationManager;",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkManager;",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            "Lcom/ibotta/android/async/device/FcmTokenManager;",
            "Lcom/ibotta/android/api/ClearCookiesLogOutListener;",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/user/LogOutListener;",
            ">;"
        }
    .end annotation

    .line 177
    invoke-static/range {p0 .. p12}, Lcom/ibotta/android/di/StateModule;->provideLogOutListeners(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/state/app/upgrade/UpgradeState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/permissions/PermissionStrategyManager;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/async/device/FcmTokenManager;Lcom/ibotta/android/api/ClearCookiesLogOutListener;Lcom/ibotta/android/state/pwi/PwiUserState;)Ljava/util/List;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 176
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 23
    invoke-virtual {p0}, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->get()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/user/LogOutListener;",
            ">;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->authManagerProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->geofenceCoordinatorProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->upgradeStateProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->verificationManagerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->permissionStrategyManagerProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->buttonSdkManagerProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->globalEventManagerProvider:Ljavax/inject/Provider;

    iget-object v10, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->fcmTokenManagerProvider:Ljavax/inject/Provider;

    iget-object v11, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->clearCookiesLogOutListenerProvider:Ljavax/inject/Provider;

    iget-object v12, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->pwiUserStateProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v12}, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
