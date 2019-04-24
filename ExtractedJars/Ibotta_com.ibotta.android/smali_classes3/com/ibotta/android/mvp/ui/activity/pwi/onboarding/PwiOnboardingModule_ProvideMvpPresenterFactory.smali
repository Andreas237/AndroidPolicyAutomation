.class public final Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "PwiOnboardingModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final pwiOnboardingReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/pwi/PwiOnboardingReducer;",
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
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/pwi/PwiOnboardingReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;->pwiOnboardingReducerProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;->pwiUserStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/pwi/PwiOnboardingReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 59
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/pwi/PwiOnboardingReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;"
        }
    .end annotation

    .line 49
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 50
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/pwi/PwiOnboardingReducer;

    .line 51
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/state/pwi/PwiUserState;

    .line 47
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/pwi/PwiOnboardingReducer;Lcom/ibotta/android/state/pwi/PwiUserState;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/pwi/PwiOnboardingReducer;Lcom/ibotta/android/state/pwi/PwiUserState;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;
    .locals 0

    .line 69
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/pwi/PwiOnboardingReducer;Lcom/ibotta/android/state/pwi/PwiUserState;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 68
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;
    .locals 4

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;->pwiOnboardingReducerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;->pwiUserStateProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;

    move-result-object v0

    return-object v0
.end method
