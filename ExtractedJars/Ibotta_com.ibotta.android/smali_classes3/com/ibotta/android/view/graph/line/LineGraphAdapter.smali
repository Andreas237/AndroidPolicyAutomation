.class public Lcom/ibotta/android/view/graph/line/LineGraphAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "LineGraphAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;

.field private size:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 58
    iget v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphAdapter;->size:I

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0
    .param p1    # Landroid/support/v7/widget/RecyclerView$ViewHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 17
    check-cast p1, Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/view/graph/line/LineGraphAdapter;->onBindViewHolder(Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;I)V
    .locals 1
    .param p1    # Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphAdapter;->graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;

    invoke-static {p1, v0, p2}, Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;->access$000(Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;Lcom/ibotta/android/view/graph/GraphDataSet;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/view/graph/line/LineGraphAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 47
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c016f

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 48
    new-instance p2, Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;-><init>(Lcom/ibotta/android/view/graph/line/LineGraphAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public setGraphData(Lcom/ibotta/android/view/graph/GraphDataSet;)V
    .locals 5

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphAdapter;->graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;

    .line 25
    invoke-virtual {p1}, Lcom/ibotta/android/view/graph/GraphDataSet;->getDataSets()Ljava/util/List;

    move-result-object p1

    .line 28
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/view/graph/DataSet;

    .line 29
    invoke-virtual {v3}, Lcom/ibotta/android/view/graph/DataSet;->size()I

    move-result v4

    if-le v4, v2, :cond_0

    .line 30
    invoke-virtual {v3}, Lcom/ibotta/android/view/graph/DataSet;->size()I

    move-result v2

    goto :goto_0

    .line 34
    :cond_1
    iput v2, p0, Lcom/ibotta/android/view/graph/line/LineGraphAdapter;->size:I

    .line 36
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/graph/DataSet;

    .line 37
    :goto_1
    invoke-virtual {v0}, Lcom/ibotta/android/view/graph/DataSet;->size()I

    move-result v3

    if-ge v3, v2, :cond_2

    const/4 v3, 0x0

    .line 38
    invoke-virtual {v0, v1, v3}, Lcom/ibotta/android/view/graph/DataSet;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 42
    :cond_3
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphAdapter;->notifyDataSetChanged()V

    return-void
.end method
