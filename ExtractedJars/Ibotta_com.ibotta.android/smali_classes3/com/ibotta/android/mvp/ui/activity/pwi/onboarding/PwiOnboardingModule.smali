.class public Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "PwiOnboardingModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/pwi/PwiOnboardingReducer;Lcom/ibotta/android/state/pwi/PwiUserState;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 25
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/pwi/PwiOnboardingReducer;Lcom/ibotta/android/state/pwi/PwiUserState;)V

    return-object v0
.end method

.method public providePwiOnboardingReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/pwi/PwiOnboardingReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 30
    new-instance v0, Lcom/ibotta/android/pwi/PwiOnboardingReducer;

    invoke-direct {v0, p1}, Lcom/ibotta/android/pwi/PwiOnboardingReducer;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method
