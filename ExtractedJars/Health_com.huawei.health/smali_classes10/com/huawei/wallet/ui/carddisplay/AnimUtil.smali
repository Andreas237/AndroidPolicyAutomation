.class public final Lcom/huawei/wallet/ui/carddisplay/AnimUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const/4 v0, 0x0

    sput v0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/view/View;FI)Landroid/animation/ObjectAnimator;
    .locals 6

    .line 408
    const-string v0, "alpha"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput p1, v1, v2

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v4

    .line 409
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/animation/PropertyValuesHolder;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    invoke-static {p0, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 410
    return-object v5
.end method

.method public static a(Landroid/view/View;IIFIIF)Landroid/animation/ObjectAnimator;
    .locals 12

    .line 120
    const/4 v4, 0x0

    .line 122
    if-gt p1, p2, :cond_0

    .line 125
    const-string v0, "translationY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v5

    .line 126
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/animation/PropertyValuesHolder;

    const/4 v1, 0x0

    aput-object v5, v0, v1

    invoke-static {p0, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 127
    goto/16 :goto_1

    .line 132
    :cond_0
    add-int/lit8 v0, p4, -0x1

    sub-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v6

    .line 133
    if-nez v6, :cond_1

    .line 136
    move/from16 v0, p5

    int-to-float v0, v0

    const/high16 v1, 0x41a00000    # 20.0f

    mul-float/2addr v1, p3

    sub-float/2addr v0, v1

    add-float v5, v0, p6

    goto :goto_0

    .line 140
    :cond_1
    move/from16 v0, p5

    int-to-float v0, v0

    const/high16 v1, 0x41a00000    # 20.0f

    mul-float/2addr v1, p3

    sub-float/2addr v0, v1

    mul-int/lit8 v1, v6, 0x6

    int-to-float v1, v1

    mul-float/2addr v1, p3

    sub-float/2addr v0, v1

    add-float v5, v0, p6

    .line 144
    :goto_0
    sget v0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e:I

    int-to-float v0, v0

    cmpg-float v0, v0, v5

    if-gez v0, :cond_2

    .line 146
    float-to-int v0, v5

    sput v0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e:I

    .line 149
    :cond_2
    mul-int/lit8 v0, p1, 0x28

    rsub-int v7, v0, 0x1f4

    .line 150
    if-gez v7, :cond_3

    .line 152
    const/16 v7, 0x1f4

    .line 154
    :cond_3
    const-string v0, "translationY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput v5, v1, v2

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    .line 156
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v9

    .line 157
    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, p3

    int-to-float v1, v9

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v10, v1, v0

    .line 158
    const-string v0, "scaleX"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput v10, v1, v2

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v11

    .line 160
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/animation/PropertyValuesHolder;

    const/4 v1, 0x0

    aput-object v11, v0, v1

    const/4 v1, 0x1

    aput-object v8, v0, v1

    invoke-static {p0, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    int-to-long v1, v7

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 162
    :goto_1
    return-object v4
.end method

.method public static a(Landroid/view/View;IIIFF)Landroid/animation/ObjectAnimator;
    .locals 11

    .line 193
    int-to-float v0, p1

    mul-float/2addr v0, p4

    add-float v4, p5, v0

    .line 195
    sget v0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e:I

    int-to-float v0, v0

    cmpg-float v0, v0, v4

    if-gez v0, :cond_0

    .line 197
    float-to-int v0, v4

    sput v0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e:I

    .line 199
    :cond_0
    sub-int v0, p2, p1

    mul-int/lit8 v0, v0, 0x28

    rsub-int v5, v0, 0x1f4

    .line 200
    if-gez v5, :cond_1

    .line 202
    const/16 v5, 0x1f4

    .line 205
    :cond_1
    const-string v0, "translationY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput v4, v1, v2

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v6

    .line 206
    const-string v0, "scaleX"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v7

    .line 207
    const-string v0, "scaleY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getScaleY()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    .line 208
    const-string v0, "alpha"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v9

    .line 209
    const/4 v0, 0x4

    new-array v0, v0, [Landroid/animation/PropertyValuesHolder;

    const/4 v1, 0x0

    aput-object v6, v0, v1

    const/4 v1, 0x1

    aput-object v7, v0, v1

    const/4 v1, 0x2

    aput-object v8, v0, v1

    const/4 v1, 0x3

    aput-object v9, v0, v1

    invoke-static {p0, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    int-to-long v1, v5

    .line 210
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v10

    .line 211
    return-object v10
.end method

.method public static b(Landroid/view/View;IIF)Landroid/animation/ObjectAnimator;
    .locals 8

    .line 429
    const/4 v4, 0x0

    .line 431
    int-to-float v0, p2

    add-float v5, v0, p3

    .line 433
    mul-int/lit8 v0, p1, 0x28

    rsub-int v6, v0, 0x1f4

    .line 434
    if-gez v6, :cond_0

    .line 436
    const/16 v6, 0x1f4

    .line 438
    :cond_0
    const-string v0, "translationY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput v5, v1, v2

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v7

    .line 440
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/animation/PropertyValuesHolder;

    const/4 v1, 0x0

    aput-object v7, v0, v1

    invoke-static {p0, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    int-to-long v1, v6

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 442
    return-object v4
.end method

.method public static b(Landroid/view/View;IIFIIF)Landroid/animation/ObjectAnimator;
    .locals 13

    .line 59
    const/4 v4, 0x0

    .line 61
    if-ne p1, p2, :cond_0

    .line 64
    const-string v0, "translationY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v5

    .line 65
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/animation/PropertyValuesHolder;

    const/4 v1, 0x0

    aput-object v5, v0, v1

    invoke-static {p0, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 66
    goto/16 :goto_2

    .line 71
    :cond_0
    if-le p1, p2, :cond_1

    move v5, p1

    goto :goto_0

    :cond_1
    add-int/lit8 v5, p1, 0x1

    .line 72
    :goto_0
    add-int/lit8 v0, p4, -0x1

    sub-int/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v6

    .line 74
    if-nez v6, :cond_2

    .line 76
    move/from16 v0, p5

    int-to-float v0, v0

    const/high16 v1, 0x41a00000    # 20.0f

    mul-float v1, v1, p3

    sub-float/2addr v0, v1

    add-float v7, v0, p6

    goto :goto_1

    .line 80
    :cond_2
    move/from16 v0, p5

    int-to-float v0, v0

    const/high16 v1, 0x41a00000    # 20.0f

    mul-float v1, v1, p3

    sub-float/2addr v0, v1

    mul-int/lit8 v1, v6, 0x6

    int-to-float v1, v1

    mul-float v1, v1, p3

    sub-float/2addr v0, v1

    add-float v7, v0, p6

    .line 84
    :goto_1
    sget v0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e:I

    int-to-float v0, v0

    cmpg-float v0, v0, v7

    if-gez v0, :cond_3

    .line 86
    float-to-int v0, v7

    sput v0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e:I

    .line 88
    :cond_3
    mul-int/lit8 v0, p1, 0x28

    rsub-int v8, v0, 0x1f4

    .line 89
    if-gez v8, :cond_4

    .line 91
    const/16 v8, 0x1f4

    .line 93
    :cond_4
    const-string v0, "translationY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput v7, v1, v2

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v9

    .line 95
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v10

    .line 96
    const/high16 v0, 0x40800000    # 4.0f

    mul-float v0, v0, p3

    int-to-float v1, v10

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v11, v1, v0

    .line 97
    const-string v0, "scaleX"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput v11, v1, v2

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v12

    .line 99
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/animation/PropertyValuesHolder;

    const/4 v1, 0x0

    aput-object v12, v0, v1

    const/4 v1, 0x1

    aput-object v9, v0, v1

    invoke-static {p0, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    int-to-long v1, v8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 102
    :goto_2
    return-object v4
.end method

.method public static c(Landroid/view/View;IIF)Landroid/animation/ObjectAnimator;
    .locals 11

    .line 319
    int-to-float v0, p2

    mul-float v4, p3, v0

    .line 321
    const/16 v5, 0x1f4

    .line 323
    const-string v0, "translationY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    int-to-float v2, p1

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput v4, v1, v2

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v6

    .line 324
    const-string v0, "scaleX"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v7

    .line 325
    const-string v0, "scaleY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getScaleY()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    .line 326
    const-string v0, "alpha"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v9

    .line 327
    const/4 v0, 0x4

    new-array v0, v0, [Landroid/animation/PropertyValuesHolder;

    const/4 v1, 0x0

    aput-object v6, v0, v1

    const/4 v1, 0x1

    aput-object v7, v0, v1

    const/4 v1, 0x2

    aput-object v8, v0, v1

    const/4 v1, 0x3

    aput-object v9, v0, v1

    invoke-static {p0, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 328
    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v10

    .line 329
    return-object v10
.end method

.method public static c(Landroid/view/View;IIIF)Landroid/animation/ObjectAnimator;
    .locals 11

    .line 169
    int-to-float v0, p1

    mul-float v4, p4, v0

    .line 170
    sget v0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e:I

    int-to-float v0, v0

    cmpg-float v0, v0, v4

    if-gez v0, :cond_0

    .line 172
    float-to-int v0, v4

    sput v0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e:I

    .line 174
    :cond_0
    mul-int/lit8 v0, p1, 0x28

    rsub-int v5, v0, 0x1f4

    .line 175
    if-gez v5, :cond_1

    .line 177
    const/16 v5, 0x1f4

    .line 180
    :cond_1
    const-string v0, "translationY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput v4, v1, v2

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v6

    .line 181
    const-string v0, "scaleX"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v7

    .line 182
    const-string v0, "scaleY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getScaleY()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    .line 183
    const-string v0, "alpha"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v9

    .line 184
    const/4 v0, 0x4

    new-array v0, v0, [Landroid/animation/PropertyValuesHolder;

    const/4 v1, 0x0

    aput-object v6, v0, v1

    const/4 v1, 0x1

    aput-object v7, v0, v1

    const/4 v1, 0x2

    aput-object v8, v0, v1

    const/4 v1, 0x3

    aput-object v9, v0, v1

    invoke-static {p0, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    int-to-long v1, v5

    .line 185
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v10

    .line 186
    return-object v10
.end method

.method public static c(I)V
    .locals 0

    .line 33
    sput p0, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e:I

    .line 34
    return-void
.end method

.method public static d(Landroid/view/View;IF)Landroid/animation/ObjectAnimator;
    .locals 3

    .line 276
    int-to-float v0, p1

    mul-float v1, p2, v0

    .line 279
    const/16 v2, 0x32

    .line 280
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v0

    invoke-static {p0, v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->e(Landroid/view/View;FFI)Landroid/animation/ObjectAnimator;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/view/View;FFI)Landroid/animation/ObjectAnimator;
    .locals 9

    .line 298
    const-string v0, "translationY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 v2, 0x1

    aput p2, v1, v2

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v4

    .line 299
    const-string v0, "scaleX"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v5

    .line 300
    const-string v0, "scaleY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getScaleY()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v6

    .line 301
    const-string v0, "alpha"

    const/4 v1, 0x2

    new-array v1, v1, [F

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v7

    .line 302
    const/4 v0, 0x4

    new-array v0, v0, [Landroid/animation/PropertyValuesHolder;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    const/4 v1, 0x1

    aput-object v5, v0, v1

    const/4 v1, 0x2

    aput-object v6, v0, v1

    const/4 v1, 0x3

    aput-object v7, v0, v1

    invoke-static {p0, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    int-to-long v1, p3

    .line 303
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v8

    .line 304
    return-object v8
.end method
