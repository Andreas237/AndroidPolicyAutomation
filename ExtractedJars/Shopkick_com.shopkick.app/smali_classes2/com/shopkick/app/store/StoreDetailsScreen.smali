.class public Lcom/shopkick/app/store/StoreDetailsScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "StoreDetailsScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;
.implements Lcom/shopkick/app/overlays/interfaces/IOverlayListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;,
        Lcom/shopkick/app/store/StoreDetailsScreen$FadingAnimationListener;
    }
.end annotation


# static fields
.field private static final ANIMATION_POPUP_DELAY:I = 0x12c

.field public static final BBY_CHAIN_ID:Ljava/lang/String; = "40560331"

.field private static final COLUMN_COUNT:I = 0x2

.field private static final FADE_IN_DURATION:I = 0x1f4

.field private static final INITIAL_TOOLTIP_DELAY:I = 0x1f4

.field public static final OVERLAY_ENTER_SCREEN_DELAY:I = 0x64

.field public static final OVERLAY_START_DELAY:I = 0x3e8

.field private static final TOOLTIP_CIRCLE_DELAY:I = 0xc8

.field private static final TOOLTIP_FADE_IN_DURATION:I = 0x12c

.field private static final TOOLTIP_ICON_FADE_DURATION:I = 0xc8

.field private static final TOOLTIP_ICON_MAX_OPACITY:F = 1.0f

.field private static final TOOLTIP_ICON_MIN_OPACITY:F = 0.0f

.field private static final TOOLTIP_KICKS_TYPE_FADE_INTERVAL:I = 0x3e8

.field private static final TOOLTIP_KICKS_TYPE_INITIAL_DELAY:I = 0x76c

.field private static final TOOLTIP_KICK_TYPE_LABEL_FADE_DELAY:I = 0xc8

.field private static final TOOLTIP_KICK_TYPE_LABEL_FADE_DURATION:I = 0xc8

.field private static final TOOLTIP_MESSAGE_DELAY:I = 0x1f4

.field private static final VIDEO_OTT_POSITION_IN_ADAPTER:I = 0x0

.field private static final VIDEO_OTT_TIP_HEIGHT_DIP:I = 0x28

.field public static final WIDGET_LATITUDE:Ljava/lang/String; = "WIDGET_LATITUDE"

.field public static final WIDGET_LONGITUDE:Ljava/lang/String; = "WIDGET_LONGITUDE"


# instance fields
.field private animatingTooltip:Z

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private bbyLimitView:Landroid/support/constraint/ConstraintLayout;

.field private chainId:Ljava/lang/String;

.field private chainName:Ljava/lang/String;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private disableTooltipAndError:Z

.field private isFTUEEnabled:Z

.field private isOnlineStore:Z

.field private isVideoOTTFinished:Z

.field private isWalkin:Ljava/lang/Boolean;

.field private kicksEarnedToday:Ljava/lang/String;

.field private locationId:Ljava/lang/String;

.field private locationName:Ljava/lang/String;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private mainView:Landroid/view/ViewGroup;

.field private maybeStartReceiptPulseAnimation:Z

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private overlayTooltipView:Landroid/view/View;

.field private pauseIcon:Landroid/support/constraint/ConstraintLayout;

.field private pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

.field private progressBar:Landroid/view/View;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private request:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;

.field private response:Lcom/shopkick/fetchers/DataResponse;

.field private retailerReceiptToolTipText:Ljava/lang/String;

.field private scanKicksAvailable:I

.field private shouldInvalidateOfflineScanTiles:Z

.field private shouldRefresh:Z

.field private storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

.field private toolTipView:Lcom/shopkick/app/widget/ToolTipView;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field private userScanCount:I

.field private userWalkinCount:I

.field private videoOTTTipView:Landroid/widget/TextView;

.field private walkinKicksAvailable:I

.field private widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

.field private widgetRequestLatitude:Ljava/lang/Double;

.field private widgetRequestLongitude:Ljava/lang/Double;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 92
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 137
    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isWalkin:Ljava/lang/Boolean;

    .line 171
    new-instance v0, Lcom/shopkick/app/store/StoreDetailsScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/StoreDetailsScreen$1;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/store/StoreDetailsScreen;)Lcom/shopkick/app/store/StoreDetailsAdapter;
    .locals 0

    .line 92
    iget-object p0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/store/StoreDetailsScreen;)Landroid/view/View;
    .locals 0

    .line 92
    iget-object p0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->progressBar:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/shopkick/app/store/StoreDetailsScreen;)I
    .locals 0

    .line 92
    iget p0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userWalkinCount:I

    return p0
.end method

.method static synthetic access$1100(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->dismissTooltips(Ljava/lang/Integer;)V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/store/StoreDetailsScreen;)Lcom/shopkick/app/application/AppPreferences;
    .locals 0

    .line 92
    iget-object p0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    return-object p0
.end method

.method static synthetic access$302(Lcom/shopkick/app/store/StoreDetailsScreen;Lcom/shopkick/app/widget/ToolTipView;)Lcom/shopkick/app/widget/ToolTipView;
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    return-object p1
.end method

.method static synthetic access$400(Lcom/shopkick/app/store/StoreDetailsScreen;)Lcom/shopkick/app/widget/RoundImageView;
    .locals 0

    .line 92
    iget-object p0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/store/StoreDetailsScreen;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->finishAnimating()V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/app/store/StoreDetailsScreen;)Ljava/lang/String;
    .locals 0

    .line 92
    iget-object p0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/store/StoreDetailsScreen;)I
    .locals 0

    .line 92
    iget p0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->scanKicksAvailable:I

    return p0
.end method

.method static synthetic access$800(Lcom/shopkick/app/store/StoreDetailsScreen;)I
    .locals 0

    .line 92
    iget p0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->walkinKicksAvailable:I

    return p0
.end method

.method static synthetic access$900(Lcom/shopkick/app/store/StoreDetailsScreen;)I
    .locals 0

    .line 92
    iget p0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userScanCount:I

    return p0
.end method

