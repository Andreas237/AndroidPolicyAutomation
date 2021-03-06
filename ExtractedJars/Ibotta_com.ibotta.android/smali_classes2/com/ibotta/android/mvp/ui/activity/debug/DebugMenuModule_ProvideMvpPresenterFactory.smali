.class public final Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "DebugMenuModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final debugStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final permissionPrimersVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;",
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


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;)V"
        }
    .end annotation

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;->debugStateProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;->permissionPrimersVariantProvider:Ljavax/inject/Provider;

    .line 38
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;->pwiUserStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 71
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;"
        }
    .end annotation

    .line 59
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 60
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 61
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;

    .line 62
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/ibotta/android/state/pwi/PwiUserState;

    .line 57
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;Lcom/ibotta/android/state/pwi/PwiUserState;)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;Lcom/ibotta/android/state/pwi/PwiUserState;)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;
    .locals 0

    .line 86
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;Lcom/ibotta/android/state/pwi/PwiUserState;)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 85
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;
    .locals 5

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;->debugStateProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;->permissionPrimersVariantProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;->pwiUserStateProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;

    move-result-object v0

    return-object v0
.end method
