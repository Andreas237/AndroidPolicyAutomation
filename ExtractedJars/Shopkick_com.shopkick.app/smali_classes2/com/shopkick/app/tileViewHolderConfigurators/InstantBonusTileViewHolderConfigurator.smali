.class public Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "InstantBonusTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator$InstantBonusTileClickListener;
    }
.end annotation


# instance fields
.field private instantBonusAwarder:Lcom/shopkick/app/lookbooks/InstantBonusAwarder;

.field private storyProxy:Lcom/shopkick/app/stories/StoryProxy;

.field private tileHeight:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/lookbooks/InstantBonusAwarder;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->tileHeight:Ljava/lang/Integer;

    .line 35
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->instantBonusAwarder:Lcom/shopkick/app/lookbooks/InstantBonusAwarder;

    return-void
.end method

.method private getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;
    .locals 2

    .line 77
    new-instance v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v0}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 78
    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 79
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 80
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    return-object v0
.end method

.method private getStandardTileRecord(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 3

    .line 70
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x5e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 71
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 72
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->instantBonusId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setInstantBonusId(Ljava/lang/String;)V

    return-object v0
.end method

.method private setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    const v0, 0x7f090326

    .line 48
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventImageView;

    .line 50
    invoke-direct {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->getStandardTileRecord(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v1

    .line 51
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->hasCollectedInstantBonus:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setInstantBonusAwarded(Ljava/lang/Boolean;)V

    .line 53
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object v2

    .line 54
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 55
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 57
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v1, v3, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 60
    invoke-direct {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->getStandardTileRecord(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p2

    .line 62
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object v0

    const/4 v1, 0x1

    .line 63
    iput-boolean v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 65
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    .line 66
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, p2, v1, v0}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f090326

    .line 139
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00ea

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 1

    const v0, 0x7f090326

    .line 134
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 135
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
    .locals 9

    const v0, 0x7f090328

    .line 95
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    .line 96
    invoke-virtual {v5, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 99
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->tileHeight:Ljava/lang/Integer;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 100
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->tileHeight:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {v2, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 104
    :cond_0
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->hasCollectedInstantBonus:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v7, 0x0

    const v2, 0x7f090329

    if-eqz v1, :cond_1

    .line 106
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 109
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 112
    :cond_1
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    .line 113
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    if-eqz v0, :cond_2

    .line 117
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    new-instance v8, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator$InstantBonusTileClickListener;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->instantBonusAwarder:Lcom/shopkick/app/lookbooks/InstantBonusAwarder;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    .line 119
    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->storyId()Ljava/lang/String;

    move-result-object v4

    iget-object v6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v1, v8

    move-object v2, p2

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator$InstantBonusTileClickListener;-><init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/lookbooks/InstantBonusAwarder;Ljava/lang/String;Landroid/widget/ProgressBar;Lcom/shopkick/app/logging/UserEventLogger;)V

    .line 117
    invoke-virtual {v0, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    :goto_0
    const v0, 0x7f090326

    .line 126
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 129
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method public setStoryProxy(Lcom/shopkick/app/stories/StoryProxy;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    return-void
.end method

.method public setTileHeight(Ljava/lang/Integer;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->tileHeight:Ljava/lang/Integer;

    return-void
.end method
