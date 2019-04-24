.class public Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalLookbookTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;
.source "HorizontalLookbookTileViewHolderConfigurator.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/video/VideoController;)V
    .locals 0

    .line 23
    invoke-direct/range {p0 .. p5}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/video/VideoController;)V

    const/16 p1, 0xa8

    .line 26
    iput p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalLookbookTileViewHolderConfigurator;->viewWidth:I

    const/16 p1, 0x98

    .line 27
    iput p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalLookbookTileViewHolderConfigurator;->imageWidth:I

    const/16 p1, 0x55

    .line 28
    iput p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalLookbookTileViewHolderConfigurator;->imageHeight:I

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00db

    return v0
.end method

.method protected updateLayout(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 38
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;->updateLayout(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    const v0, 0x7f0906c4

    .line 40
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 42
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p2, 0x0

    .line 44
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/16 p2, 0x8

    .line 46
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method
