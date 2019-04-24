.class public Lo/fdq;
.super Lo/eir;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V
    .locals 0

    .line 25
    invoke-direct/range {p0 .. p5}, Lo/eir;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    .line 26
    return-void
.end method


# virtual methods
.method public e(Landroid/graphics/Canvas;)V
    .locals 12

    .line 35
    iget-object v0, p0, Lo/fdq;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-nez v0, :cond_0

    .line 36
    return-void

    .line 38
    :cond_0
    iget-object v0, p0, Lo/fdq;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 40
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v5

    .line 43
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lo/fdq;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->o()F

    move-result v1

    iget-object v2, p0, Lo/fdq;->l:Lo/oa;

    invoke-virtual {v2}, Lo/oa;->n()F

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 45
    invoke-virtual {p0}, Lo/fdq;->a()[F

    move-result-object v6

    .line 47
    iget-object v0, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fdq;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    iget-object v0, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1}, Lo/evw;->c(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 49
    iget-object v0, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fdq;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->t()Landroid/graphics/DashPathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 51
    iget-object v7, p0, Lo/fdq;->i:Landroid/graphics/Path;

    .line 52
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 54
    const/4 v8, 0x0

    :goto_0
    array-length v0, v6

    if-ge v8, v0, :cond_5

    .line 56
    array-length v0, v6

    add-int/lit8 v0, v0, -0x1

    if-eq v8, v0, :cond_1

    array-length v0, v6

    add-int/lit8 v0, v0, -0x2

    if-eq v8, v0, :cond_1

    if-eqz v8, :cond_1

    const/4 v0, 0x1

    if-ne v8, v0, :cond_3

    .line 57
    :cond_1
    iget-object v0, p0, Lo/fdq;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->t()Landroid/graphics/DashPathEffect;

    move-result-object v9

    .line 58
    iget-object v0, p0, Lo/fdq;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->a()I

    move-result v10

    .line 60
    iget-object v0, p0, Lo/fdq;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->S()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 61
    invoke-static {v10}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {v10}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {v10}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    const/16 v3, 0xd

    invoke-static {v3, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v11

    goto :goto_1

    .line 63
    :cond_2
    iget-object v0, p0, Lo/fdq;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->Q()I

    move-result v11

    .line 66
    :goto_1
    iget-object v0, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 67
    iget-object v0, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 68
    invoke-virtual {p0, v7, v8, v6}, Lo/fdq;->b(Landroid/graphics/Path;I[F)Landroid/graphics/Path;

    move-result-object v0

    iget-object v1, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 69
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 70
    iget-object v0, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 71
    iget-object v0, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 72
    goto :goto_3

    .line 74
    :cond_3
    iget-object v0, p0, Lo/fdq;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->a()I

    move-result v9

    .line 76
    iget-object v0, p0, Lo/fdq;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->S()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 77
    invoke-static {v9}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {v9}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {v9}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    const/16 v3, 0xd

    invoke-static {v3, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v10

    goto :goto_2

    .line 79
    :cond_4
    iget-object v0, p0, Lo/fdq;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->R()I

    move-result v10

    .line 81
    :goto_2
    iget-object v0, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 83
    invoke-virtual {p0, v7, v8, v6}, Lo/fdq;->b(Landroid/graphics/Path;I[F)Landroid/graphics/Path;

    move-result-object v0

    iget-object v1, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 84
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 85
    iget-object v0, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 54
    :goto_3
    add-int/lit8 v8, v8, 0x2

    goto/16 :goto_0

    .line 89
    :cond_5
    iget-boolean v0, p0, Lo/fdq;->q:Z

    if-eqz v0, :cond_6

    .line 90
    iget-object v0, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/DashPathEffect;

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 91
    iget-object v0, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    iget v1, p0, Lo/fdq;->x:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 92
    const/4 v0, 0x2

    new-array v8, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v8, v1

    iget v0, p0, Lo/fdq;->v:I

    int-to-float v0, v0

    const/4 v1, 0x1

    aput v0, v8, v1

    .line 93
    iget-object v0, p0, Lo/fdq;->e:Lo/nv;

    invoke-virtual {v0, v8}, Lo/nv;->e([F)V

    .line 94
    const/4 v0, 0x1

    aget v0, v8, v0

    invoke-virtual {p0, v7, v0}, Lo/fdq;->e(Landroid/graphics/Path;F)Landroid/graphics/Path;

    move-result-object v0

    iget-object v1, p0, Lo/fdq;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 95
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 98
    :cond_6
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 101
    :cond_7
    iget-object v0, p0, Lo/fdq;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->K()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 102
    invoke-virtual {p0, p1}, Lo/fdq;->a(Landroid/graphics/Canvas;)V

    .line 104
    :cond_8
    return-void

    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x40a00000    # 5.0f
    .end array-data
.end method
