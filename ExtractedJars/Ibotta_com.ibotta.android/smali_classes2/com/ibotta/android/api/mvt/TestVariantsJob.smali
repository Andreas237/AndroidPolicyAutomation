.class public Lcom/ibotta/android/api/mvt/TestVariantsJob;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "TestVariantsJob.java"


# instance fields
.field private final geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

.field private final handler:Landroid/os/Handler;

.field private final mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;


# direct methods
.method public constructor <init>(ILcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Landroid/os/Handler;)V
    .locals 2

    .line 29
    new-instance v0, Lcom/ibotta/api/call/mvt/TestVariantsCall;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/ibotta/api/call/mvt/TestVariantsCall;-><init>(IZ)V

    invoke-direct {p0, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/api/mvt/TestVariantsJob;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    .line 31
    iput-object p3, p0, Lcom/ibotta/android/api/mvt/TestVariantsJob;->geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    .line 32
    iput-object p4, p0, Lcom/ibotta/android/api/mvt/TestVariantsJob;->handler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method protected onAfterApiCall()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 37
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onAfterApiCall()V

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/api/mvt/TestVariantsJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    invoke-virtual {p0}, Lcom/ibotta/android/api/mvt/TestVariantsJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/mvt/TestVariantsResponse;

    .line 41
    iget-object v1, p0, Lcom/ibotta/android/api/mvt/TestVariantsJob;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    invoke-virtual {v0}, Lcom/ibotta/api/call/mvt/TestVariantsResponse;->getTestVariants()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->setTestVariants(Ljava/util/List;)V

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/api/mvt/TestVariantsJob;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/ibotta/android/api/mvt/TestVariantsJob;->geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/api/mvt/-$$Lambda$y0JTwvtLE_vcPtRBTfP-MCqW5tA;

    invoke-direct {v2, v1}, Lcom/ibotta/android/api/mvt/-$$Lambda$y0JTwvtLE_vcPtRBTfP-MCqW5tA;-><init>(Lcom/ibotta/android/location/geofence/GeofenceCoordinator;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method protected onHandleException(Lcom/ibotta/api/ApiException;)V
    .locals 0

    .line 48
    invoke-super {p0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onHandleException(Lcom/ibotta/api/ApiException;)V

    .line 51
    sget-object p1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    iput-object p1, p0, Lcom/ibotta/android/api/mvt/TestVariantsJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    .line 52
    new-instance p1, Lcom/ibotta/api/call/mvt/TestVariantsResponse;

    invoke-direct {p1}, Lcom/ibotta/api/call/mvt/TestVariantsResponse;-><init>()V

    invoke-virtual {p0, p1}, Lcom/ibotta/android/api/mvt/TestVariantsJob;->setApiResponse(Lcom/ibotta/api/ApiResponse;)V

    return-void
.end method
