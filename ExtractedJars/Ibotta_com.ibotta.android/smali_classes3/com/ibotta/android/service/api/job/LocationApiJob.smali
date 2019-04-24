.class public abstract Lcom/ibotta/android/service/api/job/LocationApiJob;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "LocationApiJob.java"

# interfaces
.implements Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;


# static fields
.field private static final LOCATION_INTERVAL_WAIT_TIME:J = 0xc8L

.field private static final LOCATION_WAIT_TIME:J = 0x3e8L

.field public static final MAX_LOCATION_AGE:J = 0x36ee80L


# instance fields
.field private attemptFreshLocation:Z

.field private final locRetriever:Lcom/ibotta/android/async/LocationRetriever;


# direct methods
.method protected constructor <init>(Lcom/ibotta/api/ApiCall;I)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    .line 22
    new-instance p1, Lcom/ibotta/android/async/LocationRetriever;

    iget-object p2, p0, Lcom/ibotta/android/service/api/job/LocationApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-direct {p1, p0, p2}, Lcom/ibotta/android/async/LocationRetriever;-><init>(Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;Lcom/ibotta/android/service/api/job/ApiJobEnvironment;)V

    iput-object p1, p0, Lcom/ibotta/android/service/api/job/LocationApiJob;->locRetriever:Lcom/ibotta/android/async/LocationRetriever;

    return-void
.end method


# virtual methods
.method public getLocationIntervalWaitTime()J
    .locals 2

    const-wide/16 v0, 0xc8

    return-wide v0
.end method

.method public getLocationWaitTime()J
    .locals 2

    const-wide/16 v0, 0x3e8

    return-wide v0
.end method

.method public getMaxLocationAge()J
    .locals 2

    const-wide/32 v0, 0x36ee80

    return-wide v0
.end method

.method protected onBeforeApiCall()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 56
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/job/LocationApiJob;->attemptFreshLocation:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/LocationApiJob;->isResponseReady()Z

    move-result v0

    if-nez v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/LocationApiJob;->locRetriever:Lcom/ibotta/android/async/LocationRetriever;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/async/LocationRetriever;->loadLocation(Z)V

    .line 59
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onBeforeApiCall()V

    return-void
.end method

.method public prepLocation()V
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/LocationApiJob;->locRetriever:Lcom/ibotta/android/async/LocationRetriever;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/async/LocationRetriever;->loadLocation(Z)V

    return-void
.end method

.method public setApiCall(Lcom/ibotta/api/ApiCall;)V
    .locals 0

    return-void
.end method

.method public setAttemptFreshLocation(Z)V
    .locals 4

    const-string v0, "setAttemptFreshLocation: %1$b"

    const/4 v1, 0x1

    .line 50
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    iput-boolean p1, p0, Lcom/ibotta/android/service/api/job/LocationApiJob;->attemptFreshLocation:Z

    return-void
.end method
