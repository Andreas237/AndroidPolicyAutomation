.class public Lcom/shopkick/app/overlays/video/PostVideoOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "PostVideoOverlay.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static MAIN_IMAGE_CORNER_RADIUS_DP:I = 0x3

.field private static MAIN_IMAGE_HEIGHT_DP:I = 0xc8

.field private static MAIN_IMAGE_WIDTH_DP:I = 0x120


# instance fields
.field private actionButton:Lcom/shopkick/app/widget/SKButton;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private mainImageView:Landroid/widget/ImageView;

.field private mainView:Landroid/view/View;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/video/PostVideoOverlay;)Landroid/view/View;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainView:Landroid/view/View;

    return-object p0
.end method

.method private setupButtonLogging(Lcom/shopkick/app/logging/IUserEventView;II)V
    .locals 1

    .line 119
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {v0, p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 120
    iget-object p2, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 121
    iget-object p2, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 122
    iget-object p2, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->videoId:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 124
    iget-object p2, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 p3, 0x0

    invoke-interface {p1, v0, p2, p3}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 4

    .line 66
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainView:Landroid/view/View;

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f0900ab

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventImageView;

    .line 70
    iget-object v1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f090014

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKButton;

    iput-object v1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->actionButton:Lcom/shopkick/app/widget/SKButton;

    .line 71
    iget-object v1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f09045d

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainImageView:Landroid/widget/ImageView;

    .line 74
    iget-object v1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f090767

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    iget-object v1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f0901e6

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    iget-object v1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonTitle:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 77
    iget-object v1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->actionButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v2, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonTitle:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 83
    :cond_0
    new-instance v1, Lcom/shopkick/app/overlays/video/PostVideoOverlay$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/video/PostVideoOverlay$1;-><init>(Lcom/shopkick/app/overlays/video/PostVideoOverlay;)V

    .line 94
    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object v2, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->fitCenter()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object v1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainImageView:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 97
    invoke-virtual {v0, p0}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->actionButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/16 p1, 0x81

    const/16 v1, 0x32

    .line 101
    invoke-direct {p0, v0, p1, v1}, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->setupButtonLogging(Lcom/shopkick/app/logging/IUserEventView;II)V

    .line 102
    iget-object p1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->actionButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v0, 0x89

    const/4 v1, 0x4

    invoke-direct {p0, p1, v0, v1}, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->setupButtonLogging(Lcom/shopkick/app/logging/IUserEventView;II)V

    .line 103
    iget-object p1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainView:Landroid/view/View;

    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    iget-object v0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iget-object v1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/shopkick/app/logging/IUserEventView;->setupMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;Lcom/shopkick/app/application/ClientFlagsManager;ZLcom/shopkick/app/logging/UserEventLogger;)V

    .line 105
    iget-object p1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public destroy()V
    .locals 2

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainView:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 55
    check-cast v0, Lcom/shopkick/app/logging/IUserEventView;

    invoke-interface {v0}, Lcom/shopkick/app/logging/IUserEventView;->stopMoatTracking()V

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 59
    iget-object v0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainImageView:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/content/Context;Landroid/view/View;)V

    .line 61
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12022d

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0156

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->mainView:Landroid/view/View;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 47
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 48
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p2, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 49
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->actionButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonUrl:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object p1, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonUrl:Ljava/lang/String;

    const/4 v2, 0x0

    const/16 p1, 0x1d

    .line 147
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 p1, 0x89

    .line 148
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    .line 145
    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Z

    .line 152
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->dismiss()V

    return-void
.end method

.method public updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 110
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/overlays/video/PostVideoOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->videoId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
