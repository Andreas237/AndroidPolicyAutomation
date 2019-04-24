.class public Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "BarGraphAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private dataSet:Lcom/ibotta/android/view/graph/DataSet;

.field private graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;->dataSet:Lcom/ibotta/android/view/graph/DataSet;

    if-eqz v0, :cond_0

    .line 49
    invoke-virtual {v0}, Lcom/ibotta/android/view/graph/DataSet;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;->onBindViewHolder(Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;I)V
    .locals 2

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;->dataSet:Lcom/ibotta/android/view/graph/DataSet;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2}, Lcom/ibotta/android/view/graph/DataSet;->get(I)Lcom/ibotta/android/view/graph/DataPoint;

    move-result-object v0

    .line 43
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;->graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;

    invoke-virtual {v1, p2}, Lcom/ibotta/android/view/graph/GraphDataSet;->getLabel(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->access$000(Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;Lcom/ibotta/android/view/graph/DataPoint;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 21
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;
    .locals 2

    .line 36
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0133

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 37
    new-instance p2, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;-><init>(Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public setGraphData(Lcom/ibotta/android/view/graph/GraphDataSet;)V
    .locals 1

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;->graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/view/graph/GraphDataSet;->getDataSets()Ljava/util/List;

    move-result-object p1

    .line 30
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/graph/DataSet;

    :goto_0
    iput-object p1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;->dataSet:Lcom/ibotta/android/view/graph/DataSet;

    .line 31
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;->notifyDataSetChanged()V

    return-void
.end method
