.class public Lcom/shopkick/app/products/ScanScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ScanScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/products/ScanScreen$ScanOverlayListener;,
        Lcom/shopkick/app/products/ScanScreen$ScanningRequestListener;,
        Lcom/shopkick/app/products/ScanScreen$ScanMode;
    }
.end annotation


# static fields
.field public static final BACKGROUNDED_APP_REFRESH_ALL_TIMEOUT_MS:J = 0x4e20L

.field private static final BARCODE_LINE_ANIM_DURATION:I = 0x3e8

.field private static final BARCODE_LINE_ANIM_FROM_Y_VALUE:F = 0.45f

.field private static final BARCODE_LINE_ANIM_TO_Y_VALUE:F = 0.55f

.field private static final BOT_CONTAINER_INITIAL_HEIGHT:I = 0x82

.field private static final DELAY_AFTER_REQUEST_TO_RESUME_SCANNING:I = 0x7d0

.field public static final EVENT_DONE_SCANNING_BCS:Ljava/lang/String; = "DoneScanningBarcodes"

.field public static final EVENT_SCAN_2DIR_SUCCEEDED:Ljava/lang/String; = "Scan2DIRSucceeded"

.field public static final EVENT_SCAN_BC_SUCCEEDED:Ljava/lang/String; = "ScanBCSucceeded"

.field public static final EVENT_UPDATE_UI_2DIR_AND_VIDEO_FEATURE:Ljava/lang/String; = "EventUpdateUI2DIRAndVideoFeature"

.field private static final FINDER_VIEW_CHANGE_MODE_DURATION:I = 0x12c

.field private static final FINDER_VIEW_INITIAL_HEIGHT:F = 43.0f

.field private static final FINDER_VIEW_INITIAL_WIDTH:F = 90.0f

.field private static final FINDER_VIEW_PADDING:I = 0x10

.field private static final IR_LOADING_COLLECTION_PROGRESS_ALPHA:F = 0.7f

.field private static final IR_LOADING_COLLECTION_SCAN_INFO_ALPHA:F = 0.3f

.field private static final MAX_ANIMATION_DURATION_1_3:I = 0xc8

.field private static final MAX_ANIMATION_DURATION_2_3:I = 0x190

.field private static final MAX_ANIMATION_DURATION_3_3:I = 0x258

.field private static final MAX_ANIMATION_DURATION_HALF:I = 0x12c

.field private static final MAX_DISPLAY_TOOLTIP_UNAVAILABLE_REPORT_TOOLTIP:I = 0x5

.field public static final SCAN_AVAILABLE_RECEIPT_KICKS:Ljava/lang/String; = "availableReceiptKicks"

.field public static final SCAN_CHAIN_ID:Ljava/lang/String; = "chainId"

.field public static final SCAN_ERROR_AUTO_DISMISS_DURATION_MS:Ljava/lang/Long;

.field public static final SCAN_KICKS_EARNED:Ljava/lang/String; = "kicksEarned"

.field public static final SCAN_LOCATION_ID:Ljava/lang/String; = "locId"

.field public static final SCAN_OFFER_USER_DATA:Ljava/lang/String; = "scanOfferUserData"

.field public static final SCAN_TILE_INFO:Ljava/lang/String; = "scanTileInfo"

.field public static final SCAN_TOTAL_RECEIPT_KICKS:Ljava/lang/String; = "totalReceiptKicks"

.field public static final SCAN_TOTAL_TRIP_KICKS:Ljava/lang/String; = "totalTripKicks"

.field private static SKIP_BUTTON_HEIGHT_PIXELS_WITH_MARGIN:I = 0x0

.field private static final SKU_INDEX_IN_REGEX_MASK:I = 0x1


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private bcKicks:Ljava/lang/String;

.field private bcLargeImageUrl:Ljava/lang/String;

.field private bcMainImageUrl:Ljava/lang/String;

.field private bcOfferDescription:Ljava/lang/String;

.field private botContainer:Landroid/view/ViewGroup;

.field private botContainerHeightAnimator:Landroid/animation/ValueAnimator;

.field private botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

.field private botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

.field private botContainerScanIRInfoOpacityAnimator:Landroid/animation/ValueAnimator;

.field private botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

.field private botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

.field private botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

.field private chainId:Ljava/lang/String;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field public errorDialogFragment:Lcom/shopkick/app/application/dialog/SKDialogFragment;

.field private finderView:Lcom/shopkick/app/view/FinderView;

.field private irDescText:Ljava/lang/String;

.field private irLargeImageUrl:Ljava/lang/String;

.field private irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

.field private irScanKicks:I

.field private irThumbnailImageUrl:Ljava/lang/String;

.field private irTokenID:Ljava/lang/String;

.field private isScanControllerInitialized:Z

.field private isTooltipAnimated:Z

.field private locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field private locationId:Ljava/lang/String;

.field private mHandler:Landroid/os/Handler;

.field private mainView:Landroid/widget/RelativeLayout;

.field private minimumAgeForKicks:Ljava/lang/String;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private onPauseLastFrameDetectedAt:J

.field private permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field private productFamilyId:Ljava/lang/String;

.field private productImage:Landroid/widget/ImageView;

.field private receiptKicksAvailable:Ljava/lang/String;

.field private receiptScanCompleted:Ljava/lang/String;

.field private removeScreen:Z

.field private scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

.field private scanBCInfo:Landroid/view/ViewGroup;

.field private scanBarcodeLine:Landroid/view/View;

.field private scanBarcodeLineAnimation:Landroid/view/animation/TranslateAnimation;

.field private scanBarcodeStatus:I

.field private scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

.field private scanIRInfo:Landroid/view/ViewGroup;

.field private scanIRInfoProductImage:Landroid/widget/ImageView;

.field private scanIRProgressOverlay:Landroid/view/ViewGroup;

.field private scanIRSkipButton:Lcom/shopkick/app/widget/SKButton;

.field private scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

.field private scanV3ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

.field private scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

.field private scanningListener:Lcom/shopkick/app/products/ScanScreen$ScanningRequestListener;

.field private seeMoreScansUrl:Ljava/lang/String;

