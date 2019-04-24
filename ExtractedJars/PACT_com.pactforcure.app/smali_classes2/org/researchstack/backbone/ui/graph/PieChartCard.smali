.class public Lorg/researchstack/backbone/ui/graph/PieChartCard;
.super Landroid/support/v7/widget/CardView;
.source "PieChartCard.java"


# instance fields
.field private chart:Lcom/github/mikephil/charting/charts/PieChart;

.field private numberFormat:Ljava/text/NumberFormat;

.field private rowContainer:Landroid/widget/LinearLayout;

.field private titleText:Ljava/lang/String;

.field private titleTextColor:I

.field private titleTextSize:F

.field private titleTextTypeface:Ljava/lang/String;

.field private titleTextView:Landroid/widget/TextView;

.field private valueTextFormat:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 37
    invoke-direct {p0, p1}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;)V

    .line 38
    const/4 v0, 0x0

    sget v1, Lorg/researchstack/backbone/R$attr;->pieChartCardStyle:I

    invoke-direct {p0, v0, v1}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->initializeRoot(Landroid/util/AttributeSet;I)V

    .line 39
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->initializeViews()V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    sget v0, Lorg/researchstack/backbone/R$attr;->pieChartCardStyle:I

    invoke-direct {p0, p2, v0}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->initializeRoot(Landroid/util/AttributeSet;I)V

    .line 46
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->initializeViews()V

    .line 47
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 51
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 52
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->initializeRoot(Landroid/util/AttributeSet;I)V

    .line 53
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->initializeViews()V

    .line 54
    return-void
.end method

