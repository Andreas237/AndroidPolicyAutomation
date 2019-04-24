.class public Lcom/shopkick/app/products/ScanV2Screen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ScanV2Screen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/products/ScanV2Screen$OverlayListener;,
        Lcom/shopkick/app/products/ScanV2Screen$BarcodeListener;
    }
.end annotation


# static fields
.field private static final DELAY_AFTER_REQUEST_TO_RESUME_SCANNING:I = 0x7d0

.field private static final MAX_DISPLAY_TOOLTIP_UNAVAILABLE_REPORT_TOOLTIP:I = 0x5

.field private static final MAX_NUM_PRODUCT_TILE_SHOWN:I = 0x3

.field public static final SCAN_AVAILABLE_RECEIPT_KICKS:Ljava/lang/String; = "availableReceiptKicks"

.field public static final SCAN_CHAIN_ID:Ljava/lang/String; = "chainId"

.field public static final SCAN_ERROR_AUTO_DISMISS_DURATION_MS:Ljava/lang/Long;

.field public static final SCAN_KICKS_EARNED:Ljava/lang/String; = "kicksEarned"

.field public static final SCAN_LOCATION_ID:Ljava/lang/String; = "locId"

.field public static final SCAN_OFFER_USER_DATA:Ljava/lang/String; = "scanOfferUserData"

.field private static final SCAN_SCREEN_TILE_HEIGHT:I = 0x58

.field public static final SCAN_SUCCEEDED:Ljava/lang/String; = "ScanSucceeded"

.field public static final SCAN_TILE_INFO:Ljava/lang/String; = "scanTileInfo"

.field public static final SCAN_TOTAL_RECEIPT_KICKS:Ljava/lang/String; = "totalReceiptKicks"

.field public static final SCAN_TOTAL_TRIP_KICKS:Ljava/lang/String; = "totalTripKicks"

.field private static final SKU_INDEX_IN_REGEX_MASK:I = 0x1


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private bundleId:Ljava/lang/String;

.field private chainId:Ljava/lang/String;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private isTooltipAnimated:Z

.field private isTorchOn:Z

.field private isViewFinderAnimated:Z

.field private locationId:Ljava/lang/String;

.field private mHandler:Landroid/os/Handler;

.field private mainView:Landroid/widget/RelativeLayout;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field private productFamilyIds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private removeScreen:Z

.field private scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

.field private scanStatus:I

.field private scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

.field private seeMoreScansUrl:Ljava/lang/String;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field public validatingScanDialog:Landroid/app/ProgressDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0xbb8

    .line 90
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/products/ScanV2Screen;->SCAN_ERROR_AUTO_DISMISS_DURATION_MS:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 78
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->productFamilyIds:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 113
    iput-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    const/4 v0, 0x0

    .line 119
    iput-boolean v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->isViewFinderAnimated:Z

    .line 120
    iput-boolean v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->isTorchOn:Z

    .line 123
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/products/ScanV2Screen;)Ljava/util/ArrayList;
    .locals 0

    .line 78
    iget-object p0, p0, Lcom/shopkick/app/products/ScanV2Screen;->productFamilyIds:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/products/ScanV2Screen;Ljava/lang/String;[B)V
    .locals 0

    .line 78
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/products/ScanV2Screen;->validateBarcode(Ljava/lang/String;[B)V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/products/ScanV2Screen;)Z
    .locals 0

    .line 78
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->canAdjustScanController()Z

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/products/ScanV2Screen;)Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;
    .locals 0

    .line 78
    iget-object p0, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    return-object p0
.end method

.method static synthetic access$402(Lcom/shopkick/app/products/ScanV2Screen;I)I
    .locals 0

    .line 78
    iput p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanStatus:I

    return p1
.end method

