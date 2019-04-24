.class public Lo/dys;
.super Lo/lr;
.source "SourceFile"


# instance fields
.field private a:Lo/oa;

.field private b:Lo/dyp;

.field private e:F


# direct methods
.method public constructor <init>(Landroid/content/Context;ILo/dyp;)V
    .locals 1

    .line 39
    invoke-direct {p0, p1, p2}, Lo/lr;-><init>(Landroid/content/Context;I)V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dys;->a:Lo/oa;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dys;->b:Lo/dyp;

    .line 61
    const/high16 v0, 0x43960000    # 300.0f

    iput v0, p0, Lo/dys;->e:F

    .line 41
    iput-object p3, p0, Lo/dys;->b:Lo/dyp;

    .line 42
    invoke-virtual {p3}, Lo/dyp;->getViewPortHandler()Lo/oa;

    move-result-object v0

    iput-object v0, p0, Lo/dys;->a:Lo/oa;

    .line 43
    return-void
.end method

.method private b(Landroid/graphics/Canvas;[I[FLandroid/graphics/Paint;)V
    .locals 9

    .line 208
    invoke-virtual {p4}, Landroid/graphics/Paint;->reset()V

    .line 209
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p4, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 210
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {p4, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 214
    new-instance v0, Landroid/graphics/LinearGradient;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v2

    iget-object v1, p0, Lo/dys;->b:Lo/dyp;

    .line 215
    invoke-virtual {v1}, Lo/dyp;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    iget-object v3, p0, Lo/dys;->a:Lo/oa;

    invoke-virtual {v3}, Lo/oa;->k()F

    move-result v3

    add-float/2addr v1, v3

    const/high16 v3, 0x42200000    # 40.0f

    invoke-static {v3}, Lo/oc;->b(F)F

    move-result v3

    add-float/2addr v1, v3

    float-to-int v1, v1

    int-to-float v4, v1

    move-object v5, p2

    move-object v6, p3

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object v8, v0

    .line 217
    invoke-virtual {p4, v8}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 219
    move-object v0, p1

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v2

    iget-object v1, p0, Lo/dys;->b:Lo/dyp;

    .line 220
    invoke-virtual {v1}, Lo/dyp;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    iget-object v3, p0, Lo/dys;->a:Lo/oa;

    invoke-virtual {v3}, Lo/oa;->k()F

    move-result v3

    add-float/2addr v1, v3

    const/high16 v3, 0x42200000    # 40.0f

    invoke-static {v3}, Lo/oc;->b(F)F

    move-result v3

    add-float/2addr v1, v3

    float-to-int v1, v1

    int-to-float v4, v1

    move-object v5, p4

    .line 219
    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 223
    return-void
.end method

.method private getMarkerViewButtonColor()I
    .locals 3

    .line 203
    const/16 v0, 0x2f

    const/16 v1, 0xdd

    const/16 v2, 0x2f

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    return v0
.end method


# virtual methods
.method public b(FF)Lo/nz;
    .locals 3

    .line 52
    invoke-super {p0, p1, p2}, Lo/lr;->b(FF)Lo/nz;

    move-result-object v2

    .line 53
    invoke-virtual {p0}, Lo/dys;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    neg-int v0, v0

    int-to-float v0, v0

    iput v0, v2, Lo/nz;->e:F

    .line 54
    invoke-virtual {p0}, Lo/dys;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    iput v0, v2, Lo/nz;->c:F

    .line 55
    return-object v2
.end method

.method public b(Landroid/graphics/Canvas;FF)V
    .locals 20

    .line 78
    const-string v0, "PLGACHIEVE_HwHealthAchieveReportMarkView"

    const-string v1, "markerView draw"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v7

    .line 82
    move-object/from16 v0, p0

    iget-object v8, v0, Lo/dys;->b:Lo/dyp;

    .line 83
    if-nez v8, :cond_0

    .line 84
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/dys;->draw(Landroid/graphics/Canvas;)V

    .line 85
    move-object/from16 v0, p1

    invoke-virtual {v0, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 86
    return-void

    .line 88
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dys;->b:Lo/dyp;

    invoke-virtual {v0}, Lo/dyp;->b()V

    .line 91
    move-object/from16 v0, p1

    invoke-virtual {v0, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 93
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v7

    .line 96
    move-object/from16 v0, p0

    iget v0, v0, Lo/dys;->e:F

    invoke-virtual {v8}, Lo/ld;->getViewPortHandler()Lo/oa;

    move-result-object v1

    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    invoke-virtual {v8}, Lo/ld;->getXAxis()Lo/ln;

    move-result-object v2

    invoke-virtual {v2}, Lo/ln;->y()F

    move-result v2

    add-float/2addr v1, v2

    const/high16 v2, 0x42200000    # 40.0f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    add-float/2addr v1, v2

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 97
    move-object/from16 v0, p1

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 99
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 100
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 102
    new-instance v10, Landroid/graphics/PorterDuffXfermode;

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v10, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 103
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 106
    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 107
    new-instance v11, Landroid/graphics/Path;

    invoke-direct {v11}, Landroid/graphics/Path;-><init>()V

    .line 110
    const/high16 v0, 0x42100000    # 36.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v12

    .line 112
    const/high16 v0, 0x41580000    # 13.5f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v13

    .line 114
    neg-float v0, v12

    const/4 v1, 0x0

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 118
    move-object v0, v11

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v1, v12

    neg-float v1, v1

    const/high16 v2, 0x40c00000    # 6.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v12

    neg-float v2, v2

    const/high16 v3, 0x40c00000    # 6.0f

    div-float v3, v2, v3

    move v4, v13

    move v6, v13

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 119
    move-object v0, v11

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v12

    const/high16 v2, 0x40c00000    # 6.0f

    div-float/2addr v1, v2

    move v2, v13

    const/high16 v3, 0x40400000    # 3.0f

    mul-float/2addr v3, v12

    const/high16 v4, 0x40c00000    # 6.0f

    div-float/2addr v3, v4

    move v5, v12

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 121
    move-object/from16 v0, p1

    invoke-virtual {v0, v11, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 123
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 126
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 128
    const/high16 v0, 0x40e00000    # 7.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    const/high16 v1, -0x3fc00000    # -3.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    const/16 v2, 0x33

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v9, v0, v3, v1, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 129
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 130
    const/high16 v0, 0x41300000    # 11.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 131
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 132
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v9, v0, v1, v2, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 135
    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 136
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 137
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 138
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 139
    const/high16 v0, 0x41300000    # 11.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 141
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 142
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 145
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    neg-float v0, v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 148
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 149
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 150
    const/4 v0, -0x1

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 152
    invoke-virtual {v9}, Landroid/graphics/Paint;->isAntiAlias()Z

    move-result v14

    .line 153
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 154
    const/high16 v0, 0x41300000    # 11.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 157
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 158
    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 159
    const/16 v0, 0x8

    const/16 v1, 0xff

    const/16 v2, 0x8c

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 160
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 161
    const/high16 v0, 0x41340000    # 11.25f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 163
    invoke-virtual {v9, v14}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 165
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 166
    invoke-direct/range {p0 .. p0}, Lo/dys;->getMarkerViewButtonColor()I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 167
    const/16 v0, 0xff

    const/16 v1, 0xfa

    const/16 v2, 0x65

    const/16 v3, 0x21

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 168
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 169
    invoke-virtual {v11}, Landroid/graphics/Path;->reset()V

    .line 170
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v11, v2, v3, v0, v1}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 171
    move-object/from16 v0, p1

    invoke-virtual {v0, v11, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 172
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 175
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 179
    invoke-direct/range {p0 .. p0}, Lo/dys;->getMarkerViewButtonColor()I

    move-result v15

    .line 181
    move/from16 v16, v15

    .line 182
    .line 183
    invoke-static {v15}, Landroid/graphics/Color;->red(I)I

    move-result v0

    .line 184
    invoke-static {v15}, Landroid/graphics/Color;->green(I)I

    move-result v1

    .line 185
    invoke-static {v15}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    .line 182
    const/4 v3, 0x0

    invoke-static {v3, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v17

    .line 186
    const/4 v0, 0x3

    new-array v0, v0, [I

    move-object/from16 v18, v0

    const/4 v0, 0x0

    aput v17, v18, v0

    const/4 v0, 0x1

    aput v16, v18, v0

    const/4 v0, 0x2

    aput v17, v18, v0

    .line 191
    const/16 v19, 0x3

    move/from16 v0, v19

    new-array v0, v0, [F

    move-object/from16 v19, v0

    fill-array-data v19, :array_0

    .line 192
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v18

    move-object/from16 v3, v19

    invoke-direct {v0, v1, v2, v3, v9}, Lo/dys;->b(Landroid/graphics/Canvas;[I[FLandroid/graphics/Paint;)V

    .line 195
    move-object/from16 v0, p1

    invoke-virtual {v0, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 196
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public d(Lcom/github/mikephil/charting/data/Entry;Lo/mh;)V
    .locals 0

    .line 48
    return-void
.end method

.method public e(F)V
    .locals 0

    .line 67
    iput p1, p0, Lo/dys;->e:F

    .line 68
    return-void
.end method

.method public getmMarkviewDrawX()F
    .locals 1

    .line 72
    iget v0, p0, Lo/dys;->e:F

    return v0
.end method
