.class public Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "NotificationDetailPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;"
    }
.end annotation


# static fields
.field private static final FORMAT_DETAILS:Ljava/lang/String; = "%1$s:%2$s"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

.field private notification:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

.field private final tracker:Lcom/ibotta/android/tracking/Tracker;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/Tracker;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 35
    new-instance p1, Lcom/ibotta/android/fragment/activity/detail/NoOpDetail;

    invoke-direct {p1}, Lcom/ibotta/android/fragment/activity/detail/NoOpDetail;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    .line 43
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 44
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 45
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    return-void
.end method

.method private showViews()V
    .locals 3

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    invoke-interface {v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->isItemized()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->setItemsVisible(Z)V

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-interface {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->setDetailsVisible(Z)V

    goto :goto_0

    .line 177
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-interface {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->setItemsVisible(Z)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->setDetailsVisible(Z)V

    :goto_0
    return-void
.end method

.method private trackNotificationDetailView()V
    .locals 4

    const-string v0, "%1$s:%2$s"

    const/4 v1, 0x2

    .line 183
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->notification:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    .line 184
    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDisplayType()Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->notification:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 183
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 185
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v2, "notification_detail_view"

    invoke-interface {v1, v2, v0}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getDetail()Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    return-object v0
.end method

.method protected getFetchJobs()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 50
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 52
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    invoke-interface {v1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->isSafeToLoad()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 53
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    invoke-interface {v1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->getApiJobs()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 56
    :cond_0
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 57
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->showViews()V

    :cond_1
    return-object v0
.end method

.method public getNotification()Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->notification:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 0

    return-void
.end method

.method public onDoubleCheckContinueClicked()V
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->showReportIssueDialog()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    invoke-interface {v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->onApiJobsFinished()V

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    invoke-interface {v1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->getActionBarTitle()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->setTitle(Ljava/lang/CharSequence;)V

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    invoke-interface {v1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->getActionBarSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 86
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->showViews()V

    return-void
.end method

.method protected onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 75
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    invoke-interface {v0, p1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method protected onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 69
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    invoke-interface {v0, p1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public onHelpClicked()V
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->showHelpDialog()V

    return-void
.end method

.method public onReportIssueClicked()V
    .locals 2

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->notification:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDisplayType()Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->RECEIPT:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    .line 138
    invoke-interface {v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/common/VerificationType;->isOnline()Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->showDoubleCheckDialog()V

    goto :goto_0

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->showReportIssueDialog()V

    :goto_0
    return-void
.end method

.method public onReportIssueSubmitClicked(Ljava/lang/String;)V
    .locals 4

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    invoke-static {}, Lcom/ibotta/android/App;->getProblemReportPhoneData()Ljava/lang/String;

    move-result-object v0

    .line 160
    new-instance v1, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;

    invoke-direct {v1}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;-><init>()V

    .line 161
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->notification:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getItemId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->setItemId(J)V

    .line 162
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->notification:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getItemType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->setItemType(Ljava/lang/String;)V

    .line 163
    invoke-virtual {v1, v0}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->setPhoneData(Ljava/lang/String;)V

    .line 164
    invoke-virtual {v1, p1}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->setText(Ljava/lang/String;)V

    .line 166
    new-instance p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v0, Lcom/ibotta/api/call/problem/ProblemsPostCall;

    invoke-direct {v0, v1}, Lcom/ibotta/api/call/problem/ProblemsPostCall;-><init>(Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;)V

    invoke-direct {p1, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    goto :goto_0

    .line 168
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->showReportIssueError()V

    :goto_0
    return-void
.end method

.method public onResendGiftCardEmail()V
    .locals 3

    .line 125
    new-instance v0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardEmailPostCall;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 126
    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->notification:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDisplayId()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardEmailPostCall;-><init>(II)V

    .line 127
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v1, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 91
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 93
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardEmailPostCall;

    if-eqz v0, :cond_0

    .line 94
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->showResendGiftCardSuccess()V

    goto :goto_0

    .line 95
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/problem/ProblemsPostCall;

    if-eqz p1, :cond_1

    .line 96
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->showReportIssueSuccess()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onSupportClicked()V
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->showHelpCenter()V

    return-void
.end method

.method public onViewReceiptClicked()V
    .locals 2

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    invoke-interface {v1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->getReceiptUrls()[Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->showReceiptViewer([Ljava/lang/String;)V

    return-void
.end method

.method public setNotification(Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;)V
    .locals 1

    .line 102
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->notification:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    .line 104
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->trackNotificationDetailView()V

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;->createDetail(Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;)Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;->detail:Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    return-void
.end method
