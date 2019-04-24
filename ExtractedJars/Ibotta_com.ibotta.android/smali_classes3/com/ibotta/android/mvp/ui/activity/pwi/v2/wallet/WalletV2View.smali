.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;
.super Ljava/lang/Object;
.source "WalletV2View.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract showAddNewCardActivity()V
.end method

.method public abstract showBarcodeScreen(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
.end method

.method public abstract showGooglePayActionsDialog(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
.end method

.method public abstract showPaymentMethodActionsDialog(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
.end method

.method public abstract showPwiHomeScreen(I)V
.end method

.method public abstract showPwiRetailersScreen()V
.end method

.method public abstract showRemovePaymentMethodConfirmationDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
.end method

.method public abstract showSpentFilterSelector(Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;)V
.end method

.method public abstract showTransactionActionsDialog(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
.end method

.method public abstract updateViewState(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;",
            "Lcom/ibotta/android/views/components/ViewState;",
            ">;)V"
        }
    .end annotation
.end method
