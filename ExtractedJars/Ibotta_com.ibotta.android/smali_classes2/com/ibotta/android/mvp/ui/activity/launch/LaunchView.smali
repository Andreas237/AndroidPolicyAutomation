.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;
.super Ljava/lang/Object;
.source "LaunchView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract executeRoute(Ljava/lang/String;)V
.end method

.method public abstract getRoute()Ljava/lang/String;
.end method

.method public abstract loadVideo()V
.end method

.method public abstract showAuthLostMessage()V
.end method

.method public abstract showControls()V
.end method

.method public abstract showDebugMenu()V
.end method

.method public abstract showLogIn()V
.end method

.method public abstract showPersonalStoreChooser(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showRegistration()V
.end method

.method public abstract signInWithGoogle()V
.end method
