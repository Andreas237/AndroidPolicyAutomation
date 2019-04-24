.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusRowViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;
.source "BonusRowViewHolder.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;",
        ">;",
        "Landroid/view/View$OnClickListener;"
    }
.end annotation


# instance fields
.field private final bvBonus:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

.field private listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;)V
    .locals 1

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;-><init>(Landroid/view/View;)V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusRowViewHolder;->bvBonus:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    .line 25
    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_0

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V
    .locals 0

    .line 16
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusRowViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V
    .locals 2

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

    .line 32
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusRowViewHolder;->bvBonus:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0600fc

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->setProgressBackgroundColor(I)V

    .line 33
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusRowViewHolder;->bvBonus:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;->getBonusModel()Lcom/ibotta/api/model/BonusModel;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->setBonusModel(Lcom/ibotta/api/model/BonusModel;)V

    .line 34
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusRowViewHolder;->bvBonus:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;->getBonusModel()Lcom/ibotta/api/model/BonusModel;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->setTag(Ljava/lang/Object;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;

    if-eqz v0, :cond_0

    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;->onBonusClicked(Lcom/ibotta/api/model/BonusModel;)V

    :cond_0
    return-void
.end method
