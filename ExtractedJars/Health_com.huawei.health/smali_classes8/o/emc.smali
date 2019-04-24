.class public Lo/emc;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/emc$c;,
        Lo/emc$d;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field d:Landroid/content/Context;

.field private e:I

.field private f:I

.field private g:F

.field private h:F

.field private i:Landroid/graphics/Bitmap;

.field private k:Landroid/graphics/Bitmap;

.field private l:I

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/emc$d;>;"
        }
    .end annotation
.end field

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:Lo/emc$d;

.field private s:Z

.field private t:Z

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/emc$c;>;"
        }
    .end annotation
.end field

.field private v:F

.field private y:F

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 128
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 72
    const/4 v0, 0x5

    iput v0, p0, Lo/emc;->l:I

    .line 77
    const/16 v0, 0x1e

    iput v0, p0, Lo/emc;->p:I

    .line 78
    const/16 v0, 0x64

    iput v0, p0, Lo/emc;->n:I

    .line 79
    const/16 v0, 0x32

    iput v0, p0, Lo/emc;->o:I

    .line 83
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emc;->s:Z

    .line 86
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/emc;->t:Z

    .line 384
    const/4 v0, 0x0

    iput v0, p0, Lo/emc;->z:F

    .line 385
    const/4 v0, 0x0

    iput v0, p0, Lo/emc;->y:F

    .line 129
    invoke-direct {p0, p1, p2}, Lo/emc;->b(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 130
    iput-object p1, p0, Lo/emc;->d:Landroid/content/Context;

    .line 131
    invoke-direct {p0}, Lo/emc;->c()V

    .line 133
    return-void
.end method

.method private a(I)F
    .locals 3

    .line 458
    if-nez p1, :cond_0

    .line 460
    iget v0, p0, Lo/emc;->a:I

    int-to-float v0, v0

    iget v1, p0, Lo/emc;->g:F

    add-float/2addr v0, v1

    return v0

    .line 462
    :cond_0
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    add-int/lit8 v1, p1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/emc$d;

    iget v0, v0, Lo/emc$d;->c:F

    iget v1, p0, Lo/emc;->g:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0
.end method

.method private a()V
    .locals 2

    .line 431
    iget-object v0, p0, Lo/emc;->r:Lo/emc$d;

    if-eqz v0, :cond_2

    .line 432
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/emc;->s:Z

    .line 434
    iget v0, p0, Lo/emc;->v:F

    iget v1, p0, Lo/emc;->z:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 435
    iget v0, p0, Lo/emc;->q:I

    iget v1, p0, Lo/emc;->z:F

    invoke-direct {p0, v0, v1}, Lo/emc;->b(IF)V

    goto :goto_0

    .line 436
    :cond_0
    iget v0, p0, Lo/emc;->v:F

    iget v1, p0, Lo/emc;->y:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    .line 437
    iget v0, p0, Lo/emc;->q:I

    iget v1, p0, Lo/emc;->y:F

    invoke-direct {p0, v0, v1}, Lo/emc;->b(IF)V

    goto :goto_0

    .line 439
    :cond_1
    iget v0, p0, Lo/emc;->q:I

    iget v1, p0, Lo/emc;->v:F

    invoke-direct {p0, v0, v1}, Lo/emc;->b(IF)V

    .line 442
    :cond_2
    :goto_0
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 11

    .line 205
    iget v0, p0, Lo/emc;->f:I

    int-to-float v0, v0

    iget v1, p0, Lo/emc;->g:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/emc;->c:I

    int-to-float v1, v1

    add-float v4, v0, v1

    .line 207
    iget v0, p0, Lo/emc;->a:I

    int-to-float v0, v0

    iget v1, p0, Lo/emc;->g:F

    add-float v5, v0, v1

    .line 208
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 209
    const/high16 v0, -0x80000000

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 210
    iget-object v0, p0, Lo/emc;->d:Landroid/content/Context;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 211
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 214
    iget-object v0, p0, Lo/emc;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, v4

    invoke-static {v6}, Lo/ene;->c(Landroid/graphics/Paint;)F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40400000    # 3.0f

    add-float v7, v0, v1

    .line 216
    iget v0, p0, Lo/emc;->n:I

    iget v1, p0, Lo/emc;->p:I

    sub-int/2addr v0, v1

    div-int/lit8 v8, v0, 0xa

    .line 217
    const/4 v9, 0x0

    :goto_0
    if-gt v9, v8, :cond_2

    .line 219
    if-eq v9, v8, :cond_0

    .line 220
    iget-object v0, p0, Lo/emc;->k:Landroid/graphics/Bitmap;

    mul-int/lit8 v1, v9, 0xa

    int-to-float v1, v1

    iget v2, p0, Lo/emc;->h:F

    mul-float/2addr v1, v2

    add-float/2addr v1, v5

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v4, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 226
    :cond_0
    if-ne v9, v8, :cond_1

    .line 228
    iget v0, p0, Lo/emc;->n:I

    int-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 229
    iget v0, p0, Lo/emc;->b:I

    int-to-float v0, v0

    .line 230
    invoke-static {v6, v10}, Lo/ene;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    .line 229
    invoke-virtual {p1, v10, v0, v7, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 233
    goto :goto_1

    .line 236
    :cond_1
    mul-int/lit8 v0, v9, 0xa

    iget v1, p0, Lo/emc;->p:I

    add-int/2addr v0, v1

    int-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 237
    mul-int/lit8 v0, v9, 0xa

    int-to-float v0, v0

    iget v1, p0, Lo/emc;->h:F

    mul-float/2addr v0, v1

    add-float/2addr v0, v5

    .line 238
    invoke-static {v6, v10}, Lo/ene;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    .line 237
    invoke-virtual {p1, v10, v0, v7, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 217
    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 245
    :cond_2
    return-void
.end method

.method private b(I)I
    .locals 2

    .line 280
    const/4 v1, 0x0

    .line 281
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 283
    :pswitch_0
    const v1, -0xc26301

    .line 284
    goto :goto_0

    .line 286
    :pswitch_1
    const v1, -0xff29a7

    .line 287
    goto :goto_0

    .line 289
    :pswitch_2
    const/16 v1, -0x45e5

    .line 290
    goto :goto_0

    .line 292
    :pswitch_3
    const v1, -0x49ade

    .line 293
    goto :goto_0

    .line 295
    :pswitch_4
    const v1, -0xcce0

    .line 296
    .line 301
    :goto_0
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private b()V
    .locals 5

    .line 445
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emc;->s:Z

    .line 446
    invoke-virtual {p0}, Lo/emc;->invalidate()V

    .line 449
    iget-object v0, p0, Lo/emc;->u:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/emc;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 450
    iget-object v0, p0, Lo/emc;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/emc$c;

    .line 451
    iget v0, p0, Lo/emc;->q:I

    iget-object v1, p0, Lo/emc;->m:Ljava/util/List;

    iget v2, p0, Lo/emc;->q:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/emc$d;

    iget v1, v1, Lo/emc$d;->a:F

    invoke-interface {v4, v0, v1}, Lo/emc$c;->b(IF)V

    .line 452
    goto :goto_0

    .line 454
    :cond_0
    return-void
.end method

.method private b(IF)V
    .locals 3

    .line 477
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/emc$d;

    iput p2, v0, Lo/emc$d;->c:F

    .line 478
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/emc$d;

    iget v1, p0, Lo/emc;->a:I

    int-to-float v1, v1

    sub-float v1, p2, v1

    iget v2, p0, Lo/emc;->h:F

    div-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    sub-float/2addr v1, v2

    iget v2, p0, Lo/emc;->p:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Lo/emc$d;->a:F

    .line 480
    invoke-virtual {p0}, Lo/emc;->invalidate()V

    .line 481
    return-void
.end method

.method private b(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 154
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 155
    :cond_0
    return-void

    .line 157
    :cond_1
    sget-object v0, Lcom/huawei/ui/commonui/R$styleable;->KRangeSeekBar_Style:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 159
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->KRangeSeekBar_Style_startScale:I

    iget v1, p0, Lo/emc;->p:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/emc;->p:I

    .line 160
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->KRangeSeekBar_Style_endScale:I

    iget v1, p0, Lo/emc;->n:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/emc;->n:I

    .line 163
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 164
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 10

    .line 316
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lo/emc;->s:Z

    if-eqz v0, :cond_2

    .line 318
    iget-object v0, p0, Lo/emc;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    .line 319
    if-nez v5, :cond_0

    .line 320
    invoke-virtual {p0}, Lo/emc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$mipmap;->seekbar_pop:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v4

    goto :goto_0

    .line 322
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/commonui/R$attr;->imagePopStyle:I

    const/4 v2, 0x0

    aput v1, v0, v2

    invoke-virtual {v5, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v6

    .line 323
    if-eqz v6, :cond_1

    .line 324
    invoke-virtual {p0}, Lo/emc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$mipmap;->seekbar_pop:I

    const/4 v2, 0x0

    invoke-virtual {v6, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 325
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    .line 327
    :cond_1
    invoke-virtual {p0}, Lo/emc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$mipmap;->seekbar_pop:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 331
    :goto_0
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    iget v1, p0, Lo/emc;->q:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/emc$d;

    iget v0, v0, Lo/emc$d;->c:F

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v6, v0, v1

    .line 332
    iget-object v0, p0, Lo/emc;->d:Landroid/content/Context;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v7, v0

    .line 333
    const/4 v0, 0x0

    invoke-virtual {p1, v4, v6, v7, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 335
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 336
    iget-object v0, p0, Lo/emc;->d:Landroid/content/Context;

    const/high16 v1, 0x41500000    # 13.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 337
    const/4 v0, -0x1

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 338
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 339
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    iget v1, p0, Lo/emc;->q:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/emc$d;

    iget v0, v0, Lo/emc$d;->a:F

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 340
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    iget v1, p0, Lo/emc;->q:I

    .line 341
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/emc$d;

    iget v0, v0, Lo/emc$d;->c:F

    invoke-static {v8, v9}, Lo/ene;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    .line 342
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v1, v7

    iget-object v2, p0, Lo/emc;->d:Landroid/content/Context;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    .line 340
    invoke-virtual {p1, v9, v0, v1, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 345
    :cond_2
    return-void
.end method

.method private c(I)F
    .locals 3

    .line 469
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    .line 470
    iget v0, p0, Lo/emc;->b:I

    int-to-float v0, v0

    iget v1, p0, Lo/emc;->g:F

    sub-float/2addr v0, v1

    return v0

    .line 472
    :cond_0
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    add-int/lit8 v1, p1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/emc$d;

    iget v0, v0, Lo/emc$d;->c:F

    iget v1, p0, Lo/emc;->g:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    return v0
.end method

.method private c()V
    .locals 4

    .line 137
    invoke-virtual {p0}, Lo/emc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$mipmap;->seekbar_di_scale:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/emc;->k:Landroid/graphics/Bitmap;

    .line 138
    invoke-virtual {p0}, Lo/emc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$mipmap;->seekbar_btn_drag:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/emc;->i:Landroid/graphics/Bitmap;

    .line 139
    iget-object v0, p0, Lo/emc;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/emc;->g:F

    .line 140
    iget-object v0, p0, Lo/emc;->d:Landroid/content/Context;

    const/high16 v1, 0x42340000    # 45.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/emc;->f:I

    .line 142
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/emc;->u:Ljava/util/List;

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/emc;->m:Ljava/util/List;

    .line 145
    const/4 v2, 0x0

    :goto_0
    iget v0, p0, Lo/emc;->l:I

    if-ge v2, v0, :cond_0

    .line 146
    new-instance v3, Lo/emc$d;

    invoke-direct {v3}, Lo/emc$d;-><init>()V

    .line 147
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 150
    :cond_0
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 5

    .line 308
    const/4 v4, 0x0

    :goto_0
    iget v0, p0, Lo/emc;->l:I

    if-ge v4, v0, :cond_0

    .line 309
    iget-object v0, p0, Lo/emc;->i:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/emc$d;

    iget v1, v1, Lo/emc$d;->c:F

    iget v2, p0, Lo/emc;->g:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/emc;->f:I

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 308
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 312
    :cond_0
    return-void
.end method

.method private d()V
    .locals 5

    .line 369
    iget v0, p0, Lo/emc;->e:I

    int-to-float v0, v0

    iget v1, p0, Lo/emc;->g:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lo/emc;->n:I

    iget v2, p0, Lo/emc;->p:I

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/emc;->h:F

    .line 370
    const/4 v3, 0x0

    :goto_0
    iget v0, p0, Lo/emc;->l:I

    if-ge v3, v0, :cond_0

    .line 371
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/emc$d;

    .line 372
    iget v0, p0, Lo/emc;->o:I

    mul-int/lit8 v1, v3, 0xa

    add-int/2addr v0, v1

    int-to-float v0, v0

    iput v0, v4, Lo/emc$d;->a:F

    .line 373
    iget v0, v4, Lo/emc$d;->a:F

    iget v1, p0, Lo/emc;->p:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/emc;->h:F

    mul-float/2addr v0, v1

    iget v1, p0, Lo/emc;->g:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/emc;->a:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    iput v0, v4, Lo/emc$d;->c:F

    .line 370
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 376
    :cond_0
    return-void
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 9

    .line 250
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 252
    iget v0, p0, Lo/emc;->f:I

    int-to-float v0, v0

    iget v1, p0, Lo/emc;->g:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/emc;->c:I

    int-to-float v1, v1

    sub-float v3, v0, v1

    .line 253
    iget v0, p0, Lo/emc;->f:I

    int-to-float v0, v0

    iget v1, p0, Lo/emc;->g:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/emc;->c:I

    int-to-float v1, v1

    add-float v4, v0, v1

    .line 256
    const/4 v5, 0x1

    :goto_0
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 257
    invoke-direct {p0, v5}, Lo/emc;->b(I)I

    move-result v6

    .line 258
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 259
    invoke-virtual {v7, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 260
    new-instance v8, Landroid/graphics/RectF;

    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 261
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    add-int/lit8 v1, v5, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/emc$d;

    iget v0, v0, Lo/emc$d;->c:F

    iget-object v1, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/emc$d;

    iget v1, v1, Lo/emc$d;->c:F

    invoke-virtual {v8, v0, v3, v1, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 262
    invoke-virtual {p1, v8, v7}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 256
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 266
    :cond_0
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    .line 267
    iget v0, p0, Lo/emc;->e:I

    int-to-float v0, v0

    iget v1, p0, Lo/emc;->g:F

    add-float v6, v0, v1

    .line 268
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    iget-object v1, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/emc$d;

    iget v0, v0, Lo/emc$d;->c:F

    invoke-virtual {v5, v0, v3, v6, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 269
    invoke-virtual {p0}, Lo/emc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$mipmap;->bg_bar_righter:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 270
    new-instance v8, Landroid/graphics/NinePatch;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v8, v7, v0, v1}, Landroid/graphics/NinePatch;-><init>(Landroid/graphics/Bitmap;[BLjava/lang/String;)V

    .line 271
    invoke-virtual {v8, p1, v5}, Landroid/graphics/NinePatch;->draw(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V

    .line 276
    :cond_1
    return-void
.end method

.method private e()V
    .locals 4

    .line 416
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/emc;->s:Z

    .line 417
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 418
    iget v0, p0, Lo/emc;->v:F

    iget-object v1, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/emc$d;

    iget v1, v1, Lo/emc$d;->c:F

    iget v2, p0, Lo/emc;->g:F

    sub-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget v0, p0, Lo/emc;->v:F

    iget-object v1, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/emc$d;

    iget v1, v1, Lo/emc$d;->c:F

    iget v2, p0, Lo/emc;->g:F

    add-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 419
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/emc$d;

    iput-object v0, p0, Lo/emc;->r:Lo/emc$d;

    .line 420
    iput v3, p0, Lo/emc;->q:I

    .line 421
    iget v0, p0, Lo/emc;->q:I

    invoke-direct {p0, v0}, Lo/emc;->a(I)F

    move-result v0

    iput v0, p0, Lo/emc;->z:F

    .line 422
    iget v0, p0, Lo/emc;->q:I

    invoke-direct {p0, v0}, Lo/emc;->c(I)F

    move-result v0

    iput v0, p0, Lo/emc;->y:F

    .line 423
    goto :goto_1

    .line 425
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/emc;->r:Lo/emc$d;

    .line 417
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 427
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lo/emc;->invalidate()V

    .line 428
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 8

    .line 187
    invoke-virtual {p0}, Lo/emc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$mipmap;->seekbar_di_bar:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 188
    new-instance v4, Landroid/graphics/NinePatch;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v4, v3, v0, v1}, Landroid/graphics/NinePatch;-><init>(Landroid/graphics/Bitmap;[BLjava/lang/String;)V

    .line 191
    iget-object v0, p0, Lo/emc;->d:Landroid/content/Context;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/emc;->c:I

    .line 192
    iget v0, p0, Lo/emc;->f:I

    int-to-float v0, v0

    iget v1, p0, Lo/emc;->g:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/emc;->c:I

    int-to-float v1, v1

    sub-float v5, v0, v1

    .line 193
    iget v0, p0, Lo/emc;->f:I

    int-to-float v0, v0

    iget v1, p0, Lo/emc;->g:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/emc;->c:I

    int-to-float v1, v1

    add-float v6, v0, v1

    .line 195
    new-instance v7, Landroid/graphics/RectF;

    invoke-direct {v7}, Landroid/graphics/RectF;-><init>()V

    .line 196
    iget v0, p0, Lo/emc;->a:I

    int-to-float v0, v0

    iget v1, p0, Lo/emc;->e:I

    int-to-float v1, v1

    iget v2, p0, Lo/emc;->g:F

    add-float/2addr v1, v2

    invoke-virtual {v7, v0, v5, v1, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 197
    invoke-virtual {v4, p1, v7}, Landroid/graphics/NinePatch;->draw(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V

    .line 199
    return-void
.end method


# virtual methods
.method public a(Lo/emc$c;)V
    .locals 1

    .line 110
    iget-object v0, p0, Lo/emc;->u:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    return-void
.end method

.method public d(IF)V
    .locals 4

    .line 117
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 119
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/emc$d;

    iget v1, p0, Lo/emc;->p:I

    int-to-float v1, v1

    sub-float v1, p2, v1

    iget v2, p0, Lo/emc;->h:F

    mul-float/2addr v1, v2

    iget v2, p0, Lo/emc;->g:F

    add-float/2addr v1, v2

    iget v2, p0, Lo/emc;->a:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Lo/emc$d;->c:F

    .line 120
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/emc$d;

    iput p2, v0, Lo/emc$d;->a:F

    .line 121
    const-string v0, "KRangeSeekBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "======thumbs===val="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/emc$d;

    iget v3, v3, Lo/emc$d;->c:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=====pos=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/emc$d;

    iget v3, v3, Lo/emc$d;->a:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    invoke-virtual {p0}, Lo/emc;->invalidate()V

    .line 125
    :cond_0
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 174
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 176
    invoke-direct {p0, p1}, Lo/emc;->e(Landroid/graphics/Canvas;)V

    .line 177
    invoke-direct {p0, p1}, Lo/emc;->a(Landroid/graphics/Canvas;)V

    .line 178
    invoke-direct {p0, p1}, Lo/emc;->d(Landroid/graphics/Canvas;)V

    .line 179
    invoke-direct {p0, p1}, Lo/emc;->c(Landroid/graphics/Canvas;)V

    .line 180
    invoke-direct {p0, p1}, Lo/emc;->b(Landroid/graphics/Canvas;)V

    .line 181
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 352
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 353
    invoke-virtual {p0}, Lo/emc;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lo/emc;->a:I

    .line 354
    invoke-virtual {p0}, Lo/emc;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Lo/emc;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lo/emc;->b:I

    .line 355
    iget v0, p0, Lo/emc;->b:I

    iget v1, p0, Lo/emc;->a:I

    sub-int/2addr v0, v1

    iput v0, p0, Lo/emc;->e:I

    .line 358
    iget-boolean v0, p0, Lo/emc;->t:Z

    if-eqz v0, :cond_0

    .line 359
    invoke-direct {p0}, Lo/emc;->d()V

    .line 360
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emc;->t:Z

    .line 363
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 391
    iget-object v0, p0, Lo/emc;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 393
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lo/emc;->v:F

    .line 396
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 397
    invoke-direct {p0}, Lo/emc;->e()V

    .line 401
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 402
    invoke-direct {p0}, Lo/emc;->a()V

    .line 406
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 407
    :cond_2
    invoke-direct {p0}, Lo/emc;->b()V

    .line 410
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 412
    :cond_4
    const/4 v0, 0x0

    return v0
.end method
