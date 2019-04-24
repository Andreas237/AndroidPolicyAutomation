.class public Lorg/researchstack/backbone/ui/graph/BarChartCard;
.super Landroid/support/v7/widget/CardView;
.source "BarChartCard.java"


# instance fields
.field private chart:Lcom/github/mikephil/charting/charts/BarChart;

.field private chartXAxisTextColor:I

.field private chartXAxisTextSize:F

.field private chartXAxisTextTypeface:Ljava/lang/String;

.field private expand:Landroid/widget/ImageView;

.field private expandSub:Lrx/Subscription;

.field private expandTintColor:I

.field private titleText:Ljava/lang/String;

.field private titleTextColor:I

.field private titleTextSize:F

.field private titleTextTypeface:Ljava/lang/String;

.field private titleTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 45
    invoke-direct {p0, p1}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;)V

    .line 46
    const/4 v0, 0x0

    sget v1, Lorg/researchstack/backbone/R$attr;->barChartCardStyle:I

    invoke-direct {p0, v0, v1}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->initializeRoot(Landroid/util/AttributeSet;I)V

    .line 47
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->initializeViews()V

    .line 48
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 52
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    sget v0, Lorg/researchstack/backbone/R$attr;->barChartCardStyle:I

    invoke-direct {p0, p2, v0}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->initializeRoot(Landroid/util/AttributeSet;I)V

    .line 54
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->initializeViews()V

    .line 55
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 59
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 60
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->initializeRoot(Landroid/util/AttributeSet;I)V

    .line 61
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->initializeViews()V

    .line 62
    return-void
.end method

