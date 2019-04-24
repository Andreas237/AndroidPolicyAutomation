.class public Lo/eir;
.super Lo/nt;
.source "SourceFile"


# instance fields
.field private A:F

.field private B:F

.field private C:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private D:F

.field private F:F

.field private G:F

.field private j:Ljava/util/concurrent/atomic/AtomicInteger;

.field public q:Z

.field protected s:Landroid/content/Context;

.field protected u:Lo/eie;

.field public v:I

.field public w:Landroid/graphics/Paint;

.field public x:I

.field protected y:Lo/ekj;

.field protected z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V
    .locals 2

    .line 61
    invoke-direct {p0, p2, p3, p4}, Lo/nt;-><init>(Lo/oa;Lo/lp;Lo/nv;)V

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eir;->q:Z

    .line 44
    const v0, -0x800001

    iput v0, p0, Lo/eir;->A:F

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eir;->z:Z

    .line 57
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/eir;->C:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 58
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lo/eir;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 462
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eir;->D:F

    .line 463
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eir;->B:F

    .line 465
    const/4 v0, 0x0

    iput v0, p0, Lo/eir;->G:F

    .line 468
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eir;->F:F

    .line 62
    iput-object p1, p0, Lo/eir;->s:Landroid/content/Context;

    .line 63
    iput-object p5, p0, Lo/eir;->u:Lo/eie;

    .line 66
    new-instance v0, Lo/ekj;

    invoke-direct {v0}, Lo/ekj;-><init>()V

    iput-object v0, p0, Lo/eir;->y:Lo/ekj;

    .line 67
    return-void
.end method

.method static synthetic a(Lo/eir;)Lo/lp;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    return-object v0
.end method

