.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;
.super Ljava/lang/Object;
.source "ConnectedAccountsPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;
.implements Lcom/ibotta/android/mvp/ui/activity/im/ImDisconnectConfirmationListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/im/ImDisconnectConfirmationListener;"
    }
.end annotation


# virtual methods
.method public abstract getFacebookManager()Lcom/ibotta/android/social/facebook/FacebookManager;
.end method

.method public abstract getGoogleSignInManager()Lcom/ibotta/android/social/google/GoogleSignInManager;
.end method

.method public abstract onConnectAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;)V
.end method

.method public abstract onDisconnectAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;)V
.end method
