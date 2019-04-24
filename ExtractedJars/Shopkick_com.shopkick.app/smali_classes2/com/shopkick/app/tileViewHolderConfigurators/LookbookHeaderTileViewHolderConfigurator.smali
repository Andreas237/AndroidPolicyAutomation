.class public Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "LookbookHeaderTileViewHolderConfigurator.java"


# static fields
.field private static final CHAIN_LOGO_DIMENSION_DP:I = 0x1e

.field private static final COVER_CARD_1X_HEIGHT:I = 0xbe

.field private static final COVER_CARD_1X_WIDTH:I = 0x10a

.field private static final LOGO_CIRCLE_RADIUS:I = 0xf

.field public static final LOOKBOOK_TILE_1X_HEIGHT:I = 0xbe

.field public static final LOOKBOOK_TILE_1X_WIDTH:I = 0x140


# instance fields
.field private bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

.field private lookbookTileImageSize:I

.field private storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

.field private storyType:Ljava/lang/Integer;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/graphics/BitmapHelpers;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    .line 62
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

    .line 63
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    const/4 p1, 0x1

    .line 66
    iput-boolean p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->allowChainLogoResize:Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->cropFullImageBitmapForLookbook(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private cropFullImageBitmapForLookbook(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Landroid/graphics/Bitmap;)V
    .locals 3

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 143
    iget v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->lookbookTileImageSize:I

    const/4 v1, 0x2

    const/16 v2, 0xbe

    if-ne v0, v1, :cond_0

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/16 v1, 0x140

    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/shopkick/app/graphics/BitmapHelpers;->setBitmapForLookbookCover(Landroid/view/View;Landroid/graphics/Bitmap;II)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/16 v1, 0x10a

    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/shopkick/app/graphics/BitmapHelpers;->setBitmapAndCropBottomForLookbookCover(Landroid/view/View;Landroid/graphics/Bitmap;II)V

    :cond_1
    :goto_0
    return-void
.end method

.method private setupFavButton(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/stories/StoriesDataSource;->maybeUpdateSocialData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    const v0, 0x7f090277

    .line 119
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v0

    .line 120
    new-instance v1, Lcom/shopkick/app/util/CommonClickUtils$StoryFaveClickListener;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    invoke-direct {v1, p2, v2}, Lcom/shopkick/app/util/CommonClickUtils$StoryFaveClickListener;-><init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/stories/StoriesDataSource;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 122
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/stories/StoriesDataSource;->getSaveStateForItem(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const v2, 0x7f0802fc

    goto :goto_0

    :cond_0
    const v2, 0x7f0802fd

    .line 124
    :goto_0
    invoke-virtual {v0, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setImageResource(I)V

    .line 127
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    if-eqz v1, :cond_1

    const/16 v3, 0xe

    goto :goto_1

    :cond_1
    const/16 v3, 0xd

    .line 128
    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v1, :cond_2

    const/16 v1, 0xc

    goto :goto_2

    :cond_2
    const/16 v1, 0xb

    .line 129
    :goto_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 130
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStoryId(Ljava/lang/String;)V

    .line 131
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v2, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 133
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 134
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 135
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v1, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListViewCell:Landroid/view/View;

    .line 136
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 138
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v2, p1, p2}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    .line 76
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0x29

    .line 77
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 78
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStoryId(Ljava/lang/String;)V

    .line 79
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 81
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 82
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 83
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    .line 84
    iget-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    const-string v4, "ImageConstraintKey"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListViewCell:Landroid/view/View;

    .line 86
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 87
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 88
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    const v3, 0x7f090451

    .line 90
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v3, v0, v4, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 93
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 94
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStoryId(Ljava/lang/String;)V

    .line 95
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 97
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 98
    invoke-virtual {p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    const/4 v3, 0x1

    .line 99
    iput-boolean v3, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 100
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v3, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListViewCell:Landroid/view/View;

    .line 101
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 103
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v3, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v3, v0, v4, v1}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 106
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0xbc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 107
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 108
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 109
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 110
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 111
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 112
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v1, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    const v1, 0x7f0900e5

    .line 113
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object p1

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0, v1, p2}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f0900e5

    .line 265
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 266
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequests;->clear(Landroid/view/View;)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0118

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0900e5

    .line 229
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 230
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {v1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator$1;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;Landroid/widget/ImageView;)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    .line 246
    invoke-virtual {v0}, Lcom/shopkick/app/util/GlideRequest;->submit()Lcom/bumptech/glide/request/FutureTarget;

    .line 249
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {v0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    new-instance p3, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator$2;

    invoke-direct {p3, p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator$2;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    .line 260
    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->submit()Lcom/bumptech/glide/request/FutureTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 6

    .line 169
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 171
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 172
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->setFullSpan(Z)V

    :cond_0
    const v0, 0x7f090451

    .line 176
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const v0, 0x7f0900e5

    .line 177
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 180
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    const v3, 0x7f090014

    const/4 v4, 0x0

    const/16 v5, 0x8

    if-nez v2, :cond_1

    .line 181
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 182
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 184
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->storyType:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    const/4 v2, 0x7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v2, v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->storyType:Ljava/lang/Integer;

    .line 185
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v5, v0, :cond_2

    goto :goto_0

    :cond_2
    move v1, v4

    .line 187
    :cond_3
    :goto_0
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 188
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-direct {v2, v3, p2, v1}, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0900e9

    .line 191
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    .line 192
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 193
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 196
    :cond_4
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 200
    :goto_1
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    const v2, 0x7f0904d9

    if-eqz v0, :cond_5

    if-eqz v1, :cond_5

    .line 201
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 203
    :cond_5
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 208
    :goto_2
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->lookbookTileImageSize:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->lookbookTileImageSize:I

    const v0, 0x7f090434

    .line 209
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 212
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    if-eqz v0, :cond_6

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 213
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 217
    :cond_6
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->setupFavButton(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 220
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method public setStoryType(Ljava/lang/Integer;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->storyType:Ljava/lang/Integer;

    return-void
.end method
