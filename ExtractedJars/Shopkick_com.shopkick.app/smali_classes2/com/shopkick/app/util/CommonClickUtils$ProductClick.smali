.class public Lcom/shopkick/app/util/CommonClickUtils$ProductClick;
.super Ljava/lang/Object;
.source "CommonClickUtils.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/CommonClickUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ProductClick"
.end annotation


# instance fields
.field private listAddControllerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/shoppinglists/ListAddController;",
            ">;"
        }
    .end annotation
.end field

.field private originScreen:Ljava/lang/Integer;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/Integer;Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/url/URLDispatcher;",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            "Ljava/lang/Integer;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/shoppinglists/ListAddController;",
            ">;)V"
        }
    .end annotation

    .line 488
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 489
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 490
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 491
    iput-object p3, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->originScreen:Ljava/lang/Integer;

    .line 492
    iput-object p4, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->listAddControllerWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 497
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "origin_screen"

    .line 498
    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->originScreen:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "origin_element"

    .line 499
    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 500
    invoke-static {v1}, Lcom/shopkick/app/util/TileUtils;->getTileElement(Ljava/lang/Integer;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 499
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->listAddControllerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/shoppinglists/ListAddController;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "PRODUCT_DETAILS_PRODUCT_ADDED"

    .line 504
    iget-object v3, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productId:Ljava/lang/String;

    .line 505
    invoke-virtual {v0, v3, v1}, Lcom/shopkick/app/shoppinglists/ListAddController;->hasBeenAdded(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v3

    .line 504
    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    iget-object v2, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productId:Ljava/lang/String;

    .line 508
    invoke-virtual {v0, v2}, Lcom/shopkick/app/shoppinglists/ListAddController;->getShoppingListEntryInfoForProductId(Ljava/lang/String;)Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "PRODUCT_DETAILS_PRODUCT_ADDED_SHOPPING_LIST_ID"

    .line 512
    invoke-virtual {v2}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->getShoppingListId()Ljava/lang/String;

    move-result-object v4

    .line 511
    invoke-virtual {p1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "PRODUCT_DETAILS_PRODUCT_ADDED_SHOPPING_LIST_ENTRY_ID"

    .line 514
    invoke-virtual {v2}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->getShoppingListEntryId()Ljava/lang/String;

    move-result-object v2

    .line 513
    invoke-virtual {p1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 519
    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    return-void

    .line 523
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const-string v3, "product_id"

    .line 524
    iget-object v4, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 525
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x1b

    if-eq v4, v5, :cond_3

    iget-object v4, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x3fa

    if-ne v4, v5, :cond_2

    goto :goto_0

    :cond_2
    iget-object v4, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v4, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productId:Ljava/lang/String;

    .line 524
    :goto_1
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "chain_id"

    .line 527
    iget-object v4, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_4

    const-string v3, "PRODUCT_DETAILS_PRODUCT_ADDED"

    .line 530
    iget-object v4, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productId:Ljava/lang/String;

    .line 531
    invoke-virtual {v0, v4, v1}, Lcom/shopkick/app/shoppinglists/ListAddController;->hasBeenAdded(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v1

    .line 530
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productId:Ljava/lang/String;

    .line 534
    invoke-virtual {v0, v1}, Lcom/shopkick/app/shoppinglists/ListAddController;->getShoppingListEntryInfoForProductId(Ljava/lang/String;)Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "PRODUCT_DETAILS_PRODUCT_ADDED_SHOPPING_LIST_ID"

    .line 538
    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->getShoppingListId()Ljava/lang/String;

    move-result-object v3

    .line 537
    invoke-virtual {p1, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "PRODUCT_DETAILS_PRODUCT_ADDED_SHOPPING_LIST_ENTRY_ID"

    .line 540
    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->getShoppingListEntryId()Ljava/lang/String;

    move-result-object v0

    .line 539
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    :cond_4
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v0, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v1, Lcom/shopkick/app/products/ProductDetailsScreen;

    invoke-direct {p1, v0, v1, v2}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 545
    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method
