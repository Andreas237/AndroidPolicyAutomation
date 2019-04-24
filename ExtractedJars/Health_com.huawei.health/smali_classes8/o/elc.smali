.class public Lo/elc;
.super Lo/lr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/elc$b;,
        Lo/elc$c;
    }
.end annotation


# static fields
.field private static final k:Landroid/text/SpannableString;


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Lo/elc$c;

.field private c:Lo/eie;

.field private d:Landroid/widget/TextView;

.field private e:Z

.field private f:I

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/elc$b;>;"
        }
    .end annotation
.end field

.field private h:F

.field private i:Landroid/text/SpannableString;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 250
    new-instance v0, Landroid/text/SpannableString;

    const-string v1, "--"

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    sput-object v0, Lo/elc;->k:Landroid/text/SpannableString;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILo/eie;)V
    .locals 1

    .line 64
    invoke-direct {p0, p1, p2}, Lo/lr;-><init>(Landroid/content/Context;I)V

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elc;->c:Lo/eie;

    .line 61
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/elc;->e:Z

    .line 199
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elc;->b:Lo/elc$c;

    .line 206
    const v0, -0x800001

    iput v0, p0, Lo/elc;->h:F

    .line 247
    const/4 v0, -0x1

    iput v0, p0, Lo/elc;->f:I

    .line 248
    sget-object v0, Lo/elc;->k:Landroid/text/SpannableString;

    iput-object v0, p0, Lo/elc;->i:Landroid/text/SpannableString;

    .line 252
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/elc;->g:Ljava/util/List;

    .line 65
    sget v0, Lcom/huawei/ui/commonui/R$id;->tvTime:I

    invoke-virtual {p0, v0}, Lo/elc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/elc;->a:Landroid/widget/TextView;

    .line 66
    sget v0, Lcom/huawei/ui/commonui/R$id;->tvContent:I

    invoke-virtual {p0, v0}, Lo/elc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/elc;->d:Landroid/widget/TextView;

    .line 68
    iput-object p3, p0, Lo/elc;->c:Lo/eie;

    .line 70
    return-void
.end method

