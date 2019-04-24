.class public Lo/dyu;
.super Lo/nu;
.source "SourceFile"


# instance fields
.field private p:D

.field private u:F


# direct methods
.method public constructor <init>(Lo/oa;Lo/ln;Lo/nv;)V
    .locals 2

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lo/nu;-><init>(Lo/oa;Lo/ln;Lo/nv;)V

    .line 97
    const-wide v0, -0x3810000020000000L    # -3.4028234663852886E38

    iput-wide v0, p0, Lo/dyu;->p:D

    .line 98
    const v0, -0x800001

    iput v0, p0, Lo/dyu;->u:F

    .line 30
    return-void
.end method


# virtual methods
.method protected c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V
    .locals 11

    .line 81
    iget-object v0, p0, Lo/dyu;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v7

    .line 82
    iget-object v0, p0, Lo/dyu;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v8

    .line 83
    iget-object v0, p0, Lo/dyu;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v9

    .line 84
    iget v0, p0, Lo/dyu;->u:F

    cmpl-float v0, v0, p3

    if-nez v0, :cond_0

    .line 85
    iget-object v0, p0, Lo/dyu;->a:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 86
    const-string v0, "sans-serif-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v10

    .line 87
    iget-object v0, p0, Lo/dyu;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 88
    iget-object v0, p0, Lo/dyu;->a:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 90
    :cond_0
    move-object v0, p1

    move-object v1, p2

    move v2, p3

    move v3, p4

    iget-object v4, p0, Lo/dyu;->a:Landroid/graphics/Paint;

    move-object/from16 v5, p5

    move/from16 v6, p6

    invoke-static/range {v0 .. v6}, Lo/oc;->d(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/graphics/Paint;Lo/nz;F)V

    .line 91
    iget-object v0, p0, Lo/dyu;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 92
    iget-object v0, p0, Lo/dyu;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 93
    iget-object v0, p0, Lo/dyu;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 94
    return-void
.end method

.method public d(D)V
    .locals 0

    .line 101
    iput-wide p1, p0, Lo/dyu;->p:D

    .line 102
    return-void
.end method

.method protected d(Landroid/graphics/Canvas;FLo/nz;)V
    .locals 15

    .line 35
    iget-object v0, p0, Lo/dyu;->i:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->C()F

    move-result v7

    .line 36
    iget-object v0, p0, Lo/dyu;->i:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->b()Z

    move-result v8

    .line 37
    iget-object v0, p0, Lo/dyu;->i:Lo/ln;

    iget v0, v0, Lo/ln;->d:I

    mul-int/lit8 v0, v0, 0x2

    new-array v9, v0, [F

    .line 40
    const/4 v10, 0x0

    :goto_0
    array-length v0, v9

    if-ge v10, v0, :cond_1

    .line 41
    if-eqz v8, :cond_0

    .line 42
    iget-object v0, p0, Lo/dyu;->i:Lo/ln;

    iget-object v0, v0, Lo/ln;->c:[F

    div-int/lit8 v1, v10, 0x2

    aget v0, v0, v1

    aput v0, v9, v10

    goto :goto_1

    .line 44
    :cond_0
    iget-object v0, p0, Lo/dyu;->i:Lo/ln;

    iget-object v0, v0, Lo/ln;->a:[F

    div-int/lit8 v1, v10, 0x2

    aget v0, v0, v1

    aput v0, v9, v10

    .line 40
    :goto_1
    add-int/lit8 v10, v10, 0x2

    goto :goto_0

    .line 48
    :cond_1
    iget-object v0, p0, Lo/dyu;->e:Lo/nv;

    invoke-virtual {v0, v9}, Lo/nv;->e([F)V

    .line 50
    const/4 v10, 0x0

    :goto_2
    array-length v0, v9

    if-ge v10, v0, :cond_7

    .line 51
    aget v11, v9, v10

    .line 52
    iget-object v0, p0, Lo/dyu;->l:Lo/oa;

    invoke-virtual {v0, v11}, Lo/oa;->c(F)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 53
    iget-object v0, p0, Lo/dyu;->i:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->r()Lo/mf;

    move-result-object v0

    iget-object v1, p0, Lo/dyu;->i:Lo/ln;

    iget-object v1, v1, Lo/ln;->a:[F

    div-int/lit8 v2, v10, 0x2

    aget v1, v1, v2

    iget-object v2, p0, Lo/dyu;->i:Lo/ln;

    invoke-interface {v0, v1, v2}, Lo/mf;->b(FLo/lh;)Ljava/lang/String;

    move-result-object v12

    .line 54
    iget-object v0, p0, Lo/dyu;->i:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->D()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 56
    iget-object v0, p0, Lo/dyu;->i:Lo/ln;

    iget v0, v0, Lo/ln;->d:I

    add-int/lit8 v0, v0, -0x1

    if-ne v10, v0, :cond_2

    iget-object v0, p0, Lo/dyu;->i:Lo/ln;

    iget v0, v0, Lo/ln;->d:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 57
    iget-object v0, p0, Lo/dyu;->a:Landroid/graphics/Paint;

    invoke-static {v0, v12}, Lo/oc;->d(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v13, v0

    .line 58
    iget-object v0, p0, Lo/dyu;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->b()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    cmpl-float v0, v13, v0

    if-lez v0, :cond_3

    add-float v0, v11, v13

    iget-object v1, p0, Lo/dyu;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->o()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 59
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v13, v0

    sub-float/2addr v11, v0

    goto :goto_3

    .line 61
    :cond_2
    if-nez v10, :cond_3

    .line 62
    iget-object v0, p0, Lo/dyu;->a:Landroid/graphics/Paint;

    invoke-static {v0, v12}, Lo/oc;->d(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v13, v0

    .line 63
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v13, v0

    add-float/2addr v11, v0

    .line 66
    :cond_3
    :goto_3
    iget-wide v0, p0, Lo/dyu;->p:D

    float-to-double v2, v11

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v13

    .line 67
    const/high16 v0, 0x41880000    # 17.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    float-to-double v0, v0

    cmpg-double v0, v13, v0

    if-gez v0, :cond_4

    .line 68
    move-object v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    move v3, v11

    move/from16 v4, p2

    move-object/from16 v5, p3

    move v6, v7

    invoke-virtual/range {v0 .. v6}, Lo/dyu;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    goto :goto_4

    .line 69
    :cond_4
    const/high16 v0, 0x42080000    # 34.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    float-to-double v0, v0

    cmpg-double v0, v13, v0

    if-gez v0, :cond_5

    .line 70
    move-object v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    move v3, v11

    double-to-float v4, v13

    invoke-static {v4}, Lo/oc;->a(F)F

    move-result v4

    add-float v4, v4, p2

    move-object/from16 v5, p3

    move v6, v7

    invoke-virtual/range {v0 .. v6}, Lo/dyu;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    goto :goto_4

    .line 72
    :cond_5
    move-object v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    move v3, v11

    const/high16 v4, 0x41880000    # 17.0f

    invoke-static {v4}, Lo/oc;->b(F)F

    move-result v4

    add-float v4, v4, p2

    move-object/from16 v5, p3

    move v6, v7

    invoke-virtual/range {v0 .. v6}, Lo/dyu;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    .line 50
    :cond_6
    :goto_4
    add-int/lit8 v10, v10, 0x2

    goto/16 :goto_2

    .line 77
    :cond_7
    return-void
.end method

.method public e(F)V
    .locals 0

    .line 105
    iput p1, p0, Lo/dyu;->u:F

    .line 106
    return-void
.end method
