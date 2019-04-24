.class public Lo/ekx;
.super Lo/eku;
.source "SourceFile"

# interfaces
.implements Lo/eiu;


# instance fields
.field private q:Landroid/graphics/Path;

.field private t:Lo/ele;

.field private u:Lo/elh;


# direct methods
.method public constructor <init>(Lo/ejh;Lo/la;Lo/oa;Landroid/content/Context;)V
    .locals 3

    .line 58
    invoke-direct {p0, p1, p2, p3}, Lo/eku;-><init>(Lo/ejh;Lo/la;Lo/oa;)V

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekx;->u:Lo/elh;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekx;->t:Lo/ele;

    .line 133
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/ekx;->q:Landroid/graphics/Path;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekx;->f:Lo/nk$d;

    .line 63
    new-instance v0, Lo/elh;

    iget-object v1, p0, Lo/ekx;->c:Lo/ejh;

    check-cast v1, Lo/eie;

    iget-object v2, p0, Lo/ekx;->l:Lo/oa;

    invoke-direct {v0, v1, v2}, Lo/elh;-><init>(Lo/eie;Lo/oa;)V

    iput-object v0, p0, Lo/ekx;->u:Lo/elh;

    .line 64
    new-instance v0, Lo/ele;

    iget-object v1, p0, Lo/ekx;->u:Lo/elh;

    invoke-direct {v0, v1}, Lo/ele;-><init>(Lo/elh;)V

    iput-object v0, p0, Lo/ekx;->t:Lo/ele;

    .line 65
    return-void
.end method


# virtual methods
.method protected a(Lo/mw;)I
    .locals 5

    .line 201
    iget-object v0, p0, Lo/ekx;->u:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v4

    .line 202
    instance-of v0, v4, Lo/elh$e;

    if-eqz v0, :cond_0

    .line 203
    const/16 v0, 0xff

    const/16 v1, 0xf2

    const/16 v2, 0xf2

    const/16 v3, 0xf2

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    .line 205
    :cond_0
    invoke-interface {p1}, Lo/mw;->m()I

    move-result v0

    return v0
.end method

.method public a()Lo/ejh;
    .locals 1

    .line 274
    iget-object v0, p0, Lo/ekx;->c:Lo/ejh;

    return-object v0
.end method

.method protected a(Lo/ekz;)V
    .locals 2

    .line 222
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "needs intercept,not support bezier"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(I)V
    .locals 2

    .line 302
    iget-object v0, p0, Lo/ekx;->u:Lo/elh;

    .line 303
    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/elh$h;

    .line 304
    iput p1, v1, Lo/elh$h;->h:I

    .line 305
    return-void
.end method

