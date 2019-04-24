.class public Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "ProductInfoTileViewHolderConfigurator.java"


# static fields
.field private static final CHAIN_LOGO_MAX_WIDTH:I = 0x64


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private context:Landroid/content/Context;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private viewPager:Landroid/support/v4/view/ViewPager;

.field private viewPagerAdapter:Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;

.field private viewPagerSection:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;Landroid/content/Context;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 53
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 54
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->context:Landroid/content/Context;

    const/4 p1, 0x1

    .line 57
    iput-boolean p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->allowChainLogoResize:Z

    const/16 p1, 0x64

    .line 58
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->chainLogoMaxWidth:Ljava/lang/Integer;

    return-void
.end method

.method private createClientLog(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 1

    .line 62
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v0, 0x9b

    .line 63
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 64
    move-object v0, p2

    check-cast v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Product;->productId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductId(Ljava/lang/String;)V

    .line 65
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    return-object p1
.end method

.method private static createImageURLs(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ProductImage;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 108
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ProductImage;

    .line 109
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductImage;->imageUrl:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private createOptionalSetupParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;
    .locals 2

    .line 70
    new-instance v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v0}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 71
    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 72
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 73
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    return-object v0
.end method

.method private setupForViewPager(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V
    .locals 8

    const v0, 0x7f090810

    .line 78
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->viewPagerSection:Landroid/widget/RelativeLayout;

    .line 79
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->viewPagerSection:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    const v0, 0x7f090542

    .line 80
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->viewPager:Landroid/support/v4/view/ViewPager;

    const v0, 0x7f0904ff

    .line 81
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->viewPagerSection:Landroid/widget/RelativeLayout;

    const/16 v2, 0x140

    invoke-static {v0, v2, v2}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;II)V

    .line 86
    iget-object v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Product;->images:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    .line 87
    new-instance v0, Lcom/shopkick/app/widget/PageIndicator;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/shopkick/app/widget/PageIndicator;-><init>(Landroid/content/Context;)V

    const v2, 0x7f080271

    .line 88
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/PageIndicator;->setActiveIndicatorImageResourceId(I)Lcom/shopkick/app/widget/PageIndicator;

    move-result-object v0

    const v2, 0x7f080272

    .line 89
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/PageIndicator;->setInactiveIndicatorImageResourceId(I)Lcom/shopkick/app/widget/PageIndicator;

    move-result-object v0

    .line 90
    iget-object v2, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/Product;->images:Ljava/util/List;

    .line 91
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    .line 90
    invoke-virtual {v0, p1, v2, v1}, Lcom/shopkick/app/widget/PageIndicator;->configureIndicators(Landroid/widget/RelativeLayout;II)V

    move-object v6, v0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .line 94
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    const/4 v0, 0x0

    move-object v6, v0

    .line 97
    :goto_0
    new-instance p1, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->context:Landroid/content/Context;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->viewPager:Landroid/support/v4/view/ViewPager;

    iget-object p2, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/Product;->images:Ljava/util/List;

    .line 99
    invoke-static {p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->createImageURLs(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;-><init>(Landroid/content/Context;Landroid/support/v4/view/ViewPager;Ljava/util/List;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/widget/PageIndicator;Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->viewPagerAdapter:Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;

    .line 103
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->viewPager:Landroid/support/v4/view/ViewPager;

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->viewPagerAdapter:Lcom/shopkick/app/viewPager/ProductImagePagerAdapter;

    invoke-virtual {p1, p2}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f09053e

    .line 222
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    const v0, 0x7f0900e5

    .line 223
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c015c

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    .line 200
    :cond_0
    check-cast p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 202
    iget-object v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    if-nez v0, :cond_1

    return-void

    :cond_1
    const v0, 0x7f0900e5

    .line 206
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 207
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {v1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    iget-object v2, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/Product;->chainImageUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->getChainLogoRequestListener(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/RequestListener;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 209
    iget-object v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Product;->images:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Product;->images:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_2

    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMultipleProductImagesEnabled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 210
    iget-object v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Product;->images:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ProductImage;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProductImage;->imageUrl:Ljava/lang/String;

    .line 212
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const v0, 0x7f09053e

    .line 213
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 214
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/Product;->images:Ljava/util/List;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/ProductImage;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ProductImage;->imageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_2
    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 7

    .line 125
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 127
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    const/4 v1, 0x1

    .line 128
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->setFullSpan(Z)V

    .line 131
    :cond_0
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMultipleProductImagesEnabled()Z

    move-result v0

    const v1, 0x7f0904ff

    const v2, 0x7f090542

    const/4 v3, 0x0

    const v4, 0x7f09053e

    const/16 v5, 0x8

    const/4 v6, 0x0

    if-eqz v0, :cond_1

    .line 132
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 133
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 134
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 135
    move-object v0, p2

    check-cast v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->setupForViewPager(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V

    goto :goto_0

    .line 137
    :cond_1
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 138
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 139
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 140
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 142
    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v0, v2, v1}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;II)V

    .line 146
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->createOptionalSetupParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object v1

    .line 147
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 148
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 149
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->createClientLog(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v2

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v2, v4, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 150
    invoke-virtual {v0, v3}, Lcom/shopkick/app/logging/UserEventImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 153
    :goto_0
    move-object v0, p2

    check-cast v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    const v1, 0x7f090545

    .line 156
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    .line 157
    iget-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/Product;->name:Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 158
    iget-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/Product;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    const v1, 0x7f09053a

    .line 162
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    .line 163
    iget-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    if-eqz v2, :cond_3

    .line 164
    iget-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/Product;->currentPrice:Ljava/lang/String;

    iget-object v0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Product;->originalPrice:Ljava/lang/String;

    sget-object v4, Lcom/shopkick/app/util/ProductUtils$PriceDirection;->HORIZONTAL:Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    invoke-static {v2, v0, v4}, Lcom/shopkick/app/util/ProductUtils;->getSpannablePriceString(Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/util/ProductUtils$PriceDirection;)Landroid/text/Spannable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 173
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    invoke-static {v0, v6}, Lcom/shopkick/app/util/NumberFormatter;->formatSaveCount(Ljava/lang/Long;I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    move-object v0, v3

    :goto_1
    const v1, 0x7f090278

    .line 175
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    .line 176
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f090277

    .line 177
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    if-eqz v0, :cond_5

    move v5, v6

    :cond_5
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0900e5

    .line 180
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-direct {v2, v4, p2}, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 181
    invoke-virtual {v1, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0xbc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 184
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 185
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 186
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 187
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 188
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 189
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v2, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 190
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v2

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v1, v4, p2}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 193
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
