.class public Lcom/shopkick/app/store/CarouselPromoController;
.super Ljava/lang/Object;
.source "CarouselPromoController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;,
        Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerRunnable;,
        Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoOnPageChangeListener;
    }
.end annotation


# static fields
.field static final CAROUSEL_CELL_VISIBLE:Ljava/lang/String; = "CAROUSEL_CELL_VISIBLE"

.field private static final CAROUSEL_LOOP_COUNT:I = 0x64

.field private static final CAROUSEL_PROMO_TILE_TAG:Ljava/lang/String; = "CAROUSEL_PROMO_TILE_TAG"

.field static final CAROUSEL_ROW_VISIBLE:Ljava/lang/String; = "CAROUSEL_ROW_VISIBLE"

.field private static final DEFAULT_SLIDING_PROMO_VIEW_PAGER_HEIGHT:I = 0xa0

.field private static final DEFAULT_SLIDING_PROMO_VIEW_PAGER_WIDTH:I = 0x140

.field private static final DEFAULT_VIEW_PAGER_HEIGHT:I = 0xa0

.field private static final DEFAULT_VIEW_PAGER_WIDTH:I = 0x140

.field private static final PROMO_PAGER_HORIZONTAL_PADDING:I = 0x14

.field private static final PROMO_PAGER_VERTICAL_PADDING:I = 0xa


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private carouselIsVisible:Z

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private context:Landroid/content/Context;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private mikaReceiverPromoConfigurator:Lcom/shopkick/app/store/MikaReceiverPromoConfigurator;

.field private offlineEducationV3PromoConfigurator:Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;

.field private promoTiles:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private promoView:Lcom/shopkick/app/widget/UserEventFrameLayout;

.field private receiptKickPromoConfigurator:Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;

.field private recyclerViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

.field private recyclerViewImageController:Lcom/shopkick/app/controllers/RecyclerViewImageController;

.field private redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

.field private scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

.field shouldRefreshImages:Z

.field private simplePromoConfigurator:Lcom/shopkick/app/store/SimplePromoConfigurator;

.field private slidingPromoIndicatorLayout:Landroid/widget/RelativeLayout;

.field private slidingPromoPageIndicator:Lcom/shopkick/app/widget/PageIndicator;

.field private slidingPromoTimer:Ljava/util/Timer;

.field private slidingPromoViewPager:Landroid/support/v4/view/ViewPager;

.field private slidingPromoViewPagerAdapter:Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;

.field private slidingPromoViewPagerCurrentPage:I

.field private slidingPromoViewPagerHandler:Landroid/os/Handler;

.field private slidingPromoViewPagerRunnable:Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerRunnable;

.field supportedPromoConfigurators:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/shopkick/app/store/PromoConfigurator;",
            ">;"
        }
    .end annotation
.end field

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

.field private verticalListDataPos:I

.field private videoController:Lcom/shopkick/app/video/VideoController;

