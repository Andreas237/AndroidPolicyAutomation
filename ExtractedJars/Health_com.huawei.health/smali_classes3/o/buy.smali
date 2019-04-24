.class public Lo/buy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/graphics/Canvas;Lo/bwn;FFLandroid/graphics/Paint;Landroid/graphics/Paint;)V
    .locals 18
    .param p1    # Lo/bwn;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 34
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v0}, Lo/buy;->b(F)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p2, v1

    add-float v5, v0, v1

    .line 35
    invoke-virtual/range {p1 .. p1}, Lo/bwn;->h()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 36
    return-void

    .line 39
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lo/bwn;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 40
    invoke-virtual/range {p1 .. p1}, Lo/bwn;->e()Landroid/graphics/PointF;

    move-result-object v7

    .line 41
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 42
    const/high16 v0, 0x41a80000    # 21.0f

    invoke-static {v0}, Lo/buy;->b(F)I

    move-result v0

    int-to-float v9, v0

    .line 43
    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {v0}, Lo/buy;->b(F)I

    move-result v0

    int-to-float v10, v0

    .line 44
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Lo/buy;->b(F)I

    move-result v0

    int-to-float v11, v0

    .line 45
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {v0}, Lo/buy;->b(F)I

    move-result v0

    int-to-float v12, v0

    .line 47
    iget v0, v7, Landroid/graphics/PointF;->x:F

    iget v1, v7, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v5

    invoke-virtual {v8, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 48
    iget v0, v7, Landroid/graphics/PointF;->x:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v10, v1

    sub-float/2addr v0, v1

    iget v1, v7, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v5

    sub-float/2addr v1, v11

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    invoke-virtual {v8, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 49
    iget v0, v7, Landroid/graphics/PointF;->x:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v10, v1

    add-float/2addr v0, v1

    iget v1, v7, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v5

    sub-float/2addr v1, v11

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    invoke-virtual {v8, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 50
    invoke-virtual {v8}, Landroid/graphics/Path;->close()V

    .line 52
    move-object/from16 v0, p0

    move-object/from16 v1, p4

    invoke-virtual {v0, v8, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 53
    move-object/from16 v0, p5

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v13

    .line 55
    new-instance v0, Landroid/graphics/RectF;

    iget v1, v7, Landroid/graphics/PointF;->x:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v13, v2

    sub-float/2addr v1, v2

    sub-float/2addr v1, v12

    iget v2, v7, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, v5

    sub-float/2addr v2, v11

    sub-float/2addr v2, v9

    iget v3, v7, Landroid/graphics/PointF;->x:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v13, v4

    add-float/2addr v3, v4

    add-float/2addr v3, v12

    iget v4, v7, Landroid/graphics/PointF;->y:F

    sub-float/2addr v4, v5

    sub-float/2addr v4, v11

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object v14, v0

    .line 57
    iget v0, v14, Landroid/graphics/RectF;->right:F

    sub-float v15, v0, p3

    .line 59
    iget v0, v7, Landroid/graphics/PointF;->x:F

    move/from16 v16, v0

    .line 60
    const/high16 v17, 0x3f800000    # 1.0f

    .line 62
    const/4 v0, 0x0

    cmpl-float v0, v15, v0

    if-lez v0, :cond_1

    .line 63
    iget v0, v14, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v15

    sub-float v0, v0, v17

    iput v0, v14, Landroid/graphics/RectF;->right:F

    .line 64
    iget v0, v14, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v15

    sub-float v0, v0, v17

    iput v0, v14, Landroid/graphics/RectF;->left:F

    .line 65
    iget v0, v7, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v15

    sub-float v16, v0, v17

    goto :goto_0

    .line 66
    :cond_1
    iget v0, v14, Landroid/graphics/RectF;->left:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 67
    iget v0, v14, Landroid/graphics/RectF;->right:F

    iget v1, v14, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    add-float v0, v0, v17

    iput v0, v14, Landroid/graphics/RectF;->right:F

    .line 68
    iget v0, v7, Landroid/graphics/PointF;->x:F

    iget v1, v14, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    add-float v16, v0, v17

    .line 69
    move/from16 v0, v17

    iput v0, v14, Landroid/graphics/RectF;->left:F

    .line 72
    :cond_2
    :goto_0
    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    move-object/from16 v2, p0

    move-object/from16 v3, p4

    invoke-virtual {v2, v14, v0, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 74
    iget v0, v14, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    invoke-static/range {p5 .. p5}, Lo/buy;->e(Landroid/graphics/Paint;)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    move/from16 v2, v16

    move-object/from16 v3, p5

    invoke-virtual {v1, v6, v2, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 75
    return-void
.end method

.method public static b(F)I
    .locals 3

    .line 78
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 79
    mul-float v0, p0, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static c(Lo/bwn;Lo/bwn;)Lo/bwn;
    .locals 2

    .line 97
    invoke-virtual {p1}, Lo/bwn;->q()F

    move-result v0

    invoke-virtual {p0}, Lo/bwn;->q()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static c(Lo/bwn;)Z
    .locals 2

    .line 137
    invoke-virtual {p0}, Lo/bwn;->w()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/bwn;->w()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 138
    invoke-virtual {p0}, Lo/bwn;->w()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 137
    :goto_0
    return v0
.end method

.method public static d()F
    .locals 2

    .line 93
    const/high16 v0, 0x41a80000    # 21.0f

    invoke-static {v0}, Lo/buy;->b(F)I

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v1}, Lo/buy;->b(F)I

    move-result v1

    add-int/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v1}, Lo/buy;->b(F)I

    move-result v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    return v0
.end method

.method public static d(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bwn;>;)I"
        }
    .end annotation

    .line 122
    const/4 v2, 0x0

    .line 123
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 124
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bwn;

    invoke-virtual {v0}, Lo/bwn;->h()F

    move-result v0

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/bwn;

    invoke-virtual {v1}, Lo/bwn;->h()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 125
    move v2, v3

    .line 123
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 128
    :cond_1
    return v2
.end method

.method public static d(Landroid/view/MotionEvent;Landroid/graphics/PointF;FLo/bwo$d;)V
    .locals 3

    .line 105
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p1, Landroid/graphics/PointF;->x:F

    sub-float v2, v0, v1

    .line 106
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v1, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v1, p2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 107
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v1, p2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 108
    if-eqz p3, :cond_3

    .line 109
    const/4 v0, 0x0

    cmpl-float v0, v2, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p3, v0}, Lo/bwo$d;->c(Z)V

    goto :goto_2

    .line 113
    :cond_1
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v1, p2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 114
    if-eqz p3, :cond_3

    .line 115
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v1, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-interface {p3, v0}, Lo/bwo$d;->c(Z)V

    .line 119
    :cond_3
    :goto_2
    return-void
.end method

.method public static d(Landroid/graphics/PointF;Lo/bwn;Landroid/graphics/PointF;)Z
    .locals 2

    .line 132
    iget v0, p2, Landroid/graphics/PointF;->x:F

    iget v1, p0, Landroid/graphics/PointF;->x:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    iget v0, p2, Landroid/graphics/PointF;->x:F

    invoke-virtual {p1}, Lo/bwn;->k()F

    move-result v1

    add-float/2addr v0, v1

    iget v1, p0, Landroid/graphics/PointF;->x:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget v0, p2, Landroid/graphics/PointF;->y:F

    iget v1, p0, Landroid/graphics/PointF;->y:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget v0, p2, Landroid/graphics/PointF;->y:F

    .line 133
    invoke-virtual {p1}, Lo/bwn;->g()F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    iget v1, p0, Landroid/graphics/PointF;->y:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 132
    :goto_0
    return v0
.end method

.method private static e(Landroid/graphics/Paint;)F
    .locals 2

    .line 83
    invoke-virtual {p0}, Landroid/graphics/Paint;->ascent()F

    move-result v0

    neg-float v0, v0

    invoke-virtual {p0}, Landroid/graphics/Paint;->descent()F

    move-result v1

    sub-float/2addr v0, v1

    return v0
.end method

.method public static e(Lo/bwn;Lo/bwn;)Lo/bwn;
    .locals 2

    .line 101
    invoke-virtual {p1}, Lo/bwn;->g()F

    move-result v0

    invoke-virtual {p0}, Lo/bwn;->g()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method
