.class public Lo/faa;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/faa$b;,
        Lo/faa$e;,
        Lo/faa$d;,
        Lo/faa$c;
    }
.end annotation


# static fields
.field static final a:[I

.field private static final o:Landroid/view/animation/Interpolator;


# instance fields
.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/faa$d;>;"
        }
    .end annotation
.end field

.field c:I

.field d:Landroid/support/v4/view/PagerAdapter;

.field protected e:Landroid/graphics/Bitmap$Config;

.field private f:I

.field private g:Landroid/database/DataSetObserver;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/faa$b;>;"
        }
    .end annotation
.end field

.field private i:Lo/faa$c;

.field private k:Lo/faa$b;

.field private l:Z

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 211
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/faa;->a:[I

    .line 241
    new-instance v0, Lo/faa$2;

    invoke-direct {v0}, Lo/faa$2;-><init>()V

    sput-object v0, Lo/faa;->o:Landroid/view/animation/Interpolator;

    return-void

    :array_0
    .array-data 4
        0x10100b3
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 207
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 41
    const/4 v0, -0x1

    iput v0, p0, Lo/faa;->c:I

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/faa;->b:Ljava/util/ArrayList;

    .line 43
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v0, p0, Lo/faa;->e:Landroid/graphics/Bitmap$Config;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/faa;->i:Lo/faa$c;

    .line 57
    new-instance v0, Lo/faa$4;

    invoke-direct {v0, p0}, Lo/faa$4;-><init>(Lo/faa;)V

    iput-object v0, p0, Lo/faa;->g:Landroid/database/DataSetObserver;

    .line 68
    const/4 v0, -0x1

    iput v0, p0, Lo/faa;->m:I

    .line 600
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/faa;->l:Z

    .line 208
    invoke-direct {p0}, Lo/faa;->k()V

    .line 209
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 231
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    const/4 v0, -0x1

    iput v0, p0, Lo/faa;->c:I

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/faa;->b:Ljava/util/ArrayList;

    .line 43
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v0, p0, Lo/faa;->e:Landroid/graphics/Bitmap$Config;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/faa;->i:Lo/faa$c;

    .line 57
    new-instance v0, Lo/faa$4;

    invoke-direct {v0, p0}, Lo/faa$4;-><init>(Lo/faa;)V

    iput-object v0, p0, Lo/faa;->g:Landroid/database/DataSetObserver;

    .line 68
    const/4 v0, -0x1

    iput v0, p0, Lo/faa;->m:I

    .line 600
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/faa;->l:Z

    .line 232
    invoke-direct {p0}, Lo/faa;->k()V

    .line 233
    return-void
.end method

.method private a(II)V
    .locals 21

    .line 311
    const/4 v0, 0x0

    move/from16 v1, p1

    invoke-static {v0, v1}, Lo/faa;->getDefaultSize(II)I

    move-result v0

    .line 312
    const/4 v1, 0x0

    move/from16 v2, p2

    invoke-static {v1, v2}, Lo/faa;->getDefaultSize(II)I

    move-result v1

    .line 311
    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Lo/faa;->setMeasuredDimension(II)V

    .line 314
    invoke-virtual/range {p0 .. p0}, Lo/faa;->getMeasuredWidth()I

    move-result v4

    .line 319
    invoke-virtual/range {p0 .. p0}, Lo/faa;->getPaddingLeft()I

    move-result v0

    sub-int v0, v4, v0

    invoke-virtual/range {p0 .. p0}, Lo/faa;->getPaddingRight()I

    move-result v1

    sub-int v5, v0, v1

    .line 320
    invoke-virtual/range {p0 .. p0}, Lo/faa;->getMeasuredHeight()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lo/faa;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual/range {p0 .. p0}, Lo/faa;->getPaddingBottom()I

    move-result v1

    sub-int v6, v0, v1

    .line 327
    invoke-direct/range {p0 .. p0}, Lo/faa;->getChildItemCount()I

    move-result v7

    .line 328
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_a

    .line 329
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/faa;->c(I)Landroid/view/View;

    move-result-object v9

    .line 330
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_9

    .line 331
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/faa$e;

    .line 332
    if-eqz v10, :cond_9

    iget-boolean v0, v10, Lo/faa$e;->d:Z

    if-eqz v0, :cond_9

    .line 333
    iget v0, v10, Lo/faa$e;->c:I

    and-int/lit8 v11, v0, 0x7

    .line 334
    iget v0, v10, Lo/faa$e;->c:I

    and-int/lit8 v12, v0, 0x70

    .line 335
    const/high16 v13, -0x80000000

    .line 336
    const/high16 v14, -0x80000000

    .line 337
    const/16 v0, 0x30

    if-eq v12, v0, :cond_0

    const/16 v0, 0x50

    if-ne v12, v0, :cond_1

    :cond_0
    const/4 v15, 0x1

    goto :goto_1

    :cond_1
    const/4 v15, 0x0

    .line 338
    :goto_1
    const/4 v0, 0x3

    if-eq v11, v0, :cond_2

    const/4 v0, 0x5

    if-ne v11, v0, :cond_3

    :cond_2
    const/16 v16, 0x1

    goto :goto_2

    :cond_3
    const/16 v16, 0x0

    .line 340
    :goto_2
    if-eqz v15, :cond_4

    .line 341
    const/high16 v13, 0x40000000    # 2.0f

    goto :goto_3

    .line 342
    :cond_4
    if-eqz v16, :cond_5

    .line 343
    const/high16 v14, 0x40000000    # 2.0f

    .line 346
    :cond_5
    :goto_3
    move/from16 v17, v5

    .line 347
    move/from16 v18, v6

    .line 348
    iget v0, v10, Lo/faa$e;->width:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_6

    .line 349
    const/high16 v13, 0x40000000    # 2.0f

    .line 350
    iget v0, v10, Lo/faa$e;->width:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    .line 351
    iget v0, v10, Lo/faa$e;->width:I

    move/from16 v17, v0

    .line 354
    :cond_6
    iget v0, v10, Lo/faa$e;->height:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_7

    .line 355
    const/high16 v14, 0x40000000    # 2.0f

    .line 356
    iget v0, v10, Lo/faa$e;->height:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_7

    .line 357
    iget v0, v10, Lo/faa$e;->height:I

    move/from16 v18, v0

    .line 360
    :cond_7
    move/from16 v0, v17

    invoke-static {v0, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v19

    .line 361
    move/from16 v0, v18

    invoke-static {v0, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v20

    .line 362
    move/from16 v0, v19

    move/from16 v1, v20

    invoke-virtual {v9, v0, v1}, Landroid/view/View;->measure(II)V

    .line 364
    if-eqz v15, :cond_8

    .line 365
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    sub-int/2addr v6, v0

    goto :goto_4

    .line 366
    :cond_8
    if-eqz v16, :cond_9

    .line 367
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr v5, v0

    .line 328
    :cond_9
    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 373
    :cond_a
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 374
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v6, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    .line 378
    invoke-direct/range {p0 .. p0}, Lo/faa;->g()V

    .line 379
    move-object/from16 v0, p0

    iget v0, v0, Lo/faa;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_b

    .line 381
    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/faa;->a(I)V

    goto :goto_5

    .line 384
    :cond_b
    invoke-virtual/range {p0 .. p0}, Lo/faa;->d()V

    .line 389
    :goto_5
    invoke-direct/range {p0 .. p0}, Lo/faa;->getChildItemCount()I

    move-result v7

    .line 390
    const/4 v10, 0x0

    :goto_6
    if-ge v10, v7, :cond_d

    .line 391
    move-object/from16 v0, p0

    invoke-direct {v0, v10}, Lo/faa;->c(I)Landroid/view/View;

    move-result-object v11

    .line 392
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_c

    .line 393
    const-string v0, "HwHealthViewPager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Measuring #"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/faa$e;

    .line 395
    if-eqz v12, :cond_c

    iget-boolean v0, v12, Lo/faa$e;->d:Z

    if-nez v0, :cond_c

    .line 396
    int-to-float v0, v5

    iget v1, v12, Lo/faa$e;->e:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v13

    .line 398
    invoke-virtual {v11, v13, v9}, Landroid/view/View;->measure(II)V

    .line 390
    :cond_c
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_6

    .line 402
    :cond_d
    return-void
.end method

.method private b(I)V
    .locals 4

    .line 675
    iget-object v0, p0, Lo/faa;->k:Lo/faa$b;

    if-eqz v0, :cond_0

    .line 676
    iget-object v0, p0, Lo/faa;->k:Lo/faa$b;

    invoke-interface {v0, p1}, Lo/faa$b;->a(I)V

    .line 678
    :cond_0
    iget-object v0, p0, Lo/faa;->h:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 679
    const/4 v1, 0x0

    iget-object v0, p0, Lo/faa;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_2

    .line 680
    iget-object v0, p0, Lo/faa;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/faa$b;

    .line 681
    if-eqz v3, :cond_1

    .line 682
    invoke-interface {v3, p1}, Lo/faa$b;->a(I)V

    .line 679
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 689
    :cond_2
    return-void
.end method

.method private static b(Landroid/view/View;)Z
    .locals 2
    .param p0    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 415
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 416
    const-class v0, Landroid/support/v4/view/ViewPager$DecorView;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private c(I)Landroid/view/View;
    .locals 1

    .line 286
    iget-object v0, p0, Lo/faa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/faa$d;

    iget-object v0, v0, Lo/faa$d;->a:Landroid/view/View;

    return-object v0
.end method

.method static synthetic f()Landroid/view/animation/Interpolator;
    .locals 1

    .line 35
    sget-object v0, Lo/faa;->o:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method private g()V
    .locals 3

    .line 426
    iget-object v0, p0, Lo/faa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/faa$d;

    .line 427
    invoke-virtual {v2}, Lo/faa$d;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 428
    invoke-virtual {v2}, Lo/faa$d;->c()V

    .line 430
    :cond_0
    goto :goto_0

    .line 431
    :cond_1
    return-void
.end method

.method private getChildItemCount()I
    .locals 1

    .line 282
    iget-object v0, p0, Lo/faa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method private getClientWidth()I
    .locals 2

    .line 434
    invoke-virtual {p0}, Lo/faa;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Lo/faa;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lo/faa;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method private h()V
    .locals 1

    .line 629
    iget-object v0, p0, Lo/faa;->i:Lo/faa$c;

    invoke-virtual {v0}, Lo/faa$c;->d()V

    .line 630
    return-void
.end method

.method private i()V
    .locals 4

    .line 603
    iget-boolean v0, p0, Lo/faa;->l:Z

    if-eqz v0, :cond_2

    .line 604
    iget-object v0, p0, Lo/faa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/faa$d;

    .line 605
    if-nez v3, :cond_0

    .line 606
    goto :goto_0

    .line 608
    :cond_0
    invoke-virtual {v3}, Lo/faa$d;->d()V

    .line 609
    goto :goto_0

    .line 610
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/faa;->l:Z

    .line 611
    return-void

    .line 614
    :cond_2
    iget-object v0, p0, Lo/faa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/faa$d;

    .line 615
    if-nez v3, :cond_3

    .line 616
    goto :goto_1

    .line 618
    :cond_3
    iget-object v0, p0, Lo/faa;->i:Lo/faa$c;

    iget-object v0, v0, Lo/faa$c;->a:Lo/faa$d;

    if-ne v0, v3, :cond_4

    .line 619
    iget-object v0, p0, Lo/faa;->i:Lo/faa$c;

    iget v0, v0, Lo/faa$c;->b:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_5

    .line 620
    invoke-virtual {v3}, Lo/faa$d;->d()V

    goto :goto_2

    .line 622
    :cond_4
    iget-object v0, p0, Lo/faa;->i:Lo/faa$c;

    iget-object v0, v0, Lo/faa$c;->c:Lo/faa$d;

    if-ne v0, v3, :cond_5

    .line 623
    invoke-virtual {v3}, Lo/faa$d;->d()V

    .line 625
    :cond_5
    :goto_2
    goto :goto_1

    .line 626
    :cond_6
    return-void
.end method

.method private final k()V
    .locals 2

    .line 236
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/faa;->setWillNotDraw(Z)V

    .line 237
    invoke-virtual {p0}, Lo/faa;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 238
    new-instance v0, Lo/faa$c;

    invoke-direct {v0, v1}, Lo/faa$c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/faa;->i:Lo/faa$c;

    .line 239
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 826
    iget-object v0, p0, Lo/faa;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 827
    iget-object v0, p0, Lo/faa;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 829
    :cond_0
    return-void
.end method

.method a(I)V
    .locals 8

    .line 696
    iget-object v0, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    if-nez v0, :cond_0

    .line 697
    return-void

    .line 700
    :cond_0
    const/4 v3, 0x0

    .line 702
    iget v0, p0, Lo/faa;->c:I

    if-eq v0, p1, :cond_1

    .line 703
    iget v0, p0, Lo/faa;->c:I

    invoke-virtual {p0, v0}, Lo/faa;->d(I)Lo/faa$d;

    move-result-object v3

    .line 704
    iput p1, p0, Lo/faa;->c:I

    .line 711
    :cond_1
    invoke-virtual {p0}, Lo/faa;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-nez v0, :cond_2

    .line 712
    return-void

    .line 715
    :cond_2
    invoke-virtual {p0, p1}, Lo/faa;->d(I)Lo/faa$d;

    move-result-object v4

    .line 717
    iget-object v0, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v5

    .line 719
    iget v0, p0, Lo/faa;->f:I

    if-eq v5, v0, :cond_3

    .line 722
    :try_start_0
    invoke-virtual {p0}, Lo/faa;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Lo/faa;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 725
    goto :goto_0

    .line 723
    :catch_0
    move-exception v7

    .line 724
    invoke-virtual {p0}, Lo/faa;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    .line 726
    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/faa;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " Pager id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " Pager class: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 730
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " Problematic adapter: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    .line 731
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 734
    :cond_3
    if-eq v3, v4, :cond_4

    .line 735
    iget-object v0, p0, Lo/faa;->i:Lo/faa$c;

    invoke-virtual {v0, v3, v4}, Lo/faa$c;->d(Lo/faa$d;Lo/faa$d;)V

    .line 737
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 739
    :cond_4
    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 406
    invoke-virtual {p0, p3}, Lo/faa;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 407
    invoke-virtual {p0, p3}, Lo/faa;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    .line 409
    :cond_0
    move-object v2, p3

    check-cast v2, Lo/faa$e;

    .line 410
    iget-boolean v0, v2, Lo/faa$e;->d:Z

    invoke-static {p1}, Lo/faa;->b(Landroid/view/View;)Z

    move-result v1

    or-int/2addr v0, v1

    iput-boolean v0, v2, Lo/faa$e;->d:Z

    .line 411
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 412
    return-void
.end method

.method public b()V
    .locals 1

    .line 832
    const/4 v0, -0x1

    iput v0, p0, Lo/faa;->c:I

    .line 833
    iget-object v0, p0, Lo/faa;->i:Lo/faa$c;

    invoke-virtual {v0}, Lo/faa$c;->c()V

    .line 834
    invoke-virtual {p0}, Lo/faa;->removeAllViews()V

    .line 835
    return-void
.end method

.method public b(Lo/faa$b;)V
    .locals 1

    .line 804
    iget-object v0, p0, Lo/faa;->h:Ljava/util/List;

    if-nez v0, :cond_0

    .line 805
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/faa;->h:Ljava/util/List;

    .line 807
    :cond_0
    iget-object v0, p0, Lo/faa;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 808
    return-void
.end method

.method c()V
    .locals 2

    .line 150
    iget-object v0, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v1

    .line 151
    iput v1, p0, Lo/faa;->f:I

    .line 152
    iget-object v0, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {p0, v0}, Lo/faa;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 153
    invoke-virtual {p0}, Lo/faa;->requestLayout()V

    .line 154
    return-void
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .line 422
    instance-of v0, p1, Landroid/support/v4/view/ViewPager$LayoutParams;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method d(I)Lo/faa$d;
    .locals 3

    .line 743
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lo/faa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 744
    iget-object v0, p0, Lo/faa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/faa$d;

    .line 745
    iget v0, v2, Lo/faa$d;->e:I

    if-ne v0, p1, :cond_0

    .line 746
    return-object v2

    .line 743
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 749
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method d()V
    .locals 1

    .line 692
    iget v0, p0, Lo/faa;->c:I

    invoke-virtual {p0, v0}, Lo/faa;->a(I)V

    .line 693
    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 569
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 563
    iget-object v0, p0, Lo/faa;->i:Lo/faa$c;

    invoke-virtual {v0, p1}, Lo/faa$c;->e(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 573
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 574
    const/4 v1, 0x0

    .line 577
    invoke-direct {p0}, Lo/faa;->h()V

    .line 580
    iget-object v0, p0, Lo/faa;->i:Lo/faa$c;

    invoke-virtual {v0}, Lo/faa$c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 581
    invoke-direct {p0}, Lo/faa;->i()V

    .line 582
    iget-object v0, p0, Lo/faa;->i:Lo/faa$c;

    invoke-virtual {v0, p1}, Lo/faa$c;->b(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 585
    :cond_0
    iget-object v0, p0, Lo/faa;->i:Lo/faa$c;

    iget-object v0, v0, Lo/faa$c;->c:Lo/faa$d;

    iget-object v0, v0, Lo/faa$d;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 586
    const/4 v0, -0x1

    iput v0, p0, Lo/faa;->m:I

    .line 589
    :goto_0
    iget-object v0, p0, Lo/faa;->i:Lo/faa$c;

    invoke-virtual {v0}, Lo/faa$c;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 590
    const/4 v1, 0x1

    .line 593
    :cond_1
    if-eqz v1, :cond_2

    .line 596
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 598
    :cond_2
    return-void
.end method

.method public e()V
    .locals 1

    .line 74
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/faa;->l:Z

    .line 75
    return-void
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 227
    new-instance v0, Lo/faa$e;

    invoke-direct {v0}, Lo/faa$e;-><init>()V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 217
    new-instance v0, Lo/faa$e;

    invoke-virtual {p0}, Lo/faa;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lo/faa$e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 222
    invoke-virtual {p0}, Lo/faa;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentItem()I
    .locals 2

    .line 644
    iget v0, p0, Lo/faa;->m:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 645
    iget v0, p0, Lo/faa;->m:I

    return v0

    .line 647
    :cond_0
    iget v0, p0, Lo/faa;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 648
    const/4 v0, 0x0

    return v0

    .line 650
    :cond_1
    iget v0, p0, Lo/faa;->c:I

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 17

    .line 440
    invoke-direct/range {p0 .. p0}, Lo/faa;->getChildItemCount()I

    move-result v2

    .line 441
    sub-int v3, p4, p2

    .line 442
    sub-int v4, p5, p3

    .line 443
    invoke-virtual/range {p0 .. p0}, Lo/faa;->getPaddingLeft()I

    move-result v5

    .line 444
    invoke-virtual/range {p0 .. p0}, Lo/faa;->getPaddingTop()I

    move-result v6

    .line 445
    invoke-virtual/range {p0 .. p0}, Lo/faa;->getPaddingRight()I

    move-result v7

    .line 446
    invoke-virtual/range {p0 .. p0}, Lo/faa;->getPaddingBottom()I

    move-result v8

    .line 447
    invoke-virtual/range {p0 .. p0}, Lo/faa;->getScrollX()I

    move-result v9

    .line 453
    const/4 v10, 0x0

    :goto_0
    if-ge v10, v2, :cond_1

    .line 454
    move-object/from16 v0, p0

    invoke-direct {v0, v10}, Lo/faa;->c(I)Landroid/view/View;

    move-result-object v11

    .line 455
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 456
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/faa$e;

    .line 457
    const/4 v13, 0x0

    .line 458
    const/4 v14, 0x0

    .line 460
    iget v0, v12, Lo/faa$e;->c:I

    and-int/lit8 v15, v0, 0x7

    .line 461
    iget v0, v12, Lo/faa$e;->c:I

    and-int/lit8 v16, v0, 0x70

    .line 462
    packed-switch v15, :pswitch_data_0

    nop

    .line 464
    :pswitch_0
    move v13, v5

    .line 465
    goto :goto_1

    .line 467
    :pswitch_1
    move v13, v5

    .line 468
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    add-int/2addr v5, v0

    .line 469
    goto :goto_1

    .line 471
    :pswitch_2
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int v0, v3, v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v13

    .line 473
    goto :goto_1

    .line 475
    :pswitch_3
    sub-int v0, v3, v7

    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int v13, v0, v1

    .line 476
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    add-int/2addr v7, v0

    .line 479
    :goto_1
    sparse-switch v16, :sswitch_data_0

    nop

    .line 481
    move v14, v6

    .line 482
    goto :goto_2

    .line 484
    :sswitch_0
    move v14, v6

    .line 485
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v6, v0

    .line 486
    goto :goto_2

    .line 488
    :sswitch_1
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    sub-int v0, v4, v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 490
    goto :goto_2

    .line 492
    :sswitch_2
    sub-int v0, v4, v8

    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    sub-int v14, v0, v1

    .line 493
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v8, v0

    .line 496
    :goto_2
    add-int/2addr v13, v9

    .line 497
    .line 498
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    add-int/2addr v0, v13

    .line 499
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v1, v14

    .line 497
    invoke-virtual {v11, v13, v14, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 453
    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 505
    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x30 -> :sswitch_0
        0x50 -> :sswitch_2
    .end sparse-switch
.end method

.method protected onMeasure(II)V
    .locals 6

    .line 292
    const/4 v2, 0x0

    .line 293
    const/4 v3, 0x0

    :goto_0
    invoke-direct {p0}, Lo/faa;->getChildItemCount()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 294
    invoke-direct {p0, v3}, Lo/faa;->c(I)Landroid/view/View;

    move-result-object v4

    .line 295
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v4, p1, v0}, Landroid/view/View;->measure(II)V

    .line 296
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    .line 297
    if-le v5, v2, :cond_0

    move v2, v5

    .line 293
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 300
    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 302
    invoke-direct {p0, p1, p2}, Lo/faa;->a(II)V

    .line 303
    return-void
.end method

.method public setAdapter(Landroid/support/v4/view/PagerAdapter;)V
    .locals 5

    .line 250
    iget-object v0, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    if-eqz v0, :cond_1

    .line 251
    iget-object v0, p0, Lo/faa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/faa$d;

    .line 252
    invoke-virtual {v3}, Lo/faa$d;->e()V

    .line 253
    goto :goto_0

    .line 254
    :cond_0
    iget-object v0, p0, Lo/faa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 255
    iget-object v0, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    iget-object v1, p0, Lo/faa;->g:Landroid/database/DataSetObserver;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/PagerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 258
    :cond_1
    iput-object p1, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    .line 259
    const/4 v0, 0x0

    iput v0, p0, Lo/faa;->f:I

    .line 261
    iget-object v0, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    if-eqz v0, :cond_4

    .line 262
    const/4 v2, 0x0

    :goto_1
    iget-object v0, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 263
    iget-object v0, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0, p0, v2}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v3

    .line 264
    instance-of v0, v3, Landroid/view/View;

    if-nez v0, :cond_2

    .line 265
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "setAdapter call instantiateItem,return not class view"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 271
    :cond_2
    new-instance v4, Lo/faa$d;

    move-object v0, v3

    check-cast v0, Landroid/view/View;

    invoke-direct {v4, p0, v2, v0}, Lo/faa$d;-><init>(Lo/faa;ILandroid/view/View;)V

    .line 272
    iget-object v0, p0, Lo/faa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    iget-object v0, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v0

    iput v0, p0, Lo/faa;->f:I

    .line 262
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 275
    :cond_3
    iget-object v0, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    iget-object v1, p0, Lo/faa;->g:Landroid/database/DataSetObserver;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/PagerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 279
    :cond_4
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 0

    .line 640
    invoke-virtual {p0, p1}, Lo/faa;->setCurrentItemInternal(I)V

    .line 641
    return-void
.end method

.method setCurrentItemInternal(I)V
    .locals 2

    .line 654
    iget-object v0, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/faa;->d:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v0

    if-gtz v0, :cond_1

    .line 655
    :cond_0
    return-void

    .line 657
    :cond_1
    iget v0, p0, Lo/faa;->c:I

    if-ne v0, p1, :cond_2

    iget-object v0, p0, Lo/faa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 658
    return-void

    .line 661
    :cond_2
    iget v0, p0, Lo/faa;->c:I

    if-eq v0, p1, :cond_3

    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    .line 663
    :goto_0
    if-eqz v1, :cond_4

    .line 664
    iput p1, p0, Lo/faa;->m:I

    .line 665
    invoke-direct {p0, p1}, Lo/faa;->b(I)V

    .line 670
    :cond_4
    invoke-virtual {p0, p1}, Lo/faa;->a(I)V

    .line 671
    invoke-virtual {p0}, Lo/faa;->requestLayout()V

    .line 672
    return-void
.end method

.method public setOnPageChangeListener(Lo/faa$b;)V
    .locals 0

    .line 753
    iput-object p1, p0, Lo/faa;->k:Lo/faa$b;

    .line 754
    return-void
.end method
