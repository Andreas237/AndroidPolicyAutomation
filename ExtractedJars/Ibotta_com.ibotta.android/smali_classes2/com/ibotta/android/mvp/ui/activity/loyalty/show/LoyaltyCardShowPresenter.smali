.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;
.super Ljava/lang/Object;
.source "LoyaltyCardShowPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onAddCardClicked()V
.end method

.method public abstract onCardAdded(IILjava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onFailedToGenerateCardDisplayed()V
.end method

.method public abstract onHelpCenterClicked()V
.end method

.method public abstract onHelpClicked()V
.end method

.method public abstract onHelpInstructionsClicked()V
.end method

.method public abstract onRemoveCanceled()V
.end method

.method public abstract onRemoveCardClicked()V
.end method

.method public abstract onRemoveConfirmed()V
.end method

.method public abstract onUseReceiptClicked()V
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method
