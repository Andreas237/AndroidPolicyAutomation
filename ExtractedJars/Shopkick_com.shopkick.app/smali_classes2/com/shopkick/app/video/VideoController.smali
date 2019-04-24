.class public Lcom/shopkick/app/video/VideoController;
.super Ljava/lang/Object;
.source "VideoController.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;
.implements Lcom/appscend/media/events/APSMediaEventStateListener;


# static fields
.field private static final APP_BUNDLE:Ljava/lang/String; = "app[bundle]"

.field private static final DEVICE_ID:Ljava/lang/String; = "device[ifa]"

.field public static final EVENT_AUTOPLAY_SETTING_CHANGED:Ljava/lang/String; = "EventAutoplaySettingChanged"

.field public static final EVENT_EXIT_FULLSCREEN_BUTTON_TAPPED:Ljava/lang/String; = "EventVideoExitFullscreenButtonTapped"

.field public static final EVENT_EXIT_FULL_SCREEN:Ljava/lang/String; = "EventExitFullScreen"

.field public static final EVENT_VIDEO_AWARD_REQUEST_COMPLETED:Ljava/lang/String; = "EventVideoAwardRequestCompleted"

.field public static final EVENT_VIDEO_AWARD_REQUEST_START:Ljava/lang/String; = "EventVideoAwardRequestStart"

.field public static final PARAM_PAGE_IDENTIFIER:Ljava/lang/String; = "ParamPageIdentifier"

.field public static final PARAM_PROGRAMMATIC_VIDEO_DISABLED:Ljava/lang/String; = "ParamProgrammaticVideoDisabled"

.field public static final PARAM_PROGRAMMATIC_VIDEO_GENERATE_NEW_TILE:Ljava/lang/String; = "ParamProgrammaticVideoGenerateNewTile"

.field public static final PARAM_PROGRAMMATIC_VIDEO_NEXT_REQUEST_ID:Ljava/lang/String; = "ParamProgrammaticVideoNextRequestId"

.field public static final PARAM_PROGRAMMATIC_VIDEO_NEXT_URL:Ljava/lang/String; = "ParamProgrammaticVideoNextUrl"

.field public static final PARAM_VIDEO_ID:Ljava/lang/String; = "ParamVideoId"

.field public static final PARAM_VIDEO_TILEINFO:Ljava/lang/String; = "ParamVideoTileInfo"

.field private static final PLAYERS_HEIGHT:Ljava/lang/String; = "player_height"

.field private static final PLAYERS_WIDTH:Ljava/lang/String; = "player_width"


# instance fields
.field private adTracker:Lcom/moat/analytics/mobile/spck/ExoVideoTracker;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private appPref:Lcom/shopkick/app/application/AppPreferences;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private connectivityManager:Landroid/net/ConnectivityManager;

.field private context:Landroid/content/Context;

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private isMuted:Z

.field private isPaused:Z

.field private lastConfiguredVideoId:Ljava/lang/String;

.field private lastVideoDuration:I

.field private moatPartnerCode:Ljava/lang/String;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private videoCompletedRequestList:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;",
            ">;"
        }
    .end annotation
.end field

.field private videoNeverCompleteList:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private videoOverlayController:Lcom/shopkick/app/video/VideoOverlayController;

