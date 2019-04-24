.class public Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "RetailerMapActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;
.implements Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;",
        "Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;"
    }
.end annotation


# static fields
.field public static final RESULT_CODE_SKIPPED:I = 0x2

.field public static final RESULT_CODE_SUCCESS:I = 0x1


# instance fields
.field appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private cantFindIt:Z

.field protected llCantFindItHeader:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090301
    .end annotation
.end field

.field private offerId:I

.field protected psvLoadingMap:Lcom/ibotta/android/view/ProgressSpinnerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903bc
    .end annotation
.end field

.field private retailerId:I

.field protected rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903cf
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initCantFindItHeader()V
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->llCantFindItHeader:Landroid/widget/LinearLayout;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->cantFindIt:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method private initMap(Landroid/os/Bundle;)V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->setListener(Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;)V

    .line 145
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/maps/MapsInitializer;->initialize(Landroid/content/Context;)I

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->init(Landroid/os/Bundle;)V

    .line 147
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->cantFindIt:Z

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->setIsCantFindIt(Z)V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const-string v0, ""

    .line 135
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "retailer_id"

    .line 106
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->retailerId:I

    const-string v1, "cant_find_it"

    .line 107
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->cantFindIt:Z

    const-string v0, "offer_id"

    .line 108
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->offerId:I

    goto :goto_0

    .line 109
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 110
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "retailer_id"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->retailerId:I

    .line 111
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "cant_find_it"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->cantFindIt:Z

    .line 112
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "offer_id"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->offerId:I

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 41
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapComponent;
    .locals 1

    .line 60
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;

    move-result-object v0

    .line 61
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;)V

    .line 62
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->retailerMapModule(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapModule;)Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;

    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithResult(IZ)V
    .locals 2

    .line 180
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "retailer_id"

    .line 181
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    if-eqz p2, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 190
    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->setResult(ILandroid/content/Intent;)V

    .line 191
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->finish()V

    return-void
.end method

.method public hideMapLoading()V
    .locals 2

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->psvLoadingMap:Lcom/ibotta/android/view/ProgressSpinnerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/ProgressSpinnerView;->setVisibility(I)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 41
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapComponent;)V
    .locals 0

    .line 68
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 73
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 75
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->loadState(Landroid/os/Bundle;)V

    const v0, 0x7f0c0066

    .line 77
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->setContentView(I)V

    .line 78
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getGooglePlayServicesAvailability()I

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;->onGooglePlayNotAvailable(I)V

    goto :goto_0

    .line 85
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->initTitle()V

    .line 86
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->initCantFindItHeader()V

    .line 87
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->initMap(Landroid/os/Bundle;)V

    .line 89
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->retailerId:I

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;->setRetailerId(I)V

    .line 90
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;

    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->cantFindIt:Z

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;->setCantFindIt(Z)V

    .line 91
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->offerId:I

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;->setOfferId(I)V

    :goto_0
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->destroy()V

    .line 131
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onDestroy()V

    return-void
.end method

.method public onGetMapAsyncFinish()V
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;->onGetMapAsyncFinish()V

    return-void
.end method

.method public onGetMapAsyncStart()V
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;->onGetMapAsyncStart()V

    return-void
.end method

.method public onInfoWindowClicked(DD)V
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;->onRetailerLocationClicked(DD)V

    return-void
.end method

.method public onInfoWindowClicked(I)V
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;->onRetailerLocationClicked(I)V

    return-void
.end method

.method public onInitializationFailed()V
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;->onRetailerMapFailed()V

    return-void
.end method

.method public onMapClicked()V
    .locals 1

    .line 236
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;->onRetailerMapClicked()V

    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->onPause()V

    .line 125
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onPause()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 118
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onResume()V

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->onResume()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 97
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->saveMapState(Landroid/os/Bundle;)V

    const-string v0, "retailer_id"

    .line 99
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->retailerId:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "cant_find_it"

    .line 100
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->cantFindIt:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "offer_id"

    .line 101
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->offerId:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method protected onSkipClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a9
        }
    .end annotation

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;->onSkipClicked()V

    return-void
.end method

.method public setMapData(Lcom/ibotta/api/model/retailer/Retailer;Landroid/location/Location;)V
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->onLocationChanged(Landroid/location/Location;)V

    .line 175
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public setTitleForCantFindIt()V
    .locals 1

    const v0, 0x7f11059d

    .line 152
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->setTitle(I)V

    return-void
.end method

.method public setTitleForLoadFailure()V
    .locals 1

    const v0, 0x7f1101e0

    .line 256
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->setTitle(I)V

    return-void
.end method

.method public showExternalMap(Ljava/lang/String;)V
    .locals 2

    .line 196
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 198
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const p1, 0x7f110136

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 200
    invoke-virtual {p0, p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->showQuickMessage(IZZ)V

    :goto_0
    return-void
.end method

.method public showGooglePlayNotAvailable(I)V
    .locals 4

    .line 157
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v0

    .line 158
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->getActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lcom/google/android/gms/common/GoogleApiAvailability;->getErrorDialog(Landroid/app/Activity;IILandroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object p1

    .line 164
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public showMapLoading()V
    .locals 2

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->psvLoadingMap:Lcom/ibotta/android/view/ProgressSpinnerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/ProgressSpinnerView;->setVisibility(I)V

    return-void
.end method

.method public showNoStoresFound(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    .line 169
    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f11059b

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v2, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->showQuickMessage(Ljava/lang/String;ZZ)V

    return-void
.end method

.method public showRetailerMapFailed()V
    .locals 3

    const v0, 0x7f11059a

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 206
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->showQuickMessage(IZZ)V

    return-void
.end method
