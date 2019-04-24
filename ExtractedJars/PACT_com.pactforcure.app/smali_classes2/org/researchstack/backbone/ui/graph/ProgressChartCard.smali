.class public Lorg/researchstack/backbone/ui/graph/ProgressChartCard;
.super Landroid/support/v7/widget/CardView;
.source "ProgressChartCard.java"


# instance fields
.field private centerTextColor:I

.field private centerTextFormat:Ljava/lang/String;

.field private centerTextSize:F

.field private centerTextTypeface:Ljava/lang/String;

.field private chart:Lcom/github/mikephil/charting/charts/PieChart;

.field private finishSub:Lrx/Subscription;

.field private finishText:Ljava/lang/String;

.field private finishTextColor:I

.field private finishView:Landroid/widget/TextView;

.field private numberFormat:Ljava/text/NumberFormat;

.field private tabIndicatorColor:I

.field private tabLayout:Landroid/support/design/widget/TabLayout;

.field private tabSelectedTextColor:I

.field private tabTextColor:I

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
    .line 55
    invoke-direct {p0, p1}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;)V

    .line 56
    const/4 v0, 0x0

    sget v1, Lorg/researchstack/backbone/R$attr;->progressChartCardStyle:I

    invoke-direct {p0, v0, v1}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->initializeRoot(Landroid/util/AttributeSet;I)V

    .line 57
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->initializeViews()V

    .line 58
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 62
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 63
    sget v0, Lorg/researchstack/backbone/R$attr;->progressChartCardStyle:I

    invoke-direct {p0, p2, v0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->initializeRoot(Landroid/util/AttributeSet;I)V

    .line 64
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->initializeViews()V

    .line 65
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 69
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 70
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->initializeRoot(Landroid/util/AttributeSet;I)V

    .line 71
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->initializeViews()V

    .line 72
    return-void
.end method

.method static synthetic access$000(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;)Lcom/github/mikephil/charting/charts/PieChart;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

    .prologue
    .line 29
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    return-object v0
.end method

.method static synthetic access$100(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

    .prologue
    .line 29
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->centerTextFormat:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;)Ljava/text/NumberFormat;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

    .prologue
    .line 29
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->numberFormat:Ljava/text/NumberFormat;

    return-object v0
.end method

.method private initializeRoot(Landroid/util/AttributeSet;I)V
    .locals 6
    .param p1, "attrs"    # Landroid/util/AttributeSet;
    .param p2, "defStyleAttr"    # I

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 76
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lorg/researchstack/backbone/R$layout;->rsb_view_chart_progress:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 78
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->numberFormat:Ljava/text/NumberFormat;

    .line 79
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->numberFormat:Ljava/text/NumberFormat;

    invoke-virtual {v1, v4}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 80
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->numberFormat:Ljava/text/NumberFormat;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 82
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard:[I

    sget v3, Lorg/researchstack/backbone/R$style;->Widget_Backbone_Chart_Progress:I

    invoke-virtual {v1, p1, v2, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 87
    .local v0, "a":Landroid/content/res/TypedArray;
    sget v1, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard_titleText:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleText:Ljava/lang/String;

    .line 88
    sget v1, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard_titleTextColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleTextColor:I

    .line 89
    sget v1, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard_titleTextSize:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleTextSize:F

    .line 90
    sget v1, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard_titleTextTypeface:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleTextTypeface:Ljava/lang/String;

    .line 91
    sget v1, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard_finishText:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->finishText:Ljava/lang/String;

    .line 92
    sget v1, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard_finishTextColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->finishTextColor:I

    .line 93
    sget v1, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard_tabIndicatorColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabIndicatorColor:I

    .line 94
    sget v1, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard_tabTextColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabTextColor:I

    .line 95
    sget v1, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard_tabSelectedTextColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabSelectedTextColor:I

    .line 96
    sget v1, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard_centerTextFormat:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->centerTextFormat:Ljava/lang/String;

    .line 97
    sget v1, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard_centerTextColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->centerTextColor:I

    .line 98
    sget v1, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard_centerTextSize:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    .line 99
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v2

    iput v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->centerTextSize:F

    .line 100
    sget v1, Lorg/researchstack/backbone/R$styleable;->ProgressChartCard_centerTextTypeface:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->centerTextTypeface:Ljava/lang/String;

    .line 102
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 103
    return-void
.end method

.method private initializeViews()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 107
    sget v0, Lorg/researchstack/backbone/R$id;->view_chart_progress_title:I

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleTextView:Landroid/widget/TextView;

    .line 108
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleTextView:Landroid/widget/TextView;

    iget v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleTextColor:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 110
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleTextView:Landroid/widget/TextView;

    iget v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleTextSize:F

    invoke-virtual {v0, v3, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 111
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleTextTypeface:Ljava/lang/String;

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 113
    sget v0, Lorg/researchstack/backbone/R$id;->view_chart_progress_finish:I

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->finishView:Landroid/widget/TextView;

    .line 114
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->finishView:Landroid/widget/TextView;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->finishText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->finishView:Landroid/widget/TextView;

    iget v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->finishTextColor:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 117
    sget v0, Lorg/researchstack/backbone/R$id;->view_chart_progress_tabs:I

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TabLayout;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabLayout:Landroid/support/design/widget/TabLayout;

    .line 118
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabLayout:Landroid/support/design/widget/TabLayout;

    iget v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabIndicatorColor:I

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TabLayout;->setSelectedTabIndicatorColor(I)V

    .line 119
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabLayout:Landroid/support/design/widget/TabLayout;

    iget v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabTextColor:I

    iget v2, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabSelectedTextColor:I

    invoke-virtual {v0, v1, v2}, Landroid/support/design/widget/TabLayout;->setTabTextColors(II)V

    .line 121
    sget v0, Lorg/researchstack/backbone/R$id;->view_chart_progress_chart:I

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/PieChart;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    .line 122
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/charts/PieChart;->setDrawSliceText(Z)V

    .line 123
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/charts/PieChart;->setTouchEnabled(Z)V

    .line 124
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/charts/PieChart;->setHoleColor(I)V

    .line 125
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    const/high16 v1, 0x42be0000    # 95.0f

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/PieChart;->setHoleRadius(F)V

    .line 126
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/components/Legend;->setEnabled(Z)V

    .line 127
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/PieChart;->setDescription(Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    iget v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->centerTextColor:I

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/PieChart;->setCenterTextColor(I)V

    .line 129
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    iget v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->centerTextSize:F

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/PieChart;->setCenterTextSize(F)V

    .line 130
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->centerTextTypeface:Ljava/lang/String;

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/PieChart;->setCenterTextTypeface(Landroid/graphics/Typeface;)V

    .line 131
    return-void
.end method

.method static synthetic lambda$setData$17(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;)V
    .locals 4
    .param p0, "this"    # Lorg/researchstack/backbone/ui/graph/ProgressChartCard;

    .prologue
    const/4 v3, 0x0

    .line 174
    iget-object v2, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v2}, Landroid/support/design/widget/TabLayout;->getTabCount()I

    move-result v2

    add-int/lit8 v0, v2, -0x1

    .line 175
    .local v0, "lastIndex":I
    iget-object v2, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v2, v3}, Landroid/support/design/widget/TabLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 176
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v1

    .line 177
    .local v1, "right":I
    iget-object v2, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v2, v1, v3}, Landroid/support/design/widget/TabLayout;->scrollTo(II)V

    .line 178
    iget-object v2, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v2, v0}, Landroid/support/design/widget/TabLayout;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/design/widget/TabLayout$Tab;->select()V

    .line 179
    return-void
.end method


# virtual methods
.method public getChart()Lcom/github/mikephil/charting/charts/PieChart;
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->chart:Lcom/github/mikephil/charting/charts/PieChart;

    return-object v0
.end method

.method public setData(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/github/mikephil/charting/data/PieData;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "dataSet":Ljava/util/List;, "Ljava/util/List<Lcom/github/mikephil/charting/data/PieData;>;"
    const/4 v5, 0x0

    .line 161
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v4}, Landroid/support/design/widget/TabLayout;->removeAllTabs()V

    .line 163
    const/4 v1, 0x0

    .local v1, "i":I
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    .local v3, "size":I
    :goto_0
    if-ge v1, v3, :cond_1

    .line 165
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/data/PieData;

    .line 166
    .local v0, "data":Lcom/github/mikephil/charting/data/PieData;
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v4}, Landroid/support/design/widget/TabLayout;->newTab()Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v2

    .line 167
    .local v2, "newTab":Landroid/support/design/widget/TabLayout$Tab;
    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/PieData;->getDataSet()Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;

    move-result-object v4

    invoke-interface {v4}, Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/support/design/widget/TabLayout$Tab;->setText(Ljava/lang/CharSequence;)Landroid/support/design/widget/TabLayout$Tab;

    .line 168
    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/PieData;->getDataSet()Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;

    move-result-object v4

    invoke-interface {v4, v5}, Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v4

    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->getVal()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/support/design/widget/TabLayout$Tab;->setTag(Ljava/lang/Object;)Landroid/support/design/widget/TabLayout$Tab;

    .line 169
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v4, v2, v5}, Landroid/support/design/widget/TabLayout;->addTab(Landroid/support/design/widget/TabLayout$Tab;I)V

    .line 171
    add-int/lit8 v4, v3, -0x1

    if-ne v1, v4, :cond_0

    .line 173
    invoke-static {p0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;)Ljava/lang/Runnable;

    move-result-object v4

    invoke-virtual {p0, v4}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->post(Ljava/lang/Runnable;)Z

    .line 163
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 183
    .end local v0    # "data":Lcom/github/mikephil/charting/data/PieData;
    .end local v2    # "newTab":Landroid/support/design/widget/TabLayout$Tab;
    :cond_1
    iget-object v4, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->tabLayout:Landroid/support/design/widget/TabLayout;

    new-instance v5, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;

    invoke-direct {v5, p0, p1}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard$1;-><init>(Lorg/researchstack/backbone/ui/graph/ProgressChartCard;Ljava/util/List;)V

    invoke-virtual {v4, v5}, Landroid/support/design/widget/TabLayout;->setOnTabSelectedListener(Landroid/support/design/widget/TabLayout$OnTabSelectedListener;)V

    .line 206
    return-void
.end method

.method public setFinishAction(Lrx/functions/Action1;)V
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
    .line 146
    .local p1, "action":Lrx/functions/Action1;, "Lrx/functions/Action1<Ljava/lang/Object;>;"
    iget-object v1, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->finishView:Landroid/widget/TextView;

    if-nez p1, :cond_2

    const/16 v0, 0x8

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->finishSub:Lrx/Subscription;

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->finishSub:Lrx/Subscription;

    invoke-interface {v0}, Lrx/Subscription;->unsubscribe()V

    .line 153
    :cond_0
    if-eqz p1, :cond_1

    .line 155
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->finishView:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/jakewharton/rxbinding/view/RxView;->clicks(Landroid/view/View;)Lrx/Observable;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrx/Observable;->subscribe(Lrx/functions/Action1;)Lrx/Subscription;

    move-result-object v0

    iput-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->finishSub:Lrx/Subscription;

    .line 157
    :cond_1
    return-void

    .line 146
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
    .line 135
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 136
    .local v0, "title":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->setTitle(Ljava/lang/String;)V

    .line 137
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 141
    iget-object v0, p0, Lorg/researchstack/backbone/ui/graph/ProgressChartCard;->titleTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    return-void
.end method
