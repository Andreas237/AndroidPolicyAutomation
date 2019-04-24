.class public final Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;
.super Ljava/lang/Object;
.source "StateModule_ProvideLogOutManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/state/user/LogOutManager;",
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

.field private final logOutListenersProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/user/LogOutListener;",
            ">;>;"
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
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/user/LogOutListener;",
            ">;>;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;->authManagerProvider:Ljavax/inject/Provider;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;->logOutListenersProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/user/LogOutListener;",
            ">;>;)",
            "Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;"
        }
    .end annotation

    .line 42
    new-instance v0, Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/user/LogOutManager;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/user/LogOutListener;",
            ">;>;)",
            "Lcom/ibotta/android/state/user/LogOutManager;"
        }
    .end annotation

    .line 36
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;->proxyProvideLogOutManager(Lcom/ibotta/android/state/user/auth/AuthManager;Ljava/util/List;)Lcom/ibotta/android/state/user/LogOutManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideLogOutManager(Lcom/ibotta/android/state/user/auth/AuthManager;Ljava/util/List;)Lcom/ibotta/android/state/user/LogOutManager;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/user/LogOutListener;",
            ">;)",
            "Lcom/ibotta/android/state/user/LogOutManager;"
        }
    .end annotation

    .line 49
    invoke-static {p0, p1}, Lcom/ibotta/android/di/StateModule;->provideLogOutManager(Lcom/ibotta/android/state/user/auth/AuthManager;Ljava/util/List;)Lcom/ibotta/android/state/user/LogOutManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 48
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/user/LogOutManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/user/LogOutManager;
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;->authManagerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;->logOutListenersProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/user/LogOutManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;->get()Lcom/ibotta/android/state/user/LogOutManager;

    move-result-object v0

    return-object v0
.end method
