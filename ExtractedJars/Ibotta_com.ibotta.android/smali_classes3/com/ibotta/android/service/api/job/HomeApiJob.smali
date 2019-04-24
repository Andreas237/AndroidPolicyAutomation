.class public Lcom/ibotta/android/service/api/job/HomeApiJob;
.super Lcom/ibotta/android/service/api/job/LocationApiJob;
.source "HomeApiJob.java"


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/api/call/home/HomeCall;

    invoke-direct {v0}, Lcom/ibotta/api/call/home/HomeCall;-><init>()V

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/ApiCall;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/ibotta/api/ApiCall;",
            ":",
            "Lcom/ibotta/api/call/location/LocationCall;",
            ">(TT;I)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/service/api/job/LocationApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/HomeApiJob;->setAttemptFreshLocation(Z)V

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->prepLocation()V

    return-void
.end method


# virtual methods
.method public makeApiCall()Lcom/ibotta/api/ApiCall;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    return-object v0
.end method

.method public onLocationReady(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V
    .locals 4

    const-string v0, "onLocationReady: lat=%1$f, long=%2$f, zip=%3$s"

    const/4 v1, 0x3

    .line 30
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v3, 0x1

    aput-object p2, v1, v3

    const/4 v3, 0x2

    aput-object p3, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/location/LocationCall;

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    if-eqz p3, :cond_4

    .line 35
    :cond_1
    invoke-interface {v0}, Lcom/ibotta/api/call/location/LocationCall;->getNearLat()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Lcom/ibotta/api/call/location/LocationCall;->getNearLong()Ljava/lang/Double;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    const-string v1, "Overwriting latitude and longitude values in HomeCall."

    .line 37
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    invoke-interface {v0, p1}, Lcom/ibotta/api/call/location/LocationCall;->setNearLat(Ljava/lang/Double;)V

    .line 39
    invoke-interface {v0, p2}, Lcom/ibotta/api/call/location/LocationCall;->setNearLong(Ljava/lang/Double;)V

    :cond_3
    if-eqz p3, :cond_4

    const-string p1, "Overwriting zip in HomeCall"

    .line 43
    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    invoke-interface {v0, p3}, Lcom/ibotta/api/call/location/LocationCall;->setNearZip(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public setApiCall(Lcom/ibotta/api/ApiCall;)V
    .locals 0

    return-void
.end method
