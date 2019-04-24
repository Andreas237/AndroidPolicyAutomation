.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;
.super Ljava/lang/Object;
.source "VerifyWizardView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract finishWithCancel()V
.end method

.method public abstract finishWithError()V
.end method

.method public abstract finishWithSuccess()V
.end method

.method public abstract initYesNoPage(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;)V
.end method

.method public abstract setInitializing(Z)V
.end method

.method public abstract setPages(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setTitleForCurrentPage(II)V
.end method

.method public abstract showErrorMessage()V
.end method

.method public abstract startScanActivity(Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;)V
.end method
