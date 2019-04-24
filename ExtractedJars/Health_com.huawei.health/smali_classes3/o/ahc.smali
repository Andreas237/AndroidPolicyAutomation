.class public Lo/ahc;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ahc$c;
    }
.end annotation


# instance fields
.field private a:F

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:F

.field private g:Landroid/graphics/Paint;

.field private h:Landroid/graphics/Paint;

.field private i:I

.field private k:F

.field private l:I

.field private n:I

.field private p:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 60
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    const/high16 v0, 0x42c80000    # 100.0f

    iput v0, p0, Lo/ahc;->a:F

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lo/ahc;->k:F

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahc;->p:Z

    .line 61
    invoke-direct {p0}, Lo/ahc;->a()V

    .line 62
    return-void
.end method

.method private a()V
    .locals 4

    .line 65
    const-string v0, "ProgressBarView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/ahc;->h:Landroid/graphics/Paint;

    .line 69
    iget-object v0, p0, Lo/ahc;->h:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 71
    iget-object v0, p0, Lo/ahc;->h:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 73
    iget-object v0, p0, Lo/ahc;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 75
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/ahc;->g:Landroid/graphics/Paint;

    .line 77
    iget-object v0, p0, Lo/ahc;->g:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 79
    iget-object v0, p0, Lo/ahc;->g:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 81
    iget-object v0, p0, Lo/ahc;->g:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 84
    invoke-virtual {p0}, Lo/ahc;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/ahc;->b:I

    .line 86
    invoke-virtual {p0}, Lo/ahc;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/ahc;->e:I

    .line 87
    return-void
.end method

.method static synthetic a(Lo/ahc;)Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lo/ahc;->p:Z

    return v0
.end method

.method static synthetic c(Lo/ahc;)F
    .locals 1

    .line 18
    iget v0, p0, Lo/ahc;->k:F

    return v0
.end method

.method static synthetic e(Lo/ahc;F)F
    .locals 0

    .line 18
    iput p1, p0, Lo/ahc;->k:F

    return p1
.end method

.method private getCircleCenter()V
    .locals 4

    .line 90
    const-string v0, "ProgressBarView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCircleCenter getWidth() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/ahc;->getWidth()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; getHeight() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/ahc;->getHeight()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget v0, p0, Lo/ahc;->d:I

    if-eqz v0, :cond_0

    iget v0, p0, Lo/ahc;->c:I

    if-nez v0, :cond_1

    .line 92
    :cond_0
    invoke-virtual {p0}, Lo/ahc;->getWidth()I

    move-result v0

    iput v0, p0, Lo/ahc;->d:I

    .line 93
    invoke-virtual {p0}, Lo/ahc;->getHeight()I

    move-result v0

    iput v0, p0, Lo/ahc;->c:I

    .line 96
    iget v0, p0, Lo/ahc;->d:I

    iget v1, p0, Lo/ahc;->c:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, -0xa

    iput v0, p0, Lo/ahc;->i:I

    .line 102
    iget v0, p0, Lo/ahc;->d:I

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/ahc;->l:I

    .line 103
    iget v0, p0, Lo/ahc;->c:I

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/ahc;->n:I

    .line 105
    :cond_1
    return-void
.end method


# virtual methods
.method public c()V
    .locals 4

    .line 293
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ahc;->p:Z

    .line 294
    const-string v0, "ProgressBarView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start!!!!!!start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    new-instance v0, Lo/ahc$c;

    invoke-direct {v0, p0}, Lo/ahc$c;-><init>(Lo/ahc;)V

    .line 296
    return-void
.end method

