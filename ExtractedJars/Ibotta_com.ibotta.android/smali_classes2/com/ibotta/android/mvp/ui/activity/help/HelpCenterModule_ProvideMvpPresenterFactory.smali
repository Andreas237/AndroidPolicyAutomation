.class public final Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "HelpCenterModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 37
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;"
        }
    .end annotation

    .line 32
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;
    .locals 0

    .line 43
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 42
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;
    .locals 2

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;

    move-result-object v0

    return-object v0
.end method
