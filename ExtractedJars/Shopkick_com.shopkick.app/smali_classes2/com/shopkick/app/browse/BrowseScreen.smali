.class public Lcom/shopkick/app/browse/BrowseScreen;
.super Lcom/shopkick/app/tabs/TabScreen;
.source "BrowseScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;
.implements Lcom/shopkick/app/overlays/interfaces/IOverlayListener;


# static fields
.field private static final ANIMATION_POPUP_DELAY:I = 0x12c

.field private static final AUTO_REFRESH_INTERVAL_MS:I = 0xdbba0

.field private static final PULL_TO_REFRESH_TOP_MARGIN_OFFSET:I = 0x6e

.field private static final TOP_EXTRA_SPACING:I


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private appPref:Lcom/shopkick/app/application/AppPreferences;

.field private carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

.field private categoryIdFromSetParams:Ljava/lang/String;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private ftueQuickVideoStartedByTapIndicator:Z

.field private ftueTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private final handler:Landroid/os/Handler;

.field private inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

.field private isCarouselVisible:Z

.field private isInlineProgVideoEnabled:Z

.field private isQuickKicksEnabled:Z

.field private lastBestLocation:Landroid/location/Location;

.field private lastSuccessfulFirstPageTs:Ljava/lang/Long;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private pauseIcon:Landroid/widget/RelativeLayout;

.field private pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

.field private permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field private promoCarouselIndex:I

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private recyclerViewOverlay:Landroid/view/View;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private showSurveyErrorOnScreenDidShow:Z

.field private showSurveyProcessingOverlay:Z

.field private simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

.field private surveyParams:[Ljava/lang/Object;

.field private videoBottomTooltip:Landroid/view/View;

.field private videoController:Lcom/shopkick/app/video/VideoController;

.field private videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

.field private videoTopTooltip:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 91
    invoke-direct {p0}, Lcom/shopkick/app/tabs/TabScreen;-><init>()V

    .line 104
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->handler:Landroid/os/Handler;

    const/high16 v0, -0x80000000

    .line 132
    iput v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->promoCarouselIndex:I

    const/4 v0, 0x0

    .line 138
    iput-boolean v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->isQuickKicksEnabled:Z

    .line 139
    iput-boolean v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->isInlineProgVideoEnabled:Z

    .line 149
    iput-boolean v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->showSurveyErrorOnScreenDidShow:Z

    .line 150
    iput-boolean v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->showSurveyProcessingOverlay:Z

    .line 159
    new-instance v0, Lcom/shopkick/app/browse/BrowseScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/browse/BrowseScreen$1;-><init>(Lcom/shopkick/app/browse/BrowseScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/browse/BrowseScreen;)Landroid/location/Location;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastBestLocation:Landroid/location/Location;

    return-object p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/browse/BrowseScreen;Landroid/location/Location;)Landroid/location/Location;
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastBestLocation:Landroid/location/Location;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/browse/BrowseScreen;)V
    .locals 0

    .line 91
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->stopPullToRefresh()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/browse/BrowseScreen;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/browse/BrowseScreen;)Lcom/shopkick/app/application/AppPreferences;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/browse/BrowseScreen;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->logDiscoveryLessonCompleteTheStepTwo()V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/app/browse/BrowseScreen;)Lcom/shopkick/app/widget/RoundImageView;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    return-object p0
.end method

