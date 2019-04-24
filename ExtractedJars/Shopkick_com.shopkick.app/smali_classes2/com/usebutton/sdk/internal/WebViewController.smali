.class interface abstract Lcom/usebutton/sdk/internal/WebViewController;
.super Ljava/lang/Object;
.source "WebViewController.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/base/BaseViewController;


# virtual methods
.method public abstract animateFinishBrowserTransition(Lcom/usebutton/sdk/internal/BrowserTransitionStyle;)V
.end method

.method public abstract animateStartBrowserTransition(Lcom/usebutton/sdk/internal/BrowserTransitionStyle;)V
.end method

.method public abstract checkWebViewOnlyAndStartAttendedInstall(Ljava/lang/String;)V
.end method

.method public abstract disableSystemAutofillService()V
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x1a
    .end annotation
.end method

.method public abstract fillFields(Lorg/json/JSONObject;)V
.end method

.method public abstract loadBtnSdkJs()V
.end method

.method public abstract observeFields(Lorg/json/JSONObject;)V
.end method

.method public abstract onAppInstallCardClicked()V
.end method

.method public abstract onConfigureDismissAllCards(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V
.end method

.method public abstract onHideCta()V
.end method

.method public abstract onHideTopCard()V
.end method

.method public abstract onShowAllCard(Z)V
.end method

.method public abstract onShowCta(Lcom/usebutton/sdk/purchasepath/CallToAction;)V
.end method

.method public abstract onShowTopCard()V
.end method

.method public abstract setProgressVisible(Z)V
.end method
