.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;
.super Ljava/lang/Object;
.source "EarningsView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract hideLoadingEarnings()V
.end method

.method public abstract onEarningsLoadFailed()V
.end method

.method public abstract setRows(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setSubtitleValue(Ljava/lang/String;)V
.end method

.method public abstract showCustomerBonusDetails(Ljava/lang/String;I)V
.end method

.method public abstract showEarningsDetails(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V
.end method

.method public abstract showHelpCenter()V
.end method

.method public abstract showLoadingEarnings(Z)V
.end method
