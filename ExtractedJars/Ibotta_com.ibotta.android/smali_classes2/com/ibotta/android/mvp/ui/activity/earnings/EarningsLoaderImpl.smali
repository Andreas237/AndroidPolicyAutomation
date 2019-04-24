.class public Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;
.super Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;
.source "EarningsLoaderImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader<",
        "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderListener;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;"
    }
.end annotation


# instance fields
.field private final apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private earnings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/earnings/Earning;",
            ">;"
        }
    .end annotation
.end field

.field private earningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;-><init>(Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V

    .line 29
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earnings:Ljava/util/List;

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 38
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    .line 39
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-void
.end method


# virtual methods
.method protected clearAndReload()V
    .locals 1

    .line 105
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;->clearAndReload()V

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {v0, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    const/4 v0, 0x0

    .line 109
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earnings:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    .line 115
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomerEarning()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    .line 116
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    .line 118
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->loadNextBatch()V

    return-void
.end method

.method protected createNextLoadJob()Lcom/ibotta/android/service/api/job/ApiJob;
    .locals 7

    .line 132
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 133
    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->filters:Ljava/util/Set;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->lastLoad:Ljava/lang/Long;

    const/4 v4, 0x0

    const/16 v5, 0x32

    .line 132
    invoke-interface/range {v1 .. v6}, Lcom/ibotta/api/call/ApiCallFactory;->createCustomerEarningsCall(ILjava/util/Set;Ljava/util/Set;ILjava/lang/Long;)Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-object v0
.end method

.method protected loadNextBatch()V
    .locals 3

    .line 123
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;->loadNextBatch()V

    .line 125
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->allLoaded:Z

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->listener:Lcom/ibotta/android/mvp/base/loading/pagination/PaginationLoaderListener;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->filters:Ljava/util/Set;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earnings:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderListener;->onEarningsLoaded(Ljava/util/Set;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 4

    .line 44
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;->onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 46
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 50
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsResponse;

    if-nez p1, :cond_1

    return-void

    .line 55
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsResponse;->getEarnings()Ljava/util/List;

    move-result-object p1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earnings:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earnings:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 60
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earnings:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earnings:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/earnings/Earning;

    .line 64
    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getUpdatedAt()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->lastLoad:Ljava/lang/Long;

    .line 67
    :cond_2
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->isAllLoaded(I)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->allLoaded:Z

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearBonuses()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->finishedLoading()V

    .line 72
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->listener:Lcom/ibotta/android/mvp/base/loading/pagination/PaginationLoaderListener;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderListener;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->filters:Ljava/util/Set;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earnings:Ljava/util/List;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderListener;->onEarningsLoaded(Ljava/util/Set;Ljava/util/List;)V

    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 93
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;->onDetach()V

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    .line 96
    invoke-virtual {v0, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    const/4 v0, 0x0

    .line 97
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earnings:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public onStart()V
    .locals 3

    .line 77
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;->onStart()V

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->lastLoad:Ljava/lang/Long;

    if-nez v0, :cond_0

    .line 80
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->loadNextBatch()V

    goto :goto_0

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->listener:Lcom/ibotta/android/mvp/base/loading/pagination/PaginationLoaderListener;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->filters:Ljava/util/Set;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;->earnings:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderListener;->onEarningsLoaded(Ljava/util/Set;Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 88
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;->onStop()V

    return-void
.end method
