.class public abstract Lo/eku;
.super Lo/nn;
.source "SourceFile"


# instance fields
.field protected a:Landroid/graphics/Canvas;

.field protected b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field protected c:Lo/ejh;

.field protected d:Landroid/graphics/Paint;

.field protected e:Landroid/graphics/Bitmap$Config;

.field protected m:Landroid/graphics/Path;

.field protected o:Landroid/graphics/Path;

.field protected p:Landroid/graphics/Path;

.field private t:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Lo/ejh;Lo/la;Lo/oa;)V
    .locals 2

    .line 63
    invoke-direct {p0, p2, p3}, Lo/nn;-><init>(Lo/la;Lo/oa;)V

    .line 51
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/eku;->t:Landroid/graphics/Paint;

    .line 56
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v0, p0, Lo/eku;->e:Landroid/graphics/Bitmap$Config;

    .line 58
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/eku;->p:Landroid/graphics/Path;

    .line 59
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/eku;->m:Landroid/graphics/Path;

    .line 222
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/eku;->o:Landroid/graphics/Path;

    .line 64
    iput-object p1, p0, Lo/eku;->c:Lo/ejh;

    .line 66
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/eku;->d:Landroid/graphics/Paint;

    .line 67
    iget-object v0, p0, Lo/eku;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 68
    iget-object v0, p0, Lo/eku;->d:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 69
    return-void
.end method

.method private b(Landroid/graphics/Bitmap;II)Z
    .locals 1

    .line 113
    if-nez p1, :cond_0

    .line 114
    const/4 v0, 0x0

    return v0

    .line 117
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-eq v0, p2, :cond_1

    .line 118
    const/4 v0, 0x0

    return v0

    .line 120
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-eq v0, p3, :cond_2

    .line 121
    const/4 v0, 0x0

    return v0

    .line 124
    :cond_2
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;)V
    .locals 9

    .line 78
    iget-object v0, p0, Lo/eku;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->o()F

    move-result v0

    float-to-int v3, v0

    .line 79
    iget-object v0, p0, Lo/eku;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->n()F

    move-result v0

    float-to-int v4, v0

    .line 82
    const/4 v5, 0x0

    .line 84
    iget-object v0, p0, Lo/eku;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lo/eku;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/Bitmap;

    .line 88
    :cond_0
    if-eqz v5, :cond_1

    invoke-direct {p0, v5, v3, v4}, Lo/eku;->b(Landroid/graphics/Bitmap;II)Z

    move-result v0

    if-nez v0, :cond_3

    .line 90
    :cond_1
    if-lez v3, :cond_2

    if-lez v4, :cond_2

    .line 91
    iget-object v0, p0, Lo/eku;->e:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 92
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/eku;->b:Ljava/lang/ref/WeakReference;

    .line 93
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lo/eku;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lo/eku;->a:Landroid/graphics/Canvas;

    goto :goto_0

    .line 95
    :cond_2
    return-void

    .line 98
    :cond_3
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 100
    iget-object v0, p0, Lo/eku;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getLineData()Lo/ela;

    move-result-object v6

    .line 102
    invoke-virtual {v6}, Lo/ela;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/ekz;

    .line 104
    invoke-interface {v8}, Lo/ekz;->j()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 105
    invoke-virtual {p0, p1, v8}, Lo/eku;->e(Landroid/graphics/Canvas;Lo/ekz;)V

    .line 106
    :cond_4
    goto :goto_1

    .line 108
    :cond_5
    iget-object v0, p0, Lo/eku;->t:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->reset()V

    .line 109
    iget-object v0, p0, Lo/eku;->t:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v5, v1, v2, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 110
    return-void
.end method

.method protected abstract a(Lo/ekz;)V
.end method

.method protected abstract c(Landroid/graphics/Canvas;Lo/ekz;)V
.end method

.method protected c(Lo/mr;)Z
    .locals 1

    .line 305
    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/graphics/Canvas;)V
    .locals 0

    .line 298
    return-void
.end method

