.class public Lo/ele$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ele;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lo/ele;

.field protected d:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Lo/ele;)V
    .locals 2

    .line 223
    iput-object p1, p0, Lo/ele$c;->a:Lo/ele;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    .line 225
    return-void
.end method


# virtual methods
.method public varargs b(Landroid/graphics/Canvas;Lo/elg;[Landroid/graphics/drawable/Drawable;)V
    .locals 14

    .line 316
    iget-object v0, p0, Lo/ele$c;->a:Lo/ele;

    iget-object v0, v0, Lo/ele;->e:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v0

    invoke-interface {v0}, Lo/elh$c;->k()Lo/elh$f;

    move-result-object v8

    .line 318
    instance-of v0, v8, Lo/elh$d;

    if-eqz v0, :cond_0

    .line 319
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "DoubleColorCircle draw node fill path?"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 322
    :cond_0
    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 323
    iget-object v0, p0, Lo/ele$c;->a:Lo/ele;

    iget-object v0, v0, Lo/ele;->e:Lo/elh;

    .line 324
    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/elh$h;

    .line 325
    invoke-virtual {v10}, Lo/elh$h;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 326
    invoke-virtual/range {p2 .. p2}, Lo/elg;->c()F

    move-result v0

    invoke-virtual/range {p2 .. p2}, Lo/elg;->a()F

    move-result v1

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 327
    invoke-virtual/range {p2 .. p2}, Lo/elg;->c()F

    move-result v0

    iget-object v1, p0, Lo/ele$c;->a:Lo/ele;

    invoke-static {v1}, Lo/ele;->c(Lo/ele;)Lo/nv;

    move-result-object v1

    invoke-virtual {v10, v1}, Lo/elh$h;->c(Lo/nv;)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual/range {p2 .. p2}, Lo/elg;->a()F

    move-result v1

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 329
    new-instance v11, Lo/elg;

    invoke-virtual/range {p2 .. p2}, Lo/elg;->c()F

    move-result v0

    invoke-virtual/range {p2 .. p2}, Lo/elg;->a()F

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v11, v0, v1, v2}, Lo/elg;-><init>(FFLcom/github/mikephil/charting/data/Entry;)V

    .line 330
    new-instance v12, Lo/elg;

    invoke-virtual/range {p2 .. p2}, Lo/elg;->c()F

    move-result v0

    iget-object v1, p0, Lo/ele$c;->a:Lo/ele;

    invoke-static {v1}, Lo/ele;->c(Lo/ele;)Lo/nv;

    move-result-object v1

    invoke-virtual {v10, v1}, Lo/elh$h;->c(Lo/nv;)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual/range {p2 .. p2}, Lo/elg;->a()F

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v12, v0, v1, v2}, Lo/elg;-><init>(FFLcom/github/mikephil/charting/data/Entry;)V

    .line 332
    move-object v0, p0

    move-object v1, p1

    move-object v2, v11

    move-object v3, v9

    move-object v4, v12

    move-object/from16 v5, p3

    invoke-virtual/range {v0 .. v5}, Lo/ele$c;->d(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;[Landroid/graphics/drawable/Drawable;)V

    .line 333
    return-void

    .line 336
    :cond_1
    move-object v11, v8

    check-cast v11, Lo/elh$i;

    .line 337
    iget v12, v11, Lo/elh$i;->e:F

    .line 339
    new-instance v13, Landroid/graphics/Path;

    invoke-direct {v13}, Landroid/graphics/Path;-><init>()V

    .line 340
    invoke-virtual/range {p2 .. p2}, Lo/elg;->c()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v12, v1

    sub-float/2addr v0, v1

    invoke-virtual/range {p2 .. p2}, Lo/elg;->a()F

    move-result v1

    invoke-virtual {v13, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 341
    invoke-virtual/range {p2 .. p2}, Lo/elg;->c()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v12, v1

    add-float/2addr v0, v1

    invoke-virtual/range {p2 .. p2}, Lo/elg;->a()F

    move-result v1

    invoke-virtual {v13, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 343
    move-object v0, p0

    move-object v1, p1

    new-instance v2, Lo/elg;

    .line 344
    invoke-virtual/range {p2 .. p2}, Lo/elg;->c()F

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v12, v4

    sub-float/2addr v3, v4

    invoke-virtual/range {p2 .. p2}, Lo/elg;->a()F

    move-result v4

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Lo/elg;-><init>(FFLcom/github/mikephil/charting/data/Entry;)V

    move-object v3, v13

    new-instance v4, Lo/elg;

    .line 346
    invoke-virtual/range {p2 .. p2}, Lo/elg;->c()F

    move-result v5

    const/high16 v6, 0x40000000    # 2.0f

    div-float v6, v12, v6

    add-float/2addr v5, v6

    invoke-virtual/range {p2 .. p2}, Lo/elg;->a()F

    move-result v6

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v7}, Lo/elg;-><init>(FFLcom/github/mikephil/charting/data/Entry;)V

    move-object/from16 v5, p3

    .line 343
    invoke-virtual/range {v0 .. v5}, Lo/ele$c;->d(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;[Landroid/graphics/drawable/Drawable;)V

    .line 348
    return-void
.end method

.method public c(Landroid/graphics/Canvas;Lo/elg;I)V
    .locals 12

    .line 274
    iget-object v0, p0, Lo/ele$c;->a:Lo/ele;

    iget-object v0, v0, Lo/ele;->e:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v0

    invoke-interface {v0}, Lo/elh$c;->k()Lo/elh$f;

    move-result-object v8

    .line 276
    instance-of v0, v8, Lo/elh$d;

    if-eqz v0, :cond_0

    .line 277
    move-object v9, v8

    check-cast v9, Lo/elh$d;

    .line 278
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 279
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 280
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 281
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 282
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 283
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 285
    invoke-virtual {p2}, Lo/elg;->c()F

    move-result v0

    invoke-virtual {p2}, Lo/elg;->a()F

    move-result v1

    iget v2, v9, Lo/elh$d;->d:F

    iget-object v3, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 288
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 289
    invoke-virtual {p2}, Lo/elg;->c()F

    move-result v0

    invoke-virtual {p2}, Lo/elg;->a()F

    move-result v1

    iget v2, v9, Lo/elh$d;->a:F

    iget-object v3, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 290
    return-void

    .line 294
    :cond_0
    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 295
    iget-object v0, p0, Lo/ele$c;->a:Lo/ele;

    iget-object v0, v0, Lo/ele;->e:Lo/elh;

    .line 296
    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/elh$h;

    .line 297
    invoke-virtual {v10}, Lo/elh$h;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 298
    invoke-virtual {p2}, Lo/elg;->c()F

    move-result v0

    invoke-virtual {p2}, Lo/elg;->a()F

    move-result v1

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 299
    invoke-virtual {p2}, Lo/elg;->c()F

    move-result v0

    iget-object v1, p0, Lo/ele$c;->a:Lo/ele;

    invoke-static {v1}, Lo/ele;->c(Lo/ele;)Lo/nv;

    move-result-object v1

    invoke-virtual {v10, v1}, Lo/elh$h;->c(Lo/nv;)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p2}, Lo/elg;->a()F

    move-result v1

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 300
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, v9

    new-instance v4, Lo/elg;

    invoke-virtual {p2}, Lo/elg;->c()F

    move-result v5

    iget-object v6, p0, Lo/ele$c;->a:Lo/ele;

    invoke-static {v6}, Lo/ele;->c(Lo/ele;)Lo/nv;

    move-result-object v6

    invoke-virtual {v10, v6}, Lo/elh$h;->c(Lo/nv;)F

    move-result v6

    add-float/2addr v5, v6

    invoke-virtual {p2}, Lo/elg;->a()F

    move-result v6

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v7}, Lo/elg;-><init>(FFLcom/github/mikephil/charting/data/Entry;)V

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Lo/ele$c;->d(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;I)V

    .line 301
    return-void

    .line 305
    :cond_1
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 306
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 307
    move-object v11, v8

    check-cast v11, Lo/elh$i;

    .line 308
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    iget v1, v11, Lo/elh$i;->e:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 309
    move-object v0, p1

    .line 310
    invoke-virtual {p2}, Lo/elg;->c()F

    move-result v1

    invoke-virtual {p2}, Lo/elg;->a()F

    move-result v2

    .line 311
    invoke-virtual {p2}, Lo/elg;->c()F

    move-result v3

    invoke-virtual {p2}, Lo/elg;->a()F

    move-result v4

    iget-object v5, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    .line 309
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 313
    return-void
.end method

.method public d(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;I)V
    .locals 10

    .line 229
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 231
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 232
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 233
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p5}, Landroid/graphics/Paint;->setColor(I)V

    .line 234
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/ele$c;->a:Lo/ele;

    iget-object v1, v1, Lo/ele;->e:Lo/elh;

    invoke-virtual {v1}, Lo/elh;->b()Lo/elh$c;

    move-result-object v1

    invoke-interface {v1}, Lo/elh$c;->g()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 236
    iget-object v0, p0, Lo/ele$c;->a:Lo/ele;

    iget-object v0, v0, Lo/ele;->e:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->e()Lo/eie;

    move-result-object v6

    .line 237
    iget-object v0, p0, Lo/ele$c;->a:Lo/ele;

    iget-object v0, v0, Lo/ele;->e:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->d()Lo/oa;

    move-result-object v7

    .line 239
    invoke-virtual {v7}, Lo/oa;->i()F

    move-result v0

    invoke-virtual {v6}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v8, v0

    .line 243
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v9

    .line 244
    .line 245
    invoke-virtual {p2}, Lo/elg;->c()F

    move-result v0

    .line 246
    invoke-virtual {v7}, Lo/oa;->e()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    .line 247
    invoke-virtual {p4}, Lo/elg;->c()F

    move-result v2

    int-to-float v3, v8

    .line 244
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 251
    iget-object v0, p0, Lo/ele$c;->a:Lo/ele;

    iget-object v0, v0, Lo/ele;->e:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v0

    invoke-interface {v0}, Lo/elh$c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 252
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    .line 253
    invoke-static {p5}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-static {p5}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static {p5}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    .line 252
    const/16 v5, 0x26

    invoke-static {v5, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/4 v3, 0x0

    const/high16 v4, 0x40c00000    # 6.0f

    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 254
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, p3, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 255
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->clearShadowLayer()V

    goto :goto_0

    .line 257
    :cond_0
    iget-object v0, p0, Lo/ele$c;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, p3, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 260
    :goto_0
    invoke-virtual {p1, v9}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 261
    return-void
.end method

.method public varargs d(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;[Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 267
    invoke-virtual/range {p0 .. p5}, Lo/ele$c;->e(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;[Landroid/graphics/drawable/Drawable;)V

    .line 268
    return-void
.end method

.method protected varargs e(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;[Landroid/graphics/drawable/Drawable;)V
    .locals 19

    .line 358
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ele$c;->a:Lo/ele;

    iget-object v0, v0, Lo/ele;->e:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->e()Lo/eie;

    move-result-object v4

    .line 359
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ele$c;->a:Lo/ele;

    iget-object v0, v0, Lo/ele;->e:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->d()Lo/oa;

    move-result-object v5

    .line 361
    new-instance v6, Landroid/graphics/Path;

    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    .line 364
    move-object/from16 v0, p3

    invoke-virtual {v6, v0}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 365
    invoke-virtual/range {p4 .. p4}, Lo/elg;->c()F

    move-result v0

    invoke-virtual {v4}, Lo/eie;->getContentRect()Landroid/graphics/RectF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v4}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v2

    invoke-virtual {v2}, Lo/ln;->y()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {v6, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 366
    invoke-virtual/range {p2 .. p2}, Lo/elg;->c()F

    move-result v0

    invoke-virtual {v4}, Lo/eie;->getContentRect()Landroid/graphics/RectF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v4}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v2

    invoke-virtual {v2}, Lo/ln;->y()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {v6, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 367
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    .line 370
    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 372
    move-object/from16 v0, p5

    array-length v0, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 373
    const/4 v0, 0x0

    aget-object v9, p5, v0

    goto :goto_0

    .line 374
    :cond_0
    move-object/from16 v0, p5

    array-length v0, v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 375
    const/4 v0, 0x0

    aget-object v7, p5, v0

    .line 376
    const/4 v0, 0x1

    aget-object v8, p5, v0

    .line 381
    :cond_1
    :goto_0
    invoke-virtual {v4}, Lo/eie;->getAxisFirstParty()Lo/eit;

    move-result-object v0

    iget-object v0, v0, Lo/eit;->a:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, [F

    .line 382
    array-length v0, v10

    add-int/lit8 v11, v0, -0x2

    .line 383
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ele$c;->a:Lo/ele;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ele$c;->a:Lo/ele;

    invoke-static {v1}, Lo/ele;->c(Lo/ele;)Lo/nv;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ele;->d(Lo/ele;Lo/nv;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 385
    const/4 v11, 0x1

    .line 388
    :cond_2
    aget v12, v10, v11

    .line 390
    const/4 v0, 0x2

    new-array v13, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v13, v1

    const/4 v0, 0x1

    aput v12, v13, v0

    .line 391
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ele$c;->a:Lo/ele;

    invoke-static {v0}, Lo/ele;->c(Lo/ele;)Lo/nv;

    move-result-object v0

    invoke-virtual {v0, v13}, Lo/nv;->e([F)V

    .line 392
    const/4 v0, 0x1

    aget v12, v13, v0

    .line 394
    const/4 v14, 0x0

    .line 395
    const/4 v15, 0x0

    .line 397
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ele$c;->a:Lo/ele;

    iget-object v0, v0, Lo/ele;->e:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v16

    .line 398
    move-object/from16 v0, v16

    instance-of v0, v0, Lo/elh$b;

    if-eqz v0, :cond_3

    .line 399
    const/4 v14, 0x1

    .line 400
    move-object/from16 v0, v16

    check-cast v0, Lo/elh$b;

    iget-object v15, v0, Lo/elh$b;->f:Landroid/graphics/Path;

    .line 403
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ele$c;->a:Lo/ele;

    invoke-static {v0}, Lo/ele;->a(Lo/ele;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 408
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v17

    .line 409
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 412
    if-eqz v14, :cond_4

    .line 413
    move-object/from16 v0, p1

    invoke-virtual {v0, v15}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 417
    :cond_4
    if-eqz v7, :cond_5

    .line 418
    invoke-virtual {v5}, Lo/oa;->f()F

    move-result v0

    float-to-int v0, v0

    .line 419
    invoke-virtual {v5}, Lo/oa;->e()F

    move-result v1

    float-to-int v1, v1

    .line 420
    invoke-virtual {v5}, Lo/oa;->h()F

    move-result v2

    float-to-int v2, v2

    float-to-int v3, v12

    .line 418
    invoke-virtual {v7, v0, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 422
    move-object/from16 v0, p1

    invoke-virtual {v7, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 425
    :cond_5
    if-eqz v8, :cond_6

    .line 426
    invoke-virtual {v5}, Lo/oa;->i()F

    move-result v0

    invoke-virtual {v4}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v1, v0

    move/from16 v18, v1

    .line 427
    invoke-virtual {v5}, Lo/oa;->f()F

    move-result v0

    float-to-int v0, v0

    float-to-int v1, v12

    .line 429
    invoke-virtual {v5}, Lo/oa;->h()F

    move-result v2

    float-to-int v2, v2

    .line 427
    move/from16 v3, v18

    invoke-virtual {v8, v0, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 431
    move-object/from16 v0, p1

    invoke-virtual {v8, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 434
    :cond_6
    if-eqz v9, :cond_7

    .line 436
    invoke-virtual {v5}, Lo/oa;->i()F

    move-result v0

    invoke-virtual {v4}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v1, v0

    move/from16 v18, v1

    .line 438
    invoke-virtual {v5}, Lo/oa;->f()F

    move-result v0

    float-to-int v0, v0

    .line 439
    invoke-virtual {v5}, Lo/oa;->e()F

    move-result v1

    float-to-int v1, v1

    .line 440
    invoke-virtual {v5}, Lo/oa;->h()F

    move-result v2

    float-to-int v2, v2

    .line 438
    move/from16 v3, v18

    invoke-virtual {v9, v0, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 442
    move-object/from16 v0, p1

    invoke-virtual {v9, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 446
    :cond_7
    move-object/from16 v0, p1

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 447
    goto :goto_1

    .line 448
    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fill-drawables not (yet) supported below API level 18, this code was run on API level "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 449
    invoke-static {}, Lo/oc;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 451
    :goto_1
    return-void
.end method
