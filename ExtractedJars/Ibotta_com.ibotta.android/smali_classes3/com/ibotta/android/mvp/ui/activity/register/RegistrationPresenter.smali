.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;
.super Ljava/lang/Object;
.source "RegistrationPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onBirthdateChanged(Ljava/lang/String;)V
.end method

.method public abstract onBirthdateSet(III)V
.end method

.method public abstract onDateOfBirthFocused()V
.end method

.method public abstract onEmailChanged(Ljava/lang/String;)V
.end method

.method public abstract onFirstNameChanged(Ljava/lang/String;)V
.end method

.method public abstract onGenderFocused()V
.end method

.method public abstract onGenderSelected(Ljava/lang/String;)V
.end method

.method public abstract onLastNameChanged(Ljava/lang/String;)V
.end method

.method public abstract onPasswordChanged(Ljava/lang/String;)V
.end method

.method public abstract onReferralCodeChanged(Ljava/lang/String;)V
.end method

.method public abstract onRegistrationChanged(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;)V
.end method

.method public abstract onSignUpClicked(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;)V
.end method

.method public abstract onZipCodeChanged(Ljava/lang/String;)V
.end method
