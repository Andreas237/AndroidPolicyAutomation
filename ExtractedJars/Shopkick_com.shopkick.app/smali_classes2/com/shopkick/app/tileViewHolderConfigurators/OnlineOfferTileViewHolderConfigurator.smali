.class public Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "OnlineOfferTileViewHolderConfigurator.java"


# instance fields
.field private final PRODUCT_IMAGE_CORNER_RADIUS_DP:I

.field private final PRODUCT_IMAGE_DIMENSION_DP:I

.field private mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/store/MCommerceManager;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    const/16 v0, 0x60

    .line 29
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;->PRODUCT_IMAGE_DIMENSION_DP:I

    const/4 v0, 0x3

    .line 30
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;->PRODUCT_IMAGE_CORNER_RADIUS_DP:I

    .line 35
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f09053e

    .line 136
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0144

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    if-eqz p2, :cond_1

    .line 124
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f09053e

    .line 128
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x60

    .line 129
    invoke-static {v1, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    const/4 v2, 0x3

    .line 130
    invoke-static {v2, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    .line 131
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->override(I)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Lcom/bumptech/glide/load/Transformation;

    const/4 p3, 0x0

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;

    invoke-direct {v1}, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;-><init>()V

    aput-object v1, p2, p3

    const/4 p3, 0x1

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-direct {v1, v2}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    aput-object v1, p2, p3

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->transforms([Lcom/bumptech/glide/load/Transformation;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    .line 44
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const v0, 0x7f09053e

    .line 47
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    .line 48
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const v0, 0x7f090545

    .line 51
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    .line 52
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0903ea

    .line 55
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f0903eb

    .line 56
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    .line 57
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferClickKickAmount:Ljava/lang/Integer;

    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v2

    if-eqz v2, :cond_1

    const v2, 0x7f060120

    const v3, 0x7f0801b9

    .line 61
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferClickKickCompleted:Ljava/lang/Boolean;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const v2, 0x7f0600c6

    const v3, 0x7f0801ba

    .line 66
    :cond_0
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 67
    invoke-virtual {v0}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 68
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferClickKickAmount:Ljava/lang/Integer;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, 0x0

    .line 70
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 71
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_1
    const/16 v2, 0x8

    .line 74
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 75
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 79
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 82
    new-instance v0, Lcom/shopkick/app/util/CommonClickUtils$OnlineOfferButtonClickListener;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {v0, v1, p2}, Lcom/shopkick/app/util/CommonClickUtils$OnlineOfferButtonClickListener;-><init>(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 84
    iget-object p2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09041b

    .line 85
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 6

    .line 89
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x139

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 90
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 91
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 92
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsOnlineOffer(Ljava/lang/Boolean;)V

    .line 93
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 95
    new-instance v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v3}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 96
    invoke-virtual {p0, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 97
    iget-object v4, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v4, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 98
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 99
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object v4, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 100
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v4, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 102
    iget-object v4, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v4, Lcom/shopkick/app/logging/IUserEventView;

    iget-object v5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {v4, v0, v5, v3}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    const v0, 0x7f09041b

    .line 105
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    .line 106
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v4, 0x132

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 107
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 108
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v3, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 109
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v3, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsOnlineOffer(Ljava/lang/Boolean;)V

    .line 111
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 112
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 113
    iput-boolean v1, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 114
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v1, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 115
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 117
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v3, p1, p2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method
