.class public abstract Lo/eie;
.super Lo/le;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eie$c;,
        Lo/eie$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Lo/eik<+Lo/ejl<+Lcom/github/mikephil/charting/data/Entry;>;>;>Lo/le<TT;>;"
    }
.end annotation


# static fields
.field protected static final an:Lo/eie$a;


# instance fields
.field private a:Landroid/graphics/drawable/GradientDrawable;

.field private aA:F

.field private aB:Landroid/graphics/Canvas;

.field private aD:Z

.field protected aa:Lo/ehh;

.field private ab:Z

.field protected ac:Lo/ehi;

.field protected ad:Lo/eit;

.field protected ae:Lo/eir;

.field protected af:Lo/eit;

.field protected ag:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eie$c;>;"
        }
    .end annotation
.end field

.field protected ah:Lo/eit;

.field protected ai:Lo/eir;

.field protected aj:Lo/eim;

.field protected ak:Lo/eim;

.field protected al:Lo/eim;

.field protected am:Lo/eir;

.field protected ao:Lo/eie$a;

.field protected ap:Lo/eid;

.field protected aq:Lo/eid;

.field protected ar:Lo/eid;

.field private as:Landroid/graphics/drawable/AnimationDrawable;

.field protected at:Landroid/graphics/Canvas;

.field private au:Lo/eiz;

.field private av:F

.field private aw:Landroid/view/View;

.field private ax:Landroid/graphics/Rect;