.field private videoPromoConfigurator:Lcom/shopkick/app/store/VideoPromoConfigurator;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/controllers/RecyclerViewImageController;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 10

    move-object v0, p0

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v1, 0x64

    .line 60
    iput v1, v0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerCurrentPage:I

    const/4 v1, 0x0

    .line 67
    iput-object v1, v0, Lcom/shopkick/app/store/CarouselPromoController;->promoView:Lcom/shopkick/app/widget/UserEventFrameLayout;

    .line 71
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, v0, Lcom/shopkick/app/store/CarouselPromoController;->supportedPromoConfigurators:Ljava/util/Set;

    const/4 v1, 0x0

    .line 72
    iput-boolean v1, v0, Lcom/shopkick/app/store/CarouselPromoController;->shouldRefreshImages:Z

    .line 80
    iput-boolean v1, v0, Lcom/shopkick/app/store/CarouselPromoController;->carouselIsVisible:Z

    move-object v1, p1

    .line 111
    iput-object v1, v0, Lcom/shopkick/app/store/CarouselPromoController;->context:Landroid/content/Context;

    move-object/from16 v1, p6

    .line 112
    iput-object v1, v0, Lcom/shopkick/app/store/CarouselPromoController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v1, p5

    .line 113
    iput-object v1, v0, Lcom/shopkick/app/store/CarouselPromoController;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    move-object v1, p2

    .line 114
    iput-object v1, v0, Lcom/shopkick/app/store/CarouselPromoController;->recyclerViewImageController:Lcom/shopkick/app/controllers/RecyclerViewImageController;

    move-object/from16 v1, p7

    .line 115
    iput-object v1, v0, Lcom/shopkick/app/store/CarouselPromoController;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    move-object/from16 v1, p8

    .line 116
    iput-object v1, v0, Lcom/shopkick/app/store/CarouselPromoController;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    move-object/from16 v1, p9

    .line 117
    iput-object v1, v0, Lcom/shopkick/app/store/CarouselPromoController;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 118
    new-instance v9, Lcom/shopkick/app/account/AgeVerificationController;

    move-object v1, v9

    move-object/from16 v2, p12

    move-object/from16 v3, p11

    move-object v4, p3

    move-object/from16 v5, p10

    move-object/from16 v6, p13

    move-object/from16 v7, p14

    move-object/from16 v8, p15

    invoke-direct/range {v1 .. v8}, Lcom/shopkick/app/account/AgeVerificationController;-><init>(Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/screens/AppScreen;)V

    iput-object v9, v0, Lcom/shopkick/app/store/CarouselPromoController;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    move-object v1, p3

    move-object v2, p4

    .line 120
    invoke-direct {p0, p3, p4}, Lcom/shopkick/app/store/CarouselPromoController;->initializeInstanceVars(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;)V

    .line 121
    invoke-direct {p0}, Lcom/shopkick/app/store/CarouselPromoController;->initializePromoConfigurators()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerRunnable;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerRunnable:Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerRunnable;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/store/CarouselPromoController;)Landroid/os/Handler;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/controllers/RecyclerViewImageController;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/store/CarouselPromoController;->recyclerViewImageController:Lcom/shopkick/app/controllers/RecyclerViewImageController;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/store/CarouselPromoController;->recyclerViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    return-object p0
.end method

.method static synthetic access$1300(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/url/URLDispatcher;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/store/CarouselPromoController;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoTiles:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$300(II)I
    .locals 0

    .line 44
    invoke-static {p0, p1}, Lcom/shopkick/app/store/CarouselPromoController;->getSafeTilePosition(II)I

    move-result p0

    return p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/widget/PageIndicator;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoPageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/store/CarouselPromoController;)I
    .locals 0

    .line 44
    iget p0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerCurrentPage:I

    return p0
.end method

.method static synthetic access$502(Lcom/shopkick/app/store/CarouselPromoController;I)I
    .locals 0

    .line 44
    iput p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerCurrentPage:I

    return p1
.end method

.method static synthetic access$508(Lcom/shopkick/app/store/CarouselPromoController;)I
    .locals 2

    .line 44
    iget v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerCurrentPage:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerCurrentPage:I

    return v0
.end method

.method static synthetic access$600(Lcom/shopkick/app/store/CarouselPromoController;)Landroid/support/v4/view/ViewPager;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPager:Landroid/support/v4/view/ViewPager;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/widget/UserEventFrameLayout;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoView:Lcom/shopkick/app/widget/UserEventFrameLayout;

    return-object p0
.end method

.method static synthetic access$800(Lcom/shopkick/app/store/CarouselPromoController;)I
    .locals 0

    .line 44
    iget p0, p0, Lcom/shopkick/app/store/CarouselPromoController;->verticalListDataPos:I

    return p0
.end method

.method static synthetic access$900(Lcom/shopkick/app/store/CarouselPromoController;)Z
    .locals 0

    .line 44
    iget-boolean p0, p0, Lcom/shopkick/app/store/CarouselPromoController;->carouselIsVisible:Z

    return p0
.end method

