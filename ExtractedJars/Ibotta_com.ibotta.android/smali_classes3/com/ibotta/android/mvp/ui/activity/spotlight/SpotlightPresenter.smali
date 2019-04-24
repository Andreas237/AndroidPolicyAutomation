.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;
.super Ljava/lang/Object;
.source "SpotlightPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getOfferSegmentId()Ljava/lang/Integer;
.end method

.method public abstract onAvailableAtCantFindThisItem()V
.end method

.method public abstract onAvailableAtCantFindThisItem(Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract onBonusClicked(Lcom/ibotta/api/model/BonusModel;)V
.end method

.method public abstract onCantFindItSuccess()V
.end method

.method public abstract onCaptureProductImageNotPossible()V
.end method

.method public abstract onCheckProductClicked()V
.end method

.method public abstract onFixRebate()V
.end method

.method public abstract onFixRebateNoticeConfirmed()V
.end method

.method public abstract onLocateStoreMapClicked(Ljava/lang/Integer;)V
.end method

.method public abstract onOfferNotFoundDisplayed()V
.end method

.method public abstract onProductImageCaptureFailed()V
.end method

.method public abstract onProductImageCaptureSuccess(Ljava/lang/String;)V
.end method

.method public abstract onProductVerificationFailed()V
.end method

.method public abstract onProductVerificationGaveUp(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V
.end method

.method public abstract onProductVerified()V
.end method

.method public abstract onRebateImageCardClicked()V
.end method

.method public abstract onRetryAddProduct()V
.end method

.method public abstract onShareClicked()V
.end method

.method public abstract onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract onUnlockCompleted()V
.end method

.method public abstract setFailedVerificationBarcode(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V
.end method

.method public abstract setFailedVerificationProductImagePath(Ljava/lang/String;)V
.end method

.method public abstract setOfferIds([I)V
.end method

.method public abstract setRebateRewarded(ZZLjava/lang/String;)V
.end method

.method public abstract setRetailerId(Ljava/lang/Integer;)V
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
