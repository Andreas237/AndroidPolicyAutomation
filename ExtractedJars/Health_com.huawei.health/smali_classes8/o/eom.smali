.class public Lo/eom;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eom$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:F

.field private f:F

.field private g:Landroid/graphics/Paint;

.field private h:Landroid/graphics/Paint;

.field private i:F

.field private k:I

.field private m:I

.field private n:Z

.field private o:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 54
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    const/high16 v0, 0x42c80000    # 100.0f

    iput v0, p0, Lo/eom;->e:F

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lo/eom;->f:F

    .line 42
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eom;->n:Z

    .line 55
    invoke-direct {p0}, Lo/eom;->d()V

    .line 56
    return-void
.end method

.method static synthetic c(Lo/eom;)F
    .locals 1

    .line 12
    iget v0, p0, Lo/eom;->f:F

    return v0
.end method

.method static synthetic d(Lo/eom;F)F
    .locals 0

    .line 12
    iput p1, p0, Lo/eom;->f:F

    return p1
.end method

.method private d()V
    .locals 4

    .line 59
    const-string v0, "ProgressBarView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/eom;->g:Landroid/graphics/Paint;

    .line 63
    iget-object v0, p0, Lo/eom;->g:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 65
    iget-object v0, p0, Lo/eom;->g:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 67
    iget-object v0, p0, Lo/eom;->g:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 69
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/eom;->h:Landroid/graphics/Paint;

    .line 71
    iget-object v0, p0, Lo/eom;->h:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 73
    iget-object v0, p0, Lo/eom;->h:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 75
    iget-object v0, p0, Lo/eom;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 76
    return-void
.end method

.method static synthetic d(Lo/eom;)Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lo/eom;->n:Z

    return v0
.end method

.method private getCircleCenter()V
    .locals 4

    .line 79
    const-string v0, "ProgressBarView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCircleCenter getWidth() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/eom;->getWidth()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; getHeight() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/eom;->getHeight()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iget v0, p0, Lo/eom;->d:I

    if-eqz v0, :cond_0

    iget v0, p0, Lo/eom;->c:I

    if-nez v0, :cond_1

    .line 81
    :cond_0
    invoke-virtual {p0}, Lo/eom;->getWidth()I

    move-result v0

    iput v0, p0, Lo/eom;->d:I

    .line 82
    invoke-virtual {p0}, Lo/eom;->getHeight()I

    move-result v0

    iput v0, p0, Lo/eom;->c:I

    .line 85
    iget v0, p0, Lo/eom;->d:I

    iget v1, p0, Lo/eom;->c:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, -0xa

    iput v0, p0, Lo/eom;->k:I

    .line 87
    iget v0, p0, Lo/eom;->k:I

    div-int/lit8 v0, v0, 0x8

    iput v0, p0, Lo/eom;->b:I

    .line 89
    iget v0, p0, Lo/eom;->b:I

    div-int/lit8 v0, v0, 0x6

    iput v0, p0, Lo/eom;->a:I

    .line 91
    iget v0, p0, Lo/eom;->d:I

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/eom;->m:I

    .line 92
    iget v0, p0, Lo/eom;->c:I

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/eom;->o:I

    .line 94
    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 292
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eom;->n:Z

    .line 293
    const/4 v0, 0x0

    iput v0, p0, Lo/eom;->f:F

    .line 294
    invoke-virtual {p0}, Lo/eom;->postInvalidate()V

    .line 295
    return-void
.end method

.method public e()V
    .locals 4

    .line 282
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eom;->n:Z

    .line 283
    const-string v0, "ProgressBarView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start!!!!!!start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    new-instance v0, Lo/eom$a;

    invoke-direct {v0, p0}, Lo/eom$a;-><init>(Lo/eom;)V

    .line 285
    return-void
.end method

.method public e(F)V
    .locals 0

    .line 273
    iput p1, p0, Lo/eom;->i:F

    .line 274
    invoke-virtual {p0}, Lo/eom;->invalidate()V

    .line 275
    return-void
.end method

