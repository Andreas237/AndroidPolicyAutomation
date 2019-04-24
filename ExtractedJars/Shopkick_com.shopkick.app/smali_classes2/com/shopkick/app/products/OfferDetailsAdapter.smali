.class public Lcom/shopkick/app/products/OfferDetailsAdapter;
.super Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
.source "OfferDetailsAdapter.java"


# static fields
.field public static final BUNDLE_INFO_TILES:Ljava/lang/String; = "BUNDLE_INFO_TILES"

.field private static final GROUP_HEADER_TOP_PADDING:I = 0x8


# instance fields
.field private context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Landroid/content/Context;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Landroid/content/Context;",
            "Lcom/shopkick/app/screens/AppScreen;",
            "Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;",
            "Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/logging/IUserEventCoordinator;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p7

    .line 47
    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    .line 48
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->context:Landroid/content/Context;

    return-void
.end method

.method private maybeAddOnlineOfferDescription(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    .line 298
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, 0x3f

    .line 299
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 300
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    .line 301
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreDescription:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreDescription:Ljava/lang/String;

    .line 303
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, 0x41

    .line 304
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 305
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1106c1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 307
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    .line 308
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x413

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    if-gez v1, :cond_2

    return-void

    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 318
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 319
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method private maybeAddOnlineOfferWidget(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 8

    .line 323
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0xfa5

    invoke-virtual {v0, v3, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 324
    instance-of v2, v0, Lcom/shopkick/fetchers/DataResponse;

    if-nez v2, :cond_0

    return-void

    .line 327
    :cond_0
    check-cast v0, Lcom/shopkick/fetchers/DataResponse;

    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;

    .line 329
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    if-eqz v2, :cond_5

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_5

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    .line 330
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v1, :cond_1

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    .line 331
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 330
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_1

    .line 335
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const v3, 0x7f110473

    const/16 v5, 0x10

    const/16 v6, -0x39

    if-eqz v2, :cond_4

    .line 336
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 337
    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-eq v7, v6, :cond_3

    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 338
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_2

    iget-object v5, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->context:Landroid/content/Context;

    new-array v6, v1, [Ljava/lang/Object;

    iget-object v7, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    aput-object v7, v6, v4

    invoke-virtual {v5, v3, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 339
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 340
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 344
    :cond_4
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 345
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 346
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v6, 0x7f110705

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 347
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v6, 0x7f110166

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    .line 348
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    .line 349
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 351
    invoke-static {v0}, Lcom/shopkick/app/util/TileUtils;->createWidgetHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v2

    .line 352
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const/4 v5, 0x0

    .line 353
    iput-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    .line 354
    iget-object v5, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->context:Landroid/content/Context;

    new-array v1, v1, [Ljava/lang/Object;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    aput-object p1, v1, v4

    invoke-virtual {v5, v3, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 356
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_5
    :goto_1
    return-void
.end method

.method private populateBundleInfoTile(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;",
            ">;"
        }
    .end annotation

    .line 226
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    const/16 v2, 0x411

    .line 227
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    const/4 v2, 0x1

    .line 228
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    const/4 v2, -0x1

    .line 229
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->dataPos:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method private populateBundleOfferWidgetTile()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 140
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, 0xfa9

    .line 141
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    return-object v0
.end method

.method private populateHeader(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    .line 235
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 236
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    const/16 p1, 0x41

    .line 237
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    return-object v0
.end method

.method private populateLoadingTile()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 258
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/4 v1, -0x1

    .line 259
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    return-object v0
.end method

.method private populateOfferDetailTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    .line 252
    invoke-static {p1}, Lcom/shopkick/app/util/TileUtils;->shallowCopyTileInfoV2(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    const/16 v0, 0x40a

    .line 253
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    return-object p1
.end method

.method private populateOfferHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 5

    .line 165
    invoke-static {p1}, Lcom/shopkick/app/util/TileUtils;->shallowCopyTileInfoV2(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    .line 166
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 167
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/16 p1, 0x40b

    .line 169
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    return-object v0
.end method

.method private populateOfferNotAvailableTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    .line 219
    invoke-static {p1}, Lcom/shopkick/app/util/TileUtils;->shallowCopyTileInfoV2(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    const/16 v0, 0x40e

    .line 220
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    return-object p1
.end method

.method private populateOfferOnlinePurchaseTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    .line 213
    invoke-static {p1}, Lcom/shopkick/app/util/TileUtils;->shallowCopyTileInfoV2(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    const/16 v0, 0x413

    .line 214
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    return-object p1
.end method

.method private populateOfferPostNotificationTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    .line 207
    invoke-static {p1}, Lcom/shopkick/app/util/TileUtils;->shallowCopyTileInfoV2(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    const/16 v0, 0x415

    .line 208
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    return-object p1
.end method

.method private populateOfferReceiptTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 193
    invoke-static {p1}, Lcom/shopkick/app/util/TileUtils;->shallowCopyTileInfoV2(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    .line 195
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 p1, 0x410

    goto :goto_0

    .line 197
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p1, 0x40f

    goto :goto_0

    :cond_1
    const/16 p1, 0x40d

    .line 202
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    return-object v0
.end method

.method private populateOfferScanTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 6

    .line 175
    invoke-static {p1}, Lcom/shopkick/app/util/TileUtils;->shallowCopyTileInfoV2(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    .line 177
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/16 v2, 0x40c

    if-eqz v1, :cond_1

    .line 178
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 180
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string v3, "bundle_id"

    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->missionBonusKicks:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0x416

    move v2, p1

    goto :goto_0

    .line 185
    :cond_1
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p1

    const-string v1, "bundle_id"

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    :cond_2
    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    return-object v0
.end method

.method private populateOfferStoreTile(Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 242
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 243
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->name:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 244
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainLogoImageUrl:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    .line 245
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    .line 246
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    const/16 p1, -0x36

    .line 247
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    return-object v0
.end method

.method private refreshOnlinePurchaseTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 6

    .line 271
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0xfa5

    invoke-virtual {v0, v3, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->getLoadState(I[Ljava/lang/Object;)I

    move-result v0

    if-eq v0, v1, :cond_0

    return-void

    .line 275
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    new-array v2, v1, [Ljava/lang/Object;

    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    aput-object v5, v2, v4

    invoke-virtual {v0, v3, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 276
    instance-of v2, v0, Lcom/shopkick/fetchers/DataResponse;

    if-eqz v2, :cond_1

    check-cast v0, Lcom/shopkick/fetchers/DataResponse;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_5

    .line 278
    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;

    .line 279
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    if-eqz v2, :cond_5

    .line 280
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 281
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 282
    invoke-direct {p0, v2}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateOfferOnlinePurchaseTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    .line 283
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v1

    if-gt v4, v0, :cond_4

    .line 284
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x413

    if-ne v0, v2, :cond_3

    .line 285
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 286
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, v4, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    return-void

    :cond_5
    return-void
.end method

.method private setDecorationRule()V
    .locals 5

    .line 361
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    .line 362
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 363
    iget-object v3, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 364
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, -0x39

    if-eq v3, v4, :cond_1

    const/16 v4, 0x10

    if-eq v3, v4, :cond_0

    const/16 v4, 0x3f

    if-eq v3, v4, :cond_1

    const/16 v4, 0x41

    if-eq v3, v4, :cond_0

    const/16 v4, 0x413

    if-eq v3, v4, :cond_1

    const/16 v4, 0x416

    if-eq v3, v4, :cond_1

    const/16 v4, 0xfa5

    if-eq v3, v4, :cond_1

    const/16 v4, 0xfa9

    if-eq v3, v4, :cond_2

    packed-switch v3, :pswitch_data_0

    packed-switch v3, :pswitch_data_1

    goto :goto_1

    .line 368
    :cond_0
    :pswitch_0
    iget-object v3, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/16 v4, 0x8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->verticalPadding:Ljava/lang/Integer;

    goto :goto_1

    :cond_1
    :pswitch_1
    add-int/lit8 v3, v2, -0x1

    .line 379
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :pswitch_2
    add-int/lit8 v3, v2, -0x1

    .line 382
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 387
    :cond_3
    invoke-virtual {p0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->getDividerItemDecoration()Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    move-result-object v2

    .line 388
    invoke-virtual {v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->clearRule()V

    .line 389
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 390
    new-instance v4, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    invoke-direct {v4, v3, v1}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {v2, v4}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    goto :goto_2

    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x40a
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x40f
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public populateFeedTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-eqz v0, :cond_f

    if-nez p1, :cond_0

    goto/16 :goto_6

    .line 56
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 57
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateOfferHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    invoke-static {p1}, Lcom/shopkick/app/util/Affiliate;->isOnlineOffer(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 60
    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateOfferOnlinePurchaseTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->maybeAddOnlineOfferDescription(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 62
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->maybeAddOnlineOfferWidget(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto/16 :goto_4

    .line 67
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    .line 68
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 71
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableScanMissionOdp:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateOfferScanTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v2

    goto :goto_1

    .line 69
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateOfferScanTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v2

    goto :goto_1

    :cond_4
    move v0, v1

    .line 76
    :goto_1
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    if-eqz v3, :cond_5

    .line 77
    iget-object v3, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateOfferReceiptTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v2

    goto :goto_2

    :cond_5
    move v3, v1

    .line 86
    :goto_2
    iget-object v4, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v4}, Lcom/shopkick/app/util/FeatureFlagHelper;->isPostScanReminderEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v4

    if-eqz v4, :cond_6

    if-eqz v0, :cond_6

    if-eqz v3, :cond_6

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    .line 88
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    .line 89
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    .line 90
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 91
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    .line 92
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateOfferPostNotificationTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 96
    :cond_6
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-nez v0, :cond_7

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    .line 97
    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateOfferNotAvailableTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    :cond_7
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyIds:Ljava/util/List;

    if-eqz v0, :cond_8

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f11044d

    .line 102
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 101
    invoke-direct {p0, v2}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateHeader(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateBundleOfferWidgetTile()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    :cond_8
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v0

    const-string v2, "BUNDLE_INFO_TILES"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v0

    const-string v2, "BUNDLE_INFO_TILES"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v2

    const-string v3, "BUNDLE_INFO_TILES"

    .line 107
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 106
    invoke-direct {p0, v2}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateBundleInfoTile(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 109
    :cond_9
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-eqz v0, :cond_b

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f110458

    .line 111
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 110
    invoke-direct {p0, v2}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateHeader(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p2, :cond_a

    .line 113
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    .line 114
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateOfferStoreTile(Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 117
    :cond_a
    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateLoadingTile()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    :cond_b
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->footerText:Ljava/lang/String;

    if-eqz p2, :cond_c

    .line 122
    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f11017a

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateHeader(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateOfferDetailTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    :cond_c
    :goto_4
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_d
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->supportedTileTypes:Ljava/util/Set;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    add-int/lit8 v0, v1, 0x1

    .line 131
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    move v1, v0

    goto :goto_5

    .line 135
    :cond_e
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->setDecorationRule()V

    .line 136
    invoke-virtual {p0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->notifyDataSetChanged()V

    return-void

    :cond_f
    :goto_6
    return-void
.end method

.method public processOnlineOfferDetailsScreen(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 264
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->refreshOnlinePurchaseTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 265
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->maybeAddOnlineOfferWidget(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 266
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->setDecorationRule()V

    .line 267
    invoke-virtual {p0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setupBundleProductsWidget(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 150
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0xfa9

    .line 153
    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;

    .line 154
    invoke-virtual {v1, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;->setTiles(Ljava/util/List;)V

    const/4 p1, 0x0

    .line 155
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_2

    .line 156
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 157
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_1

    .line 158
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->notifyItemChanged(I)V

    return-void

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_1
    return-void
.end method
