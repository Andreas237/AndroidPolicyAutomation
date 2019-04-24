.class public Lcom/shopkick/app/overlays/scans/OfflineScanOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "OfflineScanOverlay.java"


# static fields
.field public static final OFFLINE_SCAN_OVERLAY_DISMISSED:Ljava/lang/String; = "offlineScanOverlayDismissed"


# instance fields
.field private mainView:Landroid/widget/RelativeLayout;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 0

    .line 27
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/overlays/scans/OfflineScanOverlay;->mainView:Landroid/widget/RelativeLayout;

    .line 29
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/OfflineScanOverlay;->mainView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public destroy()V
    .locals 1

    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Lcom/shopkick/app/overlays/scans/OfflineScanOverlay;->mainView:Landroid/widget/RelativeLayout;

    .line 35
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

    const v0, 0x7f0c0142

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/OfflineScanOverlay;->mainView:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 21
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 22
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/overlays/scans/OfflineScanOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method

.method public onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 2

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/OfflineScanOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanOverlayDismissed"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 56
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    return-void
.end method