.method protected b(Landroid/graphics/Canvas;FFLo/mw;ZZI)V
    .locals 9

    .line 139
    iget-object v0, p0, Lo/ekx;->k:Landroid/graphics/Paint;

    invoke-interface {p4}, Lo/mw;->W()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 140
    iget-object v0, p0, Lo/ekx;->k:Landroid/graphics/Paint;

    move/from16 v1, p7

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 143
    iget-object v0, p0, Lo/ekx;->k:Landroid/graphics/Paint;

    invoke-interface {p4}, Lo/mw;->Z()Landroid/graphics/DashPathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 144
    invoke-interface {p4}, Lo/mw;->T()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p5, :cond_0

    .line 146
    iget-object v0, p0, Lo/ekx;->q:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 147
    iget-object v0, p0, Lo/ekx;->c:Lo/ejh;

    check-cast v0, Lo/ld;

    invoke-virtual {v0}, Lo/ld;->getMarker()Lo/lk;

    move-result-object v0

    check-cast v0, Lo/lr;

    invoke-virtual {v0}, Lo/lr;->getHeight()I

    move-result v0

    int-to-float v3, v0

    .line 148
    iget-object v0, p0, Lo/ekx;->q:Landroid/graphics/Path;

    invoke-virtual {v0, p2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 149
    iget-object v0, p0, Lo/ekx;->q:Landroid/graphics/Path;

    iget-object v1, p0, Lo/ekx;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    iget-object v2, p0, Lo/ekx;->c:Lo/ejh;

    invoke-interface {v2}, Lo/ejh;->getXAxis()Lo/ln;

    move-result-object v2

    invoke-virtual {v2}, Lo/ln;->y()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 150
    iget-object v0, p0, Lo/ekx;->q:Landroid/graphics/Path;

    iget-object v1, p0, Lo/ekx;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 153
    :cond_0
    if-eqz p6, :cond_2

    .line 154
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v3

    .line 155
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v4

    .line 158
    iget-object v0, p0, Lo/ekx;->c:Lo/ejh;

    instance-of v0, v0, Lo/ehv;

    if-eqz v0, :cond_1

    .line 159
    iget-object v0, p0, Lo/ekx;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getData()Lo/lt;

    move-result-object v0

    invoke-virtual {v0}, Lo/lt;->h()Ljava/util/List;

    move-result-object v5

    .line 160
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/ehn;

    if-eqz v0, :cond_1

    .line 161
    iget-object v0, p0, Lo/ekx;->c:Lo/ejh;

    check-cast v0, Lo/ehv;

    invoke-virtual {v0}, Lo/ehv;->getBarData()Lo/ehq;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 162
    iget-object v0, p0, Lo/ekx;->c:Lo/ejh;

    check-cast v0, Lo/ehv;

    invoke-virtual {v0}, Lo/ehv;->getBarData()Lo/ehq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehq;->a()F

    move-result v6

    .line 163
    const/4 v0, 0x4

    new-array v7, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v7, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v7, v1

    const/4 v0, 0x2

    aput v6, v7, v0

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v7, v1

    .line 164
    iget-object v0, p0, Lo/ekx;->c:Lo/ejh;

    iget-object v1, p0, Lo/ekx;->c:Lo/ejh;

    check-cast v1, Lo/ehv;

    invoke-virtual {v1}, Lo/ehv;->getAxisFirstParty()Lo/eit;

    move-result-object v1

    invoke-virtual {v1}, Lo/eit;->P()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v8

    .line 165
    invoke-virtual {v8, v7}, Lo/nv;->e([F)V

    .line 166
    const/4 v0, 0x2

    aget v0, v7, v0

    const/4 v1, 0x0

    aget v1, v7, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    .line 167
    const/high16 v0, 0x3fc00000    # 1.5f

    mul-float v4, v3, v0

    .line 172
    :cond_1
    iget-object v0, p0, Lo/ekx;->k:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 173
    iget-object v0, p0, Lo/ekx;->k:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 177
    iget-object v0, p0, Lo/ekx;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 178
    iget-object v0, p0, Lo/ekx;->k:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 180
    iget-object v0, p0, Lo/ekx;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v4, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 186
    iget-object v0, p0, Lo/ekx;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 189
    iget-object v0, p0, Lo/ekx;->k:Landroid/graphics/Paint;

    invoke-virtual {p0, p4}, Lo/ekx;->a(Lo/mw;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 190
    iget-object v0, p0, Lo/ekx;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v3, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 193
    iget-object v0, p0, Lo/ekx;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 195
    :cond_2
    return-void
.end method

.method public b()Z
    .locals 2

    .line 288
    iget-object v0, p0, Lo/ekx;->u:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v1

    .line 289
    instance-of v0, v1, Lo/elh$e;

    if-eqz v0, :cond_0

    .line 290
    const/4 v0, 0x1

    return v0

    .line 292
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 2

    .line 332
    iget-object v0, p0, Lo/ekx;->u:Lo/elh;

    const-string v1, "render_foreground"

    invoke-virtual {v0, v1}, Lo/elh;->c(Ljava/lang/String;)V

    .line 333
    iget-object v0, p0, Lo/ekx;->c:Lo/ejh;

    check-cast v0, Lo/eie;

    invoke-virtual {v0}, Lo/eie;->invalidate()V

    .line 334
    return-void
.end method

.method protected c(Landroid/graphics/Canvas;Lo/ekz;)V
    .locals 8

    .line 233
    move-object v2, p2

    check-cast v2, Lo/elb;

    .line 234
    iget-object v3, p0, Lo/ekx;->a:Landroid/graphics/Canvas;

    .line 237
    invoke-virtual {v2}, Lo/elb;->aa()Z

    move-result v0

    if-nez v0, :cond_0

    .line 238
    return-void

    .line 241
    :cond_0
    iget-object v0, p0, Lo/ekx;->u:Lo/elh;

    invoke-virtual {v0, v2}, Lo/elh;->a(Lo/elb;)V

    .line 242
    iget-object v0, p0, Lo/ekx;->u:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->a()V

    .line 244
    iget-object v0, p0, Lo/ekx;->u:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v4

    .line 246
    iget-object v0, p0, Lo/ekx;->c:Lo/ejh;

    invoke-virtual {v2}, Lo/elb;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->e(Lo/eit$b;)Lo/eid;

    move-result-object v5

    .line 247
    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lo/eid;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 248
    invoke-virtual {v2}, Lo/elb;->ai()Z

    move-result v6

    .line 249
    if-nez v6, :cond_1

    .line 250
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "drawLadderLinear needs displayIntervalSeted"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 252
    :cond_1
    invoke-virtual {v2}, Lo/elb;->ak()F

    move-result v7

    .line 253
    invoke-interface {v4, v7}, Lo/elh$c;->c(F)V

    .line 254
    goto :goto_0

    .line 255
    :cond_2
    invoke-interface {v4}, Lo/elh$c;->d()V

    .line 259
    :goto_0
    iget-object v0, p0, Lo/ekx;->c:Lo/ejh;

    check-cast v0, Lo/eie;

    invoke-virtual {v2, v0}, Lo/elb;->b(Lo/eie;)Lo/ejq;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ejs;

    .line 262
    iget-object v0, p0, Lo/ekx;->c:Lo/ejh;

    invoke-virtual {v2}, Lo/elb;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v7

    .line 263
    iget-object v0, p0, Lo/ekx;->t:Lo/ele;

    invoke-virtual {v0, v3, v6, v7}, Lo/ele;->b(Landroid/graphics/Canvas;Lo/ejs;Lo/nv;)V

    .line 264
    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 279
    if-eqz p1, :cond_0

    .line 280
    iget-object v0, p0, Lo/ekx;->u:Lo/elh;

    const-string v1, "render_background"

    invoke-virtual {v0, v1}, Lo/elh;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 282
    :cond_0
    iget-object v0, p0, Lo/ekx;->u:Lo/elh;

    const-string v1, "render_foreground"

    invoke-virtual {v0, v1}, Lo/elh;->c(Ljava/lang/String;)V

    .line 284
    :goto_0
    return-void
.end method

.method public d(Landroid/graphics/Canvas;[Lo/mh;)V
    .locals 23

    .line 70
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ekx;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getLineData()Lo/ela;

    move-result-object v8

    .line 71
    if-eqz p2, :cond_0

    move-object/from16 v0, p2

    array-length v0, v0

    if-gtz v0, :cond_1

    .line 72
    :cond_0
    return-void

    .line 74
    :cond_1
    move-object/from16 v9, p2

    array-length v10, v9

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_9

    aget-object v12, v9, v11

    .line 76
    invoke-virtual {v8}, Lo/ela;->h()Ljava/util/List;

    move-result-object v13

    .line 78
    if-eqz v13, :cond_8

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 79
    goto/16 :goto_2

    .line 81
    :cond_2
    const/4 v14, 0x0

    .line 83
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v15

    .line 87
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v16

    .line 89
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 91
    const/4 v0, 0x0

    invoke-interface {v13, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ekz;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ekx;->c:Lo/ejh;

    check-cast v1, Lo/eie;

    invoke-interface {v0, v1}, Lo/ekz;->b(Lo/eie;)Lo/ejq;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/ejs;

    .line 92
    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v0

    move-object/from16 v1, v17

    invoke-interface {v1, v0}, Lo/ejs;->a(F)Ljava/util/List;

    move-result-object v18

    .line 94
    if-eqz v18, :cond_8

    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_2

    .line 96
    :cond_3
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lcom/github/mikephil/charting/data/Entry;

    .line 98
    const/16 v20, 0x1

    .line 99
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ekx;->u:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v21

    .line 100
    move-object/from16 v0, v21

    instance-of v0, v0, Lo/elh$e;

    if-eqz v0, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ekx;->c:Lo/ejh;

    check-cast v0, Lo/eie;

    .line 101
    invoke-virtual {v0}, Lo/eie;->P()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 103
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/ekx;->c:Lo/ejh;

    check-cast v2, Lo/eie;

    invoke-virtual {v2}, Lo/eie;->getManualReferenceLineValue()I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    move-object/from16 v19, v0

    .line 104
    const/16 v20, 0x0

    .line 107
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ekx;->c:Lo/ejh;

    .line 108
    const/4 v1, 0x0

    invoke-interface {v13, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ekz;

    invoke-interface {v1}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    .line 107
    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    .line 108
    invoke-virtual/range {v19 .. v19}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    .line 109
    invoke-virtual/range {v19 .. v19}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/ekx;->i:Lo/la;

    invoke-virtual {v3}, Lo/la;->d()F

    move-result v3

    mul-float/2addr v2, v3

    .line 108
    invoke-virtual {v0, v1, v2}, Lo/eim;->d(FF)Lo/nw;

    move-result-object v22

    .line 110
    move-object/from16 v0, v22

    iget-wide v0, v0, Lo/nw;->b:D

    double-to-float v0, v0

    move-object/from16 v1, v22

    iget-wide v1, v1, Lo/nw;->c:D

    double-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Lo/mh;->e(FF)V

    .line 112
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v22

    iget-wide v2, v2, Lo/nw;->b:D

    double-to-float v2, v2

    move-object/from16 v3, v22

    iget-wide v3, v3, Lo/nw;->c:D

    double-to-float v3, v3

    const/4 v4, 0x0

    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/mw;

    move/from16 v6, v20

    move/from16 v7, v16

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/ekx;->b(Landroid/graphics/Canvas;FFLo/mw;ZZI)V

    .line 113
    goto/16 :goto_2

    .line 114
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ekx;->c:Lo/ejh;

    const/4 v1, 0x0

    invoke-interface {v13, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ekz;

    invoke-interface {v1}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/eim;->d(FF)Lo/nw;

    move-result-object v17

    .line 116
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    iget-wide v2, v2, Lo/nw;->b:D

    double-to-float v2, v2

    move-object/from16 v3, v17

    iget-wide v3, v3, Lo/nw;->c:D

    double-to-float v3, v3

    const/4 v4, 0x0

    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/mw;

    move/from16 v7, v16

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/ekx;->b(Landroid/graphics/Canvas;FFLo/mw;ZZI)V

    .line 118
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :cond_6
    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lo/ekz;

    .line 119
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ekx;->c:Lo/ejh;

    check-cast v0, Lo/eie;

    move-object/from16 v1, v19

    invoke-interface {v1, v0}, Lo/ekz;->b(Lo/eie;)Lo/ejq;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lo/ejs;

    .line 120
    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v0

    move-object/from16 v1, v20

    invoke-interface {v1, v0}, Lo/ejs;->a(F)Ljava/util/List;

    move-result-object v21

    .line 121
    if-eqz v21, :cond_6

    invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_7

    goto :goto_1

    .line 122
    :cond_7
    move-object/from16 v0, v21

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lcom/github/mikephil/charting/data/Entry;

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ekx;->c:Lo/ejh;

    invoke-interface/range {v19 .. v19}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual/range {v22 .. v22}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual/range {v22 .. v22}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/ekx;->i:Lo/la;

    .line 124
    invoke-virtual {v3}, Lo/la;->d()F

    move-result v3

    mul-float/2addr v2, v3

    .line 123
    invoke-virtual {v0, v1, v2}, Lo/eim;->d(FF)Lo/nw;

    move-result-object v17

    .line 125
    move-object/from16 v0, v17

    iget-wide v0, v0, Lo/nw;->b:D

    double-to-float v0, v0

    move-object/from16 v1, v17

    iget-wide v1, v1, Lo/nw;->c:D

    double-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Lo/mh;->e(FF)V

    .line 127
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    iget-wide v2, v2, Lo/nw;->b:D

    double-to-float v2, v2

    move-object/from16 v3, v17

    iget-wide v3, v3, Lo/nw;->c:D

    double-to-float v3, v3

    move-object/from16 v4, v19

    move/from16 v7, v16

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/ekx;->b(Landroid/graphics/Canvas;FFLo/mw;ZZI)V

    .line 128
    goto/16 :goto_1

    .line 74
    :cond_8
    :goto_2
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 131
    :cond_9
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eib;>;)V"
        }
    .end annotation

    .line 309
    iget-object v0, p0, Lo/ekx;->u:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v2

    .line 311
    const/4 v3, 0x0

    .line 312
    instance-of v0, v2, Lo/elh$b;

    if-nez v0, :cond_0

    .line 313
    iget-object v0, p0, Lo/ekx;->u:Lo/elh;

    const-string v1, "render_focus_area"

    invoke-virtual {v0, v1}, Lo/elh;->c(Ljava/lang/String;)V

    .line 314
    const/4 v3, 0x1

    .line 317
    :cond_0
    iget-object v0, p0, Lo/ekx;->u:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/elh$b;

    .line 319
    invoke-virtual {v4, p1}, Lo/elh$b;->a(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 320
    const/4 v3, 0x1

    .line 323
    :cond_1
    if-nez v3, :cond_2

    .line 324
    return-void

    .line 327
    :cond_2
    invoke-virtual {v4, p1}, Lo/elh$b;->c(Ljava/util/List;)V

    .line 328
    iget-object v0, p0, Lo/ekx;->c:Lo/ejh;

    check-cast v0, Lo/eie;

    invoke-virtual {v0}, Lo/eie;->invalidate()V

    .line 329
    return-void
.end method

.method public d()Z
    .locals 2

    .line 297
    iget-object v0, p0, Lo/ekx;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getLineData()Lo/ela;

    move-result-object v1

    .line 298
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lo/ela;->h()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lo/ela;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