.method private animatePauseIconRedDot()V
    .locals 5

    .line 1113
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1114
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/RoundImageView;->setVisibility(I)V

    .line 1115
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f010025

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1116
    new-instance v1, Lcom/shopkick/app/browse/BrowseScreen$4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/browse/BrowseScreen$4;-><init>(Lcom/shopkick/app/browse/BrowseScreen;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1131
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$p-gC76edH3vEvwWf5KCk8CE8MEU;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$p-gC76edH3vEvwWf5KCk8CE8MEU;-><init>(Lcom/shopkick/app/browse/BrowseScreen;Landroid/view/animation/Animation;)V

    const-wide/16 v3, 0x12c

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 1136
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/RoundImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private checkAndTryToUpdateSurveyTile()V
    .locals 4

    .line 334
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 335
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    const/4 v2, 0x4

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    aget-object v0, v0, v2

    check-cast v0, Ljava/lang/Integer;

    .line 337
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    aget-object v0, v0, v2

    check-cast v0, Ljava/lang/Integer;

    .line 338
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->values()[Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    move-result-object v3

    array-length v3, v3

    if-ge v0, v3, :cond_0

    .line 339
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    aget-object v1, v1, v2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/browse/BrowseScreen;->updateSurveyTile(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method private clearRows()V
    .locals 1

    .line 553
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    return-void
.end method

.method private getPreviousPageKey(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method private hideThePauseIconIfOverlayIsVisibleOnResume()V
    .locals 2

    .line 1001
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getCurrentOverlay()Lcom/shopkick/app/overlays/base/Overlay;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1003
    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/Overlay;->getSkOverlay()Lcom/shopkick/app/overlays/base/SKOverlay;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1005
    instance-of v0, v0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;

    if-eqz v0, :cond_0

    .line 1006
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIcon:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private isFTUEDiscoveryLessonInPausableState()Z
    .locals 1

    .line 1108
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonPaused()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    .line 1109
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonCompleted()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static synthetic lambda$animatePauseIconRedDot$48(Lcom/shopkick/app/browse/BrowseScreen;Landroid/view/animation/Animation;)V
    .locals 1

    .line 1132
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/RoundImageView;->clearAnimation()V

    .line 1133
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/RoundImageView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public static synthetic lambda$createTabScreen$44(Lcom/shopkick/app/browse/BrowseScreen;Landroid/view/View;)V
    .locals 1

    .line 201
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/RoundImageView;->setVisibility(I)V

    .line 202
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonPaused(Z)V

    .line 203
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueSkipAnimations(Z)V

    .line 204
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->shouldStartFTUELesson3()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 205
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->startFTUELesson3()V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$onScreenDidShow$45(Lcom/shopkick/app/browse/BrowseScreen;)V
    .locals 1

    .line 418
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    return-void
.end method

.method private logDiscoveryLessonCompleteTheStepTwo()V
    .locals 2

    .line 1087
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x62

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 1088
    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private onEventClientFlagsUpdated(Ljava/util/HashMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 781
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->isQuickKicksEnabled:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isQuickKicksWidgetEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 782
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/16 v1, 0x54

    iget-object v2, p0, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    invoke-virtual {p1, v1, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addSupportedTileType(ILcom/shopkick/app/application/ScreenGlobals;)V

    .line 783
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/16 v1, 0xfad

    iget-object v2, p0, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    invoke-virtual {p1, v1, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addSupportedTileType(ILcom/shopkick/app/application/ScreenGlobals;)V

    .line 784
    iput-boolean v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->isQuickKicksEnabled:Z

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 787
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->isInlineProgVideoEnabled:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isInlineProgrammaticVideoEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 788
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/16 v1, 0x56

    iget-object v2, p0, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    invoke-virtual {p1, v1, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addSupportedTileType(ILcom/shopkick/app/application/ScreenGlobals;)V

    .line 791
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    if-eqz p1, :cond_1

    .line 792
    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->removeModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    const/4 p1, 0x0

    .line 793
    iput-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    .line 797
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    if-nez p1, :cond_2

    .line 798
    new-instance p1, Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v2, p0, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v3, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoTopTooltip:Landroid/view/View;

    iget-object v4, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoBottomTooltip:Landroid/view/View;

    invoke-direct {p1, v1, v2, v3, v4}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;-><init>(Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/video/VideoController;Landroid/view/View;Landroid/view/View;)V

    iput-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    .line 800
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->setAdapter(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;)V

    .line 802
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 804
    iput-boolean v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->isInlineProgVideoEnabled:Z

    move p1, v0

    :cond_3
    if-eqz p1, :cond_4

    .line 808
    invoke-virtual {p0, v0}, Lcom/shopkick/app/browse/BrowseScreen;->refreshAll(Z)V

    :cond_4
    return-void
.end method

.method private onEventRequestSurveyDataFailure(Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 p1, 0x1

    .line 882
    iput-boolean p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->showSurveyErrorOnScreenDidShow:Z

    const/4 p1, 0x0

    .line 883
    iput-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    .line 885
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 886
    iput-boolean v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->showSurveyErrorOnScreenDidShow:Z

    .line 887
    invoke-direct {p0, p1}, Lcom/shopkick/app/browse/BrowseScreen;->showSurveyErrorAlert(Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)V

    :cond_0
    return-void
.end method

.method private onEventRequestSurveyDataSuccess(Ljava/util/HashMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 826
    iput-boolean v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->showSurveyErrorOnScreenDidShow:Z

    const/4 v1, 0x1

    .line 827
    iput-boolean v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->showSurveyProcessingOverlay:Z

    const/4 v2, 0x5

    .line 835
    new-array v2, v2, [Ljava/lang/Object;

    iput-object v2, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez p1, :cond_0

    .line 839
    iput-object v2, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    return-void

    :cond_0
    const-string v3, "ParamSurveyId"

    .line 844
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 845
    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 846
    iput-object v2, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    return-void

    .line 849
    :cond_1
    iget-object v4, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    aput-object v3, v4, v0

    const-string v0, "ParamSurveyUrl"

    .line 852
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 853
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 854
    iput-object v2, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    return-void

    .line 857
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    aput-object v0, v2, v1

    const-string v0, "ParamSurveyUrlCompleted"

    .line 860
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 861
    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 862
    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    const/4 v2, 0x2

    aput-object v0, v1, v2

    :cond_3
    const-string v0, "ParamSurveyUrlTerminated"

    .line 866
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 867
    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 868
    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    const/4 v2, 0x3

    aput-object v0, v1, v2

    .line 872
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->ERROR:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v0, "ParamSurveyTileNewState"

    .line 873
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_5

    .line 874
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->values()[Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_5

    .line 875
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    aput-object p1, v0, v2

    :cond_5
    return-void
.end method

.method private onEventVideoAwardRequestCompleted(Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 815
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->isActiveScreen()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 816
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    if-eqz p1, :cond_0

    .line 817
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/video/VideoRecyclerViewModule;->maybeStartVideoTile(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    goto :goto_0

    .line 818
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    if-eqz p1, :cond_1

    .line 819
    invoke-virtual {p1}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->checkAvailableVideo()V

    :cond_1
    :goto_0
    return-void
.end method

.method private refreshView()V
    .locals 2

    .line 532
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 533
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 534
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->exitFullScreen()V

    .line 538
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    if-eqz v0, :cond_1

    .line 539
    invoke-virtual {v0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->onRefreshScreen()V

    .line 542
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventLogger;->clearRecords()V

    .line 545
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->isRefreshing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 546
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 548
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->setupForRecyclerView()V

    const/4 v0, 0x1

    .line 549
    invoke-virtual {p0, v0}, Lcom/shopkick/app/browse/BrowseScreen;->fetchFeed(Z)V

    return-void
.end method

.method private renderDiscoveryV2(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 9

    .line 645
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetDiscoverScreenFeedResponse;

    .line 647
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetDiscoverScreenFeedResponse;->tiles:Ljava/util/List;

    if-eqz v0, :cond_f

    .line 649
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_f

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetDiscoverScreenFeedResponse;->subtiles:Ljava/util/List;

    if-eqz v1, :cond_f

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetDiscoverScreenFeedResponse;->subtiles:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    .line 656
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    .line 661
    invoke-direct {p0, p1}, Lcom/shopkick/app/browse/BrowseScreen;->getPreviousPageKey(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    if-nez p1, :cond_2

    .line 662
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetDiscoverScreenFeedResponse;->promoTiles:Ljava/util/List;

    if-eqz p1, :cond_1

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetDiscoverScreenFeedResponse;->promoTiles:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 663
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v2, -0xe

    .line 664
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 665
    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 666
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->promoCarouselIndex:I

    .line 667
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetDiscoverScreenFeedResponse;->promoTiles:Ljava/util/List;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/store/CarouselPromoController;->setData(Ljava/util/List;)V

    const/4 p1, 0x1

    .line 668
    iput-boolean p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->isCarouselVisible:Z

    goto :goto_0

    :cond_1
    const/high16 p1, -0x80000000

    .line 670
    iput p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->promoCarouselIndex:I

    .line 671
    iput-boolean v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->isCarouselVisible:Z

    .line 677
    :cond_2
    :goto_0
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 678
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/16 v4, 0xfab

    .line 680
    iget-object v5, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0xfad

    if-eq v4, v5, :cond_4

    const/16 v4, 0xfac

    iget-object v5, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 681
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-eq v4, v5, :cond_4

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 682
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v6, v4, :cond_3

    :cond_4
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetId:Ljava/lang/String;

    .line 683
    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_1

    .line 687
    :cond_5
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/GetDiscoverScreenFeedResponse;->subtiles:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/WidgetSubtiles;

    .line 688
    iget-object v7, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetId:Ljava/lang/String;

    iget-object v8, v5, Lcom/shopkick/app/fetchers/api/skapi/WidgetSubtiles;->widgetId:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 689
    iget-object v4, v5, Lcom/shopkick/app/fetchers/api/skapi/WidgetSubtiles;->tiles:Ljava/util/List;

    invoke-static {v3, v4}, Lcom/shopkick/app/util/TileUtils;->setSubtiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    .line 694
    :cond_7
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v6, v4, :cond_8

    .line 695
    invoke-static {v3}, Lcom/shopkick/app/util/TileUtils;->getSubtiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-static {v4}, Lcom/shopkick/app/util/TileUtils;->isAllProgramaticVideoTileCompleted(Ljava/util/ArrayList;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 696
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetId:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 698
    :cond_8
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v6, v4, :cond_3

    .line 699
    invoke-static {v3}, Lcom/shopkick/app/util/TileUtils;->getSubtiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/util/ArrayList;

    move-result-object v3

    .line 700
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x2

    if-le v4, v5, :cond_3

    .line 701
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iput-object v3, p0, Lcom/shopkick/app/browse/BrowseScreen;->ftueTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    goto/16 :goto_1

    .line 708
    :cond_9
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p2}, Lcom/shopkick/app/video/VideoController;->isInPlayableConnection()Z

    move-result p2

    .line 709
    iget-object v2, p0, Lcom/shopkick/app/browse/BrowseScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v2}, Lcom/shopkick/app/util/FeatureFlagHelper;->isInlineProgrammaticVideoEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v2

    .line 710
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 711
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_e

    .line 712
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/16 v5, 0x54

    .line 713
    iget-object v6, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v5, v6, :cond_a

    .line 714
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetId:Ljava/lang/String;

    invoke-virtual {p1, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iput-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    .line 717
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->refreshTimestamp:Ljava/lang/Long;

    if-eqz v5, :cond_d

    .line 718
    iget-object v5, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->refreshTimestamp:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/shopkick/app/application/AppPreferences;->putQuickKicksRefreshTimestampMs(J)V

    goto :goto_3

    :cond_a
    if-eqz p2, :cond_b

    if-nez v2, :cond_d

    :cond_b
    const/16 v5, 0x56

    .line 721
    iget-object v6, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 722
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v5, v6, :cond_d

    if-lez v1, :cond_c

    add-int/lit8 v5, v1, -0x1

    .line 726
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 728
    :cond_c
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_d
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 731
    :cond_e
    invoke-interface {v0, v3}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    goto :goto_5

    .line 652
    :cond_f
    :goto_4
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->NO_CONTENT:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, p3, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    const p1, 0x7f1106d6

    .line 653
    invoke-virtual {p0, p1}, Lcom/shopkick/app/browse/BrowseScreen;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p3, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->noContentMessage:Ljava/lang/String;

    .line 734
    :goto_5
    iput-object v0, p3, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    const/4 p1, 0x0

    .line 735
    iput-object p1, p3, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    .line 738
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    if-eqz p1, :cond_10

    .line 739
    invoke-virtual {p1}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->checkAvailableVideo()V

    :cond_10
    return-object p3
.end method

.method private setupForRecyclerView()V
    .locals 18

    move-object/from16 v15, p0

    .line 227
    iget-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    if-eqz v0, :cond_0

    return-void

    .line 231
    :cond_0
    iget-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isQuickKicksWidgetEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    iput-boolean v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->isQuickKicksEnabled:Z

    .line 232
    iget-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isInlineProgrammaticVideoEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    iput-boolean v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->isInlineProgVideoEnabled:Z

    .line 233
    iget-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Lcom/shopkick/app/view/SKRecyclerView/SlowSmoothScrollingLinearLayoutManager;

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/browse/BrowseScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SlowSmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 235
    new-instance v5, Ljava/util/HashSet;

    const/16 v0, 0xd

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x3

    .line 236
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v14, 0x0

    aput-object v2, v0, v14

    const/4 v2, 0x1

    const/16 v3, 0xb

    .line 237
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v0, v2

    const/4 v2, 0x2

    const/16 v4, 0x1c

    .line 238
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v0, v2

    const/16 v2, 0x3ed

    .line 239
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const/16 v2, 0x3f6

    .line 240
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const/16 v2, 0x2d

    .line 241
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const/16 v2, 0x4a

    .line 242
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const/16 v2, 0xfab

    .line 243
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const/16 v2, 0xfac

    .line 244
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const/16 v13, -0xe

    .line 245
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const/4 v2, -0x1

    .line 246
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, -0x2

    .line 247
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    const/16 v1, 0xc

    const/16 v2, -0xd

    .line 248
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 235
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 251
    iget-boolean v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->isQuickKicksEnabled:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x54

    .line 252
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v0, 0xfad

    .line 253
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 256
    :cond_1
    iget-boolean v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->isInlineProgVideoEnabled:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x56

    .line 257
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 258
    new-instance v0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    iget-object v1, v15, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v2, v15, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v3, v15, Lcom/shopkick/app/browse/BrowseScreen;->videoTopTooltip:Landroid/view/View;

    iget-object v4, v15, Lcom/shopkick/app/browse/BrowseScreen;->videoBottomTooltip:Landroid/view/View;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;-><init>(Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/video/VideoController;Landroid/view/View;Landroid/view/View;)V

    iput-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    goto :goto_0

    .line 262
    :cond_2
    new-instance v0, Lcom/shopkick/app/video/VideoRecyclerViewModule;

    iget-object v1, v15, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 263
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/browse/BrowseScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v1, v2, v14}, Lcom/shopkick/app/video/VideoRecyclerViewModule;-><init>(Lcom/shopkick/app/video/VideoController;Landroid/content/Context;I)V

    iput-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    .line 267
    :goto_0
    new-instance v7, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v1, v15, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v4, v15, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v6, 0x0

    move-object v0, v7

    move-object/from16 v2, p0

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object v7, v15, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 273
    iget-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0, v15}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->setDividerItemDecorationRule(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;)V

    .line 275
    new-instance v12, Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/browse/BrowseScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 276
    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getRecyclerViewImageController()Lcom/shopkick/app/controllers/RecyclerViewImageController;

    move-result-object v2

    iget-object v3, v15, Lcom/shopkick/app/browse/BrowseScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 278
    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v4

    iget-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 279
    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getUserEventRecyclerViewCoordinator()Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;

    move-result-object v5

    iget-object v6, v15, Lcom/shopkick/app/browse/BrowseScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, v0, Lcom/shopkick/app/application/ScreenGlobals;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v8, v0, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v9, v15, Lcom/shopkick/app/browse/BrowseScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v10, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v11, v0, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v0, v15, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v13, v15, Lcom/shopkick/app/browse/BrowseScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v13, v13, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v14, v15, Lcom/shopkick/app/browse/BrowseScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    move-object/from16 v16, v0

    move-object v0, v12

    move-object/from16 v17, v12

    move-object/from16 v12, v16

    move-object/from16 v15, p0

    invoke-direct/range {v0 .. v15}, Lcom/shopkick/app/store/CarouselPromoController;-><init>(Landroid/content/Context;Lcom/shopkick/app/controllers/RecyclerViewImageController;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/screens/AppScreen;)V

    move-object/from16 v1, v17

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/shopkick/app/browse/BrowseScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    .line 290
    iget-object v1, v0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/16 v2, -0xe

    invoke-virtual {v1, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;

    .line 292
    iget-object v2, v0, Lcom/shopkick/app/browse/BrowseScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;->setCarouselPromoController(Lcom/shopkick/app/store/CarouselPromoController;)V

    .line 294
    iget-object v1, v0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v2, v0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 295
    iget-object v1, v0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v2, v0, Lcom/shopkick/app/browse/BrowseScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 296
    iget-object v1, v0, Lcom/shopkick/app/browse/BrowseScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    if-eqz v1, :cond_3

    .line 297
    iget-object v2, v0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 299
    :cond_3
    iget-object v1, v0, Lcom/shopkick/app/browse/BrowseScreen;->inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    if-eqz v1, :cond_4

    .line 300
    iget-object v2, v0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 301
    iget-object v1, v0, Lcom/shopkick/app/browse/BrowseScreen;->inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    iget-object v2, v0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->setAdapter(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;)V

    .line 303
    :cond_4
    iget-object v1, v0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 304
    iget-object v1, v0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    return-void
.end method

.method private showSurveyErrorAlert(Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)V
    .locals 8

    .line 458
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 461
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const v0, 0x7f110157

    .line 463
    invoke-virtual {p0, v0}, Lcom/shopkick/app/browse/BrowseScreen;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v0, 0x7f11014f

    .line 464
    invoke-virtual {p0, v0}, Lcom/shopkick/app/browse/BrowseScreen;->getString(I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/shopkick/app/browse/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/browse/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    move-object v7, p1

    .line 461
    invoke-virtual/range {v1 .. v7}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method

.method private updateSurveyTile(Ljava/lang/String;I)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 453
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/16 v1, 0xfad

    invoke-virtual {v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;

    .line 454
    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->updateSurveyTileStatus(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public createTabScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const/4 p3, 0x0

    const v0, 0x7f0c003a

    .line 191
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090628

    .line 193
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const p2, 0x7f0900a0

    .line 194
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const p2, 0x7f0900a1

    .line 195
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewOverlay:Landroid/view/View;

    const p2, 0x7f090574

    .line 196
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    const p2, 0x7f09080c

    .line 197
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoTopTooltip:Landroid/view/View;

    const p2, 0x7f0907fc

    .line 198
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoBottomTooltip:Landroid/view/View;

    const p2, 0x7f09050d

    .line 199
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RelativeLayout;

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIcon:Landroid/widget/RelativeLayout;

    .line 200
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIcon:Landroid/widget/RelativeLayout;

    new-instance v0, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$E58QTjTsJftvQvpI1MHHv25gX-E;

    invoke-direct {v0, p0}, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$E58QTjTsJftvQvpI1MHHv25gX-E;-><init>(Lcom/shopkick/app/browse/BrowseScreen;)V

    invoke-virtual {p2, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09050f

    .line 208
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/RoundImageView;

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    .line 210
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {p2, p3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 211
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->setupForRecyclerView()V

    .line 213
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "ClientFlagsUpdated"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 214
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "UserAccountIdChangedEvent"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 215
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "EventVideoAwardRequestCompleted"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 216
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "EventRequestSurveySuccess"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 217
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "EventRequestSurveyError"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 219
    new-instance p2, Lcom/shopkick/app/permissions/PermissionsRequestController;

    iget-object p3, p0, Lcom/shopkick/app/browse/BrowseScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {p2, p0, p3}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 220
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string p3, "android.permission.ACCESS_COARSE_LOCATION"

    const v0, 0x7f090443

    .line 221
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 220
    invoke-virtual {p2, p3, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    return-object p1
.end method

.method public fetchFeed(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 503
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->tryRefreshWithoutClear()V

    :cond_0
    return-void
.end method

.method public fetchNextPage()V
    .locals 1

    const/4 v0, 0x0

    .line 497
    invoke-virtual {p0, v0}, Lcom/shopkick/app/browse/BrowseScreen;->fetchFeed(Z)V

    return-void
.end method

.method public ftueQuickVideoProcessed()V
    .locals 5

    .line 1047
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 1048
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 1049
    new-instance v2, Lcom/shopkick/app/browse/BrowseScreen$3;

    invoke-direct {v2, p0, v1}, Lcom/shopkick/app/browse/BrowseScreen$3;-><init>(Lcom/shopkick/app/browse/BrowseScreen;Landroid/os/Handler;)V

    const-wide/16 v3, 0x64

    .line 1062
    invoke-virtual {v0, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public getIsCarouselVisible()Z
    .locals 1

    .line 1043
    iget-boolean v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->isCarouselVisible:Z

    return v0
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 2

    .line 562
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastBestLocation:Landroid/location/Location;

    if-nez p1, :cond_0

    .line 563
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastBestLocation:Landroid/location/Location;

    .line 566
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastBestLocation:Landroid/location/Location;

    if-eqz p1, :cond_1

    .line 567
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/GetDiscoverScreenFeedRequest;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/GetDiscoverScreenFeedRequest;-><init>()V

    .line 568
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastBestLocation:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetDiscoverScreenFeedRequest;->latitude:Ljava/lang/Double;

    .line 569
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastBestLocation:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetDiscoverScreenFeedRequest;->longitude:Ljava/lang/Double;

    return-object p1

    .line 574
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    if-eqz p1, :cond_2

    const-string p1, "android.permission.ACCESS_COARSE_LOCATION"

    .line 576
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 575
    invoke-static {p1, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 577
    :cond_2
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    .line 578
    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 579
    invoke-virtual {p1, v0}, Lcom/shopkick/sdk/presence/LocationManager;->initiateLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public getPauseIcon()Landroid/widget/RelativeLayout;
    .locals 1

    .line 1104
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIcon:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public getPullToRefreshOffset()I
    .locals 1

    const/16 v0, 0x6e

    return v0
.end method

.method public initTabScreen(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 177
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 178
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 179
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    .line 180
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 181
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 182
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 183
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iput-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 185
    new-instance p1, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-direct {p1}, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    .line 186
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/logging/UserEventLogger;->addUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    return-void
.end method

.method public isFTUEQuickVideoStartedByTapIndicator()Z
    .locals 1

    .line 1079
    iget-boolean v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->ftueQuickVideoStartedByTapIndicator:Z

    return v0
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 314
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    if-eqz v0, :cond_0

    .line 315
    invoke-virtual {v0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->destroy()V

    .line 317
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->destroy()V

    .line 318
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 319
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->cancelLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 321
    invoke-super {p0}, Lcom/shopkick/app/tabs/TabScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
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

    .line 751
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "EventRequestSurveyError"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_1

    :sswitch_1
    const-string v0, "UserAccountIdChangedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "ClientFlagsUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :sswitch_3
    const-string v0, "EventVideoAwardRequestCompleted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_4
    const-string v0, "EventRequestSurveySuccess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 772
    :pswitch_0
    invoke-direct {p0, p2}, Lcom/shopkick/app/browse/BrowseScreen;->onEventRequestSurveyDataFailure(Ljava/util/HashMap;)V

    goto :goto_2

    .line 767
    :pswitch_1
    invoke-direct {p0, p2}, Lcom/shopkick/app/browse/BrowseScreen;->onEventRequestSurveyDataSuccess(Ljava/util/HashMap;)V

    goto :goto_2

    .line 761
    :pswitch_2
    invoke-direct {p0, p2}, Lcom/shopkick/app/browse/BrowseScreen;->onEventVideoAwardRequestCompleted(Ljava/util/HashMap;)V

    goto :goto_2

    :pswitch_3
    const/4 p1, 0x0

    .line 757
    iput-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    goto :goto_2

    .line 753
    :pswitch_4
    invoke-direct {p0, p2}, Lcom/shopkick/app/browse/BrowseScreen;->onEventClientFlagsUpdated(Ljava/util/HashMap;)V

    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7480156c -> :sswitch_4
        -0x6bae06a8 -> :sswitch_3
        -0x4b45e041 -> :sswitch_2
        0x44e6563 -> :sswitch_1
        0x61aaecd9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    .line 909
    iget p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->promoCarouselIndex:I

    if-ne p3, p1, :cond_0

    .line 910
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual {p1}, Lcom/shopkick/app/store/CarouselPromoController;->markVisible()V

    :cond_0
    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    .line 916
    iget p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->promoCarouselIndex:I

    if-ne p3, p1, :cond_0

    .line 917
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual {p1}, Lcom/shopkick/app/store/CarouselPromoController;->markNotVisible()V

    :cond_0
    return-void
.end method

.method public onOverlayDismissed(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 3

    .line 1018
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p2}, Lcom/shopkick/app/util/FeatureFlagHelper;->isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    .line 1019
    invoke-virtual {p0, p2}, Lcom/shopkick/app/browse/BrowseScreen;->setTabLayoutVisibility(I)V

    const/16 v0, 0x8

    .line 1020
    invoke-virtual {p0, v0}, Lcom/shopkick/app/browse/BrowseScreen;->setRecyclerViewOverlayVisibility(I)V

    .line 1021
    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonCompleted()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 1022
    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->ftueTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1023
    invoke-static {v1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1024
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIcon:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1025
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->animatePauseIconRedDot()V

    .line 1026
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p2, v2}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonPaused(Z)V

    goto :goto_0

    .line 1028
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIcon:Landroid/widget/RelativeLayout;

    invoke-virtual {p2, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1030
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->ftueTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {p2}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    .line 1031
    invoke-virtual {p2}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage1Completed()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    .line 1032
    invoke-virtual {p2}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage2Completed()Z

    move-result p2

    if-nez p2, :cond_1

    .line 1033
    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->tapToDismiss:Ljava/lang/Boolean;

    .line 1034
    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 1035
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->ftueTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 1036
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->enterFullScreen()V

    .line 1037
    iput-boolean v2, p0, Lcom/shopkick/app/browse/BrowseScreen;->ftueQuickVideoStartedByTapIndicator:Z

    :cond_1
    return-void
.end method

.method public onOverlayShown(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 0

    return-void
.end method

.method public onRefreshSelected()V
    .locals 0

    .line 493
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->refreshFeed()V

    return-void
.end method

.method public onScreenDidHide()V
    .locals 2

    .line 472
    invoke-super {p0}, Lcom/shopkick/app/tabs/TabScreen;->onScreenDidHide()V

    .line 473
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->pauseVideo()V

    .line 474
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoController;->setVideoShowing(Z)V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 8

    .line 345
    invoke-super {p0}, Lcom/shopkick/app/tabs/TabScreen;->onScreenDidShow()V

    .line 351
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    .line 352
    invoke-virtual {p0, v2}, Lcom/shopkick/app/browse/BrowseScreen;->refreshAll(Z)V

    goto :goto_0

    .line 353
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const-wide/32 v6, 0xdbba0

    add-long/2addr v4, v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-gez v0, :cond_1

    .line 354
    invoke-virtual {p0, v2}, Lcom/shopkick/app/browse/BrowseScreen;->refreshAll(Z)V

    .line 355
    iput-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    goto :goto_0

    .line 356
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->categoryIdFromSetParams:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 357
    invoke-virtual {p0, v3}, Lcom/shopkick/app/browse/BrowseScreen;->refreshAll(Z)V

    .line 358
    iput-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    goto :goto_0

    .line 360
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    if-eqz v0, :cond_3

    .line 361
    iget-object v4, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/video/VideoRecyclerViewModule;->maybeStartVideoTile(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    goto :goto_0

    .line 362
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    if-eqz v0, :cond_5

    .line 364
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->isVideoOnProcessingAward()Z

    move-result v0

    if-nez v0, :cond_4

    .line 365
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/16 v4, 0x56

    invoke-virtual {v0, v4}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesOfType(I)V

    .line 367
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/video/VideoController;->setVideoShowing(Z)V

    .line 368
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->inlineProgrammaticVideoController:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->checkAvailableVideo()V

    .line 378
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    if-eqz v0, :cond_8

    aget-object v4, v0, v3

    if-eqz v4, :cond_8

    aget-object v4, v0, v2

    if-eqz v4, :cond_8

    const/4 v4, 0x2

    .line 382
    aget-object v0, v0, v4

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 383
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    const-string v5, ""

    aput-object v5, v0, v4

    .line 386
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    const/4 v5, 0x3

    aget-object v0, v0, v5

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 387
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    const-string v6, ""

    aput-object v6, v0, v5

    .line 390
    :cond_7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v6, "url"

    .line 391
    iget-object v7, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    aget-object v7, v7, v2

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "header_title"

    const v7, 0x7f1101af

    .line 392
    invoke-virtual {p0, v7}, Lcom/shopkick/app/browse/BrowseScreen;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v6, "surveyId"

    .line 393
    iget-object v7, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    aget-object v7, v7, v3

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v6, "surveyUrl"

    .line 394
    iget-object v7, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    aget-object v2, v7, v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "completedUrl"

    .line 395
    iget-object v6, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    aget-object v4, v6, v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v2, "terminatedUrl"

    .line 396
    iget-object v4, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    aget-object v4, v4, v5

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    new-instance v2, Lcom/shopkick/app/activities/PageIdentifierV2;

    .line 399
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;

    invoke-direct {v2, v4, v5, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 405
    iput-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->surveyParams:[Ljava/lang/Object;

    .line 407
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 409
    invoke-virtual {v0, v2}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    goto :goto_1

    .line 413
    :cond_8
    iget-boolean v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->showSurveyErrorOnScreenDidShow:Z

    if-eqz v0, :cond_9

    .line 414
    iput-boolean v3, p0, Lcom/shopkick/app/browse/BrowseScreen;->showSurveyErrorOnScreenDidShow:Z

    .line 418
    new-instance v0, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$kndoMSS6FSkQq1XPvygBTYxbJH4;

    invoke-direct {v0, p0}, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$kndoMSS6FSkQq1XPvygBTYxbJH4;-><init>(Lcom/shopkick/app/browse/BrowseScreen;)V

    invoke-direct {p0, v0}, Lcom/shopkick/app/browse/BrowseScreen;->showSurveyErrorAlert(Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)V

    goto :goto_1

    .line 420
    :cond_9
    iget-boolean v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->showSurveyProcessingOverlay:Z

    if-eqz v0, :cond_a

    .line 421
    iput-boolean v3, p0, Lcom/shopkick/app/browse/BrowseScreen;->showSurveyProcessingOverlay:Z

    .line 422
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    .line 423
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 424
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    goto :goto_1

    .line 426
    :cond_a
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    .line 430
    :cond_b
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 431
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonCompleted()Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    .line 432
    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 433
    invoke-virtual {p0, v3}, Lcom/shopkick/app/browse/BrowseScreen;->setRecyclerViewOverlayVisibility(I)V

    .line 435
    :cond_c
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->isFTUEDiscoveryLessonInPausableState()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 436
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 437
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->isFTUEQuickVideoStartedByTapIndicator()Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->ftueTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 438
    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 439
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIcon:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 440
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->animatePauseIconRedDot()V

    goto :goto_2

    .line 443
    :cond_d
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->shouldStartFTUELesson3()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 444
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->startFTUELesson3()V

    .line 447
    :cond_e
    :goto_2
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->hideThePauseIconIfOverlayIsVisibleOnResume()V

    :cond_f
    return-void
.end method

.method public onScreenWillShow()V
    .locals 0

    .line 326
    invoke-super {p0}, Lcom/shopkick/app/tabs/TabScreen;->onScreenWillShow()V

    .line 328
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->checkAndTryToUpdateSurveyTile()V

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 5

    .line 587
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->stopPullToRefresh()V

    .line 588
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 589
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 590
    sget-object v2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 593
    iget-object v2, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    const-wide/16 v3, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/shopkick/app/application/AppPreferences;->putQuickKicksRefreshTimestampMs(J)V

    .line 595
    iget-boolean v2, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget-object v2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v2, :cond_3

    .line 596
    invoke-direct {p0, p1}, Lcom/shopkick/app/browse/BrowseScreen;->getPreviousPageKey(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    .line 597
    sget-object v2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 600
    :cond_0
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/browse/BrowseScreen;->renderDiscoveryV2(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    move-result-object v0

    .line 601
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 602
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->shouldStartFTUELesson3()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 603
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->startFTUELesson3()V

    goto :goto_2

    .line 605
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->isFTUEDiscoveryLessonInPausableState()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->ftueTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 606
    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 607
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->pauseIcon:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 608
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->animatePauseIconRedDot()V

    .line 610
    :cond_2
    invoke-virtual {p0, v3}, Lcom/shopkick/app/browse/BrowseScreen;->setTabLayoutVisibility(I)V

    .line 611
    invoke-virtual {p0, v1}, Lcom/shopkick/app/browse/BrowseScreen;->setRecyclerViewOverlayVisibility(I)V

    goto :goto_2

    :cond_3
    const/high16 v1, -0x80000000

    .line 615
    iput v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->promoCarouselIndex:I

    .line 616
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->disableScreenResponsivenessLogging()V

    .line 617
    invoke-direct {p0, p1}, Lcom/shopkick/app/browse/BrowseScreen;->getPreviousPageKey(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    .line 619
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 620
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/shopkick/app/store/CarouselPromoController;->setData(Ljava/util/List;)V

    .line 621
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-static {p1, v1}, Lcom/shopkick/app/util/TileUtils;->addOfflinePromoTileToFeed(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Lcom/shopkick/app/store/CarouselPromoController;)V

    goto :goto_0

    .line 623
    :cond_4
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 625
    :goto_0
    iput-boolean v3, p0, Lcom/shopkick/app/browse/BrowseScreen;->isCarouselVisible:Z

    .line 627
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 628
    iget p2, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v1, 0x2

    if-ne p2, v1, :cond_5

    const p2, 0x46cd1

    .line 629
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    goto :goto_1

    .line 631
    :cond_5
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f110142

    invoke-virtual {p0, v1}, Lcom/shopkick/app/browse/BrowseScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    const p2, 0x46cd4

    .line 632
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 634
    :goto_1
    iget-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    :cond_6
    :goto_2
    return-object v0
.end method

.method public refreshAll(Z)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 519
    iput-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->categoryIdFromSetParams:Ljava/lang/String;

    .line 524
    :cond_0
    iput-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastBestLocation:Landroid/location/Location;

    .line 526
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->clearRows()V

    .line 527
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->refreshView()V

    return-void
.end method

.method public refreshFeed()V
    .locals 1

    const/4 v0, 0x0

    .line 511
    iput-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastBestLocation:Landroid/location/Location;

    .line 513
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->refreshView()V

    return-void
.end method

.method public resumeDiscoverLessonIfIsFTUEQuickVideo(Ljava/lang/String;)V
    .locals 1

    .line 1066
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->ftueTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    .line 1067
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1068
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->isFTUEDiscoveryLessonInPausableState()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1069
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage3Completed()Z

    move-result p1

    if-nez p1, :cond_0

    .line 1070
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonStage2Completed(Z)V

    .line 1071
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonPaused(Z)V

    .line 1072
    invoke-direct {p0}, Lcom/shopkick/app/browse/BrowseScreen;->logDiscoveryLessonCompleteTheStepTwo()V

    .line 1073
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->startFTUELesson3()V

    :cond_0
    return-void
.end method

.method public setDecorationRule(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 931
    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getDividerItemDecoration()Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    move-result-object p1

    .line 932
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->clearRule()V

    const/4 v0, 0x0

    move v1, v0

    .line 934
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 935
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 936
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x56

    if-eq v2, v3, :cond_0

    packed-switch v2, :pswitch_data_0

    .line 945
    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    invoke-direct {v2, v1, v0}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    goto :goto_1

    .line 941
    :cond_0
    :pswitch_0
    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    const/16 v3, 0x8

    invoke-direct {v2, v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xfab
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public setFTUEQuickVideoStartedByTapIndicator(Z)V
    .locals 0

    .line 1083
    iput-boolean p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->ftueQuickVideoStartedByTapIndicator:Z

    return-void
.end method

.method public setParams(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 479
    invoke-super {p0, p1}, Lcom/shopkick/app/tabs/TabScreen;->setParams(Ljava/util/Map;)V

    const-string v0, "category_id"

    .line 480
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen;->categoryIdFromSetParams:Ljava/lang/String;

    .line 488
    invoke-virtual {p0}, Lcom/shopkick/app/browse/BrowseScreen;->getParams()Ljava/util/Map;

    move-result-object p1

    const-string v0, "category_id"

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setRecyclerViewOverlayVisibility(I)V
    .locals 1

    .line 1100
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerViewOverlay:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public setTabLayoutVisibility(I)V
    .locals 1

    .line 1092
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1093
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/activities/HomeActivity;

    if-eqz v0, :cond_0

    .line 1094
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/HomeActivity;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/HomeActivity;->getTabLayout()Landroid/support/design/widget/TabLayout;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/design/widget/TabLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public shouldStartFTUELesson3()Z
    .locals 1

    .line 954
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    .line 955
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueEarnLessonCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    .line 956
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonCompleted()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    .line 957
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueIsNewAccount()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->appPref:Lcom/shopkick/app/application/AppPreferences;

    .line 958
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonPaused()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    .line 959
    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->ftueTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 960
    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public smoothScrollToPositionZero()V
    .locals 4

    .line 964
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/browse/BrowseScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v2, Landroid/support/v7/widget/RecyclerView$State;

    invoke-direct {v2}, Landroid/support/v7/widget/RecyclerView$State;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->smoothScrollToPosition(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;I)V

    return-void
.end method

.method public startFTUELesson3()V
    .locals 5

    .line 969
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 970
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 971
    new-instance v2, Lcom/shopkick/app/browse/BrowseScreen$2;

    invoke-direct {v2, p0, v1}, Lcom/shopkick/app/browse/BrowseScreen$2;-><init>(Lcom/shopkick/app/browse/BrowseScreen;Landroid/os/Handler;)V

    const-wide/16 v3, 0x64

    .line 997
    invoke-virtual {v0, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method
