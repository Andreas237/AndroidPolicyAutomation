.class public Lcom/shopkick/app/products/ProductDetailsScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ProductDetailsScreen.java"

# interfaces
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/products/ProductDetailsScreen$ScreenRecyclerViewModule;
    }
.end annotation


# static fields
.field private static final COLUMN_COUNT:I = 0x2

.field private static final EXTRA_SPACING:I = 0x5

.field private static final EXTRA_SPACING_POSITION:[I

.field public static final PRODUCT_DETAILS_PRODUCT_ADDED:Ljava/lang/String; = "PRODUCT_DETAILS_PRODUCT_ADDED"

.field public static final PRODUCT_DETAILS_PRODUCT_ADDED_SHOPPING_LIST_ENTRY_ID:Ljava/lang/String; = "PRODUCT_DETAILS_PRODUCT_ADDED_SHOPPING_LIST_ENTRY_ID"

.field public static final PRODUCT_DETAILS_PRODUCT_ADDED_SHOPPING_LIST_ID:Ljava/lang/String; = "PRODUCT_DETAILS_PRODUCT_ADDED_SHOPPING_LIST_ID"


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private chainId:Ljava/lang/String;

.field private currentProduct:Lcom/shopkick/app/fetchers/api/skapi/Product;

.field private firstFetchDone:Z

.field private isAddedToList:Z

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private productInfoTile:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

.field private productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private screenFloatingButtonsViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

.field private sectionHeaderAdded:Z

.field private shoppingListEntryId:Ljava/lang/String;

.field private shoppingListId:Ljava/lang/String;

.field private shouldShowActionButton:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    .line 79
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/shopkick/app/products/ProductDetailsScreen;->EXTRA_SPACING_POSITION:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 93
    new-instance v0, Lcom/shopkick/app/products/ProductDetailsScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/products/ProductDetailsScreen$1;-><init>(Lcom/shopkick/app/products/ProductDetailsScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/products/ProductDetailsScreen;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->refreshProduct()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/products/ProductDetailsScreen;)Lcom/shopkick/app/fetchers/api/skapi/Product;
    .locals 0

    .line 61
    iget-object p0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->currentProduct:Lcom/shopkick/app/fetchers/api/skapi/Product;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/products/ProductDetailsScreen;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
    .locals 0

    .line 61
    iget-object p0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/products/ProductDetailsScreen;)Ljava/lang/String;
    .locals 0

    .line 61
    iget-object p0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->chainId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/products/ProductDetailsScreen;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->addConnectionErrorTile()V

    return-void
.end method

.method private addConnectionErrorTile()V
    .locals 2

    .line 449
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "productUpdated"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 450
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "productUpdateFailed"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 453
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupConnectionErrorTile()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    .line 454
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 455
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    .line 458
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->screenFloatingButtonsViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v0, v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private getCurrentProductId()Ljava/lang/String;
    .locals 1

    .line 287
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->currentProduct:Lcom/shopkick/app/fetchers/api/skapi/Product;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Product;->productId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method public static synthetic lambda$onEvent$192(Lcom/shopkick/app/products/ProductDetailsScreen;)V
    .locals 2

    .line 434
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->scrollToPosition(I)V

    return-void
.end method

.method private refreshProduct()V
    .locals 4

    .line 258
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    .line 260
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->currentProduct:Lcom/shopkick/app/fetchers/api/skapi/Product;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->chainId:Ljava/lang/String;

    if-nez v1, :cond_0

    if-eqz v0, :cond_1

    .line 261
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "productUpdated"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 262
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "productUpdateFailed"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 263
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    iget-object v2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productInfoTile:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v0}, Lcom/shopkick/app/products/ProductsDataSource;->fetchProduct(Ljava/lang/String;Ljava/lang/String;Landroid/location/Location;)V

    :cond_1
    if-nez v0, :cond_2

    .line 267
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->addLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    goto :goto_0

    .line 269
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage()V

    :goto_0
    return-void
.end method

.method private setupActionButtonsTile()Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 2

    .line 309
    new-instance v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    const/4 v1, -0x4

    .line 310
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    .line 311
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 312
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->currentProduct:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    .line 313
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->getCurrentProductId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->productId:Ljava/lang/String;

    return-object v0
.end method