.field private videoPlayCompletedList:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private videoShowing:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/ProfileInfo;Ljava/lang/String;)V
    .locals 2

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoPlayCompletedList:Ljava/util/HashSet;

    .line 111
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoNeverCompleteList:Ljava/util/HashSet;

    .line 112
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoCompletedRequestList:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 114
    iput v0, p0, Lcom/shopkick/app/video/VideoController;->lastVideoDuration:I

    const/4 v1, 0x1

    .line 116
    iput-boolean v1, p0, Lcom/shopkick/app/video/VideoController;->isMuted:Z

    .line 117
    iput-boolean v0, p0, Lcom/shopkick/app/video/VideoController;->isPaused:Z

    .line 145
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/video/VideoController;->context:Landroid/content/Context;

    .line 147
    iput-object p2, p0, Lcom/shopkick/app/video/VideoController;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 148
    iput-object p3, p0, Lcom/shopkick/app/video/VideoController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 149
    iput-object p4, p0, Lcom/shopkick/app/video/VideoController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 150
    iput-object p5, p0, Lcom/shopkick/app/video/VideoController;->appPref:Lcom/shopkick/app/application/AppPreferences;

    const-string p2, "connectivity"

    .line 151
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    iput-object p1, p0, Lcom/shopkick/app/video/VideoController;->connectivityManager:Landroid/net/ConnectivityManager;

    .line 152
    iput-object p7, p0, Lcom/shopkick/app/video/VideoController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 153
    iput-object p8, p0, Lcom/shopkick/app/video/VideoController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 154
    iput-object p6, p0, Lcom/shopkick/app/video/VideoController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 155
    iput-object p9, p0, Lcom/shopkick/app/video/VideoController;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 156
    new-instance p1, Lcom/shopkick/app/video/VideoOverlayController;

    invoke-direct {p1, p7, p0}, Lcom/shopkick/app/video/VideoOverlayController;-><init>(Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/video/VideoController;)V

    iput-object p1, p0, Lcom/shopkick/app/video/VideoController;->videoOverlayController:Lcom/shopkick/app/video/VideoOverlayController;

    .line 157
    iput-object p10, p0, Lcom/shopkick/app/video/VideoController;->moatPartnerCode:Ljava/lang/String;

    .line 159
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/appscend/media/APSMediaPlayer;->addTrackingEventListener(Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;)V

    .line 160
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/appscend/media/APSMediaPlayer;->setSecureSurfaceView(Z)V

    .line 161
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object p1

    const-string p2, "http.agent"

    invoke-static {p2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/appscend/media/APSMediaPlayer;->setUserAgent(Ljava/lang/String;)V

    const-string p1, "UserAccountIdChangedEvent"

    .line 163
    invoke-virtual {p7, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "EventVideoExitFullscreenButtonTapped"

    .line 164
    invoke-virtual {p7, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "ageVerificationStartedEvent"

    .line 165
    invoke-virtual {p7, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "ageVerificationCanceledEvent"

    .line 166
    invoke-virtual {p7, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method private getCommonLogRecord(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 5

    .line 543
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 544
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 545
    iget v1, p0, Lcom/shopkick/app/video/VideoController;->lastVideoDuration:I

    int-to-double v1, v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoDurationSeconds(Ljava/lang/Double;)V

    .line 546
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appscend/media/APSMediaPlayer;->currentPlaybackTime()I

    move-result v1

    int-to-double v1, v1

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoViewedSeconds(Ljava/lang/Double;)V

    .line 547
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 548
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoRequestId:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 549
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoRequestId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setRequestId(Ljava/lang/String;)V

    .line 554
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getAutoplayVideoOnWifiEnabled()Z

    move-result p1

    const/4 v1, 0x2

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getAutoplayVideoOnCellularEnabled()Z

    move-result p1

    if-eqz p1, :cond_1

    move p1, v3

    goto :goto_0

    .line 556
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getAutoplayVideoOnWifiEnabled()Z

    move-result p1

    if-eqz p1, :cond_2

    move p1, v1

    goto :goto_0

    :cond_2
    move p1, v2

    .line 559
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoAutoplaySettings(Ljava/lang/Integer;)V

    .line 562
    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->connectivityManager:Landroid/net/ConnectivityManager;

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 563
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    .line 566
    :cond_3
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I

    move-result v4

    if-ne v4, v3, :cond_4

    .line 567
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNetworkStatus(Ljava/lang/Integer;)V

    const/4 p1, 0x0

    .line 568
    invoke-direct {p0, p1}, Lcom/shopkick/app/video/VideoController;->getReadableNameForNetworkSubtype(Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNetworkSubtype(Ljava/lang/String;)V

    goto :goto_2

    .line 570
    :cond_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNetworkStatus(Ljava/lang/Integer;)V

    .line 571
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/video/VideoController;->getReadableNameForNetworkSubtype(Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNetworkSubtype(Ljava/lang/String;)V

    goto :goto_2

    .line 564
    :cond_5
    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNetworkStatus(Ljava/lang/Integer;)V

    const/4 p1, 0x0

    .line 565
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/video/VideoController;->getReadableNameForNetworkSubtype(Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNetworkSubtype(Ljava/lang/String;)V

    :goto_2
    return-object v0
.end method

.method private getEventLogger()Lcom/shopkick/app/logging/UserEventLogger;
    .locals 3

    .line 440
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 444
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 445
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 446
    instance-of v2, v0, Lcom/shopkick/app/activities/VideoFullscreenActivity;

    if-eqz v2, :cond_1

    .line 447
    check-cast v0, Lcom/shopkick/app/activities/VideoFullscreenActivity;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->getUserEventLogger()Lcom/shopkick/app/logging/UserEventLogger;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1

    .line 450
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 451
    iget-object v1, v0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    :cond_3
    return-object v1
.end method

.method private getMediaUnits(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/appscend/media/events/APSMediaEvent;",
            ">;"
        }
    .end annotation

    .line 459
    new-instance v0, Lcom/appscend/media/APSMediaBuilder;

    invoke-direct {v0}, Lcom/appscend/media/APSMediaBuilder;-><init>()V

    .line 461
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoUrl:Ljava/lang/String;

    .line 462
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-static {v2}, Lcom/shopkick/app/util/TileUtils;->isProgrammaticVideoTileType(Ljava/lang/Integer;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 463
    invoke-virtual {p0, v1}, Lcom/shopkick/app/video/VideoController;->updateProgrammaticVideoUrlInfo(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 466
    :cond_0
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoUrlType:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ne v2, v3, :cond_1

    .line 467
    new-instance v2, Lcom/appscend/media/events/APSVastAdBreak;

    invoke-direct {v2}, Lcom/appscend/media/events/APSVastAdBreak;-><init>()V

    .line 468
    invoke-virtual {v2, v1}, Lcom/appscend/media/events/APSVastAdBreak;->addSource(Ljava/lang/String;)V

    .line 469
    sget-object v1, Lcom/appscend/media/events/APSVastAdBreak$APSVASTConfigurationOptions;->APSVASTPreContent:Lcom/appscend/media/events/APSVastAdBreak$APSVASTConfigurationOptions;

    iput-object v1, v2, Lcom/appscend/media/events/APSVastAdBreak;->type:Lcom/appscend/media/events/APSVastAdBreak$APSVASTConfigurationOptions;

    .line 470
    iput-boolean v4, v2, Lcom/appscend/media/events/APSVastAdBreak;->showCountdown:Z

    .line 471
    sget-object v1, Lcom/appscend/media/APSMediaBuilder$APSWebviewDismissedAction;->APSDoNothingOnWebviewDismiss:Lcom/appscend/media/APSMediaBuilder$APSWebviewDismissedAction;

    iput-object v1, v2, Lcom/appscend/media/events/APSVastAdBreak;->afterVideoAdTapped:Lcom/appscend/media/APSMediaBuilder$APSWebviewDismissedAction;

    .line 472
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v2, Lcom/appscend/media/events/APSVastAdBreak;->metadata:Ljava/util/HashMap;

    .line 473
    iget-object v1, v2, Lcom/appscend/media/events/APSVastAdBreak;->metadata:Ljava/util/HashMap;

    const-string v3, "ParamVideoTileInfo"

    invoke-virtual {v1, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    sget-object p1, Lcom/appscend/media/events/APSMediaUnit$APSMediaControlsDisplay;->APSMediaControlsDisplayNone:Lcom/appscend/media/events/APSMediaUnit$APSMediaControlsDisplay;

    iput-object p1, v2, Lcom/appscend/media/events/APSVastAdBreak;->controlsDisplayForAds:Lcom/appscend/media/events/APSMediaUnit$APSMediaControlsDisplay;

    .line 475
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, v0, Lcom/appscend/media/APSMediaBuilder;->adBreaks:Ljava/util/ArrayList;

    .line 476
    iget-object p1, v0, Lcom/appscend/media/APSMediaBuilder;->adBreaks:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 478
    :cond_1
    new-instance v2, Lcom/appscend/media/events/APSMediaUnit;

    invoke-direct {v2}, Lcom/appscend/media/events/APSMediaUnit;-><init>()V

    .line 479
    sget-object v3, Lcom/appscend/media/events/APSMediaUnit$APSMediaControlsDisplay;->APSMediaControlsDisplayNone:Lcom/appscend/media/events/APSMediaUnit$APSMediaControlsDisplay;

    iput-object v3, v2, Lcom/appscend/media/events/APSMediaUnit;->controlsDisplay:Lcom/appscend/media/events/APSMediaUnit$APSMediaControlsDisplay;

    .line 480
    invoke-virtual {v2, v1}, Lcom/appscend/media/events/APSMediaUnit;->initWithURL(Ljava/lang/String;)V

    .line 481
    iget-object v1, v2, Lcom/appscend/media/events/APSMediaUnit;->metadata:Ljava/util/HashMap;

    const-string v3, "ParamVideoTileInfo"

    invoke-virtual {v1, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    iput-boolean v4, v2, Lcom/appscend/media/events/APSMediaUnit;->pinchToFullscreen:Z

    const/4 p1, 0x0

    .line 483
    invoke-virtual {v0, v2, p1}, Lcom/appscend/media/APSMediaBuilder;->initWithMediaUnit(Lcom/appscend/media/events/APSMediaUnit;Ljava/lang/String;)V

    .line 487
    :goto_0
    invoke-virtual {v0}, Lcom/appscend/media/APSMediaBuilder;->mediaUnits()Ljava/util/ArrayList;

    move-result-object p1

    .line 488
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appscend/media/events/APSMediaEvent;

    .line 489
    invoke-virtual {v1, p0}, Lcom/appscend/media/events/APSMediaEvent;->registerEventStateListener(Lcom/appscend/media/events/APSMediaEventStateListener;)V

    goto :goto_1

    :cond_2
    return-object p1
.end method

.method private getReadableNameForNetworkSubtype(Ljava/lang/Integer;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, "WiFi"

    return-object p1

    .line 580
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    const-string p1, "UNKNOWN"

    return-object p1

    :pswitch_0
    const-string p1, "IWLAN"

    return-object p1

    :pswitch_1
    const-string p1, "TD_SCDMA"

    return-object p1

    :pswitch_2
    const-string p1, "GSM"

    return-object p1

    :pswitch_3
    const-string p1, "HSPAP"

    return-object p1

    :pswitch_4
    const-string p1, "EHRPD"

    return-object p1

    :pswitch_5
    const-string p1, "LTE"

    return-object p1

    :pswitch_6
    const-string p1, "EVDO_B"

    return-object p1

    :pswitch_7
    const-string p1, "IDEN"

    return-object p1

    :pswitch_8
    const-string p1, "HSPA"

    return-object p1

    :pswitch_9
    const-string p1, "HSUPA"

    return-object p1

    :pswitch_a
    const-string p1, "HSDPA"

    return-object p1

    :pswitch_b
    const-string p1, "1xRTT"

    return-object p1

    :pswitch_c
    const-string p1, "EVDO_A"

    return-object p1

    :pswitch_d
    const-string p1, "EVDO_0"

    return-object p1

    :pswitch_e
    const-string p1, "CDMA"

    return-object p1

    :pswitch_f
    const-string p1, "UMTS"

    return-object p1

    :pswitch_10
    const-string p1, "EDGE"

    return-object p1

    :pswitch_11
    const-string p1, "GPRS"

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private handleVideoCompletion(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoResponseDetails;)V
    .locals 2

    .line 529
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoCompletedRequestList:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "ParamVideoId"

    .line 532
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    const-string p1, "ParamProgrammaticVideoDisabled"

    .line 534
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoResponseDetails;->disabled:Ljava/lang/Boolean;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "ParamProgrammaticVideoGenerateNewTile"

    .line 535
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoResponseDetails;->generateNewTile:Ljava/lang/Boolean;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "ParamProgrammaticVideoNextUrl"

    .line 536
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoResponseDetails;->nextVideoUrl:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "ParamProgrammaticVideoNextRequestId"

    .line 537
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoResponseDetails;->nextProgrammaticVideoRequestId:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 539
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventVideoAwardRequestCompleted"

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void
.end method

.method public static synthetic lambda$onTrackingEventReceived$6(Lcom/shopkick/app/video/VideoController;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 768
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->exitFullScreen()V

    .line 769
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method private reportFullscreenImpressionLog()V
    .locals 3

    .line 625
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoController;->getEventLogger()Lcom/shopkick/app/logging/UserEventLogger;

    move-result-object v0

    .line 626
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    .line 630
    :cond_0
    invoke-direct {p0, v1}, Lcom/shopkick/app/video/VideoController;->getCommonLogRecord(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v1

    const/4 v2, 0x3

    .line 631
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    const/16 v2, 0xbb

    .line 632
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 634
    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private reportVideoLog(I)V
    .locals 5

    .line 639
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoController;->getEventLogger()Lcom/shopkick/app/logging/UserEventLogger;

    move-result-object v0

    .line 640
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    if-eqz v0, :cond_3

    if-nez v1, :cond_0

    goto :goto_1

    .line 644
    :cond_0
    invoke-direct {p0, v1}, Lcom/shopkick/app/video/VideoController;->getCommonLogRecord(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v2

    .line 645
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 646
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v1, 0xbb

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-static {v1}, Lcom/shopkick/app/util/TileUtils;->getTileElement(Ljava/lang/Integer;)I

    move-result v1

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 647
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsAutoplay(Ljava/lang/Boolean;)V

    const/16 v1, 0x36

    if-ne p1, v1, :cond_2

    .line 650
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    iget-object v1, p0, Lcom/shopkick/app/video/VideoController;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v3, p0, Lcom/shopkick/app/video/VideoController;->appPref:Lcom/shopkick/app/application/AppPreferences;

    iget-object v4, p0, Lcom/shopkick/app/video/VideoController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 651
    invoke-static {v1, v3, v4}, Lcom/shopkick/app/account/AgeVerificationController;->getAge(Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)I

    move-result v1

    .line 650
    invoke-static {p1, v1}, Lcom/shopkick/app/account/AgeVerificationController;->getAgeVerificationStatus(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMinimumAgeEligibility(Ljava/lang/Integer;)V

    .line 654
    :cond_2
    invoke-virtual {v0, v2}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method private requestVideoCompletion(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    .line 496
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 497
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/video/VideoController;->isVideoOnProcessingAward(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 498
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 500
    :cond_2
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumAgeForKicks:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoController;->appPref:Lcom/shopkick/app/application/AppPreferences;

    iget-object v2, p0, Lcom/shopkick/app/video/VideoController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 501
    invoke-static {v0, v1, v2}, Lcom/shopkick/app/account/AgeVerificationController;->getAge(Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)I

    move-result v0

    .line 502
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumAgeForKicks:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_3

    return-void

    .line 507
    :cond_3
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;-><init>()V

    .line 508
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;->videoId:Ljava/lang/String;

    .line 509
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoRequestId:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 510
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoRequestInfo;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoRequestInfo;-><init>()V

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;->progVideoInfo:Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoRequestInfo;

    .line 511
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;->progVideoInfo:Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoRequestInfo;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoRequestId:Ljava/lang/String;

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoRequestInfo;->programmaticVideoRequestId:Ljava/lang/String;

    .line 514
    :cond_4
    iget-object v1, p0, Lcom/shopkick/app/video/VideoController;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v2, p0, Lcom/shopkick/app/video/VideoController;->appPref:Lcom/shopkick/app/application/AppPreferences;

    iget-object v3, p0, Lcom/shopkick/app/video/VideoController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1, v2, v3}, Lcom/shopkick/app/account/AgeVerificationController;->getUserBirthdate(Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 516
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;->userSpecifiedBirthdateMs:Ljava/lang/Long;

    .line 519
    :cond_5
    iget-object v1, p0, Lcom/shopkick/app/video/VideoController;->videoCompletedRequestList:Ljava/util/HashMap;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    iget-object v1, p0, Lcom/shopkick/app/video/VideoController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 523
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "ParamVideoId"

    .line 524
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventVideoAwardRequestStart"

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void
.end method

.method private startMoatTracking()V
    .locals 5

    .line 779
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 780
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->adTracker:Lcom/moat/analytics/mobile/spck/ExoVideoTracker;

    if-eqz v0, :cond_0

    return-void

    .line 784
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    .line 785
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->viewabilityProvider:Ljava/lang/Integer;

    .line 786
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 788
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v1

    .line 789
    invoke-static {}, Lcom/moat/analytics/mobile/spck/MoatFactory;->create()Lcom/moat/analytics/mobile/spck/MoatFactory;

    move-result-object v2

    new-instance v3, Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;

    iget-object v4, p0, Lcom/shopkick/app/video/VideoController;->moatPartnerCode:Ljava/lang/String;

    invoke-direct {v3, v4}, Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/moat/analytics/mobile/spck/MoatFactory;->createCustomTracker(Lcom/moat/analytics/mobile/spck/MoatPlugin;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/moat/analytics/mobile/spck/ExoVideoTracker;

    iput-object v2, p0, Lcom/shopkick/app/video/VideoController;->adTracker:Lcom/moat/analytics/mobile/spck/ExoVideoTracker;

    .line 790
    iget-object v2, p0, Lcom/shopkick/app/video/VideoController;->adTracker:Lcom/moat/analytics/mobile/spck/ExoVideoTracker;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->viewabilityParams:Ljava/util/Map;

    .line 791
    invoke-virtual {v1}, Lcom/appscend/media/APSMediaPlayer;->player()Lcom/appscend/media/renderers/IVeeplayRenderer;

    move-result-object v3

    check-cast v3, Lcom/appscend/media/renderers/ExoPlayerRenderer;

    invoke-virtual {v3}, Lcom/appscend/media/renderers/ExoPlayerRenderer;->getExoPlayerInstance()Lcom/google/android/exoplayer/ExoPlayer;

    move-result-object v3

    .line 792
    invoke-virtual {v1}, Lcom/appscend/media/APSMediaPlayer;->viewController()Landroid/view/ViewGroup;

    move-result-object v1

    .line 790
    invoke-interface {v2, v0, v3, v1}, Lcom/moat/analytics/mobile/spck/ExoVideoTracker;->trackVideoAd(Ljava/util/Map;Lcom/google/android/exoplayer/ExoPlayer;Landroid/view/View;)Z

    :cond_1
    return-void
.end method

.method private stopMoatTracking()V
    .locals 1

    .line 798
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->adTracker:Lcom/moat/analytics/mobile/spck/ExoVideoTracker;

    if-eqz v0, :cond_0

    .line 799
    invoke-interface {v0}, Lcom/moat/analytics/mobile/spck/ExoVideoTracker;->stopTracking()V

    const/4 v0, 0x0

    .line 800
    iput-object v0, p0, Lcom/shopkick/app/video/VideoController;->adTracker:Lcom/moat/analytics/mobile/spck/ExoVideoTracker;

    :cond_0
    return-void
.end method


# virtual methods
.method public addEventStateListenerToCurrentUnit(Lcom/appscend/media/events/APSMediaEventStateListener;)V
    .locals 1

    .line 834
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->currentUnit()Lcom/appscend/media/events/APSMediaUnit;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appscend/media/events/APSMediaUnit;->registerEventStateListener(Lcom/appscend/media/events/APSMediaEventStateListener;)V

    return-void
.end method

.method public addTrackingEventListener(Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;)V
    .locals 1

    .line 805
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appscend/media/APSMediaPlayer;->addTrackingEventListener(Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;)V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 4

    .line 845
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;

    .line 848
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 849
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->getMessageForResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 852
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 854
    :cond_0
    new-instance v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;

    invoke-direct {v0}, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;-><init>()V

    const/16 v2, 0x113

    .line 855
    iput v2, v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->height:I

    const/16 v2, 0xd2

    .line 856
    iput v2, v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->width:I

    .line 857
    iget-object v2, p0, Lcom/shopkick/app/video/VideoController;->context:Landroid/content/Context;

    const v3, 0x7f110155

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->toastTitle:Ljava/lang/String;

    .line 858
    iput-object p2, v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->toastMessage:Ljava/lang/String;

    .line 859
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object p2

    invoke-virtual {p2, v0, v1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 863
    iget-object v2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    .line 864
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedResponse;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedResponse;->progVideoResponse:Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoResponseDetails;

    if-eqz v1, :cond_3

    .line 869
    iget-object p2, v1, Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoResponseDetails;->disabled:Ljava/lang/Boolean;

    .line 870
    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, v1, Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoResponseDetails;->generateNewTile:Ljava/lang/Boolean;

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    :cond_2
    move v0, v3

    :cond_3
    if-eqz v0, :cond_5

    .line 875
    iget-object p2, p0, Lcom/shopkick/app/video/VideoController;->videoNeverCompleteList:Ljava/util/HashSet;

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;->videoId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    .line 876
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;->videoId:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lcom/shopkick/app/video/VideoController;->setVideoPlayCompleted(Ljava/lang/String;)V

    .line 877
    iget-object p2, p0, Lcom/shopkick/app/video/VideoController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p2}, Lcom/shopkick/app/util/FeatureFlagHelper;->isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 878
    iget-object p2, p0, Lcom/shopkick/app/video/VideoController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 879
    invoke-virtual {p2}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/browse/BrowseScreen;

    if-eqz v0, :cond_5

    .line 880
    invoke-virtual {p2}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/browse/BrowseScreen;

    .line 881
    invoke-virtual {p2}, Lcom/shopkick/app/browse/BrowseScreen;->isFTUEQuickVideoStartedByTapIndicator()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 882
    invoke-virtual {p2}, Lcom/shopkick/app/browse/BrowseScreen;->ftueQuickVideoProcessed()V

    .line 883
    invoke-virtual {p2, v3}, Lcom/shopkick/app/browse/BrowseScreen;->setFTUEQuickVideoStartedByTapIndicator(Z)V

    goto :goto_0

    .line 885
    :cond_4
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;->videoId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/browse/BrowseScreen;->resumeDiscoverLessonIfIsFTUEQuickVideo(Ljava/lang/String;)V

    .line 892
    :cond_5
    :goto_0
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;->videoId:Ljava/lang/String;

    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/video/VideoController;->handleVideoCompletion(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ProgrammaticVideoResponseDetails;)V

    return-void
.end method

.method public destroy()V
    .locals 3

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoCompletedRequestList:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;

    .line 171
    iget-object v2, p0, Lcom/shopkick/app/video/VideoController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 173
    iput-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoCompletedRequestList:Ljava/util/HashMap;

    .line 175
    iget-object v1, p0, Lcom/shopkick/app/video/VideoController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 176
    iput-object v0, p0, Lcom/shopkick/app/video/VideoController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 178
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    .line 179
    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->stop()V

    .line 180
    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->removeAllTrackingEventListeners()V

    .line 181
    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->finish()V

    .line 183
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoController;->stopMoatTracking()V

    return-void
.end method

.method public enterFullScreen()V
    .locals 2

    .line 367
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->enableOverlay(Z)V

    .line 368
    invoke-virtual {p0, v1}, Lcom/shopkick/app/video/VideoController;->setMute(Z)V

    .line 370
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->enterFullScreenWithActivity()V

    .line 373
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoController;->reportFullscreenImpressionLog()V

    return-void
.end method

.method public enterFullScreenWithActivity()V
    .locals 4

    .line 377
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 378
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 379
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/shopkick/app/activities/VideoFullscreenActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "ParamPageIdentifier"

    .line 380
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/app/screens/AppScreen;->getPageIdentifierV2()Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 381
    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public exitFullScreen()V
    .locals 2

    .line 386
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 387
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 388
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoController;->stopMoatTracking()V

    .line 389
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->finish()V

    :cond_0
    const/4 v0, 0x1

    .line 392
    invoke-virtual {p0, v0}, Lcom/shopkick/app/video/VideoController;->setMute(Z)V

    .line 393
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->enableOverlay(Z)V

    .line 394
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventExitFullScreen"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method public fullScreenActivityDidFinished()V
    .locals 2

    .line 398
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventExitFullScreen"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method public getCurrentPlaybackTime()I
    .locals 1

    .line 241
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->currentPlaybackTime()I

    move-result v0

    return v0
.end method

.method public getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 3

    .line 210
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    .line 212
    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->currentUnit()Lcom/appscend/media/events/APSMediaUnit;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 213
    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->currentUnit()Lcom/appscend/media/events/APSMediaUnit;

    move-result-object v0

    iget-object v0, v0, Lcom/appscend/media/events/APSMediaUnit;->metadata:Ljava/util/HashMap;

    const-string v1, "ParamVideoTileInfo"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-object v0

    .line 215
    :cond_0
    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->getPlaylist()Ljava/util/List;

    move-result-object v0

    .line 216
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appscend/media/events/APSMediaEvent;

    .line 217
    instance-of v2, v1, Lcom/appscend/media/events/APSMediaUnit;

    if-eqz v2, :cond_2

    .line 218
    check-cast v1, Lcom/appscend/media/events/APSMediaUnit;

    iget-object v0, v1, Lcom/appscend/media/events/APSMediaUnit;->metadata:Ljava/util/HashMap;

    const-string v1, "ParamVideoTileInfo"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-object v0

    .line 219
    :cond_2
    instance-of v2, v1, Lcom/appscend/media/events/APSVastAdBreak;

    if-eqz v2, :cond_1

    .line 220
    check-cast v1, Lcom/appscend/media/events/APSVastAdBreak;

    iget-object v0, v1, Lcom/appscend/media/events/APSVastAdBreak;->metadata:Ljava/util/HashMap;

    const-string v1, "ParamVideoTileInfo"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-object v0

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public getLastConfiguredVideoId()Ljava/lang/String;
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->lastConfiguredVideoId:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoDuration()I
    .locals 1

    .line 237
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->duration()I

    move-result v0

    return v0
.end method

.method public getVideoOverlayController()Lcom/shopkick/app/video/VideoOverlayController;
    .locals 1

    .line 233
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoOverlayController:Lcom/shopkick/app/video/VideoOverlayController;

    return-object v0
.end method

.method public getVideoPlayCompleteListSize()I
    .locals 1

    .line 416
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoPlayCompletedList:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    return v0
.end method

.method public getVideoPlayerState()Lcom/appscend/media/APSMediaPlayer$MPMoviePlaybackState;
    .locals 1

    .line 361
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->playbackState()Lcom/appscend/media/APSMediaPlayer$MPMoviePlaybackState;

    move-result-object v0

    return-object v0
.end method

.method public isFullscreen()Z
    .locals 1

    .line 402
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 403
    instance-of v0, v0, Lcom/shopkick/app/activities/VideoFullscreenActivity;

    return v0
.end method

.method public isInPlayableConnection()Z
    .locals 2

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->connectivityManager:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 200
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 201
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getAutoplayVideoOnWifiEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 203
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getAutoplayVideoOnCellularEnabled()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public isMuted()Z
    .locals 1

    .line 309
    iget-boolean v0, p0, Lcom/shopkick/app/video/VideoController;->isMuted:Z

    return v0
.end method

.method public isVideoOnProcessingAward()Z
    .locals 1

    .line 430
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoCompletedRequestList:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isVideoOnProcessingAward(Ljava/lang/String;)Z
    .locals 1

    .line 435
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoCompletedRequestList:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isVideoPaused()Z
    .locals 2

    .line 349
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->playbackState()Lcom/appscend/media/APSMediaPlayer$MPMoviePlaybackState;

    move-result-object v0

    sget-object v1, Lcom/appscend/media/APSMediaPlayer$MPMoviePlaybackState;->MPMoviePlaybackPaused:Lcom/appscend/media/APSMediaPlayer$MPMoviePlaybackState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isVideoPlayCompleted(Ljava/lang/String;)Z
    .locals 1

    .line 420
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoPlayCompletedList:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isVideoPlaying()Z
    .locals 2

    .line 357
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->playbackState()Lcom/appscend/media/APSMediaPlayer$MPMoviePlaybackState;

    move-result-object v0

    sget-object v1, Lcom/appscend/media/APSMediaPlayer$MPMoviePlaybackState;->MPMoviePlaybackPlaying:Lcom/appscend/media/APSMediaPlayer$MPMoviePlaybackState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isVideoShowing()Z
    .locals 1

    .line 125
    iget-boolean v0, p0, Lcom/shopkick/app/video/VideoController;->videoShowing:Z

    return v0
.end method

.method public isVideoStopped()Z
    .locals 2

    .line 353
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->playbackState()Lcom/appscend/media/APSMediaPlayer$MPMoviePlaybackState;

    move-result-object v0

    sget-object v1, Lcom/appscend/media/APSMediaPlayer$MPMoviePlaybackState;->MPMoviePlaybackStopped:Lcom/appscend/media/APSMediaPlayer$MPMoviePlaybackState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 294
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoUrlType:Ljava/lang/Integer;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 296
    iput-boolean v0, p0, Lcom/shopkick/app/video/VideoController;->isPaused:Z

    .line 297
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->stop()V

    .line 298
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/shopkick/app/video/VideoController;->getMediaUnits(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/appscend/media/APSMediaPlayer;->setMediaUnits(Ljava/util/ArrayList;)V

    .line 299
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoOverlayController:Lcom/shopkick/app/video/VideoOverlayController;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoOverlayController;->setVideoTitle(Ljava/lang/String;)V

    .line 300
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/video/VideoController;->lastConfiguredVideoId:Ljava/lang/String;

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public notifyActivityDestroyed(Lcom/shopkick/app/activities/BaseActivity;)V
    .locals 2

    .line 188
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 189
    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 191
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/appscend/media/APSMediaPlayer;->init(Landroid/app/Activity;Z)V

    :cond_0
    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 901
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0x7fa86b8d

    if-eq p2, v0, :cond_3

    const v0, -0x568be288

    if-eq p2, v0, :cond_2

    const v0, -0x222df919

    if-eq p2, v0, :cond_1

    const v0, 0x44e6563

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    const-string p2, "ageVerificationCanceledEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x3

    goto :goto_1

    :cond_2
    const-string p2, "EventVideoExitFullscreenButtonTapped"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    const-string p2, "ageVerificationStartedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x2

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_3

    .line 931
    :pswitch_0
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->playVideo()V

    goto/16 :goto_3

    .line 928
    :pswitch_1
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->pauseVideo()V

    goto/16 :goto_3

    .line 911
    :pswitch_2
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoController;->getEventLogger()Lcom/shopkick/app/logging/UserEventLogger;

    move-result-object p1

    .line 912
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    if-eqz p1, :cond_7

    if-eqz p2, :cond_7

    .line 916
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0xbd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x32

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 917
    iget v1, p0, Lcom/shopkick/app/video/VideoController;->lastVideoDuration:I

    int-to-double v1, v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoDurationSeconds(Ljava/lang/Double;)V

    .line 918
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appscend/media/APSMediaPlayer;->currentPlaybackTime()I

    move-result v1

    div-int/lit16 v1, v1, 0x3e8

    int-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoViewedSeconds(Ljava/lang/Double;)V

    .line 919
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 920
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoRequestId:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 921
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoRequestId:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setRequestId(Ljava/lang/String;)V

    .line 923
    :cond_5
    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    goto :goto_3

    .line 903
    :pswitch_3
    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->videoPlayCompletedList:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    .line 904
    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->videoCompletedRequestList:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/VideoCompletedRequest;

    .line 905
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, p2, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    goto :goto_2

    .line 907
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->videoCompletedRequestList:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    :cond_7
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onEventStateChanged(Lcom/appscend/media/events/APSMediaEvent;Lcom/appscend/media/events/APSMediaEvent$APSMediaEventState;)V
    .locals 0

    .line 819
    sget-object p1, Lcom/shopkick/app/video/VideoController$1;->$SwitchMap$com$appscend$media$events$APSMediaEvent$APSMediaEventState:[I

    invoke-virtual {p2}, Lcom/appscend/media/events/APSMediaEvent$APSMediaEventState;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_0

    goto :goto_0

    .line 821
    :cond_0
    sget-object p1, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ERROR:Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/video/VideoController;->onTrackingEventReceived(Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;Landroid/os/Bundle;)V

    :goto_0
    return-void
.end method

.method public onTrackingEventReceived(Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;Landroid/os/Bundle;)V
    .locals 7

    .line 663
    sget-object p2, Lcom/shopkick/app/video/VideoController$1;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    invoke-virtual {p1}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/16 p2, 0x5a

    const/16 v0, 0x8

    const v1, 0x7f090434

    const v2, 0x7f090806

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_3

    .line 762
    :pswitch_0
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result p1

    if-eqz p1, :cond_c

    .line 763
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v1, 0x0

    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->context:Landroid/content/Context;

    const p2, 0x7f110155

    .line 764
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->context:Landroid/content/Context;

    const p2, 0x7f110758

    .line 765
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->context:Landroid/content/Context;

    const p2, 0x7f11014f

    .line 766
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/shopkick/app/video/-$$Lambda$VideoController$-7zxx7PnvNu1LvpHMF_PFKF2GI8;

    invoke-direct {v5, p0}, Lcom/shopkick/app/video/-$$Lambda$VideoController$-7zxx7PnvNu1LvpHMF_PFKF2GI8;-><init>(Lcom/shopkick/app/video/VideoController;)V

    const/4 v6, 0x0

    .line 763
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto/16 :goto_3

    :pswitch_1
    const/16 p1, 0x36

    .line 722
    invoke-direct {p0, p1}, Lcom/shopkick/app/video/VideoController;->reportVideoLog(I)V

    .line 724
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 725
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, -0x1

    .line 726
    :goto_1
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result v0

    if-nez v0, :cond_5

    const/16 v1, 0x72

    if-ne p2, v1, :cond_2

    goto :goto_2

    :cond_2
    const/16 v0, 0x56

    if-ne p2, v0, :cond_3

    .line 744
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isVideoShowing()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 747
    invoke-direct {p0, p1}, Lcom/shopkick/app/video/VideoController;->requestVideoCompletion(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto/16 :goto_3

    :cond_3
    const/16 v0, -0x3a

    if-ne p2, v0, :cond_4

    .line 749
    invoke-direct {p0, p1}, Lcom/shopkick/app/video/VideoController;->requestVideoCompletion(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto/16 :goto_3

    .line 752
    :cond_4
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/appscend/media/APSMediaPlayer;->viewController()Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 753
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_c

    .line 754
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_3

    :cond_5
    :goto_2
    if-eqz v0, :cond_6

    .line 730
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->exitFullScreen()V

    :cond_6
    if-eqz p1, :cond_c

    .line 734
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 735
    invoke-direct {p0, p1}, Lcom/shopkick/app/video/VideoController;->requestVideoCompletion(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto/16 :goto_3

    .line 736
    :cond_7
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-static {p2}, Lcom/shopkick/app/util/TileUtils;->isProgrammaticVideoTileType(Ljava/lang/Integer;)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_8

    .line 737
    invoke-direct {p0, p1}, Lcom/shopkick/app/video/VideoController;->requestVideoCompletion(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto/16 :goto_3

    .line 740
    :cond_8
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/video/VideoController;->setVideoPlayCompleted(Ljava/lang/String;)V

    goto/16 :goto_3

    :pswitch_2
    const/16 p1, 0x35

    .line 718
    invoke-direct {p0, p1}, Lcom/shopkick/app/video/VideoController;->reportVideoLog(I)V

    goto/16 :goto_3

    .line 699
    :pswitch_3
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/appscend/media/APSMediaPlayer;->duration()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/video/VideoController;->lastVideoDuration:I

    .line 701
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoController;->startMoatTracking()V

    .line 702
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/video/VideoController;->setMute(Z)V

    .line 703
    invoke-direct {p0, p2}, Lcom/shopkick/app/video/VideoController;->reportVideoLog(I)V

    .line 705
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result p1

    if-nez p1, :cond_c

    .line 706
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object p1

    .line 707
    invoke-virtual {p1}, Lcom/appscend/media/APSMediaPlayer;->viewController()Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 708
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_9

    .line 709
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 711
    :cond_9
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_c

    .line 712
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    .line 680
    :pswitch_4
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result p1

    if-eqz p1, :cond_a

    .line 681
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoController;->reportFullscreenImpressionLog()V

    .line 684
    :cond_a
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoController;->startMoatTracking()V

    .line 685
    invoke-direct {p0, p2}, Lcom/shopkick/app/video/VideoController;->reportVideoLog(I)V

    .line 687
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result p1

    if-nez p1, :cond_c

    .line 688
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/appscend/media/APSMediaPlayer;->viewController()Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 689
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_b

    .line 690
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 692
    :cond_b
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_c

    .line 693
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    .line 672
    :pswitch_5
    iget-boolean p1, p0, Lcom/shopkick/app/video/VideoController;->isPaused:Z

    if-eqz p1, :cond_c

    .line 673
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object p1

    .line 674
    invoke-virtual {p1}, Lcom/appscend/media/APSMediaPlayer;->pause()V

    :cond_c
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public pauseVideo()V
    .locals 2

    const/4 v0, 0x1

    .line 332
    iput-boolean v0, p0, Lcom/shopkick/app/video/VideoController;->isPaused:Z

    .line 333
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    .line 334
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isVideoPlaying()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 335
    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->pause()V

    :cond_0
    return-void
.end method

.method public playVideo()V
    .locals 3

    const/4 v0, 0x0

    .line 313
    iput-boolean v0, p0, Lcom/shopkick/app/video/VideoController;->isPaused:Z

    .line 314
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    .line 315
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isVideoPlaying()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 319
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    .line 320
    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->currentUnit()Lcom/appscend/media/events/APSMediaUnit;

    move-result-object v2

    if-eqz v2, :cond_2

    if-eqz v1, :cond_2

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/video/VideoController;->lastConfiguredVideoId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 321
    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->next()V

    goto :goto_0

    .line 323
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isVideoStopped()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 325
    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->next()V

    goto :goto_0

    .line 327
    :cond_1
    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->resumePlay()V

    :cond_2
    :goto_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public removeTrackEventListener(Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;)V
    .locals 1

    .line 809
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appscend/media/APSMediaPlayer;->removeTrackingEventListener(Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;)V

    return-void
.end method

.method public setMute(Z)V
    .locals 1

    .line 304
    iput-boolean p1, p0, Lcom/shopkick/app/video/VideoController;->isMuted:Z

    .line 305
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appscend/media/APSMediaPlayer;->setMute(Z)V

    return-void
.end method

.method public setVideoPlayCompleted(Ljava/lang/String;)V
    .locals 1

    .line 412
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoPlayCompletedList:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public setVideoPlayNeverCompleted(Ljava/lang/String;)V
    .locals 1

    .line 425
    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->videoNeverCompleteList:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public setVideoShowing(Z)V
    .locals 0

    .line 129
    iput-boolean p1, p0, Lcom/shopkick/app/video/VideoController;->videoShowing:Z

    return-void
.end method

.method public setupVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/ViewGroup;)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    .line 246
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    if-nez v1, :cond_0

    goto/16 :goto_0

    .line 250
    :cond_0
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v1

    .line 253
    iget-object v2, p0, Lcom/shopkick/app/video/VideoController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 254
    invoke-virtual {v1}, Lcom/appscend/media/APSMediaPlayer;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 255
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v3

    invoke-virtual {v3, v2, v0}, Lcom/appscend/media/APSMediaPlayer;->init(Landroid/app/Activity;Z)V

    .line 256
    iget-object v3, p0, Lcom/shopkick/app/video/VideoController;->videoOverlayController:Lcom/shopkick/app/video/VideoOverlayController;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/video/VideoOverlayController;->load(Landroid/content/Context;)V

    .line 259
    :cond_1
    invoke-virtual {v1}, Lcom/appscend/media/APSMediaPlayer;->viewController()Landroid/view/ViewGroup;

    move-result-object v2

    if-nez v2, :cond_2

    return v0

    .line 263
    :cond_2
    invoke-virtual {v1}, Lcom/appscend/media/APSMediaPlayer;->viewController()Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_6

    .line 266
    invoke-virtual {v1}, Lcom/appscend/media/APSMediaPlayer;->viewController()Landroid/view/ViewGroup;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 267
    invoke-virtual {v1}, Lcom/appscend/media/APSMediaPlayer;->viewController()Landroid/view/ViewGroup;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    const v4, 0x7f090806

    .line 268
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/logging/UserEventImageView;

    if-eqz v4, :cond_3

    .line 271
    invoke-virtual {v4, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    :cond_3
    const v5, 0x7f090434

    .line 273
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_4

    if-eqz v4, :cond_4

    .line 274
    invoke-virtual {v4}, Lcom/shopkick/app/logging/UserEventImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-nez v4, :cond_4

    .line 276
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 279
    :cond_4
    invoke-virtual {v1}, Lcom/appscend/media/APSMediaPlayer;->viewController()Landroid/view/ViewGroup;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 282
    :cond_5
    invoke-virtual {v1}, Lcom/appscend/media/APSMediaPlayer;->viewController()Landroid/view/ViewGroup;

    move-result-object v3

    invoke-virtual {p2, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 283
    invoke-virtual {v1}, Lcom/appscend/media/APSMediaPlayer;->computeSurfaceSize()V

    .line 286
    :cond_6
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/video/VideoController;->lastConfiguredVideoId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    .line 287
    invoke-virtual {p0, p1}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    :cond_7
    return v2

    :cond_8
    :goto_0
    return v0
.end method

.method public stopVideo()V
    .locals 2

    const/4 v0, 0x1

    .line 340
    iput-boolean v0, p0, Lcom/shopkick/app/video/VideoController;->isPaused:Z

    .line 341
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    .line 342
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoController;->isVideoStopped()Z

    move-result v1

    if-nez v1, :cond_0

    .line 343
    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->stop()V

    .line 345
    :cond_0
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appscend/media/APSMediaPlayer;->getPlaylist()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/appscend/media/APSMediaPlayer;->removeMediaUnits(Ljava/util/List;)V

    return-void
.end method

.method public updateProgrammaticVideoUrlInfo(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 937
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 938
    invoke-static {p1}, Lcom/shopkick/app/url/UriUtils;->paramMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "app[bundle]"

    .line 940
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "device[ifa]"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "player_width"

    .line 941
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "player_height"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "app[bundle]"

    .line 945
    iget-object v2, p0, Lcom/shopkick/app/video/VideoController;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 946
    iget-object p1, p0, Lcom/shopkick/app/video/VideoController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {p1}, Lcom/shopkick/app/application/DeviceInfo;->getAdvertisingInfo()Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v2, "device[ifa]"

    .line 948
    iget-object p1, p1, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->advertisingId:Ljava/lang/String;

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string p1, "player_width"

    .line 954
    iget-object v2, p0, Lcom/shopkick/app/video/VideoController;->context:Landroid/content/Context;

    invoke-static {v2}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenHeight(Landroid/content/Context;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "player_height"

    .line 955
    iget-object v2, p0, Lcom/shopkick/app/video/VideoController;->context:Landroid/content/Context;

    invoke-static {v2}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 957
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    move-result-object p1

    .line 958
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 959
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_0

    .line 962
    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_1
    return-object p1
.end method
