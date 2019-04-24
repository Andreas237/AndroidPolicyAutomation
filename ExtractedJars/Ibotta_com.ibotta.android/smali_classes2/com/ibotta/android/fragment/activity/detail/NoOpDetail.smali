.class public Lcom/ibotta/android/fragment/activity/detail/NoOpDetail;
.super Ljava/lang/Object;
.source "NoOpDetail.java"

# interfaces
.implements Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getActionBarSubtitle()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getActionBarTitle()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getApiJobs()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLayout()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getReceiptUrls()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 44
    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public isCustomContainer()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isItemized()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isReportIssue()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isResendGiftCardEmail()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isSafeToLoad()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isViewReceipt()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isVisitSupport()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    return-void
.end method

.method public onApiJobsFinished()V
    .locals 0

    return-void
.end method

.method public onFragmentPause()V
    .locals 0

    return-void
.end method

.method public onFragmentResume()V
    .locals 0

    return-void
.end method

.method public setItemsView(Landroid/widget/ListView;Landroid/widget/TextView;)V
    .locals 0

    return-void
.end method

.method public setParentView(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public setTextContainerView(Lcom/ibotta/android/view/common/TextContainerView;)V
    .locals 0

    return-void
.end method
