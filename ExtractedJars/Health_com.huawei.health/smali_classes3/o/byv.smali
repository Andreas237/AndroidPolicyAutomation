.class public Lo/byv;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field b:F

.field c:F

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field e:I

.field private f:F

.field private g:F

.field private h:Landroid/graphics/Paint;

.field private i:Landroid/graphics/Path;

.field private k:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 44
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/byv;->d:Ljava/util/List;

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/byv;->a:Ljava/util/List;

    .line 33
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/byv;->b:F

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/byv;->c:F

    .line 45
    invoke-direct {p0, p1}, Lo/byv;->c(Landroid/content/Context;)V

    .line 46
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 49
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/byv;->d:Ljava/util/List;

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/byv;->a:Ljava/util/List;

    .line 33
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/byv;->b:F

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/byv;->c:F

    .line 50
    invoke-direct {p0, p1}, Lo/byv;->c(Landroid/content/Context;)V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 54
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/byv;->d:Ljava/util/List;

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/byv;->a:Ljava/util/List;

    .line 33
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/byv;->b:F

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/byv;->c:F

    .line 55
    invoke-direct {p0, p1}, Lo/byv;->c(Landroid/content/Context;)V

    .line 56
    return-void
.end method

.method private b(Landroid/graphics/Canvas;FFFFFILandroid/graphics/Paint;)V
    .locals 5

    .line 163
    new-instance v4, Landroid/graphics/RectF;

    sub-float v0, p2, p4

    sub-float v1, p3, p4

    add-float v2, p2, p4

    add-float v3, p3, p4

    invoke-direct {v4, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 165
    iget-object v0, p0, Lo/byv;->i:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 167
    iget-object v0, p0, Lo/byv;->i:Landroid/graphics/Path;

    iget v1, p0, Lo/byv;->f:F

    invoke-virtual {v0, v1, p3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 168
    iget-object v0, p0, Lo/byv;->i:Landroid/graphics/Path;

    sub-float v1, p6, p5

    invoke-virtual {v0, v4, p5, v1}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 169
    invoke-virtual {p8, p7}, Landroid/graphics/Paint;->setColor(I)V

    .line 170
    iget-object v0, p0, Lo/byv;->i:Landroid/graphics/Path;

    invoke-virtual {p1, v0, p8}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 171
    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 2

    .line 65
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/byv;->k:Landroid/graphics/Paint;

    .line 67
    iget-object v0, p0, Lo/byv;->k:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 68
    iget-object v0, p0, Lo/byv;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 69
    iget-object v0, p0, Lo/byv;->k:Landroid/graphics/Paint;

    iget v1, p0, Lo/byv;->b:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 72
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/byv;->h:Landroid/graphics/Paint;

    .line 74
    iget-object v0, p0, Lo/byv;->h:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 75
    iget-object v0, p0, Lo/byv;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 76
    iget-object v0, p0, Lo/byv;->h:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 78
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/byv;->i:Landroid/graphics/Path;

    .line 79
    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    .line 158
    invoke-virtual {p0}, Lo/byv;->invalidate()V

    .line 159
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 25

    .line 92
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byv;->k:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/byv;->b:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 96
    move-object/from16 v0, p0

    iget v9, v0, Lo/byv;->f:F

    .line 97
    move-object/from16 v0, p0

    iget v10, v0, Lo/byv;->g:F

    .line 98
    move-object/from16 v0, p0

    iget v0, v0, Lo/byv;->b:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v11, v0, v1

    .line 99
    sub-float v0, v9, v11

    const/high16 v1, 0x41000000    # 8.0f

    sub-float v12, v0, v1

    .line 101
    move-object/from16 v0, p0

    iget v13, v0, Lo/byv;->c:F

    .line 104
    const/4 v15, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byv;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v15, v0, :cond_1

    .line 105
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byv;->a:Ljava/util/List;

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/lang/Integer;

    .line 106
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byv;->d:Ljava/util/List;

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v17

    .line 108
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/byv;->e:I

    int-to-float v1, v1

    div-float v18, v0, v1

    .line 110
    move v14, v13

    .line 111
    sub-float v13, v13, v18

    .line 112
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v9

    move v3, v10

    move v4, v12

    move v5, v13

    move v6, v14

    move/from16 v7, v17

    move-object/from16 v8, p0

    iget-object v8, v8, Lo/byv;->k:Landroid/graphics/Paint;

    invoke-direct/range {v0 .. v8}, Lo/byv;->b(Landroid/graphics/Canvas;FFFFFILandroid/graphics/Paint;)V

    .line 113
    float-to-double v0, v12

    float-to-double v2, v14

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v2, v4

    const-wide v4, 0x4066800000000000L    # 180.0

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    mul-double v19, v0, v2

    .line 115
    float-to-double v0, v12

    float-to-double v2, v14

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v2, v4

    const-wide v4, 0x4066800000000000L    # 180.0

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double v21, v0, v2

    .line 116
    float-to-double v0, v10

    add-double v21, v21, v0

    .line 117
    float-to-double v0, v9

    add-double v19, v19, v0

    .line 120
    move-wide/from16 v0, v19

    double-to-float v0, v0

    move/from16 v23, v0

    .line 121
    move-wide/from16 v0, v21

    double-to-float v0, v0

    move/from16 v24, v0

    .line 122
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v23

    move/from16 v3, v24

    move v4, v11

    move v5, v14

    const/high16 v6, 0x43340000    # 180.0f

    add-float/2addr v6, v14

    move/from16 v7, v17

    move-object/from16 v8, p0

    iget-object v8, v8, Lo/byv;->h:Landroid/graphics/Paint;

    invoke-direct/range {v0 .. v8}, Lo/byv;->b(Landroid/graphics/Canvas;FFFFFILandroid/graphics/Paint;)V

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byv;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v15, v0, :cond_0

    .line 127
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byv;->d:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v17

    .line 129
    move v14, v13

    .line 131
    float-to-double v0, v12

    float-to-double v2, v14

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v2, v4

    const-wide v4, 0x4066800000000000L    # 180.0

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    mul-double v19, v0, v2

    .line 133
    float-to-double v0, v12

    float-to-double v2, v14

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v2, v4

    const-wide v4, 0x4066800000000000L    # 180.0

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double v21, v0, v2

    .line 134
    float-to-double v0, v10

    add-double v21, v21, v0

    .line 135
    float-to-double v0, v9

    add-double v19, v19, v0

    .line 136
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, v19

    double-to-float v2, v2

    move-wide/from16 v3, v21

    double-to-float v3, v3

    move v4, v11

    move v5, v14

    const/high16 v6, 0x43340000    # 180.0f

    add-float/2addr v6, v14

    move/from16 v7, v17

    move-object/from16 v8, p0

    iget-object v8, v8, Lo/byv;->h:Landroid/graphics/Paint;

    invoke-direct/range {v0 .. v8}, Lo/byv;->b(Landroid/graphics/Canvas;FFFFFILandroid/graphics/Paint;)V

    .line 104
    :cond_0
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_0

    .line 141
    :cond_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    .line 83
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 84
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 85
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 86
    int-to-float v0, v2

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/byv;->f:F

    .line 87
    int-to-float v0, v3

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/byv;->g:F

    .line 88
    return-void
.end method

.method public set(II)V
    .locals 2

    .line 149
    if-gtz p1, :cond_0

    .line 150
    return-void

    .line 152
    :cond_0
    iget v0, p0, Lo/byv;->e:I

    add-int/2addr v0, p1

    iput v0, p0, Lo/byv;->e:I

    .line 153
    iget-object v0, p0, Lo/byv;->a:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    iget-object v0, p0, Lo/byv;->d:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 0

    .line 144
    iput p1, p0, Lo/byv;->b:F

    .line 145
    return-void
.end method
