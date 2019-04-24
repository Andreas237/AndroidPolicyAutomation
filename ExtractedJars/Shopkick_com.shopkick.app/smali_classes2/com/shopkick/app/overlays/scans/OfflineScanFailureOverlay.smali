.class public Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "OfflineScanFailureOverlay.java"


# instance fields
.field private mainView:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method public static synthetic lambda$createView$161(Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;Landroid/view/View;)V
    .locals 0

    .line 37
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;->dismiss()V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 4

    .line 26
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;->mainView:Landroid/view/View;

    .line 29
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v0, 0x15

    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOverlay(Ljava/lang/Integer;)V

    const/16 v0, 0x32

    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 32
    new-instance v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v0}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 33
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1}, Lcom/shopkick/app/logging/UserEventLogger;->getSingleUserEventCoordinator()Lcom/shopkick/app/logging/IUserEventCoordinator;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 34
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f0900c6

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/logging/IUserEventView;

    iget-object v3, p0, Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {v1, p1, v3, v0}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 37
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;->mainView:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/overlays/scans/-$$Lambda$OfflineScanFailureOverlay$eRqjNG-ApNIGaeEf50QNWuMjPPQ;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/scans/-$$Lambda$OfflineScanFailureOverlay$eRqjNG-ApNIGaeEf50QNWuMjPPQ;-><init>(Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;->mainView:Landroid/view/View;

    return-object p1
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0141

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;->mainView:Landroid/view/View;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 21
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    return-void
.end method
