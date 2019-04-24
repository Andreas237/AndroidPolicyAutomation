.class public Lcom/shopkick/app/overlays/scans/PostScanOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "PostScanOverlay.java"


# instance fields
.field private dispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private mainImageView:Landroid/widget/ImageView;

.field private mainView:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/scans/PostScanOverlay;)Landroid/view/View;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->mainView:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic lambda$createView$162(Lcom/shopkick/app/overlays/scans/PostScanOverlay;Landroid/view/View;)V
    .locals 0

    .line 68
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$createView$163(Lcom/shopkick/app/overlays/scans/PostScanOverlay;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 79
    iget-object p2, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    .line 80
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->dismiss()V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 5

    .line 64
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->mainView:Landroid/view/View;

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f09045e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->mainImageView:Landroid/widget/ImageView;

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f090112

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 68
    new-instance v2, Lcom/shopkick/app/overlays/scans/-$$Lambda$PostScanOverlay$IRxsCbSA3GGaCDNSVdVGbqsEYfQ;

    invoke-direct {v2, p0}, Lcom/shopkick/app/overlays/scans/-$$Lambda$PostScanOverlay$IRxsCbSA3GGaCDNSVdVGbqsEYfQ;-><init>(Lcom/shopkick/app/overlays/scans/PostScanOverlay;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonTitle:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f09045c

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    .line 72
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->mainView:Landroid/view/View;

    const v3, 0x7f090220

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/4 v3, 0x0

    .line 73
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 74
    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 75
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonTitle:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 76
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonUrl:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 77
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonUrl:Ljava/lang/String;

    .line 78
    new-instance v3, Lcom/shopkick/app/overlays/scans/-$$Lambda$PostScanOverlay$bgRujFNZ8Ydk96YHBWy5VrMxHbY;

    invoke-direct {v3, p0, v2}, Lcom/shopkick/app/overlays/scans/-$$Lambda$PostScanOverlay$bgRujFNZ8Ydk96YHBWy5VrMxHbY;-><init>(Lcom/shopkick/app/overlays/scans/PostScanOverlay;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    :cond_0
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v3, 0x96

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 86
    iget-object v3, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 87
    new-instance v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v3}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 88
    iget-object v4, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v4}, Lcom/shopkick/app/logging/UserEventLogger;->getSingleUserEventCoordinator()Lcom/shopkick/app/logging/IUserEventCoordinator;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 89
    iget-object v4, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v2, v4, v3}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 92
    :cond_1
    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/overlays/scans/PostScanOverlay$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/scans/PostScanOverlay$1;-><init>(Lcom/shopkick/app/overlays/scans/PostScanOverlay;)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->mainImageView:Landroid/widget/ImageView;

    .line 102
    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 104
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->mainView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/UserEventImageView;

    .line 108
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0x95

    .line 109
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 110
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 112
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 113
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2}, Lcom/shopkick/app/logging/UserEventLogger;->getSingleUserEventCoordinator()Lcom/shopkick/app/logging/IUserEventCoordinator;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 114
    invoke-virtual {p1}, Lcom/shopkick/app/logging/UserEventImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_2

    .line 115
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    .line 116
    iget-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    const-string v3, "ImageConstraintKey"

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->trackingUrl:Ljava/lang/String;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 119
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATScanEnabled()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 120
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    const/4 v2, 0x1

    .line 121
    iput-boolean v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->useZMoatIID:Z

    .line 124
    :cond_3
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0, v2, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 126
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public destroy()V
    .locals 2

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->mainView:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 53
    check-cast v0, Lcom/shopkick/app/logging/IUserEventView;

    invoke-interface {v0}, Lcom/shopkick/app/logging/IUserEventView;->stopMoatTracking()V

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 57
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->mainImageView:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/content/Context;Landroid/view/View;)V

    .line 59
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12022f

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0155

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->mainView:Landroid/view/View;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 38
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 39
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method public updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 44
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
