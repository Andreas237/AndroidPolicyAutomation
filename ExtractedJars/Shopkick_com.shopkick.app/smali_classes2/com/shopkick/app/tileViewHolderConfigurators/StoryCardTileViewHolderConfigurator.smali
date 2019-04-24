.class public Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "StoryCardTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;
    }
.end annotation


# static fields
.field private static final CHAIN_LOGO_MAX_WIDTH:I = 0x37


# instance fields
.field private storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/storycards/StoryCardDataSource;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    .line 44
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->allowChainLogoResize:Z

    const/16 p1, 0x37

    .line 48
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->chainLogoMaxWidth:Ljava/lang/Integer;

    return-void
.end method

.method private getLogRecord(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 2

    .line 75
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

    .line 76
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 77
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->tileGroupType:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTileGroupType(Ljava/lang/Integer;)V

    .line 78
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->storyCardId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStoryCardId(Ljava/lang/String;)V

    return-object p1
.end method

.method private getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;
    .locals 2

    .line 83
    new-instance v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v0}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 84
    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 85
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 86
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    return-object v0
.end method

.method private setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 4

    const v0, 0x7f0906fa

    .line 53
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v0

    .line 54
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object v1

    .line 55
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 56
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 57
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->getLogRecord(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v2, v3, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 60
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->getLogRecord(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v0

    .line 61
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object v1

    const/4 v2, 0x1

    .line 62
    iput-boolean v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 63
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v2, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 64
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v0, v3, v1}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 67
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->getLogRecord(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p2

    if-eqz p3, :cond_0

    const/16 v0, 0xf

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    .line 68
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    if-eqz p3, :cond_1

    const/16 p3, 0xe

    goto :goto_1

    :cond_1
    const/16 p3, 0xd

    .line 69
    :goto_1
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    const p3, 0x7f090277

    .line 70
    invoke-virtual {p1, p3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object p3

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object p1

    invoke-virtual {p3, p2, v0, p1}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f0906fa

    .line 138
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    const v0, 0x7f0900e5

    .line 139
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01d3

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0906fa

    .line 128
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 129
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

    .line 131
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 132
    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->getChainLogoRequestListener(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/RequestListener;

    move-result-object v1

    .line 133
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

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->storyCardId:Ljava/lang/String;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/storycards/StoryCardDataSource;->getSaveStateForItem(Ljava/lang/String;Z)Z

    move-result v0

    const v1, 0x7f090277

    .line 104
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v1

    if-eqz v0, :cond_0

    const v2, 0x7f0802fc

    goto :goto_0

    :cond_0
    const v2, 0x7f0802fd

    .line 105
    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 106
    new-instance v2, Lcom/shopkick/app/util/CommonClickUtils$StoryCardTileSaveClickListener;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    invoke-direct {v2, v3, p2}, Lcom/shopkick/app/util/CommonClickUtils$StoryCardTileSaveClickListener;-><init>(Lcom/shopkick/app/storycards/StoryCardDataSource;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 110
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v4, v4, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-direct {v2, v3, p2, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/Integer;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0906fa

    .line 113
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const v1, 0x7f0900e5

    .line 114
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 117
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V

    return-void
.end method
