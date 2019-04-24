.class public Lo/fcf;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "DrawAllocation"
    }
.end annotation


# static fields
.field private static final a:I

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:I

.field private static final g:I

.field private static final k:I


# instance fields
.field private A:I

.field private B:F

.field private C:F

.field private D:Landroid/graphics/Paint;

.field private E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/fcc;>;"
        }
    .end annotation
.end field

.field private F:F

.field private G:F

.field private H:Lo/fcc;

.field private I:Landroid/graphics/Paint;

.field private J:F

.field private K:F

.field private L:F

.field private M:Landroid/graphics/RectF;

.field private N:F

.field private f:F

.field private h:Landroid/content/Context;

.field private i:F

.field private j:F

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/fce;>;"
        }
    .end annotation
.end field

.field private t:F

.field private u:F

.field private v:F

.field private w:I

.field private x:I

.field private y:I

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const-string v0, "#ff3320"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/fcf;->c:I

    .line 37
    const-string v0, "#fb6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/fcf;->a:I

    .line 38
    const-string v0, "#f5a623"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/fcf;->b:I

    .line 39
    const-string v0, "#e6d420"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/fcf;->e:I

    .line 40
    const-string v0, "#75df3e"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/fcf;->d:I

    .line 41
    const-string v0, "#01c1f2"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/fcf;->k:I

    .line 42
    const-string v0, "#1f8dff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/fcf;->g:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 76
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->p:F

    .line 57
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->m:F

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->t:F

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->u:F

    .line 60
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->q:F

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcf;->r:Ljava/util/List;

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fcf;->z:Z

    .line 67
    const/16 v0, 0x32

    iput v0, p0, Lo/fcf;->w:I

    .line 68
    const/16 v0, 0x2a

    iput v0, p0, Lo/fcf;->x:I

    .line 69
    const/4 v0, 0x2

    iput v0, p0, Lo/fcf;->y:I

    .line 73
    const/4 v0, 0x1

    iput v0, p0, Lo/fcf;->A:I

    .line 133
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fcf;->D:Landroid/graphics/Paint;

    .line 136
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcf;->E:Ljava/util/ArrayList;

    .line 340
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fcf;->I:Landroid/graphics/Paint;

    .line 342
    const/high16 v0, 0x41b80000    # 23.0f

    iput v0, p0, Lo/fcf;->G:F

    .line 343
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/fcf;->F:F

    .line 344
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/fcf;->M:Landroid/graphics/RectF;

    .line 345
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->N:F

    .line 346
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->J:F

    .line 347
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/fcf;->L:F

    .line 348
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/fcf;->K:F

    .line 77
    iput-object p1, p0, Lo/fcf;->h:Landroid/content/Context;

    .line 78
    invoke-direct {p0}, Lo/fcf;->b()V

    .line 79
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 94
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->p:F

    .line 57
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->m:F

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->t:F

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->u:F

    .line 60
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->q:F

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcf;->r:Ljava/util/List;

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fcf;->z:Z

    .line 67
    const/16 v0, 0x32

    iput v0, p0, Lo/fcf;->w:I

    .line 68
    const/16 v0, 0x2a

    iput v0, p0, Lo/fcf;->x:I

    .line 69
    const/4 v0, 0x2

    iput v0, p0, Lo/fcf;->y:I

    .line 73
    const/4 v0, 0x1

    iput v0, p0, Lo/fcf;->A:I

    .line 133
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fcf;->D:Landroid/graphics/Paint;

    .line 136
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcf;->E:Ljava/util/ArrayList;

    .line 340
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fcf;->I:Landroid/graphics/Paint;

    .line 342
    const/high16 v0, 0x41b80000    # 23.0f

    iput v0, p0, Lo/fcf;->G:F

    .line 343
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/fcf;->F:F

    .line 344
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/fcf;->M:Landroid/graphics/RectF;

    .line 345
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->N:F

    .line 346
    const/4 v0, 0x0

    iput v0, p0, Lo/fcf;->J:F

    .line 347
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/fcf;->L:F

    .line 348
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/fcf;->K:F

    .line 95
    iput-object p1, p0, Lo/fcf;->h:Landroid/content/Context;

    .line 96
    invoke-direct {p0}, Lo/fcf;->b()V

    .line 97
    return-void