.field private shouldShowPermissionDialog:Z

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field public validatingScanDialog:Landroid/app/ProgressDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0xbb8

    .line 124
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/products/ScanScreen;->SCAN_ERROR_AUTO_DISMISS_DURATION_MS:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 111
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 130
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mHandler:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 155
    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    .line 165
    iput-boolean v1, p0, Lcom/shopkick/app/products/ScanScreen;->shouldShowPermissionDialog:Z

    .line 177
    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->finderView:Lcom/shopkick/app/view/FinderView;

    const-wide/16 v2, -0x1

    .line 213
    iput-wide v2, p0, Lcom/shopkick/app/products/ScanScreen;->onPauseLastFrameDetectedAt:J

    .line 222
    sget-object v0, Lcom/shopkick/app/products/ScanScreen$ScanMode;->BARCODE:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    .line 225
    iput-boolean v1, p0, Lcom/shopkick/app/products/ScanScreen;->isScanControllerInitialized:Z

    .line 230
    iput v1, p0, Lcom/shopkick/app/products/ScanScreen;->irScanKicks:I

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/products/ScanScreen;Z)Z
    .locals 0

    .line 111
    iput-boolean p1, p0, Lcom/shopkick/app/products/ScanScreen;->removeScreen:Z

    return p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;
    .locals 0

    .line 111
    iget-object p0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainer:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;
    .locals 0

    .line 111
    iget-object p0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRProgressOverlay:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/shopkick/app/products/ScanScreen;Ljava/lang/String;[B)V
    .locals 0

    .line 111
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/products/ScanScreen;->doBCRequest(Ljava/lang/String;[B)V

    return-void
.end method

.method static synthetic access$1200(Lcom/shopkick/app/products/ScanScreen;I[B)V
    .locals 0

    .line 111
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/products/ScanScreen;->doIRRequest(I[B)V

    return-void
.end method

.method static synthetic access$1300(Lcom/shopkick/app/products/ScanScreen;)Z
    .locals 0

    .line 111
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->canAdjustScanController()Z

    move-result p0

    return p0
.end method

.method static synthetic access$1400(Lcom/shopkick/app/products/ScanScreen;)Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;
    .locals 0

    .line 111
    iget-object p0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    return-object p0
.end method

.method static synthetic access$1502(Lcom/shopkick/app/products/ScanScreen;I)I
    .locals 0

    .line 111
    iput p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeStatus:I

    return p1
.end method

.method static synthetic access$1600(Lcom/shopkick/app/products/ScanScreen;)Lcom/shopkick/app/application/AppPreferences;
    .locals 0

    .line 111
    iget-object p0, p0, Lcom/shopkick/app/products/ScanScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;
    .locals 0

    .line 111
    iget-object p0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;
    .locals 0

    .line 111
    iget-object p0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/View;
    .locals 0

    .line 111
    iget-object p0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeLine:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/products/ScanScreen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 111
    iget-object p0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRSkipButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/products/ScanScreen;)Ljava/lang/String;
    .locals 0

    .line 111
    iget-object p0, p0, Lcom/shopkick/app/products/ScanScreen;->productFamilyId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/products/ScanScreen;)V
    .locals 0

    .line 111
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->animateScanBCLine()V

    return-void
.end method

.method static synthetic access$800(Lcom/shopkick/app/products/ScanScreen;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 111
    iget-object p0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method static synthetic access$900(Lcom/shopkick/app/products/ScanScreen;)V
    .locals 0

    .line 111
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->animateFinderBarcodeToIR()V

    return-void
.end method

.method private animateFinderBarcodeToIR()V
    .locals 10

    const v0, 0x7f110456

    .line 1171
    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/ScanScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/ScanScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 1174
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->finderView:Lcom/shopkick/app/view/FinderView;

    invoke-virtual {v0}, Lcom/shopkick/app/view/FinderView;->getWidth()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1183
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v0

    .line 1184
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->finderView:Lcom/shopkick/app/view/FinderView;

    invoke-virtual {v1}, Lcom/shopkick/app/view/FinderView;->getWidth()I

    move-result v1

    const/16 v2, 0x10

    .line 1186
    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->finderView:Lcom/shopkick/app/view/FinderView;

    invoke-static {v2, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    int-to-float v1, v1

    mul-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float v3, v1, v2

    div-float/2addr v3, v1

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float v5, v3, v1

    int-to-float v0, v0

    .line 1188
    sget v3, Lcom/shopkick/app/products/ScanScreen;->SKIP_BUTTON_HEIGHT_PIXELS_WITH_MARGIN:I

    int-to-float v3, v3

    sub-float/2addr v0, v3

    const/16 v3, 0x82

    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v0, v3

    sub-float v2, v0, v2

    div-float/2addr v2, v0

    mul-float v6, v2, v1

    .line 1192
    iget-object v4, p0, Lcom/shopkick/app/products/ScanScreen;->finderView:Lcom/shopkick/app/view/FinderView;

    const-wide/16 v7, 0x12c

    new-instance v9, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    invoke-direct {v9}, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;-><init>()V

    invoke-virtual/range {v4 .. v9}, Lcom/shopkick/app/view/FinderView;->startAnimation(FFJLandroid/animation/TimeInterpolator;)V

    goto :goto_1

    .line 1175
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$20;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$20;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :goto_1
    return-void
.end method

.method private animateFinderIRToBarcode()V
    .locals 6

    .line 1199
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->finderView:Lcom/shopkick/app/view/FinderView;

    new-instance v5, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    invoke-direct {v5}, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;-><init>()V

    const/high16 v1, 0x42b40000    # 90.0f

    const/high16 v2, 0x422c0000    # 43.0f

    const-wide/16 v3, 0x12c

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/view/FinderView;->startAnimation(FFJLandroid/animation/TimeInterpolator;)V

    const v0, 0x7f110628

    .line 1200
    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/ScanScreen;->setAppScreenTitle(I)V

    return-void
.end method

.method private animateModeBarcodeToIR()V
    .locals 7

    .line 922
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->removeAnimListeners()V

    const/4 v0, 0x2

    .line 925
    new-array v1, v0, [I

    const/16 v2, 0x82

    invoke-direct {p0, v2}, Lcom/shopkick/app/products/ScanScreen;->pixFromDp(I)I

    move-result v3

    const/4 v4, 0x0

    aput v3, v1, v4

    invoke-direct {p0, v2}, Lcom/shopkick/app/products/ScanScreen;->pixFromDp(I)I

    move-result v2

    sget v3, Lcom/shopkick/app/products/ScanScreen;->SKIP_BUTTON_HEIGHT_PIXELS_WITH_MARGIN:I

    add-int/2addr v2, v3

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    .line 926
    new-array v1, v0, [F

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getAlpha()F

    move-result v2

    aput v2, v1, v4

    const/4 v2, 0x0

    aput v2, v1, v3

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    .line 927
    new-array v1, v0, [F

    iget-object v5, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getAlpha()F

    move-result v5

    aput v5, v1, v4

    const/high16 v5, 0x3f800000    # 1.0f

    aput v5, v1, v3

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    .line 928
    new-array v1, v0, [F

    aput v2, v1, v4

    sget v6, Lcom/shopkick/app/products/ScanScreen;->SKIP_BUTTON_HEIGHT_PIXELS_WITH_MARGIN:I

    neg-int v6, v6

    int-to-float v6, v6

    aput v6, v1, v3

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    .line 929
    new-array v1, v0, [F

    iget-object v6, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRSkipButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKButton;->getAlpha()F

    move-result v6

    aput v6, v1, v4

    aput v5, v1, v3

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    .line 930
    new-array v0, v0, [F

    sget v1, Lcom/shopkick/app/products/ScanScreen;->SKIP_BUTTON_HEIGHT_PIXELS_WITH_MARGIN:I

    int-to-float v1, v1

    aput v1, v0, v4

    aput v2, v0, v3

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    .line 933
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$2;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 939
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$3;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 955
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$4;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 962
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$5;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$5;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 975
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$6;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$6;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 981
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$7;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$7;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 988
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$8;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$8;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 994
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$9;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$9;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1012
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$10;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$10;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1020
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x258

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1021
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v3, 0x12c

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1022
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1023
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1024
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1025
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1028
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1029
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1030
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1031
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1032
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/FastOutSlowInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/FastOutSlowInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1033
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/FastOutSlowInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/FastOutSlowInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1036
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1037
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1038
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1039
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1040
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1041
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1044
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->startAnimators()V

    return-void
.end method

.method private animateModeIRToBarcode()V
    .locals 6

    .line 1048
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->removeAnimListeners()V

    const/4 v0, 0x2

    .line 1051
    new-array v1, v0, [I

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->botContainer:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/16 v2, 0x82

    invoke-direct {p0, v2}, Lcom/shopkick/app/products/ScanScreen;->pixFromDp(I)I

    move-result v2

    const/4 v4, 0x1

    aput v2, v1, v4

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    .line 1052
    new-array v1, v0, [F

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getAlpha()F

    move-result v2

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v1, v4

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    .line 1053
    new-array v1, v0, [F

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getAlpha()F

    move-result v2

    aput v2, v1, v3

    const/4 v2, 0x0

    aput v2, v1, v4

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    .line 1054
    new-array v1, v0, [F

    iget-object v5, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getTranslationY()F

    move-result v5

    aput v5, v1, v3

    aput v2, v1, v4

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    .line 1055
    new-array v1, v0, [F

    iget-object v5, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRSkipButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v5}, Lcom/shopkick/app/widget/SKButton;->getAlpha()F

    move-result v5

    aput v5, v1, v3

    aput v2, v1, v4

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    .line 1056
    new-array v0, v0, [F

    aput v2, v0, v3

    sget v1, Lcom/shopkick/app/products/ScanScreen;->SKIP_BUTTON_HEIGHT_PIXELS_WITH_MARGIN:I

    int-to-float v1, v1

    aput v1, v0, v4

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    .line 1059
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$11;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$11;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1065
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$12;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$12;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1080
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$13;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$13;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1087
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$14;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$14;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1103
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$15;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$15;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1109
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$16;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$16;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1116
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$17;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$17;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1122
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$18;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$18;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1135
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$19;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$19;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1143
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x258

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1144
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v3, 0x12c

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1145
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1146
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1147
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1148
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1151
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1152
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1153
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1154
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1155
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1156
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1159
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1160
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1161
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1162
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1163
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1164
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1167
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->startAnimators()V

    return-void
.end method

.method private animateScanBCLine()V
    .locals 10

    .line 1298
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeLineAnimation:Landroid/view/animation/TranslateAnimation;

    if-eqz v0, :cond_0

    .line 1299
    invoke-virtual {v0}, Landroid/view/animation/TranslateAnimation;->cancel()V

    .line 1301
    :cond_0
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    const v7, 0x3ee66666    # 0.45f

    const/4 v8, 0x2

    const v9, 0x3f0ccccd    # 0.55f

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeLineAnimation:Landroid/view/animation/TranslateAnimation;

    .line 1306
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeLineAnimation:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 1307
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeLineAnimation:Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setRepeatMode(I)V

    .line 1308
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeLineAnimation:Landroid/view/animation/TranslateAnimation;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setRepeatCount(I)V

    .line 1309
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeLine:Landroid/view/View;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 1310
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1311
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeLine:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeLineAnimation:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_1
    return-void
.end method

.method private animateScanIRInfoContentOpacity()V
    .locals 5

    .line 1206
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->isLoadingCollection()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    const v2, 0x3e99999a    # 0.3f

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v4, v2

    move v2, v1

    move v1, v4

    .line 1214
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoOpacityAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1215
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoOpacityAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1
    const/4 v0, 0x2

    .line 1218
    new-array v0, v0, [F

    const/4 v3, 0x0

    aput v1, v0, v3

    const/4 v1, 0x1

    aput v2, v0, v1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoOpacityAnimator:Landroid/animation/ValueAnimator;

    .line 1219
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoOpacityAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x258

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1220
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoOpacityAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1221
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 1222
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoOpacityAnimator:Landroid/animation/ValueAnimator;

    new-instance v2, Lcom/shopkick/app/products/ScanScreen$21;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/products/ScanScreen$21;-><init>(Lcom/shopkick/app/products/ScanScreen;Lcom/shopkick/app/activities/BaseActivity;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1237
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoOpacityAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private canAdjustScanController()Z
    .locals 2

    .line 1779
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "android.permission.CAMERA"

    .line 1782
    invoke-static {v1, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private canDisplayScan()Z
    .locals 1

    .line 1586
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->bcOfferDescription:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->bcMainImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->bcKicks:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private disableIRProgressOverlay()V
    .locals 3

    const/4 v0, 0x2

    .line 1316
    new-array v0, v0, [F

    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRProgressOverlay:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getAlpha()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x1

    const/4 v2, 0x0

    aput v2, v0, v1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    .line 1317
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/FastOutSlowInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/FastOutSlowInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1318
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x258

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1319
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$22;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$22;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1326
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$23;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$23;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1344
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1345
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 1347
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private doBCRequest(Ljava/lang/String;[B)V
    .locals 12

    .line 1509
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->areWeDoingIR()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    if-eqz p1, :cond_4

    .line 1516
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->validatingScanDialog:Landroid/app/ProgressDialog;

    if-nez v1, :cond_1

    .line 1517
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, ""

    const v3, 0x7f11062b

    .line 1519
    invoke-virtual {p0, v3}, Lcom/shopkick/app/products/ScanScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 1517
    invoke-static {v1, v2, v3}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/ProgressDialog;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->validatingScanDialog:Landroid/app/ProgressDialog;

    goto :goto_0

    .line 1521
    :cond_1
    invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V

    .line 1525
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->handleRegexMatchForBarcodes:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->regexBarcodeMatchList:Ljava/util/List;

    if-eqz v1, :cond_3

    .line 1527
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->regexBarcodeMatchList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1528
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 1529
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 1530
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v3

    if-lt v3, v0, :cond_2

    .line 1531
    invoke-virtual {v2, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    move-object v2, p1

    goto :goto_1

    :cond_3
    move-object v2, p1

    .line 1538
    :goto_1
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    new-instance v4, Ljava/util/ArrayList;

    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->productFamilyId:Ljava/lang/String;

    .line 1541
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v4, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/shopkick/app/products/ScanScreen;->locationId:Ljava/lang/String;

    iget-object v7, p0, Lcom/shopkick/app/products/ScanScreen;->chainId:Ljava/lang/String;

    iget-object v8, p0, Lcom/shopkick/app/products/ScanScreen;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v9, p0, Lcom/shopkick/app/products/ScanScreen;->validatingScanDialog:Landroid/app/ProgressDialog;

    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v10, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v11, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    move-object v3, p2

    .line 1538
    invoke-virtual/range {v1 .. v11}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->requestValidateBarcode(Ljava/lang/String;[BLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/DeviceInfo;Landroid/app/ProgressDialog;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;)V

    .line 1551
    :cond_4
    sget p1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->sessionScanCount:I

    add-int/2addr p1, v0

    sput p1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->sessionScanCount:I

    return-void
.end method

.method private doIRRequest(I[B)V
    .locals 11

    .line 1555
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->productFamilyId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->getTokenID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1557
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_IR"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1560
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->validatingScanDialog:Landroid/app/ProgressDialog;

    if-nez v0, :cond_0

    .line 1561
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    const-string v2, "Validating Image Recognition..."

    invoke-static {v0, v1, v2}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->validatingScanDialog:Landroid/app/ProgressDialog;

    goto :goto_0

    .line 1565
    :cond_0
    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 1568
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->productFamilyId:Ljava/lang/String;

    .line 1571
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/app/products/ScanScreen;->locationId:Ljava/lang/String;

    iget-object v6, p0, Lcom/shopkick/app/products/ScanScreen;->chainId:Ljava/lang/String;

    iget-object v7, p0, Lcom/shopkick/app/products/ScanScreen;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v8, p0, Lcom/shopkick/app/products/ScanScreen;->validatingScanDialog:Landroid/app/ProgressDialog;

    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v9, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v10, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    move-object v3, p2

    .line 1568
    invoke-virtual/range {v1 .. v10}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->requestValidateImageRecognition(Ljava/lang/String;[BLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/DeviceInfo;Landroid/app/ProgressDialog;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;)V

    .line 1582
    :cond_1
    sget p1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->sessionScanCount:I

    add-int/lit8 p1, p1, 0x1

    sput p1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->sessionScanCount:I

    return-void
.end method

.method private enableIrProgressOverlay()V
    .locals 3

    const/4 v0, 0x2

    .line 1351
    new-array v0, v0, [F

    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRProgressOverlay:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getAlpha()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x1

    const v2, 0x3f333333    # 0.7f

    aput v2, v0, v1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    .line 1352
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/FastOutSlowInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/FastOutSlowInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1353
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x258

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1354
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$24;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$24;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1361
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$25;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$25;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1377
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1378
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 1380
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private hideNotReportedTooltip()V
    .locals 4

    .line 1713
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090547

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    .line 1714
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1715
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method private instantiateViews()V
    .locals 4

    .line 365
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090610

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/FinderView;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->finderView:Lcom/shopkick/app/view/FinderView;

    .line 366
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f09061e

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeLine:Landroid/view/View;

    .line 367
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090619

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    .line 368
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f09061c

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRProgressOverlay:Landroid/view/ViewGroup;

    .line 370
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f09061a

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainer:Landroid/view/ViewGroup;

    .line 373
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f09061b

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    .line 374
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    const v1, 0x7f09060a

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfoProductImage:Landroid/widget/ImageView;

    .line 376
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainer:Landroid/view/ViewGroup;

    const v1, 0x7f09061d

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRSkipButton:Lcom/shopkick/app/widget/SKButton;

    .line 380
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 381
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 383
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    const/4 v2, 0x1

    .line 384
    iput-boolean v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 385
    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRSkipButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v0, v3, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method public static synthetic lambda$maybeShowTooltip$201(Lcom/shopkick/app/products/ScanScreen;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 1680
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1681
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->reportProductUnavailability()V

    return-void
.end method

.method public static synthetic lambda$maybeShowTooltip$202(Lcom/shopkick/app/products/ScanScreen;Landroid/view/View;)V
    .locals 0

    .line 1707
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->hideNotReportedTooltip()V

    return-void
.end method

.method public static synthetic lambda$onEvent$197(Lcom/shopkick/app/products/ScanScreen;)V
    .locals 1

    .line 763
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->resumeBCScanning()V

    return-void
.end method

.method public static synthetic lambda$onEvent$198(Lcom/shopkick/app/products/ScanScreen;)V
    .locals 1

    .line 806
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->startIRScanning()V

    return-void
.end method

.method public static synthetic lambda$onEvent$199(Lcom/shopkick/app/products/ScanScreen;)V
    .locals 2

    .line 815
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/products/-$$Lambda$8IrCGNfMcXL26cGC7RYUBN0-WY4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/-$$Lambda$8IrCGNfMcXL26cGC7RYUBN0-WY4;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic lambda$populateScanIRInfo$200(Lcom/shopkick/app/products/ScanScreen;Landroid/view/View;)V
    .locals 2

    .line 1457
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRSkipButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 1458
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->onBackPressed()V

    return-void
.end method

.method private maybeShowTooltip()V
    .locals 8

    .line 1649
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->locationId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->productFamilyId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 1651
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->getInstance(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;

    move-result-object v0

    .line 1654
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->productFamilyId:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->isReported(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 1656
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v2, 0x7f090546

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 1657
    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v3, 0x7f090547

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 1658
    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v4, 0x7f090548

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 1659
    iget-object v4, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v5, 0x7f090549

    invoke-virtual {v4, v5}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 1662
    new-instance v5, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v6, 0xf4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 1663
    iget-object v6, p0, Lcom/shopkick/app/products/ScanScreen;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 1664
    iget-object v6, p0, Lcom/shopkick/app/products/ScanScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 1665
    iget-object v6, p0, Lcom/shopkick/app/products/ScanScreen;->locationId:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 1666
    iget-object v6, p0, Lcom/shopkick/app/products/ScanScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v6, v5}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    const/4 v5, 0x0

    const/16 v6, 0x8

    if-eqz v0, :cond_1

    .line 1670
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1671
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1672
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1673
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 1675
    :cond_1
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1676
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1677
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1679
    new-instance v0, Lcom/shopkick/app/products/-$$Lambda$ScanScreen$XSIMGOFFPE67SNqq_nAJjepflaY;

    invoke-direct {v0, p0}, Lcom/shopkick/app/products/-$$Lambda$ScanScreen$XSIMGOFFPE67SNqq_nAJjepflaY;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1684
    iget-boolean v0, p0, Lcom/shopkick/app/products/ScanScreen;->isTooltipAnimated:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getProductUnavailableReportTooltipDisplayCount()I

    move-result v0

    const/4 v1, 0x5

    if-gt v0, v1, :cond_2

    const/4 v0, 0x1

    .line 1686
    iput-boolean v0, p0, Lcom/shopkick/app/products/ScanScreen;->isTooltipAnimated:Z

    .line 1687
    invoke-virtual {v2}, Landroid/view/View;->clearAnimation()V

    .line 1688
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    const/high16 v0, -0x3ee00000    # -10.0f

    .line 1689
    invoke-virtual {v2, v0}, Landroid/view/View;->setTranslationX(F)V

    const/4 v0, 0x0

    .line 1690
    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 1691
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v3, 0x7d0

    .line 1692
    invoke-virtual {v1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    .line 1693
    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 1694
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v3, 0x1f4

    .line 1695
    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$26;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$26;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    .line 1696
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 1704
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 1707
    new-instance v0, Lcom/shopkick/app/products/-$$Lambda$ScanScreen$wTX6NpgiArpOuuJ59zm6_lPHhPI;

    invoke-direct {v0, p0}, Lcom/shopkick/app/products/-$$Lambda$ScanScreen$wTX6NpgiArpOuuJ59zm6_lPHhPI;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method private obliterateAnimators()V
    .locals 2

    .line 612
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeLineAnimation:Landroid/view/animation/TranslateAnimation;

    if-eqz v0, :cond_0

    .line 613
    invoke-virtual {v0}, Landroid/view/animation/TranslateAnimation;->cancel()V

    :cond_0
    const/4 v0, 0x0

    .line 615
    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeLineAnimation:Landroid/view/animation/TranslateAnimation;

    .line 616
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 617
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 619
    :cond_1
    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    .line 620
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 621
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 623
    :cond_2
    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    .line 624
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 625
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 627
    :cond_3
    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    .line 628
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 629
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 631
    :cond_4
    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    .line 632
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 633
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 635
    :cond_5
    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    .line 636
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 637
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 639
    :cond_6
    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    .line 640
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoOpacityAnimator:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 641
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoOpacityAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 643
    :cond_7
    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoOpacityAnimator:Landroid/animation/ValueAnimator;

    return-void
.end method

.method private onResumeHandleToolbarTitleAlpha()V
    .locals 2

    .line 443
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 444
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    if-eqz v1, :cond_2

    if-nez v0, :cond_0

    goto :goto_1

    .line 447
    :cond_0
    invoke-virtual {v1}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->isLoadingCollection()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 448
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getToolbarTitleView()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    goto :goto_0

    .line 450
    :cond_1
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getToolbarTitleView()Landroid/widget/TextView;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method private onUserAccountIdChangedEvent()V
    .locals 0

    .line 1637
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->popScreen()V

    return-void
.end method

.method private pixFromDp(I)I
    .locals 1

    .line 1243
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result p1

    return p1
.end method

.method private populateScanBCInfo()V
    .locals 12

    .line 1384
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->canDisplayScan()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1389
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanV3ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    if-nez v0, :cond_1

    .line 1390
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    .line 1391
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, p0, Lcom/shopkick/app/products/ScanScreen;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v8, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v9, p0, Lcom/shopkick/app/products/ScanScreen;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    const/4 v10, 0x0

    iget-object v11, p0, Lcom/shopkick/app/products/ScanScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    move-object v1, v0

    move-object v5, p0

    invoke-direct/range {v1 .. v11}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/application/AppPreferences;)V

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanV3ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    .line 1404
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1405
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v2, 0x7f090601

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1406
    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    invoke-direct {v2, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;-><init>(Landroid/view/View;)V

    .line 1408
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 1409
    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->bcOfferDescription:Ljava/lang/String;

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 1410
    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->bcKicks:Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 1411
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 1413
    :cond_2
    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->bcMainImageUrl:Ljava/lang/String;

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    .line 1414
    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->bcLargeImageUrl:Ljava/lang/String;

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrl:Ljava/lang/String;

    .line 1415
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    .line 1416
    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->receiptKicksAvailable:Ljava/lang/String;

    if-eqz v3, :cond_3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    .line 1417
    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->receiptScanCompleted:Ljava/lang/String;

    if-eqz v3, :cond_4

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    .line 1419
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanV3ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 1420
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->productImage:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_5

    .line 1421
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->bcMainImageUrl:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->productImage:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 1423
    :cond_5
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanV3ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    const v3, 0x7f090600

    invoke-virtual {v2, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->setupZoomClickListener(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 1426
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->locationId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->productFamilyId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1428
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    const v1, 0x7f090546

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1429
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    const v2, 0x7f090547

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1430
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    const v2, 0x7f090548

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1431
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    const v2, 0x7f090549

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    return-void
.end method

.method private populateScanIRInfo()V
    .locals 8

    .line 1436
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 1437
    iget v1, p0, Lcom/shopkick/app/products/ScanScreen;->irScanKicks:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    .line 1438
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->irThumbnailImageUrl:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->irThumbnailImageUrl:Ljava/lang/String;

    :goto_0
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanThumbnailImageUrl:Ljava/lang/String;

    .line 1439
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->irLargeImageUrl:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, ""

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->irLargeImageUrl:Ljava/lang/String;

    :goto_1
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanLargeImageUrl:Ljava/lang/String;

    .line 1440
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->irDescText:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, ""

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->irDescText:Ljava/lang/String;

    :goto_2
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanDescriptionText:Ljava/lang/String;

    .line 1442
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfoProductImage:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_4

    .line 1443
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    const v2, 0x7f09053e

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 1445
    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfoProductImage:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    .line 1447
    :cond_3
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->irThumbnailImageUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfoProductImage:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 1451
    :cond_4
    :goto_3
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    const v2, 0x7f09060b

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanDescriptionText:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1452
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    const v2, 0x7f090607

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0f002a

    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    .line 1453
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    aput-object v7, v5, v6

    invoke-virtual {p0, v2, v3, v5}, Lcom/shopkick/app/products/ScanScreen;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 1452
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1456
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRSkipButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v2, Lcom/shopkick/app/products/-$$Lambda$ScanScreen$I-cYyAMDjtsXL5YYk7gZDnMvtS0;

    invoke-direct {v2, p0}, Lcom/shopkick/app/products/-$$Lambda$ScanScreen$I-cYyAMDjtsXL5YYk7gZDnMvtS0;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1462
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->setClickable(Z)V

    .line 1463
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    new-instance v2, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    .line 1465
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/products/ScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v5, p0, Lcom/shopkick/app/products/ScanScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {v2, v0, v3, v4, v5}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;-><init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/logging/UserEventLogger;)V

    .line 1463
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private prePauseHandleToolbarTitleAlpha()V
    .locals 2

    .line 460
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->isLoadingCollection()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 461
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 463
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getToolbarTitleView()Landroid/widget/TextView;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    :cond_0
    return-void
.end method

.method private redirectToMoreScans()V
    .locals 2

    .line 1628
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->seeMoreScansUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method

.method private removeAnimListeners()V
    .locals 1

    .line 1247
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 1248
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 1250
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    .line 1251
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 1253
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_2

    .line 1254
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 1256
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_3

    .line 1257
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 1259
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_4

    .line 1260
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 1262
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_5

    .line 1263
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 1265
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoOpacityAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_6

    .line 1266
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    :cond_6
    return-void
.end method

.method private reportProductUnavailability()V
    .locals 7

    .line 1720
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v4, p0, Lcom/shopkick/app/products/ScanScreen;->productFamilyId:Ljava/lang/String;

    iget-object v5, p0, Lcom/shopkick/app/products/ScanScreen;->chainId:Ljava/lang/String;

    iget-object v6, p0, Lcom/shopkick/app/products/ScanScreen;->locationId:Ljava/lang/String;

    invoke-static/range {v0 .. v6}, Lcom/shopkick/app/util/TileUtils;->reportProductUnavailability(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/logging/UserEventLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1729
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090548

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1730
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v2, 0x7f090549

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 1733
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->hideNotReportedTooltip()V

    const/4 v2, 0x0

    .line 1736
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const/4 v3, 0x0

    .line 1737
    invoke-virtual {v0, v3}, Landroid/view/View;->setScaleX(F)V

    .line 1738
    invoke-virtual {v0, v3}, Landroid/view/View;->setScaleY(F)V

    .line 1739
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v4, 0x3f800000    # 1.0f

    .line 1740
    invoke-virtual {v0, v4}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 1741
    invoke-virtual {v0, v4}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v5, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v5}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 1742
    invoke-virtual {v0, v5}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v5, 0x12c

    .line 1743
    invoke-virtual {v0, v5, v6}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 1744
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 1747
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    const/high16 v0, -0x3ee00000    # -10.0f

    .line 1748
    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 1749
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 1750
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 1751
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 1752
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 1753
    invoke-virtual {v0, v4}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    .line 1754
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$27;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/ScanScreen$27;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    .line 1755
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 1767
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method private setScanMode(Lcom/shopkick/app/products/ScanScreen$ScanMode;)V
    .locals 4

    .line 859
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->canAdjustScanController()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 860
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "Error adjusting camera."

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    .line 865
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    const/4 v2, 0x1

    if-eq p1, v0, :cond_1

    .line 866
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 867
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 868
    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v3, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 874
    :cond_1
    sget-object v0, Lcom/shopkick/app/products/ScanScreen$28;->$SwitchMap$com$shopkick$app$products$ScanScreen$ScanMode:[I

    invoke-virtual {p1}, Lcom/shopkick/app/products/ScanScreen$ScanMode;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/16 v0, 0x8

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 892
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {p1}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->startBCScanning()V

    .line 893
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {p1}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->startIRScanning()V

    .line 895
    sget-object p1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->IR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    .line 896
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 897
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 899
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setClickable(Z)V

    .line 900
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->setClickable(Z)V

    .line 902
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->populateScanIRInfo()V

    .line 903
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->animateModeBarcodeToIR()V

    .line 904
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->animateFinderBarcodeToIR()V

    .line 907
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irTokenID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->loadCollection(Ljava/lang/String;)V

    .line 909
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->isLoadingCollection()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 910
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->enableIrProgressOverlay()V

    .line 911
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->animateScanIRInfoContentOpacity()V

    goto :goto_0

    .line 913
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->disableIRProgressOverlay()V

    .line 914
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->animateScanIRInfoContentOpacity()V

    goto :goto_0

    .line 876
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {p1}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->stopIRScanning()V

    .line 877
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {p1}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->startBCScanning()V

    .line 879
    sget-object p1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->BARCODE:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    .line 880
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 881
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 883
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCInfo:Landroid/view/ViewGroup;

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->setClickable(Z)V

    .line 884
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfo:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setClickable(Z)V

    .line 886
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->animateModeIRToBarcode()V

    .line 887
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->animateFinderIRToBarcode()V

    .line 889
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRProgressOverlay:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private setupClassVars()V
    .locals 4

    const v0, 0x7f110628

    .line 389
    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/ScanScreen;->setAppScreenTitle(I)V

    const/4 v0, 0x1

    .line 390
    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/ScanScreen;->setHasOptionsMenu(Z)V

    const/16 v0, 0x40

    .line 393
    invoke-direct {p0, v0}, Lcom/shopkick/app/products/ScanScreen;->pixFromDp(I)I

    move-result v0

    sput v0, Lcom/shopkick/app/products/ScanScreen;->SKIP_BUTTON_HEIGHT_PIXELS_WITH_MARGIN:I

    .line 395
    new-instance v0, Lcom/shopkick/app/permissions/PermissionsRequestController;

    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 396
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string v1, "android.permission.CAMERA"

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v3, 0x7f09051d

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    .line 398
    new-instance v0, Lcom/shopkick/app/products/ScanScreen$ScanningRequestListener;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/shopkick/app/products/ScanScreen$ScanningRequestListener;-><init>(Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningListener:Lcom/shopkick/app/products/ScanScreen$ScanningRequestListener;

    return-void
.end method

.method private setupScanController()V
    .locals 4

    .line 404
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanningListener:Lcom/shopkick/app/products/ScanScreen$ScanningRequestListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->setScanInitListener(Lcom/shopkick/app/products/scanning/interfaces/ScanInitListener;)V

    .line 405
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanningListener:Lcom/shopkick/app/products/ScanScreen$ScanningRequestListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->setScanBarcodeListener(Lcom/shopkick/app/products/scanning/interfaces/ScanBCListener;)V

    .line 406
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanningListener:Lcom/shopkick/app/products/ScanScreen$ScanningRequestListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->setScanIRListener(Lcom/shopkick/app/products/scanning/interfaces/ScanIRListener;)V

    .line 408
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    .line 409
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v3, 0x7f090611

    .line 410
    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 408
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->initAndStartScanning(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/shopkick/app/application/AppPreferences;)V

    const/4 v0, 0x0

    .line 413
    iput v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeStatus:I

    .line 416
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->subscribe()V

    .line 419
    sget-object v0, Lcom/shopkick/app/products/ScanScreen$28;->$SwitchMap$com$shopkick$app$products$ScanScreen$ScanMode:[I

    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    invoke-virtual {v1}, Lcom/shopkick/app/products/ScanScreen$ScanMode;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 424
    :pswitch_0
    sget-object v0, Lcom/shopkick/app/products/ScanScreen$ScanMode;->IR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    invoke-direct {p0, v0}, Lcom/shopkick/app/products/ScanScreen;->setScanMode(Lcom/shopkick/app/products/ScanScreen$ScanMode;)V

    goto :goto_0

    .line 421
    :pswitch_1
    sget-object v0, Lcom/shopkick/app/products/ScanScreen$ScanMode;->BARCODE:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    invoke-direct {p0, v0}, Lcom/shopkick/app/products/ScanScreen;->setScanMode(Lcom/shopkick/app/products/ScanScreen$ScanMode;)V

    :goto_0
    const/4 v0, 0x1

    .line 428
    iput-boolean v0, p0, Lcom/shopkick/app/products/ScanScreen;->isScanControllerInitialized:Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 431
    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    .line 432
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    const/4 v0, -0x1

    .line 433
    iput v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeStatus:I

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private startAnimators()V
    .locals 1

    .line 1271
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1272
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 1274
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1275
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 1277
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1278
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 1280
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1281
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 1283
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1284
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 1286
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1287
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 1289
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerHeightAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 1290
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanBarcodeInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 1291
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRInfoAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 1292
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanInfosTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 1293
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipAlphaAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 1294
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->botContainerScanIRSkipTransYAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private subscribe()V
    .locals 2

    .line 1641
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "UserAccountIdChangedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method private unsubscribe()V
    .locals 1

    .line 1645
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    .line 326
    iget-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->productFamilyId:Ljava/lang/String;

    const/4 p3, 0x0

    if-nez p2, :cond_0

    .line 327
    const-class p1, Lcom/shopkick/app/products/ScanScreen;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ARGS WERE NULL and we didn\'t have any product info in the bundle"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x3fd

    .line 328
    invoke-static {p1}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    return-object p3

    :cond_0
    const p2, 0x7f0c0197

    const/4 v0, 0x0

    .line 332
    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    .line 333
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f09053e

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->productImage:Landroid/widget/ImageView;

    .line 335
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->instantiateViews()V

    .line 336
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->setupClassVars()V

    .line 337
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->populateScanBCInfo()V

    .line 340
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->useScanControllerV2(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 341
    new-instance p1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;

    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, p2, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v4, p0, Lcom/shopkick/app/products/ScanScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v5, p0, Lcom/shopkick/app/products/ScanScreen;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/DeviceInfo;)V

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    goto :goto_0

    .line 343
    :cond_1
    new-instance p1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v7

    iget-object v8, p0, Lcom/shopkick/app/products/ScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v9, p2, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v10, p0, Lcom/shopkick/app/products/ScanScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v11, p0, Lcom/shopkick/app/products/ScanScreen;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    move-object v6, p1

    invoke-direct/range {v6 .. v11}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/DeviceInfo;)V

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    .line 346
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->canAdjustScanController()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 347
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->setupScanController()V

    :cond_2
    const-string p1, "android.permission.CAMERA"

    .line 351
    iget-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {p2}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/shopkick/app/products/ScanScreen;->shouldShowPermissionDialog:Z

    .line 353
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 9
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

    .line 237
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 238
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 239
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 240
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 241
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 242
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 243
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 244
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 246
    new-instance v0, Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v3, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v4, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v5, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v6, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v7, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    move-object v1, v0

    move-object v8, p0

    invoke-direct/range {v1 .. v8}, Lcom/shopkick/app/account/AgeVerificationController;-><init>(Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/screens/AppScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    .line 255
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 258
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    .line 261
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ageVerificationCanceledEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 262
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "SCAN_ANIMATION_CONTROLLER_SEE_MORE_SCANS_TAPPED_NOTIFCATION"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 264
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "scanBarcodeResponseCompleted"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 265
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "scanBarcodeResponseFailure"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 266
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "scanBarcodeErrorWithStatus"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 267
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanOverlayDismissed"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 269
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ScanBCSucceeded"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 270
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "Scan2DIRSucceeded"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 271
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventCollectionLoadStarted"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 272
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventCollectionLoadSuccess"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 273
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventCollectionLoadFailed"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 274
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventScanIrResponseSuccess"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 275
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventScanIrResponseFailureInternet"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    const-string v0, "product_family_id"

    .line 279
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->productFamilyId:Ljava/lang/String;

    const-string v0, "location_id"

    .line 280
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->locationId:Ljava/lang/String;

    const-string v0, "chain_id"

    .line 281
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->chainId:Ljava/lang/String;

    const-string v0, "num_kicks"

    .line 282
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->bcKicks:Ljava/lang/String;

    const-string v0, "offer_description"

    .line 285
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->bcOfferDescription:Ljava/lang/String;

    const-string v0, "offer_preview_image_url"

    .line 286
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->bcMainImageUrl:Ljava/lang/String;

    const-string v0, "offer_large_image_url"

    .line 287
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->bcLargeImageUrl:Ljava/lang/String;

    .line 290
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableImageRecognitionScans:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "image_rec_token_id"

    .line 291
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->irTokenID:Ljava/lang/String;

    const/4 p1, 0x0

    .line 292
    iput p1, p0, Lcom/shopkick/app/products/ScanScreen;->irScanKicks:I

    const-string p1, "image_rec_scan_thumbnail_image_url"

    .line 293
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->irThumbnailImageUrl:Ljava/lang/String;

    const-string p1, "image_rec_scan_description_text"

    .line 294
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->irDescText:Ljava/lang/String;

    const-string p1, "image_rec_scan_large_image_url"

    .line 295
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->irLargeImageUrl:Ljava/lang/String;

    const-string p1, "image_rec_scan_kicks"

    .line 297
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 298
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "-"

    const-string v1, ""

    .line 299
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 300
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/products/ScanScreen;->irScanKicks:I

    :cond_0
    const-string p1, "receipt_kicks_available"

    .line 305
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->receiptKicksAvailable:Ljava/lang/String;

    const-string p1, "receipt_scan_completed"

    .line 306
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->receiptScanCompleted:Ljava/lang/String;

    const-string p1, "minimum_age_for_kicks"

    .line 307
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->minimumAgeForKicks:Ljava/lang/String;

    .line 311
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->bcKicks:Ljava/lang/String;

    if-eqz p1, :cond_2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-lez p1, :cond_2

    .line 312
    sget-object p1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->BARCODE:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    goto :goto_0

    .line 313
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->irTokenID:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 314
    sget-object p1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->IR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    goto :goto_0

    .line 317
    :cond_3
    sget-object p1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->BARCODE:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    .line 320
    :goto_0
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    const v0, 0x7f0d0006

    .line 1615
    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    return-void
.end method

.method public onDestroy()V
    .locals 3

    .line 575
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->obliterateAnimators()V

    .line 577
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 578
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 580
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    if-eqz v0, :cond_0

    .line 581
    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->onDestroy()V

    .line 583
    :cond_0
    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    .line 585
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->productImage:Landroid/widget/ImageView;

    invoke-static {v0, v2}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/content/Context;Landroid/view/View;)V

    .line 586
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRInfoProductImage:Landroid/widget/ImageView;

    invoke-static {v0, v2}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/content/Context;Landroid/view/View;)V

    .line 588
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    if-eqz v0, :cond_1

    .line 589
    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->clearStateOnScreenDestroyed()V

    .line 591
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    if-eqz v0, :cond_2

    .line 592
    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->clearStateOnScreenDestroyed()V

    .line 595
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->validatingScanDialog:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_3

    .line 596
    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 599
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 600
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    .line 602
    :cond_4
    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->irProgressOverlayAnimator:Landroid/animation/ValueAnimator;

    .line 604
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->unsubscribe()V

    .line 606
    iput-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    .line 608
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

    .line 649
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "eventScanIrResponseFailureInternet"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x9

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "eventCollectionLoadFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "SCAN_ANIMATION_CONTROLLER_SEE_MORE_SCANS_TAPPED_NOTIFCATION"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v2

    goto/16 :goto_1

    :sswitch_3
    const-string v0, "eventCollectionLoadSuccess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    goto/16 :goto_1

    :sswitch_4
    const-string v0, "eventCollectionLoadStarted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x5

    goto :goto_1

    :sswitch_5
    const-string v0, "scanBarcodeResponseCompleted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_6
    const-string v0, "eventScanIrResponseFailure"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x7

    goto :goto_1

    :sswitch_7
    const-string v0, "UserAccountIdChangedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :sswitch_8
    const-string v0, "eventScanIrResponseSuccess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xa

    goto :goto_1

    :sswitch_9
    const-string v0, "ageVerificationCanceledEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xd

    goto :goto_1

    :sswitch_a
    const-string v0, "scanBarcodeResponseFailure"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :sswitch_b
    const-string v0, "scanBarcodeErrorWithStatus"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_1

    :sswitch_c
    const-string v0, "offlineScanOverlayDismissed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xc

    goto :goto_1

    :sswitch_d
    const-string v0, "scanIRErrorWithStatus"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xb

    goto :goto_1

    :cond_0
    :goto_0
    move p1, v1

    :goto_1
    const-wide/16 v3, 0x7d0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_4

    .line 851
    :pswitch_0
    iput-boolean v2, p0, Lcom/shopkick/app/products/ScanScreen;->removeScreen:Z

    .line 852
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->popScreen()V

    goto/16 :goto_4

    .line 842
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "offlineScanOverlayDismissed"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 843
    iput-boolean v2, p0, Lcom/shopkick/app/products/ScanScreen;->removeScreen:Z

    .line 844
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->popScreen()V

    goto/16 :goto_4

    :pswitch_2
    if-eqz p2, :cond_1

    const-string p1, "scanIRErrorStatusKey"

    .line 828
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "scanIRErrorStatusKey"

    .line 830
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanScreen;->showErrorToast(I)V

    goto/16 :goto_4

    .line 834
    :cond_1
    invoke-virtual {p0, v1}, Lcom/shopkick/app/products/ScanScreen;->showErrorToast(I)V

    goto/16 :goto_4

    .line 820
    :pswitch_3
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "eventScanIrResponseSuccess"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 821
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->popScreen()V

    goto/16 :goto_4

    .line 810
    :pswitch_4
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v1, 0x0

    const p1, 0x7f11061b

    .line 811
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const p1, 0x7f11061a

    .line 812
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const p1, 0x7f11014f

    .line 813
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanScreen;->getString(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/shopkick/app/products/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/products/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    new-instance v6, Lcom/shopkick/app/products/-$$Lambda$ScanScreen$-nX3kCsYCG3St_PvIQsSpdtrCAs;

    invoke-direct {v6, p0}, Lcom/shopkick/app/products/-$$Lambda$ScanScreen$-nX3kCsYCG3St_PvIQsSpdtrCAs;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    .line 810
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->errorDialogFragment:Lcom/shopkick/app/application/dialog/SKDialogFragment;

    .line 817
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "eventScanIrResponseFailureInternet"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto/16 :goto_4

    :pswitch_5
    const-string p1, "scanIRResponseKey"

    .line 804
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/fetchers/DataResponse;

    .line 805
    iget-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 806
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->mHandler:Landroid/os/Handler;

    new-instance p2, Lcom/shopkick/app/products/-$$Lambda$ScanScreen$z83FVcLtOvlqL6qOPat-Qsze7-Q;

    invoke-direct {p2, p0}, Lcom/shopkick/app/products/-$$Lambda$ScanScreen$z83FVcLtOvlqL6qOPat-Qsze7-Q;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {p1, p2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_4

    .line 797
    :pswitch_6
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    sget-object p2, Lcom/shopkick/app/products/ScanScreen$ScanMode;->IR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    if-ne p1, p2, :cond_d

    .line 798
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->disableIRProgressOverlay()V

    .line 799
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->animateScanIRInfoContentOpacity()V

    goto/16 :goto_4

    .line 785
    :pswitch_7
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->isVisible()Z

    move-result p1

    if-eqz p1, :cond_d

    .line 786
    sget-object p1, Lcom/shopkick/app/products/ScanScreen$28;->$SwitchMap$com$shopkick$app$products$ScanScreen$ScanMode:[I

    iget-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    invoke-virtual {p2}, Lcom/shopkick/app/products/ScanScreen$ScanMode;->ordinal()I

    move-result p2

    aget p1, p1, p2

    packed-switch p1, :pswitch_data_1

    goto/16 :goto_4

    .line 791
    :pswitch_8
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->enableIrProgressOverlay()V

    goto/16 :goto_4

    .line 788
    :pswitch_9
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->disableIRProgressOverlay()V

    goto/16 :goto_4

    :pswitch_a
    if-eqz p2, :cond_2

    const-string p1, "scanBarcodeErrorStatusKey"

    .line 770
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "scanBarcodeErrorStatusKey"

    .line 772
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanScreen;->showErrorToast(I)V

    goto/16 :goto_4

    .line 776
    :cond_2
    invoke-virtual {p0, v1}, Lcom/shopkick/app/products/ScanScreen;->showErrorToast(I)V

    goto/16 :goto_4

    :pswitch_b
    const-string p1, "scanBarcodeResponseKey"

    .line 761
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/fetchers/DataResponse;

    .line 762
    iget-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 763
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->mHandler:Landroid/os/Handler;

    new-instance p2, Lcom/shopkick/app/products/-$$Lambda$ScanScreen$uAI99Y-wJ_zcBzzisLXHw02_FJM;

    invoke-direct {p2, p0}, Lcom/shopkick/app/products/-$$Lambda$ScanScreen$uAI99Y-wJ_zcBzzisLXHw02_FJM;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {p1, p2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_4

    :pswitch_c
    const-string p1, "scanBarcodeResponseKey"

    .line 664
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/fetchers/DataResponse;

    .line 665
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;

    .line 666
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_3

    .line 755
    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/ScanScreen;->showErrorToast(I)V

    goto/16 :goto_3

    .line 671
    :cond_3
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedLocationId:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 672
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedLocationId:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->locationId:Ljava/lang/String;

    .line 676
    :cond_4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "locId"

    .line 677
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedLocationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "chainId"

    .line 678
    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "scanOfferUserData"

    .line 679
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferUserData:Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "scanTileInfo"

    .line 680
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v1, "totalTripKicks"

    .line 681
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->totalKicksThisTrip:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "kicksEarned"

    .line 682
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDelta:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v1, "totalReceiptKicks"

    .line 683
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->totalReceiptKicksAvailableForScannedItems:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "availableReceiptKicks"

    .line 684
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->receiptKicksAvailable:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "receiptScanAvailable"

    .line 685
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->isReceiptScanAvailable:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "receiptScanAvailableLocationName"

    .line 686
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->chainName:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "scanBarcodeResponseKey"

    .line 688
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/fetchers/DataResponse;

    if-eqz p2, :cond_5

    const-string v1, "scanBarcodeResponseKey"

    .line 690
    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 693
    :cond_5
    iget-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ScanBCSucceeded"

    invoke-virtual {p2, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 695
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const-string p2, "Store Name"

    .line 696
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->chainName:Ljava/lang/String;

    invoke-interface {v8, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "Chain ID"

    .line 697
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->chainId:Ljava/lang/String;

    invoke-interface {v8, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "Product Family ID"

    .line 698
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->productFamilyId:Ljava/lang/String;

    invoke-interface {v8, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "Product Scan Kicks"

    .line 699
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDelta:Ljava/lang/Integer;

    invoke-interface {v8, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 701
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v3

    sget-object p2, Lcom/shopkick/logging/Area;->SCAN:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    iget-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v6

    const p2, 0x927c1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual/range {v3 .. v8}, Lcom/shopkick/logging/EventLogger;->log(JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V

    .line 715
    iget-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p2}, Lcom/shopkick/app/util/FeatureFlagHelper;->areImageRecognitionScansEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p2

    .line 717
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->seeMoreScansUrl:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 718
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->redirectToMoreScans()V

    goto/16 :goto_2

    :cond_6
    if-eqz p2, :cond_7

    .line 719
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irTokenID:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    iget v0, p0, Lcom/shopkick/app/products/ScanScreen;->irScanKicks:I

    if-lez v0, :cond_7

    .line 720
    sget-object p1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->IR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/ScanScreen;->setScanMode(Lcom/shopkick/app/products/ScanScreen$ScanMode;)V

    goto :goto_2

    :cond_7
    if-eqz p2, :cond_b

    .line 721
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanTokenId:Ljava/lang/String;

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_b

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanCompleted:Ljava/lang/Boolean;

    .line 722
    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    .line 723
    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p2

    if-eqz p2, :cond_b

    .line 724
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanTokenId:Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->irTokenID:Ljava/lang/String;

    .line 725
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iput p2, p0, Lcom/shopkick/app/products/ScanScreen;->irScanKicks:I

    .line 726
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanDescriptionText:Ljava/lang/String;

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_8

    .line 727
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanDescriptionText:Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->irDescText:Ljava/lang/String;

    .line 729
    :cond_8
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanThumbnailImageUrl:Ljava/lang/String;

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_9

    .line 730
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanThumbnailImageUrl:Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->irThumbnailImageUrl:Ljava/lang/String;

    .line 732
    :cond_9
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanLargeImageUrl:Ljava/lang/String;

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_a

    .line 733
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanLargeImageUrl:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->irLargeImageUrl:Ljava/lang/String;

    .line 736
    :cond_a
    sget-object p1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->IR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/ScanScreen;->setScanMode(Lcom/shopkick/app/products/ScanScreen$ScanMode;)V

    goto :goto_2

    .line 738
    :cond_b
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "DoneScanningBarcodes"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 739
    iput-boolean v2, p0, Lcom/shopkick/app/products/ScanScreen;->removeScreen:Z

    .line 740
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->popScreen()V

    :goto_2
    const-string p1, "40560331"

    .line 744
    iget-object p2, p0, Lcom/shopkick/app/products/ScanScreen;->chainId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 745
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getBestBuyScanLimit()I

    move-result p2

    sub-int/2addr p2, v2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/AppPreferences;->setBestBuyScanLimit(I)V

    .line 758
    :cond_c
    :goto_3
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->clearActionEducationScreen()V

    goto :goto_4

    :pswitch_d
    const-string p1, "SEE_MORE_SCANS_URL_KEY"

    .line 661
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->seeMoreScansUrl:Ljava/lang/String;

    goto :goto_4

    .line 654
    :pswitch_e
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->onUserAccountIdChangedEvent()V

    :cond_d
    :goto_4
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7e6380c6 -> :sswitch_d
        -0x775122a7 -> :sswitch_c
        -0x2f557543 -> :sswitch_b
        -0x281fdfba -> :sswitch_a
        -0x222df919 -> :sswitch_9
        -0x1b10bf5e -> :sswitch_8
        0x44e6563 -> :sswitch_7
        0x13763229 -> :sswitch_6
        0x2bc42607 -> :sswitch_5
        0x4ee290c3 -> :sswitch_4
        0x50ac9045 -> :sswitch_3
        0x60d4df70 -> :sswitch_2
        0x673333bb -> :sswitch_1
        0x7ff4248a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1620
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090026

    if-ne v0, v1, :cond_0

    .line 1621
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->scanInfoSkLink:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    const/4 p1, 0x1

    return p1

    .line 1624
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0
    .param p2    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 1789
    invoke-super {p0, p1, p2, p3}, Lcom/shopkick/app/screens/AppScreen;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const/16 p2, 0x1b

    if-eq p1, p2, :cond_0

    return-void

    .line 1792
    :cond_0
    array-length p1, p3

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    aget p1, p3, p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_3

    :cond_1
    const-string p1, "android.permission.CAMERA"

    .line 1793
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanScreen;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1795
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->popScreen()V

    goto :goto_0

    .line 1799
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    :cond_3
    :goto_0
    return-void
.end method

.method public onScreenDidHide()V
    .locals 1

    .line 563
    iget-boolean v0, p0, Lcom/shopkick/app/products/ScanScreen;->removeScreen:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 564
    iput-boolean v0, p0, Lcom/shopkick/app/products/ScanScreen;->removeScreen:Z

    .line 565
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->removeScreen()V

    .line 568
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->makeRecordScanErrorsRequest()V

    .line 570
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidHide()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 4

    .line 476
    iget-boolean v0, p0, Lcom/shopkick/app/products/ScanScreen;->shouldShowPermissionDialog:Z

    const/16 v1, 0x8

    const v2, 0x7f09051d

    if-eqz v0, :cond_0

    .line 480
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 481
    sget-object v0, Lcom/shopkick/app/permissions/PermissionUtils;->CAMERA_PERMISSIONS:[Ljava/lang/String;

    const/16 v3, 0x1b

    invoke-virtual {p0, v0, v3}, Lcom/shopkick/app/products/ScanScreen;->requestPermissions([Ljava/lang/String;I)V

    const/4 v0, 0x0

    .line 482
    iput-boolean v0, p0, Lcom/shopkick/app/products/ScanScreen;->shouldShowPermissionDialog:Z

    goto :goto_0

    .line 486
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    .line 489
    :goto_0
    iget-boolean v0, p0, Lcom/shopkick/app/products/ScanScreen;->isScanControllerInitialized:Z

    if-nez v0, :cond_1

    const-string v0, "android.permission.CAMERA"

    iget-object v3, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 491
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 492
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->setupScanController()V

    .line 496
    :cond_1
    iget-wide v0, p0, Lcom/shopkick/app/products/ScanScreen;->onPauseLastFrameDetectedAt:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    .line 497
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/shopkick/app/products/ScanScreen;->onPauseLastFrameDetectedAt:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x4e20

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 498
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventUpdateUI2DIRAndVideoFeature"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 499
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/shopkick/app/products/-$$Lambda$8IrCGNfMcXL26cGC7RYUBN0-WY4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/-$$Lambda$8IrCGNfMcXL26cGC7RYUBN0-WY4;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 504
    :cond_2
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, 0x17

    .line 505
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 506
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->minimumAgeForKicks:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 507
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->minimumAgeForKicks:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumAgeForKicks:Ljava/lang/Integer;

    .line 509
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    new-instance v2, Lcom/shopkick/app/products/ScanScreen$1;

    invoke-direct {v2, p0}, Lcom/shopkick/app/products/ScanScreen$1;-><init>(Lcom/shopkick/app/products/ScanScreen;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3, v3, v2}, Lcom/shopkick/app/account/AgeVerificationController;->maybeVerifyAge(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 517
    iget v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeStatus:I

    if-eqz v0, :cond_4

    .line 518
    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/ScanScreen;->showErrorToast(I)V

    .line 522
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->isLoadingCollection()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->irTokenID:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 523
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_5

    .line 524
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    iget-object v1, p0, Lcom/shopkick/app/products/ScanScreen;->irTokenID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->loadCollection(Ljava/lang/String;)V

    goto :goto_1

    .line 526
    :cond_5
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->disableIRProgressOverlay()V

    .line 530
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->errorDialogFragment:Lcom/shopkick/app/application/dialog/SKDialogFragment;

    if-nez v0, :cond_7

    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->canAdjustScanController()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 531
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    sget-object v1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->BARCODE:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    if-ne v0, v1, :cond_6

    .line 532
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->startBCScanning()V

    goto :goto_2

    .line 533
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    sget-object v1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->IR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    if-ne v0, v1, :cond_7

    .line 534
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->startBCScanning()V

    .line 535
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->startIRScanning()V

    .line 539
    :cond_7
    :goto_2
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->maybeShowTooltip()V

    return-void
.end method

.method public onScreenWillHide()V
    .locals 4

    .line 544
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenWillHide()V

    .line 546
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->getTimeOfLastFrame()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/app/products/ScanScreen;->onPauseLastFrameDetectedAt:J

    .line 547
    iget-wide v0, p0, Lcom/shopkick/app/products/ScanScreen;->onPauseLastFrameDetectedAt:J

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const-wide/16 v0, -0x1

    .line 548
    iput-wide v0, p0, Lcom/shopkick/app/products/ScanScreen;->onPauseLastFrameDetectedAt:J

    .line 551
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    sget-object v1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->BARCODE:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    if-ne v0, v1, :cond_1

    .line 552
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->stopBCScanning()V

    goto :goto_0

    .line 553
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    sget-object v1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->IR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    if-ne v0, v1, :cond_2

    .line 554
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->stopBCScanning()V

    .line 555
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanningController:Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->stopIRScanning()V

    .line 558
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->prePauseHandleToolbarTitleAlpha()V

    return-void
.end method

.method public onScreenWillShow()V
    .locals 0

    .line 470
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenWillShow()V

    .line 471
    invoke-direct {p0}, Lcom/shopkick/app/products/ScanScreen;->onResumeHandleToolbarTitleAlpha()V

    return-void
.end method

.method public showErrorToast(I)V
    .locals 3

    .line 1632
    iput p1, p0, Lcom/shopkick/app/products/ScanScreen;->scanBarcodeStatus:I

    .line 1633
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScanScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/products/ScanScreen$ScanOverlayListener;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v1, p0, v2}, Lcom/shopkick/app/products/ScanScreen$ScanOverlayListener;-><init>(Lcom/shopkick/app/products/ScanScreen;Ljava/lang/ref/WeakReference;)V

    invoke-static {v0, p1, v1}, Lcom/shopkick/app/util/ScanClickUtils;->showScanErrorToast(Landroid/content/Context;ILcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    return-void
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 358
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 359
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen;->scanMode:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    sget-object v1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->IR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 360
    :goto_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 359
    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMode(Ljava/lang/String;)V

    return-void
.end method
