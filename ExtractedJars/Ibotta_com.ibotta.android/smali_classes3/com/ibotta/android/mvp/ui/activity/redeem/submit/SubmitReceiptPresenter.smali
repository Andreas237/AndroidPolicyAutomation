.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;
.super Ljava/lang/Object;
.source "SubmitReceiptPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
.end method

.method public abstract getVerifiedAmount()F
.end method

.method public abstract onCancelClicked()V
.end method

.method public abstract onDoneClicked()V
.end method

.method public abstract onFailedToGetReceiptSilo()V
.end method

.method public abstract onRedeemAnotherClicked()V
.end method

.method public abstract onRetryClicked()V
.end method

.method public abstract onSubmittedAnimationFinished()V
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setVerifiedAmount(F)V
.end method
