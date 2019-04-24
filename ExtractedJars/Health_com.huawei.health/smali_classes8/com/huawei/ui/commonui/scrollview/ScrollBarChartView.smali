.class public Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "DrawAllocation"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;,
        Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;,
        Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:F

.field private C:F

.field private D:I

.field private E:D

.field private F:F

.field private G:Z

.field private H:D

.field private I:I

.field private J:D

.field private K:D

.field private L:I

.field private M:Landroid/graphics/Paint;

.field private N:I

.field private O:Landroid/text/TextPaint;

.field private P:Landroid/graphics/Paint;

.field private Q:Landroid/graphics/Paint;

.field private R:Landroid/text/TextPaint;

.field private S:Landroid/text/TextPaint;

.field private T:Landroid/graphics/Paint;

.field private U:Z

.field private V:Z

.field private W:Z

.field private a:F

.field private final aA:Landroid/view/GestureDetector$SimpleOnGestureListener;

.field private aa:Landroid/graphics/PointF;

.field private ab:D

.field private ac:I

.field private ad:I

.field private ae:F

.field private af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

.field private ag:Z

.field private ah:F

.field private ai:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

.field private aj:Landroid/support/v4/view/GestureDetectorCompat;

.field private ak:I

.field private al:Landroid/widget/OverScroller;

.field private am:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

.field private an:I

.field private ao:Z

.field private ap:I

.field private aq:Z

.field private ar:I

.field private as:Z

.field private at:F

.field private au:F

.field private av:Ljava/lang/String;

.field private aw:I

.field private b:Landroid/content/Context;

.field private c:F

.field private d:F

.field private e:F

.field private f:F

.field private g:I

.field private h:I

.field private i:F

.field private j:I

.field private k:I

.field private l:F

.field private m:Landroid/graphics/Paint;

.field private n:D

.field private o:F

.field private p:I

.field private q:Ljava/lang/String;

.field private r:Z

.field private s:F

.field private t:D

.field private u:D

.field private v:F

.field private w:Landroid/graphics/Paint;

.field private x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/graphics/RectF;>;"
        }
    .end annotation
.end field

.field private y:Landroid/graphics/Paint;

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 153
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 73
    const-string v0, "#0ac700"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->k:I

    .line 74
    const-string v0, "#0ac700"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h:I

    .line 75
    const/high16 v0, 0x1a000000

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->g:I

    .line 77
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    .line 79
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->o:F

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->l:F

    .line 83
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->p:I

    .line 85
    const-wide/high16 v0, 0x4069000000000000L    # 200.0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    .line 88
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->q:Ljava/lang/String;

    .line 89
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->r:Z

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->x:Ljava/util/ArrayList;

    .line 96
    const/4 v0, 0x7

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    .line 99
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    .line 100
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    .line 101
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    .line 105
    const/16 v0, 0x17c

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    .line 106
    const/16 v0, 0x46

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    .line 118
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->W:Z

    .line 119
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ac:I

    .line 124
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    .line 129
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->am:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 130
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ai:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 134
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ar:I

    .line 135
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->an:I

    .line 136
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aw:I

    .line 140
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->as:Z

    .line 142
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->at:F

    .line 144
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->au:F

    .line 850
    new-instance v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;-><init>(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aA:Landroid/view/GestureDetector$SimpleOnGestureListener;

    .line 154
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b:Landroid/content/Context;

    .line 155
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->k()V

    .line 156
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 147
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 73
    const-string v0, "#0ac700"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->k:I

    .line 74
    const-string v0, "#0ac700"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h:I

    .line 75
    const/high16 v0, 0x1a000000

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->g:I

    .line 77
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    .line 79
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->o:F

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->l:F

    .line 83
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->p:I

    .line 85
    const-wide/high16 v0, 0x4069000000000000L    # 200.0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    .line 88
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->q:Ljava/lang/String;

    .line 89
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->r:Z

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->x:Ljava/util/ArrayList;

    .line 96
    const/4 v0, 0x7

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    .line 99
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    .line 100
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    .line 101
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    .line 105
    const/16 v0, 0x17c

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    .line 106
    const/16 v0, 0x46

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    .line 118
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->W:Z

    .line 119
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ac:I

    .line 124
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    .line 129
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->am:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 130
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ai:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 134
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ar:I

    .line 135
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->an:I

    .line 136
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aw:I

    .line 140
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->as:Z

    .line 142
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->at:F

    .line 144
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->au:F

    .line 850
    new-instance v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;-><init>(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aA:Landroid/view/GestureDetector$SimpleOnGestureListener;

    .line 148
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b:Landroid/content/Context;

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->k()V

    .line 150
    return-void
.end method

.method private a()D
    .locals 2

    .line 551
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 554
    :pswitch_0
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    return-wide v0

    .line 558
    :goto_0
    :pswitch_1
    const-wide/high16 v0, 0x4069000000000000L    # 200.0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private a(DD)D
    .locals 4

    .line 1435
    const-wide/16 v0, 0x0

    cmpg-double v0, p3, v0

    if-gtz v0, :cond_0

    .line 1436
    const-wide v0, 0x3fe9c18fa0000000L    # 0.8048780560493469

    div-double v2, p1, v0

    goto :goto_0

    .line 1437
    :cond_0
    const-wide v0, 0x3fe9c18fa0000000L    # 0.8048780560493469

    mul-double/2addr v0, p3

    cmpg-double v0, p1, v0

    if-gtz v0, :cond_1

    .line 1438
    move-wide v2, p3

    goto :goto_0

    .line 1439
    :cond_1
    const-wide v0, 0x3ff9c18fa0000000L    # 1.6097561120986938

    mul-double/2addr v0, p3

    cmpg-double v0, p1, v0

    if-gtz v0, :cond_2

    .line 1440
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    mul-double v2, v0, p3

    goto :goto_0

    .line 1442
    :cond_2
    const-wide v0, 0x3fe9c18fa0000000L    # 0.8048780560493469

    div-double v2, p1, v0

    .line 1444
    :goto_0
    return-wide v2
.end method

.method private a(D)F
    .locals 4

    .line 314
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->s:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    mul-double/2addr v0, p1

    iget-wide v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    div-double/2addr v0, v2

    double-to-float v0, v0

    return v0
.end method

.method private static a(IF)F
    .locals 2

    .line 1415
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    .line 1416
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {p0, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;I)I
    .locals 0

    .line 41
    iput p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)I
    .locals 1

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)I

    move-result v0

    return v0
.end method

