.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenter;
.super Ljava/lang/Object;
.source "ForgotPasswordPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onEmailChanged(Ljava/lang/String;)V
.end method

.method public abstract onResetPasswordClicked(Ljava/lang/String;)V
.end method

.method public abstract onResetPasswordMessageShown()V
.end method
