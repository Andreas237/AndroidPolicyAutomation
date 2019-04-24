.class public Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "HorizontalProgrammaticVideoTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator$FullScreenClickListener;
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private videoController:Lcom/shopkick/app/video/VideoController;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/video/VideoController;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 31
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 32
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;->context:Landroid/content/Context;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    return-object p0
.end method

.method private setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 152
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x174

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 153
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 154
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHorizontalListDataPos(Ljava/lang/Integer;)V

    .line 155
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWidgetId(Ljava/lang/String;)V

    .line 156
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoRequestId:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 157
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoRequestId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setRequestId(Ljava/lang/String;)V

    .line 160
    :cond_0
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 161
    invoke-virtual {p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 162
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 163
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 164
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 165
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATLookbookEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 166
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object p2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    const/4 p2, 0x1

    .line 167
    iput-boolean p2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->useZMoatIID:Z

    .line 170
    :cond_1
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, v0, p2, v1}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00e0

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 42
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_1

    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v5

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v4

    .line 43
    :goto_1
    iget-object v6, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 45
    invoke-direct/range {p0 .. p2}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    const v7, 0x7f090801

    .line 47
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v7

    const v8, 0x7f09052c

    .line 48
    invoke-virtual {v1, v8}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    const v9, 0x7f090802

    .line 49
    invoke-virtual {v1, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v9

    const v10, 0x7f0902cc

    .line 50
    invoke-virtual {v1, v10}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v10

    .line 53
    invoke-virtual {v7}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v11

    .line 54
    instance-of v12, v11, Landroid/graphics/drawable/LayerDrawable;

    if-eqz v12, :cond_4

    .line 55
    check-cast v11, Landroid/graphics/drawable/LayerDrawable;

    const v12, 0x7f09079b

    .line 56
    invoke-virtual {v11, v12}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    move-result-object v12

    check-cast v12, Landroid/graphics/drawable/GradientDrawable;

    const v13, 0x7f090099

    .line 57
    invoke-virtual {v11, v13}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    check-cast v11, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v12, :cond_4

    if-eqz v11, :cond_4

    const v13, 0x7f06010e

    .line 61
    invoke-virtual {v6, v13}, Landroid/content/res/Resources;->getColor(I)I

    move-result v13

    const v14, 0x7f06010f

    .line 62
    invoke-virtual {v6, v14}, Landroid/content/res/Resources;->getColor(I)I

    move-result v14

    if-nez v3, :cond_3

    .line 67
    iget-object v13, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    invoke-static {v13}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v13

    if-nez v13, :cond_2

    .line 70
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    long-to-double v13, v13

    const-wide v15, 0x408f400000000000L    # 1000.0

    div-double/2addr v13, v15

    invoke-static {v13, v14}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    const-wide/16 v15, 0xa

    rem-long/2addr v13, v15

    long-to-int v13, v13

    .line 71
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v14

    add-int/2addr v14, v13

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    iput-object v13, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    .line 73
    :cond_2
    iget-object v13, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    rem-int/lit8 v13, v13, 0x5

    packed-switch v13, :pswitch_data_0

    const v13, 0x7f06010b

    .line 96
    invoke-virtual {v6, v13}, Landroid/content/res/Resources;->getColor(I)I

    move-result v13

    const v14, 0x7f06010d

    .line 97
    invoke-virtual {v6, v14}, Landroid/content/res/Resources;->getColor(I)I

    move-result v14

    goto :goto_2

    :pswitch_0
    const v13, 0x7f060116

    .line 90
    invoke-virtual {v6, v13}, Landroid/content/res/Resources;->getColor(I)I

    move-result v13

    const v14, 0x7f060117

    .line 91
    invoke-virtual {v6, v14}, Landroid/content/res/Resources;->getColor(I)I

    move-result v14

    goto :goto_2

    :pswitch_1
    const v13, 0x7f060114

    .line 85
    invoke-virtual {v6, v13}, Landroid/content/res/Resources;->getColor(I)I

    move-result v13

    const v14, 0x7f060115

    .line 86
    invoke-virtual {v6, v14}, Landroid/content/res/Resources;->getColor(I)I

    move-result v14

    goto :goto_2

    :pswitch_2
    const v13, 0x7f060112

    .line 80
    invoke-virtual {v6, v13}, Landroid/content/res/Resources;->getColor(I)I

    move-result v13

    const v14, 0x7f060113

    .line 81
    invoke-virtual {v6, v14}, Landroid/content/res/Resources;->getColor(I)I

    move-result v14

    goto :goto_2

    :pswitch_3
    const v13, 0x7f060110

    .line 75
    invoke-virtual {v6, v13}, Landroid/content/res/Resources;->getColor(I)I

    move-result v13

    const v14, 0x7f060111

    .line 76
    invoke-virtual {v6, v14}, Landroid/content/res/Resources;->getColor(I)I

    move-result v14

    .line 102
    :cond_3
    :goto_2
    invoke-virtual {v12, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 103
    invoke-virtual {v11, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    :cond_4
    const/16 v11, 0x8

    .line 108
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setVisibility(I)V

    .line 109
    invoke-virtual {v8, v11}, Landroid/view/View;->setVisibility(I)V

    .line 110
    invoke-virtual {v10, v11}, Landroid/view/View;->setVisibility(I)V

    .line 112
    iget-object v12, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    invoke-static {v12}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_6

    iget-object v12, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-static {v12}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_6

    .line 115
    iget-object v12, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    const-string v13, "^[0-9]+$"

    invoke-virtual {v12, v13}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 116
    iget-object v12, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    const v13, 0x7f0f0012

    .line 117
    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v4, v5

    invoke-virtual {v6, v13, v12, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    .line 120
    :cond_5
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    .line 122
    :goto_3
    invoke-virtual {v9, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_6
    if-eqz v3, :cond_7

    const v2, 0x3e99999a    # 0.3f

    .line 128
    invoke-virtual {v7, v2}, Landroid/widget/ImageView;->setAlpha(F)V

    const v2, 0x7f080316

    .line 129
    invoke-virtual {v7, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    const v2, 0x7f0600c6

    .line 130
    invoke-virtual {v6, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 131
    invoke-virtual {v8, v11}, Landroid/view/View;->setVisibility(I)V

    .line 132
    invoke-virtual {v10, v5}, Landroid/view/View;->setVisibility(I)V

    .line 133
    iget-object v2, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 136
    iget-object v1, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    :cond_7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 139
    invoke-virtual {v7, v3}, Landroid/widget/ImageView;->setAlpha(F)V

    const v3, 0x7f080315

    .line 140
    invoke-virtual {v7, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    const v3, 0x7f060120

    .line 141
    invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v9, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 142
    invoke-virtual {v8, v5}, Landroid/view/View;->setVisibility(I)V

    .line 143
    invoke-virtual {v10, v11}, Landroid/view/View;->setVisibility(I)V

    .line 144
    iget-object v3, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const v4, 0x7f06015d

    invoke-virtual {v6, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 147
    iget-object v1, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    new-instance v3, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator$FullScreenClickListener;

    invoke-direct {v3, v0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator$FullScreenClickListener;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
