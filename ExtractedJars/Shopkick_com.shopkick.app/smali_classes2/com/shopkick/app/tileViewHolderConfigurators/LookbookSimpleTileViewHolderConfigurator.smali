.class public Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "LookbookSimpleTileViewHolderConfigurator.java"


# static fields
.field private static final SHORT_LOOKBOOK_ORIGINAL_HEIGHT:I = 0xbe

.field private static final SHORT_LOOKBOOK_ORIGINAL_WIDTH:I = 0x140

.field private static final SIMPLE_LOOKBOOK_PADDING:I = 0xf

.field private static final TALL_LOOKBOOK_ORIGINAL_HEIGHT:I = 0x138

.field private static final TALL_LOOKBOOK_ORIGINAL_WIDTH:I = 0x10a


# instance fields
.field private appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private dispatcherRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/url/URLDispatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 46
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 47
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;->dispatcherRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private setupLookbookLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/logging/UserEventImageView;)V
    .locals 5

    .line 162
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0x7e

    .line 163
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 164
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStoryId(Ljava/lang/String;)V

    .line 165
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 166
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->tileGroupType:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTileGroupType(Ljava/lang/Integer;)V

    .line 168
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 169
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 170
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    .line 171
    iget-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    const-string v4, "ImageConstraintKey"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 173
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 174
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 175
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATLookbookEnabled()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    .line 176
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 177
    iput-boolean v4, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->useZMoatIID:Z

    .line 180
    :cond_0
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p3, v0, v3, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 183
    new-instance p3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p3, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 184
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {p3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStoryId(Ljava/lang/String;)V

    .line 185
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {p3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 186
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->tileGroupType:Ljava/lang/Integer;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTileGroupType(Ljava/lang/Integer;)V

    .line 188
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 189
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 190
    iput-boolean v4, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 191
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v0, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 192
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 194
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast p1, Lcom/shopkick/app/widget/UserEventFrameLayout;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, p3, v0, p2}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f090451

    .line 155
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01b5

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f090451

    .line 148
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f090434

    .line 149
    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;->getHideViewRequestListener(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)Lcom/bumptech/glide/request/RequestListener;

    move-result-object v1

    .line 150
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

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 61
    invoke-virtual/range {p0 .. p1}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    if-nez v2, :cond_0

    return-void

    :cond_0
    const v3, 0x7f090451

    .line 67
    invoke-virtual {v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/logging/UserEventImageView;

    .line 70
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->lookbookTileImageSize:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_1

    .line 71
    iget-object v6, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/16 v7, 0x10a

    const/16 v8, 0x138

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/16 v11, 0xf

    const/16 v12, 0xf

    invoke-static/range {v6 .. v12}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;IIIIII)V

    goto :goto_0

    .line 79
    :cond_1
    iget-object v13, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/16 v14, 0x140

    const/16 v15, 0xbe

    const/16 v16, 0xf

    const/16 v17, 0x0

    const/16 v18, 0xf

    const/16 v19, 0xf

    invoke-static/range {v13 .. v19}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;IIIIII)V

    .line 87
    :goto_0
    iget-object v4, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iget-object v5, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/16 v6, 0xf

    invoke-static {v6, v5}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v5

    iget-object v7, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 89
    invoke-static {v6, v7}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v7

    iget-object v8, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 90
    invoke-static {v6, v8}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v6

    const/4 v8, 0x0

    .line 87
    invoke-virtual {v4, v5, v8, v7, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 93
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->displayBackgroundImage:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const v5, 0x7f090578

    const v6, 0x7f0902ca

    const v7, 0x7f090455

    const v9, 0x7f090454

    const/16 v10, 0x8

    if-eqz v4, :cond_5

    .line 94
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v4

    iget-object v11, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    invoke-virtual {v1, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v4

    iget-object v11, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 98
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    if-eqz v4, :cond_3

    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    .line 101
    :cond_2
    invoke-virtual {v1, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 99
    :cond_3
    :goto_1
    invoke-virtual {v1, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 105
    :goto_2
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->flagText:Ljava/lang/String;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 106
    invoke-virtual {v1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    const v4, 0x7f090579

    .line 107
    invoke-virtual {v1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v4

    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->flagText:Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 109
    :cond_4
    invoke-virtual {v1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v10}, Landroid/view/View;->setVisibility(I)V

    .line 113
    :goto_3
    invoke-virtual {v1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 114
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 113
    invoke-static {v4, v5}, Lcom/shopkick/app/util/TileUtils;->setLookbookTileGradient(Landroid/view/View;I)V

    .line 115
    invoke-virtual {v1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 118
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/logging/UserEventImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto :goto_4

    .line 120
    :cond_5
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 121
    invoke-virtual {v1, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 122
    invoke-virtual {v1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v10}, Landroid/view/View;->setVisibility(I)V

    .line 123
    invoke-virtual {v1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v10}, Landroid/view/View;->setVisibility(I)V

    .line 126
    sget-object v4, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/logging/UserEventImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    :goto_4
    const/4 v4, 0x0

    .line 130
    invoke-virtual {v3, v4}, Lcom/shopkick/app/logging/UserEventImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const v4, 0x7f090434

    .line 131
    invoke-virtual {v1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 134
    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;->setupLookbookLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/logging/UserEventImageView;)V

    .line 137
    iget-object v1, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    new-instance v3, Lcom/shopkick/app/util/CommonClickUtils$SimpleLookbookClick;

    iget-object v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    iget-object v5, v0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;->dispatcherRef:Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v4, v5, v2}, Lcom/shopkick/app/util/CommonClickUtils$SimpleLookbookClick;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
