.class public abstract Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;
.super Ljava/lang/Object;
.source "BaseActivityDetail.java"

# interfaces
.implements Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;


# instance fields
.field protected final activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

.field protected final context:Landroid/content/Context;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field protected tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

.field protected v:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->context:Landroid/content/Context;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method


# virtual methods
.method public getActionBarSubtitle()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLayout()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public getReceiptUrls()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected initByStatus()V
    .locals 7

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->PENDING:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v0, v1, :cond_0

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

    const v1, 0x7f110474

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TextContainerView;->setHeader(I)V

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

    const v1, 0x7f110473

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TextContainerView;->setBody(I)V

    goto :goto_1

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->ERROR:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    .line 134
    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->DUPLICATE:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 142
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->initView()V

    goto :goto_1

    .line 135
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

    const v1, 0x7f110487

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TextContainerView;->setHeader(I)V

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object v0

    .line 137
    invoke-virtual {v0}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameLower()Ljava/lang/String;

    move-result-object v1

    .line 138
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    const/4 v3, 0x0

    invoke-interface {v2, v1, v3}, Lcom/ibotta/android/util/Formatting;->prefixAorAn(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    .line 139
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

    iget-object v4, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->context:Landroid/content/Context;

    const v5, 0x7f110486

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    .line 140
    invoke-virtual {v0}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameLower()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v6, v3

    const/4 v0, 0x1

    aput-object v1, v6, v0

    .line 139
    invoke-virtual {v4, v5, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/ibotta/android/view/common/TextContainerView;->setBody(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method protected abstract initView()V
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

    const/4 v0, 0x1

    return v0
.end method

.method public isResendGiftCardEmail()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isSafeToLoad()Z
    .locals 2

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    .line 98
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->isStatusSelfManaged()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->ERROR:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->DUPLICATE:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->PENDING:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method protected isStatusSelfManaged()Z
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

    const/4 v0, 0x1

    return v0
.end method

.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
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

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->v:Landroid/view/View;

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->isStatusSelfManaged()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->initView()V

    :cond_0
    return-void
.end method

.method public setTextContainerView(Lcom/ibotta/android/view/common/TextContainerView;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->isStatusSelfManaged()Z

    move-result p1

    if-nez p1, :cond_0

    .line 62
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->initByStatus()V

    :cond_0
    return-void
.end method