.method private initializeRoot(Landroid/util/AttributeSet;I)V
    .locals 6
    .param p1, "attrs"    # Landroid/util/AttributeSet;
    .param p2, "defStyleAttr"    # I

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 66
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lorg/researchstack/backbone/R$layout;->rsb_view_chart_bar:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 68
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lorg/researchstack/backbone/R$styleable;->BarChartCard:[I

    sget v3, Lorg/researchstack/backbone/R$style;->Widget_Backbone_Chart_Bar:I

    invoke-virtual {v1, p1, v2, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 73
    .local v0, "a":Landroid/content/res/TypedArray;
    sget v1, Lorg/researchstack/backbone/R$styleable;->BarChartCard_titleText:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleText:Ljava/lang/String;

    .line 74
    sget v1, Lorg/researchstack/backbone/R$styleable;->BarChartCard_titleTextColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleTextColor:I

    .line 75
    sget v1, Lorg/researchstack/backbone/R$styleable;->BarChartCard_titleTextSize:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleTextSize:F

    .line 76
    sget v1, Lorg/researchstack/backbone/R$styleable;->BarChartCard_titleTextTypeface:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleTextTypeface:Ljava/lang/String;

    .line 77
    sget v1, Lorg/researchstack/backbone/R$styleable;->BarChartCard_chartXAxisTextColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chartXAxisTextColor:I

    .line 78
    sget v1, Lorg/researchstack/backbone/R$styleable;->BarChartCard_chartXAxisTextSize:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    .line 79
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v2

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chartXAxisTextSize:F

    .line 80
    sget v1, Lorg/researchstack/backbone/R$styleable;->BarChartCard_chartXAxisTextTypeface:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chartXAxisTextTypeface:Ljava/lang/String;

    .line 81
    sget v1, Lorg/researchstack/backbone/R$styleable;->BarChartCard_expandTintColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->expandTintColor:I

    .line 83
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 84
    return-void
.end method

.method private initializeViews()V
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    const/4 v6, 0x0

    .line 88
    sget v4, Lorg/researchstack/backbone/R$id;->view_chart_bar_title:I

    invoke-virtual {p0, v4}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleTextView:Landroid/widget/TextView;

    .line 89
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleTextView:Landroid/widget/TextView;

    iget-object v5, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleText:Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleTextView:Landroid/widget/TextView;

    iget v5, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleTextColor:I

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 91
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleTextView:Landroid/widget/TextView;

    iget v5, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleTextSize:F

    invoke-virtual {v4, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 92
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleTextView:Landroid/widget/TextView;

    iget-object v5, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleTextTypeface:Ljava/lang/String;

    invoke-static {v5, v6}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 94
    sget v4, Lorg/researchstack/backbone/R$id;->view_chart_line_expand:I

    invoke-virtual {p0, v4}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->expand:Landroid/widget/ImageView;

    .line 95
    iget v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->expandTintColor:I

    if-eqz v4, :cond_0

    .line 97
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->expand:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 98
    .local v0, "drawable":Landroid/graphics/drawable/Drawable;
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 99
    iget v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->expandTintColor:I

    invoke-static {v0, v4}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 100
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->expand:Landroid/widget/ImageView;

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 103
    .end local v0    # "drawable":Landroid/graphics/drawable/Drawable;
    :cond_0
    sget v4, Lorg/researchstack/backbone/R$id;->view_chart_bar:I

    invoke-virtual {p0, v4}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/github/mikephil/charting/charts/BarChart;

    iput-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    .line 104
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/BarChart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v4

    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/components/Legend;->setEnabled(Z)V

    .line 105
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    const-string v5, ""

    invoke-virtual {v4, v5}, Lcom/github/mikephil/charting/charts/BarChart;->setDescription(Ljava/lang/String;)V

    .line 106
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawBorders(Z)V

    .line 107
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawValueAboveBar(Z)V

    .line 108
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawGridBackground(Z)V

    .line 109
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawBarShadow(Z)V

    .line 110
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawHighlightArrow(Z)V

    .line 111
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/charts/BarChart;->setPinchZoom(Z)V

    .line 112
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4, v7}, Lcom/github/mikephil/charting/charts/BarChart;->setExtraLeftOffset(F)V

    .line 113
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4, v7}, Lcom/github/mikephil/charting/charts/BarChart;->setExtraRightOffset(F)V

    .line 114
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    const/high16 v5, 0x41000000    # 8.0f

    invoke-virtual {v4, v5}, Lcom/github/mikephil/charting/charts/BarChart;->setExtraBottomOffset(F)V

    .line 115
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4, v7}, Lcom/github/mikephil/charting/charts/BarChart;->setExtraTopOffset(F)V

    .line 116
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4, v8}, Lcom/github/mikephil/charting/charts/BarChart;->setTouchEnabled(Z)V

    .line 117
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4, v8}, Lcom/github/mikephil/charting/charts/BarChart;->setDragEnabled(Z)V

    .line 119
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/BarChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v1

    .line 120
    .local v1, "xAxis":Lcom/github/mikephil/charting/components/XAxis;
    sget-object v4, Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;->BOTTOM:Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;

    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/components/XAxis;->setPosition(Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;)V

    .line 121
    invoke-virtual {v1, v6}, Lcom/github/mikephil/charting/components/XAxis;->setDrawAxisLine(Z)V

    .line 122
    const/high16 v4, 0x41800000    # 16.0f

    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/components/XAxis;->setYOffset(F)V

    .line 123
    invoke-virtual {v1, v6}, Lcom/github/mikephil/charting/components/XAxis;->setDrawGridLines(Z)V

    .line 124
    invoke-virtual {v1, v6}, Lcom/github/mikephil/charting/components/XAxis;->setLabelsToSkip(I)V

    .line 125
    iget v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chartXAxisTextSize:F

    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/components/XAxis;->setTextSize(F)V

    .line 126
    iget v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chartXAxisTextColor:I

    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/components/XAxis;->setTextColor(I)V

    .line 127
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chartXAxisTextTypeface:Ljava/lang/String;

    invoke-static {v4, v6}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/components/XAxis;->setTypeface(Landroid/graphics/Typeface;)V

    .line 129
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    .line 130
    .local v2, "yAxisLeft":Lcom/github/mikephil/charting/components/YAxis;
    invoke-virtual {v2, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 131
    invoke-virtual {v2, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 132
    invoke-virtual {v2, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawZeroLine(Z)V

    .line 133
    invoke-virtual {v2, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    .line 135
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v3

    .line 136
    .local v3, "yAxisRight":Lcom/github/mikephil/charting/components/YAxis;
    invoke-virtual {v3, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 137
    invoke-virtual {v3, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 138
    invoke-virtual {v3, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawZeroLine(Z)V

    .line 139
    invoke-virtual {v3, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    .line 140
    return-void
.end method


# virtual methods
.method public getChart()Lcom/github/mikephil/charting/charts/BarChart;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    return-object v0
.end method

.method public setData(Lcom/github/mikephil/charting/data/BarData;Z)V
    .locals 4
    .param p1, "data"    # Lcom/github/mikephil/charting/data/BarData;
    .param p2, "stacked"    # Z

    .prologue
    .line 175
    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarData;->getYMax()F

    move-result v1

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarData;->getYMax()F

    move-result v2

    const v3, 0x3d4ccccd    # 0.05f

    mul-float/2addr v2, v3

    add-float v0, v1, v2

    .line 177
    .local v0, "maxOffset":F
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v1, p1}, Lcom/github/mikephil/charting/charts/BarChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    .line 178
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMaxValue(F)V

    .line 179
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMaxValue(F)V

    .line 180
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v2

    if-eqz p2, :cond_0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2, v1}, Lcom/github/mikephil/charting/components/XAxis;->setYOffset(F)V

    .line 181
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->notifyDataSetChanged()V

    .line 182
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->chart:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->invalidate()V

    .line 183
    return-void

    .line 180
    :cond_0
    const/high16 v1, 0x41800000    # 16.0f

    goto :goto_0
.end method

.method public setExpandAction(Lrx/functions/Action1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrx/functions/Action1",
            "<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 155
    .local p1, "action":Lrx/functions/Action1;, "Lrx/functions/Action1<Ljava/lang/Object;>;"
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->expand:Landroid/widget/ImageView;

    if-nez p1, :cond_2

    const/16 v0, 0x8

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 157
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->expandSub:Lrx/Subscription;

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->expandSub:Lrx/Subscription;

    invoke-interface {v0}, Lrx/Subscription;->unsubscribe()V

    .line 162
    :cond_0
    if-eqz p1, :cond_1

    .line 164
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->expand:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/jakewharton/rxbinding/view/RxView;->clicks(Landroid/view/View;)Lrx/Observable;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrx/Observable;->subscribe(Lrx/functions/Action1;)Lrx/Subscription;

    move-result-object v0

    iput-object v0, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->expandSub:Lrx/Subscription;

    .line 166
    :cond_1
    return-void

    .line 155
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setTitle(I)V
    .locals 2
    .param p1, "titleResId"    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    .prologue
    .line 144
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 145
    .local v0, "title":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/graph/BarChartCard;->setTitle(Ljava/lang/String;)V

    .line 146
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 150
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/BarChartCard;->titleTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    return-void
.end method
