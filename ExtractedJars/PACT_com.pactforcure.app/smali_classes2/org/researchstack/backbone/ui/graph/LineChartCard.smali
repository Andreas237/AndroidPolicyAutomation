.class public Lorg/researchstack/backbone/ui/graph/LineChartCard;
.super Landroid/support/v7/widget/CardView;
.source "LineChartCard.java"


# instance fields
.field private chart:Lcom/github/mikephil/charting/charts/LineChart;

.field private chartXAxisTextColor:I

.field private chartXAxisTextSize:F

.field private chartXAxisTextTypeface:Ljava/lang/String;

.field private chartYAxisTextColor:I

.field private chartYAxisTextSize:F

.field private chartYAxisTextTypeface:Ljava/lang/String;

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
    .line 48
    invoke-direct {p0, p1}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;)V

    .line 49
    const/4 v0, 0x0

    sget v1, Lorg/researchstack/backbone/R$attr;->lineChartCardStyle:I

    invoke-direct {p0, v0, v1}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->initializeRoot(Landroid/util/AttributeSet;I)V

    .line 50
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->initializeViews()V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 55
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 56
    sget v0, Lorg/researchstack/backbone/R$attr;->lineChartCardStyle:I

    invoke-direct {p0, p2, v0}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->initializeRoot(Landroid/util/AttributeSet;I)V

    .line 57
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->initializeViews()V

    .line 58
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 62
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 63
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->initializeRoot(Landroid/util/AttributeSet;I)V

    .line 64
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->initializeViews()V

    .line 65
    return-void
.end method

