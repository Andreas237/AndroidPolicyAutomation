.class public Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "BonusesAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;,
        Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;",
        ">;",
        "Landroid/view/View$OnClickListener;"
    }
.end annotation


# instance fields
.field private bonusItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/BonusItem;",
            ">;"
        }
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->bonusItems:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/view/model/content/BonusItem;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->bonusItems:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/model/content/BonusItem;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->bonusItems:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;I)V
    .locals 2

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->bonusItems:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/view/model/content/BonusItem;

    .line 52
    iget-object v0, p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;->bvBonus:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    invoke-virtual {p2}, Lcom/ibotta/android/view/model/content/BonusItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/BonusModel;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->setBonusModel(Lcom/ibotta/api/model/BonusModel;)V

    .line 53
    iget-object v0, p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;->bvBonus:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->setTag(Ljava/lang/Object;)V

    .line 55
    invoke-virtual {p2}, Lcom/ibotta/android/view/model/content/BonusItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/model/BonusModel;

    invoke-interface {p2}, Lcom/ibotta/api/model/BonusModel;->isLocked()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 56
    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;->bvBonus:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->setEnabled(Z)V

    goto :goto_0

    .line 58
    :cond_0
    iget-object p2, p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;->bvBonus:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->setEnabled(Z)V

    .line 59
    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;->bvBonus:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    instance-of p2, p1, Landroid/view/View;

    if-nez p2, :cond_1

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;

    if-eqz v0, :cond_0

    .line 75
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/model/content/BonusItem;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;->onBonusClicked(Lcom/ibotta/android/view/model/content/BonusItem;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;
    .locals 0

    .line 43
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;-><init>(Landroid/content/Context;)V

    .line 45
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;

    invoke-direct {p1, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;)V

    return-object p1
.end method

.method public setBonusItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/BonusItem;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->bonusItems:Ljava/util/List;

    goto :goto_0

    .line 35
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->bonusItems:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 38
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;

    return-void
.end method