.end method

.method private a(F)F
    .locals 5

    .line 239
    iget v0, p0, Lo/fcf;->m:F

    iget v1, p0, Lo/fcf;->l:F

    iget v2, p0, Lo/fcf;->m:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/fcf;->x:I

    int-to-float v2, v2

    sub-float v2, p1, v2

    iget v3, p0, Lo/fcf;->w:I

    iget v4, p0, Lo/fcf;->x:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    div-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v2, v3, v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0
.end method

.method private a(I)I
    .locals 1

    .line 424
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 426
    :pswitch_0
    sget v0, Lo/fcf;->c:I

    .line 427
    goto :goto_1

    .line 429
    :pswitch_1
    sget v0, Lo/fcf;->a:I

    .line 430
    goto :goto_1

    .line 432
    :pswitch_2
    sget v0, Lo/fcf;->b:I

    .line 433
    goto :goto_1

    .line 435
    :pswitch_3
    sget v0, Lo/fcf;->e:I

    .line 436
    goto :goto_1

    .line 438
    :pswitch_4
    sget v0, Lo/fcf;->d:I

    .line 439
    goto :goto_1

    .line 441
    :pswitch_5
    sget v0, Lo/fcf;->k:I

    .line 442
    goto :goto_1

    .line 444
    :pswitch_6
    sget v0, Lo/fcf;->g:I

    .line 445
    goto :goto_1

    .line 447
    :goto_0
    sget v0, Lo/fcf;->e:I

    .line 451
    :goto_1
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private b(I)Landroid/graphics/Bitmap;
    .locals 2

    .line 204
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 206
    :pswitch_0
    sget v1, Lcom/huawei/ui/main/R$drawable;->health_healthdata_vo2max_spot_low:I

    .line 207
    goto :goto_1

    .line 209
    :pswitch_1
    sget v1, Lcom/huawei/ui/main/R$drawable;->health_healthdata_vo2max_spot_amateur:I

    .line 210
    goto :goto_1

    .line 212
    :pswitch_2
    sget v1, Lcom/huawei/ui/main/R$drawable;->health_healthdata_vo2max_spot_normal:I

    .line 213
    goto :goto_1

    .line 215
    :pswitch_3
    sget v1, Lcom/huawei/ui/main/R$drawable;->health_healthdata_vo2max_spot_higher:I

    .line 216
    goto :goto_1

    .line 218
    :pswitch_4
    sget v1, Lcom/huawei/ui/main/R$drawable;->health_healthdata_vo2max_spot_good:I

    .line 219
    goto :goto_1

    .line 221
    :pswitch_5
    sget v1, Lcom/huawei/ui/main/R$drawable;->health_healthdata_vo2max_spot_excellent:I

    .line 222
    goto :goto_1

    .line 224
    :pswitch_6
    sget v1, Lcom/huawei/ui/main/R$drawable;->health_healthdata_vo2max_spot_major:I

    .line 225
    goto :goto_1

    .line 227
    :goto_0
    sget v1, Lcom/huawei/ui/main/R$drawable;->health_healthdata_vo2max_spot_higher:I

    .line 231
    :goto_1
    iget-object v0, p0, Lo/fcf;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private b()V
    .locals 2

    .line 82
    const/4 v0, 0x1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    iput v0, p0, Lo/fcf;->C:F

    .line 83
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fcf;->D:Landroid/graphics/Paint;

    .line 84
    iget-object v0, p0, Lo/fcf;->D:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 85
    iget-object v0, p0, Lo/fcf;->D:Landroid/graphics/Paint;

    const/high16 v1, 0x33000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 86
    iget-object v0, p0, Lo/fcf;->D:Landroid/graphics/Paint;

    iget v1, p0, Lo/fcf;->C:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 87
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 10

    .line 315
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 316
    iget-object v0, p0, Lo/fcf;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_black_50alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 317
    iget-object v0, p0, Lo/fcf;->h:Landroid/content/Context;

    .line 318
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->fitness_details_bar_chart_date_text_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 317
    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 319
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 320
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/fcf;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 321
    iget-object v0, p0, Lo/fcf;->r:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 322
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v4, v6, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v7, v0

    .line 323
    iget v0, p0, Lo/fcf;->p:F

    iget v1, p0, Lo/fcf;->o:F

    iget-object v2, p0, Lo/fcf;->r:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    int-to-float v2, v2

    div-float/2addr v1, v2

    int-to-float v2, v5

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v7, v1

    sub-float v8, v0, v1

    .line 324
    const/4 v0, 0x0

    cmpg-float v0, v8, v0

    if-gez v0, :cond_0

    .line 325
    const/4 v8, 0x0

    .line 328
    :cond_0
    add-float v0, v8, v7

    iget v1, p0, Lo/fcf;->f:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 329
    iget v0, p0, Lo/fcf;->f:F

    sub-float v8, v0, v7

    .line 332
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 333
    iget v0, p0, Lo/fcf;->f:F

    sub-float/2addr v0, v8

    sub-float v8, v0, v7

    .line 335
    :cond_2
    iget v0, p0, Lo/fcf;->i:F

    iget v1, p0, Lo/fcf;->q:F

    const/high16 v2, 0x40400000    # 3.0f

    div-float/2addr v1, v2

    sub-float v9, v0, v1

    .line 336
    invoke-virtual {p1, v6, v8, v9, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 320
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 338
    :cond_3
    return-void
.end method

.method private b(Landroid/graphics/Canvas;Lo/fcc;)V
    .locals 19

    .line 354
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fcf;->z:Z

    if-eqz v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->H:Lo/fcc;

    if-nez v0, :cond_1

    .line 355
    :cond_0
    return-void

    .line 357
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->I:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 358
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->I:Landroid/graphics/Paint;

    const/4 v1, 0x1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 360
    const-string v6, ""

    .line 361
    const/4 v7, -0x1

    .line 362
    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 363
    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 364
    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 365
    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 367
    move-object/from16 v0, p2

    iget-object v6, v0, Lo/fcc;->a:Ljava/lang/String;

    .line 368
    move-object/from16 v0, p2

    iget-object v0, v0, Lo/fcc;->e:Landroid/graphics/PointF;

    iget v8, v0, Landroid/graphics/PointF;->x:F

    .line 369
    move-object/from16 v0, p2

    iget-object v0, v0, Lo/fcc;->e:Landroid/graphics/PointF;

    iget v9, v0, Landroid/graphics/PointF;->y:F

    .line 371
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fcf;->I:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Lo/eyh;->b(Landroid/graphics/Paint;)F

    move-result v10

    .line 372
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fcf;->I:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v6}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fcf;->G:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/fcf;->N:F

    .line 373
    move-object/from16 v0, p0

    iget v0, v0, Lo/fcf;->F:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    add-float/2addr v0, v10

    move-object/from16 v1, p0

    iput v0, v1, Lo/fcf;->J:F

    .line 374
    move-object/from16 v0, p0

    iget v0, v0, Lo/fcf;->N:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v11, v0, v1

    .line 376
    const/4 v0, 0x1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v12

    .line 377
    const/16 v18, 0x0

    .line 378
    const/4 v13, 0x0

    .line 379
    const/4 v14, 0x0

    .line 380
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    sub-float v1, v8, v11

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 381
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    add-float v1, v8, v11

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 382
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fcf;->J:F

    sub-float v1, v9, v1

    sub-float/2addr v1, v12

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 383
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    iput v9, v0, Landroid/graphics/RectF;->bottom:F

    .line 385
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->top:F

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v2, v12

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 386
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v2, v12

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 387
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fcf;->M:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    add-float v13, v0, v1

    .line 388
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    iget v14, v0, Landroid/graphics/RectF;->bottom:F

    .line 389
    new-instance v18, Landroid/graphics/Path;

    invoke-direct/range {v18 .. v18}, Landroid/graphics/Path;-><init>()V

    .line 390
    add-float v0, v13, v12

    move-object/from16 v1, v18

    invoke-virtual {v1, v0, v14}, Landroid/graphics/Path;->moveTo(FF)V

    .line 391
    const/high16 v0, 0x3fc00000    # 1.5f

    mul-float/2addr v0, v12

    add-float/2addr v0, v14

    move-object/from16 v1, v18

    invoke-virtual {v1, v13, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 392
    sub-float v0, v13, v12

    move-object/from16 v1, v18

    invoke-virtual {v1, v0, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 393
    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Path;->close()V

    .line 396
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/fcf;->f:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 397
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fcf;->M:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fcf;->M:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    move-object/from16 v3, p0

    iget v3, v3, Lo/fcf;->f:F

    sub-float/2addr v2, v3

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 398
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fcf;->f:F

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 401
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 402
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fcf;->M:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fcf;->M:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 403
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    const/4 v1, 0x0

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 406
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->I:Landroid/graphics/Paint;

    move-object/from16 v1, p2

    iget v1, v1, Lo/fcc;->c:I

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/fcf;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 407
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fcf;->L:F

    move-object/from16 v2, p0

    iget v2, v2, Lo/fcf;->K:F

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/fcf;->I:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 409
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->I:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object/from16 v2, v18

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 410
    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Path;->reset()V

    .line 412
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->I:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 413
    move-object/from16 v0, p1

    sub-float v1, v13, v12

    move v2, v14

    add-float v3, v13, v12

    move v4, v14

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/fcf;->I:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 415
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/fcf;->G:F

    add-float v15, v0, v1

    .line 416
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->M:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/fcf;->F:F

    add-float v16, v0, v1

    .line 417
    move/from16 v17, v15

    .line 418
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->I:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 419
    add-float v0, v16, v10

    const/high16 v1, 0x40000000    # 2.0f

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fcf;->I:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    move/from16 v3, v17

    invoke-virtual {v2, v6, v3, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 420
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 13

    .line 144
    iget-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 145
    :cond_0
    return-void

    .line 149
    :cond_1
    iget-object v7, p0, Lo/fcf;->D:Landroid/graphics/Paint;

    .line 150
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 152
    iget v0, p0, Lo/fcf;->o:F

    iget-object v1, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/fcf;->j:F

    .line 153
    const/4 v9, 0x0

    .line 154
    iget-object v0, p0, Lo/fcf;->H:Lo/fcc;

    if-nez v0, :cond_2

    .line 155
    const/4 v9, 0x1

    .line 156
    iget-object v0, p0, Lo/fcf;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 158
    :cond_2
    const/4 v10, 0x1

    .line 159
    const/4 v11, 0x0

    :goto_0
    iget-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v11, v0, :cond_8

    .line 160
    iget-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fce;

    iget v0, v0, Lo/fce;->e:I

    if-eqz v0, :cond_7

    .line 161
    iget v0, p0, Lo/fcf;->p:F

    iget v1, p0, Lo/fcf;->j:F

    int-to-float v2, v11

    mul-float/2addr v1, v2

    add-float v5, v0, v1

    .line 162
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 163
    iget v0, p0, Lo/fcf;->u:F

    iget v1, p0, Lo/fcf;->o:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/fcf;->j:F

    int-to-float v2, v11

    mul-float/2addr v1, v2

    sub-float v5, v0, v1

    .line 165
    :cond_3
    iget-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fce;

    iget v0, v0, Lo/fce;->e:I

    int-to-float v0, v0

    invoke-direct {p0, v0}, Lo/fcf;->a(F)F

    move-result v6

    .line 166
    if-eqz v9, :cond_5

    .line 167
    new-instance v12, Lo/fcc;

    invoke-direct {v12}, Lo/fcc;-><init>()V

    .line 168
    new-instance v0, Landroid/graphics/PointF;

    iget v1, p0, Lo/fcf;->v:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v6, v1

    iget v2, p0, Lo/fcf;->F:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/fcf;->B:F

    sub-float/2addr v1, v2

    invoke-direct {v0, v5, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, v12, Lo/fcc;->e:Landroid/graphics/PointF;

    .line 169
    iget-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fce;

    iget v0, v0, Lo/fce;->a:I

    iput v0, v12, Lo/fcc;->c:I

    .line 170
    iget-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fce;

    iget v0, v0, Lo/fce;->e:I

    iput v0, v12, Lo/fcc;->b:I

    .line 171
    iget-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fce;

    iget v0, v0, Lo/fce;->e:I

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v12, Lo/fcc;->a:Ljava/lang/String;

    .line 172
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/fcf;->n:F

    sub-float v1, v5, v1

    iget v2, p0, Lo/fcf;->n:F

    sub-float v2, v6, v2

    iget v3, p0, Lo/fcf;->n:F

    add-float/2addr v3, v5

    iget v4, p0, Lo/fcf;->n:F

    add-float/2addr v4, v6

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, v12, Lo/fcc;->d:Landroid/graphics/RectF;

    .line 173
    iget-object v0, p0, Lo/fcf;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    iget-object v0, p0, Lo/fcf;->H:Lo/fcc;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/fcf;->H:Lo/fcc;

    iget v0, v0, Lo/fcc;->b:I

    iget v1, v12, Lo/fcc;->b:I

    if-gt v0, v1, :cond_5

    .line 175
    :cond_4
    iput-object v12, p0, Lo/fcf;->H:Lo/fcc;

    .line 178
    :cond_5
    if-eqz v10, :cond_6

    .line 179
    const/4 v10, 0x0

    .line 180
    invoke-virtual {v8, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    goto :goto_1

    .line 182
    :cond_6
    invoke-virtual {v8, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 159
    :cond_7
    :goto_1
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 186
    :cond_8
    invoke-virtual {p1, v8, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 187
    const/4 v11, 0x0

    :goto_2
    iget-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v11, v0, :cond_b

    .line 188
    iget-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fce;

    iget v0, v0, Lo/fce;->e:I

    if-eqz v0, :cond_a

    .line 189
    iget v0, p0, Lo/fcf;->p:F

    iget v1, p0, Lo/fcf;->j:F

    int-to-float v2, v11

    mul-float/2addr v1, v2

    add-float v5, v0, v1

    .line 190
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 191
    iget v0, p0, Lo/fcf;->u:F

    iget v1, p0, Lo/fcf;->o:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/fcf;->j:F

    int-to-float v2, v11

    mul-float/2addr v1, v2

    sub-float v5, v0, v1

    .line 193
    :cond_9
    iget-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fce;

    iget v0, v0, Lo/fce;->e:I

    int-to-float v0, v0

    invoke-direct {p0, v0}, Lo/fcf;->a(F)F

    move-result v6

    .line 194
    iget-object v0, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fce;

    iget v0, v0, Lo/fce;->a:I

    invoke-direct {p0, v0}, Lo/fcf;->b(I)Landroid/graphics/Bitmap;

    move-result-object v12

    .line 195
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    sub-float v0, v5, v0

    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v6, v1

    const/4 v2, 0x0

    invoke-virtual {p1, v12, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 187
    :cond_a
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_2

    .line 200
    :cond_b
    return-void
.end method

.method private c(FFLandroid/graphics/RectF;)Z
    .locals 1

    .line 493
    iget v0, p3, Landroid/graphics/RectF;->left:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    iget v0, p3, Landroid/graphics/RectF;->right:F

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    iget v0, p3, Landroid/graphics/RectF;->top:F

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_0

    iget v0, p3, Landroid/graphics/RectF;->bottom:F

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_0

    .line 494
    const/4 v0, 0x1

    return v0

    .line 496
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 18

    .line 247
    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 248
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 249
    const v0, -0x525151

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 250
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 251
    new-instance v11, Landroid/graphics/Path;

    invoke-direct {v11}, Landroid/graphics/Path;-><init>()V

    .line 252
    new-instance v12, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v12, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 253
    invoke-virtual {v10, v12}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 255
    new-instance v13, Landroid/graphics/Paint;

    invoke-direct {v13}, Landroid/graphics/Paint;-><init>()V

    .line 256
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v13, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 257
    const/high16 v0, 0x33000000

    invoke-virtual {v13, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 258
    new-instance v14, Landroid/graphics/CornerPathEffect;

    const/high16 v0, 0x41200000    # 10.0f

    invoke-direct {v14, v0}, Landroid/graphics/CornerPathEffect;-><init>(F)V

    .line 259
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 260
    invoke-virtual {v13, v14}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 263
    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    .line 264
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_black_50alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v15, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 265
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fcf;->h:Landroid/content/Context;

    .line 266
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->fitness_details_bar_chart_view_text_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 265
    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v15, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 267
    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 268
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v10, v1}, Lo/eyh;->b(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x40a00000    # 5.0f

    add-float v16, v0, v1

    .line 269
    const/16 v17, 0x0

    .line 274
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iget v2, v1, Lo/fcf;->t:F

    move-object/from16 v1, p0

    iget v3, v1, Lo/fcf;->f:F

    move-object/from16 v1, p0

    iget v4, v1, Lo/fcf;->t:F

    move-object v5, v13

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 276
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move-object v3, v11

    move-object v4, v15

    move/from16 v5, v16

    move/from16 v6, v17

    move-object/from16 v7, p0

    iget v7, v7, Lo/fcf;->w:I

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lo/fcf;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Landroid/graphics/Paint;FFI)V

    .line 277
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move-object v3, v11

    move-object v4, v15

    move/from16 v5, v16

    move/from16 v6, v17

    move-object/from16 v7, p0

    iget v7, v7, Lo/fcf;->w:I

    move-object/from16 v8, p0

    iget v8, v8, Lo/fcf;->y:I

    sub-int/2addr v7, v8

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lo/fcf;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Landroid/graphics/Paint;FFI)V

    .line 278
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move-object v3, v11

    move-object v4, v15

    move/from16 v5, v16

    move/from16 v6, v17

    move-object/from16 v7, p0

    iget v7, v7, Lo/fcf;->w:I

    move-object/from16 v8, p0

    iget v8, v8, Lo/fcf;->y:I

    mul-int/lit8 v8, v8, 0x2

    sub-int/2addr v7, v8

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lo/fcf;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Landroid/graphics/Paint;FFI)V

    .line 279
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move-object v3, v11

    move-object v4, v15

    move/from16 v5, v16

    move/from16 v6, v17

    move-object/from16 v7, p0

    iget v7, v7, Lo/fcf;->w:I

    move-object/from16 v8, p0

    iget v8, v8, Lo/fcf;->y:I

    mul-int/lit8 v8, v8, 0x3

    sub-int/2addr v7, v8

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lo/fcf;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Landroid/graphics/Paint;FFI)V

    .line 281
    return-void

    nop

    :array_0
    .array-data 4
        0x40800000    # 4.0f
        0x40000000    # 2.0f
        0x40800000    # 4.0f
        0x40000000    # 2.0f
    .end array-data
.end method

.method private e(FF)V
    .locals 7

    .line 468
    const/4 v4, 0x0

    .line 469
    const/4 v5, 0x0

    .line 471
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/fcf;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 472
    iget-object v0, p0, Lo/fcf;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fcc;

    .line 473
    iget-object v5, v4, Lo/fcc;->d:Landroid/graphics/RectF;

    .line 475
    invoke-direct {p0, p1, p2, v5}, Lo/fcf;->c(FFLandroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 476
    const-string v0, "Track_Vo2maxDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "triggerClick x = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " y = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  data.rect = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lo/fcc;->d:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    iput-object v4, p0, Lo/fcf;->H:Lo/fcc;

    .line 478
    goto :goto_1

    .line 471
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 482
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lo/fcf;->invalidate()V

    .line 483
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 7

    .line 305
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 306
    const/high16 v0, 0x33000000

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 307
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 308
    move-object v0, p1

    iget v2, p0, Lo/fcf;->l:F

    iget v3, p0, Lo/fcf;->f:F

    iget v4, p0, Lo/fcf;->l:F

    move-object v5, v6

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 309
    return-void
.end method

.method private e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Landroid/graphics/Paint;FFI)V
    .locals 6

    .line 284
    int-to-float v0, p7

    invoke-direct {p0, v0}, Lo/fcf;->a(F)F

    move-result v4

    .line 285
    const/4 v0, 0x0

    invoke-virtual {p3, v0, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 286
    iget v0, p0, Lo/fcf;->f:F

    invoke-virtual {p3, v0, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 287
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 289
    iget-boolean v0, p0, Lo/fcf;->z:Z

    if-nez v0, :cond_0

    .line 290
    return-void

    .line 292
    :cond_0
    int-to-double v0, p7

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 293
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    iget v0, p0, Lo/fcf;->f:F

    invoke-virtual {p2, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    sub-float p6, v0, v1

    .line 296
    :cond_1
    if-ltz p7, :cond_2

    .line 297
    iget v0, p0, Lo/fcf;->o:F

    iget v1, p0, Lo/fcf;->u:F

    add-float/2addr v0, v1

    sub-float/2addr v0, p6

    invoke-virtual {p2, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    sub-float/2addr v0, v1

    add-float v1, v4, p5

    const/high16 v2, 0x41a00000    # 20.0f

    add-float/2addr v1, v2

    invoke-virtual {p1, v5, v0, v1, p4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 299
    :cond_2
    return-void
.end method

.method private getInterval()I
    .locals 1

    .line 555
    iget v0, p0, Lo/fcf;->A:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 557
    :sswitch_0
    const/4 v0, 0x2

    return v0

    .line 559
    :sswitch_1
    const/4 v0, 0x5

    return v0

    .line 561
    :goto_0
    const/4 v0, 0x2

    return v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public c(Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Ljava/util/ArrayList<Lo/fce;>;)V"
        }
    .end annotation

    .line 505
    iput-object p1, p0, Lo/fcf;->r:Ljava/util/List;

    .line 506
    iput-object p2, p0, Lo/fcf;->s:Ljava/util/ArrayList;

    .line 507
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fcf;->H:Lo/fcc;

    .line 508
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 509
    :cond_0
    const/16 v0, 0x32

    iput v0, p0, Lo/fcf;->w:I

    .line 510
    const/16 v0, 0x2a

    iput v0, p0, Lo/fcf;->x:I

    .line 511
    const/4 v0, 0x2

    iput v0, p0, Lo/fcf;->y:I

    .line 512
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fcf;->z:Z

    goto/16 :goto_3

    .line 514
    :cond_1
    const/4 v2, 0x1

    .line 515
    const/4 v3, 0x0

    .line 516
    const/4 v4, 0x0

    .line 517
    const/4 v5, 0x0

    .line 518
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_6

    .line 519
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fce;

    iget v0, v0, Lo/fce;->e:I

    if-nez v0, :cond_2

    .line 520
    goto :goto_2

    .line 522
    :cond_2
    if-eqz v2, :cond_3

    .line 523
    const/4 v2, 0x0

    .line 524
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fce;

    iget v3, v0, Lo/fce;->e:I

    .line 525
    move v4, v3

    .line 526
    move v5, v3

    goto :goto_2

    .line 528
    :cond_3
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fce;

    iget v7, v0, Lo/fce;->e:I

    .line 529
    if-le v4, v7, :cond_4

    goto :goto_1

    :cond_4
    move v4, v7

    .line 530
    :goto_1
    if-ge v5, v7, :cond_5

    goto :goto_2

    :cond_5
    move v5, v7

    .line 518
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 534
    :cond_6
    if-nez v4, :cond_7

    .line 535
    const/16 v0, 0x32

    iput v0, p0, Lo/fcf;->w:I

    .line 536
    const/16 v0, 0x2a

    iput v0, p0, Lo/fcf;->x:I

    .line 537
    const/4 v0, 0x2

    iput v0, p0, Lo/fcf;->y:I

    .line 538
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fcf;->z:Z

    goto :goto_3

    .line 540
    :cond_7
    invoke-direct {p0}, Lo/fcf;->getInterval()I

    move-result v6

    .line 541
    sub-int v0, v4, v3

    sub-int v1, v3, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v7, v0, 0x2

    .line 542
    if-gt v7, v6, :cond_8

    .line 543
    move v7, v6

    .line 545
    :cond_8
    iput v7, p0, Lo/fcf;->y:I

    .line 546
    mul-int/lit8 v0, v7, 0x2

    add-int/2addr v0, v3

    iput v0, p0, Lo/fcf;->w:I

    .line 547
    mul-int/lit8 v0, v7, 0x2

    sub-int v0, v3, v0

    iput v0, p0, Lo/fcf;->x:I

    .line 548
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fcf;->z:Z

    .line 551
    :goto_3
    invoke-virtual {p0}, Lo/fcf;->invalidate()V

    .line 552
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 126
    invoke-direct {p0, p1}, Lo/fcf;->e(Landroid/graphics/Canvas;)V

    .line 127
    invoke-direct {p0, p1}, Lo/fcf;->b(Landroid/graphics/Canvas;)V

    .line 128
    invoke-direct {p0, p1}, Lo/fcf;->d(Landroid/graphics/Canvas;)V

    .line 129
    invoke-direct {p0, p1}, Lo/fcf;->c(Landroid/graphics/Canvas;)V

    .line 130
    iget-object v0, p0, Lo/fcf;->H:Lo/fcc;

    invoke-direct {p0, p1, v0}, Lo/fcf;->b(Landroid/graphics/Canvas;Lo/fcc;)V

    .line 131
    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    .line 101
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 102
    invoke-virtual {p0}, Lo/fcf;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lo/fcf;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fcf;->f:F

    .line 103
    invoke-virtual {p0}, Lo/fcf;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Lo/fcf;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fcf;->i:F

    .line 105
    const/4 v0, 0x1

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    iput v0, p0, Lo/fcf;->t:F

    .line 106
    const/4 v0, 0x1

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    iput v0, p0, Lo/fcf;->m:F

    .line 107
    const/4 v0, 0x1

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    iput v0, p0, Lo/fcf;->q:F

    .line 109
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 110
    iget-object v0, p0, Lo/fcf;->h:Landroid/content/Context;

    .line 111
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->fitness_details_bar_chart_view_text_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 110
    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 112
    const-string v3, "00000"

    .line 113
    const-string v4, "00"

    .line 114
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lo/fcf;->p:F

    .line 115
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lo/fcf;->u:F

    .line 116
    iget v0, p0, Lo/fcf;->f:F

    iget v1, p0, Lo/fcf;->p:F

    sub-float/2addr v0, v1

    iget v1, p0, Lo/fcf;->u:F

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fcf;->o:F

    .line 117
    iget v0, p0, Lo/fcf;->i:F

    iget v1, p0, Lo/fcf;->q:F

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fcf;->l:F

    .line 119
    const/4 v0, 0x1

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    iput v0, p0, Lo/fcf;->v:F

    .line 120
    const/4 v0, 0x1

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    iput v0, p0, Lo/fcf;->n:F

    .line 121
    const/4 v0, 0x1

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    iput v0, p0, Lo/fcf;->B:F

    .line 122
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 456
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 457
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/fcf;->e(FF)V

    .line 459
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public setType(I)V
    .locals 0

    .line 90
    iput p1, p0, Lo/fcf;->A:I

    .line 91
    return-void
.end method
