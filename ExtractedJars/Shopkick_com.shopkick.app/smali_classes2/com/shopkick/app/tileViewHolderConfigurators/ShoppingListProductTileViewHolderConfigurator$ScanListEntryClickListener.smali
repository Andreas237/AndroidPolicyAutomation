.class Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;
.source "ShoppingListProductTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ScanListEntryClickListener"
.end annotation


# instance fields
.field private listAddControllerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/shoppinglists/ListAddController;",
            ">;"
        }
    .end annotation
.end field

.field private screenEnum:I

.field private tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;ILcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 1

    .line 443
    iget-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-direct {p0, p2, p3, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)V

    .line 445
    iput p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->screenEnum:I

    .line 446
    iput-object p6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 447
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 448
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->listAddControllerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private goToOfferDetailsScreen(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V
    .locals 2

    .line 495
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "tile_info"

    .line 496
    invoke-static {p2}, Lcom/shopkick/app/util/TileUtils;->serialize(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    const-class p2, Lcom/shopkick/app/products/OfferDetailsScreen;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/screens/AppScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 453
    invoke-super {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->onClick(Landroid/view/View;)V

    .line 456
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->viewHolderRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v0, :cond_8

    .line 457
    iget-object v0, v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 458
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 459
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->productId:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    .line 464
    :cond_0
    new-instance v0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->screenEnum:I

    .line 466
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->listAddControllerRef:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/Integer;Ljava/lang/ref/WeakReference;)V

    .line 467
    invoke-virtual {v0, p1}, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->onClick(Landroid/view/View;)V

    goto :goto_2

    .line 469
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->productFamilyId:Ljava/lang/String;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->mainImageUrl:Ljava/lang/String;

    if-nez p1, :cond_2

    goto :goto_1

    .line 473
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 474
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;

    goto :goto_0

    :cond_3
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_4

    return-void

    .line 481
    :cond_4
    iget-object v1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_5

    .line 482
    iget-object p1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    :cond_5
    if-nez v0, :cond_6

    return-void

    .line 488
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator$ScanListEntryClickListener;->goToOfferDetailsScreen(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V

    goto :goto_2

    :cond_7
    :goto_1
    return-void

    :cond_8
    :goto_2
    return-void
.end method
