.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;
.super Ljava/lang/Object;
.source "PwiBarcodePresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getTransactionId()Ljava/lang/String;
.end method

.method public abstract onUpdateBalanceActionsDialogClicked(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
.end method

.method public abstract onUpdateBalanceReceived(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;ILjava/lang/String;)V
.end method

.method public abstract setTransactionId(Ljava/lang/String;)V
.end method
