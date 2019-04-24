.class public Lo/fap;
.super Lo/eir;
.source "SourceFile"


# static fields
.field private static A:Z


# instance fields
.field private B:[Ljava/lang/String;

.field private C:Z

.field private D:Landroid/graphics/Paint;

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 40
    const/4 v0, 0x1

    sput-boolean v0, Lo/fap;->A:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V
    .locals 1

    .line 58
    invoke-direct/range {p0 .. p5}, Lo/eir;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    .line 42
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fap;->C:Z

    .line 59
    iput-object p1, p0, Lo/fap;->s:Landroid/content/Context;

    .line 60
    iput-object p5, p0, Lo/fap;->u:Lo/eie;

    .line 62
    new-instance v0, Lo/ekj;

    invoke-direct {v0}, Lo/ekj;-><init>()V

    iput-object v0, p0, Lo/fap;->y:Lo/ekj;

    .line 63
    return-void
.end method

.method private a(F)I
    .locals 4

    .line 225
    iget-object v0, p0, Lo/fap;->s:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v3, v0, Landroid/util/DisplayMetrics;->density:F

    .line 226
    mul-float v0, p1, v3

    const/4 v1, 0x0

    cmpl-float v1, p1, v1

    if-ltz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    int-to-float v1, v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static c(Z)V
    .locals 0

    .line 49
    sput-boolean p0, Lo/fap;->A:Z

    .line 50
    return-void
.end method

.method private h()Z
    .locals 1

    .line 54
    sget-boolean v0, Lo/fap;->A:Z

    return v0
.end method


# virtual methods
.method protected b(Landroid/graphics/Path;I[F)Landroid/graphics/Path;
    .locals 1

    .line 124
    add-int/lit8 v0, p2, 0x1

    aget v0, p3, v0

    invoke-virtual {p0, p1, v0}, Lo/fap;->e(Landroid/graphics/Path;F)Landroid/graphics/Path;

    move-result-object v0

    return-object v0
.end method

.method public b(ILandroid/graphics/Paint;)V
    .locals 1

    .line 304
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fap;->C:Z

    .line 305
    iput p1, p0, Lo/fap;->j:I

    .line 306
    iput-object p2, p0, Lo/fap;->D:Landroid/graphics/Paint;

    .line 307
    return-void
.end method

.method public b(Landroid/graphics/Canvas;)V
    .locals 13

    .line 155
    iget-object v0, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 156
    :cond_0
    return-void

    .line 157
    :cond_1
    iget-object v0, p0, Lo/fap;->c:Lo/lh;

    invoke-virtual {v0}, Lo/lh;->q()F

    move-result v0

    const v1, 0x49f42400    # 2000000.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 159
    return-void

    .line 161
    :cond_2
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->x()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 162
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->z()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 163
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->A()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 164
    iget-object v0, p0, Lo/fap;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->P()Lo/eit$b;

    move-result-object v3

    .line 165
    const/4 v4, 0x0

    .line 166
    sget-object v0, Lo/eit$b;->c:Lo/eit$b;

    if-ne v3, v0, :cond_3

    .line 167
    return-void

    .line 170
    :cond_3
    iget-object v0, p0, Lo/fap;->c:Lo/lh;

    check-cast v0, Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->d(Landroid/graphics/Paint;)F

    move-result v5

    .line 172
    const/4 v6, 0x0

    .line 173
    iget-object v0, p0, Lo/fap;->s:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v7

    .line 175
    if-eqz v7, :cond_4

    .line 176
    nop

    const/4 v6, 0x1

    .line 179
    :cond_4
    iget-boolean v0, p0, Lo/fap;->z:Z

    if-eqz v0, :cond_6

    .line 180
    if-nez v6, :cond_5

    const/4 v6, 0x1

    goto :goto_0

    :cond_5
    const/4 v6, 0x0

    .line 182
    :cond_6
    :goto_0
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne v3, v0, :cond_7

    if-eqz v6, :cond_8

    :cond_7
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne v3, v0, :cond_9

    if-eqz v6, :cond_9

    .line 184
    :cond_8
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 185
    iget-object v0, p0, Lo/fap;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->a()F

    move-result v0

    sub-float/2addr v0, v5

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    add-float v4, v0, v1

    goto :goto_1

    .line 186
    :cond_9
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne v3, v0, :cond_a

    if-eqz v6, :cond_b

    :cond_a
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne v3, v0, :cond_c

    if-eqz v6, :cond_c

    .line 188
    :cond_b
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 189
    iget-object v0, p0, Lo/fap;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->h()F

    move-result v0

    add-float/2addr v0, v5

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    sub-float v4, v0, v1

    .line 191
    :cond_c
    :goto_1
    iget-boolean v0, p0, Lo/fap;->C:Z

    if-eqz v0, :cond_11

    iget v0, p0, Lo/fap;->j:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_11

    .line 192
    invoke-virtual {p0}, Lo/fap;->d()F

    move-result v8

    .line 194
    new-instance v9, Landroid/graphics/Rect;

    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 195
    const-string v10, ""

    .line 196
    iget-object v0, p0, Lo/fap;->B:[Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_e

    iget-object v0, p0, Lo/fap;->B:[Ljava/lang/String;

    array-length v0, v0

    if-eqz v0, :cond_e

    .line 197
    iget-object v0, p0, Lo/fap;->B:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 198
    const-string v10, ""

    goto :goto_2

    .line 200
    :cond_d
    iget-object v0, p0, Lo/fap;->B:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v10, v0, v1

    goto :goto_2

    .line 203
    :cond_e
    iget-object v0, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->r()Lo/mf;

    move-result-object v0

    iget v1, p0, Lo/fap;->j:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/fap;->k:Lo/lp;

    invoke-interface {v0, v1, v2}, Lo/mf;->b(FLo/lh;)Ljava/lang/String;

    move-result-object v10

    .line 205
    :goto_2
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v10, v2, v1, v9}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 206
    const/4 v0, 0x2

    new-array v11, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v11, v1

    iget v0, p0, Lo/fap;->j:I

    int-to-float v0, v0

    const/4 v1, 0x1

    aput v0, v11, v1

    .line 207
    iget-object v0, p0, Lo/fap;->e:Lo/nv;

    invoke-virtual {v0, v11}, Lo/nv;->e([F)V

    .line 208
    const/4 v0, 0x1

    aget v0, v11, v0

    add-float v12, v0, v8

    .line 209
    iget-object v0, p0, Lo/fap;->D:Landroid/graphics/Paint;

    if-eqz v0, :cond_f

    .line 210
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fap;->D:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_3

    .line 212
    :cond_f
    iget-object v0, p0, Lo/fap;->B:[Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_10

    iget-object v0, p0, Lo/fap;->B:[Ljava/lang/String;

    array-length v0, v0

    if-eqz v0, :cond_10

    .line 213
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fap;->s:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_801a1a1a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 214
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-direct {p0, v1}, Lo/fap;->a(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_3

    .line 216
    :cond_10
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    iget v1, p0, Lo/fap;->x:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 220
    :goto_3
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v10, v4, v12, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 222
    :cond_11
    return-void
.end method

.method public c()V
    .locals 1

    .line 310
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fap;->C:Z

    .line 311
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fap;->D:Landroid/graphics/Paint;

    .line 312
    return-void
.end method

.method protected d()F
    .locals 4

    .line 146
    iget-object v0, p0, Lo/fap;->s:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    const/high16 v1, -0x40800000    # -1.0f

    mul-float v3, v1, v0

    .line 147
    return v3
.end method

.method public d(FFZ)V
    .locals 8

    .line 272
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    sub-float v0, p2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    add-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 274
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lo/eir;->d(FFZ)V

    .line 275
    return-void

    .line 278
    :cond_1
    iget-object v0, p0, Lo/fap;->c:Lo/lh;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->P()Lo/eit$b;

    move-result-object v5

    .line 279
    iget-object v0, p0, Lo/fap;->u:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getData()Lo/ma;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/eik;

    .line 280
    if-eqz v5, :cond_2

    if-nez v6, :cond_3

    .line 281
    :cond_2
    const-string v0, "SleepYAxisRenderer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "computeAxis dependency null or chart chartData null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    return-void

    .line 285
    :cond_3
    invoke-virtual {v6, v5}, Lo/eik;->a(Lo/eit$b;)Lo/ejl;

    move-result-object v7

    .line 286
    if-nez v7, :cond_4

    .line 287
    invoke-super {p0, p1, p2, p3}, Lo/eir;->d(FFZ)V

    .line 288
    return-void

    .line 291
    :cond_4
    invoke-interface {v7}, Lo/ejl;->b()I

    move-result v4

    .line 292
    iget-object v0, p0, Lo/fap;->c:Lo/lh;

    const/4 v1, 0x1

    invoke-virtual {v0, v4, v1}, Lo/lh;->d(IZ)V

    .line 293
    invoke-super {p0, p1, p2, p3}, Lo/eir;->d(FFZ)V

    .line 294
    return-void
.end method

.method public d(Landroid/graphics/Canvas;)V
    .locals 9

    .line 238
    iget-object v0, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 239
    :cond_0
    return-void

    .line 241
    :cond_1
    iget-object v0, p0, Lo/fap;->b:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 242
    iget-object v0, p0, Lo/fap;->b:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->d()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 243
    iget-object v0, p0, Lo/fap;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->P()Lo/eit$b;

    move-result-object v0

    sget-object v1, Lo/eit$b;->c:Lo/eit$b;

    if-ne v0, v1, :cond_2

    .line 244
    return-void

    .line 246
    :cond_2
    iget-object v0, p0, Lo/fap;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->P()Lo/eit$b;

    move-result-object v6

    .line 248
    const/4 v7, 0x0

    .line 249
    iget-object v0, p0, Lo/fap;->s:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v8

    .line 251
    if-eqz v8, :cond_3

    .line 252
    nop

    const/4 v7, 0x1

    .line 255
    :cond_3
    iget-boolean v0, p0, Lo/fap;->z:Z

    if-eqz v0, :cond_5

    .line 256
    if-nez v7, :cond_4

    const/4 v7, 0x1

    goto :goto_0

    :cond_4
    const/4 v7, 0x0

    .line 259
    :cond_5
    :goto_0
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne v6, v0, :cond_6

    if-eqz v7, :cond_7

    :cond_6
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne v6, v0, :cond_8

    if-eqz v7, :cond_8

    .line 261
    :cond_7
    move-object v0, p1

    iget-object v1, p0, Lo/fap;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->f()F

    move-result v1

    iget-object v2, p0, Lo/fap;->l:Lo/oa;

    invoke-virtual {v2}, Lo/oa;->e()F

    move-result v2

    iget-object v3, p0, Lo/fap;->l:Lo/oa;

    invoke-virtual {v3}, Lo/oa;->f()F

    move-result v3

    iget-object v4, p0, Lo/fap;->l:Lo/oa;

    .line 262
    invoke-virtual {v4}, Lo/oa;->i()F

    move-result v4

    iget-object v5, p0, Lo/fap;->b:Landroid/graphics/Paint;

    .line 261
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 263
    :cond_8
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne v6, v0, :cond_9

    if-eqz v7, :cond_a

    :cond_9
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne v6, v0, :cond_b

    if-eqz v7, :cond_b

    .line 265
    :cond_a
    move-object v0, p1

    iget-object v1, p0, Lo/fap;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->h()F

    move-result v1

    iget-object v2, p0, Lo/fap;->l:Lo/oa;

    invoke-virtual {v2}, Lo/oa;->e()F

    move-result v2

    iget-object v3, p0, Lo/fap;->l:Lo/oa;

    invoke-virtual {v3}, Lo/oa;->h()F

    move-result v3

    iget-object v4, p0, Lo/fap;->l:Lo/oa;

    .line 266
    invoke-virtual {v4}, Lo/oa;->i()F

    move-result v4

    iget-object v5, p0, Lo/fap;->b:Landroid/graphics/Paint;

    .line 265
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 268
    :cond_b
    :goto_1
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 233
    iput-boolean p1, p0, Lo/fap;->z:Z

    .line 234
    return-void
.end method

.method protected e(Landroid/graphics/Path;F)Landroid/graphics/Path;
    .locals 6

    .line 128
    iget-object v0, p0, Lo/fap;->u:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getAxisFirstParty()Lo/eit;

    move-result-object v1

    .line 129
    iget-object v0, p0, Lo/fap;->u:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getAxisSecondParty()Lo/eit;

    move-result-object v2

    .line 130
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v3

    .line 131
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v4

    .line 132
    iget-boolean v0, p0, Lo/fap;->z:Z

    if-nez v0, :cond_0

    .line 133
    invoke-virtual {v1}, Lo/eit;->v()F

    move-result v0

    add-float/2addr v3, v0

    .line 134
    invoke-virtual {v2}, Lo/eit;->v()F

    move-result v0

    add-float/2addr v4, v0

    goto :goto_0

    .line 136
    :cond_0
    invoke-virtual {v2}, Lo/eit;->v()F

    move-result v0

    add-float/2addr v3, v0

    .line 137
    invoke-virtual {v1}, Lo/eit;->v()F

    move-result v0

    add-float/2addr v4, v0

    .line 139
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v5

    .line 140
    add-float v0, v3, v5

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 141
    iget-object v0, p0, Lo/fap;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->o()F

    move-result v0

    sub-float/2addr v0, v4

    sub-float/2addr v0, v5

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 142
    return-object p1
.end method

.method public varargs e(II[Ljava/lang/String;)V
    .locals 1

    .line 297
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fap;->C:Z

    .line 298
    iput p1, p0, Lo/fap;->j:I

    .line 299
    iput p2, p0, Lo/fap;->x:I

    .line 300
    iput-object p3, p0, Lo/fap;->B:[Ljava/lang/String;

    .line 301
    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 17

    .line 67
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-nez v0, :cond_0

    .line 68
    return-void

    .line 69
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 70
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v5

    .line 71
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fap;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->o()F

    move-result v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fap;->l:Lo/oa;

    invoke-virtual {v2}, Lo/oa;->n()F

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 72
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fap;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 73
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fap;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->i()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 74
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fap;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->t()Landroid/graphics/DashPathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 75
    move-object/from16 v0, p0

    iget-object v6, v0, Lo/fap;->i:Landroid/graphics/Path;

    .line 76
    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    .line 78
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fap;->C:Z

    if-eqz v0, :cond_3

    .line 79
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fap;->x:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 80
    const/4 v0, 0x2

    new-array v7, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v7, v1

    move-object/from16 v0, p0

    iget v0, v0, Lo/fap;->j:I

    int-to-float v0, v0

    const/4 v1, 0x1

    aput v0, v7, v1

    .line 81
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->e:Lo/nv;

    invoke-virtual {v0, v7}, Lo/nv;->e([F)V

    .line 82
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->D:Landroid/graphics/Paint;

    if-eqz v0, :cond_1

    .line 83
    const/4 v0, 0x1

    aget v0, v7, v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v6, v0}, Lo/fap;->e(Landroid/graphics/Path;F)Landroid/graphics/Path;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fap;->D:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_0

    .line 85
    :cond_1
    const/4 v0, 0x1

    aget v0, v7, v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v6, v0}, Lo/fap;->e(Landroid/graphics/Path;F)Landroid/graphics/Path;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fap;->d:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 87
    :goto_0
    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    .line 88
    invoke-direct/range {p0 .. p0}, Lo/fap;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 89
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->t()Landroid/graphics/DashPathEffect;

    move-result-object v8

    .line 90
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->a()I

    move-result v9

    .line 91
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->s:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_1a000000:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v10

    .line 92
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->d:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 93
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 94
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->u:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getAxisFirstParty()Lo/eit;

    move-result-object v11

    .line 95
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->u:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getAxisSecondParty()Lo/eit;

    move-result-object v12

    .line 96
    const/4 v13, 0x0

    .line 97
    const/4 v14, 0x0

    .line 98
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fap;->z:Z

    if-nez v0, :cond_2

    .line 99
    invoke-virtual {v11}, Lo/eit;->v()F

    move-result v0

    add-float/2addr v13, v0

    .line 100
    invoke-virtual {v12}, Lo/eit;->v()F

    move-result v0

    add-float/2addr v14, v0

    goto :goto_1

    .line 102
    :cond_2
    invoke-virtual {v12}, Lo/eit;->v()F

    move-result v0

    add-float/2addr v13, v0

    .line 103
    invoke-virtual {v11}, Lo/eit;->v()F

    move-result v0

    add-float/2addr v14, v0

    .line 105
    :goto_1
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v15

    .line 106
    new-instance v16, Landroid/graphics/Path;

    invoke-direct/range {v16 .. v16}, Landroid/graphics/Path;-><init>()V

    .line 107
    add-float v0, v13, v15

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fap;->u:Lo/eie;

    invoke-virtual {v1}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v1

    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 108
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->o()F

    move-result v0

    sub-float/2addr v0, v14

    sub-float/2addr v0, v15

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fap;->u:Lo/eie;

    invoke-virtual {v1}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v1

    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 109
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object/from16 v2, v16

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 110
    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    .line 111
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 112
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 115
    :cond_3
    move-object/from16 v0, p1

    invoke-virtual {v0, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 117
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->K()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 118
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/fap;->a(Landroid/graphics/Canvas;)V

    .line 120
    :cond_5
    return-void
.end method

.method public f()I
    .locals 1

    .line 323
    iget v0, p0, Lo/fap;->j:I

    return v0
.end method

.method public g()F
    .locals 1

    .line 352
    iget v0, p0, Lo/fap;->j:I

    int-to-float v0, v0

    return v0
.end method

.method public i()V
    .locals 7

    .line 327
    iget-object v0, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 328
    :cond_0
    return-void

    .line 329
    :cond_1
    iget-object v0, p0, Lo/fap;->c:Lo/lh;

    invoke-virtual {v0}, Lo/lh;->q()F

    move-result v0

    const v1, 0x49f42400    # 2000000.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 331
    return-void

    .line 333
    :cond_2
    iget-boolean v0, p0, Lo/fap;->C:Z

    if-nez v0, :cond_3

    .line 334
    return-void

    .line 336
    :cond_3
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->x()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 337
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->z()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 338
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->A()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 339
    iget-object v0, p0, Lo/fap;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->P()Lo/eit$b;

    move-result-object v3

    .line 340
    sget-object v0, Lo/eit$b;->c:Lo/eit$b;

    if-ne v3, v0, :cond_4

    .line 341
    return-void

    .line 344
    :cond_4
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 345
    iget-object v0, p0, Lo/fap;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->r()Lo/mf;

    move-result-object v0

    iget v1, p0, Lo/fap;->j:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/fap;->k:Lo/lp;

    invoke-interface {v0, v1, v2}, Lo/mf;->b(FLo/lh;)Ljava/lang/String;

    move-result-object v5

    .line 346
    iget-object v0, p0, Lo/fap;->a:Landroid/graphics/Paint;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v2, v1, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 347
    const/4 v0, 0x2

    new-array v6, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v6, v1

    iget v0, p0, Lo/fap;->j:I

    int-to-float v0, v0

    const/4 v1, 0x1

    aput v0, v6, v1

    .line 348
    iget-object v0, p0, Lo/fap;->e:Lo/nv;

    invoke-virtual {v0, v6}, Lo/nv;->e([F)V

    .line 349
    return-void
.end method

.method public k()Z
    .locals 1

    .line 319
    iget-boolean v0, p0, Lo/fap;->C:Z

    return v0
.end method
