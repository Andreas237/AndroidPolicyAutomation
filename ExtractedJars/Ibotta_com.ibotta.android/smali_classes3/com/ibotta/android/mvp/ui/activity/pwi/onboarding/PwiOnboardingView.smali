.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;
.super Ljava/lang/Object;
.source "PwiOnboardingView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpView;


# virtual methods
.method public abstract finishWithResult(I)V
.end method

.method public abstract getPagerPosition()I
.end method

.method public abstract navigatePagerTo(I)V
.end method

.method public abstract setPagerData(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;",
            ">;)V"
        }
    .end annotation
.end method
