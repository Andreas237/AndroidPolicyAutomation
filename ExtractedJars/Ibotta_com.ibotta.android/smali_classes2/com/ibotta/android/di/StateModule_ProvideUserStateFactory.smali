.class public final Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;
.super Ljava/lang/Object;
.source "StateModule_ProvideUserStateFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/state/user/UserState;",
        ">;"
    }
.end annotation


# instance fields
.field private final appUpgraderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/AppUpgrader;",
            ">;"
        }
    .end annotation
.end field

.field private final appboyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
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

.field private final globalEventManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;"
        }
    .end annotation
.end field

.field private final locationStatusDispatcherProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;"
        }
    .end annotation
.end field

.field private final storageSiloStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/xprocess/StorageSiloState;",
            ">;"
        }
    .end annotation
.end field

.field private final userStateAppCallbackProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/UserStateAppCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/UserStateAppCallback;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/xprocess/StorageSiloState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/AppUpgrader;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->contextProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p2, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->appboyProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p3, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->userStateAppCallbackProvider:Ljavax/inject/Provider;

    .line 46
    iput-object p4, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->globalEventManagerProvider:Ljavax/inject/Provider;

    .line 47
    iput-object p5, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->storageSiloStateProvider:Ljavax/inject/Provider;

    .line 48
    iput-object p6, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->appUpgraderProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p7, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->locationStatusDispatcherProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/UserStateAppCallback;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/xprocess/StorageSiloState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/AppUpgrader;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;)",
            "Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;"
        }
    .end annotation

    .line 90
    new-instance v8, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v8
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/user/UserState;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/UserStateAppCallback;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/xprocess/StorageSiloState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/AppUpgrader;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;)",
            "Lcom/ibotta/android/state/user/UserState;"
        }
    .end annotation

    .line 73
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    .line 74
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/appboy/Appboy;

    .line 75
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/state/app/UserStateAppCallback;

    .line 76
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/state/GlobalEventManager;

    .line 77
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/state/xprocess/StorageSiloState;

    .line 78
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/state/app/upgrade/AppUpgrader;

    .line 79
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lcom/ibotta/android/location/LocationStatusDispatcher;

    .line 72
    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->proxyProvideUserState(Landroid/content/Context;Lcom/appboy/Appboy;Lcom/ibotta/android/state/app/UserStateAppCallback;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/state/app/upgrade/AppUpgrader;Lcom/ibotta/android/location/LocationStatusDispatcher;)Lcom/ibotta/android/state/user/UserState;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideUserState(Landroid/content/Context;Lcom/appboy/Appboy;Lcom/ibotta/android/state/app/UserStateAppCallback;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/state/app/upgrade/AppUpgrader;Lcom/ibotta/android/location/LocationStatusDispatcher;)Lcom/ibotta/android/state/user/UserState;
    .locals 0

    .line 109
    invoke-static/range {p0 .. p6}, Lcom/ibotta/android/di/StateModule;->provideUserState(Landroid/content/Context;Lcom/appboy/Appboy;Lcom/ibotta/android/state/app/UserStateAppCallback;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/state/app/upgrade/AppUpgrader;Lcom/ibotta/android/location/LocationStatusDispatcher;)Lcom/ibotta/android/state/user/UserState;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 108
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/user/UserState;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/user/UserState;
    .locals 7

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->appboyProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->userStateAppCallbackProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->globalEventManagerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->storageSiloStateProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->appUpgraderProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->locationStatusDispatcherProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/user/UserState;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 16
    invoke-virtual {p0}, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->get()Lcom/ibotta/android/state/user/UserState;

    move-result-object v0

    return-object v0
.end method
