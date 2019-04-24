.class public Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;
.super Ljava/lang/Object;
.source "ButtonSdkTxsLoader.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$ButtonSdkTxsLoaderListener;
    }
.end annotation


# instance fields
.field private final apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private giveUpRunnable:Ljava/lang/Runnable;

.field private final handler:Landroid/os/Handler;

.field private listener:Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$ButtonSdkTxsLoaderListener;

.field private final retailerId:I

.field private final srcToken:Ljava/lang/String;

.field private final timestamp:J

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Landroid/os/Handler;IJLjava/lang/String;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 51
    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 52
    iput-object p3, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 53
    iput-object p4, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->handler:Landroid/os/Handler;

    .line 54
    iput p5, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->retailerId:I

    .line 55
    iput-wide p6, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->timestamp:J

    .line 56
    iput-object p8, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->srcToken:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected createCustomerButtonTxsCall(IIJLjava/lang/String;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;
    .locals 7

    .line 93
    new-instance v6, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;-><init>(IIJLjava/lang/String;)V

    return-object v6
.end method

.method protected createDefaultButtonTx(Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;)Lcom/ibotta/api/model/buttonsdk/ButtonTx;
    .locals 1

    .line 110
    new-instance v0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    invoke-direct {v0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;-><init>()V

    .line 112
    invoke-virtual {p1}, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->setStatus(Ljava/lang/String;)V

    .line 113
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->setPurchaseTime(Ljava/util/Date;)V

    const/4 p1, 0x0

    .line 114
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->setValue(Ljava/lang/Float;)V

    return-object v0
.end method

.method protected createDefaultCustomerButtonTxsResponse(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;
    .locals 2

    .line 120
    new-instance v0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;-><init>()V

    .line 121
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;->getButtonTxs()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected createGiveUpRunnable(Lcom/ibotta/android/service/api/job/SingleApiJob;)Ljava/lang/Runnable;
    .locals 1

    .line 101
    new-instance v0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$1;-><init>(Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-object v0
.end method

.method protected createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 2

    .line 97
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    return-object v0
.end method

.method protected findMostRecentTx(Ljava/util/List;)Lcom/ibotta/api/model/buttonsdk/ButtonTx;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/buttonsdk/ButtonTx;",
            ">;)",
            "Lcom/ibotta/api/model/buttonsdk/ButtonTx;"
        }
    .end annotation

    .line 207
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    if-nez v0, :cond_1

    goto :goto_1

    .line 210
    :cond_1
    invoke-virtual {v1}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getPurchaseTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getPurchaseTime()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    :goto_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    if-nez v0, :cond_3

    .line 216
    sget-object p1, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->UNKNOWN:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->createDefaultButtonTx(Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;)Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    move-result-object v0

    :cond_3
    return-object v0
.end method

.method protected getCustomerId()I
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v0

    return v0
.end method

.method protected getHandler()Landroid/os/Handler;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method public getListener()Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$ButtonSdkTxsLoaderListener;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->listener:Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$ButtonSdkTxsLoaderListener;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 60
    iget v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->retailerId:I

    return v0
.end method

.method public getSrcToken()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->srcToken:Ljava/lang/String;

    return-object v0
.end method

.method protected getTimeout()J
    .locals 2

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getButtonSdkWelcomeBackTimeout()J

    move-result-wide v0

    return-wide v0
.end method

.method public getTimestamp()J
    .locals 2

    .line 64
    iget-wide v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->timestamp:J

    return-wide v0
.end method

.method protected initGiveUpRunnable(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 153
    invoke-virtual {p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->createGiveUpRunnable(Lcom/ibotta/android/service/api/job/SingleApiJob;)Ljava/lang/Runnable;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->giveUpRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method protected monitorTxsCall(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 3

    .line 137
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->resetGiveUpRunnable()V

    .line 138
    invoke-virtual {p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->initGiveUpRunnable(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 139
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->getHandler()Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->giveUpRunnable:Ljava/lang/Runnable;

    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->getTimeout()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 2

    const-string v0, "onApiJobFinished"

    const/4 v1, 0x0

    .line 179
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->resetGiveUpRunnable()V

    .line 181
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->uninitGiveUpRunnable()V

    .line 183
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->onFetchTxsSuccess(Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;)V

    goto :goto_0

    .line 186
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->onFetchTxsFailed()V

    :goto_0
    return-void
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    return-void
.end method

.method protected onFetchTxsFailed()V
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->listener:Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$ButtonSdkTxsLoaderListener;

    if-eqz v0, :cond_0

    .line 200
    invoke-interface {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$ButtonSdkTxsLoaderListener;->onFetchTxFail()V

    :cond_0
    return-void
.end method

.method protected onFetchTxsSuccess(Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;)V
    .locals 1

    .line 191
    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;->getButtonTxs()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->findMostRecentTx(Ljava/util/List;)Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    move-result-object p1

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->listener:Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$ButtonSdkTxsLoaderListener;

    if-eqz v0, :cond_0

    .line 194
    invoke-interface {v0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$ButtonSdkTxsLoaderListener;->onFetchTxSuccess(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V

    :cond_0
    return-void
.end method

.method protected onGiveUp(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 2

    const-string v0, "Giving up on Button transactions call."

    const/4 v1, 0x0

    .line 161
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->uninitGiveUpRunnable()V

    .line 164
    invoke-virtual {p1, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 166
    sget-object p1, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->TIMEOUT:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->createDefaultButtonTx(Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;)Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    move-result-object p1

    .line 168
    invoke-virtual {p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->createDefaultCustomerButtonTxsResponse(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;

    move-result-object p1

    .line 169
    invoke-virtual {p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->onFetchTxsSuccess(Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;)V

    return-void
.end method

.method public pollForTransactions()V
    .locals 6

    .line 126
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->getCustomerId()I

    move-result v1

    iget v2, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->retailerId:I

    iget-wide v3, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->timestamp:J

    iget-object v5, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->srcToken:Ljava/lang/String;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->createCustomerButtonTxsCall(IIJLjava/lang/String;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;

    move-result-object v0

    .line 128
    invoke-virtual {p0, v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    .line 129
    invoke-virtual {v0, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 131
    invoke-virtual {p0, v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->submit(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 133
    invoke-virtual {p0, v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->monitorTxsCall(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void
.end method

.method protected resetGiveUpRunnable()V
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->giveUpRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 148
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->giveUpRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$ButtonSdkTxsLoaderListener;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->listener:Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$ButtonSdkTxsLoaderListener;

    return-void
.end method

.method protected submit(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method protected uninitGiveUpRunnable()V
    .locals 1

    const/4 v0, 0x0

    .line 157
    iput-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->giveUpRunnable:Ljava/lang/Runnable;

    return-void
.end method
