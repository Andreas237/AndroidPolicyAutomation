.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;
.super Ljava/lang/Object;
.source "VerifyCodePresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getPhoneNumber()Ljava/lang/String;
.end method

.method public abstract getReferenceId()Ljava/lang/String;
.end method

.method public abstract onCodeChanged(Ljava/lang/String;)V
.end method

.method public abstract onResendVerificationCodeClicked()V
.end method

.method public abstract onVerifyCodeClicked()V
.end method

.method public abstract onVerifyComplete()V
.end method

.method public abstract setPhoneNumber(Ljava/lang/String;)V
.end method

.method public abstract setReferenceId(Ljava/lang/String;)V
.end method
