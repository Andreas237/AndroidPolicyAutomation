.class public Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;
.source "FavoriteRetailersSSCardViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;
.implements Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;
.implements Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;",
        "Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;"
    }
.end annotation


# instance fields
.field private final hsmvHorizModule:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

.field private row:Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;-><init>(Landroid/view/View;)V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->hsmvHorizModule:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    .line 35
    new-instance p1, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->initHorizScrollingModule()V

    return-void
.end method

.method private getIndex(Lcom/ibotta/android/apiandroid/content/ContentId;)I
    .locals 3

    const/4 v0, 0x0

    .line 111
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 112
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->getItem(I)I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result v2

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    return v0
.end method

.method private initHorizScrollingModule()V
    .locals 4

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->hsmvHorizModule:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setItemSpacing(I)V

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->hsmvHorizModule:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0701bb

    .line 45
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 46
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->hsmvHorizModule:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v3, v2, v1, v2, v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setListViewPadding(IIII)V

    .line 47
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->hsmvHorizModule:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    const v2, 0x7f060171

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBackgroundColor(I)V

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->hsmvHorizModule:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setTitleBarListener(Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;)V

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->hsmvHorizModule:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->bindViewEvents(Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;)V

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->hsmvHorizModule:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setListener(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V
    .locals 1

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->row:Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;

    .line 58
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;

    .line 60
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->hsmvHorizModule:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 61
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->hsmvHorizModule:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/find/holder/-$$Lambda$lNddZEahCWqPUs4Qub-KAhn5xhg;

    invoke-direct {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/find/holder/-$$Lambda$lNddZEahCWqPUs4Qub-KAhn5xhg;-><init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->setListener(Lcom/ibotta/android/views/util/VisibilityListener;)V

    .line 62
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->getListViewState()Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->updateViewState(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;)V

    return-void
.end method

.method public onBottomButtonClicked()V
    .locals 0

    return-void
.end method

.method public onItemsVisible(Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->row:Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;

    if-nez v0, :cond_0

    goto :goto_1

    .line 93
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 94
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->row:Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->getListViewState()Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/horiz/RetailerSSCardListViewState;->getItems()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_2

    goto :goto_0

    .line 98
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->row:Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->getListViewState()Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/horiz/RetailerSSCardListViewState;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;->getContentId()Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object v1

    .line 99
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->row:Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v2, v3, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;->onSubListContentVisible(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)V

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 3

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->row:Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 68
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->getIndex(Lcom/ibotta/android/apiandroid/content/ContentId;)I

    move-result v2

    invoke-interface {v0, v1, p1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;->onTrackRetailerClicked(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)V

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;->onFavoriteRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    :cond_0
    return-void
.end method

.method public onTitleMenuClicked()V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 83
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;->onTitleMenuClicked()V

    :cond_0
    return-void
.end method

.method public onTitleMenuItemClicked(Lcom/ibotta/api/model/base/Actionable;)V
    .locals 0

    .line 75
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;

    if-eqz p1, :cond_0

    .line 76
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;->onManageFavoritesClicked()V

    :cond_0
    return-void
.end method