.method private initializeRoot(Landroid/util/AttributeSet;I)V
    .locals 5
    .param p1, "attrs"    # Landroid/util/AttributeSet;
    .param p2, "defStyleAttr"    # I

    .prologue
    const/4 v4, 0x0

    .line 58
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lorg/researchstack/backbone/R$layout;->rsb_view_chart_pie:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 60
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->numberFormat:Ljava/text/NumberFormat;

    .line 61
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->numberFormat:Ljava/text/NumberFormat;

    invoke-virtual {v1, v4}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 62
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->numberFormat:Ljava/text/NumberFormat;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 64
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lorg/researchstack/backbone/R$styleable;->PieChartCard:[I

    sget v3, Lorg/researchstack/backbone/R$style;->Widget_Backbone_Chart_Pie:I

    invoke-virtual {v1, p1, v2, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 69
    .local v0, "a":Landroid/content/res/TypedArray;
    sget v1, Lorg/researchstack/backbone/R$styleable;->PieChartCard_titleText:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleText:Ljava/lang/String;

    .line 70
    sget v1, Lorg/researchstack/backbone/R$styleable;->PieChartCard_titleTextColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleTextColor:I

    .line 71
    sget v1, Lorg/researchstack/backbone/R$styleable;->PieChartCard_titleTextSize:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleTextSize:F

    .line 72
    sget v1, Lorg/researchstack/backbone/R$styleable;->PieChartCard_titleTextTypeface:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleTextTypeface:Ljava/lang/String;

    .line 73
    sget v1, Lorg/researchstack/backbone/R$styleable;->PieChartCard_valueTextFormat:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->valueTextFormat:I

    .line 75
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 76
    return-void
.end method

.method private initializeViews()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 80
    sget v0, Lorg/researchstack/backbone/R$id;->view_chart_pie_title:I

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleTextView:Landroid/widget/TextView;

    .line 81
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleTextView:Landroid/widget/TextView;

    iget v1, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleTextColor:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 83
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleTextView:Landroid/widget/TextView;

    iget v1, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleTextSize:F

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 84
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleTextTypeface:Ljava/lang/String;

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 86
    sget v0, Lorg/researchstack/backbone/R$id;->view_chart_pie:I

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/PieChart;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    .line 87
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/charts/PieChart;->setDrawSliceText(Z)V

    .line 88
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/charts/PieChart;->setTouchEnabled(Z)V

    .line 89
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/charts/PieChart;->setHoleRadius(F)V

    .line 90
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/charts/PieChart;->setTransparentCircleRadius(F)V

    .line 91
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/components/Legend;->setEnabled(Z)V

    .line 92
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/PieChart;->setDescription(Ljava/lang/String;)V

    .line 93
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/charts/PieChart;->setDrawCenterText(Z)V

    .line 95
    sget v0, Lorg/researchstack/backbone/R$id;->view_chart_pie_rows:I

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->rowContainer:Landroid/widget/LinearLayout;

    .line 96
    return-void
.end method


# virtual methods
.method public getChart()Lcom/github/mikephil/charting/charts/PieChart;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    return-object v0
.end method

.method public setData(Lcom/github/mikephil/charting/data/PieData;)V
    .locals 18
    .param p1, "data"    # Lcom/github/mikephil/charting/data/PieData;

    .prologue
    .line 111
    move-object/from16 v0, p0

    iget-object v10, v0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    move-object/from16 v0, p1

    invoke-virtual {v10, v0}, Lcom/github/mikephil/charting/charts/PieChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    .line 112
    move-object/from16 v0, p0

    iget-object v10, v0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v10}, Lcom/github/mikephil/charting/charts/PieChart;->notifyDataSetChanged()V

    .line 113
    move-object/from16 v0, p0

    iget-object v10, v0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v10}, Lcom/github/mikephil/charting/charts/PieChart;->invalidate()V

    .line 115
    move-object/from16 v0, p0

    iget-object v10, v0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->rowContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v10}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 116
    invoke-virtual/range {p0 .. p0}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 118
    .local v4, "inflater":Landroid/view/LayoutInflater;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual/range {p1 .. p1}, Lcom/github/mikephil/charting/data/PieData;->getXVals()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v7

    .local v7, "size":I
    :goto_0
    if-ge v3, v7, :cond_0

    .line 120
    invoke-virtual/range {p1 .. p1}, Lcom/github/mikephil/charting/data/PieData;->getXVals()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 121
    .local v9, "xVal":Ljava/lang/String;
    invoke-virtual/range {p1 .. p1}, Lcom/github/mikephil/charting/data/PieData;->getDataSet()Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;

    move-result-object v10

    invoke-interface {v10, v3}, Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v10

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getVal()F

    move-result v2

    .line 123
    .local v2, "entryValue":F
    sget v10, Lorg/researchstack/backbone/R$layout;->rsb_item_chart_pie:I

    move-object/from16 v0, p0

    iget-object v11, v0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->rowContainer:Landroid/widget/LinearLayout;

    const/4 v12, 0x0

    invoke-virtual {v4, v10, v11, v12}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    .line 125
    .local v6, "row":Landroid/view/View;
    sget v10, Lorg/researchstack/backbone/R$id;->item_chart_pie_label:I

    invoke-virtual {v6, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 126
    .local v5, "label":Landroid/widget/TextView;
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    invoke-virtual/range {p1 .. p1}, Lcom/github/mikephil/charting/data/PieData;->getDataSet()Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;

    move-result-object v10

    invoke-interface {v10, v3}, Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;->getColor(I)I

    move-result v10

    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 129
    sget v10, Lorg/researchstack/backbone/R$id;->item_chart_pie_value:I

    invoke-virtual {v6, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    .line 130
    .local v8, "value":Landroid/widget/TextView;
    invoke-virtual/range {p0 .. p0}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->getContext()Landroid/content/Context;

    move-result-object v10

    move-object/from16 v0, p0

    iget v11, v0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->valueTextFormat:I

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    move-object/from16 v0, p0

    iget-object v14, v0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->numberFormat:Ljava/text/NumberFormat;

    float-to-double v0, v2

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    invoke-virtual {v14, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-virtual {v10, v11, v12}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    invoke-virtual/range {p1 .. p1}, Lcom/github/mikephil/charting/data/PieData;->getDataSet()Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;

    move-result-object v10

    invoke-interface {v10, v3}, Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;->getColor(I)I

    move-result v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 133
    move-object/from16 v0, p0

    iget-object v10, v0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->rowContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v10, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 118
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 135
    .end local v2    # "entryValue":F
    .end local v5    # "label":Landroid/widget/TextView;
    .end local v6    # "row":Landroid/view/View;
    .end local v8    # "value":Landroid/widget/TextView;
    .end local v9    # "xVal":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public setTitle(I)V
    .locals 2
    .param p1, "titleResId"    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    .prologue
    .line 100
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 101
    .local v0, "title":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/graph/PieChartCard;->setTitle(Ljava/lang/String;)V

    .line 102
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 106
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/PieChartCard;->titleTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    return-void
.end method
