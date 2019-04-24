.class public Lcom/shopkick/app/tileViewHolderConfigurators/FTUEStoreDetailsLessonVideoTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalLookbookTileViewHolderConfigurator;
.source "FTUEStoreDetailsLessonVideoTileViewHolderConfigurator.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/video/VideoController;)V
    .locals 0

    .line 20
    invoke-direct/range {p0 .. p5}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalLookbookTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/video/VideoController;)V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01c8

    return v0
.end method

.method protected updateLayout(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 7

    .line 30
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalLookbookTileViewHolderConfigurator;->updateLayout(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    const v0, 0x7f090802

    .line 33
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f0907fd

    .line 34
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    .line 35
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FTUEStoreDetailsLessonVideoTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const v5, 0x7f0f0012

    invoke-virtual {v2, v5, v3, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    .line 38
    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FTUEStoreDetailsLessonVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    .line 39
    invoke-virtual {v2, v3}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FTUEStoreDetailsLessonVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    .line 40
    invoke-virtual {v2, p2}, Lcom/shopkick/app/video/VideoController;->isVideoOnProcessingAward(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 41
    :cond_0
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 42
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 43
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0600c6

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    return-void
.end method
