.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenter;
.super Ljava/lang/Object;
.source "LoginPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/login/LoginView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onForgotPasswordClicked()V
.end method

.method public abstract onLogInChanged(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onLogInClicked(Ljava/lang/String;Ljava/lang/String;)V
.end method
