.class public interface abstract Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;
.super Ljava/lang/Object;
.source "ActivityDetail.java"


# virtual methods
.method public abstract getActionBarSubtitle()Ljava/lang/String;
.end method

.method public abstract getActionBarTitle()Ljava/lang/String;
.end method

.method public abstract getApiJobs()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getLayout()I
.end method

.method public abstract getReceiptUrls()[Ljava/lang/String;
.end method

.method public abstract getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
.end method

.method public abstract isCustomContainer()Z
.end method

.method public abstract isItemized()Z
.end method

.method public abstract isReportIssue()Z
.end method

.method public abstract isResendGiftCardEmail()Z
.end method

.method public abstract isSafeToLoad()Z
.end method

.method public abstract isViewReceipt()Z
.end method

.method public abstract isVisitSupport()Z
.end method

.method public abstract onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
.end method

.method public abstract onApiJobsFinished()V
.end method

.method public abstract onFragmentPause()V
.end method

.method public abstract onFragmentResume()V
.end method

.method public abstract setItemsView(Landroid/widget/ListView;Landroid/widget/TextView;)V
.end method

.method public abstract setParentView(Landroid/view/View;)V
.end method

.method public abstract setTextContainerView(Lcom/ibotta/android/view/common/TextContainerView;)V
.end method
