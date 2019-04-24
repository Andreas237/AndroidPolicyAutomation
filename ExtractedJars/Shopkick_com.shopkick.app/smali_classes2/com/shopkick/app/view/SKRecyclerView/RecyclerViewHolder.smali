.class public Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "RecyclerViewHolder.java"


# instance fields
.field private idToViewMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/adapter/ViewId;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 23
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 24
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->idToViewMap:Ljava/util/HashMap;

    .line 25
    invoke-direct {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->mapIdsToViews(Landroid/view/View;)V

    return-void
.end method

.method private mapIdsToViews(Landroid/view/View;)V
    .locals 3

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 31
    iget-object v1, p0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->idToViewMap:Ljava/util/HashMap;

    new-instance v2, Lcom/shopkick/app/adapter/ViewId;

    invoke-direct {v2, v0}, Lcom/shopkick/app/adapter/ViewId;-><init>(I)V

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 35
    check-cast p1, Landroid/view/ViewGroup;

    .line 36
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 38
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 39
    invoke-direct {p0, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->mapIdsToViews(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public getFrameLayout(I)Landroid/widget/FrameLayout;
    .locals 0

    .line 60
    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    return-object p1
.end method

.method public getImageView(I)Landroid/widget/ImageView;
    .locals 0

    .line 49
    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    return-object p1
.end method

.method public getSKButton(I)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 57
    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    return-object p1
.end method

.method public getTextView(I)Landroid/widget/TextView;
    .locals 0

    .line 53
    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    return-object p1
.end method

.method public getTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-object v0
.end method

.method public getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;
    .locals 0

    .line 63
    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/UserEventImageView;

    return-object p1
.end method

.method public getView(I)Landroid/view/View;
    .locals 2

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->idToViewMap:Ljava/util/HashMap;

    new-instance v1, Lcom/shopkick/app/adapter/ViewId;

    invoke-direct {v1, p1}, Lcom/shopkick/app/adapter/ViewId;-><init>(I)V

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method public setTileInfo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method
