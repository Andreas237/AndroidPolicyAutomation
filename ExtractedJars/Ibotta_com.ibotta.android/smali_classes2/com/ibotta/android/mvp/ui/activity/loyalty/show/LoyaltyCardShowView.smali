.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;
.super Ljava/lang/Object;
.source "LoyaltyCardShowView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract setPresentation(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;)V
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract showCardAddedSuccess()V
.end method

.method public abstract showFailedToGenerateCard()V
.end method

.method public abstract showFailedToRemoveCard()V
.end method

.method public abstract showHelp()V
.end method

.method public abstract showHelpCenter()V
.end method

.method public abstract showHelpInstructions(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract showLoyaltyCardAdd(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract showRedeemReqs(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract showRemoveCardConfirmation()V
.end method
