.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/EmptyBonusViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;
.source "EmptyBonusViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/views/empty/EmptyViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/EmptyCompletedBonusesRow;",
        ">;",
        "Lcom/ibotta/android/views/empty/EmptyViewEvents;"
    }
.end annotation


# instance fields
.field private final evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;

.field private listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/empty/EmptyView;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;-><init>(Landroid/view/View;)V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/EmptyBonusViewHolder;->evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/EmptyCompletedBonusesRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/EmptyBonusViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/EmptyCompletedBonusesRow;Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/EmptyCompletedBonusesRow;Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V
    .locals 3

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/EmptyBonusViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

    .line 27
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/EmptyBonusViewHolder;->evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/views/empty/EmptyView;->bindViewEvents(Lcom/ibotta/android/views/empty/EmptyViewEvents;)V

    .line 29
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/EmptyBonusViewHolder;->evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;

    new-instance p2, Lcom/ibotta/android/views/empty/EmptyViewState;

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/views/empty/EmptyView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f1100b6

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/EmptyBonusViewHolder;->evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;

    .line 32
    invoke-virtual {v1}, Lcom/ibotta/android/views/empty/EmptyView;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f1102c2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f080206

    invoke-direct {p2, v2, v0, v1}, Lcom/ibotta/android/views/empty/EmptyViewState;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/empty/EmptyView;->updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V

    return-void
.end method

.method public onActionButtonClick()V
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/EmptyBonusViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

    if-eqz v0, :cond_0

    .line 38
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;->onFindRebatesClicked()V

    :cond_0
    return-void
.end method

.method public synthetic onEmptyViewClicked()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/empty/EmptyViewEvents$-CC;->$default$onEmptyViewClicked(Lcom/ibotta/android/views/empty/EmptyViewEvents;)V

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method