.method public getIsRunning()Z
    .locals 1

    .line 298
    iget-boolean v0, p0, Lo/eom;->n:Z

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 27

    .line 99
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-super {v0, v1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 100
    const-string v0, "ProgressBarView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDraw"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    invoke-direct/range {p0 .. p0}, Lo/eom;->getCircleCenter()V

    .line 102
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->i:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->e:F

    div-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v6, v1, v0

    .line 103
    const-string v0, "ProgressBarView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onDraw sweep : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eom;->n:Z

    if-eqz v0, :cond_7

    .line 106
    const-string v0, "ProgressBarView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onDraw arc_to :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/eom;->f:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x42480000    # 50.0f

    sub-float v7, v0, v1

    .line 108
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    const-string v1, "#0cfb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 109
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->a:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 110
    const v8, 0x3fcccccd    # 1.6f

    .line 111
    :goto_0
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x42480000    # 50.0f

    sub-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v7, v0

    if-gtz v0, :cond_0

    .line 112
    add-float v0, v7, v8

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v9, v0, v2

    .line 113
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->m:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v11, v0, v1

    .line 114
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->o:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v12, v0, v1

    .line 115
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 116
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v13, v11, v0

    .line 117
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 118
    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v14, v12, v0

    .line 119
    move-object/from16 v0, p1

    move v1, v11

    move v2, v12

    move v3, v13

    move v4, v14

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/eom;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 121
    const/high16 v0, 0x40a00000    # 5.0f

    add-float/2addr v7, v0

    .line 122
    goto :goto_0

    .line 124
    :cond_0
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x41f00000    # 30.0f

    sub-float v9, v0, v1

    .line 125
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    const-string v1, "#33fb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->a:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 127
    const v10, 0x3fcccccd    # 1.6f

    .line 128
    :goto_1
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x41f00000    # 30.0f

    sub-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v9, v0

    if-gtz v0, :cond_1

    .line 129
    add-float v0, v9, v10

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v11, v0, v2

    .line 130
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->m:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v13, v0, v1

    .line 131
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->o:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v14, v0, v1

    .line 132
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 133
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v15, v13, v0

    .line 134
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 135
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v16, v14, v0

    .line 136
    move-object/from16 v0, p1

    move v1, v13

    move v2, v14

    move v3, v15

    move/from16 v4, v16

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/eom;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 138
    const/high16 v0, 0x40a00000    # 5.0f

    add-float/2addr v9, v0

    .line 139
    goto :goto_1

    .line 142
    :cond_1
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x41200000    # 10.0f

    sub-float v11, v0, v1

    .line 143
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    const-string v1, "#66fb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 144
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->a:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 145
    const v12, 0x3fcccccd    # 1.6f

    .line 146
    :goto_2
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x41200000    # 10.0f

    sub-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v11, v0

    if-gtz v0, :cond_2

    .line 147
    add-float v0, v11, v12

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v13, v0, v2

    .line 148
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->m:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v15, v0, v1

    .line 149
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->o:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v16, v0, v1

    .line 150
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 151
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v17, v15, v0

    .line 152
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 153
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v18, v16, v0

    .line 154
    move-object/from16 v0, p1

    move v1, v15

    move/from16 v2, v16

    move/from16 v3, v17

    move/from16 v4, v18

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/eom;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 156
    const/high16 v0, 0x40a00000    # 5.0f

    add-float/2addr v11, v0

    .line 157
    goto :goto_2

    .line 160
    :cond_2
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x41200000    # 10.0f

    add-float v13, v0, v1

    .line 161
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    const-string v1, "#92fb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->a:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 163
    const v14, 0x3fcccccd    # 1.6f

    .line 164
    :goto_3
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x41200000    # 10.0f

    add-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v13, v0

    if-gtz v0, :cond_3

    .line 165
    add-float v0, v13, v14

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v15, v0, v2

    .line 166
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->m:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v17, v0, v1

    .line 167
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->o:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v18, v0, v1

    .line 168
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 169
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v19, v17, v0

    .line 170
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 171
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v20, v18, v0

    .line 172
    move-object/from16 v0, p1

    move/from16 v1, v17

    move/from16 v2, v18

    move/from16 v3, v19

    move/from16 v4, v20

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/eom;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 174
    const/high16 v0, 0x40a00000    # 5.0f

    add-float/2addr v13, v0

    .line 175
    goto :goto_3

    .line 178
    :cond_3
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x41f00000    # 30.0f

    add-float v15, v0, v1

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    const-string v1, "#CCfb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 180
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->a:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 181
    const v16, 0x3fcccccd    # 1.6f

    .line 182
    :goto_4
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x41f00000    # 30.0f

    add-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v15, v0

    if-gtz v0, :cond_4

    .line 183
    add-float v0, v15, v16

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v17, v0, v2

    .line 184
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->m:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v19, v0, v1

    .line 185
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->o:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v20, v0, v1

    .line 186
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 187
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v21, v19, v0

    .line 188
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 189
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v22, v20, v0

    .line 190
    move-object/from16 v0, p1

    move/from16 v1, v19

    move/from16 v2, v20

    move/from16 v3, v21

    move/from16 v4, v22

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/eom;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 192
    const/high16 v0, 0x40a00000    # 5.0f

    add-float/2addr v15, v0

    .line 193
    goto :goto_4

    .line 194
    :cond_4
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x42480000    # 50.0f

    add-float v17, v0, v1

    .line 195
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    const-string v1, "#FFfb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 196
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->a:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 197
    const v18, 0x3fcccccd    # 1.6f

    .line 198
    :goto_5
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x42480000    # 50.0f

    add-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v17, v0

    if-gtz v0, :cond_5

    .line 199
    add-float v0, v17, v18

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v19, v0, v2

    .line 200
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->m:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v21, v0, v1

    .line 201
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->o:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v22, v0, v1

    .line 202
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 203
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v23, v21, v0

    .line 204
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 205
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v24, v22, v0

    .line 206
    move-object/from16 v0, p1

    move/from16 v1, v21

    move/from16 v2, v22

    move/from16 v3, v23

    move/from16 v4, v24

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/eom;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 208
    const/high16 v0, 0x40a00000    # 5.0f

    add-float v17, v17, v0

    .line 209
    goto :goto_5

    .line 211
    :cond_5
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x428c0000    # 70.0f

    add-float v19, v0, v1

    .line 212
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    const-string v1, "#ffffff"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 213
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->a:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 214
    const v20, 0x3fcccccd    # 1.6f

    .line 215
    :goto_6
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->f:F

    const/high16 v1, 0x428c0000    # 70.0f

    add-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v19, v0

    if-gtz v0, :cond_6

    .line 216
    add-float v0, v19, v20

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v21, v0, v2

    .line 217
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->m:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v23, v0, v1

    .line 218
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->o:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v24, v0, v1

    .line 219
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 220
    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v25, v23, v0

    .line 221
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 222
    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v26, v24, v0

    .line 223
    move-object/from16 v0, p1

    move/from16 v1, v23

    move/from16 v2, v24

    move/from16 v3, v25

    move/from16 v4, v26

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/eom;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 225
    const/high16 v0, 0x40a00000    # 5.0f

    add-float v19, v19, v0

    .line 226
    goto :goto_6

    .line 227
    :cond_6
    goto/16 :goto_9

    .line 228
    :cond_7
    const/4 v7, 0x0

    .line 230
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->g:Landroid/graphics/Paint;

    const-string v1, "#33000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->g:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->a:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 233
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->g:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 234
    const v8, 0x3fcccccd    # 1.6f

    .line 235
    :goto_7
    const/high16 v0, 0x43b40000    # 360.0f

    cmpg-float v0, v8, v0

    if-gtz v0, :cond_8

    .line 236
    add-float v0, v7, v8

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v9, v0, v2

    .line 237
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->m:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v11, v0, v1

    .line 238
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->o:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v12, v0, v1

    .line 239
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 240
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v13, v11, v0

    .line 241
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 242
    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v14, v12, v0

    .line 243
    move-object/from16 v0, p1

    move v1, v11

    move v2, v12

    move v3, v13

    move v4, v14

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/eom;->g:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 245
    const/high16 v0, 0x40a00000    # 5.0f

    add-float/2addr v8, v0

    .line 246
    goto :goto_7

    .line 249
    :cond_8
    const/4 v9, 0x0

    .line 250
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    const-string v1, "#FFfb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 251
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->a:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 253
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eom;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 254
    const v10, 0x3fcccccd    # 1.6f

    .line 255
    :goto_8
    cmpg-float v0, v9, v6

    if-gez v0, :cond_9

    .line 256
    add-float v0, v9, v10

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v11, v0, v2

    .line 257
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->m:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v13, v0, v1

    .line 258
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->o:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eom;->k:I

    int-to-float v1, v1

    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v14, v0, v1

    .line 259
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 260
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v15, v13, v0

    .line 261
    move-object/from16 v0, p0

    iget v0, v0, Lo/eom;->b:I

    int-to-float v0, v0

    .line 262
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v16, v14, v0

    .line 263
    move-object/from16 v0, p1

    move v1, v13

    move v2, v14

    move v3, v15

    move/from16 v4, v16

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/eom;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 265
    const/high16 v0, 0x40a00000    # 5.0f

    add-float/2addr v9, v0

    .line 266
    goto :goto_8

    .line 269
    :cond_9
    :goto_9
    return-void
.end method
