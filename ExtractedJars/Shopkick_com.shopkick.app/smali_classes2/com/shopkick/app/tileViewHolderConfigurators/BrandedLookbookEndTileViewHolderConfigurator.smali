.class public Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "BrandedLookbookEndTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;
    }
.end annotation


# instance fields
.field private storyId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    return-void
.end method

.method private createClientLog(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 1

    .line 108
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0, p1, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 109
    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStoryId(Ljava/lang/String;)V

    .line 110
    invoke-virtual {v0, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHorizontalListDataPos(Ljava/lang/Integer;)V

    return-object v0
.end method

.method private createOptionalSetupParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;
    .locals 2

    .line 115
    new-instance v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v0}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 116
    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 117
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 118
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    return-object v0
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f090242

    .line 101
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0036

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 1

    const v0, 0x7f090242

    .line 96
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 97
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    const v0, 0x7f090242

    .line 74
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v0

    const/4 v1, 0x0

    .line 75
    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 v2, 0x18

    .line 77
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator;->storyId:Ljava/lang/String;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-direct {p0, v2, v3, v1, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator;->createClientLog(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v1

    .line 83
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator;->createOptionalSetupParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object p1

    .line 84
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    .line 85
    iget-object v2, p1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    const-string v3, "ImageConstraintKey"

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v2, p1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 87
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATLookbookEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 88
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object p2, p1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    const/4 p2, 0x1

    .line 89
    iput-boolean p2, p1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->useZMoatIID:Z

    .line 92
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v1, p2, p1}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;
    .locals 11

    .line 38
    invoke-super {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    move-result-object p1

    .line 39
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v2, v1, Landroid/util/DisplayMetrics;->density:F

    .line 42
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result v1

    int-to-float v3, v1

    .line 43
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/FrameConfigurator;->screenHeightWithoutStatusBar(Landroid/content/Context;)I

    move-result v1

    int-to-float v4, v1

    sget v5, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->STORY_CARD_WIDTH:I

    sget v6, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->STORY_CARD_HEIGHT:I

    sget v7, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->CARD_TO_SCREEN_EDGE_SPACING:I

    sget v8, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->CARD_TO_SCREEN_TOP_SPACING:I

    sget v9, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->CARD_TO_SCREEN_EDGE_SPACING:I

    sget v10, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->CARD_TO_SCREEN_TOP_SPACING:I

    .line 41
    invoke-static/range {v2 .. v10}, Lcom/shopkick/app/util/FrameConfigurator;->getMaxScaleFactor(FFFIIIIII)F

    move-result v1

    const v2, 0x7f090242

    .line 52
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v1, v3}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithScaleFactor(Landroid/view/View;FZ)V

    const/4 v2, 0x1

    .line 57
    invoke-static {v0, v1, v2}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithScaleFactor(Landroid/view/View;FZ)V

    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 59
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 60
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 59
    invoke-static {v3, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->getTileHeight(FF)F

    move-result v1

    float-to-int v1, v1

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 62
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p1
.end method

.method public setStoryId(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator;->storyId:Ljava/lang/String;

    return-void
.end method
