.class public Lcom/huawei/pay/ui/widget/LineGridView;
.super Landroid/widget/GridView;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Landroid/widget/GridView;-><init>(Landroid/content/Context;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    return-void
.end method


# virtual methods
.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 42
    invoke-super {p0, p1}, Landroid/widget/GridView;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 43
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/widget/LineGridView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 44
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/LineGridView;->getWidth()I

    move-result v0

    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v1

    div-int v7, v0, v1

    .line 45
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/LineGridView;->getChildCount()I

    move-result v8

    .line 46
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 47
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 48
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 49
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/LineGridView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/paycommonbase/R$color;->huaweipay_hint_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 51
    const/4 v10, 0x0

    :goto_0
    if-ge v10, v8, :cond_2

    .line 53
    invoke-virtual {p0, v10}, Lcom/huawei/pay/ui/widget/LineGridView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 54
    add-int/lit8 v0, v10, 0x1

    rem-int/2addr v0, v7

    if-nez v0, :cond_0

    .line 56
    move-object v0, p1

    invoke-virtual {v11}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v11}, Landroid/view/View;->getBottom()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v11}, Landroid/view/View;->getBottom()I

    move-result v4

    int-to-float v4, v4

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 59
    :cond_0
    add-int/lit8 v0, v10, 0x1

    rem-int v1, v8, v7

    sub-int v1, v8, v1

    if-le v0, v1, :cond_1

    .line 61
    move-object v0, p1

    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v11}, Landroid/view/View;->getBottom()I

    move-result v4

    int-to-float v4, v4

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 66
    :cond_1
    move-object v0, p1

    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v11}, Landroid/view/View;->getBottom()I

    move-result v4

    int-to-float v4, v4

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 68
    move-object v0, p1

    invoke-virtual {v11}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v11}, Landroid/view/View;->getBottom()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v11}, Landroid/view/View;->getBottom()I

    move-result v4

    int-to-float v4, v4

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 51
    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 72
    :cond_2
    rem-int v0, v8, v7

    if-eqz v0, :cond_3

    .line 74
    const/4 v10, 0x0

    :goto_2
    rem-int v0, v8, v7

    sub-int v0, v7, v0

    if-ge v10, v0, :cond_3

    .line 76
    add-int/lit8 v0, v8, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/widget/LineGridView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 77
    move-object v0, p1

    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    move-result v2

    mul-int/2addr v2, v10

    add-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v3

    .line 78
    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    move-result v4

    mul-int/2addr v4, v10

    add-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual {v11}, Landroid/view/View;->getBottom()I

    move-result v4

    int-to-float v4, v4

    move-object v5, v9

    .line 77
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 74
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 81
    :cond_3
    return-void
.end method
