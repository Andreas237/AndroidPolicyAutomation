.class public Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;
.source "ShoppingListProductTileViewHolderConfigurator.java"

# interfaces
.implements Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;
    }
.end annotation


# instance fields
.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private context:Landroid/content/Context;

.field private currentChainId:Ljava/lang/String;

.field private listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

.field private locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field private scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 6

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p6

    move-object v4, p8

    move-object v5, p1

    .line 70
    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    .line 76
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->context:Landroid/content/Context;

    .line 77
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 78
    iput-object p5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    .line 79
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 80
    iput-object p7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 81
    iput-object p9, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    return-void
.end method

.method public static createProductEntryTileFromShoppingListEntry(Ljava/lang/String;Lcom/shopkick/app/products/ProductsDataSource;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 2

    .line 102
    invoke-static {p0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 106
    :cond_0
    invoke-virtual {p1, p0}, Lcom/shopkick/app/products/ProductsDataSource;->getProductForProductId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/Product;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 109
    new-instance p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {p1}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Product;->productId:Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->productId:Ljava/lang/String;

    .line 111
    iput-object p0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Product;->images:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ProductImage;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProductImage;->imageUrl:Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->mainImageUrl:Ljava/lang/String;

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Product;->chainId:Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainId:Ljava/lang/String;

    .line 117
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;-><init>()V

    iput-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 118
    iget-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/Product;->productId:Ljava/lang/String;

    iput-object p0, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    return-object p1

    :cond_1
    return-object v1
.end method

.method public static createScanEntryTileFromShoppingListEntry(Ljava/lang/String;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 2

    .line 86
    invoke-static {p0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 90
    :cond_0
    invoke-virtual {p1, p0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForProductFamilyId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 93
    invoke-static {p0, v1}, Lcom/shopkick/app/util/TileUtils;->createTileInfoFromScanInfo(Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method

.method private setupCheckboxLogging(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/logging/UserEventImageView;)V
    .locals 4

    .line 363
    iget-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->getStandardLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v0

    const/16 v1, 0xe5

    .line 364
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 365
    iget-object p1, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v1, 0x3e

    const/16 v2, 0x3d

    const/4 v3, 0x2

    if-ne p1, v3, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 367
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object p2

    invoke-virtual {p3, v0, p1, p2}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 368
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 369
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 371
    invoke-virtual {p3, p1}, Lcom/shopkick/app/logging/UserEventImageView;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    return-void
.end method

.method private setupImpressionAndClickLogging(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 375
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object v0

    const/4 v1, 0x0

    .line 376
    iput-boolean v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 377
    iget-object p1, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object p1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 378
    iget-object p1, p2, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast p1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, p3, p2, v0}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private setupMoreBtnLogging(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/logging/UserEventImageView;)V
    .locals 1

    .line 382
    iget-object p1, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->getStandardLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p1

    const/16 v0, 0xe7

    .line 383
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    const/4 v0, 0x4

    .line 384
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 385
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object p2

    invoke-virtual {p3, p1, v0, p2}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f09053e

    .line 402
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01b2

    return v0
.end method

.method public goToScreenFromDialog(ZLcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 8

    if-eqz p1, :cond_0

    .line 414
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    const/16 v7, 0xc6

    move v2, p5

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v0 .. v7}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->goToReceiptScanScreen(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 423
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    iget-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    const/16 p4, 0xc2

    invoke-static {p1, p3, p2, p4}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->goToStoreDetailsScreen(Ljava/lang/ref/WeakReference;Lcom/shopkick/app/cpg/LocationDataSource;Ljava/lang/String;I)V

    :goto_0
    return-void
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 1

    if-eqz p2, :cond_1

    .line 391
    instance-of v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    .line 392
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f09053e

    .line 396
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 397
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 19

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v0, p2

    .line 140
    invoke-virtual/range {p0 .. p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 143
    instance-of v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-nez v1, :cond_0

    return-void

    .line 148
    :cond_0
    move-object v1, v0

    check-cast v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 151
    iget-object v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-nez v2, :cond_1

    return-void

    .line 156
    :cond_1
    invoke-static {v1}, Lcom/shopkick/app/util/TileUtils;->isBarcodeScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v2

    .line 157
    iget-object v3, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v3, v1}, Lcom/shopkick/app/util/TileUtils;->isIRScanAvailable(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v3

    .line 158
    iget-object v4, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v4, v1}, Lcom/shopkick/app/util/TileUtils;->isVideoAvailable(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v4

    .line 159
    invoke-static {v1}, Lcom/shopkick/app/util/TileUtils;->isReceiptScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v5

    .line 160
    iget-object v6, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->currentChainId:Ljava/lang/String;

    if-eqz v6, :cond_2

    iget-object v6, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainIds:Ljava/util/List;

    if-eqz v6, :cond_2

    iget-object v6, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainIds:Ljava/util/List;

    iget-object v11, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->currentChainId:Ljava/lang/String;

    .line 162
    invoke-interface {v6, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    const/4 v11, 0x1

    goto :goto_0

    :cond_2
    const/4 v11, 0x0

    .line 163
    :goto_0
    iget-object v6, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    invoke-static {v6}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v12

    if-eqz v2, :cond_3

    .line 166
    iget-object v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v3, :cond_4

    .line 167
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    if-eqz v4, :cond_5

    .line 168
    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    :goto_3
    add-int/2addr v2, v3

    add-int v13, v2, v4

    if-eqz v5, :cond_6

    .line 170
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move v14, v2

    goto :goto_4

    :cond_6
    const/4 v14, 0x0

    :goto_4
    const v2, 0x7f090068

    .line 173
    invoke-virtual {v8, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    const v3, 0x7f090066

    .line 174
    invoke-virtual {v8, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v3

    const v4, 0x7f09053e

    .line 175
    invoke-virtual {v8, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v4

    const v5, 0x7f090545

    .line 176
    invoke-virtual {v8, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v5

    const v6, 0x7f0900fb

    .line 177
    invoke-virtual {v8, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v15

    const v6, 0x7f090486

    .line 178
    invoke-virtual {v8, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v6

    .line 181
    iget-object v10, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainIds:Ljava/util/List;

    if-eqz v10, :cond_7

    iget-object v10, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainIds:Ljava/util/List;

    const-string v9, "40560331"

    .line 182
    invoke-interface {v10, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    iget-object v9, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainIds:Ljava/util/List;

    .line 183
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x1

    if-ne v9, v10, :cond_7

    iget-object v9, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 184
    invoke-virtual {v9}, Lcom/shopkick/app/application/AppPreferences;->getBestBuyScanLimit()I

    move-result v9

    if-gtz v9, :cond_7

    .line 185
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iput-object v9, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    :cond_7
    const/4 v9, 0x0

    .line 189
    invoke-virtual {v4, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 192
    iget-object v9, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-static {v9}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_8

    iget-object v9, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v9, v9, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->title:Ljava/lang/String;

    goto :goto_5

    :cond_8
    iget-object v9, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 193
    :goto_5
    iget-object v10, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {v7, v10}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->generateQuantityString(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/lang/String;

    move-result-object v10

    .line 194
    invoke-virtual {v7, v5, v9, v10}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->updateQuantity(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    iget-object v9, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v9, v9, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const/4 v10, 0x2

    if-ne v9, v10, :cond_9

    const/4 v9, 0x1

    .line 198
    invoke-virtual {v15, v9}, Lcom/shopkick/app/logging/UserEventImageView;->setSelected(Z)V

    .line 199
    invoke-virtual {v5}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v9

    or-int/lit8 v9, v9, 0x10

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setPaintFlags(I)V

    const v5, 0x3f19999a    # 0.6f

    .line 200
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setAlpha(F)V

    goto :goto_6

    :cond_9
    const/4 v9, 0x0

    .line 202
    invoke-virtual {v15, v9}, Lcom/shopkick/app/logging/UserEventImageView;->setSelected(Z)V

    .line 203
    invoke-virtual {v5}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v9

    and-int/lit8 v9, v9, -0x11

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setPaintFlags(I)V

    const/high16 v5, 0x3f800000    # 1.0f

    .line 204
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 208
    :goto_6
    invoke-direct {v7, v1, v8, v15}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->setupCheckboxLogging(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/logging/UserEventImageView;)V

    .line 211
    iget-object v4, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {v7, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->getStandardLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v4

    const/4 v5, 0x4

    .line 212
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 213
    iget-object v5, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setShoppingListEntryId(Ljava/lang/String;)V

    const v9, 0x7f09060d

    const v10, 0x7f0903fa

    const/16 v5, 0x8

    if-nez v12, :cond_11

    if-eqz v11, :cond_a

    .line 218
    invoke-virtual {v8, v10}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 219
    invoke-virtual {v8, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f09053a

    .line 220
    invoke-virtual {v8, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    move/from16 v18, v11

    move/from16 v16, v14

    move-object/from16 v17, v15

    goto/16 :goto_9

    .line 223
    :cond_a
    invoke-virtual {v8, v10}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v10, v5}, Landroid/view/View;->setVisibility(I)V

    .line 224
    invoke-virtual {v8, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Landroid/view/View;->setVisibility(I)V

    const v9, 0x7f09053a

    .line 225
    invoke-virtual {v8, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v9

    invoke-virtual {v9, v5}, Landroid/view/View;->setVisibility(I)V

    .line 227
    iget-object v9, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f060022

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    .line 228
    iget-object v10, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v5, 0x7f0600c6

    invoke-virtual {v10, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 229
    iget-object v10, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    move-object/from16 v17, v15

    const v15, 0x7f0600fe

    invoke-virtual {v10, v15}, Landroid/content/res/Resources;->getColor(I)I

    move-result v10

    .line 232
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v15}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v15

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    .line 234
    invoke-virtual {v2, v15}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 235
    invoke-virtual {v3, v15}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 237
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v15}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2, v15}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 244
    iget-object v15, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    move/from16 v18, v11

    iget-object v11, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v11, v11, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v15, v11}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->isPending(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_b

    .line 245
    invoke-virtual {v2, v10}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const v2, 0x7f080082

    .line 246
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_7

    .line 247
    :cond_b
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v10}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v10

    if-nez v10, :cond_c

    .line 249
    invoke-virtual {v2, v5}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const v2, 0x7f080081

    .line 250
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_7

    .line 252
    :cond_c
    invoke-virtual {v2, v9}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const v2, 0x7f08007f

    .line 253
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_7

    :cond_d
    move/from16 v18, v11

    const/16 v10, 0x8

    .line 256
    invoke-virtual {v2, v10}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 257
    invoke-virtual {v3, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_7
    const v2, 0x7f090590

    .line 260
    invoke-virtual {v8, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    const v3, 0x7f090589

    .line 261
    invoke-virtual {v8, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v3

    .line 263
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v10}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v10

    if-eqz v10, :cond_10

    const/4 v10, 0x0

    .line 264
    invoke-virtual {v2, v10}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 265
    invoke-virtual {v3, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 266
    iget-object v11, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    invoke-static {v11}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v11

    if-eqz v11, :cond_e

    .line 267
    iget-object v11, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->context:Landroid/content/Context;

    const/4 v15, 0x2

    new-array v15, v15, [Ljava/lang/Object;

    move/from16 v16, v14

    iget-object v14, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    .line 268
    invoke-virtual {v14}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v15, v10

    iget-object v10, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v14, 0x1

    aput-object v10, v15, v14

    const v10, 0x7f1106ae

    .line 267
    invoke-virtual {v11, v10, v15}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const/high16 v10, 0x41800000    # 16.0f

    .line 269
    invoke-virtual {v2, v10}, Lcom/shopkick/app/widget/SKTextView;->setTextSize(F)V

    goto :goto_8

    :cond_e
    move/from16 v16, v14

    const/high16 v10, 0x41900000    # 18.0f

    .line 271
    invoke-virtual {v2, v10}, Lcom/shopkick/app/widget/SKTextView;->setTextSize(F)V

    .line 272
    iget-object v10, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 275
    :goto_8
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 277
    invoke-virtual {v2, v5}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const v0, 0x7f080261

    .line 278
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_9

    .line 280
    :cond_f
    invoke-virtual {v2, v9}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const v0, 0x7f080262

    .line 281
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_9

    :cond_10
    move/from16 v16, v14

    const/16 v0, 0x8

    .line 284
    invoke-virtual {v2, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 285
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 290
    :goto_9
    iget-object v0, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    iget-object v3, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    iget-object v5, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 292
    invoke-virtual {v5}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSelectedShoppingList()Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v5

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    .line 290
    invoke-virtual {v0, v2, v3, v5}, Lcom/shopkick/app/shoppinglists/ListAddController;->setProductFamilyAdded(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xed

    .line 295
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    goto :goto_a

    :cond_11
    move/from16 v18, v11

    move/from16 v16, v14

    move-object/from16 v17, v15

    .line 296
    iget-object v0, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_13

    .line 297
    iget-object v0, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    .line 299
    invoke-virtual {v8, v10}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 300
    invoke-virtual {v8, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    const v2, 0x7f09053a

    .line 302
    invoke-virtual {v8, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    .line 303
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz v0, :cond_12

    .line 305
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/Product;->currentPrice:Ljava/lang/String;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Product;->originalPrice:Ljava/lang/String;

    sget-object v5, Lcom/shopkick/app/util/ProductUtils$PriceDirection;->HORIZONTAL:Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    invoke-static {v3, v0, v5}, Lcom/shopkick/app/util/ProductUtils;->getSpannablePriceString(Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/util/ProductUtils$PriceDirection;)Landroid/text/Spannable;

    move-result-object v0

    .line 310
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_12

    const/4 v3, 0x0

    .line 311
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 312
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    :cond_12
    iget-object v0, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    iget-object v3, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    iget-object v5, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 318
    invoke-virtual {v5}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSelectedShoppingList()Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v5

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    .line 316
    invoke-virtual {v0, v2, v3, v5}, Lcom/shopkick/app/shoppinglists/ListAddController;->setProductAdded(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xec

    .line 321
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    :cond_13
    :goto_a
    const v0, 0x7f090104

    .line 325
    invoke-virtual {v8, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v9

    const v0, 0x7f080180

    .line 327
    iget-object v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isLinked:Ljava/lang/Boolean;

    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    const/4 v2, 0x0

    .line 328
    invoke-virtual {v9, v2}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0802cc

    goto :goto_b

    :cond_14
    const/16 v2, 0x8

    .line 331
    invoke-virtual {v9, v2}, Landroid/view/View;->setVisibility(I)V

    .line 333
    :goto_b
    iget-object v2, v8, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 336
    invoke-direct {v7, v1, v8, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->setupImpressionAndClickLogging(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 337
    invoke-direct {v7, v1, v8, v6}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->setupMoreBtnLogging(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/logging/UserEventImageView;)V

    .line 340
    new-instance v10, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;

    iget-object v0, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v0, v0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    .line 344
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v11, v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    move-object v0, v10

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object v14, v6

    move-object v6, v11

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;-><init>(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;ILcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/url/URLDispatcher;)V

    if-nez v12, :cond_15

    if-nez v18, :cond_16

    :cond_15
    const/4 v0, 0x1

    if-ge v13, v0, :cond_17

    move/from16 v2, v16

    if-ge v2, v0, :cond_17

    .line 351
    :cond_16
    iget-object v0, v8, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    goto :goto_c

    .line 353
    :cond_17
    iget-object v1, v8, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v1, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 354
    iget-object v1, v8, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 357
    :goto_c
    invoke-virtual {v9, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object/from16 v0, v17

    .line 358
    invoke-virtual {v0, v10}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 359
    invoke-virtual {v14, v10}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setCurrentChainId(Ljava/lang/String;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->currentChainId:Ljava/lang/String;

    return-void
.end method
