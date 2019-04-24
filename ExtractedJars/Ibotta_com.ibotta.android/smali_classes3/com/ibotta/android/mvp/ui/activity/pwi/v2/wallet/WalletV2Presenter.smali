.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;
.super Ljava/lang/Object;
.source "WalletV2Presenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract isFirstTimeCard()Z
.end method

.method public abstract onPaymentMethodActionClicked(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;I)V
.end method

.method public abstract onPaymentMethodAdded()V
.end method

.method public abstract onRefreshTransactions()V
.end method

.method public abstract onSpentFilterChosen(Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)V
.end method

.method public abstract onTransactionActionsDialogClicked(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
.end method
