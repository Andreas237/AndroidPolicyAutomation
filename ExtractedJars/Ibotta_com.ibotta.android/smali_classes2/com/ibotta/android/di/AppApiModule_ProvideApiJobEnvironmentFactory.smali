.class public final Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;
.super Ljava/lang/Object;
.source "AppApiModule_ProvideApiJobEnvironmentFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/service/api/job/ApiJobEnvironment;",
        ">;"
    }
.end annotation


# instance fields
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

.field private final cacheFetchStrategyFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;",
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

.field private final handlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
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

.field private final locationUpdateManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/location/LocationUpdateManager;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/location/LocationUpdateManager;",
            ">;)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->contextProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p2, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 50
    iput-object p3, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->hardwareProvider:Ljavax/inject/Provider;

    .line 51
    iput-object p4, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->handlerProvider:Ljavax/inject/Provider;

    .line 52
    iput-object p5, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 53
    iput-object p6, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->authManagerProvider:Ljavax/inject/Provider;

    .line 54
    iput-object p7, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->cacheFetchStrategyFactoryProvider:Ljavax/inject/Provider;

    .line 55
    iput-object p8, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->locationUpdateManagerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/location/LocationUpdateManager;",
            ">;)",
            "Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;"
        }
    .end annotation

    .line 100
    new-instance v9, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v9
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/api/job/ApiJobEnvironment;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/location/LocationUpdateManager;",
            ">;)",
            "Lcom/ibotta/android/service/api/job/ApiJobEnvironment;"
        }
    .end annotation

    .line 81
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    .line 82
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/util/AppHelper;

    .line 83
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/hardware/Hardware;

    .line 84
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Landroid/os/Handler;

    .line 85
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/state/user/UserState;

    .line 86
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 87
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;

    .line 88
    invoke-interface {p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lcom/ibotta/android/service/location/LocationUpdateManager;

    .line 80
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->proxyProvideApiJobEnvironment(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Landroid/os/Handler;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;Lcom/ibotta/android/service/location/LocationUpdateManager;)Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideApiJobEnvironment(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Landroid/os/Handler;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;Lcom/ibotta/android/service/location/LocationUpdateManager;)Lcom/ibotta/android/service/api/job/ApiJobEnvironment;
    .locals 0

    .line 121
    invoke-static/range {p0 .. p7}, Lcom/ibotta/android/di/AppApiModule;->provideApiJobEnvironment(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Landroid/os/Handler;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;Lcom/ibotta/android/service/location/LocationUpdateManager;)Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 120
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/service/api/job/ApiJobEnvironment;
    .locals 8

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->hardwareProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->handlerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->authManagerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->cacheFetchStrategyFactoryProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->locationUpdateManagerProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->get()Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    move-result-object v0

    return-object v0
.end method
