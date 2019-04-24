.class public Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;
.super Lcom/ibotta/android/service/api/job/WaitingApiJob;
.source "OptionalWaitingApiJob.java"


# instance fields
.field private resetting:Z


# direct methods
.method public constructor <init>(Lcom/ibotta/api/ApiCall;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/ibotta/android/service/api/job/WaitingApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->resetting:Z

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/ApiCall;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/service/api/job/WaitingApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->resetting:Z

    return-void
.end method


# virtual methods
.method public reset()V
    .locals 1

    const/4 v0, 0x1

    .line 44
    iput-boolean v0, p0, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->resetting:Z

    .line 45
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->reset()V

    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->resetting:Z

    return-void
.end method

.method public signal(Z)V
    .locals 1

    .line 34
    invoke-super {p0, p1}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->signal(Z)V

    .line 36
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->resetting:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    if-ne p1, v0, :cond_0

    .line 37
    sget-object p1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->setOutcome(Lcom/ibotta/android/service/api/Outcome;)V

    .line 38
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->setApiResponse(Lcom/ibotta/api/ApiResponse;)V

    :cond_0
    return-void
.end method
