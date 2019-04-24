.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;
.super Ljava/lang/Object;
.source "EarningsDetailPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getEarningDetailParcel()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;
.end method

.method public abstract initBonusesTitle(Ljava/lang/String;)V
.end method

.method public abstract initItemType(Ljava/lang/String;)V
.end method

.method public abstract initOffersTitle(Ljava/lang/String;)V
.end method

.method public abstract onBonusRowClicked(Lcom/ibotta/api/model/BonusModel;)V
.end method

.method public abstract onBottomButtonsDialogCancelClicked()V
.end method

.method public abstract onDoubleCheckContinue()V
.end method

.method public abstract onHelpCenterClicked()V
.end method

.method public abstract onHelpIconClicked()V
.end method

.method public abstract onReportAnIssueClicked()V
.end method

.method public abstract onReportAnIssueFailed()V
.end method

.method public abstract onReportReadyToSend(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onViewReceipt()V
.end method

.method public abstract setEarningDetailParcel(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V
.end method
