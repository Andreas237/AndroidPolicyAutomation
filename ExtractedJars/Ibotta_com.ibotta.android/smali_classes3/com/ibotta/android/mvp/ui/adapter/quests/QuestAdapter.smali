.class public Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "QuestAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;",
        ">;",
        "Landroid/view/View$OnClickListener;"
    }
.end annotation


# instance fields
.field private final bonusModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->bonusModels:Ljava/util/List;

    return-void
.end method

.method private getLayoutParams(Landroid/view/ViewGroup;)Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .line 55
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 56
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070193

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 57
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->bonusModels:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;I)V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->bonusModels:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/model/BonusModel;

    .line 48
    iget-object v0, p1, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;->questView:Lcom/ibotta/android/mvp/ui/view/quests/QuestView;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->setup(Lcom/ibotta/api/model/BonusModel;)V

    .line 49
    iget-object v0, p1, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;->questView:Lcom/ibotta/android/mvp/ui/view/quests/QuestView;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->setTag(Ljava/lang/Object;)V

    .line 50
    iget-object p2, p1, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;->questView:Lcom/ibotta/android/mvp/ui/view/quests/QuestView;

    instance-of v0, p2, Landroid/view/View;

    if-nez v0, :cond_0

    invoke-virtual {p2, p0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/view/View;

    invoke-static {p2, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 51
    :goto_0
    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;->questView:Lcom/ibotta/android/mvp/ui/view/quests/QuestView;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->listener:Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->setListener(Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->listener:Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;

    if-eqz v0, :cond_0

    .line 77
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;->onQuestClicked(Lcom/ibotta/api/model/BonusModel;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;
    .locals 1

    .line 38
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;-><init>(Landroid/content/Context;)V

    .line 39
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->getLayoutParams(Landroid/view/ViewGroup;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    new-instance p1, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;

    invoke-direct {p1, p2}, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/quests/QuestView;)V

    return-object p1
.end method

.method public setBonusModels(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->bonusModels:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->bonusModels:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->listener:Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;

    return-void
.end method
