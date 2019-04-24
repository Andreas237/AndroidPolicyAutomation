.class public Lo/end;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:Landroid/content/Context;

.field private c:F

.field private d:F

.field private e:Landroid/graphics/Paint;

.field private f:[F

.field private h:I

.field private i:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 40
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lo/end;->h:I

    .line 41
    iput-object p1, p0, Lo/end;->b:Landroid/content/Context;

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 45
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lo/end;->h:I

    .line 46
    iput-object p1, p0, Lo/end;->b:Landroid/content/Context;

    .line 47
    const/4 v0, 0x5

    new-array v0, v0, [F

    iput-object v0, p0, Lo/end;->f:[F

    .line 48
    const/4 v0, 0x5

    new-array v0, v0, [I

    iput-object v0, p0, Lo/end;->i:[I

    .line 49
    iget-object v0, p0, Lo/end;->i:[I

    iget-object v1, p0, Lo/end;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->fitness_detail_calorie_total_data_walk_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 50
    iget-object v0, p0, Lo/end;->i:[I

    iget-object v1, p0, Lo/end;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->fitness_detail_calorie_total_data_run_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 51
    iget-object v0, p0, Lo/end;->i:[I

    iget-object v1, p0, Lo/end;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->fitness_detail_calorie_total_data_climb_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 52
    iget-object v0, p0, Lo/end;->i:[I

    iget-object v1, p0, Lo/end;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->fitness_detail_calorie_total_data_climb_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    .line 53
    iget-object v0, p0, Lo/end;->i:[I

    iget-object v1, p0, Lo/end;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->fitness_detail_calorie_total_data_other_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x4

    aput v1, v0, v2

    .line 54
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 15

    .line 66
    move-object/from16 v0, p1

    invoke-super {p0, v0}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 69
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/end;->e:Landroid/graphics/Paint;

    .line 70
    iget-object v0, p0, Lo/end;->e:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 71
    iget-object v0, p0, Lo/end;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 72
    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 73
    iget v8, p0, Lo/end;->a:F

    .line 74
    iget v0, p0, Lo/end;->h:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 75
    iget v0, p0, Lo/end;->a:F

    iget v1, p0, Lo/end;->h:I

    add-int/lit8 v1, v1, -0x1

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    const/4 v2, 0x1

    invoke-static {v2, v1}, Lo/dbk;->c(IF)F

    move-result v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/end;->d:F

    sub-float v8, v0, v1

    .line 77
    :cond_0
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mWidth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/end;->a:F

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

    iget v3, p0, Lo/end;->h:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x0

    aget v9, v0, v1

    .line 79
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x0

    aget v10, v0, v1

    .line 81
    iget-object v0, p0, Lo/end;->e:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/end;->i:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 82
    iget v0, p0, Lo/end;->d:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/end;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v2, p0, Lo/end;->d:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lo/end;->e:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 83
    iget v0, p0, Lo/end;->a:F

    iget v1, p0, Lo/end;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lo/end;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v2, p0, Lo/end;->d:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lo/end;->e:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 84
    new-instance v11, Landroid/graphics/RectF;

    iget v0, p0, Lo/end;->d:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/end;->a:F

    iget v2, p0, Lo/end;->d:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget v2, p0, Lo/end;->d:F

    const/4 v3, 0x0

    invoke-direct {v11, v0, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 85
    iget-object v0, p0, Lo/end;->e:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v11, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 88
    const/4 v12, 0x0

    :goto_0
    const/4 v0, 0x5

    if-ge v12, v0, :cond_2

    .line 89
    iget-object v0, p0, Lo/end;->f:[F

    aget v0, v0, v12

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 90
    iget-object v0, p0, Lo/end;->i:[I

    aget v9, v0, v12

    .line 91
    goto :goto_1

    .line 88
    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 96
    :cond_2
    :goto_1
    const/4 v12, 0x4

    :goto_2
    if-ltz v12, :cond_4

    .line 97
    iget-object v0, p0, Lo/end;->f:[F

    aget v0, v0, v12

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 98
    iget-object v0, p0, Lo/end;->i:[I

    aget v10, v0, v12

    .line 99
    goto :goto_3

    .line 96
    :cond_3
    add-int/lit8 v12, v12, -0x1

    goto :goto_2

    .line 103
    :cond_4
    :goto_3
    iget v0, p0, Lo/end;->d:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v12, v0, v1

    .line 105
    const/4 v13, 0x0

    :goto_4
    const/4 v0, 0x5

    if-ge v13, v0, :cond_8

    .line 106
    iget-object v0, p0, Lo/end;->f:[F

    aget v0, v0, v13

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    .line 107
    iget-object v0, p0, Lo/end;->e:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/end;->i:[I

    aget v1, v1, v13

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 108
    iget-object v0, p0, Lo/end;->i:[I

    aget v0, v0, v13

    if-ne v9, v0, :cond_5

    .line 110
    iget-object v0, p0, Lo/end;->e:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 111
    new-instance v14, Landroid/graphics/RectF;

    iget v0, p0, Lo/end;->a:F

    iget v1, p0, Lo/end;->d:F

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v14, v2, v3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 112
    iget-object v0, p0, Lo/end;->e:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v14, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 113
    iget-object v0, p0, Lo/end;->e:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/end;->i:[I

    aget v1, v1, v13

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 114
    add-float v6, v7, v12

    .line 115
    iget-object v0, p0, Lo/end;->e:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v12, v12, v12, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 116
    goto :goto_5

    .line 117
    :cond_5
    const/4 v0, 0x1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/dbk;->c(IF)F

    move-result v0

    add-float v6, v7, v0

    .line 118
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

    iget v3, p0, Lo/end;->a:F

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

    iget v3, p0, Lo/end;->a:F

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

    .line 121
    iget-object v0, p0, Lo/end;->f:[F

    aget v0, v0, v13

    iget v1, p0, Lo/end;->c:F

    div-float/2addr v0, v1

    mul-float/2addr v0, v8

    add-float v7, v6, v0

    .line 122
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

    iget v3, p0, Lo/end;->a:F

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

    .line 123
    iget-object v0, p0, Lo/end;->i:[I

    aget v0, v0, v13

    if-ne v10, v0, :cond_6

    .line 124
    iget v7, p0, Lo/end;->a:F

    .line 125
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

    .line 126
    sub-float v0, v7, v12

    iget-object v1, p0, Lo/end;->e:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v12, v12, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 127
    move-object/from16 v0, p1

    move v1, v6

    sub-float v3, v7, v12

    iget v4, p0, Lo/end;->d:F

    iget-object v5, p0, Lo/end;->e:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_6

    .line 129
    :cond_6
    move-object/from16 v0, p1

    move v1, v6

    move v3, v7

    iget v4, p0, Lo/end;->d:F

    iget-object v5, p0, Lo/end;->e:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 105
    :cond_7
    :goto_6
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_4

    .line 133
    :cond_8
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    .line 58
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 59
    invoke-virtual {p0}, Lo/end;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lo/end;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/end;->a:F

    .line 60
    invoke-virtual {p0}, Lo/end;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Lo/end;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/end;->d:F

    .line 61
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onMesure mWidth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/end;->a:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mHeight = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/end;->d:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 139
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 140
    return-void
.end method

.method public setColors(III)V
    .locals 2

    .line 228
    iget-object v0, p0, Lo/end;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x0

    aput p3, v0, v1

    .line 230
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 231
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x2

    aput p1, v0, v1

    goto :goto_0

    .line 234
    :cond_0
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 235
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 236
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 238
    :goto_0
    return-void
.end method

.method public setColors(IIII)V
    .locals 2

    .line 242
    iget-object v0, p0, Lo/end;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 243
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x0

    aput p4, v0, v1

    .line 244
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x1

    aput p3, v0, v1

    .line 245
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x2

    aput p2, v0, v1

    .line 246
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x3

    aput p1, v0, v1

    goto :goto_0

    .line 249
    :cond_0
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 250
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 251
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 252
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x3

    aput p4, v0, v1

    .line 254
    :goto_0
    return-void
.end method

.method public setColors(IIIII)V
    .locals 2

    .line 257
    iget-object v0, p0, Lo/end;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x0

    aput p5, v0, v1

    .line 259
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x1

    aput p4, v0, v1

    .line 260
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 261
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x3

    aput p2, v0, v1

    .line 262
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x4

    aput p1, v0, v1

    goto :goto_0

    .line 264
    :cond_0
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 265
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 266
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 267
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x3

    aput p4, v0, v1

    .line 268
    iget-object v0, p0, Lo/end;->i:[I

    const/4 v1, 0x4

    aput p5, v0, v1

    .line 270
    :goto_0
    return-void
.end method

.method public setViewData(FFF)V
    .locals 6

    .line 201
    const/4 v0, 0x5

    new-array v0, v0, [F

    iput-object v0, p0, Lo/end;->f:[F

    .line 202
    iget-object v0, p0, Lo/end;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x0

    aput p3, v0, v1

    .line 204
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 205
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x2

    aput p1, v0, v1

    goto :goto_0

    .line 207
    :cond_0
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 208
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 209
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 211
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lo/end;->c:F

    .line 212
    const/4 v0, 0x0

    iput v0, p0, Lo/end;->h:I

    .line 213
    const/4 v5, 0x0

    :goto_1
    const/4 v0, 0x5

    if-ge v5, v0, :cond_2

    .line 214
    iget-object v0, p0, Lo/end;->f:[F

    aget v0, v0, v5

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 215
    iget v0, p0, Lo/end;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/end;->h:I

    .line 216
    iget v0, p0, Lo/end;->c:F

    iget-object v1, p0, Lo/end;->f:[F

    aget v1, v1, v5

    add-float/2addr v0, v1

    iput v0, p0, Lo/end;->c:F

    .line 213
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 219
    :cond_2
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "value1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/end;->f:[F

    const/4 v4, 0x0

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/end;->f:[F

    const/4 v4, 0x1

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value3 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/end;->f:[F

    const/4 v4, 0x2

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    return-void
.end method

.method public setViewData(FFFF)V
    .locals 6

    .line 145
    const/4 v0, 0x5

    new-array v0, v0, [F

    iput-object v0, p0, Lo/end;->f:[F

    .line 146
    iget-object v0, p0, Lo/end;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x0

    aput p4, v0, v1

    .line 148
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x1

    aput p3, v0, v1

    .line 149
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x2

    aput p2, v0, v1

    .line 150
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x3

    aput p1, v0, v1

    goto :goto_0

    .line 152
    :cond_0
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 153
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 154
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 155
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x3

    aput p4, v0, v1

    .line 157
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lo/end;->c:F

    .line 158
    const/4 v0, 0x0

    iput v0, p0, Lo/end;->h:I

    .line 159
    const/4 v5, 0x0

    :goto_1
    const/4 v0, 0x5

    if-ge v5, v0, :cond_2

    .line 160
    iget-object v0, p0, Lo/end;->f:[F

    aget v0, v0, v5

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 161
    iget v0, p0, Lo/end;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/end;->h:I

    .line 162
    iget v0, p0, Lo/end;->c:F

    iget-object v1, p0, Lo/end;->f:[F

    aget v1, v1, v5

    add-float/2addr v0, v1

    iput v0, p0, Lo/end;->c:F

    .line 159
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 165
    :cond_2
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "value1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/end;->f:[F

    const/4 v4, 0x0

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/end;->f:[F

    const/4 v4, 0x1

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value3 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/end;->f:[F

    const/4 v4, 0x2

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value4 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/end;->f:[F

    const/4 v4, 0x3

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value5 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/end;->f:[F

    const/4 v4, 0x4

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    return-void
.end method

.method public setViewData(FFFFF)V
    .locals 6

    .line 171
    const/4 v0, 0x5

    new-array v0, v0, [F

    iput-object v0, p0, Lo/end;->f:[F

    .line 172
    iget-object v0, p0, Lo/end;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x0

    aput p5, v0, v1

    .line 174
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x1

    aput p4, v0, v1

    .line 175
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 176
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x3

    aput p2, v0, v1

    .line 177
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x4

    aput p1, v0, v1

    goto :goto_0

    .line 179
    :cond_0
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 180
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 181
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x2

    aput p3, v0, v1

    .line 182
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x3

    aput p4, v0, v1

    .line 183
    iget-object v0, p0, Lo/end;->f:[F

    const/4 v1, 0x4

    aput p5, v0, v1

    .line 185
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lo/end;->c:F

    .line 186
    const/4 v0, 0x0

    iput v0, p0, Lo/end;->h:I

    .line 187
    const/4 v5, 0x0

    :goto_1
    const/4 v0, 0x5

    if-ge v5, v0, :cond_2

    .line 188
    iget-object v0, p0, Lo/end;->f:[F

    aget v0, v0, v5

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 189
    iget v0, p0, Lo/end;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/end;->h:I

    .line 190
    iget v0, p0, Lo/end;->c:F

    iget-object v1, p0, Lo/end;->f:[F

    aget v1, v1, v5

    add-float/2addr v0, v1

    iput v0, p0, Lo/end;->c:F

    .line 187
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 193
    :cond_2
    const-string v0, "TotalDataRectView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "value1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/end;->f:[F

    const/4 v4, 0x0

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/end;->f:[F

    const/4 v4, 0x1

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value3 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/end;->f:[F

    const/4 v4, 0x2

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value4 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/end;->f:[F

    const/4 v4, 0x3

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value5 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/end;->f:[F

    const/4 v4, 0x4

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    return-void
.end method
