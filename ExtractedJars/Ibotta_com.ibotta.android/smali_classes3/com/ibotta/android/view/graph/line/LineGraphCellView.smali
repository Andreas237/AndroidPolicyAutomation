.class public Lcom/ibotta/android/view/graph/line/LineGraphCellView;
.super Landroid/widget/LinearLayout;
.source "LineGraphCellView.java"


# instance fields
.field private graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;

.field private index:I

.field private paint:Landroid/graphics/Paint;

.field private radius:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, -0x1

    .line 22
    iput p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->index:I

    .line 23
    new-instance p1, Lcom/ibotta/android/view/graph/GraphDataSet;

    invoke-direct {p1}, Lcom/ibotta/android/view/graph/GraphDataSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f070102

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->radius:I

    .line 25
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    .line 29
    invoke-direct {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    .line 22
    iput p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->index:I

    .line 23
    new-instance p1, Lcom/ibotta/android/view/graph/GraphDataSet;

    invoke-direct {p1}, Lcom/ibotta/android/view/graph/GraphDataSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f070102

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->radius:I

    .line 25
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->initLayout()V

    return-void
.end method

.method private getY(Lcom/ibotta/android/view/graph/DataPoint;)F
    .locals 3

    .line 124
    iget v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->radius:I

    int-to-float v0, v0

    .line 125
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v0

    sub-float/2addr v1, v2

    .line 126
    invoke-virtual {p1}, Lcom/ibotta/android/view/graph/DataPoint;->getValue()F

    move-result p1

    mul-float p1, p1, v1

    sub-float/2addr v1, p1

    sub-float/2addr v1, v0

    cmpg-float p1, v1, v0

    if-gez p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    add-float v1, v0, p1

    :cond_0
    return v1
.end method

.method private initLayout()V
    .locals 2

    .line 51
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060171

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->setBackgroundColor(I)V

    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 56
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->reset()V

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;

    invoke-virtual {v0}, Lcom/ibotta/android/view/graph/GraphDataSet;->getDataSets()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 65
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    .line 67
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/ibotta/android/view/graph/DataSet;

    .line 68
    iget v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->index:I

    invoke-virtual {v10, v4}, Lcom/ibotta/android/view/graph/DataSet;->get(I)Lcom/ibotta/android/view/graph/DataPoint;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_0

    .line 75
    :cond_1
    invoke-direct {p0, v4}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->getY(Lcom/ibotta/android/view/graph/DataPoint;)F

    move-result v11

    .line 79
    iget-object v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v10}, Lcom/ibotta/android/view/graph/DataSet;->getColorId()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 81
    iget v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->index:I

    invoke-virtual {v10, v4}, Lcom/ibotta/android/view/graph/DataSet;->getPrevious(I)Lcom/ibotta/android/view/graph/DataPoint;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 83
    invoke-direct {p0, v4}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->getY(Lcom/ibotta/android/view/graph/DataPoint;)F

    move-result v4

    sub-float v5, v11, v4

    .line 84
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    div-float/2addr v5, v3

    cmpg-float v6, v4, v11

    if-gez v6, :cond_2

    sub-float v4, v11, v5

    move v8, v4

    goto :goto_1

    :cond_2
    cmpl-float v6, v4, v11

    if-lez v6, :cond_3

    add-float/2addr v5, v11

    move v8, v5

    goto :goto_1

    :cond_3
    move v8, v4

    :goto_1
    const/4 v7, 0x0

    .line 92
    iget-object v9, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    move-object v4, p1

    move v5, v2

    move v6, v11

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 95
    :cond_4
    iget v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->index:I

    invoke-virtual {v10, v4}, Lcom/ibotta/android/view/graph/DataSet;->getNext(I)Lcom/ibotta/android/view/graph/DataPoint;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 97
    invoke-direct {p0, v4}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->getY(Lcom/ibotta/android/view/graph/DataPoint;)F

    move-result v4

    sub-float v5, v11, v4

    .line 98
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    div-float/2addr v5, v3

    cmpg-float v6, v4, v11

    if-gez v6, :cond_5

    sub-float v4, v11, v5

    move v8, v4

    goto :goto_2

    :cond_5
    cmpl-float v6, v4, v11

    if-lez v6, :cond_6

    add-float/2addr v5, v11

    move v8, v5

    goto :goto_2

    :cond_6
    move v8, v4

    .line 105
    :goto_2
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->getWidth()I

    move-result v4

    int-to-float v7, v4

    iget-object v9, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    move-object v4, p1

    move v5, v2

    move v6, v11

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 109
    :cond_7
    iget-object v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    invoke-virtual {v4}, Landroid/graphics/Paint;->reset()V

    .line 110
    iget-object v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f060171

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 111
    iget-object v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f070103

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 112
    iget-object v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 113
    iget v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->radius:I

    int-to-float v4, v4

    iget-object v5, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v11, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 116
    iget-object v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v10}, Lcom/ibotta/android/view/graph/DataSet;->getColorId()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 117
    iget-object v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 118
    iget-object v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 119
    iget v4, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->radius:I

    int-to-float v4, v4

    iget-object v5, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v11, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto/16 :goto_0

    :cond_8
    return-void
.end method

.method public setGraphDataSet(Lcom/ibotta/android/view/graph/GraphDataSet;)V
    .locals 0

    if-nez p1, :cond_0

    .line 44
    new-instance p1, Lcom/ibotta/android/view/graph/GraphDataSet;

    invoke-direct {p1}, Lcom/ibotta/android/view/graph/GraphDataSet;-><init>()V

    .line 46
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;

    .line 47
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->invalidate()V

    return-void
.end method

.method public setIndex(I)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->index:I

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->invalidate()V

    return-void
.end method