.method private animateViewfinder()V
    .locals 11

    .line 324
    iget-boolean v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->isViewFinderAnimated:Z

    if-eqz v0, :cond_0

    return-void

    .line 326
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090811

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 327
    new-instance v10, Landroid/view/animation/TranslateAnimation;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    const v7, 0x3ee66666    # 0.45f

    const/4 v8, 0x2

    const/high16 v9, 0x3f000000    # 0.5f

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    const-wide/16 v1, 0x1f4

    .line 335
    invoke-virtual {v10, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    const/4 v1, 0x2

    .line 336
    invoke-virtual {v10, v1}, Landroid/view/animation/TranslateAnimation;->setRepeatMode(I)V

    const/4 v1, -0x1

    .line 337
    invoke-virtual {v10, v1}, Landroid/view/animation/TranslateAnimation;->setRepeatCount(I)V

    .line 338
    invoke-virtual {v0, v10}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v1, 0x0

    .line 339
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x1

    .line 340
    iput-boolean v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->isViewFinderAnimated:Z

    return-void
.end method

.method private canAdjustScanController()Z
    .locals 2

    .line 404
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    if-eqz v0, :cond_0

    const-string v0, "android.permission.CAMERA"

    .line 405
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanV2Screen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private getUnfetchedProductIds()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 256
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 257
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->productFamilyIds:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 258
    iget-object v3, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForProductFamilyId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object v3

    if-nez v3, :cond_0

    .line 259
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private isScanMissionComplete()Z
    .locals 3

    .line 370
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->productFamilyIds:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 371
    iget-object v2, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForProductFamilyId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static synthetic lambda$2RuZytzKAgfvWK-g5kd-OQnFtpI(Lcom/shopkick/app/products/ScanV2Screen;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->animateViewfinder()V

    return-void
.end method

.method public static synthetic lambda$createScreen$203(Lcom/shopkick/app/products/ScanV2Screen;Landroid/view/View;)V
    .locals 1

    .line 242
    iget-boolean v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->isTorchOn:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->isTorchOn:Z

    .line 243
    iget-boolean v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->isTorchOn:Z

    if-eqz v0, :cond_0

    const v0, 0x7f08029d

    goto :goto_0

    :cond_0
    const v0, 0x7f08029c

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 244
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    iget-boolean v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->isTorchOn:Z

    invoke-virtual {p1, v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->switchTorchOn(Z)V

    return-void
.end method

.method public static synthetic lambda$onEvent$204(Lcom/shopkick/app/products/ScanV2Screen;)V
    .locals 1

    .line 496
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->resumeBCScanning()V

    return-void
.end method

.method private maybeShowTooltip()V
    .locals 6

    .line 344
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->locationId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->productFamilyIds:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->chainId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 345
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->getUnfetchedProductIds()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    .line 347
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanV2Screen;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v2, p0, Lcom/shopkick/app/products/ScanV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->getInstance(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;

    move-result-object v0

    .line 351
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->productFamilyIds:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x1

    move v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 352
    iget-object v5, p0, Lcom/shopkick/app/products/ScanV2Screen;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v4, v5}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->isReported(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    and-int/2addr v3, v4

    goto :goto_0

    :cond_1
    if-nez v3, :cond_4

    .line 355
    iget-boolean v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->isTooltipAnimated:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getProductUnavailableReportTooltipDisplayCount()I

    move-result v0

    const/4 v1, 0x5

    if-gt v0, v1, :cond_4

    .line 357
    iput-boolean v2, p0, Lcom/shopkick/app/products/ScanV2Screen;->isTooltipAnimated:Z

    .line 358
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 359
    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    .line 360
    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 361
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findViewHolderForAdapterPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 364
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/16 v2, 0x49

    invoke-virtual {v1, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;

    iget-object v2, p0, Lcom/shopkick/app/products/ScanV2Screen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 365
    invoke-virtual {v2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findViewHolderForAdapterPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v0

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->animateReportButtonToolTip(Landroid/view/View;)V

    goto :goto_2

    :cond_3
    :goto_1
    return-void

    :cond_4
    :goto_2
    return-void

    :cond_5
    :goto_3
    return-void
.end method

.method private populateScanInfos()V
    .locals 4

    .line 266
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->getUnfetchedProductIds()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 270
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 271
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 272
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 273
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->productFamilyIds:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 274
    iget-object v3, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 275
    invoke-virtual {v3, v2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForProductFamilyId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object v2

    .line 274
    invoke-static {v2}, Lcom/shopkick/app/util/TileUtils;->convertProductScanInfoToTileInfo(Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v2

    const/16 v3, 0x49

    .line 276
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    .line 277
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 279
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    .line 280
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method private validateBarcode(Ljava/lang/String;[B)V
    .locals 12

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    .line 286
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->validatingScanDialog:Landroid/app/ProgressDialog;

    if-nez v1, :cond_0

    .line 287
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanV2Screen;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, ""

    const v3, 0x7f11062b

    .line 288
    invoke-virtual {p0, v3}, Lcom/shopkick/app/products/ScanV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 287
    invoke-static {v1, v2, v3}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/ProgressDialog;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->validatingScanDialog:Landroid/app/ProgressDialog;

    goto :goto_0

    .line 290
    :cond_0
    invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V

    .line 292
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->handleRegexMatchForBarcodes:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->regexBarcodeMatchList:Ljava/util/List;

    if-eqz v1, :cond_2

    .line 294
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->regexBarcodeMatchList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 295
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 296
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 297
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v3

    if-lt v3, v0, :cond_1

    .line 298
    invoke-virtual {v2, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    move-object v2, p1

    goto :goto_1

    :cond_2
    move-object v2, p1

    .line 304
    :goto_1
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v4, p0, Lcom/shopkick/app/products/ScanV2Screen;->productFamilyIds:Ljava/util/ArrayList;

    iget-object v5, p0, Lcom/shopkick/app/products/ScanV2Screen;->bundleId:Ljava/lang/String;

    iget-object v6, p0, Lcom/shopkick/app/products/ScanV2Screen;->locationId:Ljava/lang/String;

    iget-object v7, p0, Lcom/shopkick/app/products/ScanV2Screen;->chainId:Ljava/lang/String;

    iget-object v8, p0, Lcom/shopkick/app/products/ScanV2Screen;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v9, p0, Lcom/shopkick/app/products/ScanV2Screen;->validatingScanDialog:Landroid/app/ProgressDialog;

    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v10, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v11, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    move-object v3, p2

    invoke-virtual/range {v1 .. v11}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->requestValidateBarcode(Ljava/lang/String;[BLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/DeviceInfo;Landroid/app/ProgressDialog;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;)V

    .line 315
    :cond_3
    sget p1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->sessionScanCount:I

    add-int/2addr p1, v0

    sput p1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->sessionScanCount:I

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    .line 181
    iget-object p2, p0, Lcom/shopkick/app/products/ScanV2Screen;->productFamilyIds:Ljava/util/ArrayList;

    const/4 p3, 0x0

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    goto/16 :goto_3

    :cond_0
    const p2, 0x7f0c0199

    const/4 v0, 0x0

    .line 187
    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    .line 188
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f090605

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 189
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance p2, Lcom/shopkick/app/products/ScanV2Screen$1;

    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanV2Screen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, p0, v1}, Lcom/shopkick/app/products/ScanV2Screen$1;-><init>(Lcom/shopkick/app/products/ScanV2Screen;Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 195
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->productFamilyIds:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 p2, 0x3

    if-lt p1, p2, :cond_1

    move p1, p2

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->productFamilyIds:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    .line 196
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    mul-int/lit8 p1, p1, 0x58

    int-to-float p1, p1

    .line 198
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanV2Screen;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    const/4 v3, 0x1

    .line 197
    invoke-static {v3, p1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    iput p1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 199
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 200
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->productFamilyIds:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const v1, 0x7f09079f

    const/4 v2, -0x1

    if-lt p1, p2, :cond_2

    .line 201
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f0907e5

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const v4, 0x3e4ccccd    # 0.2f

    invoke-direct {p2, v2, v0, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 203
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f090458

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p2, v2, v0, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 205
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f09080e

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const v4, 0x3f4ccccd    # 0.8f

    invoke-direct {p2, v2, v0, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 207
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 209
    :cond_2
    new-instance v9, Ljava/util/HashSet;

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Integer;

    .line 210
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v0

    const/16 p2, 0x49

    .line 211
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v3

    .line 209
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v9, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 212
    new-instance p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v5, p0, Lcom/shopkick/app/products/ScanV2Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v8, p0, Lcom/shopkick/app/products/ScanV2Screen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v10, 0x0

    move-object v4, p1

    move-object v6, p0

    move-object v7, p0

    invoke-direct/range {v4 .. v10}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 214
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addLoadingTile()V

    .line 215
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object p2, p0, Lcom/shopkick/app/products/ScanV2Screen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 216
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->populateScanInfos()V

    const p1, 0x7f110628

    .line 217
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanV2Screen;->setAppScreenTitle(I)V

    .line 218
    invoke-virtual {p0, v3}, Lcom/shopkick/app/products/ScanV2Screen;->setHasOptionsMenu(Z)V

    .line 220
    new-instance p1, Lcom/shopkick/app/permissions/PermissionsRequestController;

    iget-object p2, p0, Lcom/shopkick/app/products/ScanV2Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {p1, p0, p2}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 221
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string p2, "android.permission.CAMERA"

    iget-object v3, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    const v4, 0x7f09051d

    .line 222
    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 221
    invoke-virtual {p1, p2, v3}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    .line 225
    :try_start_0
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->useScanControllerV2(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 226
    new-instance p1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;

    iget-object p2, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {p2}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/app/products/ScanV2Screen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p2, p0, Lcom/shopkick/app/products/ScanV2Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v6, p2, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v7, p0, Lcom/shopkick/app/products/ScanV2Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v8, p0, Lcom/shopkick/app/products/ScanV2Screen;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/DeviceInfo;)V

    iput-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    goto :goto_1

    .line 228
    :cond_3
    new-instance p1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget-object p2, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {p2}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/app/products/ScanV2Screen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p2, p0, Lcom/shopkick/app/products/ScanV2Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v6, p2, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v7, p0, Lcom/shopkick/app/products/ScanV2Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v8, p0, Lcom/shopkick/app/products/ScanV2Screen;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/DeviceInfo;)V

    iput-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    .line 230
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    if-eqz p1, :cond_4

    const-string p1, "android.permission.CAMERA"

    .line 231
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanV2Screen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 232
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    return-object p1

    .line 234
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    new-instance p2, Lcom/shopkick/app/products/ScanV2Screen$BarcodeListener;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {p2, v3}, Lcom/shopkick/app/products/ScanV2Screen$BarcodeListener;-><init>(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->setScanBarcodeListener(Lcom/shopkick/app/products/scanning/interfaces/ScanBCListener;)V

    .line 235
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanV2Screen;->getContext()Landroid/content/Context;

    move-result-object p2

    iget-object v3, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    const v4, 0x7f090611

    .line 236
    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    iget-object v4, p0, Lcom/shopkick/app/products/ScanV2Screen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 235
    invoke-virtual {p1, p2, v3, v4}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->initAndStartScanning(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/shopkick/app/application/AppPreferences;)V

    .line 238
    iput v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanStatus:I

    .line 241
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/shopkick/app/products/-$$Lambda$ScanV2Screen$X7zcLGjT8u37WpuiFBlJMUbQ-20;

    invoke-direct {p2, p0}, Lcom/shopkick/app/products/-$$Lambda$ScanV2Screen$X7zcLGjT8u37WpuiFBlJMUbQ-20;-><init>(Lcom/shopkick/app/products/ScanV2Screen;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 247
    iput-object p3, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    .line 248
    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 249
    iput v2, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanStatus:I

    .line 252
    :goto_2
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    return-object p1

    .line 182
    :cond_5
    :goto_3
    const-class p1, Lcom/shopkick/app/products/ScanV2Screen;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ARGS WERE NULL and we didn\'t have any product info in the bundle"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x3fd

    .line 183
    invoke-static {p1}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    return-object p3
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    const/4 p1, 0x0

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

    .line 127
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 128
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 129
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 130
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 131
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 132
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 133
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 134
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 136
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 137
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "SCAN_ANIMATION_CONTROLLER_SEE_MORE_SCANS_TAPPED_NOTIFCATION"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 138
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "scanBarcodeResponseCompleted"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 139
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "scanBarcodeResponseFailure"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 140
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "scanBarcodeErrorWithStatus"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 141
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "offlineScanOverlayDismissed"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "location_id"

    .line 143
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->locationId:Ljava/lang/String;

    const-string p1, "chain_id"

    .line 144
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->chainId:Ljava/lang/String;

    const-string p1, "bundle_id"

    .line 145
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->bundleId:Ljava/lang/String;

    const-string p1, "product_family_ids"

    .line 146
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 147
    new-instance p1, Ljava/util/ArrayList;

    const-string v0, "product_family_ids"

    .line 148
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string v0, ","

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    .line 147
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->productFamilyIds:Ljava/util/ArrayList;

    .line 151
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->getUnfetchedProductIds()Ljava/util/ArrayList;

    move-result-object p1

    .line 152
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    .line 153
    iget-object p2, p0, Lcom/shopkick/app/products/ScanV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "scansBarcodeUpdatedEvent"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 154
    iget-object p2, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->fetchScanInfos(Ljava/util/List;)V

    .line 156
    :cond_1
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanV2Screen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    const v0, 0x7f0d0006

    .line 591
    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 161
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    if-eqz v0, :cond_0

    .line 162
    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->onDestroy()V

    :cond_0
    const/4 v0, 0x0

    .line 164
    iput-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    .line 166
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->clearStateOnScreenDestroyed()V

    .line 168
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->validatingScanDialog:Landroid/app/ProgressDialog;

    if-eqz v1, :cond_1

    .line 169
    invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 172
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 174
    iput-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    .line 175
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 9
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

    .line 433
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "SCAN_ANIMATION_CONTROLLER_SEE_MORE_SCANS_TAPPED_NOTIFCATION"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v2

    goto :goto_1

    :sswitch_1
    const-string v0, "scansBarcodeUpdatedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    goto :goto_1

    :sswitch_2
    const-string v0, "scanBarcodeResponseCompleted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_3
    const-string v0, "UserAccountIdChangedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :sswitch_4
    const-string v0, "scanBarcodeResponseFailure"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :sswitch_5
    const-string v0, "scanBarcodeErrorWithStatus"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x5

    goto :goto_1

    :sswitch_6
    const-string v0, "offlineScanOverlayDismissed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_1

    :cond_0
    :goto_0
    move p1, v1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_2

    .line 518
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->getUnfetchedProductIds()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 519
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->populateScanInfos()V

    .line 520
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->maybeShowTooltip()V

    goto/16 :goto_2

    :pswitch_1
    if-eqz p2, :cond_1

    const-string p1, "scanBarcodeErrorStatusKey"

    .line 508
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "scanBarcodeErrorStatusKey"

    .line 510
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanV2Screen;->showErrorToast(I)V

    goto/16 :goto_2

    .line 514
    :cond_1
    invoke-virtual {p0, v1}, Lcom/shopkick/app/products/ScanV2Screen;->showErrorToast(I)V

    goto/16 :goto_2

    .line 499
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "offlineScanOverlayDismissed"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 500
    iput-boolean v2, p0, Lcom/shopkick/app/products/ScanV2Screen;->removeScreen:Z

    .line 501
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanV2Screen;->popScreen()V

    goto/16 :goto_2

    :pswitch_3
    const-string p1, "scanBarcodeResponseKey"

    .line 494
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/fetchers/DataResponse;

    .line 495
    iget-object p2, p0, Lcom/shopkick/app/products/ScanV2Screen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 496
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->mHandler:Landroid/os/Handler;

    new-instance p2, Lcom/shopkick/app/products/-$$Lambda$ScanV2Screen$O_h6B7jUoHWyNxVuigWNI5iinl8;

    invoke-direct {p2, p0}, Lcom/shopkick/app/products/-$$Lambda$ScanV2Screen$O_h6B7jUoHWyNxVuigWNI5iinl8;-><init>(Lcom/shopkick/app/products/ScanV2Screen;)V

    const-wide/16 v0, 0x7d0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_2

    :pswitch_4
    const-string p1, "scanBarcodeResponseKey"

    .line 441
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/fetchers/DataResponse;

    .line 442
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;

    .line 443
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-eqz p2, :cond_2

    .line 489
    invoke-virtual {p0, p2}, Lcom/shopkick/app/products/ScanV2Screen;->showErrorToast(I)V

    goto/16 :goto_2

    .line 447
    :cond_2
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "locId"

    .line 448
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedLocationId:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "chainId"

    .line 449
    iget-object v1, p0, Lcom/shopkick/app/products/ScanV2Screen;->chainId:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "scanOfferUserData"

    .line 450
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferUserData:Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "scanTileInfo"

    .line 451
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v0, "totalTripKicks"

    .line 452
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->totalKicksThisTrip:Ljava/lang/Integer;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "kicksEarned"

    .line 453
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDelta:Ljava/lang/Integer;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v0, "totalReceiptKicks"

    .line 454
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->totalReceiptKicksAvailableForScannedItems:Ljava/lang/Integer;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "availableReceiptKicks"

    .line 456
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->receiptKicksAvailable:Ljava/lang/Integer;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "receiptScanAvailable"

    .line 457
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->isReceiptScanAvailable:Ljava/lang/Boolean;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "receiptScanAvailableLocationName"

    .line 459
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->chainName:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ScanBCSucceeded"

    invoke-virtual {v0, v1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 462
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->populateScanInfos()V

    .line 465
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const-string p2, "Store Name"

    .line 466
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->chainName:Ljava/lang/String;

    invoke-interface {v8, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "Chain ID"

    .line 467
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->chainId:Ljava/lang/String;

    invoke-interface {v8, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "Product Scan Kicks"

    .line 469
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDelta:Ljava/lang/Integer;

    invoke-interface {v8, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v3

    sget-object p1, Lcom/shopkick/logging/Area;->SCAN:Lcom/shopkick/logging/Area;

    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v6

    const p1, 0x927c1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual/range {v3 .. v8}, Lcom/shopkick/logging/EventLogger;->log(JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V

    .line 474
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->seeMoreScansUrl:Ljava/lang/String;

    if-eqz p1, :cond_3

    .line 475
    iget-object p2, p0, Lcom/shopkick/app/products/ScanV2Screen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    goto :goto_2

    .line 476
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->isScanMissionComplete()Z

    move-result p1

    if-nez p1, :cond_4

    .line 477
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {p1}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->resumeBCScanning()V

    goto :goto_2

    .line 479
    :cond_4
    iput-boolean v2, p0, Lcom/shopkick/app/products/ScanV2Screen;->removeScreen:Z

    .line 480
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanV2Screen;->popScreen()V

    goto :goto_2

    :pswitch_5
    const-string p1, "SEE_MORE_SCANS_URL_KEY"

    .line 438
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->seeMoreScansUrl:Ljava/lang/String;

    goto :goto_2

    .line 435
    :pswitch_6
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanV2Screen;->popScreen()V

    :cond_5
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x775122a7 -> :sswitch_6
        -0x2f557543 -> :sswitch_5
        -0x281fdfba -> :sswitch_4
        0x44e6563 -> :sswitch_3
        0x2bc42607 -> :sswitch_2
        0x34e115c9 -> :sswitch_1
        0x60d4df70 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 596
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090026

    if-ne v0, v1, :cond_0

    .line 597
    iget-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->scanInfoSkLink:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    const/4 p1, 0x1

    return p1

    .line 600
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onScreenDidHide()V
    .locals 1

    .line 410
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->canAdjustScanController()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 411
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->stopBCScanning()V

    .line 413
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->removeScreen:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 414
    iput-boolean v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->removeScreen:Z

    .line 415
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanV2Screen;->removeScreen()V

    .line 418
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->makeRecordScanErrorsRequest()V

    .line 419
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidHide()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 2

    .line 380
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    .line 382
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->canAdjustScanController()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 383
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->startBCScanning()V

    .line 385
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->mainView:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/shopkick/app/products/-$$Lambda$ScanV2Screen$2RuZytzKAgfvWK-g5kd-OQnFtpI;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/-$$Lambda$ScanV2Screen$2RuZytzKAgfvWK-g5kd-OQnFtpI;-><init>(Lcom/shopkick/app/products/ScanV2Screen;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->post(Ljava/lang/Runnable;)Z

    .line 388
    :cond_0
    iget v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanStatus:I

    if-eqz v0, :cond_1

    .line 389
    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/ScanV2Screen;->showErrorToast(I)V

    .line 392
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->maybeShowTooltip()V

    return-void
.end method

.method public onScreenWillHide()V
    .locals 1

    .line 424
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenWillHide()V

    .line 425
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanV2Screen;->canAdjustScanController()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 426
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->stopBCScanning()V

    :cond_0
    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public showErrorToast(I)V
    .locals 3

    .line 319
    iput p1, p0, Lcom/shopkick/app/products/ScanV2Screen;->scanStatus:I

    .line 320
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanV2Screen;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/products/ScanV2Screen$OverlayListener;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v1, p0, v2}, Lcom/shopkick/app/products/ScanV2Screen$OverlayListener;-><init>(Lcom/shopkick/app/products/ScanV2Screen;Ljava/lang/ref/WeakReference;)V

    invoke-static {v0, p1, v1}, Lcom/shopkick/app/util/ScanClickUtils;->showScanErrorToast(Landroid/content/Context;ILcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    return-void
.end method
