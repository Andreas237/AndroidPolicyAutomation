.class public Lo/dyb;
.super Lo/nh;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ResourceAsColor"
    }
.end annotation


# instance fields
.field private m:Landroid/content/Context;

.field public o:Lo/nv;

.field private p:F

.field private q:[F

.field private r:Landroid/graphics/Paint;

.field private s:Landroid/graphics/Path;

.field private t:F

.field private u:F

.field private v:I

.field private x:F

.field private y:Lo/mt;


# direct methods
.method public constructor <init>(Lo/mo;Lo/la;Lo/oa;)V
    .locals 1

    .line 38
    invoke-direct {p0, p1, p2, p3}, Lo/nh;-><init>(Lo/mo;Lo/la;Lo/oa;)V

    .line 41
    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lo/dyb;->q:[F

    .line 39
    return-void
.end method

.method private a()F
    .locals 2

    .line 53
    iget v0, p0, Lo/dyb;->x:F

    const/high16 v1, 0x42200000    # 40.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    cmpg-float v0, v0, v1

    if-lez v0, :cond_0

    iget v0, p0, Lo/dyb;->x:F

    const/high16 v1, 0x42200000    # 40.0f

    rem-float/2addr v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 54
    :cond_0
    iget v0, p0, Lo/dyb;->x:F

    return v0

    .line 56
    :cond_1
    iget v0, p0, Lo/dyb;->x:F

    float-to-int v0, v0

    div-int/lit8 v0, v0, 0x28

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x28

    int-to-float v0, v0

    return v0
.end method

.method private b(F)Ljava/lang/String;
    .locals 4

    .line 241
    float-to-double v0, p1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 4

    .line 246
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/dyb;->r:Landroid/graphics/Paint;

    .line 247
    iget-object v0, p0, Lo/dyb;->r:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 250
    iget-object v0, p0, Lo/dyb;->r:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 251
    iget-object v0, p0, Lo/dyb;->r:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 252
    iget-object v0, p0, Lo/dyb;->r:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/DashPathEffect;

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 257
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method


# virtual methods
.method public a(Landroid/content/Context;IFFFZ)V
    .locals 0

    .line 261
    iput p3, p0, Lo/dyb;->p:F

    .line 262
    iput p4, p0, Lo/dyb;->t:F

    .line 263
    iput p5, p0, Lo/dyb;->u:F

    .line 264
    iput-object p1, p0, Lo/dyb;->m:Landroid/content/Context;

    .line 265
    return-void
.end method

.method protected a(Landroid/graphics/Canvas;Lo/mt;I)V
    .locals 15

    .line 153
    const-string v0, "WisdomBarChartRenderer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetDrawDataSet()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-ne v0, v1, :cond_0

    .line 155
    const-string v0, "WisdomBarChartRenderer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetDrawDataSet() dataSet = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    return-void

    .line 159
    :cond_0
    iget-object v0, p0, Lo/dyb;->e:Lo/mo;

    invoke-interface/range {p2 .. p2}, Lo/mt;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/mo;->b(Lo/lp$b;)Lo/nv;

    move-result-object v0

    iput-object v0, p0, Lo/dyb;->o:Lo/nv;

    .line 160
    iget-object v0, p0, Lo/dyb;->b:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/mt;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 161
    iget-object v0, p0, Lo/dyb;->b:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/mt;->c()F

    move-result v1

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 162
    invoke-interface/range {p2 .. p2}, Lo/mt;->c()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const/4 v7, 0x1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    .line 164
    :goto_0
    iget-object v0, p0, Lo/dyb;->c:[Lo/lb;

    aget-object v8, v0, p3

    .line 165
    move/from16 v0, p3

    invoke-virtual {v8, v0}, Lo/lb;->e(I)V

    .line 166
    iget-object v0, p0, Lo/dyb;->e:Lo/mo;

    invoke-interface/range {p2 .. p2}, Lo/mt;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/mo;->c(Lo/lp$b;)Z

    move-result v0

    invoke-virtual {v8, v0}, Lo/lb;->b(Z)V

    .line 167
    iget-object v0, p0, Lo/dyb;->e:Lo/mo;

    invoke-interface {v0}, Lo/mo;->getBarData()Lo/lo;

    move-result-object v0

    invoke-virtual {v0}, Lo/lo;->a()F

    move-result v0

    invoke-virtual {v8, v0}, Lo/lb;->d(F)V

    .line 169
    move-object/from16 v0, p2

    invoke-virtual {v8, v0}, Lo/lb;->e(Lo/mt;)V

    .line 170
    iget-object v0, p0, Lo/dyb;->o:Lo/nv;

    iget-object v1, v8, Lo/lb;->e:[F

    invoke-virtual {v0, v1}, Lo/nv;->e([F)V

    .line 172
    invoke-interface/range {p2 .. p2}, Lo/mt;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v9, 0x1

    goto :goto_1

    :cond_2
    const/4 v9, 0x0

    .line 174
    :goto_1
    if-eqz v9, :cond_3

    .line 175
    iget-object v0, p0, Lo/dyb;->h:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/mt;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 178
    :cond_3
    const/4 v10, 0x0

    .line 179
    iget-object v0, v8, Lo/lb;->e:[F

    array-length v0, v0

    if-lez v0, :cond_4

    .line 180
    iget-object v0, v8, Lo/lb;->e:[F

    const/4 v1, 0x1

    aget v10, v0, v1

    .line 182
    :cond_4
    const/4 v11, 0x1

    :goto_2
    invoke-virtual {v8}, Lo/lb;->a()I

    move-result v0

    if-ge v11, v0, :cond_6

    .line 183
    iget-object v0, v8, Lo/lb;->e:[F

    aget v0, v0, v11

    cmpg-float v0, v0, v10

    if-gez v0, :cond_5

    .line 184
    iget-object v0, v8, Lo/lb;->e:[F

    aget v10, v0, v11

    .line 182
    :cond_5
    add-int/lit8 v11, v11, 0x4

    goto :goto_2

    .line 187
    :cond_6
    const-string v0, "WisdomBarChartRenderer"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tmpData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    iget v0, p0, Lo/dyb;->t:F

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v10

    invoke-virtual {p0}, Lo/dyb;->d()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    add-float/2addr v1, v2

    mul-float/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v10

    div-float/2addr v0, v1

    iput v0, p0, Lo/dyb;->x:F

    .line 191
    iget-object v0, p0, Lo/dyb;->o:Lo/nv;

    move-object/from16 v1, p1

    invoke-virtual {p0, v1, v0}, Lo/dyb;->c(Landroid/graphics/Canvas;Lo/nv;)V

    .line 192
    const/4 v11, 0x0

    .line 193
    iget-object v0, v8, Lo/lb;->e:[F

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_7

    .line 194
    iget-object v0, v8, Lo/lb;->e:[F

    const/4 v1, 0x2

    aget v0, v0, v1

    iget-object v1, v8, Lo/lb;->e:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lo/dyb;->u:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v11, v0, v1

    .line 196
    :cond_7
    const/4 v12, 0x0

    :goto_3
    invoke-virtual {v8}, Lo/lb;->a()I

    move-result v0

    if-ge v12, v0, :cond_c

    .line 198
    iget-object v0, p0, Lo/dyb;->l:Lo/oa;

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v12, 0x2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-nez v0, :cond_8

    .line 199
    goto/16 :goto_4

    .line 201
    :cond_8
    iget-object v0, p0, Lo/dyb;->l:Lo/oa;

    iget-object v1, v8, Lo/lb;->e:[F

    aget v1, v1, v12

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_9

    .line 202
    goto/16 :goto_5

    .line 204
    :cond_9
    if-nez v9, :cond_a

    .line 207
    iget-object v0, p0, Lo/dyb;->h:Landroid/graphics/Paint;

    div-int/lit8 v1, v12, 0x4

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Lo/mt;->e(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 209
    :cond_a
    const/4 v0, 0x2

    new-array v13, v0, [F

    .line 210
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v13, v1

    .line 211
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v13, v1

    .line 212
    iget-object v0, p0, Lo/dyb;->o:Lo/nv;

    invoke-virtual {v0, v13}, Lo/nv;->e([F)V

    .line 214
    const/4 v0, 0x1

    aget v0, v13, v0

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v12, 0x1

    aget v1, v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v12, 0x2

    aget v2, v2, v3

    iget-object v3, v8, Lo/lb;->e:[F

    aget v3, v3, v12

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v11

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_b

    .line 215
    move-object/from16 v0, p1

    new-instance v1, Landroid/graphics/RectF;

    iget-object v2, v8, Lo/lb;->e:[F

    aget v2, v2, v12

    add-float/2addr v2, v11

    iget-object v3, v8, Lo/lb;->e:[F

    add-int/lit8 v4, v12, 0x1

    aget v3, v3, v4

    iget-object v4, v8, Lo/lb;->e:[F

    add-int/lit8 v5, v12, 0x2

    aget v4, v4, v5

    sub-float/2addr v4, v11

    iget-object v5, v8, Lo/lb;->e:[F

    add-int/lit8 v6, v12, 0x1

    aget v5, v5, v6

    iget v6, p0, Lo/dyb;->u:F

    add-float/2addr v5, v6

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object v5, p0, Lo/dyb;->h:Landroid/graphics/Paint;

    const/high16 v2, 0x43340000    # 180.0f

    const/high16 v3, 0x43340000    # 180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 217
    move-object/from16 v0, p1

    iget-object v1, v8, Lo/lb;->e:[F

    aget v1, v1, v12

    add-float/2addr v1, v11

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v12, 0x1

    aget v2, v2, v3

    iget v3, p0, Lo/dyb;->u:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v2, v3

    iget-object v3, v8, Lo/lb;->e:[F

    add-int/lit8 v4, v12, 0x2

    aget v3, v3, v4

    sub-float/2addr v3, v11

    iget-object v4, v8, Lo/lb;->e:[F

    add-int/lit8 v5, v12, 0x3

    aget v4, v4, v5

    iget-object v5, p0, Lo/dyb;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_4

    .line 220
    :cond_b
    new-instance v14, Landroid/graphics/Path;

    invoke-direct {v14}, Landroid/graphics/Path;-><init>()V

    .line 221
    iget-object v0, v8, Lo/lb;->e:[F

    aget v0, v0, v12

    add-float/2addr v0, v11

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v12, 0x3

    aget v1, v1, v2

    invoke-virtual {v14, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 222
    iget-object v0, v8, Lo/lb;->e:[F

    aget v0, v0, v12

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v12, 0x2

    aget v1, v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v12, 0x1

    aget v1, v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v12, 0x3

    aget v2, v2, v3

    sub-float/2addr v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v12, 0x2

    aget v2, v2, v3

    sub-float/2addr v2, v11

    iget-object v3, v8, Lo/lb;->e:[F

    add-int/lit8 v4, v12, 0x3

    aget v3, v3, v4

    invoke-virtual {v14, v0, v1, v2, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 223
    iget-object v0, p0, Lo/dyb;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v14, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 196
    :goto_4
    add-int/lit8 v12, v12, 0x4

    goto/16 :goto_3

    .line 235
    :cond_c
    :goto_5
    return-void
.end method

.method public c(Landroid/graphics/Canvas;)V
    .locals 4

    .line 60
    const-string v0, "WisdomBarChartRenderer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawChart()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    iget-object v0, p0, Lo/dyb;->y:Lo/mt;

    iget v1, p0, Lo/dyb;->v:I

    invoke-virtual {p0, p1, v0, v1}, Lo/dyb;->a(Landroid/graphics/Canvas;Lo/mt;I)V

    .line 62
    return-void
.end method

.method public c(Landroid/graphics/Canvas;Lo/nv;)V
    .locals 8

    .line 66
    new-instance v4, Landroid/graphics/Path;

    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 67
    const/4 v0, 0x2

    new-array v5, v0, [F

    .line 68
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v5, v1

    .line 70
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 71
    iget-object v0, p0, Lo/dyb;->m:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$color;->hw_achieve_task_kaka_content_line:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 72
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 73
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 74
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 76
    new-instance v7, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v7, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 77
    iget-object v0, p0, Lo/dyb;->m:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$color;->achieve_kaka_rule_title_two:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 78
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 80
    invoke-direct {p0}, Lo/dyb;->a()F

    move-result v0

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 81
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 82
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 83
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 84
    invoke-direct {p0}, Lo/dyb;->a()F

    move-result v0

    invoke-direct {p0, v0}, Lo/dyb;->b(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 85
    invoke-virtual {p1, v4, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 86
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 88
    invoke-direct {p0}, Lo/dyb;->a()F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 89
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 90
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 91
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 92
    invoke-direct {p0}, Lo/dyb;->a()F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    invoke-direct {p0, v0}, Lo/dyb;->b(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 93
    invoke-virtual {p1, v4, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 94
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 96
    invoke-direct {p0}, Lo/dyb;->a()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 97
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 98
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 99
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 100
    invoke-direct {p0}, Lo/dyb;->a()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-direct {p0, v0}, Lo/dyb;->b(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 101
    invoke-virtual {p1, v4, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 102
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 104
    invoke-direct {p0}, Lo/dyb;->a()F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 105
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 106
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 107
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 108
    invoke-direct {p0}, Lo/dyb;->a()F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    invoke-direct {p0, v0}, Lo/dyb;->b(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 109
    invoke-virtual {p1, v4, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 110
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 112
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 113
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 114
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 115
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 116
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dyb;->b(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 117
    invoke-virtual {p1, v4, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 118
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 120
    invoke-direct {p0}, Lo/dyb;->b()V

    .line 122
    iget-object v0, p0, Lo/dyb;->q:[F

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 123
    iget-object v0, p0, Lo/dyb;->q:[F

    iget v1, p0, Lo/dyb;->p:F

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 124
    iget-object v0, p0, Lo/dyb;->q:[F

    invoke-virtual {p2, v0}, Lo/nv;->e([F)V

    .line 125
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/dyb;->s:Landroid/graphics/Path;

    .line 127
    iget-object v0, p0, Lo/dyb;->q:[F

    const/4 v1, 0x1

    aget v0, v0, v1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 128
    iget-object v0, p0, Lo/dyb;->s:Landroid/graphics/Path;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 129
    iget-object v0, p0, Lo/dyb;->s:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_0

    .line 131
    :cond_0
    iget-object v0, p0, Lo/dyb;->s:Landroid/graphics/Path;

    iget-object v1, p0, Lo/dyb;->q:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 132
    iget-object v0, p0, Lo/dyb;->s:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lo/dyb;->q:[F

    const/4 v3, 0x1

    aget v2, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 135
    :goto_0
    iget-object v0, p0, Lo/dyb;->r:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/dyb;->m:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$color;->achieve_color_divide_line:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 136
    iget-object v0, p0, Lo/dyb;->s:Landroid/graphics/Path;

    iget-object v1, p0, Lo/dyb;->r:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 137
    iget-object v0, p0, Lo/dyb;->s:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 138
    return-void
.end method

.method public d()I
    .locals 4

    .line 45
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 46
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 47
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v3

    .line 48
    iget v0, v3, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v1, v3, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method protected d(Landroid/graphics/Canvas;Lo/mt;I)V
    .locals 4

    .line 147
    const-string v0, "WisdomBarChartRenderer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataSet = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    iput-object p2, p0, Lo/dyb;->y:Lo/mt;

    .line 149
    iput p3, p0, Lo/dyb;->v:I

    .line 150
    return-void
.end method
