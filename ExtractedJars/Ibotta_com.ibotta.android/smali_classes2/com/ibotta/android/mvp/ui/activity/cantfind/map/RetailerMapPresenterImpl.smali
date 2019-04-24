.class public Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "RetailerMapPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;"
    }
.end annotation


# static fields
.field private static final MAP_DIRECTIONS:Ljava/lang/String; = "https://maps.google.com/maps?saddr=%1$f,%2$f&daddr=%3$f,%4$f"

.field private static final MAP_LOCATION:Ljava/lang/String; = "geo:%1$f,%2$f"


# instance fields
.field private cantFindIt:Z

.field private offerId:I

.field private retailerByIdJob:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

.field private retailerId:I

.field private skipped:Z

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 39
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method

.method private initStores(Lcom/ibotta/api/call/retailer/RetailerByIdResponse;)V
    .locals 2

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/api/call/retailer/RetailerByIdResponse;->getRetailer()Lcom/ibotta/api/model/retailer/Retailer;

    move-result-object p1

    .line 91
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->cantFindIt:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Retailer;->getStores()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Retailer;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->showNoStoresFound(Ljava/lang/String;)V

    return-void

    .line 94
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->cantFindIt:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Retailer;->getStores()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 95
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->uploadRetailerId(Z)V

    .line 98
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getLastLocation()Landroid/location/Location;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->setMapData(Lcom/ibotta/api/model/retailer/Retailer;Landroid/location/Location;)V

    return-void
.end method

.method private initTitle(Lcom/ibotta/api/call/retailer/RetailerByIdResponse;)V
    .locals 1

    .line 79
    invoke-virtual {p1}, Lcom/ibotta/api/call/retailer/RetailerByIdResponse;->getRetailer()Lcom/ibotta/api/model/retailer/Retailer;

    move-result-object p1

    .line 81
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->cantFindIt:Z

    if-eqz v0, :cond_0

    .line 82
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->setTitleForCantFindIt()V

    goto :goto_0

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Retailer;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->setTitle(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private uploadRetailerId(Z)V
    .locals 3

    .line 195
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->skipped:Z

    .line 197
    new-instance p1, Lcom/ibotta/api/call/cantfindit/CantFindItNoStorePostCall;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v0

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->offerId:I

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerId:I

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/api/call/cantfindit/CantFindItNoStorePostCall;-><init>(III)V

    .line 198
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method


# virtual methods
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

    .line 44
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 46
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerByIdJob:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    if-nez v1, :cond_0

    .line 47
    new-instance v1, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerId:I

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;-><init>(II)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerByIdJob:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    .line 48
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerByIdJob:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;->setAttemptFreshLocation(Z)V

    .line 51
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerByIdJob:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerByIdJob:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerByIdJob:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/retailer/RetailerByIdResponse;

    .line 64
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->initTitle(Lcom/ibotta/api/call/retailer/RetailerByIdResponse;)V

    .line 65
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->initStores(Lcom/ibotta/api/call/retailer/RetailerByIdResponse;)V

    return-void
.end method

.method protected onFetchFinishedWithFailures()V
    .locals 1

    .line 70
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchFinishedWithFailures()V

    .line 71
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->cantFindIt:Z

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->setTitleForCantFindIt()V

    goto :goto_0

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->setTitleForLoadFailure()V

    :goto_0
    return-void
.end method

.method public onGetMapAsyncFinish()V
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->hideMapLoading()V

    return-void
.end method

.method public onGetMapAsyncStart()V
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->showMapLoading()V

    return-void
.end method

.method public onGooglePlayNotAvailable(I)V
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->showGooglePlayNotAvailable(I)V

    return-void
.end method

.method public onRetailerLocationClicked(DD)V
    .locals 8

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    const-string v4, "https://maps.google.com/maps?saddr=%1$f,%2$f&daddr=%3$f,%4$f"

    const/4 v5, 0x4

    .line 123
    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, v5, v1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    aput-object p1, v5, v2

    const/4 p1, 0x3

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    aput-object p2, v5, p1

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v0, "geo:%1$f,%2$f"

    .line 125
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 128
    :goto_0
    iget-boolean p2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->cantFindIt:Z

    if-eqz p2, :cond_1

    .line 129
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    iget p2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerId:I

    invoke-interface {p1, p2, v3}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->finishWithResult(IZ)V

    goto :goto_1

    .line 131
    :cond_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->showExternalMap(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public onRetailerLocationClicked(I)V
    .locals 4

    .line 137
    new-instance v0, Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 138
    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->offerId:I

    iget v3, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerId:I

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall;-><init>(IIII)V

    .line 139
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method public onRetailerMapClicked()V
    .locals 0

    return-void
.end method

.method public onRetailerMapFailed()V
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->showRetailerMapFailed()V

    return-void
.end method

.method public onSkipClicked()V
    .locals 1

    const/4 v0, 0x1

    .line 169
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->uploadRetailerId(Z)V

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 3

    .line 186
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/cantfindit/CantFindItNoStorePostCall;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 187
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->skipped:Z

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerId:I

    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->skipped:Z

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->finishWithResult(IZ)V

    .line 191
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 3

    .line 174
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 176
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/cantfindit/CantFindItNoStorePostCall;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 177
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerId:I

    const/4 v2, 0x1

    invoke-interface {p1, v0, v2}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->finishWithResult(IZ)V

    .line 178
    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->skipped:Z

    goto :goto_0

    .line 179
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall;

    if-eqz p1, :cond_1

    .line 180
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerId:I

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;->finishWithResult(IZ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setCantFindIt(Z)V
    .locals 0

    .line 108
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->cantFindIt:Z

    return-void
.end method

.method public setOfferId(I)V
    .locals 0

    .line 113
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->offerId:I

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 103
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenterImpl;->retailerId:I

    return-void
.end method
