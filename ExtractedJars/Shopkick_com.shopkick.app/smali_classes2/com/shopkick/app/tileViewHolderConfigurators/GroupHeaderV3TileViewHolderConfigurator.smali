.class public Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV3TileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderViewHolderConfigurator;
.source "GroupHeaderV3TileViewHolderConfigurator.java"


# static fields
.field public static final LAYOUT_VERSION_SHOW_NEW:I = 0x1


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;)V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01a6

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 24
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 27
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    const v1, 0x7f090656

    if-eqz v0, :cond_0

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 28
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method