.method static synthetic b(Lo/eir;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/eir;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method static synthetic c(Lo/eir;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/eir;->C:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic d(Lo/eir;)F
    .locals 1

    .line 33
    iget v0, p0, Lo/eir;->G:F

    return v0
.end method

.method static synthetic e(Lo/eir;)F
    .locals 1

    .line 33
    iget v0, p0, Lo/eir;->F:F

    return v0
.end method

.method static synthetic e(Lo/eir;F)F
    .locals 0

    .line 33
    iput p1, p0, Lo/eir;->B:F

    return p1
.end method


# virtual methods
.method public a(II)V
    .locals 1

    .line 471
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eir;->q:Z

    .line 472
    iput p1, p0, Lo/eir;->v:I

    .line 473
    iput p2, p0, Lo/eir;->x:I

    .line 474
    return-void
.end method

.method protected a(Landroid/graphics/Canvas;F[FF)V
    .locals 8

    .line 180
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    .line 181
    :goto_0
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    iget v3, v0, Lo/lp;->d:I

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    iget v0, v0, Lo/lp;->d:I

    add-int/lit8 v3, v0, -0x1

    .line 185
    :goto_1
    invoke-virtual {p0}, Lo/eir;->d()F

    move-result v4

    .line 188
    move v5, v2

    :goto_2
    if-ge v5, v3, :cond_3

    .line 190
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    iget-object v0, v0, Lo/lp;->a:[F

    aget v6, v0, v5

    .line 191
    iget-boolean v0, p0, Lo/eir;->q:Z

    if-eqz v0, :cond_2

    .line 193
    iget v0, p0, Lo/eir;->A:F

    sub-float/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 194
    goto :goto_3

    .line 198
    :cond_2
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0, v5}, Lo/lp;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 200
    mul-int/lit8 v0, v5, 0x2

    add-int/lit8 v0, v0, 0x1

    aget v0, p3, v0

    add-float/2addr v0, v4

    iget-object v1, p0, Lo/eir;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v7, p2, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 188
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 202
    :cond_3
    return-void
.end method

.method protected b(Landroid/graphics/Path;I[F)Landroid/graphics/Path;
    .locals 1

    .line 158
    add-int/lit8 v0, p2, 0x1

    aget v0, p3, v0

    invoke-virtual {p0, p1, v0}, Lo/eir;->e(Landroid/graphics/Path;F)Landroid/graphics/Path;

    move-result-object v0

    return-object v0
.end method

.method public b(ILandroid/graphics/Paint;)V
    .locals 1

    .line 477
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eir;->q:Z

    .line 478
    iput p1, p0, Lo/eir;->v:I

    .line 479
    iput-object p2, p0, Lo/eir;->w:Landroid/graphics/Paint;

    .line 480
    return-void
.end method

.method public b(Landroid/graphics/Canvas;)V
    .locals 15

    .line 222
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 223
    :cond_0
    return-void

    .line 225
    :cond_1
    iget-object v0, p0, Lo/eir;->c:Lo/lh;

    invoke-virtual {v0}, Lo/lh;->q()F

    move-result v0

    const v1, 0x49f42400    # 2000000.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 227
    return-void

    .line 230
    :cond_2
    invoke-virtual {p0}, Lo/eir;->a()[F

    move-result-object v3

    .line 232
    iget-object v0, p0, Lo/eir;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->x()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 233
    iget-object v0, p0, Lo/eir;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->z()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 234
    iget-object v0, p0, Lo/eir;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->A()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 236
    iget-object v0, p0, Lo/eir;->a:Landroid/graphics/Paint;

    const-string v1, "A"

    invoke-static {v0, v1}, Lo/oc;->e(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40200000    # 2.5f

    div-float/2addr v0, v1

    iget-object v1, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->y()F

    move-result v1

    add-float v4, v0, v1

    .line 238
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->P()Lo/eit$b;

    move-result-object v5

    .line 240
    const/4 v6, 0x0

    .line 242
    sget-object v0, Lo/eit$b;->c:Lo/eit$b;

    if-ne v5, v0, :cond_3

    .line 243
    return-void

    .line 246
    :cond_3
    iget-object v0, p0, Lo/eir;->c:Lo/lh;

    check-cast v0, Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->d(Landroid/graphics/Paint;)F

    move-result v7

    .line 250
    const/4 v8, 0x0

    .line 251
    iget-object v0, p0, Lo/eir;->s:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v9

    .line 253
    if-eqz v9, :cond_4

    .line 254
    nop

    const/4 v8, 0x1

    .line 257
    :cond_4
    iget-boolean v0, p0, Lo/eir;->z:Z

    if-eqz v0, :cond_6

    .line 258
    if-nez v8, :cond_5

    const/4 v8, 0x1

    goto :goto_0

    :cond_5
    const/4 v8, 0x0

    .line 261
    :cond_6
    :goto_0
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne v5, v0, :cond_7

    if-eqz v8, :cond_8

    :cond_7
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne v5, v0, :cond_9

    if-eqz v8, :cond_9

    .line 264
    :cond_8
    iget-object v0, p0, Lo/eir;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 265
    iget-object v0, p0, Lo/eir;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->a()F

    move-result v0

    sub-float v6, v0, v7

    goto :goto_1

    .line 267
    :cond_9
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne v5, v0, :cond_a

    if-eqz v8, :cond_b

    :cond_a
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne v5, v0, :cond_c

    if-eqz v8, :cond_c

    .line 270
    :cond_b
    iget-object v0, p0, Lo/eir;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 271
    iget-object v0, p0, Lo/eir;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->h()F

    move-result v0

    add-float v6, v0, v7

    .line 274
    :cond_c
    :goto_1
    move-object/from16 v0, p1

    invoke-virtual {p0, v0, v6, v3, v4}, Lo/eir;->a(Landroid/graphics/Canvas;F[FF)V

    .line 276
    iget-boolean v0, p0, Lo/eir;->q:Z

    if-eqz v0, :cond_e

    iget v0, p0, Lo/eir;->v:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_e

    .line 277
    invoke-virtual {p0}, Lo/eir;->d()F

    move-result v10

    .line 279
    new-instance v11, Landroid/graphics/Rect;

    invoke-direct {v11}, Landroid/graphics/Rect;-><init>()V

    .line 280
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->r()Lo/mf;

    move-result-object v0

    iget v1, p0, Lo/eir;->v:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/eir;->k:Lo/lp;

    invoke-interface {v0, v1, v2}, Lo/mf;->b(FLo/lh;)Ljava/lang/String;

    move-result-object v12

    .line 281
    iget-object v0, p0, Lo/eir;->a:Landroid/graphics/Paint;

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v12, v2, v1, v11}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 282
    const/4 v0, 0x2

    new-array v13, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v13, v1

    iget v0, p0, Lo/eir;->v:I

    int-to-float v0, v0

    const/4 v1, 0x1

    aput v0, v13, v1

    .line 283
    iget-object v0, p0, Lo/eir;->e:Lo/nv;

    invoke-virtual {v0, v13}, Lo/nv;->e([F)V

    .line 284
    const/4 v0, 0x1

    aget v0, v13, v0

    add-float v14, v0, v10

    .line 285
    iget-object v0, p0, Lo/eir;->w:Landroid/graphics/Paint;

    if-eqz v0, :cond_d

    .line 286
    iget-object v0, p0, Lo/eir;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/eir;->w:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    .line 288
    :cond_d
    iget-object v0, p0, Lo/eir;->a:Landroid/graphics/Paint;

    iget v1, p0, Lo/eir;->x:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 291
    :goto_2
    iget-object v0, p0, Lo/eir;->a:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v12, v6, v14, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 293
    :cond_e
    return-void
.end method

.method public c()V
    .locals 1

    .line 484
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eir;->q:Z

    .line 485
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eir;->w:Landroid/graphics/Paint;

    .line 486
    return-void
.end method

.method protected d()F
    .locals 5

    .line 209
    iget-object v0, p0, Lo/eir;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v3

    .line 210
    iget v0, v3, Landroid/graphics/Paint$FontMetrics;->bottom:F

    iget v1, v3, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v0, v1

    const/high16 v1, -0x40800000    # -1.0f

    mul-float/2addr v0, v1

    iget v1, v3, Landroid/graphics/Paint$FontMetrics;->top:F

    const/high16 v2, -0x40800000    # -1.0f

    mul-float/2addr v1, v2

    add-float v4, v0, v1

    .line 212
    return v4
.end method

.method public d(FFZ)V
    .locals 8

    .line 342
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    sub-float v0, p2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    add-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 344
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lo/nt;->d(FFZ)V

    .line 345
    return-void

    .line 349
    :cond_1
    iget-object v0, p0, Lo/eir;->c:Lo/lh;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->P()Lo/eit$b;

    move-result-object v5

    .line 350
    iget-object v0, p0, Lo/eir;->u:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getData()Lo/ma;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/eik;

    .line 352
    if-eqz v5, :cond_2

    if-nez v6, :cond_3

    .line 353
    :cond_2
    const-string v0, "HwHealthYAxisRenderer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "computeAxis dependency null or chart chartData null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    return-void

    .line 357
    :cond_3
    invoke-virtual {v6, v5}, Lo/eik;->a(Lo/eit$b;)Lo/ejl;

    move-result-object v7

    .line 359
    if-nez v7, :cond_4

    .line 360
    invoke-super {p0, p1, p2, p3}, Lo/nt;->d(FFZ)V

    .line 361
    return-void

    .line 364
    :cond_4
    invoke-interface {v7}, Lo/ejl;->b()I

    move-result v4

    .line 366
    iget-object v0, p0, Lo/eir;->c:Lo/lh;

    const/4 v1, 0x1

    invoke-virtual {v0, v4, v1}, Lo/lh;->d(IZ)V

    .line 367
    invoke-super {p0, p1, p2, p3}, Lo/nt;->d(FFZ)V

    .line 368
    return-void
.end method

.method public d(FFZLo/eih$k;Lo/eih$a;II)V
    .locals 5

    .line 381
    const/4 v0, 0x0

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 382
    invoke-virtual {p4}, Lo/eih$k;->e()V

    .line 383
    return-void

    .line 387
    :cond_0
    iget v0, p0, Lo/eir;->D:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 388
    invoke-virtual {p4}, Lo/eih$k;->e()V

    .line 389
    return-void

    .line 395
    :cond_1
    iget-object v0, p0, Lo/eir;->C:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/eir;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-ge p7, v0, :cond_2

    .line 396
    invoke-virtual {p4}, Lo/eih$k;->e()V

    .line 397
    return-void

    .line 400
    :cond_2
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0, p2}, Lo/lp;->b(F)V

    .line 402
    iput p1, p0, Lo/eir;->D:F

    .line 409
    iget v0, p0, Lo/eir;->B:F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 410
    iget v0, p0, Lo/eir;->D:F

    iput v0, p0, Lo/eir;->B:F

    .line 411
    iget v0, p0, Lo/eir;->B:F

    iput v0, p0, Lo/eir;->G:F

    .line 412
    const/4 v0, 0x0

    iput v0, p0, Lo/eir;->F:F

    .line 413
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    iget v1, p0, Lo/eir;->B:F

    invoke-virtual {v0, v1}, Lo/lp;->a(F)V

    .line 414
    iget-object v0, p0, Lo/eir;->u:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->postInvalidate()V

    .line 415
    invoke-virtual {p4}, Lo/eih$k;->e()V

    .line 416
    return-void

    .line 419
    :cond_3
    iget v0, p0, Lo/eir;->D:F

    iget v1, p0, Lo/eir;->B:F

    sub-float/2addr v0, v1

    iput v0, p0, Lo/eir;->F:F

    .line 420
    const-string v0, "HwHealthYAxisRenderer"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set Velocity:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/eir;->F:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    iget v0, p0, Lo/eir;->B:F

    iput v0, p0, Lo/eir;->G:F

    .line 425
    const/4 v4, 0x0

    .line 426
    if-nez p3, :cond_4

    .line 427
    move v4, p6

    .line 431
    :cond_4
    iget-object v0, p0, Lo/eir;->C:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 432
    iget-object v0, p0, Lo/eir;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p7}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 434
    iget-object v0, p0, Lo/eir;->y:Lo/ekj;

    new-instance v1, Lo/eir$5;

    invoke-direct {v1, p0, p5, p4}, Lo/eir$5;-><init>(Lo/eir;Lo/eih$a;Lo/eih$k;)V

    invoke-virtual {v0, v1, v4}, Lo/ekj;->a(Landroid/animation/ValueAnimator$AnimatorUpdateListener;I)V

    .line 457
    return-void
.end method

.method public d(Landroid/graphics/Canvas;)V
    .locals 9

    .line 305
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 306
    :cond_0
    return-void

    .line 308
    :cond_1
    iget-object v0, p0, Lo/eir;->b:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 309
    iget-object v0, p0, Lo/eir;->b:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->d()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 311
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->P()Lo/eit$b;

    move-result-object v0

    sget-object v1, Lo/eit$b;->c:Lo/eit$b;

    if-ne v0, v1, :cond_2

    .line 312
    return-void

    .line 314
    :cond_2
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->P()Lo/eit$b;

    move-result-object v6

    .line 317
    const/4 v7, 0x0

    .line 318
    iget-object v0, p0, Lo/eir;->s:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v8

    .line 320
    if-eqz v8, :cond_3

    .line 321
    nop

    const/4 v7, 0x1

    .line 324
    :cond_3
    iget-boolean v0, p0, Lo/eir;->z:Z

    if-eqz v0, :cond_5

    .line 325
    if-nez v7, :cond_4

    const/4 v7, 0x1

    goto :goto_0

    :cond_4
    const/4 v7, 0x0

    .line 329
    :cond_5
    :goto_0
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne v6, v0, :cond_6

    if-eqz v7, :cond_7

    :cond_6
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne v6, v0, :cond_8

    if-eqz v7, :cond_8

    .line 331
    :cond_7
    move-object v0, p1

    iget-object v1, p0, Lo/eir;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->f()F

    move-result v1

    iget-object v2, p0, Lo/eir;->l:Lo/oa;

    invoke-virtual {v2}, Lo/oa;->e()F

    move-result v2

    iget-object v3, p0, Lo/eir;->l:Lo/oa;

    invoke-virtual {v3}, Lo/oa;->f()F

    move-result v3

    iget-object v4, p0, Lo/eir;->l:Lo/oa;

    .line 332
    invoke-virtual {v4}, Lo/oa;->i()F

    move-result v4

    iget-object v5, p0, Lo/eir;->b:Landroid/graphics/Paint;

    .line 331
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 333
    :cond_8
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne v6, v0, :cond_9

    if-eqz v7, :cond_a

    :cond_9
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne v6, v0, :cond_b

    if-eqz v7, :cond_b

    .line 335
    :cond_a
    move-object v0, p1

    iget-object v1, p0, Lo/eir;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->h()F

    move-result v1

    iget-object v2, p0, Lo/eir;->l:Lo/oa;

    invoke-virtual {v2}, Lo/oa;->e()F

    move-result v2

    iget-object v3, p0, Lo/eir;->l:Lo/oa;

    invoke-virtual {v3}, Lo/oa;->h()F

    move-result v3

    iget-object v4, p0, Lo/eir;->l:Lo/oa;

    .line 336
    invoke-virtual {v4}, Lo/oa;->i()F

    move-result v4

    iget-object v5, p0, Lo/eir;->b:Landroid/graphics/Paint;

    .line 335
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 338
    :cond_b
    :goto_1
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 299
    iput-boolean p1, p0, Lo/eir;->z:Z

    .line 300
    return-void
.end method

.method protected e(Landroid/graphics/Path;F)Landroid/graphics/Path;
    .locals 3

    .line 163
    iget-object v0, p0, Lo/eir;->u:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->E()Lo/ehh;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehh;->c()F

    move-result v1

    .line 164
    iget-object v0, p0, Lo/eir;->u:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->E()Lo/ehh;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehh;->h()F

    move-result v2

    .line 166
    invoke-virtual {p1, v1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 167
    invoke-virtual {p1, v2, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 169
    return-object p1
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 12

    .line 72
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-nez v0, :cond_0

    .line 73
    return-void

    .line 75
    :cond_0
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 77
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v5

    .line 80
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lo/eir;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->o()F

    move-result v1

    iget-object v2, p0, Lo/eir;->l:Lo/oa;

    invoke-virtual {v2}, Lo/oa;->n()F

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 82
    invoke-virtual {p0}, Lo/eir;->a()[F

    move-result-object v6

    .line 84
    iget-object v0, p0, Lo/eir;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 85
    iget-object v0, p0, Lo/eir;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->i()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 86
    iget-object v0, p0, Lo/eir;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->t()Landroid/graphics/DashPathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 88
    iget-object v7, p0, Lo/eir;->i:Landroid/graphics/Path;

    .line 89
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 91
    const/4 v8, 0x0

    :goto_0
    array-length v0, v6

    if-ge v8, v0, :cond_5

    .line 93
    array-length v0, v6

    add-int/lit8 v0, v0, -0x1

    if-eq v8, v0, :cond_1

    array-length v0, v6

    add-int/lit8 v0, v0, -0x2

    if-eq v8, v0, :cond_1

    if-eqz v8, :cond_1

    const/4 v0, 0x1

    if-ne v8, v0, :cond_3

    .line 94
    :cond_1
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->t()Landroid/graphics/DashPathEffect;

    move-result-object v9

    .line 95
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->a()I

    move-result v10

    .line 97
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->S()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 98
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

    .line 100
    :cond_2
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->Q()I

    move-result v11

    .line 103
    :goto_1
    iget-object v0, p0, Lo/eir;->d:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 104
    iget-object v0, p0, Lo/eir;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 105
    invoke-virtual {p0, v7, v8, v6}, Lo/eir;->b(Landroid/graphics/Path;I[F)Landroid/graphics/Path;

    move-result-object v0

    iget-object v1, p0, Lo/eir;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 106
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 107
    iget-object v0, p0, Lo/eir;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 108
    iget-object v0, p0, Lo/eir;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 109
    goto :goto_3

    .line 111
    :cond_3
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->a()I

    move-result v9

    .line 113
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->S()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 114
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

    .line 116
    :cond_4
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->R()I

    move-result v10

    .line 118
    :goto_2
    iget-object v0, p0, Lo/eir;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 120
    invoke-virtual {p0, v7, v8, v6}, Lo/eir;->b(Landroid/graphics/Path;I[F)Landroid/graphics/Path;

    move-result-object v0

    iget-object v1, p0, Lo/eir;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 121
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 122
    iget-object v0, p0, Lo/eir;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 91
    :goto_3
    add-int/lit8 v8, v8, 0x2

    goto/16 :goto_0

    .line 126
    :cond_5
    iget-boolean v0, p0, Lo/eir;->q:Z

    if-eqz v0, :cond_7

    .line 127
    iget-object v0, p0, Lo/eir;->d:Landroid/graphics/Paint;

    iget v1, p0, Lo/eir;->x:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 128
    const/4 v0, 0x2

    new-array v8, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v8, v1

    iget v0, p0, Lo/eir;->v:I

    int-to-float v0, v0

    const/4 v1, 0x1

    aput v0, v8, v1

    .line 129
    iget-object v0, p0, Lo/eir;->e:Lo/nv;

    invoke-virtual {v0, v8}, Lo/nv;->e([F)V

    .line 130
    iget-object v0, p0, Lo/eir;->w:Landroid/graphics/Paint;

    if-eqz v0, :cond_6

    .line 131
    const/4 v0, 0x1

    aget v0, v8, v0

    invoke-virtual {p0, v7, v0}, Lo/eir;->e(Landroid/graphics/Path;F)Landroid/graphics/Path;

    move-result-object v0

    iget-object v1, p0, Lo/eir;->w:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_4

    .line 133
    :cond_6
    const/4 v0, 0x1

    aget v0, v8, v0

    invoke-virtual {p0, v7, v0}, Lo/eir;->e(Landroid/graphics/Path;F)Landroid/graphics/Path;

    move-result-object v0

    iget-object v1, p0, Lo/eir;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 135
    :goto_4
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 138
    :cond_7
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 141
    :cond_8
    iget-object v0, p0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->K()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 142
    invoke-virtual {p0, p1}, Lo/eir;->a(Landroid/graphics/Canvas;)V

    .line 144
    :cond_9
    return-void
.end method

.method public f()I
    .locals 1

    .line 493
    iget v0, p0, Lo/eir;->v:I

    return v0
.end method

.method public g()F
    .locals 1

    .line 571
    iget v0, p0, Lo/eir;->v:I

    int-to-float v0, v0

    return v0
.end method

.method public i()V
    .locals 19

    .line 497
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 498
    :cond_0
    return-void

    .line 500
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->c:Lo/lh;

    invoke-virtual {v0}, Lo/lh;->q()F

    move-result v0

    const v1, 0x49f42400    # 2000000.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 502
    return-void

    .line 505
    :cond_2
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eir;->q:Z

    if-nez v0, :cond_3

    .line 506
    return-void

    .line 509
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lo/eir;->a()[F

    move-result-object v4

    .line 511
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->a:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eir;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->x()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 512
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->a:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eir;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->z()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 513
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->a:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eir;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->A()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 515
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->P()Lo/eit$b;

    move-result-object v5

    .line 517
    const/4 v6, 0x0

    .line 519
    sget-object v0, Lo/eit$b;->c:Lo/eit$b;

    if-ne v5, v0, :cond_4

    .line 520
    return-void

    .line 523
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->I()Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v7, 0x0

    goto :goto_0

    :cond_5
    const/4 v7, 0x1

    .line 524
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->F()Z

    move-result v0

    if-eqz v0, :cond_6

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->k:Lo/lp;

    iget v8, v0, Lo/lp;->d:I

    goto :goto_1

    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->k:Lo/lp;

    iget v0, v0, Lo/lp;->d:I

    add-int/lit8 v8, v0, -0x1

    .line 528
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lo/eir;->d()F

    move-result v9

    .line 531
    new-instance v10, Landroid/graphics/Rect;

    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    .line 532
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->r()Lo/mf;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eir;->v:I

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/eir;->k:Lo/lp;

    invoke-interface {v0, v1, v2}, Lo/mf;->b(FLo/lh;)Ljava/lang/String;

    move-result-object v11

    .line 533
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->a:Landroid/graphics/Paint;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v11, v2, v1, v10}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 534
    const/4 v0, 0x2

    new-array v12, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v12, v1

    move-object/from16 v0, p0

    iget v0, v0, Lo/eir;->v:I

    int-to-float v0, v0

    const/4 v1, 0x1

    aput v0, v12, v1

    .line 535
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->e:Lo/nv;

    invoke-virtual {v0, v12}, Lo/nv;->e([F)V

    .line 536
    const/4 v0, 0x1

    aget v0, v12, v0

    add-float v13, v0, v9

    .line 537
    const/4 v0, 0x1

    aget v0, v12, v0

    add-float/2addr v0, v9

    invoke-virtual {v10}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    add-float v14, v0, v1

    .line 540
    const v0, -0x800001

    move-object/from16 v1, p0

    iput v0, v1, Lo/eir;->A:F

    .line 543
    move v15, v7

    :goto_2
    if-ge v15, v8, :cond_9

    .line 545
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->k:Lo/lp;

    invoke-virtual {v0, v15}, Lo/lp;->d(I)Ljava/lang/String;

    move-result-object v16

    .line 549
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->a:Landroid/graphics/Paint;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v1

    move-object/from16 v2, v16

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1, v10}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 552
    mul-int/lit8 v0, v15, 0x2

    add-int/lit8 v0, v0, 0x1

    aget v0, v4, v0

    add-float v17, v0, v9

    .line 553
    mul-int/lit8 v0, v15, 0x2

    add-int/lit8 v0, v0, 0x1

    aget v0, v4, v0

    add-float/2addr v0, v9

    invoke-virtual {v10}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    add-float v18, v0, v1

    .line 556
    cmpl-float v0, v17, v14

    if-lez v0, :cond_7

    cmpl-float v0, v18, v14

    if-lez v0, :cond_7

    .line 557
    goto :goto_3

    .line 560
    :cond_7
    cmpg-float v0, v17, v13

    if-gez v0, :cond_8

    cmpg-float v0, v18, v13

    if-gez v0, :cond_8

    .line 561
    goto :goto_3

    .line 565
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eir;->k:Lo/lp;

    check-cast v0, Lo/eit;

    iget-object v0, v0, Lo/eit;->a:[F

    aget v0, v0, v15

    move-object/from16 v1, p0

    iput v0, v1, Lo/eir;->A:F

    .line 566
    goto :goto_4

    .line 543
    :goto_3
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_2

    .line 568
    :cond_9
    :goto_4
    return-void
.end method

.method public k()Z
    .locals 1

    .line 489
    iget-boolean v0, p0, Lo/eir;->q:Z

    return v0
.end method
