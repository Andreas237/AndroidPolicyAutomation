.class public Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;
.super Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;
.source "KicksActivityAggregatedReceiptViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator$ReceiptDetailsOnClickListener;
    }
.end annotation


# static fields
.field private static final IMG_DIMENSION:I = 0x24

.field private static final LOG_TAG:Ljava/lang/String; = "Aggregated Receipt Tile"

.field private static final RADIUS:I = 0x3


# instance fields
.field private link:Ljava/lang/String;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;)Lcom/shopkick/app/url/URLDispatcher;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-object p0
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00f5

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    if-eqz p2, :cond_1

    .line 90
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f09036b

    .line 94
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x24

    .line 95
    invoke-static {v1, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    const/4 v2, 0x5

    .line 96
    invoke-static {v2, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    .line 97
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->override(I)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    new-instance p2, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-direct {p2, v2}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->transform(Lcom/bumptech/glide/load/Transformation;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 7

    .line 51
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 52
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;->updateKicksCountUi(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 53
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;->link:Ljava/lang/String;

    const v0, 0x7f09002d

    .line 54
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    .line 55
    new-instance v1, Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator$ReceiptDetailsOnClickListener;

    iget-object v2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;->link:Ljava/lang/String;

    invoke-direct {v1, p0, v2}, Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator$ReceiptDetailsOnClickListener;-><init>(Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f09036a

    .line 56
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f090368

    .line 57
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    const v3, 0x7f09036c

    .line 58
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/widget/SKTextView;

    const v4, 0x7f09036d

    .line 59
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/widget/SKTextView;

    const v5, 0x7f09036e

    .line 60
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    .line 62
    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x37

    if-ne v5, v6, :cond_0

    .line 63
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    .line 64
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0600c5

    .line 65
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 63
    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 66
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0600c8

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v3, v2}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v4, v2}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 69
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    goto :goto_0

    .line 70
    :cond_0
    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x36

    if-ne v5, v6, :cond_1

    const/4 v5, -0x1

    .line 71
    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 72
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0600ca

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f060022

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v3, v2}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 74
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v4, v2}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 75
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 78
    :cond_1
    :goto_0
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->flagText:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0x8

    .line 79
    invoke-virtual {v1, p1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    goto :goto_1

    .line 81
    :cond_2
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->flagText:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 82
    invoke-virtual {v1, p1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    :goto_1
    return-void
.end method
