.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;
.super Ljava/lang/Object;
.source "PwiBarcodeView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract bindViewEvents(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;)V
.end method

.method public abstract onCopyBarcodeClick()V
.end method

.method public abstract onSpentToggled()V
.end method

.method public abstract onTermsOfUseClick(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V
.end method

.method public abstract onUpdateBalanceClick(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
.end method

.method public abstract showEditUpdateBalanceDialog(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;I)V
.end method

.method public abstract updateViewState(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
.end method
