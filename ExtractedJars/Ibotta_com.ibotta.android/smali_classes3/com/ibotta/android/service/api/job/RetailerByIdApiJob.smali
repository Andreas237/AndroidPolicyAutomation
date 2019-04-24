.class public Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;
.super Lcom/ibotta/android/service/api/job/LocationApiJob;
.source "RetailerByIdApiJob.java"


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;

    invoke-direct {v0, p1}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;-><init>(I)V

    invoke-direct {p0, v0, p2}, Lcom/ibotta/android/service/api/job/LocationApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    const/4 p1, 0x1

    .line 14
    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;->setAttemptFreshLocation(Z)V

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;->prepLocation()V

    return-void
.end method


# virtual methods
.method public makeApiCall()Lcom/ibotta/api/ApiCall;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    return-object v0
.end method

.method public onLocationReady(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V
    .locals 4

    const-string v0, "onLocationReady: lat=%1$f, long=%2$f, zip=%3$s"

    const/4 v1, 0x3

    .line 25
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v3, 0x1

    aput-object p2, v1, v3

    const/4 v3, 0x2

    aput-object p3, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    if-eqz p3, :cond_4

    .line 29
    :cond_1
    invoke-virtual {v0}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->getNearLat()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->getNearLong()Ljava/lang/Double;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    const-string v1, "Overwriting latitude and longitude values in RetailerByIdCall."

    .line 31
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->setNearLat(Ljava/lang/Double;)V

    .line 33
    invoke-virtual {v0, p2}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->setNearLong(Ljava/lang/Double;)V

    :cond_3
    if-eqz p3, :cond_4

    const-string p1, "Overwriting zip in RetailerByIdCall"

    .line 37
    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    invoke-virtual {v0, p3}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->setNearZip(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public setApiCall(Lcom/ibotta/api/ApiCall;)V
    .locals 0

    return-void
.end method
