.class public Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;
.super Ljava/lang/Object;
.source "ShoppingListEntryConverter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter$CategoryTileInfoComparator;
    }
.end annotation


# instance fields
.field private categoryHeaderMaps:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;",
            ">;>;"
        }
    .end annotation
.end field

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private completedEntryIdMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private context:Landroid/content/Context;

.field private entryIdToTaxonomyIdMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private loadingString:Ljava/lang/String;

.field private productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

.field private scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

.field private taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/products/ProductsDataSource;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->categoryHeaderMaps:Ljava/util/HashMap;

    .line 39
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->completedEntryIdMap:Ljava/util/HashMap;

    .line 42
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->entryIdToTaxonomyIdMap:Ljava/util/HashMap;

    .line 51
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->context:Landroid/content/Context;

    .line 52
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 53
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    .line 54
    iput-object p4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 55
    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    const p2, 0x7f11019e

    .line 57
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->loadingString:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;)Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    return-object p0
.end method

.method private createCategoryTile(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 3

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getTaxonomyNode(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    move-result-object v0

    .line 313
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;-><init>()V

    .line 314
    iput-object p2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    .line 316
    new-instance p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {p2}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    const/16 v2, 0x3f8

    .line 317
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 318
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->name:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->loadingString:Ljava/lang/String;

    :goto_0
    iput-object v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->title:Ljava/lang/String;

    .line 319
    iput-object p1, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListId:Ljava/lang/String;

    .line 320
    iput-object v1, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    const/4 p1, 0x0

    .line 321
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    return-object p2
.end method

.method private createShoppingListTitleTile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 4

    .line 292
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "shopping_list_id"

    .line 293
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "chain_id"

    .line 294
    invoke-virtual {v0, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    new-instance p3, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v2, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;

    invoke-direct {p3, v1, v2, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 298
    new-instance v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    const/16 v1, 0x10

    .line 299
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    .line 300
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->context:Landroid/content/Context;

    const v2, 0x7f1106b3

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->buttonTitle:Ljava/lang/String;

    .line 301
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->context:Landroid/content/Context;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const p2, 0x7f1106a6

    invoke-virtual {v1, p2, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->title:Ljava/lang/String;

    .line 302
    invoke-virtual {p3}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->skLink:Ljava/lang/String;

    .line 303
    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListId:Ljava/lang/String;

    .line 306
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;-><init>()V

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    return-object v0
.end method

.method private listHasEntryWithId(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;Ljava/lang/String;)Z
    .locals 1

    .line 327
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 328
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 252
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->categoryHeaderMaps:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->completedEntryIdMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->entryIdToTaxonomyIdMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public convert(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;ZZZLjava/lang/String;)Ljava/util/ArrayList;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;",
            "ZZZ",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 80
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 81
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 82
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 83
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 85
    iget-object v6, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    if-eqz v6, :cond_19

    iget-object v6, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_6

    .line 88
    :cond_0
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 89
    iget-object v7, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 90
    iget-object v9, v8, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    if-nez v9, :cond_1

    .line 91
    iget-object v9, v8, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v6, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 94
    :cond_2
    iget-object v7, v0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->entryIdToTaxonomyIdMap:Ljava/util/HashMap;

    iget-object v8, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v7, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    iget-object v6, v0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->categoryHeaderMaps:Ljava/util/HashMap;

    iget-object v7, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/HashMap;

    if-nez v6, :cond_3

    .line 99
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 100
    iget-object v7, v0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->categoryHeaderMaps:Ljava/util/HashMap;

    iget-object v8, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v7, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/4 v7, 0x1

    if-eqz p4, :cond_4

    if-eqz p3, :cond_4

    move v9, v7

    goto :goto_1

    :cond_4
    const/4 v9, 0x0

    .line 109
    :goto_1
    iget-object v10, v0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->completedEntryIdMap:Ljava/util/HashMap;

    iget-object v11, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/ArrayList;

    if-nez v10, :cond_5

    .line 111
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 112
    iget-object v11, v0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->completedEntryIdMap:Ljava/util/HashMap;

    iget-object v12, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v11, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    :cond_5
    new-instance v11, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 119
    iget-object v12, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    iget-object v13, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    iget-object v14, v0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v15, v0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    iget-object v8, v0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    invoke-static {v12, v13, v14, v15, v8}, Lcom/shopkick/app/util/TileUtils;->convertShoppingListEntryToTileInfo(Ljava/lang/String;Ljava/util/List;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/products/ProductsDataSource;Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;)Ljava/util/List;

    move-result-object v8

    .line 125
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_6
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_12

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 126
    check-cast v12, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 127
    iget-object v13, v12, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-nez v13, :cond_7

    goto :goto_2

    .line 131
    :cond_7
    iget-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    if-nez v14, :cond_8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iput-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    .line 134
    :cond_8
    iget-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    const/4 v15, 0x2

    if-ne v14, v15, :cond_b

    .line 136
    iget-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_9

    .line 137
    iget-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    if-eqz p3, :cond_6

    if-nez v9, :cond_a

    .line 143
    iget-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_c

    :cond_a
    const/4 v13, 0x0

    .line 144
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    iput-object v14, v12, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    .line 145
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 154
    :cond_b
    iget-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 158
    :cond_c
    iget-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-static {v14}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_d

    .line 159
    iget-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_d

    iget-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-direct {v0, v1, v14}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->listHasEntryWithId(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_d

    .line 161
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    iput-object v14, v12, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isLinked:Ljava/lang/Boolean;

    .line 166
    :cond_d
    iget-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    if-nez v14, :cond_e

    const-string v14, "TaxonomyNodeIdOther"

    .line 167
    iput-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    .line 172
    :cond_e
    iget-object v14, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v0, v14, v13}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getTaxonomyId(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/lang/String;

    move-result-object v14

    .line 173
    invoke-virtual {v6, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    if-nez v15, :cond_f

    const-string v15, "TaxonomyNodeIdOther"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_f

    iget-object v15, v0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    .line 174
    invoke-virtual {v15, v14}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getTaxonomyNode(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    move-result-object v15

    if-nez v15, :cond_f

    const/4 v15, 0x0

    .line 176
    invoke-virtual {v13, v15}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v13

    iput-object v13, v12, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 177
    iget-object v13, v12, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    const-string v14, "TaxonomyNodeIdOther"

    iput-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    const-string v14, "TaxonomyNodeIdOther"

    .line 182
    :cond_f
    iget-object v13, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v0, v13, v14}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getHeaderTile(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v13

    .line 184
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_10

    .line 185
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    :cond_10
    invoke-interface {v11, v14}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 191
    iget-object v13, v13, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    iput-object v13, v12, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    .line 194
    invoke-virtual {v4, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/ArrayList;

    if-nez v13, :cond_11

    .line 196
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 197
    invoke-virtual {v4, v14, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    :cond_11
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 203
    :cond_12
    new-instance v7, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter$CategoryTileInfoComparator;

    const/4 v8, 0x0

    invoke-direct {v7, v0, v8}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter$CategoryTileInfoComparator;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter$1;)V

    invoke-static {v3, v7}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 206
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 207
    iget-object v9, v7, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v9, v9, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v4, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    goto :goto_3

    .line 210
    :cond_13
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    iget-object v9, v7, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v9, v9, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v4, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    new-instance v10, Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;

    iget-object v12, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-direct {v10, v12}, Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;-><init>(Ljava/util/List;)V

    invoke-static {v9, v10}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 217
    iget-object v7, v7, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    .line 222
    :cond_14
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_16

    if-eqz p3, :cond_16

    .line 223
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    const-string v4, "clientTaxonomyIdCompleted"

    invoke-virtual {v0, v3, v4}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getHeaderTile(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v3

    .line 225
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_15

    goto :goto_4

    :cond_15
    const/16 v4, 0xa

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    :goto_4
    iput-object v8, v3, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->verticalPadding:Ljava/lang/Integer;

    .line 226
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v3, "clientTaxonomyIdCompleted"

    .line 227
    invoke-interface {v11, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 230
    new-instance v3, Lcom/shopkick/app/shoppinglists/SLUtils$CompletedEntryTileInfoComparator;

    iget-object v4, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-direct {v3, v4}, Lcom/shopkick/app/shoppinglists/SLUtils$CompletedEntryTileInfoComparator;-><init>(Ljava/util/List;)V

    invoke-static {v5, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 231
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 235
    :cond_16
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 236
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 240
    :cond_17
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 241
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz p2, :cond_18

    .line 245
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->name:Ljava/lang/String;

    move-object/from16 v4, p5

    invoke-direct {v0, v2, v1, v4}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->createShoppingListTitleTile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v3, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_18
    return-object v3

    .line 85
    :cond_19
    :goto_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    return-object v1
.end method

.method public convert(Ljava/util/ArrayList;ZLjava/lang/String;)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;",
            ">;Z",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 67
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move v4, p2

    move-object v7, p3

    .line 68
    invoke-virtual/range {v2 .. v7}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->convert(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;ZZZLjava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getHeaderTile(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 2

    .line 270
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->categoryHeaderMaps:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    .line 271
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-nez v1, :cond_0

    .line 273
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->createCategoryTile(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v1

    .line 274
    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method public getTaxonomyId(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/lang/String;
    .locals 2

    .line 281
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->entryIdToTaxonomyIdMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    .line 282
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    .line 284
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 285
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 287
    :cond_0
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    return-object p1
.end method

.method public isEntryInCompletedSection(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    .line 260
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->completedEntryIdMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_1

    .line 262
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    :cond_2
    :goto_0
    return v0
.end method
