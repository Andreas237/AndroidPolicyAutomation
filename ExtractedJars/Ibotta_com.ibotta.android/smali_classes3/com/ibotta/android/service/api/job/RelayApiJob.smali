.class public Lcom/ibotta/android/service/api/job/RelayApiJob;
.super Lcom/ibotta/android/service/api/job/WaitingApiJob;
.source "RelayApiJob.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/api/ApiCall;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/service/api/job/WaitingApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/ApiCall;I)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/service/api/job/WaitingApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    return-void
.end method


# virtual methods
.method public setResult(Lcom/ibotta/android/service/api/Outcome;Lcom/ibotta/api/ApiResponse;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/RelayApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/service/api/job/RelayApiJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    const/4 p1, 0x0

    .line 28
    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/RelayApiJob;->signal(Z)V

    return-void
.end method
