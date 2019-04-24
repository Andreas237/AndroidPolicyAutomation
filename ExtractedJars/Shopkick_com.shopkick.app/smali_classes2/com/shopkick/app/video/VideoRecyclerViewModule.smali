.class public Lcom/shopkick/app/video/VideoRecyclerViewModule;
.super Ljava/lang/Object;
.source "VideoRecyclerViewModule.java"

# interfaces
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;


# static fields
.field private static final VIDEO_VIEWABLE_PERCENTAGE:F = 0.2f


# instance fields
.field private listTopSpacingInPixel:I

.field private videoController:Lcom/shopkick/app/video/VideoController;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/video/VideoController;Landroid/content/Context;I)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->listTopSpacingInPixel:I

    .line 24
    iput-object p1, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 25
    invoke-static {p3, p2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->listTopSpacingInPixel:I

    return-void
.end method


# virtual methods
.method public maybeStartVideoTile(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 12

    if-nez p1, :cond_0

    return-void

    .line 34
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->isHardwareAccelerated()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 36
    :cond_1
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result v0

    .line 37
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findLastVisibleItemPosition()I

    move-result v1

    .line 38
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getHeight()I

    move-result v2

    .line 39
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    if-ltz v0, :cond_11

    if-ltz v1, :cond_11

    .line 41
    invoke-virtual {v3}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemCount()I

    move-result v4

    if-lt v1, v4, :cond_2

    goto/16 :goto_7

    .line 45
    :cond_2
    iget-object v4, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v4}, Lcom/shopkick/app/video/VideoController;->isInPlayableConnection()Z

    move-result v4

    if-eqz v4, :cond_10

    .line 49
    iget-object v4, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v4}, Lcom/shopkick/app/video/VideoController;->getLastConfiguredVideoId()Ljava/lang/String;

    move-result-object v4

    .line 50
    iget-object v5, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v5, v4}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    iget-object v5, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v5, v4}, Lcom/shopkick/app/video/VideoController;->isVideoOnProcessingAward(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 53
    :cond_3
    iget-object v5, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v5}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 54
    iget-object v5, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v5, v4}, Lcom/shopkick/app/video/VideoController;->isVideoOnProcessingAward(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    return-void

    :cond_4
    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    move v4, v0

    :goto_0
    if-gt v4, v1, :cond_e

    .line 61
    invoke-virtual {v3, v4}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemViewType(I)I

    move-result v7

    const/16 v8, 0x2d

    const/4 v9, 0x1

    if-eq v7, v8, :cond_5

    .line 62
    invoke-virtual {v3, v4}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemViewType(I)I

    move-result v7

    const/16 v8, 0x34

    if-ne v7, v8, :cond_c

    .line 66
    :cond_5
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findViewHolderForAdapterPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v5, :cond_b

    .line 68
    iget-object v7, v5, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    if-eqz v7, :cond_b

    .line 69
    invoke-virtual {v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v7

    if-eqz v7, :cond_b

    invoke-virtual {v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v7

    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    if-eqz v7, :cond_b

    iget-object v7, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 70
    invoke-virtual {v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v8

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v7, v8}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_b

    .line 71
    iget-object v7, v5, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const v8, 0x7f09080d

    if-eq v4, v0, :cond_7

    if-ne v4, v1, :cond_6

    goto :goto_1

    .line 93
    :cond_6
    iget-object v6, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v7

    .line 94
    invoke-virtual {v5, v8}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    .line 93
    invoke-virtual {v6, v7, v5}, Lcom/shopkick/app/video/VideoController;->setupVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/ViewGroup;)Z

    .line 95
    iget-object v5, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v5}, Lcom/shopkick/app/video/VideoController;->playVideo()V

    move v5, v9

    move v6, v5

    goto :goto_5

    .line 73
    :cond_7
    :goto_1
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v10

    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getPaddingTop()I

    move-result v11

    sub-int/2addr v10, v11

    iget v11, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->listTopSpacingInPixel:I

    sub-int/2addr v10, v11

    .line 74
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v7

    if-ne v4, v0, :cond_8

    add-int/2addr v10, v7

    goto :goto_2

    .line 76
    :cond_8
    iget v11, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->listTopSpacingInPixel:I

    sub-int v11, v2, v11

    sub-int v10, v11, v10

    :goto_2
    if-lez v10, :cond_a

    int-to-float v10, v10

    int-to-float v7, v7

    div-float/2addr v10, v7

    const v7, 0x3e4ccccd    # 0.2f

    cmpg-float v7, v10, v7

    if-gez v7, :cond_9

    goto :goto_3

    .line 85
    :cond_9
    iget-object v6, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v7

    .line 86
    invoke-virtual {v5, v8}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    .line 85
    invoke-virtual {v6, v7, v5}, Lcom/shopkick/app/video/VideoController;->setupVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/ViewGroup;)Z

    .line 87
    iget-object v5, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v5}, Lcom/shopkick/app/video/VideoController;->playVideo()V

    move v6, v9

    goto :goto_4

    .line 82
    :cond_a
    :goto_3
    iget-object v5, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v5}, Lcom/shopkick/app/video/VideoController;->pauseVideo()V

    :goto_4
    move v5, v9

    goto :goto_5

    :cond_b
    move v5, v9

    :cond_c
    :goto_5
    if-eqz v6, :cond_d

    goto :goto_6

    :cond_d
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_e
    :goto_6
    if-eqz v5, :cond_f

    if-nez v6, :cond_10

    .line 108
    :cond_f
    iget-object p1, p0, Lcom/shopkick/app/video/VideoRecyclerViewModule;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->pauseVideo()V

    :cond_10
    return-void

    :cond_11
    :goto_7
    return-void
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    .line 119
    invoke-virtual {p0, p1}, Lcom/shopkick/app/video/VideoRecyclerViewModule;->maybeStartVideoTile(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method