.method private b(F)Ljava/lang/String;
    .locals 3

    .line 484
    iget-object v0, p0, Lo/elc;->c:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v0

    invoke-virtual {v0}, Lo/ln;->r()Lo/mf;

    move-result-object v2

    .line 485
    instance-of v0, v2, Lo/eih$i;

    if-eqz v0, :cond_0

    .line 486
    move-object v0, v2

    check-cast v0, Lo/eih$i;

    iget-object v1, p0, Lo/elc;->c:Lo/eie;

    invoke-virtual {v1}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/eih$i;->a(FLo/lh;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 488
    :cond_0
    iget-object v0, p0, Lo/elc;->c:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v0

    invoke-virtual {v0}, Lo/ln;->r()Lo/mf;

    move-result-object v0

    iget-object v1, p0, Lo/elc;->c:Lo/eie;

    invoke-virtual {v1}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/mf;->b(FLo/lh;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Landroid/graphics/Canvas;[I[FLandroid/graphics/Paint;)V
    .locals 14

    .line 451
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Paint;->reset()V

    .line 452
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    move-object/from16 v1, p4

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 453
    move-object/from16 v0, p4

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 455
    invoke-virtual {p0}, Lo/elc;->getChartView()Lo/ld;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/eie;

    .line 456
    if-nez v8, :cond_0

    .line 457
    const-string v0, "HwHealthMarkerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "markview draw chart null,default draw"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 458
    return-void

    .line 460
    :cond_0
    invoke-virtual {v8}, Lo/eie;->G()Lo/ehi;

    move-result-object v9

    .line 461
    invoke-virtual {v8}, Lo/eie;->E()Lo/ehh;

    move-result-object v10

    .line 463
    invoke-virtual {v9}, Lo/ehi;->a()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v11, v0, v1

    .line 464
    invoke-virtual {v9}, Lo/ehi;->a()F

    move-result v0

    invoke-virtual {v9}, Lo/ehi;->d()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v10}, Lo/ehh;->k()F

    move-result v1

    add-float v12, v0, v1

    .line 471
    new-instance v0, Landroid/graphics/LinearGradient;

    move v2, v11

    move v4, v12

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object v13, v0

    .line 473
    move-object/from16 v0, p4

    invoke-virtual {v0, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 475
    move-object v0, p1

    move v2, v11

    move v4, v12

    move-object/from16 v5, p4

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 481
    return-void
.end method

.method private getMarkerViewButtonColor()I
    .locals 6

    .line 423
    iget-object v0, p0, Lo/elc;->c:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getData()Lo/ma;

    move-result-object v0

    invoke-virtual {v0}, Lo/ma;->h()Ljava/util/List;

    move-result-object v4

    .line 424
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 425
    const/16 v0, 0xff

    const/16 v1, 0xfa

    const/16 v2, 0x65

    const/16 v3, 0x21

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    .line 427
    :cond_0
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/eii;

    .line 429
    instance-of v0, v5, Lo/ehn;

    if-eqz v0, :cond_1

    .line 432
    move-object v0, v5

    check-cast v0, Lo/ehn;

    invoke-virtual {v0}, Lo/ehn;->h()I

    move-result v0

    return v0

    .line 436
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 437
    invoke-virtual {v5}, Lo/eii;->m()I

    move-result v0

    return v0

    .line 439
    :cond_2
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0
.end method


# virtual methods
.method public a(F)V
    .locals 0

    .line 212
    iput p1, p0, Lo/elc;->h:F

    .line 213
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 216
    iput-boolean p1, p0, Lo/elc;->e:Z

    .line 217
    return-void
.end method

.method public a()Z
    .locals 2

    .line 255
    iget v0, p0, Lo/elc;->f:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b(Landroid/graphics/Canvas;FF)V
    .locals 20

    .line 264
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v7

    .line 267
    invoke-virtual/range {p0 .. p0}, Lo/elc;->getChartView()Lo/ld;

    move-result-object v8

    .line 268
    if-nez v8, :cond_0

    .line 269
    const-string v0, "HwHealthMarkerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "markview draw chart null,default draw"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/elc;->draw(Landroid/graphics/Canvas;)V

    .line 271
    move-object/from16 v0, p1

    invoke-virtual {v0, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 272
    return-void

    .line 275
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->b:Lo/elc$c;

    if-nez v0, :cond_3

    .line 277
    invoke-virtual/range {p0 .. p0}, Lo/elc;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    neg-int v0, v0

    int-to-float v0, v0

    add-float v9, p2, v0

    .line 278
    const/4 v0, 0x0

    cmpg-float v0, v9, v0

    if-gez v0, :cond_1

    .line 279
    const/4 v9, 0x0

    goto :goto_0

    .line 280
    :cond_1
    invoke-virtual {v8}, Lo/ld;->getWidth()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lo/elc;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    cmpl-float v0, v9, v0

    if-lez v0, :cond_2

    .line 281
    invoke-virtual {v8}, Lo/ld;->getWidth()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lo/elc;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v9, v0

    .line 283
    :cond_2
    :goto_0
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v9, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 284
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/elc;->draw(Landroid/graphics/Canvas;)V

    .line 285
    goto :goto_1

    .line 286
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_4

    .line 287
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->b:Lo/elc$c;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/elc;->i:Landroid/text/SpannableString;

    invoke-virtual {v1}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/elc;->g:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Lo/elc$c;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 290
    :cond_4
    :goto_1
    move-object/from16 v0, p1

    invoke-virtual {v0, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 292
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v7

    .line 295
    move-object/from16 v0, p0

    iget v0, v0, Lo/elc;->h:F

    invoke-virtual {v8}, Lo/ld;->getViewPortHandler()Lo/oa;

    move-result-object v1

    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    invoke-virtual {v8}, Lo/ld;->getXAxis()Lo/ln;

    move-result-object v2

    invoke-virtual {v2}, Lo/ln;->y()F

    move-result v2

    add-float/2addr v1, v2

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 296
    move-object/from16 v0, p1

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 298
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 299
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 301
    new-instance v10, Landroid/graphics/PorterDuffXfermode;

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v10, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 302
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 305
    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 307
    new-instance v11, Landroid/graphics/Path;

    invoke-direct {v11}, Landroid/graphics/Path;-><init>()V

    .line 310
    const/high16 v0, 0x42100000    # 36.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v12

    .line 312
    const/high16 v0, 0x41580000    # 13.5f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v13

    .line 314
    neg-float v0, v12

    const/4 v1, 0x0

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 318
    move-object v0, v11

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v1, v12

    neg-float v1, v1

    const/high16 v2, 0x40c00000    # 6.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v12

    neg-float v2, v2

    const/high16 v3, 0x40c00000    # 6.0f

    div-float v3, v2, v3

    move v4, v13

    move v6, v13

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 319
    move-object v0, v11

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v12

    const/high16 v2, 0x40c00000    # 6.0f

    div-float/2addr v1, v2

    move v2, v13

    const/high16 v3, 0x40400000    # 3.0f

    mul-float/2addr v3, v12

    const/high16 v4, 0x40c00000    # 6.0f

    div-float/2addr v3, v4

    move v5, v12

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 320
    move-object/from16 v0, p1

    invoke-virtual {v0, v11, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 322
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 325
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 327
    const/high16 v0, 0x40e00000    # 7.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    const/high16 v1, -0x3fc00000    # -3.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    const/16 v2, 0x33

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v9, v0, v3, v1, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 328
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 329
    const/high16 v0, 0x41300000    # 11.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 330
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 331
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v9, v0, v1, v2, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 334
    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 335
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 336
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 337
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 338
    const/high16 v0, 0x41300000    # 11.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 340
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 341
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 344
    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 347
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 348
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 349
    const/4 v0, -0x1

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 351
    invoke-virtual {v9}, Landroid/graphics/Paint;->isAntiAlias()Z

    move-result v14

    .line 352
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 353
    const/high16 v0, 0x41300000    # 11.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 356
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 357
    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 358
    const/16 v0, 0x8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 359
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 360
    const/high16 v0, 0x41340000    # 11.25f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 362
    invoke-virtual {v9, v14}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 373
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 376
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 380
    invoke-direct/range {p0 .. p0}, Lo/elc;->getMarkerViewButtonColor()I

    move-result v15

    .line 382
    move/from16 v16, v15

    .line 383
    .line 384
    invoke-static {v15}, Landroid/graphics/Color;->red(I)I

    move-result v0

    .line 385
    invoke-static {v15}, Landroid/graphics/Color;->green(I)I

    move-result v1

    .line 386
    invoke-static {v15}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    .line 383
    const/4 v3, 0x0

    invoke-static {v3, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v17

    .line 387
    const/4 v0, 0x3

    new-array v0, v0, [I

    move-object/from16 v18, v0

    const/4 v0, 0x0

    aput v17, v18, v0

    const/4 v0, 0x1

    aput v16, v18, v0

    const/4 v0, 0x2

    aput v17, v18, v0

    .line 392
    const/16 v19, 0x3

    move/from16 v0, v19

    new-array v0, v0, [F

    move-object/from16 v19, v0

    fill-array-data v19, :array_0

    .line 393
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/elc;->e:Z

    if-eqz v0, :cond_5

    .line 394
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v18

    move-object/from16 v3, v19

    invoke-direct {v0, v1, v2, v3, v9}, Lo/elc;->c(Landroid/graphics/Canvas;[I[FLandroid/graphics/Paint;)V

    .line 416
    :cond_5
    move-object/from16 v0, p1

    invoke-virtual {v0, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 417
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public d()J
    .locals 4

    .line 259
    iget v0, p0, Lo/elc;->f:I

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public d(Lcom/github/mikephil/charting/data/Entry;Lo/mh;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 75
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "refreshContent deprecated"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Lcom/github/mikephil/charting/data/Entry;Lo/mh;I)V
    .locals 20

    .line 81
    move-object/from16 v0, p1

    instance-of v0, v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;

    if-nez v0, :cond_0

    .line 82
    const-string v0, "HwHealthMarkerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "entryArg not instanceof HwHealthLineData.HwEntrys,logic error,warning!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    return-void

    .line 85
    :cond_0
    move-object/from16 v0, p1

    check-cast v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->getEntries()Ljava/util/List;

    move-result-object v6

    .line 86
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 88
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 89
    const-string v0, "HwHealthMarkerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "markview hwDataEntries size 0,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    return-void

    .line 93
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lo/mh;->b()F

    move-result v0

    float-to-int v0, v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/elc;->f:I

    .line 94
    new-instance v0, Landroid/text/SpannableString;

    invoke-virtual/range {p2 .. p2}, Lo/mh;->b()F

    move-result v1

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/elc;->b(F)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/elc;->i:Landroid/text/SpannableString;

    .line 95
    new-instance v8, Landroid/text/style/ForegroundColorSpan;

    const/4 v0, -0x1

    invoke-direct {v8, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 96
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->i:Landroid/text/SpannableString;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/elc;->i:Landroid/text/SpannableString;

    invoke-virtual {v1}, Landroid/text/SpannableString;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x22

    invoke-virtual {v0, v8, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 97
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->a:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/elc;->i:Landroid/text/SpannableString;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 100
    invoke-virtual/range {p0 .. p0}, Lo/elc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$drawable;->marker_view_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/graphics/drawable/GradientDrawable;

    .line 101
    new-instance v10, Landroid/text/SpannableStringBuilder;

    invoke-direct {v10}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 102
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 104
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    move/from16 v0, p3

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    .line 105
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    .line 106
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->entry:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    if-nez v0, :cond_2

    .line 107
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->g:Ljava/util/List;

    new-instance v1, Lo/elc$b;

    iget-object v2, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    invoke-interface {v2}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    check-cast v3, Lo/eii;

    invoke-direct {v1, v2, v3}, Lo/elc$b;-><init>(Ljava/lang/String;Lo/eii;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    return-void

    .line 110
    :cond_2
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    invoke-interface {v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;->a()I

    move-result v12

    .line 111
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    invoke-interface {v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;->N()I

    move-result v13

    .line 112
    new-instance v14, Landroid/text/style/ForegroundColorSpan;

    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0xff

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-direct {v14, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 114
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->entry:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v13}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v15

    .line 115
    new-instance v0, Landroid/text/SpannableString;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    invoke-interface {v2}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v16, v0

    .line 116
    invoke-virtual/range {v16 .. v16}, Landroid/text/SpannableString;->length()I

    move-result v0

    move-object/from16 v1, v16

    const/4 v2, 0x0

    const/16 v3, 0x22

    invoke-virtual {v1, v14, v2, v0, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 117
    move-object/from16 v0, v16

    invoke-virtual {v10, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 121
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    instance-of v0, v0, Lo/elb;

    if-eqz v0, :cond_3

    .line 122
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->e()Lo/eit$b;

    move-result-object v18

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->c:Lo/eie;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/eie;->a(Lo/eit$b;)Lo/eit;

    move-result-object v0

    invoke-virtual {v0}, Lo/eit;->r()Lo/mf;

    move-result-object v17

    .line 124
    goto :goto_0

    :cond_3
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    instance-of v0, v0, Lo/ehn;

    if-eqz v0, :cond_4

    .line 125
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    check-cast v0, Lo/ehn;

    invoke-virtual {v0}, Lo/ehn;->e()Lo/eit$b;

    move-result-object v18

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->c:Lo/eie;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/eie;->a(Lo/eit$b;)Lo/eit;

    move-result-object v0

    invoke-virtual {v0}, Lo/eit;->r()Lo/mf;

    move-result-object v17

    .line 127
    goto :goto_0

    .line 128
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unrecoginzed dataSet,unsupport getAxisDependencyExt"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 132
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->c:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->Q()Z

    move-result v0

    if-eqz v0, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->c:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->P()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 134
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual/range {p2 .. p2}, Lo/mh;->b()F

    move-result v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/elc;->c:Lo/eie;

    invoke-virtual {v2}, Lo/eie;->getManualReferenceLineValue()I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    move-object/from16 v18, v0

    .line 135
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->g:Ljava/util/List;

    new-instance v1, Lo/elc$b;

    iget-object v2, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    invoke-interface {v2}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    check-cast v3, Lo/eii;

    move-object/from16 v4, v18

    move-object/from16 v5, v17

    invoke-direct {v1, v4, v2, v3, v5}, Lo/elc$b;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Ljava/lang/String;Lo/eii;Lo/mf;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 136
    goto :goto_1

    .line 137
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->g:Ljava/util/List;

    new-instance v1, Lo/elc$b;

    iget-object v2, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->entry:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    iget-object v3, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    invoke-interface {v3}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;->g()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    check-cast v4, Lo/eii;

    move-object/from16 v5, v17

    invoke-direct {v1, v2, v3, v4, v5}, Lo/elc$b;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Ljava/lang/String;Lo/eii;Lo/mf;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    :goto_1
    invoke-virtual {v9, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 141
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 142
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Landroid/widget/LinearLayout$LayoutParams;

    .line 143
    const/4 v0, 0x1

    move-object/from16 v1, v18

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 144
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->a:Landroid/widget/TextView;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 145
    goto/16 :goto_5

    .line 146
    :cond_6
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 147
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    .line 148
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->entry:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    if-nez v0, :cond_7

    .line 149
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->g:Ljava/util/List;

    new-instance v1, Lo/elc$b;

    iget-object v2, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    invoke-interface {v2}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    check-cast v3, Lo/eii;

    invoke-direct {v1, v2, v3}, Lo/elc$b;-><init>(Ljava/lang/String;Lo/eii;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    goto :goto_2

    .line 152
    :cond_7
    iget-object v12, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    .line 153
    invoke-interface {v12}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;->J()I

    move-result v13

    .line 154
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    invoke-interface {v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;->N()I

    move-result v14

    .line 155
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    move v1, v13

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    move-object v15, v0

    .line 156
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->entry:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v14}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v16

    .line 157
    new-instance v0, Landroid/text/SpannableString;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    invoke-interface {v2}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v17, v0

    .line 158
    invoke-virtual/range {v17 .. v17}, Landroid/text/SpannableString;->length()I

    move-result v0

    move-object/from16 v1, v17

    const/4 v2, 0x0

    const/16 v3, 0x22

    invoke-virtual {v1, v15, v2, v0, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 159
    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 163
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    instance-of v0, v0, Lo/elb;

    if-eqz v0, :cond_8

    .line 164
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->e()Lo/eit$b;

    move-result-object v19

    .line 165
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->c:Lo/eie;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/eie;->a(Lo/eit$b;)Lo/eit;

    move-result-object v0

    invoke-virtual {v0}, Lo/eit;->r()Lo/mf;

    move-result-object v18

    .line 166
    goto :goto_3

    :cond_8
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    instance-of v0, v0, Lo/ehn;

    if-eqz v0, :cond_9

    .line 167
    iget-object v0, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    check-cast v0, Lo/ehn;

    invoke-virtual {v0}, Lo/ehn;->e()Lo/eit$b;

    move-result-object v19

    .line 168
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->c:Lo/eie;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/eie;->a(Lo/eit$b;)Lo/eit;

    move-result-object v0

    invoke-virtual {v0}, Lo/eit;->r()Lo/mf;

    move-result-object v18

    .line 169
    goto :goto_3

    .line 170
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unrecoginzed dataSet,unsupport getAxisDependencyExt"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 173
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->g:Ljava/util/List;

    new-instance v1, Lo/elc$b;

    iget-object v2, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->entry:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    iget-object v3, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    invoke-interface {v3}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;->g()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v11, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    check-cast v4, Lo/eii;

    move-object/from16 v5, v18

    invoke-direct {v1, v2, v3, v4, v5}, Lo/elc$b;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Ljava/lang/String;Lo/eii;Lo/mf;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 175
    new-instance v0, Landroid/text/SpannableString;

    const-string v1, "\n"

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v10, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 177
    :cond_a
    goto/16 :goto_2

    .line 178
    :cond_b
    const/16 v0, 0x78

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 180
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 182
    invoke-virtual/range {p0 .. p0}, Lo/elc;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 183
    const/4 v0, 0x3

    iput v0, v11, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    goto :goto_4

    .line 185
    :cond_c
    const/4 v0, 0x5

    iput v0, v11, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 187
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 189
    :goto_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elc;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 190
    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lo/elc;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 191
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-super {v0, v1, v2}, Lo/lr;->d(Lcom/github/mikephil/charting/data/Entry;Lo/mh;)V

    .line 192
    return-void
.end method

.method public e()V
    .locals 1

    .line 195
    sget-object v0, Lo/elc;->k:Landroid/text/SpannableString;

    iput-object v0, p0, Lo/elc;->i:Landroid/text/SpannableString;

    .line 196
    iget-object v0, p0, Lo/elc;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 197
    return-void
.end method

.method public setOnMarkViewTextNotify(Lo/elc$c;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lo/elc;->b:Lo/elc$c;

    .line 203
    return-void
.end method
