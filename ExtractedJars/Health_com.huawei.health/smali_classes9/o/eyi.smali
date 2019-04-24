.class public Lo/eyi;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:Landroid/graphics/Paint;

.field private c:Landroid/content/Context;

.field private d:F

.field private e:F

.field private f:[F

.field private g:I

.field private h:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 39
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/eyi;->g:I

    .line 40
    iput-object p1, p0, Lo/eyi;->c:Landroid/content/Context;

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 44
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/eyi;->g:I

    .line 45
    iput-object p1, p0, Lo/eyi;->c:Landroid/content/Context;

    .line 46
    const/4 v0, 0x5

    new-array v0, v0, [F

    iput-object v0, p0, Lo/eyi;->f:[F

    .line 47
    const/4 v0, 0x5

    new-array v0, v0, [I

    iput-object v0, p0, Lo/eyi;->h:[I

    .line 48
    iget-object v0, p0, Lo/eyi;->h:[I

    iget-object v1, p0, Lo/eyi;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_total_data_walk_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 49
    iget-object v0, p0, Lo/eyi;->h:[I

    iget-object v1, p0, Lo/eyi;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_total_data_run_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 50
    iget-object v0, p0, Lo/eyi;->h:[I

    iget-object v1, p0, Lo/eyi;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_total_data_climb_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 51
    iget-object v0, p0, Lo/eyi;->h:[I

    iget-object v1, p0, Lo/eyi;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_total_data_climb_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    .line 52
    iget-object v0, p0, Lo/eyi;->h:[I

    iget-object v1, p0, Lo/eyi;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_total_data_other_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x4

    aput v1, v0, v2

    .line 53
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 15

    .line 65
    move-object/from16 v0, p1

    invoke-super {p0, v0}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 68
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    .line 69
    iget-object v0, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 70
    iget-object v0, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 71
    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 72
    iget v8, p0, Lo/eyi;->e:F

    .line 73
    iget v0, p0, Lo/eyi;->g:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 74
    iget v0, p0, Lo/eyi;->e:F

    iget v1, p0, Lo/eyi;->g:I

    add-int/lit8 v1, v1, -0x1

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    const/4 v2, 0x1

    invoke-static {v2, v1}, Lo/eyh;->b(IF)F

    move-result v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/eyi;->a:F

    sub-float v8, v0, v1

    .line 76
    :cond_0
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mWidth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eyi;->e:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " tmpWidth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " recNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eyi;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x0

    aget v9, v0, v1

    .line 78
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x0

    aget v10, v0, v1

    .line 80
    iget-object v0, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/eyi;->h:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 81
    iget v0, p0, Lo/eyi;->a:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/eyi;->a:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v2, p0, Lo/eyi;->a:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 82
    iget v0, p0, Lo/eyi;->e:F

    iget v1, p0, Lo/eyi;->a:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lo/eyi;->a:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v2, p0, Lo/eyi;->a:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 83
    new-instance v11, Landroid/graphics/RectF;

    iget v0, p0, Lo/eyi;->a:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/eyi;->e:F

    iget v2, p0, Lo/eyi;->a:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget v2, p0, Lo/eyi;->a:F

    const/4 v3, 0x0

    invoke-direct {v11, v0, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 84
    iget-object v0, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v11, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 87
    const/4 v12, 0x0

    :goto_0
    const/4 v0, 0x5

    if-ge v12, v0, :cond_2

    .line 88
    iget-object v0, p0, Lo/eyi;->f:[F

    aget v0, v0, v12

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 89
    iget-object v0, p0, Lo/eyi;->h:[I

    aget v9, v0, v12

    .line 90
    goto :goto_1

    .line 87
    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 95
    :cond_2
    :goto_1
    const/4 v12, 0x4

    :goto_2
    if-ltz v12, :cond_4

    .line 96
    iget-object v0, p0, Lo/eyi;->f:[F

    aget v0, v0, v12

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 97
    iget-object v0, p0, Lo/eyi;->h:[I

    aget v10, v0, v12

    .line 98
    goto :goto_3

    .line 95
    :cond_3
    add-int/lit8 v12, v12, -0x1

    goto :goto_2

    .line 102
    :cond_4
    :goto_3
    iget v0, p0, Lo/eyi;->a:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v12, v0, v1

    .line 104
    const/4 v13, 0x0

    :goto_4
    const/4 v0, 0x5

    if-ge v13, v0, :cond_8

    .line 105
    iget-object v0, p0, Lo/eyi;->f:[F

    aget v0, v0, v13

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    .line 106
    iget-object v0, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/eyi;->h:[I

    aget v1, v1, v13

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 107
    iget-object v0, p0, Lo/eyi;->h:[I

    aget v0, v0, v13

    if-ne v9, v0, :cond_5

    .line 109
    iget-object v0, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 110
    new-instance v14, Landroid/graphics/RectF;

    iget v0, p0, Lo/eyi;->e:F

    iget v1, p0, Lo/eyi;->a:F

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v14, v2, v3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 111
    iget-object v0, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v14, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 112
    iget-object v0, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/eyi;->h:[I

    aget v1, v1, v13

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 113
    add-float v6, v7, v12

    .line 114
    iget-object v0, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v12, v12, v12, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 115
    goto :goto_5

    .line 116
    :cond_5
    const/4 v0, 0x1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    add-float v6, v7, v0

    .line 117
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "In value"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " after add startX = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mWidth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eyi;->e:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " circleR = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    :goto_5
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "In value"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "endX = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mWidth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eyi;->e:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " circleR = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    iget-object v0, p0, Lo/eyi;->f:[F

    aget v0, v0, v13

    iget v1, p0, Lo/eyi;->d:F

    div-float/2addr v0, v1

    mul-float/2addr v0, v8

    add-float v7, v6, v0

    .line 121
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "In value"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " after add endX = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mWidth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eyi;->e:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " circleR = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-object v0, p0, Lo/eyi;->h:[I

    aget v0, v0, v13

    if-ne v10, v0, :cond_6

    .line 123
    iget v7, p0, Lo/eyi;->e:F

    .line 124
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "In value"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " endColor == mColors["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "] endX = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    sub-float v0, v7, v12

    iget-object v1, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v12, v12, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 126
    move-object/from16 v0, p1

    move v1, v6

    sub-float v3, v7, v12

    iget v4, p0, Lo/eyi;->a:F

    iget-object v5, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_6

    .line 128
    :cond_6
    move-object/from16 v0, p1

    move v1, v6

    move v3, v7

    iget v4, p0, Lo/eyi;->a:F

    iget-object v5, p0, Lo/eyi;->b:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 104
    :cond_7
    :goto_6
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_4

    .line 132
    :cond_8
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    .line 57
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 58
    invoke-virtual {p0}, Lo/eyi;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lo/eyi;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/eyi;->e:F

    .line 59
    invoke-virtual {p0}, Lo/eyi;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Lo/eyi;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/eyi;->a:F

    .line 60
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onMesure mWidth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eyi;->e:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mHeight = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eyi;->a:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 138
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 139
    return-void
.end method

.method public setColors(III)V
    .locals 2

    .line 227
    iget-object v0, p0, Lo/eyi;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x0

    aput p3, v0, v1

    .line 229
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 230
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x2

    aput p1, v0, v1

    goto :goto_0

    .line 233
    :cond_0
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 234
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 235
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 237
    :goto_0
    return-void
.end method

.method public setColors(IIII)V
    .locals 2

    .line 241
    iget-object v0, p0, Lo/eyi;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x0

    aput p4, v0, v1

    .line 243
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x1

    aput p3, v0, v1

    .line 244
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x2

    aput p2, v0, v1

    .line 245
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x3

    aput p1, v0, v1

    goto :goto_0

    .line 248
    :cond_0
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 249
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 250
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 251
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x3

    aput p4, v0, v1

    .line 253
    :goto_0
    return-void
.end method

.method public setColors(IIIII)V
    .locals 2

    .line 256
    iget-object v0, p0, Lo/eyi;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 257
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x0

    aput p5, v0, v1

    .line 258
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x1

    aput p4, v0, v1

    .line 259
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 260
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x3

    aput p2, v0, v1

    .line 261
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x4

    aput p1, v0, v1

    goto :goto_0

    .line 263
    :cond_0
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 264
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 265
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 266
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x3

    aput p4, v0, v1

    .line 267
    iget-object v0, p0, Lo/eyi;->h:[I

    const/4 v1, 0x4

    aput p5, v0, v1

    .line 269
    :goto_0
    return-void
.end method

.method public setViewData(FFF)V
    .locals 6

    .line 200
    const/4 v0, 0x5

    new-array v0, v0, [F

    iput-object v0, p0, Lo/eyi;->f:[F

    .line 201
    iget-object v0, p0, Lo/eyi;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 202
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x0

    aput p3, v0, v1

    .line 203
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 204
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x2

    aput p1, v0, v1

    goto :goto_0

    .line 206
    :cond_0
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 207
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 208
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 210
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lo/eyi;->d:F

    .line 211
    const/4 v0, 0x0

    iput v0, p0, Lo/eyi;->g:I

    .line 212
    const/4 v5, 0x0

    :goto_1
    const/4 v0, 0x5

    if-ge v5, v0, :cond_2

    .line 213
    iget-object v0, p0, Lo/eyi;->f:[F

    aget v0, v0, v5

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 214
    iget v0, p0, Lo/eyi;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/eyi;->g:I

    .line 215
    iget v0, p0, Lo/eyi;->d:F

    iget-object v1, p0, Lo/eyi;->f:[F

    aget v1, v1, v5

    add-float/2addr v0, v1

    iput v0, p0, Lo/eyi;->d:F

    .line 212
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 218
    :cond_2
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "value1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eyi;->f:[F

    const/4 v4, 0x0

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eyi;->f:[F

    const/4 v4, 0x1

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value3 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eyi;->f:[F

    const/4 v4, 0x2

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    return-void
.end method

.method public setViewData(FFFF)V
    .locals 6

    .line 144
    const/4 v0, 0x5

    new-array v0, v0, [F

    iput-object v0, p0, Lo/eyi;->f:[F

    .line 145
    iget-object v0, p0, Lo/eyi;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x0

    aput p4, v0, v1

    .line 147
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x1

    aput p3, v0, v1

    .line 148
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x2

    aput p2, v0, v1

    .line 149
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x3

    aput p1, v0, v1

    goto :goto_0

    .line 151
    :cond_0
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 152
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 153
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 154
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x3

    aput p4, v0, v1

    .line 156
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lo/eyi;->d:F

    .line 157
    const/4 v0, 0x0

    iput v0, p0, Lo/eyi;->g:I

    .line 158
    const/4 v5, 0x0

    :goto_1
    const/4 v0, 0x5

    if-ge v5, v0, :cond_2

    .line 159
    iget-object v0, p0, Lo/eyi;->f:[F

    aget v0, v0, v5

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 160
    iget v0, p0, Lo/eyi;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/eyi;->g:I

    .line 161
    iget v0, p0, Lo/eyi;->d:F

    iget-object v1, p0, Lo/eyi;->f:[F

    aget v1, v1, v5

    add-float/2addr v0, v1

    iput v0, p0, Lo/eyi;->d:F

    .line 158
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 164
    :cond_2
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "value1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eyi;->f:[F

    const/4 v4, 0x0

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eyi;->f:[F

    const/4 v4, 0x1

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value3 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eyi;->f:[F

    const/4 v4, 0x2

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value4 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eyi;->f:[F

    const/4 v4, 0x3

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value5 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eyi;->f:[F

    const/4 v4, 0x4

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    return-void
.end method

.method public setViewData(FFFFF)V
    .locals 6

    .line 170
    const/4 v0, 0x5

    new-array v0, v0, [F

    iput-object v0, p0, Lo/eyi;->f:[F

    .line 171
    iget-object v0, p0, Lo/eyi;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x0

    aput p5, v0, v1

    .line 173
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x1

    aput p4, v0, v1

    .line 174
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 175
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x3

    aput p2, v0, v1

    .line 176
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x4

    aput p1, v0, v1

    goto :goto_0

    .line 178
    :cond_0
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 179
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 180
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 181
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x3

    aput p4, v0, v1

    .line 182
    iget-object v0, p0, Lo/eyi;->f:[F

    const/4 v1, 0x4

    aput p5, v0, v1

    .line 184
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lo/eyi;->d:F

    .line 185
    const/4 v0, 0x0

    iput v0, p0, Lo/eyi;->g:I

    .line 186
    const/4 v5, 0x0

    :goto_1
    const/4 v0, 0x5

    if-ge v5, v0, :cond_2

    .line 187
    iget-object v0, p0, Lo/eyi;->f:[F

    aget v0, v0, v5

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 188
    iget v0, p0, Lo/eyi;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/eyi;->g:I

    .line 189
    iget v0, p0, Lo/eyi;->d:F

    iget-object v1, p0, Lo/eyi;->f:[F

    aget v1, v1, v5

    add-float/2addr v0, v1

    iput v0, p0, Lo/eyi;->d:F

    .line 186
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 192
    :cond_2
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "value1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eyi;->f:[F

    const/4 v4, 0x0

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eyi;->f:[F

    const/4 v4, 0x1

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value3 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eyi;->f:[F

    const/4 v4, 0x2

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value4 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eyi;->f:[F

    const/4 v4, 0x3

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value5 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eyi;->f:[F

    const/4 v4, 0x4

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    return-void
.end method
