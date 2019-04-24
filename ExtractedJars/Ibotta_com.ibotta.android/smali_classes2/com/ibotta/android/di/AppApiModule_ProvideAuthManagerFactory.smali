.class public final Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;
.super Ljava/lang/Object;
.source "AppApiModule_ProvideAuthManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/state/user/auth/AuthManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/call/ApiCallFactory;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/call/ApiCallFactory;",
            ">;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;->apiCallFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/call/ApiCallFactory;",
            ">;)",
            "Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;"
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/user/auth/AuthManager;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/call/ApiCallFactory;",
            ">;)",
            "Lcom/ibotta/android/state/user/auth/AuthManager;"
        }
    .end annotation

    .line 42
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/call/ApiCallFactory;

    .line 41
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;->proxyProvideAuthManager(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/call/ApiCallFactory;)Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideAuthManager(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/call/ApiCallFactory;)Lcom/ibotta/android/state/user/auth/AuthManager;
    .locals 0

    .line 56
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/AppApiModule;->provideAuthManager(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/call/ApiCallFactory;)Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 55
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/user/auth/AuthManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/user/auth/AuthManager;
    .locals 3

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;->apiCallFactoryProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;->get()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    return-object v0
.end method