.method private initializeRoot(Landroid/util/AttributeSet;I)V
    .locals 6
    .param p1, "attrs"    # Landroid/util/AttributeSet;
    .param p2, "defStyleAttr"    # I

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 69
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lorg/researchstack/backbone/R$layout;->rsb_view_chart_line:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 71
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lorg/researchstack/backbone/R$styleable;->LineChartCard:[I

    sget v3, Lorg/researchstack/backbone/R$style;->Widget_Backbone_Chart_Line:I

    invoke-virtual {v1, p1, v2, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 76
    .local v0, "a":Landroid/content/res/TypedArray;
    sget v1, Lorg/researchstack/backbone/R$styleable;->LineChartCard_titleText:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleText:Ljava/lang/String;

    .line 77
    sget v1, Lorg/researchstack/backbone/R$styleable;->LineChartCard_titleTextColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleTextColor:I

    .line 78
    sget v1, Lorg/researchstack/backbone/R$styleable;->LineChartCard_titleTextSize:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleTextSize:F

    .line 79
    sget v1, Lorg/researchstack/backbone/R$styleable;->LineChartCard_titleTextTypeface:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleTextTypeface:Ljava/lang/String;

    .line 80
    sget v1, Lorg/researchstack/backbone/R$styleable;->LineChartCard_chartXAxisTextColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chartXAxisTextColor:I

    .line 81
    sget v1, Lorg/researchstack/backbone/R$styleable;->LineChartCard_chartXAxisTextSize:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    .line 82
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v2

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chartXAxisTextSize:F

    .line 83
    sget v1, Lorg/researchstack/backbone/R$styleable;->LineChartCard_chartXAxisTextTypeface:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chartXAxisTextTypeface:Ljava/lang/String;

    .line 84
    sget v1, Lorg/researchstack/backbone/R$styleable;->LineChartCard_chartYAxisTextColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chartYAxisTextColor:I

    .line 85
    sget v1, Lorg/researchstack/backbone/R$styleable;->LineChartCard_chartYAxisTextSize:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    .line 86
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v2

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chartYAxisTextSize:F

    .line 87
    sget v1, Lorg/researchstack/backbone/R$styleable;->LineChartCard_chartYAxisTextTypeface:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chartYAxisTextTypeface:Ljava/lang/String;

    .line 88
    sget v1, Lorg/researchstack/backbone/R$styleable;->LineChartCard_expandTintColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->expandTintColor:I

    .line 90
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 91
    return-void
.end method

.method private initializeViews()V
    .locals 10

    .prologue
    const/high16 v9, 0x41800000    # 16.0f

    const/4 v8, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 95
    sget v4, Lorg/researchstack/backbone/R$id;->view_chart_line_title:I

    invoke-virtual {p0, v4}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleTextView:Landroid/widget/TextView;

    .line 96
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleTextView:Landroid/widget/TextView;

    iget-object v5, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleText:Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleTextView:Landroid/widget/TextView;

    iget v5, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleTextColor:I

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 98
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleTextView:Landroid/widget/TextView;

    iget v5, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleTextSize:F

    invoke-virtual {v4, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 99
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleTextView:Landroid/widget/TextView;

    iget-object v5, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleTextTypeface:Ljava/lang/String;

    invoke-static {v5, v6}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 101
    sget v4, Lorg/researchstack/backbone/R$id;->view_chart_line_expand:I

    invoke-virtual {p0, v4}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->expand:Landroid/widget/ImageView;

    .line 102
    iget v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->expandTintColor:I

    if-eqz v4, :cond_0

    .line 104
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->expand:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 105
    .local v0, "drawable":Landroid/graphics/drawable/Drawable;
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 106
    iget v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->expandTintColor:I

    invoke-static {v0, v4}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 107
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->expand:Landroid/widget/ImageView;

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 110
    .end local v0    # "drawable":Landroid/graphics/drawable/Drawable;
    :cond_0
    sget v4, Lorg/researchstack/backbone/R$id;->view_chart_line:I

    invoke-virtual {p0, v4}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/github/mikephil/charting/charts/LineChart;

    iput-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    .line 111
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/LineChart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v4

    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/components/Legend;->setEnabled(Z)V

    .line 112
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    const-string v5, ""

    invoke-virtual {v4, v5}, Lcom/github/mikephil/charting/charts/LineChart;->setDescription(Ljava/lang/String;)V

    .line 113
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/charts/LineChart;->setDrawBorders(Z)V

    .line 114
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/charts/LineChart;->setDrawGridBackground(Z)V

    .line 115
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/charts/LineChart;->setPinchZoom(Z)V

    .line 116
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v4, v7}, Lcom/github/mikephil/charting/charts/LineChart;->setTouchEnabled(Z)V

    .line 117
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v4, v7}, Lcom/github/mikephil/charting/charts/LineChart;->setDragEnabled(Z)V

    .line 118
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v4, v8}, Lcom/github/mikephil/charting/charts/LineChart;->setExtraLeftOffset(F)V

    .line 119
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    const/high16 v5, 0x41000000    # 8.0f

    invoke-virtual {v4, v5}, Lcom/github/mikephil/charting/charts/LineChart;->setExtraBottomOffset(F)V

    .line 120
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v4, v8}, Lcom/github/mikephil/charting/charts/LineChart;->setExtraTopOffset(F)V

    .line 122
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/LineChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v1

    .line 123
    .local v1, "xAxis":Lcom/github/mikephil/charting/components/XAxis;
    sget-object v4, Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;->BOTTOM:Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;

    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/components/XAxis;->setPosition(Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;)V

    .line 124
    invoke-virtual {v1, v6}, Lcom/github/mikephil/charting/components/XAxis;->setDrawAxisLine(Z)V

    .line 125
    invoke-virtual {v1, v6}, Lcom/github/mikephil/charting/components/XAxis;->setDrawGridLines(Z)V

    .line 126
    invoke-virtual {v1, v6}, Lcom/github/mikephil/charting/components/XAxis;->setLabelsToSkip(I)V

    .line 127
    invoke-virtual {v1, v9}, Lcom/github/mikephil/charting/components/XAxis;->setXOffset(F)V

    .line 128
    iget v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chartXAxisTextSize:F

    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/components/XAxis;->setTextSize(F)V

    .line 129
    iget v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chartXAxisTextColor:I

    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/components/XAxis;->setTextColor(I)V

    .line 130
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chartXAxisTextTypeface:Ljava/lang/String;

    invoke-static {v4, v6}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/components/XAxis;->setTypeface(Landroid/graphics/Typeface;)V

    .line 132
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    .line 133
    .local v2, "yAxisLeft":Lcom/github/mikephil/charting/components/YAxis;
    invoke-virtual {v2, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 134
    invoke-virtual {v2, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 135
    invoke-virtual {v2, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawZeroLine(Z)V

    .line 136
    invoke-virtual {v2, v7}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    .line 137
    invoke-virtual {v2, v7}, Lcom/github/mikephil/charting/components/YAxis;->setShowOnlyMinMax(Z)V

    .line 138
    invoke-virtual {v2, v9}, Lcom/github/mikephil/charting/components/YAxis;->setXOffset(F)V

    .line 139
    iget v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chartYAxisTextSize:F

    invoke-virtual {v2, v4}, Lcom/github/mikephil/charting/components/YAxis;->setTextSize(F)V

    .line 140
    iget v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chartYAxisTextColor:I

    invoke-virtual {v2, v4}, Lcom/github/mikephil/charting/components/YAxis;->setTextColor(I)V

    .line 141
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chartYAxisTextTypeface:Ljava/lang/String;

    invoke-static {v4, v6}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/github/mikephil/charting/components/YAxis;->setTypeface(Landroid/graphics/Typeface;)V

    .line 143
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v3

    .line 144
    .local v3, "yAxisRight":Lcom/github/mikephil/charting/components/YAxis;
    invoke-virtual {v3, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 145
    invoke-virtual {v3, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 146
    invoke-virtual {v3, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawZeroLine(Z)V

    .line 147
    invoke-virtual {v3, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    .line 148
    invoke-virtual {v3, v8}, Lcom/github/mikephil/charting/components/YAxis;->setSpaceTop(F)V

    .line 149
    return-void
.end method


# virtual methods
.method public getChart()Lcom/github/mikephil/charting/charts/LineChart;
    .locals 1

    .prologue
    .line 201
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    return-object v0
.end method

.method public setData(Lcom/github/mikephil/charting/data/LineData;)V
    .locals 1
    .param p1, "data"    # Lcom/github/mikephil/charting/data/LineData;

    .prologue
    const/4 v0, 0x0

    .line 179
    invoke-virtual {p0, p1, v0, v0}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->setData(Lcom/github/mikephil/charting/data/LineData;II)V

    .line 180
    return-void
.end method

.method public setData(Lcom/github/mikephil/charting/data/LineData;II)V
    .locals 4
    .param p1, "data"    # Lcom/github/mikephil/charting/data/LineData;
    .param p2, "viewportStart"    # I
    .param p3, "viewPortEnd"    # I

    .prologue
    .line 184
    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/LineData;->getYMax()F

    move-result v1

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/LineData;->getYMax()F

    move-result v2

    const v3, 0x3d4ccccd    # 0.05f

    mul-float/2addr v2, v3

    add-float v0, v1, v2

    .line 186
    .local v0, "maxOffset":F
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v1, p1}, Lcom/github/mikephil/charting/charts/LineChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    .line 187
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMaxValue(F)V

    .line 188
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMaxValue(F)V

    .line 190
    if-eq p2, p3, :cond_0

    .line 192
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    int-to-float v2, p2

    int-to-float v3, p3

    invoke-virtual {v1, v2, v3}, Lcom/github/mikephil/charting/charts/LineChart;->setVisibleXRange(FF)V

    .line 195
    :cond_0
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->notifyDataSetChanged()V

    .line 196
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->chart:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->invalidate()V

    .line 197
    return-void
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
    .line 164
    .local p1, "action":Lrx/functions/Action1;, "Lrx/functions/Action1<Ljava/lang/Object;>;"
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->expand:Landroid/widget/ImageView;

    if-nez p1, :cond_2

    const/16 v0, 0x8

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 166
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->expandSub:Lrx/Subscription;

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->expandSub:Lrx/Subscription;

    invoke-interface {v0}, Lrx/Subscription;->unsubscribe()V

    .line 171
    :cond_0
    if-eqz p1, :cond_1

    .line 173
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->expand:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/jakewharton/rxbinding/view/RxView;->clicks(Landroid/view/View;)Lrx/Observable;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrx/Observable;->subscribe(Lrx/functions/Action1;)Lrx/Subscription;

    move-result-object v0

    iput-object v0, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->expandSub:Lrx/Subscription;

    .line 175
    :cond_1
    return-void

    .line 164
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
    .line 153
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 154
    .local v0, "title":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/graph/LineChartCard;->setTitle(Ljava/lang/String;)V

    .line 155
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 159
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/LineChartCard;->titleTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    return-void
.end method