.method public e()V
    .locals 0

    .line 73
    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 21

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eku;->c:Lo/ejh;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/eku;->c(Lo/mr;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 229
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eku;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getData()Lo/lt;

    move-result-object v0

    invoke-virtual {v0}, Lo/lt;->h()Ljava/util/List;

    move-result-object v9

    .line 231
    const/4 v10, 0x0

    :goto_0
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_7

    .line 233
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/ekz;

    .line 235
    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lo/eku;->c(Lo/mz;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 236
    goto/16 :goto_4

    .line 239
    :cond_0
    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lo/eku;->e(Lo/mz;)V

    .line 241
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eku;->c:Lo/ejh;

    invoke-interface {v11}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v12

    .line 244
    invoke-interface {v11}, Lo/ekz;->K()F

    move-result v0

    const/high16 v1, 0x3fe00000    # 1.75f

    mul-float/2addr v0, v1

    float-to-int v13, v0

    .line 246
    invoke-interface {v11}, Lo/ekz;->ac()Z

    move-result v0

    if-nez v0, :cond_1

    .line 247
    div-int/lit8 v13, v13, 0x2

    .line 249
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eku;->f:Lo/nk$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eku;->c:Lo/ejh;

    invoke-virtual {v0, v1, v11}, Lo/nk$d;->b(Lo/mn;Lo/mv;)V

    .line 251
    move-object v0, v12

    move-object v1, v11

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/eku;->i:Lo/la;

    invoke-virtual {v2}, Lo/la;->b()F

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/eku;->i:Lo/la;

    .line 252
    invoke-virtual {v3}, Lo/la;->d()F

    move-result v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/eku;->f:Lo/nk$d;

    iget v4, v4, Lo/nk$d;->c:I

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/eku;->f:Lo/nk$d;

    iget v5, v5, Lo/nk$d;->d:I

    .line 251
    invoke-virtual/range {v0 .. v5}, Lo/eim;->e(Lo/ekz;FFII)[F

    move-result-object v14

    .line 254
    invoke-interface {v11}, Lo/ekz;->z()Lo/nz;

    move-result-object v0

    invoke-static {v0}, Lo/nz;->b(Lo/nz;)Lo/nz;

    move-result-object v15

    .line 255
    iget v0, v15, Lo/nz;->e:F

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    iput v0, v15, Lo/nz;->e:F

    .line 256
    iget v0, v15, Lo/nz;->c:F

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    iput v0, v15, Lo/nz;->c:F

    .line 258
    const/16 v16, 0x0

    :goto_1
    array-length v0, v14

    move/from16 v1, v16

    if-ge v1, v0, :cond_6

    .line 260
    aget v17, v14, v16

    .line 261
    add-int/lit8 v0, v16, 0x1

    aget v18, v14, v0

    .line 263
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eku;->l:Lo/oa;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_2

    .line 264
    goto/16 :goto_3

    .line 266
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eku;->l:Lo/oa;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eku;->l:Lo/oa;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/oa;->g(F)Z

    move-result v0

    if-nez v0, :cond_3

    .line 267
    goto/16 :goto_2

    .line 269
    :cond_3
    div-int/lit8 v0, v16, 0x2

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eku;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int/2addr v0, v1

    invoke-interface {v11, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v19

    .line 271
    invoke-interface {v11}, Lo/ekz;->v()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 272
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-interface {v11}, Lo/ekz;->l()Lo/ml;

    move-result-object v2

    invoke-virtual/range {v19 .. v19}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v3

    move-object/from16 v4, v19

    move v5, v10

    move/from16 v6, v17

    int-to-float v7, v13

    sub-float v7, v18, v7

    div-int/lit8 v8, v16, 0x2

    .line 273
    invoke-interface {v11, v8}, Lo/ekz;->b(I)I

    move-result v8

    .line 272
    invoke-virtual/range {v0 .. v8}, Lo/eku;->d(Landroid/graphics/Canvas;Lo/ml;FLcom/github/mikephil/charting/data/Entry;IFFI)V

    .line 276
    :cond_4
    invoke-virtual/range {v19 .. v19}, Lcom/github/mikephil/charting/data/Entry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v11}, Lo/ekz;->x()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 278
    invoke-virtual/range {v19 .. v19}, Lcom/github/mikephil/charting/data/Entry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v20

    .line 280
    move-object/from16 v0, p1

    move-object/from16 v1, v20

    iget v2, v15, Lo/nz;->e:F

    add-float v2, v2, v17

    float-to-int v2, v2

    iget v3, v15, Lo/nz;->c:F

    add-float v3, v3, v18

    float-to-int v3, v3

    .line 285
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    .line 286
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    .line 280
    invoke-static/range {v0 .. v5}, Lo/oc;->d(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    .line 258
    :cond_5
    :goto_2
    add-int/lit8 v16, v16, 0x2

    goto/16 :goto_1

    .line 290
    :cond_6
    :goto_3
    invoke-static {v15}, Lo/nz;->c(Lo/nz;)V

    .line 231
    :goto_4
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 293
    :cond_7
    return-void
.end method

.method protected e(Landroid/graphics/Canvas;Lo/ekz;)V
    .locals 2

    .line 129
    invoke-interface {p2}, Lo/ekz;->C()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    .line 130
    return-void

    .line 132
    :cond_0
    iget-object v0, p0, Lo/eku;->h:Landroid/graphics/Paint;

    invoke-interface {p2}, Lo/ekz;->X()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 133
    iget-object v0, p0, Lo/eku;->h:Landroid/graphics/Paint;

    invoke-interface {p2}, Lo/ekz;->R()Landroid/graphics/DashPathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 135
    sget-object v0, Lo/eku$4;->d:[I

    invoke-interface {p2}, Lo/ekz;->h()Lo/ekv$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/ekv$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    nop

    .line 139
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lo/eku;->c(Landroid/graphics/Canvas;Lo/ekz;)V

    .line 140
    goto :goto_0

    .line 143
    :pswitch_1
    invoke-virtual {p0, p2}, Lo/eku;->a(Lo/ekz;)V

    .line 144
    goto :goto_0

    .line 147
    :pswitch_2
    invoke-virtual {p0, p2}, Lo/eku;->e(Lo/ekz;)V

    .line 151
    :goto_0
    iget-object v0, p0, Lo/eku;->h:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 152
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected e(Landroid/graphics/Canvas;Lo/ekz;Landroid/graphics/Path;Lo/nv;Lo/nk$d;)V
    .locals 0

    .line 211
    return-void
.end method

.method protected e(Lo/ekz;)V
    .locals 13

    .line 156
    iget-object v0, p0, Lo/eku;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v7

    .line 158
    iget-object v0, p0, Lo/eku;->c:Lo/ejh;

    invoke-interface {p1}, Lo/ekz;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/lp$b;)Lo/nv;

    move-result-object v8

    .line 160
    iget-object v0, p0, Lo/eku;->f:Lo/nk$d;

    iget-object v1, p0, Lo/eku;->c:Lo/ejh;

    invoke-virtual {v0, v1, p1}, Lo/nk$d;->b(Lo/mn;Lo/mv;)V

    .line 162
    iget-object v0, p0, Lo/eku;->p:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 164
    iget-object v0, p0, Lo/eku;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    .line 166
    iget-object v0, p0, Lo/eku;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->c:I

    invoke-interface {p1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v9

    .line 167
    move-object v10, v9

    .line 170
    iget-object v0, p0, Lo/eku;->p:Landroid/graphics/Path;

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v7

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 172
    iget-object v0, p0, Lo/eku;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->c:I

    add-int/lit8 v11, v0, 0x1

    :goto_0
    iget-object v0, p0, Lo/eku;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    iget-object v1, p0, Lo/eku;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int/2addr v0, v1

    if-gt v11, v0, :cond_0

    .line 174
    move-object v9, v10

    .line 175
    invoke-interface {p1, v11}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v10

    .line 177
    invoke-virtual {v9}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    .line 178
    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v9}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float v12, v0, v1

    .line 180
    iget-object v0, p0, Lo/eku;->p:Landroid/graphics/Path;

    move v1, v12

    .line 181
    invoke-virtual {v9}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v7

    move v3, v12

    .line 182
    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v4

    mul-float/2addr v4, v7

    .line 183
    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v5

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v6

    mul-float/2addr v6, v7

    .line 180
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 172
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 188
    :cond_0
    invoke-interface {p1}, Lo/ekz;->V()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 190
    iget-object v0, p0, Lo/eku;->m:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 191
    iget-object v0, p0, Lo/eku;->m:Landroid/graphics/Path;

    iget-object v1, p0, Lo/eku;->p:Landroid/graphics/Path;

    invoke-virtual {v0, v1}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 193
    move-object v0, p0

    iget-object v1, p0, Lo/eku;->a:Landroid/graphics/Canvas;

    move-object v2, p1

    iget-object v3, p0, Lo/eku;->m:Landroid/graphics/Path;

    move-object v4, v8

    iget-object v5, p0, Lo/eku;->f:Lo/nk$d;

    invoke-virtual/range {v0 .. v5}, Lo/eku;->e(Landroid/graphics/Canvas;Lo/ekz;Landroid/graphics/Path;Lo/nv;Lo/nk$d;)V

    .line 196
    :cond_1
    iget-object v0, p0, Lo/eku;->h:Landroid/graphics/Paint;

    invoke-interface {p1}, Lo/ekz;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 198
    iget-object v0, p0, Lo/eku;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 200
    iget-object v0, p0, Lo/eku;->p:Landroid/graphics/Path;

    invoke-virtual {v8, v0}, Lo/nv;->a(Landroid/graphics/Path;)V

    .line 202
    iget-object v0, p0, Lo/eku;->a:Landroid/graphics/Canvas;

    iget-object v1, p0, Lo/eku;->p:Landroid/graphics/Path;

    iget-object v2, p0, Lo/eku;->h:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 204
    iget-object v0, p0, Lo/eku;->h:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 205
    return-void
.end method
