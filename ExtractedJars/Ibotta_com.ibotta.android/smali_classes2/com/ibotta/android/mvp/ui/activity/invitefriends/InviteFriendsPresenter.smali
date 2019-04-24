.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;
.super Ljava/lang/Object;
.source "InviteFriendsPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/social/SocialMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/social/SocialMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract checkIfTwitterInstalled()V
.end method

.method public abstract onBottomButtonsDialogCancelClicked()V
.end method

.method public abstract onCopyReferralCodeClicked()V
.end method

.method public abstract onCopyReferralLinkClicked()V
.end method

.method public abstract onFacebookClicked()V
.end method

.method public abstract onReferralCodeClicked()V
.end method

.method public abstract onShareClicked()V
.end method

.method public abstract onTwitterClicked()V
.end method
