.class Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;
.super Lorg/researchstack/backbone/ui/views/IconTabLayout$OnTabSelectedListenerAdapter;
.source "ProgressChartCard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->setData(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

.field final synthetic val$dataSet:Ljava/util/List;


# direct methods
.method constructor <init>(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;Ljava/util/List;)V
    .locals 0
    .param p1, "this$0"    # Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

    .prologue
    .line 184
    iput-object p1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;->this$0:Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

    iput-object p2, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;->val$dataSet:Ljava/util/List;

    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/IconTabLayout$OnTabSelectedListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onTabReselected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 0
    .param p1, "tab"    # Landroid/support/design/widget/TabLayout$Tab;

    .prologue
    .line 202
    invoke-super {p0, p1}, Lorg/researchstack/backbone/ui/views/IconTabLayout$OnTabSelectedListenerAdapter;->onTabReselected(Landroid/support/design/widget/TabLayout$Tab;)V

    .line 203
    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;->onTabSelected(Landroid/support/design/widget/TabLayout$Tab;)V

    .line 204
    return-void
.end method

.method public onTabSelected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 11
    .param p1, "tab"    # Landroid/support/design/widget/TabLayout$Tab;

    .prologue
    const/4 v10, 0x1

    const/4 v7, 0x0

    .line 188
    iget-object v3, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;->val$dataSet:Ljava/util/List;

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v4

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/mikephil/charting/data/PieData;

    .line 189
    .local v1, "data":Lcom/github/mikephil/charting/data/PieData;
    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/PieData;->getDataSet()Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;

    move-result-object v3

    invoke-interface {v3, v7}, Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v3

    invoke-virtual {v3}, Lcom/github/mikephil/charting/data/Entry;->getVal()F

    move-result v0

    .line 190
    .local v0, "complete":F
    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/PieData;->getDataSet()Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;

    move-result-object v3

    invoke-interface {v3, v10}, Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v3

    invoke-virtual {v3}, Lcom/github/mikephil/charting/data/Entry;->getVal()F

    move-result v2

    .line 191
    .local v2, "incomplete":F
    iget-object v3, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;->this$0:Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

    invoke-static {v3}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->access$000(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;)Lcom/github/mikephil/charting/charts/PieChart;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/github/mikephil/charting/charts/PieChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    .line 192
    iget-object v3, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;->this$0:Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

    invoke-static {v3}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->access$000(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;)Lcom/github/mikephil/charting/charts/PieChart;

    move-result-object v3

    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;->this$0:Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

    invoke-static {v4}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->access$100(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;->this$0:Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

    .line 193
    invoke-static {v6}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->access$200(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;)Ljava/text/NumberFormat;

    move-result-object v6

    float-to-double v8, v0

    invoke-virtual {v6, v8, v9}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v7

    iget-object v6, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;->this$0:Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

    .line 194
    invoke-static {v6}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->access$200(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;)Ljava/text/NumberFormat;

    move-result-object v6

    add-float v7, v0, v2

    float-to-double v8, v7

    invoke-virtual {v6, v8, v9}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v10

    .line 192
    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/github/mikephil/charting/charts/PieChart;->setCenterText(Ljava/lang/CharSequence;)V

    .line 195
    iget-object v3, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;->this$0:Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

    invoke-static {v3}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->access$000(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;)Lcom/github/mikephil/charting/charts/PieChart;

    move-result-object v3

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/PieChart;->notifyDataSetChanged()V

    .line 196
    iget-object v3, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;->this$0:Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

    invoke-static {v3}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->access$000(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;)Lcom/github/mikephil/charting/charts/PieChart;

    move-result-object v3

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/PieChart;->invalidate()V

    .line 197
    return-void
.end method