.field private ay:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private az:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 99
    const/4 v0, 0x0

    sput-object v0, Lo/eie;->an:Lo/eie$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 75
    invoke-direct {p0, p1}, Lo/le;-><init>(Landroid/content/Context;)V

    .line 93
    new-instance v0, Lo/eid;

    invoke-direct {v0}, Lo/eid;-><init>()V

    iput-object v0, p0, Lo/eie;->ap:Lo/eid;

    .line 94
    new-instance v0, Lo/eid;

    invoke-direct {v0}, Lo/eid;-><init>()V

    iput-object v0, p0, Lo/eie;->aq:Lo/eid;

    .line 95
    new-instance v0, Lo/eid;

    invoke-direct {v0}, Lo/eid;-><init>()V

    iput-object v0, p0, Lo/eie;->ar:Lo/eid;

    .line 97
    sget-object v0, Lo/eie;->an:Lo/eie$a;

    iput-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    .line 105
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eie;->ab:Z

    .line 106
    const/4 v0, 0x0

    iput v0, p0, Lo/eie;->av:F

    .line 115
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/eie;->ax:Landroid/graphics/Rect;

    .line 116
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/eie;->az:Landroid/graphics/Rect;

    .line 527
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    iput v0, p0, Lo/eie;->aA:F

    .line 623
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eie;->ay:Ljava/lang/ref/WeakReference;

    .line 1464
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eie;->aB:Landroid/graphics/Canvas;

    .line 1492
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eie;->aD:Z

    .line 76
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/eie;->b(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 77
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 70
    invoke-direct {p0, p1, p2}, Lo/le;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 93
    new-instance v0, Lo/eid;

    invoke-direct {v0}, Lo/eid;-><init>()V

    iput-object v0, p0, Lo/eie;->ap:Lo/eid;

    .line 94
    new-instance v0, Lo/eid;

    invoke-direct {v0}, Lo/eid;-><init>()V

    iput-object v0, p0, Lo/eie;->aq:Lo/eid;

    .line 95
    new-instance v0, Lo/eid;

    invoke-direct {v0}, Lo/eid;-><init>()V

    iput-object v0, p0, Lo/eie;->ar:Lo/eid;

    .line 97
    sget-object v0, Lo/eie;->an:Lo/eie$a;

    iput-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    .line 105
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eie;->ab:Z

    .line 106
    const/4 v0, 0x0

    iput v0, p0, Lo/eie;->av:F

    .line 115
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/eie;->ax:Landroid/graphics/Rect;

    .line 116
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/eie;->az:Landroid/graphics/Rect;

    .line 527
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    iput v0, p0, Lo/eie;->aA:F

    .line 623
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eie;->ay:Ljava/lang/ref/WeakReference;

    .line 1464
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eie;->aB:Landroid/graphics/Canvas;

    .line 1492
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eie;->aD:Z

    .line 71
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/eie;->b(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 72
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 65
    invoke-direct {p0, p1, p2, p3}, Lo/le;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 93
    new-instance v0, Lo/eid;

    invoke-direct {v0}, Lo/eid;-><init>()V

    iput-object v0, p0, Lo/eie;->ap:Lo/eid;

    .line 94
    new-instance v0, Lo/eid;

    invoke-direct {v0}, Lo/eid;-><init>()V

    iput-object v0, p0, Lo/eie;->aq:Lo/eid;

    .line 95
    new-instance v0, Lo/eid;

    invoke-direct {v0}, Lo/eid;-><init>()V

    iput-object v0, p0, Lo/eie;->ar:Lo/eid;

    .line 97
    sget-object v0, Lo/eie;->an:Lo/eie$a;

    iput-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    .line 105
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eie;->ab:Z

    .line 106
    const/4 v0, 0x0

    iput v0, p0, Lo/eie;->av:F

    .line 115
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/eie;->ax:Landroid/graphics/Rect;

    .line 116
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/eie;->az:Landroid/graphics/Rect;

    .line 527
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    iput v0, p0, Lo/eie;->aA:F

    .line 623
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eie;->ay:Ljava/lang/ref/WeakReference;

    .line 1464
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eie;->aB:Landroid/graphics/Canvas;

    .line 1492
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eie;->aD:Z

    .line 66
    invoke-direct {p0, p1, p2, p3}, Lo/eie;->b(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 67
    return-void
.end method

.method private a(Lo/nv;)Z
    .locals 4

    .line 847
    const/4 v0, 0x2

    new-array v2, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v2, v1

    iget-object v0, p0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->e()F

    move-result v0

    const/4 v1, 0x1

    aput v0, v2, v1

    .line 848
    const/4 v0, 0x2

    new-array v3, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v3, v1

    iget-object v0, p0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->i()F

    move-result v0

    const/4 v1, 0x1

    aput v0, v3, v1

    .line 850
    invoke-virtual {p1, v2}, Lo/nv;->d([F)V

    .line 851
    invoke-virtual {p1, v3}, Lo/nv;->d([F)V

    .line 853
    const/4 v0, 0x1

    aget v0, v3, v0

    const/4 v1, 0x1

    aget v1, v2, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 855
    const/4 v0, 0x0

    return v0

    .line 857
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private b()V
    .locals 2

    .line 861
    iget-object v0, p0, Lo/eie;->aw:Landroid/view/View;

    if-nez v0, :cond_0

    .line 862
    return-void

    .line 864
    :cond_0
    iget-object v0, p0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/eie;->aw:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 865
    iget-object v0, p0, Lo/eie;->aw:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 866
    :cond_1
    iget-object v0, p0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/eie;->aw:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 867
    iget-object v0, p0, Lo/eie;->aw:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 869
    :cond_2
    :goto_0
    return-void
.end method

.method private b(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 24

    .line 249
    sget-object v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef:[I

    sget v1, Lcom/huawei/ui/commonui/R$style;->DefaultChartLayoutStyle:I

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    invoke-virtual {v2, v3, v0, v4, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 250
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_TopWhiteSpaceHeight:I

    const v1, 0x4019999a    # 2.4f

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v6

    .line 251
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_ExtraTopForYLableOffset:I

    const/high16 v1, 0x41580000    # 13.5f

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v7

    .line 252
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_XAxisPaddingWhiteOffset:I

    const/high16 v1, 0x42200000    # 40.0f

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    .line 253
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_XAxisTextAreaHeight:I

    const/high16 v1, 0x41800000    # 16.0f

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v9

    .line 254
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_MarkerViewPathwayHeight:I

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v10

    .line 255
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_FirstYAxisBoardingPadding:I

    const/high16 v1, 0x41800000    # 16.0f

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v11

    .line 256
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_FirstYAxisWidth:I

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v12

    .line 257
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_SecondYAxisWidth:I

    const/high16 v1, 0x42200000    # 40.0f

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v13

    .line 258
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_SecondYAxisBoardingPadding:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v14

    .line 259
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_GridLinePaddingLeft:I

    const/high16 v1, 0x41800000    # 16.0f

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v15

    .line 260
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_GridLinePaddingRight:I

    const/high16 v1, 0x41800000    # 16.0f

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v16

    .line 261
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_LegendHeight:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v17

    .line 262
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_XAxisOutsideTextAreaTopOffset:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v18

    .line 263
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_XAxisOutsideTextAreaHeight:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v19

    .line 264
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_XAxisOutsideTextAreaBottomOffset:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v20

    .line 265
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_XAxisDescriptionAreaHeight:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v21

    .line 266
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_XAxisDescMarginTopWithContent:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v22

    .line 267
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ChartLayoutStyleDef_XAxisTextFloatingPathWay:I

    const/high16 v1, 0x40200000    # 2.5f

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v23

    .line 269
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 272
    new-instance v0, Lo/ehi;

    invoke-virtual/range {p0 .. p0}, Lo/eie;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ehi;-><init>(Landroid/content/Context;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/eie;->ac:Lo/ehi;

    .line 273
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eie;->ac:Lo/ehi;

    invoke-virtual {v0, v6}, Lo/ehi;->b(F)Lo/ehi;

    move-result-object v0

    .line 274
    invoke-virtual {v0, v7}, Lo/ehi;->e(F)Lo/ehi;

    move-result-object v0

    .line 275
    invoke-virtual {v0, v8}, Lo/ehi;->f(F)Lo/ehi;

    move-result-object v0

    .line 276
    invoke-virtual {v0, v9}, Lo/ehi;->g(F)Lo/ehi;

    move-result-object v0

    .line 277
    invoke-virtual {v0, v10}, Lo/ehi;->k(F)Lo/ehi;

    move-result-object v0

    .line 278
    invoke-virtual {v0, v11}, Lo/ehi;->a(F)Lo/ehi;

    move-result-object v0

    .line 279
    invoke-virtual {v0, v12}, Lo/ehi;->d(F)Lo/ehi;

    move-result-object v0

    .line 280
    invoke-virtual {v0, v13}, Lo/ehi;->c(F)Lo/ehi;

    move-result-object v0

    .line 281
    invoke-virtual {v0, v14}, Lo/ehi;->h(F)Lo/ehi;

    move-result-object v0

    .line 282
    move/from16 v1, v16

    invoke-virtual {v0, v15, v1}, Lo/ehi;->a(FF)Lo/ehi;

    move-result-object v0

    .line 283
    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/ehi;->i(F)Lo/ehi;

    move-result-object v0

    .line 284
    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/ehi;->o(F)Lo/ehi;

    move-result-object v0

    .line 285
    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/ehi;->p(F)Lo/ehi;

    move-result-object v0

    .line 286
    move/from16 v1, v20

    invoke-virtual {v0, v1}, Lo/ehi;->m(F)Lo/ehi;

    move-result-object v0

    .line 287
    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/ehi;->l(F)Lo/ehi;

    move-result-object v0

    .line 288
    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lo/ehi;->n(F)Lo/ehi;

    move-result-object v0

    .line 289
    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lo/ehi;->t(F)Lo/ehi;

    move-result-object v0

    .line 290
    invoke-virtual/range {p0 .. p0}, Lo/eie;->getPaddingLeft()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ehi;->a(I)Lo/ehi;

    move-result-object v0

    .line 291
    invoke-virtual/range {p0 .. p0}, Lo/eie;->getPaddingRight()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ehi;->b(I)Lo/ehi;

    move-result-object v0

    .line 292
    invoke-virtual/range {p0 .. p0}, Lo/eie;->getPaddingTop()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ehi;->d(I)Lo/ehi;

    move-result-object v0

    .line 293
    invoke-virtual/range {p0 .. p0}, Lo/eie;->getPaddingBottom()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ehi;->c(I)Lo/ehi;

    .line 295
    return-void
.end method

.method private b(Landroid/graphics/Bitmap;II)Z
    .locals 1

    .line 609
    if-nez p1, :cond_0

    .line 610
    const/4 v0, 0x0

    return v0

    .line 613
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-eq v0, p2, :cond_1

    .line 614
    const/4 v0, 0x0

    return v0

    .line 616
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-eq v0, p3, :cond_2

    .line 617
    const/4 v0, 0x0

    return v0

    .line 620
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 5

    .line 627
    iget-object v0, p0, Lo/eie;->A:Lo/ma;

    if-nez v0, :cond_0

    .line 630
    return-void

    .line 632
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 635
    invoke-virtual {p0, p1}, Lo/eie;->a(Landroid/graphics/Canvas;)V

    .line 636
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 638
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 639
    invoke-virtual {p0}, Lo/eie;->k()V

    .line 641
    invoke-virtual {p0}, Lo/eie;->F()V

    .line 643
    invoke-direct {p0, p1}, Lo/eie;->k(Landroid/graphics/Canvas;)V

    .line 644
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 647
    iget-object v0, p0, Lo/eie;->ae:Lo/eir;

    invoke-virtual {v0}, Lo/eir;->i()V

    .line 650
    invoke-virtual {p0}, Lo/eie;->U()V

    .line 651
    invoke-direct {p0}, Lo/eie;->b()V

    .line 652
    iget-object v0, p0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 653
    invoke-direct {p0, p1}, Lo/eie;->e(Landroid/graphics/Canvas;)V

    .line 657
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 658
    iget-object v0, p0, Lo/eie;->x:Lo/nu;

    invoke-virtual {v0, p1}, Lo/nu;->b(Landroid/graphics/Canvas;)V

    .line 659
    iget-object v0, p0, Lo/eie;->ae:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->d(Landroid/graphics/Canvas;)V

    .line 660
    iget-object v0, p0, Lo/eie;->am:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->d(Landroid/graphics/Canvas;)V

    .line 661
    iget-object v0, p0, Lo/eie;->ai:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->d(Landroid/graphics/Canvas;)V

    .line 663
    iget-object v0, p0, Lo/eie;->x:Lo/nu;

    invoke-virtual {v0, p1}, Lo/nu;->a(Landroid/graphics/Canvas;)V

    .line 664
    iget-object v0, p0, Lo/eie;->ae:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->e(Landroid/graphics/Canvas;)V

    .line 665
    iget-object v0, p0, Lo/eie;->am:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->e(Landroid/graphics/Canvas;)V

    .line 666
    iget-object v0, p0, Lo/eie;->ai:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->e(Landroid/graphics/Canvas;)V

    .line 668
    iget-object v0, p0, Lo/eie;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->B()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/eie;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 669
    iget-object v0, p0, Lo/eie;->x:Lo/nu;

    invoke-virtual {v0, p1}, Lo/nu;->e(Landroid/graphics/Canvas;)V

    .line 671
    :cond_2
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->B()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->o()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 672
    iget-object v0, p0, Lo/eie;->ae:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->c(Landroid/graphics/Canvas;)V

    .line 674
    :cond_3
    iget-object v0, p0, Lo/eie;->af:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->B()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/eie;->af:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->o()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 675
    iget-object v0, p0, Lo/eie;->am:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->c(Landroid/graphics/Canvas;)V

    .line 677
    :cond_4
    iget-object v0, p0, Lo/eie;->ah:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->B()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/eie;->ah:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->o()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 678
    iget-object v0, p0, Lo/eie;->ai:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->c(Landroid/graphics/Canvas;)V

    .line 680
    :cond_5
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 683
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 685
    iget-object v0, p0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->m()Landroid/graphics/RectF;

    move-result-object v3

    .line 686
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 687
    iget v0, v4, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lo/eie;->H:Lo/ln;

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float/2addr v0, v1

    iput v0, v4, Landroid/graphics/RectF;->bottom:F

    .line 688
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 690
    iget-object v0, p0, Lo/eie;->S:Lo/nj;

    invoke-virtual {v0, p1}, Lo/nj;->a(Landroid/graphics/Canvas;)V

    .line 699
    iget-boolean v0, p0, Lo/eie;->ab:Z

    if-nez v0, :cond_7

    .line 701
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    sget-object v1, Lo/eie;->an:Lo/eie$a;

    if-eq v0, v1, :cond_7

    .line 702
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    iget-boolean v0, v0, Lo/eie$a;->d:Z

    if-nez v0, :cond_6

    .line 704
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    iget v0, v0, Lo/eie$a;->a:F

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/eie;->e(FZ)V

    goto :goto_0

    .line 705
    :cond_6
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    iget v0, v0, Lo/eie$a;->c:F

    const/high16 v1, -0x40800000    # -1.0f

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3a83126f    # 0.001f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_7

    .line 707
    invoke-virtual {p0}, Lo/eie;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/eie;->e(FZ)V

    .line 713
    :cond_7
    :goto_0
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 715
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 716
    iget-object v0, p0, Lo/eie;->S:Lo/nj;

    invoke-virtual {v0, p1}, Lo/nj;->d(Landroid/graphics/Canvas;)V

    .line 717
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 719
    iget-boolean v0, p0, Lo/eie;->ab:Z

    if-nez v0, :cond_8

    .line 720
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    sget-object v1, Lo/eie;->an:Lo/eie$a;

    if-eq v0, v1, :cond_9

    .line 722
    iget-object v0, p0, Lo/eie;->x:Lo/nu;

    check-cast v0, Lo/eiq;

    iget-object v1, p0, Lo/eie;->ao:Lo/eie$a;

    iget v1, v1, Lo/eie$a;->a:F

    invoke-virtual {v0, v1}, Lo/eiq;->b(F)V

    goto :goto_1

    .line 725
    :cond_8
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    sget-object v1, Lo/eie;->an:Lo/eie$a;

    if-eq v0, v1, :cond_9

    .line 727
    iget-object v0, p0, Lo/eie;->x:Lo/nu;

    check-cast v0, Lo/eiq;

    iget v1, p0, Lo/eie;->av:F

    invoke-virtual {v0, v1}, Lo/eiq;->b(F)V

    .line 731
    :cond_9
    :goto_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 732
    iget-object v0, p0, Lo/eie;->x:Lo/nu;

    invoke-virtual {v0, p1}, Lo/nu;->c(Landroid/graphics/Canvas;)V

    .line 733
    iget-object v0, p0, Lo/eie;->ae:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->b(Landroid/graphics/Canvas;)V

    .line 734
    iget-object v0, p0, Lo/eie;->am:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->b(Landroid/graphics/Canvas;)V

    .line 735
    iget-object v0, p0, Lo/eie;->ai:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->b(Landroid/graphics/Canvas;)V

    .line 736
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 738
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 739
    iget-object v0, p0, Lo/eie;->S:Lo/nj;

    invoke-virtual {v0, p1}, Lo/nj;->e(Landroid/graphics/Canvas;)V

    .line 740
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 742
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 743
    iget-object v0, p0, Lo/eie;->J:Lo/np;

    invoke-virtual {v0, p1}, Lo/np;->e(Landroid/graphics/Canvas;)V

    .line 744
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 746
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 747
    invoke-virtual {p0, p1}, Lo/eie;->b(Landroid/graphics/Canvas;)V

    .line 748
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 750
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 751
    invoke-virtual {p0, p1}, Lo/eie;->d(Landroid/graphics/Canvas;)V

    .line 752
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 755
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 757
    iget-object v0, p0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->m()Landroid/graphics/RectF;

    move-result-object v3

    .line 758
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 759
    iget v0, v4, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lo/eie;->H:Lo/ln;

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float/2addr v0, v1

    iput v0, v4, Landroid/graphics/RectF;->bottom:F

    .line 760
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 761
    invoke-virtual {p0}, Lo/eie;->z()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 763
    iget-object v0, p0, Lo/eie;->S:Lo/nj;

    iget-object v1, p0, Lo/eie;->Q:[Lo/mh;

    invoke-virtual {v0, p1, v1}, Lo/nj;->d(Landroid/graphics/Canvas;[Lo/mh;)V

    .line 766
    :cond_a
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 767
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 18

    .line 771
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eie;->ad:Lo/eit;

    if-eqz v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eie;->ad:Lo/eit;

    iget v0, v0, Lo/eit;->d:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    .line 774
    :cond_0
    return-void

    .line 777
    :cond_1
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 778
    const/16 v0, 0x80

    const/16 v1, 0x1a

    const/16 v2, 0x1a

    const/16 v3, 0x1a

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 780
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 781
    invoke-virtual/range {p0 .. p0}, Lo/eie;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v6

    .line 782
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 783
    invoke-virtual/range {p0 .. p0}, Lo/eie;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_getting_file:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 785
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->g()F

    move-result v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eie;->az:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    sub-float v8, v0, v1

    .line 786
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v9

    .line 787
    cmpl-float v0, v9, v8

    if-lez v0, :cond_2

    .line 788
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {v5, v7, v0, v8, v1}, Landroid/graphics/Paint;->breakText(Ljava/lang/String;ZF[F)I

    move-result v10

    .line 789
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v1, v10, -0x3

    const/4 v2, 0x0

    invoke-virtual {v7, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 802
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lo/eie;->I()F

    move-result v10

    .line 803
    const/4 v0, 0x2

    new-array v11, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v11, v1

    const/4 v0, 0x1

    aput v10, v11, v0

    .line 804
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eie;->aj:Lo/eim;

    invoke-virtual {v0, v11}, Lo/eim;->e([F)V

    .line 805
    const/4 v0, 0x1

    aget v10, v11, v0

    .line 808
    const/high16 v0, 0x41c00000    # 24.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v12

    .line 809
    const/high16 v0, 0x41c00000    # 24.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v13

    .line 810
    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    add-float/2addr v0, v12

    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    add-float v14, v0, v1

    .line 812
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->f()F

    move-result v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eie;->O:Lo/oa;

    .line 813
    invoke-virtual {v1}, Lo/oa;->g()F

    move-result v1

    sub-float/2addr v1, v14

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float v15, v0, v1

    .line 816
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    float-to-int v1, v15

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v13, v2

    sub-float v2, v10, v2

    float-to-int v2, v2

    add-float v3, v15, v12

    float-to-int v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v13, v4

    add-float/2addr v4, v10

    float-to-int v4, v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/AnimationDrawable;->setBounds(IIII)V

    .line 822
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/AnimationDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 823
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eie;->ax:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/AnimationDrawable;->setBounds(Landroid/graphics/Rect;)V

    .line 826
    invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v16

    .line 827
    move-object/from16 v0, v16

    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->bottom:F

    move-object/from16 v1, v16

    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    sub-float v0, v10, v0

    move-object/from16 v1, v16

    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float v17, v0, v1

    .line 829
    add-float v0, v15, v12

    .line 830
    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v0, v0

    int-to-float v0, v0

    move/from16 v1, v17

    float-to-int v1, v1

    int-to-float v1, v1

    .line 829
    move-object/from16 v2, p1

    invoke-virtual {v2, v7, v0, v1, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 834
    return-void
.end method

.method private k(Landroid/graphics/Canvas;)V
    .locals 5

    .line 937
    iget-object v0, p0, Lo/eie;->a:Landroid/graphics/drawable/GradientDrawable;

    if-nez v0, :cond_0

    .line 939
    return-void

    .line 941
    :cond_0
    iget-object v0, p0, Lo/eie;->a:Landroid/graphics/drawable/GradientDrawable;

    iget-object v1, p0, Lo/eie;->O:Lo/oa;

    .line 942
    invoke-virtual {v1}, Lo/oa;->o()F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, Lo/eie;->O:Lo/oa;

    .line 943
    invoke-virtual {v2}, Lo/oa;->i()F

    move-result v2

    iget-object v3, p0, Lo/eie;->H:Lo/ln;

    invoke-virtual {v3}, Lo/ln;->y()F

    move-result v3

    add-float/2addr v2, v3

    float-to-int v2, v2

    .line 941
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setBounds(IIII)V

    .line 944
    iget-object v0, p0, Lo/eie;->a:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 946
    return-void
.end method


# virtual methods
.method public E()Lo/ehh;
    .locals 1

    .line 1058
    iget-object v0, p0, Lo/eie;->aa:Lo/ehh;

    return-object v0
.end method

.method protected F()V
    .locals 4

    .line 875
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 876
    iget-object v0, p0, Lo/eie;->ae:Lo/eir;

    iget-object v1, p0, Lo/eie;->ad:Lo/eit;

    iget v1, v1, Lo/eit;->q:F

    iget-object v2, p0, Lo/eie;->ad:Lo/eit;

    iget v2, v2, Lo/eit;->u:F

    iget-object v3, p0, Lo/eie;->ad:Lo/eit;

    invoke-virtual {v3}, Lo/eit;->E()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/eir;->d(FFZ)V

    .line 878
    :cond_0
    iget-object v0, p0, Lo/eie;->af:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 879
    iget-object v0, p0, Lo/eie;->am:Lo/eir;

    iget-object v1, p0, Lo/eie;->af:Lo/eit;

    iget v1, v1, Lo/eit;->q:F

    iget-object v2, p0, Lo/eie;->af:Lo/eit;

    iget v2, v2, Lo/eit;->u:F

    iget-object v3, p0, Lo/eie;->af:Lo/eit;

    invoke-virtual {v3}, Lo/eit;->E()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/eir;->d(FFZ)V

    .line 881
    :cond_1
    iget-object v0, p0, Lo/eie;->ah:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->B()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 882
    iget-object v0, p0, Lo/eie;->ai:Lo/eir;

    iget-object v1, p0, Lo/eie;->ah:Lo/eit;

    iget v1, v1, Lo/eit;->q:F

    iget-object v2, p0, Lo/eie;->ah:Lo/eit;

    iget v2, v2, Lo/eit;->u:F

    iget-object v3, p0, Lo/eie;->ah:Lo/eit;

    invoke-virtual {v3}, Lo/eit;->E()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/eir;->d(FFZ)V

    .line 884
    :cond_2
    iget-object v0, p0, Lo/eie;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->B()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 885
    iget-object v0, p0, Lo/eie;->x:Lo/nu;

    iget-object v1, p0, Lo/eie;->H:Lo/ln;

    iget v1, v1, Lo/ln;->q:F

    iget-object v2, p0, Lo/eie;->H:Lo/ln;

    iget v2, v2, Lo/ln;->u:F

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/nu;->d(FFZ)V

    .line 886
    :cond_3
    return-void
.end method

.method public G()Lo/ehi;
    .locals 1

    .line 1054
    iget-object v0, p0, Lo/eie;->ac:Lo/ehi;

    return-object v0
.end method

.method protected I()F
    .locals 4

    .line 838
    iget-object v0, p0, Lo/eie;->aj:Lo/eim;

    invoke-direct {p0, v0}, Lo/eie;->a(Lo/nv;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 839
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    iget-object v0, v0, Lo/eit;->a:[F

    const/4 v1, 0x3

    aget v0, v0, v1

    iget-object v1, p0, Lo/eie;->ad:Lo/eit;

    iget-object v1, v1, Lo/eit;->a:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    goto :goto_0

    .line 841
    :cond_0
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    iget-object v0, v0, Lo/eit;->a:[F

    const/4 v1, 0x1

    aget v0, v0, v1

    iget-object v1, p0, Lo/eie;->ad:Lo/eit;

    iget-object v1, v1, Lo/eit;->a:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    .line 843
    :goto_0
    return v3
.end method

.method public J()J
    .locals 2

    .line 1452
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    check-cast v0, Lo/elc;

    invoke-virtual {v0}, Lo/elc;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public K()Z
    .locals 2

    .line 1117
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    sget-object v1, Lo/eie;->an:Lo/eie$a;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public L()V
    .locals 1

    .line 1467
    iget-object v0, p0, Lo/eie;->aB:Landroid/graphics/Canvas;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eie;->aB:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1469
    iget-object v0, p0, Lo/eie;->aB:Landroid/graphics/Canvas;

    invoke-virtual {p0, v0}, Lo/eie;->draw(Landroid/graphics/Canvas;)V

    .line 1470
    return-void

    .line 1473
    :cond_0
    invoke-virtual {p0}, Lo/eie;->invalidate()V

    .line 1474
    return-void
.end method

.method public M()Z
    .locals 1

    .line 1448
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    check-cast v0, Lo/elc;

    invoke-virtual {v0}, Lo/elc;->a()Z

    move-result v0

    return v0
.end method

.method public N()F
    .locals 2

    .line 1110
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    sget-object v1, Lo/eie;->an:Lo/eie$a;

    if-ne v0, v1, :cond_0

    .line 1111
    const/4 v0, 0x0

    return v0

    .line 1113
    :cond_0
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    iget v0, v0, Lo/eie$a;->a:F

    return v0
.end method

.method public O()V
    .locals 1

    .line 1556
    iget-object v0, p0, Lo/eie;->ae:Lo/eir;

    invoke-virtual {v0}, Lo/eir;->c()V

    .line 1557
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/eie;->f(Z)V

    .line 1558
    return-void
.end method

.method public P()Z
    .locals 1

    .line 1569
    iget-object v0, p0, Lo/eie;->ae:Lo/eir;

    invoke-virtual {v0}, Lo/eir;->k()Z

    move-result v0

    return v0
.end method

.method public Q()Z
    .locals 1

    .line 1594
    iget-object v0, p0, Lo/eie;->S:Lo/nj;

    instance-of v0, v0, Lo/eiu;

    if-nez v0, :cond_0

    .line 1595
    const/4 v0, 0x0

    return v0

    .line 1597
    :cond_0
    iget-object v0, p0, Lo/eie;->S:Lo/nj;

    check-cast v0, Lo/eiu;

    invoke-interface {v0}, Lo/eiu;->b()Z

    move-result v0

    return v0
.end method

.method public R()Z
    .locals 1

    .line 1533
    iget-boolean v0, p0, Lo/eie;->aD:Z

    return v0
.end method

.method public S()Z
    .locals 2

    .line 1573
    invoke-virtual {p0}, Lo/eie;->P()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1574
    const/4 v0, 0x0

    return v0

    .line 1576
    :cond_0
    iget-object v0, p0, Lo/eie;->S:Lo/nj;

    move-object v1, v0

    check-cast v1, Lo/eiu;

    .line 1577
    invoke-interface {v1}, Lo/eiu;->b()Z

    move-result v0

    return v0
.end method

.method public T()Lo/eiz;
    .locals 1

    .line 1703
    iget-object v0, p0, Lo/eie;->au:Lo/eiz;

    return-object v0
.end method

.method protected U()V
    .locals 9

    .line 1656
    invoke-virtual {p0}, Lo/eie;->V()Z

    move-result v6

    .line 1658
    if-eqz v6, :cond_0

    iget-object v0, p0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1660
    const/high16 v0, 0x41c00000    # 24.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v7

    .line 1661
    const/high16 v0, 0x41c00000    # 24.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v8

    .line 1663
    iget-object v0, p0, Lo/eie;->az:Landroid/graphics/Rect;

    float-to-int v1, v7

    float-to-int v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 1668
    iget-object v0, p0, Lo/eie;->ax:Landroid/graphics/Rect;

    iget-object v1, p0, Lo/eie;->O:Lo/oa;

    .line 1669
    invoke-virtual {v1}, Lo/oa;->f()F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, Lo/eie;->O:Lo/oa;

    .line 1670
    invoke-virtual {v2}, Lo/oa;->e()F

    move-result v2

    float-to-int v2, v2

    iget-object v3, p0, Lo/eie;->O:Lo/oa;

    .line 1671
    invoke-virtual {v3}, Lo/oa;->h()F

    move-result v3

    float-to-int v3, v3

    iget-object v4, p0, Lo/eie;->O:Lo/oa;

    .line 1672
    invoke-virtual {v4}, Lo/oa;->i()F

    move-result v4

    invoke-virtual {p0}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v5

    invoke-virtual {v5}, Lo/ln;->y()F

    move-result v5

    add-float/2addr v4, v5

    float-to-int v4, v4

    .line 1668
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 1673
    iget-object v0, p0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    iget-object v1, p0, Lo/eie;->ax:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/AnimationDrawable;->setBounds(Landroid/graphics/Rect;)V

    .line 1674
    iget-object v0, p0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/AnimationDrawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 1675
    iget-object v0, p0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/AnimationDrawable;->setOneShot(Z)V

    .line 1676
    iget-object v0, p0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 1679
    invoke-virtual {p0}, Lo/eie;->K()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1681
    invoke-virtual {p0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v0

    invoke-virtual {v0}, Lo/oa;->f()F

    move-result v0

    .line 1682
    invoke-virtual {p0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v1

    invoke-virtual {v1}, Lo/oa;->h()F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    .line 1681
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/eie;->e(FZ)V

    .line 1686
    :cond_0
    if-nez v6, :cond_1

    iget-object v0, p0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1687
    iget-object v0, p0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 1689
    :cond_1
    return-void
.end method

.method protected V()Z
    .locals 1

    .line 1651
    iget-object v0, p0, Lo/eie;->au:Lo/eiz;

    invoke-virtual {v0}, Lo/eiz;->b()Z

    move-result v0

    return v0
.end method

.method public W()Lo/eie$c;
    .locals 3

    .line 1601
    iget-object v0, p0, Lo/eie;->ag:Ljava/util/List;

    if-nez v0, :cond_0

    .line 1602
    const/4 v0, 0x0

    return-object v0

    .line 1605
    :cond_0
    iget-object v0, p0, Lo/eie;->ag:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eie$c;

    .line 1606
    const-class v0, Lo/ejs;

    invoke-interface {v2, v0}, Lo/eie$c;->c(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1607
    return-object v2

    .line 1609
    :cond_1
    goto :goto_0

    .line 1610
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public X()Z
    .locals 4

    .line 1626
    iget-object v0, p0, Lo/eie;->A:Lo/ma;

    if-nez v0, :cond_0

    .line 1627
    const/4 v0, 0x0

    return v0

    .line 1630
    :cond_0
    iget-object v0, p0, Lo/eie;->A:Lo/ma;

    check-cast v0, Lo/eik;

    invoke-virtual {v0}, Lo/eik;->h()Ljava/util/List;

    move-result-object v1

    .line 1632
    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 1633
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 1636
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ejl;

    .line 1637
    invoke-interface {v3}, Lo/ejl;->P()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1638
    const/4 v0, 0x0

    return v0

    .line 1640
    :cond_3
    goto :goto_0

    .line 1642
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public a(Lo/eit$b;)Lo/eit;
    .locals 1

    .line 1239
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne p1, v0, :cond_0

    .line 1240
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    return-object v0

    .line 1241
    :cond_0
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne p1, v0, :cond_1

    .line 1242
    iget-object v0, p0, Lo/eie;->af:Lo/eit;

    return-object v0

    .line 1244
    :cond_1
    iget-object v0, p0, Lo/eie;->ah:Lo/eit;

    return-object v0
.end method

.method protected a()V
    .locals 8

    .line 120
    invoke-super {p0}, Lo/le;->a()V

    .line 121
    invoke-virtual {p0}, Lo/eie;->getContext()Landroid/content/Context;

    move-result-object v6

    .line 123
    new-instance v0, Lo/eio;

    invoke-direct {v0}, Lo/eio;-><init>()V

    iput-object v0, p0, Lo/eie;->H:Lo/ln;

    .line 124
    iget-object v0, p0, Lo/eie;->H:Lo/ln;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ln;->a(Z)V

    .line 126
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eie;->l:Lo/lp;

    const/4 v0, 0x0

    iput-object v0, p0, Lo/eie;->r:Lo/lp;

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eie;->q:Lo/nv;

    const/4 v0, 0x0

    iput-object v0, p0, Lo/eie;->u:Lo/nv;

    .line 128
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eie;->s:Lo/nt;

    const/4 v0, 0x0

    iput-object v0, p0, Lo/eie;->t:Lo/nt;

    .line 130
    new-instance v0, Lo/eit;

    sget-object v1, Lo/eit$b;->e:Lo/eit$b;

    invoke-direct {v0, p0, v1}, Lo/eit;-><init>(Lo/eie;Lo/eit$b;)V

    iput-object v0, p0, Lo/eie;->ad:Lo/eit;

    .line 133
    new-instance v0, Lo/eit;

    sget-object v1, Lo/eit$b;->b:Lo/eit$b;

    invoke-direct {v0, p0, v1}, Lo/eit;-><init>(Lo/eie;Lo/eit$b;)V

    iput-object v0, p0, Lo/eie;->af:Lo/eit;

    .line 135
    new-instance v0, Lo/eit;

    sget-object v1, Lo/eit$b;->c:Lo/eit$b;

    invoke-direct {v0, p0, v1}, Lo/eit;-><init>(Lo/eie;Lo/eit$b;)V

    iput-object v0, p0, Lo/eie;->ah:Lo/eit;

    .line 140
    new-instance v0, Lo/eip;

    invoke-virtual {p0}, Lo/eie;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eip;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/eie;->O:Lo/oa;

    .line 142
    new-instance v0, Lo/eja;

    iget-object v1, p0, Lo/eie;->O:Lo/oa;

    invoke-direct {v0, p0, v1}, Lo/eja;-><init>(Lo/eie;Lo/oa;)V

    iput-object v0, p0, Lo/eie;->K:Lo/nd;

    .line 144
    new-instance v0, Lo/eim;

    iget-object v1, p0, Lo/eie;->O:Lo/oa;

    invoke-direct {v0, v6, v1}, Lo/eim;-><init>(Landroid/content/Context;Lo/oa;)V

    iput-object v0, p0, Lo/eie;->aj:Lo/eim;

    .line 145
    new-instance v0, Lo/eim;

    iget-object v1, p0, Lo/eie;->O:Lo/oa;

    invoke-direct {v0, v6, v1}, Lo/eim;-><init>(Landroid/content/Context;Lo/oa;)V

    iput-object v0, p0, Lo/eie;->al:Lo/eim;

    .line 146
    new-instance v0, Lo/eim;

    iget-object v1, p0, Lo/eie;->O:Lo/oa;

    invoke-direct {v0, v6, v1}, Lo/eim;-><init>(Landroid/content/Context;Lo/oa;)V

    iput-object v0, p0, Lo/eie;->ak:Lo/eim;

    .line 148
    new-instance v0, Lo/eiq;

    iget-object v3, p0, Lo/eie;->O:Lo/oa;

    iget-object v4, p0, Lo/eie;->H:Lo/ln;

    iget-object v5, p0, Lo/eie;->aj:Lo/eim;

    move-object v1, v6

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Lo/eiq;-><init>(Landroid/content/Context;Lo/eie;Lo/oa;Lo/ln;Lo/nv;)V

    iput-object v0, p0, Lo/eie;->x:Lo/nu;

    .line 150
    new-instance v0, Lo/eir;

    iget-object v2, p0, Lo/eie;->O:Lo/oa;

    iget-object v3, p0, Lo/eie;->ad:Lo/eit;

    iget-object v4, p0, Lo/eie;->aj:Lo/eim;

    move-object v1, v6

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/eir;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/eie;->ae:Lo/eir;

    .line 152
    new-instance v0, Lo/eir;

    iget-object v2, p0, Lo/eie;->O:Lo/oa;

    iget-object v3, p0, Lo/eie;->af:Lo/eit;

    iget-object v4, p0, Lo/eie;->al:Lo/eim;

    move-object v1, v6

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/eir;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/eie;->am:Lo/eir;

    .line 154
    new-instance v0, Lo/eir;

    iget-object v2, p0, Lo/eie;->O:Lo/oa;

    iget-object v3, p0, Lo/eie;->ah:Lo/eit;

    iget-object v4, p0, Lo/eie;->ak:Lo/eim;

    move-object v1, v6

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/eir;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/eie;->ai:Lo/eir;

    .line 156
    iget-object v0, p0, Lo/eie;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->b(Z)V

    .line 157
    iget-object v0, p0, Lo/eie;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 158
    iget-object v0, p0, Lo/eie;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 160
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eie;->ag:Ljava/util/List;

    .line 161
    new-instance v0, Lo/eie$4;

    invoke-direct {v0, p0}, Lo/eie$4;-><init>(Lo/eie;)V

    invoke-virtual {p0, v0}, Lo/eie;->a(Lo/eie$c;)V

    .line 199
    invoke-virtual {p0}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/ln;->h(F)V

    .line 200
    invoke-virtual {p0}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/ln;->i(F)V

    .line 205
    new-instance v7, Lo/elc;

    sget v0, Lcom/huawei/ui/commonui/R$layout;->custom_marker_view:I

    invoke-direct {v7, v6, v0, p0}, Lo/elc;-><init>(Landroid/content/Context;ILo/eie;)V

    .line 206
    invoke-virtual {v7, p0}, Lo/elc;->setChartView(Lo/ld;)V

    .line 207
    invoke-virtual {p0, v7}, Lo/eie;->setMarker(Lo/lk;)V

    .line 212
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/eie;->setDrawBorders(Z)V

    .line 213
    invoke-virtual {p0}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v0

    sget-object v1, Lo/ln$e;->e:Lo/ln$e;

    invoke-virtual {v0, v1}, Lo/ln;->b(Lo/ln$e;)V

    .line 214
    invoke-virtual {p0}, Lo/eie;->getLegend()Lo/lm;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lm;->d(Z)V

    .line 215
    invoke-virtual {p0}, Lo/eie;->getDescription()Lo/ll;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ll;->d(Z)V

    .line 216
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/eie;->e(Z)V

    .line 219
    invoke-virtual {p0}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v0

    const/16 v1, 0x7f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ln;->b(I)V

    .line 220
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    const/16 v1, 0x7f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eit;->b(I)V

    .line 221
    iget-object v0, p0, Lo/eie;->af:Lo/eit;

    const/16 v1, 0x7f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eit;->b(I)V

    .line 222
    iget-object v0, p0, Lo/eie;->ah:Lo/eit;

    const/16 v1, 0x7f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eit;->b(I)V

    .line 225
    const/high16 v0, 0x41800000    # 16.0f

    invoke-virtual {p0, v0}, Lo/eie;->setYAxisMinWidth(F)V

    .line 233
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/eie;->setBackgroundColor(I)V

    .line 234
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/eie;->a(II)V

    .line 239
    iget-object v0, p0, Lo/eie;->N:Lo/lm;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lm;->g(F)V

    .line 242
    invoke-virtual {p0}, Lo/eie;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$drawable;->hw_health_loading_chart:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    .line 243
    new-instance v0, Lo/eiz;

    invoke-direct {v0, p0}, Lo/eiz;-><init>(Lo/eie;)V

    iput-object v0, p0, Lo/eie;->au:Lo/eiz;

    .line 245
    iget-object v0, p0, Lo/eie;->L:Lo/ll;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lo/ll;->k(F)V

    .line 246
    return-void
.end method

.method public a(FZ)V
    .locals 7

    .line 1006
    instance-of v0, p0, Lo/eih;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lo/eih;

    iget-object v0, v0, Lo/eih;->av:Lo/eih$c;

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-eq v0, v1, :cond_1

    .line 1007
    :cond_0
    invoke-virtual {p0, p1, p2}, Lo/eie;->e(FZ)V

    .line 1008
    return-void

    .line 1011
    :cond_1
    const/4 v0, 0x2

    new-array v4, v0, [F

    const/4 v0, 0x0

    aput p1, v4, v0

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 1012
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eie;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/eim;->d([F)V

    .line 1014
    move-object v0, p0

    check-cast v0, Lo/eih;

    iget-object v0, v0, Lo/eih;->as:Lo/eih$h;

    const/4 v1, 0x0

    aget v1, v4, v1

    float-to-int v1, v1

    invoke-interface {v0, v1}, Lo/eih$h;->e(I)I

    move-result v5

    .line 1016
    const/4 v0, 0x2

    new-array v4, v0, [F

    int-to-float v0, v5

    const/4 v1, 0x0

    aput v0, v4, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 1017
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eie;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/eim;->e([F)V

    .line 1019
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    sget-object v1, Lo/eie;->an:Lo/eie$a;

    if-ne v0, v1, :cond_2

    .line 1020
    new-instance v0, Lo/eie$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/eie$a;-><init>(FF)V

    iput-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    .line 1023
    :cond_2
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/eie$a;->d:Z

    .line 1024
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    int-to-float v1, v5

    iput v1, v0, Lo/eie$a;->c:F

    .line 1025
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    const/4 v1, 0x0

    aget v1, v4, v1

    iput v1, v0, Lo/eie$a;->a:F

    .line 1026
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1027
    new-instance v0, Lo/mh;

    iget-object v1, p0, Lo/eie;->ao:Lo/eie$a;

    iget v1, v1, Lo/eie$a;->c:F

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lo/mh;-><init>(FII)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1028
    if-eqz v6, :cond_3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    .line 1029
    const/4 v0, 0x0

    new-array v0, v0, [Lo/mh;

    invoke-interface {v6, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/mh;

    invoke-virtual {p0, v0, p2}, Lo/eie;->b([Lo/mh;Z)V

    .line 1031
    :cond_3
    return-void
.end method

.method public a(II)V
    .locals 3

    .line 1251
    const/4 v0, 0x2

    new-array v1, v0, [I

    const/4 v0, 0x0

    aput p1, v1, v0

    const/4 v0, 0x1

    aput p2, v1, v0

    .line 1252
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-direct {v2, v0, v1}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 1253
    iput-object v2, p0, Lo/eie;->a:Landroid/graphics/drawable/GradientDrawable;

    .line 1254
    return-void
.end method

.method public a(Lo/eie$c;)V
    .locals 2

    .line 1615
    iget-object v0, p0, Lo/eie;->ag:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 1616
    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 1426
    iget-object v0, p0, Lo/eie;->x:Lo/nu;

    check-cast v0, Lo/eiq;

    invoke-virtual {v0, p1}, Lo/eiq;->b(Z)V

    .line 1427
    return-void
.end method

.method public b(Lo/eit;)F
    .locals 1

    .line 1062
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    if-ne p1, v0, :cond_0

    .line 1063
    iget-object v0, p0, Lo/eie;->ac:Lo/ehi;

    invoke-virtual {v0}, Lo/ehi;->e()F

    move-result v0

    return v0

    .line 1064
    :cond_0
    iget-object v0, p0, Lo/eie;->af:Lo/eit;

    if-ne p1, v0, :cond_1

    .line 1065
    iget-object v0, p0, Lo/eie;->ac:Lo/ehi;

    invoke-virtual {v0}, Lo/ehi;->b()F

    move-result v0

    return v0

    .line 1067
    :cond_1
    const/high16 v0, 0x41c00000    # 24.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    return v0
.end method

.method public b(Lo/eit$b;)Lo/eim;
    .locals 1

    .line 1179
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne p1, v0, :cond_0

    .line 1180
    iget-object v0, p0, Lo/eie;->aj:Lo/eim;

    return-object v0

    .line 1181
    :cond_0
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne p1, v0, :cond_1

    .line 1182
    iget-object v0, p0, Lo/eie;->al:Lo/eim;

    return-object v0

    .line 1184
    :cond_1
    iget-object v0, p0, Lo/eie;->ak:Lo/eim;

    return-object v0
.end method

.method public b(Lo/lp$b;)Lo/nv;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1189
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "HwHealthBaseLineChart getTransformer Deprecated"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(FZ)V
    .locals 6

    .line 967
    const/high16 v0, 0x40000000    # 2.0f

    rem-float v0, p1, v0

    const/4 v1, 0x0

    cmpl-float v0, v1, v0

    if-eqz v0, :cond_0

    .line 968
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr p1, v0

    .line 971
    :cond_0
    const/4 v0, 0x2

    new-array v4, v0, [F

    const/4 v0, 0x0

    aput p1, v4, v0

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 972
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eie;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/eim;->e([F)V

    .line 974
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    sget-object v1, Lo/eie;->an:Lo/eie$a;

    if-ne v0, v1, :cond_1

    .line 975
    new-instance v0, Lo/eie$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/eie$a;-><init>(FF)V

    iput-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    .line 977
    :cond_1
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/eie$a;->d:Z

    .line 978
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    iput p1, v0, Lo/eie$a;->c:F

    .line 979
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    const/4 v1, 0x0

    aget v1, v4, v1

    iput v1, v0, Lo/eie$a;->a:F

    .line 980
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 981
    new-instance v0, Lo/mh;

    iget-object v1, p0, Lo/eie;->ao:Lo/eie$a;

    iget v1, v1, Lo/eie$a;->c:F

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lo/mh;-><init>(FII)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 982
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 983
    const/4 v0, 0x0

    new-array v0, v0, [Lo/mh;

    invoke-interface {v5, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/mh;

    invoke-virtual {p0, v0, p2}, Lo/eie;->b([Lo/mh;Z)V

    .line 985
    :cond_2
    return-void
.end method

.method public b(IZ)V
    .locals 3

    .line 950
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    sget-object v1, Lo/eie;->an:Lo/eie$a;

    if-ne v0, v1, :cond_0

    .line 951
    new-instance v0, Lo/eie$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/eie$a;-><init>(FF)V

    iput-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    .line 953
    :cond_0
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/eie$a;->d:Z

    .line 954
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    int-to-float v1, p1

    iput v1, v0, Lo/eie$a;->c:F

    .line 956
    if-eqz p2, :cond_1

    .line 958
    invoke-virtual {p0}, Lo/eie;->invalidate()V

    .line 960
    :cond_1
    return-void
.end method

.method public b(Z)V
    .locals 1

    .line 390
    iget-object v0, p0, Lo/eie;->ac:Lo/ehi;

    invoke-virtual {v0, p1}, Lo/ehi;->b(Z)Lo/ehi;

    .line 392
    iget-object v0, p0, Lo/eie;->ae:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->d(Z)V

    .line 393
    iget-object v0, p0, Lo/eie;->am:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->d(Z)V

    .line 394
    iget-object v0, p0, Lo/eie;->ai:Lo/eir;

    invoke-virtual {v0, p1}, Lo/eir;->d(Z)V

    .line 395
    return-void
.end method

.method public b([Lo/mh;Z)V
    .locals 1

    .line 1095
    if-nez p1, :cond_0

    .line 1096
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eie;->Q:[Lo/mh;

    goto :goto_0

    .line 1099
    :cond_0
    invoke-virtual {p1}, [Lo/mh;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/mh;

    iput-object v0, p0, Lo/eie;->Q:[Lo/mh;

    .line 1101
    :goto_0
    iget-object v0, p0, Lo/eie;->Q:[Lo/mh;

    invoke-virtual {p0, v0}, Lo/eie;->setLastHighlighted([Lo/mh;)V

    .line 1103
    if-eqz p2, :cond_1

    .line 1105
    invoke-virtual {p0}, Lo/eie;->invalidate()V

    .line 1107
    :cond_1
    return-void
.end method

.method public abstract c()V
.end method

.method public c(Z)V
    .locals 1

    .line 1430
    iget-object v0, p0, Lo/eie;->x:Lo/nu;

    check-cast v0, Lo/eiq;

    invoke-virtual {v0, p1}, Lo/eiq;->d(Z)V

    .line 1431
    return-void
.end method

.method public c(Lo/lp$b;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1422
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "HwHealthBaseLineChart isInverted Deprecated"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected d(Lo/lp$b;)F
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1372
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "HwHealthBaseLineChart getAxisRange Deprecated"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected d()V
    .locals 4

    .line 1154
    iget-object v0, p0, Lo/eie;->H:Lo/ln;

    iget-object v1, p0, Lo/eie;->A:Lo/ma;

    check-cast v1, Lo/eik;

    invoke-virtual {v1}, Lo/eik;->i()F

    move-result v1

    iget-object v2, p0, Lo/eie;->A:Lo/ma;

    check-cast v2, Lo/eik;

    invoke-virtual {v2}, Lo/eik;->f()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/ln;->d(FF)V

    .line 1156
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    iget-object v1, p0, Lo/eie;->A:Lo/ma;

    check-cast v1, Lo/eik;

    sget-object v2, Lo/eit$b;->e:Lo/eit$b;

    .line 1157
    invoke-virtual {v1, v2}, Lo/eik;->b(Lo/eit$b;)F

    move-result v1

    iget-object v2, p0, Lo/eie;->A:Lo/ma;

    check-cast v2, Lo/eik;

    sget-object v3, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {v2, v3}, Lo/eik;->d(Lo/eit$b;)F

    move-result v2

    .line 1156
    invoke-virtual {v0, v1, v2}, Lo/eit;->d(FF)V

    .line 1158
    iget-object v0, p0, Lo/eie;->af:Lo/eit;

    iget-object v1, p0, Lo/eie;->A:Lo/ma;

    check-cast v1, Lo/eik;

    sget-object v2, Lo/eit$b;->b:Lo/eit$b;

    .line 1159
    invoke-virtual {v1, v2}, Lo/eik;->b(Lo/eit$b;)F

    move-result v1

    iget-object v2, p0, Lo/eie;->A:Lo/ma;

    check-cast v2, Lo/eik;

    sget-object v3, Lo/eit$b;->b:Lo/eit$b;

    invoke-virtual {v2, v3}, Lo/eik;->d(Lo/eit$b;)F

    move-result v2

    .line 1158
    invoke-virtual {v0, v1, v2}, Lo/eit;->d(FF)V

    .line 1160
    iget-object v0, p0, Lo/eie;->ah:Lo/eit;

    iget-object v1, p0, Lo/eie;->A:Lo/ma;

    check-cast v1, Lo/eik;

    sget-object v2, Lo/eit$b;->c:Lo/eit$b;

    .line 1161
    invoke-virtual {v1, v2}, Lo/eik;->b(Lo/eit$b;)F

    move-result v1

    iget-object v2, p0, Lo/eie;->A:Lo/ma;

    check-cast v2, Lo/eik;

    sget-object v3, Lo/eit$b;->c:Lo/eit$b;

    invoke-virtual {v2, v3}, Lo/eik;->d(Lo/eit$b;)F

    move-result v2

    .line 1160
    invoke-virtual {v0, v1, v2}, Lo/eit;->d(FF)V

    .line 1162
    return-void
.end method

.method public d(II)V
    .locals 1

    .line 1540
    iget-object v0, p0, Lo/eie;->ae:Lo/eir;

    invoke-virtual {v0, p1, p2}, Lo/eir;->a(II)V

    .line 1541
    return-void
.end method

.method protected d(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1268
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/eie;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    sget-object v1, Lo/eie;->an:Lo/eie$a;

    if-ne v0, v1, :cond_1

    .line 1269
    :cond_0
    return-void

    .line 1271
    :cond_1
    iget-boolean v0, p0, Lo/eie;->ab:Z

    if-nez v0, :cond_2

    .line 1274
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    check-cast v0, Lo/elc;

    iget-object v1, p0, Lo/eie;->ao:Lo/eie$a;

    iget v1, v1, Lo/eie$a;->a:F

    invoke-virtual {v0, v1}, Lo/elc;->a(F)V

    goto :goto_0

    .line 1276
    :cond_2
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    check-cast v0, Lo/elc;

    iget v1, p0, Lo/eie;->av:F

    invoke-virtual {v0, v1}, Lo/elc;->a(F)V

    .line 1281
    :goto_0
    invoke-virtual {p0}, Lo/eie;->R()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1283
    return-void

    .line 1286
    :cond_3
    invoke-virtual {p0}, Lo/eie;->V()Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v4, 0x1

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    .line 1287
    :goto_1
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    check-cast v0, Lo/elc;

    invoke-virtual {v0, v4}, Lo/elc;->a(Z)V

    .line 1289
    iget-boolean v0, p0, Lo/eie;->ab:Z

    if-nez v0, :cond_5

    .line 1290
    invoke-virtual {p0}, Lo/eie;->z()Z

    move-result v0

    if-nez v0, :cond_6

    .line 1291
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    check-cast v0, Lo/elc;

    invoke-virtual {v0}, Lo/elc;->e()V

    .line 1292
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    iget-object v1, p0, Lo/eie;->ao:Lo/eie$a;

    iget v1, v1, Lo/eie$a;->a:F

    const/4 v2, 0x0

    invoke-interface {v0, p1, v1, v2}, Lo/lk;->b(Landroid/graphics/Canvas;FF)V

    .line 1293
    return-void

    .line 1296
    :cond_5
    invoke-virtual {p0}, Lo/eie;->z()Z

    move-result v0

    if-nez v0, :cond_6

    .line 1297
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    check-cast v0, Lo/elc;

    invoke-virtual {v0}, Lo/elc;->e()V

    .line 1298
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    iget v1, p0, Lo/eie;->av:F

    const/4 v2, 0x0

    invoke-interface {v0, p1, v1, v2}, Lo/lk;->b(Landroid/graphics/Canvas;FF)V

    .line 1299
    return-void

    .line 1303
    :cond_6
    const/4 v5, 0x0

    .line 1307
    const/4 v6, 0x0

    :goto_2
    iget-object v0, p0, Lo/eie;->Q:[Lo/mh;

    array-length v0, v0

    if-ge v6, v0, :cond_b

    .line 1309
    iget-object v0, p0, Lo/eie;->Q:[Lo/mh;

    aget-object v7, v0, v6

    .line 1317
    invoke-virtual {p0}, Lo/eie;->S()Z

    move-result v0

    if-nez v0, :cond_7

    .line 1319
    iget-object v0, p0, Lo/eie;->A:Lo/ma;

    check-cast v0, Lo/eik;

    iget-object v1, p0, Lo/eie;->Q:[Lo/mh;

    aget-object v1, v1, v6

    invoke-virtual {v1}, Lo/mh;->b()F

    move-result v1

    invoke-virtual {v0, v1, p0}, Lo/eik;->c(FLo/eie;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v8

    goto :goto_3

    .line 1321
    :cond_7
    new-instance v9, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;

    invoke-direct {v9}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;-><init>()V

    .line 1322
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    new-instance v1, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    iget-object v2, p0, Lo/eie;->Q:[Lo/mh;

    aget-object v2, v2, v6

    .line 1323
    invoke-virtual {v2}, Lo/mh;->b()F

    move-result v2

    iget-object v3, p0, Lo/eie;->ae:Lo/eir;

    invoke-virtual {v3}, Lo/eir;->f()I

    move-result v3

    int-to-float v3, v3

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    iget-object v2, p0, Lo/eie;->A:Lo/ma;

    check-cast v2, Lo/eik;

    sget-object v3, Lo/eit$b;->e:Lo/eit$b;

    .line 1324
    invoke-virtual {v2, v3}, Lo/eik;->a(Lo/eit$b;)Lo/ejl;

    move-result-object v2

    check-cast v2, Lo/elb;

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;)V

    .line 1322
    invoke-virtual {v9, v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->add(Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;)V

    .line 1325
    move-object v8, v9

    .line 1328
    :goto_3
    if-nez v8, :cond_8

    .line 1329
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "entryForXValue must not be null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1335
    :cond_8
    move-object v0, v8

    check-cast v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->getEntries()Ljava/util/List;

    move-result-object v9

    .line 1336
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/eie;->A:Lo/ma;

    check-cast v1, Lo/eik;

    invoke-virtual {v1}, Lo/eik;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_9

    .line 1337
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "markerview entry size error"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1344
    :cond_9
    const/4 v0, 0x2

    new-array v10, v0, [F

    invoke-virtual {v7}, Lo/mh;->b()F

    move-result v0

    const/4 v1, 0x0

    aput v0, v10, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v10, v1

    .line 1345
    iget-object v0, p0, Lo/eie;->aj:Lo/eim;

    invoke-virtual {v0, v10}, Lo/eim;->e([F)V

    .line 1346
    iget-object v0, p0, Lo/eie;->O:Lo/oa;

    const/4 v1, 0x0

    aget v1, v10, v1

    invoke-virtual {v0, v1}, Lo/oa;->c(F)Z

    move-result v0

    if-nez v0, :cond_a

    .line 1348
    goto :goto_4

    .line 1352
    :cond_a
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    check-cast v0, Lo/elc;

    iget-object v1, p0, Lo/eie;->A:Lo/ma;

    check-cast v1, Lo/eik;

    invoke-virtual {v1}, Lo/eik;->e()I

    move-result v1

    invoke-virtual {v0, v8, v7, v1}, Lo/elc;->d(Lcom/github/mikephil/charting/data/Entry;Lo/mh;I)V

    .line 1353
    const/4 v5, 0x1

    .line 1307
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_2

    .line 1357
    :cond_b
    if-nez v5, :cond_c

    .line 1358
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    check-cast v0, Lo/elc;

    invoke-virtual {v0}, Lo/elc;->e()V

    .line 1361
    :cond_c
    iget-boolean v0, p0, Lo/eie;->ab:Z

    if-nez v0, :cond_d

    .line 1363
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    iget-object v1, p0, Lo/eie;->ao:Lo/eie$a;

    iget v1, v1, Lo/eie$a;->a:F

    const/4 v2, 0x0

    invoke-interface {v0, p1, v1, v2}, Lo/lk;->b(Landroid/graphics/Canvas;FF)V

    goto :goto_5

    .line 1365
    :cond_d
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    iget v1, p0, Lo/eie;->av:F

    const/4 v2, 0x0

    invoke-interface {v0, p1, v1, v2}, Lo/lk;->b(Landroid/graphics/Canvas;FF)V

    .line 1367
    :goto_5
    return-void
.end method

.method public d(Lo/ehi;)V
    .locals 4

    .line 298
    iput-object p1, p0, Lo/eie;->ac:Lo/ehi;

    .line 299
    iget-object v0, p0, Lo/eie;->ac:Lo/ehi;

    invoke-virtual {p0}, Lo/eie;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Lo/eie;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x43000000    # 128.0f

    invoke-virtual {v0, v1, v2, v3}, Lo/ehi;->e(FFF)Lo/ehh;

    move-result-object v0

    iput-object v0, p0, Lo/eie;->aa:Lo/ehh;

    .line 300
    return-void
.end method

.method public d(Z)V
    .locals 5

    .line 1498
    iput-boolean p1, p0, Lo/eie;->aD:Z

    .line 1499
    if-eqz p1, :cond_0

    .line 1501
    iget-object v0, p0, Lo/eie;->ac:Lo/ehi;

    invoke-virtual {v0}, Lo/ehi;->d()F

    move-result v0

    iget-object v1, p0, Lo/eie;->ac:Lo/ehi;

    invoke-virtual {v1}, Lo/ehi;->a()F

    move-result v1

    add-float v4, v0, v1

    .line 1502
    invoke-virtual {p0}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v0

    invoke-static {v4}, Lo/oc;->a(F)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/ln;->g(F)V

    .line 1504
    iget-object v0, p0, Lo/eie;->ac:Lo/ehi;

    invoke-virtual {v0}, Lo/ehi;->c()F

    move-result v0

    invoke-static {v0}, Lo/oc;->a(F)F

    move-result v0

    invoke-virtual {p0, v0}, Lo/eie;->setExtraBottomOffset(F)V

    .line 1506
    iget-object v0, p0, Lo/eie;->x:Lo/nu;

    check-cast v0, Lo/eiq;

    check-cast v0, Lo/eiq;

    sget-object v1, Lo/eiq$d;->b:Lo/eiq$d;

    invoke-virtual {v0, v1}, Lo/eiq;->a(Lo/eiq$d;)V

    .line 1511
    const/16 v0, 0xff

    const/16 v1, 0xf2

    const/16 v2, 0xf2

    const/16 v3, 0xf2

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/eie;->setBackgroundColor(I)V

    .line 1512
    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Lo/eie;->a(II)V

    .line 1513
    return-void

    .line 1516
    :cond_0
    iget-object v0, p0, Lo/eie;->x:Lo/nu;

    check-cast v0, Lo/eiq;

    check-cast v0, Lo/eiq;

    sget-object v1, Lo/eiq$d;->a:Lo/eiq$d;

    invoke-virtual {v0, v1}, Lo/eiq;->a(Lo/eiq$d;)V

    .line 1518
    iget-object v0, p0, Lo/eie;->ac:Lo/ehi;

    invoke-virtual {v0}, Lo/ehi;->h()F

    move-result v0

    iget-object v1, p0, Lo/eie;->ac:Lo/ehi;

    .line 1519
    invoke-virtual {v1}, Lo/ehi;->i()F

    move-result v1

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/eie;->ac:Lo/ehi;

    .line 1520
    invoke-virtual {v1}, Lo/ehi;->g()F

    move-result v1

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/eie;->ac:Lo/ehi;

    .line 1521
    invoke-virtual {v1}, Lo/ehi;->f()F

    move-result v1

    add-float v4, v0, v1

    .line 1523
    invoke-static {v4}, Lo/oc;->a(F)F

    move-result v0

    invoke-virtual {p0, v0}, Lo/eie;->setExtraBottomOffset(F)V

    .line 1528
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/eie;->setBackgroundColor(I)V

    .line 1529
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/eie;->a(II)V

    .line 1530
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 564
    invoke-super {p0, p1}, Lo/le;->draw(Landroid/graphics/Canvas;)V

    .line 565
    return-void
.end method

.method public e(Lo/eit$b;)Lo/eid;
    .locals 1

    .line 303
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne p1, v0, :cond_0

    .line 304
    iget-object v0, p0, Lo/eie;->ap:Lo/eid;

    return-object v0

    .line 305
    :cond_0
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne p1, v0, :cond_1

    .line 306
    iget-object v0, p0, Lo/eie;->aq:Lo/eid;

    return-object v0

    .line 308
    :cond_1
    iget-object v0, p0, Lo/eie;->ar:Lo/eid;

    return-object v0
.end method

.method public e(Lo/lp$b;)Lo/lp;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1387
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "HwHealthBaseLineChart getAxis Deprecated"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(FZ)V
    .locals 6

    .line 988
    const/4 v0, 0x2

    new-array v4, v0, [F

    const/4 v0, 0x0

    aput p1, v4, v0

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 989
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eie;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/eim;->d([F)V

    .line 991
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    sget-object v1, Lo/eie;->an:Lo/eie$a;

    if-ne v0, v1, :cond_0

    .line 992
    new-instance v0, Lo/eie$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/eie$a;-><init>(FF)V

    iput-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    .line 994
    :cond_0
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/eie$a;->d:Z

    .line 995
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    const/4 v1, 0x0

    aget v1, v4, v1

    iput v1, v0, Lo/eie$a;->c:F

    .line 996
    iget-object v0, p0, Lo/eie;->ao:Lo/eie$a;

    iput p1, v0, Lo/eie$a;->a:F

    .line 997
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 998
    new-instance v0, Lo/mh;

    iget-object v1, p0, Lo/eie;->ao:Lo/eie$a;

    iget v1, v1, Lo/eie$a;->c:F

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lo/mh;-><init>(FII)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 999
    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 1000
    const/4 v0, 0x0

    new-array v0, v0, [Lo/mh;

    invoke-interface {v5, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/mh;

    invoke-virtual {p0, v0, p2}, Lo/eie;->b([Lo/mh;Z)V

    .line 1002
    :cond_1
    return-void
.end method

.method public e(ILandroid/graphics/Paint;Z)V
    .locals 1

    .line 1544
    iget-object v0, p0, Lo/eie;->ae:Lo/eir;

    invoke-virtual {v0, p1, p2}, Lo/eir;->b(ILandroid/graphics/Paint;)V

    .line 1545
    invoke-virtual {p0, p3}, Lo/eie;->f(Z)V

    .line 1546
    return-void
.end method

.method public e(Landroid/view/View;)V
    .locals 0

    .line 1707
    iput-object p1, p0, Lo/eie;->aw:Landroid/view/View;

    .line 1708
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 327
    invoke-static {p0, p1}, Lo/ekq;->b(Lo/eie;Z)V

    .line 328
    return-void
.end method

.method public f()V
    .locals 5

    .line 513
    iget-object v0, p0, Lo/eie;->ac:Lo/ehi;

    .line 514
    invoke-virtual {p0}, Lo/eie;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Lo/eie;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x43000000    # 128.0f

    invoke-virtual {v0, v1, v2, v3}, Lo/ehi;->e(FFF)Lo/ehh;

    move-result-object v0

    iput-object v0, p0, Lo/eie;->aa:Lo/ehh;

    .line 516
    iget-object v0, p0, Lo/eie;->O:Lo/oa;

    iget-object v1, p0, Lo/eie;->aa:Lo/ehh;

    .line 517
    invoke-virtual {v1}, Lo/ehh;->b()F

    move-result v1

    iget-object v2, p0, Lo/eie;->aa:Lo/ehh;

    .line 518
    invoke-virtual {v2}, Lo/ehh;->a()F

    move-result v2

    iget-object v3, p0, Lo/eie;->aa:Lo/ehh;

    .line 519
    invoke-virtual {v3}, Lo/ehh;->d()F

    move-result v3

    iget-object v4, p0, Lo/eie;->aa:Lo/ehh;

    .line 520
    invoke-virtual {v4}, Lo/ehh;->e()F

    move-result v4

    .line 516
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/oa;->a(FFFF)V

    .line 522
    invoke-virtual {p0}, Lo/eie;->g()V

    .line 523
    invoke-virtual {p0}, Lo/eie;->i()V

    .line 524
    return-void
.end method

.method protected f(Z)V
    .locals 2

    .line 1561
    iget-object v0, p0, Lo/eie;->S:Lo/nj;

    instance-of v0, v0, Lo/eiu;

    if-nez v0, :cond_0

    .line 1562
    return-void

    .line 1564
    :cond_0
    iget-object v0, p0, Lo/eie;->S:Lo/nj;

    move-object v1, v0

    check-cast v1, Lo/eiu;

    .line 1565
    invoke-interface {v1, p1}, Lo/eiu;->c(Z)V

    .line 1566
    return-void
.end method

.method protected g()V
    .locals 2

    .line 539
    iget-object v0, p0, Lo/eie;->al:Lo/eim;

    iget-object v1, p0, Lo/eie;->af:Lo/eit;

    invoke-virtual {v1}, Lo/eit;->E()Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/eim;->e(Z)V

    .line 540
    iget-object v0, p0, Lo/eie;->aj:Lo/eim;

    iget-object v1, p0, Lo/eie;->ad:Lo/eit;

    invoke-virtual {v1}, Lo/eit;->E()Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/eim;->e(Z)V

    .line 541
    iget-object v0, p0, Lo/eie;->ak:Lo/eim;

    iget-object v1, p0, Lo/eie;->ah:Lo/eit;

    invoke-virtual {v1}, Lo/eit;->E()Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/eim;->e(Z)V

    .line 542
    return-void
.end method

.method public getAxisFirstParty()Lo/eit;
    .locals 1

    .line 335
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    return-object v0
.end method

.method public getAxisSecondParty()Lo/eit;
    .locals 1

    .line 343
    iget-object v0, p0, Lo/eie;->af:Lo/eit;

    return-object v0
.end method

.method public getAxisThirdParty()Lo/eit;
    .locals 1

    .line 351
    iget-object v0, p0, Lo/eie;->ah:Lo/eit;

    return-object v0
.end method

.method public getExtraBottomOffset()F
    .locals 1

    .line 1731
    const/4 v0, 0x0

    return v0
.end method

.method public getExtraLeftOffset()F
    .locals 1

    .line 1738
    const/4 v0, 0x0

    return v0
.end method

.method public getExtraRightOffset()F
    .locals 1

    .line 1724
    const/4 v0, 0x0

    return v0
.end method

.method public getExtraTopOffset()F
    .locals 1

    .line 1717
    const/4 v0, 0x0

    return v0
.end method

.method public getHighestVisibleX()F
    .locals 5

    .line 1195
    invoke-virtual {p0}, Lo/eie;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1196
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eie;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    iget-object v1, p0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->h()F

    move-result v1

    iget-object v2, p0, Lo/eie;->O:Lo/oa;

    .line 1197
    invoke-virtual {v2}, Lo/oa;->i()F

    move-result v2

    iget-object v3, p0, Lo/eie;->B:Lo/nw;

    .line 1196
    invoke-virtual {v0, v1, v2, v3}, Lo/eim;->b(FFLo/nw;)V

    goto :goto_0

    .line 1199
    :cond_0
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eie;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    iget-object v1, p0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->f()F

    move-result v1

    iget-object v2, p0, Lo/eie;->O:Lo/oa;

    .line 1200
    invoke-virtual {v2}, Lo/oa;->i()F

    move-result v2

    iget-object v3, p0, Lo/eie;->B:Lo/nw;

    .line 1199
    invoke-virtual {v0, v1, v2, v3}, Lo/eim;->b(FFLo/nw;)V

    .line 1202
    :goto_0
    iget-object v0, p0, Lo/eie;->H:Lo/ln;

    iget v0, v0, Lo/ln;->u:F

    float-to-double v0, v0

    iget-object v2, p0, Lo/eie;->B:Lo/nw;

    iget-wide v2, v2, Lo/nw;->b:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    double-to-float v4, v0

    .line 1203
    return v4
.end method

.method public getLowestVisibleX()F
    .locals 5

    .line 1167
    invoke-virtual {p0}, Lo/eie;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1168
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eie;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    iget-object v1, p0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->f()F

    move-result v1

    iget-object v2, p0, Lo/eie;->O:Lo/oa;

    .line 1169
    invoke-virtual {v2}, Lo/oa;->i()F

    move-result v2

    iget-object v3, p0, Lo/eie;->v:Lo/nw;

    .line 1168
    invoke-virtual {v0, v1, v2, v3}, Lo/eim;->b(FFLo/nw;)V

    goto :goto_0

    .line 1171
    :cond_0
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eie;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    iget-object v1, p0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->h()F

    move-result v1

    iget-object v2, p0, Lo/eie;->O:Lo/oa;

    .line 1172
    invoke-virtual {v2}, Lo/oa;->i()F

    move-result v2

    iget-object v3, p0, Lo/eie;->v:Lo/nw;

    .line 1171
    invoke-virtual {v0, v1, v2, v3}, Lo/eim;->b(FFLo/nw;)V

    .line 1174
    :goto_0
    iget-object v0, p0, Lo/eie;->H:Lo/ln;

    iget v0, v0, Lo/ln;->q:F

    float-to-double v0, v0

    iget-object v2, p0, Lo/eie;->v:Lo/nw;

    iget-wide v2, v2, Lo/nw;->b:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    double-to-float v4, v0

    .line 1175
    return v4
.end method

.method public getManualReferenceLineValue()I
    .locals 1

    .line 1581
    iget-object v0, p0, Lo/eie;->ae:Lo/eir;

    invoke-virtual {v0}, Lo/eir;->f()I

    move-result v0

    return v0
.end method

.method public getYAxisMinWidth()F
    .locals 1

    .line 534
    iget v0, p0, Lo/eie;->aA:F

    return v0
.end method

.method public getYChartMax()F
    .locals 2

    .line 1435
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    iget v0, v0, Lo/eit;->u:F

    iget-object v1, p0, Lo/eie;->af:Lo/eit;

    iget v1, v1, Lo/eit;->u:F

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0
.end method

.method public getYChartMin()F
    .locals 2

    .line 1440
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    iget v0, v0, Lo/eit;->q:F

    iget-object v1, p0, Lo/eie;->af:Lo/eit;

    iget v1, v1, Lo/eit;->q:F

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    return v0
.end method

.method public h()V
    .locals 4

    .line 357
    iget-object v0, p0, Lo/eie;->A:Lo/ma;

    if-nez v0, :cond_1

    .line 358
    iget-boolean v0, p0, Lo/eie;->j:Z

    if-eqz v0, :cond_0

    .line 359
    const-string v0, "HwHealthBarLineChartBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Preparing... DATA NOT SET."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    :cond_0
    return-void

    .line 362
    :cond_1
    iget-boolean v0, p0, Lo/eie;->j:Z

    if-eqz v0, :cond_2

    .line 363
    const-string v0, "HwHealthBarLineChartBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Preparing..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    :cond_2
    iget-object v0, p0, Lo/eie;->S:Lo/nj;

    if-eqz v0, :cond_3

    .line 367
    iget-object v0, p0, Lo/eie;->S:Lo/nj;

    invoke-virtual {v0}, Lo/nj;->e()V

    .line 369
    :cond_3
    invoke-virtual {p0}, Lo/eie;->d()V

    .line 371
    iget-object v0, p0, Lo/eie;->ae:Lo/eir;

    iget-object v1, p0, Lo/eie;->ad:Lo/eit;

    iget v1, v1, Lo/eit;->q:F

    iget-object v2, p0, Lo/eie;->ad:Lo/eit;

    iget v2, v2, Lo/eit;->u:F

    iget-object v3, p0, Lo/eie;->ad:Lo/eit;

    invoke-virtual {v3}, Lo/eit;->E()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/eir;->d(FFZ)V

    .line 372
    iget-object v0, p0, Lo/eie;->am:Lo/eir;

    iget-object v1, p0, Lo/eie;->af:Lo/eit;

    iget v1, v1, Lo/eit;->q:F

    iget-object v2, p0, Lo/eie;->af:Lo/eit;

    iget v2, v2, Lo/eit;->u:F

    iget-object v3, p0, Lo/eie;->af:Lo/eit;

    invoke-virtual {v3}, Lo/eit;->E()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/eir;->d(FFZ)V

    .line 373
    iget-object v0, p0, Lo/eie;->ai:Lo/eir;

    iget-object v1, p0, Lo/eie;->ah:Lo/eit;

    iget v1, v1, Lo/eit;->q:F

    iget-object v2, p0, Lo/eie;->ah:Lo/eit;

    iget v2, v2, Lo/eit;->u:F

    iget-object v3, p0, Lo/eie;->ah:Lo/eit;

    invoke-virtual {v3}, Lo/eit;->E()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/eir;->d(FFZ)V

    .line 374
    iget-object v0, p0, Lo/eie;->x:Lo/nu;

    iget-object v1, p0, Lo/eie;->H:Lo/ln;

    iget v1, v1, Lo/ln;->q:F

    iget-object v2, p0, Lo/eie;->H:Lo/ln;

    iget v2, v2, Lo/ln;->u:F

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/nu;->d(FFZ)V

    .line 376
    iget-object v0, p0, Lo/eie;->N:Lo/lm;

    if-eqz v0, :cond_4

    .line 377
    iget-object v0, p0, Lo/eie;->J:Lo/np;

    iget-object v1, p0, Lo/eie;->A:Lo/ma;

    invoke-virtual {v0, v1}, Lo/np;->e(Lo/ma;)V

    .line 379
    :cond_4
    invoke-virtual {p0}, Lo/eie;->f()V

    .line 382
    iget-object v0, p0, Lo/eie;->A:Lo/ma;

    check-cast v0, Lo/eik;

    invoke-virtual {v0}, Lo/eik;->b()V

    .line 383
    return-void
.end method

.method protected i()V
    .locals 5

    .line 546
    iget-object v0, p0, Lo/eie;->al:Lo/eim;

    iget-object v1, p0, Lo/eie;->H:Lo/ln;

    iget v1, v1, Lo/ln;->q:F

    iget-object v2, p0, Lo/eie;->H:Lo/ln;

    iget v2, v2, Lo/ln;->w:F

    iget-object v3, p0, Lo/eie;->af:Lo/eit;

    iget v3, v3, Lo/eit;->w:F

    iget-object v4, p0, Lo/eie;->af:Lo/eit;

    iget v4, v4, Lo/eit;->q:F

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/eim;->e(FFFF)V

    .line 550
    iget-object v0, p0, Lo/eie;->aj:Lo/eim;

    iget-object v1, p0, Lo/eie;->H:Lo/ln;

    iget v1, v1, Lo/ln;->q:F

    iget-object v2, p0, Lo/eie;->H:Lo/ln;

    iget v2, v2, Lo/ln;->w:F

    iget-object v3, p0, Lo/eie;->ad:Lo/eit;

    iget v3, v3, Lo/eit;->w:F

    iget-object v4, p0, Lo/eie;->ad:Lo/eit;

    iget v4, v4, Lo/eit;->q:F

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/eim;->e(FFFF)V

    .line 554
    iget-object v0, p0, Lo/eie;->ak:Lo/eim;

    iget-object v1, p0, Lo/eie;->H:Lo/ln;

    iget v1, v1, Lo/ln;->q:F

    iget-object v2, p0, Lo/eie;->H:Lo/ln;

    iget v2, v2, Lo/ln;->w:F

    iget-object v3, p0, Lo/eie;->ah:Lo/eit;

    iget v3, v3, Lo/eit;->w:F

    iget-object v4, p0, Lo/eie;->ah:Lo/eit;

    iget v4, v4, Lo/eit;->q:F

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/eim;->e(FFFF)V

    .line 558
    return-void
.end method

.method protected k()V
    .locals 6

    .line 1213
    invoke-virtual {p0}, Lo/eie;->getLowestVisibleX()F

    move-result v4

    .line 1214
    invoke-virtual {p0}, Lo/eie;->getHighestVisibleX()F

    move-result v5

    .line 1216
    iget-object v0, p0, Lo/eie;->A:Lo/ma;

    check-cast v0, Lo/eik;

    invoke-virtual {v0, v4, v5}, Lo/eik;->b(FF)V

    .line 1218
    iget-object v0, p0, Lo/eie;->H:Lo/ln;

    iget-object v1, p0, Lo/eie;->A:Lo/ma;

    check-cast v1, Lo/eik;

    invoke-virtual {v1}, Lo/eik;->i()F

    move-result v1

    iget-object v2, p0, Lo/eie;->A:Lo/ma;

    check-cast v2, Lo/eik;

    invoke-virtual {v2}, Lo/eik;->f()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/ln;->d(FF)V

    .line 1222
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1223
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    iget-object v1, p0, Lo/eie;->A:Lo/ma;

    check-cast v1, Lo/eik;

    sget-object v2, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {v1, v2}, Lo/eik;->b(Lo/eit$b;)F

    move-result v1

    iget-object v2, p0, Lo/eie;->A:Lo/ma;

    check-cast v2, Lo/eik;

    sget-object v3, Lo/eit$b;->e:Lo/eit$b;

    .line 1224
    invoke-virtual {v2, v3}, Lo/eik;->d(Lo/eit$b;)F

    move-result v2

    .line 1223
    invoke-virtual {v0, v1, v2}, Lo/eit;->d(FF)V

    .line 1226
    :cond_0
    iget-object v0, p0, Lo/eie;->af:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1227
    iget-object v0, p0, Lo/eie;->af:Lo/eit;

    iget-object v1, p0, Lo/eie;->A:Lo/ma;

    check-cast v1, Lo/eik;

    sget-object v2, Lo/eit$b;->b:Lo/eit$b;

    invoke-virtual {v1, v2}, Lo/eik;->b(Lo/eit$b;)F

    move-result v1

    iget-object v2, p0, Lo/eie;->A:Lo/ma;

    check-cast v2, Lo/eik;

    sget-object v3, Lo/eit$b;->b:Lo/eit$b;

    .line 1228
    invoke-virtual {v2, v3}, Lo/eik;->d(Lo/eit$b;)F

    move-result v2

    .line 1227
    invoke-virtual {v0, v1, v2}, Lo/eit;->d(FF)V

    .line 1230
    :cond_1
    iget-object v0, p0, Lo/eie;->ah:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->B()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1231
    iget-object v0, p0, Lo/eie;->ah:Lo/eit;

    iget-object v1, p0, Lo/eie;->A:Lo/ma;

    check-cast v1, Lo/eik;

    sget-object v2, Lo/eit$b;->c:Lo/eit$b;

    invoke-virtual {v1, v2}, Lo/eik;->b(Lo/eit$b;)F

    move-result v1

    iget-object v2, p0, Lo/eie;->A:Lo/ma;

    check-cast v2, Lo/eik;

    sget-object v3, Lo/eit$b;->c:Lo/eit$b;

    .line 1232
    invoke-virtual {v2, v3}, Lo/eik;->d(Lo/eit$b;)F

    move-result v2

    .line 1231
    invoke-virtual {v0, v1, v2}, Lo/eit;->d(FF)V

    .line 1235
    :cond_2
    invoke-virtual {p0}, Lo/eie;->f()V

    .line 1236
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 570
    iput-object p1, p0, Lo/eie;->aB:Landroid/graphics/Canvas;

    .line 572
    iget-object v0, p0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->o()F

    move-result v0

    float-to-int v2, v0

    .line 573
    iget-object v0, p0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->n()F

    move-result v0

    float-to-int v3, v0

    .line 575
    const/4 v4, 0x0

    .line 577
    iget-object v0, p0, Lo/eie;->ay:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 578
    iget-object v0, p0, Lo/eie;->ay:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/graphics/Bitmap;

    .line 581
    :cond_0
    if-eqz v4, :cond_1

    invoke-direct {p0, v4, v2, v3}, Lo/eie;->b(Landroid/graphics/Bitmap;II)Z

    move-result v0

    if-nez v0, :cond_3

    .line 583
    :cond_1
    if-lez v2, :cond_2

    if-lez v3, :cond_2

    .line 584
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 585
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/eie;->ay:Ljava/lang/ref/WeakReference;

    .line 586
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lo/eie;->at:Landroid/graphics/Canvas;

    goto :goto_0

    .line 588
    :cond_2
    return-void

    .line 591
    :cond_3
    :goto_0
    if-nez v4, :cond_4

    .line 592
    return-void

    .line 594
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 596
    iget-object v5, p0, Lo/eie;->at:Landroid/graphics/Canvas;

    .line 599
    invoke-direct {p0, v5}, Lo/eie;->c(Landroid/graphics/Canvas;)V

    .line 603
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 604
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v4, v0, v1, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 605
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 4

    .line 1394
    iget-object v0, p0, Lo/eie;->C:[F

    iget-object v1, p0, Lo/eie;->C:[F

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 1396
    iget-boolean v0, p0, Lo/eie;->m:Z

    if-eqz v0, :cond_0

    .line 1397
    iget-object v0, p0, Lo/eie;->C:[F

    iget-object v1, p0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->f()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 1398
    iget-object v0, p0, Lo/eie;->C:[F

    iget-object v1, p0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->e()F

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 1399
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eie;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    iget-object v1, p0, Lo/eie;->C:[F

    invoke-virtual {v0, v1}, Lo/eim;->d([F)V

    .line 1403
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lo/le;->onSizeChanged(IIII)V

    .line 1405
    iget-boolean v0, p0, Lo/eie;->m:Z

    if-eqz v0, :cond_1

    .line 1408
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eie;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    iget-object v1, p0, Lo/eie;->C:[F

    invoke-virtual {v0, v1}, Lo/eim;->e([F)V

    .line 1409
    iget-object v0, p0, Lo/eie;->O:Lo/oa;

    iget-object v1, p0, Lo/eie;->C:[F

    invoke-virtual {v0, v1, p0}, Lo/oa;->e([FLandroid/view/View;)V

    goto :goto_0

    .line 1411
    :cond_1
    iget-object v0, p0, Lo/eie;->O:Lo/oa;

    iget-object v1, p0, Lo/eie;->O:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Lo/oa;->d(Landroid/graphics/Matrix;Landroid/view/View;Z)Landroid/graphics/Matrix;

    .line 1413
    :goto_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 323
    iget-object v0, p0, Lo/eie;->K:Lo/nd;

    invoke-virtual {v0, p0, p1}, Lo/nd;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public setAxisDataRenderArg(Lo/eit$b;Lo/eid;)V
    .locals 1

    .line 313
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne p1, v0, :cond_0

    .line 314
    iget-object v0, p0, Lo/eie;->ap:Lo/eid;

    invoke-virtual {v0, p2}, Lo/eid;->b(Lo/eid;)V

    goto :goto_0

    .line 315
    :cond_0
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne p1, v0, :cond_1

    .line 316
    iget-object v0, p0, Lo/eie;->aq:Lo/eid;

    invoke-virtual {v0, p2}, Lo/eid;->b(Lo/eid;)V

    goto :goto_0

    .line 318
    :cond_1
    iget-object v0, p0, Lo/eie;->ar:Lo/eid;

    invoke-virtual {v0, p2}, Lo/eid;->b(Lo/eid;)V

    .line 319
    :goto_0
    return-void
.end method

.method public setGridColor(II)V
    .locals 1

    .line 1261
    iget-object v0, p0, Lo/eie;->ad:Lo/eit;

    invoke-virtual {v0, p1, p2}, Lo/eit;->e(II)V

    .line 1262
    return-void
.end method

.method public setOnMarkViewTextNotify(Lo/elc$c;)V
    .locals 1

    .line 1444
    iget-object v0, p0, Lo/eie;->T:Lo/lk;

    check-cast v0, Lo/elc;

    invoke-virtual {v0, p1}, Lo/elc;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 1445
    return-void
.end method

.method public setYAxisMinWidth(F)V
    .locals 1

    .line 530
    invoke-static {p1}, Lo/oc;->b(F)F

    move-result v0

    iput v0, p0, Lo/eie;->aA:F

    .line 531
    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 1647
    invoke-super {p0, p1}, Lo/le;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/eie;->as:Landroid/graphics/drawable/AnimationDrawable;

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public z()Z
    .locals 1

    .line 1586
    iget-boolean v0, p0, Lo/eie;->aD:Z

    if-nez v0, :cond_0

    .line 1587
    const/4 v0, 0x0

    return v0

    .line 1589
    :cond_0
    invoke-super {p0}, Lo/le;->z()Z

    move-result v0

    return v0
.end method
