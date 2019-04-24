.class public final Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;
.super Ljava/lang/Object;
.source "ManagerModule_ProvidePermissionStrategyManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final authManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;"
        }
    .end annotation
.end field

.field private final permissionStrategyMultitonProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionStrategyMultiton;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionStrategyMultiton;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;->authManagerProvider:Ljavax/inject/Provider;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;->permissionStrategyMultitonProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionStrategyMultiton;",
            ">;)",
            "Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/permissions/PermissionStrategyManager;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionStrategyMultiton;",
            ">;)",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;"
        }
    .end annotation

    .line 37
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;

    .line 36
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;->proxyProvidePermissionStrategyManager(Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/permissions/PermissionStrategyMultiton;)Lcom/ibotta/android/permissions/PermissionStrategyManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePermissionStrategyManager(Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/permissions/PermissionStrategyMultiton;)Lcom/ibotta/android/permissions/PermissionStrategyManager;
    .locals 0

    .line 50
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ManagerModule;->providePermissionStrategyManager(Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/permissions/PermissionStrategyMultiton;)Lcom/ibotta/android/permissions/PermissionStrategyManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 49
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/permissions/PermissionStrategyManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/permissions/PermissionStrategyManager;
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;->authManagerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;->permissionStrategyMultitonProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/permissions/PermissionStrategyManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;->get()Lcom/ibotta/android/permissions/PermissionStrategyManager;

    move-result-object v0

    return-object v0
.end method