.method public d()V
    .locals 1

    .line 303
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahc;->p:Z

    .line 304
    const/4 v0, 0x0

    iput v0, p0, Lo/ahc;->k:F

    .line 305
    invoke-virtual {p0}, Lo/ahc;->postInvalidate()V

    .line 306
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 27

    .line 110
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-super {v0, v1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 111
    const-string v0, "ProgressBarView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDraw"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    invoke-direct/range {p0 .. p0}, Lo/ahc;->getCircleCenter()V

    .line 113
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->f:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->a:F

    div-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v6, v1, v0

    .line 114
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

    .line 116
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/ahc;->p:Z

    if-eqz v0, :cond_7

    .line 117
    const-string v0, "ProgressBarView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onDraw arc_to :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/ahc;->k:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x42480000    # 50.0f

    sub-float v7, v0, v1

    .line 119
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    const-string v1, "#0cfb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 120
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->e:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 121
    const v8, 0x3fcccccd    # 1.6f

    .line 122
    :goto_0
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x42480000    # 50.0f

    sub-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v7, v0

    if-gtz v0, :cond_0

    .line 123
    add-float v0, v7, v8

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v9, v0, v2

    .line 124
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->l:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v11, v0, v1

    .line 125
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->n:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v12, v0, v1

    .line 126
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 127
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v13, v11, v0

    .line 128
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 129
    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v14, v12, v0

    .line 130
    move-object/from16 v0, p1

    move v1, v11

    move v2, v12

    move v3, v13

    move v4, v14

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/ahc;->g:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 132
    const v0, 0x4068ba2f

    add-float/2addr v7, v0

    .line 133
    goto :goto_0

    .line 135
    :cond_0
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x41f00000    # 30.0f

    sub-float v9, v0, v1

    .line 136
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    const-string v1, "#33fb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 137
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->e:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 138
    const v10, 0x3fcccccd    # 1.6f

    .line 139
    :goto_1
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x41f00000    # 30.0f

    sub-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v9, v0

    if-gtz v0, :cond_1

    .line 140
    add-float v0, v9, v10

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v11, v0, v2

    .line 141
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->l:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v13, v0, v1

    .line 142
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->n:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v14, v0, v1

    .line 143
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 144
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v15, v13, v0

    .line 145
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 146
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v16, v14, v0

    .line 147
    move-object/from16 v0, p1

    move v1, v13

    move v2, v14

    move v3, v15

    move/from16 v4, v16

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/ahc;->g:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 149
    const v0, 0x4068ba2f

    add-float/2addr v9, v0

    .line 150
    goto :goto_1

    .line 153
    :cond_1
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x41200000    # 10.0f

    sub-float v11, v0, v1

    .line 154
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    const-string v1, "#66fb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 155
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->e:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 156
    const v12, 0x3fcccccd    # 1.6f

    .line 157
    :goto_2
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x41200000    # 10.0f

    sub-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v11, v0

    if-gtz v0, :cond_2

    .line 158
    add-float v0, v11, v12

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v13, v0, v2

    .line 159
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->l:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v15, v0, v1

    .line 160
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->n:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v16, v0, v1

    .line 161
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 162
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v17, v15, v0

    .line 163
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 164
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v18, v16, v0

    .line 165
    move-object/from16 v0, p1

    move v1, v15

    move/from16 v2, v16

    move/from16 v3, v17

    move/from16 v4, v18

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/ahc;->g:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 167
    const v0, 0x4068ba2f

    add-float/2addr v11, v0

    .line 168
    goto :goto_2

    .line 171
    :cond_2
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x41200000    # 10.0f

    add-float v13, v0, v1

    .line 172
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    const-string v1, "#92fb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 173
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->e:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 174
    const v14, 0x3fcccccd    # 1.6f

    .line 175
    :goto_3
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x41200000    # 10.0f

    add-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v13, v0

    if-gtz v0, :cond_3

    .line 176
    add-float v0, v13, v14

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v15, v0, v2

    .line 177
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->l:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v17, v0, v1

    .line 178
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->n:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v18, v0, v1

    .line 179
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 180
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v19, v17, v0

    .line 181
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 182
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v20, v18, v0

    .line 183
    move-object/from16 v0, p1

    move/from16 v1, v17

    move/from16 v2, v18

    move/from16 v3, v19

    move/from16 v4, v20

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/ahc;->g:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 185
    const v0, 0x4068ba2f

    add-float/2addr v13, v0

    .line 186
    goto :goto_3

    .line 189
    :cond_3
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x41f00000    # 30.0f

    add-float v15, v0, v1

    .line 190
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    const-string v1, "#CCfb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 191
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->e:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 192
    const v16, 0x3fcccccd    # 1.6f

    .line 193
    :goto_4
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x41f00000    # 30.0f

    add-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v15, v0

    if-gtz v0, :cond_4

    .line 194
    add-float v0, v15, v16

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v17, v0, v2

    .line 195
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->l:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v19, v0, v1

    .line 196
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->n:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v20, v0, v1

    .line 197
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 198
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v21, v19, v0

    .line 199
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 200
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v22, v20, v0

    .line 201
    move-object/from16 v0, p1

    move/from16 v1, v19

    move/from16 v2, v20

    move/from16 v3, v21

    move/from16 v4, v22

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/ahc;->g:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 203
    const v0, 0x4068ba2f

    add-float/2addr v15, v0

    .line 204
    goto :goto_4

    .line 205
    :cond_4
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x42480000    # 50.0f

    add-float v17, v0, v1

    .line 206
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    const-string v1, "#FFfb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 207
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->e:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 208
    const v18, 0x3fcccccd    # 1.6f

    .line 209
    :goto_5
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x42480000    # 50.0f

    add-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v17, v0

    if-gtz v0, :cond_5

    .line 210
    add-float v0, v17, v18

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v19, v0, v2

    .line 211
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->l:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v21, v0, v1

    .line 212
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->n:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v22, v0, v1

    .line 213
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 214
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v23, v21, v0

    .line 215
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 216
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v24, v22, v0

    .line 217
    move-object/from16 v0, p1

    move/from16 v1, v21

    move/from16 v2, v22

    move/from16 v3, v23

    move/from16 v4, v24

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/ahc;->g:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 219
    const v0, 0x4068ba2f

    add-float v17, v17, v0

    .line 220
    goto :goto_5

    .line 222
    :cond_5
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x428c0000    # 70.0f

    add-float v19, v0, v1

    .line 223
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    const-string v1, "#ffffff"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 224
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->e:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 225
    const v20, 0x3fcccccd    # 1.6f

    .line 226
    :goto_6
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->k:F

    const/high16 v1, 0x428c0000    # 70.0f

    add-float/2addr v0, v1

    const/high16 v1, 0x41880000    # 17.0f

    add-float/2addr v0, v1

    cmpg-float v0, v19, v0

    if-gtz v0, :cond_6

    .line 227
    add-float v0, v19, v20

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v21, v0, v2

    .line 228
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->l:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v23, v0, v1

    .line 229
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->n:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v24, v0, v1

    .line 230
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 231
    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v25, v23, v0

    .line 232
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 233
    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v26, v24, v0

    .line 234
    move-object/from16 v0, p1

    move/from16 v1, v23

    move/from16 v2, v24

    move/from16 v3, v25

    move/from16 v4, v26

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/ahc;->g:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 236
    const v0, 0x4068ba2f

    add-float v19, v19, v0

    .line 237
    goto :goto_6

    .line 238
    :cond_6
    goto/16 :goto_9

    .line 239
    :cond_7
    const/4 v7, 0x0

    .line 241
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->h:Landroid/graphics/Paint;

    const-string v1, "#33000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 242
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->e:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 244
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 245
    const v8, 0x3fcccccd    # 1.6f

    .line 246
    :goto_7
    const/high16 v0, 0x43b40000    # 360.0f

    cmpg-float v0, v8, v0

    if-gtz v0, :cond_8

    .line 247
    add-float v0, v7, v8

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v9, v0, v2

    .line 248
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->l:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v11, v0, v1

    .line 249
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->n:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v12, v0, v1

    .line 250
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 251
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v13, v11, v0

    .line 252
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 253
    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v14, v12, v0

    .line 254
    move-object/from16 v0, p1

    move v1, v11

    move v2, v12

    move v3, v13

    move v4, v14

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/ahc;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 256
    const v0, 0x4068ba2f

    add-float/2addr v8, v0

    .line 257
    goto :goto_7

    .line 260
    :cond_8
    const/4 v9, 0x0

    .line 261
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    const-string v1, "#FFfb6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->e:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 264
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahc;->g:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 265
    const v10, 0x3fcccccd    # 1.6f

    .line 266
    :goto_8
    cmpg-float v0, v9, v6

    if-gez v0, :cond_9

    .line 267
    add-float v0, v9, v10

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double v11, v0, v2

    .line 268
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->l:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v13, v0, v1

    .line 269
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->n:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahc;->i:I

    int-to-float v1, v1

    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v14, v0, v1

    .line 270
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 271
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v15, v13, v0

    .line 272
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahc;->b:I

    int-to-float v0, v0

    .line 273
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    add-float v16, v14, v0

    .line 274
    move-object/from16 v0, p1

    move v1, v13

    move v2, v14

    move v3, v15

    move/from16 v4, v16

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/ahc;->g:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 276
    const v0, 0x4068ba2f

    add-float/2addr v9, v0

    .line 277
    goto :goto_8

    .line 280
    :cond_9
    :goto_9
    return-void
.end method
