.class public Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;
.super Landroid/widget/LinearLayout;
.source "SpotlightLocateStoreView.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;
.implements Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$SpotlightLocateStoreListener;
    }
.end annotation


# instance fields
.field private allowedToLoad:Z

.field apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private currentActivity:Lcom/ibotta/android/mvp/base/MvpActivity;

.field private laidOut:Z

.field private listener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$SpotlightLocateStoreListener;

.field private resumed:Z

.field private retailerById:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

.field private retailerId:Ljava/lang/Integer;

.field protected rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903cf
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 56
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 65
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->initLayout()V

    return-void
.end method

.method static synthetic access$002(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;Z)Z
    .locals 0

    .line 33
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->laidOut:Z

    return p1
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->loadRetailer()V

    return-void
.end method

.method private canLoad()Z
    .locals 3

    .line 204
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->resumed:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Not resumed."

    .line 205
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 208
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->laidOut:Z

    if-nez v0, :cond_1

    const-string v0, "Not laid out yet."

    .line 209
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 212
    :cond_1
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->allowedToLoad:Z

    if-nez v0, :cond_2

    const-string v0, "Not allowed to load yet"

    .line 213
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 216
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->retailerId:Ljava/lang/Integer;

    if-nez v0, :cond_3

    const-string v0, "retailerId is null."

    .line 217
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 220
    :cond_3
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->retailerById:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    if-eqz v0, :cond_4

    const-string v0, "Already loading retailer."

    .line 221
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private cancelRetailerLoad()V
    .locals 2

    const-string v0, "cancelRetailerLoad"

    const/4 v1, 0x0

    .line 246
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->retailerById:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    if-nez v0, :cond_0

    return-void

    .line 251
    :cond_0
    invoke-virtual {v0, p0}, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    const/4 v0, 0x0

    .line 252
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->retailerById:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 182
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;)V

    const/4 v0, 0x1

    .line 183
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->setOrientation(I)V

    .line 185
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01cf

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 186
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private loadRetailer()V
    .locals 3

    const-string v0, "loadRetailer"

    const/4 v1, 0x0

    .line 190
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->canLoad()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Loading retailer."

    .line 194
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    new-instance v0, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v0, v2, v1}, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;-><init>(II)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->retailerById:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->retailerById:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;->setAttemptFreshLocation(Z)V

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->retailerById:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->retailerById:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    invoke-interface {v0, v1}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 2

    const/4 v0, 0x0

    .line 171
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->laidOut:Z

    const-string v1, "destroy"

    .line 172
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->hasPermissions()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 177
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->cancelRetailerLoad()V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->destroy()V

    return-void
.end method

.method public hasPermissions()Z
    .locals 2

    .line 88
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->hasPermission(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z

    move-result v0

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x0

    .line 110
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->init(Landroid/os/Bundle;Lcom/ibotta/android/mvp/base/MvpActivity;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;Lcom/ibotta/android/mvp/base/MvpActivity;)V
    .locals 3

    const-string v0, "init"

    const/4 v1, 0x0

    .line 92
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->currentActivity:Lcom/ibotta/android/mvp/base/MvpActivity;

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->hasPermissions()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->currentActivity:Lcom/ibotta/android/mvp/base/MvpActivity;

    if-eqz v0, :cond_1

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->init(Landroid/os/Bundle;Lcom/ibotta/android/mvp/base/MvpActivity;)V

    goto :goto_0

    .line 102
    :cond_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->init(Landroid/os/Bundle;)V

    .line 104
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->setAllGesturesEnabled(Z)V

    .line 105
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2, v1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->setMyLocationEnabled(ZZ)V

    .line 106
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->setListener(Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;)V

    return-void
.end method

.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 234
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string p1, "Successfully loaded retailer by id."

    .line 235
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->retailerById:Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/RetailerByIdApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/retailer/RetailerByIdResponse;

    .line 237
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {p1}, Lcom/ibotta/api/call/retailer/RetailerByIdResponse;->getRetailer()Lcom/ibotta/api/model/retailer/Retailer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    goto :goto_0

    :cond_0
    const-string p1, "Failed to load retailer by id."

    .line 239
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->cancelRetailerLoad()V

    return-void
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    return-void
.end method

.method public onGetMapAsyncFinish()V
    .locals 0

    return-void
.end method

.method public onGetMapAsyncStart()V
    .locals 0

    return-void
.end method

.method public onInfoWindowClicked(DD)V
    .locals 0

    return-void
.end method

.method public onInfoWindowClicked(I)V
    .locals 0

    return-void
.end method

.method public onInitializationFailed()V
    .locals 0

    return-void
.end method

.method public onMapClicked()V
    .locals 2

    .line 269
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->listener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$SpotlightLocateStoreListener;

    if-eqz v0, :cond_0

    .line 270
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->retailerId:Ljava/lang/Integer;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$SpotlightLocateStoreListener;->onLocateStoreMapClicked(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 2

    const/4 v0, 0x0

    .line 161
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->resumed:Z

    const-string v1, "onPause"

    .line 162
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->hasPermissions()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 2

    const/4 v0, 0x1

    .line 129
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->resumed:Z

    const-string v0, "onResume"

    const/4 v1, 0x0

    .line 130
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->hasPermissions()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 138
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->currentActivity:Lcom/ibotta/android/mvp/base/MvpActivity;

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->init(Landroid/os/Bundle;Lcom/ibotta/android/mvp/base/MvpActivity;)V

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->onResume()V

    .line 142
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->laidOut:Z

    if-eqz v0, :cond_1

    .line 143
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->loadRetailer()V

    goto :goto_0

    .line 145
    :cond_1
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$1;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;Landroid/view/View;)V

    .line 155
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$1;->attach()V

    .line 156
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->requestLayout()V

    :goto_0
    return-void
.end method

.method public saveMapState(Landroid/os/Bundle;)V
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->saveMapState(Landroid/os/Bundle;)V

    return-void
.end method

.method public setAllowedToLoad(Z)V
    .locals 0

    .line 81
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->allowedToLoad:Z

    .line 82
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->allowedToLoad:Z

    if-eqz p1, :cond_0

    .line 83
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->loadRetailer()V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$SpotlightLocateStoreListener;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->listener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$SpotlightLocateStoreListener;

    return-void
.end method

.method public setLocation(Landroid/location/Location;)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->onLocationChanged(Landroid/location/Location;)V

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->retailerId:Ljava/lang/Integer;

    return-void
.end method
