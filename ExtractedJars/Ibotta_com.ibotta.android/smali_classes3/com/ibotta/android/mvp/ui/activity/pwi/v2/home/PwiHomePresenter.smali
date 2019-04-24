.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;
.super Ljava/lang/Object;
.source "PwiHomePresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getContentId()Lcom/ibotta/android/apiandroid/content/ContentId;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailerId()I
.end method

.method public abstract getTxnId()Ljava/lang/String;
.end method

.method public abstract isFirstTimeCard()Z
.end method

.method public abstract onGooglePayActivityResult(Lcom/google/android/gms/wallet/PaymentData;)V
.end method

.method public abstract onHelpIconClicked()V
.end method

.method public abstract onPaymentMethodAdded()V
.end method

.method public abstract onPaymentMethodClicked(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V
.end method

.method public abstract onPurchaseBarcodeScreenDismiss()V
.end method

.method public abstract onRefreshTransactions()V
.end method

.method public abstract onRetryPollingJobPromptClicked()V
.end method

.method public abstract onViewPagerChanged(I)V
.end method

.method public abstract setContentId(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .param p1    # Lcom/ibotta/android/apiandroid/content/ContentId;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setRetailerId(I)V
.end method

.method public abstract setTxnId(Ljava/lang/String;)V
.end method
