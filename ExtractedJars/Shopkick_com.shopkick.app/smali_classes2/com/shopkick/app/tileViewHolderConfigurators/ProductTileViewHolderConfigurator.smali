.class public Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "ProductTileViewHolderConfigurator.java"


# static fields
.field private static final CHAIN_LOGO_MAX_WIDTH:I = 0x37

.field private static final GAP_BETWEEN_LOGO_AND_PRICE:I = 0x8

.field private static final PRICE_TEXT_MARGIN:I = 0xf


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

.field private productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

.field private storyId:Ljava/lang/String;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/products/ProductsDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/shoppinglists/ListAddController;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    .line 52
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 53
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 54
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    const/4 p1, 0x1

    .line 57
    iput-boolean p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->allowChainLogoResize:Z

    const/16 p1, 0x37

    .line 58
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->chainLogoMaxWidth:Ljava/lang/Integer;

    return-void
.end method

.method private getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;
    .locals 2

    .line 108
    new-instance v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v0}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 109
    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 110
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 111
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    return-object v0
.end method

.method private getStandardProductTileRecord(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 2

    .line 93
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-static {v0}, Lcom/shopkick/app/util/TileUtils;->getTileElement(Ljava/lang/Integer;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 94
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 95
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->tileGroupType:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTileGroupType(Ljava/lang/Integer;)V

    .line 96
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_0

    .line 97
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfferId(Ljava/lang/String;)V

    goto :goto_0

    .line 99
    :cond_0
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductId(Ljava/lang/String;)V

    .line 101
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->storyId:Ljava/lang/String;

    if-eqz p2, :cond_1

    .line 102
    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStoryId(Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method private setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 4

    const p3, 0x7f09053e

    .line 67
    invoke-virtual {p1, p3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/logging/UserEventImageView;

    .line 68
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object v0

    .line 69
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 70
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 71
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->getStandardProductTileRecord(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p3, v1, v2, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 74
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->getStandardProductTileRecord(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p3

    const/4 v0, 0x4

    .line 75
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 76
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object v1

    const/4 v2, 0x1

    .line 77
    iput-boolean v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 78
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v2, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 79
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, p3, v3, v1}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 81
    iget-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    if-eqz p3, :cond_0

    .line 83
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->getStandardProductTileRecord(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p3

    const/16 v1, 0xbc

    .line 84
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 85
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 86
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    const p2, 0x7f0900e5

    .line 87
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object p2

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 88
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object p1

    invoke-virtual {p2, p3, v0, p1}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f09053e

    .line 207
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    const v0, 0x7f0900e5

    .line 208
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c015f

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f09053e

    .line 197
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 198
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {v1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    const v0, 0x7f0900e5

    .line 200
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 201
    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->getChainLogoRequestListener(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/RequestListener;

    move-result-object v1

    .line 202
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 9

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productId:Ljava/lang/String;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/products/ProductsDataSource;->getSaveStateForItem(Ljava/lang/String;Z)Z

    move-result v0

    const v1, 0x7f090277

    .line 129
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v1

    .line 130
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v2}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v2

    const/16 v3, 0x8

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    .line 133
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->getStandardProductTileRecord(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v2

    .line 134
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object v6

    const/16 v7, 0xd8

    .line 135
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 136
    iget-object v7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v8, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productId:Ljava/lang/String;

    invoke-virtual {v7, v8, v4}, Lcom/shopkick/app/shoppinglists/ListAddController;->hasBeenAdded(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_0

    const v7, 0x7f080249

    .line 137
    invoke-virtual {v1, v7}, Lcom/shopkick/app/logging/UserEventImageView;->setImageResource(I)V

    const/16 v7, 0x46

    .line 138
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_0
    const v7, 0x7f080191

    .line 140
    invoke-virtual {v1, v7}, Lcom/shopkick/app/logging/UserEventImageView;->setImageResource(I)V

    const/16 v7, 0x41

    .line 141
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 143
    :goto_0
    invoke-virtual {v1, v5}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 144
    iget-object v7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v2, v7, v6}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 145
    new-instance v2, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;

    iget-object v6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    iget-object v7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v8, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v2, v6, p2, v7, v8}, Lcom/shopkick/app/util/CommonClickUtils$ProductTileSaveClickListener;-><init>(Lcom/shopkick/app/products/ProductsDataSource;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/application/ClientFlagsManager;)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 152
    :cond_1
    invoke-virtual {v1, v3}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 153
    invoke-virtual {v1, v4}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    const v1, 0x7f09053a

    .line 157
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    .line 161
    invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v6, 0xf

    .line 162
    invoke-static {v6, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v6

    const/16 v7, 0x37

    .line 163
    invoke-static {v7, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v7

    .line 164
    invoke-static {v3, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v3

    .line 165
    iget-object v8, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    if-eqz v8, :cond_2

    add-int/2addr v7, v6

    add-int/2addr v7, v3

    .line 166
    invoke-virtual {v2, v7, v5, v6, v5}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_2

    .line 168
    :cond_2
    invoke-virtual {v2, v6, v5, v6, v5}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 170
    :goto_2
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 171
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p2, v2}, Lcom/shopkick/app/util/ProductUtils;->getSpannablePriceString(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/application/ClientFlagsManager;)Landroid/text/Spannable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 174
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 175
    new-instance v2, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v5, v5, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    new-instance v6, Ljava/lang/ref/WeakReference;

    iget-object v7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-direct {v6, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v2, v3, p2, v5, v6}, Lcom/shopkick/app/util/CommonClickUtils$ProductClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/Integer;Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0900e5

    .line 180
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v2

    new-instance v3, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;

    iget-object v5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-direct {v3, v5, p2}, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 181
    invoke-virtual {v2, v3}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f09053e

    .line 184
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 185
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 188
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V

    return-void
.end method

.method public setStoryId(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->storyId:Ljava/lang/String;

    return-void
.end method
