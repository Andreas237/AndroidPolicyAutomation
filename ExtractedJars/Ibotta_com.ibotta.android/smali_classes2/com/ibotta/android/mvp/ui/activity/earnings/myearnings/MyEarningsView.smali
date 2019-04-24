.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;
.super Ljava/lang/Object;
.source "MyEarningsView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract setMyEarningsVisibility(Z)V
.end method

.method public abstract setSubtitleValue(Ljava/lang/String;)V
.end method

.method public abstract setupMyEarningsGraph(Lcom/ibotta/android/view/graph/GraphDataSet;)V
.end method

.method public abstract setupMyEarningsHistory(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/earnings/Earning;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setupMyEarningsMemberSince(Ljava/lang/String;)V
.end method

.method public abstract setupTeammates(Ljava/util/List;II)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;II)V"
        }
    .end annotation
.end method

.method public abstract showCustomerBonusDetails(Ljava/lang/String;I)V
.end method

.method public abstract showEarningsDetails(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V
.end method
