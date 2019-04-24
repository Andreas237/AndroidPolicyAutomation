.class public Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ReceiptProductSelectorScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/app/receipts/JumpCapableScreen;
.implements Lcom/shopkick/app/receipts/IReceiptUploadNotificationCallback;


# static fields
.field private static final CLAIM_BUTTOM_DISABLE_ALPHA:F = 0.4f

.field private static final CLAIM_BUTTOM_ENABLE_ALPHA:F = 1.0f

.field private static final LOG_TAG:Ljava/lang/String; = "Product Selector Screen"

.field public static final PRODUCT_SELECTOR_SCREEN_BUNDLE_KICKS_MAP:Ljava/lang/String; = "PRODUCT_SELECTOR_SCREEN_BUNDLE_KICKS_MAP"

.field public static final PRODUCT_SELECTOR_SCREEN_BUNDLE_PRODUCT_MAP_KEY:Ljava/lang/String; = "PRODUCT_SELECTOR_SCREEN_BUNDLE_PRODUCT_MAP_KEY"

.field public static final PRODUCT_SELECTOR_SCREEN_PRODUCT_KICKS_MAP:Ljava/lang/String; = "PRODUCT_SELECTOR_SCREEN_OFFER_KICKS_MAP"

.field public static final RECEIPT_SCAN_SCREEN:I

.field private static final supportedTileTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private account:Lcom/shopkick/app/account/UserAccount;

.field private adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

.field private bundleKicksMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private bundleListed:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private bundleProductMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;>;"
        }
    .end annotation
.end field

.field private button:Lcom/shopkick/app/widget/SKButton;

.field private categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

.field private chainId:Ljava/lang/String;

.field private clientFlags:Lcom/shopkick/app/application/ClientFlagsManager;

.field private firstFetchMade:Z

.field private isPNSTypeLogged:Z

.field private isRetailReceiptPreselected:Z

.field private itemStateCallback:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;

.field private lastBestLocation:Landroid/location/Location;

.field private latitude:Ljava/lang/Double;

.field private locationId:Ljava/lang/String;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private longitude:Ljava/lang/Double;

.field private mainView:Landroid/widget/RelativeLayout;

.field private postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

.field private preselectedProductBundleId:Ljava/lang/String;

