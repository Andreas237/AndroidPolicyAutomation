.class public abstract Lcom/shopkick/app/overlays/base/SKOverlay;
.super Ljava/lang/Object;
.source "SKOverlay.java"

# interfaces
.implements Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;
.implements Lcom/shopkick/app/screens/UIEventLogUpdateCallback;


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "SKOverlay"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field protected contextRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private didObliterate:Z

.field public eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private overlayDialogWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/overlays/base/Overlay;",
            ">;"
        }
    .end annotation
.end field

.field protected spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 35
    iput-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    .line 38
    iput-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-void
.end method

.method private getContainerView()Landroid/view/ViewGroup;
    .locals 2

    .line 118
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    :goto_0
    return-object v0
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 3

    .line 81
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    .line 82
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 83
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->getContainerView()Landroid/view/ViewGroup;

    move-result-object v1

    if-nez v1, :cond_0

    .line 86
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 87
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {p1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 88
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->getResId()I

    move-result p1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public destroy()V
    .locals 1
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->overlayDialogWeakReference:Ljava/lang/ref/WeakReference;

    .line 69
    iput-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    .line 70
    iput-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    return-void
.end method

.method public dismiss()V
    .locals 2

    .line 157
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->didObliterate:Z

    if-eqz v0, :cond_0

    return-void

    .line 160
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->obliterateAnimators()V

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-nez v0, :cond_1

    .line 163
    sget-object v0, Lcom/shopkick/app/overlays/base/SKOverlay;->LOG_TAG:Ljava/lang/String;

    const-string v1, "dismiss: invalid spec"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x68fb0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 165
    iget-object v1, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void

    .line 169
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->overlayDialogWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    .line 170
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/overlays/base/Overlay;

    if-eqz v0, :cond_2

    .line 172
    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/Overlay;->dismiss()V

    :cond_2
    return-void
.end method

.method protected getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 153
    :cond_0
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    return-object v0
.end method

.method protected getImageResource(Ljava/lang/String;)I
    .locals 3

    .line 236
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    .line 237
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_0

    return v1

    .line 241
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "drawable"

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p1, v2, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_1
    return v1
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f120231

    return v0
.end method

.method protected abstract getResId()I
.end method

.method public abstract getView()Landroid/view/View;
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 7

    .line 50
    iput-object p2, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 51
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iput-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 53
    new-instance v0, Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v2, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v3, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, p1, Lcom/shopkick/app/application/ScreenGlobals;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v5, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 57
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/overlays/OverlayInfo;->enumForKey(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/logging/UserEventLogger;-><init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/account/UserAccount;Ljava/lang/Integer;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 58
    iget-object p2, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->setTrackingUrlManager(Lcom/shopkick/app/tracking/TrackingUrlManager;)V

    .line 59
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    new-instance p2, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-direct {p2}, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;-><init>()V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/logging/UserEventLogger;->setSingleUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/logging/UserEventLogger;->setUiEventLogUpdateCallback(Lcom/shopkick/app/screens/UIEventLogUpdateCallback;)V

    return-void
.end method

.method public isCancelable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isCancelableOnTouchOutside()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected obliterateAnimators()V
    .locals 1

    const/4 v0, 0x1

    .line 192
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->didObliterate:Z

    return-void
.end method

.method public onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 138
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedHidePage()V

    return-void
.end method

.method public onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 128
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedShowPage()V

    return-void
.end method

.method public onOverlayUpdated(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public setOverlayDialog(Lcom/shopkick/app/overlays/base/Overlay;)V
    .locals 1

    .line 99
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/base/SKOverlay;->overlayDialogWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public updateOriginScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 0

    return-void
.end method

.method public updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 0

    return-void
.end method

.method public updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 0

    return-void
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 0

    return-void
.end method
