.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;
.super Ljava/lang/Object;
.source "PwiHomeView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract resetLoadingIndicatorText()V
.end method

.method public abstract setData(Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarViewState;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarViewState;",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;",
            "Lcom/ibotta/android/views/components/ViewState;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showAddNewCardActivity()V
.end method

.method public abstract showBarcodeScreen(Ljava/lang/String;Z)V
.end method

.method public abstract showCongratsAnimation(Ljava/lang/String;)V
.end method

.method public abstract showErrorDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
.end method

.method public abstract showGooglePayFlow(Lcom/google/android/gms/tasks/Task;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/wallet/PaymentData;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showOrderedButFailedPrompt(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V
.end method

.method public abstract showPayConfirmationDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
.end method

.method public abstract showPaymentMethodSelector(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;)V
.end method

.method public abstract showPwiOnboarding(I)V
.end method

.method public abstract showTransactionPendingDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
.end method

.method public abstract showTransactionsTab()V
.end method

.method public abstract showWalletScreen()V
.end method

.method public abstract updateChargingCardText(Ljava/lang/String;)V
.end method