.field private preselectedProductFamilyIds:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private productKicksMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private productsListed:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final receiptScanUploadLock:Ljava/lang/Object;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x8

    .line 79
    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, -0x2

    .line 80
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/16 v1, -0x38

    .line 81
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/16 v1, 0x32

    .line 82
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/16 v1, 0x30

    .line 83
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/16 v1, 0x31

    .line 84
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/16 v1, 0x51

    .line 85
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/16 v1, 0x52

    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 79
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->supportedTileTypes:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 70
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->preselectedProductFamilyIds:Ljava/util/HashSet;

    .line 88
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->receiptScanUploadLock:Ljava/lang/Object;

    .line 98
    new-instance v0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$1;-><init>(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Ljava/lang/Double;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->longitude:Ljava/lang/Double;

    return-object p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->longitude:Ljava/lang/Double;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Ljava/lang/Double;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->latitude:Ljava/lang/Double;

    return-object p0
.end method

.method static synthetic access$102(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->latitude:Ljava/lang/Double;

    return-object p1
.end method

.method static synthetic access$200(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Landroid/location/Location;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->lastBestLocation:Landroid/location/Location;

    return-object p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;Landroid/location/Location;)Landroid/location/Location;
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->lastBestLocation:Landroid/location/Location;

    return-object p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Ljava/util/HashSet;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleListed:Ljava/util/HashSet;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Ljava/util/HashMap;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic access$702(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;Z)Z
    .locals 0

    .line 42
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->isRetailReceiptPreselected:Z

    return p1
.end method

.method static synthetic access$800(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->button:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method private getController()Lcom/shopkick/app/receipts/IReceiptUploadController;
    .locals 1

    .line 562
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->validActivity()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 563
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/IReceiptUploadController;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private makeBundleBonusTile(II)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 487
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, -0x38

    .line 488
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 489
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->bonusReceiptKicks:Ljava/lang/Integer;

    .line 490
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    const/4 p1, 0x0

    .line 491
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    .line 492
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->quantity:Ljava/lang/Integer;

    return-object v0
.end method

.method private startRequest()V
    .locals 2

    .line 283
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->fetchNextPage()V

    const/4 v0, 0x1

    .line 284
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->firstFetchMade:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 286
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private toggleBundleItem(Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    .line 445
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleProductMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_5

    .line 448
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleListed:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_4

    .line 449
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleListed:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 450
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleProductMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 451
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 452
    iget-object v4, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 453
    iget-object v4, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/2addr v5, v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 455
    :cond_1
    iget-object v4, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    move v1, v0

    .line 458
    :goto_1
    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v3}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->getFilteredTiles()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_7

    .line 459
    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v3

    .line 460
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 461
    new-instance v0, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleProductMap:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 462
    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleKicksMap:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleProductMap:Ljava/util/HashMap;

    .line 463
    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 462
    invoke-direct {p0, v3, v4}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->makeBundleBonusTile(II)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 464
    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    add-int/2addr v1, v2

    invoke-virtual {v3, v0, v1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->addTilesAtPosition(Ljava/util/List;I)V

    goto/16 :goto_4

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 469
    :cond_4
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleListed:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 470
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleProductMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 471
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 472
    iget-object v4, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    sub-int/2addr v5, v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    move v1, v0

    .line 474
    :goto_3
    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v3}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->getFilteredTiles()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_7

    .line 475
    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v3

    .line 476
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 478
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    add-int/2addr v1, v2

    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleProductMap:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v0, v1, v3}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->removeTilesAtPosition(II)V

    goto :goto_4

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 483
    :cond_7
    :goto_4
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleListed:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_8
    :goto_5
    return v0
.end method

.method private toggleProductItem(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 435
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 439
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v0

    .line 436
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v2
.end method

.method private updateClaimButton()V
    .locals 6

    .line 407
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->isRetailReceiptPreselected:Z

    if-eqz v0, :cond_0

    return-void

    .line 411
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleListed:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 412
    iget-object v4, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleKicksMap:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    .line 414
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 415
    iget-object v4, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lez v4, :cond_2

    .line 416
    iget-object v4, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productKicksMap:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_1

    :cond_3
    if-lez v2, :cond_4

    .line 421
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->button:Lcom/shopkick/app/widget/SKButton;

    const v3, 0x7f1104e7

    invoke-virtual {p0, v3}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v5, v1

    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 422
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->button:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 423
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->button:Lcom/shopkick/app/widget/SKButton;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setAlpha(F)V

    goto :goto_2

    .line 425
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->button:Lcom/shopkick/app/widget/SKButton;

    const v2, 0x7f1104e8

    invoke-virtual {p0, v2}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 426
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->button:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 427
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->button:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x3ecccccd    # 0.4f

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setAlpha(F)V

    :goto_2
    return-void
.end method

.method private validActivity()Z
    .locals 1

    .line 558
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/receipts/IReceiptUploadController;

    return v0
.end method


# virtual methods
.method public checkJumpHeaderTile()V
    .locals 0

    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    const p3, 0x7f1104f4

    .line 159
    invoke-virtual {p0, p3}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->setAppScreenTitle(I)V

    .line 160
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    .line 161
    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    iput-object p3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleListed:Ljava/util/HashSet;

    .line 162
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productKicksMap:Ljava/util/HashMap;

    .line 163
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleKicksMap:Ljava/util/HashMap;

    const/4 p3, 0x0

    const v0, 0x7f0c016d

    .line 164
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    .line 165
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f090591

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 166
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getItemAnimator()Landroid/support/v7/widget/RecyclerView$ItemAnimator;

    move-result-object p1

    const-wide/16 v0, 0x64

    invoke-virtual {p1, v0, v1}, Landroid/support/v7/widget/RecyclerView$ItemAnimator;->setMoveDuration(J)V

    .line 168
    new-instance p1, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$2;

    invoke-direct {p1, p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$2;-><init>(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->itemStateCallback:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;

    .line 192
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f090014

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->button:Lcom/shopkick/app/widget/SKButton;

    .line 193
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->button:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 194
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->button:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 198
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->locationId:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 199
    new-instance p1, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->locationId:Ljava/lang/String;

    iget-object v4, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sget-object v5, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->supportedTileTypes:Ljava/util/List;

    iget-object v6, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->itemStateCallback:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;

    move-object v0, p1

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Ljava/lang/String;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    goto :goto_0

    .line 205
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->chainId:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 206
    new-instance p1, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->chainId:Ljava/lang/String;

    iget-object v4, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->longitude:Ljava/lang/Double;

    iget-object v5, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->latitude:Ljava/lang/Double;

    iget-object v6, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sget-object v7, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->supportedTileTypes:Ljava/util/List;

    iget-object v8, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->itemStateCallback:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;

    move-object v0, p1

    move-object v2, p0

    invoke-direct/range {v0 .. v8}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    .line 214
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->lastBestLocation:Landroid/location/Location;

    .line 215
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->lastBestLocation:Landroid/location/Location;

    if-eqz p1, :cond_1

    .line 216
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->longitude:Ljava/lang/Double;

    .line 217
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->lastBestLocation:Landroid/location/Location;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->latitude:Ljava/lang/Double;

    .line 218
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->longitude:Ljava/lang/Double;

    iget-object p3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->latitude:Ljava/lang/Double;

    invoke-virtual {p1, p2, p3}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->setCoordinate(Ljava/lang/Double;Ljava/lang/Double;)V

    goto :goto_0

    .line 220
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f09054a

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    .line 221
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/presence/LocationManager;->initiateLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 225
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->removeDefaultItemDecoration()V

    .line 226
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    const/16 p2, 0x30

    .line 227
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 228
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->setHeaderTileTypes(Ljava/util/Set;)V

    .line 230
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 231
    new-instance p1, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    .line 232
    invoke-virtual {p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 233
    iget-object p3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 235
    new-instance p1, Lcom/shopkick/app/products/CategoryJumperController;

    iget-object p3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-direct {p1, p0, p3, v0, v1}, Lcom/shopkick/app/products/CategoryJumperController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;Landroid/view/View;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    .line 236
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->clientFlags:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isProductSelectorItemCheckHeaderEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 237
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/products/CategoryJumperController;->disableJumperHeader(Ljava/lang/Boolean;)V

    .line 240
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 2
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

    const-string v0, "location_id"

    .line 129
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->locationId:Ljava/lang/String;

    const-string v0, "chain_id"

    .line 130
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->chainId:Ljava/lang/String;

    const-string v0, "preselected_bundle_id"

    .line 131
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->preselectedProductBundleId:Ljava/lang/String;

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->preselectedProductFamilyIds:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    const-string v0, "preselected_product_family_id"

    .line 134
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "preselected_product_family_ids"

    .line 137
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 138
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 139
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->preselectedProductFamilyIds:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 141
    :cond_0
    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->preselectedProductFamilyIds:Ljava/util/HashSet;

    const-string v1, ","

    invoke-virtual {p2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    .line 145
    :cond_1
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->account:Lcom/shopkick/app/account/UserAccount;

    .line 146
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->clientFlags:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 147
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    .line 148
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 151
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->clientFlags:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isPostScanReminderEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 152
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->preselectedProductFamilyIds:Ljava/util/HashSet;

    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->chainId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/products/PostScanNotificationController;->getScheduledProductFamilyIdsByChainId(Ljava/lang/String;)Ljava/util/HashSet;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    :cond_2
    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 375
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_SCREEN_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 296
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->validActivity()Z

    move-result p1

    if-eqz p1, :cond_a

    .line 302
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/activities/ReceiptScanActivity;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/ReceiptScanActivity;->uploadInProgress()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 309
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->receiptScanUploadLock:Ljava/lang/Object;

    monitor-enter p1

    .line 311
    :try_start_0
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->getController()Lcom/shopkick/app/receipts/IReceiptUploadController;

    move-result-object v0

    invoke-interface {v0}, Lcom/shopkick/app/receipts/IReceiptUploadController;->uploadInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 312
    monitor-exit p1

    return-void

    .line 315
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 316
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 317
    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productsListed:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lez v3, :cond_2

    .line 318
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 321
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleListed:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 322
    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleProductMap:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 323
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 326
    :cond_5
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->getController()Lcom/shopkick/app/receipts/IReceiptUploadController;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/shopkick/app/receipts/IReceiptUploadController;->setProductFamilies(Ljava/util/Collection;)V

    .line 327
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->getController()Lcom/shopkick/app/receipts/IReceiptUploadController;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleListed:Ljava/util/HashSet;

    invoke-interface {v0, v1}, Lcom/shopkick/app/receipts/IReceiptUploadController;->setBundleIds(Ljava/util/Collection;)V

    .line 328
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "chain_id"

    .line 329
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->locationId:Ljava/lang/String;

    if-eqz v1, :cond_6

    const-string v1, "location_id"

    .line 331
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    const-string v1, "origin_element"

    const/16 v2, 0x10

    .line 334
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 333
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "origin_screen"

    .line 335
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v2, v2, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->account:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->hasSeenReceiptInstructions()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_8

    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->forceReceiptInstructionsDebug()Z

    move-result v1

    if-nez v1, :cond_8

    .line 339
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->clientFlags:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableOcrProcessing:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 340
    const-class v1, Lcom/shopkick/app/activities/ReceiptScanActivity;

    const-class v2, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {p0, v1, v2, v0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_2

    .line 342
    :cond_7
    const-class v1, Lcom/shopkick/app/activities/ReceiptScanActivity;

    const-class v2, Lcom/shopkick/app/receipts/ReceiptScanV2Screen;

    invoke-virtual {p0, v1, v2, v0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 344
    :goto_2
    monitor-exit p1

    return-void

    .line 348
    :cond_8
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->clientFlags:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->getReceiptInstructionScreenType(Lcom/shopkick/app/application/ClientFlagsManager;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 361
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->clientFlags:Lcom/shopkick/app/application/ClientFlagsManager;

    goto :goto_3

    .line 355
    :pswitch_0
    const-class v1, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    const-string v2, "INSTRUCTIONS_TYPE"

    const/4 v3, 0x2

    .line 357
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 356
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :pswitch_1
    const-string v1, "INSTRUCTIONS_TYPE"

    .line 351
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 350
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    const-class v1, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    goto :goto_4

    .line 361
    :goto_3
    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableOcrProcessing:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 362
    const-class v1, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    goto :goto_4

    .line 364
    :cond_9
    const-class v1, Lcom/shopkick/app/receipts/ReceiptScanV2Screen;

    .line 369
    :goto_4
    const-class v2, Lcom/shopkick/app/activities/ReceiptScanActivity;

    invoke-virtual {p0, v2, v1, v0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 370
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 298
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " Not an instance of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ReceiptScanActivity"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 117
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    if-eqz v0, :cond_0

    .line 262
    invoke-virtual {v0}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->destroy()V

    .line 264
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 2

    .line 269
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 270
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->firstFetchMade:Z

    if-nez v0, :cond_1

    .line 271
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->startRequest()V

    .line 272
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->validActivity()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 273
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->getController()Lcom/shopkick/app/receipts/IReceiptUploadController;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->chainId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/shopkick/app/receipts/IReceiptUploadController;->setChainId(Ljava/lang/String;)V

    .line 274
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->getController()Lcom/shopkick/app/receipts/IReceiptUploadController;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->locationId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/shopkick/app/receipts/IReceiptUploadController;->setLocationId(Ljava/lang/String;)V

    goto :goto_0

    .line 276
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Valid receipt scan controller found"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public onTilesLoaded(Ljava/util/ArrayList;Ljava/util/HashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "PRODUCT_SELECTOR_SCREEN_BUNDLE_PRODUCT_MAP_KEY"

    .line 511
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleProductMap:Ljava/util/HashMap;

    const-string v0, "PRODUCT_SELECTOR_SCREEN_OFFER_KICKS_MAP"

    .line 512
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->productKicksMap:Ljava/util/HashMap;

    const-string v0, "PRODUCT_SELECTOR_SCREEN_BUNDLE_KICKS_MAP"

    .line 513
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/HashMap;

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleKicksMap:Ljava/util/HashMap;

    .line 515
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->preselectedProductFamilyIds:Ljava/util/HashSet;

    invoke-virtual {p2}, Ljava/util/HashSet;->isEmpty()Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_2

    move p2, v0

    .line 516
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p2, v1, :cond_1

    .line 517
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 518
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->preselectedProductFamilyIds:Ljava/util/HashSet;

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 519
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p0, v2, v0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->toggleItem(Ljava/lang/String;Z)Z

    .line 520
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 521
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->maybeExpandOrCollapseMPR(I)V

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 525
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->preselectedProductFamilyIds:Ljava/util/HashSet;

    invoke-virtual {p2}, Ljava/util/HashSet;->clear()V

    .line 527
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->preselectedProductBundleId:Ljava/lang/String;

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_5

    move p2, v0

    .line 528
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p2, v1, :cond_4

    .line 529
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 530
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    if-eqz v2, :cond_3

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    .line 531
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->preselectedProductBundleId:Ljava/lang/String;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    .line 532
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 533
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->preselectedProductBundleId:Ljava/lang/String;

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->toggleItem(Ljava/lang/String;Z)Z

    goto :goto_2

    :cond_3
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    const/4 p1, 0x0

    .line 537
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->preselectedProductBundleId:Ljava/lang/String;

    .line 540
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->getFilteredTiles()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/products/CategoryJumperController;->setupJumpHeader(Ljava/util/List;)V

    return-void
.end method

.method public showJumpToCategory()V
    .locals 0

    return-void
.end method

.method public toggleItem(Ljava/lang/String;Z)Z
    .locals 2

    if-eqz p2, :cond_0

    .line 391
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->toggleBundleItem(Ljava/lang/String;)Z

    move-result p1

    goto :goto_0

    .line 393
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleListed:Ljava/util/HashSet;

    invoke-virtual {p2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 394
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->bundleProductMap:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 395
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p1, 0x1

    return p1

    .line 400
    :cond_3
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->toggleProductItem(Ljava/lang/String;)Z

    move-result p1

    .line 402
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->updateClaimButton()V

    return p1
.end method

.method public updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 245
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 248
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->params:Ljava/util/Map;

    const-string v1, "notification_type"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->isPNSTypeLogged:Z

    if-nez v0, :cond_0

    .line 249
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->params:Ljava/util/Map;

    const-string v1, "chain_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 250
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->params:Ljava/util/Map;

    const-string v1, "location_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 251
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->params:Ljava/util/Map;

    const-string v1, "notification_type"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNotificationType(Ljava/lang/Integer;)V

    const/4 p1, 0x1

    .line 255
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->isPNSTypeLogged:Z

    :cond_0
    return-void
.end method

.method public uploadFinished(Z)V
    .locals 1

    if-nez p1, :cond_0

    .line 505
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->button:Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public uploadStarted()V
    .locals 2

    .line 498
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->button:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    return-void
.end method