.method private a(I)V
    .locals 2

    .line 1103
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->H:D

    .line 1104
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->E:D

    .line 1105
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(I)V

    .line 1106
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->U:Z

    .line 1108
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 16

    .line 322
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(D)F

    move-result v6

    .line 323
    move-object/from16 v0, p1

    move v2, v6

    move-object/from16 v1, p0

    iget v3, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a:F

    move v4, v6

    move-object/from16 v1, p0

    iget-object v5, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->M:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 325
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->r:Z

    if-eqz v0, :cond_2

    .line 326
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    if-eqz v0, :cond_2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 328
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ar:I

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 329
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->O:Landroid/text/TextPaint;

    invoke-static {v0, v7}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v8

    .line 330
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->O:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->ascent()F

    move-result v9

    .line 331
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a:F

    sub-float v10, v0, v8

    .line 332
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ao:Z

    if-eqz v0, :cond_0

    .line 333
    const/4 v10, 0x0

    .line 335
    :cond_0
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(D)F

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->v:F

    add-float/2addr v0, v1

    sub-float/2addr v0, v9

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->O:Landroid/text/TextPaint;

    move-object/from16 v2, p1

    invoke-virtual {v2, v7, v10, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 336
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    .line 337
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ar:I

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v11

    .line 338
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->O:Landroid/text/TextPaint;

    invoke-static {v0, v11}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v12

    .line 339
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a:F

    sub-float v13, v0, v12

    .line 340
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ao:Z

    if-eqz v0, :cond_1

    .line 341
    const/4 v13, 0x0

    .line 343
    :cond_1
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(D)F

    move-result v14

    .line 344
    new-instance v15, Landroid/graphics/Path;

    invoke-direct {v15}, Landroid/graphics/Path;-><init>()V

    .line 345
    const/4 v0, 0x0

    invoke-virtual {v15, v0, v14}, Landroid/graphics/Path;->moveTo(FF)V

    .line 346
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a:F

    invoke-virtual {v15, v0, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 347
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->P:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v15, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 348
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->v:F

    add-float/2addr v0, v14

    sub-float/2addr v0, v9

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->O:Landroid/text/TextPaint;

    move-object/from16 v2, p1

    invoke-virtual {v2, v11, v13, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 352
    :cond_2
    return-void
.end method

.method private a(Landroid/graphics/Canvas;FLjava/lang/String;Ljava/lang/String;Z)V
    .locals 10

    .line 726
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ah:F

    add-float/2addr v0, v1

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ae:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float v3, v0, v1

    .line 727
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 728
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ae:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->Q:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v3, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 729
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->R:Landroid/text/TextPaint;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, p3, v2, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v4, v0

    .line 730
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v4, v0

    sub-float v5, p2, v0

    .line 731
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->W:Z

    if-eqz v0, :cond_1

    .line 732
    const/4 v0, 0x0

    cmpg-float v0, v5, v0

    if-gez v0, :cond_0

    .line 733
    const/4 v5, 0x0

    .line 736
    :cond_0
    add-float v0, v5, v4

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 737
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a:F

    sub-float v5, v0, v4

    .line 741
    :cond_1
    const/4 v0, 0x1

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(IF)F

    move-result v0

    add-float v6, v3, v0

    .line 742
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->R:Landroid/text/TextPaint;

    invoke-virtual {p1, p3, v5, v6, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 743
    if-eqz p5, :cond_2

    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->as:Z

    if-nez v0, :cond_2

    .line 744
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->as:Z

    .line 745
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->R:Landroid/text/TextPaint;

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, p4, v2, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v7, v0

    .line 746
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v7, v0

    sub-float v8, p2, v0

    .line 747
    iput v8, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->at:F

    .line 748
    iput v7, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->au:F

    .line 749
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->R:Landroid/text/TextPaint;

    invoke-virtual {v1}, Landroid/text/TextPaint;->descent()F

    move-result v1

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v9, v0

    .line 750
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->R:Landroid/text/TextPaint;

    invoke-virtual {p1, p4, v8, v9, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 753
    :cond_2
    goto :goto_0

    .line 754
    :cond_3
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ae:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->T:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v3, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 757
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Landroid/view/MotionEvent;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Landroid/view/MotionEvent;)V

    return-void
.end method

.method private a(FFLandroid/graphics/RectF;)Z
    .locals 1

    .line 455
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

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Z)Z
    .locals 0

    .line 41
    iput-boolean p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ag:Z

    return p1
.end method

.method private static b(Landroid/graphics/Paint;)F
    .locals 3

    .line 1427
    invoke-virtual {p0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v2

    .line 1428
    iget v0, v2, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v1, v2, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;F)F
    .locals 0

    .line 41
    iput p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    return p1
.end method

.method private b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)I
    .locals 5

    .line 1312
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$2;->d:[I

    invoke-virtual {p1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 1314
    :sswitch_0
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    if-gez v0, :cond_1

    .line 1315
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->G:Z

    .line 1316
    const/4 v2, 0x0

    .line 1317
    return v2

    .line 1319
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    .line 1320
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget v0, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->flag:I

    if-eqz v0, :cond_2

    .line 1321
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    iget v1, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->flag_next:I

    sub-int/2addr v0, v1

    iget v1, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->left_skip:I

    sub-int v2, v0, v1

    .line 1322
    if-gez v2, :cond_3

    .line 1323
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->G:Z

    .line 1324
    const/4 v2, 0x0

    goto :goto_0

    .line 1327
    :cond_2
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    sub-int/2addr v0, v1

    iget v1, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->left_skip:I

    sub-int v2, v0, v1

    .line 1328
    if-gez v2, :cond_3

    .line 1329
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->G:Z

    .line 1330
    const/4 v2, 0x0

    .line 1333
    :cond_3
    :goto_0
    return v2

    .line 1335
    :sswitch_1
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    if-gez v0, :cond_5

    .line 1336
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->G:Z

    .line 1337
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    sub-int v2, v0, v1

    .line 1338
    return v2

    .line 1340
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    .line 1341
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    iget v0, v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->flag:I

    if-eqz v0, :cond_6

    .line 1342
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    iget v1, v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->flag:I

    add-int/2addr v0, v1

    iget v1, v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->right_skip:I

    add-int v2, v0, v1

    .line 1343
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    sub-int/2addr v0, v1

    if-le v2, v0, :cond_7

    .line 1344
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->G:Z

    .line 1345
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    sub-int v2, v0, v1

    goto :goto_1

    .line 1348
    :cond_6
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    add-int/2addr v0, v1

    iget v1, v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->right_skip:I

    add-int v2, v0, v1

    .line 1349
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    sub-int/2addr v0, v1

    if-le v2, v0, :cond_7

    .line 1350
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->G:Z

    .line 1351
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    sub-int v2, v0, v1

    .line 1354
    :cond_7
    :goto_1
    return v2

    .line 1356
    :goto_2
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;I)I
    .locals 0

    .line 41
    iput p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ai:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    return-object p1
.end method

.method private b(I)V
    .locals 11

    .line 1111
    const-wide/16 v4, 0x0

    .line 1112
    const-wide/16 v6, 0x0

    .line 1113
    const/4 v8, 0x0

    .line 1114
    move v9, p1

    :goto_0
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    add-int/2addr v0, p1

    if-ge v9, v0, :cond_3

    .line 1115
    if-ltz v9, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v9, v0, :cond_0

    .line 1116
    goto :goto_1

    .line 1118
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-wide v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(D)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1119
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-wide v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    add-double/2addr v6, v0

    .line 1120
    add-int/lit8 v8, v8, 0x1

    .line 1122
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-wide v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    cmpg-double v0, v4, v0

    if-gez v0, :cond_2

    .line 1123
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-wide v4, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 1114
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 1127
    :cond_3
    :goto_1
    const-wide/16 v0, 0x0

    cmpl-double v0, v4, v0

    if-lez v0, :cond_5

    .line 1128
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aw:I

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    .line 1130
    :pswitch_0
    const-wide v0, 0x3fe9c18fa0000000L    # 0.8048780560493469

    div-double v0, v4, v0

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(D)D

    move-result-wide v4

    .line 1131
    int-to-double v0, v8

    div-double v9, v6, v0

    .line 1132
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->H:D

    sub-double v0, v4, v0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->J:D

    .line 1133
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->E:D

    sub-double v0, v9, v0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->K:D

    .line 1134
    goto :goto_3

    .line 1136
    :pswitch_1
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->u:D

    invoke-direct {p0, v4, v5, v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(DD)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(D)D

    move-result-wide v4

    .line 1137
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->H:D

    sub-double v0, v4, v0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->J:D

    .line 1138
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->K:D

    .line 1139
    goto :goto_3

    .line 1142
    :goto_2
    :pswitch_2
    const-wide v0, 0x3fe9c18fa0000000L    # 0.8048780560493469

    div-double v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    .line 1143
    double-to-int v0, v4

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_4

    .line 1144
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr v4, v0

    .line 1146
    :cond_4
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->H:D

    sub-double v0, v4, v0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->J:D

    .line 1147
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double v0, v4, v0

    iget-wide v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->E:D

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->K:D

    .line 1148
    goto :goto_3

    .line 1151
    :cond_5
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->J:D

    .line 1152
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->K:D

    .line 1153
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->V:Z

    .line 1155
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 6

    .line 358
    move-object v0, p1

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c:F

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a:F

    iget v4, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c:F

    iget-object v5, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->M:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 359
    return-void
.end method

.method private b(D)Z
    .locals 4

    .line 1162
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Z)Z
    .locals 0

    .line 41
    iput-boolean p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->W:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;D)D
    .locals 0

    .line 41
    iput-wide p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->E:D

    return-wide p1
.end method

.method static synthetic c(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;I)I
    .locals 0

    .line 41
    iput p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ac:I

    return p1
.end method

.method private c()V
    .locals 5

    .line 539
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget v2, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->flag:I

    .line 540
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    if-lez v2, :cond_1

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    if-ge v2, v0, :cond_1

    .line 541
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 542
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    .line 543
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 542
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 545
    :cond_0
    iput-object v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    .line 546
    iput v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    .line 548
    :cond_1
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 25

    .line 365
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aa:Landroid/graphics/PointF;

    if-nez v0, :cond_0

    .line 366
    return-void

    .line 368
    :cond_0
    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6}, Landroid/graphics/RectF;-><init>()V

    .line 374
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-wide v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ab:D

    move-object/from16 v3, p0

    iget v3, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->an:I

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 375
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aa:Landroid/graphics/PointF;

    iget v8, v0, Landroid/graphics/PointF;->x:F

    .line 376
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aa:Landroid/graphics/PointF;

    iget v9, v0, Landroid/graphics/PointF;->y:F

    .line 378
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m:Landroid/graphics/Paint;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Landroid/graphics/Paint;)F

    move-result v10

    .line 379
    const/high16 v18, 0x41700000    # 15.0f

    .line 380
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m:Landroid/graphics/Paint;

    invoke-static {v0, v7}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x41f00000    # 30.0f

    add-float v19, v0, v1

    .line 381
    const/high16 v20, 0x40a00000    # 5.0f

    .line 382
    const/high16 v0, 0x41200000    # 10.0f

    add-float v21, v10, v0

    .line 383
    const/high16 v0, 0x40000000    # 2.0f

    div-float v11, v19, v0

    .line 385
    const/4 v0, 0x1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(IF)F

    move-result v12

    .line 386
    sub-float v0, v8, v11

    iput v0, v6, Landroid/graphics/RectF;->left:F

    .line 387
    add-float v0, v8, v11

    iput v0, v6, Landroid/graphics/RectF;->right:F

    .line 388
    sub-float v0, v9, v21

    sub-float/2addr v0, v12

    iput v0, v6, Landroid/graphics/RectF;->top:F

    .line 389
    iput v9, v6, Landroid/graphics/RectF;->bottom:F

    .line 391
    iget v0, v6, Landroid/graphics/RectF;->top:F

    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float/2addr v1, v12

    sub-float/2addr v0, v1

    iput v0, v6, Landroid/graphics/RectF;->top:F

    .line 392
    iget v0, v6, Landroid/graphics/RectF;->bottom:F

    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float/2addr v1, v12

    sub-float/2addr v0, v1

    iput v0, v6, Landroid/graphics/RectF;->bottom:F

    .line 393
    iget v0, v6, Landroid/graphics/RectF;->left:F

    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    add-float v13, v0, v1

    .line 394
    iget v14, v6, Landroid/graphics/RectF;->bottom:F

    .line 395
    new-instance v22, Landroid/graphics/Path;

    invoke-direct/range {v22 .. v22}, Landroid/graphics/Path;-><init>()V

    .line 396
    add-float v0, v13, v12

    move-object/from16 v1, v22

    invoke-virtual {v1, v0, v14}, Landroid/graphics/Path;->moveTo(FF)V

    .line 397
    const/high16 v0, 0x3fc00000    # 1.5f

    mul-float/2addr v0, v12

    add-float/2addr v0, v14

    move-object/from16 v1, v22

    invoke-virtual {v1, v13, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 398
    sub-float v0, v13, v12

    move-object/from16 v1, v22

    invoke-virtual {v1, v0, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 399
    invoke-virtual/range {v22 .. v22}, Landroid/graphics/Path;->close()V

    .line 402
    iget v0, v6, Landroid/graphics/RectF;->right:F

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 403
    iget v0, v6, Landroid/graphics/RectF;->left:F

    iget v1, v6, Landroid/graphics/RectF;->right:F

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a:F

    sub-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, v6, Landroid/graphics/RectF;->left:F

    .line 404
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a:F

    iput v0, v6, Landroid/graphics/RectF;->right:F

    .line 407
    :cond_1
    iget v0, v6, Landroid/graphics/RectF;->left:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 408
    iget v0, v6, Landroid/graphics/RectF;->right:F

    iget v1, v6, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    iput v0, v6, Landroid/graphics/RectF;->right:F

    .line 409
    const/4 v0, 0x0

    iput v0, v6, Landroid/graphics/RectF;->left:F

    .line 412
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->p:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 413
    const/high16 v23, 0x42480000    # 50.0f

    .line 414
    const/high16 v24, 0x42480000    # 50.0f

    .line 415
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move/from16 v2, v24

    move/from16 v3, v23

    invoke-virtual {v1, v6, v2, v3, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 416
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object/from16 v2, v22

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 417
    invoke-virtual/range {v22 .. v22}, Landroid/graphics/Path;->reset()V

    .line 418
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 419
    move-object/from16 v0, p1

    sub-float v1, v13, v12

    move v2, v14

    add-float v3, v13, v12

    move v4, v14

    move-object/from16 v5, p0

    iget-object v5, v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 421
    iget v0, v6, Landroid/graphics/RectF;->left:F

    add-float v15, v0, v18

    .line 422
    iget v0, v6, Landroid/graphics/RectF;->top:F

    add-float v16, v0, v20

    .line 423
    move/from16 v17, v15

    .line 424
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 425
    add-float v0, v16, v10

    const/high16 v1, 0x40000000    # 2.0f

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    move/from16 v3, v17

    invoke-virtual {v2, v7, v3, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 427
    return-void
.end method

.method private c(Landroid/graphics/Canvas;IF)V
    .locals 10

    .line 691
    if-lez p2, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-direct {p0, p3}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(F)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 692
    :cond_0
    return-void

    .line 695
    :cond_1
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_7

    .line 696
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-boolean v4, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->isShowSubLable:Z

    .line 698
    if-eqz v4, :cond_3

    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->W:Z

    if-eqz v0, :cond_3

    .line 699
    return-void

    .line 701
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-object v5, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->subLable:Ljava/lang/String;

    .line 704
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    add-float/2addr v0, p3

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x40400000    # 3.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 705
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    add-int/lit8 v1, p2, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-object v5, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->subLable:Ljava/lang/String;

    .line 707
    :cond_4
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float v6, v0, v1

    .line 709
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 710
    return-void

    .line 712
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->R:Landroid/text/TextPaint;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v2, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v7, v0

    .line 713
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v7, v0

    sub-float v8, v6, v0

    .line 715
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    add-float/2addr v0, v6

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->at:F

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->au:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    .line 716
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->at:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->au:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v7, v1

    sub-float v8, v0, v1

    .line 719
    :cond_6
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->R:Landroid/text/TextPaint;

    invoke-virtual {v1}, Landroid/text/TextPaint;->descent()F

    move-result v1

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v9, v0

    .line 720
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->R:Landroid/text/TextPaint;

    invoke-virtual {p1, v5, v8, v9, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 723
    :cond_7
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Z)Z
    .locals 0

    .line 41
    iput-boolean p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->r:Z

    return p1
.end method

.method private static d(D)D
    .locals 10

    .line 1450
    move-wide v4, p0

    .line 1452
    double-to-int v0, p0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    .line 1454
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 1456
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 1457
    const-string v0, "1"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1458
    const/4 v9, 0x0

    :goto_0
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    if-ge v9, v0, :cond_0

    .line 1459
    const-string v0, "0"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1458
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 1462
    :cond_0
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 1464
    int-to-double v0, v7

    cmpl-double v0, p0, v0

    if-lez v0, :cond_1

    int-to-double v0, v7

    rem-double v0, p0, v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    .line 1465
    int-to-double v0, v7

    div-double v0, p0, v0

    double-to-int v0, v0

    add-int/lit8 v9, v0, 0x1

    .line 1466
    mul-int v0, v9, v7

    int-to-double v4, v0

    .line 1468
    :cond_1
    goto :goto_1

    .line 1469
    :cond_2
    const-wide/16 v0, 0x0

    cmpl-double v0, p0, v0

    if-eqz v0, :cond_4

    .line 1470
    double-to-int v0, p0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 1471
    const/4 v0, 0x2

    invoke-static {p0, p1, v0}, Lo/dbf;->b(DI)D

    move-result-wide v4

    goto :goto_1

    .line 1473
    :cond_3
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lo/dbf;->b(DI)D

    move-result-wide v4

    .line 1478
    :cond_4
    :goto_1
    return-wide v4
.end method

.method private static d(Landroid/graphics/Paint;Ljava/lang/String;)F
    .locals 2

    .line 1420
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 1421
    const/4 v0, 0x0

    return v0

    .line 1423
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->am:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    return-object p1
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 12

    .line 760
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->av:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 761
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 762
    iget-object v8, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->av:Ljava/lang/String;

    .line 763
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->S:Landroid/text/TextPaint;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v8, v2, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;II)F

    move-result v9

    .line 764
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    cmpl-float v0, v9, v0

    if-lez v0, :cond_0

    sget-object v10, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_0
    sget-object v10, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 765
    :goto_0
    new-instance v0, Landroid/text/StaticLayout;

    move-object v1, v8

    iget-object v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->S:Landroid/text/TextPaint;

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    move-object v4, v10

    const/high16 v5, 0x3fc00000    # 1.5f

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    move-object v11, v0

    .line 766
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->s:F

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c:F

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->s:F

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {v11}, Landroid/text/StaticLayout;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 767
    invoke-virtual {v11, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    .line 768
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 770
    :cond_1
    return-void
.end method

.method private d(Landroid/view/MotionEvent;)V
    .locals 5

    .line 436
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 437
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 438
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 439
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/graphics/RectF;

    .line 441
    invoke-direct {p0, v2, v3, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(FFLandroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 442
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ac:I

    if-ne v4, v0, :cond_0

    .line 443
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ac:I

    goto :goto_1

    .line 445
    :cond_0
    iput v4, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ac:I

    .line 447
    goto :goto_1

    .line 438
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 451
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->invalidate()V

    .line 452
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->G:Z

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;D)D
    .locals 0

    .line 41
    iput-wide p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->H:D

    return-wide p1
.end method

.method private e(D)F
    .locals 3

    .line 310
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(D)F

    move-result v1

    sub-float/2addr v0, v1

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Landroid/widget/OverScroller;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    return-object v0
.end method

.method private e()V
    .locals 7

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 240
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ao:Z

    if-eqz v0, :cond_1

    .line 241
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    add-int/lit8 v5, v0, -0x1

    :goto_0
    if-ltz v5, :cond_0

    .line 242
    new-instance v6, Landroid/graphics/RectF;

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    add-float/2addr v0, v1

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    add-int/lit8 v2, v5, 0x1

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->s:F

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    add-float/2addr v2, v3

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    int-to-float v4, v5

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d:F

    iget v4, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->l:F

    sub-float/2addr v3, v4

    invoke-direct {v6, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    :cond_0
    goto :goto_2

    .line 246
    :cond_1
    const/4 v5, 0x0

    :goto_1
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    if-ge v5, v0, :cond_2

    .line 247
    new-instance v6, Landroid/graphics/RectF;

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    add-float/2addr v0, v1

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    add-int/lit8 v2, v5, 0x1

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->s:F

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    add-float/2addr v2, v3

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    int-to-float v4, v5

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d:F

    iget v4, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->l:F

    sub-float/2addr v3, v4

    invoke-direct {v6, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 252
    :cond_2
    :goto_2
    return-void
.end method

.method private e(I)V
    .locals 8

    .line 1031
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->W:Z

    .line 1033
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->am:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 1034
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ai:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 1036
    if-nez p1, :cond_6

    .line 1037
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->G:Z

    .line 1040
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/OverScroller;->forceFinished(Z)V

    .line 1041
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 1042
    const/4 v6, 0x0

    .line 1043
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    neg-float v7, v0

    .line 1044
    iput v6, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    .line 1045
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(I)V

    .line 1046
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v4, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int/2addr v4, v2

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v5, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int/2addr v5, v2

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    goto/16 :goto_0

    .line 1047
    :cond_0
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    mul-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 1048
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    sub-int v6, v0, v1

    .line 1049
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    sub-float v7, v0, v1

    .line 1050
    iput v6, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    .line 1051
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(I)V

    .line 1052
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v4, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int/2addr v4, v2

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v5, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int/2addr v5, v2

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    goto/16 :goto_0

    .line 1054
    :cond_1
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    div-float/2addr v0, v1

    float-to-int v6, v0

    .line 1055
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    int-to-float v2, v6

    mul-float/2addr v1, v2

    sub-float v7, v0, v1

    .line 1056
    invoke-direct {p0, v7}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(F)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1057
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    cmpg-float v0, v7, v0

    if-gez v0, :cond_2

    .line 1058
    iput v6, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    .line 1059
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(I)V

    .line 1060
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    neg-float v2, v7

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v4, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int/2addr v4, v2

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v5, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int/2addr v5, v2

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    goto :goto_0

    .line 1062
    :cond_2
    add-int/lit8 v0, v6, 0x1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    .line 1063
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(I)V

    .line 1064
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    sub-float/2addr v2, v7

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v4, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int/2addr v4, v2

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v5, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int/2addr v5, v2

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    goto :goto_0

    .line 1067
    :cond_3
    iput v6, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    .line 1068
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(I)V

    .line 1069
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int v4, v2, v3

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int v5, v2, v3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 1072
    :goto_0
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    .line 1073
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1074
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ag:Z

    if-nez v0, :cond_4

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    mul-int/lit8 v2, v2, 0x5

    sub-int/2addr v1, v2

    if-le v0, v1, :cond_4

    .line 1075
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ag:Z

    .line 1076
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    invoke-interface {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;->d()V

    .line 1078
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    if-eqz v0, :cond_5

    .line 1079
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    invoke-interface {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;->d(I)V

    .line 1081
    :cond_5
    goto/16 :goto_3

    :cond_6
    const/4 v0, 0x1

    if-ne p1, v0, :cond_8

    .line 1082
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->G:Z

    .line 1083
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/OverScroller;->forceFinished(Z)V

    .line 1084
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    .line 1085
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(I)V

    .line 1086
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int v4, v2, v3

    iget-wide v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->J:D

    invoke-direct {p0, v2, v3}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(D)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-wide v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->K:D

    invoke-direct {p0, v2, v3}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(D)Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v5, 0x0

    goto :goto_1

    :cond_7
    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int v5, v2, v3

    :goto_1
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 1087
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1088
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    if-eqz v0, :cond_a

    .line 1089
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    invoke-interface {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;->d(I)V

    goto :goto_3

    .line 1092
    :cond_8
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->G:Z

    .line 1093
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/OverScroller;->forceFinished(Z)V

    .line 1094
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    .line 1095
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(I)V

    .line 1096
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int v4, v2, v3

    iget-wide v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->J:D

    invoke-direct {p0, v2, v3}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(D)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-wide v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->K:D

    invoke-direct {p0, v2, v3}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(D)Z

    move-result v2

    if-eqz v2, :cond_9

    const/4 v5, 0x0

    goto :goto_2

    :cond_9
    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    add-int v5, v2, v3

    :goto_2
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 1097
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1100
    :cond_a
    :goto_3
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 21

    .line 567
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aa:Landroid/graphics/PointF;

    .line 568
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->as:Z

    .line 569
    const/4 v8, -0x1

    .line 570
    const/4 v9, 0x0

    .line 573
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->r:Z

    if-eqz v0, :cond_10

    .line 574
    const/16 v0, 0x8

    new-array v13, v0, [F

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x0

    aput v0, v13, v1

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v13, v1

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x2

    aput v0, v13, v1

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x3

    aput v0, v13, v1

    const/4 v0, 0x0

    const/4 v1, 0x4

    aput v0, v13, v1

    const/4 v0, 0x0

    const/4 v1, 0x5

    aput v0, v13, v1

    const/4 v0, 0x0

    const/4 v1, 0x6

    aput v0, v13, v1

    const/4 v0, 0x0

    const/4 v1, 0x7

    aput v0, v13, v1

    .line 575
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->B:F

    neg-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 576
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->B:F

    neg-float v0, v0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    goto :goto_0

    .line 577
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    mul-float/2addr v1, v2

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->B:F

    add-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 578
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->B:F

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    .line 580
    :cond_1
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 583
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->W:Z

    if-eqz v0, :cond_a

    .line 584
    const/16 v16, 0x1

    .line 585
    const/16 v17, 0x0

    .line 586
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    move/from16 v18, v0

    :goto_1
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    add-int/2addr v0, v1

    move/from16 v1, v18

    if-ge v1, v0, :cond_9

    .line 587
    if-ltz v18, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v18

    if-lt v1, v0, :cond_2

    .line 588
    goto/16 :goto_5

    .line 590
    :cond_2
    if-eqz v16, :cond_3

    .line 591
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    move/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget v1, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->flag:I

    move/from16 v17, v1

    .line 592
    const/16 v16, 0x0

    .line 594
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    move/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-wide v11, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 595
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ao:Z

    if-eqz v0, :cond_4

    .line 596
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    sub-int v2, v18, v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v9, v0, v1

    goto :goto_2

    .line 598
    :cond_4
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    sub-int v2, v18, v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v9, v0, v1

    .line 600
    :goto_2
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v9

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    move/from16 v4, v18

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-object v3, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    move/from16 v5, v18

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-object v4, v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->subLable:Ljava/lang/String;

    move-object/from16 v5, p0

    iget-object v5, v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    move/from16 v6, v18

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-boolean v5, v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->isShowSubLable:Z

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Landroid/graphics/Canvas;FLjava/lang/String;Ljava/lang/String;Z)V

    .line 601
    move/from16 v8, v18

    .line 602
    const-wide/16 v0, 0x0

    cmpg-double v0, v11, v0

    if-gtz v0, :cond_5

    .line 603
    goto/16 :goto_5

    .line 605
    :cond_5
    new-instance v14, Landroid/graphics/Path;

    invoke-direct {v14}, Landroid/graphics/Path;-><init>()V

    .line 606
    move-object/from16 v0, p0

    invoke-direct {v0, v11, v12}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(D)F

    move-result v10

    .line 607
    if-eqz v17, :cond_6

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    sub-int v0, v18, v0

    move/from16 v1, v17

    if-lt v0, v1, :cond_6

    const/16 v19, 0x1

    goto :goto_3

    :cond_6
    const/16 v19, 0x0

    .line 609
    :goto_3
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v9, v1

    move v2, v10

    move-object/from16 v3, p0

    iget v3, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v3, v9

    move-object/from16 v4, p0

    iget v4, v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d:F

    move-object/from16 v5, p0

    iget v5, v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->l:F

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object v15, v0

    .line 610
    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v14, v15, v13, v0}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 611
    if-eqz v19, :cond_7

    .line 612
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->w:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v14, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_4

    .line 614
    :cond_7
    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, v15, Landroid/graphics/RectF;->right:F

    iget v2, v15, Landroid/graphics/RectF;->bottom:F

    iget v3, v15, Landroid/graphics/RectF;->right:F

    iget v4, v15, Landroid/graphics/RectF;->top:F

    move-object/from16 v5, p0

    iget v5, v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->k:I

    move-object/from16 v6, p0

    iget v6, v6, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object/from16 v20, v0

    .line 617
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->y:Landroid/graphics/Paint;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 618
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->y:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v14, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 621
    :goto_4
    if-nez v19, :cond_8

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ac:I

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    sub-int v1, v18, v1

    if-ne v0, v1, :cond_8

    .line 622
    move-object/from16 v0, p0

    iput-wide v11, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ab:D

    .line 623
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, v9, v10}, Landroid/graphics/PointF;-><init>(FF)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aa:Landroid/graphics/PointF;

    .line 586
    :cond_8
    :goto_5
    add-int/lit8 v18, v18, 0x1

    goto/16 :goto_1

    .line 627
    :cond_9
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v8, v9}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c(Landroid/graphics/Canvas;IF)V

    .line 628
    goto/16 :goto_9

    .line 629
    :cond_a
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    move-object/from16 v1, p0

    iget-wide v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    move-object/from16 v3, p0

    invoke-direct {v3, v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(D)F

    move-result v1

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    move-object/from16 v3, p0

    iget v3, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    add-float/2addr v2, v3

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->getHeight()I

    move-result v3

    int-to-float v3, v3

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 630
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    div-float/2addr v0, v1

    float-to-int v1, v0

    move/from16 v16, v1

    .line 631
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    move/from16 v2, v16

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v17, v0, v1

    .line 632
    move/from16 v18, v16

    :goto_6
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    add-int v0, v0, v16

    move/from16 v1, v18

    if-gt v1, v0, :cond_f

    .line 633
    if-ltz v18, :cond_e

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v18

    if-lt v1, v0, :cond_b

    .line 634
    goto/16 :goto_8

    .line 637
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    move/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-wide v11, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 638
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ao:Z

    if-eqz v0, :cond_c

    .line 639
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    sub-int v2, v18, v16

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    sub-float v9, v0, v17

    goto :goto_7

    .line 641
    :cond_c
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    sub-int v2, v18, v16

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    add-float v9, v0, v17

    .line 643
    :goto_7
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v9

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    move/from16 v4, v18

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-object v3, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    move/from16 v5, v18

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-object v4, v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->subLable:Ljava/lang/String;

    move-object/from16 v5, p0

    iget-object v5, v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    move/from16 v6, v18

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-boolean v5, v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->isShowSubLable:Z

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Landroid/graphics/Canvas;FLjava/lang/String;Ljava/lang/String;Z)V

    .line 644
    move/from16 v8, v18

    .line 646
    const-wide/16 v0, 0x0

    cmpg-double v0, v11, v0

    if-gtz v0, :cond_d

    .line 647
    goto/16 :goto_8

    .line 649
    :cond_d
    new-instance v14, Landroid/graphics/Path;

    invoke-direct {v14}, Landroid/graphics/Path;-><init>()V

    .line 650
    move-object/from16 v0, p0

    invoke-direct {v0, v11, v12}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(D)F

    move-result v10

    .line 652
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v9, v1

    move v2, v10

    move-object/from16 v3, p0

    iget v3, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v3, v9

    move-object/from16 v4, p0

    iget v4, v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d:F

    move-object/from16 v5, p0

    iget v5, v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->l:F

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object v15, v0

    .line 653
    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, v15, Landroid/graphics/RectF;->right:F

    iget v2, v15, Landroid/graphics/RectF;->bottom:F

    iget v3, v15, Landroid/graphics/RectF;->right:F

    iget v4, v15, Landroid/graphics/RectF;->top:F

    move-object/from16 v5, p0

    iget v5, v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->k:I

    move-object/from16 v6, p0

    iget v6, v6, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object/from16 v19, v0

    .line 656
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->y:Landroid/graphics/Paint;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 657
    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v14, v15, v13, v0}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 658
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->y:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v14, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 632
    :cond_e
    :goto_8
    add-int/lit8 v18, v18, 0x1

    goto/16 :goto_6

    .line 661
    :cond_f
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v8, v9}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c(Landroid/graphics/Canvas;IF)V

    .line 664
    :goto_9
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 665
    goto/16 :goto_d

    .line 666
    :cond_10
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Landroid/graphics/Canvas;)V

    .line 667
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 668
    move-object/from16 v0, p0

    iget v13, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    .line 669
    move v14, v13

    :goto_a
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    add-int/2addr v0, v13

    if-ge v14, v0, :cond_14

    .line 670
    if-ltz v14, :cond_13

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v14, v0, :cond_11

    .line 671
    goto :goto_c

    .line 674
    :cond_11
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ao:Z

    if-eqz v0, :cond_12

    .line 675
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    sub-int v2, v14, v13

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v9, v0, v1

    goto :goto_b

    .line 677
    :cond_12
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    sub-int v2, v14, v13

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v9, v0, v1

    .line 679
    :goto_b
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v9

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v3, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-object v3, v3, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v4, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-object v4, v4, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->subLable:Ljava/lang/String;

    move-object/from16 v5, p0

    iget-object v5, v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v5, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-boolean v5, v5, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->isShowSubLable:Z

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Landroid/graphics/Canvas;FLjava/lang/String;Ljava/lang/String;Z)V

    .line 680
    move v8, v14

    .line 669
    :cond_13
    :goto_c
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_a

    .line 682
    :cond_14
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v8, v9}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c(Landroid/graphics/Canvas;IF)V

    .line 683
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 686
    :goto_d
    return-void
.end method

.method private e(F)Z
    .locals 2

    .line 1158
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x358637bd    # 1.0E-6f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic f(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->W:Z

    return v0
.end method

.method static synthetic g(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I
    .locals 1

    .line 41
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i()I

    move-result v0

    return v0
.end method

.method static synthetic h(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    return v0
.end method

.method private i()I
    .locals 5

    .line 1021
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    div-float/2addr v0, v1

    float-to-int v3, v0

    .line 1022
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    int-to-float v2, v3

    mul-float/2addr v1, v2

    sub-float v4, v0, v1

    .line 1023
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    cmpg-float v0, v4, v0

    if-gez v0, :cond_0

    .line 1024
    return v3

    .line 1026
    :cond_0
    add-int/lit8 v0, v3, 0x1

    return v0
.end method

.method static synthetic i(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Ljava/util/List;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->am:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    return-object v0
.end method

.method private k()V
    .locals 4

    .line 1200
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ao:Z

    .line 1201
    new-instance v0, Landroid/support/v4/view/GestureDetectorCompat;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aA:Landroid/view/GestureDetector$SimpleOnGestureListener;

    invoke-direct {v0, v1, v2}, Landroid/support/v4/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aj:Landroid/support/v4/view/GestureDetectorCompat;

    .line 1202
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aj:Landroid/support/v4/view/GestureDetectorCompat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/GestureDetectorCompat;->setIsLongpressEnabled(Z)V

    .line 1203
    new-instance v0, Landroid/widget/OverScroller;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b:Landroid/content/Context;

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-direct {v0, v1, v2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    .line 1205
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->M:Landroid/graphics/Paint;

    .line 1206
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->M:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1207
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->M:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 1208
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->M:Landroid/graphics/Paint;

    const/16 v1, 0x1a

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 1209
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->M:Landroid/graphics/Paint;

    const/4 v1, 0x1

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1211
    const/4 v0, 0x1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(IF)F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    .line 1213
    new-instance v3, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v3, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 1214
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->P:Landroid/graphics/Paint;

    .line 1215
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->P:Landroid/graphics/Paint;

    const/4 v1, 0x1

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1216
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->P:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1217
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->P:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 1218
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->P:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 1219
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->P:Landroid/graphics/Paint;

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 1221
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->O:Landroid/text/TextPaint;

    .line 1222
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->O:Landroid/text/TextPaint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 1223
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->O:Landroid/text/TextPaint;

    const/16 v1, 0x7f

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setAlpha(I)V

    .line 1224
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->O:Landroid/text/TextPaint;

    const/4 v1, 0x1

    const/high16 v2, 0x41300000    # 11.0f

    invoke-static {v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 1226
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->y:Landroid/graphics/Paint;

    .line 1227
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->w:Landroid/graphics/Paint;

    .line 1228
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->w:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->g:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 1230
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->R:Landroid/text/TextPaint;

    .line 1231
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->R:Landroid/text/TextPaint;

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 1232
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->R:Landroid/text/TextPaint;

    const/4 v1, 0x1

    const/high16 v2, 0x41300000    # 11.0f

    invoke-static {v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 1233
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->R:Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 1235
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->S:Landroid/text/TextPaint;

    .line 1236
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->S:Landroid/text/TextPaint;

    const v1, -0x9b9b9c

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 1237
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->S:Landroid/text/TextPaint;

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 1239
    const/4 v0, 0x1

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(IF)F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ae:F

    .line 1240
    const/4 v0, 0x1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(IF)F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ah:F

    .line 1242
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->Q:Landroid/graphics/Paint;

    .line 1243
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->Q:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1244
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->Q:Landroid/graphics/Paint;

    const/high16 v1, -0x67000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 1246
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->T:Landroid/graphics/Paint;

    .line 1247
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->T:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1248
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->T:Landroid/graphics/Paint;

    const/high16 v1, 0x33000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 1250
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m:Landroid/graphics/Paint;

    .line 1251
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1252
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m:Landroid/graphics/Paint;

    const/4 v1, 0x1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 1253
    return-void

    :array_0
    .array-data 4
        0x40800000    # 4.0f
        0x40000000    # 2.0f
        0x40800000    # 4.0f
        0x40000000    # 2.0f
    .end array-data
.end method

.method static synthetic l(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)D
    .locals 2

    .line 41
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    return-wide v0
.end method

.method static synthetic m(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ao:Z

    return v0
.end method

.method static synthetic n(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ai:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    return v0
.end method

.method static synthetic p(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    return v0
.end method

.method static synthetic q(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)D
    .locals 2

    .line 41
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    return-wide v0
.end method

.method static synthetic t(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ag:Z

    return v0
.end method

.method static synthetic u(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    return-object v0
.end method


# virtual methods
.method public a(F)V
    .locals 2

    .line 266
    iput p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    .line 267
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(F)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 268
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v1, 0x40000000    # 2.0f

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    .line 270
    :cond_0
    return-void
.end method

.method public a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;)V
    .locals 0

    .line 821
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    .line 822
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->av:Ljava/lang/String;

    .line 195
    return-void
.end method

.method public b()V
    .locals 1

    .line 825
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    .line 826
    return-void
.end method

.method public b(IDDD)V
    .locals 4

    .line 171
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 173
    :pswitch_0
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aw:I

    .line 174
    iput-wide p2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    .line 175
    iput-wide p4, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    .line 176
    goto :goto_0

    .line 178
    :pswitch_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aw:I

    .line 179
    iput-wide p2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    .line 180
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    .line 181
    goto :goto_0

    .line 183
    :pswitch_2
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aw:I

    .line 184
    iput-wide p6, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    .line 185
    iput-wide p6, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    .line 186
    iput-wide p6, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->u:D

    .line 187
    .line 191
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public b(II)V
    .locals 0

    .line 284
    iput p2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->k:I

    .line 285
    iput p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h:I

    .line 286
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 303
    iput-boolean p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->A:Z

    .line 304
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 829
    iput p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    .line 830
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 832
    :pswitch_0
    const/4 v0, 0x7

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    .line 833
    goto :goto_1

    .line 835
    :pswitch_1
    const/16 v0, 0x1f

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    .line 836
    goto :goto_1

    .line 838
    :pswitch_2
    const/16 v0, 0xc

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    .line 839
    goto :goto_1

    .line 841
    :goto_0
    const/4 v0, 0x7

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    .line 844
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public c(Ljava/util/List;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;>;I)V"
        }
    .end annotation

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 462
    const/4 v0, 0x0

    if-eq v0, p1, :cond_d

    .line 463
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 464
    :cond_0
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    .line 465
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    .line 466
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    if-lez v0, :cond_1

    .line 467
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c()V

    .line 468
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    goto :goto_0

    .line 470
    :cond_1
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    .line 472
    :goto_0
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(F)Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_2

    .line 473
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v1, 0x40000000    # 2.0f

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    .line 475
    :cond_2
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(F)Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ae:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_3

    .line 476
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v1, 0x40000000    # 2.0f

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ae:F

    .line 478
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e()V

    .line 481
    :cond_4
    if-lez p2, :cond_5

    .line 482
    iput p2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    .line 483
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    int-to-float v0, v0

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    .line 484
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    .line 487
    :cond_5
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    .line 488
    const-wide/16 v4, 0x0

    .line 489
    const-wide/16 v6, 0x0

    .line 490
    const/4 v8, 0x0

    .line 491
    move v9, p2

    :goto_1
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    add-int/2addr v0, p2

    if-ge v9, v0, :cond_9

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v9, v0, :cond_6

    .line 493
    goto :goto_2

    .line 495
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-wide v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(D)Z

    move-result v0

    if-nez v0, :cond_7

    .line 496
    add-int/lit8 v8, v8, 0x1

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-wide v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    add-double/2addr v6, v0

    .line 499
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-wide v0, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    cmpg-double v0, v4, v0

    if-gez v0, :cond_8

    .line 500
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-wide v4, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 491
    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 504
    :cond_9
    :goto_2
    const-wide/16 v0, 0x0

    cmpl-double v0, v4, v0

    if-lez v0, :cond_b

    .line 505
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aw:I

    packed-switch v0, :pswitch_data_0

    goto :goto_3

    .line 507
    :pswitch_0
    const-wide v0, 0x3fe9c18fa0000000L    # 0.8048780560493469

    div-double v0, v4, v0

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    .line 508
    int-to-double v0, v8

    div-double v0, v6, v0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    .line 509
    goto :goto_4

    .line 511
    :pswitch_1
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->u:D

    invoke-direct {p0, v4, v5, v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(DD)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    .line 512
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->u:D

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    .line 513
    goto :goto_4

    .line 516
    :goto_3
    :pswitch_2
    const-wide v0, 0x3fe9c18fa0000000L    # 0.8048780560493469

    div-double v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    .line 517
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    double-to-int v0, v0

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_a

    .line 518
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    .line 520
    :cond_a
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    .line 521
    goto :goto_4

    .line 524
    :cond_b
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(D)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 525
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    .line 527
    :cond_c
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->r:Z

    .line 529
    :goto_4
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->H:D

    .line 530
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->E:D

    .line 531
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->J:D

    .line 532
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->K:D

    .line 534
    :cond_d
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->invalidate()V

    .line 535
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public computeScroll()V
    .locals 7

    .line 1167
    invoke-super {p0}, Landroid/view/View;->computeScroll()V

    .line 1168
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1169
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->V:Z

    if-eqz v0, :cond_0

    .line 1170
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->V:Z

    .line 1171
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->r:Z

    .line 1173
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->U:Z

    if-eqz v0, :cond_1

    .line 1174
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->U:Z

    .line 1175
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->W:Z

    .line 1176
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->G:Z

    .line 1178
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ai:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    if-eq v0, v1, :cond_2

    .line 1179
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(I)V

    goto :goto_0

    .line 1180
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aq:Z

    if-eqz v0, :cond_5

    .line 1181
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aq:Z

    .line 1182
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(I)V

    goto :goto_0

    .line 1186
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1187
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    .line 1188
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v6

    .line 1189
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    if-lt v6, v0, :cond_4

    .line 1190
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->H:D

    iget-wide v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->J:D

    iget v4, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    sub-int v4, v6, v4

    int-to-double v4, v4

    mul-double/2addr v2, v4

    iget v4, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    int-to-double v4, v4

    div-double/2addr v2, v4

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    .line 1191
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->E:D

    iget-wide v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->K:D

    iget v4, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->N:I

    sub-int v4, v6, v4

    int-to-double v4, v4

    mul-double/2addr v2, v4

    iget v4, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->L:I

    int-to-double v4, v4

    div-double/2addr v2, v4

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    .line 1193
    :cond_4
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1196
    :cond_5
    :goto_0
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 430
    iput p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->p:I

    .line 431
    return-void
.end method

.method public d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)V
    .locals 8

    .line 1266
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$2;->d:[I

    invoke-virtual {p1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 1268
    :sswitch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->r:Z

    .line 1269
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aq:Z

    .line 1270
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->G:Z

    .line 1271
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->W:Z

    .line 1272
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)I

    move-result v6

    .line 1273
    iput v6, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    .line 1274
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->H:D

    .line 1275
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->E:D

    .line 1276
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v2, v6

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    mul-float/2addr v2, v3

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x1f4

    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 1277
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1278
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ag:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    mul-int/lit8 v2, v2, 0x5

    sub-int/2addr v1, v2

    if-le v0, v1, :cond_0

    .line 1279
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ag:Z

    .line 1280
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    invoke-interface {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;->d()V

    .line 1282
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    if-eqz v0, :cond_2

    .line 1283
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    invoke-interface {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;->d(I)V

    goto/16 :goto_0

    .line 1287
    :sswitch_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->r:Z

    .line 1288
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aq:Z

    .line 1289
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->G:Z

    .line 1290
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->W:Z

    .line 1291
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)I

    move-result v7

    .line 1292
    iput v7, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    .line 1293
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->H:D

    .line 1294
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t:D

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->E:D

    .line 1295
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->al:Landroid/widget/OverScroller;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v2, v7

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    mul-float/2addr v2, v3

    iget v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x1f4

    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 1296
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1297
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ag:Z

    if-nez v0, :cond_1

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    mul-int/lit8 v2, v2, 0x5

    sub-int/2addr v1, v2

    if-le v0, v1, :cond_1

    .line 1298
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ag:Z

    .line 1299
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    invoke-interface {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;->d()V

    .line 1301
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    if-eqz v0, :cond_2

    .line 1302
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->af:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    invoke-interface {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;->d(I)V

    .line 1308
    :cond_2
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method public d(Z)V
    .locals 0

    .line 1017
    iput-boolean p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ag:Z

    .line 1018
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1262
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->W:Z

    return v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 774
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-int v2, v0

    .line 775
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    float-to-int v3, v0

    .line 776
    const/4 v4, 0x0

    .line 777
    const/4 v5, 0x0

    .line 779
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 781
    :pswitch_0
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 782
    goto :goto_1

    .line 784
    :pswitch_1
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ak:I

    sub-int v0, v2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    add-int/lit8 v4, v0, 0x0

    .line 785
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ap:I

    sub-int v0, v3, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    add-int/lit8 v5, v0, 0x0

    .line 786
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->W:Z

    if-eqz v0, :cond_0

    mul-int/lit8 v0, v4, 0x4

    if-gt v0, v5, :cond_0

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ad:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->am:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    if-eq v0, v1, :cond_1

    .line 787
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    .line 789
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 791
    :goto_0
    iput v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ak:I

    .line 792
    iput v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ap:I

    .line 793
    nop

    .line 795
    .line 800
    :goto_1
    :pswitch_2
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 274
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Landroid/graphics/Canvas;)V

    .line 275
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Landroid/graphics/Canvas;)V

    .line 276
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(Landroid/graphics/Canvas;)V

    .line 277
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c(Landroid/graphics/Canvas;)V

    .line 278
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .line 207
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 209
    int-to-float v0, p1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a:F

    .line 210
    int-to-float v0, p2

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d:F

    .line 213
    const/4 v0, 0x1

    const/high16 v1, 0x42040000    # 33.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(IF)F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->l:F

    .line 214
    const/4 v0, 0x1

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(IF)F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->v:F

    .line 215
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->v:F

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->s:F

    .line 216
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->o:F

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    .line 217
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    const/high16 v1, 0x40e00000    # 7.0f

    div-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->B:F

    .line 218
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    if-lez v0, :cond_0

    .line 219
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->j:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    goto :goto_0

    .line 221
    :cond_0
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e:F

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    .line 223
    :goto_0
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    .line 224
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v1, 0x40000000    # 2.0f

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i:F

    .line 226
    :cond_1
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ae:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_2

    .line 227
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    const/high16 v1, 0x40000000    # 2.0f

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ae:F

    .line 229
    :cond_2
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d:F

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->l:F

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c:F

    .line 231
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    if-lez v0, :cond_3

    .line 232
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    int-to-float v0, v0

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->C:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->F:F

    .line 233
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->D:I

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->I:I

    .line 235
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e()V

    .line 236
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 805
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->A:Z

    if-eqz v0, :cond_0

    .line 806
    const/4 v0, 0x0

    return v0

    .line 809
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->aj:Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    .line 810
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->ai:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    if-ne v0, v1, :cond_3

    .line 811
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->am:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->am:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    if-ne v0, v1, :cond_2

    .line 812
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(I)V

    goto :goto_0

    .line 814
    :cond_2
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->am:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 817
    :cond_3
    :goto_0
    return v2
.end method

.method public setDataUnit(Ljava/lang/String;)V
    .locals 0

    .line 299
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->q:Ljava/lang/String;

    .line 300
    return-void
.end method

.method public setMaxData(D)V
    .locals 0

    .line 292
    iput-wide p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n:D

    .line 293
    return-void
.end method

.method public setPadding(FF)V
    .locals 0

    .line 258
    iput p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f:F

    .line 259
    iput p2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->o:F

    .line 260
    return-void
.end method
