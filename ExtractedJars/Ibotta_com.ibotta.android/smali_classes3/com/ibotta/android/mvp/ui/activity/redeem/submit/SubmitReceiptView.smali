.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;
.super Ljava/lang/Object;
.source "SubmitReceiptView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract getReceiptSilo()Lcom/ibotta/android/commons/disk/StorageSilo;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract setSubmittingProgress(F)V
.end method

.method public abstract showFailed()V
.end method

.method public abstract showRedeemRequirements(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract showSubmitted()V
.end method

.method public abstract showSubmitting()V
.end method

.method public abstract showSuccess()V
.end method

.method public abstract showSuccessMessage(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