.method private static getSafeTilePosition(II)I
    .locals 0

    if-lez p1, :cond_0

    .line 416
    rem-int/2addr p0, p1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private initializeInstanceVars(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 1

    .line 147
    new-instance v0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;-><init>(Lcom/shopkick/app/store/CarouselPromoController;)V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerAdapter:Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;

    .line 148
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerHandler:Landroid/os/Handler;

    .line 149
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoTimer:Ljava/util/Timer;

    .line 150
    new-instance v0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerRunnable;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerRunnable;-><init>(Lcom/shopkick/app/store/CarouselPromoController;)V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerRunnable:Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerRunnable;

    .line 151
    iput-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 152
    iput-object p2, p0, Lcom/shopkick/app/store/CarouselPromoController;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 153
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoTiles:Ljava/util/ArrayList;

    return-void
.end method

.method private initializePromoConfigurators()V
    .locals 11

    .line 125
    new-instance v0, Lcom/shopkick/app/store/SimplePromoConfigurator;

    iget-object v1, p0, Lcom/shopkick/app/store/CarouselPromoController;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/shopkick/app/store/CarouselPromoController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v3, p0, Lcom/shopkick/app/store/CarouselPromoController;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    iget-object v4, p0, Lcom/shopkick/app/store/CarouselPromoController;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/shopkick/app/store/SimplePromoConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/account/AgeVerificationController;)V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->simplePromoConfigurator:Lcom/shopkick/app/store/SimplePromoConfigurator;

    .line 127
    new-instance v0, Lcom/shopkick/app/store/MikaReceiverPromoConfigurator;

    iget-object v1, p0, Lcom/shopkick/app/store/CarouselPromoController;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/shopkick/app/store/CarouselPromoController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v3, p0, Lcom/shopkick/app/store/CarouselPromoController;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/store/MikaReceiverPromoConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->mikaReceiverPromoConfigurator:Lcom/shopkick/app/store/MikaReceiverPromoConfigurator;

    .line 128
    new-instance v0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;

    iget-object v1, p0, Lcom/shopkick/app/store/CarouselPromoController;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/shopkick/app/store/CarouselPromoController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v3, p0, Lcom/shopkick/app/store/CarouselPromoController;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    iget-object v4, p0, Lcom/shopkick/app/store/CarouselPromoController;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/account/AgeVerificationController;)V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->receiptKickPromoConfigurator:Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;

    .line 130
    new-instance v0, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;

    iget-object v6, p0, Lcom/shopkick/app/store/CarouselPromoController;->context:Landroid/content/Context;

    iget-object v7, p0, Lcom/shopkick/app/store/CarouselPromoController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v8, p0, Lcom/shopkick/app/store/CarouselPromoController;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    iget-object v9, p0, Lcom/shopkick/app/store/CarouselPromoController;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v10, p0, Lcom/shopkick/app/store/CarouselPromoController;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;)V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->offlineEducationV3PromoConfigurator:Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;

    .line 135
    new-instance v0, Lcom/shopkick/app/store/VideoPromoConfigurator;

    iget-object v1, p0, Lcom/shopkick/app/store/CarouselPromoController;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/shopkick/app/store/CarouselPromoController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v3, p0, Lcom/shopkick/app/store/CarouselPromoController;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    iget-object v4, p0, Lcom/shopkick/app/store/CarouselPromoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/shopkick/app/store/VideoPromoConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/video/VideoController;)V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->videoPromoConfigurator:Lcom/shopkick/app/store/VideoPromoConfigurator;

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->supportedPromoConfigurators:Ljava/util/Set;

    iget-object v1, p0, Lcom/shopkick/app/store/CarouselPromoController;->simplePromoConfigurator:Lcom/shopkick/app/store/SimplePromoConfigurator;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->supportedPromoConfigurators:Ljava/util/Set;

    iget-object v1, p0, Lcom/shopkick/app/store/CarouselPromoController;->mikaReceiverPromoConfigurator:Lcom/shopkick/app/store/MikaReceiverPromoConfigurator;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->supportedPromoConfigurators:Ljava/util/Set;

    iget-object v1, p0, Lcom/shopkick/app/store/CarouselPromoController;->offlineEducationV3PromoConfigurator:Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->supportedPromoConfigurators:Ljava/util/Set;

    iget-object v1, p0, Lcom/shopkick/app/store/CarouselPromoController;->videoPromoConfigurator:Lcom/shopkick/app/store/VideoPromoConfigurator;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private markSlidingPromoViewPagerVisible(Z)V
    .locals 4

    .line 327
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPager:Landroid/support/v4/view/ViewPager;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 330
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 331
    iget-object v1, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPager:Landroid/support/v4/view/ViewPager;

    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->promoCarouselTileTag(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 332
    iget-object v2, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 333
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/shopkick/app/store/CarouselPromoController;->getPromoConfigurator(I)Lcom/shopkick/app/store/PromoConfigurator;

    move-result-object v2

    if-eqz p1, :cond_1

    const-string v3, "CAROUSEL_ROW_VISIBLE"

    .line 335
    invoke-virtual {v2, v1, v3}, Lcom/shopkick/app/store/PromoConfigurator;->removeImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string v3, "CAROUSEL_ROW_VISIBLE"

    .line 337
    invoke-virtual {v2, v1, v3}, Lcom/shopkick/app/store/PromoConfigurator;->addImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method static promoCarouselTileTag(I)Ljava/lang/String;
    .locals 1

    .line 297
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "CAROUSEL_PROMO_TILE_TAG"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private setupSlidingPromoPageIndicator()V
    .locals 4

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 204
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoIndicatorLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoPageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    iget-object v2, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoIndicatorLayout:Landroid/widget/RelativeLayout;

    iget-object v3, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerAdapter:Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;

    invoke-virtual {v3}, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;->getCount()I

    move-result v3

    div-int/lit8 v3, v3, 0x64

    invoke-virtual {v0, v2, v3, v1}, Lcom/shopkick/app/widget/PageIndicator;->configureIndicators(Landroid/widget/RelativeLayout;II)V

    goto :goto_0

    .line 207
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoIndicatorLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private setupSlidingPromoViewpager(Landroid/support/v4/view/ViewPager;)V
    .locals 3

    .line 212
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoView:Lcom/shopkick/app/widget/UserEventFrameLayout;

    const/16 v1, 0xa0

    const/16 v2, 0x140

    invoke-static {v0, v2, v1}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;II)V

    .line 215
    invoke-static {p1, v2, v1}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;II)V

    const/4 v0, 0x0

    .line 219
    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 221
    invoke-direct {p0}, Lcom/shopkick/app/store/CarouselPromoController;->setupSlidingPromoPageIndicator()V

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerAdapter:Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 223
    iget v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerCurrentPage:I

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 224
    invoke-direct {p0}, Lcom/shopkick/app/store/CarouselPromoController;->startSlidingPromoViewPager()V

    return-void
