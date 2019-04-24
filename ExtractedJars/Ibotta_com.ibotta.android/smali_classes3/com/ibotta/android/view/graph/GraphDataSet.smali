.class public Lcom/ibotta/android/view/graph/GraphDataSet;
.super Ljava/lang/Object;
.source "GraphDataSet.java"


# instance fields
.field private dataSets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/graph/DataSet;",
            ">;"
        }
    .end annotation
.end field

.field private labels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private legendItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/graph/LegendItem;",
            ">;"
        }
    .end annotation
.end field

.field private maxYAxisLabel:Ljava/lang/String;

.field private minYAxisLabel:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->dataSets:Ljava/util/List;

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->labels:Ljava/util/List;

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->legendItems:Ljava/util/List;

    return-void
.end method

.method private adjustLabelsSize()V
    .locals 4

    .line 75
    invoke-direct {p0}, Lcom/ibotta/android/view/graph/GraphDataSet;->getLargestSet()I

    move-result v0

    .line 76
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->labels:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v1, v0, :cond_0

    .line 77
    iget-object v1, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->labels:Ljava/util/List;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private getLargestSet()I
    .locals 4

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->dataSets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/view/graph/DataSet;

    .line 85
    invoke-virtual {v2}, Lcom/ibotta/android/view/graph/DataSet;->size()I

    move-result v3

    if-le v3, v1, :cond_0

    .line 86
    invoke-virtual {v2}, Lcom/ibotta/android/view/graph/DataSet;->size()I

    move-result v1

    goto :goto_0

    :cond_1
    return v1
.end method


# virtual methods
.method public getDataSets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/graph/DataSet;",
            ">;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->dataSets:Ljava/util/List;

    return-object v0
.end method

.method public getLabel(I)Ljava/lang/String;
    .locals 1

    if-ltz p1, :cond_0

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->labels:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->labels:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getLegendItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/graph/LegendItem;",
            ">;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->legendItems:Ljava/util/List;

    return-object v0
.end method

.method public getMaxYAxisLabel()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->maxYAxisLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getMinYAxisLabel()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->minYAxisLabel:Ljava/lang/String;

    return-object v0
.end method

.method public setDataSets(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/graph/DataSet;",
            ">;)V"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->dataSets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->dataSets:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/view/graph/GraphDataSet;->getLargestSet()I

    move-result v0

    .line 28
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/view/graph/DataSet;

    .line 29
    :goto_0
    invoke-virtual {v1}, Lcom/ibotta/android/view/graph/DataSet;->size()I

    move-result v2

    if-ge v2, v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 30
    invoke-virtual {v1, v2, v3}, Lcom/ibotta/android/view/graph/DataSet;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setLabels(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->labels:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->labels:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/view/graph/GraphDataSet;->adjustLabelsSize()V

    return-void
.end method

.method public setLegendItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/graph/LegendItem;",
            ">;)V"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->legendItems:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->legendItems:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public setMaxYAxisLabel(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->maxYAxisLabel:Ljava/lang/String;

    return-void
.end method

.method public setMinYAxisLabel(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/android/view/graph/GraphDataSet;->minYAxisLabel:Ljava/lang/String;

    return-void
.end method
