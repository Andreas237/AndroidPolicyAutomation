.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;
.super Ljava/lang/Object;
.source "TeamworkPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onBonusClicked(Lcom/ibotta/api/model/BonusModel;)V
.end method

.method public abstract onFacebookAuthFailed()V
.end method

.method public abstract onFacebookAuthSuccess()V
.end method

.method public abstract onFacebookClicked()V
.end method

.method public abstract onFacebookInfoSuccess()V
.end method

.method public abstract onFacebookLinkSuccess()V
.end method

.method public abstract onFacebookLoginSuccess()V
.end method

.method public abstract onFriendClicked(I)V
.end method

.method public abstract onFriendLongClicked(I)V
.end method

.method public abstract onRemoveCanceled()V
.end method

.method public abstract onRemoveConfirmed(Lcom/ibotta/android/view/model/FriendItem;)V
.end method

.method public abstract setFacebookManager(Lcom/ibotta/android/social/facebook/FacebookManager;)V
.end method
