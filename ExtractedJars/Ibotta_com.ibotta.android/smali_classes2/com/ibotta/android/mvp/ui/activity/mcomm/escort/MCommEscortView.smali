.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;
.super Ljava/lang/Object;
.source "MCommEscortView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;
.implements Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;


# virtual methods
.method public abstract getButtonBrowserSubtitle()Ljava/lang/String;
.end method

.method public abstract getNullCashBackString()Ljava/lang/String;
.end method

.method public abstract invokeButtonAction(Lcom/usebutton/sdk/action/ButtonAction;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;I)V
.end method

.method public abstract invokePurchasePath(Lcom/usebutton/sdk/purchasepath/PurchasePath;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;I)V
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract setTitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
.end method

.method public abstract showFailedToLaunchAppMessage()V
.end method
