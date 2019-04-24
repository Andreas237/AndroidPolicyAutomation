.class public final Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "LaunchModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;",
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

.field private final deviceSecurityProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final postAuthWorkJobFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;",
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

.field private final variantFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    .line 42
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->deviceSecurityProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->authManagerProvider:Ljavax/inject/Provider;

    .line 46
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->postAuthWorkJobFactoryProvider:Ljavax/inject/Provider;

    .line 47
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->variantFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 88
    new-instance v8, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v8
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;"
        }
    .end annotation

    .line 72
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 73
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/ibotta/android/security/DeviceSecurity;

    .line 74
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/ibotta/android/state/user/UserState;

    .line 75
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 76
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    .line 77
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lcom/ibotta/android/features/factory/VariantFactory;

    move-object v0, p0

    .line 70
    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;
    .locals 0

    .line 107
    invoke-virtual/range {p0 .. p6}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 106
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;
    .locals 7

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->deviceSecurityProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->authManagerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->postAuthWorkJobFactoryProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->variantFactoryProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    move-result-object v0

    return-object v0
.end method
