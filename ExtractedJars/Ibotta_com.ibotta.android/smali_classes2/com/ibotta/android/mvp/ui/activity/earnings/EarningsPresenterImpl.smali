.class public Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "EarningsPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;"
    }
.end annotation


# instance fields
.field private customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final earningsHelper:Lcom/ibotta/api/helper/earnings/EarningsHelper;

.field private final earningsLoader:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private pendingOnly:Z

.field private final tracker:Lcom/ibotta/android/tracking/Tracker;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/api/helper/earnings/EarningsHelper;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    const/4 p1, 0x0

    .line 43
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->pendingOnly:Z

    .line 54
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 55
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 56
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->earningsLoader:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;

    .line 57
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->earningsLoader:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;

    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;->setListener(Lcom/ibotta/android/mvp/base/loading/pagination/PaginationLoaderListener;)V

    .line 58
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    .line 59
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->earningsHelper:Lcom/ibotta/api/helper/earnings/EarningsHelper;

    return-void
.end method

.method private generateEarningRow(Lcom/ibotta/api/model/earnings/Earning;)Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;
    .locals 1

    .line 183
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;-><init>()V

    .line 184
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;->setEarning(Lcom/ibotta/api/model/earnings/Earning;)V

    return-object v0
.end method

.method private isEarningStateSupported(Lcom/ibotta/api/model/earnings/Earning$ProcessingState;)Z
    .locals 1

    .line 179
    sget-object v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->ERROR:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private isEarningSupported(Lcom/ibotta/api/model/earnings/Earning;)Z
    .locals 2

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->earningsHelper:Lcom/ibotta/api/helper/earnings/EarningsHelper;

    invoke-virtual {p1}, Lcom/ibotta/api/model/earnings/Earning;->getEarningTypeEnum()Lcom/ibotta/api/model/earnings/Earning$Type;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/api/helper/earnings/EarningsHelper;->isEarningTypeSupported(Lcom/ibotta/api/model/earnings/Earning$Type;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    invoke-virtual {p1}, Lcom/ibotta/api/model/earnings/Earning;->getEarningProcessingStateEnum()Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->isEarningStateSupported(Lcom/ibotta/api/model/earnings/Earning$ProcessingState;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private trackEarningsClick()V
    .locals 2

    .line 204
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->pendingOnly:Z

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "pending_earnings_row_click"

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;)V

    goto :goto_0

    .line 207
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "all_earnings_row_click"

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected generateRows(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/earnings/Earning;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;",
            ">;"
        }
    .end annotation

    .line 153
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 155
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/earnings/Earning;

    .line 156
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->isEarningSupported(Lcom/ibotta/api/model/earnings/Earning;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 160
    :cond_0
    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl$1;->$SwitchMap$com$ibotta$api$model$earnings$Earning$Type:[I

    invoke-virtual {v1}, Lcom/ibotta/api/model/earnings/Earning;->getEarningTypeEnum()Lcom/ibotta/api/model/earnings/Earning$Type;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/api/model/earnings/Earning$Type;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 164
    :pswitch_0
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->generateEarningRow(Lcom/ibotta/api/model/earnings/Earning;)Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method protected generateTotalEarningsAmount(Lcom/ibotta/api/model/customer/Customer;)Ljava/lang/String;
    .locals 3

    .line 192
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->pendingOnly:Z

    if-eqz v0, :cond_0

    .line 194
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getTotalAmountPending()F

    move-result p1

    goto :goto_0

    .line 197
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getLifetimeEarnings()F

    move-result p1

    .line 200
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    float-to-double v1, p1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 64
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 66
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 67
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 70
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 77
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->earningsLoader:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;->onDetach()V

    .line 120
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onDetach()V

    return-void
.end method

.method public onEarningRowClicked(Lcom/ibotta/api/model/earnings/Earning;)V
    .locals 2

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez v0, :cond_0

    return-void

    .line 237
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->trackEarningsClick()V

    .line 239
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl$1;->$SwitchMap$com$ibotta$api$model$earnings$Earning$Type:[I

    invoke-virtual {p1}, Lcom/ibotta/api/model/earnings/Earning;->getEarningTypeEnum()Lcom/ibotta/api/model/earnings/Earning$Type;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/earnings/Earning$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 245
    :pswitch_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;

    invoke-virtual {p1}, Lcom/ibotta/api/model/earnings/Earning;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/api/model/earnings/Earning;->getId()I

    move-result p1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;->showCustomerBonusDetails(Ljava/lang/String;I)V

    goto :goto_0

    .line 242
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->fromEarning(Lcom/ibotta/api/model/earnings/Earning;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;->showEarningsDetails(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onEarningsLoaded(Ljava/util/Set;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/earnings/Earning;",
            ">;)V"
        }
    .end annotation

    .line 143
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez p1, :cond_0

    return-void

    .line 147
    :cond_0
    invoke-virtual {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->generateRows(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 149
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;->setRows(Ljava/util/List;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 83
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    .line 85
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->generateTotalEarningsAmount(Lcom/ibotta/api/model/customer/Customer;)Ljava/lang/String;

    move-result-object v0

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;->setSubtitleValue(Ljava/lang/String;)V

    return-void
.end method

.method protected onFetchStopped()V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->earningsLoader:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;->isLoading()Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchStopped()V

    :cond_0
    return-void
.end method

.method public onHelpIconClicked()V
    .locals 1

    .line 252
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;->showHelpCenter()V

    return-void
.end method

.method public onLastRowDisplayed(Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;)V
    .locals 0

    .line 228
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->earningsLoader:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;->loadMore()V

    return-void
.end method

.method public onLoadFailed(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;",
            ">;)V"
        }
    .end annotation

    .line 213
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez p1, :cond_0

    return-void

    .line 217
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->onLoadingStopped()V

    .line 219
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpPresenterActions:Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/base/MvpPresenterActions;->isNetworkConnected()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 220
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;->onEarningsLoadFailed()V

    goto :goto_0

    .line 222
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;->showNetworkConnectionError()V

    :goto_0
    return-void
.end method

.method public onLoading(Ljava/util/Set;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;",
            ">;Z)V"
        }
    .end annotation

    .line 125
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez p1, :cond_0

    return-void

    .line 129
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;->showLoadingEarnings(Z)V

    return-void
.end method

.method public onRefresh()V
    .locals 1

    .line 101
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onRefresh()V

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->earningsLoader:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;->reload()V

    return-void
.end method

.method public onStart()V
    .locals 1

    .line 107
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStart()V

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->earningsLoader:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;->onStart()V

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->earningsLoader:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;->onStop()V

    .line 114
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStop()V

    return-void
.end method

.method public onStoppedLoading(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;",
            ">;)V"
        }
    .end annotation

    .line 134
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez p1, :cond_0

    return-void

    .line 138
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;->hideLoadingEarnings()V

    return-void
.end method

.method public setPendingOnly(Z)V
    .locals 1

    .line 257
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->pendingOnly:Z

    .line 259
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    if-eqz p1, :cond_0

    .line 261
    sget-object p1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->PENDING:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 263
    :cond_0
    sget-object p1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->PENDING:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 264
    sget-object p1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->COMPLETE:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 267
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;->earningsLoader:Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;->setFilters(Ljava/util/Set;)V

    return-void
.end method
