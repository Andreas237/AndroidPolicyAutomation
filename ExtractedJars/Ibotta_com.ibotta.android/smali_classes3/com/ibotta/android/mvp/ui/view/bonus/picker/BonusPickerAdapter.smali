.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "BonusPickerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private factory:Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory;

.field private listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 18
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->rows:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->getType()I

    move-result p1

    return p1
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;I)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onViewAttachedToWindow(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->onViewAttachedToWindow(Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;)V

    return-void
.end method

.method public onViewAttachedToWindow(Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;)V
    .locals 0

    .line 58
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView$Adapter;->onViewAttachedToWindow(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;->onViewAttachedToWindow()V

    return-void
.end method

.method public bridge synthetic onViewDetachedFromWindow(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->onViewDetachedFromWindow(Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;)V
    .locals 0

    .line 64
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;->onViewDetachedToWindow()V

    .line 65
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView$Adapter;->onViewDetachedFromWindow(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 30
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 33
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->notifyDataSetChanged()V

    return-void
.end method
