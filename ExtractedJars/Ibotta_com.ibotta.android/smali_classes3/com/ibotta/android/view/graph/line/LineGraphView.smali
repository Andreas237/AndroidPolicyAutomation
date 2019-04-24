.class public Lcom/ibotta/android/view/graph/line/LineGraphView;
.super Landroid/widget/LinearLayout;
.source "LineGraphView.java"


# instance fields
.field private adapter:Lcom/ibotta/android/view/graph/line/LineGraphAdapter;

.field private llLegend:Landroid/widget/LinearLayout;

.field private rvLineGraph:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/view/graph/line/LineGraphView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/view/graph/line/LineGraphView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 4

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    const v1, 0x7f0c016e

    const/4 v2, 0x1

    .line 75
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const v0, 0x7f090311

    .line 77
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/graph/line/LineGraphView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphView;->llLegend:Landroid/widget/LinearLayout;

    const v0, 0x7f0903d9

    .line 78
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/graph/line/LineGraphView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphView;->rvLineGraph:Landroid/support/v7/widget/RecyclerView;

    .line 80
    new-instance v0, Lcom/ibotta/android/view/graph/line/LineGraphAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/view/graph/line/LineGraphAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphView;->adapter:Lcom/ibotta/android/view/graph/line/LineGraphAdapter;

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphView;->rvLineGraph:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/ibotta/android/view/graph/line/LineGraphView;->adapter:Lcom/ibotta/android/view/graph/line/LineGraphAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphView;->rvLineGraph:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphView;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    return-void
.end method


# virtual methods
.method public setGraphDataSet(Lcom/ibotta/android/view/graph/GraphDataSet;)V
    .locals 10
    .param p1    # Lcom/ibotta/android/view/graph/GraphDataSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 43
    new-instance p1, Lcom/ibotta/android/view/graph/GraphDataSet;

    invoke-direct {p1}, Lcom/ibotta/android/view/graph/GraphDataSet;-><init>()V

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphView;->adapter:Lcom/ibotta/android/view/graph/line/LineGraphAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/graph/line/LineGraphAdapter;->setGraphData(Lcom/ibotta/android/view/graph/GraphDataSet;)V

    .line 47
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 48
    iget-object v1, p0, Lcom/ibotta/android/view/graph/line/LineGraphView;->llLegend:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/android/view/graph/GraphDataSet;->getLegendItems()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/view/graph/LegendItem;

    const v3, 0x7f0c0170

    .line 51
    iget-object v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphView;->llLegend:Landroid/widget/LinearLayout;

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f0902af

    .line 52
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    const v5, 0x7f090539

    .line 53
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 55
    new-instance v6, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v7, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v7}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    invoke-direct {v6, v7}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 56
    invoke-virtual {v6}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v7

    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphView;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v1}, Lcom/ibotta/android/view/graph/LegendItem;->getColorId()I

    move-result v9

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 57
    invoke-virtual {v6}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v7

    sget-object v8, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 58
    invoke-virtual {v6}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 v2, 0x4

    .line 59
    invoke-virtual {v6, v2}, Landroid/graphics/drawable/ShapeDrawable;->setIntrinsicWidth(I)V

    .line 60
    invoke-virtual {v6, v2}, Landroid/graphics/drawable/ShapeDrawable;->setIntrinsicHeight(I)V

    .line 61
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 63
    invoke-virtual {v1}, Lcom/ibotta/android/view/graph/LegendItem;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    iget-object v1, p0, Lcom/ibotta/android/view/graph/line/LineGraphView;->llLegend:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 68
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphView;->adapter:Lcom/ibotta/android/view/graph/line/LineGraphAdapter;

    invoke-virtual {p1}, Lcom/ibotta/android/view/graph/line/LineGraphAdapter;->getItemCount()I

    move-result p1

    if-lez p1, :cond_2

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphView;->rvLineGraph:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphView;->adapter:Lcom/ibotta/android/view/graph/line/LineGraphAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/view/graph/line/LineGraphAdapter;->getItemCount()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->scrollToPosition(I)V

    :cond_2
    return-void
.end method
