.class public final Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;
.super Ljava/lang/Object;
.source "ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
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

.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final hardwareProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
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

.field private final scheduledWorkManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/receiver/work/ScheduledWorkManager;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/receiver/work/ScheduledWorkManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;)V"
        }
    .end annotation

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->appCacheProvider:Ljavax/inject/Provider;

    .line 53
    iput-object p2, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 54
    iput-object p3, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 55
    iput-object p4, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->contextProvider:Ljavax/inject/Provider;

    .line 56
    iput-object p5, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->hardwareProvider:Ljavax/inject/Provider;

    .line 57
    iput-object p6, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->scheduledWorkManagerProvider:Ljavax/inject/Provider;

    .line 58
    iput-object p7, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 59
    iput-object p8, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->authManagerProvider:Ljavax/inject/Provider;

    .line 60
    iput-object p9, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/receiver/work/ScheduledWorkManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;)",
            "Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;"
        }
    .end annotation

    .line 109
    new-instance v10, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v10
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/receiver/work/ScheduledWorkManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;)",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;"
        }
    .end annotation

    .line 88
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/appcache/AppCache;

    .line 89
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 90
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/util/AppHelper;

    .line 91
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    .line 92
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/hardware/Hardware;

    .line 93
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    .line 94
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/state/user/UserState;

    .line 95
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 96
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    move-object p0, v0

    move-object p1, v1

    move-object p2, v2

    move-object p3, v3

    move-object p4, v4

    move-object p5, v5

    move-object p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    .line 87
    invoke-static/range {p0 .. p8}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->proxyProvideFavoriteRetailerSettingsFlushWorker(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/receiver/work/ScheduledWorkManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideFavoriteRetailerSettingsFlushWorker(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/receiver/work/ScheduledWorkManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;
    .locals 0

    .line 132
    invoke-static/range {p0 .. p8}, Lcom/ibotta/android/di/ScheduledWorkerModule;->provideFavoriteRetailerSettingsFlushWorker(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/receiver/work/ScheduledWorkManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 131
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;
    .locals 9

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->hardwareProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->scheduledWorkManagerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->authManagerProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v8}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->get()Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    move-result-object v0

    return-object v0
.end method