.method private setupConnectionErrorTile()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 325
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, -0xc

    .line 326
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const v1, 0x7f1101a3

    .line 327
    invoke-virtual {p0, v1}, Lcom/shopkick/app/products/ProductDetailsScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    const v1, 0x7f1104de

    .line 328
    invoke-virtual {p0, v1}, Lcom/shopkick/app/products/ProductDetailsScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method private setupFromParams(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "chain_id"

    .line 136
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->chainId:Ljava/lang/String;

    .line 138
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    const-string v1, "product_id"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    const/4 v0, 0x0

    .line 141
    iput-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->currentProduct:Lcom/shopkick/app/fetchers/api/skapi/Product;

    const-string v0, "PRODUCT_DETAILS_PRODUCT_ADDED"

    .line 142
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->isAddedToList:Z

    const-string v0, "PRODUCT_DETAILS_PRODUCT_ADDED_SHOPPING_LIST_ID"

    .line 143
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->shoppingListId:Ljava/lang/String;

    const-string v0, "PRODUCT_DETAILS_PRODUCT_ADDED_SHOPPING_LIST_ENTRY_ID"

    .line 144
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->shoppingListEntryId:Ljava/lang/String;

    return-void
.end method

.method private setupProductDetailsTile()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 300
    new-instance v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    const/16 v1, -0xb

    .line 301
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    .line 302
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 303
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->currentProduct:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    .line 304
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->getCurrentProductId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->productId:Ljava/lang/String;

    return-object v0
.end method

.method private setupProductInfoTile(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)V
    .locals 2

    .line 279
    new-instance v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productInfoTile:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 280
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productInfoTile:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    const/16 v1, -0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    .line 281
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productInfoTile:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 282
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->currentProduct:Lcom/shopkick/app/fetchers/api/skapi/Product;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/Product;->chainImageUrl:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainImageUrl:Ljava/lang/String;

    .line 283
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productInfoTile:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->chainId:Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainId:Ljava/lang/String;

    return-void
.end method

.method private setupScreenFloatingButtons()V
    .locals 3

    .line 333
    iget-boolean v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->shouldShowActionButton:Z

    if-eqz v0, :cond_0

    .line 334
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupActionButtonsTile()Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v0

    .line 335
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->screenSimpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    .line 336
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/4 v2, -0x4

    invoke-virtual {v1, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->screenFloatingButtonsViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 337
    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_0

    .line 339
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->screenFloatingButtonsViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v0, v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private setupSectionHeaderTile()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 318
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/4 v1, -0x5

    .line 319
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const v1, 0x7f1104e1

    .line 320
    invoke-virtual {p0, v1}, Lcom/shopkick/app/products/ProductDetailsScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    return-object v0
.end method

.method private setupShareOptionsTile()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 291
    new-instance v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    const/4 v1, -0x3

    .line 292
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    .line 293
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 294
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->currentProduct:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    .line 295
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->getCurrentProductId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->productId:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    const/4 p3, 0x0

    const v0, 0x7f0c0159

    .line 155
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f09059a

    .line 156
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 157
    iget-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;-><init>(II)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 160
    new-instance v8, Ljava/util/HashSet;

    const/16 p2, 0x8

    new-array p2, p2, [Ljava/lang/Integer;

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, p3

    const/16 v0, 0x1b

    .line 161
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v2

    const/4 v0, -0x2

    .line 162
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    const/16 v0, -0xa

    .line 163
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, p2, v1

    const/4 v0, -0x3

    .line 164
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, p2, v1

    const/16 v0, -0xb

    .line 165
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, p2, v1

    const/4 v0, -0x5

    .line 166
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x6

    aput-object v0, p2, v2

    const/16 v0, -0xc

    .line 167
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x7

    aput-object v0, p2, v2

    .line 160
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v8, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 170
    iget-boolean p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->shouldShowActionButton:Z

    if-eqz p2, :cond_0

    const/4 p2, -0x4

    .line 171
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v8, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 174
    :cond_0
    new-instance p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v4, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v9, 0x0

    move-object v3, p2

    move-object v5, p0

    move-object v6, p0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 180
    iget-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 183
    iget-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->screenSimpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/logging/UserEventLogger;->addUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    const p2, 0x7f090627

    .line 186
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    .line 187
    new-instance v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    invoke-direct {v0, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->screenFloatingButtonsViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 188
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupScreenFloatingButtons()V

    .line 191
    iget-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getDividerItemDecoration()Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    move-result-object p2

    .line 192
    sget-object v0, Lcom/shopkick/app/products/ProductDetailsScreen;->EXTRA_SPACING_POSITION:[I

    array-length v2, v0

    :goto_0
    if-ge p3, v2, :cond_1

    aget v3, v0, p3

    .line 193
    new-instance v4, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    invoke-direct {v4, v3, v1}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {p2, v4}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 197
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance p3, Lcom/shopkick/app/products/ProductDetailsScreen$ScreenRecyclerViewModule;

    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->screenFloatingButtonsViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-boolean v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->shouldShowActionButton:Z

    invoke-direct {p3, v0, v1}, Lcom/shopkick/app/products/ProductDetailsScreen$ScreenRecyclerViewModule;-><init>(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Z)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 199
    iget-boolean p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->isAddedToList:Z

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->shoppingListEntryId:Ljava/lang/String;

    invoke-static {p2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->shoppingListId:Ljava/lang/String;

    invoke-static {p2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 201
    iget-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getListAddController()Lcom/shopkick/app/shoppinglists/ListAddController;

    move-result-object p2

    iget-object p3, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->shoppingListEntryId:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p2, p3, v0, v1}, Lcom/shopkick/app/shoppinglists/ListAddController;->setProductAdded(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 4

    .line 349
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    if-nez v0, :cond_0

    .line 354
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, v0}, Lcom/shopkick/sdk/presence/LocationManager;->initiateLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    const/4 p1, 0x0

    return-object p1

    .line 357
    :cond_0
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/GetSimilarProductsRequest;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/GetSimilarProductsRequest;-><init>()V

    .line 358
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetSimilarProductsRequest;->latitude:Ljava/lang/Double;

    .line 359
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/GetSimilarProductsRequest;->longitude:Ljava/lang/Double;

    .line 360
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/GetSimilarProductsRequest;->productId:Ljava/lang/String;

    .line 361
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->chainId:Ljava/lang/String;

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/GetSimilarProductsRequest;->chainId:Ljava/lang/String;

    .line 362
    iput-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetSimilarProductsRequest;->previousPageKey:Ljava/lang/String;

    return-object v1
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
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 129
    invoke-direct {p0, p2}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupFromParams(Ljava/util/Map;)V

    .line 132
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->shouldShowActionButton:Z

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 217
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->destroy()V

    .line 218
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 219
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productInfoTile:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    if-eqz v0, :cond_0

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productInfoTile:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/ProductsDataSource;->cancelProductFetch(Ljava/lang/String;)V

    .line 222
    :cond_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->removeLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 223
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

    .line 406
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x2eb25a03

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v0, v1, :cond_3

    const v1, -0x2def8f0b

    if-eq v0, v1, :cond_2

    const v1, -0x15f2ef34

    if-eq v0, v1, :cond_1

    const v1, 0x5ac5dde2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "productSavedStateUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    move p1, v5

    goto :goto_1

    :cond_1
    const-string v0, "productUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    move p1, v4

    goto :goto_1

    :cond_2
    const-string v0, "productUpdateFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    move p1, v3

    goto :goto_1

    :cond_3
    const-string v0, "EVENT_LIST_ADD_CONTROLLER_ITEM_ADDED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    move p1, v2

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_2

    .line 440
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    const-string v0, "PARAM_LIST_ADD_CONTROLLER_ADDED_ITEM_ID"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 441
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupScreenFloatingButtons()V

    goto/16 :goto_2

    .line 437
    :pswitch_1
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->addConnectionErrorTile()V

    goto/16 :goto_2

    :pswitch_2
    const-string p1, "productKey"

    .line 413
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/Product;

    iput-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->currentProduct:Lcom/shopkick/app/fetchers/api/skapi/Product;

    .line 415
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productInfoTile:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->currentProduct:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iput-object p2, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    .line 416
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/Product;->productId:Ljava/lang/String;

    iput-object p2, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->productId:Ljava/lang/String;

    .line 417
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productInfoTile:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->currentProduct:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/Product;->saveCount:Ljava/lang/Long;

    iput-object p2, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->globalSaveCount:Ljava/lang/Long;

    .line 418
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupShareOptionsTile()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    .line 419
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupProductDetailsTile()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    .line 420
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupActionButtonsTile()Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v0

    .line 421
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v6, 0x23

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const v6, 0x7f06015d

    invoke-virtual {p0, v6}, Lcom/shopkick/app/products/ProductDetailsScreen;->getResourceColor(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->backgroundColor:Ljava/lang/String;

    .line 423
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    new-instance v6, Ljava/util/ArrayList;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v8, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productInfoTile:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    aput-object v8, v7, v5

    aput-object p1, v7, v4

    aput-object p2, v7, v3

    aput-object v0, v7, v2

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v6, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTilesWithLoading(Ljava/util/ArrayList;)V

    .line 427
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->maybeHandleSavedPageResponse()V

    .line 429
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupScreenFloatingButtons()V

    .line 430
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->HEADER_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ProductDetailsScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    .line 434
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance p2, Lcom/shopkick/app/products/-$$Lambda$ProductDetailsScreen$mfy2zIkaEU94bCWcGfTbhkFlXZs;

    invoke-direct {p2, p0}, Lcom/shopkick/app/products/-$$Lambda$ProductDetailsScreen$mfy2zIkaEU94bCWcGfTbhkFlXZs;-><init>(Lcom/shopkick/app/products/ProductDetailsScreen;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    .line 408
    :pswitch_3
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    const-string v0, "itemIdKey"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 409
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupScreenFloatingButtons()V

    :cond_5
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onScreenDidShow()V
    .locals 2

    .line 246
    iget-boolean v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->firstFetchDone:Z

    if-nez v0, :cond_0

    .line 247
    sget-object v0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->HEADER_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/ProductDetailsScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    .line 248
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-direct {p0, v0}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupProductInfoTile(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)V

    .line 249
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->refreshProduct()V

    .line 251
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "productSavedStateUpdated"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 252
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EVENT_LIST_ADD_CONTROLLER_ITEM_ADDED"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 253
    iput-boolean v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->firstFetchDone:Z

    :cond_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 209
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/screens/AppScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 211
    invoke-static {p1}, Lcom/shopkick/app/activities/BaseActivity;->setOnApplyWindowInsetListener(Landroid/view/View;)V

    .line 212
    invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->requestApplyInsets(Landroid/view/View;)V

    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 4

    .line 368
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->currentProduct:Lcom/shopkick/app/fetchers/api/skapi/Product;

    const/4 v0, 0x1

    if-nez p1, :cond_0

    .line 369
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->setShouldSavePageResponse(Z)V

    .line 371
    :cond_0
    new-instance p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 372
    iget-boolean v1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_4

    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v1, :cond_4

    .line 373
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetSimilarProductsResponse;

    .line 374
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetSimilarProductsResponse;->similarProducts:Ljava/util/List;

    iput-object v1, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 375
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetSimilarProductsResponse;->pageKey:Ljava/lang/String;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    .line 376
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 378
    iget-boolean p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->sectionHeaderAdded:Z

    if-nez p2, :cond_3

    .line 379
    iget-boolean p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->shouldShowActionButton:Z

    if-eqz p2, :cond_1

    const/4 p2, 0x3

    goto :goto_0

    :cond_1
    const/4 p2, 0x2

    .line 380
    :goto_0
    iget-object v1, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 381
    iget-object v1, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupSectionHeaderTile()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 382
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getDividerItemDecoration()Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    const/4 v3, 0x5

    invoke-direct {v2, p2, v3}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    goto :goto_1

    .line 384
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getDividerItemDecoration()Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    move-result-object v1

    new-instance v3, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    invoke-direct {v3, p2, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    .line 386
    :goto_1
    iput-boolean v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->sectionHeaderAdded:Z

    .line 389
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemChanged(I)V

    .line 393
    :cond_3
    iget-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->tryRemovingDynamicContentConstraint()V

    goto :goto_2

    .line 395
    :cond_4
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    :goto_2
    return-object p1
.end method

.method public setParams(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 228
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->setParams(Ljava/util/Map;)V

    .line 229
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    const-string v2, "product_id"

    .line 230
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 233
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupFromParams(Ljava/util/Map;)V

    .line 235
    iput-boolean v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->disableScreenResponsivenessLogging:Z

    .line 236
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 237
    invoke-direct {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->setupScreenFloatingButtons()V

    .line 238
    invoke-virtual {p0}, Lcom/shopkick/app/products/ProductDetailsScreen;->logDetectHidePage()V

    .line 239
    iput-boolean v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->firstFetchDone:Z

    .line 240
    iput-boolean v1, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->sectionHeaderAdded:Z

    :cond_1
    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 149
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen;->productToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductId(Ljava/lang/String;)V

    return-void
.end method
