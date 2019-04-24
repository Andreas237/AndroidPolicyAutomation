.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;
.source "TeamworkBonusesViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;"
    }
.end annotation


# instance fields
.field private bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

.field private hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

.field private listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V
    .locals 2

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;-><init>(Landroid/view/View;)V

    .line 19
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f0600fc

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBackgroundColor(I)V

    .line 27
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V
    .locals 1

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

    .line 34
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;->getBonusItems()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->setBonusItems(Ljava/util/List;)V

    .line 36
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 37
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public onBonusClicked(Lcom/ibotta/android/view/model/content/BonusItem;)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

    if-eqz v0, :cond_0

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/BonusItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;->onBonusClicked(Lcom/ibotta/api/model/BonusModel;)V

    :cond_0
    return-void
.end method