.end method

.method private startSlidingPromoViewPager()V
    .locals 9

    .line 228
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoTimer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 229
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoTimer:Ljava/util/Timer;

    .line 230
    iget-object v1, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoTimer:Ljava/util/Timer;

    new-instance v2, Lcom/shopkick/app/store/CarouselPromoController$1;

    invoke-direct {v2, p0}, Lcom/shopkick/app/store/CarouselPromoController$1;-><init>(Lcom/shopkick/app/store/CarouselPromoController;)V

    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->promoCarouselAutoAdvanceInitialInterval:Ljava/lang/Double;

    .line 235
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    const-wide v5, 0x408f400000000000L    # 1000.0

    mul-double/2addr v3, v5

    double-to-int v0, v3

    int-to-long v3, v0

    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->promoCarouselAutoAdvanceInterval:Ljava/lang/Double;

    .line 236
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    mul-double/2addr v7, v5

    double-to-int v0, v7

    int-to-long v5, v0

    .line 230
    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 0

    return-void
.end method

.method public containsTileOfType(I)Z
    .locals 3

    .line 281
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoTiles:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 284
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 285
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1

    :cond_3
    :goto_0
    return v1
.end method

.method public getPromoConfigurator(I)Lcom/shopkick/app/store/PromoConfigurator;
    .locals 1

    const/16 v0, 0x2a

    if-eq p1, v0, :cond_2

    const/16 v0, 0x71

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3f6

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    .line 168
    iget-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->simplePromoConfigurator:Lcom/shopkick/app/store/SimplePromoConfigurator;

    return-object p1

    .line 162
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->receiptKickPromoConfigurator:Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;

    return-object p1

    .line 164
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->offlineEducationV3PromoConfigurator:Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;

    return-object p1

    .line 166
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->videoPromoConfigurator:Lcom/shopkick/app/store/VideoPromoConfigurator;

    return-object p1

    .line 159
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->mikaReceiverPromoConfigurator:Lcom/shopkick/app/store/MikaReceiverPromoConfigurator;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x6e
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public insertPromoTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 267
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoTiles:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 269
    iget-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->supportedPromoConfigurators:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/PromoConfigurator;

    .line 270
    invoke-virtual {v0}, Lcom/shopkick/app/store/PromoConfigurator;->resetState()V

    goto :goto_0

    .line 273
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPager:Landroid/support/v4/view/ViewPager;

    if-eqz p1, :cond_1

    .line 274
    invoke-direct {p0}, Lcom/shopkick/app/store/CarouselPromoController;->setupSlidingPromoPageIndicator()V

    .line 275
    iget-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPager:Landroid/support/v4/view/ViewPager;

    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerAdapter:Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 276
    invoke-direct {p0}, Lcom/shopkick/app/store/CarouselPromoController;->startSlidingPromoViewPager()V

    :cond_1
    return-void
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 0

    return-void
