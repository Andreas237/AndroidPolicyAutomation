.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;
.super Ljava/lang/Object;
.source "TeammateView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract getFlyupCreator(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;
.end method

.method public abstract getMyRankTitle(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract setGraphDataSet(Lcom/ibotta/android/view/graph/GraphDataSet;)V
.end method

.method public abstract setTeammate(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
.end method

.method public abstract showFriendMessageFailed(Lcom/ibotta/api/ApiErrorDetails;)V
.end method

.method public abstract showMessage(Ljava/lang/String;Ljava/util/Date;)V
.end method

.method public abstract showMessageDialog()V
.end method

.method public abstract showNudgeClicked()V
.end method
