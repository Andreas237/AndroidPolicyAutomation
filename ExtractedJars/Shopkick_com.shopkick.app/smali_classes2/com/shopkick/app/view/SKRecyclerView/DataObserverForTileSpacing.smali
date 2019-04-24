.class public Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;
.super Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;
.source "DataObserverForTileSpacing.java"


# static fields
.field public static final TILE_SPACING:I = 0x5


# instance fields
.field private dividerItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

.field private extraSpacing:I

.field private extraSpacingTileTypes:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private tileTypes:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/util/Collection;Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;Ljava/util/Collection;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    .line 41
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 43
    iput-object p3, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->dividerItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    .line 44
    iput-object p2, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->tileTypes:Ljava/util/Collection;

    .line 45
    iput-object p4, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->extraSpacingTileTypes:Ljava/util/Collection;

    .line 46
    iput p5, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->extraSpacing:I

    return-void
.end method

.method private updateDecorator(I)V
    .locals 5

    const/4 v0, 0x0

    .line 51
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 54
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemCount()I

    move-result v0

    if-ge p1, v0, :cond_7

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->dividerItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->removeRule(I)V

    .line 57
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemViewType(I)I

    move-result v0

    .line 59
    iget-object v1, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->tileTypes:Ljava/util/Collection;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 60
    iget-object v1, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->dividerItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    const/4 v3, 0x5

    invoke-direct {v2, p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    if-lez p1, :cond_0

    .line 64
    iget-object v1, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->dividerItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    add-int/lit8 v4, p1, -0x1

    invoke-direct {v2, v4, v3}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    .line 68
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->extraSpacingTileTypes:Ljava/util/Collection;

    if-eqz v1, :cond_6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x10

    const/16 v2, 0x35

    if-eq v0, v1, :cond_3

    const/16 v1, 0x16

    if-eq v0, v1, :cond_3

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_3

    if-eq v0, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    if-le p1, v0, :cond_2

    .line 71
    iget-object v1, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    add-int/lit8 v3, p1, -0x2

    .line 72
    invoke-virtual {v1, v3}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemViewType(I)I

    move-result v1

    if-ne v1, v2, :cond_2

    .line 74
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->dividerItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    new-instance v1, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    iget v2, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->extraSpacing:I

    invoke-direct {v1, p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    goto :goto_1

    .line 76
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->dividerItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    iget v3, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->extraSpacing:I

    invoke-direct {v2, p1, v3, v0}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(IIZ)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    goto :goto_1

    :cond_3
    if-gtz p1, :cond_4

    goto :goto_1

    .line 85
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemViewType(I)I

    move-result v0

    const/16 v3, 0x2b

    if-eq v0, v3, :cond_6

    if-ne v0, v2, :cond_5

    goto :goto_1

    .line 91
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->dividerItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    iget v3, p0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->extraSpacing:I

    invoke-direct {v2, v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {v0, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    :cond_6
    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto/16 :goto_0

    :cond_7
    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 0

    return-void
.end method

.method public onItemRangeChanged(II)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->updateDecorator(I)V

    return-void
.end method

.method public onItemRangeChanged(IILjava/lang/Object;)V
    .locals 0

    .line 109
    invoke-direct {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->updateDecorator(I)V

    return-void
.end method

.method public onItemRangeInserted(II)V
    .locals 0

    .line 114
    invoke-direct {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->updateDecorator(I)V

    return-void
.end method

.method public onItemRangeMoved(III)V
    .locals 0

    .line 124
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->updateDecorator(I)V

    return-void
.end method

.method public onItemRangeRemoved(II)V
    .locals 0

    .line 119
    invoke-direct {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;->updateDecorator(I)V

    return-void
.end method
