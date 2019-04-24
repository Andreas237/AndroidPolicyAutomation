.class public Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "StoryCardLargeVideoTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator$FullScreenClickListener;
    }
.end annotation


# static fields
.field public static final CARD_TO_SCREEN_EDGE_SPACING:I = 0x16

.field public static final CARD_TO_SCREEN_TOP_SPACING:I = 0xf

.field public static final STORY_CARD_HEIGHT:I = 0x182

.field public static final STORY_CARD_WIDTH:I = 0x114


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

.field private videoController:Lcom/shopkick/app/video/VideoController;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/storycards/StoryCardDataSource;Lcom/shopkick/app/account/AgeVerificationController;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 56
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    .line 57
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    return-object p0
.end method

.method private createClientLog(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 1

    .line 247
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0, p1, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 248
    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStoryCardId(Ljava/lang/String;)V

    .line 249
    invoke-virtual {v0, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHorizontalListDataPos(Ljava/lang/Integer;)V

    .line 250
    invoke-virtual {v0, p5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    return-object v0
.end method

.method private createOptionalSetupParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;
    .locals 2

    .line 255
    new-instance v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v0}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 256
    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 257
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 258
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    return-object v0
.end method

.method private setupFrontButtons(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    const p2, 0x7f0905f6

    .line 208
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object p2

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    const p2, 0x7f0907e8

    .line 209
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 11

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x3

    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v2, 0x7f09080d

    .line 64
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    invoke-virtual {v3, v0}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    const/16 v0, 0xcb

    .line 66
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->storyCardId:Ljava/lang/String;

    .line 68
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-object v7, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    iget-object v8, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    move-object v3, p0

    .line 66
    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->createClientLog(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v1

    .line 72
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->createOptionalSetupParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object v3

    .line 73
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v4, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 74
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATLookbookEnabled()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 75
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object v4, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    const/4 v4, 0x1

    .line 76
    iput-boolean v4, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->useZMoatIID:Z

    .line 79
    :cond_0
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v1, v4, v3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 84
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-object v7, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->storyCardId:Ljava/lang/String;

    const/4 v0, 0x4

    .line 86
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget-object v9, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    iget-object v10, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    move-object v5, p0

    .line 84
    invoke-direct/range {v5 .. v10}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->createClientLog(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v0

    .line 89
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/account/AgeVerificationController;->getAgeVerificationStatus(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMinimumAgeEligibility(Ljava/lang/Integer;)V

    .line 91
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->createOptionalSetupParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object p2

    const v1, 0x7f090805

    .line 93
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0, v1, p2}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private updateSaveButton(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 13

    const v0, 0x7f0905f6

    .line 213
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    .line 215
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->storyCardId:Ljava/lang/String;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/storycards/StoryCardDataSource;->getSaveStateForItem(Ljava/lang/String;Z)Z

    move-result v1

    const/16 v2, 0xf

    const/16 v3, 0x10

    if-eqz v1, :cond_0

    const v1, 0x7f08019e

    .line 216
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    const/4 v1, 0x4

    move v4, v2

    goto :goto_0

    :cond_0
    const v1, 0x7f08019f

    .line 220
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    const/4 v1, 0x3

    move v4, v3

    .line 224
    :goto_0
    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lcom/shopkick/app/util/NumberFormatter;->formatSaveCount(Ljava/lang/Long;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 225
    invoke-virtual {v0, v6}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 226
    new-instance v5, Lcom/shopkick/app/util/CommonClickUtils$StoryCardSaveClickListener;

    iget-object v6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    invoke-direct {v5, v6, p2}, Lcom/shopkick/app/util/CommonClickUtils$StoryCardSaveClickListener;-><init>(Lcom/shopkick/app/storycards/StoryCardDataSource;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {v0, v5}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 229
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget-object v9, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->storyCardId:Ljava/lang/String;

    .line 231
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v11, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    iget-object v12, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    move-object v7, p0

    .line 229
    invoke-direct/range {v7 .. v12}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->createClientLog(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p2

    .line 234
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->createOptionalSetupParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object p1

    .line 235
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p2, v1, p1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 236
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 237
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKButton;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f090806

    .line 202
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01d1

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f090806

    .line 194
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f090434

    .line 196
    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->getHideViewRequestListener(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)Lcom/bumptech/glide/request/RequestListener;

    move-result-object v1

    .line 197
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 8

    .line 139
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 140
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->setupFrontButtons(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 143
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-nez v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoController;->setVideoPlayCompleted(Ljava/lang/String;)V

    :cond_0
    const v0, 0x7f090806

    .line 147
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventImageView;

    const/4 v1, 0x0

    .line 148
    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 149
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    const v1, 0x7f090434

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-eqz v0, :cond_1

    .line 150
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 152
    :cond_1
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    const v0, 0x7f090809

    .line 156
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    const v0, 0x7f09052e

    .line 159
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    .line 160
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 161
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lez v1, :cond_2

    .line 162
    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f0f0046

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 164
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    iget-object v7, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    aput-object v7, v6, v2

    .line 163
    invoke-virtual {v1, v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 162
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 167
    :cond_2
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 171
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoController;->isVideoOnProcessingAward(Ljava/lang/String;)Z

    move-result v0

    const v1, 0x7f0905af

    .line 172
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    if-eqz v0, :cond_3

    move v4, v2

    goto :goto_2

    :cond_3
    move v4, v3

    :goto_2
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f09052c

    .line 173
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    move v2, v3

    :goto_3
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    const v1, 0x7f09080d

    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v0, p2, v1}, Lcom/shopkick/app/video/VideoController;->setupVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/ViewGroup;)Z

    .line 177
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 180
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    const v0, 0x7f090805

    .line 183
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator$FullScreenClickListener;

    invoke-direct {v2, p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator$FullScreenClickListener;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-direct {v0, v1, p2, v2}, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;-><init>(Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View$OnClickListener;)V

    .line 184
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;
    .locals 11

    .line 109
    invoke-super {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    move-result-object p1

    .line 111
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 112
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v2, v1, Landroid/util/DisplayMetrics;->density:F

    .line 113
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result v1

    int-to-float v3, v1

    .line 114
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/FrameConfigurator;->screenHeightWithoutStatusBar(Landroid/content/Context;)I

    move-result v1

    int-to-float v4, v1

    const/16 v5, 0x114

    const/16 v6, 0x182

    const/16 v7, 0x16

    const/16 v8, 0xf

    const/16 v9, 0x16

    const/16 v10, 0xf

    .line 112
    invoke-static/range {v2 .. v10}, Lcom/shopkick/app/util/FrameConfigurator;->getMaxScaleFactor(FFFIIIIII)F

    move-result v1

    const v2, 0x7f0907fe

    .line 123
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v1, v3}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithScaleFactor(Landroid/view/View;FZ)V

    const v2, 0x7f09080d

    .line 124
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v1, v3}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithScaleFactor(Landroid/view/View;FZ)V

    const/4 v2, 0x1

    .line 127
    invoke-static {v0, v1, v2}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithScaleFactor(Landroid/view/View;FZ)V

    .line 128
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 129
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 130
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 129
    invoke-static {v3, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->getTileHeight(FF)F

    move-result v1

    float-to-int v1, v1

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 132
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p1
.end method
