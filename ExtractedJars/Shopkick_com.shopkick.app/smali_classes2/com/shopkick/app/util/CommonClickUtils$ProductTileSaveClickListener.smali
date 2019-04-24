.class public Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;
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
    name = "ProductTileSaveClickListener"
.end annotation


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

.field private productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/products/ProductsDataSource;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    .line 116
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 117
    iput-object p3, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    .line 118
    iput-object p4, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 123
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 124
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productId:Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->displayTaxonomyNodeId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/app/shoppinglists/ListAddController;->addProductOrScanListEntry(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 129
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productId:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/products/ProductsDataSource;->toggleItemSaveState(Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method
