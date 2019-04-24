.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;
.source "FeaturedBonusesViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;
.implements Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;",
        "Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;"
    }
.end annotation


# instance fields
.field private bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

.field private hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

.field private listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

.field private row:Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V
    .locals 2

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;-><init>(Landroid/view/View;)V

    .line 23
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f0600fc

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBackgroundColor(I)V

    .line 32
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;)V

    return-void
.end method

.method private getIndex(Lcom/ibotta/api/model/BonusModel;)I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 81
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->getItemCount()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 82
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->getItem(I)Lcom/ibotta/android/view/model/content/BonusItem;

    move-result-object v2

    if-ne v2, p1, :cond_0

    move v0, v1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v0
.end method

.method public static synthetic lambda$bind$0(Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;Z)V
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setVisibilityScrollTrackingEnabled(Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V
    .locals 0

    .line 19
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V
    .locals 1

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

    .line 39
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/-$$Lambda$FeaturedBonusesViewHolder$5WxFrkqUB-DnEhVfEyQHT-aGpf0;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/-$$Lambda$FeaturedBonusesViewHolder$5WxFrkqUB-DnEhVfEyQHT-aGpf0;-><init>(Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;)V

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->setListener(Lcom/ibotta/android/views/util/VisibilityListener;)V

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;

    .line 42
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->getBonusItems()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->setBonusItems(Ljava/util/List;)V

    .line 43
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 44
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 45
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setListener(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;)V

    return-void
.end method

.method public onBonusClicked(Lcom/ibotta/android/view/model/content/BonusItem;)V
    .locals 3

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

    if-eqz v0, :cond_0

    .line 51
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/BonusItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/BonusModel;

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/BonusItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/BonusModel;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->getIndex(Lcom/ibotta/api/model/BonusModel;)I

    move-result p1

    invoke-interface {v0, v1, v2, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;->onSubListBonusClicked(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;Lcom/ibotta/api/model/BonusModel;I)V

    :cond_0
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

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;

    if-nez v0, :cond_0

    goto :goto_1

    .line 61
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

    .line 62
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->getBonusItems()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_2

    goto :goto_0

    .line 66
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->getBonusItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/view/model/content/BonusItem;

    invoke-virtual {v1}, Lcom/ibotta/android/view/model/content/BonusItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/BonusModel;

    if-eqz v1, :cond_1

    .line 68
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v2, v3, v1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;->onSubListContentVisible(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;Lcom/ibotta/api/model/BonusModel;I)V

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_1
    return-void
.end method