.method private animateKicksView(IIII)V
    .locals 3

    .line 1373
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0xc8

    .line 1374
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    int-to-long v1, p4

    .line 1375
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setStartOffset(J)V

    .line 1376
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 v1, 0x0

    .line 1377
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1378
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    add-int/lit16 p1, p4, 0xc8

    const/16 v0, 0xc8

    .line 1380
    invoke-direct {p0, p2, v0, p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    .line 1382
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    const/4 v0, 0x0

    .line 1383
    invoke-static {p1, p4, p2, p3, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->animatePulseGlowOnView(Landroid/view/View;IDLandroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AnimationSet;

    return-void
.end method

.method private animateOnlineTooltip()V
    .locals 6

    const/16 v0, 0x1f4

    const v1, 0x7f0906eb

    const/16 v2, 0x12c

    .line 1123
    invoke-direct {p0, v1, v2, v0}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    const/16 v1, 0x3e8

    const v2, 0x7f090777

    .line 1125
    invoke-direct {p0, v2, v0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    const/16 v2, 0x4b0

    const v3, 0x7f09078b

    .line 1127
    invoke-direct {p0, v3, v0, v2}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    .line 1128
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v3}, Lcom/shopkick/app/util/FeatureFlagHelper;->isOnlineOffersEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v3

    if-eqz v3, :cond_0

    const v3, 0x7f09077a

    .line 1129
    invoke-direct {p0, v3, v0, v2}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    :cond_0
    const v3, 0x7f09077e

    .line 1131
    invoke-direct {p0, v3, v0, v2}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    const/16 v2, 0xc1c

    const v3, 0x7f09078a

    const v4, 0x7f09078c

    const v5, 0x7f090789

    .line 1134
    invoke-direct {p0, v3, v4, v5, v2}, Lcom/shopkick/app/store/StoreDetailsScreen;->animateKicksView(IIII)V

    const/16 v2, 0x1004

    .line 1140
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v3}, Lcom/shopkick/app/util/FeatureFlagHelper;->isOnlineOffersEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v3

    if-eqz v3, :cond_1

    const v3, 0x7f090779

    const v4, 0x7f09077b

    const v5, 0x7f090778

    .line 1141
    invoke-direct {p0, v3, v4, v5, v2}, Lcom/shopkick/app/store/StoreDetailsScreen;->animateKicksView(IIII)V

    const/16 v2, 0x13ec

    :cond_1
    const v3, 0x7f09077d

    const v4, 0x7f09077f

    const v5, 0x7f09077c

    .line 1148
    invoke-direct {p0, v3, v4, v5, v2}, Lcom/shopkick/app/store/StoreDetailsScreen;->animateKicksView(IIII)V

    add-int/2addr v2, v1

    const v1, 0x7f090774

    .line 1154
    invoke-direct {p0, v1, v0, v2}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    const v1, 0x7f090788

    const/4 v3, 0x1

    .line 1155
    invoke-direct {p0, v1, v0, v2, v3}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(IIIZ)V

    return-void
.end method

.method private animatePauseIconRedDot()V
    .locals 5

    .line 1313
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1314
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/RoundImageView;->setVisibility(I)V

    .line 1315
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f010025

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1316
    new-instance v1, Lcom/shopkick/app/store/StoreDetailsScreen$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/store/StoreDetailsScreen$3;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1333
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/shopkick/app/store/-$$Lambda$StoreDetailsScreen$ERnxIwppngRF-AuqmUxqVI_5-Eo;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/store/-$$Lambda$StoreDetailsScreen$ERnxIwppngRF-AuqmUxqVI_5-Eo;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Landroid/view/animation/Animation;)V

    const-wide/16 v3, 0x12c

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 1338
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/RoundImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private animateTooltip()V
    .locals 6

    const/16 v0, 0x1f4

    const v1, 0x7f0906eb

    const/16 v2, 0x12c

    .line 997
    invoke-direct {p0, v1, v2, v0}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    const/16 v1, 0x3e8

    const v2, 0x7f090777

    .line 999
    invoke-direct {p0, v2, v0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    const/16 v1, 0x4b0

    const v2, 0x7f090792

    .line 1001
    invoke-direct {p0, v2, v0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    const v2, 0x7f090786

    .line 1002
    invoke-direct {p0, v2, v0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    .line 1003
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideStoreDetailsReceiptKicksSummary:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_0

    const v2, 0x7f090782

    .line 1004
    invoke-direct {p0, v2, v0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    .line 1006
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableKicksForRetailerReceipts:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1

    const v2, 0x7f09077e

    .line 1007
    invoke-direct {p0, v2, v0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    :cond_1
    const/16 v1, 0xc1c

    const v2, 0x7f090791

    const v3, 0x7f090793

    const v4, 0x7f090790

    .line 1011
    invoke-direct {p0, v2, v3, v4, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->animateKicksView(IIII)V

    const/16 v1, 0x1004

    const v2, 0x7f090785

    const v3, 0x7f090787

    const v4, 0x7f090784

    .line 1013
    invoke-direct {p0, v2, v3, v4, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->animateKicksView(IIII)V

    const/16 v1, 0x13ec

    .line 1016
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideStoreDetailsReceiptKicksSummary:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_2

    const v2, 0x7f090781

    const v3, 0x7f090783

    const v4, 0x7f090780

    .line 1018
    invoke-direct {p0, v2, v3, v4, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->animateKicksView(IIII)V

    const/16 v1, 0x17d4

    .line 1025
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    const v2, 0x7f09077d

    const v4, 0x7f09077f

    const v5, 0x7f09077c

    .line 1026
    invoke-direct {p0, v2, v4, v5, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->animateKicksView(IIII)V

    add-int/lit16 v1, v1, 0x3e8

    :cond_3
    const v2, 0x7f090774

    .line 1033
    invoke-direct {p0, v2, v0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(III)V

    const v2, 0x7f090788

    .line 1034
    invoke-direct {p0, v2, v0, v1, v3}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(IIIZ)V

    return-void
.end method

.method private cancelOnlineTooltipAnimations()V
    .locals 3

    const/16 v0, 0xc

    .line 1159
    new-array v0, v0, [Ljava/lang/Integer;

    const v1, 0x7f09078a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const v1, 0x7f090789

    .line 1160
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const v1, 0x7f09078c

    .line 1161
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const v1, 0x7f090779

    .line 1162
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const v1, 0x7f090778

    .line 1163
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const v1, 0x7f09077b

    .line 1164
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const v1, 0x7f09077d

    .line 1165
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const v1, 0x7f09077c

    .line 1166
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const v1, 0x7f09077f

    .line 1167
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const v1, 0x7f09077e

    .line 1168
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const v1, 0x7f090774

    .line 1169
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const v1, 0x7f090788

    .line 1170
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    .line 1159
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 1172
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 1173
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 1174
    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private cancelTooltipAnimations()V
    .locals 3

    const/16 v0, 0xf

    .line 1038
    new-array v0, v0, [Ljava/lang/Integer;

    const v1, 0x7f090791

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const v1, 0x7f090790

    .line 1039
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const v1, 0x7f090793

    .line 1040
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const v1, 0x7f090785

    .line 1041
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const v1, 0x7f090784

    .line 1042
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const v1, 0x7f090787

    .line 1043
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const v1, 0x7f09077d

    .line 1044
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const v1, 0x7f09077c

    .line 1045
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const v1, 0x7f09077f

    .line 1046
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const v1, 0x7f09077e

    .line 1047
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const v1, 0x7f090781

    .line 1048
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const v1, 0x7f090780

    .line 1049
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const v1, 0x7f090783

    .line 1050
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const v1, 0x7f090774

    .line 1051
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const v1, 0x7f090788

    .line 1052
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    .line 1038
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 1054
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 1055
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 1056
    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private createFakeStoreDetailsResponse()Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;
    .locals 8

    .line 794
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;-><init>()V

    .line 797
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 798
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v3, 0x3f6

    .line 799
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 800
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 801
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->promoTiles:Ljava/util/List;

    .line 803
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/chains/ChainDataSource;->getChainInfo(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 805
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;->chainLogoImageUrl:Ljava/lang/String;

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->chainLogoImageUrl:Ljava/lang/String;

    .line 806
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationName:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 807
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;->chainName:Ljava/lang/String;

    iput-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationName:Ljava/lang/String;

    .line 808
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationName:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 812
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationName:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->locationName:Ljava/lang/String;

    .line 817
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfosForChain(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    .line 818
    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanKicks:Ljava/lang/Integer;

    if-eqz v6, :cond_2

    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanCompleted:Ljava/lang/Boolean;

    if-eqz v6, :cond_2

    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanCompleted:Ljava/lang/Boolean;

    .line 819
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-nez v6, :cond_2

    .line 820
    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    add-int/2addr v3, v6

    .line 823
    :cond_2
    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanKicks:Ljava/lang/Integer;

    if-eqz v6, :cond_1

    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanCompleted:Ljava/lang/Boolean;

    if-eqz v6, :cond_1

    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanCompleted:Ljava/lang/Boolean;

    .line 824
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-nez v6, :cond_1

    iget-object v6, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v6, v6, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    .line 825
    invoke-virtual {v6, v7}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->isPending(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 826
    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanKicks:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_0

    .line 830
    :cond_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->hasBnc:Ljava/lang/Boolean;

    const-string v1, ""

    .line 831
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->purchasesKicksAvailable:Ljava/lang/String;

    .line 832
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->isVisaOnly:Ljava/lang/Boolean;

    .line 833
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->hasReceiptKicks:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-nez v3, :cond_4

    move-object v5, v1

    goto :goto_1

    .line 834
    :cond_4
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    :goto_1
    iput-object v5, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->receiptKicksAvailable:Ljava/lang/String;

    .line 835
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iput-object v5, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->userReachedReceiptScanLimit:Ljava/lang/Boolean;

    .line 836
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->receiptBubbleSkLink:Ljava/lang/String;

    .line 839
    iget-object v5, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v5, v5, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideStoreDetailsReceiptKicksSummary:Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_5

    add-int/2addr v4, v3

    .line 843
    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->scanCoinsAvailable:Ljava/lang/Integer;

    .line 844
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->totalScanCoins:Ljava/lang/Integer;

    .line 845
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->scannedToday:Ljava/lang/Boolean;

    const/4 v3, -0x1

    .line 846
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->walkinCoinsAvailable:Ljava/lang/Integer;

    .line 847
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->totalWalkinCoins:Ljava/lang/Integer;

    .line 848
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->walkedInToday:Ljava/lang/Boolean;

    .line 849
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->coinsGrantedToday:Ljava/lang/Integer;

    .line 850
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->bonusWalkinKicksAvailable:Ljava/lang/Boolean;

    .line 852
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->walkinBubbleSkLink:Ljava/lang/String;

    .line 853
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->bncBubbleSkLink:Ljava/lang/String;

    .line 856
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "chain_id"

    .line 857
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "location_id"

    .line 858
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationId:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "chain_name"

    .line 859
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationName:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 860
    new-instance v2, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v3, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v4, Lcom/shopkick/app/products/ScansForLocationScreenV2;

    invoke-direct {v2, v3, v4, v1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 863
    invoke-virtual {v2}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->scanBubbleSkLink:Ljava/lang/String;

    return-object v0
.end method

.method private dismissTooltips(Ljava/lang/Integer;)V
    .locals 3

    .line 1387
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->animatingTooltip:Z

    if-nez v0, :cond_1

    .line 1388
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 1389
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo v2, "store_details_tooltip_shown"

    invoke-virtual {v0, v2, v1}, Lcom/shopkick/app/application/AppPreferences;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    .line 1391
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo v2, "store_details_online_tooltip_shown"

    invoke-virtual {v0, v2, v1}, Lcom/shopkick/app/application/AppPreferences;->putBoolean(Ljava/lang/String;Z)V

    .line 1393
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 1394
    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    .line 1395
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x2a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 1396
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 1397
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo v0, "store_details_retailer_receipt_tooltip_shown"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->retailerReceiptToolTipText:Ljava/lang/String;

    if-eqz p1, :cond_3

    .line 1399
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->showRetailerReceiptToolTip()V

    goto :goto_1

    .line 1403
    :cond_1
    iget-boolean p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    if-nez p1, :cond_2

    .line 1404
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->cancelTooltipAnimations()V

    goto :goto_1

    .line 1406
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->cancelOnlineTooltipAnimations()V

    :cond_3
    :goto_1
    return-void
.end method

.method private fadeInTooltipView(III)V
    .locals 1

    const/4 v0, 0x0

    .line 1179
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/shopkick/app/store/StoreDetailsScreen;->fadeInTooltipView(IIIZ)V

    return-void
.end method

.method private fadeInTooltipView(IIIZ)V
    .locals 3

    .line 1183
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 1184
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    int-to-long v1, p2

    .line 1185
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    int-to-long p2, p3

    .line 1186
    invoke-virtual {v0, p2, p3}, Landroid/view/animation/AlphaAnimation;->setStartOffset(J)V

    if-eqz p4, :cond_0

    .line 1188
    new-instance p2, Lcom/shopkick/app/store/StoreDetailsScreen$FadingAnimationListener;

    invoke-direct {p2, p0}, Lcom/shopkick/app/store/StoreDetailsScreen$FadingAnimationListener;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;)V

    invoke-virtual {v0, p2}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_0
    const/4 p2, 0x0

    .line 1190
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 1191
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private finishAnimating()V
    .locals 1

    const/4 v0, 0x0

    .line 1369
    iput-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->animatingTooltip:Z

    return-void
.end method

.method private getSupportedTileTypes()Ljava/util/HashSet;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 372
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x11

    new-array v2, v1, [Ljava/lang/Integer;

    const/16 v3, 0x10

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v2, v5

    const/16 v4, 0x1b

    .line 373
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v2, v5

    .line 374
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x2

    aput-object v1, v2, v4

    const/16 v1, 0x17

    .line 375
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x3

    aput-object v1, v2, v4

    const/16 v1, 0x69

    .line 376
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x4

    aput-object v1, v2, v4

    const/16 v1, 0x6c

    .line 377
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x5

    aput-object v1, v2, v4

    const/16 v1, 0x6d

    .line 378
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x6

    aput-object v1, v2, v4

    const/16 v1, 0x3ed

    .line 379
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x7

    aput-object v1, v2, v4

    const/16 v1, 0x44

    .line 380
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v4, 0x8

    aput-object v1, v2, v4

    const/16 v1, 0x72

    .line 381
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v4, 0x9

    aput-object v1, v2, v4

    const/16 v1, -0x23

    .line 382
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v4, 0xa

    aput-object v1, v2, v4

    const/16 v1, -0xd

    .line 383
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v4, 0xb

    aput-object v1, v2, v4

    const/16 v1, -0xe

    .line 384
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v4, 0xc

    aput-object v1, v2, v4

    const/16 v1, -0x20

    .line 385
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v4, 0xd

    aput-object v1, v2, v4

    const/16 v1, -0x1e

    .line 386
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v4, 0xe

    aput-object v1, v2, v4

    const/4 v1, -0x2

    .line 387
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v4, 0xf

    aput-object v1, v2, v4

    const/4 v1, -0x1

    .line 388
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v2, v3

    .line 372
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 390
    iget-boolean v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    const/16 v2, 0x41

    if-eqz v1, :cond_2

    .line 391
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v1, 0x3f

    .line 392
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v1, -0x34

    .line 393
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v2, 0xfae

    .line 394
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 396
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isStoreDetailCategoryKicksEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x55

    .line 397
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 400
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v2}, Lcom/shopkick/app/util/FeatureFlagHelper;->isOnlineKicksUnitEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v1, 0x418

    .line 401
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 403
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/16 v1, 0xfa1

    .line 406
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v1, 0xfa6

    .line 407
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 408
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v1, -0x35

    .line 409
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_0
    return-object v0
.end method

.method private instantiateViews()V
    .locals 2

    .line 299
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09054a

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->progressBar:Landroid/view/View;

    .line 300
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f0906e4

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f090075

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    .line 302
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f090804

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->videoOTTTipView:Landroid/widget/TextView;

    .line 303
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09050e

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIcon:Landroid/support/constraint/ConstraintLayout;

    .line 304
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09050f

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/RoundImageView;

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    .line 305
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isFTUEEnabled:Z

    if-eqz v0, :cond_0

    .line 306
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIcon:Landroid/support/constraint/ConstraintLayout;

    new-instance v1, Lcom/shopkick/app/store/-$$Lambda$StoreDetailsScreen$FLyDjcWRsqaukXMRs5OGSlIjmuA;

    invoke-direct {v1, p0}, Lcom/shopkick/app/store/-$$Lambda$StoreDetailsScreen$FLyDjcWRsqaukXMRs5OGSlIjmuA;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;)V

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 313
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIcon:Landroid/support/constraint/ConstraintLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private isCPGLocationWidgetLoaded()Z
    .locals 10

    .line 561
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetRequestLatitude:Ljava/lang/Double;

    const/4 v1, 0x2

    const/4 v2, 0x3

    const/16 v3, 0xfa1

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v0, :cond_1

    iget-object v6, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetRequestLongitude:Ljava/lang/Double;

    if-eqz v6, :cond_1

    .line 562
    iget-object v7, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/4 v8, 0x4

    new-array v8, v8, [Ljava/lang/Object;

    iget-object v9, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    aput-object v9, v8, v4

    aput-object v6, v8, v5

    aput-object v0, v8, v1

    .line 566
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v8, v2

    .line 562
    invoke-virtual {v7, v3, v8}, Lcom/shopkick/app/widget/WidgetDataSource;->getLoadState(I[Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v5, :cond_0

    move v4, v5

    :cond_0
    return v4

    .line 568
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationId:Ljava/lang/String;

    aput-object v6, v2, v4

    iget-object v6, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    aput-object v6, v2, v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v2, v1

    invoke-virtual {v0, v3, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->getLoadState(I[Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v5, :cond_2

    move v4, v5

    :cond_2
    return v4
.end method

.method private isEarnScreenLessonCompleted()Z
    .locals 1

    .line 740
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueEarnLessonCompleted()Z

    move-result v0

    return v0
.end method

.method private isFTUEStoreDetailsLessonInPausableState()Z
    .locals 1

    .line 1308
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsLessonPaused()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 1309
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsLessonCompleted()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isVideoOTTVisible(Landroid/view/View;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 1221
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBar;->getHeight()I

    move-result v1

    int-to-float v1, v1

    .line 1223
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const-string/jumbo v3, "status_bar_height"

    const-string v4, "dimen"

    const-string v5, "android"

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_1

    .line 1225
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    const/4 v3, 0x2

    .line 1227
    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 1228
    invoke-virtual {p1, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 p1, 0x1

    .line 1229
    aget v3, v3, p1

    int-to-float v3, v3

    sub-float/2addr v3, v1

    int-to-float v1, v2

    sub-float/2addr v3, v1

    const/4 v1, 0x0

    cmpl-float v1, v3, v1

    if-lez v1, :cond_2

    goto :goto_1

    :cond_2
    move p1, v0

    :goto_1
    return p1

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public static synthetic lambda$animatePauseIconRedDot$239(Lcom/shopkick/app/store/StoreDetailsScreen;Landroid/view/animation/Animation;)V
    .locals 1

    .line 1334
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/RoundImageView;->clearAnimation()V

    .line 1335
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/RoundImageView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public static synthetic lambda$instantiateViews$237(Lcom/shopkick/app/store/StoreDetailsScreen;Landroid/view/View;)V
    .locals 7

    .line 307
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/RoundImageView;->setVisibility(I)V

    .line 308
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueSkipAnimations(Z)V

    .line 309
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainName:Ljava/lang/String;

    iget v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->scanKicksAvailable:I

    iget v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->walkinKicksAvailable:I

    iget v5, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userScanCount:I

    iget v6, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userWalkinCount:I

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/app/store/StoreDetailsScreen;->startStoreDetailsLesson(Ljava/lang/String;IIII)V

    .line 310
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsLessonPaused(Z)V

    return-void
.end method

.method public static synthetic lambda$onEvent$240(Lcom/shopkick/app/store/StoreDetailsScreen;)V
    .locals 2

    .line 1493
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->startFTUELesson2()V

    .line 1494
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsLessonPaused(Z)V

    return-void
.end method

.method public static synthetic lambda$processResponse$238(Lcom/shopkick/app/store/StoreDetailsScreen;)V
    .locals 2

    .line 684
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->scrollToPosition(I)V

    .line 685
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->showRetailerReceiptToolTip()V

    return-void
.end method

.method private logStoreDetailsLessonTheUserCompletedTheScanVideo()V
    .locals 2

    .line 1528
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x69

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 1529
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logStoreDetailsLessonTheUserCompletedTheWalkinVideo()V
    .locals 2

    .line 1523
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x68

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 1524
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logStoreDetailsLessonTheUserStartedTheLesson()V
    .locals 2

    .line 294
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x66

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 295
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private maybeDisplayOnlineTooltips(Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;)V
    .locals 3

    .line 1061
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->disableTooltipAndError:Z

    if-nez v0, :cond_4

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->largePromoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz p1, :cond_0

    goto/16 :goto_1

    .line 1066
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isOnlineKicksUnitEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 1070
    :cond_1
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p1

    const-string v0, "FEATURE_FLAG_FTUE_TEST"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo v0, "store_details_online_tooltip_shown"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    .line 1075
    :cond_2
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c01cb

    .line 1078
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    .line 1080
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 p1, 0x1

    .line 1081
    iput-boolean p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->animatingTooltip:Z

    .line 1082
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v0, 0x29

    .line 1083
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 1084
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 1085
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1087
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    new-instance v0, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1089
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v0, 0x7f090774

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 1090
    new-instance v0, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;

    const/16 v1, 0x81

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1092
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v0, 0x7f090788

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 1093
    new-instance v0, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;

    const/16 v1, 0x82

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1095
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v0, 0x7f0906e3

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 1096
    new-instance v0, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;

    const/16 v1, 0x135

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1098
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v0, 0x7f0904c4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 1099
    new-instance v0, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;

    const/16 v1, 0x138

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1101
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v1, 0x7f09057a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1102
    new-instance v1, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;

    const/16 v2, 0x136

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1104
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v1, 0x7f090777

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1105
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1106
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v2}, Lcom/shopkick/app/store/StoreDetailsAdapter;->promoCarouselHeight()F

    move-result v2

    float-to-int v2, v2

    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1107
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1110
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v1, 0x7f090776

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1111
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isOnlineOffersEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1

    if-nez v1, :cond_3

    const/16 v1, 0x8

    .line 1112
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    const p1, 0x7f1106c8

    .line 1113
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_3
    const p1, 0x7f1106c9

    .line 1115
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 1118
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->animateOnlineTooltip()V

    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method private maybeDisplayTooltips(Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;)Z
    .locals 9

    .line 900
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->disableTooltipAndError:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 903
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    const/16 v2, -0x23

    .line 904
    invoke-virtual {v0, v2}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    .line 906
    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->hasAvailableKicks()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->isDisplayingWalkinDetails()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->largePromoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo v2, "store_details_tooltip_shown"

    .line 908
    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/AppPreferences;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_1

    .line 912
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0c01ce

    .line 915
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    .line 917
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 v0, 0x1

    .line 918
    iput-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->animatingTooltip:Z

    .line 919
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v3, 0x29

    .line 920
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 921
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 922
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 924
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    new-instance v3, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 926
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v3, 0x7f090774

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 927
    new-instance v3, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;

    const/16 v4, 0x81

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 929
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v4, 0x7f090788

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 930
    new-instance v4, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;

    const/16 v5, 0x82

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v4, p0, v5}, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 932
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v4, 0x7f090829

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 933
    new-instance v4, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;

    const/16 v5, 0x70

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v4, p0, v5}, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 935
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v4, 0x7f090620

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 936
    new-instance v4, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;

    const/16 v5, 0x71

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v4, p0, v5}, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 938
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v4, 0x7f09008b

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 939
    new-instance v4, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;

    const/16 v5, 0x72

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v4, p0, v5}, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 940
    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->chainId:Ljava/lang/String;

    .line 941
    invoke-static {v4}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, "40560331"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 942
    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v5, 0x7f09077f

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f110175

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    .line 945
    :cond_2
    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v5, 0x7f090597

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 946
    new-instance v5, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;

    const/16 v6, 0xb7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v5, p0, v6}, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 948
    iget-object v5, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v6, 0x7f090777

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 949
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 950
    iget-object v7, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v7}, Lcom/shopkick/app/store/StoreDetailsAdapter;->promoCarouselHeight()F

    move-result v7

    float-to-int v7, v7

    iput v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 951
    iget-object v7, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v7}, Lcom/shopkick/app/util/FeatureFlagHelper;->isPhysicalStoreDetailPageRedesigned(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->isPromoUnitUnpaid:Ljava/lang/Boolean;

    .line 952
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 953
    iput v1, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 954
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v7, 0x7f09078f

    invoke-virtual {p1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 955
    iget-object v7, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v8, 0x7f090220

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    const/4 v8, 0x4

    .line 956
    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    .line 957
    invoke-virtual {p1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 958
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v7, 0xb

    .line 959
    invoke-virtual {p1, v7, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 960
    invoke-virtual {v2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 962
    :cond_3
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 964
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const v1, 0x7f090776

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 967
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v0, :cond_5

    .line 969
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 970
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideStoreDetailsReceiptKicksSummary:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_4

    const v1, 0x7f1106c6

    .line 972
    invoke-virtual {p0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_4
    const v1, 0x7f1106c5

    .line 974
    invoke-virtual {p0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 976
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 982
    :cond_5
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideStoreDetailsReceiptKicksSummary:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_6

    const v1, 0x7f1106ca

    .line 983
    invoke-virtual {p0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 988
    :cond_6
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 991
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->animateTooltip()V

    return v0

    :cond_7
    :goto_1
    return v1
.end method

.method private processTilesArray(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 530
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 532
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 533
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x3

    if-eq v4, v5, :cond_1

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0xb

    if-eq v4, v5, :cond_1

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 534
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x1c

    if-ne v4, v5, :cond_2

    :cond_1
    const/16 v4, 0x11

    .line 535
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 538
    :cond_2
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x3f

    if-ne v4, v5, :cond_3

    .line 539
    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    .line 543
    :cond_3
    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v4}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->tileGroupType:Ljava/lang/Integer;

    if-eqz v4, :cond_4

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->tileGroupType:Ljava/lang/Integer;

    .line 544
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_4

    .line 545
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 549
    :cond_4
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x55

    if-ne v4, v5, :cond_0

    move-object v2, v3

    goto :goto_0

    .line 553
    :cond_5
    invoke-interface {p1, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    if-eqz v2, :cond_6

    const/4 p1, 0x1

    .line 556
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    :cond_6
    return-void
.end method

.method private refreshData()V
    .locals 2

    .line 507
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    const/16 v1, -0x23

    .line 508
    invoke-virtual {v0, v1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    .line 510
    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->stopScanPulseAnimation()V

    .line 511
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->clear()V

    .line 512
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->clearWidgets()V

    .line 513
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->setupWidgetData()V

    .line 514
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isWalkin:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 515
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->kicksEarnedToday:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 517
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->prepareWalkinAnimation(Ljava/lang/Integer;)V

    goto :goto_0

    .line 521
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->prepareWalkinAnimation(Ljava/lang/Integer;)V

    .line 524
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->progressBar:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 525
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->updateBBYLimitView()V

    .line 526
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->fetchNextPage()V

    return-void
.end method

.method private scrollToDetailsTile()V
    .locals 3

    .line 1565
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 1566
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->containsTileOfType(I)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 1568
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_3

    .line 1569
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v2, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getItemViewType(I)I

    move-result v2

    if-ne v2, v1, :cond_2

    .line 1570
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->smoothScrollToPosition(I)V

    return-void

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method private setupIsOnline()V
    .locals 2

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->params:Ljava/util/Map;

    const-string v1, "is_online_store"

    .line 255
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->params:Ljava/util/Map;

    const-string v1, "is_online_store"

    .line 256
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 257
    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMCommerceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    return-void
.end method

.method private setupIsWalkin()V
    .locals 3

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isWalkin:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    return-void

    .line 243
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->params:Ljava/util/Map;

    const-string v1, "from_walkin"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 244
    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    .line 245
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 246
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isWalkin:Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 247
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 248
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isWalkin:Ljava/lang/Boolean;

    :cond_2
    :goto_0
    return-void
.end method

.method private setupRecycler()V
    .locals 18

    move-object/from16 v15, p0

    .line 318
    iget-object v0, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 320
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->updateBBYLimitView()V

    .line 322
    new-instance v10, Lcom/shopkick/app/store/StoreDetailsAdapter;

    iget-object v1, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v4, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 326
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getSupportedTileTypes()Ljava/util/HashSet;

    move-result-object v5

    iget-object v6, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->locationId:Ljava/lang/String;

    iget-object v7, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    iget-boolean v8, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    .line 330
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v9

    move-object v0, v10

    move-object/from16 v2, p0

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v9}, Lcom/shopkick/app/store/StoreDetailsAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Context;)V

    iput-object v10, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    .line 332
    new-instance v14, Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v0, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    .line 333
    invoke-virtual {v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getRecyclerViewImageController()Lcom/shopkick/app/controllers/RecyclerViewImageController;

    move-result-object v2

    iget-object v0, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v0, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 335
    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v4

    iget-object v0, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    .line 336
    invoke-virtual {v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getUserEventRecyclerViewCoordinator()Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;

    move-result-object v5

    iget-object v6, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v0, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, v0, Lcom/shopkick/app/application/ScreenGlobals;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v0, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v8, v0, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v0, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v9, v0, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v0, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v10, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v0, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v11, v0, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v0, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v12, v0, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v13, v0, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v0, v15, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    move-object/from16 v16, v0

    move-object v0, v14

    move-object/from16 v17, v14

    move-object/from16 v14, v16

    invoke-direct/range {v0 .. v15}, Lcom/shopkick/app/store/CarouselPromoController;-><init>(Landroid/content/Context;Lcom/shopkick/app/controllers/RecyclerViewImageController;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/screens/AppScreen;)V

    move-object/from16 v0, p0

    .line 348
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    move-object/from16 v2, v17

    invoke-virtual {v1, v2}, Lcom/shopkick/app/store/StoreDetailsAdapter;->setCarouselPromoController(Lcom/shopkick/app/store/CarouselPromoController;)V

    .line 349
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v2, v0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 350
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 351
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    return-void
.end method

.method private setupViewsForWalkin()V
    .locals 2

    .line 355
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isWalkin:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 356
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x1

    .line 359
    iput-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->disableTooltipAndError:Z

    const/4 v0, 0x0

    .line 360
    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    const/4 v0, 0x0

    .line 361
    iput-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->animatingTooltip:Z

    .line 363
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->params:Ljava/util/Map;

    const-string v1, "kicks_earned_count"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->kicksEarnedToday:Ljava/lang/String;

    .line 364
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CHECKMARK_ANIMATION_FINISHED"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 365
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "WALKIN_FINISHED_OFFLINE"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 366
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "WALKIN_FINISHED_WITH_ERROR"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private setupWidgetData()V
    .locals 9

    .line 877
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 878
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/16 v3, 0xfae

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    aput-object v4, v2, v1

    invoke-virtual {v0, v3, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 879
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isStoreDetailsGroceryOffersWidgetEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 880
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    .line 881
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationId:Ljava/lang/String;

    if-nez v3, :cond_1

    if-nez v0, :cond_1

    .line 882
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    .line 883
    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 884
    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->initiateLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    goto :goto_0

    .line 885
    :cond_1
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationId:Ljava/lang/String;

    const/4 v4, 0x2

    const/4 v5, 0x3

    const/16 v6, 0xfa1

    if-nez v3, :cond_2

    if-eqz v0, :cond_2

    .line 886
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    iput-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetRequestLongitude:Ljava/lang/Double;

    .line 887
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetRequestLatitude:Ljava/lang/Double;

    .line 888
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    aput-object v7, v3, v1

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetRequestLongitude:Ljava/lang/Double;

    aput-object v1, v3, v2

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetRequestLatitude:Ljava/lang/Double;

    aput-object v1, v3, v4

    .line 892
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v3, v5

    .line 888
    invoke-virtual {v0, v6, v3}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 894
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    new-array v3, v5, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationId:Ljava/lang/String;

    aput-object v5, v3, v1

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    aput-object v1, v3, v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v3, v4

    invoke-virtual {v0, v6, v3}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_0
    return-void
.end method

.method private shouldDisplayScanVideo()Z
    .locals 1

    .line 748
    iget v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->scanKicksAvailable:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsScanVideoWatched()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userScanCount:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private shouldDisplayWalkinVideo()Z
    .locals 1

    .line 744
    iget v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->walkinKicksAvailable:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsWalkinVideoWatched()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userWalkinCount:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private showRetailerReceiptToolTip()V
    .locals 9

    .line 752
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 753
    invoke-virtual {v0}, Lcom/shopkick/app/widget/ToolTipView;->dismiss()V

    .line 754
    iput-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    .line 756
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    const v2, 0x7f09019b

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 757
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    const v3, 0x7f0906e4

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 758
    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->indexOfChild(Landroid/view/View;)I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    .line 759
    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v4}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result v4

    .line 762
    iget-object v5, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v5}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v5

    check-cast v5, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    .line 763
    invoke-virtual {v5, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->findFirstCompletelyVisibleItemPositions([I)[I

    move-result-object v6

    const/4 v7, 0x0

    aget v6, v6, v7

    .line 764
    invoke-virtual {v5, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->findLastCompletelyVisibleItemPositions([I)[I

    move-result-object v1

    aget v1, v1, v7

    if-ltz v6, :cond_2

    .line 765
    iget-object v5, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v5}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v5

    .line 766
    invoke-virtual {v5}, Landroid/support/v7/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v5

    if-ge v1, v5, :cond_2

    :goto_0
    if-gt v6, v1, :cond_2

    const/16 v5, -0x23

    .line 769
    iget-object v8, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v8}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v8

    .line 770
    invoke-virtual {v8, v6}, Landroid/support/v7/widget/RecyclerView$Adapter;->getItemViewType(I)I

    move-result v8

    if-ne v5, v8, :cond_1

    .line 771
    iget-object v5, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sub-int v8, v6, v4

    invoke-virtual {v5, v8}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    const v8, 0x7f0903f5

    .line 772
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 773
    invoke-virtual {v5}, Landroid/view/View;->isShown()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 774
    new-instance v1, Lcom/shopkick/app/store/StoreDetailsScreen$2;

    invoke-direct {v1, p0, v0, v5, v2}, Lcom/shopkick/app/store/StoreDetailsScreen$2;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Landroid/view/ViewGroup;Landroid/view/View;I)V

    iput-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    .line 780
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {v0, v5}, Lcom/shopkick/app/widget/ToolTipView;->addExtCloseButton(Landroid/view/View;)V

    .line 781
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->retailerReceiptToolTipText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/ToolTipView;->setText(Ljava/lang/String;)V

    .line 782
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    const/high16 v1, 0x41500000    # 13.0f

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/ToolTipView;->setTextSize(F)V

    .line 783
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/ToolTipView;->setTooltipPosition(Z)V

    .line 784
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    const/16 v1, 0xa

    const/16 v2, 0xf

    invoke-virtual {v0, v2, v1, v2, v7}, Lcom/shopkick/app/widget/ToolTipView;->setMargin(IIII)V

    .line 785
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/ToolTipView;->show()V

    goto :goto_1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private startStoreDetailsLessonIfNeeded()V
    .locals 8

    .line 730
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->isFTUEStoreDetailsLessonInPausableState()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 731
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIcon:Landroid/support/constraint/ConstraintLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    .line 732
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->animatePauseIconRedDot()V

    goto :goto_0

    .line 734
    :cond_0
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainName:Ljava/lang/String;

    iget v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->scanKicksAvailable:I

    iget v5, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->walkinKicksAvailable:I

    iget v6, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userScanCount:I

    iget v7, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userWalkinCount:I

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lcom/shopkick/app/store/StoreDetailsScreen;->startStoreDetailsLesson(Ljava/lang/String;IIII)V

    :goto_0
    return-void
.end method

.method private startVideoOTTViewAnimation(Landroid/view/View;)V
    .locals 6

    .line 1234
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->isDetached()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->isRemoving()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/high16 v0, 0x42200000    # 40.0f

    .line 1236
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    .line 1237
    invoke-direct {p0, p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->isVideoOTTVisible(Landroid/view/View;)Z

    move-result p1

    .line 1238
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    const/4 v3, 0x0

    .line 1239
    invoke-virtual {v1, v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->findFirstVisibleItemPositions([I)[I

    move-result-object v1

    const/4 v3, 0x0

    aget v1, v1, v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v1, :cond_1

    .line 1241
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->videoOTTTipView:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getTranslationY()F

    move-result p1

    cmpl-float p1, p1, v5

    if-nez p1, :cond_3

    .line 1242
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->videoOTTTipView:Landroid/widget/TextView;

    const-string/jumbo v1, "translationY"

    new-array v4, v4, [F

    invoke-virtual {p1}, Landroid/widget/TextView;->getTranslationY()F

    move-result v5

    aput v5, v4, v3

    neg-float v0, v0

    aput v0, v4, v2

    invoke-static {p1, v1, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 1244
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->videoOTTTipView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getTranslationY()F

    move-result v1

    neg-float v0, v0

    cmpl-float v1, v1, v0

    if-eqz v1, :cond_2

    .line 1245
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->videoOTTTipView:Landroid/widget/TextView;

    const-string/jumbo v1, "translationY"

    new-array v4, v4, [F

    invoke-virtual {p1}, Landroid/widget/TextView;->getTranslationY()F

    move-result v5

    aput v5, v4, v3

    aput v0, v4, v2

    invoke-static {p1, v1, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_0

    :cond_2
    if-nez p1, :cond_3

    .line 1246
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->videoOTTTipView:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getTranslationY()F

    move-result p1

    cmpl-float p1, p1, v5

    if-eqz p1, :cond_3

    .line 1247
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->videoOTTTipView:Landroid/widget/TextView;

    const-string/jumbo v0, "translationY"

    new-array v1, v4, [F

    invoke-virtual {p1}, Landroid/widget/TextView;->getTranslationY()F

    move-result v4

    aput v4, v1, v3

    aput v5, v1, v2

    invoke-static {p1, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    :cond_3
    :goto_0
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method private updateBBYLimitView()V
    .locals 12

    .line 472
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->limitBbyScans:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "40560331"

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 473
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    .line 474
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getBestBuyScanLimit()I

    move-result v0

    const v2, 0x7f090076

    const v3, 0x7f09006e

    const v4, 0x7f09006f

    const v5, 0x7f090073

    const v6, 0x7f090384

    const/4 v7, 0x4

    if-lez v0, :cond_0

    .line 475
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v6}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v9}, Lcom/shopkick/app/application/AppPreferences;->getBestBuyScanLimit()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ""

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 476
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v5}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v8, 0x7f0f0005

    iget-object v9, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 477
    invoke-virtual {v9}, Lcom/shopkick/app/application/AppPreferences;->getBestBuyScanLimit()I

    move-result v9

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    iget-object v11, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v11}, Lcom/shopkick/app/application/AppPreferences;->getBestBuyScanLimit()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v10, v1

    .line 476
    invoke-virtual {p0, v8, v9, v10}, Lcom/shopkick/app/store/StoreDetailsScreen;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 478
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v6}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 479
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v4}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 480
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v5}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 481
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v3}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 482
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v2}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->bbyScanCountdownRiderText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 486
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v6}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 487
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v4}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 488
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v5}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 489
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v3}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 490
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v2}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->bbyScanLimitReachedRiderText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 494
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c01cc

    const/4 v0, 0x0

    .line 262
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/constraint/ConstraintLayout;

    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    .line 264
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->instantiateViews()V

    .line 266
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->setupRecycler()V

    .line 268
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->setupViewsForWalkin()V

    .line 270
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationName:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 272
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 3

    .line 579
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    .line 580
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationId:Ljava/lang/String;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    .line 581
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, v0}, Lcom/shopkick/sdk/presence/LocationManager;->initiateLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    const/4 p1, 0x0

    return-object p1

    .line 585
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->request:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;

    .line 586
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->request:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;->locationId:Ljava/lang/String;

    .line 587
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;->chainId:Ljava/lang/String;

    .line 588
    iget-boolean v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;->forOnlineStore:Ljava/lang/Boolean;

    if-eqz p1, :cond_1

    .line 590
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->request:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;->latitude:Ljava/lang/Double;

    .line 591
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->request:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;->longitude:Ljava/lang/Double;

    .line 593
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->request:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
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

    .line 186
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 187
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 188
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 189
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 190
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 191
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 192
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const-string p1, "location_name"

    .line 194
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationName:Ljava/lang/String;

    const-string p1, "location_id"

    .line 195
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationId:Ljava/lang/String;

    const-string p1, "chain_id"

    .line 196
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    const-string p1, "kicks_earned_count"

    .line 197
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->kicksEarnedToday:Ljava/lang/String;

    .line 201
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->setupIsOnline()V

    .line 204
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->setupIsWalkin()V

    .line 206
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isWalkin:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    .line 207
    iput-boolean p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->disableTooltipAndError:Z

    .line 208
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CHECKMARK_ANIMATION_FINISHED"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 209
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "WALKIN_FINISHED_OFFLINE"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 210
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "WALKIN_FINISHED_WITH_ERROR"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 213
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "WalkinControllerWalkinSucceededEvent"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 214
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EventReceiptScanUploaded"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 215
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "productSavedStateUpdated"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 216
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "ScanBCSucceeded"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 217
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "eventScanIrResponseSuccess"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 218
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EventVideoBonusKicksCompleted"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 219
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "offlineScanBarcodeReady"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 220
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "offlineScanFailed"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 221
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "offlineScanBarcodeEnqueued"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 222
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EventModuleRequestSuccess"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 223
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EventModuleRequestFailed"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 224
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EventVideoAwardRequestCompleted"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 225
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EventUpdateUI2DIRAndVideoFeature"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 227
    iget-boolean p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    if-eqz p1, :cond_1

    .line 228
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "eventOnlineStoreClickSucceeded"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 229
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 233
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isFTUEEnabled:Z

    .line 235
    iput-boolean p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldRefresh:Z

    return-void
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 2

    .line 465
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isFTUEEnabled:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsLessonCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 466
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonShouldDisplayJeanOnEarnTab(Z)V

    .line 468
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 6

    .line 417
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->request:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 418
    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->request:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;

    .line 420
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/controllers/WindowBrightnessController;->restoreScreenBrightness(Landroid/view/Window;)V

    .line 421
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 422
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->destroy()V

    .line 423
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/16 v1, 0xfa1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationId:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(I[Ljava/lang/Object;)V

    .line 424
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/16 v1, 0xfae

    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(I[Ljava/lang/Object;)V

    .line 426
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 6
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

    .line 1412
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    const/16 v1, -0x23

    .line 1413
    invoke-virtual {v0, v1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    .line 1415
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "productSavedStateUpdated"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x5

    goto/16 :goto_1

    :sswitch_1
    const-string v1, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x7

    goto/16 :goto_1

    :sswitch_2
    const-string v1, "offlineScanBarcodeEnqueued"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xd

    goto/16 :goto_1

    :sswitch_3
    const-string v1, "WALKIN_FINISHED_WITH_ERROR"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x3

    goto/16 :goto_1

    :sswitch_4
    const-string v1, "ScanBCSucceeded"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    goto/16 :goto_1

    :sswitch_5
    const-string v1, "eventOnlineStoreClickSucceeded"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x6

    goto/16 :goto_1

    :sswitch_6
    const-string v1, "offlineScanBarcodeReady"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xb

    goto/16 :goto_1

    :sswitch_7
    const-string v1, "EventVideoBonusKicksCompleted"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xa

    goto/16 :goto_1

    :sswitch_8
    const-string v1, "offlineScanFailed"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xc

    goto/16 :goto_1

    :sswitch_9
    const-string v1, "WalkinControllerWalkinSucceededEvent"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v4

    goto :goto_1

    :sswitch_a
    const-string v1, "eventScanIrResponseSuccess"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x9

    goto :goto_1

    :sswitch_b
    const-string v1, "CHECKMARK_ANIMATION_FINISHED"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_1

    :sswitch_c
    const-string v1, "EventUpdateUI2DIRAndVideoFeature"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x11

    goto :goto_1

    :sswitch_d
    const-string v1, "EventModuleRequestFailed"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xf

    goto :goto_1

    :sswitch_e
    const-string v1, "EventReceiptScanUploaded"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_1

    :sswitch_f
    const-string v1, "EventModuleRequestSuccess"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xe

    goto :goto_1

    :sswitch_10
    const-string v1, "EventVideoAwardRequestCompleted"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x10

    goto :goto_1

    :sswitch_11
    const-string v1, "WALKIN_FINISHED_OFFLINE"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v1, -0x1

    :goto_1
    packed-switch v1, :pswitch_data_0

    goto/16 :goto_3

    .line 1517
    :pswitch_0
    iput-boolean v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldRefresh:Z

    goto/16 :goto_3

    :pswitch_1
    const-string p1, "ParamVideoId"

    .line 1472
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 1473
    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-void

    :cond_1
    const-string p2, "39650790025"

    .line 1475
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    const-string p2, "42477661259"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    .line 1499
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    const/16 v0, 0x72

    invoke-virtual {p2, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->containsTileOfType(I)Z

    move-result p2

    if-eqz p2, :cond_9

    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    .line 1500
    invoke-virtual {p2, v3}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_9

    .line 1501
    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {p2, v3}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 1502
    iput-boolean v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isVideoOTTFinished:Z

    .line 1503
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    .line 1504
    invoke-virtual {p1, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    const/high16 p2, 0x42200000    # 40.0f

    .line 1505
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v4, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    .line 1506
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->videoOTTTipView:Landroid/widget/TextView;

    const-string/jumbo v1, "translationY"

    new-array v2, v2, [F

    invoke-virtual {v0}, Landroid/widget/TextView;->getTranslationY()F

    move-result v5

    aput v5, v2, v3

    neg-float p2, p2

    aput p2, v2, v4

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    invoke-virtual {p2}, Landroid/animation/ObjectAnimator;->start()V

    .line 1507
    invoke-virtual {p1}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->startVideoCompleteAnimation()V

    goto/16 :goto_3

    .line 1477
    :cond_3
    :goto_2
    iget-boolean p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isFTUEEnabled:Z

    if-nez p2, :cond_4

    return-void

    :cond_4
    const-string p2, "39650790025"

    .line 1479
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 1480
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->logStoreDetailsLessonTheUserCompletedTheScanVideo()V

    .line 1481
    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p2, v4}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsScanVideoWatched(Z)V

    :cond_5
    const-string p2, "42477661259"

    .line 1484
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 1485
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->logStoreDetailsLessonTheUserCompletedTheWalkinVideo()V

    .line 1486
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1, v4}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsWalkinVideoWatched(Z)V

    .line 1489
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsLessonStarted()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 1490
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getCurrentOverlay()Lcom/shopkick/app/overlays/base/Overlay;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/base/Overlay;->dismiss()V

    .line 1491
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 1492
    new-instance p2, Lcom/shopkick/app/store/-$$Lambda$StoreDetailsScreen$hodgGLPOAZE2AmcS7N0u32ll9bk;

    invoke-direct {p2, p0}, Lcom/shopkick/app/store/-$$Lambda$StoreDetailsScreen$hodgGLPOAZE2AmcS7N0u32ll9bk;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;)V

    const-wide/16 v0, 0x3e8

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_3

    .line 1467
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->response:Lcom/shopkick/fetchers/DataResponse;

    if-eqz p1, :cond_9

    .line 1468
    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->request:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsRequest;

    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    goto/16 :goto_3

    .line 1457
    :pswitch_3
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->isTopScreen()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 1458
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->refreshData()V

    goto/16 :goto_3

    :cond_7
    const-string p2, "offlineScanBarcodeEnqueued"

    .line 1459
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1460
    iput-boolean v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldInvalidateOfflineScanTiles:Z

    goto :goto_3

    .line 1462
    :cond_8
    iput-boolean v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldRefresh:Z

    goto :goto_3

    .line 1452
    :pswitch_4
    iput-boolean v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldRefresh:Z

    goto :goto_3

    .line 1449
    :pswitch_5
    iput-boolean v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldRefresh:Z

    goto :goto_3

    .line 1445
    :pswitch_6
    iput-boolean v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->maybeStartReceiptPulseAnimation:Z

    .line 1446
    iput-boolean v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldRefresh:Z

    goto :goto_3

    .line 1442
    :pswitch_7
    iput-boolean v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldRefresh:Z

    goto :goto_3

    .line 1433
    :pswitch_8
    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    const-string v0, "WALKIN_FINISHED_OFFLINE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p2, p1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->finishWalkinAnimationWithFailure(Z)V

    .line 1434
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CHECKMARK_ANIMATION_FINISHED"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 1435
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "WALKIN_FINISHED_OFFLINE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 1436
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "WALKIN_FINISHED_WITH_ERROR"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_3

    .line 1426
    :pswitch_9
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->refreshData()V

    .line 1427
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->mainView:Landroid/view/ViewGroup;

    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 p1, 0x0

    .line 1428
    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->overlayTooltipView:Landroid/view/View;

    .line 1429
    iput-boolean v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->animatingTooltip:Z

    goto :goto_3

    .line 1418
    :pswitch_a
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    const-string v1, "POINTS_EARNED_KEY"

    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/store/StoreDetailsAdapter;->finishWalkinAnimation(I)V

    .line 1419
    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->maybeStartScanPulseAnimation()V

    .line 1420
    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->maybeStartReceiptPulseAnimationAfterWalkin()V

    .line 1421
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CHECKMARK_ANIMATION_FINISHED"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 1422
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "WALKIN_FINISHED_OFFLINE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 1423
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "WALKIN_FINISHED_WITH_ERROR"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :cond_9
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x77f65199 -> :sswitch_11
        -0x6bae06a8 -> :sswitch_10
        -0x6b4bce66 -> :sswitch_f
        -0x57c9a285 -> :sswitch_e
        -0x4c486c3a -> :sswitch_d
        -0x2ddd5220 -> :sswitch_c
        -0x2c1e7849 -> :sswitch_b
        -0x1b10bf5e -> :sswitch_a
        -0x1ae0f8cf -> :sswitch_9
        -0x106e20a3 -> :sswitch_8
        -0xf052804 -> :sswitch_7
        0x550c423 -> :sswitch_6
        0x64efe2d -> :sswitch_5
        0x2ae28463 -> :sswitch_4
        0x3d81b20b -> :sswitch_3
        0x43b738dc -> :sswitch_2
        0x556e6c68 -> :sswitch_1
        0x5ac5dde2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onOverlayDismissed(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 0

    .line 1296
    iget-boolean p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isFTUEEnabled:Z

    if-eqz p1, :cond_1

    .line 1297
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->isFTUEStoreDetailsLessonInPausableState()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1298
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIcon:Landroid/support/constraint/ConstraintLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    .line 1299
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->animatePauseIconRedDot()V

    goto :goto_0

    .line 1301
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIcon:Landroid/support/constraint/ConstraintLayout;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    .line 1302
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIconRedDot:Lcom/shopkick/app/widget/RoundImageView;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/RoundImageView;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onOverlayShown(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 0

    return-void
.end method

.method public onPreFetch(Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 0

    return-void
.end method

.method protected onScreenDidHide()V
    .locals 2

    .line 448
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    const/16 v1, -0x23

    .line 449
    invoke-virtual {v0, v1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    .line 451
    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->stopScanPulseAnimation()V

    .line 452
    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->stopReceiptPulseAnimation()V

    .line 453
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isFTUEEnabled:Z

    if-eqz v0, :cond_1

    .line 454
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsLessonCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 455
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonShouldDisplayJeanOnEarnTab(Z)V

    .line 457
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIcon:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0}, Landroid/support/constraint/ConstraintLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 458
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->pauseIcon:Landroid/support/constraint/ConstraintLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 431
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldRefresh:Z

    if-eqz v0, :cond_0

    .line 432
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->refreshData()V

    .line 434
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isWalkin:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 435
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->showWalkinOverlayForStoreDetails()V

    goto :goto_0

    .line 436
    :cond_1
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldInvalidateOfflineScanTiles:Z

    if-eqz v0, :cond_2

    .line 437
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->updateKicksViewInOfflineScan()V

    .line 438
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->invalidatePendingScanTile()V

    const/4 v0, 0x0

    .line 439
    iput-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldInvalidateOfflineScanTiles:Z

    :cond_2
    :goto_0
    return-void
.end method

.method protected onScreenWillHide()V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 2

    .line 1253
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    const/16 v1, 0x72

    invoke-virtual {v0, v1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->containsTileOfType(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isVideoOTTFinished:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->videoOTTTipView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 1259
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findViewHolderForAdapterPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 1262
    :cond_1
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findViewHolderForAdapterPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v0, 0x7f09010f

    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    packed-switch p2, :pswitch_data_0

    goto :goto_1

    .line 1269
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->startVideoOTTViewAnimation(Landroid/view/View;)V

    :goto_1
    :pswitch_1
    return-void

    :cond_2
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 1

    .line 1200
    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getItemCount()I

    move-result p2

    if-lez p2, :cond_3

    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    const/4 p3, 0x0

    .line 1201
    invoke-virtual {p2, p3}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    .line 1202
    invoke-virtual {p2, p3}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/16 v0, 0x72

    if-ne p2, v0, :cond_3

    .line 1203
    invoke-virtual {p1, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findViewHolderForAdapterPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 1204
    invoke-virtual {p1, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findViewHolderForAdapterPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v0, 0x7f09010f

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-boolean p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isVideoOTTFinished:Z

    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->videoOTTTipView:Landroid/widget/TextView;

    if-nez p2, :cond_0

    goto :goto_1

    .line 1209
    :cond_0
    invoke-virtual {p1, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findViewHolderForAdapterPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->isVideoOTTVisible(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 1210
    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/store/StoreDetailsAdapter;->isVideoOTTPlaying()Z

    move-result p2

    if-nez p2, :cond_1

    .line 1211
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->playVideoOTT()V

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    .line 1212
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->isVideoOTTPlaying()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1213
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->pauseVideoOTT()V

    :cond_2
    :goto_0
    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 7

    .line 598
    new-instance p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 599
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 601
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_d

    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_d

    .line 602
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/16 v3, 0xfae

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    aput-object v6, v5, v2

    invoke-virtual {v0, v3, v5}, Lcom/shopkick/app/widget/WidgetDataSource;->getLoadState(I[Ljava/lang/Object;)I

    move-result v0

    if-eq v0, v4, :cond_0

    .line 604
    iput-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->response:Lcom/shopkick/fetchers/DataResponse;

    return-object p1

    .line 606
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->isCPGLocationWidgetLoaded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 607
    iput-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->response:Lcom/shopkick/fetchers/DataResponse;

    return-object p1

    .line 611
    :cond_1
    iput-boolean v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldInvalidateOfflineScanTiles:Z

    .line 612
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->progressBar:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 614
    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    .line 616
    iget-boolean v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isOnlineStore:Z

    if-eqz v1, :cond_2

    .line 617
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->tiles:Ljava/util/List;

    invoke-direct {p0, p2}, Lcom/shopkick/app/store/StoreDetailsScreen;->processTilesArray(Ljava/util/List;)V

    .line 618
    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->digestResponse(Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;)V

    .line 619
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->locationName:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lcom/shopkick/app/store/StoreDetailsScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 620
    iput-boolean v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldRefresh:Z

    .line 621
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/StoreDetailsScreen;->maybeDisplayOnlineTooltips(Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;)V

    goto/16 :goto_3

    .line 623
    :cond_2
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->locationId:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 624
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 625
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f1106d8

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->getNoContentTile(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 626
    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    return-object p1

    .line 630
    :cond_3
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->chainId:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 631
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->chainId:Ljava/lang/String;

    iput-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    .line 632
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->updateBBYLimitView()V

    .line 635
    :cond_4
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string v3, "WIDGET_LATITUDE"

    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetRequestLatitude:Ljava/lang/Double;

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 636
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string v3, "WIDGET_LONGITUDE"

    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->widgetRequestLongitude:Ljava/lang/Double;

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->locationId:Ljava/lang/String;

    iput-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationId:Ljava/lang/String;

    .line 638
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getParams()Ljava/util/Map;

    move-result-object v1

    const-string v3, "location_id"

    .line 639
    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->locationId:Ljava/lang/String;

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 640
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->setupViewsForWalkin()V

    .line 642
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->tiles:Ljava/util/List;

    invoke-direct {p0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen;->processTilesArray(Ljava/util/List;)V

    .line 643
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->digestResponse(Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;)V

    .line 646
    iget-boolean v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isFTUEEnabled:Z

    if-eqz v1, :cond_9

    .line 647
    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->locationName:Ljava/lang/String;

    iput-object v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainName:Ljava/lang/String;

    .line 648
    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->scanCoinsAvailable:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->scanKicksAvailable:I

    .line 649
    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->walkinCoinsAvailable:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->walkinKicksAvailable:I

    .line 650
    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->userScanCount:Ljava/lang/Integer;

    if-eqz v1, :cond_5

    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->userWalkinCount:Ljava/lang/Integer;

    if-eqz v1, :cond_5

    .line 652
    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->userScanCount:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userScanCount:I

    .line 653
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->userWalkinCount:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iput p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userWalkinCount:I

    goto :goto_0

    .line 655
    :cond_5
    iput v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userScanCount:I

    .line 656
    iput v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->userWalkinCount:I

    .line 663
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->isEarnScreenLessonCompleted()Z

    move-result p2

    if-eqz p2, :cond_9

    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsLessonCompleted()Z

    move-result p2

    if-nez p2, :cond_9

    .line 664
    iget p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->scanKicksAvailable:I

    if-lez p2, :cond_7

    iget p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->walkinKicksAvailable:I

    if-lez p2, :cond_7

    .line 665
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldDisplayScanVideo()Z

    move-result p2

    if-nez p2, :cond_6

    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldDisplayWalkinVideo()Z

    move-result p2

    if-eqz p2, :cond_9

    .line 666
    :cond_6
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->startStoreDetailsLessonIfNeeded()V

    goto :goto_1

    .line 668
    :cond_7
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldDisplayScanVideo()Z

    move-result p2

    if-eqz p2, :cond_8

    .line 669
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->startStoreDetailsLessonIfNeeded()V

    goto :goto_1

    .line 670
    :cond_8
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldDisplayWalkinVideo()Z

    move-result p2

    if-eqz p2, :cond_9

    .line 671
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->startStoreDetailsLessonIfNeeded()V

    .line 676
    :cond_9
    :goto_1
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->locationName:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lcom/shopkick/app/store/StoreDetailsScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 677
    iput-boolean v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldRefresh:Z

    .line 678
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->receiptsTooltip:Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->retailerReceiptToolTipText:Ljava/lang/String;

    .line 680
    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo v1, "store_details_retailer_receipt_tooltip_shown"

    invoke-virtual {p2, v1}, Lcom/shopkick/app/application/AppPreferences;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_a

    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo v1, "store_details_tooltip_shown"

    .line 681
    invoke-virtual {p2, v1}, Lcom/shopkick/app/application/AppPreferences;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_a

    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->retailerReceiptToolTipText:Ljava/lang/String;

    if-eqz p2, :cond_a

    .line 683
    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Lcom/shopkick/app/store/-$$Lambda$StoreDetailsScreen$rKUwkeuAPFQvKVnzcZsdlxPBsWI;

    invoke-direct {v1, p0}, Lcom/shopkick/app/store/-$$Lambda$StoreDetailsScreen$rKUwkeuAPFQvKVnzcZsdlxPBsWI;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;)V

    invoke-virtual {p2, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->post(Ljava/lang/Runnable;)Z

    .line 689
    :cond_a
    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    const/16 v1, -0x23

    .line 690
    invoke-virtual {p2, v1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    .line 692
    iget-boolean v1, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->maybeStartReceiptPulseAnimation:Z

    if-eqz v1, :cond_b

    .line 693
    invoke-virtual {p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->maybeStartReceiptPulseAnimationAfterScan()V

    .line 694
    iput-boolean v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->maybeStartReceiptPulseAnimation:Z

    goto :goto_2

    .line 696
    :cond_b
    invoke-virtual {p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->stopReceiptPulseAnimation()V

    .line 698
    :goto_2
    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p2}, Lcom/shopkick/app/util/FeatureFlagHelper;->isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p2

    if-nez p2, :cond_c

    .line 699
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/StoreDetailsScreen;->maybeDisplayTooltips(Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;)Z

    :cond_c
    const/4 p2, 0x0

    .line 701
    iput-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->response:Lcom/shopkick/fetchers/DataResponse;

    goto :goto_3

    .line 705
    :cond_d
    iput-boolean v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->shouldInvalidateOfflineScanTiles:Z

    .line 706
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->progressBar:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 707
    iget v0, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_e

    iget v0, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v2, 0x7

    if-ne v0, v2, :cond_f

    :cond_e
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->chainId:Ljava/lang/String;

    .line 708
    invoke-virtual {v0, v2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfosForChain(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_f

    .line 709
    iget-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->createFakeStoreDetailsResponse()Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->digestResponse(Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;)V

    goto :goto_3

    .line 711
    :cond_f
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->addOfflineEducationTile()V

    .line 712
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 714
    iget v0, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    if-ne v0, v1, :cond_10

    .line 715
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v0, 0x46cd1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 716
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    goto :goto_3

    .line 718
    :cond_10
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->disableTooltipAndError:Z

    if-nez v0, :cond_11

    .line 719
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    :cond_11
    :goto_3
    return-object p1
.end method

.method public startFTUELesson2()V
    .locals 5

    .line 1533
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 1534
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 1535
    new-instance v2, Lcom/shopkick/app/store/StoreDetailsScreen$4;

    invoke-direct {v2, p0, v1}, Lcom/shopkick/app/store/StoreDetailsScreen$4;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen;Landroid/os/Handler;)V

    const-wide/16 v3, 0x64

    .line 1543
    invoke-virtual {v0, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public startStoreDetailsLesson(Ljava/lang/String;IIII)V
    .locals 3

    .line 277
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->isFTUEEnabled:Z

    if-nez v0, :cond_0

    return-void

    .line 279
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/store/StoreDetailsScreen;

    if-eqz v0, :cond_1

    .line 280
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->isActiveScreen()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 281
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    .line 282
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 283
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainName:Ljava/lang/String;

    .line 284
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->scanKickAmount:Ljava/lang/Integer;

    .line 285
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->walkinKickAmount:Ljava/lang/Integer;

    .line 286
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->userScanCount:Ljava/lang/Integer;

    .line 287
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->userWalkinCount:Ljava/lang/Integer;

    .line 288
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object p1

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    .line 289
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsScreen;->logStoreDetailsLessonTheUserStartedTheLesson()V

    :cond_1
    return-void
.end method

.method public walkinCheckmarkCoordinates()[I
    .locals 1

    .line 499
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->walkinCheckmarkCoordinates()[I

    move-result-object v0

    return-object v0
.end method

.method public walkinCheckmarkDimensions()[I
    .locals 1

    .line 503
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen;->storeDetailsAdapter:Lcom/shopkick/app/store/StoreDetailsAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->walkinCheckmarkDimensions()[I

    move-result-object v0

    return-object v0
.end method
