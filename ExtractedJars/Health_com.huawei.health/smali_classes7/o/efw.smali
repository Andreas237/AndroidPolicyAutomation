.class public Lo/efw;
.super Lo/efc;
.source "SourceFile"


# instance fields
.field private A:F

.field private B:Lo/efr;

.field private C:Lo/efs;

.field private D:Lo/efs;

.field private E:[I

.field private F:Lo/efr;

.field private G:F

.field private H:Landroid/os/Handler;

.field private I:F

.field private J:I

.field private K:I

.field private L:I

.field private M:I

.field private N:I

.field private O:F

.field private P:F

.field private Q:F

.field private R:F

.field private S:F

.field private T:F

.field private U:F

.field private V:F

.field private W:F

.field private X:F

.field private Y:Ljava/lang/Runnable;

.field private ac:Z

.field private j:F

.field protected n:Lo/efh;

.field q:Z

.field r:F

.field private s:I

.field private t:I

.field private u:I

.field private v:Lo/efr;

.field private w:I

.field private x:I

.field private y:Lo/efr;

.field private z:Lo/efr;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 65
    invoke-direct {p0, p1}, Lo/efc;-><init>(Landroid/content/Context;)V

    .line 38
    const/4 v0, -0x1

    iput v0, p0, Lo/efw;->u:I

    .line 39
    const/4 v0, -0x1

    iput v0, p0, Lo/efw;->s:I

    .line 40
    const/4 v0, -0x1

    iput v0, p0, Lo/efw;->t:I

    .line 41
    const/4 v0, -0x1

    iput v0, p0, Lo/efw;->w:I

    .line 42
    const/4 v0, -0x1

    iput v0, p0, Lo/efw;->x:I

    .line 48
    new-instance v0, Lo/efr;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/efr;-><init>(F)V

    iput-object v0, p0, Lo/efw;->B:Lo/efr;

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/efw;->j:F

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lo/efw;->A:F

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/efw;->I:F

    .line 52
    new-instance v0, Lo/efr;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/high16 v3, -0x3d600000    # -80.0f

    invoke-direct {v0, v1, v2, v3}, Lo/efr;-><init>(FFF)V

    iput-object v0, p0, Lo/efw;->F:Lo/efr;

    .line 53
    const/4 v0, 0x4

    new-array v0, v0, [I

    iput-object v0, p0, Lo/efw;->E:[I

    .line 57
    new-instance v0, Lo/efh;

    invoke-direct {v0}, Lo/efh;-><init>()V

    iput-object v0, p0, Lo/efw;->n:Lo/efh;

    .line 58
    const/4 v0, -0x1

    iput v0, p0, Lo/efw;->K:I

    .line 59
    const/4 v0, -0x1

    iput v0, p0, Lo/efw;->N:I

    .line 60
    const/4 v0, -0x1

    iput v0, p0, Lo/efw;->M:I

    .line 61
    const/4 v0, -0x1

    iput v0, p0, Lo/efw;->J:I

    .line 62
    const/4 v0, -0x1

    iput v0, p0, Lo/efw;->L:I

    .line 279
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lo/efw;->S:F

    .line 280
    const/4 v0, 0x0

    iput v0, p0, Lo/efw;->P:F

    .line 281
    const/4 v0, 0x0

    iput v0, p0, Lo/efw;->Q:F

    .line 282
    const/4 v0, 0x0

    iput v0, p0, Lo/efw;->R:F

    .line 284
    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Lo/efw;->X:F

    .line 287
    const v0, 0x3ca3d70a    # 0.02f

    iput v0, p0, Lo/efw;->W:F

    .line 288
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/efw;->U:F

    .line 315
    new-instance v0, Lo/efw$6;

    invoke-direct {v0, p0}, Lo/efw$6;-><init>(Lo/efw;)V

    iput-object v0, p0, Lo/efw;->Y:Ljava/lang/Runnable;

    .line 384
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/efw;->ac:Z

    .line 66
    new-instance v0, Lo/efq$a;

    invoke-direct {v0}, Lo/efq$a;-><init>()V

    const/16 v1, 0x2601

    invoke-virtual {v0, v1}, Lo/efq$a;->d(I)Lo/efq$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/efq$a;->b()Lo/efq;

    move-result-object v0

    iput-object v0, p0, Lo/efw;->o:Lo/efq;

    .line 67
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lo/efw;->H:Landroid/os/Handler;

    .line 68
    return-void
.end method

.method private C()V
    .locals 1

    .line 292
    const/4 v0, 0x0

    iput v0, p0, Lo/efw;->P:F

    .line 293
    const/4 v0, 0x0

    iput v0, p0, Lo/efw;->Q:F

    .line 294
    const/4 v0, 0x0

    iput v0, p0, Lo/efw;->R:F

    .line 295
    iget v0, p0, Lo/efw;->j:F

    iput v0, p0, Lo/efw;->O:F

    .line 296
    const v0, 0x3f99999a    # 1.2f

    iput v0, p0, Lo/efw;->X:F

    .line 297
    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Lo/efw;->U:F

    .line 298
    return-void
.end method

.method static synthetic a(Lo/efw;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/efw;->X:F

    return v0
.end method

.method static synthetic a(Lo/efw;F)F
    .locals 0

    .line 36
    iput p1, p0, Lo/efw;->P:F

    return p1
.end method

.method static synthetic b(Lo/efw;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/efw;->R:F

    return v0
.end method

.method static synthetic b(Lo/efw;F)F
    .locals 0

    .line 36
    iput p1, p0, Lo/efw;->V:F

    return p1
.end method

.method static synthetic b(Lo/efw;Lo/efr;)Lo/efr;
    .locals 0

    .line 36
    iput-object p1, p0, Lo/efw;->y:Lo/efr;

    return-object p1
.end method

.method static synthetic b(Lo/efw;Lo/efs;)Lo/efs;
    .locals 0

    .line 36
    iput-object p1, p0, Lo/efw;->C:Lo/efs;

    return-object p1
.end method

.method static synthetic c(Lo/efw;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/efw;->V:F

    return v0
.end method

.method static synthetic c(Lo/efw;F)F
    .locals 0

    .line 36
    iput p1, p0, Lo/efw;->O:F

    return p1
.end method

.method static synthetic c(Lo/efw;I)I
    .locals 0

    .line 36
    iput p1, p0, Lo/efw;->M:I

    return p1
.end method

.method static synthetic c(Lo/efw;Lo/efs;)Lo/efs;
    .locals 0

    .line 36
    iput-object p1, p0, Lo/efw;->D:Lo/efs;

    return-object p1
.end method

.method static synthetic d(Lo/efw;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/efw;->O:F

    return v0
.end method

.method static synthetic d(Lo/efw;F)F
    .locals 0

    .line 36
    iput p1, p0, Lo/efw;->Q:F

    return p1
.end method

.method static synthetic d(Lo/efw;Lo/efr;)Lo/efr;
    .locals 0

    .line 36
    iput-object p1, p0, Lo/efw;->z:Lo/efr;

    return-object p1
.end method

.method static synthetic e(Lo/efw;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/efw;->U:F

    return v0
.end method

.method static synthetic e(Lo/efw;F)F
    .locals 0

    .line 36
    iput p1, p0, Lo/efw;->T:F

    return p1
.end method

.method static synthetic f(Lo/efw;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/efw;->S:F

    return v0
.end method

.method static synthetic g(Lo/efw;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/efw;->W:F

    return v0
.end method

.method static synthetic h(Lo/efw;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/efw;->T:F

    return v0
.end method

.method static synthetic i(Lo/efw;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/efw;->P:F

    return v0
.end method

.method private j()V
    .locals 3

    .line 350
    const-string v0, "Medal3D"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ACTION_UP/ACTION_CANCEL mIsOnFlingAnimator="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lo/efw;->ac:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mRotationYFactor="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/efw;->j:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 351
    iget-boolean v0, p0, Lo/efw;->ac:Z

    if-eqz v0, :cond_0

    .line 352
    return-void

    .line 354
    :cond_0
    invoke-direct {p0}, Lo/efw;->C()V

    .line 355
    invoke-virtual {p0}, Lo/efw;->A()V

    .line 356
    return-void
.end method

.method static synthetic k(Lo/efw;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/efw;->Q:F

    return v0
.end method

.method static synthetic k(Lo/efw;F)F
    .locals 0

    .line 36
    iput p1, p0, Lo/efw;->R:F

    return p1
.end method

.method static synthetic l(Lo/efw;)Landroid/os/Handler;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/efw;->H:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic o(Lo/efw;)Ljava/lang/Runnable;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/efw;->Y:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic p(Lo/efw;)I
    .locals 1

    .line 36
    iget v0, p0, Lo/efw;->M:I

    return v0
.end method


# virtual methods
.method public A()V
    .locals 2

    .line 304
    iget-object v0, p0, Lo/efw;->H:Landroid/os/Handler;

    iget-object v1, p0, Lo/efw;->Y:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 305
    return-void
.end method

.method public B()V
    .locals 2

    .line 311
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/efw;->ac:Z

    .line 312
    iget-object v0, p0, Lo/efw;->H:Landroid/os/Handler;

    iget-object v1, p0, Lo/efw;->Y:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 313
    return-void
.end method

.method public a(F)V
    .locals 0

    .line 188
    iput p1, p0, Lo/efw;->I:F

    .line 189
    return-void
.end method

.method public a(FFF)V
    .locals 1

    .line 224
    new-instance v0, Lo/efw$4;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/efw$4;-><init>(Lo/efw;FFF)V

    invoke-virtual {p0, v0}, Lo/efw;->c(Ljava/lang/Runnable;)V

    .line 230
    invoke-virtual {p0}, Lo/efw;->k()V

    .line 231
    return-void
.end method

.method public b(F)V
    .locals 0

    .line 475
    iput p1, p0, Lo/efw;->r:F

    .line 476
    return-void
.end method

.method public b(FFF)V
    .locals 1

    .line 234
    new-instance v0, Lo/efw$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/efw$2;-><init>(Lo/efw;FFF)V

    invoke-virtual {p0, v0}, Lo/efw;->c(Ljava/lang/Runnable;)V

    .line 240
    invoke-virtual {p0}, Lo/efw;->k()V

    .line 241
    return-void
.end method

.method public b(FFFF)V
    .locals 6

    .line 214
    new-instance v0, Lo/efw$3;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lo/efw$3;-><init>(Lo/efw;FFFF)V

    invoke-virtual {p0, v0}, Lo/efw;->c(Ljava/lang/Runnable;)V

    .line 220
    invoke-virtual {p0}, Lo/efw;->k()V

    .line 221
    return-void
.end method

.method public b(Landroid/view/MotionEvent;)V
    .locals 4

    .line 253
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 254
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 256
    :pswitch_0
    invoke-virtual {p0}, Lo/efw;->B()V

    .line 257
    goto :goto_0

    .line 259
    :pswitch_1
    iget v0, p0, Lo/efw;->G:F

    sub-float v3, v2, v0

    .line 260
    iget v0, p0, Lo/efw;->j:F

    const/high16 v1, 0x3e800000    # 0.25f

    mul-float/2addr v1, v3

    add-float/2addr v0, v1

    iput v0, p0, Lo/efw;->j:F

    .line 261
    iget v0, p0, Lo/efw;->j:F

    const/high16 v1, 0x43b40000    # 360.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 262
    iget v0, p0, Lo/efw;->j:F

    const/high16 v1, 0x43b40000    # 360.0f

    sub-float/2addr v0, v1

    iput v0, p0, Lo/efw;->j:F

    .line 264
    :cond_0
    iget v0, p0, Lo/efw;->j:F

    const/high16 v1, -0x3c4c0000    # -360.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_1

    .line 265
    iget v0, p0, Lo/efw;->j:F

    const/high16 v1, 0x43b40000    # 360.0f

    add-float/2addr v0, v1

    iput v0, p0, Lo/efw;->j:F

    .line 267
    :cond_1
    invoke-virtual {p0}, Lo/efw;->k()V

    .line 268
    goto :goto_0

    .line 271
    :pswitch_2
    invoke-direct {p0}, Lo/efw;->j()V

    .line 272
    .line 276
    :goto_0
    iput v2, p0, Lo/efw;->G:F

    .line 277
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public b(Z)V
    .locals 0

    .line 479
    iput-boolean p1, p0, Lo/efw;->q:Z

    .line 480
    return-void
.end method

.method public c()V
    .locals 1

    .line 372
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efw;->v:Lo/efr;

    .line 373
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efw;->z:Lo/efr;

    .line 374
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efw;->y:Lo/efr;

    .line 375
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efw;->D:Lo/efs;

    .line 376
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efw;->C:Lo/efs;

    .line 377
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efw;->B:Lo/efr;

    .line 378
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efw;->F:Lo/efr;

    .line 379
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efw;->E:[I

    .line 380
    invoke-virtual {p0}, Lo/efw;->B()V

    .line 381
    invoke-super {p0}, Lo/efc;->c()V

    .line 382
    return-void
.end method

.method public c(F)V
    .locals 1

    .line 387
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/efw;->ac:Z

    .line 388
    invoke-direct {p0}, Lo/efw;->C()V

    .line 389
    const/high16 v0, 0x41200000    # 10.0f

    div-float v0, p1, v0

    iput v0, p0, Lo/efw;->R:F

    .line 390
    invoke-virtual {p0}, Lo/efw;->A()V

    .line 391
    return-void
.end method

.method public c(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 460
    new-instance v0, Lo/efw$7;

    invoke-direct {v0, p0, p1}, Lo/efw$7;-><init>(Lo/efw;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0}, Lo/efw;->c(Ljava/lang/Runnable;)V

    .line 468
    return-void
.end method

.method public c(Lo/ega;Landroid/graphics/Bitmap;)V
    .locals 15

    .line 419
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 420
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 421
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    .line 422
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    .line 423
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v6, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 424
    new-instance v8, Landroid/graphics/Canvas;

    invoke-direct {v8, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 425
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->h:Landroid/graphics/Bitmap;

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v8, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 426
    const-string v0, "Medal3D"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " backContent="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lo/ega;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    if-nez p2, :cond_0

    .line 428
    move-object/from16 v0, p1

    iget v0, v0, Lo/ega;->b:I

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 429
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->k:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v9, v0, v1

    .line 430
    const/16 v10, 0x2e

    .line 431
    const/high16 v0, 0x42380000    # 46.0f

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 432
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->c:Lo/efo;

    iget v11, v0, Lo/efo;->d:F

    .line 433
    int-to-float v0, v5

    const/high16 v1, 0x42380000    # 46.0f

    invoke-static {v9, v1}, Lo/efe;->a(Ljava/lang/String;F)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p1

    iget-object v1, v1, Lo/ega;->c:Lo/efo;

    iget v1, v1, Lo/efo;->e:F

    add-float/2addr v0, v1

    invoke-virtual {v8, v9, v0, v11, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 434
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->k:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v12, v0, v1

    .line 435
    const/16 v13, 0x20

    .line 436
    const/high16 v0, 0x42000000    # 32.0f

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 437
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->e:Lo/efo;

    iget v0, v0, Lo/efo;->d:F

    const/high16 v1, 0x42380000    # 46.0f

    add-float v14, v0, v1

    .line 438
    int-to-float v0, v5

    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {v12, v1}, Lo/efe;->a(Ljava/lang/String;F)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p1

    iget-object v1, v1, Lo/ega;->e:Lo/efo;

    iget v1, v1, Lo/efo;->e:F

    add-float/2addr v0, v1

    invoke-virtual {v8, v12, v0, v14, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 442
    :cond_0
    const-string v0, "Medal3D"

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    invoke-virtual {p0, v7}, Lo/efw;->c(Landroid/graphics/Bitmap;)V

    .line 444
    return-void
.end method

.method public d(F)V
    .locals 0

    .line 180
    iput p1, p0, Lo/efw;->j:F

    .line 181
    return-void
.end method

.method public d(FFF)V
    .locals 1

    .line 198
    iget-object v0, p0, Lo/efw;->B:Lo/efr;

    iput p1, v0, Lo/efr;->a:F

    .line 199
    iget-object v0, p0, Lo/efw;->B:Lo/efr;

    iput p2, v0, Lo/efr;->e:F

    .line 200
    iget-object v0, p0, Lo/efw;->B:Lo/efr;

    iput p3, v0, Lo/efr;->c:F

    .line 201
    return-void
.end method

.method public d(II)V
    .locals 10

    .line 91
    invoke-super {p0, p1, p2}, Lo/efc;->d(II)V

    .line 92
    const/4 v0, 0x4

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput v1, v0, v2

    const/4 v1, 0x2

    aput p1, v0, v1

    const/4 v1, 0x3

    aput p2, v0, v1

    iput-object v0, p0, Lo/efw;->E:[I

    .line 93
    new-instance v0, Lo/efr;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/efr;-><init>(FFF)V

    iput-object v0, p0, Lo/efw;->v:Lo/efr;

    .line 94
    move-object v0, p0

    iget-object v1, p0, Lo/efw;->v:Lo/efr;

    iget v1, v1, Lo/efr;->a:F

    iget-object v2, p0, Lo/efw;->v:Lo/efr;

    iget v2, v2, Lo/efr;->e:F

    iget-object v3, p0, Lo/efw;->v:Lo/efr;

    iget v3, v3, Lo/efr;->c:F

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/high16 v6, -0x40800000    # -1.0f

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    invoke-virtual/range {v0 .. v9}, Lo/efw;->b(FFFFFFFFF)V

    .line 95
    iget-object v0, p0, Lo/efw;->n:Lo/efh;

    const/high16 v1, -0x41000000    # -0.5f

    const/high16 v2, 0x3f000000    # 0.5f

    const/high16 v3, -0x41000000    # -0.5f

    const/high16 v4, 0x3f000000    # 0.5f

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x42c80000    # 100.0f

    invoke-virtual/range {v0 .. v6}, Lo/efh;->c(FFFFFF)V

    .line 96
    iget-object v0, p0, Lo/efw;->n:Lo/efh;

    const/4 v1, 0x0

    const/high16 v2, 0x41f00000    # 30.0f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/high16 v9, -0x40800000    # -1.0f

    invoke-virtual/range {v0 .. v9}, Lo/efh;->c(FFFFFFFFF)V

    .line 97
    return-void
.end method

.method public d(Lo/ega;)V
    .locals 15

    .line 394
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 395
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 396
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    .line 397
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    .line 398
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v6, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 399
    new-instance v8, Landroid/graphics/Canvas;

    invoke-direct {v8, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 401
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->h:Landroid/graphics/Bitmap;

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v8, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 402
    move-object/from16 v0, p1

    iget v0, v0, Lo/ega;->b:I

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 403
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->k:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v9, v0, v1

    .line 404
    const/16 v10, 0x2e

    .line 405
    const/high16 v0, 0x42380000    # 46.0f

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 406
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->c:Lo/efo;

    iget v11, v0, Lo/efo;->d:F

    .line 407
    int-to-float v0, v5

    const/high16 v1, 0x42380000    # 46.0f

    invoke-static {v9, v1}, Lo/efe;->a(Ljava/lang/String;F)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p1

    iget-object v1, v1, Lo/ega;->c:Lo/efo;

    iget v1, v1, Lo/efo;->e:F

    add-float/2addr v0, v1

    invoke-virtual {v8, v9, v0, v11, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 408
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->k:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v12, v0, v1

    .line 409
    const/16 v13, 0x20

    .line 410
    const/high16 v0, 0x42000000    # 32.0f

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 411
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/ega;->e:Lo/efo;

    iget v0, v0, Lo/efo;->d:F

    const/high16 v1, 0x42380000    # 46.0f

    add-float v14, v0, v1

    .line 412
    int-to-float v0, v5

    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {v12, v1}, Lo/efe;->a(Ljava/lang/String;F)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p1

    iget-object v1, v1, Lo/ega;->e:Lo/efo;

    iget v1, v1, Lo/efo;->e:F

    add-float/2addr v0, v1

    invoke-virtual {v8, v12, v0, v14, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 414
    const-string v0, "Medal3D"

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    invoke-virtual {p0, v7}, Lo/efw;->c(Landroid/graphics/Bitmap;)V

    .line 416
    return-void
.end method

.method public e(FF)Lo/efo;
    .locals 12

    .line 359
    const/4 v0, 0x4

    new-array v11, v0, [F

    .line 360
    move v0, p1

    iget-object v1, p0, Lo/efw;->E:[I

    const/4 v2, 0x3

    aget v1, v1, v2

    int-to-float v1, v1

    sub-float/2addr v1, p2

    invoke-virtual {p0}, Lo/efw;->m()[F

    move-result-object v3

    invoke-virtual {p0}, Lo/efw;->n()[F

    move-result-object v5

    iget-object v7, p0, Lo/efw;->E:[I

    move-object v9, v11

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v0 .. v10}, Landroid/opengl/GLU;->gluUnProject(FFF[FI[FI[II[FI)I

    .line 361
    const/4 v0, 0x3

    aget v0, v11, v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 362
    const-string v0, "Medal3D"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "mWinPosToGlPos[3] == 0.0f"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    const/4 v0, 0x0

    return-object v0

    .line 365
    :cond_0
    const/4 v0, 0x0

    aget v0, v11, v0

    const/4 v1, 0x3

    aget v1, v11, v1

    div-float/2addr v0, v1

    const/4 v1, 0x0

    aput v0, v11, v1

    .line 366
    const/4 v0, 0x1

    aget v0, v11, v0

    const/4 v1, 0x3

    aget v1, v11, v1

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v11, v1

    .line 367
    new-instance v0, Lo/efo;

    const/4 v1, 0x0

    aget v1, v11, v1

    const v2, 0x3da3d70a    # 0.08f

    mul-float/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v11, v2

    const v3, 0x3da3d70a    # 0.08f

    mul-float/2addr v2, v3

    invoke-direct {v0, v1, v2}, Lo/efo;-><init>(FF)V

    return-object v0
.end method

.method protected e()V
    .locals 2

    .line 131
    const-string v0, "Medal3D"

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    invoke-super {p0}, Lo/efc;->e()V

    .line 133
    const-string v0, "uLightLocation"

    invoke-virtual {p0, v0}, Lo/efw;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/efw;->u:I

    .line 134
    const-string v0, "uLight2Location"

    invoke-virtual {p0, v0}, Lo/efw;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/efw;->s:I

    .line 135
    const-string v0, "uCamera"

    invoke-virtual {p0, v0}, Lo/efw;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/efw;->t:I

    .line 137
    const-string v0, "uLight1Intensity"

    invoke-virtual {p0, v0}, Lo/efw;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/efw;->w:I

    .line 138
    const-string v0, "uLight2Intensity"

    invoke-virtual {p0, v0}, Lo/efw;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/efw;->x:I

    .line 139
    const-string v0, "uMVPMatrixGY"

    invoke-virtual {p0, v0}, Lo/efw;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/efw;->K:I

    .line 140
    const-string v0, "sLightImg"

    invoke-virtual {p0, v0}, Lo/efw;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/efw;->N:I

    .line 141
    const-string v0, "isBg"

    invoke-virtual {p0, v0}, Lo/efw;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/efw;->J:I

    .line 142
    const-string v0, "vContent"

    invoke-virtual {p0, v0}, Lo/efw;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/efw;->L:I

    .line 143
    return-void
.end method

.method public e(F)V
    .locals 0

    .line 184
    iput p1, p0, Lo/efw;->A:F

    .line 185
    return-void
.end method

.method public e(FFF)V
    .locals 1

    .line 192
    iget-object v0, p0, Lo/efw;->F:Lo/efr;

    iput p1, v0, Lo/efr;->a:F

    .line 193
    iget-object v0, p0, Lo/efw;->F:Lo/efr;

    iput p2, v0, Lo/efr;->e:F

    .line 194
    iget-object v0, p0, Lo/efw;->F:Lo/efr;

    iput p3, v0, Lo/efr;->c:F

    .line 195
    return-void
.end method

.method public e(FFFF)V
    .locals 6

    .line 204
    new-instance v0, Lo/efw$1;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lo/efw$1;-><init>(Lo/efw;FFFF)V

    invoke-virtual {p0, v0}, Lo/efw;->c(Ljava/lang/Runnable;)V

    .line 210
    invoke-virtual {p0}, Lo/efw;->k()V

    .line 211
    return-void
.end method

.method public f()V
    .locals 1

    .line 72
    invoke-super {p0}, Lo/efc;->f()V

    .line 73
    new-instance v0, Lo/efw$5;

    invoke-direct {v0, p0}, Lo/efw$5;-><init>(Lo/efw;)V

    invoke-virtual {p0, v0}, Lo/efw;->c(Ljava/lang/Runnable;)V

    .line 87
    return-void
.end method

.method public i()V
    .locals 12

    .line 101
    iget-boolean v0, p0, Lo/efw;->q:Z

    if-eqz v0, :cond_1

    .line 102
    iget v0, p0, Lo/efw;->j:F

    iget v1, p0, Lo/efw;->r:F

    add-float/2addr v0, v1

    iput v0, p0, Lo/efw;->j:F

    .line 103
    iget v0, p0, Lo/efw;->r:F

    const/high16 v1, 0x43b40000    # 360.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 104
    iget v0, p0, Lo/efw;->r:F

    const/high16 v1, 0x43b40000    # 360.0f

    sub-float/2addr v0, v1

    iput v0, p0, Lo/efw;->r:F

    goto :goto_0

    .line 105
    :cond_0
    iget v0, p0, Lo/efw;->r:F

    const/high16 v1, -0x3c4c0000    # -360.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 106
    iget v0, p0, Lo/efw;->r:F

    const/high16 v1, 0x43b40000    # 360.0f

    add-float/2addr v0, v1

    iput v0, p0, Lo/efw;->r:F

    .line 109
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/efw;->h:Lo/efh;

    invoke-virtual {v0}, Lo/efh;->b()V

    .line 110
    iget-object v0, p0, Lo/efw;->F:Lo/efr;

    invoke-virtual {p0, v0}, Lo/efw;->d(Lo/efr;)V

    .line 111
    iget-object v0, p0, Lo/efw;->B:Lo/efr;

    invoke-virtual {p0, v0}, Lo/efw;->b(Lo/efr;)V

    .line 112
    iget v0, p0, Lo/efw;->j:F

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/efw;->c(FFFF)V

    .line 113
    iget v0, p0, Lo/efw;->A:F

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/efw;->c(FFFF)V

    .line 114
    iget v0, p0, Lo/efw;->I:F

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/efw;->c(FFFF)V

    .line 116
    iget-object v0, p0, Lo/efw;->n:Lo/efh;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/high16 v3, -0x3bb80000    # -800.0f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    invoke-virtual/range {v0 .. v9}, Lo/efh;->c(FFFFFFFFF)V

    .line 118
    invoke-super {p0}, Lo/efc;->i()V

    .line 119
    iget-object v0, p0, Lo/efw;->h:Lo/efh;

    invoke-virtual {v0}, Lo/efh;->c()V

    .line 121
    iget v0, p0, Lo/efw;->K:I

    iget-object v1, p0, Lo/efw;->n:Lo/efh;

    invoke-virtual {v1}, Lo/efh;->a()[F

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v1, v4}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 123
    iget v0, p0, Lo/efw;->J:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 124
    iget v0, p0, Lo/efw;->j:F

    const/high16 v1, 0x43b40000    # 360.0f

    rem-float v10, v0, v1

    .line 125
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x42b40000    # 90.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x43870000    # 270.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    const/4 v11, 0x1

    goto :goto_1

    :cond_2
    const/4 v11, 0x0

    .line 126
    :goto_1
    iget v0, p0, Lo/efw;->J:I

    if-eqz v11, :cond_3

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 128
    :cond_4
    return-void
.end method

.method protected q()I
    .locals 1

    .line 245
    const-string v0, "uMMatrix"

    invoke-virtual {p0, v0}, Lo/efw;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method protected v()V
    .locals 7

    .line 148
    iget-object v0, p0, Lo/efw;->F:Lo/efr;

    iget v5, v0, Lo/efr;->a:F

    .line 149
    iget-object v0, p0, Lo/efw;->F:Lo/efr;

    iget v6, v0, Lo/efr;->e:F

    .line 150
    iget v0, p0, Lo/efw;->t:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 151
    iget v0, p0, Lo/efw;->t:I

    iget-object v1, p0, Lo/efw;->v:Lo/efr;

    iget v1, v1, Lo/efr;->a:F

    add-float/2addr v1, v5

    iget-object v2, p0, Lo/efw;->v:Lo/efr;

    iget v2, v2, Lo/efr;->e:F

    add-float/2addr v2, v6

    iget-object v3, p0, Lo/efw;->v:Lo/efr;

    iget v3, v3, Lo/efr;->c:F

    invoke-static {v0, v1, v2, v3}, Landroid/opengl/GLES20;->glUniform3f(IFFF)V

    .line 153
    :cond_0
    iget v0, p0, Lo/efw;->u:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lo/efw;->z:Lo/efr;

    if-eqz v0, :cond_1

    .line 154
    iget v0, p0, Lo/efw;->u:I

    iget-object v1, p0, Lo/efw;->z:Lo/efr;

    iget v1, v1, Lo/efr;->a:F

    add-float/2addr v1, v5

    iget-object v2, p0, Lo/efw;->z:Lo/efr;

    iget v2, v2, Lo/efr;->e:F

    add-float/2addr v2, v6

    iget-object v3, p0, Lo/efw;->z:Lo/efr;

    iget v3, v3, Lo/efr;->c:F

    invoke-static {v0, v1, v2, v3}, Landroid/opengl/GLES20;->glUniform3f(IFFF)V

    .line 156
    :cond_1
    iget v0, p0, Lo/efw;->w:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lo/efw;->D:Lo/efs;

    if-eqz v0, :cond_2

    .line 157
    iget v0, p0, Lo/efw;->w:I

    iget-object v1, p0, Lo/efw;->D:Lo/efs;

    iget v1, v1, Lo/efs;->e:F

    iget-object v2, p0, Lo/efw;->D:Lo/efs;

    iget v2, v2, Lo/efs;->b:F

    iget-object v3, p0, Lo/efw;->D:Lo/efs;

    iget v3, v3, Lo/efs;->d:F

    iget-object v4, p0, Lo/efw;->D:Lo/efs;

    iget v4, v4, Lo/efs;->c:F

    invoke-static {v0, v1, v2, v3, v4}, Landroid/opengl/GLES20;->glUniform4f(IFFFF)V

    .line 159
    :cond_2
    iget v0, p0, Lo/efw;->s:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lo/efw;->y:Lo/efr;

    if-eqz v0, :cond_3

    .line 160
    iget v0, p0, Lo/efw;->s:I

    iget-object v1, p0, Lo/efw;->y:Lo/efr;

    iget v1, v1, Lo/efr;->a:F

    add-float/2addr v1, v5

    iget-object v2, p0, Lo/efw;->y:Lo/efr;

    iget v2, v2, Lo/efr;->e:F

    add-float/2addr v2, v6

    iget-object v3, p0, Lo/efw;->y:Lo/efr;

    iget v3, v3, Lo/efr;->c:F

    invoke-static {v0, v1, v2, v3}, Landroid/opengl/GLES20;->glUniform3f(IFFF)V

    .line 162
    :cond_3
    iget v0, p0, Lo/efw;->x:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lo/efw;->C:Lo/efs;

    if-eqz v0, :cond_4

    .line 163
    iget v0, p0, Lo/efw;->x:I

    iget-object v1, p0, Lo/efw;->C:Lo/efs;

    iget v1, v1, Lo/efs;->e:F

    iget-object v2, p0, Lo/efw;->C:Lo/efs;

    iget v2, v2, Lo/efs;->b:F

    iget-object v3, p0, Lo/efw;->C:Lo/efs;

    iget v3, v3, Lo/efs;->d:F

    iget-object v4, p0, Lo/efw;->C:Lo/efs;

    iget v4, v4, Lo/efs;->c:F

    invoke-static {v0, v1, v2, v3, v4}, Landroid/opengl/GLES20;->glUniform4f(IFFFF)V

    .line 166
    :cond_4
    iget v0, p0, Lo/efw;->M:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    .line 167
    iget v0, p0, Lo/efw;->L:I

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 168
    const v0, 0x84c2

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 169
    iget v0, p0, Lo/efw;->M:I

    const/16 v1, 0xde1

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 170
    iget v0, p0, Lo/efw;->N:I

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 171
    const-string v0, "Medal3D"

    const-string v1, "onDrawArraysPre:mTextureLight != -1"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 174
    :cond_5
    iget v0, p0, Lo/efw;->L:I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 177
    :goto_0
    return-void
.end method

.method protected z()I
    .locals 1

    .line 249
    const-string v0, "sTexture"

    invoke-virtual {p0, v0}, Lo/efw;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method
