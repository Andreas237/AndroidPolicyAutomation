.class public Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "OfferHeaderTileConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;,
        Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;
    }
.end annotation


# static fields
.field public static final OFFER_HEADER_TILE_CATEGORY_NAME:Ljava/lang/String; = "OFFER_HEADER_TILE_CATEGORY_NAME"


# instance fields
.field private final MAX_ZOOM_FACTOR:F

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/shoppinglists/ListAddController;)V
    .locals 1

    .line 59
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    const/high16 v0, 0x40400000    # 3.0f

    .line 54
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->MAX_ZOOM_FACTOR:F

    .line 60
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 61
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;)Lcom/shopkick/app/application/ClientFlagsManager;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-object p0
.end method

.method private populateCarousel(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 6

    const v0, 0x7f090541

    .line 141
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKViewPager;

    .line 142
    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 147
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;

    invoke-direct {v1, p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;Lcom/shopkick/app/widget/SKViewPager;)V

    .line 148
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 149
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKViewPager;->setPagingEnabled(Z)V

    .line 150
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    :cond_0
    const v3, 0x7f090306

    .line 153
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->setLoadingSpinner(Landroid/view/View;)V

    .line 156
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->setProductFamilyId(Ljava/lang/String;)V

    .line 157
    invoke-virtual {v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->setPinchZoomEnabled(Z)V

    .line 158
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrls:Ljava/util/List;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrls:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 159
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrls:Ljava/util/List;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->setImageUrlList(Ljava/util/List;)V

    goto :goto_0

    .line 161
    :cond_1
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrl:Ljava/lang/String;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 163
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrl:Ljava/lang/String;

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->setImageUrlList(Ljava/util/List;)V

    goto :goto_0

    .line 166
    :cond_2
    invoke-virtual {v1, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->setPinchZoomEnabled(Z)V

    .line 167
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->setImageUrlList(Ljava/util/List;)V

    .line 171
    :goto_0
    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result v3

    if-nez v3, :cond_4

    .line 174
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrls:Ljava/util/List;

    if-eqz v3, :cond_3

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrls:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v2, :cond_3

    const v3, 0x3fffffff    # 1.9999999f

    .line 176
    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrls:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    rem-int v5, v3, v5

    sub-int/2addr v3, v5

    goto :goto_1

    :cond_3
    move v3, v4

    .line 178
    :goto_1
    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKViewPager;->setCurrentItem(I)V

    :cond_4
    const v3, 0x7f090540

    .line 183
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    .line 186
    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrls:Ljava/util/List;

    if-eqz v5, :cond_5

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrls:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-le v5, v2, :cond_5

    .line 187
    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 189
    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->getPageIndicator()Lcom/shopkick/app/widget/PageIndicator;

    move-result-object v1

    const v2, 0x7f080224

    .line 190
    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/PageIndicator;->setActiveIndicatorImageResourceId(I)Lcom/shopkick/app/widget/PageIndicator;

    move-result-object v1

    const v2, 0x7f080225

    .line 191
    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/PageIndicator;->setInactiveIndicatorImageResourceId(I)Lcom/shopkick/app/widget/PageIndicator;

    move-result-object v1

    const/4 v2, 0x4

    .line 192
    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/PageIndicator;->setIndicatorMargin(I)Lcom/shopkick/app/widget/PageIndicator;

    move-result-object v1

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrls:Ljava/util/List;

    .line 194
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    .line 195
    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result v0

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrls:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    rem-int/2addr v0, v5

    .line 193
    invoke-virtual {v1, v3, v2, v0}, Lcom/shopkick/app/widget/PageIndicator;->configureIndicators(Landroid/widget/RelativeLayout;II)V

    goto :goto_2

    :cond_5
    const/16 v0, 0x8

    .line 198
    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 202
    :goto_2
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrls:Ljava/util/List;

    if-eqz v0, :cond_6

    .line 203
    :goto_3
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrls:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_6

    .line 204
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {v0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrls:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/util/GlideRequest;->submit()Lcom/bumptech/glide/request/FutureTarget;

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_6
    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f09053e

    .line 137
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c013d

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    .line 128
    :cond_0
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrl:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    :goto_0
    const v0, 0x7f09053e

    .line 129
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_2

    const v1, 0x7f090306

    .line 131
    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->getHideViewRequestListener(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)Lcom/bumptech/glide/request/RequestListener;

    move-result-object v1

    .line 132
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_2
    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 6

    .line 71
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 73
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferMerchantUrl:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const v3, 0x7f0900d8

    .line 75
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_1

    .line 77
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 78
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    goto :goto_1

    .line 80
    :cond_1
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v4

    const-string v5, "OFFER_HEADER_TILE_CATEGORY_NAME"

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 81
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v4

    const-string v5, "OFFER_HEADER_TILE_CATEGORY_NAME"

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    :cond_2
    :goto_1
    const v3, 0x7f090543

    .line 84
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v3, 0x7f090530

    .line 86
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v3

    .line 87
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v4}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    if-eqz v4, :cond_4

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    .line 88
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_4

    if-nez v0, :cond_4

    .line 89
    invoke-virtual {v3, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    const/4 v2, 0x0

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v2, v4}, Lcom/shopkick/app/shoppinglists/ListAddController;->hasBeenAdded(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const v0, 0x7f08024a

    .line 91
    invoke-virtual {v3, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setImageResource(I)V

    goto :goto_2

    :cond_3
    const v0, 0x7f08018e

    .line 93
    invoke-virtual {v3, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setImageResource(I)V

    .line 95
    :goto_2
    new-instance v0, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {v0, p2, v2, v4}, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;-><init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/logging/UserEventLogger;)V

    invoke-virtual {v3, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_4
    const/16 v0, 0x8

    .line 99
    invoke-virtual {v3, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 103
    :goto_3
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->populateCarousel(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    const v0, 0x7f09053f

    .line 106
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/UserEventFrameLayout;

    .line 107
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v3, 0xcf

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 108
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 109
    new-instance v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v3}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 110
    invoke-virtual {p0, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 111
    iget-object v4, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v4, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 112
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 113
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATScanEnabled()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 114
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanDetailViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object p1, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 115
    iput-boolean v1, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->useZMoatIID:Z

    .line 117
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v2, p1, v3}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method
