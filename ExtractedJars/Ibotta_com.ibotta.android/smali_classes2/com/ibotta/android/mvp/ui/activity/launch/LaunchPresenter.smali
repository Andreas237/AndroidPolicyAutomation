.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;
.super Ljava/lang/Object;
.source "LaunchPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onDebugMenuRequested()V
.end method

.method public abstract onEmailLoginSuccess()V
.end method

.method public abstract onFacebookAuthSuccess()V
.end method

.method public abstract onFacebookInfoSuccess()V
.end method

.method public abstract onFacebookInteractionFailed()V
.end method

.method public abstract onGoogleSignInSuccess(Lcom/ibotta/android/state/social/GoogleSignInInfo;)V
.end method

.method public abstract onLogInClicked()V
.end method

.method public abstract onLoginSuccess()V
.end method

.method public abstract onLostAuthDetected()V
.end method

.method public abstract onRegistrationSuccess(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onSignInFacebookClicked()V
.end method

.method public abstract onSignInGoogleClicked()V
.end method

.method public abstract onSignUpEmailClicked()V
.end method

.method public abstract setFacebookManager(Lcom/ibotta/android/social/facebook/FacebookManager;)V
.end method

.method public abstract setGoogleSignInManager(Lcom/ibotta/android/social/google/GoogleSignInManager;)V
.end method
