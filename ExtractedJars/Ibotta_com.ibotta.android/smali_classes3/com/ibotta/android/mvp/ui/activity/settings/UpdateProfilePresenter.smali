.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;
.super Ljava/lang/Object;
.source "UpdateProfilePresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onBirthDateChanged(III)V
.end method

.method public abstract onChooseBirthDateFocused()V
.end method

.method public abstract onEmailChanged(Ljava/lang/String;)V
.end method

.method public abstract onEmailUpdateDialogClosed()V
.end method

.method public abstract onFirstNameChanged(Ljava/lang/String;)V
.end method

.method public abstract onGenderChanged(Lcom/ibotta/api/call/customer/Gender;)V
.end method

.method public abstract onLastNameChanged(Ljava/lang/String;)V
.end method

.method public abstract onPasswordCaptured(Ljava/lang/String;)V
.end method

.method public abstract onResetPasswordClicked()V
.end method

.method public abstract onResetPasswordConfirmed()V
.end method

.method public abstract onResetPasswordDialogClosed()V
.end method

.method public abstract onSaveProfileClicked()V
.end method

.method public abstract onZipChanged(Ljava/lang/String;)V
.end method
