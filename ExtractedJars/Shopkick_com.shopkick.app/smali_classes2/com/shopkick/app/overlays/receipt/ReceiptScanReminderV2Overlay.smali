.class public Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "ReceiptScanReminderV2Overlay.java"


# instance fields
.field private chainLogoImageView:Landroid/widget/ImageView;

.field private mainView:Landroid/view/View;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method public static synthetic lambda$createView$159(Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;Landroid/view/View;)V
    .locals 0

    .line 83
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$createView$160(Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;Landroid/view/View;)V
    .locals 3

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonUrl:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v0, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    goto :goto_0

    .line 88
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "location_id"

    .line 89
    iget-object v1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "chain_id"

    .line 90
    iget-object v1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "product_family_id"

    .line 91
    iget-object v1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "chain_name"

    const/4 v1, 0x0

    .line 92
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v2, Lcom/shopkick/app/products/ScansForLocationScreenV2;

    invoke-direct {v0, v1, v2, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 96
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    .line 98
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->dismiss()V

    return-void
.end method

.method private setupButtonLogging(Lcom/shopkick/app/logging/IUserEventView;I)V
    .locals 2

    .line 106
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0x10

    .line 107
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOverlay(Ljava/lang/Integer;)V

    .line 108
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 109
    iget-object p2, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 110
    iget-object p2, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v1, 0x0

    invoke-interface {p1, v0, p2, v1}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 6

    .line 62
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->mainView:Landroid/view/View;

    .line 63
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->mainView:Landroid/view/View;

    const v0, 0x7f0900e7

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->chainLogoImageView:Landroid/widget/ImageView;

    .line 66
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->mainView:Landroid/view/View;

    const v0, 0x7f0905ab

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->mainView:Landroid/view/View;

    const v0, 0x7f0905aa

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->mainView:Landroid/view/View;

    const v0, 0x7f090613

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/UserEventImageView;

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->mainView:Landroid/view/View;

    const v1, 0x7f0900b6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    .line 72
    iget-object v1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    const/16 v1, 0x32

    .line 75
    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->setupButtonLogging(Lcom/shopkick/app/logging/IUserEventView;I)V

    const/4 v1, 0x4

    .line 76
    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->setupButtonLogging(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 79
    iget-object v1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->chainLogoImageView:Landroid/widget/ImageView;

    const/4 v2, 0x3

    invoke-static {v2, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    .line 80
    iget-object v2, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->chainLogoImageView:Landroid/widget/ImageView;

    invoke-static {v2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainLogoUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/bumptech/glide/load/Transformation;

    new-instance v4, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;

    invoke-direct {v4}, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;-><init>()V

    const/4 v5, 0x0

    aput-object v4, v3, v5

    new-instance v4, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-direct {v4, v1}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    const/4 v1, 0x1

    aput-object v4, v3, v1

    invoke-virtual {v2, v3}, Lcom/shopkick/app/util/GlideRequest;->transforms([Lcom/bumptech/glide/load/Transformation;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->chainLogoImageView:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 83
    new-instance v1, Lcom/shopkick/app/overlays/receipt/-$$Lambda$ReceiptScanReminderV2Overlay$qTWy2ZxYyIY9xKSeq7P7lvnnM-U;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/receipt/-$$Lambda$ReceiptScanReminderV2Overlay$qTWy2ZxYyIY9xKSeq7P7lvnnM-U;-><init>(Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;)V

    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    new-instance p1, Lcom/shopkick/app/overlays/receipt/-$$Lambda$ReceiptScanReminderV2Overlay$-nejxL8JHqCOvBcOOv7uhZdGHgY;

    invoke-direct {p1, p0}, Lcom/shopkick/app/overlays/receipt/-$$Lambda$ReceiptScanReminderV2Overlay$-nejxL8JHqCOvBcOOv7uhZdGHgY;-><init>(Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;)V

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public destroy()V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->chainLogoImageView:Landroid/widget/ImageView;

    invoke-static {v0, v0}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/view/View;Landroid/view/View;)V

    .line 57
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0175

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->mainView:Landroid/view/View;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 43
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 44
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method public updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
