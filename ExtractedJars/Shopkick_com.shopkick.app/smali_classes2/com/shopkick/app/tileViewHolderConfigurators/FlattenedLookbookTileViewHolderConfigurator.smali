.class public Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "FlattenedLookbookTileViewHolderConfigurator.java"


# static fields
.field private static final TILE_HEIGHT:I = 0xbe

.field private static final TILE_WIDTH:I = 0x140


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private shouldHideReadState:Z

.field private storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/AgeVerificationController;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    .line 57
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 58
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 59
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f090452

    .line 192
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00c7

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    const v0, 0x7f090452

    .line 169
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 170
    invoke-virtual {v0}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 171
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-ne v2, v1, :cond_0

    .line 172
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {v1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->shopperIdBarcodeImageUrl:Ljava/lang/String;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    new-instance p3, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator$1;

    invoke-direct {p3, p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Landroid/widget/ImageView;)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    .line 185
    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->submit()Lcom/bumptech/glide/request/FutureTarget;

    goto :goto_0

    .line 187
    :cond_0
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {v1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->shopperIdBarcodeImageUrl:Ljava/lang/String;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    const p3, 0x7f090434

    invoke-virtual {p0, p1, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->getHideViewRequestListener(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)Lcom/bumptech/glide/request/RequestListener;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :goto_0
    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 9

    .line 73
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 76
    iget-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->shouldHideReadState:Z

    const v1, 0x7f090101

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-eqz v0, :cond_0

    .line 77
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/stories/StoriesDataSource;->storyHasBeenRead(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 81
    :cond_1
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 84
    :goto_0
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/shopkick/app/util/NumberFormatter;->formatSaveCount(Ljava/lang/Long;I)Ljava/lang/String;

    move-result-object v0

    const v4, 0x7f090275

    const v5, 0x7f090276

    if-eqz v0, :cond_2

    .line 86
    iget-object v6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v6}, Lcom/shopkick/app/util/FeatureFlagHelper;->isRemoveLookbookSavesEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 87
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v4

    .line 88
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 90
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 92
    :cond_2
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 93
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 97
    :goto_1
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-static {v4}, Lcom/shopkick/app/util/TileUtils;->getTileElement(Ljava/lang/Integer;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v0, v4, v5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 98
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    if-eqz v4, :cond_3

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStoryId(Ljava/lang/String;)V

    .line 99
    :cond_3
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 100
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-virtual {v4, p2}, Lcom/shopkick/app/account/AgeVerificationController;->getAgeVerificationStatus(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMinimumAgeEligibility(Ljava/lang/Integer;)V

    .line 102
    new-instance v4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v4}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 103
    invoke-virtual {p0, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 104
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    .line 105
    iget-object v5, v4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    const-string v6, "ImageConstraintKey"

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    iget-object v5, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v5, v4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 107
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 108
    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v5, v4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 109
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATLookbookEnabled()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 110
    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object v5, v4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 111
    iput-boolean v1, v4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->useZMoatIID:Z

    :cond_4
    const v1, 0x7f090452

    .line 114
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v1

    const/4 v5, 0x0

    .line 115
    invoke-virtual {v1, v5}, Lcom/shopkick/app/logging/UserEventImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 116
    iget-object v5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0, v5, v4}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 117
    invoke-virtual {v1}, Lcom/shopkick/app/logging/UserEventImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->lookbookTileImageSize:Ljava/lang/Integer;

    invoke-virtual {v0, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const v0, 0x7f090434

    .line 118
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 121
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 122
    iget-object v4, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iget v5, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v4, v5, v0}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;II)V

    .line 127
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->displayBackgroundImage:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const v4, 0x7f090578

    const v5, 0x7f0902ca

    const v6, 0x7f090455

    const v7, 0x7f090454

    if-eqz v0, :cond_8

    .line 128
    invoke-virtual {p1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v8, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    invoke-virtual {p1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v8, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    invoke-virtual {p1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 132
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    if-eqz v0, :cond_6

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_5

    goto :goto_2

    .line 135
    :cond_5
    invoke-virtual {p1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 133
    :cond_6
    :goto_2
    invoke-virtual {p1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 139
    :goto_3
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->flagText:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 140
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f090579

    .line 141
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->flagText:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 143
    :cond_7
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 147
    :goto_4
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 148
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 147
    invoke-static {v0, v3}, Lcom/shopkick/app/util/TileUtils;->setLookbookTileGradient(Landroid/view/View;I)V

    .line 149
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 152
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/logging/UserEventImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto :goto_5

    .line 154
    :cond_8
    invoke-virtual {p1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 155
    invoke-virtual {p1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 156
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 157
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 160
    sget-object p1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/logging/UserEventImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 163
    :goto_5
    new-instance p1, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    new-instance v2, Lcom/shopkick/app/util/CommonClickUtils$FlattenedLookbookTileClick;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-direct {v2, v3, p2}, Lcom/shopkick/app/util/CommonClickUtils$FlattenedLookbookTileClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-direct {p1, v0, p2, v2}, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;-><init>(Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, p1}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setShouldHideReadState(Z)V
    .locals 0

    .line 63
    iput-boolean p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->shouldHideReadState:Z

    return-void
.end method
