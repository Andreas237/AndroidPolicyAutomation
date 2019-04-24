.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;
.super Ljava/lang/Object;
.source "TeamworkView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract doFacebookShare(Lcom/facebook/share/internal/ShareFeedContent;)V
.end method

.method public abstract getFriendName(Lcom/ibotta/android/view/model/FriendItem;Lcom/ibotta/api/model/friend/Friend;)Lcom/ibotta/android/view/model/FriendItem;
.end method

.method public abstract hideRemovingFriendMessage()V
.end method

.method public abstract initAdapter(Ljava/util/List;Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation
.end method

.method public abstract initSocialViewVisibility(Ljava/lang/Boolean;)V
.end method

.method public abstract launchBonus(Lcom/ibotta/api/model/BonusModel;)V
.end method

.method public abstract launchFriendScreen(I)V
.end method

.method public abstract setBonusDetail(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
.end method

.method public abstract setBonuses(Ljava/util/List;Ljava/lang/Boolean;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation
.end method

.method public abstract showEmptyBonuses(Z)V
.end method

.method public abstract showRemoveConfirmation(Lcom/ibotta/android/view/model/FriendItem;)V
.end method

.method public abstract showRemovedFriendSuccess()V
.end method

.method public abstract showRemovingFriendMessage()V
.end method
