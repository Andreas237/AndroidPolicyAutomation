.class public Lcom/shopkick/app/products/ScansForLocationScreenV2;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ScansForLocationScreenV2.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanLaunchScreen;
.implements Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;


# instance fields
.field private adapter:Lcom/shopkick/app/products/ScansListAdapter;

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private bbyLimitView:Landroid/support/constraint/ConstraintLayout;

.field private categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

.field private chainId:Ljava/lang/String;

.field private chainName:Ljava/lang/String;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private initiatedFetch:Z

.field private lastBestLocation:Landroid/location/Location;

.field private lastGoToScanTileIndex:Ljava/lang/Integer;

.field private locationId:Ljava/lang/String;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field poppedScreenClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private productFamilyId:Ljava/lang/String;

.field private progressBar:Landroid/view/View;

.field private scanKicksBarController:Lcom/shopkick/app/products/ScanKicksBarController;

.field private scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private shouldRefresh:Z

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 95
    new-instance v0, Lcom/shopkick/app/products/ScansForLocationScreenV2$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2$1;-><init>(Lcom/shopkick/app/products/ScansForLocationScreenV2;)V

    iput-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/products/ScansForLocationScreenV2;)Landroid/location/Location;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->lastBestLocation:Landroid/location/Location;

    return-object p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/products/ScansForLocationScreenV2;Landroid/location/Location;)Landroid/location/Location;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->lastBestLocation:Landroid/location/Location;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/products/ScansForLocationScreenV2;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->fetchScanTiles()V

    return-void
.end method

