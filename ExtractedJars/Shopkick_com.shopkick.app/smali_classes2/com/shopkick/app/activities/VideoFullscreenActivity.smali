.class public Lcom/shopkick/app/activities/VideoFullscreenActivity;
.super Lcom/shopkick/app/activities/BaseActivity;
.source "VideoFullscreenActivity.java"


# instance fields
.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private isInitialized:Z

.field private networkStateReceiver:Landroid/content/BroadcastReceiver;

.field private userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private videoController:Lcom/shopkick/app/video/VideoController;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Lcom/shopkick/app/activities/BaseActivity;-><init>()V

    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->isInitialized:Z

    .line 159
    new-instance v0, Lcom/shopkick/app/activities/VideoFullscreenActivity$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/activities/VideoFullscreenActivity$1;-><init>(Lcom/shopkick/app/activities/VideoFullscreenActivity;)V

    iput-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->networkStateReceiver:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/activities/VideoFullscreenActivity;)Lcom/shopkick/app/video/VideoController;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->videoController:Lcom/shopkick/app/video/VideoController;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/activities/VideoFullscreenActivity;)Lcom/shopkick/app/application/dialog/DialogsManager;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-object p0
.end method

.method private initPlayer()V
    .locals 4

    .line 130
    invoke-virtual {p0}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->getRequestedOrientation()I

    move-result v0

    const v1, 0x7f090197

    .line 131
    invoke-virtual {p0, v1}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    const/high16 v2, -0x1000000

    .line 132
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 135
    iget-object v2, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v2}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v2

    if-nez v2, :cond_0

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->videoController:Lcom/shopkick/app/video/VideoController;

    sget-object v1, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ERROR:Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/video/VideoController;->onTrackingEventReceived(Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;Landroid/os/Bundle;)V

    return-void

    .line 144
    :cond_0
    iget-object v3, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v3, v2, v1}, Lcom/shopkick/app/video/VideoController;->setupVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/ViewGroup;)Z

    .line 148
    iget-object v1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v1}, Lcom/shopkick/app/video/VideoController;->isVideoStopped()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 149
    iget-object v1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 153
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v1}, Lcom/shopkick/app/video/VideoController;->getVideoOverlayController()Lcom/shopkick/app/video/VideoOverlayController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/video/VideoOverlayController;->didEnterFullscreen()V

    .line 156
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->setRequestedOrientation(I)V

    return-void
.end method


# virtual methods
.method public getTopScreen()Lcom/shopkick/app/screens/AppScreen;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getUserEventLogger()Lcom/shopkick/app/logging/UserEventLogger;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-object v0
.end method

.method protected goToScreenInCurrentActivity(Lcom/shopkick/app/activities/PageIdentifierV2;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected handleOnCreate()V
    .locals 10

    .line 42
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnCreate()V

    .line 45
    invoke-virtual {p0}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iput-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 52
    invoke-virtual {p0}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "ParamPageIdentifier"

    .line 54
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    .line 55
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v1

    invoke-virtual {v0}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/screens/ScreenInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 56
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/screens/ScreenInfo;->getScreenEnum(Ljava/lang/Class;)Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_0

    .line 58
    new-instance v0, Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v5, v1, Lcom/shopkick/app/application/ScreenGlobals;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v6, v1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, v1, Lcom/shopkick/app/application/ScreenGlobals;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    iget-object v1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->screenUIPerformanceLogger:Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/shopkick/app/logging/UserEventLogger;-><init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;Ljava/lang/Integer;)V

    iput-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventLogger;->setTrackingUrlManager(Lcom/shopkick/app/tracking/TrackingUrlManager;)V

    .line 70
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x100

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 71
    invoke-virtual {p0}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060021

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    return-void
.end method

.method protected handleOnPause()V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->networkStateReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->pauseVideo()V

    .line 93
    invoke-virtual {p0}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->getVideoOverlayController()Lcom/shopkick/app/video/VideoOverlayController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoOverlayController;->didExitFullscreen()V

    .line 97
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnPause()V

    .line 98
    invoke-virtual {p0}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->fullScreenActivityDidFinished()V

    :cond_1
    return-void
.end method

.method protected handleOnResume()V
    .locals 3

    .line 76
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnResume()V

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->networkStateReceiver:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 81
    iget-boolean v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->isInitialized:Z

    if-nez v0, :cond_0

    .line 82
    invoke-direct {p0}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->initPlayer()V

    const/4 v0, 0x1

    .line 83
    iput-boolean v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->isInitialized:Z

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->playVideo()V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 105
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->onBackPressed()V

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    return-void
.end method

.method public setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public supportsToolbar()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
