.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;
.super Ljava/lang/Object;
.source "ChangeQuantityView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract finishWithDecreasedResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract finishWithIncreasedResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract finishWithNoChangeResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract initControls()V
.end method

.method public abstract setDecrementButtonEnabled(Z)V
.end method

.method public abstract setDoneButtonEnabled(Z)V
.end method

.method public abstract setIncrementButtonEnabled(Z)V
.end method

.method public abstract setQuantity(I)V
.end method

.method public abstract setRebateImage(Ljava/lang/String;)V
.end method

.method public abstract setRebateName(Ljava/lang/String;)V
.end method

.method public abstract setRedemptionLimit(S)V
.end method