.method private createAndSortScanTiles(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    .line 386
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 389
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 390
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    .line 392
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productCategory:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 393
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 396
    new-instance v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v4}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v5, 0x16

    .line 397
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 398
    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productCategory:Ljava/lang/String;

    iput-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 399
    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->displayProductHierarchyId:Ljava/lang/String;

    iput-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    .line 400
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 402
    iget-object v4, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    invoke-static {v2, v4}, Lcom/shopkick/app/util/TileUtils;->createTileInfoFromScanInfo(Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 403
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productCategory:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 405
    :cond_0
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productCategory:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    .line 406
    invoke-static {v2, v4}, Lcom/shopkick/app/util/TileUtils;->createTileInfoFromScanInfo(Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 411
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 412
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 415
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 417
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    .line 419
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    .line 418
    invoke-virtual {v3, v5, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v3

    .line 420
    new-instance v4, Lcom/shopkick/app/util/TileUtils$TileInfoV2ScanKicksComparator;

    invoke-direct {v4}, Lcom/shopkick/app/util/TileUtils$TileInfoV2ScanKicksComparator;-><init>()V

    invoke-static {v3, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 421
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 424
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 425
    invoke-static {v4}, Lcom/shopkick/app/util/TileUtils;->isReceiptScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 426
    iget-object v3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanKicksBarController:Lcom/shopkick/app/products/ScanKicksBarController;

    invoke-virtual {v3, v5}, Lcom/shopkick/app/products/ScanKicksBarController;->setReceiptScanAvailableForAnyItem(Z)V

    .line 431
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method private fetchScanTiles()V
    .locals 2

    .line 224
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->locationId:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->productFamilyId:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    .line 228
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->locationId:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->lastBestLocation:Landroid/location/Location;

    if-nez v0, :cond_1

    return-void

    .line 234
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->fetchNextPage()V

    .line 235
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanKicksBarController:Lcom/shopkick/app/products/ScanKicksBarController;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/ScanKicksBarController;->setReceiptScanAvailableForAnyItem(Z)V

    return-void
.end method

.method private setScreenTitle()V
    .locals 4

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainName:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    .line 240
    iput-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainName:Ljava/lang/String;

    :cond_0
    const-string v0, "40560331"

    .line 244
    iget-object v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f110635

    .line 245
    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->setAppScreenTitle(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const v0, 0x7f110634

    const/4 v1, 0x1

    .line 247
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainName:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->setAppScreenTitle(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private updateBBYLimitView()V
    .locals 12

    .line 359
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->limitBbyScans:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "40560331"

    iget-object v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 360
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    .line 361
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getBestBuyScanLimit()I

    move-result v0

    const v2, 0x7f090076

    const v3, 0x7f09006e

    const v4, 0x7f09006f

    const v5, 0x7f090073

    const v6, 0x7f090384

    const/4 v7, 0x4

    if-lez v0, :cond_0

    .line 362
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v6}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v9}, Lcom/shopkick/app/application/AppPreferences;->getBestBuyScanLimit()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ""

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 363
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v5}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v8, 0x7f0f0005

    iget-object v9, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 364
    invoke-virtual {v9}, Lcom/shopkick/app/application/AppPreferences;->getBestBuyScanLimit()I

    move-result v9

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    iget-object v11, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v11}, Lcom/shopkick/app/application/AppPreferences;->getBestBuyScanLimit()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v10, v1

    .line 363
    invoke-virtual {p0, v8, v9, v10}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 365
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v6}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 366
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v4}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 367
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v5}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 368
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v3}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 369
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v2}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->bbyScanCountdownRiderText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 373
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v6}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 374
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v4}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 375
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v5}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 376
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v3}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 377
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v2}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->bbyScanLimitReachedRiderText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 381
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    const/4 p3, 0x0

    const v0, 0x7f0c019d

    .line 125
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090621

    .line 126
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const p2, 0x7f09054a

    .line 127
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->progressBar:Landroid/view/View;

    const p2, 0x7f090075

    .line 128
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/support/constraint/ConstraintLayout;

    iput-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->bbyLimitView:Landroid/support/constraint/ConstraintLayout;

    .line 129
    invoke-direct {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->updateBBYLimitView()V

    const/16 p2, 0x9

    .line 131
    new-array p2, p2, [Ljava/lang/Integer;

    const/16 v0, 0x17

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, p3

    const/16 p3, 0x16

    .line 132
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v0, 0x1

    aput-object p3, p2, v0

    const/16 p3, 0x41

    .line 133
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x2

    aput-object p3, p2, v1

    const/16 p3, 0x18

    .line 134
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x3

    aput-object p3, p2, v1

    const/16 p3, 0x2b

    .line 135
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x4

    aput-object p3, p2, v1

    const/16 p3, 0xfa6

    .line 136
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x5

    aput-object p3, p2, v1

    const/16 p3, 0x3ed

    .line 137
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x6

    aput-object p3, p2, v1

    const/4 p3, -0x1

    .line 138
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x7

    aput-object p3, p2, v1

    const/4 p3, -0x2

    .line 139
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/16 v1, 0x8

    aput-object p3, p2, v1

    .line 131
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 141
    new-instance p2, Lcom/shopkick/app/products/ScansListAdapter;

    iget-object v3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v6, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sget-object v8, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->Simple:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    move-object v2, p2

    move-object v4, p0

    move-object v5, p0

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/products/ScansListAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V

    iput-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    .line 148
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/products/ScansListAdapter;->setDividerItemDecorationRule(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;)V

    .line 149
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object p3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 151
    new-instance p2, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 152
    invoke-virtual {p2, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 153
    iget-object p3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 156
    new-instance p2, Lcom/shopkick/app/products/CategoryJumperController;

    iget-object p3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-direct {p2, p0, p3, p1, v0}, Lcom/shopkick/app/products/CategoryJumperController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;Landroid/view/View;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    iput-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    .line 159
    new-instance p2, Lcom/shopkick/app/products/ScanKicksBarController;

    iget-object p3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-direct {p2, p1, p3}, Lcom/shopkick/app/products/ScanKicksBarController;-><init>(Landroid/view/View;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;)V

    iput-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanKicksBarController:Lcom/shopkick/app/products/ScanKicksBarController;

    .line 161
    invoke-direct {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->setScreenTitle()V

    .line 163
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "ScanBCSucceeded"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 164
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "eventScanIrResponseSuccess"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 165
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "EventVideoBonusKicksCompleted"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 166
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "EventReceiptScanUploaded"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 167
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "offlineScanBarcodeReady"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 168
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "offlineScanFailed"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 169
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "offlineScanBarcodeEnqueued"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 170
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "EventUpdateUI2DIRAndVideoFeature"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 2

    .line 261
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationRequestV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationRequestV2;-><init>()V

    .line 262
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->locationId:Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationRequestV2;->locationId:Ljava/lang/String;

    .line 263
    iget-object v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationRequestV2;->chainId:Ljava/lang/String;

    .line 264
    iget-object v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->productFamilyId:Ljava/lang/String;

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationRequestV2;->productFamilyId:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 265
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->lastBestLocation:Landroid/location/Location;

    if-eqz v0, :cond_0

    .line 266
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationRequestV2;->latitude:Ljava/lang/Double;

    .line 267
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->lastBestLocation:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationRequestV2;->longitude:Ljava/lang/Double;

    :cond_0
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

    .line 111
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 112
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 113
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 114
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-string p1, "location_id"

    .line 116
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->locationId:Ljava/lang/String;

    const-string p1, "chain_id"

    .line 117
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    const-string p1, "product_family_id"

    .line 118
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->productFamilyId:Ljava/lang/String;

    const-string p1, "chain_name"

    .line 119
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainName:Ljava/lang/String;

    const/4 p1, 0x1

    .line 120
    iput-boolean p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->shouldRefresh:Z

    return-void
.end method

.method public maybeScrollToProductFamilySection()V
    .locals 2

    .line 438
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    iget-object v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/ScansListAdapter;->getSectionPositionForProductFamilyId(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 440
    iget-object v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/products/CategoryJumperController;->scrollToPosition(I)V

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 215
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 216
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->cancelLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 218
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->clearWidgets()V

    .line 219
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->destroy()V

    .line 220
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 4
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

    .line 447
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "offlineScanBarcodeEnqueued"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    goto :goto_1

    :sswitch_1
    const-string v0, "ScanBCSucceeded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :sswitch_2
    const-string v0, "offlineScanBarcodeReady"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_1

    :sswitch_3
    const-string v0, "EventVideoBonusKicksCompleted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_4
    const-string v0, "offlineScanFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x5

    goto :goto_1

    :sswitch_5
    const-string v0, "eventScanIrResponseSuccess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_1

    :sswitch_6
    const-string v0, "EventUpdateUI2DIRAndVideoFeature"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x7

    goto :goto_1

    :sswitch_7
    const-string v0, "EventReceiptScanUploaded"

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

    goto/16 :goto_6

    .line 528
    :pswitch_0
    iput-boolean v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->shouldRefresh:Z

    goto/16 :goto_6

    .line 517
    :pswitch_1
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->isTopScreen()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 518
    invoke-direct {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->fetchScanTiles()V

    goto/16 :goto_6

    .line 520
    :cond_1
    iput-boolean v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->shouldRefresh:Z

    goto/16 :goto_6

    .line 509
    :pswitch_2
    iput-boolean v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->shouldRefresh:Z

    goto/16 :goto_6

    .line 503
    :pswitch_3
    iput-boolean v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->shouldRefresh:Z

    goto/16 :goto_6

    .line 497
    :pswitch_4
    iput-boolean v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->shouldRefresh:Z

    goto/16 :goto_6

    :pswitch_5
    const-string p1, "locId"

    .line 452
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 455
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->lastGoToScanTileIndex:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 456
    iget-object v3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/shopkick/app/products/ScansListAdapter;->getFilteredTile(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v2

    .line 459
    :goto_2
    iget-object v3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->locationId:Ljava/lang/String;

    invoke-static {v3}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->locationId:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "40560331"

    iget-object v3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    .line 460
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->limitBbyScans:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 461
    iget-object p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanKicksBarController:Lcom/shopkick/app/products/ScanKicksBarController;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/products/ScanKicksBarController;->prepareBlueToast(Ljava/util/HashMap;)V

    :cond_3
    const-string p1, "scanTileInfo"

    .line 464
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 465
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result p2

    if-ltz p2, :cond_4

    .line 466
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/products/ScansListAdapter;->updateTileInfo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_3

    .line 468
    :cond_4
    iput-boolean v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->shouldRefresh:Z

    :goto_3
    if-eqz v0, :cond_7

    .line 471
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 472
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 p2, 0x2e

    .line 473
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 474
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 475
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    iget-object v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->lastGoToScanTileIndex:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/shopkick/app/products/ScansListAdapter;->getCategoryTileForPosition(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 476
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    iget-object v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->lastGoToScanTileIndex:Ljava/lang/Integer;

    .line 477
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/shopkick/app/products/ScansListAdapter;->getCategoryTileForPosition(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    .line 476
    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductHierarchyId(Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    const-string p2, "TaxonomyNodeIdOther"

    .line 479
    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductHierarchyId(Ljava/lang/String;)V

    .line 481
    :goto_4
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanMissionId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScanMissionId(Ljava/lang/String;)V

    .line 482
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumKicks(Ljava/lang/Integer;)V

    .line 483
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->displayTaxonomyNodeId:Ljava/lang/String;

    if-eqz p2, :cond_6

    .line 484
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->displayTaxonomyNodeId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCategoryId(Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    const-string p2, "TaxonomyNodeIdOther"

    .line 486
    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCategoryId(Ljava/lang/String;)V

    .line 489
    :goto_5
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 491
    :cond_7
    iput-object v2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->lastGoToScanTileIndex:Ljava/lang/Integer;

    :goto_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x57c9a285 -> :sswitch_7
        -0x2ddd5220 -> :sswitch_6
        -0x1b10bf5e -> :sswitch_5
        -0x106e20a3 -> :sswitch_4
        -0xf052804 -> :sswitch_3
        0x550c423 -> :sswitch_2
        0x2ae28463 -> :sswitch_1
        0x43b738dc -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPreFetch(Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 0

    return-void
.end method

.method protected onScreenDidHide()V
    .locals 2

    .line 207
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 208
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->isTopScreen()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 209
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->poppedScreenClass:Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method protected onScreenDidShow()V
    .locals 2

    .line 180
    iget-boolean v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->initiatedFetch:Z

    if-nez v0, :cond_1

    .line 181
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->lastBestLocation:Landroid/location/Location;

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->lastBestLocation:Landroid/location/Location;

    if-nez v0, :cond_0

    .line 183
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->initiateLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    goto :goto_0

    .line 185
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->fetchScanTiles()V

    :goto_0
    const/4 v0, 0x1

    .line 187
    iput-boolean v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->initiatedFetch:Z

    goto :goto_1

    .line 188
    :cond_1
    iget-boolean v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->shouldRefresh:Z

    if-eqz v0, :cond_2

    .line 190
    invoke-direct {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->fetchScanTiles()V

    .line 192
    :cond_2
    :goto_1
    invoke-direct {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->updateBBYLimitView()V

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->notifyDataSetChanged()V

    .line 196
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->poppedScreenClass:Ljava/lang/Class;

    if-eqz v0, :cond_4

    const-string v0, "40560331"

    .line 197
    iget-object v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->limitBbyScans:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanKicksBarController:Lcom/shopkick/app/products/ScanKicksBarController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScanKicksBarController;->maybeAnimateTotalTripKicks()V

    :cond_3
    const/4 v0, 0x0

    .line 200
    iput-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->lastGoToScanTileIndex:Ljava/lang/Integer;

    .line 201
    iput-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->poppedScreenClass:Ljava/lang/Class;

    :cond_4
    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 6

    .line 275
    iget-object p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->progressBar:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 276
    new-instance p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 277
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 278
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->clearWidgets()V

    .line 279
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/ScansListAdapter;->setEnableWidgetCategorization(Z)V

    .line 280
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/CategoryJumperController;->setHeaderSkLinkEnabled(Z)V

    .line 282
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_8

    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_8

    .line 283
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;

    .line 285
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->chainName:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 286
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->chainName:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainName:Ljava/lang/String;

    .line 287
    invoke-direct {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->setScreenTitle()V

    .line 290
    :cond_0
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->scanTiles:Ljava/util/List;

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->scanTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_3

    .line 295
    :cond_1
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 296
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->scanTiles:Ljava/util/List;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    const-string v0, "40560331"

    .line 297
    iget-object v3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->limitBbyScans:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 299
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->scanTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 300
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x41

    if-ne v4, v5, :cond_2

    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    :goto_1
    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    goto :goto_0

    .line 304
    :cond_3
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isScanOffersWidgetEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->scanTiles:Ljava/util/List;

    iget-object v3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    .line 305
    invoke-virtual {v3}, Lcom/shopkick/app/products/ScansListAdapter;->getHeaderTileTypes()Ljava/util/Set;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/shopkick/app/util/TileUtils;->countOfferTiles(Ljava/util/List;Ljava/util/Set;)I

    move-result v0

    const/16 v3, 0x1e

    if-le v0, v3, :cond_4

    move v0, v2

    goto :goto_2

    :cond_4
    move v0, v1

    .line 307
    :goto_2
    iget-object v3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v3, v0}, Lcom/shopkick/app/products/ScansListAdapter;->setEnableWidgetCategorization(Z)V

    .line 308
    iget-object v3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-virtual {v3, v0}, Lcom/shopkick/app/products/CategoryJumperController;->setHeaderSkLinkEnabled(Z)V

    .line 311
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->scanTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 312
    invoke-static {v3}, Lcom/shopkick/app/util/TileUtils;->isReceiptScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 313
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanKicksBarController:Lcom/shopkick/app/products/ScanKicksBarController;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/products/ScanKicksBarController;->setReceiptScanAvailableForAnyItem(Z)V

    goto :goto_4

    .line 291
    :cond_6
    :goto_3
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->NO_CONTENT:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    const v0, 0x7f110633

    .line 292
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainName:Ljava/lang/String;

    aput-object v3, v2, v1

    invoke-virtual {p0, v0, v2}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->noContentMessage:Ljava/lang/String;

    .line 320
    :cond_7
    :goto_4
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->locationId:Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->locationId:Ljava/lang/String;

    .line 321
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->getParams()Ljava/util/Map;

    move-result-object p2

    const-string v0, "location_id"

    .line 322
    iget-object v2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->locationId:Ljava/lang/String;

    invoke-interface {p2, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    invoke-virtual {p0, p2}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->setParams(Ljava/util/Map;)V

    .line 325
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v0, Lcom/shopkick/app/products/ScansForLocationScreenV2$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2$2;-><init>(Lcom/shopkick/app/products/ScansForLocationScreenV2;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->post(Ljava/lang/Runnable;)Z

    .line 332
    iput-boolean v1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->shouldRefresh:Z

    goto :goto_5

    .line 334
    :cond_8
    iget v0, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_9

    iget p2, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v0, 0x7

    if-ne p2, v0, :cond_b

    :cond_9
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p2, p2, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    .line 335
    invoke-virtual {p2, v0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfosForChain(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_b

    .line 337
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p2, p2, Lcom/shopkick/app/application/ScreenGlobals;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/chains/ChainDataSource;->getChainInfo(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;

    move-result-object p2

    if-eqz p2, :cond_a

    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainName:Ljava/lang/String;

    if-nez p2, :cond_a

    .line 338
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p2, p2, Lcom/shopkick/app/application/ScreenGlobals;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/chains/ChainDataSource;->getChainInfo(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;

    move-result-object p2

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;->chainName:Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainName:Ljava/lang/String;

    .line 339
    invoke-direct {p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->setScreenTitle()V

    .line 342
    :cond_a
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 343
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p2, p2, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->chainId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfosForChain(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->createAndSortScanTiles(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 344
    iget-object p2, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v0, Lcom/shopkick/app/products/ScansForLocationScreenV2$3;

    invoke-direct {v0, p0}, Lcom/shopkick/app/products/ScansForLocationScreenV2$3;-><init>(Lcom/shopkick/app/products/ScansForLocationScreenV2;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->post(Ljava/lang/Runnable;)Z

    goto :goto_5

    .line 351
    :cond_b
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    :goto_5
    return-object p1
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

    .line 544
    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getDividerItemDecoration()Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    move-result-object p1

    .line 545
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->clearRule()V

    const/4 v0, 0x0

    move v1, v0

    .line 547
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 548
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 549
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x16

    if-eq v2, v3, :cond_0

    const/16 v3, 0x18

    if-eq v2, v3, :cond_0

    const/16 v3, 0x2b

    if-eq v2, v3, :cond_0

    const/16 v3, 0x41

    if-eq v2, v3, :cond_0

    .line 557
    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    goto :goto_1

    .line 554
    :cond_0
    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    invoke-direct {v2, v1, v0}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setLastGoToScanTileIndex(I)V
    .locals 0

    .line 535
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2;->lastGoToScanTileIndex:Ljava/lang/Integer;

    return-void
.end method