.end method

.method public markNotVisible()V
    .locals 1

    const/4 v0, 0x0

    .line 322
    iput-boolean v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->carouselIsVisible:Z

    .line 323
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/CarouselPromoController;->markSlidingPromoViewPagerVisible(Z)V

    return-void
.end method

.method public markVisible()V
    .locals 1

    const/4 v0, 0x1

    .line 313
    iput-boolean v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->carouselIsVisible:Z

    .line 314
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/CarouselPromoController;->markSlidingPromoViewPagerVisible(Z)V

    return-void
.end method

.method numTiles()I
    .locals 1

    .line 293
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 2

    .line 190
    iput-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->recyclerViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 191
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->verticalListDataPos:I

    .line 192
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v0, Lcom/shopkick/app/widget/UserEventFrameLayout;

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoView:Lcom/shopkick/app/widget/UserEventFrameLayout;

    const v0, 0x7f0906b1

    .line 195
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPager:Landroid/support/v4/view/ViewPager;

    .line 196
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPager:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoOnPageChangeListener;

    invoke-direct {v1, p0}, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoOnPageChangeListener;-><init>(Lcom/shopkick/app/store/CarouselPromoController;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    const v0, 0x7f0906b0

    .line 197
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoIndicatorLayout:Landroid/widget/RelativeLayout;

    .line 198
    new-instance p1, Lcom/shopkick/app/widget/PageIndicator;

    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->context:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/shopkick/app/widget/PageIndicator;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoPageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    .line 199
    iget-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPager:Landroid/support/v4/view/ViewPager;

    invoke-direct {p0, p1}, Lcom/shopkick/app/store/CarouselPromoController;->setupSlidingPromoViewpager(Landroid/support/v4/view/ViewPager;)V

    return-void
.end method

.method promoCarouselHeight()F
    .locals 4

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/16 v1, 0x14

    .line 179
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result v0

    int-to-float v0, v0

    mul-int/lit8 v1, v1, 0x2

    .line 180
    iget-object v3, p0, Lcom/shopkick/app/store/CarouselPromoController;->context:Landroid/content/Context;

    invoke-static {v1, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    const/16 v1, 0x140

    iget-object v3, p0, Lcom/shopkick/app/store/CarouselPromoController;->context:Landroid/content/Context;

    .line 181
    invoke-static {v1, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/16 v1, 0xa0

    .line 182
    iget-object v3, p0, Lcom/shopkick/app/store/CarouselPromoController;->context:Landroid/content/Context;

    invoke-static {v1, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v0

    if-eqz v2, :cond_1

    const/16 v0, 0xa

    .line 184
    iget-object v2, p0, Lcom/shopkick/app/store/CarouselPromoController;->context:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    add-float/2addr v1, v0

    :cond_1
    return v1
.end method

.method public setData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 244
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoTiles:Ljava/util/ArrayList;

    goto :goto_0

    .line 246
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->promoTiles:Ljava/util/ArrayList;

    :goto_0
    const/16 p1, 0x64

    .line 250
    iput p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerCurrentPage:I

    .line 251
    iget-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->supportedPromoConfigurators:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/PromoConfigurator;

    .line 252
    invoke-virtual {v0}, Lcom/shopkick/app/store/PromoConfigurator;->resetState()V

    goto :goto_1

    .line 255
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPager:Landroid/support/v4/view/ViewPager;

    if-eqz p1, :cond_2

    .line 256
    invoke-direct {p0}, Lcom/shopkick/app/store/CarouselPromoController;->setupSlidingPromoPageIndicator()V

    .line 257
    iget-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPager:Landroid/support/v4/view/ViewPager;

    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController;->slidingPromoViewPagerAdapter:Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 258
    invoke-direct {p0}, Lcom/shopkick/app/store/CarouselPromoController;->startSlidingPromoViewPager()V

    :cond_2
    return-void
.end method
