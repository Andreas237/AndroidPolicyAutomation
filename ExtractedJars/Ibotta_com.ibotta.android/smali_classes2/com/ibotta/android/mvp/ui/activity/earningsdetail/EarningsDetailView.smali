.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;
.super Ljava/lang/Object;
.source "EarningsDetailView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract cancelDialog()V
.end method

.method public abstract getAmountPendingSubtitle()Ljava/lang/String;
.end method

.method public abstract getDefaultTitle()Ljava/lang/String;
.end method

.method public abstract getSubtitleProcessing()Ljava/lang/String;
.end method

.method public abstract getTotalEarningsSubtitle()Ljava/lang/String;
.end method

.method public abstract notifyReportFailure()V
.end method

.method public abstract notifyReportSuccess()V
.end method

.method public abstract setRows(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setupToolbar(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;)V
.end method

.method public abstract showBonusDetails(Lcom/ibotta/api/model/BonusModel;)V
.end method

.method public abstract showDoubleCheckDialog()V
.end method

.method public abstract showHelpCenter()V
.end method

.method public abstract showHelpDialog([Ljava/lang/String;)V
.end method

.method public abstract showReceipt(I)V
.end method

.method public abstract showReportAnIssueDialog(Ljava/lang/String;)V
.end method

.method public abstract showReportAnIssueFailed()V
.end method
