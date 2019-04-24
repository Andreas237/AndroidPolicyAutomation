.class public Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "PostScanNotificationOverlay.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private inHours:I

.field private mainView:Landroid/view/View;

.field private postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

.field private tonightHours:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method private setNotification(J)V
    .locals 8

    .line 185
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    .line 187
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v5, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    move-wide v6, p1

    invoke-virtual/range {v1 .. v7}, Lcom/shopkick/app/products/PostScanNotificationController;->setNotification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method private setupLogging()V
    .locals 9

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f0900ab

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/IUserEventView;

    .line 100
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f090015

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/logging/IUserEventView;

    .line 101
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->mainView:Landroid/view/View;

    const v3, 0x7f090016

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/logging/IUserEventView;

    .line 103
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v4, 0xbe

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0x30

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 104
    iget-object v4, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 105
    iget-object v4, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 106
    iget-object v4, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 108
    new-instance v4, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v5, 0x153

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v4, v6, v8}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 109
    iget-object v6, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 110
    iget-object v6, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 111
    iget-object v6, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 112
    iget v6, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->tonightHours:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCount(Ljava/lang/Integer;)V

    .line 114
    new-instance v6, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v6, v5, v7}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 115
    iget-object v5, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    invoke-virtual {v6, v5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 116
    iget-object v5, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    invoke-virtual {v6, v5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 117
    iget-object v5, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v6, v5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 118
    iget v5, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->inHours:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCount(Ljava/lang/Integer;)V

    .line 120
    new-instance v5, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v5}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 121
    iget-object v7, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v7}, Lcom/shopkick/app/logging/UserEventLogger;->getSingleUserEventCoordinator()Lcom/shopkick/app/logging/IUserEventCoordinator;

    move-result-object v7

    iput-object v7, v5, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    const/4 v7, 0x1

    .line 122
    iput-boolean v7, v5, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 124
    iget-object v7, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {v0, v3, v7, v5}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {v1, v4, v0, v5}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {v2, v6, v0, v5}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->mainView:Landroid/view/View;

    check-cast v0, Lcom/shopkick/app/logging/IUserEventView;

    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v4, 0x0

    invoke-interface {v0, v1, v2, v4, v3}, Lcom/shopkick/app/logging/IUserEventView;->setupMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;Lcom/shopkick/app/application/ClientFlagsManager;ZLcom/shopkick/app/logging/UserEventLogger;)V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 7

    .line 69
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->mainView:Landroid/view/View;

    .line 72
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "h aa"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 73
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 74
    iget v2, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->tonightHours:I

    const/16 v3, 0xb

    invoke-virtual {v1, v3, v2}, Ljava/util/Calendar;->set(II)V

    const/4 v2, 0x0

    const/16 v3, 0xc

    .line 75
    invoke-virtual {v1, v3, v2}, Ljava/util/Calendar;->set(II)V

    .line 78
    iget-object v3, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->mainView:Landroid/view/View;

    const v4, 0x7f090015

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/widget/SKButton;

    .line 79
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const/4 v5, 0x1

    new-array v6, v5, [Ljava/lang/Object;

    .line 81
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v6, v2

    const v0, 0x7f1104dc

    .line 80
    invoke-virtual {v4, v0, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 79
    invoke-virtual {v3, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f090016

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    .line 84
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iget v1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->inHours:I

    new-array v4, v5, [Ljava/lang/Object;

    .line 85
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    const v2, 0x7f0f0030

    .line 84
    invoke-virtual {p1, v2, v1, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f0900ab

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    invoke-virtual {v3, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    invoke-direct {p0}, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->setupLogging()V

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public destroy()V
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->mainView:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 62
    check-cast v0, Lcom/shopkick/app/logging/IUserEventView;

    invoke-interface {v0}, Lcom/shopkick/app/logging/IUserEventView;->stopMoatTracking()V

    .line 64
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f120230

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0154

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->mainView:Landroid/view/View;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 35
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 36
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p2, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 37
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    iput-object p1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    .line 40
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    const/4 p2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->verticalAlignType:Ljava/lang/Integer;

    .line 43
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postScanNotificationInHours:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postScanNotificationInHours:Ljava/lang/Integer;

    .line 44
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iput p1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->inHours:I

    .line 45
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postScanNotificationTonightHours:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postScanNotificationTonightHours:Ljava/lang/Integer;

    .line 46
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_1
    const/16 p1, 0x14

    :goto_1
    iput p1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->tonightHours:I

    return-void
.end method

.method public isCancelableOnTouchOutside()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 152
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xd

    .line 153
    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xe

    .line 154
    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 156
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v2, 0x7f0900ab

    if-eq p1, v2, :cond_1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/16 p1, 0xa

    .line 176
    iget v1, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->inHours:I

    invoke-virtual {v0, p1, v1}, Ljava/util/Calendar;->add(II)V

    .line 178
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->setNotification(J)V

    .line 179
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->dismiss()V

    goto :goto_0

    :pswitch_1
    const/16 p1, 0xb

    .line 162
    iget v2, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->tonightHours:I

    invoke-virtual {v0, p1, v2}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xc

    .line 163
    invoke-virtual {v0, p1, v1}, Ljava/util/Calendar;->set(II)V

    .line 167
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-gtz p1, :cond_0

    const/4 p1, 0x5

    const/4 v1, 0x1

    .line 168
    invoke-virtual {v0, p1, v1}, Ljava/util/Calendar;->add(II)V

    .line 171
    :cond_0
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->setNotification(J)V

    .line 172
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->dismiss()V

    :goto_0
    return-void

    .line 158
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->dismiss()V

    return-void

    :pswitch_data_0
    .packed-switch 0x7f090015
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 51
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
