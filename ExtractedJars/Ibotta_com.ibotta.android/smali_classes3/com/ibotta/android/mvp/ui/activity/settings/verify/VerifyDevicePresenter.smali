.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenter;
.super Ljava/lang/Object;
.source "VerifyDevicePresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onStartVerificationClicked()V
.end method

.method public abstract onVerifyComplete()V
.end method

.method public abstract onWhyDoThisClicked()V
.end method
