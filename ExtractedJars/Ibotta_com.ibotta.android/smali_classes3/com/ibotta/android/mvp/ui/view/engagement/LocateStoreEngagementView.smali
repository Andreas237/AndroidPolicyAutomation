.class public Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;
.super Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;
.source "LocateStoreEngagementView.java"

# interfaces
.implements Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;


# instance fields
.field protected bSubmit:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900ab
    .end annotation
.end field

.field protected flRoot:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901f6
    .end annotation
.end field

.field private fullView:Z

.field private rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

.field private smallMapLoc:Landroid/graphics/Rect;

.field protected tvContent:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09050e
    .end annotation
.end field

.field userState:Lcom/ibotta/android/state/user/UserState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected vMapPlacement:Landroid/view/View;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905b5
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 47
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 55
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->onMapPlacementLaidOut()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)Landroid/graphics/Rect;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->smallMapLoc:Landroid/graphics/Rect;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)Lcom/ibotta/android/view/map/RetailerLocationsMapView;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    return-object p0
.end method

.method private initButton()V
    .locals 4

    .line 154
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->currentValue:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x7f11028f

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 155
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->bSubmit:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initContent()V
    .locals 2

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->tvContent:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/TaskModel;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initMap()V
    .locals 7

    .line 128
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$1;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->vMapPlacement:Landroid/view/View;

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;Landroid/view/View;)V

    .line 138
    invoke-virtual {v0}, Lcom/ibotta/android/view/common/OnGlobalLayoutListener;->attach()V

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getStores()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getLastLocation()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->onLocationChanged(Landroid/location/Location;)V

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    goto :goto_0

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f110292

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 145
    invoke-interface {v5}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 144
    invoke-virtual {v1, v2, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v6, v3}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->showQuickMessage(Ljava/lang/String;ZZ)V

    :goto_0
    return-void
.end method

.method private initRetailerLocationsMapLayout()V
    .locals 3

    .line 108
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/maps/MapsInitializer;->initialize(Landroid/content/Context;)I

    .line 110
    new-instance v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->setListener(Lcom/ibotta/android/view/map/RetailerLocationsMapView$RetailerLocationsMapListener;)V

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->init(Landroid/os/Bundle;)V

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->onResume()V

    .line 115
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 117
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->flRoot:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private onMapPlacementLaidOut()V
    .locals 10

    const/4 v0, 0x2

    .line 179
    new-array v1, v0, [I

    .line 180
    new-array v0, v0, [I

    .line 182
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->flRoot:Landroid/widget/FrameLayout;

    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->getLocationInWindow([I)V

    .line 183
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->vMapPlacement:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 185
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->vMapPlacement:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 186
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->vMapPlacement:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    .line 188
    new-instance v4, Landroid/graphics/Rect;

    const/4 v5, 0x0

    aget v6, v0, v5

    aget v7, v1, v5

    sub-int/2addr v6, v7

    const/4 v7, 0x1

    aget v8, v0, v7

    aget v9, v1, v7

    sub-int/2addr v8, v9

    aget v9, v0, v5

    aget v5, v1, v5

    sub-int/2addr v9, v5

    add-int/2addr v9, v2

    aget v0, v0, v7

    aget v1, v1, v7

    sub-int/2addr v0, v1

    add-int/2addr v0, v3

    invoke-direct {v4, v6, v8, v9, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v4, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->smallMapLoc:Landroid/graphics/Rect;

    .line 194
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 196
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->smallMapLoc:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 197
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->smallMapLoc:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 198
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->smallMapLoc:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->smallMapLoc:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v2

    add-int/2addr v1, v7

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 199
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->smallMapLoc:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->smallMapLoc:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    add-int/2addr v1, v7

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 201
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->requestLayout()V

    return-void
.end method

.method private showLargeMap()V
    .locals 2

    .line 280
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x10a0001

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 281
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$3;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$3;-><init>(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 305
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->flRoot:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private showSmallMap()V
    .locals 2

    .line 249
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x10a0001

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 250
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView$2;-><init>(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 276
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->flRoot:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method


# virtual methods
.method protected getEmailContent()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected getEmailSubject()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected getLayoutId()I
    .locals 1

    const v0, 0x7f0c0173

    return v0
.end method

.method protected initLayout()V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->initRetailerLocationsMapLayout()V

    return-void
.end method

.method protected injectThis()V
    .locals 1

    .line 64
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)V

    return-void
.end method

.method protected isShareable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onBackPressed()Z
    .locals 2

    .line 88
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->fullView:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 89
    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->fullView:Z

    .line 90
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->showSmallMap()V

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public onDestroy()V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    if-eqz v0, :cond_0

    .line 79
    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->destroy()V

    const/4 v0, 0x0

    .line 80
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    .line 83
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->onDestroy()V

    return-void
.end method

.method public onGetMapAsyncFinish()V
    .locals 2

    .line 235
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onGetMapAsyncStart()V
    .locals 0

    return-void
.end method

.method public onInfoWindowClicked(DD)V
    .locals 2

    const-string v0, "geo:%f,%f"

    const/4 v1, 0x2

    .line 207
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const/4 p2, 0x0

    aput-object p1, v1, p2

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 208
    new-instance p2, Landroid/content/Intent;

    const-string p3, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 209
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onInfoWindowClicked(I)V
    .locals 0

    return-void
.end method

.method public onInitializationFailed()V
    .locals 4

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    .line 220
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f110291

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 219
    invoke-interface {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->showQuickMessage(Ljava/lang/String;ZZ)V

    return-void
.end method

.method public onMapClicked()V
    .locals 0

    return-void
.end method

.method public onPause()V
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->onPause()V

    .line 73
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->onPause()V

    return-void
.end method

.method protected onSetup()V
    .locals 0

    .line 122
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->initMap()V

    .line 123
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->initContent()V

    .line 124
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->initButton()V

    return-void
.end method

.method protected onSubmitClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900ab
        }
    .end annotation

    const/4 v0, 0x0

    .line 175
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->notifySuccess(Ljava/lang/String;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 240
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->fullView:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 241
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->fullView:Z

    .line 242
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;->showLargeMap()V

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
