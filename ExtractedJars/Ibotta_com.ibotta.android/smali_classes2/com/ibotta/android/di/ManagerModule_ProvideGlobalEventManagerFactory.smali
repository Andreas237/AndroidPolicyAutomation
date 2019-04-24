.class public final Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;
.super Ljava/lang/Object;
.source "ManagerModule_ProvideGlobalEventManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/state/GlobalEventManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;->handlerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)",
            "Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;"
        }
    .end annotation

    .line 39
    new-instance v0, Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/GlobalEventManager;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)",
            "Lcom/ibotta/android/state/GlobalEventManager;"
        }
    .end annotation

    .line 34
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;->proxyProvideGlobalEventManager(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/os/Handler;)Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideGlobalEventManager(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/os/Handler;)Lcom/ibotta/android/state/GlobalEventManager;
    .locals 0

    .line 45
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ManagerModule;->provideGlobalEventManager(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/os/Handler;)Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 44
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/GlobalEventManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/GlobalEventManager;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;->handlerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;->get()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    return-object v0
.end method
