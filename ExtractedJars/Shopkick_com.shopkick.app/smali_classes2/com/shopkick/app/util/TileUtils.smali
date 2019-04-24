.class public Lcom/shopkick/app/util/TileUtils;
.super Ljava/lang/Object;
.source "TileUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/util/TileUtils$TileInfoV2ScanKicksComparator;,
        Lcom/shopkick/app/util/TileUtils$TileInfoV2StoreNameComparator;
    }
.end annotation


# static fields
.field private static final EXTENDED_TILE_INFO_CACHE_SIZE:I = 0x8

.field public static final PARAM_SUBTILES:Ljava/lang/String; = "PARAM_CLIENT_DATA_SUBTILES"

.field private static final TILE_CHAIN_LOGO_DEFAULT_MAX_WIDTH:I = 0x37

.field private static cacheCount:I

.field private static clientExtendedTileInfoV2Cache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private static idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 55
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/shopkick/app/util/TileUtils;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 644
    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    sput-object v0, Lcom/shopkick/app/util/TileUtils;->clientExtendedTileInfoV2Cache:Landroid/util/LruCache;

    const/4 v0, 0x1

    .line 645
    sput v0, Lcom/shopkick/app/util/TileUtils;->cacheCount:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addOfflinePromoTileToFeed(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Lcom/shopkick/app/store/CarouselPromoController;)V
    .locals 4

    .line 223
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, 0x3f6

    .line 224
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const/16 v2, -0xe

    .line 226
    invoke-virtual {p0, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->containsTileOfType(I)Z

    move-result v3

    if-nez v3, :cond_0

    .line 227
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 228
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    invoke-virtual {p1, v1}, Lcom/shopkick/app/store/CarouselPromoController;->setData(Ljava/util/List;)V

    .line 231
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 232
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 233
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 234
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 235
    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTilesAtPosition(Ljava/util/List;I)V

    goto :goto_0

    .line 236
    :cond_0
    invoke-virtual {p1, v1}, Lcom/shopkick/app/store/CarouselPromoController;->containsTileOfType(I)Z

    move-result p0

    if-nez p0, :cond_1

    .line 237
    invoke-virtual {p1, v0}, Lcom/shopkick/app/store/CarouselPromoController;->insertPromoTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static adjustChainLogoWidth(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Ljava/lang/Integer;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 158
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :cond_1
    const/16 p2, 0x37

    :goto_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 159
    invoke-virtual {p0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 160
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 161
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    int-to-float v1, v1

    div-float/2addr v2, v1

    .line 162
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v2

    float-to-int p1, p1

    if-eqz p2, :cond_2

    .line 164
    invoke-virtual {p0}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-float p2, p2

    mul-float/2addr v1, p2

    float-to-int p2, v1

    .line 165
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_1

    .line 167
    :cond_2
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 169
    :goto_1
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static compressImage([BII)[B
    .locals 8

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 209
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 210
    new-instance v1, Landroid/graphics/YuvImage;

    const/16 v4, 0x11

    const/4 v7, 0x0

    move-object v2, v1

    move-object v3, p0

    move v5, p1

    move v6, p2

    invoke-direct/range {v2 .. v7}, Landroid/graphics/YuvImage;-><init>([BIII[I)V

    .line 215
    new-instance p0, Landroid/graphics/Rect;

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    const/16 p1, 0x1e

    .line 216
    invoke-virtual {v1, p0, p1, v0}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    .line 218
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method public static convertProductScanInfoToTileInfo(Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 3

    .line 491
    new-instance v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    const/16 v1, 0x17

    .line 492
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    .line 493
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 494
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->chainIds:Ljava/util/List;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainIds:Ljava/util/List;

    .line 495
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->title:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->title:Ljava/lang/String;

    .line 496
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->subtitle:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->subtitle:Ljava/lang/String;

    .line 497
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->smallImageUrl:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->mainImageUrl:Ljava/lang/String;

    .line 498
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->smallImageUrl:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->largeImageUrl:Ljava/lang/String;

    .line 499
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanKicks:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    .line 500
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanCompleted:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    .line 501
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanCompleted:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    .line 502
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->expirationTimestamp:Ljava/lang/Long;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->expirationTimestampMs:Ljava/lang/Long;

    .line 503
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->displayProductHierarchyId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->productHierarchyId:Ljava/lang/String;

    .line 504
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanKicks:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 505
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->minimumAgeForKicks:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->minimumAgeForKicks:Ljava/lang/Integer;

    .line 506
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->taxonomyNodeId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->taxonomyNodeId:Ljava/lang/String;

    .line 507
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->displayTaxonomyNodeId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->displayTaxonomyNodeId:Ljava/lang/String;

    const/4 v1, 0x0

    .line 508
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->dataPos:Ljava/lang/Integer;

    .line 509
    iget-object v2, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->minimumPurchaseRequirement:Ljava/lang/Integer;

    iput-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    .line 510
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->offerBundleIds:Ljava/util/List;

    iput-object p0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->offerBundleIds:Ljava/util/List;

    .line 511
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    iput-object p0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    .line 514
    invoke-virtual {v0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->postProcess()V

    return-object v0
.end method

.method public static convertShoppingListEntryToTileInfo(Ljava/lang/String;Ljava/util/List;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/products/ProductsDataSource;Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;",
            ">;",
            "Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;",
            "Lcom/shopkick/app/products/ProductsDataSource;",
            "Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;",
            ")",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    .line 299
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 300
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 301
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 302
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 303
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_8

    .line 305
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 306
    new-instance v6, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {v6}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    .line 307
    iput-object p0, v6, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListId:Ljava/lang/String;

    .line 309
    iget-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    if-eqz v7, :cond_1

    .line 310
    iget-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    invoke-static {v7, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->createScanEntryTileFromShoppingListEntry(Ljava/lang/String;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 315
    move-object v6, v7

    check-cast v6, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    goto :goto_1

    .line 317
    :cond_0
    iget-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    const/16 v7, 0x3f9

    .line 319
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v6, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    goto :goto_4

    .line 320
    :cond_1
    iget-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    if-eqz v7, :cond_3

    .line 321
    iget-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    .line 322
    invoke-static {v7, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->createProductEntryTileFromShoppingListEntry(Ljava/lang/String;Lcom/shopkick/app/products/ProductsDataSource;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v7

    if-eqz v7, :cond_2

    .line 326
    move-object v6, v7

    check-cast v6, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    goto :goto_2

    .line 328
    :cond_2
    iget-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    const/16 v7, 0x3fa

    .line 330
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v6, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    goto :goto_4

    :cond_3
    const/16 v7, 0x3f7

    .line 332
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v6, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    .line 333
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 334
    iget-object v8, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordIds:Ljava/util/List;

    if-eqz v8, :cond_4

    iget-object v8, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordIds:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_4

    .line 335
    iget-object v8, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordIds:Ljava/util/List;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    .line 337
    :cond_4
    iget-object v8, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordId:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    :goto_3
    invoke-interface {v4, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 341
    invoke-virtual {p4, v7}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getShoppingItemsForKeywordIds(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v8

    if-nez v8, :cond_5

    .line 343
    invoke-interface {v3, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_4

    .line 344
    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_6

    .line 345
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v6, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->numDeals:Ljava/lang/Integer;

    .line 349
    :cond_6
    :goto_4
    iput-object v5, v6, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    const/4 v5, 0x0

    .line 350
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iput-object v5, v6, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    .line 351
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 353
    :cond_7
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_8

    move-object v3, v4

    .line 358
    :cond_8
    invoke-virtual {p2, v1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->fetchScanInfos(Ljava/util/List;)V

    .line 359
    invoke-virtual {p3, v2}, Lcom/shopkick/app/products/ProductsDataSource;->fetchProducts(Ljava/util/List;)V

    .line 360
    invoke-virtual {p4, v3}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->fetchShoppingItems(Ljava/util/List;)V

    return-object v0
.end method

.method public static convertTilesToCategoryWidget(Lcom/shopkick/app/widget/WidgetDataSource;Ljava/util/ArrayList;Ljava/util/Set;Z)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/widget/WidgetDataSource;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;Z)",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_7

    .line 402
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 405
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 406
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;-><init>()V

    .line 407
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;->tiles:Ljava/util/List;

    .line 409
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    :goto_0
    if-ltz v2, :cond_6

    .line 410
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 412
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x17

    const/4 v7, 0x0

    if-ne v5, v6, :cond_1

    .line 414
    iget-object v5, v1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;->tiles:Ljava/util/List;

    invoke-interface {v5, v7, v4}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 416
    :cond_1
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {p2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 418
    iget-object v5, v1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;->tiles:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    goto/16 :goto_1

    .line 420
    :cond_2
    invoke-static {}, Lcom/shopkick/app/util/TileUtils;->getUniqueNumericString()Ljava/lang/String;

    move-result-object v5

    .line 423
    invoke-virtual {v4, v7}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v6

    const/16 v8, 0xfa6

    .line 424
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    iput-object v9, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    if-eqz p3, :cond_3

    .line 425
    iget-object v9, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    invoke-static {v9}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 426
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    const-string v10, "product_hierarchy_id"

    .line 427
    invoke-virtual {v9, v10, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v10, "product_category"

    .line 428
    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "paramIsDummyCategoryIdEnabled"

    const-string v10, "1"

    .line 429
    invoke-virtual {v9, v4, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    new-instance v4, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v10, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v11, Lcom/shopkick/app/cpg/CPGCategoryScreen;

    invoke-direct {v4, v10, v11, v9}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 433
    invoke-virtual {v4}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    .line 435
    :cond_3
    iget-object v4, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->numScans:Ljava/lang/Integer;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 436
    iget-object v4, v1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;->tiles:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->numScans:Ljava/lang/Integer;

    .line 441
    :cond_4
    new-instance v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v4}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 442
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iput-object v8, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 443
    iput-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    .line 444
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    .line 447
    invoke-virtual {v0, v7, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 448
    invoke-virtual {v0, v7, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 451
    new-instance v5, Lcom/shopkick/fetchers/DataResponse;

    invoke-direct {v5, v3, v7, v7, v1}, Lcom/shopkick/fetchers/DataResponse;-><init>(ZIILjava/lang/Object;)V

    invoke-virtual {p0, v4, v5, v7}, Lcom/shopkick/app/widget/WidgetDataSource;->setData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/fetchers/DataResponse;Z)V

    .line 454
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;-><init>()V

    .line 455
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;->tiles:Ljava/util/List;

    goto :goto_1

    .line 459
    :cond_5
    invoke-virtual {v0, v7, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :goto_1
    add-int/lit8 v2, v2, -0x1

    goto/16 :goto_0

    :cond_6
    return-object v0

    :cond_7
    :goto_2
    return-object p1
.end method

.method public static countOfferTiles(Ljava/util/List;Ljava/util/Set;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, -0x1

    return p0

    .line 472
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    move v2, v0

    move v3, v1

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 473
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {p1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 478
    iget-object v3, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->numScans:Ljava/lang/Integer;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 479
    iget-object v3, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->numScans:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v2, v3

    move v3, v0

    goto :goto_0

    :cond_2
    move v3, v1

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return v2
.end method

.method public static createTileInfoFromScanInfo(Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 2

    .line 520
    new-instance v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    const/16 v1, 0x17

    .line 521
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    .line 522
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 523
    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainId:Ljava/lang/String;

    .line 524
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->chainIds:Ljava/util/List;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainIds:Ljava/util/List;

    .line 525
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->title:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->title:Ljava/lang/String;

    .line 526
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->subtitle:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->subtitle:Ljava/lang/String;

    .line 527
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->smallImageUrl:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->mainImageUrl:Ljava/lang/String;

    .line 528
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->smallImageUrl:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->largeImageUrl:Ljava/lang/String;

    .line 529
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->expirationTimestamp:Ljava/lang/Long;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->expirationTimestampMs:Ljava/lang/Long;

    .line 530
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->displayProductHierarchyId:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->productHierarchyId:Ljava/lang/String;

    .line 531
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->minimumAgeForKicks:Ljava/lang/Integer;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->minimumAgeForKicks:Ljava/lang/Integer;

    .line 532
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->taxonomyNodeId:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->taxonomyNodeId:Ljava/lang/String;

    .line 533
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->displayTaxonomyNodeId:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->displayTaxonomyNodeId:Ljava/lang/String;

    .line 534
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->minimumPurchaseRequirement:Ljava/lang/Integer;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    .line 535
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 536
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->scanDetailViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->scanDetailViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 537
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->scanPostRewardOverlayViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->scanPostRewardOverlayViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 540
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanKicks:Ljava/lang/Integer;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 541
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanCompleted:Ljava/lang/Boolean;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    .line 544
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->imageRecognitionScanTokenId:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->imageRecScanTokenId:Ljava/lang/String;

    .line 545
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->imageRecognitionScanKicks:Ljava/lang/Integer;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    .line 546
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->imageRecognitionScanCompleted:Ljava/lang/Boolean;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->imageRecScanCompleted:Ljava/lang/Boolean;

    .line 547
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->imageRecognitionScanDescriptionText:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->imageRecScanDescriptionText:Ljava/lang/String;

    .line 548
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->imageRecognitionScanThumbnailImageUrl:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->imageRecScanThumbnailImageUrl:Ljava/lang/String;

    .line 549
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->imageRecognitionScanLargeImageUrl:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->imageRecScanLargeImageUrl:Ljava/lang/String;

    .line 552
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->videoId:Ljava/lang/Long;

    if-nez p1, :cond_0

    const-string p1, ""

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->videoId:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->videoId:Ljava/lang/String;

    .line 553
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->videoKicks:Ljava/lang/Integer;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->videoKicks:Ljava/lang/Integer;

    .line 554
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->videoCompleted:Ljava/lang/Boolean;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    .line 555
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->videoDescriptionText:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->videoDescriptionText:Ljava/lang/String;

    .line 556
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->videoUrl:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->videoUrl:Ljava/lang/String;

    .line 557
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->videoUrlType:Ljava/lang/Integer;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->videoUrlType:Ljava/lang/Integer;

    .line 558
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->videoThumbnailImageUrl:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->videoThumbnailImageUrl:Ljava/lang/String;

    .line 559
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->videoViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 562
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanKicks:Ljava/lang/Integer;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    .line 563
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanCompleted:Ljava/lang/Boolean;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    .line 565
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;-><init>()V

    .line 566
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    iput-object p0, p1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    .line 567
    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 570
    invoke-virtual {v0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->postProcess()V

    return-object v0
.end method

.method public static createWidgetHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 387
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 388
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    const/16 v1, 0x10

    .line 389
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 390
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    .line 391
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    .line 392
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    .line 393
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->verticalPadding:Ljava/lang/Integer;

    iput-object p0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->verticalPadding:Ljava/lang/Integer;

    return-object v0
.end method

.method public static declared-synchronized deserialize(Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 3

    const-class v0, Lcom/shopkick/app/util/TileUtils;

    monitor-enter v0

    .line 653
    :try_start_0
    sget-object v1, Lcom/shopkick/app/util/TileUtils;->clientExtendedTileInfoV2Cache:Landroid/util/LruCache;

    invoke-virtual {v1, p0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-eqz v1, :cond_0

    .line 655
    sget-object v2, Lcom/shopkick/app/util/TileUtils;->clientExtendedTileInfoV2Cache:Landroid/util/LruCache;

    invoke-virtual {v2, p0}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 657
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static getSubtiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 587
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p0

    const-string v0, "PARAM_CLIENT_DATA_SUBTILES"

    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 588
    instance-of v0, p0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 589
    check-cast p0, Ljava/util/ArrayList;

    return-object p0

    .line 592
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public static getTileElement(Ljava/lang/Integer;)I
    .locals 1

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    .line 63
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    sparse-switch p0, :sswitch_data_0

    return v0

    :sswitch_0
    const/16 p0, 0x173

    return p0

    :sswitch_1
    const/16 p0, 0x16c

    return p0

    :sswitch_2
    const/16 p0, 0x16b

    return p0

    :sswitch_3
    const/16 p0, 0x131

    return p0

    :sswitch_4
    const/16 p0, 0x130

    return p0

    :sswitch_5
    const/16 p0, 0x11f

    return p0

    :sswitch_6
    const/16 p0, 0x175

    return p0

    :sswitch_7
    const/16 p0, 0x179

    return p0

    :sswitch_8
    const/16 p0, 0xcb

    return p0

    :sswitch_9
    const/16 p0, 0xba

    return p0

    :sswitch_a
    const/16 p0, 0xad

    return p0

    :sswitch_b
    const/16 p0, 0xa2

    return p0

    :sswitch_c
    const/16 p0, 0xa1

    return p0

    :sswitch_d
    const/16 p0, 0x7f

    return p0

    :sswitch_e
    const/16 p0, 0x5e

    return p0

    :sswitch_f
    const/16 p0, 0x5d

    return p0

    :sswitch_10
    const/16 p0, 0x29

    return p0

    :sswitch_11
    const/16 p0, 0x39

    return p0

    :sswitch_12
    const/16 p0, 0xc

    return p0

    :sswitch_13
    const/16 p0, 0x17b

    return p0

    :sswitch_data_0
    .sparse-switch
        -0x3a -> :sswitch_13
        0x0 -> :sswitch_12
        0x1 -> :sswitch_11
        0x3 -> :sswitch_10
        0xb -> :sswitch_f
        0xc -> :sswitch_e
        0x12 -> :sswitch_d
        0x13 -> :sswitch_11
        0x1b -> :sswitch_c
        0x1c -> :sswitch_b
        0x1f -> :sswitch_a
        0x2d -> :sswitch_9
        0x33 -> :sswitch_b
        0x34 -> :sswitch_8
        0x4b -> :sswitch_9
        0x4c -> :sswitch_b
        0x4d -> :sswitch_10
        0x4e -> :sswitch_9
        0x4f -> :sswitch_b
        0x50 -> :sswitch_10
        0x56 -> :sswitch_7
        0x72 -> :sswitch_6
        0xfa1 -> :sswitch_5
        0xfa5 -> :sswitch_4
        0xfa6 -> :sswitch_3
        0xfa9 -> :sswitch_5
        0xfab -> :sswitch_2
        0xfac -> :sswitch_1
        0xfad -> :sswitch_0
        0xfae -> :sswitch_4
    .end sparse-switch
.end method

.method public static getUniqueNumericString()Ljava/lang/String;
    .locals 5

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/app/util/TileUtils;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static isAllProgramaticVideoTileCompleted(Ljava/util/ArrayList;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p0, :cond_4

    .line 285
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 287
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 288
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-static {v2}, Lcom/shopkick/app/util/TileUtils;->isProgrammaticVideoTileType(Ljava/lang/Integer;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 289
    :cond_2
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_3
    return v0

    :cond_4
    :goto_1
    return v0
.end method

.method public static isBarcodeScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 1

    .line 600
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 601
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isIRScanAvailable(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 0

    .line 605
    invoke-static {p0}, Lcom/shopkick/app/util/FeatureFlagHelper;->areImageRecognitionScansEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p0

    if-eqz p0, :cond_0

    iget-object p0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanCompleted:Ljava/lang/Boolean;

    .line 606
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    iget-object p0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    .line 607
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isProgrammaticVideoTileType(Ljava/lang/Integer;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 275
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/16 v1, 0x53

    if-eq p0, v1, :cond_1

    const/16 v1, 0x56

    if-eq p0, v1, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static isReceiptScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 1

    .line 617
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isTileItemIdEqual(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/String;)Z
    .locals 2

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x2d

    if-eq v0, v1, :cond_a

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x34

    if-eq v0, v1, :cond_a

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 121
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4b

    if-eq v0, v1, :cond_a

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 122
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4e

    if-eq v0, v1, :cond_a

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 123
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x53

    if-eq v0, v1, :cond_a

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 124
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x56

    if-eq v0, v1, :cond_a

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 125
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x35

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->featuredContentType:Ljava/lang/Integer;

    .line 126
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto/16 :goto_0

    .line 128
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3f8

    if-ne v0, v1, :cond_1

    instance-of v0, p0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-eqz v1, :cond_1

    .line 131
    iget-object p0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    .line 132
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3f7

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 133
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3fa

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 134
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3f9

    if-ne v0, v1, :cond_3

    :cond_2
    instance-of v0, p0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-eqz v1, :cond_3

    .line 137
    iget-object p0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    .line 138
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productId:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 139
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productId:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    .line 140
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->storyCardId:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 141
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->storyCardId:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    .line 142
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->instantBonusId:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 143
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->instantBonusId:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    .line 144
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dealId:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 145
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dealId:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    .line 146
    :cond_7
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x17

    if-ne v0, v1, :cond_8

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    if-eqz v0, :cond_8

    .line 147
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    .line 148
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x40b

    if-ne v0, v1, :cond_9

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    if-eqz v0, :cond_9

    .line 149
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0

    .line 127
    :cond_a
    :goto_0
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isVideoAvailable(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 0

    .line 611
    invoke-static {p0}, Lcom/shopkick/app/util/FeatureFlagHelper;->areImageRecognitionScansEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p0

    if-eqz p0, :cond_0

    iget-object p0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    .line 612
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    iget-object p0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    .line 613
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static reportProductUnavailability(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/logging/UserEventLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 373
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0xf4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 374
    invoke-virtual {v0, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 375
    invoke-virtual {v0, p5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 376
    invoke-virtual {v0, p6}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 377
    invoke-virtual {p3, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 380
    invoke-static {p0, p1, p2}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->getInstance(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;

    move-result-object p0

    .line 383
    invoke-virtual {p0, p4, p6}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->setReported(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static declared-synchronized serialize(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)Ljava/lang/String;
    .locals 3

    const-class v0, Lcom/shopkick/app/util/TileUtils;

    monitor-enter v0

    .line 648
    :try_start_0
    sget v1, Lcom/shopkick/app/util/TileUtils;->cacheCount:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/shopkick/app/util/TileUtils;->cacheCount:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 649
    sget-object v2, Lcom/shopkick/app/util/TileUtils;->clientExtendedTileInfoV2Cache:Landroid/util/LruCache;

    invoke-virtual {v2, v1, p0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 650
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static setLookbookTileGradient(Landroid/view/View;I)V
    .locals 3

    .line 198
    new-instance v0, Lcom/shopkick/app/drawables/MultiColorGradientDrawable;

    .line 199
    invoke-static {}, Lcom/shopkick/app/drawables/MultiColorGradientDrawable;->getDefaultLookbookTileColors()[I

    move-result-object v1

    .line 200
    invoke-static {}, Lcom/shopkick/app/drawables/MultiColorGradientDrawable;->getDefaultLookbookTileColorPositions()[F

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lcom/shopkick/app/drawables/MultiColorGradientDrawable;-><init>(I[I[F)V

    .line 201
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static setRoundedImage(Landroid/widget/ImageView;Landroid/graphics/Bitmap;I)V
    .locals 4

    .line 173
    invoke-virtual {p0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 174
    invoke-virtual {p0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v0, :cond_1

    if-lez v1, :cond_1

    .line 179
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-eq v2, v3, :cond_0

    .line 180
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 182
    :cond_0
    invoke-static {p2, p0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result p2

    .line 183
    new-instance v2, Lcom/shopkick/app/drawables/RoundedImageDrawable;

    int-to-float p2, p2

    invoke-direct {v2, p1, v0, v1, p2}, Lcom/shopkick/app/drawables/RoundedImageDrawable;-><init>(Landroid/graphics/Bitmap;IIF)V

    .line 184
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void

    .line 176
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "setRoundedImage() requires an ImageView with fixed width and height"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static setRoundedImage(Landroid/widget/ImageView;Landroid/graphics/Bitmap;III)V
    .locals 1

    .line 189
    invoke-static {p4, p0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result p4

    .line 190
    invoke-static {p2, p0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result p2

    .line 191
    invoke-static {p3, p0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result p3

    .line 193
    new-instance v0, Lcom/shopkick/app/drawables/RoundedImageDrawable;

    int-to-float p4, p4

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/shopkick/app/drawables/RoundedImageDrawable;-><init>(Landroid/graphics/Bitmap;IIF)V

    .line 194
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static setSubtiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 581
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p0

    const-string v0, "PARAM_CLIENT_DATA_SUBTILES"

    invoke-virtual {p0, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static shallowCopyTileInfoV2(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 6

    .line 621
    new-instance v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    .line 622
    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v1}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    .line 624
    :try_start_0
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 625
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 626
    :cond_0
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    goto :goto_1

    .line 628
    :cond_1
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    :cond_2
    return-object v0
.end method
