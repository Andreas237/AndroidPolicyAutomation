.class public Lo/epm;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private A:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private B:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private C:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private H:F

.field private a:Landroid/graphics/Paint;

.field private b:Landroid/content/res/Resources;

.field private c:Landroid/graphics/Paint;

.field private d:Landroid/util/DisplayMetrics;

.field private e:Landroid/content/Context;

.field private f:Z

.field private g:I

.field private h:I

.field private i:I

.field private j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private k:I

.field private l:I

.field private m:I

.field private n:D

.field private o:I

.field private p:I

.field private q:D

.field private r:I

.field private s:I

.field private t:I

.field private u:Ljava/lang/String;

.field private v:I

.field private w:I

.field private x:[Landroid/graphics/Point;

.field private y:[Landroid/graphics/Point;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 72
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/epm;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 73
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 76
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    const/high16 v0, -0x10000

    iput v0, p0, Lo/epm;->h:I

    .line 43
    const/high16 v0, -0x10000

    iput v0, p0, Lo/epm;->i:I

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epm;->f:Z

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/epm;->p:I

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/epm;->o:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/epm;->m:I

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lo/epm;->l:I

    .line 56
    const-string v0, ""

    iput-object v0, p0, Lo/epm;->u:Ljava/lang/String;

    .line 57
    const-string v0, ""

    iput-object v0, p0, Lo/epm;->z:Ljava/lang/String;

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epm;->E:Ljava/util/ArrayList;

    .line 77
    iput-object p1, p0, Lo/epm;->e:Landroid/content/Context;

    .line 78
    const/4 v0, 0x7

    new-array v0, v0, [Landroid/graphics/Point;

    iput-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    .line 79
    const/4 v0, 0x7

    new-array v0, v0, [Landroid/graphics/Point;

    iput-object v0, p0, Lo/epm;->x:[Landroid/graphics/Point;

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epm;->j:Ljava/util/ArrayList;

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epm;->C:Ljava/util/ArrayList;

    .line 83
    invoke-direct {p0}, Lo/epm;->b()V

    .line 84
    return-void
.end method

.method private a(F)I
    .locals 2

    .line 392
    iget-object v0, p0, Lo/epm;->d:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 9

    .line 275
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-direct {p0, v1}, Lo/epm;->a(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 276
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    iget v1, p0, Lo/epm;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 280
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 281
    iget-object v0, p0, Lo/epm;->z:Ljava/lang/String;

    const-string v1, "heartrate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/epm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    move-object v0, p1

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    rsub-int/lit8 v2, v8, 0x6

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v2, v2, v8

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v4, v8, 0x6

    aget-object v3, v3, v4

    iget v3, v3, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget-object v4, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v4, v4, v8

    iget v4, v4, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 284
    :cond_0
    move-object v0, p1

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v1, v1, v8

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v2, v2, v8

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v3, v3, v8

    iget v3, v3, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget-object v4, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v4, v4, v8

    iget v4, v4, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 280
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 289
    :cond_1
    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    :goto_2
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    array-length v0, v0

    if-ge v8, v0, :cond_3

    .line 290
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 291
    iget-object v0, p0, Lo/epm;->z:Ljava/lang/String;

    const-string v1, "heartrate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/epm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 292
    move-object v0, p1

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    rsub-int/lit8 v2, v8, 0x6

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v2, v2, v8

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v4, v8, 0x6

    aget-object v3, v3, v4

    iget v3, v3, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget-object v4, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v4, v4, v8

    iget v4, v4, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_3

    .line 294
    :cond_2
    move-object v0, p1

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v1, v1, v8

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v2, v2, v8

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v3, v3, v8

    iget v3, v3, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget-object v4, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v4, v4, v8

    iget v4, v4, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 289
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_2

    .line 298
    :cond_3
    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 299
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    const v1, 0x3dcccccd    # 0.1f

    invoke-direct {p0, v1}, Lo/epm;->a(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 300
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    const/high16 v1, 0x41300000    # 11.0f

    invoke-direct {p0, v1}, Lo/epm;->a(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 301
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epm;->b:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$color;->hw_show_color_text_50_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 302
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 303
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epm;->u:Ljava/lang/String;

    iget-object v2, p0, Lo/epm;->u:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v8

    .line 304
    iget-object v0, p0, Lo/epm;->u:Ljava/lang/String;

    iget v1, p0, Lo/epm;->g:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x40800000    # 4.0f

    invoke-direct {p0, v2}, Lo/epm;->a(F)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v8, v2

    sub-float/2addr v1, v2

    iget v2, p0, Lo/epm;->o:I

    const/high16 v3, 0x41300000    # 11.0f

    invoke-direct {p0, v3}, Lo/epm;->a(F)I

    move-result v3

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 306
    :cond_4
    return-void
.end method

.method private b()V
    .locals 6

    .line 90
    const-string v0, "UIHLH_BloodSugarCurve"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget-object v0, p0, Lo/epm;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lo/epm;->b:Landroid/content/res/Resources;

    .line 92
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    .line 93
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epm;->b:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_11:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 94
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 95
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    const-string v1, "80"

    const-string v2, "80"

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 96
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v0

    iput v0, p0, Lo/epm;->s:I

    .line 97
    iget-object v0, p0, Lo/epm;->b:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$color;->home_bloodpressure_line_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/epm;->h:I

    .line 98
    iget-object v0, p0, Lo/epm;->b:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$color;->home_bloodpressure_point_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/epm;->i:I

    .line 99
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lo/epm;->d:Landroid/util/DisplayMetrics;

    .line 100
    iget-object v0, p0, Lo/epm;->e:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 101
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lo/epm;->d:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 102
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    iput v0, p0, Lo/epm;->p:I

    .line 103
    invoke-virtual {p0}, Lo/epm;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_home_heartrate_paddiing_left_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/epm;->m:I

    .line 104
    invoke-virtual {p0}, Lo/epm;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_home_heartrate_paddiing_top_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iget v1, p0, Lo/epm;->s:I

    add-int/2addr v0, v1

    iput v0, p0, Lo/epm;->l:I

    .line 105
    invoke-direct {p0}, Lo/epm;->getDefaultHighData()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/epm;->B:Ljava/util/ArrayList;

    .line 106
    invoke-direct {p0}, Lo/epm;->getDefaultLowData()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/epm;->D:Ljava/util/ArrayList;

    .line 107
    const/high16 v0, 0x40400000    # 3.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    iput v0, p0, Lo/epm;->w:I

    .line 108
    const/high16 v0, 0x3fc00000    # 1.5f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    iput v0, p0, Lo/epm;->v:I

    .line 109
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 12

    .line 232
    iget-object v0, p0, Lo/epm;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 233
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epm;->b:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$color;->hw_show_color_text_50_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 234
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epm;->b:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_11:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 237
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v8

    .line 238
    iget v0, v8, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v1, v8, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v9, v0

    .line 239
    new-instance v10, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyy"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 240
    const/4 v11, 0x0

    :goto_0
    const/4 v0, 0x7

    if-ge v11, v0, :cond_2

    .line 241
    iget-object v0, p0, Lo/epm;->E:Ljava/util/ArrayList;

    iget v1, p0, Lo/epm;->m:I

    iget v2, p0, Lo/epm;->g:I

    iget v3, p0, Lo/epm;->m:I

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x6

    mul-int/2addr v2, v11

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v11, v0, :cond_1

    .line 243
    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/fee;->d(J)Ljava/lang/String;

    move-result-object v6

    .line 244
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v6, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v5

    .line 245
    iget-object v0, p0, Lo/epm;->z:Ljava/lang/String;

    const-string v1, "heartrate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/epm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 246
    iget v0, p0, Lo/epm;->m:I

    iget v1, p0, Lo/epm;->g:I

    iget v2, p0, Lo/epm;->m:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x6

    rsub-int/lit8 v2, v11, 0x6

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v5, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epm;->o:I

    .line 247
    const/high16 v2, 0x41300000    # 11.0f

    invoke-direct {p0, v2}, Lo/epm;->a(F)I

    move-result v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epm;->c:Landroid/graphics/Paint;

    .line 246
    invoke-virtual {p1, v6, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 248
    if-eqz v11, :cond_1

    .line 249
    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epm;->A:Ljava/util/ArrayList;

    add-int/lit8 v2, v11, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 250
    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 251
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v7, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v5

    .line 252
    iget v0, p0, Lo/epm;->m:I

    iget v1, p0, Lo/epm;->g:I

    iget v2, p0, Lo/epm;->m:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x6

    rsub-int/lit8 v2, v11, 0x6

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v5, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epm;->o:I

    .line 253
    const/high16 v2, 0x41300000    # 11.0f

    invoke-direct {p0, v2}, Lo/epm;->a(F)I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v1, v9

    int-to-float v1, v1

    iget-object v2, p0, Lo/epm;->c:Landroid/graphics/Paint;

    .line 252
    invoke-virtual {p1, v7, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto/16 :goto_1

    .line 257
    :cond_0
    iget v0, p0, Lo/epm;->m:I

    iget v1, p0, Lo/epm;->g:I

    iget v2, p0, Lo/epm;->m:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x6

    mul-int/2addr v1, v11

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v5, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epm;->o:I

    .line 258
    const/high16 v2, 0x41300000    # 11.0f

    invoke-direct {p0, v2}, Lo/epm;->a(F)I

    move-result v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epm;->c:Landroid/graphics/Paint;

    .line 257
    invoke-virtual {p1, v6, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 259
    if-eqz v11, :cond_1

    .line 260
    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epm;->A:Ljava/util/ArrayList;

    add-int/lit8 v2, v11, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 261
    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 262
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v7, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v5

    .line 263
    iget v0, p0, Lo/epm;->m:I

    iget v1, p0, Lo/epm;->g:I

    iget v2, p0, Lo/epm;->m:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x6

    mul-int/2addr v1, v11

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v5, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epm;->o:I

    .line 264
    const/high16 v2, 0x41300000    # 11.0f

    invoke-direct {p0, v2}, Lo/epm;->a(F)I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v1, v9

    int-to-float v1, v1

    iget-object v2, p0, Lo/epm;->c:Landroid/graphics/Paint;

    .line 263
    invoke-virtual {p1, v7, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 240
    :cond_1
    :goto_1
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 271
    :cond_2
    return-void
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 9

    .line 141
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    iget v1, p0, Lo/epm;->i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 142
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 143
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 144
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/epm;->a:Landroid/graphics/Paint;

    .line 145
    iget-object v0, p0, Lo/epm;->a:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 146
    iget-object v0, p0, Lo/epm;->a:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 148
    invoke-direct {p0, p1}, Lo/epm;->setCanvasParams(Landroid/graphics/Canvas;)V

    .line 149
    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 151
    iget-object v0, p0, Lo/epm;->z:Ljava/lang/String;

    const-string v1, "bloodsugar"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    iget-wide v0, p0, Lo/epm;->n:D

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 153
    iget-wide v0, p0, Lo/epm;->q:D

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 155
    :cond_0
    iget-wide v0, p0, Lo/epm;->n:D

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 156
    iget-wide v0, p0, Lo/epm;->q:D

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 158
    :goto_0
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epm;->b:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 159
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epm;->b:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_11:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 162
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v6

    .line 163
    iget-object v0, p0, Lo/epm;->z:Ljava/lang/String;

    const-string v1, "heartrate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/epm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 164
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    iget v1, p0, Lo/epm;->t:I

    rsub-int/lit8 v1, v1, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    iget v2, p0, Lo/epm;->t:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epm;->w:I

    sub-int/2addr v1, v2

    .line 165
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epm;->a(F)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epm;->c:Landroid/graphics/Paint;

    .line 164
    invoke-virtual {p1, v4, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 167
    :cond_1
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    iget v1, p0, Lo/epm;->t:I

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    iget v2, p0, Lo/epm;->t:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epm;->w:I

    sub-int/2addr v1, v2

    .line 168
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epm;->a(F)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epm;->c:Landroid/graphics/Paint;

    .line 167
    invoke-virtual {p1, v4, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 171
    :goto_1
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v6

    .line 173
    new-instance v7, Ljava/math/BigDecimal;

    iget-wide v0, p0, Lo/epm;->n:D

    invoke-direct {v7, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 174
    new-instance v8, Ljava/math/BigDecimal;

    iget-wide v0, p0, Lo/epm;->q:D

    invoke-direct {v8, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 176
    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_2

    invoke-virtual {v7, v8}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v0

    if-eqz v0, :cond_5

    .line 177
    :cond_2
    iget-object v0, p0, Lo/epm;->z:Ljava/lang/String;

    const-string v1, "heartrate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/epm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 178
    iget-object v0, p0, Lo/epm;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epm;->r:I

    rsub-int/lit8 v1, v1, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epm;->x:[Landroid/graphics/Point;

    iget v2, p0, Lo/epm;->r:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epm;->w:I

    add-int/2addr v1, v2

    .line 179
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epm;->a(F)I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Lo/epm;->s:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epm;->c:Landroid/graphics/Paint;

    .line 178
    invoke-virtual {p1, v5, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_2

    .line 181
    :cond_3
    iget-object v0, p0, Lo/epm;->z:Ljava/lang/String;

    const-string v1, "bloodsugar"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v7, v8}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v0

    if-nez v0, :cond_4

    .line 182
    const-string v0, "UIHLH_BloodSugarCurve"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bloodsugar maxValue == minValue"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 184
    :cond_4
    iget-object v0, p0, Lo/epm;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epm;->r:I

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epm;->x:[Landroid/graphics/Point;

    iget v2, p0, Lo/epm;->r:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epm;->w:I

    add-int/2addr v1, v2

    .line 185
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epm;->a(F)I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Lo/epm;->s:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epm;->c:Landroid/graphics/Paint;

    .line 184
    invoke-virtual {p1, v5, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 192
    :cond_5
    :goto_2
    return-void
.end method

.method private getDefaultHighData()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 365
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 366
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 367
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    const/high16 v0, 0x41c80000    # 25.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 371
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 373
    return-object v1
.end method

.method private getDefaultLowData()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 377
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 378
    const/high16 v0, 0x42700000    # 60.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    const/high16 v0, 0x42480000    # 50.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    const/high16 v0, 0x42820000    # 65.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 381
    const/high16 v0, 0x425c0000    # 55.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    const/high16 v0, 0x428c0000    # 70.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    const/high16 v0, 0x42700000    # 60.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    const/high16 v0, 0x425c0000    # 55.0f

    invoke-direct {p0, v0}, Lo/epm;->a(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    return-object v1
.end method

.method private getHightPoints()[Landroid/graphics/Point;
    .locals 9

    .line 309
    const/4 v0, 0x7

    new-array v5, v0, [Landroid/graphics/Point;

    .line 310
    const/4 v6, 0x0

    .line 311
    iget-object v0, p0, Lo/epm;->j:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 312
    iget v0, p0, Lo/epm;->o:I

    iget v1, p0, Lo/epm;->l:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget-wide v1, p0, Lo/epm;->n:D

    iget-wide v3, p0, Lo/epm;->q:D

    sub-double/2addr v1, v3

    double-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/epm;->H:F

    .line 313
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/epm;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_0

    .line 314
    iget v0, p0, Lo/epm;->o:I

    iget v1, p0, Lo/epm;->l:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/epm;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iget-wide v3, p0, Lo/epm;->q:D

    sub-double/2addr v1, v3

    iget v3, p0, Lo/epm;->H:F

    float-to-double v3, v3

    mul-double/2addr v1, v3

    double-to-int v1, v1

    sub-int v8, v0, v1

    .line 315
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lo/epm;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v0, v1, v8}, Landroid/graphics/Point;-><init>(II)V

    aput-object v0, v5, v7

    .line 316
    add-int/lit8 v6, v6, 0x1

    .line 313
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 319
    :cond_0
    move v7, v6

    :goto_1
    const/4 v0, 0x7

    if-ge v7, v0, :cond_1

    .line 320
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lo/epm;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lo/epm;->B:Ljava/util/ArrayList;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    aput-object v0, v5, v7

    .line 319
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 323
    :cond_1
    return-object v5
.end method

.method private getLowPoints()[Landroid/graphics/Point;
    .locals 9

    .line 327
    const/4 v0, 0x7

    new-array v5, v0, [Landroid/graphics/Point;

    .line 328
    const/4 v6, 0x0

    .line 329
    iget-object v0, p0, Lo/epm;->C:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 330
    iget v0, p0, Lo/epm;->o:I

    iget v1, p0, Lo/epm;->l:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget-wide v1, p0, Lo/epm;->n:D

    iget-wide v3, p0, Lo/epm;->q:D

    sub-double/2addr v1, v3

    double-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/epm;->H:F

    .line 331
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/epm;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_0

    .line 332
    iget v0, p0, Lo/epm;->o:I

    iget v1, p0, Lo/epm;->l:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/epm;->C:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iget-wide v3, p0, Lo/epm;->q:D

    sub-double/2addr v1, v3

    iget v3, p0, Lo/epm;->H:F

    float-to-double v3, v3

    mul-double/2addr v1, v3

    double-to-int v1, v1

    sub-int v8, v0, v1

    .line 333
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lo/epm;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v0, v1, v8}, Landroid/graphics/Point;-><init>(II)V

    aput-object v0, v5, v7

    .line 334
    add-int/lit8 v6, v6, 0x1

    .line 331
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 337
    :cond_0
    move v7, v6

    :goto_1
    const/4 v0, 0x7

    if-ge v7, v0, :cond_1

    .line 338
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lo/epm;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lo/epm;->D:Ljava/util/ArrayList;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    aput-object v0, v5, v7

    .line 337
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 340
    :cond_1
    return-object v5
.end method

.method private setCanvasParams(Landroid/graphics/Canvas;)V
    .locals 5

    .line 195
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 196
    iget-object v0, p0, Lo/epm;->z:Ljava/lang/String;

    const-string v1, "heartrate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/epm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v4, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->w:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 198
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v4, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 199
    iget-object v0, p0, Lo/epm;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v4, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->w:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 200
    iget-object v0, p0, Lo/epm;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v4, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto/16 :goto_1

    .line 202
    :cond_0
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->w:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 203
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 204
    iget-object v0, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->w:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 205
    iget-object v0, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 195
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 210
    :cond_1
    iget-object v0, p0, Lo/epm;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    :goto_2
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    array-length v0, v0

    if-ge v4, v0, :cond_3

    .line 211
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    const/16 v1, 0x33

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 212
    iget-object v0, p0, Lo/epm;->z:Ljava/lang/String;

    const-string v1, "heartrate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/epm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 213
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v4, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->w:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 214
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v4, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 215
    iget-object v0, p0, Lo/epm;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v4, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->w:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 216
    iget-object v0, p0, Lo/epm;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v4, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto/16 :goto_3

    .line 218
    :cond_2
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->w:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 219
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->y:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 220
    iget-object v0, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->w:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 221
    iget-object v0, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epm;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epm;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epm;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 210
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_2

    .line 225
    :cond_3
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 128
    invoke-direct {p0, p1}, Lo/epm;->c(Landroid/graphics/Canvas;)V

    .line 129
    iget-object v0, p0, Lo/epm;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 130
    invoke-direct {p0}, Lo/epm;->getHightPoints()[Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    .line 131
    invoke-direct {p0}, Lo/epm;->getLowPoints()[Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lo/epm;->x:[Landroid/graphics/Point;

    .line 132
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/epm;->x:[Landroid/graphics/Point;

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    array-length v0, v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lo/epm;->y:[Landroid/graphics/Point;

    array-length v0, v0

    iget-object v1, p0, Lo/epm;->x:[Landroid/graphics/Point;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 134
    invoke-direct {p0, p1}, Lo/epm;->a(Landroid/graphics/Canvas;)V

    .line 135
    invoke-direct {p0, p1}, Lo/epm;->d(Landroid/graphics/Canvas;)V

    .line 138
    :cond_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .line 113
    iget-boolean v0, p0, Lo/epm;->f:Z

    if-eqz v0, :cond_0

    .line 114
    invoke-virtual {p0}, Lo/epm;->getHeight()I

    move-result v0

    iput v0, p0, Lo/epm;->k:I

    .line 115
    invoke-virtual {p0}, Lo/epm;->getWidth()I

    move-result v0

    iput v0, p0, Lo/epm;->g:I

    .line 116
    iget v0, p0, Lo/epm;->k:I

    iget v1, p0, Lo/epm;->p:I

    sub-int/2addr v0, v1

    iput v0, p0, Lo/epm;->o:I

    .line 117
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epm;->f:Z

    .line 119
    :cond_0
    return-void
.end method

.method public setData(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;DDIILjava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Double;>;Ljava/util/ArrayList<Ljava/lang/Double;>;Ljava/util/ArrayList<Ljava/lang/Long;>;DDIILjava/lang/String;)V"
        }
    .end annotation

    .line 345
    if-eqz p3, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 346
    :cond_0
    const-string v0, "UIHLH_BloodSugarCurve"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setData data error, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    return-void

    .line 349
    :cond_1
    iput-object p10, p0, Lo/epm;->z:Ljava/lang/String;

    .line 350
    const-string v0, "bloodsugar"

    invoke-virtual {p10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 351
    iget-object v0, p0, Lo/epm;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodsugar_nodata_msg:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/epm;->u:Ljava/lang/String;

    goto :goto_0

    .line 353
    :cond_2
    iget-object v0, p0, Lo/epm;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight_nodata_desc:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/epm;->u:Ljava/lang/String;

    .line 355
    :goto_0
    iput p8, p0, Lo/epm;->t:I

    .line 356
    iput p9, p0, Lo/epm;->r:I

    .line 357
    iput-wide p4, p0, Lo/epm;->n:D

    .line 358
    iput-wide p6, p0, Lo/epm;->q:D

    .line 359
    iput-object p3, p0, Lo/epm;->A:Ljava/util/ArrayList;

    .line 360
    iput-object p1, p0, Lo/epm;->j:Ljava/util/ArrayList;

    .line 361
    iput-object p2, p0, Lo/epm;->C:Ljava/util/ArrayList;

    .line 362
    return-void
.end method
